package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.1f1  reason: invalid class name and case insensitive filesystem */
public class C31101f1 extends BroadcastReceiver {
    public final /* synthetic */ C31091f0 A00;

    public C31101f1(C31091f0 r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            for (C31131f4 A04 : this.A00.A03) {
                A04.A04();
            }
        }
    }
}
