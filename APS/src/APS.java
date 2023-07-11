import java.util.Scanner;

public class APS {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int opm,opd,opr;
		String nome;
		double altura,imc,peso;
		char vt,vtimc,vtr,vtd;
		Boolean vt2,vtimc2,vtd2,vtr2;
		
		imc = 0;
		
		System.out.println(".________________________________________________________.");
		System.out.println("|             	Projeto Alimentacao Saudavel             |");
		System.out.println("|                                                        |");
		System.out.println(".--------------------------------------------------------.");
		System.out.println("|                   Informe seu nome:                    |");
		nome = sc.nextLine();
		System.out.println(".________________________________________________________.");
		System.out.println("                    Bem Vindo(a) "+nome+"                 ");		
		do{
			vt = 'n';
			vt2 = true;
			System.out.println(".________________________________________________________.");
			System.out.println("|                        MENU                            |");
			System.out.println("|  1 -    Beneficios de uma alimentacao saudavel         |");
			System.out.println("|  2 -    IMC                                            |");
			System.out.println("|  3 -    Dicas para uma alimentacao saudavel            |");
			System.out.println("|  4 -    Receitas Sugeridas                             |");
			System.out.println("|  5 -    Sair                                           |");
			System.out.println(".________________________________________________________.");
			System.out.println("|            Escolha uma operacao acima:                 |");
			opm = sc.nextInt();
			switch(opm) {
			case 1:
				System.out.println();
				System.out.println(".______________________________________________________________________________________________.");
				System.out.println("|                             Beneficios de uma alimentacao saudavel                           |");
				System.out.println(".______________________________________________________________________________________________.");
				System.out.println("|   A alimentacao saudavel e equilibrada, rica em vitaminas  e minerais pode trazer diversos   |");
				System.out.println("| beneficios para a saude, como:                                                               |");
				System.out.println("|______________________________________________________________________________________________|");
				System.out.println("|* Mais energia                          |   * Promove o crescimento e a renovacao dos tecidos |");
				System.out.println("|* Previne doencas infecciosas           |   * Melhora a qualidade do sono                     |");
				System.out.println("|* Diminui o risco de doencas cronicas   |   * Melhora a concentracao                          |");
				System.out.println(".________________________________________|_____________________________________________________.");
				break;
			case 2:
				do{
					System.out.println(".________________________________________________________.");
					System.out.println("|                        IMC                             |");
					System.out.println(".________________________________________________________.");
					System.out.println("|Por favor informe sua altura:                           |");
					altura = sc.nextDouble();
					System.out.println("|Informe seu peso:                                       |");
					peso = sc.nextDouble();
					System.out.println(".________________________________________________________.");
					imc = peso / (altura * altura);
					if(imc < 17) {
						System.out.println("|Situacao: Muito abaixo do peso                          |");
					}else {
						if(imc >= 17 && imc < 18.5) {
							System.out.println("|Situacao: Abaixo do peso                                |");
						}else {
							if(imc >= 18.5 && imc <= 24.9) {
								System.out.println("|Situacao: Peso normal                                   |");
							}else {
								if(imc >= 25 && imc <= 29.9) { 
									System.out.println("|Situacao: Acima do peso                                 |");
								}else {
									if(imc >= 30 && imc <= 34.9) {
										System.out.println("|Situacao: Obesidade I                                   |");
									}else {
										if(imc >= 35 && imc <= 39.9) {
											System.out.println("|Situacao: Obesidade II(Severa)                          |");
										}else {
											if(imc >= 40) {
												System.out.println("|Situacao: Obesidade III(Morbida)                        |");
											}
										}
									}
								}
							}
						}
					}
				do{
					System.out.println(".________________________________________________________.");
					System.out.println("|Gostaria de continuar o calculo do imc?[s/n]            |");
					vtimc2 = false;
					vtimc = sc.next().charAt(0);
					if(vtimc == 's' || vtimc == 'S') {
						vtimc = 's';
					}else {
						if(vtimc == 'n' || vtimc == 'N') {
							vtimc = 'n';
						}else {
							if(vtimc != 's' || vtimc != 'S' || vtimc != 'n' || vtimc != 'N') {
								System.out.println("Operacao Invalida!");
								vtimc2 = true;
							}
						}
					}
				}while(vtimc2 == true);
			}while(vtimc == 's' || vtimc == 'S');
				break;
			case 3:
				do{
					vtd = 'n';
					vtd2 = true;
					System.out.println(".________________________________________________________.");
					System.out.println("|                        DICAS                           |");
					System.out.println(".________________________________________________________.");
					System.out.println("|  1 -    Compras dos alimentos                          |");
					System.out.println("|  2 -    Reduza os niveis de acucar                     |");
					System.out.println("|  3 -    Consuma frutas todos os dias                   |");
					System.out.println("|  4 -    Habitos que favorecem na saude                 |");
					System.out.println(".________________________________________________________.");
					System.out.println("|            Escolha uma operacao acima:                 |");
					opd = sc.nextInt();
					switch(opd) {
					case 1:
						System.out.println(".________________________________________________________.");
						System.out.println("|                Compras dos alimentos                   |");
						System.out.println(".________________________________________________________.");
						System.out.println("|   Procure fazer compras de alimentos em mercados com   |");
						System.out.println("| producao local, diretamente dos agricultores.          |");
						System.out.println("|   Da prioridade a compra de alimentos frescos e        |");
						System.out.println("| preferencia a compra de frutas, legumes e              |");
						System.out.println("| verduras da estacao,pois sao mais baratos e nutritivos.|");
						System.out.println(".________________________________________________________.");
						break;
					case 2:
						System.out.println(".________________________________________________________.");
						System.out.println("|                Reduza os niveis de acucar              |");
						System.out.println(".________________________________________________________.");
						System.out.println("|   Reduzir significa deixar de ingerir uma quantidade   |");
						System.out.println("| de calorias desnecessarias para nosso organismo.       |");
						System.out.println("|   Procure tambem substituir a versao refinada pelo     |");
						System.out.println("| mascavo, por exemplo, que nao passou pelo processo de  |");
						System.out.println("| refinamento, e ainda mantem os valores nutricionais.   |");
						System.out.println(".________________________________________________________.");

						break;
					case 3:
						System.out.println(".________________________________________________________.");
						System.out.println("|                 Consuma frutas todos os dias           |");
						System.out.println(".________________________________________________________.");
						System.out.println("|   As frutas s�o excelentes alimentos, pois sao ricas em|");
						System.out.println("| fibras, vitaminas, minerais, e atuam sempre de forma   |");
						System.out.println("| benefica em nosso organismo.                           |");
						System.out.println("|   Consuma, no minimo, 3 porcoes por dia, e sempre que  |");
						System.out.println("| possivel variando as frutas.                           |");
						System.out.println(".________________________________________________________.");
						break;
					case 4:
						System.out.println(".________________________________________________________.");
						System.out.println("|                 Habitos que favorecem na saude         |");
						System.out.println(".________________________________________________________.");
						System.out.println("|   Habitos saudaveis, por sua vez, sao praticas que tem |");
						System.out.println("| como objetivo, nos proporcionar bem-estar e saude      |");
						System.out.println("| fisica e mental.                                       |");
						System.out.println("|   Entre os representantes mais recomendados estao a    |");
						System.out.println("| atividade fisica, uma alimentacao natural e rica em    |");
						System.out.println("| nutrientes, e o cuidado com a saude mental.            |");
						System.out.println(".________________________________________________________.");
						break;
					default:
						vtd = 's';
						vtd2 = false;
						System.out.println("Operacao Invalida!");
						System.out.println("Tente de novo!");
						}
					while(vtd2 == true){
						System.out.println("|Gostaria voltar para as dicas?[s/n]                     |");
						vtd2 = false;
						vtd = sc.next().charAt(0);
						if(vtd == 's' || vtd == 'S') {
							vtd = 's';
						}else {
							if(vtd == 'N' || vtd == 'n') {
								vtd = 'n';
							}else {
								if(vtd != 's' || vtd != 'S' || vtd != 'n' || vtd != 'N') {
									vtd2 = true;
									System.out.println("Operacao Invalida!");
								}
							}
						}
					}
				}while(vtd == 's' || vtd == 'S');
				break;
				
			case 4:
				do{
					vtr = 'n';
					vtr2 = true;
					System.out.println(".________________________________________________________.");
					System.out.println("|                        RECEITAS                        |");
					System.out.println(".________________________________________________________.");
					System.out.println("|  1 -    Segunda-Feira                                  |");
					System.out.println("|  2 -    Terca-Feira                                    |");
					System.out.println("|  3 -    Quarta-Feira                                   |");
					System.out.println("|  4 -    Quinta-Feira                                   |");
					System.out.println("|  5 -    Sexta-Feira                                    |");
					System.out.println("|  6 -    Sabado                                         |");
					System.out.println("|  7 -    Domingo                                        |");
					System.out.println(".________________________________________________________.");
					System.out.println("|            Escolha uma operacao acima:                 |");
					opr = sc.nextInt();
					switch(opr) {
					case 1:
						System.out.println(".________________________________________________________.");
						System.out.println("| Segunda-feira:                                         |");
						System.out.println("|                                                        |");
		                System.out.println("|  Cafe da Manha: Vitamina de frutas com aveia           |");
		                System.out.println("|  Almoco: Salada de quinoa com legumes grelhados        |");
		                System.out.println("|  Lanche da Tarde: Iogurte natural com castanhas        |");
		                System.out.println("|  Jantar: Sopa de legumes com frango desfiado           |");
						System.out.println(".________________________________________________________.");
						break;
					case 2:
						System.out.println(".________________________________________________________.");
						System.out.println("| Terca-feira:                                           |");
						System.out.println("|                                                        |");
		                System.out.println("|  Cafa da Manha: Omelete de claras com alface           |");
		                System.out.println("|  Almoco: File de salmao com legumes ao vapor           |");
		                System.out.println("|  Lanche da Tarde: Barra de cereais e uma fruta         |");
		                System.out.println("|  Jantar: Salada de grao-de-bico com tomate e pepino    |");
						System.out.println(".________________________________________________________.");
						break;
					case 3:
						System.out.println(".________________________________________________________.");
						System.out.println("| Quarta-feira:                                          |");
						System.out.println("|                                                        |");
		                System.out.println("|  Cafe da Manha: Pao integral com queijo e tomate       |");
		                System.out.println("|  Almoco: Frango grelhado com arroz integral e brocolis |");
		                System.out.println("|  Lanche da Tarde: Mix de nuts (castanhas e amendoas)   |");
		                System.out.println("|  Jantar: Omelete de atum com alface e tomate           |");
						System.out.println(".________________________________________________________.");
						break;
					case 4:
						System.out.println(".________________________________________________________.");
						System.out.println("| Quinta-feira:                                          |");
						System.out.println("|                                                        |");
		                System.out.println("|  Cafe da Manha: Tapioca com queijo branco e chia       |");
		                System.out.println("|  Almoco: Peito de frango assado com batata-doce e      |");
		                System.out.println("| salada verde                                           |");
		                System.out.println("|  Lanche da Tarde: Smoothie de frutas vermelhas         |");
		                System.out.println("|  Jantar: Omelete de legumes com salada                 |");
						System.out.println(".________________________________________________________.");
						break;
					case 5:
						System.out.println(".________________________________________________________.");
						System.out.println("| Sexta-feira:                                           |");
						System.out.println("|                                                        |");
		                System.out.println("|  Cafe da Manha: Aveia com iogurte e frutas picadas     |");
		                System.out.println("|  Almoco: Peixe grelhado com quinoa e legumes refogados |");
		                System.out.println("|  Lanche da Tarde: Pao integral com pasta de amendoim   |");
		                System.out.println("|  Jantar: Salada de rucula com tomate seco e queijo     |");
		                System.out.println("| mozzarella                                             |");
						System.out.println(".________________________________________________________.");
		                break;
					case 6:
						System.out.println(".________________________________________________________.");
						System.out.println("| Sabado:                                                |");
						System.out.println("|                                                        |");
		                System.out.println("|  Cafe da Manha: Tapioca com banana e canela            |");
		                System.out.println("|  Almoco: Salada com mix de folhas, frango desfiado e   |");
		                System.out.println("| abacate                                                |");
		                System.out.println("|  Lanche da Tarde: Smoothie de abacate e leite de       |");
		                System.out.println("| amendoas                                               |");
		                System.out.println("|  Jantar: Sopa de legumes com carne magra               |");
						System.out.println(".________________________________________________________.");
		                break;
					case 7:
						System.out.println(".________________________________________________________.");
						System.out.println("| Domingo:                                               |");
						System.out.println("|                                                        |");
					    System.out.println("|  Cafe da Manha: Panquecas de banana com mel            |");
					    System.out.println("|  Almoco: Hamburguer caseiro com batatas fritas         |");
					    System.out.println("|  Lanche da Tarde: Bolo de chocolate                    |");
					    System.out.println("|  Jantar: Pizza caseira com ingredientes de sua         |");
					    System.out.println("| preferencia                                            |");
						System.out.println(".________________________________________________________.");
					    System.out.println();
						System.out.println(".________________________________________________________.");
					    System.out.println("| Observacao:                                            |");
						System.out.println("|                                                        |");
					    System.out.println("|  Lembre-se de que a moderacao e essencial, mesmo quando|");
					    System.out.println("| se permite uma refeicao mais indulgente aos domingos.  |"); 
					    System.out.println("|  E importante equilibrar as escolhas alimentares e     |"); 
					    System.out.println("| manter h�bitos saud�veis na maior parte do tempo.      |");
						System.out.println(".________________________________________________________.");
					    break;
					default:
						vtr = 's';
						vtr2 = false;
						System.out.println("Operacao Invalida!");
						System.out.println("Tente de novo!");
					}
					while(vtr2 == true){
						vtr2 = false;
						System.out.println();
						System.out.println("|Gostaria de voltar para as receitas?[s/n]               |");
						vtr = sc.next().charAt(0);
						if(vtr == 's' || vtr == 'S') {
							vtr = 's';
						}else {
							if(vtr == 'N' || vtr == 'n') {
								vtr = 'n';
							}else {
								if(vtr != 's' || vtr != 'S' || vtr != 'n' || vtr != 'N') {
									vtr2 = true;
									System.out.println("Operacao Invalida!");
								}
							}
						}
					}
				}while (vtr == 's' || vtr == 'S');
				break;
			case 5:
				vt2 = false;
				vt = 'n';
				System.out.println("Saindo...");
				System.out.println("Tenha um Bom Dia!");
				break;
			default:
				vt = 's';
				vt2 = false;
				System.out.println("Operacao Invalida!");
				System.out.println("Tente de novo!");
			}
			while (vt2 == true){
				System.out.println("Deseja voltar para o menu?[s/n]");
				vt2 = false;
				vt = sc.next().charAt(0);
				if(vt == 'n' || vt == 'N') {
					System.out.println("Saindo...");
					System.out.println("Tenha um Bom Dia!");
					}else{
						if(vt == 'S' || vt == 's') {
							vt = 's';
						}else {
						if(vt != 's' || vt != 'S' || vt != 'n' || vt != 'N') {
							vt2 = true;
							System.out.println("Operacao Invalida!");
							System.out.println("Tente De novo!");
						}
					}
				}
			}
		}while(vt == 's' || vt == 'S');
	}
}