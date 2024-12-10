package X;

import java.io.File;

/* renamed from: X.1Af  reason: invalid class name and case insensitive filesystem */
public abstract class C22491Af {
    public static File A00(C17930vS r2) {
        File file = new File(r2.A00(), "minidumps");
        if (!file.exists() || !file.isDirectory()) {
            if (file.exists()) {
                file.delete();
            }
            if (!file.mkdirs()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Breakpad init failed to create crash directory: ");
                sb.append(file);
                throw new RuntimeException(sb.toString());
            }
        }
        return file;
    }
}
