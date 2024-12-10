package X;

import java.util.List;

/* renamed from: X.8wI  reason: invalid class name and case insensitive filesystem */
public class C174138wI extends C174358we {
    public final C184239ad A00;
    public final AnonymousClass1E7 A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C174138wI(C184239ad r2, AnonymousClass1E7 r3, String str, String str2, List list) {
        super(36);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = list;
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            C174138wI r4 = (C174138wI) obj;
            if (this.A02.equals(r4.A02) && this.A03.equals(r4.A03) && this.A04.equals(r4.A04)) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A02, super.hashCode() * 31);
        return AnonymousClass000.A0O(this.A01, (C17890vO.A02(this.A03, A022) + this.A04.hashCode()) * 31);
    }
}
