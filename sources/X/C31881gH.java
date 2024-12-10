package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.ArrayDeque;

/* renamed from: X.1gH  reason: invalid class name and case insensitive filesystem */
public final class C31881gH extends Handler implements C31871gG {
    public final /* synthetic */ C31841gD A00;

    public void CHO(C62642rj r2) {
        obtainMessage(0, r2).sendToTarget();
    }

    public void CHS() {
        sendEmptyMessage(1);
    }

    public void CHe(Message message) {
        message.what = 2;
        sendMessage(message);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31881gH(Looper looper, C31841gD r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            Log.i("WriterThread/recv/connected");
            C31841gD r3 = this.A00;
            r3.A00 = (C62642rj) message.obj;
            StringBuilder sb = new StringBuilder();
            sb.append("WriterThread/handleConnected re-sending stanzas from the queue, size=");
            ArrayDeque arrayDeque = r3.A04;
            sb.append(arrayDeque.size());
            Log.i(sb.toString());
            r3.A01 = false;
            while (!r3.A01 && !arrayDeque.isEmpty()) {
                r3.A00((Message) arrayDeque.remove());
            }
        } else if (i == 1) {
            this.A00.A01 = true;
        } else if (i == 2) {
            this.A00.A00(message);
        }
    }
}
