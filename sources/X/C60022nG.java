package X;

/* renamed from: X.2nG  reason: invalid class name and case insensitive filesystem */
public final class C60022nG {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public final int A00(C60022nG r5) {
        C18070vi.A0d(r5, 0);
        int i = this.A01;
        int i2 = r5.A01;
        if (i >= i2) {
            if (i > i2) {
                return 1;
            }
            int i3 = this.A04;
            int i4 = r5.A04;
            if (i3 >= i4) {
                if (i3 > i4) {
                    return 1;
                }
                int i5 = this.A03;
                int i6 = r5.A03;
                if (i5 >= i6) {
                    if (i5 > i6) {
                        return 1;
                    }
                    int i7 = this.A00;
                    int i8 = r5.A00;
                    if (i7 >= i8) {
                        if (i7 <= i8) {
                            return 0;
                        }
                        return 1;
                    }
                }
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60022nG) {
                C60022nG r5 = (C60022nG) obj;
                if (!(this.A01 == r5.A01 && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((this.A01 * 31) + this.A04) * 31) + this.A03) * 31) + this.A00) * 31) + this.A02;
    }

    public C60022nG(int i, int i2, int i3, int i4, int i5) {
        this.A01 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A02 = i5;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        A10.append('.');
        A10.append(this.A04);
        A10.append('.');
        A10.append(this.A03);
        if (this.A02 == 4) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append('.');
            str = C17880vN.A0t(A102, this.A00);
        } else {
            str = "";
        }
        return AnonymousClass000.A0y(str, A10);
    }
}
