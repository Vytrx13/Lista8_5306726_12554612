package ex2;

import ex1.View;

public class TestView {
    
    public static void main(String[] args) {
    	View View = new View();
    	
    	for(int i = -1; i < 21; i++) {
    		View.getNumberInput().setText(Integer.toString(i));
    		View.getButton().doClick();    	
    	}
    }
}