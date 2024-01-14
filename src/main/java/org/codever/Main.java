package org.codever;

import org.codever.model.Tabuleiro;
import org.codever.view.TabuleiroConsole;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6,6,3);

        new TabuleiroConsole(tabuleiro);

        System.out.println(tabuleiro);
    }
}