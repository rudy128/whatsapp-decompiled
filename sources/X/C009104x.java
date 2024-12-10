package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.04x  reason: invalid class name and case insensitive filesystem */
public final class C009104x extends Handler {
    public final /* synthetic */ AnonymousClass0QP A00;

    public void handleMessage(Message message) {
        C18070vi.A0d(message, 0);
        int i = message.what;
        if (i == 99) {
            AnonymousClass0QP.A03(this.A00);
            return;
        }
        throw new RuntimeException(AnonymousClass001.A1I("Unknown message: ", AnonymousClass000.A10(), i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C009104x(Looper looper, AnonymousClass0QP r2) {
        super(looper);
        this.A00 = r2;
    }
}
