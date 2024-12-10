package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4nG  reason: invalid class name and case insensitive filesystem */
public final class C96074nG implements C108545bs {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass1PM A01;
    public final C25491Ok A02;
    public final C18030ve A03;
    public final AnonymousClass12L A04;
    public final AnonymousClass00H A05;

    public Boolean Bg4(AnonymousClass206 r10) {
        AnonymousClass1E7 A002;
        C18070vi.A0d(r10, 0);
        C18030ve r6 = this.A03;
        AnonymousClass12L r5 = this.A04;
        AnonymousClass1M9 r4 = this.A00;
        C25491Ok r8 = this.A02;
        C145887Mz r1 = (C145887Mz) C18070vi.A0E(this.A05);
        AnonymousClass1PM r3 = this.A01;
        C18070vi.A0d(r1, 4);
        boolean z = false;
        if (C88424Zq.A01(r6, r1) && (A002 = AnonymousClass25G.A00(r4, r10)) != null) {
            UserJid A0x = AnonymousClass3MZ.A0x(A002);
            if (!C1402170l.A01(r5, A0x) && new C63852tn(r3, r8, A0x).A03()) {
                z = true;
            }
        }
        if (z || C87454Vq.A00(r4, r3, r6, r5, r10)) {
            return false;
        }
        return null;
    }

    public C96074nG(AnonymousClass1M9 r2, AnonymousClass1PM r3, C25491Ok r4, C18030ve r5, AnonymousClass12L r6, AnonymousClass00H r7) {
        C18070vi.A0w(r5, r6, r2, r4, r7);
        C18070vi.A0d(r3, 6);
        this.A03 = r5;
        this.A04 = r6;
        this.A00 = r2;
        this.A02 = r4;
        this.A05 = r7;
        this.A01 = r3;
    }

    public /* synthetic */ Boolean BeO(AnonymousClass206 r2) {
        return null;
    }

    public /* synthetic */ Boolean BfJ(AnonymousClass206 r2) {
        return null;
    }

    public /* synthetic */ Boolean Bg1(AnonymousClass206 r2) {
        return null;
    }

    public /* synthetic */ Boolean BgD(AnonymousClass206 r2) {
        return null;
    }

    public /* synthetic */ Boolean BgT(AnonymousClass206 r2) {
        return null;
    }

    public /* synthetic */ Boolean BgW(AnonymousClass206 r2) {
        return null;
    }
}
