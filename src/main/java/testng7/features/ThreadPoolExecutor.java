package testng7.features;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import org.testng.IDynamicGraph;
import org.testng.ISuite;
import org.testng.ITestNGMethod;
import org.testng.thread.IExecutorFactory;
import org.testng.thread.ITestNGThreadPoolExecutor;
import org.testng.thread.IThreadWorkerFactory;

public class ThreadPoolExecutor implements IExecutorFactory  {

	public ITestNGThreadPoolExecutor newSuiteExecutor(String name, IDynamicGraph<ISuite> graph,
			IThreadWorkerFactory<ISuite> factory, int corePoolSize, int maximumPoolSize, long keepAliveTime,
			TimeUnit unit, BlockingQueue<Runnable> workQueue, Comparator<ISuite> comparator) {
		// TODO Auto-generated method stub
	//	System.out.println(name);
		return null;
	}

	public ITestNGThreadPoolExecutor newTestMethodExecutor(String name, IDynamicGraph<ITestNGMethod> graph,
			IThreadWorkerFactory<ITestNGMethod> factory, int corePoolSize, int maximumPoolSize, long keepAliveTime,
			TimeUnit unit, BlockingQueue<Runnable> workQueue, Comparator<ITestNGMethod> comparator) {
		// TODO Auto-generated method stub
		return null;
	}

}
