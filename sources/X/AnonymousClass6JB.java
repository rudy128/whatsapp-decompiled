package X;

/* renamed from: X.6JB  reason: invalid class name */
public final class AnonymousClass6JB extends AnonymousClass6J8 {
    public AnonymousClass1E7 A00;
    public final C63372sx A01;
    public final AnonymousClass206 A02;
    public final AnonymousClass206 A03;
    public final AnonymousClass206 A04;
    public final CharSequence A05;
    public final boolean A06;
    public final boolean A07;

    public AnonymousClass6JB(C63372sx r10, AnonymousClass1E7 r11, AnonymousClass206 r12, AnonymousClass206 r13, AnonymousClass206 r14, CharSequence charSequence, boolean z, boolean z2) {
        super(r10, r11, r12, r13, r14, (C134956rQ) null, charSequence);
        this.A01 = r10;
        this.A00 = r11;
        this.A04 = r12;
        this.A05 = charSequence;
        this.A06 = z;
        this.A07 = z2;
        this.A03 = r13;
        this.A02 = r14;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6JB) {
                AnonymousClass6JB r5 = (AnonymousClass6JB) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A05, r5.A05) || this.A06 != r5.A06 || this.A07 != r5.A07 || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A01))) + AnonymousClass001.A0k(this.A05)) * 31, this.A06), this.A07) + AnonymousClass001.A0k(this.A03)) * 31) + C17880vN.A02(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ContactStatusDataItem(statusInfo=");
        C108965cb.A1R(this.A01, A10);
        A10.append(this.A00);
        A10.append(", latestMessage=");
        A10.append(this.A04);
        A10.append(", elapsedTimeString=");
        A10.append(this.A05);
        A10.append(", isItemVisible=");
        A10.append(this.A06);
        A10.append(", isMuted=");
        A10.append(this.A07);
        A10.append(", firstUnreadMessage=");
        A10.append(this.A03);
        A10.append(", firstMessage=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
