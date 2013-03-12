import javax.swing.JOptionPane;


public class VerificadorCpf {

	

	public static void main(String[] args) {
		//declarar as variaveis que vao receber os nº do cpf
		int n1,dv1,dv2,soma1,mult;
		String entrada,ncpf,ndv1,ndv2, temp, temp2;
		char temp3;
		
		
		entrada = JOptionPane.showInputDialog("Digite o numero do cpf, somente os números");
		ncpf = entrada;
		//ncpf = recebe o numero do cpf sem os pontos
		
		//Inicialização das variaveis
		n1=0;
		soma1=0;
		mult = 1;
		dv1=0;
				//Extrai numero por numero, iniciando no indice 0 ate a posicao 8
				for(int pos = 0;pos <= 8; pos++)
				{
					temp3 = ncpf.charAt(pos);
					temp = ""+temp3;
					n1 = Integer.parseInt(temp);
					soma1 = soma1+(n1 * mult);
					mult++;
					
				}
				dv1 = soma1%11;//retirando o mod 11
				ndv1 = ""+dv1; //covertento em string
								
				//verificar se o primeiro dv é verdadeiro
				temp2 = ncpf.substring(9,10);
				
				if(temp2.equals(ndv1))
				{
					//JOptionPane.showMessageDialog(null, "O primeiro dv é verdadeiro");
					//calcular a segunda etapa
					
					soma1=0;
					mult = 0;
					dv1=0;
					for(int pos = 0;pos <= 9; pos++)
					{
						temp3 = ncpf.charAt(pos);
						temp = ""+temp3;
						n1 = Integer.parseInt(temp);
						soma1 = soma1+(n1 * mult);
						mult++;
						
					}
					dv2 = soma1%11;//retirando o mod 11
					ndv2 = ""+dv2; //covertento em string
					
					temp2 = ncpf.substring(10,11);
					
					String temp4;
					
					temp4 = temp2;
					JOptionPane.showMessageDialog(null, "o dv2 é: "+temp4);
					
					
					if(temp2.equals(ndv2))
					{
						JOptionPane.showMessageDialog(null, "O CPF é correto");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "O cpf é incorreto");
					}
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "O cpf é incorreto");
				}
		
	}
}
