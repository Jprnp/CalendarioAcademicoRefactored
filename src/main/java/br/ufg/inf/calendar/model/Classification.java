package br.ufg.inf.calendar.model;

public enum Classification {

    NATIONAL_HOLIDAY(1, "Feriado Nacional"),
    CITY_HOLIDAY(2, "Feriado Municipal"),
    FACULTATIVE_POINT(3, "Ponto Facultativo"),
    ACADEMIC_RECESS(4, "Recesso Acadêmico"),
    EVENT(5, "Evento");

    private final String description;

    private final int id;

    Classification(int id, String description) {
        this.description = description;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }
}
