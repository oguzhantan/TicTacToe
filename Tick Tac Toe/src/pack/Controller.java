package pack;
import java.net.URL;

import java.util.ResourceBundle;

import javax.swing.JOptionPane;


import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Controller implements Initializable{

	  @FXML
	    private JFXButton cell1;

	    @FXML
	    private JFXButton cell9;

	    @FXML
	    private JFXButton cell8;

	    @FXML
	    private JFXButton cell7;

	    @FXML
	    private JFXButton cell6;

	    @FXML
	    private JFXButton cell5;

	    @FXML
	    private JFXButton cell4;

	    @FXML
	    private JFXButton cell3;

	    @FXML
	    private JFXButton cell2;

	    @FXML
	    private Label score1;

	    @FXML
	    private Label score2;

	    private String turnoff="X";


	    private String player1="player one";
		private String player2="player two";

	    private int scoreOne=0;
	    private int scoreTwo=0;

	    public void click_cell1(){

	    	String value=cell1.getText();
	    	if(value.equalsIgnoreCase("-")){
	    		cell1.setText(turnoff);
	            determineWhoseTurn(turnoff);
	            determineWhoseWin();
	            tiegame();
	    	}

	    	else return;

	    }


	    public void click_cell2(){

	    	String value=cell2.getText();

	    	if(value.equalsIgnoreCase("-")){
	    		cell2.setText(turnoff);
	    		determineWhoseTurn(turnoff);
	            determineWhoseWin();
                tiegame();
	    	}

	    	else return;
	    }

	    public void click_cell3(){

	    	String value=cell3.getText();

	    	if(value.equalsIgnoreCase("-")){
	    		cell3.setText(turnoff);
	    		determineWhoseTurn(turnoff);
	            determineWhoseWin();
	            tiegame();
	    	}

	    	else return;
	    }

	    public void click_cell4(){

	    	String value=cell4.getText();

	    	if(value.equalsIgnoreCase("-")){
	    		cell4.setText(turnoff);
	    		determineWhoseTurn(turnoff);
	            determineWhoseWin();
	            tiegame();
	    	}

	    	else return;
	    }

	    public void click_cell5(){

	    	String value=cell5.getText();

	    	if(value.equalsIgnoreCase("-")){
	    		cell5.setText(turnoff);
	    		determineWhoseTurn(turnoff);
	            determineWhoseWin();
	            tiegame();
	    	}

	    	else return;
	    }

	    public void click_cell6(){

	    	String value=cell6.getText();

	    	if(value.equalsIgnoreCase("-")){
	    		cell6.setText(turnoff);
	    		determineWhoseTurn(turnoff);
	            determineWhoseWin();
	            tiegame();
	    	}

	    	else return;
	    }

	    public void click_cell7(){

	    	String value=cell7.getText();

	    	if(value.equalsIgnoreCase("-")){
	    		cell7.setText(turnoff);
	    		determineWhoseTurn(turnoff);
	            determineWhoseWin();
	            tiegame();
	    	}

	    	else return;
	    }

	    public void click_cell8(){

	    	String value=cell8.getText();

	    	if(value.equalsIgnoreCase("-")){
	    		cell8.setText(turnoff);
	    		determineWhoseTurn(turnoff);
	            determineWhoseWin();
	            tiegame();
	    	}

	    	else return;
	    }

	    public void click_cell9(){

	    	String value=cell9.getText();

	    	if(value.equalsIgnoreCase("-")){
	    		cell9.setText(turnoff);
	    		determineWhoseTurn(turnoff);
	            determineWhoseWin();
	            tiegame();
	    	}

	    	else return;
	    }

	    private void determineWhoseTurn(String turn){
	    	if(turn.equalsIgnoreCase("X")){
	    		turnoff="O";
	    	}
	    	else if(turn.equalsIgnoreCase("O")){
	    		turnoff="X";
	    	}
	    }


	    private void determineWhoseWin(){

	    	String one=cell1.getText();
	    	String two=cell2.getText();
	    	String three=cell3.getText();
	    	String four=cell4.getText();
	    	String five=cell5.getText();
	    	String six=cell6.getText();
	    	String seven=cell7.getText();
	    	String eight=cell8.getText();
	    	String nine=cell9.getText();

	    	if(one=="X" && two=="X" && three=="X") {
	    		winX();
	    	}

	    	else if(four=="X" && five=="X" && six=="X") {
	    		winX();
	    	}

	    	else if(seven=="X" && eight=="X" && nine=="X") {
	    		winX();
	    	}

	    	else if(one=="X" && four=="X" && seven=="X") {
	    		winX();
	    	}

	    	else if(two=="X" && five=="X" && eight=="X") {
	    		winX();
	    	}

	    	else if(three=="X" && six=="X" && nine=="X") {
	    		winX();
	    	}

	    	else if(one=="X" && five=="X" && nine=="X") {
	    		winX();
	    	}

	    	else if(three=="X" && five=="X" && seven=="X") {
	    		winX();
	    	}

	    	if(one=="O" && two=="O" && three=="O") {
	    		winO();
	    	}

	    	else if(four=="O" && five=="O" && six=="O") {
	    		winO();
	    	}

	    	else if(seven=="O" && eight=="O" && nine=="O") {
	    		winO();
	    	}

	    	else if(one=="O" && four=="O" && seven=="O") {
	    		winO();
	    	}

	    	else if(two=="O" && five=="O" && eight=="O") {
	    		winO();
	    	}

	    	else if(three=="O" && six=="O" && nine=="O") {
	    		winO();
	    	}

	    	else if(one=="O" && five=="O" && nine=="O") {
                winO();
	    	}

	    	else if(three=="O" && five=="O" && seven=="O") {
	    		winO();
	    	}
	    }

	    private void resetGame() {
			cell1.setText("-");
			cell2.setText("-");
			cell3.setText("-");
			cell4.setText("-");
			cell5.setText("-");
			cell6.setText("-");
			cell7.setText("-");
			cell8.setText("-");
			cell9.setText("-");
			setScore();
		}
		/*private void getPlayerNames(){
			 player1=JOptionPane.showInputDialog("Player one name: ");
			 player2=JOptionPane.showInputDialog("Player one name: ");
		 }*/
        private void setScore(){
        	score1.setText(String.valueOf(scoreOne));
        	score2.setText(String.valueOf(scoreTwo));
        }
        private void tiegame(){

        	String one=cell1.getText();
			String two=cell2.getText();
			String three=cell3.getText();
			String four=cell4.getText();
			String five=cell5.getText();
			String six=cell6.getText();
			String seven=cell7.getText();
			String eight=cell8.getText();
			String nine=cell9.getText();

        	if(!one.equalsIgnoreCase("-") && !two.equalsIgnoreCase("-") && !three.equalsIgnoreCase("-") && !four.equalsIgnoreCase("-") && !five.equalsIgnoreCase("-") && !six.equalsIgnoreCase("-") &&
        !seven.equalsIgnoreCase("-") && !eight.equalsIgnoreCase("-") && !nine.equalsIgnoreCase("-") ) resetGame();
        	else return;

        }
	    private void winX(){
	    	JOptionPane.showMessageDialog(null,this,"player one wins",JOptionPane.INFORMATION_MESSAGE);
	    	scoreOne++;
	    	resetGame();
	    }


	    private void winO(){

	    	 JOptionPane.showMessageDialog(null,this,"player two wins",JOptionPane.INFORMATION_MESSAGE);
	    	scoreTwo++;
	    	resetGame();
	    }
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub

		}
}
