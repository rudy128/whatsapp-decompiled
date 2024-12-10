package com.facebook.breakpad;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1A8;
import X.AnonymousClass8BR;
import X.C108945cZ;
import X.C17880vN;
import X.C17900vP;
import X.C26294Cx6;
import X.C3A;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import com.facebook.storage.StartupPathsRegistry;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;
import java.util.TreeMap;

public class BreakpadManager {
    public static volatile File A00;
    public static volatile boolean A01;

    public static native void addMappingInfo(String str, byte[] bArr, int i, long j, long j2, long j3);

    public static native void crashProcessByAssert(String str);

    public static native void crashThisProcess();

    public static native void crashThisProcessAsan();

    public static native void crashThisProcessGWPAsan();

    public static native boolean disableCoreDumpingImpl();

    public static native boolean enableCoreDumpingImpl(String str);

    public static native void install(String str, String str2, String str3, int i, int i2, boolean z);

    public static native boolean isCoreResourceHardUnlimited();

    public static native boolean isPrivacyModeEnabled();

    public static native boolean nativeContainsKey(String str);

    public static native String nativeGetCustomData(String str);

    public static native void nativeGetCustomDataSnapshot(TreeMap treeMap);

    public static native long nativeGetMinidumpFlags();

    public static native void nativeRemoveCustomData(String str);

    public static native void nativeSetCustomData(String str, String str2);

    public static native boolean nativeSetJvmStreamEnabled(boolean z, boolean z2);

    public static native void nativeSetMinidumpFlags(long j);

    public static native void setVersionInfo(int i, String str, String str2);

    public static native boolean simulateSignalDelivery(int i, String str);

    public static void start(Context context) {
        String str;
        synchronized (BreakpadManager.class) {
            A00();
            if (A00 == null) {
                String basePathForId = StartupPathsRegistry.getBasePathForId(1874789883);
                if (basePathForId != null) {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    int i = Build.VERSION.SDK_INT;
                    if (i < 24 || !context.isDeviceProtectedStorage()) {
                        str = applicationInfo.dataDir;
                    } else {
                        str = applicationInfo.deviceProtectedDataDir;
                    }
                    File A0e = C17880vN.A0e(C108945cZ.A17(str), basePathForId);
                    A0e.mkdirs();
                    install(A0e.getAbsolutePath(), "", (String) null, 1536000, i, false);
                    A00 = A0e;
                    A00();
                    A00();
                    nativeSetMinidumpFlags(0 | nativeGetMinidumpFlags() | 2 | 4);
                    setVersionInfo(C3A.getBuildID(), C3A.getVersionName(), Build.FINGERPRINT);
                    setCustomData("Fingerprint", Build.FINGERPRINT, new Object[0]);
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Storage config ");
                    A10.append(1874789883);
                    throw AnonymousClass001.A12(" not in startup registry.", A10);
                }
            }
        }
    }

    public static native void uninstall();

    public static synchronized void A00() {
        synchronized (BreakpadManager.class) {
            if (!A01) {
                AnonymousClass1A8.A06("breakpad");
                A01 = true;
            }
        }
    }

    public static File getCrashDirectory() {
        if (A00 != null) {
            return A00;
        }
        throw AnonymousClass8BR.A0w("Breakpad not installed");
    }

    public static boolean isActive() {
        if (!A01 || A00 == null) {
            return false;
        }
        return true;
    }

    public static synchronized void setJvmStreamEnabled(boolean z) {
        boolean z2;
        synchronized (BreakpadManager.class) {
            String property = System.getProperty("java.vm.version");
            if (property == null || property.startsWith("1.") || property.startsWith("0.")) {
                z2 = false;
            } else {
                z2 = true;
                if (z) {
                    AnonymousClass1A8.A06("breakpad_cpp_helper");
                }
            }
            nativeSetJvmStreamEnabled(z2, z);
        }
    }

