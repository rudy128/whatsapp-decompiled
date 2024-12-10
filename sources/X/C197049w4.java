package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9w4  reason: invalid class name and case insensitive filesystem */
public abstract class C197049w4 {
    public static final String A00 = AnonymousClass8BS.A0m("ProcessUtils");

    public static final boolean A00(Context context, AnonymousClass00I r7) {
        String str;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        boolean A16 = C18070vi.A16(context, r7);
        if (Build.VERSION.SDK_INT >= 28) {
            str = AnonymousClass9OM.A00();
        } else {
            String str2 = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, A7W.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(A16);
                Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
                C18070vi.A0b(invoke);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                A5Z.A00().A07(A00, "Unable to check ActivityThread for processName", th);
            }
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            C18070vi.A0z(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        runningAppProcessInfo = null;
                        break;
                    }
                    runningAppProcessInfo = it.next();
                    if (runningAppProcessInfo.pid == myPid) {
                        break;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = runningAppProcessInfo;
                if (runningAppProcessInfo2 != null) {
                    str2 = runningAppProcessInfo2.processName;
                }
            }
            str = str2;
        }
        String str3 = r7.A07;
        if (str3 == null || str3.length() == 0) {
            str3 = context.getApplicationInfo().processName;
        }
        return C18070vi.A18(str, str3);
    }
}
