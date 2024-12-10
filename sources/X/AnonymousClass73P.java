package X;

import android.util.JsonReader;
import java.util.Locale;

/* renamed from: X.73P  reason: invalid class name */
public final class AnonymousClass73P {
    public static final AnonymousClass73P A00 = new Object();

    public final String A03(C18000vb r3, Locale locale) {
        String str;
        String language;
        String country;
        if (locale == null || (language = locale.getLanguage()) == null || language.length() == 0) {
            str = r3.A05();
        } else {
            String language2 = locale.getLanguage();
            if (language2 == null || !language2.equalsIgnoreCase("zh") || (country = locale.getCountry()) == null || country.length() == 0) {
                str = locale.getLanguage();
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(locale.getLanguage());
                A10.append('-');
                return AnonymousClass000.A0y(locale.getCountry(), A10);
            }
        }
        C18070vi.A0X(str);
        return str;
    }

    public static final C19760yx A00(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = 0;
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (C18070vi.A18(nextName, "status")) {
                i = jsonReader.nextInt();
            } else if (C18070vi.A18(nextName, "msg")) {
                str = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new C19760yx(Integer.valueOf(i), str);
    }

    public static final AnonymousClass77C A01(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        int i = -1;
        int i2 = -1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName != null) {
                int hashCode = nextName.hashCode();
                if (hashCode != -1221029593) {
                    if (hashCode != 116079) {
                        if (hashCode == 113126854 && nextName.equals("width")) {
                            i = C108985cd.A02(jsonReader);
                        }
                    } else if (nextName.equals("url")) {
                        str = jsonReader.nextString();
                    }
                } else if (nextName.equals("height")) {
                    i2 = C108985cd.A02(jsonReader);
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (str != null) {
            return new AnonymousClass77C(i, i2, str, -1);
        }
        return null;
    }

    public static final String A02(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName != null) {
                int hashCode = nextName.hashCode();
                if (hashCode != -1019779949) {
                    if (hashCode != -407761836) {
                        if (hashCode == 94851343 && nextName.equals("count")) {
                            i2 = jsonReader.nextInt();
                        }
                    } else if (nextName.equals("total_count")) {
                        i4 = jsonReader.nextInt();
                    }
                } else if (nextName.equals("offset")) {
                    i3 = jsonReader.nextInt();
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (i2 <= 0 || i3 < 0 || i4 <= 0 || i4 <= (i = i2 + i3)) {
            return null;
        }
        return String.valueOf(i);
    }
}
