package X;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: X.1Jk  reason: invalid class name and case insensitive filesystem */
public final class C24241Jk implements C24231Jj {
    public final LocaleList A00;

    public Locale BME(int i) {
        return this.A00.get(i);
    }

    public String CPO() {
        return this.A00.toLanguageTags();
    }

    public boolean equals(Object obj) {
        return this.A00.equals(((C24231Jj) obj).BU6());
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public int size() {
        return this.A00.size();
    }

    public String toString() {
        return this.A00.toString();
    }

    public C24241Jk(Object obj) {
        this.A00 = (LocaleList) obj;
    }

    public Object BU6() {
        return this.A00;
    }
}
