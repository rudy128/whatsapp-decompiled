package X;

/* renamed from: X.9s7  reason: invalid class name and case insensitive filesystem */
public final class C194679s7 {
    public final int A00;
    public final int A01;
    public final String A02;

    public C194679s7(String str, int i, int i2) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194679s7) {
                C194679s7 r5 = (C194679s7) obj;
                if (!(C18070vi.A18(this.A02, r5.A02) && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C17880vN.A03(this.A02) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TtrcConfigEntry(appId=");
        A10.append(this.A02);
        A10.append(", logType=");
        A10.append(this.A00);
        A10.append(", targetMarkerId=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
