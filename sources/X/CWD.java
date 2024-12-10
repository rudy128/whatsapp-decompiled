package X;

import android.os.Looper;
import java.util.concurrent.Executor;

public final class CWD {
    public final Executor A00;
    public volatile CYG A01;
    public volatile Object A02;

    public void A00(E5B e5b) {
        this.A00.execute(new C27076DTa(this, e5b, 44));
    }

    public CWD(Looper looper, Object obj, String str) {
        this.A00 = new C27136DVx(looper);
        C18210vx.A02(obj, "Listener must not be null");
        this.A02 = obj;
        C18210vx.A03(str);
        this.A01 = new CYG(obj, str);
    }
}
