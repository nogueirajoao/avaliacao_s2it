package avaliacaos2;

public class BinaryTree {
	
	int valor;
	
	BinaryTree left;
	
	BinaryTree right;
	
	public BinaryTree(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
	
	public int soma(final BinaryTree tree) {
		
		if (tree == null) return 0;
		
		final int left = soma(tree.getLeft());
		final int right = soma(tree.getRight());
		
		return tree.valor + left + right;
	}
	
}
