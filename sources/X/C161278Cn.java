package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;

/* renamed from: X.8Cn  reason: invalid class name and case insensitive filesystem */
public abstract class C161278Cn extends Handler implements Runnable {
    public Message A00;
    public Message A01;
    public boolean A02 = false;
    public final C22550BCh A03;
    public final C198389yG A04;

    public abstract void A03();

    public final Message A01(MessageQueue messageQueue) {
        Message message;
        try {
            C22550BCh bCh = this.A03;
            bCh.CNs();
            try {
                message = (Message) this.A04.A02.invoke(messageQueue, new Object[0]);
            } catch (Throwable unused) {
                message = null;
            }
            bCh.BLK();
            return message;
        } catch (Throwable unused2) {
            this.A03.BLK();
            return null;
        }
    }

    public void run() {
        Message message = this.A01;
        if (message != null) {
            this.A03.BLJ(message);
            this.A01 = null;
        }
        A03();
        this.A00 = null;
    }

    public C161278Cn(Looper looper, C22550BCh bCh, C198389yG r4) {
        super(looper);
        this.A04 = r4;
        this.A03 = bCh;
        Looper.getMainLooper();
    }

    public final void A02(Message message) {
        Handler target = message.getTarget();
        if (target != null) {
            try {
                C22550BCh bCh = this.A03;
                bCh.CNm(message);
                target.dispatchMessage(message);
                bCh.BLJ(message);
            } catch (Throwable th) {
                this.A03.BLJ(message);
                throw th;
            }
        }
    }
}
