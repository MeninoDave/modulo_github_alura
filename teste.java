public class teste{

	public static void main(String[] args){
		System.out.println("Ola mundo!\n");
		System.out.println("Digite um número: \t");
		int num=MyIO.readInt();
		for(int i=0,j=0,k=1;i<num;i++,j=k,k+=j){
			System.out.println(k+"\n");
		}
		System.out.println("Tchau Mundo!\n");
	}
}

