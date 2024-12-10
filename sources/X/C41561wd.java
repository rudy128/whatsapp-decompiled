package X;

import java.util.Map;

/* renamed from: X.1wd  reason: invalid class name and case insensitive filesystem */
public abstract class C41561wd {
    public static final AnonymousClass1OX A00(AnonymousClass1J2 r3) {
        Object obj;
        Map map = r3.A00;
        synchronized (map) {
            obj = map.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        }
        AnonymousClass1OX r0 = (AnonymousClass1OX) obj;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1OE r1 = new AnonymousClass1OE((AnonymousClass1OB) null);
        C18600wl r02 = C23871Hy.A00;
        return (AnonymousClass1OX) r3.A0Q(new C41571we(r1.plus(((AnonymousClass1IT) AnonymousClass1IN.A00).A01)), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
    }
}
