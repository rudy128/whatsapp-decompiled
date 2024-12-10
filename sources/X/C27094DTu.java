package X;

import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DTu  reason: case insensitive filesystem */
public class C27094DTu implements InvocationHandler {
    public final Object A00;
    public final Object A01;

    public Object invoke(Object obj, Method method, Object[] objArr) {
        List<C4J> list = C24725CHm.A00;
        Method method2 = method;
        Object[] objArr2 = objArr;
        if (AnonymousClass000.A1a(list)) {
            for (C4J c4j : list) {
                C23862BrJ brJ = (C23862BrJ) c4j;
                if (brJ.A00 == 0 && method.getName().equals("dispatchVolumeKeyEvent") && Process.myPid() == Process.myTid()) {
                    AnonymousClass00H r0 = C23861BrI.A06;
                    Handler handler = ((C23861BrI) brJ.A01).A02;
                    if (handler != null) {
                        handler.post(new C70833Cr((Object) brJ, (Object) objArr2, (Object) this, (Object) method2, 38));
                        new Object();
                        return null;
                    }
                }
            }
        }
        return A00(method, objArr);
    }

    public C27094DTu(Class cls, Object obj) {
        this.A01 = obj;
        this.A00 = Proxy.newProxyInstance(C27094DTu.class.getClassLoader(), new Class[]{cls}, this);
    }

    public Object A00(Method method, Object[] objArr) {
        Throwable targetException;
        try {
            SystemClock.elapsedRealtime();
            Object invoke = method.invoke(this.A01, objArr);
            SystemClock.elapsedRealtime();
            List list = C24725CHm.A00;
            if (AnonymousClass000.A1a(list)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            return invoke;
        } catch (InvocationTargetException e) {
            if (e.getCause() != null) {
                targetException = e.getCause();
            } else {
                targetException = e.getTargetException();
            }
            if (targetException != null) {
                throw targetException;
            }
            throw e;
        }
    }
}
