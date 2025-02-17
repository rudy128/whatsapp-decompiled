package com.facebook.hermes.unicode;

import X.AnonymousClass8BR;
import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;

public class AndroidUnicodeUtils {
    public static String dateFormat(double d, boolean z, boolean z2) {
        DateFormat timeInstance;
        if (z) {
            if (z2) {
                timeInstance = DateFormat.getDateTimeInstance(2, 2);
            } else {
                timeInstance = DateFormat.getDateInstance(2);
            }
        } else if (z2) {
            timeInstance = DateFormat.getTimeInstance(2);
        } else {
            throw AnonymousClass8BR.A0w("Bad dateFormat configuration");
        }
        return timeInstance.format(Long.valueOf((long) d));
    }

    public static String convertToCase(String str, int i, boolean z) {
        Locale locale;
        if (z) {
            locale = Locale.getDefault();
        } else {
            locale = Locale.ENGLISH;
        }
        if (i == 0) {
            return str.toUpperCase(locale);
        }
        if (i == 1) {
            return str.toLowerCase(locale);
        }
        throw AnonymousClass8BR.A0w("Invalid target case");
    }

    public static String normalize(String str, int i) {
        Normalizer.Form form;
        if (i == 0) {
            form = Normalizer.Form.NFC;
        } else if (i == 1) {
            form = Normalizer.Form.NFD;
        } else if (i == 2) {
            form = Normalizer.Form.NFKC;
        } else if (i == 3) {
            form = Normalizer.Form.NFKD;
        } else {
            throw AnonymousClass8BR.A0w("Invalid form");
        }
        return Normalizer.normalize(str, form);
    }

    public static int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }
}
