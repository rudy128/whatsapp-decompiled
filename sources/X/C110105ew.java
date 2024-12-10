package X;

import android.os.Handler;
import android.os.Message;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

/* renamed from: X.5ew  reason: invalid class name and case insensitive filesystem */
public final class C110105ew extends WebMessagePort.WebMessageCallback {
    public final /* synthetic */ AnonymousClass75Z A00;

    public C110105ew(AnonymousClass75Z r1) {
        this.A00 = r1;
    }

    public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        Handler handler = this.A00.A02;
        if (handler != null) {
            handler.dispatchMessage(Message.obtain(handler, 0, webMessage));
        }
    }
}
