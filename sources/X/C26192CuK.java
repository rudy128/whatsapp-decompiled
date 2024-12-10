package X;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.CuK  reason: case insensitive filesystem */
public class C26192CuK {
    public static C26192CuK A07;
    public static final long A08 = TimeUnit.MINUTES.toMillis(2);
    public long A00;
    public final Lock A01 = new ReentrantLock();
    public volatile StatFs A02 = null;
    public volatile StatFs A03 = null;
    public volatile File A04;
    public volatile File A05;
    public volatile boolean A06 = false;

    public static StatFs A00(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            if (statFs == null) {
                try {
                    return new StatFs(file.getAbsolutePath());
                } catch (IllegalArgumentException unused) {
                } catch (Throwable th) {
                    throw C24546C8r.A00(th);
                }
            } else {
                statFs.restat(file.getAbsolutePath());
                return statFs;
            }
        }
        return null;
    }

    public static synchronized C26192CuK A01() {
        C26192CuK cuK;
        synchronized (C26192CuK.class) {
            cuK = A07;
            if (cuK == null) {
                cuK = new C26192CuK();
                A07 = cuK;
            }
        }
        return cuK;
    }

    public static void A02(C26192CuK cuK) {
        if (!cuK.A06) {
            Lock lock = cuK.A01;
            lock.lock();
            try {
                if (!cuK.A06) {
                    cuK.A05 = Environment.getDataDirectory();
                    cuK.A04 = Environment.getExternalStorageDirectory();
                    cuK.A03 = A00(cuK.A03, cuK.A05);
                    cuK.A02 = A00(cuK.A02, cuK.A04);
                    cuK.A00 = SystemClock.uptimeMillis();
                    cuK.A06 = true;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public long A03(Integer num) {
        StatFs statFs;
        A02(this);
        Lock lock = this.A01;
        if (lock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.A00 > A08) {
                    this.A03 = A00(this.A03, this.A05);
                    this.A02 = A00(this.A02, this.A04);
                    this.A00 = SystemClock.uptimeMillis();
                }
            } finally {
                lock.unlock();
            }
        }
        if (num == AnonymousClass00R.A00) {
            statFs = this.A03;
        } else {
            statFs = this.A02;
        }
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0;
    }
}
