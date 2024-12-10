package X;

/* renamed from: X.2lw  reason: invalid class name and case insensitive filesystem */
public final class C59212lw {
    public final int A00;
    public final String A01;
    public final C42811ym A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59212lw)) {
            return false;
        }
        C59212lw r4 = (C59212lw) obj;
        return this.A01.equals(r4.A01) && this.A00 == r4.A00 && this.A02.equals(r4.A02);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        AnonymousClass000.A1L(objArr, this.A00);
        objArr[1] = this.A01;
        return AnonymousClass000.A0P(this.A02, objArr, 2);
    }

    public C59212lw(C42811ym r2, String str, int i) {
        if (i < 0) {
            throw AnonymousClass000.A0k("Start index must be >= 0.");
        } else if (str != null) {
            this.A00 = i;
            this.A01 = str;
            this.A02 = r2;
        } else {
            throw new NullPointerException();
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PhoneNumberMatch [");
        int i = this.A00;
        A10.append(i);
        A10.append(",");
        String str = this.A01;
        A10.append(i + str.length());
        return AnonymousClass001.A1H(") ", str, A10);
    }
}
