import java.util.*;

public class Lista<T> {
	private List<T> array;
		
	public Lista() {
		array = new ArrayList<T>();
	}

	public List<T> getList(){
		return array;
	}
	
	public void adicionar(T elemento) {
		array.add(elemento);
	}

	public void adicionarIndex(int index, T elemento){
		array.add(index, elemento);
	}
	
	public void remover(T elemento) {
		array.remove(elemento);
	}

	public void removerIndex(int index) {
		array.remove(index);
	}

	public T buscaFim() {
		return array.get(array.size() - 1);
	}
	
	public T buscaInicio() {
		return array.get(0);
	}

	public T buscaIndex(int index) {
		return array.get(index);
	}

	public void exibirMap(Map<Integer, String> p) {
		Iterator<Integer> it = p.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(p.get(it.next()));
		}
	}

	public int tamanho(){
		return array.size();
	}

	public void exibir(){
		for(T elemento : array){
			System.out.println(elemento);
		}
	}
}