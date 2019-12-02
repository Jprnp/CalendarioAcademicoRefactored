package br.ufg.inf.calendar.view;

public enum MainScreenOption {

    VIEW("Exibir Calendário"),
    CREATE("Criar Evento"),
    SEARCH("Buscar Evento"),
    EXIT("Sair");

    private final String description;

    MainScreenOption(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
