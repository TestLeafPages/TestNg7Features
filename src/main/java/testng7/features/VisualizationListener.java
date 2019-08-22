package testng7.features;

import org.testng.IExecutionVisualiser;

public class VisualizationListener implements IExecutionVisualiser {

	public void consumeDotDefinition(String dotDefinition) {
		
		System.out.println(dotDefinition);
	}

}
