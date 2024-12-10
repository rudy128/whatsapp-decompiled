package X;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: X.8Bj  reason: invalid class name and case insensitive filesystem */
public abstract class C161088Bj extends Service implements AnonymousClass1F9 {
    public final C198039xg A00 = new C198039xg(this);

    public C23381Fv getLifecycle() {
        return this.A00.A01;
    }

    public IBinder onBind(Intent intent) {
        C198039xg.A00(C27581Wq.ON_START, this.A00);
        return null;
    }

    public void onCreate() {
        C198039xg.A00(C27581Wq.ON_CREATE, this.A00);
        super.onCreate();
    }

    public void onDestroy() {
        C198039xg r1 = this.A00;
        C198039xg.A00(C27581Wq.ON_STOP, r1);
        C198039xg.A00(C27581Wq.ON_DESTROY, r1);
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        C198039xg.A00(C27581Wq.ON_START, this.A00);
        super.onStart(intent, i);
    }
}
