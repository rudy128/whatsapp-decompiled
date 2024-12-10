package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1Pk  reason: invalid class name and case insensitive filesystem */
public final class C25731Pk {
    public final AnonymousClass1PW A00;
    public final C25721Pj A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C19880zA A05;
    public final AnonymousClass190 A06;
    public final AnonymousClass11S A07;
    public final AnonymousClass1M9 A08;
    public final AnonymousClass1CJ A09;

    public C25731Pk(C19880zA r2, AnonymousClass190 r3, AnonymousClass11S r4, AnonymousClass1PW r5, C25721Pj r6, AnonymousClass1M9 r7, AnonymousClass118 r8, AnonymousClass1CJ r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r8, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r9, 5);
        C18070vi.A0d(r7, 6);
        C18070vi.A0d(r10, 7);
        C18070vi.A0d(r11, 8);
        C18070vi.A0d(r6, 9);
        C18070vi.A0d(r2, 10);
        this.A06 = r3;
        this.A02 = r8;
        this.A07 = r4;
        this.A00 = r5;
        this.A09 = r9;
        this.A08 = r7;
        this.A04 = r10;
        this.A03 = r11;
        this.A01 = r6;
        this.A05 = r2;
    }

    public boolean A02(AnonymousClass1BI r6) {
        if (r6 != null && A00() && !C42701yb.A01(r6) && !this.A07.A0O(r6)) {
            AnonymousClass1E7 A0D = this.A08.A0D(r6);
            if (A0D == null) {
                this.A06.A0G("BonsaiMentionsImpl/isChatEligibleForBotInvoke/", "contact not in cache", false);
            } else if ((!C22971Dz.A0d(r6) || !new C63852tn((C25491Ok) null, A0D, (UserJid) r6).A03()) && !C22971Dz.A0S(r6) && (C22971Dz.A0d(r6) || C22971Dz.A0W(r6))) {
                return true;
            }
        }
        return false;
    }

    public boolean A00() {
        AnonymousClass4W5.A00(this.A05);
        AnonymousClass1PW r1 = this.A00;
        if (!r1.A08() || !((AnonymousClass1UD) r1.A01.get()).A08()) {
            return false;
        }
        return true;
    }

    public boolean A01(AnonymousClass1BI r4) {
        if (A02(r4)) {
            AnonymousClass1CJ r1 = this.A09;
            if (r1.A0R(r4) || (r4 != null && C43391zj.A04(this.A08, r1, r4))) {
                return false;
            }
            return true;
        }
        return false;
    }
}
