package X;

/* renamed from: X.D5w  reason: case insensitive filesystem */
public final class C26606D5w implements E3W {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26606D5w) {
                C26606D5w d5w = (C26606D5w) obj;
                if (!(this.A01 == d5w.A01 && this.A00 == d5w.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void BCW(C25844Cn0 cn0) {
        int i = this.A01;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2++;
            int i4 = cn0.A03;
            if (i4 > i2) {
                char A012 = cn0.A01((i4 - i2) - 1);
                char A013 = cn0.A01(cn0.A03 - i2);
                if (Character.isHighSurrogate(A012) && Character.isLowSurrogate(A013)) {
                    i2++;
                }
            }
            if (i2 == cn0.A03) {
                break;
            }
        }
        int i5 = this.A00;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6++;
            int i8 = cn0.A02;
            int i9 = i8 + i6;
            C24486C6d c6d = cn0.A04;
            if (i9 < c6d.A00()) {
                char A014 = cn0.A01((i8 + i6) - 1);
                char A015 = cn0.A01(cn0.A02 + i6);
                if (Character.isHighSurrogate(A014) && Character.isLowSurrogate(A015)) {
                    i6++;
                }
            }
            if (cn0.A02 + i6 == c6d.A00()) {
                break;
            }
        }
        int i10 = cn0.A02;
        cn0.A02(i10, i10 + i6);
        int i11 = cn0.A03;
        cn0.A02(i11 - i2, i11);
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C26606D5w(int i, int i2) {
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
        A10.append("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        A10.append(this.A01);
        A10.append(", lengthAfterCursor=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
