import java.io.*;
import java.nio.charset.*;

class MyIO {

   private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in, Charset.forName("ISO-8859-1")));
   private static String charset = "ISO-8859-1";

   public static void setCharset(String charset_){
      charset = charset_;
      in = new BufferedReader(new InputStreamReader(System.in, Charset.forName(charset)));
   }

   public static void print(){
   }

   public static void print(int x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }
   
   public static void print(float x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }
   
   public static void print(double x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void print(String x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void print(boolean x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void print(char x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(){
   }

   public static void println(int x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(float x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }
   
   public static void println(double x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(String x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(boolean x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(char x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void printf(String formato, double x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.printf(formato, x);// "%.2f"
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static double readDouble(){
      double d = -1;
      try{
         d = Double.parseDouble(readString().trim().replace(",","."));
      }catch(Exception e){}
      return d;
   }

   public static double readDouble(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readDouble();
   }

   public static float readFloat(){
      return (float) readDouble();
   }

   public static float readFloat(String str){
      return (float) readDouble(str);
   }

   public static int readInt(){
      int i = -1;
      try{
         i = Integer.parseInt(readString().trim());
      }catch(Exception e){}
      return i;
   }

   public static int readInt(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readInt();
   }

   public static String readString(){
      String s = "";
      char tmp;
      try{
         do{
            tmp = (char)in.read();
            if(tmp != '\n' && tmp != ' ' && tmp != 13){
               s += tmp;
            }
         }while(tmp != '\n' && tmp != ' ');
      }catch(IOException ioe){
         System.out.println("lerPalavra: " + ioe.getMessage());
      }
      return s;
   }

   public static String readString(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readString();
   }

   public static String readLine(){
      String s = "";
      char tmp;
      try{
         do{
            tmp = (char)in.read();
            if(tmp != '\n' && tmp != 13){
               s += tmp;
            }
         }while(tmp != '\n');
      }catch(IOException ioe){
         System.out.println("lerPalavra: " + ioe.getMessage());
      }
      return s;
   }

   public static String readLine(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readLine();
   }

   public static char readChar(){
      char resp = ' ';
      try{
         resp  = (char)in.read();
      }catch(Exception e){}
      return resp;
   }

   public static char readChar(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readChar();
   }

   public static boolean readBoolean(){
      boolean resp = false;
      String str = "";

      try{
         str = readString();
      }catch(Exception e){}

      if(str.equals("true") || str.equals("TRUE") || str.equals("t") || str.equals("1") || 
            str.equals("verdadeiro") || str.equals("VERDADEIRO") || str.equals("V")){
         resp = true;
            }

      return resp;
   }

   public static boolean readBoolean(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readBoolean();
   }

   public static void pause(){
      try{
         in.read();
      }catch(Exception e){}
   }

   public static void pause(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      pause();
   }
   /*----------------BOLHA----------------
    public static void ordenacaoBolha(int[] vetor) 
    {
        int n = vetor.length;
        boolean swapped; // Flag para indicar se houve troca em uma iteração
        // Loop externo para percorrer o vetor
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Inicializa a flag como falso para esta iteração

            // Loop interno para comparar pares adjacentes e trocar, se necessário
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca os elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    swapped = true; // Define a flag como true, indicando que ocorreu uma troca
                }
            }
            // Se nenhuma troca ocorreu durante uma iteração, o vetor está ordenado e
            // podemos sair do loop
            if (!swapped) {
                break;
            }
        }
    }
   
---------INSERÇÃO----------------
public static void ordenacaoInsercao(int[] vetor)
    {
        for(int i = 1; i < vetor.length; i++)
        {
            int temp = vetor[i];
            int j = i - 1;

            while(j >= 0 && vetor[j]>temp)
            {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = temp;
        }
    }

-----------------SELEÇÃO----------------
public static void ordenacaoSelecao(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int menor = i;

            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }

            int temp = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = temp;
        }
    }
-------------------QUICK-------------------
private static void ordenaQuick(int[] array, int baixo, int alto) {
        if (baixo < alto) {
            int pivô = particionar(array, baixo, alto);
            ordenaQuick(array, baixo, pivô - 1);
            ordenaQuick(array, pivô + 1, alto);
        }
    }

    private static int particionar(int[] array, int baixo, int alto) {
        int pivô = array[alto];
        int i = baixo - 1;

        for (int j = baixo; j < alto; j++) {
            if (array[j] < pivô) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[alto];
        array[alto] = temp;

        return i + 1;
    }
-------------------MERGE-------------------
public static void ordenaMerge(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            ordenaMerge(array, inicio, meio);
            ordenaMerge(array, meio + 1, fim);
            merge(array, inicio, meio, fim);
        }
    }
    public static void merge(int[] array, int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        // Cria arrays temporários
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copia os dados para os arrays temporários L[] e R[]
        for (int i = 0; i < n1; ++i)
            L[i] = array[inicio + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[meio + 1 + j];

        // Mescla os arrays temporários de volta em array[inicio..fim]
        int i = 0, j = 0;
        int k = inicio;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        // Copia os elementos restantes de L[], se houver
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        // Copia os elementos restantes de R[], se houver
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;}}
------------HEAP----------------
public static void ordenaHeap(int[] vetor) {
        int n = vetor.length;
        // Construir heap (reorganizar array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(vetor, n, i);
        // Um por um extrair um elemento do heap
        for (int i=n-1; i>=0; i--)
        {
            // Move o atual root para o fim
            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;
            // chama max heapify no heap reduzido
            heapify(vetor, i, 0);
        }
    }
    public static void heapify(int[] vetor, int n, int i) {
        int maior = i;
        int esq = 2 * i + 1;
        int dir = 2 * i + 2;
        if (esq < n && vetor[esq] > vetor[maior])
            maior = esq;
        // Se o filho da direita for maior que o maior até agora
        if (dir < n && vetor[dir] > vetor[maior])
            maior = dir;
        // Se o maior não for a raiz
        if (maior != i) {
            int temp = vetor[i];
            vetor[i] = vetor[maior];
            vetor[maior] = temp;
            // Reorganiza o heap afetado
            heapify(vetor, n, maior);
        }
    }
----------------------------------------------
--------------------QUESTÔES------------------
batuke->
import java.util.Scanner;
import java.util.ArrayList;
class Celula{
    int pos;
    Celula esq,dir,inf,sup;
    public Celula()
    {
        this.pos = 0;
        this.esq = this.dir = this.inf = this.sup = null;
    }
    public Celula(int x)
    {
        this.pos = x;
        this.esq = this.dir= this.inf= this.sup = null;
    }
}
class Matriz
{
    private Celula inicio;
    private int linha,coluna;
    public Matriz(int linhas, int colunas)
    {
        int count = 1;
        inicio = new Celula(count++);
        this.linha = linhas;
        this.coluna = colunas;
        Celula i = inicio;
        for(int j = 1; j<this.coluna; j++)
        {
            Celula nova = new Celula(count++);
            i.dir = nova;
            nova.esq = i;
            i = nova;
        }
        Celula linhaAnterior = inicio;
        for(int k = 1; k < this.linha; k++)
        {
            Celula novaLinha = new Celula(count++);
            linhaAnterior.inf = novaLinha;
            novaLinha.sup = linhaAnterior;
            Celula celulaAtualLinha = novaLinha;
            Celula celulaAcima = linhaAnterior;
            for(int j = 1; j<this.coluna;j++){
                Celula novaCelula = new Celula(count++);
                celulaAtualLinha.dir = novaCelula;
                novaCelula.esq = celulaAtualLinha;
                celulaAcima = celulaAcima.dir;
                celulaAcima.inf = novaCelula;
                novaCelula.sup = celulaAcima;
                celulaAtualLinha = novaCelula;
            }
            linhaAnterior=novaLinha;
        }
    }
    public void caminhar(int lin, int col){
        int s = 0;
        ArrayList<Integer> percorridos= new ArrayList<Integer>();
        int count = 0;
        Celula aux = inicio;
        //Setar posicao inicial
        for(int i = 0; i< lin; i++){
            aux = aux.inf;
        }
        for(int j = 0; j< col; j++){
            aux = aux.dir;
        }
        int passos = 1; 
        int qtd = 0;
        percorridos.add(aux.pos);
        qtd++;
        System.out.print(aux.pos+" ");
        while(qtd<this.linha*this.coluna){
           for(int i = 0; i< passos; i++){
            aux = aux.dir;
            System.out.print(aux.pos+" ");
            if(!percorridos.contains(aux.pos)){
                percorridos.add(aux.pos);
            }
            qtd++;
           }
           for(int i = 0; i< passos; i++){
            aux = aux.inf;
            System.out.print(aux.pos+" ");
            if(!percorridos.contains(aux.pos)){
                percorridos.add(aux.pos);
            }
            qtd++;
           }
           passos++;
           for(int i = 0; i< passos; i++){
            aux = aux.esq;
            System.out.print(aux.pos+" ");
            if(!percorridos.contains(aux.pos)){
                percorridos.add(aux.pos);
            }
            qtd++;
            if(qtd == (this.linha*this.coluna)){
                break;
               }
           }          
           if(qtd == (this.linha*this.coluna)){
            break;
           }
           for(int i = 0; i< passos; i++){
            aux = aux.sup;
            System.out.print(aux.pos+" ");
            if(!percorridos.contains(aux.pos)){
                percorridos.add(aux.pos);
            } 
            qtd++;
           }
           passos++;
        }
        System.out.println("\n" +qtd);
    }
}
public class batuke{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lin = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        Matriz vizinhanca = new Matriz(lin,lin);
        vizinhanca.caminhar(x, y);
        sc.close();
    }
}
-----------------------------------------------------
Van de alunos->
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
typedef struct
{
    char nome[101];
    char regiao;
    int custo;
} Alunos;
int main()
{   
    int q; 
    scanf("%d", &q);
    Alunos pessoa[q];  
    for(int i = 0; i < q; i++)
    {
        scanf("%s %c %d", pessoa[i].nome, &pessoa[i].regiao, &pessoa[i].custo); 
    }   
    char nomes[q][101];

    //ordenar primeiro por custo, região (L, N, O, S)nesta ordem, e por fim nome.
    //bubbleSort O(n^2) no pior caso e O(n) no melhor caso
    for(int i = 0; i < q; i++)
    {
        for(int j = i+1; j < q; j++)
        {
            if(pessoa[i].custo > pessoa[j].custo)
            {
                Alunos temp = pessoa[i];
                pessoa[i] = pessoa[j];
                pessoa[j] = temp;
            }
            else if(pessoa[i].custo == pessoa[j].custo)
            {
                if(pessoa[i].regiao > pessoa[j].regiao)
                {
                    Alunos temp = pessoa[i];
                    pessoa[i] = pessoa[j];
                    pessoa[j] = temp;
                }
                else if(pessoa[i].regiao == pessoa[j].regiao)
                {
                    if(strcmp(pessoa[i].nome, pessoa[j].nome) > 0)
                    {
                        Alunos temp = pessoa[i];
                        pessoa[i] = pessoa[j];
                        pessoa[j] = temp;
                    }
                }
            }
        }
    }
    printf("------------------------------------\n");
    for(int i = 0; i < q; i++)
    {
        printf("%s\n", pessoa[i].nome);
    }
    return 0;
}
-----------------------------------------------------
OrdenaStringsPorTamanho->
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class OrdenaStringsPorTamanho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < N; i++) {
            String linha = scanner.nextLine();
            String[] strings = linha.split(" ");
            // Ordenar as strings pelo comprimento, preservando a ordem original em caso de empate
            Arrays.sort(strings, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return Integer.compare(s2.length(), s1.length()); // Inverter a ordem para decrescente
                }
            });
            // Imprime as strings ordenadas, separadas por um espaço
            for (int j = 0; j < strings.length; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(strings[j]);
            }
            System.out.println(); // Nova linha após cada caso de teste
        }
        scanner.close();
    }
}
-----------------------------------------------------
Noiva das 00:00
import java.util.*;
import java.io.*;
public class Avistamento {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = reader.readLine().split(" ");
        int P = Integer.parseInt(firstLine[0]);
        int Q = Integer.parseInt(firstLine[1]);
        List<Relato> relatos = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            String[] line = reader.readLine().split(" ");
            String H = line[0];
            String N = line[1];
            int hour = Integer.parseInt(H.split(":")[0]);
            int minute = Integer.parseInt(H.split(":")[1]);
            // Convert time to total minutes
            int totalMinutes;
            if (hour == 23) {
                totalMinutes = hour * 60 + minute - 1440;  // 23:xx is treated as negative minutes before 00:00
            } else {
                totalMinutes = hour * 60 + minute;
            }
            if (-P <= totalMinutes && totalMinutes <= P) {
                relatos.add(new Relato(totalMinutes, i, N));
            }
        }
        // Sort the valid entries
        Collections.sort(relatos);
        // Print the result
        for (Relato relato : relatos) {
            System.out.println(relato.nome);
        }
    }
    static class Relato implements Comparable<Relato> {
        int totalMinutes;
        int order;
        String nome;
        Relato(int totalMinutes, int order, String nome) {
            this.totalMinutes = totalMinutes;
            this.order = order;
            this.nome = nome;
        }
        @Override
        public int compareTo(Relato other) {
            if (this.totalMinutes != other.totalMinutes) {
                return Integer.compare(this.totalMinutes, other.totalMinutes);
            } else {
                return Integer.compare(this.order, other.order);
            }
        }
    }
}
-----------------------------------------------------
Lista telefonica->
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            int N = Integer.parseInt(line);
            String[] phones = new String[N];
            for (int i = 0; i < N; i++) {
                phones[i] = reader.readLine();
            }
            // Sort the array of phone numbers
            Arrays.sort(phones);
            int totalEconomy = 0;
            for (int i = 0; i < N - 1; i++) {
                totalEconomy += commonPrefixLength(phones[i], phones[i + 1]);
            }
            System.out.println(totalEconomy);
        }
    }
    // Function to find the length of the common prefix between two strings
    public static int commonPrefixLength(String a, String b) {
        int minLength = Math.min(a.length(), b.length());
        int i = 0;

        while (i < minLength && a.charAt(i) == b.charAt(i)) {
            i++;
        }
        return i;
    }
}
-----------------------------------------------------
soma das diagonais de uma matriz->
import java.util.Random;
import java.util.Scanner;

public class XdoTesouro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Digite o número de linhas e colunas da matriz: ");
        int n = sc.nextInt();
        // Criar a matriz flexível
        int[][] matriz = new int[n][n];
        // Preencher a matriz com números aleatórios e imprimir a matriz
        System.out.println("Matriz gerada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(100); // números aleatórios entre 0 e 99
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        // Somar os elementos das diagonais
        for (int i = 0; i < n; i++) {
            somaDiagonalPrincipal += matriz[i][i]; // Diagonal principal (\)
            somaDiagonalSecundaria += matriz[i][n - 1 - i]; // Diagonal secundária (/)
        }
        // Imprimir a soma das diagonais
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);
        System.out.println("Soma total das duas diagonais: " + (somaDiagonalPrincipal + somaDiagonalSecundaria));
        sc.close();
    }
}
---------------------------------------------------------
fabrica do noel->
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
// Definindo uma estrutura para mapeamento de traduções
typedef struct TranslationMapper {
    char *idioma;
    char *saudacao;
} Mapper;
// Função que mapeia o país (idioma) para a saudação correspondente
char* mapearPaisParaSaudacao(Mapper* traducoes, int N, char *pais) {
    for(int i = 0; i < N; i++) {
        if(strcmp(pais, traducoes[i].idioma) == 0) {
            return traducoes[i].saudacao;
        }
    }
    return NULL;
}
void lerTraducoes(Mapper* traducoes, int N);
void liberarTraducoes(Mapper* traducoes, int N);
int main() {
    int N;
    scanf("%d", &N); // Lê o número de traduções
    Mapper traducoes[N]; // Cria um array de estruturas para armazenar as traduções
    lerTraducoes(traducoes, N); // Lê as traduções
    int M;
    scanf("%d", &M); // Lê o número de saudações a serem exibidas
    while (M--) {
        char nome[31];
        char pais[31];
        scanf(" %[^\n]", nome); // Lê o nome
        scanf("%s", pais); // Lê o país (idioma)
        char* saudacao = mapearPaisParaSaudacao(traducoes, N, pais); // Mapeia o país para a saudação correspondente
        printf("%s\n", nome); // Exibe o nome
        printf("%s\n", saudacao); // Exibe a saudação
    }
    liberarTraducoes(traducoes, N); // Libera a memória alocada para as traduções
    return 0;
}
// Função que lê as traduções da entrada padrão
void lerTraducoes(Mapper* traducoes, int N) {
    for(int i = 0; i < N; i++) {   
        char idioma[31], saudacao[31];
        scanf("%s", idioma); // Lê o idioma
        scanf(" %[^\n]", saudacao); // Lê a saudação
        
        traducoes[i].idioma = malloc(31 * sizeof(char)); // Aloca memória para o idioma
        strcpy(traducoes[i].idioma, idioma); // Copia o idioma para a estrutura
        
        traducoes[i].saudacao = malloc(31 * sizeof(char)); // Aloca memória para a saudação
        strcpy(traducoes[i].saudacao, saudacao); // Copia a saudação para a estrutura
    }
}
// Função que libera a memória alocada para as traduções
void liberarTraducoes(Mapper* traducoes, int N) {
    for (int i = 0; i < N; i++) {
        free(traducoes[i].idioma); // Libera a memória do idioma
        free(traducoes[i].saudacao); // Libera a memória da saudação
    }
}
---------------------------------------------------------
seca no brasil-> 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Residency {
    private int population;
    private int consumption;

    public Residency(int population, int consumption) {
        this.population = population;
        this.consumption = consumption;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

 // ---------------- CONSUMPTION PER PERSON -----------------------------
    public int consumptionPerPerson(){
        return consumption/population;
    }
}

class City {
    private Residency[] residences;

    public City(Residency[] residences){
        this.residences = residences;
    }

    public Residency[] getResidences() {
        return residences;
    }

    public void setResidences(Residency[] residences) {
        this.residences = residences;
    }

  // -------------------- AVERAGE CONSUMPTION -------------------------
    public Double averageConsumption() {
        int numPeople = 0;
        int consumption = 0;
        for(Residency res : residences){
            numPeople += res.getPopulation();
            consumption += res.getConsumption();
        }
        return (double) consumption/numPeople;
    }

  // -------------------- SORT IN ASCENDING ORDER OF CONSUMPTION ----------------
    private void insertionSort() {
        int tam = residences.length;
        for(int i = 1; i < tam; i++){
            Residency piv = residences[i];
            int j = i-1;
            while((j >= 0) && piv.consumptionPerPerson() < residences[j].consumptionPerPerson()){
                residences[j+1] = residences[j];
                j--;
            }
            residences[j+1] = piv;
        }
    }

  // -------------------- LIST CONSUMPTION SORTED -------------------------
    public void showConsumption(){
        insertionSort();
        for(Residency res : residences){
            System.out.print(res.getPopulation()+"-"+res.consumptionPerPerson()+" ");
        }
        System.out.println();
    }
    
}


class Drought_1023 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<City> cities = new ArrayList<>();

        int n = sc.nextInt();
        while (n != 0) 
        {
            Residency[] residences = new Residency[n];

            for(int i = 0; i < n; i++) {
                residences[i] = new Residency(sc.nextInt(), sc.nextInt());
            }

            cities.add(new City(residences));

            n = sc.nextInt();
        }

        int cityNumber = 1;
        for(City city: cities){
            System.out.println("Cidade# "+cityNumber+":");
            city.showConsumption();
            System.out.println("Consumo medio: "+ city.averageConsumption()+" m3.");
        }

        sc.close();
    }
}
---------------------------------------------------------
procurando novos seguidores->
#include <stdio.h>
#include <stdlib.h>

#define MONTH_DAYS 30

typedef struct Cell {
    int element;
    struct Cell* next;
}Cell;
Cell* createCell(int x){
    Cell* new = malloc(sizeof(Cell));
    new->element = x;
    new->next = NULL;
    return new;
}
void show(Cell* head){
    Cell* i = head->next;
    while (i != NULL)
    {
        printf("%d ", i->element);
        i = i->next;
    }
    printf("\n");
}
void add(Cell** tail, int num){
    (*tail)->next = createCell(num);
    *(tail) = (*tail)->next;
}
int withdraw(Cell** head){
    Cell* tmp = (*head)->next;
    int res = tmp->element;
    (*head)->next = (*head)->next->next;
    tmp->next = NULL;
    free(tmp);
    return res;
}
// -----------------------------------------------------------------------------------------
int average(Cell* day){
    int sum = 0, avg;
    for(int i = 0; i < MONTH_DAYS; i++, day = day->next){
        sum += day->element;
    }
    avg = sum / MONTH_DAYS;
    return avg;
}
int daysRequied(int current_followers, int goal_followers, Cell** head, Cell** tail) {
    int past_days = 0;
    while(current_followers < goal_followers) {
        int curr_avg = average((*head)->next);
        current_followers += curr_avg;
        add(tail, curr_avg);
        withdraw(head);
        past_days++;
    }
    return past_days;
}
int main(){
    int N, M;
    scanf("%d %d", &N, &M);
    Cell* head = malloc(sizeof(Cell));
    head->next = NULL;
    Cell* currDay = head;
    for(int i = 0; i < MONTH_DAYS; i++)
    {
        int subs;
        scanf("%d", &subs);

        add(&currDay, subs);
    }

    printf("%d\n", daysRequied(N, M, &head, &currDay));
    return 0;
}
*/
}
