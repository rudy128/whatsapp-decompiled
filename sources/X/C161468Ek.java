package X;

import android.os.Bundle;

/* renamed from: X.8Ek  reason: invalid class name and case insensitive filesystem */
public abstract class C161468Ek extends AnonymousClass1FL implements AnonymousClass009 {
    public C006302u A00;
    public final Object A01 = C17880vN.A0p();
    public volatile C006002q A02;

    public abstract void A2n();

    public final C006002q A2m() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C006002q(this);
                }
            }
        }
        return this.A02;
    }

    public C161468Ek() {
        AGE.A00(this, 15);
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A00(this, super.BQR());
    }

    public final Object generatedComponent() {
        return A2m().generatedComponent();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof AnonymousClass009) {
            C006302u A002 = A2m().A00();
            this.A00 = A002;
            AnonymousClass8BW.A14(this, A002);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass8BT.A1L(this.A00);
    }
}
