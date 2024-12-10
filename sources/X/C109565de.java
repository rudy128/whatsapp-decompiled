package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: X.5de  reason: invalid class name and case insensitive filesystem */
public class C109565de extends Handler {
    public HandlerThread A00;
    public C122956So A01;
    public AnonymousClass72K A02;

    public void handleMessage(Message message) {
        C122956So r3 = this.A01;
        r3.A00.set(Double.doubleToRawLongBits((double) this.A02.A02()));
        sendEmptyMessageDelayed(0, 50);
    }
}
