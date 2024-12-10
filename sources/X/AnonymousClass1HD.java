package X;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: X.1HD  reason: invalid class name */
public final class AnonymousClass1HD {
    public static final AnonymousClass1HD A01 = A03(new Locale[0]);
    public final C24231Jj A00;

    public static AnonymousClass1HD A01(LocaleList localeList) {
        return new AnonymousClass1HD(new C24241Jk(localeList));
    }

    public static AnonymousClass1HD A02(String str) {
        if (str == null || str.isEmpty()) {
            return A01;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = C24251Jl.A00(split[i]);
        }
        return A03(localeArr);
    }

    public static AnonymousClass1HD A03(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return A01(C24221Ji.A00(localeArr));
        }
        return new AnonymousClass1HD(new C64852vR(localeArr));
    }

    public int A04() {
        return this.A00.size();
    }

    public String A05() {
        return this.A00.CPO();
    }

    public Locale A06(int i) {
        return this.A00.BME(i);
    }

    public boolean A07() {
        return this.A00.isEmpty();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass1HD) || !this.A00.equals(((AnonymousClass1HD) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }

    public AnonymousClass1HD(C24231Jj r1) {
        this.A00 = r1;
    }

    public static AnonymousClass1HD A00() {
        return A01;
    }
}
