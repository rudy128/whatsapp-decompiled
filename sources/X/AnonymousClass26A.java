package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.26A  reason: invalid class name */
public final class AnonymousClass26A extends BroadcastReceiver {
    public C33301ib A00;
    public final Object A01 = C17880vN.A0p();
    public volatile boolean A02 = false;

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    this.A00 = (C33301ib) AnonymousClass10E.A10(context).AJU.A6m.get();
                    this.A02 = true;
                }
            }
        }
        C18070vi.A0h(context, intent);
        Log.i("MessagelessPaymentNotification/dismiss");
        C33301ib r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        } else {
            C18070vi.A11("messagelessPaymentNotification");
            throw null;
        }
    }
}
