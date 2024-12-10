package X;

import android.os.Environment;
import android.os.StatFs;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.11Z  reason: invalid class name */
public class AnonymousClass11Z {
    public void A05() {
        Locale locale = Locale.ENGLISH;
        Log.i(String.format(locale, "StorageUtils/log-available-space/internal-storage available:%,d total:%,d", new Object[]{Long.valueOf(A02()), Long.valueOf(A04())}));
        Log.i(String.format(locale, "StorageUtils/log-available-space/external-storage available: %,d total: %,d", new Object[]{Long.valueOf(A01()), Long.valueOf(A03())}));
    }

    public static boolean A00() {
        try {
            return Environment.isExternalStorageRemovable();
        } catch (Exception e) {
            Log.w("StorageUtils/checkifremovable/error ", e);
            return true;
        }
    }

    public long A01() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (ArithmeticException | IllegalArgumentException e) {
            Log.w("StorageUtils/avail-external-storage/error/", e);
            return 0;
        }
    }

    public long A02() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public long A03() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (IllegalArgumentException e) {
            Log.w("StorageUtils/total-external-storage/error/illegal-arg", e);
            return 0;
        }
    }

    public long A04() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }
}
