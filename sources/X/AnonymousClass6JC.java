package X;

/* renamed from: X.6JC  reason: invalid class name */
public final class AnonymousClass6JC extends AnonymousClass6J8 {
    public AnonymousClass1E7 A00;
    public final AnonymousClass206 A01;
    public final AnonymousClass206 A02;
    public final AnonymousClass206 A03;
    public final C134956rQ A04;
    public final C132706nQ A05;
    public final CharSequence A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6JC) {
                AnonymousClass6JC r5 = (AnonymousClass6JC) obj;
                if (!C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A06, r5.A06) || this.A07 != r5.A07 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6JC(X.AnonymousClass1E7 r10, X.AnonymousClass206 r11, X.AnonymousClass206 r12, X.AnonymousClass206 r13, X.C134956rQ r14, X.C132706nQ r15, java.lang.CharSequence r16, boolean r17) {
        /*
            r9 = this;
            X.2sx r2 = r15.A00
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.A05 = r15
            r9.A00 = r10
            r9.A03 = r11
            r9.A06 = r8
            r0 = r17
            r9.A07 = r0
            r9.A02 = r12
            r9.A04 = r14
            r9.A01 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6JC.<init>(X.1E7, X.206, X.206, X.206, X.6rQ, X.6nQ, java.lang.CharSequence, boolean):void");
    }

    public int hashCode() {
        return ((((AnonymousClass0DV.A00((((AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A05)) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A06)) * 31, this.A07) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + C17880vN.A02(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MyStatusDataItem(myStatusState=");
        C108965cb.A1R(this.A05, A10);
        A10.append(this.A00);
        A10.append(", latestMessage=");
        A10.append(this.A03);
        A10.append(", elapsedTimeString=");
        A10.append(this.A06);
        A10.append(", isItemVisible=");
        A10.append(this.A07);
        A10.append(", firstUnreadMessage=");
        A10.append(this.A02);
        A10.append(", inFlightMessage=");
        A10.append(this.A04);
        A10.append(", firstMessage=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
