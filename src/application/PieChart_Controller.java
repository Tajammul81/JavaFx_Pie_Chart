package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;

public class PieChart_Controller {
	@FXML private PieChart piechart;

public void loadpiechart(ActionEvent event){
	// the data is data as in charts we are having data.
	ObservableList<Data>list=FXCollections.observableArrayList(
			new PieChart.Data("Java", 50),
			new PieChart.Data("C#", 60),
			new PieChart.Data("C", 70),
			new PieChart.Data("C++", 40),
			new PieChart.Data("PHP", 35)
			);
	piechart.setData(list);
	// one can edit many properties of piechart in screen builder, eg. clockwise, legend, title etc.
	
}

}