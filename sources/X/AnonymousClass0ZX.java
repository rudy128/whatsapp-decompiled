package X;

import androidx.car.app.IOnDoneCallback;

/* renamed from: X.0ZX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0ZX implements Runnable {
    public final /* synthetic */ IOnDoneCallback A00;
    public final /* synthetic */ C15970rV A01;
    public final /* synthetic */ C23381Fv A02;
    public final /* synthetic */ String A03;

    public static /* synthetic */ void A00(IOnDoneCallback iOnDoneCallback, C15970rV r3, C23381Fv r4, String str) {
        if (r4 == null || !r4.A04().A00(C23401Fx.CREATED)) {
            C04400Nd.A02(iOnDoneCallback, str, AnonymousClass000.A0n(AnonymousClass001.A1E(r3, "Lifecycle is not at least created when dispatching ", AnonymousClass000.A10())));
        } else {
            C04400Nd.A01(iOnDoneCallback, r3, str);
        }
    }

    public final void run() {
        C23381Fv r3 = this.A02;
        A00(this.A00, this.A01, r3, this.A03);
    }

    public /* synthetic */ AnonymousClass0ZX(IOnDoneCallback iOnDoneCallback, C15970rV r2, C23381Fv r3, String str) {
        this.A02 = r3;
        this.A00 = iOnDoneCallback;
        this.A03 = str;
        this.A01 = r2;
    }
}
