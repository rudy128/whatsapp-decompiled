package X;

/* renamed from: X.D5x  reason: case insensitive filesystem */
public final class C26607D5x implements E3W {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26607D5x) {
                C26607D5x d5x = (C26607D5x) obj;
                if (!(this.A01 == d5x.A01 && this.A00 == d5x.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void BCW(C25844Cn0 cn0) {
        if (cn0.A01 != -1) {
            cn0.A01 = -1;
            cn0.A00 = -1;
        }
        int i = this.A01;
        int A002 = cn0.A04.A00();
        int A03 = C28851b7.A03(i, 0, A002);
        int A032 = C28851b7.A03(this.A00, 0, A002);
        if (A03 == A032) {
            return;
        }
        if (A03 < A032) {
            cn0.A03(A03, A032);
        } else {
            cn0.A03(A032, A03);
        }
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C26607D5x(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SetComposingRegionCommand(start=");
        A10.append(this.A01);
        A10.append(", end=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
