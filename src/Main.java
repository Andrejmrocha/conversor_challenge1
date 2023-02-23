import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String[] tipoConversor = {"Conversor de moeda", "Conversor de temperatura"};
		Double novoValor;
		String decisao;
		int laco = 0;
		while(laco == 0) {
			try {
				JOptionPane.showInputDialog(null, "Escolha uma opção", 
						"Menu", JOptionPane.QUESTION_MESSAGE, null, tipoConversor, tipoConversor[0]).toString();
			} catch(NullPointerException e){
				
				return;
			}		
			try {
				String valor = JOptionPane.showInputDialog("Inserir o valor").toString();
				novoValor = Double.parseDouble(valor);
			} catch(Exception e) {
				if(e instanceof NumberFormatException) {
					JOptionPane.showMessageDialog(null, "Valor inválido");
					return;
				} else {
					return;
				}
				
			}
			ArrayList<String> tiposConversaoMoeda = new ArrayList();
			for (OpcoesMoeda o : OpcoesMoeda.values()) {
				tiposConversaoMoeda.add(o.getDescricao());
			}
			Object[] opcoes = tiposConversaoMoeda.toArray();
			try {
				decisao = JOptionPane.showInputDialog(null, "Escolha a moeda para qual deseja converter seu dinheiro", 
						"Moedas", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]).toString();
			} catch(NullPointerException e){
				return;
			}
			
			if(decisao.equals(tiposConversaoMoeda.get(0))) {
				mostrarResultado("$", novoValor, 0);
				
			} else if(decisao.equals(tiposConversaoMoeda.get(1))){
				mostrarResultado("R$", novoValor, 1);
			} else if(decisao.equals(tiposConversaoMoeda.get(2))){
				mostrarResultado("€", novoValor, 2);
			} else if(decisao.equals(tiposConversaoMoeda.get(3))){
				mostrarResultado("R$", novoValor, 3);
			} else if(decisao.equals(tiposConversaoMoeda.get(4))){
				mostrarResultado("£", novoValor, 4);
			} else if(decisao.equals(tiposConversaoMoeda.get(5))){
				mostrarResultado("R$", novoValor, 5);
			} else if(decisao.equals(tiposConversaoMoeda.get(6))){
				mostrarResultado("₩", novoValor, 6);
			} else if(decisao.equals(tiposConversaoMoeda.get(7))){
				mostrarResultado("R$", novoValor, 7);
			}
			
			laco = JOptionPane.showConfirmDialog(null, "Deseja realizar outras conversões?");
			if(laco == 1) {
				JOptionPane.showMessageDialog(null, "Programa finalizado.");
			} else if(laco == 2) {
				JOptionPane.showMessageDialog(null, "Programa concluído.");
			}
		}
	}
	
	public static void mostrarResultado(String moeda, double novoValor,int indice) {
		double valorConvertido = 0;
		
		switch(indice) {
		case 0:
			valorConvertido = realToDolar(novoValor);
			break;
		case 1:
			valorConvertido = dolarToReal(novoValor);
			break;
		case 2:
			valorConvertido = realToEuro(novoValor);
			break;
		case 3:
			valorConvertido = euroToReal(novoValor);
			break;
		case 4:
			valorConvertido = realToLibra(novoValor);
			break;
		case 5:
			valorConvertido = libraToReal(novoValor);
			break;
		case 6:
			valorConvertido = realToWon(novoValor);
			break;
		case 7:
			valorConvertido = wonToReal(novoValor);
			break;
		}
		
		
		JOptionPane.showMessageDialog(null, "O valor convertido é " + moeda + 
	String.format("%.4f", valorConvertido));
	}
	
	public static double realToDolar(double valor) {
		return valor/5.15;
	}
	
	public static double dolarToReal(double valor) {
		return valor * 5.15;
	}
	
	public static double realToEuro(double valor) {
		return valor/5.43;
	}
	
	public static double euroToReal(double valor) {
		return valor * 5.43;
	}
	
	public static double realToLibra(double valor) {
		return valor/6.16;
	}
	
	public static double libraToReal(double valor) {
		return valor * 6.16;
	}
	
	public static double realToWon(double valor) {
		return valor * 253.05;
	}
	
	public static double wonToReal(double valor) {
		return valor/ 253.05;
	}
}
