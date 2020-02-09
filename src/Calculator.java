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
		tela = new JLabel("");
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
        			expressao = tela.getText() + mais.getText();
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
        			expressao = tela.getText() + menos.getText();
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
        			expressao = tela.getText() + vezes.getText();
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
                    String texto = tela.getText()+";";
                    String[] vet = new String[100];
                    int ini = 0, fim = 0, cont = 0, tam;
                    flag = true;
                    if (texto.startsWith("*") || texto.startsWith("/") || texto.endsWith("+;") || texto.endsWith("-;") || texto.endsWith("*;") || texto.endsWith("/;")){
                        tela.setText("Sintax Error!");
                    }else{
                        for (int n = 1; n < texto.length(); n++){
                            if(texto.substring(n, n+1).equals("*")){
                                fim = n;
                                vet[cont] = texto.substring(ini, fim);
                                vet[cont+1] = "*";
                                cont += 2;
                                ini = n+1;
                            }else if(texto.substring(n, n+1).equals("/")){
                                fim = n;
                                vet[cont] = texto.substring(ini, fim);
                                vet[cont+1] = "/";
                                cont += 2;
                                ini = n+1;
                            }else if(texto.substring(n, n+1).equals("+")){
                                fim = n;
                                vet[cont] = texto.substring(ini, fim);
                                cont++;
                                ini = n;
                            }else if(texto.substring(n, n+1).equals("-")){
                                fim = n;
                                vet[cont] = texto.substring(ini, fim);
                                cont++;
                                ini = n;
                            }else if(texto.substring(n, n+1).equals(";")){
                                fim = n;
                                vet[cont] = texto.substring(ini, fim);
                                cont++;
                                break;
                            }
                        }

                        vet[cont] = ";";
                        tam = cont;

                        for(int n = 0; n < tam; n++){
                            if(vet[n].equals("*")){
                                vet[n-1] = "" + Double.parseDouble(vet[n-1])*Double.parseDouble(vet[n+1]);
                                vet[n] = "+";
                                vet[n+1] = "+";
                            }else if(vet[n].equals("/")){
                                vet[n-1] = "" + Double.parseDouble(vet[n-1])/Double.parseDouble(vet[n+1]);
                                vet[n] = "+";
                                vet[n+1] = "+";
                            }else if(vet[n].equals("fim")){
                                break;
                            }
                        }

                        // Ja tendo o vetor soh com + e -
                        double res = 0;
                        for (int n = 0; ; n++){
                            if(vet[n].equals(";")){
                                break;
                            }else if(!vet[n].equals("+") && !vet[n].equals("-") && !vet[n].equals(";")){
                                res += Double.parseDouble(vet[n]);
                            }
                        }
                        tela.setText(""+res);
                    }
                }
            }
        );
        botoes.add(igual);
        
        div.addActionListener(
        	new ActionListener(){
        		public void actionPerformed( ActionEvent evento ){
                    flag = false;
        			expressao = tela.getText() + div.getText();
        			tela.setText(expressao);
        		}
        	}
        );
        botoes.add(div);

    	JPanel painel = new JPanel();
    	//painel.setLayout(new BorderLayout());
    	painel.setLayout(null);
    	tela.setBounds(5, 0, 300, 50);
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

	}
    public static void main(String[] args) {
        Calculator tela = new Calculator();
        tela.setVisible(true);
    }
}
