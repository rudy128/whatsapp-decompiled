package X;

/* renamed from: X.AVw  reason: case insensitive filesystem */
public final class C20716AVw implements B5K {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20716AVw) {
                C20716AVw aVw = (C20716AVw) obj;
                if (!C18070vi.A18(this.A01, aVw.A01) || this.A00 != aVw.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C17900vP.A00(this.A01) * 31) + this.A00;
    }

    public C20716AVw(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BroadcastEphemeralValues(broadcastEphemeralSetting=");
        A10.append(this.A01);
        A10.append(", encRetryCount=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
