package X;

/* renamed from: X.4fc  reason: invalid class name and case insensitive filesystem */
public class C91394fc implements AnonymousClass1GE, C218317o {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;

    public C91394fc(C23381Fv r2, C87764Ww r3) {
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BrH(AnonymousClass1F9 r4) {
        if (this.A00 == 0) {
            ((C23381Fv) this.A01).A06(this);
            C87764Ww r2 = (C87764Ww) this.A02;
            r2.A02 = false;
            C23381Fv r0 = r2.A00;
            if (r0 != null && ((C23391Fw) r0).A02.A00(C23401Fx.RESUMED)) {
                C87764Ww.A00(r2);
            }
        }
    }

    public /* synthetic */ void C0B(AnonymousClass1F9 r3) {
        if (this.A00 != 0) {
            ((C77953rs) this.A02).A01.unregisterObserver(this.A01);
        }
    }

    public /* synthetic */ void C3z(AnonymousClass1F9 r3) {
        if (this.A00 != 0) {
            ((C77953rs) this.A02).A01.registerObserver(this.A01);
        }
    }

    public /* synthetic */ void C6E() {
    }

    public /* synthetic */ void BqQ(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C71(AnonymousClass1F9 r1) {
    }

    public C91394fc(C77953rs r3) {
        this.A02 = r3;
        this.A01 = new C94164k9(r3, 14);
    }
}
