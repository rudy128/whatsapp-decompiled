package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2n9  reason: invalid class name and case insensitive filesystem */
public final class C59952n9 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final AnonymousClass1E7 A04;
    public final UserJid A05;
    public final C42661yX A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59952n9) {
                C59952n9 r8 = (C59952n9) obj;
                if (!(C18070vi.A18(this.A04, r8.A04) && C18070vi.A18(this.A08, r8.A08) && this.A03 == r8.A03 && C18070vi.A18(this.A06, r8.A06) && this.A0C == r8.A0C && this.A0J == r8.A0J && this.A0A == r8.A0A && this.A0I == r8.A0I && this.A01 == r8.A01 && C18070vi.A18(this.A05, r8.A05) && this.A0H == r8.A0H && this.A0E == r8.A0E && this.A02 == r8.A02 && this.A0F == r8.A0F && C18070vi.A18(this.A07, r8.A07) && this.A0G == r8.A0G && this.A09 == r8.A09 && this.A0B == r8.A0B && this.A00 == r8.A00 && this.A0D == r8.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(C17890vO.A02(this.A07, AnonymousClass0DV.A00((AnonymousClass0DV.A00(AnonymousClass0DV.A00((((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A06, AnonymousClass001.A0K(this.A03, (AnonymousClass000.A0L(this.A04) + C17900vP.A00(this.A08)) * 31)), this.A0C), this.A0J), this.A0A), this.A0I) + this.A01) * 31) + C17880vN.A02(this.A05)) * 31, this.A0H), this.A0E) + this.A02) * 31, this.A0F)), this.A0G), this.A09), this.A0B) + this.A00) * 31, this.A0D);
    }

    public C59952n9(AnonymousClass1E7 r2, UserJid userJid, C42661yX r4, String str, String str2, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.A04 = r2;
        this.A08 = str;
        this.A03 = j;
        this.A06 = r4;
        this.A0C = z;
        this.A0J = z2;
        this.A0A = z3;
        this.A0I = z4;
        this.A01 = i;
        this.A05 = userJid;
        this.A0H = z5;
        this.A0E = z6;
        this.A02 = i2;
        this.A0F = z7;
        this.A07 = str2;
        this.A0G = z8;
        this.A09 = z9;
        this.A0B = z10;
        this.A00 = i3;
        this.A0D = z11;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewGroupChatContactParams(contact=");
        A10.append(this.A04);
        A10.append(", subject=");
        A10.append(this.A08);
        A10.append(", createdTime=");
        A10.append(this.A03);
        A10.append(", gd=");
        A10.append(this.A06);
        A10.append(", inAppSupport=");
        A10.append(this.A0C);
        A10.append(", restrictMode=");
        A10.append(this.A0J);
        A10.append(", announcementsOnly=");
        A10.append(this.A0A);
        A10.append(", noFrequentlyForwarded=");
        A10.append(this.A0I);
        A10.append(", ephemeralDuration=");
        A10.append(this.A01);
        A10.append(", creator=");
        A10.append(this.A05);
        A10.append(", isSuspended=");
        A10.append(this.A0H);
        A10.append(", isIncognito=");
        A10.append(this.A0E);
        A10.append(", memberAddMode=");
        A10.append(this.A02);
        A10.append(", isMembershipApprovalRequired=");
        A10.append(this.A0F);
        A10.append(", addressingMode=");
        A10.append(this.A07);
        A10.append(", isReportToAdminEnabled=");
        A10.append(this.A0G);
        A10.append(", allowNonAdminSubgroupCreation=");
        A10.append(this.A09);
        A10.append(", historyEnabled=");
        A10.append(this.A0B);
        A10.append(", e2eeState=");
        A10.append(this.A00);
        A10.append(", isHiddenSubgroup=");
        return C17900vP.A0F(A10, this.A0D);
    }
}
