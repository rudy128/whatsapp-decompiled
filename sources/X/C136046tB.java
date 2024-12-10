package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.6tB  reason: invalid class name and case insensitive filesystem */
public final class C136046tB {
    public int A00 = 0;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C136046tB(long j, String str, String str2, String str3) {
        C18070vi.A0f(str2, 2, str3);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = j;
        this.A04 = str3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C136046tB) {
            return C18070vi.A18(this.A02, ((C136046tB) obj).A02);
        }
        return false;
    }

    public int hashCode() {
        return this.A02.hashCode();
    }

    public String toString() {
        Locale locale = Locale.US;
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A02;
        A1b[1] = this.A03;
        return C108955ca.A12(locale, "Endpoint{id=%s, name=%s}", Arrays.copyOf(A1b, 2));
    }
}
