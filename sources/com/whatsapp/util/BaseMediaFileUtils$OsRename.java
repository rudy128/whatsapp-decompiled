package com.whatsapp.util;

import X.AnonymousClass000;
import X.C17880vN;
import android.system.ErrnoException;
import android.system.Os;
import java.io.File;

public class BaseMediaFileUtils$OsRename {
    public static int attempt(File file, File file2) {
        try {
            Os.rename(file.getAbsolutePath(), file2.getAbsolutePath());
            return -1;
        } catch (ErrnoException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MMS Os.rename also failed, errno=");
            A10.append(e.errno);
            C17880vN.A1M(A10, e);
            return e.errno;
        }
    }
}
