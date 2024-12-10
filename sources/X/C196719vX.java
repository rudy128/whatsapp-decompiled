package X;

import com.facebook.common.hiddenapis2.ApiExemption;
import dalvik.system.VMDebug;

/* renamed from: X.9vX  reason: invalid class name and case insensitive filesystem */
public abstract class C196719vX {
    static {
        ApiExemption.enableUnsafeExemption();
        ApiExemption.removeRestriction_DO_NOT_USE();
    }

    public static long[] A00(Class[] clsArr) {
        Runtime.getRuntime().gc();
        return VMDebug.countInstancesOfClasses(clsArr, true);
    }
}
