package X;

import android.util.Log;
import java.io.File;

/* renamed from: X.9O9  reason: invalid class name */
public abstract class AnonymousClass9O9 {
    public static void A00(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", AnonymousClass001.A1E(file2, "Failed to delete file which is a directory ", AnonymousClass000.A10()));
        }
        if (!file.renameTo(file2)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Failed to rename ");
            A10.append(file);
            Log.e("AtomicFile", AnonymousClass001.A1E(file2, " to ", A10));
        }
    }
}
