package iterator;

import java.util.Iterator;

public class ClientMenu {

	public static void main(String[] args) {

		Menu[] itens = new Menu[4];

		itens[0] = new Menu("Menu 1");
		itens[1] = new Menu("Menu 2");
		itens[2] = new Menu("Menu 3");
		itens[3] = new Menu("Menu 4");

		Iterator menuIterator = new MenuIterator(itens);

		while (menuIterator.hasNext()) {
			Menu item = (Menu) menuIterator.next();
			System.out.println(item.nome);

			
		}

	}

}
