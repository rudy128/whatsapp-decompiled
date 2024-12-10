package X;

import android.content.Context;
import android.os.Binder;
import android.util.Log;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.C7b  reason: case insensitive filesystem */
public abstract class C24507C7b {
    public static final D7F A00(Context context) {
        D7H d7h;
        if (D7F.A07 == null) {
            ReentrantLock reentrantLock = D7F.A06;
            reentrantLock.lock();
            try {
                if (D7F.A07 == null) {
                    Context applicationContext = context.getApplicationContext();
                    C18070vi.A0X(applicationContext);
                    D7H d7h2 = null;
                    int A00 = C25864CnX.A00();
                    if (Integer.valueOf(A00) != null && A00 >= 1) {
                        C25628CjC cjC = D7H.A04;
                        if (C25628CjC.A00()) {
                            ClassLoader classLoader = EAn.class.getClassLoader();
                            if (classLoader != null) {
                                ActivityEmbeddingComponent A01 = cjC.A01();
                                Binder binder = C26275CwR.A03;
                                d7h = new D7H(applicationContext, new C24745CIh(classLoader), new C26275CwR(new C25040CUt(classLoader)), A01);
                            } else {
                                d7h = null;
                            }
                            d7h2 = d7h;
                            if (d7h == null) {
                            }
                            D7F.A07 = new D7F(applicationContext, d7h2);
                        }
                    }
                    Log.d("EmbeddingBackend", "No supported embedding extension found");
                    D7F.A07 = new D7F(applicationContext, d7h2);
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
            reentrantLock.unlock();
        }
        D7F d7f = D7F.A07;
        C18070vi.A0b(d7f);
        return d7f;
    }
}
