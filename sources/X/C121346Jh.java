package X;

/* renamed from: X.6Jh  reason: invalid class name and case insensitive filesystem */
public final class C121346Jh extends AnonymousClass6U0 implements AnonymousClass8A0 {
    public AnonymousClass1E7 A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final long A08;
    public final long A09;
    public final C46162Dk A0A;
    public final CharSequence A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C121346Jh(C46162Dk r2, AnonymousClass1E7 r3, CharSequence charSequence, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C18070vi.A0d(charSequence, 4);
        this.A0A = r2;
        this.A00 = r3;
        this.A08 = j;
        this.A0B = charSequence;
        this.A0C = z;
        this.A0D = z2;
        this.A09 = j2;
        this.A07 = i;
        this.A04 = z3;
        this.A06 = z4;
        this.A02 = z5;
        this.A01 = z6;
        this.A03 = z7;
        this.A05 = z8;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C121346Jh) {
                C121346Jh r8 = (C121346Jh) obj;
                if (!(C18070vi.A18(this.A0A, r8.A0A) && C18070vi.A18(this.A00, r8.A00) && this.A08 == r8.A08 && C18070vi.A18(this.A0B, r8.A0B) && this.A0C == r8.A0C && this.A0D == r8.A0D && this.A09 == r8.A09 && this.A07 == r8.A07 && this.A04 == r8.A04 && this.A06 == r8.A06 && this.A02 == r8.A02 && this.A01 == r8.A01 && this.A03 == r8.A03 && this.A05 == r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final AnonymousClass206 A00() {
        AnonymousClass206 r0;
        C46162Dk r1 = this.A0A;
        synchronized (r1) {
            r0 = r1.A0f;
        }
        return r0;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass001.A0K(this.A09, AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A0B, AnonymousClass001.A0K(this.A08, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A0A)))), this.A0C), this.A0D)) + this.A07) * 31, this.A04), this.A06), this.A02), this.A01), this.A03), this.A05);
    }

    public C46162Dk BVL() {
        return this.A0A;
    }

    public boolean BfL() {
        return this.A02;
    }

    public AnonymousClass1E7 getContact() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterDataItem(newsletterInfo=");
        C108965cb.A1R(this.A0A, A10);
        A10.append(this.A00);
        A10.append(", displayTimestamp=");
        A10.append(this.A08);
        A10.append(", elapsedTimeString=");
        A10.append(this.A0B);
        A10.append(", isLatestMessageTransferred=");
        A10.append(this.A0C);
        A10.append(", isPrefetching=");
        A10.append(this.A0D);
        A10.append(", unseenMessageCount=");
        A10.append(this.A09);
        A10.append(", lastMessageStatus=");
        A10.append(this.A07);
        A10.append(", isPinned=");
        A10.append(this.A04);
        A10.append(", isSelected=");
        A10.append(this.A06);
        A10.append(", isLoading=");
        A10.append(this.A02);
        A10.append(", isInboxMode=");
        A10.append(this.A01);
        A10.append(", isMuteIndicatorEnabled=");
        A10.append(this.A03);
        A10.append(", isSearchResult=");
        return C17900vP.A0F(A10, this.A05);
    }
}
