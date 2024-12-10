package X;

import android.os.Build;
import com.facebook.systrace.TraceDirect;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.Coq  reason: case insensitive filesystem */
public abstract class C25927Coq {
    public static final String A00 = "TraceConfig";
    public static final C25665Cjv A01 = new C25665Cjv();
    public static volatile long A02;

    static {
        A00(false);
        if (Build.VERSION.SDK_INT < 30) {
            C26294Cx6.A06(A00, "Registering systrace sysprop listener");
            C21422Ajp ajp = new C21422Ajp(1);
            if (C222919i.A06) {
                C222919i.A01(C222919i.A00, AnonymousClass000.A1b(ajp, 1));
            }
        }
    }

    public static void A00(boolean z) {
        boolean A012;
        long j;
        boolean z2;
        String str;
        long j2 = A02;
        if (Build.VERSION.SDK_INT >= 30) {
            A012 = C24573C9u.A00();
        } else {
            A012 = A01();
        }
        long A002 = C222919i.A00("debug.fbsystrace.tags");
        if (!A012 || A002 == 0) {
            j = 0;
        } else {
            j = A002 | 1;
        }
        boolean z3 = true;
        if ((A02 != 0 || j == 0) && (j != 0 || A02 == 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        A02 = j;
        String str2 = A00;
        Object[] A1a = BE6.A1a();
        if (z) {
            str = "sysprop";
        } else {
            str = "other";
        }
        A1a[0] = str;
        AnonymousClass8BR.A1L(A1a, 1, z2);
        AnonymousClass3MX.A1S(A1a, 2, j2);
        C17890vO.A1O(A1a, A02);
        C26294Cx6.A06(str2, String.format("Systrace trace config update - source:%s changed:%b enabledTags:0x%x->0x%x", A1a));
        if (z2) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeSetEnabledTags(j);
            }
            if (!z) {
                z3 = false;
            }
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            C25665Cjv cjv = A01;
            if (i <= 0) {
                synchronized (cjv.A01) {
                    cjv.A00 = false;
                    int i2 = 0;
                    while (true) {
                        List list = cjv.A02;
                        if (i2 < list.size()) {
                            list.get(i2);
                            C25324CdV cdV = C25324CdV.$redex_init_class;
                            i2++;
                        }
                    }
                }
            } else if (!z3) {
                cjv.A00();
            } else {
                synchronized (cjv.A01) {
                    Thread thread = new Thread(new C146487Ph(cjv, C25665Cjv.A03.lastModified(), 0), "fbsystrace notification thread");
                    thread.setPriority(10);
                    thread.start();
                }
            }
        }
    }

    public static boolean A01() {
        long j = C25457CgA.A00;
        if (!C25457CgA.A03) {
            return false;
        }
        Method method = C25457CgA.A01;
        C221718w.A00(method);
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass3MX.A1S(A1a, 0, j);
        Boolean bool = (Boolean) C25457CgA.A00(method, A1a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
