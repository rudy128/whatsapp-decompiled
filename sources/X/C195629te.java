package X;

/* renamed from: X.9te  reason: invalid class name and case insensitive filesystem */
public final class C195629te {
    public final int A00;
    public final Integer A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195629te) {
                C195629te r5 = (C195629te) obj;
                if (!(this.A01 == r5.A01 && this.A07 == r5.A07 && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A05 == r5.A05 && this.A00 == r5.A00 && this.A02 == r5.A02 && this.A06 == r5.A06 && this.A08 == r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A01;
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(((((C72453Mb.A0E(num, C181369Qf.A00(num)) * 31) + 1237) * 31) + 1231) * 31, this.A07), this.A04), this.A03), this.A05) + this.A00) * 31, this.A02), this.A06), this.A08);
    }

    public C195629te(Integer num, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A01 = num;
        this.A07 = z;
        this.A04 = z2;
        this.A03 = z3;
        this.A05 = z4;
        this.A00 = i;
        this.A02 = z5;
        this.A06 = z6;
        this.A08 = z7;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BuildHistorySyncParams(historySyncUsage=");
        A10.append(C181369Qf.A00(this.A01));
        C108975cc.A15(A10, ", strictMode=");
        C108975cc.A16(A10, ", ignoreThumbnail=");
        A10.append(", supportCagReactionsAndPolls=");
        A10.append(this.A07);
        A10.append(", shouldIncludeBotUserAgentChat=");
        A10.append(this.A04);
        A10.append(", shouldIncludeBotJidUserAgentChat=");
        A10.append(this.A03);
        A10.append(", shouldIncludeHostedGroupMsg=");
        A10.append(this.A05);
        A10.append(", maxCommentsToAdd=");
        A10.append(this.A00);
        A10.append(", shouldIncludeBizHostedMsg=");
        A10.append(this.A02);
        A10.append(", supportAddOnHistorySyncMigration=");
        A10.append(this.A06);
        A10.append(", supportMessageAssociation=");
        return C17900vP.A0F(A10, this.A08);
    }
}
