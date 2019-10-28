package com.example.day06;

import lombok.Getter;
import lombok.Setter;
import org.json.JSONArray;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 彭达
 * @date 2019/10/28
 * 文件加载类
 */
@Setter
@Getter
public class LoadFileTool {
	private String url;
	private List<File> chFile;

	public LoadFileTool(String url) {
		this.url = url;
		try {
			File file = new File(LoadFileTool.class.getResource(url).toURI());
//			System.out.println(file.isDirectory());
			File[] files = file.listFiles();
			if (files != null) {
				chFile = Arrays.asList(files);
//				for (File f : files) {
//					System.out.println(f.toString());
//				}
			}

		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		LoadFileTool loadFileTool = new LoadFileTool("/dic");
		List<Course1> course1List = loadFileTool.listCourse();
		JSONArray jsonArray = new JSONArray(course1List);
		System.out.println(jsonArray.toString());
	}

	public List<Course1> listCourse() {
		List<Course1> course1List = new ArrayList<Course1>();
		// 加载文件
		for (File file : chFile) {
			String name = file.getName();
//			System.out.println(name);
			String substring = name.substring(0, 2);
//			System.out.println(substring);
			int index = Integer.parseInt(substring);
			try {
				FileInputStream fileInputStream = new FileInputStream(file);
				InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
				String courseName = bufferedReader.readLine();
				String comment = bufferedReader.readLine();
//				System.out.println(file.getName());
//				System.out.println(courseName);
//				System.out.println(comment);
				Course1 course1 = new Course1();
				course1.setIndex(index);
				course1.setName(courseName);
				course1.setComment(comment);

				// 加载单词
				List<Word1> word1List = new ArrayList<Word1>();
				String line = null;
				int cnt = 0;

				while ((line = bufferedReader.readLine()) != null && !"".equals(line)) {
					String chinese = null;
					String english = null;
					try {
						// TODO: 2019/10/28 可能是空行查询失败
//						问题已解决
						english = line.substring(0, line.indexOf(' '));
						chinese = line.substring(line.indexOf(' '));
					} catch (Exception e) {
						System.out.println("错误： " + line);
					}
					if (chinese != null && english != null) {
						Word1 word1 = new Word1(english, chinese);
						word1List.add(word1);
					}
					cnt++;
				}
				course1.setWords(word1List);
				course1List.add(course1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return course1List;
	}

	public void saveFile() {
		File file = new File("url/save01.json");
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
