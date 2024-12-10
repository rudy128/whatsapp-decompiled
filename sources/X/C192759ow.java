package X;

import java.util.Map;

/* renamed from: X.9ow  reason: invalid class name and case insensitive filesystem */
public class C192759ow {
    public final String A00;
    public final String A01;
    public final String A02;
    public final Map A03;
    public final C00 A04;
    public final AnonymousClass9IX A05;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C192759ow)) {
            return false;
        }
        C192759ow r4 = (C192759ow) obj;
        return this.A01.equals(r4.A01) && this.A00.equals(r4.A00) && this.A02.equals(r4.A02) && this.A04.equals(r4.A04) && this.A05.equals(r4.A05) && this.A03.equals(r4.A03);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A01;
        objArr[1] = this.A00;
        objArr[2] = this.A02;
        objArr[3] = this.A04;
        return AnonymousClass000.A0P(this.A03, objArr, 4);
    }

    public C192759ow(String str, String str2, String str3, Map map, C00 c00, AnonymousClass9IX r6) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A04 = c00;
        this.A05 = r6;
        this.A03 = map;
    }
}
