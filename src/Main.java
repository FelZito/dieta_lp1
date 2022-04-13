import atividades.*;
import entidades.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Atleta atleta = new Atleta();
        ArrayList<Atividades> atividade = new ArrayList<>();
        int[] data = new int[3];
        //Informações do atleta
        System.out.println("Informe seu nome: ");

        while (true)
            try {
                atleta.setNome(leitor.nextLine());
                // Verifica se o usuário informou um número neste campo
                if (!atleta.validaNome(atleta.getNome())){
                    System.out.println("Erro! Não é permitido números neste campo.");
                    System.out.println("Informe seu nome corretamente: ");
                }
                else {
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println("Informe um valor válido: ");
                leitor.nextLine();
            }

        System.out.println("Informe sua idade: ");
        //Checa se o usuário informou um valor correto
        while (true) {
            try {
                 atleta.setIdade(leitor.nextInt());
                 if (atleta.getIdade() < 1) {
                     System.out.println("Erro! Valor inválido.");
                     System.out.println("Informe sua idade: ");
                 } else {
                     break;
                 }
                 } catch (InputMismatchException e) {
                    System.out.println("Erro! Valor inválido!");
                    System.out.println("Informe sua idade: ");
                    leitor.nextLine();
            }
        }

        System.out.println("Informe sua altura: ");
        //Checa se o usuário informou um valor correto
        while (true) {
            try {
                atleta.setAltura(leitor.nextFloat());
                if (atleta.getAltura() < 1.0f) {
                    System.out.println("Erro! Valor inválido");
                    System.out.println("Informe sua altura: ");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro! Valor inválido!");
                System.out.println("Informe sua altura: ");
                leitor.nextLine();
            }
        }

        System.out.println("Informe seu peso: ");
        //Checa se o usuário informou um valor correto
        while (true) {
            try {
                atleta.setPeso(leitor.nextFloat());
                if (atleta.getPeso() < 1) {
                    System.out.println("Erro! Valor inválido");
                    System.out.println("Informe seu peso: ");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro! Valor inválido!");
                System.out.println("Informe seu peso: ");
                leitor.nextLine();
            }
        }

        System.out.println("Informe sua % de gordura: ");
        //Checa se o usuário informou um valor correto
        while (true) {
            try {
                atleta.setGordura(leitor.nextFloat());
                if (atleta.getGordura() < 1) {
                    System.out.println("Erro! Valor inválido");
                    System.out.println("Informe seu peso: ");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro! Valor inválido!");
                System.out.println("Informe seu % de gordura: ");
                leitor.nextLine();
            }
        }

        System.out.println(atleta);
        //Menu
        System.out.print("Informe o dia: \n");
        while (true) {
            try {
                data[0] = leitor.nextInt();
                if (data[0] > 0 && data[0] < 32) {
                    break;
                } else {
                    System.out.println("Informe um dia correto: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Informe um dia correto: ");
                leitor.nextLine();
            }
        }

        System.out.println("Informe o mês: ");
        while (true) {
            try {
                data[1] = leitor.nextInt();
                if (data[1] > 0 && data[1] < 13) {
                    break;
                } else {
                    System.out.println("Informe um mês correto!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Informe um mês correto: ");
                leitor.nextLine();
            }
        }

        System.out.println("Informe o ano: ");
        while (true) {
            try {
                data[2] = leitor.nextInt();
                if (data[2] > 2021) {
                    break;
                } else {
                    System.out.println("Informe um ano correto:");
                }
            } catch (InputMismatchException e) {
                System.out.println("Informe um ano correto:");
                leitor.nextLine();
            }
        }

        int op = -1;
        while (true) {
            System.out.println("|| Menu de atividades || \n" +
                    "1 - Boxe || 2 - Corrida || 3 - Ciclismo \n" +
                    "4 - Futebol || 5 - Musculação || 6 - Natação \n" +
                    "7 - Basquete || 0 - Gerar relatório do dia");
            //Checa se o usuário informou uma opção correta
            System.out.println("Informe a opção desejada: ");

            while (true) {
                try {
                    op = leitor.nextInt();
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Erro! Valor inválido!");
                    System.out.println("Informe uma opção válida: ");
                    leitor.nextLine();
                }
            }
            switch (op) {
                case 1:
                    Boxe boxe = new Boxe();
                    System.out.println("Informe o tempo em minutos que durou essa atividade: ");
                    //Checa se o usuário informou o tempo em minutos (como um inteiro)
                    while (true) {
                        try {
                            boxe.setDuracao(leitor.nextInt());
                            if (boxe.getDuracao() > 0) {
                                break;
                            } else {
                                System.out.println("Informe o tempo correto, em minutos: ");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Informe o tempo correto, em minutos: ");
                            leitor.nextLine();
                        }
                    }
                    atividade.add(boxe);
                    break;

                case 2:
                    Corrida corrida = new Corrida();
                    System.out.println("Informe o tempo em minutos que durou essa atividade: ");
                    //Checa se o usuário informou o tempo em minutos (como um inteiro)
                    while (true) {
                        try {
                            corrida.setDuracao(leitor.nextInt());
                            if (corrida.getDuracao() > 0) {
                                break;
                            } else {
                                System.out.println("Informe o tempo correto, em minutos: ");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Informe o tempo correto, em minutos: ");
                            leitor.nextLine();
                        }
                    }
                    atividade.add(corrida);
                    break;

                case 3:
                    Ciclismo ciclismo = new Ciclismo();
                    System.out.println("Informe o tempo em minutos que durou essa atividade: ");
                    //Checa se o usuário informou o tempo em minutos (como um inteiro)
                    while (true) {
                        try {
                            ciclismo.setDuracao(leitor.nextInt());
                            if (ciclismo.getDuracao() > 0) {
                                break;
                            } else {
                                System.out.println("Informe o tempo correto, em minutos: ");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Informe o tempo correto, em minutos: ");
                            leitor.nextLine();
                        }
                    }
                    atividade.add(ciclismo);
                    break;

                case 4:
                    Futebol futebol = new Futebol();
                    System.out.println("Informe o tempo em minutos que durou essa atividade: ");
                    //Checa se o usuário informou o tempo em minutos (como um inteiro)
                    while (true) {
                        try {
                            futebol.setDuracao(leitor.nextInt());
                            if (futebol.getDuracao() > 0) {
                                break;
                            } else {
                                System.out.println("Informe o tempo correto, em minutos: ");
                            }
                        } catch (InputMismatchException e) {
                            //Caso o usuário informe uma string, o programa não morre!
                            System.out.println("Informe o tempo correto, em minutos: ");
                            leitor.nextLine();
                        }
                    }
                    atividade.add(futebol);
                    break;

                case 5:
                    Musculacao musculacao = new Musculacao();
                    System.out.println("Informe o tempo em minutos que durou essa atividade: ");
                    //Checa se o usuário informou o tempo em minutos (como um inteiro)
                    while (true) {
                        try {
                            musculacao.setDuracao(leitor.nextInt());
                            if (musculacao.getDuracao() > 0) {
                                break;
                            } else {
                                System.out.println("Informe o tempo correto, em minutos: ");
                            }
                        } catch (InputMismatchException e) {
                            //Caso o usuário informe uma string, o programa não morre!
                            System.out.println("Informe o tempo correto, em minutos: ");
                            leitor.nextLine();
                        }
                    }
                    atividade.add(musculacao);
                    break;

                case 6:
                    Natacao natacao = new Natacao();
                    System.out.println("Informe o tempo em minutos que durou essa atividade: ");
                    //Checa se o usuário informou o tempo em minutos (como um inteiro)
                    while (true) {
                        try {
                            natacao.setDuracao(leitor.nextInt());
                            if (natacao.getDuracao() > 0) {
                                break;
                            } else {
                                System.out.println("Informe o tempo correto, em minutos: ");
                            }
                        } catch (InputMismatchException e) {
                            //Caso o usuário informe uma string, o programa não morre!
                            System.out.println("Informe o tempo correto, em minutos: ");
                            leitor.nextLine();
                        }
                    }
                    atividade.add(natacao);
                    break;

                case 7:
                    Basquete basquete = new Basquete();
                    System.out.println("Informe o tempo em minutos que durou essa atividade: ");
                    //Checa se o usuário informou o tempo em minutos (como um inteiro)
                    while (true) {
                        try {
                            basquete.setDuracao(leitor.nextInt());
                            if (basquete.getDuracao() > 0) {
                                break;
                            } else {
                                System.out.println("Informe o tempo correto, em minutos: ");
                            }
                        } catch (InputMismatchException e) {
                            //Caso o usuário informe uma string, o programa não morre!
                            System.out.println("Informe o tempo correto, em minutos: ");
                            leitor.nextLine();
                        }
                    }
                    atividade.add(basquete);
                    break;

                case 0:
                    //Checa se existe alguma atividade
                    if (atividade.size() == 0) {
                        System.out.println("Erro! Nenhuma atividade cadastrada!");
                        break;
                    }

                    int soma = 0;
                    int tempo = 0;
                    //Gera o relatório
                    System.out.println("Relatório do dia " + data[0] + "/" + data[1] + "/" + data[2]);
                    for (Atividades a : atividade) {
                           System.out.println(a);
                           soma += a.getGastocaloricoTotal();
                           tempo += a.getDuracao();
                       }
                    System.out.println("Gasto calórico total: " + soma + "kcal");

                    System.out.println("Duração total das atividades: " + tempo + " minutos");
                    System.out.println("Relatório gerado com sucesso!");
                    //Limpa/Cria um novo Arraylist
                    System.out.println("1 - Iniciar um novo relatório || 2 - Fechar programa");

                    int opc = -1;
                    while (true){
                        try {
                            opc = leitor.nextInt();
                            break;
                        }catch (InputMismatchException e){
                            System.out.println("Erro! Valor inválido.");
                            System.out.println("Informe uma opção válida: ");
                            leitor.nextLine();
                        }
                    }

                    switch (opc){
                        case 1:
                            atividade = new ArrayList<>();

                            //Inicia um novo dia, pedindo pro usuário setar dia, mês e ano.
                            System.out.println("Informe o dia: ");
                            //Checa se o usuário informou um valor correto.
                            while (true) {
                                try {
                                    data[0] = leitor.nextInt();
                                    if (data[0] > 0 && data[0] < 32) {
                                        break;
                                    } else {
                                        System.out.println("Informe um dia correto: ");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Informe um dia correto: ");
                                    leitor.nextLine();
                                }
                            }

                            System.out.println("Informe o mês: ");
                            //Checa se o usuário informou um valor correto.
                            while (true) {
                                try {
                                    data[1] = leitor.nextInt();
                                    if (data[1] > 0 && data[1] < 13) {
                                        break;
                                    } else {
                                        System.out.println("Informe um mês correto: ");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Informe um mês correto: ");
                                    leitor.nextLine();
                                }
                            }

                            System.out.println("Informe o ano: ");
                            //Checa se o usuário informou um valor correto.
                            while (true) {
                                try {
                                    data[2] = leitor.nextInt();
                                    if (data[2] > 2021) {
                                        break;
                                    } else {
                                        System.out.println("Informe um ano correto:");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Informe um ano correto:");
                                    leitor.nextLine();
                                }
                            }
                        break;
                        case 2:
                            System.out.println("Encerrando programa...");
                            //Encerra o programa aqui.
                            System.exit(1);

                        default:
                            System.out.println("Informe uma opção válida: ");
                            break;
                    }
                    break;
                default:
                    System.out.println("Erro! Valor inválido.");
             }
        }
    }
}

