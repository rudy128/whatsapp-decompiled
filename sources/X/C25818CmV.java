package X;

import java.util.List;

/* renamed from: X.CmV  reason: case insensitive filesystem */
public final class C25818CmV {
    public final int A00;
    public final long A01;
    public final AnonymousClass6TT A02;
    public final AnonymousClass205 A03;
    public final AnonymousClass205 A04;
    public final C25550Cho A05;
    public final CM2 A06;
    public final C441822l A07;
    public final Boolean A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25818CmV) {
                C25818CmV cmV = (C25818CmV) obj;
                if (!(C18070vi.A18(this.A03, cmV.A03) && C18070vi.A18(this.A0A, cmV.A0A) && C18070vi.A18(this.A05, cmV.A05) && C18070vi.A18(this.A06, cmV.A06) && C18070vi.A18(this.A0B, cmV.A0B) && C18070vi.A18(this.A08, cmV.A08) && C18070vi.A18(this.A02, cmV.A02) && this.A0C == cmV.A0C && this.A00 == cmV.A00 && this.A0K == cmV.A0K && this.A0F == cmV.A0F && this.A0D == cmV.A0D && this.A0E == cmV.A0E && this.A01 == cmV.A01 && C18070vi.A18(this.A07, cmV.A07) && this.A0I == cmV.A0I && C18070vi.A18(this.A04, cmV.A04) && C18070vi.A18(this.A09, cmV.A09) && this.A0G == cmV.A0G && this.A0H == cmV.A0H && this.A0J == cmV.A0J)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        CM2 cm2 = this.A06;
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00((((AnonymousClass0DV.A00((AnonymousClass001.A0K(this.A01, AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A02, (((AnonymousClass000.A0N(cm2, ((((AnonymousClass001.A0k(this.A03) * 31) + C17900vP.A00(this.A0A)) * 31) + AnonymousClass001.A0k(this.A05)) * 31) + AnonymousClass001.A0k(this.A0B)) * 31) + AnonymousClass001.A0k(this.A08)) * 31), this.A0C) + this.A00) * 31, this.A0K), this.A0F), this.A0D), this.A0E)) + AnonymousClass001.A0k(this.A07)) * 31, this.A0I) + AnonymousClass001.A0k(this.A04)) * 31) + C108955ca.A06(this.A09)) * 31, this.A0G), this.A0H), this.A0J);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (r1 == null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r8 = this;
            r0 = 20
            X.1D6[] r2 = new X.AnonymousClass1D6[r0]
            X.205 r0 = r8.A03
            java.lang.String r3 = "null"
            if (r0 == 0) goto L_0x0156
            java.lang.String r1 = "[FMessageKey]"
        L_0x000c:
            java.lang.String r0 = "messageKey"
            X.C72463Mc.A1H(r0, r1, r2)
            java.lang.String r0 = r8.A0A
            if (r0 == 0) goto L_0x0153
            java.lang.String r1 = "[String]"
        L_0x0017:
            java.lang.String r0 = "rawTranscriptionText"
            X.C108985cd.A1G(r0, r1, r2)
            X.Cho r0 = r8.A05
            if (r0 == 0) goto L_0x0150
            java.lang.String r1 = "[Locale]"
        L_0x0022:
            java.lang.String r0 = "transcriptionRequestLocale"
            X.C72463Mc.A1I(r0, r1, r2)
            java.lang.String r1 = "transcriptionStatus"
            X.CM2 r0 = r8.A06
            X.C72463Mc.A1J(r1, r0, r2)
            java.util.List r4 = r8.A0B
            if (r4 == 0) goto L_0x0043
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "[List size="
            X.C17890vO.A15(r0, r1, r4)
            r0 = 93
            java.lang.String r1 = X.C17890vO.A0c(r1, r0)
            if (r1 != 0) goto L_0x0044
        L_0x0043:
            r1 = r3
        L_0x0044:
            java.lang.String r0 = "transcriptionSegments"
            X.AnonymousClass8BW.A1L(r0, r1, r2)
            java.lang.String r1 = "transcriptionFeedbackSubmitted"
            java.lang.Boolean r0 = r8.A08
            X.BE9.A1E(r1, r0, r2)
            java.lang.String r1 = "modelDownloadStatus"
            X.6TT r0 = r8.A02
            X.BE9.A1F(r1, r0, r2)
            boolean r0 = r8.A0C
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isBeingTranscribed"
            X.1D6 r1 = X.AnonymousClass1D6.A01(r0, r1)
            r0 = 7
            r2[r0] = r1
            int r0 = r8.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "visiblePageCount"
            X.1D6 r1 = X.AnonymousClass1D6.A01(r0, r1)
            r0 = 8
            r2[r0] = r1
            boolean r0 = r8.A0K
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "userSettingIsEnabled"
            X.1D6 r1 = X.AnonymousClass1D6.A01(r0, r1)
            r0 = 9
            r2[r0] = r1
            boolean r0 = r8.A0F
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isMessageEligibleForTranscription"
            X.1D6 r1 = X.AnonymousClass1D6.A01(r0, r1)
            r0 = 10
            r2[r0] = r1
            boolean r0 = r8.A0D
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isGlobalLanguageSelectionRequired"
            X.1D6 r1 = X.AnonymousClass1D6.A01(r0, r1)
            r0 = 11
            r2[r0] = r1
            boolean r0 = r8.A0E
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isManualMessageButtonEnabled"
            X.1D6 r1 = X.AnonymousClass1D6.A01(r0, r1)
            r0 = 12
            r2[r0] = r1
            long r6 = r8.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r4 = -1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00c4
            if (r1 != 0) goto L_0x00c6
        L_0x00c4:
            java.lang.String r1 = "[Long]"
        L_0x00c6:
            java.lang.String r0 = "pttLengthValue"
            X.1D6 r1 = X.AnonymousClass1D6.A01(r0, r1)
            r0 = 13
            r2[r0] = r1
            X.22l r0 = r8.A07
            if (r0 == 0) goto L_0x014e
            java.lang.String r1 = "[FMessageAudio]"
        L_0x00d6:
            java.lang.String r0 = "message"
            X.1D6 r1 = X.AnonymousClass1D6.A01(r0, r1)
            r0 = 14
            r2[r0] = r1
            boolean r0 = r8.A0I
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isUpsellEnabled"
            X.1D6 r1 = X.AnonymousClass1D6.A01(r0, r1)
            r0 = 15
            r2[r0] = r1
            X.205 r0 = r8.A04
            if (r0 == 0) goto L_0x00f6
            java.lang.String r3 = "[FMessageKey"
        L_0x00f6:
            java.lang.String r0 = "statusLineCandidateMessageKey"
            X.1D6 r1 = X.AnonymousClass1D6.A01(r0, r3)
            r0 = 16
            r2[r0] = r1
            boolean r0 = r8.A0G
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isTranscriptionManuallyRequestedSinceAppStart"
            X.1D6 r1 = X.AnonymousClass1D6.A01(r0, r1)
            r0 = 17
            r2[r0] = r1
            boolean r0 = r8.A0H
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isTranscriptionManuallyRequestedSinceChatOpen"
            X.1D6 r1 = X.AnonymousClass1D6.A01(r0, r1)
            r0 = 18
            r2[r0] = r1
            boolean r0 = r8.A0J
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "shouldUseDynamicTimestampPositioning"
            X.1D6 r1 = X.AnonymousClass1D6.A01(r0, r1)
            r0 = 19
            r2[r0] = r1
            java.util.LinkedHashMap r1 = X.AnonymousClass1D7.A0B(r2)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "TranscriptionViewModel.State("
            r3.append(r0)
            java.util.Set r2 = r1.entrySet()
            java.lang.String r1 = ", "
            X.DsA r0 = X.C28150DsA.A00
            java.lang.String r0 = X.C29431cG.A0h(r1, r2, r0)
            java.lang.String r0 = X.C17900vP.A0B(r0, r3)
            return r0
        L_0x014e:
            r1 = r3
            goto L_0x00d6
        L_0x0150:
            r1 = r3
            goto L_0x0022
        L_0x0153:
            r1 = r3
            goto L_0x0017
        L_0x0156:
            r1 = r3
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25818CmV.toString():java.lang.String");
    }

    public C25818CmV(AnonymousClass6TT r2, AnonymousClass205 r3, AnonymousClass205 r4, C25550Cho cho, CM2 cm2, C441822l r7, Boolean bool, String str, String str2, List list, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A03 = r3;
        this.A0A = str;
        this.A05 = cho;
        this.A06 = cm2;
        this.A0B = list;
        this.A08 = bool;
        this.A02 = r2;
        this.A0C = z;
        this.A00 = i;
        this.A0K = z2;
        this.A0F = z3;
        this.A0D = z4;
        this.A0E = z5;
        this.A01 = j;
        this.A07 = r7;
        this.A0I = z6;
        this.A04 = r4;
        this.A09 = str2;
        this.A0G = z7;
        this.A0H = z8;
        this.A0J = z9;
    }

    public C25818CmV() {
        this(C119926Al.A00, (AnonymousClass205) null, (AnonymousClass205) null, (C25550Cho) null, C24127Bvt.A00, (C441822l) null, (Boolean) null, (String) null, (String) null, (List) null, 1, -1, false, false, false, false, false, false, false, false, false);
    }
}
