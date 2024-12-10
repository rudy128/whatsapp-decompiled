package X;

/* renamed from: X.6pM  reason: invalid class name and case insensitive filesystem */
public abstract class C133706pM {
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final C126136cF A03;

    public int hashCode() {
        Object[] objArr = new Object[3];
        AnonymousClass000.A1L(objArr, this.A02);
        objArr[1] = Boolean.valueOf(this.A01);
        return AnonymousClass000.A0P(Boolean.valueOf(this.A00), objArr, 2);
    }

    public C133706pM(C126136cF r1, int i, boolean z, boolean z2) {
        this.A02 = i;
        this.A01 = z;
        this.A03 = r1;
        this.A00 = z2;
    }

    public boolean equals(Object obj) {
        if (!C18070vi.A18(getClass(), C108975cc.A0R(obj)) || !(obj instanceof C133706pM)) {
            return false;
        }
        C133706pM r4 = (C133706pM) obj;
        if (this.A02 == r4.A02 && this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }
}
