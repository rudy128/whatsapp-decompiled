package X;

/* renamed from: X.D5v  reason: case insensitive filesystem */
public final class C26605D5v implements E3W {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26605D5v) {
                C26605D5v d5v = (C26605D5v) obj;
                if (!(this.A01 == d5v.A01 && this.A00 == d5v.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void BCW(C25844Cn0 cn0) {
        int i = cn0.A02;
        int i2 = this.A00;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = cn0.A04.A00();
        }
        cn0.A02(i, Math.min(i3, cn0.A04.A00()));
        int i4 = cn0.A03;
        int i5 = this.A01;
        int i6 = i4 - i5;
        if (((i4 ^ i6) & (i5 ^ i4)) < 0) {
            i6 = 0;
        }
        cn0.A02(Math.max(0, i6), i4);
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C26605D5v(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i < 0 || i2 < 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ");
            A10.append(i);
            A10.append(" and ");
            A10.append(i2);
            throw AnonymousClass001.A12(" respectively.", A10);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        A10.append(this.A01);
        A10.append(", lengthAfterCursor=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
