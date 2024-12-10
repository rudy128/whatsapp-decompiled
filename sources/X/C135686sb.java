package X;

import java.util.List;

/* renamed from: X.6sb  reason: invalid class name and case insensitive filesystem */
public final class C135686sb {
    public C29681ch A00;
    public Integer A01;
    public List A02;
    public final int A03;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C135686sb) && this.A03 == ((C135686sb) obj).A03);
    }

    public int hashCode() {
        return this.A03;
    }

    public C135686sb(int i) {
        this.A03 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InviteSourceData(sourceType=");
        return AnonymousClass001.A1L(A10, this.A03);
    }
}
