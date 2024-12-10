package X;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: X.AeL  reason: case insensitive filesystem */
public final /* synthetic */ class C21091AeL implements B9W {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ C198519yT A01;
    public final /* synthetic */ WeakReference A02;

    public final void BtO(Object obj) {
        C198519yT r5 = this.A01;
        WeakReference weakReference = this.A02;
        Intent intent = this.A00;
        Context context = (Context) weakReference.get();
        if (context != null) {
            C17880vN.A1C(C19830z4.A00(C17880vN.A0K(((C190369kp) r5.A00.get()).A01)), "shops_privacy_notice", -1);
            C198519yT.A00(context, intent, r5);
        }
    }

    public /* synthetic */ C21091AeL(Intent intent, C198519yT r2, WeakReference weakReference) {
        this.A01 = r2;
        this.A02 = weakReference;
        this.A00 = intent;
    }
}
