package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.deeplink.DeepLinkActivity;

/* renamed from: X.5df  reason: invalid class name and case insensitive filesystem */
public final class C109575df extends Handler {
    public final /* synthetic */ DeepLinkActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109575df(Looper looper, DeepLinkActivity deepLinkActivity) {
        super(looper);
        this.A00 = deepLinkActivity;
        C17960vV.A07(looper);
    }

    public void handleMessage(Message message) {
        int i = message.arg1;
        if (i != 0) {
            this.A00.CNB(0, i);
        }
    }
}
