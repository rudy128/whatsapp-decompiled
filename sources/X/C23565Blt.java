package X;

/* renamed from: X.Blt  reason: case insensitive filesystem */
public class C23565Blt extends C25039CUs {
    public final C25805CmI A00;
    public final Character A01;
    public volatile C25039CUs A02;

    public C25039CUs A01(C25805CmI cmI, Character ch) {
        if (this instanceof C23563Blr) {
            C23565Blt blt = new C23565Blt(cmI, ch);
            C199610h.A07(AnonymousClass000.A1T(cmI.A07.length, 64));
            return blt;
        } else if (this instanceof C23564Bls) {
            return new C23564Bls(cmI);
        } else {
            return new C23565Blt(cmI, ch);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C23565Blt)) {
            return false;
        }
        C23565Blt blt = (C23565Blt) obj;
        if (!this.A00.equals(blt.A00) || !AnonymousClass026.A00(this.A01, blt.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode() ^ AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        String str;
        StringBuilder A0u = BE6.A0u("BaseEncoding.");
        C25805CmI cmI = this.A00;
        A0u.append(cmI);
        if (8 % cmI.A00 != 0) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r2 == -1) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23565Blt(X.C25805CmI r4, java.lang.Character r5) {
        /*
            r3 = this;
            r3.<init>()
            X.C199610h.A04(r4)
            r3.A00 = r4
            if (r5 == 0) goto L_0x0019
            char r2 = r5.charValue()
            byte[] r1 = r4.A06
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0019
            byte r2 = r1[r2]
            r0 = -1
            r1 = 0
            if (r2 != r0) goto L_0x001a
        L_0x0019:
            r1 = 1
        L_0x001a:
            java.lang.String r0 = "Padding character %s was already in alphabet"
            X.C199610h.A06(r5, r0, r1)
            r3.A01 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23565Blt.<init>(X.CmI, java.lang.Character):void");
    }

    public void A02(Appendable appendable, byte[] bArr, int i, int i2) {
        C199610h.A04(appendable);
        C199610h.A03(i, i + i2, bArr.length);
        C25805CmI cmI = this.A00;
        int i3 = cmI.A01;
        int i4 = 0;
        C199610h.A07(BE8.A1U(i2, i3));
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | ((long) (bArr[i + i5] & 255))) << 8;
        }
        int i6 = cmI.A00;
        int i7 = ((i2 + 1) * 8) - i6;
        while (i4 < i2 * 8) {
            BE6.A1G(appendable, cmI.A07, ((int) (j >>> (i7 - i4))) & cmI.A03);
            i4 += i6;
        }
        Character ch = this.A01;
        if (ch != null) {
            while (i4 < i3 * 8) {
                appendable.append(ch.charValue());
                i4 += i6;
            }
        }
    }
}
