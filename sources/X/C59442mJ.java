package X;

/* renamed from: X.2mJ  reason: invalid class name and case insensitive filesystem */
public final class C59442mJ {
    public final int A00;
    public final int A01;
    public final long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59442mJ) {
                C59442mJ r8 = (C59442mJ) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A02, ((this.A00 * 31) + this.A01) * 31);
    }

    public C59442mJ(int i, long j, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserNoticeStageTiming(stage=");
        A10.append(this.A00);
        A10.append(", type=");
        A10.append(this.A01);
        A10.append(", timeInMillis=");
        return C17900vP.A0E(A10, this.A02);
    }
}
