package X;

import android.net.Uri;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.9BD  reason: invalid class name */
public class AnonymousClass9BD extends A34 {
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final C26521Sl A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = (IndiaUpiQrTabActivity) this.A04.get();
        if (indiaUpiQrTabActivity != null && !indiaUpiQrTabActivity.Bed()) {
            Uri uri = this.A02;
            if (obj == null) {
                indiaUpiQrTabActivity.CEx();
                indiaUpiQrTabActivity.A05.A08(2131889981, 0);
                return;
            }
            AnonymousClass3MW.A1T(new AnonymousClass6MT(uri, indiaUpiQrTabActivity.A0K, indiaUpiQrTabActivity.A0D), indiaUpiQrTabActivity.A05, 0);
        }
    }

    public AnonymousClass9BD(Uri uri, IndiaUpiQrTabActivity indiaUpiQrTabActivity, C26521Sl r4, int i, int i2) {
        this.A03 = r4;
        this.A02 = uri;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = AnonymousClass3MW.A0z(indiaUpiQrTabActivity);
    }
}
