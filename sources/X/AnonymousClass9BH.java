package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.payments.ui.IndiaUpiMyQrFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.9BH  reason: invalid class name */
public final class AnonymousClass9BH extends A34 {
    public final int A00;
    public final int A01;
    public final View A02;
    public final AnonymousClass190 A03;
    public final C218617r A04;
    public final B5H A05;
    public final WeakReference A06;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Intent intent = (Intent) obj;
        AVY avy = (AVY) this.A05;
        int i = avy.A00;
        Object obj2 = avy.A01;
        if (i != 0) {
            Context context = (Context) obj2;
            if (intent != null && intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
                return;
            }
            return;
        }
        IndiaUpiMyQrFragment indiaUpiMyQrFragment = (IndiaUpiMyQrFragment) obj2;
        if (intent == null || intent.resolveActivity(indiaUpiMyQrFragment.A1D().getPackageManager()) == null) {
            indiaUpiMyQrFragment.A02.A08(2131896110, 1);
            return;
        }
        indiaUpiMyQrFragment.startActivityForResult(intent, 1006);
        indiaUpiMyQrFragment.A00.setDrawingCacheEnabled(false);
    }

    public AnonymousClass9BH(View view, AnonymousClass190 r2, C218617r r3, B5H b5h, WeakReference weakReference, int i, int i2) {
        C72473Md.A1J(r2, r3);
        this.A06 = weakReference;
        this.A02 = view;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = b5h;
    }
}
