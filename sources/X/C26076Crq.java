package X;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Crq  reason: case insensitive filesystem */
public class C26076Crq {
    public static final List A00 = AnonymousClass000.A13();

    public static synchronized C26140Ct3 A00() {
        synchronized (C26076Crq.class) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                C26140Ct3 ct3 = (C26140Ct3) ((WeakReference) it.next()).get();
                if (ct3 == null) {
                    it.remove();
                } else {
                    EGLContext eGLContext = ct3.A03;
                    if (eGLContext != EGL14.EGL_NO_CONTEXT && eGLContext.equals(EGL14.eglGetCurrentContext())) {
                        return ct3;
                    }
                }
            }
            return null;
        }
    }

    public static synchronized C26140Ct3 A01(Object obj, int i) {
        C26140Ct3 ct3;
        synchronized (C26076Crq.class) {
            ct3 = new C26140Ct3(obj, i);
            A00.add(AnonymousClass3MW.A0z(ct3));
        }
        return ct3;
    }
}
