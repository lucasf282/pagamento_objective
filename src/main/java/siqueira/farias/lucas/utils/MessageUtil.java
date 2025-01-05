package siqueira.farias.lucas.utils;

import java.util.ResourceBundle;

public class MessageUtil {

    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("messages");

    private MessageUtil() {
        // Private constructor to prevent instantiation
    }

    public static String getMessage(String key) {
        return RESOURCE_BUNDLE.getString(key);
    }
}