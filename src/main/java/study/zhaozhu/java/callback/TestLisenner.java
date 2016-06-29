package study.zhaozhu.java.callback;

public class TestLisenner {
	private final static int START = 1;
	private final static int RESUME = 2;
	private final static int PAUSE = 3;
	private final static int STOP = 4;
	private final static int FINISH = 5;
	public static void testLisener(int step, ITestLisener iTestLisener) {
		if (iTestLisener != null) {
			// 回调on**方法
			switch (step) {
			case START:
				iTestLisener.onStart("logStart");
				break;
			case RESUME:
				iTestLisener.onResume("logResume");
				break;
			case PAUSE:
				iTestLisener.onPause("logPause");
				break;
			case STOP:
				iTestLisener.onStop("logStop");
				break;
			case FINISH:
				iTestLisener.onfinish("logFinish");
				break;

			default:
				break;
			}
		}
	}
	public static void main(String[] args) {
		ITestLisener iTestLisener = new ITestLisener() {
			@Override
			public void onStart(String logStart) {
				System.out.println(logStart);
			}
			@Override
			public void onResume(String logResume) {
				System.out.println(logResume);
			}
			@Override
			public void onPause(String logPause) {
				System.out.println(logPause);
			}
			@Override
			public void onStop(String logStop) {
				System.out.println(logStop);
			}
			@Override
			public void onfinish(String logFinish) {
				System.out.println(logFinish);
			}
		};
		
		TestLisenner.testLisener(START, iTestLisener);
		TestLisenner.testLisener(RESUME, iTestLisener);
		TestLisenner.testLisener(PAUSE, iTestLisener);
		TestLisenner.testLisener(STOP, iTestLisener);
		TestLisenner.testLisener(FINISH, iTestLisener);
	}
	
}
