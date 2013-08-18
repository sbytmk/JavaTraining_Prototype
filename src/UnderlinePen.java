import Framewok.Product;

public class UnderlinePen implements Product {
	private char ulchar;

	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;

	}

	public void use(String s) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int length = s.getBytes().length;
		System.out.println("|" + s + "|");
		System.out.print("");
		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		System.out.println("");
	}

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return p;
	}
}
