package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: X.01Y  reason: invalid class name */
public abstract class AnonymousClass01Y {
    public BroadcastReceiver A00;
    public final /* synthetic */ AnonymousClass01V A01;

    public abstract int A00();

    public abstract IntentFilter A01();

    public abstract void A04();

    public AnonymousClass01Y(AnonymousClass01V r1) {
        this.A01 = r1;
    }

    public void A02() {
        BroadcastReceiver broadcastReceiver = this.A00;
        if (broadcastReceiver != null) {
            try {
                this.A01.A0k.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.A00 = null;
        }
    }

    public void A03() {
        A02();
        IntentFilter A012 = A01();
        if (A012.countActions() != 0) {
            BroadcastReceiver broadcastReceiver = this.A00;
            if (broadcastReceiver == null) {
                broadcastReceiver = new AnonymousClass04L(this);
                this.A00 = broadcastReceiver;
            }
            this.A01.A0k.registerReceiver(broadcastReceiver, A012);
        }
    }
}
