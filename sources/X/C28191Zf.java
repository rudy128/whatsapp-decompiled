package X;

import android.view.WindowInsets;

/* renamed from: X.1Zf  reason: invalid class name and case insensitive filesystem */
public class C28191Zf extends C28181Ze {
    public final WindowInsets.Builder A00;

    public void A02(C33321id r3) {
        this.A00.setMandatorySystemGestureInsets(r3.A03());
    }

    public void A03(C33321id r3) {
        this.A00.setStableInsets(r3.A03());
    }

    public void A04(C33321id r3) {
        this.A00.setSystemGestureInsets(r3.A03());
    }

    public void A05(C33321id r3) {
        this.A00.setSystemWindowInsets(r3.A03());
    }

    public void A06(C33321id r3) {
        this.A00.setTappableElementInsets(r3.A03());
    }

    public C28191Zf(AnonymousClass1HO r3) {
        super(r3);
        WindowInsets.Builder builder;
        WindowInsets A06 = r3.A06();
        if (A06 == null) {
            builder = new WindowInsets.Builder();
        }
        this.A00 = builder;
    }

    public AnonymousClass1HO A00() {
        A01();
        WindowInsets build = this.A00.build();
        AnonymousClass1HO r0 = AnonymousClass1HO.A01;
        C28111Yx.A02(build);
        AnonymousClass1HO r3 = new AnonymousClass1HO(build);
        C33321id[] r2 = this.A00;
        AnonymousClass1ZX r1 = r3.A00;
        if (r1 instanceof AnonymousClass1ZY) {
            ((AnonymousClass1ZY) r1).A03 = r2;
        }
        return r3;
    }

    public C28191Zf() {
        this.A00 = new WindowInsets.Builder();
    }
}
