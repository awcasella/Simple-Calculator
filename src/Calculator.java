// jar cfm app.jar manifest.MF src
// java -jar app.jar
package src; // Uncomment to make .jar

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Calculator extends JFrame{
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, mais, menos, vezes, div, igual, ponto;
	private JLabel tela;
	private String expressao;
    private boolean flag;

	public Calculator() {
		
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		mais = new JButton("+");
		menos = new JButton("-");
		vezes = new JButton("*");
		div = new JButton("/");
		ponto = new JButton(".");
		//abre = new JButton("(");
		//fecha = new JButton(")");
		tela = new JLabel("", SwingConstants.RIGHT);
		igual = new JButton("=");

		JPanel botoes = new JPanel();
        botoes.setLayout(new GridLayout(4, 4, 5, 5));

        //painel.add(tela);
        
        b7.addActionListener(
        	new ActionListener(){
        		public void actionPerformed( ActionEvent evento ){
                    if (flag){
                        tela.setText("");
                        flag=false;
                    }
        			expressao = tela.getText() + b7.getText();
        			tela.setText(expressao);
        		}
        	}
        );
        botoes.add(b7);

        b8.addActionListener(
        	new ActionListener(){
        		public void actionPerformed( ActionEvent evento ){
                    if (flag){
                        tela.setText("");
                        flag=false;
                    }
        			expressao = tela.getText() + b8.getText();
        			tela.setText(expressao);
        		}
        	}
        );
        botoes.add(b8);
        
        b9.addActionListener(
        	new ActionListener(){
        		public void actionPerformed( ActionEvent evento ){
                    if (flag){
                        tela.setText("");
                        flag=false;
                    }
        			expressao = tela.getText() + b9.getText();
        			tela.setText(expressao);
        		}
        	}
        );
        botoes.add(b9);
        
        mais.addActionListener(
        	new ActionListener(){
        		public void actionPerformed( ActionEvent evento ){
                    flag = false;

					if (tela.getText().endsWith("*") || tela.getText().endsWith("/") || tela.getText().endsWith("-") || tela.getText().endsWith("+")) {
						expressao = tela.getText().substring(0, tela.getText().length()-1) + mais.getText();
					}else{
						expressao = tela.getText() + mais.getText();
					}
					tela.setText(expressao);
        		}
        	}
        );
        botoes.add(mais);
        
        b4.addActionListener(
        	new ActionListener(){
        		public void actionPerformed( ActionEvent evento ){
                    if (flag){
                        tela.setText("");
                        flag=false;
                    }
        			expressao = tela.getText() + b4.getText();
        			tela.setText(expressao);
        		}
        	}
        );
        botoes.add(b4);
        
        b5.addActionListener(
        	new ActionListener(){
        		public void actionPerformed( ActionEvent evento ){
                    if (flag){
                        tela.setText("");
                        flag=false;
                    }
        			expressao = tela.getText() + b5.getText();
        			tela.setText(expressao);
        		}
        	}
        );
        botoes.add(b5);
        
        b6.addActionListener(
        	new ActionListener(){
        		public void actionPerformed( ActionEvent evento ){
                    if (flag){
                        tela.setText("");
                        flag=false;
                    }
        			expressao = tela.getText() + b6.getText();
        			tela.setText(expressao);
        		}
        	}
        );
        botoes.add(b6);
        
        menos.addActionListener(
        	new ActionListener(){
        		public void actionPerformed( ActionEvent evento ){
                    flag = false;
        			if (tela.getText().endsWith("-") || tela.getText().endsWith("+")) {
						expressao = tela.getText().substring(0, tela.getText().length()-1) + menos.getText();
					}else{
						expressao = tela.getText() + menos.getText();
					}
        			tela.setText(expressao);
        		}
        	}
        );
        botoes.add(menos);
        
        b1.addActionListener(
        	new ActionListener(){
        		public void actionPerformed( ActionEvent evento ){
                    if (flag){
                        tela.setText("");
                        flag=false;
                    }
        			expressao = tela.getText() + b1.getText();
        			tela.setText(expressao);
        		}
        	}
        );
        botoes.add(b1);
        
        b2.addActionListener(
        	new ActionListener(){
        		public void actionPerformed( ActionEvent evento ){
                    if (flag){
                        tela.setText("");
                        flag=false;
                    }
                    expressao = tela.getText() + b2.getText();
        			tela.setText(expressao);
        		}
        	}
        );
        botoes.add(b2);
        
        b3.addActionListener(
        	new ActionListener(){
        		public void actionPerformed( ActionEvent evento ){
                    if (flag){
                        tela.setText("");
                        flag=false;
                    }
        			expressao = tela.getText() + b3.getText();
        			tela.setText(expressao);
        		}
        	}
        );
        botoes.add(b3);
        
        vezes.addActionListener(
        	new ActionListener(){
        		public void actionPerformed( ActionEvent evento ){
                    flag = false;
        			if (tela.getText().endsWith("*") || tela.getText().endsWith("/") || tela.getText().endsWith("-") || tela.getText().endsWith("+")) {
						expressao = tela.getText().substring(0, tela.getText().length()-1) + vezes.getText();
					}else{
						expressao = tela.getText() + vezes.getText();
					}
        			tela.setText(expressao);
        		}
        	}
        );
        botoes.add(vezes);
        
        ponto.addActionListener(
        	new ActionListener(){
        		public void actionPerformed( ActionEvent evento ){
                    if (flag){
                        tela.setText("0");
                        flag=false;
                    }
                    flag = false;
        			expressao = tela.getText() + ponto.getText();
        			tela.setText(expressao);
        		}
        	}
        );
        botoes.add(ponto);

        b0.addActionListener(
        	new ActionListener(){
        		public void actionPerformed( ActionEvent evento ){
                    if (flag){
                        tela.setText("");
                    }
        			expressao = tela.getText() + b0.getText();
        			tela.setText(expressao);
        		}
        	}
        );
        botoes.add(b0);
        
		igual.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evento){
					ScriptEngineManager mgr = new ScriptEngineManager();
					ScriptEngine engine = mgr.getEngineByName("JavaScript");

					String foo = tela.getText();
					String res;
					try{
						res = engine.eval(foo).toString();
					}catch(Exception e){
						res = "Erro de sintaxe!";
					}

					flag = true;

					tela.setText(""+res);

				}
			}
		);
		botoes.add(igual);

		div.addActionListener(
			new ActionListener(){
				public void actionPerformed( ActionEvent evento ){
					flag = false;
					if (tela.getText().endsWith("*") || tela.getText().endsWith("/") || tela.getText().endsWith("-") || tela.getText().endsWith("+")) {
						expressao = tela.getText().substring(0, tela.getText().length()-1) + div.getText();
					}else{
						expressao = tela.getText() + div.getText();
					}
					tela.setText(expressao);
				}
			}
		);
		botoes.add(div);

		JPanel painel = new JPanel();
		//painel.setLayout(new BorderLayout());
    	painel.setLayout(null);
    	tela.setBounds(5, 5, 300, 50);
    	/*painel.add(BorderLayout.NORTH, tela);
    	painel.add(BorderLayout.CENTER, botoes);*/
    	painel.add(tela);
    	botoes.setBounds(5, 60, 300, 150);
    	painel.add(botoes);

        this.setContentPane(painel);
        this.pack();

        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.setLocation(300, 200);
        this.setSize(310, 250);
        this.setResizable(false);
        Font labelFont = tela.getFont();
		String labelText = tela.getText();

		int stringWidth = tela.getFontMetrics(labelFont).stringWidth(labelText);
		int componentWidth = tela.getWidth();

		// Find out how much the font can grow in width.
		double widthRatio = (double)componentWidth / (double)stringWidth;

		int newFontSize = (int)(labelFont.getSize() * widthRatio);
		int componentHeight = tela.getHeight();

		// Pick a new font size so it will not be larger than the height of tela.
		int fontSizeToUse = Math.min(newFontSize, componentHeight);

		// Set the tela's font size to the newly determined size.
		tela.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSizeToUse));

	}
    public static void main(String[] args) {
        Calculator tela = new Calculator();
        tela.setVisible(true);
    }
}

