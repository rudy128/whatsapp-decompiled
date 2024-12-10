package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import java.util.Map;

/* renamed from: X.8Kd  reason: invalid class name and case insensitive filesystem */
public class C162288Kd extends C161278Cn {
    public static final boolean A03 = C108975cc.A1C(Build.VERSION.SDK_INT, 22);
    public boolean A00 = false;
    public final Map A01 = C17880vN.A11();
    public final Map A02 = C17880vN.A11();

    public void A03() {
        this.A00 = true;
        A00();
    }

    public void dispatchMessage(Message message) {
        if (!this.A00) {
            super.dispatchMessage(message);
            return;
        }
        Message message2 = (Message) this.A02.remove(message);
        if (message2 == null) {
            Handler handler = (Handler) this.A01.remove(message);
            if (handler != null) {
                message.setTarget(handler);
            }
            message2 = message;
        }
        if (message2.getTarget() != this) {
            A02(message2);
        }
        A00();
    }

    public C162288Kd(Looper looper, C22550BCh bCh, C198389yG r4) {
        super(looper, bCh, r4);
    }

    private void A00() {
        MessageQueue myQueue = Looper.myQueue();
        synchronized (myQueue) {
            C198389yG r7 = this.A04;
            try {
                Message message = (Message) r7.A00.get(myQueue);
                if (message != null) {
                    if (message.getTarget() != null && message.getWhen() <= SystemClock.uptimeMillis()) {
                        this.A01.put(message, message.getTarget());
                    } else if (message.getTarget() == null && A03) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        while (true) {
                            message = (Message) r7.A01.get(message);
                            if (message == null) {
                                break;
                            } else if (message.isAsynchronous()) {
                                if (uptimeMillis >= message.getWhen()) {
                                    this.A01.put(message, message.getTarget());
                                }
                            }
                        }
                    }
                    message.setTarget(this);
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        Message A012 = A01(Looper.myQueue());
        if (A012 != null) {
            Message obtain = Message.obtain(A012);
            this.A02.put(obtain, A012);
            sendMessageAtFrontOfQueue(obtain);
        }
    }
}
