package br.ufg.inf.calendar.model;

import java.util.Calendar;

public class Event {

    private int id;

    private Calendar startDate;

    private Calendar endDate;

    private String title;

    private String description;

    private Classification classification;

    private Regional regional;

    private String comment;

    private Event(int id, Calendar startDate, Calendar endDate, String title, String description, Regional regional) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.title = title;
        this.description = description;
        this.regional = regional;
    }

    public static Event createNationalHoliday(int id, Calendar startDate, Calendar endDate, String title, String description, Regional regional) {
        Event event = new Event(id, startDate, endDate, title, description, regional);
        event.setClassification(Classification.NATIONAL_HOLIDAY);
        return event;
    }

    public static Event createCityHoliday(int id, Calendar startDate, Calendar endDate, String title, String description, Regional regional) {
        Event event = new Event(id, startDate, endDate, title, description, regional);
        event.setClassification(Classification.CITY_HOLIDAY);
        return event;
    }

    public static Event createFacultativePoint(int id, Calendar startDate, Calendar endDate, String title, String description, Regional regional) {
        Event event = new Event(id, startDate, endDate, title, description, regional);
        event.setClassification(Classification.FACULTATIVE_POINT);
        return event;
    }

    public static Event createAcademicRecess(int id, Calendar startDate, Calendar endDate, String title, String description, Regional regional) {
        Event event = new Event(id, startDate, endDate, title, description, regional);
        event.setClassification(Classification.ACADEMIC_RECESS);
        return event;
    }

    public static Event createEvent(int id, Calendar startDate, Calendar endDate, String title, String description, Regional regional) {
        Event event = new Event(id, startDate, endDate, title, description, regional);
        event.setClassification(Classification.EVENT);
        return event;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Classification getClassification() {
        return classification;
    }

    private void setClassification(Classification classification) {
        this.classification = classification;
    }

    public Regional getRegional() {
        return regional;
    }

    public void setRegional(Regional regional) {
        this.regional = regional;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
