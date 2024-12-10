package com.facebook.soloader;

import X.AnonymousClass00R;
import X.AnonymousClass0DT;
import X.AnonymousClass2SV;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class SysUtil$MarshmallowSysdeps {
    public static boolean A02(Context context, int i) {
        if (i == 2) {
            return A01(context);
        }
        return A00(context);
    }

    public static boolean A00(Context context) {
        if (context == null || (context.getApplicationInfo().flags & 268435456) != 0) {
            return false;
        }
        return true;
    }

    public static String[] getSupportedAbis() {
        String[] strArr = Build.SUPPORTED_ABIS;
        TreeSet treeSet = new TreeSet();
        if (is64Bit()) {
            treeSet.add(AnonymousClass2SV.A00(AnonymousClass00R.A0Y));
            treeSet.add(AnonymousClass2SV.A00(AnonymousClass00R.A0N));
        } else {
            treeSet.add(AnonymousClass2SV.A00(AnonymousClass00R.A0C));
            treeSet.add(AnonymousClass2SV.A00(AnonymousClass00R.A01));
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (treeSet.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean A01(Context context) {
        boolean z;
        ZipFile zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir));
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (true) {
                z = false;
                if (!entries.hasMoreElements()) {
                    break;
                }
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                if (zipEntry != null && zipEntry.getName().endsWith(".so") && zipEntry.getName().contains("/lib")) {
                    if (zipEntry.getMethod() == 0) {
                        z = true;
                    }
                }
            }
            zipFile.close();
            return z;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public static boolean is64Bit() {
        return Process.is64Bit();
    }
}
