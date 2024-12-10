package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.AlarmBroadcastReceiver;

/* renamed from: X.8Bw  reason: invalid class name and case insensitive filesystem */
public abstract class C161138Bw extends BroadcastReceiver {
    public final Object A00 = C17880vN.A0p();
    public volatile boolean A01 = false;

    public void onReceive(Context context, Intent intent) {
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    AnonymousClass10G.AVC((AlarmBroadcastReceiver) this, ((AnonymousClass10E) ((C000100c) C02800Fk.A00(context))).Ao8.A00);
                    this.A01 = true;
                }
            }
        }
    }
}
