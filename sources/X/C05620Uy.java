package X;

/* renamed from: X.0Uy  reason: invalid class name and case insensitive filesystem */
public final class C05620Uy implements C17100tk {
    public final C17100tk A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C05620Uy) && C18070vi.A18(this.A00, ((C05620Uy) obj).A00);
        }
        return true;
    }

    public int BTy(C28644ECa eCa, C24246By4 by4) {
        return this.A00.BTy(eCa, by4);
    }

    public int BYN(C28644ECa eCa, C24246By4 by4) {
        return this.A00.BYN(eCa, by4);
    }

    public int Bab(C28644ECa eCa) {
        return this.A00.Bab(eCa);
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + 31;
    }

    public C05620Uy(C17100tk r1) {
        this.A00 = r1;
    }

    public static final String A00() {
        StringBuilder A10 = AnonymousClass000.A10();
        A01(A10, "Start");
        A01(A10, "Left");
        A01(A10, "Top");
        A01(A10, "End");
        A01(A10, "Right");
        String obj = A10.toString();
        C18070vi.A0X(obj);
        return obj;
    }

    public static final void A01(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append('(');
        A10.append(this.A00);
        A10.append(" only ");
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("WindowInsetsSides(");
        A102.append(A00());
        return AnonymousClass001.A1F(AnonymousClass001.A1J(A102), A10);
    }

    public int BNd(C28644ECa eCa) {
        return 0;
    }
}
