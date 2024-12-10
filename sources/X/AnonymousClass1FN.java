package X;

import android.os.Bundle;

/* renamed from: X.1FN  reason: invalid class name */
public abstract class AnonymousClass1FN extends AnonymousClass01E implements AnonymousClass009 {
    public C006302u A00;
    public boolean A01 = false;
    public final Object A02 = new Object();
    public volatile C006002q A03;

    private void A00() {
        A2L(new C64802vM(this, 5));
    }

    /* renamed from: A2x */
    public final C006002q A30() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new C006002q(this);
                }
            }
        }
        return this.A03;
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            ((AnonymousClass1FO) this).A01 = AnonymousClass1K1.A1X((AnonymousClass1K1) ((C006602x) A30().generatedComponent()));
        }
    }

    public void A2z() {
        new C006002q(this);
    }

    public AnonymousClass1FN(int i) {
        super(i);
        A00();
    }

    private void A03() {
        if (getApplication() instanceof AnonymousClass009) {
            C006302u A002 = A30().A00();
            this.A00 = A002;
            if (A002.A00 == null) {
                A002.A00 = BQQ();
            }
        }
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A00(this, super.BQR());
    }

    public final Object generatedComponent() {
        return A30().generatedComponent();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A03();
    }

    public void onDestroy() {
        super.onDestroy();
        C006302u r1 = this.A00;
        if (r1 != null) {
            r1.A00 = null;
        }
    }

    public AnonymousClass1FN() {
        A00();
    }
}
