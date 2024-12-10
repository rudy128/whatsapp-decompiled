package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.34i  reason: invalid class name and case insensitive filesystem */
public final class C686934i implements C25471Oi, AnonymousClass3M6 {
    public final C18030ve A00;
    public final AnonymousClass1MB A01;
    public final C19880zA A02;
    public final AnonymousClass121 A03;
    public final AnonymousClass1PV A04;

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvt(C63362sw r1) {
    }

    public /* synthetic */ void CB9(C63362sw r1, C29621ca r2) {
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }

    public C686934i(C19880zA r1, AnonymousClass121 r2, C18030ve r3, AnonymousClass1MB r4, AnonymousClass1PV r5) {
        C18070vi.A0w(r3, r5, r4, r2, r1);
        this.A00 = r3;
        this.A04 = r5;
        this.A01 = r4;
        this.A03 = r2;
        this.A02 = r1;
    }

    public String BSr() {
        return "IncomingBizBotMessageHandler";
    }

    public void Bvr(C166278cd r5, AnonymousClass206 r6, C63362sw r7) {
        C688334w r3;
        UserJid A05;
        AnonymousClass2M8 A002;
        C18070vi.A0i(r7, r6);
        if (!(r6 instanceof C439721q) && (r3 = (C688334w) C63362sw.A00(r7, C688334w.class)) != null) {
            if (r3.A00 == 1 && this.A01.A03(r7.A05())) {
                if (!C18020vd.A05(C18040vf.A02, this.A00, 10107)) {
                    r6.A0b(8388608);
                }
            }
            if (!(r6 instanceof AnonymousClass23U) && (A05 = r7.A05()) != null && (A002 = this.A04.A00(A05, r6, r3)) != null && !this.A01.A03(r6.A0v.A00)) {
                if (!C18020vd.A05(C18040vf.A02, this.A00, 10126)) {
                    this.A03.BBY(A002);
                }
            }
            C19880zA r1 = this.A02;
            if (r1.A07()) {
                r1.A03();
                throw AnonymousClass000.A0s("onFMessageBuilt");
            }
        }
    }

    public /* synthetic */ long CBC(C29621ca r3) {
        return 0;
    }

    public /* bridge */ /* synthetic */ B5K CBD(C194979sb r5, C29621ca r6) {
        C29621ca A0K;
        boolean A15 = C18070vi.A15(r6, r5);
        if ((C18020vd.A05(C18040vf.A02, this.A00, 4873) || this.A01.A03(r5.A02)) && (A0K = r6.A0K("bot")) != null) {
            return new C688334w(A0K.A0A("biz_bot", A15 ? 1 : 0));
        }
        return null;
    }

    public /* synthetic */ boolean CM6(C63362sw r2) {
        return false;
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }
}
