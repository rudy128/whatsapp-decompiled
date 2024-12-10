package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Cya  reason: case insensitive filesystem */
public class C26374Cya implements Handler.Callback {
    public static Field A03;
    public Handler.Callback A00;
    public final Handler A01;
    public final AtomicBoolean A02 = C108965cb.A0w();

    static {
        try {
            Field declaredField = Handler.class.getDeclaredField("mCallback");
            A03 = declaredField;
            declaredField.setAccessible(true);
        } catch (Error | Exception unused) {
        }
    }

    public boolean handleMessage(Message message) {
        int i;
        List<C4J> list = C24725CHm.A00;
        boolean z = false;
        if (AnonymousClass000.A1a(list)) {
            for (C4J c4j : list) {
                C23862BrJ brJ = (C23862BrJ) c4j;
                if (1 - brJ.A00 == 0 && ((i = message.what) == 115 || i == 116 || i == 159)) {
                    C25676Ck7 ck7 = (C25676Ck7) brJ.A01;
                    C25676Ck7.A00(ck7);
                    if (!z) {
                        int i2 = message.what;
                        if (i2 == 115 || i2 == 116 || i2 == 159) {
                            Handler.Callback callback = this.A00;
                            if (callback == null || !callback.handleMessage(message)) {
                                this.A01.handleMessage(message);
                            }
                            try {
                                C25676Ck7.A00(ck7);
                            } catch (Exception unused) {
                            }
                        }
                        z = true;
                    }
                }
            }
            if (z) {
                return true;
            }
        }
        Handler.Callback callback2 = this.A00;
        if (callback2 != null) {
            return callback2.handleMessage(message);
        }
        return false;
    }

    public C26374Cya(Handler handler) {
        this.A01 = handler;
        C146747Ql r2 = new C146747Ql(this, 29);
        if (handler.getLooper() == Looper.myLooper()) {
            r2.run();
        } else {
            new Handler(handler.getLooper()).post(r2);
        }
    }
}
