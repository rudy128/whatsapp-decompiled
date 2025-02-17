package com.facebook.soloader;

import X.AnonymousClass00R;
import X.AnonymousClass2SV;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public final class SysUtil$LollipopSysdeps {
    public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) {
        try {
            Os.posix_fallocate(fileDescriptor, 0, j);
        } catch (ErrnoException e) {
            if (e.errno != OsConstants.EOPNOTSUPP && e.errno != OsConstants.ENOSYS && e.errno != OsConstants.EINVAL) {
                throw new IOException(e.toString(), e);
            }
        }
    }

    public static String[] getSupportedAbis() {
        String[] strArr = Build.SUPPORTED_ABIS;
        TreeSet treeSet = new TreeSet();
        try {
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
        } catch (ErrnoException e) {
            Log.e("SysUtil", String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", new Object[]{Arrays.toString(strArr), Integer.valueOf(e.errno), e.getMessage()}));
            String[] strArr2 = Build.SUPPORTED_ABIS;
            return strArr;
        }
    }

    public static boolean is64Bit() {
        return Os.readlink("/proc/self/exe").contains("64");
    }
}
