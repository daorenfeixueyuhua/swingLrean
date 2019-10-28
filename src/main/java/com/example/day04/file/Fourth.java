package com.example.day04.file;


import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Fourth {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(Fourth.class);
		try {
			File file = new File(Fourth.class.getResource("/dwejio.txt")
					.toURI());
			FileInputStream fileInputStream =
					new FileInputStream(file);
			InputStreamReader inputStreamReader =
					new InputStreamReader(fileInputStream);
			BufferedReader reader = new BufferedReader(inputStreamReader);
			ArrayList<String> list = new ArrayList<String>();
			String line = null;
			while ((line = reader.readLine()) != null) {
				list.add(line);
			}
			JSONArray jsonArray = new JSONArray(list);
			System.out.println(jsonArray);
			// close
			{
				fileInputStream.close();
				inputStreamReader.close();
				reader.close();
			}
			logger.info(jsonArray.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
