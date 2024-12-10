package X;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: X.2qW  reason: invalid class name and case insensitive filesystem */
public class C61932qW {
    public final FileChannel A00;
    public final FileLock A01;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[SYNTHETIC, Splitter:B:15:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036 A[SYNTHETIC, Splitter:B:19:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C61932qW A00(android.content.Context r6) {
        /*
            java.lang.String r1 = "generatefid.lock"
            r5 = 0
            java.io.File r0 = r6.getFilesDir()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            java.io.File r2 = X.C17880vN.A0e(r0, r1)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            java.lang.String r1 = "rw"
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            r0.<init>(r2, r1)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            java.nio.channels.FileChannel r4 = r0.getChannel()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            java.nio.channels.FileLock r3 = r4.lock()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0020 }
            X.2qW r0 = new X.2qW     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0027 }
            r0.<init>(r4, r3)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0027 }
            return r0
        L_0x0020:
            r2 = move-exception
            r3 = r5
            goto L_0x0028
        L_0x0023:
            r2 = move-exception
            r4 = r5
            r3 = r5
            goto L_0x0028
        L_0x0027:
            r2 = move-exception
        L_0x0028:
            java.lang.String r1 = "CrossProcessLock"
            java.lang.String r0 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r1, r0, r2)
            if (r3 == 0) goto L_0x0034
            r3.release()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            if (r4 == 0) goto L_0x0039
            r4.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61932qW.A00(android.content.Context):X.2qW");
    }

    public void A01() {
        try {
            this.A01.release();
            this.A00.close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public C61932qW(FileChannel fileChannel, FileLock fileLock) {
        this.A00 = fileChannel;
        this.A01 = fileLock;
    }
}
