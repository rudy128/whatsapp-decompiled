package X;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Cjw  reason: case insensitive filesystem */
public final class C25666Cjw {
    public static C25666Cjw A03;
    public GoogleSignInAccount A00;
    public GoogleSignInOptions A01;
    public final C26033Cqt A02;

    /* JADX INFO: finally extract failed */
    public final synchronized void A01() {
        C26033Cqt cqt = this.A02;
        Lock lock = cqt.A01;
        lock.lock();
        try {
            cqt.A00.edit().clear().apply();
            lock.unlock();
            this.A00 = null;
            this.A01 = null;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public static synchronized C25666Cjw A00(Context context) {
        C25666Cjw cjw;
        synchronized (C25666Cjw.class) {
            Context applicationContext = context.getApplicationContext();
            cjw = A03;
            if (cjw == null) {
                cjw = new C25666Cjw(applicationContext);
                A03 = cjw;
            }
        }
        return cjw;
    }

    public C25666Cjw(Context context) {
        C26033Cqt A002 = C26033Cqt.A00(context);
        this.A02 = A002;
        this.A00 = A002.A01();
        this.A01 = A002.A02();
    }
}
