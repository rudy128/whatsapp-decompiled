package X;

import android.os.StrictMode;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Random;

/* renamed from: X.DaO  reason: case insensitive filesystem */
public class C27244DaO extends ThreadLocal {
    public /* bridge */ /* synthetic */ Object initialValue() {
        FileInputStream fileInputStream;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileInputStream = new FileInputStream("/dev/urandom");
            ByteBuffer allocate = ByteBuffer.allocate(8);
            fileInputStream.read(allocate.array());
            Random random = new Random(allocate.getLong());
            fileInputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return random;
        } catch (IOException e) {
            try {
                throw BE6.A0o("Cannot read from /dev/urandom", e);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th;
            }
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
        throw th;
    }
}
