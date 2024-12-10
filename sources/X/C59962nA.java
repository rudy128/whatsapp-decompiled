package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.2nA  reason: invalid class name and case insensitive filesystem */
public final class C59962nA {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final C63262sm A09;
    public final AnonymousClass1EC A0A;
    public final AnonymousClass1EC A0B;
    public final UserJid A0C;
    public final C42661yX A0D;
    public final C29741cn A0E;
    public final String A0F;
    public final String A0G;
    public final Map A0H;
    public final Map A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59962nA) {
                C59962nA r8 = (C59962nA) obj;
                if (!(C18070vi.A18(this.A0A, r8.A0A) && C18070vi.A18(this.A0C, r8.A0C) && this.A07 == r8.A07 && C18070vi.A18(this.A0G, r8.A0G) && this.A08 == r8.A08 && this.A06 == r8.A06 && this.A05 == r8.A05 && C18070vi.A18(this.A0D, r8.A0D) && this.A0M == r8.A0M && this.A0U == r8.A0U && this.A0L == r8.A0L && this.A0T == r8.A0T && this.A0S == r8.A0S && C18070vi.A18(this.A0E, r8.A0E) && this.A02 == r8.A02 && C18070vi.A18(this.A09, r8.A09) && this.A03 == r8.A03 && C18070vi.A18(this.A0B, r8.A0B) && C18070vi.A18(this.A0I, r8.A0I) && this.A0P == r8.A0P && this.A0Q == r8.A0Q && this.A00 == r8.A00 && C18070vi.A18(this.A0F, r8.A0F) && this.A04 == r8.A04 && this.A0J == r8.A0J && this.A0R == r8.A0R && this.A0K == r8.A0K && this.A0O == r8.A0O && this.A01 == r8.A01 && this.A0N == r8.A0N && C18070vi.A18(this.A0H, r8.A0H))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A07;
        int A0K2 = AnonymousClass001.A0K(this.A08, (AnonymousClass001.A0K(j, ((AnonymousClass001.A0k(this.A0A) * 31) + AnonymousClass001.A0k(this.A0C)) * 31) + C17900vP.A00(this.A0G)) * 31);
        C42661yX r0 = this.A0D;
        C63262sm r02 = this.A09;
        return AnonymousClass0DV.A00((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00((C17890vO.A02(this.A0F, (AnonymousClass0DV.A00(AnonymousClass0DV.A00((((((AnonymousClass000.A0N(r02, (((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(r0, (AnonymousClass001.A0K(this.A06, A0K2) + this.A05) * 31), this.A0M), this.A0U), this.A0L), this.A0T), this.A0S) + AnonymousClass001.A0k(this.A0E)) * 31) + this.A02) * 31) + this.A03) * 31) + AnonymousClass001.A0k(this.A0B)) * 31) + AnonymousClass001.A0k(this.A0I)) * 31, this.A0P), this.A0Q) + this.A00) * 31) + this.A04) * 31, this.A0J), this.A0R), this.A0K), this.A0O) + this.A01) * 31, this.A0N) + C17880vN.A02(this.A0H);
    }

    public C59962nA(C63262sm r3, AnonymousClass1EC r4, AnonymousClass1EC r5, UserJid userJid, C42661yX r7, C29741cn r8, String str, String str2, Map map, Map map2, int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.A0A = r4;
        this.A0C = userJid;
        this.A07 = j;
        this.A0G = str;
        this.A08 = j2;
        this.A06 = j3;
        this.A05 = i;
        this.A0D = r7;
        this.A0M = z;
        this.A0U = z2;
        this.A0L = z3;
        this.A0T = z4;
        this.A0S = z5;
        this.A0E = r8;
        this.A02 = i2;
        this.A09 = r3;
        this.A03 = i3;
        this.A0B = r5;
        this.A0I = map;
        this.A0P = z6;
        this.A0Q = z7;
        this.A00 = i4;
        this.A0F = str2;
        this.A04 = i5;
        this.A0J = z8;
        this.A0R = z9;
        this.A0K = z10;
        this.A0O = z11;
        this.A01 = i6;
        this.A0N = z12;
        this.A0H = map2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupInfo(gjid=");
        A10.append(this.A0A);
        A10.append(", creator=");
        A10.append(this.A0C);
        A10.append(", creation=");
        A10.append(this.A07);
        A10.append(", subject=");
        A10.append(this.A0G);
        A10.append(", subjectTimestampMs=");
        A10.append(this.A08);
        A10.append(", announcementVersion=");
        A10.append(this.A06);
        A10.append(", size=");
        A10.append(this.A05);
        A10.append(", gd=");
        A10.append(this.A0D);
        A10.append(", inAppSupport=");
        A10.append(this.A0M);
        A10.append(", restrictMode=");
        A10.append(this.A0U);
        A10.append(", announcementsOnly=");
        A10.append(this.A0L);
        A10.append(", noFrequentlyForwarded=");
        A10.append(this.A0T);
        A10.append(", isSuspended=");
        A10.append(this.A0S);
        A10.append(", growthLock=");
        A10.append(this.A0E);
        A10.append(", ephemeralDuration=");
        A10.append(this.A02);
        A10.append(", groupInfoContextData=");
        A10.append(this.A09);
        A10.append(", groupType=");
        A10.append(this.A03);
        A10.append(", linkedParentGroupJid=");
        A10.append(this.A0B);
        A10.append(", participantProtocolModels=");
        A10.append(this.A0I);
        A10.append(", isIncognito=");
        A10.append(this.A0P);
        A10.append(", isMembershipApprovalRequired=");
        A10.append(this.A0Q);
        A10.append(", defaultMembershipMode=");
        A10.append(this.A00);
        A10.append(", addressingMode=");
        A10.append(this.A0F);
        A10.append(", memberAddMode=");
        A10.append(this.A04);
        A10.append(", acknowledged=");
        A10.append(this.A0J);
        A10.append(", isReportToAdminEnabled=");
        A10.append(this.A0R);
        A10.append(", allowNonAdminSubgroupCreation=");
        A10.append(this.A0K);
        A10.append(", isHistoryEnabled=");
        A10.append(this.A0O);
        A10.append(", e2eeState=");
        A10.append(this.A01);
        A10.append(", isHiddenSubgroup=");
        A10.append(this.A0N);
        A10.append(", creatorsLidPhoneMap=");
        return AnonymousClass001.A1F(this.A0H, A10);
    }
}
