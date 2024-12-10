package X;

/* renamed from: X.Bfm  reason: case insensitive filesystem */
public class C23360Bfm extends C25038CUr {
    public final C25804CmH A00;
    public final Character A01;
    public volatile C25038CUr A02;

    public final void A01(Appendable appendable, byte[] bArr, int i, int i2) {
        C25874Cni.A02(i, i + i2, bArr.length);
        C25804CmH cmH = this.A00;
        int i3 = cmH.A03;
        int i4 = 0;
        if (i2 <= i3) {
            long j = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                j = (j | ((long) (bArr[i + i5] & 255))) << 8;
            }
            int i6 = (i2 + 1) * 8;
            while (i4 < i2 * 8) {
                int i7 = cmH.A01;
                int i8 = cmH.A00;
                BE6.A1G(appendable, cmH.A07, i8 & ((int) (j >>> ((i6 - i7) - i4))));
                i4 += i7;
            }
            if (this.A01 != null) {
                while (i4 < i3 * 8) {
                    appendable.append('=');
                    i4 += cmH.A01;
                }
                return;
            }
            return;
        }
        throw BE6.A0j();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23360Bfm) {
            C23360Bfm bfm = (C23360Bfm) obj;
            if (!this.A00.equals(bfm.A00) || !AnonymousClass026.A00(this.A01, bfm.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.A01;
        return AnonymousClass001.A0k(ch) ^ this.A00.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder A0u = BE6.A0u("BaseEncoding.");
        C25804CmH cmH = this.A00;
        A0u.append(cmH);
        if (8 % cmH.A01 != 0) {
            Character ch = this.A01;
            if (ch == null) {
                str = ".omitPadding()";
            } else {
                A0u.append(".withPadChar('");
                A0u.append(ch);
                str = "')";
            }
            A0u.append(str);
        }
        return A0u.toString();
    }

    public C23360Bfm(C25804CmH cmH, Character ch) {
        this.A00 = cmH;
        if (ch != null) {
            byte[] bArr = cmH.A06;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw AnonymousClass000.A0k(CBB.A00("Padding character %s was already in alphabet", AnonymousClass8BV.A1b(ch)));
            }
        }
        this.A01 = ch;
    }
}
