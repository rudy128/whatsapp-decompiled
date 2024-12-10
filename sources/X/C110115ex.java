package X;

import android.os.Handler;
import android.os.Message;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

/* renamed from: X.5ex  reason: invalid class name and case insensitive filesystem */
public final class C110115ex extends WebMessagePort.WebMessageCallback {
    public final /* synthetic */ C1412875a A00;

    public C110115ex(C1412875a r1) {
        this.A00 = r1;
    }

    public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        Handler handler = this.A00.A03;
        handler.dispatchMessage(Message.obtain(handler, 0, webMessage));
    }
}
