package X;

import android.app.ActivityManager;
import java.util.Map;

/* renamed from: X.CeC  reason: case insensitive filesystem */
public abstract class C25353CeC {
    public static final C25224CbL A00(Map map) {
        Boolean bool;
        int i;
        int i2;
        int i3;
        int i4;
        Number number;
        Number number2;
        Number number3;
        Number number4;
        Number number5;
        Object obj = map.get("isDynamicMemoryHandlingEnabled");
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            bool = null;
        }
        int i5 = 0;
        boolean A1Y = C72453Mb.A1Y(bool);
        Object obj2 = map.get("normalModeMemoryThreshold");
        if (!(obj2 instanceof Integer) || (number5 = (Number) obj2) == null) {
            i = 0;
        } else {
            i = number5.intValue();
        }
        Object obj3 = map.get("lowMemoryModeMemoryThreshold");
        if (!(obj3 instanceof Integer) || (number4 = (Number) obj3) == null) {
            i2 = 0;
        } else {
            i2 = number4.intValue();
        }
        Object obj4 = map.get("preRenderingMemoryOffset");
        if (!(obj4 instanceof Integer) || (number3 = (Number) obj4) == null) {
            i3 = 0;
        } else {
            i3 = number3.intValue();
        }
        Object obj5 = map.get("criticalMemoryThreshold");
        if (!(obj5 instanceof Integer) || (number2 = (Number) obj5) == null) {
            i4 = 0;
        } else {
            i4 = number2.intValue();
        }
        Integer valueOf = Integer.valueOf(i4);
        Object obj6 = map.get("avatarUpdateMemoryThreshold");
        if ((obj6 instanceof Integer) && (number = (Number) obj6) != null) {
            i5 = number.intValue();
        }
        return new C25224CbL(valueOf, Integer.valueOf(i5), i, i2, i3, A1Y);
    }

    public static final C24328BzP A01(ActivityManager activityManager, C25224CbL cbL) {
        C24328BzP bzP;
        if (cbL == null || activityManager == null) {
            return C24328BzP.NORMAL_MODE;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("availMem: ");
        A10.append(memoryInfo.availMem);
        A10.append(", lowMem: ");
        A10.append(memoryInfo.lowMemory);
        A10.append(", threshold: ");
        C26294Cx6.A04("MemoryUtil", C17880vN.A0u(A10, memoryInfo.threshold));
        int i = cbL.A01;
        int i2 = cbL.A02;
        int i3 = i - i2;
        int i4 = cbL.A00 - i2;
        if (!memoryInfo.lowMemory) {
            if (cbL.A05) {
                long j = memoryInfo.availMem;
                if (j <= ((long) i3) * 1024 * 1024) {
                    if (j > ((long) i4) * 1024 * 1024) {
                        bzP = C24328BzP.LOW_MEMORY_MODE;
                        return (C24328BzP) AnonymousClass1D6.A01(bzP, Double.valueOf(((double) memoryInfo.availMem) / 1048576.0d)).first;
                    }
                }
            }
            bzP = C24328BzP.NORMAL_MODE;
            return (C24328BzP) AnonymousClass1D6.A01(bzP, Double.valueOf(((double) memoryInfo.availMem) / 1048576.0d)).first;
        }
        bzP = C24328BzP.FALLBACK_MODE;
        return (C24328BzP) AnonymousClass1D6.A01(bzP, Double.valueOf(((double) memoryInfo.availMem) / 1048576.0d)).first;
    }
}
