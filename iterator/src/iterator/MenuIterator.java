package iterator;

import java.util.Iterator;

public class MenuIterator implements Iterator {

	Menu[] itens;
	int posicao = 0;

	public MenuIterator(Menu[] itens) {
		this.itens = itens;
	}

	@Override
	public boolean hasNext() {
		if (posicao >= itens.length || itens[posicao] == null) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public Object next() {
		Menu menuItem = itens[posicao];
		posicao++;
		return menuItem;

	}
}
