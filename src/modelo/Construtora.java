package modelo;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import static modelo.Construtora.converteOctalParaHexadecimal;
import static modelo.Construtora.converteBinarioParaHexadecimal;

public class Construtora {
    
    LinkedList<String> octal = new LinkedList<>();
	
	public static void main(String[] args) {
				
	}
	
//informa valores a usuario
/*private static void informaValores() {
    
	String entrada;
	String saida;


entrada = JOptionPane.showInputDialog("Informa um valor em base octal para converte: ");
saida = converteOctalParaHexadecimal(""+Integer.parseInt(entrada));
JOptionPane.showMessageDialog(null, "conversão é  "+ saida );
}*/
// Converte Octal para Binario	
	
	public static int converteOctalParaBinario(String valorOctal) {
		  
		int valor = 0;
		   // soma ao valor final o dígito binário da posição * 8 elevado ao contador da posição (começa em 0)
		   for (int i=valorOctal.length(); i>0; i--) {
		      valor += Integer.parseInt(valorOctal.charAt(i-1)+"")*Math.pow(8, (valorOctal.length()-i));
		   }
		 
		   return valor;
		}
	
	// Converte Binario para Hexadecimal
	
	public static String converteBinarioParaHexadecimal(int valor) {
		   char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
		   int resto = -1;
		   StringBuilder sb = new StringBuilder();
		 
		   if (valor == 0) {
		      return "0";
		   }
		 
		   // enquanto o resultado da divisão por 16 for maior que 0 adiciona o resto ao início da String de retorno
		   while (valor > 0) {
		      resto = valor % 16;
		      valor = valor / 16;
		      sb.insert(0, hexa[resto]);
		   }
		 
		   return sb.toString();
		}
	//Converte Octal para Hexadecimal
		public static String converteOctalParaHexadecimal(String valorOctal) {
		   int valorBinario = converteOctalParaBinario(valorOctal);
		 
		   return converteBinarioParaHexadecimal(valorBinario);
		}	

                
}

