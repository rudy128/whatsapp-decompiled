package X;

/* renamed from: X.69s  reason: invalid class name and case insensitive filesystem */
public final class C1197569s extends C133706pM {
    public int A00;
    public String A01;

    public int hashCode() {
        Object[] objArr = new Object[3];
        AnonymousClass000.A1L(objArr, super.hashCode());
        AnonymousClass000.A1M(objArr, this.A00);
        return AnonymousClass000.A0P(this.A01, objArr, 2);
    }

    public boolean equals(Object obj) {
        if (!C18070vi.A18(getClass(), C108975cc.A0R(obj)) || !super.equals(obj) || !(obj instanceof C1197569s)) {
            return false;
        }
        C1197569s r4 = (C1197569s) obj;
        if (this.A00 != r4.A00 || !C18070vi.A18(this.A01, r4.A01)) {
            return false;
        }
        return true;
    }
}
