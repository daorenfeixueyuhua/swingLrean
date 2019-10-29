package com.example.v01;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author dage
 * <p>
 * 主游戏类
 */
public class Four extends JFrame {
	public static final String BULLET_IMG = "/img/bullet.png";
	public static final String PAUSE_IMG = "/img/pause.png";
	/**
	 * 游戏界面宽
	 */
	static final int WIDTH = 1004;
	/**
	 * 游戏界面高
	 */
	static final int HEIGHT = 692;
	/**
	 * 目录文件
	 */
	private static final String FILE_PATH = "/dic";
	/**
	 * 背景图片路径
	 */
	private static final String BG_IMG = "/img/bg.png";
	private static final String LOGO_IMG = "/img/logo.png";
	private static final String TITLE = "打字游戏";
	/**
	 * 添加单词速度
	 */
	private static final int ADD_WORD_SPEED = 1000;
	/**
	 * 单词移动速度 次/毫秒
	 */
	private static final int MOVE_WORD_SPEED = 200;
	/**
	 * 单词移动距离
	 */
	private static final int MOVE_WORD_LENGTH = 10;
	/**
	 * 等待加载速度
	 */
	private static final int LOEAD_SHOW_WATI = 1000;
	/**
	 * 所有课程
	 */
	private static List<Course1> course1List;
	/**
	 * 当前选中课程
	 */
	private static Course1 currentCourse1;
	/**
	 * 所有单词
	 */
	private static List<Word1> allWord;
	/**
	 * 当前显示单词
	 */
	private static List<Word1> showWord;
	private static int count = 0;
	/**
	 * 背景
	 */
	private BGPanel bgPanel;
	/**
	 * 模式选择界面
	 */
	private ModePanel modePanel;
	/**
	 * 单词
	 */
	private WordlPanel worldPanel;
	/**
	 * 背景图
	 */
	private Image image;

	public static void main(String[] args) {
		Four four = new Four();
		four.start();
	}

	/**
	 * 游戏开始
	 */
	public void start() {
		init();
		gameDataLoad();
		gameStart();
		gameOver();
	}

	/**
	 * 游戏循环
	 */
	private void gameStart() {
		loadWordBg();
		addWord();
		wordShow();

	}

	/**
	 * 显示单词
	 */
	private void wordShow() {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				gameAction();
				spiritMove();
				collisionDetection();
			}
		}, LOEAD_SHOW_WATI, MOVE_WORD_SPEED);
	}

	/**
	 * 碰撞检测
	 */
	private void collisionDetection() {
		for (int i = 0; i < showWord.size(); i++) {
			if (showWord.get(i).getY() >= Four.HEIGHT) {
				showWord.remove(i);
			}
		}

	}

	/**
	 * 自动添加单词
	 */
	private void addWord() {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				loadWordBg();
			}
		}, LOEAD_SHOW_WATI, ADD_WORD_SPEED);
	}

	/**
	 * (
	 * 加载游戏精灵
	 */
	private void loadWordBg() {
		if (allWord.size() != 0) {
			showWord.add(allWord.remove(0));
		}
	}

	/**
	 * 单词移动
	 */
	private void spiritMove() {
		for (Word1 w : showWord) {
			w.setY(w.getY() + MOVE_WORD_LENGTH);
		}
	}

	/**
	 * 游戏事件
	 */
	private void gameAction() {
		showRunWord();
	}

	/**
	 * 显示游戏数据
	 */
	private void showRunWord() {
		// TODO: 2019/10/29 显示失败
//		this.worldPanel.repaint();
//		this.bgPanel.repaint();
//		this.modePanel.repaint();
		this.repaint();
	}

	/**
	 * 游戏结束
	 */
	private void gameOver() {

	}

	/**
	 * 加载游戏数据
	 */
	private void gameDataLoad() {
		int dataMode = modeSelect();
		currentCourse1 = course1List.get(dataMode);
		allWord = currentCourse1.getWords();
		showWord = new ArrayList<Word1>();
	}

	/**
	 * 游戏模式选择
	 */
	private int modeSelect() {
		ModePanel modePanel = new ModePanel(getFileName(), LOGO_IMG);
		this.modePanel = modePanel;
		this.add(modePanel);
		this.setComponentZOrder(modePanel, 2);
		this.setContentPane(modePanel);
		int mode = modePanel.getMode();
		return mode;
	}

	/**
	 * 加载文件名
	 *
	 * @return
	 */
	private List<String> getFileName() {
		List<String> fileName = new ArrayList<String>();
		for (Course1 course1 : course1List) {
			fileName.add(course1.getIndex() + " " + course1.getName());
		}
		return fileName;
	}

	/**
	 * 游戏初始化
	 */
	protected void init() {
		fileInit();
		showInit();
	}

	/**
	 * 文件初始化
	 */
	protected void fileInit() {
		ImageIcon icon = new ImageIcon(getClass().getResource(BG_IMG));
		image = icon.getImage();
		LoadFileTool loadFileTool = new LoadFileTool(FILE_PATH);
		course1List = loadFileTool.listCourse();
	}

	protected void showInit() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setTitle(TITLE);
		this.setSize(WIDTH, HEIGHT);
		this.setLocationRelativeTo(null);
		BGPanel jPanel = new BGPanel(BG_IMG);
		this.bgPanel = jPanel;
		this.add(jPanel);
		this.setComponentZOrder(jPanel, 1);
		this.setVisible(true);
	}

	/**
	 * 单词的画要在游戏界面画才行，而且也要画背景
	 *
	 * @param g
	 */
	public void paintWord(Graphics g) {
		g.drawImage(image, 0, 0, Four.WIDTH, Four.HEIGHT, this);
		g.setColor(Color.RED);
		g.setFont(Font.getFont("楷体"));
		if (count != 0) {
//			System.out.println(showWord);
			for (Word1 w : showWord) {
				g.drawString(w.getChinese(), w.getX(), w.getY());
				g.drawString(w.getEnglish(), w.getX(), w.getY() + 10);
			}
			g.drawString("LOVE", 100, 100);
		}

	}

	@Override
	public void paint(Graphics g) {
		paintWord(g);
		count++;
	}
}
