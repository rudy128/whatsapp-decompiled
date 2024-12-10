package X;

/* renamed from: X.CnF  reason: case insensitive filesystem */
public class C25853CnF {
    public int A00;
    public int A01 = 0;
    public final CharSequence A02;

    public boolean A09(char c, int i) {
        do {
            i++;
            if ((!A0A(i)) || A00(this, i) != ' ') {
            }
            i++;
            break;
        } while (A00(this, i) != ' ');
        return !(A0A(i) ^ true) && A00(this, i) == c;
    }

    public static char A00(C25853CnF cnF, int i) {
        return cnF.A02.charAt(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r3 
      PHI: (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:0:0x0000, B:3:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char A01(int r3) {
        /*
            r2 = this;
        L_0x0000:
            int r3 = r3 + 1
            boolean r0 = r2.A0A(r3)
            r0 = r0 ^ 1
            r1 = 32
            if (r0 != 0) goto L_0x0013
            char r0 = A00(r2, r3)
            if (r0 != r1) goto L_0x0013
            goto L_0x0000
        L_0x0013:
            boolean r0 = r2.A0A(r3)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0020
            char r0 = A00(r2, r3)
            return r0
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25853CnF.A01(int):char");
    }

    public int A02(char c, char c2, int i, boolean z) {
        CharSequence charSequence = this.A02;
        if (charSequence.charAt(i) == c) {
            int i2 = 1;
            while (true) {
                i++;
                if (!A0A(i)) {
                    return -1;
                }
                char charAt = charSequence.charAt(i);
                if (charAt == '\'' || charAt == '\"') {
                    int A04 = A04(charAt, i);
                    if (A04 != -1) {
                        i = A04 + 1;
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Could not find matching close quote for ");
                        A10.append(charAt);
                        throw C23741Bom.A00(AnonymousClass001.A1E(charSequence, " when parsing : ", A10));
                    }
                }
                if (z && charSequence.charAt(i) == '/') {
                    int A042 = A04('/', i);
                    if (A042 != -1) {
                        i = A042 + 1;
                    } else {
                        throw C23741Bom.A00(AnonymousClass001.A1E(charSequence, "Could not find matching close for / when parsing regex in : ", AnonymousClass000.A10()));
                    }
                }
                if (charSequence.charAt(i) == c) {
                    i2++;
                }
                if (charSequence.charAt(i) == c2 && i2 - 1 == 0) {
                    return i;
                }
            }
        } else {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Expected ");
            A102.append(c);
            A102.append(" but found ");
            throw C23741Bom.A00(C17890vO.A0c(A102, charSequence.charAt(i)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:0:0x0000, B:3:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03(char r3, int r4) {
        /*
            r2 = this;
        L_0x0000:
            int r4 = r4 + 1
            boolean r0 = r2.A0A(r4)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0013
            char r1 = A00(r2, r4)
            r0 = 32
            if (r1 != r0) goto L_0x0013
            goto L_0x0000
        L_0x0013:
            char r0 = A00(r2, r4)
            if (r0 == r3) goto L_0x001a
            r4 = -1
        L_0x001a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25853CnF.A03(char, int):int");
    }

    public int A04(char c, int i) {
        boolean z = false;
        for (int i2 = i + 1; !(!A0A(i2)); i2++) {
            if (z) {
                z = false;
            } else {
                CharSequence charSequence = this.A02;
                if ('\\' == charSequence.charAt(i2)) {
                    z = true;
                } else if (c == charSequence.charAt(i2)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public void A05() {
        while (true) {
            int i = this.A01;
            if (A0A(i) && i < this.A00 && A00(this, i) == ' ') {
                this.A01++;
            } else {
                return;
            }
        }
    }

    public boolean A08(char c) {
        return AnonymousClass000.A1T(this.A02.charAt(this.A01), c);
    }

    public boolean A0A(int i) {
        if (i < 0 || i > this.A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.A02.toString();
    }

    public C25853CnF(CharSequence charSequence) {
        this.A02 = charSequence;
        this.A00 = charSequence.length() - 1;
    }

    public void A06() {
        int i;
        A05();
        while (true) {
            int i2 = this.A01;
            if (A0A(i2) && i2 < (i = this.A00) && A00(this, i) == ' ') {
                this.A00--;
            } else {
                return;
            }
        }
    }

    public void A07(char c) {
        A05();
        if (this.A02.charAt(this.A01) == c) {
            this.A01++;
        } else {
            throw C23741Bom.A00(String.format("Expected character: %c", new Object[]{Character.valueOf(c)}));
        }
    }

    public boolean A0B(CharSequence charSequence) {
        A05();
        if (A0A((this.A01 + charSequence.length()) - 1)) {
            int i = this.A01;
            if (this.A02.subSequence(i, charSequence.length() + i).equals(charSequence)) {
                this.A01 += charSequence.length();
                return true;
            }
        }
        return false;
    }
}
