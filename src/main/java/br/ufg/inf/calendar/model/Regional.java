package br.ufg.inf.calendar.model;

public enum Regional {

    CATALAO(1, "Catalão"),
    GOIANIA(2, "Goiânia"),
    GOIAS(3, "Goiás"),
    JATAI(4, "Jataí"),
    TODAS(5, "Todas");

    private final int id;

    private final String description;

    Regional(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
