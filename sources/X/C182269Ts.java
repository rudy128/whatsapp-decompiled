package X;

import android.app.Application;
import android.os.Build;
import android.os.StrictMode;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.9Ts  reason: invalid class name and case insensitive filesystem */
public abstract class C182269Ts {
    public static volatile String A00;
    public static volatile boolean A01;

    public static final String A00() {
        String str;
        FileInputStream A18;
        if (!A01) {
            try {
                str = "robolectric";
                if (!str.equals(Build.FINGERPRINT)) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = Application.getProcessName();
                        C18070vi.A0X(str);
                    } else {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            A18 = C108945cZ.A18(C108945cZ.A17("/proc/self/cmdline"));
                            byte[] bArr = new byte[512];
                            int read = A18.read(bArr);
                            if (read != -1) {
                                String str2 = new String(bArr, 0, read, C26571Sq.A05);
                                int length = str2.length() - 1;
                                int i = 0;
                                boolean z = false;
                                while (i <= length) {
                                    int i2 = length;
                                    if (!z) {
                                        i2 = i;
                                    }
                                    boolean A1A = C108975cc.A1A(C18070vi.A00(str2.charAt(i2), 32));
                                    if (!z) {
                                        if (!A1A) {
                                            z = true;
                                        } else {
                                            i++;
                                        }
                                    } else if (A1A) {
                                        length--;
                                    }
                                }
                                str = C108985cd.A0g(length, i, str2);
                                A18.close();
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                            } else {
                                throw new EOFException();
                            }
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                }
            } catch (IOException unused) {
                str = null;
            }
            A00 = str;
            A01 = true;
        }
        return A00;
    }
}