    public static boolean containsKey(String str) {
        boolean nativeContainsKey;
        if (!isActive()) {
            C26294Cx6.A07("BreakpadManager", "Breakpad is not active (containsKey).");
            return false;
        }
        A00();
        if (!AnonymousClass000.A1O(((nativeGetMinidumpFlags() & 32768) > 32768 ? 1 : ((nativeGetMinidumpFlags() & 32768) == 32768 ? 0 : -1)))) {
            C26294Cx6.A04("BreakpadManager", "Breakpad customData disabled.");
            return false;
        }
        synchronized (BreakpadManager.class) {
            nativeContainsKey = nativeContainsKey(str);
        }
        return nativeContainsKey;
    }

    public static boolean enableCoreDumping(Context context) {
        A00();
        if (Build.VERSION.SDK_INT < 24) {
            File file = null;
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(C108945cZ.A17("/proc/sys/kernel/core_pattern")));
                try {
                    file = C108945cZ.A17(bufferedReader.readLine());
                } catch (IOException e) {
                    Log.e("BreakpadManager", "There was a problem reading core pattern file", e);
                }
                try {
                    bufferedReader.close();
                } catch (IOException e2) {
                    Log.e("BreakpadManager", "There was a problem closing core pattern file", e2);
                }
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (file.isAbsolute() && parentFile != null && !parentFile.canWrite()) {
                        Log.d("BreakpadManager", "Not write permissions into /proc/sys/kernel/core_pattern");
                        return false;
                    }
                }
            } catch (FileNotFoundException e3) {
                Log.w("BreakpadManager", C17900vP.A0C("Core pattern file not found or blocked by SELinux", AnonymousClass000.A10(), e3));
            }
        }
        if (isCoreResourceHardUnlimited()) {
            return enableCoreDumpingImpl(context.getApplicationInfo().dataDir);
        }
        return false;
    }

    public static String getCustomData(String str) {
        String nativeGetCustomData;
        if (!isActive()) {
            C26294Cx6.A07("BreakpadManager", "Breakpad is not active (getCustomData).");
            return "";
        }
        A00();
        if (!AnonymousClass000.A1O(((nativeGetMinidumpFlags() & 32768) > 32768 ? 1 : ((nativeGetMinidumpFlags() & 32768) == 32768 ? 0 : -1)))) {
            C26294Cx6.A04("BreakpadManager", "Breakpad customData disabled.");
            return "";
        }
        synchronized (BreakpadManager.class) {
            nativeGetCustomData = nativeGetCustomData(str);
        }
        return nativeGetCustomData;
    }

    public static void removeCustomData(String str) {
        if (!isActive()) {
            C26294Cx6.A07("BreakpadManager", "Breakpad is not active (removeCustomData).");
            return;
        }
        A00();
        if (!AnonymousClass000.A1O(((nativeGetMinidumpFlags() & 32768) > 32768 ? 1 : ((nativeGetMinidumpFlags() & 32768) == 32768 ? 0 : -1)))) {
            C26294Cx6.A04("BreakpadManager", "Breakpad customData disabled.");
            return;
        }
        synchronized (BreakpadManager.class) {
            nativeRemoveCustomData(str);
        }
    }

    public static void setCustomData(String str, String str2, Object... objArr) {
        if (!isActive()) {
            C26294Cx6.A07("BreakpadManager", "Breakpad is not active (setCustomData).");
            return;
        }
        A00();
        if (!AnonymousClass000.A1O(((nativeGetMinidumpFlags() & 32768) > 32768 ? 1 : ((nativeGetMinidumpFlags() & 32768) == 32768 ? 0 : -1)))) {
            C26294Cx6.A04("BreakpadManager", "Breakpad customData disabled.");
            return;
        }
        synchronized (BreakpadManager.class) {
            if (objArr.length > 0 && str2 != null) {
                StringBuilder A10 = AnonymousClass000.A10();
                Formatter formatter = new Formatter(A10);
                formatter.format(str2, objArr);
                formatter.close();
                str2 = A10.toString();
            }
            nativeSetCustomData(str, str2);
        }
    }
}
