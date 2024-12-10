package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.7Jl  reason: invalid class name and case insensitive filesystem */
public final class C144987Jl implements C25471Oi {
    public final AnonymousClass1R3 A00;
    public final AnonymousClass18K A01;
    public final C200710s A02;
    public final AnonymousClass1PM A03;
    public final C25491Ok A04;
    public final C18030ve A05;
    public final AnonymousClass12L A06;
    public final AnonymousClass00H A07;

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvr(C166278cd r1, AnonymousClass206 r2, C63362sw r3) {
    }

    public void Bvt(C63362sw r5) {
        C18070vi.A0d(r5, 0);
        AnonymousClass1BI r3 = r5.A0B.A00;
        C17960vV.A07(r3);
        C18070vi.A0X(r3);
        this.A02.execute(new AnonymousClass7RD(this, r3, 13));
    }

    public static final Integer A00(AnonymousClass1BI r5, C144987Jl r6) {
        int i;
        C18030ve r3 = r6.A05;
        AnonymousClass1PM r1 = r6.A03;
        UserJid A002 = C22941Dw.A00(r5);
        AnonymousClass12L r4 = r6.A06;
        if (C87454Vq.A01(r1, r3, r4, A002)) {
            i = 2;
        } else if (!C88424Zq.A00(r1, r6.A04, r3, r4, A002, (C145887Mz) C18070vi.A0E(r6.A07))) {
            return null;
        } else {
            i = 1;
        }
        return Integer.valueOf(i);
    }

    public final void A01(int i) {
        C1180561z r1 = new C1180561z();
        r1.A00 = Integer.valueOf(i);
        this.A01.CC7(r1);
    }

    public C144987Jl(AnonymousClass1PM r2, C25491Ok r3, AnonymousClass1R3 r4, C18030ve r5, AnonymousClass12L r6, AnonymousClass18K r7, AnonymousClass10I r8, AnonymousClass00H r9) {
        C18070vi.A0w(r5, r8, r7, r6, r4);
        C18070vi.A0q(r3, r9, r2);
        this.A05 = r5;
        this.A01 = r7;
        this.A06 = r6;
        this.A00 = r4;
        this.A04 = r3;
        this.A07 = r9;
        this.A03 = r2;
        this.A02 = C200710s.A00(r8);
    }

    public String BSr() {
        return "GatingAnalyticsManager";
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }
}
