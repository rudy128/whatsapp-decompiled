package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.1gB  reason: invalid class name and case insensitive filesystem */
public final class C31821gB extends Handler implements C31811gA {
    public final /* synthetic */ C31701fz A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31821gB(C31701fz r2) {
        super(r2.getLooper());
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            Log.i("ConnectionThread/WriterThreadObserver/sending_channel_ready");
            this.A00.A0w((C31871gG) message.obj);
        } else if (i == 1) {
            this.A00.A11((C62642rj) message.obj);
        } else if (i == 2) {
            this.A00.A0z((AnonymousClass205) message.obj);
        }
    }
}
