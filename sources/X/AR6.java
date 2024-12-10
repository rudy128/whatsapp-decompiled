package X;

import com.whatsapp.util.Log;
import java.io.File;

public class AR6 implements C72143Ku {
    public final C218617r A00;

    public static long[] A00(File file) {
        long[] jArr = {0, 0};
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    jArr[0] = jArr[0] + file2.length();
                    jArr[1] = jArr[1] + 1;
                } else if (file2.isDirectory()) {
                    long[] A002 = A00(file2);
                    jArr[0] = jArr[0] + A002[0];
                    jArr[1] = jArr[1] + A002[1];
                }
            }
        } else {
            C17900vP.A0Z(file, "mediafoldersize listedFiles is null for folder ", AnonymousClass000.A10());
        }
        return jArr;
    }

    public void C0w(C171888sR r7) {
        String str;
        C218617r r5 = this.A00;
        File A0J = r5.A0J();
        if (A0J.exists() && A0J.isDirectory()) {
            try {
                long[] A002 = A00(A0J);
                r7.A1J = Long.valueOf(A002[0]);
                r7.A1I = Long.valueOf(A002[1]);
                File file = r5.A08().A0Q;
                if (!file.exists() || !file.isDirectory()) {
                    Log.e("fieldstathelpers/update-media-folder-fieldstats/error/video-folder-does-not-exist");
                    return;
                }
                long[] A003 = A00(file);
                r7.A1e = Long.valueOf(A003[0]);
                r7.A1d = Long.valueOf(A003[1]);
            } catch (StackOverflowError e) {
                e = e;
                str = "fieldstathelpers/update-media-folder-fieldstats/error/stackoverflow";
                Log.e(str, e);
            } catch (OutOfMemoryError e2) {
                e = e2;
                str = "fieldstathelpers/update-media-folder-fieldstats/error/outofmemory";
                Log.e(str, e);
            }
        }
    }

    public AR6(C218617r r1) {
        this.A00 = r1;
    }
}
