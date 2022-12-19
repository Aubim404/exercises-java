import java.util.Scanner;
public class MediaTurma
{
   public static void main (String args[])
   {
      final int ALUNOS = 5;
      final int PROVAS = 2;
      final int MEDIAS = 5;
      
      int lin, col;
      double mediaTurma = 0;
      
      double notas[][] = new double[ALUNOS][PROVAS];
      double media[] = new double[ALUNOS];
      Scanner entrada = new Scanner(System.in);
      

     //leitura das notas      
      for(lin = 0; lin < ALUNOS; lin++)
      {
         System.out.printf("\nDigite as notas do %do aluno: ", lin+1);
         for(col = 0; col < PROVAS; col++)
         {
            notas[lin][col] = entrada.nextDouble();
            media[lin] += notas[lin][col];
            
          }
          media[lin] = media[lin]/PROVAS;
          mediaTurma += media[lin];
      }
      
      mediaTurma = mediaTurma/ALUNOS;
      
      System.out.println();
      
      //exibição
      System.out.println("Notas e Media");
      
      for(lin = 0; lin < ALUNOS; lin++)
      {
         
         System.out.printf("\nAluno %d: ", lin+1);
         for(col = 0; col < PROVAS; col++)
         {
            System.out.printf("%2.2f  ", notas[lin][col]);
         }
         System.out.printf(" - Media %2.2f", media[lin]);
          if(media[lin] < mediaTurma)
            System.out.printf(" - Abaixo da media");
          if(media[lin] > mediaTurma)
            System.out.printf(" - Acima da media");
          if(media[lin] == mediaTurma)
            System.out.printf(" - Dentro da media");

        }
       System.out.printf("\n\nMedia da Turma %2.2f", mediaTurma);
   }
}