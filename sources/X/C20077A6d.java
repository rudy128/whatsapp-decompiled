package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.A6d  reason: case insensitive filesystem */
public final class C20077A6d {
    public int A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final AW0 A04;
    public final AnonymousClass1BI A05;
    public final UserJid A06;
    public final C166278cd A07;
    public final C166418cr A08;
    public final C166418cr A09;
    public final AnonymousClass205 A0A;
    public final AnonymousClass205 A0B;
    public final C63362sw A0C;
    public final C195079sl A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static C166418cr A01(C20077A6d a6d) {
        C18070vi.A0d(a6d, 0);
        return a6d.A08;
    }

    public final C20077A6d A03(C166418cr r41) {
        C166418cr r21 = r41;
        C18070vi.A0d(r21, 0);
        C166418cr r22 = this.A09;
        C63362sw r19 = this.A0C;
        C166278cd r20 = this.A07;
        AW0 aw0 = this.A04;
        AnonymousClass205 r23 = this.A0B;
        AnonymousClass205 r17 = this.A0A;
        AnonymousClass1BI r15 = this.A05;
        long j = this.A03;
        boolean z = this.A0J;
        boolean z2 = this.A0K;
        boolean z3 = this.A0L;
        int i = this.A00;
        String str = this.A0H;
        String str2 = this.A0F;
        String str3 = this.A0I;
        String str4 = this.A0G;
        String str5 = this.A0E;
        UserJid userJid = this.A06;
        C195079sl r2 = this.A0D;
        AnonymousClass205 r24 = r17;
        C63362sw r25 = r19;
        return new C20077A6d(aw0, r15, userJid, r20, r21, r22, r23, r24, r25, r2, str, str2, str3, str4, str5, i, j, z, z2, z3, this.A02, this.A01);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20077A6d) {
                C20077A6d a6d = (C20077A6d) obj;
                if (!C18070vi.A18(this.A08, a6d.A08) || !C18070vi.A18(this.A09, a6d.A09) || !C18070vi.A18(this.A0C, a6d.A0C) || !C18070vi.A18(this.A07, a6d.A07) || !C18070vi.A18(this.A04, a6d.A04) || !C18070vi.A18(this.A0B, a6d.A0B) || !C18070vi.A18(this.A0A, a6d.A0A) || !C18070vi.A18(this.A05, a6d.A05) || this.A03 != a6d.A03 || this.A0J != a6d.A0J || this.A0K != a6d.A0K || this.A0L != a6d.A0L || this.A00 != a6d.A00 || !C18070vi.A18(this.A0H, a6d.A0H) || !C18070vi.A18(this.A0F, a6d.A0F) || !C18070vi.A18(this.A0I, a6d.A0I) || !C18070vi.A18(this.A0G, a6d.A0G) || !C18070vi.A18(this.A0E, a6d.A0E) || !C18070vi.A18(this.A06, a6d.A06) || !C18070vi.A18(this.A0D, a6d.A0D) || this.A02 != a6d.A02 || this.A01 != a6d.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static C166368cm A00(C20077A6d a6d) {
        C166368cm r0 = a6d.A08.protocolMessage_;
        if (r0 == null) {
            return C166368cm.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public final AnonymousClass23U A04(int i) {
        byte[] A0M;
        C195079sl r1 = this.A0D;
        if (r1 != null) {
            A0M = r1.A01;
        } else {
            A0M = this.A09.A0M();
        }
        AnonymousClass205 r10 = this.A0A;
        long j = this.A03;
        AnonymousClass23U r9 = new AnonymousClass23U(r10, A0M, 2, this.A00, j);
        r9.A00 = i;
        if (r1 != null) {
            String str = r10.A01;
            C18070vi.A0X(str);
            C196899vp.A01(r9, new C20948Ac2(r1.A00, str, r1.A02, r1.A03, (byte[]) null, (byte[]) null, j));
        }
        return r9;
    }

    public final boolean A05() {
        if (this.A0K || this.A0L) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int A0L2 = AnonymousClass000.A0L(this.A08);
        int A0N = AnonymousClass000.A0N(this.A0B, (((((AnonymousClass000.A0N(this.A09, A0L2) + AnonymousClass001.A0k(this.A0C)) * 31) + AnonymousClass001.A0k(this.A07)) * 31) + AnonymousClass001.A0k(this.A04)) * 31);
        return C17880vN.A01(AnonymousClass0DV.A00((((((((((((((((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass001.A0K(this.A03, (AnonymousClass000.A0N(this.A0A, A0N) + AnonymousClass001.A0k(this.A05)) * 31), this.A0J), this.A0K), this.A0L) + this.A00) * 31) + C17900vP.A00(this.A0H)) * 31) + C17900vP.A00(this.A0F)) * 31) + C17900vP.A00(this.A0I)) * 31) + C17900vP.A00(this.A0G)) * 31) + C17900vP.A00(this.A0E)) * 31) + AnonymousClass001.A0k(this.A06)) * 31) + C17880vN.A02(this.A0D)) * 31, this.A02), this.A01);
    }

    public C20077A6d(AW0 aw0, AnonymousClass1BI r4, UserJid userJid, C166278cd r6, C166418cr r7, C166418cr r8, AnonymousClass205 r9, AnonymousClass205 r10, C63362sw r11, C195079sl r12, String str, String str2, String str3, String str4, String str5, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A08 = r7;
        this.A09 = r8;
        this.A0C = r11;
        this.A07 = r6;
        this.A04 = aw0;
        this.A0B = r9;
        this.A0A = r10;
        this.A05 = r4;
        this.A03 = j;
        this.A0J = z;
        this.A0K = z2;
        this.A0L = z3;
        this.A00 = i;
        this.A0H = str;
        this.A0F = str2;
        this.A0I = str3;
        this.A0G = str4;
        this.A0E = str5;
        this.A06 = userJid;
        this.A0D = r12;
        this.A02 = z4;
        this.A01 = z5;
    }

    public static void A02(C20077A6d a6d, C166248ca r8, AnonymousClass21W r9, C19969A1e a1e) {
        C166248ca r2 = r8;
        AnonymousClass21W r3 = r9;
        C19969A1e a1e2 = a1e;
        a1e2.A03(r2, r3, a6d.A00, a6d.A05(), a6d.A0L);
        C19969A1e.A00(r8, r9, a6d.A00, a6d.A0K);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParseE2EMessageParams(e2eMessage=");
        A10.append(this.A08);
        A10.append(", originalE2eMessage=");
        A10.append(this.A09);
        A10.append(", incomingE2eStanza=");
        A10.append(this.A0C);
        A10.append(", contextInfo=");
        A10.append(this.A07);
        A10.append(", paymentTransactionInfo=");
        A10.append(this.A04);
        A10.append(", originalMessageKey=");
        A10.append(this.A0B);
        A10.append(", messageKey=");
        A10.append(this.A0A);
        A10.append(", chatJid=");
        A10.append(this.A05);
        A10.append(", timestamp=");
        A10.append(this.A03);
        A10.append(", includeQuotedMessage=");
        A10.append(this.A0J);
        A10.append(", isHistorySyncMessage=");
        A10.append(this.A0K);
        A10.append(", isQuotedMessage=");
        A10.append(this.A0L);
        A10.append(", editedVersion=");
        A10.append(this.A00);
        A10.append(", messageTypeAttribute=");
        A10.append(this.A0H);
        A10.append(", hsmCategory=");
        A10.append(this.A0F);
        A10.append(", nativeFlowName=");
        A10.append(this.A0I);
        A10.append(", hsmTag=");
        A10.append(this.A0G);
        A10.append(", commentThreadMsgId=");
        A10.append(this.A0E);
        A10.append(", commentMsgSenderJid=");
        A10.append(this.A06);
        A10.append(", reportingInfo=");
        A10.append(this.A0D);
        A10.append(", skipCommentFlagProcessing=");
        A10.append(this.A02);
        A10.append(", isPremiumMessage=");
        return C17900vP.A0F(A10, this.A01);
    }
}
