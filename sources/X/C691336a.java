package X;

/* renamed from: X.36a  reason: invalid class name and case insensitive filesystem */
public final class C691336a implements AnonymousClass25D {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public Long A04;
    public String A05;
    public boolean A06;
    public boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C691336a) {
                C691336a r8 = (C691336a) obj;
                if (!(this.A00 == r8.A00 && C18070vi.A18(this.A05, r8.A05) && C18070vi.A18(this.A04, r8.A04) && this.A01 == r8.A01 && this.A02 == r8.A02 && this.A03 == r8.A03 && this.A06 == r8.A06 && this.A07 == r8.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass001.A0K(this.A03, AnonymousClass001.A0K(this.A02, AnonymousClass001.A0K(this.A01, ((((AnonymousClass000.A0I(this.A00) * 31) + C17900vP.A00(this.A05)) * 31) + C17880vN.A02(this.A04)) * 31))), this.A06), this.A07);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterMessageInfo(commentsCount=");
        A10.append(this.A00);
        A10.append(", reactionFromMe=");
        A10.append(this.A05);
        A10.append(", reactionFromMeMs=");
        A10.append(this.A04);
        A10.append(", extraTables=");
        A10.append(this.A01);
        A10.append(", lastUpdateTimestamp=");
        A10.append(this.A02);
        A10.append(", viewCount=");
        A10.append(this.A03);
        A10.append(", isAutodeleteEligible=");
        A10.append(this.A06);
        A10.append(", isWamoSub=");
        return C17900vP.A0F(A10, this.A07);
    }
}
