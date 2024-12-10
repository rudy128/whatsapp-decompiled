package com.whatsapp.files;

import X.AnonymousClass000;
import X.C17880vN;
import X.C17900vP;
import android.system.ErrnoException;
import android.system.Os;
import java.io.File;

public class FileUtils$OsRename {
    public static int attempt(File file, File file2) {
        try {
            Os.rename(file.getAbsolutePath(), file2.getAbsolutePath());
            return -1;
        } catch (ErrnoException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            C17900vP.A0N(file, "MMS Os.rename also failed, from=", A10);
            C17900vP.A0N(file2, " to=", A10);
            A10.append(" errno=");
            A10.append(e.errno);
            C17880vN.A1M(A10, e);
            return e.errno;
        }
    }
}
