package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.2vR  reason: invalid class name and case insensitive filesystem */
public final class C64852vR implements C24231Jj {
    public static final Locale A02;
    public static final Locale A03 = new Locale("ar", "XB");
    public static final Locale A04 = new Locale("en", "XA");
    public static final Locale[] A05 = new Locale[0];
    public final String A00;
    public final Locale[] A01;

    static {
        Locale locale;
        AnonymousClass1HD r0 = AnonymousClass1HD.A01;
        String str = "-";
        if (!"en-Latn".contains(str)) {
            str = "_";
            if (!"en-Latn".contains(str)) {
                locale = new Locale("en-Latn");
                A02 = locale;
            }
        }
        String[] split = "en-Latn".split(str, -1);
        int length = split.length;
        if (length > 2) {
            locale = new Locale(split[0], split[1], split[2]);
        } else if (length > 1) {
            locale = new Locale(split[0], split[1]);
        } else if (length == 1) {
            locale = new Locale(split[0]);
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Can not parse language tag: [");
            A10.append("en-Latn");
            throw AnonymousClass001.A12("]", A10);
        }
        A02 = locale;
    }

    public Object BU6() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C64852vR) {
                Locale[] localeArr = ((C64852vR) obj).A01;
                Locale[] localeArr2 = this.A01;
                int length = localeArr2.length;
                if (length == localeArr.length) {
                    int i = 0;
                    while (i < length) {
                        if (localeArr2[i].equals(localeArr[i])) {
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public Locale BME(int i) {
        if (i < 0) {
            return null;
        }
        Locale[] localeArr = this.A01;
        if (i < localeArr.length) {
            return localeArr[i];
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale A0O : this.A01) {
            i = AnonymousClass000.A0O(A0O, i * 31);
        }
        return i;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(this.A01.length);
    }

    public int size() {
        return this.A01.length;
    }

    public C64852vR(Locale... localeArr) {
        String obj;
        int length = localeArr.length;
        if (length == 0) {
            this.A01 = A05;
            obj = "";
        } else {
            ArrayList A13 = AnonymousClass000.A13();
            HashSet A12 = C17880vN.A12();
            StringBuilder A10 = AnonymousClass000.A10();
            int i = 0;
            do {
                Locale locale = localeArr[i];
                if (locale != null) {
                    if (!A12.contains(locale)) {
                        Locale locale2 = (Locale) locale.clone();
                        A13.add(locale2);
                        A10.append(locale2.getLanguage());
                        String country = locale2.getCountry();
                        if (country != null && !country.isEmpty()) {
                            A10.append('-');
                            A10.append(locale2.getCountry());
                        }
                        if (i < length - 1) {
                            A10.append(',');
                        }
                        A12.add(locale2);
                    }
                    i++;
                } else {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("list[");
                    A102.append(i);
                    throw AnonymousClass000.A0s(AnonymousClass000.A0y("] is null", A102));
                }
            } while (i < length);
            this.A01 = (Locale[]) A13.toArray(new Locale[0]);
            obj = A10.toString();
        }
        this.A00 = obj;
    }

    public String CPO() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.A01;
            int length = localeArr.length;
            if (i >= length) {
                return AnonymousClass000.A0z(A10);
            }
            A10.append(localeArr[i]);
            if (i < length - 1) {
                A10.append(',');
            }
            i++;
        }
    }
}
