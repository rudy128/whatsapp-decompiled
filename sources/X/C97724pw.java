package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4pw  reason: invalid class name and case insensitive filesystem */
public final class C97724pw implements C108145bC {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass1PM A01;
    public final C25491Ok A02;
    public final C18030ve A03;
    public final AnonymousClass12L A04;
    public final AnonymousClass00H A05;

    public /* synthetic */ boolean Bfz(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 1);
        return BgC(r2);
    }

    public boolean BgC(AnonymousClass206 r8) {
        AnonymousClass1E7 A002;
        C18070vi.A0d(r8, 0);
        C18030ve r2 = this.A03;
        AnonymousClass12L r6 = this.A04;
        AnonymousClass1M9 r5 = this.A00;
        C25491Ok r4 = this.A02;
        C145887Mz r1 = (C145887Mz) C18070vi.A0E(this.A05);
        AnonymousClass1PM r3 = this.A01;
        C18070vi.A0d(r1, 4);
        boolean A012 = C88424Zq.A01(r2, r1);
        boolean z = false;
        if (A012 && (A002 = AnonymousClass25G.A00(r5, r8)) != null) {
            UserJid A0x = AnonymousClass3MZ.A0x(A002);
            if (!C1402170l.A01(r6, A0x) && new C63852tn(r3, r4, A0x).A03()) {
                z = true;
            }
        }
        return !z;
    }

    public C97724pw(AnonymousClass1M9 r2, AnonymousClass1PM r3, C25491Ok r4, C18030ve r5, AnonymousClass12L r6, AnonymousClass00H r7) {
        C18070vi.A0w(r5, r6, r2, r4, r7);
        C18070vi.A0d(r3, 6);
        this.A03 = r5;
        this.A04 = r6;
        this.A00 = r2;
        this.A02 = r4;
        this.A05 = r7;
        this.A01 = r3;
    }
}
