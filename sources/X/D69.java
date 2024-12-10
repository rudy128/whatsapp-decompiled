package X;

public final class D69 implements EBX {
    public final long A00;

    public C03380Hv BNh() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof D69) {
                long j = this.A00;
                long j2 = ((D69) obj).A00;
                long j3 = C05100Qk.A01;
                if (j == j2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public float BMz() {
        return C05100Qk.A01(this.A00);
    }

    public long BOw() {
        return this.A00;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = C05100Qk.A01;
        return AnonymousClass000.A0I(j);
    }

    public D69(long j) {
        this.A00 = j;
        if (j == C05100Qk.A05) {
            throw AnonymousClass000.A0k("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ColorStyle(value=");
        return AnonymousClass001.A1F(C05100Qk.A08(this.A00), A10);
    }
}
