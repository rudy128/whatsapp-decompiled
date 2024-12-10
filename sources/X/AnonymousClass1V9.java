package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.1V9  reason: invalid class name */
public final class AnonymousClass1V9 implements AnonymousClass1IV {
    public String A00;
    public final AnonymousClass18K A01;
    public final C200710s A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public AnonymousClass1V9(AnonymousClass18K r3, AnonymousClass10I r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r6, 4);
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = new C200710s(r4, false);
    }

    public final void A00(int i, int i2) {
        this.A02.execute(new C70823Cq((Object) null, i, (Object) this, i2, 1));
    }

    public final void A01(Integer num, int i, int i2) {
        this.A02.execute(new C70823Cq((Object) num, i, (Object) this, i2, 1));
    }

    public /* synthetic */ void Bmn() {
    }

    public void Bn7(C178119Bw r5) {
        this.A02.execute(new C21452AkJ(38, (String) null, this));
    }

    public void BnG(C178119Bw r5, boolean z) {
        this.A02.execute(new C21452AkJ(38, (String) null, this));
    }

    public /* synthetic */ void BnH(long j, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public void BnJ(C178119Bw r5) {
        C18070vi.A0d(r5, 0);
        this.A02.execute(new C21452AkJ(38, C40811vJ.A09(r5.A04.A02), this));
    }

    public /* synthetic */ void BnK(AnonymousClass1BI r1, CallState callState, String str) {
    }

    public /* synthetic */ void C5e() {
    }
}
