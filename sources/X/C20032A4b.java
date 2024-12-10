package X;

import android.os.Build;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.A4b  reason: case insensitive filesystem */
public class C20032A4b {
    public static final Map A05;
    public final Map A00;
    public final Set A01;
    public final Executor A02;
    public final C18140vp A03;
    public final Map A04;

    static {
        Map A11;
        if (Build.VERSION.SDK_INT >= 24) {
            A11 = AnonymousClass8BR.A17();
        } else {
            A11 = C17880vN.A11();
        }
        A05 = A11;
    }

    public static C26187CuB A00(C20032A4b a4b, C18140vp r5) {
        C26187CuB cuB = new C26187CuB(a4b.A02, r5);
        if (Build.VERSION.SDK_INT >= 24) {
            a4b.A04.put("linkedapp_app_identity", cuB);
            return cuB;
        }
        Map map = a4b.A04;
        synchronized (map) {
            map.put("linkedapp_app_identity", cuB);
        }
        return cuB;
    }

    public C26187CuB A01() {
        C26187CuB cuB;
        int i = Build.VERSION.SDK_INT;
        Map map = this.A04;
        if (i >= 24) {
            C26187CuB cuB2 = (C26187CuB) map.get("linkedapp_app_identity");
            if (cuB2 == null) {
                return (C26187CuB) map.computeIfAbsent("linkedapp_app_identity", new C21510AlJ(this));
            }
            return cuB2;
        }
        synchronized (map) {
            cuB = (C26187CuB) map.get("linkedapp_app_identity");
            if (cuB == null) {
                cuB = A00(this, new C21515AlO(this));
            }
        }
        return cuB;
    }

    public C20032A4b(Set set, Executor executor, C18140vp r5) {
        Map A11;
        if (Build.VERSION.SDK_INT >= 24) {
            A11 = AnonymousClass8BR.A17();
        } else {
            A11 = C17880vN.A11();
        }
        this.A04 = A11;
        this.A00 = C17880vN.A11();
        this.A02 = executor;
        this.A03 = r5;
        this.A01 = set;
    }
}
