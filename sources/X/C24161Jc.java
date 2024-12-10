package X;

import android.app.ActivityManager;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.1Jc  reason: invalid class name and case insensitive filesystem */
public class C24161Jc {
    public static int A00 = -1;
    public static Boolean A01;
    public static final String[] A02 = {"GT-N7100", "GT-I9305"};

    public static synchronized int A00(AnonymousClass11C r3) {
        synchronized (C24161Jc.class) {
            int i = A00;
            if (i != -1) {
                return i;
            }
            ActivityManager A04 = r3.A04();
            if (A04 == null) {
                Log.w("memoryclassprovider am=null");
                return 16;
            }
            A00 = A04.getMemoryClass();
            int memoryClass = A04.getMemoryClass();
            return memoryClass;
        }
    }

    public static boolean A01() {
        Boolean bool = A01;
        if (bool == null) {
            String[] strArr = A02;
            boolean z = false;
            for (int i = 0; i < 2; i++) {
                if (Build.MODEL.equals(strArr[i])) {
                    A01 = true;
                    return true;
                }
            }
            int i2 = A00;
            if (i2 < 0) {
                return false;
            }
            if (i2 <= 48) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            A01 = bool;
        }
        return bool.booleanValue();
    }
}
