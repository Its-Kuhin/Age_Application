/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package age_application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author SR Kuhin
 */
public class FXMLDocumentController implements Initializable {

	@FXML
	private Button btn;

	@FXML
	private Label label;

	@FXML
	private TextField textf;

	int age;

	@FXML
	public void age_set(ActionEvent event) {
		try {
			age = Integer.parseInt(textf.getText());
			if(age>=18){
				label.setText("You are Eligible");
			}
			else{
				label.setText("You are not Eligible");
			}
		}
		catch (NumberFormatException e) {
			label.setText("Enter Only Numbers");
		}
		catch (Exception e) {
			label.setText("error");
		}
		textf.clear();
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}

}
