package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.webkit.WebMessagePort;

/* renamed from: X.75Z  reason: invalid class name */
public final class AnonymousClass75Z implements Handler.Callback {
    public C110125ey A00;
    public WebMessagePort A01;
    public final Handler A02;
    public final C18030ve A03;
    public final AnonymousClass890 A04;

    public boolean handleMessage(Message message) {
        C18070vi.A0d(message, 0);
        if (message.what != 0) {
            return true;
        }
        AnonymousClass6WN.A00(new C155887tT(message, this));
        return true;
    }

    public AnonymousClass75Z(C18030ve r3, AnonymousClass890 r4) {
        Handler handler;
        this.A04 = r4;
        this.A03 = r3;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            handler = new Handler(myLooper, this);
        } else {
            handler = null;
        }
        this.A02 = handler;
    }
}
