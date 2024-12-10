package X;

import android.util.Log;

/* renamed from: X.0ZW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0ZW implements Runnable {
    public final /* synthetic */ C15970rV A00;
    public final /* synthetic */ C23381Fv A01;
    public final /* synthetic */ String A02;

    public static /* synthetic */ void A00(C15970rV r4, C23381Fv r5, String str) {
        if (r5 != null) {
            try {
                if (r5.A04().A00(C23401Fx.CREATED)) {
                    r4.BIx();
                    throw null;
                }
            } catch (AnonymousClass0CX e) {
                Log.e("CarApp.Dispatch", AnonymousClass001.A1H("Serialization failure in ", str, AnonymousClass000.A10()), e);
                return;
            }
        }
        Log.w("CarApp.Dispatch", AnonymousClass001.A1E(r4, "Lifecycle is not at least created when dispatching ", AnonymousClass000.A10()));
    }

    public final void run() {
        A00(this.A00, this.A01, this.A02);
    }

    public /* synthetic */ AnonymousClass0ZW(C15970rV r1, C23381Fv r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }
}
