package br.ufg.inf.calendar.view;

import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;

public class MainScreen {

    public static void printScreen() {
        TextIO textIO = TextIoFactory.getTextIO();

        MainScreenOption option = textIO.newEnumInputReader(MainScreenOption.class)
                                    .read("Selecione uma opção");


    }
}
