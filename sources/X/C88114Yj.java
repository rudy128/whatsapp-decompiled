package X;

/* renamed from: X.4Yj  reason: invalid class name and case insensitive filesystem */
public final class C88114Yj {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;

    public static void A00(C88114Yj r3) {
        r3.A0F = true;
        r3.A0E = true;
        r3.A06 = true;
        r3.A00 = -1;
        r3.A0H = false;
        r3.A08 = true;
        r3.A04 = true;
        r3.A0I = false;
        r3.A07 = true;
        r3.A05 = true;
        r3.A09 = false;
        r3.A0G = false;
        r3.A0B = true;
        r3.A0A = false;
        r3.A0C = false;
        r3.A02 = false;
        r3.A03 = false;
        r3.A01 = false;
        r3.A0D = true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88114Yj) {
                C88114Yj r5 = (C88114Yj) obj;
                if (!(this.A0F == r5.A0F && this.A0E == r5.A0E && this.A06 == r5.A06 && this.A00 == r5.A00 && this.A0H == r5.A0H && this.A08 == r5.A08 && this.A04 == r5.A04 && this.A0I == r5.A0I && this.A07 == r5.A07 && this.A05 == r5.A05 && this.A09 == r5.A09 && this.A0G == r5.A0G && this.A0B == r5.A0B && this.A0A == r5.A0A && this.A0C == r5.A0C && this.A02 == r5.A02 && this.A03 == r5.A03 && this.A01 == r5.A01 && this.A0D == r5.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A0F), this.A0E), this.A06) + this.A00) * 31, this.A0H), this.A08), this.A04), this.A0I), this.A07), this.A05), this.A09), this.A0G), this.A0B), this.A0A), this.A0C), this.A02), this.A03), this.A01), this.A0D) + 1237;
    }

    public C88114Yj() {
        A00(this);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CommunitySubgroupViewOptions(showParticipating=");
        A10.append(this.A0F);
        A10.append(", showNonParticipating=");
        A10.append(this.A0E);
        A10.append(", showAuxiliaryViews=");
        A10.append(this.A06);
        A10.append(", subgroupLimit=");
        A10.append(this.A00);
        A10.append(", updateLastSeenOnInit=");
        A10.append(this.A0H);
        A10.append(", showDescription=");
        A10.append(this.A08);
        A10.append(", showActions=");
        A10.append(this.A04);
        A10.append(", useUpdatedDesign=");
        A10.append(this.A0I);
        A10.append(", showCagInGroupsSection=");
        A10.append(this.A07);
        A10.append(", showAddGroup=");
        A10.append(this.A05);
        A10.append(", showEditActions=");
        A10.append(this.A09);
        A10.append(", showViewGroups=");
        A10.append(this.A0G);
        A10.append(", showGroupsSection=");
        A10.append(this.A0B);
        A10.append(", showEmptyGroupsUpsellSection=");
        A10.append(this.A0A);
        A10.append(", showInlineMembersSection=");
        A10.append(this.A0C);
        A10.append(", isShowMemberSuggestedGroups=");
        A10.append(this.A02);
        A10.append(", isShowUpcomingEvents=");
        A10.append(this.A03);
        A10.append(", isShowEventsBanner=");
        A10.append(this.A01);
        A10.append(", showLockedChats=");
        A10.append(this.A0D);
        A10.append(", isShowCommunityCreationBanner=");
        return C17900vP.A0F(A10, false);
    }
}
