package X;

import android.os.Build;
import android.util.Log;
import com.facebook.soloader.SysUtil$LollipopSysdeps;
import com.facebook.soloader.SysUtil$MarshmallowSysdeps;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: X.2rs  reason: invalid class name and case insensitive filesystem */
public abstract class C62732rs {
    public static String[] A02() {
        if (Build.VERSION.SDK_INT >= 23) {
            return SysUtil$MarshmallowSysdeps.getSupportedAbis();
        }
        return SysUtil$LollipopSysdeps.getSupportedAbis();
    }

    public static void A00(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File A00 : listFiles) {
                    A00(A00);
                }
            } else {
                return;
            }
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            Log.e("SysUtil", AnonymousClass001.A1E(parentFile, "Enable write permission failed: ", AnonymousClass000.A10()));
        }
        if (!file.delete() && file.exists()) {
            throw C17880vN.A0f(AnonymousClass001.A1E(file, "Could not delete file ", AnonymousClass000.A10()));
        }
    }

    public static void A01(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File A01 : listFiles) {
                    A01(A01);
                }
                return;
            }
            throw C17880vN.A0f(AnonymousClass001.A1E(file, "cannot list directory ", AnonymousClass000.A10()));
        } else if (!file.getPath().endsWith("_lock")) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
    }
}
