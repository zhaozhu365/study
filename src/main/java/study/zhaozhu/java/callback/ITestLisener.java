package study.zhaozhu.java.callback;

public interface ITestLisener {
	
	void onStart(String logStart);
	void onResume(String logResume);
	void onPause(String logPause);
	void onStop(String logStop);
	void onfinish(String logFinish);
	
}
