package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.26B  reason: invalid class name */
public class AnonymousClass26B extends BroadcastReceiver {
    public C33311ic A00;
    public final Object A01 = C17880vN.A0p();
    public volatile boolean A02 = false;

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    this.A00 = (C33311ic) AnonymousClass10E.A10(context).AJU.A88.get();
                    this.A02 = true;
                }
            }
        }
        Log.i("PaymentMethodUpdateNotification/dismiss");
        this.A00.A02();
    }
}
