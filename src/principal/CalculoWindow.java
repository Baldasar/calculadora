package principal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class CalculoWindow extends JFrame{
	
	private JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9;
	
	public CalculoWindow() {
		setSize(1680,665);
		setLayout(null);
		setLocationRelativeTo(null);  
		criarP1();
		criarP2();
		criarP3();
		criarP4();
		criarP5();
		criarP6();
		criarP7();
		criarP8();
		geradorSenha();
		setVisible(true);
	}
	
	private void criarP1() {
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(10, 10, 400, 180);
		p1.setBorder(BorderFactory.createTitledBorder("Aplicar desconto % num valor"));
		getContentPane().add(p1);
		ActionListener Salvar;
		
		JLabel lblValorInicial = new JLabel("Valor inicial R$ (a): ");
		lblValorInicial.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblValorInicial.setBounds(10, 20, 200, 25);
		p1.add(lblValorInicial);
		
		JTextField a = new JTextField();
		a.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		a.setBounds(190, 20, 200, 25);
		p1.add(a);
		
		JLabel lblDesconto = new JLabel("% Desconto (b): ");
		lblDesconto.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblDesconto.setBounds(10, 60, 200, 25);
		p1.add(lblDesconto);
		
		JTextField b = new JTextField();
		b.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		b.setBounds(190, 60, 200, 25);
		p1.add(b);
		
		JLabel lblResultado = new JLabel("Resultado: ");
		lblResultado.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblResultado.setBounds(10, 100, 200, 25);
		p1.add(lblResultado);
		
		JTextField result = new JTextField();
		result.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		result.setBounds(190, 100, 200, 25);
		result.setEditable(false);
		p1.add(result);
		
		Salvar = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int aINT = Integer.parseInt(a.getText());
				int bINT = Integer.parseInt(b.getText());
				
				float resultado = aINT - (aINT * bINT / 100);
				result.setText("" + resultado);
			}
		};
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(Salvar);
		btnCalcular.setBounds(10, 140, 380, 25);
		p1.add(btnCalcular);
	}
	
	private void criarP2() {
		p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(420, 10, 400, 180);
		p2.setBorder(BorderFactory.createTitledBorder("Incrementar % a um valor"));
		getContentPane().add(p2);
		ActionListener Salvar;

		JLabel lblValorInicial = new JLabel("Valor inicial R$ (a): ");
		lblValorInicial.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblValorInicial.setBounds(10, 20, 200, 25);
		p2.add(lblValorInicial);
		
		JTextField a = new JTextField();
		a.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		a.setBounds(190, 20, 200, 25);
		p2.add(a);
		
		JLabel lblAcrecimo = new JLabel("% acrécimo (b): ");
		lblAcrecimo.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblAcrecimo.setBounds(10, 60, 200, 25);
		p2.add(lblAcrecimo);
		
		JTextField b = new JTextField();
		b.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		b.setBounds(190, 60, 200, 25);
		p2.add(b);
		
		JLabel lblResultado = new JLabel("Resultado: ");
		lblResultado.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblResultado.setBounds(10, 100, 200, 25);
		p2.add(lblResultado);
		
		JTextField result = new JTextField();
		result.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		result.setBounds(190, 100, 200, 25);
		result.setEditable(false);
		p2.add(result);
		
		Salvar = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int aINT = Integer.parseInt(a.getText());
				int bINT = Integer.parseInt(b.getText());
				
				float resultado = aINT + (aINT * bINT / 100);
				result.setText("" + resultado);
			}
		};
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(Salvar);
		btnCalcular.setBounds(10, 140, 380, 25);
		p2.add(btnCalcular);
	}
	
	private void criarP3() {
		p3 = new JPanel();
		p3.setLayout(null);
		p3.setBorder(BorderFactory.createTitledBorder("Amostragem - Quantos A% representa de B"));
		p3.setBounds(840, 10, 400, 180);
		getContentPane().add(p3);
		ActionListener Salvar;
		
		JLabel lblValorInicial = new JLabel("Total (a): ");
		lblValorInicial.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblValorInicial.setBounds(10, 20, 200, 25);
		p3.add(lblValorInicial);
		
		JTextField a = new JTextField();
		a.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		a.setBounds(190, 20, 200, 25);
		p3.add(a);
		
		JLabel lblAcrecimo = new JLabel("Porcentagem (b): ");
		lblAcrecimo.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblAcrecimo.setBounds(10, 60, 200, 25);
		p3.add(lblAcrecimo);
		
		JTextField b = new JTextField();
		b.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		b.setBounds(190, 60, 200, 25);
		p3.add(b);
		
		JLabel lblResultado = new JLabel("Corresponde a: ");
		lblResultado.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblResultado.setBounds(10, 100, 200, 25);
		p3.add(lblResultado);
		
		JTextField result = new JTextField();
		result.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		result.setBounds(190, 100, 200, 25);
		result.setEditable(false);
		p3.add(result);
		
		Salvar = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float aINT = Float.parseFloat(a.getText());
				float bINT = Float.parseFloat(b.getText());
				
				float resultado = (aINT * bINT) / 100;
				result.setText("" + resultado);
			}
		};
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(Salvar);
		btnCalcular.setBounds(10, 140, 380, 25);
		p3.add(btnCalcular);
	}
		
	private void criarP4() {
		p4 = new JPanel();
		p4.setLayout(null);
		p4.setBounds(1250, 10, 400, 180);
		p4.setBorder(BorderFactory.createTitledBorder("Amostragem 2 - Quanto A representa de B"));
		getContentPane().add(p4);
		ActionListener Salvar;
		
		JLabel lblValorInicial = new JLabel("Total (a): ");
		lblValorInicial.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblValorInicial.setBounds(10, 20, 200, 25);
		p4.add(lblValorInicial);
		
		JTextField a = new JTextField();
		a.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		a.setBounds(190, 20, 200, 25);
		p4.add(a);
		
		JLabel lblAcrecimo = new JLabel("Parte (b): ");
		lblAcrecimo.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblAcrecimo.setBounds(10, 60, 200, 25);
		p4.add(lblAcrecimo);
		
		JTextField b = new JTextField();
		b.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		b.setBounds(190, 60, 200, 25);
		p4.add(b);
		
		JLabel lblResultado = new JLabel("Corresponde a % ");
		lblResultado.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblResultado.setBounds(10, 100, 200, 25);
		p4.add(lblResultado);
		
		JTextField result = new JTextField();
		result.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		result.setBounds(190, 100, 200, 25);
		result.setEditable(false);
		p4.add(result);
		
		Salvar = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float aINT = Float.parseFloat(a.getText());
				float bINT = Float.parseFloat(b.getText());
				
				float resultado = (aINT / bINT) * 100;
				result.setText("" + resultado);
			}
		};
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(Salvar);
		btnCalcular.setBounds(10, 140, 380, 25);
		p4.add(btnCalcular);
	}

	private void criarP5() {
		p5 = new JPanel();
		p5.setLayout(null);
		p5.setBorder(BorderFactory.createTitledBorder("Valor era A e paguei B, qual foi o desconto%?"));
		p5.setBounds(10, 220, 400, 180);
		getContentPane().add(p5);
		ActionListener Salvar;
		
		JLabel lblValorInicial = new JLabel("Valor original (a): ");
		lblValorInicial.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblValorInicial.setBounds(10, 20, 200, 25);
		p5.add(lblValorInicial);
		
		JTextField a = new JTextField();
		a.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		a.setBounds(190, 20, 200, 25);
		p5.add(a);
		
		JLabel lblAcrecimo = new JLabel("Valor com desconto (b): ");
		lblAcrecimo.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblAcrecimo.setBounds(10, 60, 200, 25);
		p5.add(lblAcrecimo);
		
		JTextField b = new JTextField();
		b.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		b.setBounds(190, 60, 200, 25);
		p5.add(b);
		
		JLabel lblResultado = new JLabel("% desconto: ");
		lblResultado.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblResultado.setBounds(10, 100, 200, 25);
		p5.add(lblResultado);
		
		JTextField result = new JTextField();
		result.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		result.setBounds(190, 100, 200, 25);
		result.setEditable(false);
		p5.add(result);
		
		Salvar = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float aINT = Float.parseFloat(a.getText());
				float bINT = Float.parseFloat(b.getText());
				
				float resultado = ((aINT - bINT) / aINT) * 100;
				result.setText("" + resultado);
			}
		};
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(Salvar);
		btnCalcular.setBounds(10, 140, 380, 25);
		p5.add(btnCalcular);
	}
	
	private void criarP6() {
		p6 = new JPanel();
		p6.setLayout(null);
		p6.setBorder(BorderFactory.createTitledBorder("Variação Delta [%] - diferença % entre valores"));
		p6.setBounds(420, 220, 400, 180);
		getContentPane().add(p6);
		ActionListener Salvar;
		
		JLabel lblValorInicial = new JLabel("Valor inicial (a): ");
		lblValorInicial.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblValorInicial.setBounds(10, 20, 200, 25);
		p6.add(lblValorInicial);
		
		JTextField a = new JTextField();
		a.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		a.setBounds(190, 20, 200, 25);
		p6.add(a);
		
		JLabel lblAcrecimo = new JLabel("Valor final (b): ");
		lblAcrecimo.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblAcrecimo.setBounds(10, 60, 200, 25);
		p6.add(lblAcrecimo);
		
		JTextField b = new JTextField();
		b.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		b.setBounds(190, 60, 200, 25);
		p6.add(b);
		
		JLabel lblResultado = new JLabel("Diferença %: ");
		lblResultado.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblResultado.setBounds(10, 100, 200, 25);
		p6.add(lblResultado);
		
		JTextField result = new JTextField();
		result.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		result.setBounds(190, 100, 200, 25);
		result.setEditable(false);
		p6.add(result);
		
		Salvar = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float aINT = Float.parseFloat(a.getText());
				float bINT = Float.parseFloat(b.getText());
				
				//float resultado = ((bINT / aINT) - 1) * 100;
				float resultado = (bINT - aINT) / aINT * 100;
				result.setText("" +  resultado);
			}
		};
			
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(Salvar);
		btnCalcular.setBounds(10, 140, 380, 25);
		p6.add(btnCalcular);
	}
	
	private void criarP7() {
		p7 = new JPanel();
		p7.setLayout(null);
		p7.setBorder(BorderFactory.createTitledBorder("Qual era o valor original?"));
		p7.setBounds(840, 220, 400, 180);
		getContentPane().add(p7);
		ActionListener Salvar;
		
		JLabel lblValorInicial = new JLabel("Valor final R$ (a): ");
		lblValorInicial.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblValorInicial.setBounds(10, 20, 200, 25);
		p7.add(lblValorInicial);
		
		JTextField a = new JTextField();
		a.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		a.setBounds(190, 20, 200, 25);
		p7.add(a);
		
		JLabel lblAcrecimo = new JLabel("% desconto (b): ");
		lblAcrecimo.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblAcrecimo.setBounds(10, 60, 200, 25);
		p7.add(lblAcrecimo);
		
		JTextField b = new JTextField();
		b.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		b.setBounds(190, 60, 200, 25);
		p7.add(b);
		
		JLabel lblResultado = new JLabel("Valor inicial %: ");
		lblResultado.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblResultado.setBounds(10, 100, 200, 25);
		p7.add(lblResultado);
		
		JTextField result = new JTextField();
		result.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		result.setBounds(190, 100, 200, 25);
		result.setEditable(false);
		p7.add(result);
		
		Salvar = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int aINT = Integer.parseInt(a.getText());
				int bINT = Integer.parseInt(b.getText());
				
				float resultado = (aINT * 100 / (100 - bINT));
				result.setText("" + resultado);
			}
		};
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(Salvar);
		btnCalcular.setBounds(10, 140, 380, 25);
		p7.add(btnCalcular);
	}
	
	private void criarP8() {
		p8 = new JPanel();
		p8.setLayout(null);
		p8.setBorder(BorderFactory.createTitledBorder("Regra de Três"));
		p8.setBounds(10, 430, 400, 180);
		getContentPane().add(p8);
		ActionListener Salvar;
		
		JLabel lbl1 = new JLabel("a: ");
		lbl1.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lbl1.setBounds(10, 40, 200, 25);
		p8.add(lbl1);
			
		JTextField a = new JTextField();
		a.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		a.setBounds(30, 40, 150, 25);
		p8.add(a);
	
		JLabel lbl2 = new JLabel("b: ");
		lbl2.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lbl2.setBounds(10, 80, 200, 25);
		p8.add(lbl2);
		
		JTextField b = new JTextField();
		b.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		b.setBounds(30, 80, 150, 25);
		p8.add(b);
		
		JLabel lbl3 = new JLabel("= r1: ");
		lbl3.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lbl3.setBounds(190, 40, 200, 25);
		p8.add(lbl3);
			
		JTextField r1 = new JTextField();
		r1.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		r1.setBounds(235, 40, 150, 25);
		p8.add(r1);
		
		JLabel lbl4 = new JLabel("= r1: ");
		lbl4.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lbl4.setBounds(190, 80, 200, 25);
		p8.add(lbl4);
			
		JTextField r2 = new JTextField();
		r2.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		r2.setBounds(235, 80, 150, 25);
		r2.setEditable(false);
		p8.add(r2);	
		
		Salvar = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int r1INT = Integer.parseInt(r1.getText());
				int aINT = Integer.parseInt(a.getText());
				int bINT = Integer.parseInt(b.getText());
				
				float resultado = (r1INT * bINT) / aINT;
				r2.setText("" + resultado);
			}
		};
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(Salvar);
		btnCalcular.setBounds(10, 125, 380, 25);
		p8.add(btnCalcular);
	}
	
	private void geradorSenha() {
		p9 = new JPanel();
		p9.setLayout(null);
		p9.setBounds(420, 430, 400, 180);
		p9.setBorder(BorderFactory.createTitledBorder("Gerador de senha"));
		getContentPane().add(p9);
		ActionListener Salvar;
		
	    List<String> letras_mai = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"));
	    List<String> letras_min = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
	    List<String> numeros = new ArrayList<String>(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));
	    List<String> simbolos = new ArrayList<String>(Arrays.asList("+","-","/","*","_","!","@","$","%","&"));
		
		JCheckBox checkCAPS = new JCheckBox("Maiúsculas");
		checkCAPS.setBounds(10,20,150,25);
		p9.add(checkCAPS);
		
		JCheckBox checkNOCAPS = new JCheckBox("Minúsculas");
		checkNOCAPS.setBounds(235,20,150,25);
		p9.add(checkNOCAPS);
		
		JCheckBox checkNUMBER = new JCheckBox("Números");
		checkNUMBER.setBounds(10,60,150,25);
		p9.add(checkNUMBER);
		
		JCheckBox checkSPECIAL = new JCheckBox("Símbolos");
		checkSPECIAL.setBounds(235,60,150,25);
		p9.add(checkSPECIAL);
		
		JLabel lblQuant = new JLabel("Tamanho: ");
		lblQuant.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		lblQuant.setBounds(10, 100, 100, 25);
		p9.add(lblQuant);
		
		JSpinner jspQuant = new JSpinner();
		jspQuant.setBounds(80,100,70,25);
		p9.add(jspQuant);
		
		JTextField result = new JTextField();
		result.setFont(new Font(Font.MONOSPACED, Font.BOLD,12));
		result.setBounds(10, 140, 380, 25);
		result.setEditable(false);
		p9.add(result);
		
		Salvar = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> total = new ArrayList<String>();
				StringBuilder senha = new StringBuilder();
				int quant = (Integer) jspQuant.getValue();
				
				if(checkCAPS.isSelected()) {
					total.addAll(letras_mai);
				}
				
				if(checkNOCAPS.isSelected()) {
					total.addAll(letras_min);
				}
				
				if(checkNUMBER.isSelected()) {
					total.addAll(numeros);
				}
				
				if(checkSPECIAL.isSelected()) {
					total.addAll(simbolos);
				}
				
				for (int i = 0; i < quant; i++) {
					int posicao = (int) (Math.random() * total.size());
					senha.append(total.get(posicao));
				}
				
				result.setText("" + senha);
				total.clear();
			}
		};
		
		JButton btnGERAR = new JButton("Gerar");
		btnGERAR.setBounds(235,100,150,25);
		btnGERAR.addActionListener(Salvar);
		p9.add(btnGERAR);
	}
	
}