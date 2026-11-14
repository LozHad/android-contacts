package ru.yandex.practicum.contacts.model;

public enum ContactType {
    TELEGRAM,
    WHATS_APP,
    VIBER,
    SIGNAL,
    THREEMA,
    PHONE,
    EMAIL;

    public static String[] getContactTypes() {
        return new String[]{TELEGRAM.name(), WHATS_APP.name(), VIBER.name(), SIGNAL.name(), THREEMA.name(), PHONE.name(), EMAIL.name()};
    }
}
