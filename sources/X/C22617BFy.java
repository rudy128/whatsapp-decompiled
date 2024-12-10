package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.Thread;

/* renamed from: X.BFy  reason: case insensitive filesystem */
public final class C22617BFy extends Handler {
    public final Thread.UncaughtExceptionHandler A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22617BFy(Handler.Callback callback, Looper looper, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        super(looper, callback);
        C18070vi.A0d(looper, 1);
        this.A00 = uncaughtExceptionHandler;
    }

    public void dispatchMessage(Message message) {
        C18070vi.A0d(message, 0);
        try {
            super.dispatchMessage(message);
        } catch (Exception e) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A00;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), e);
            }
        }
    }
}
