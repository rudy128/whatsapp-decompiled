package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9v6  reason: invalid class name and case insensitive filesystem */
public abstract class C196459v6 {
    public static final void A01(FileOutputStream fileOutputStream, InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.e("ArdAssetDownloader Exception when cleaning up input stream.", e);
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.flush();
                FileDescriptor fd = fileOutputStream.getFD();
                if (fd != null) {
                    fd.sync();
                }
                fileOutputStream.close();
            } catch (IOException e2) {
                Log.e("ArdAssetDownloader Exception when cleaning up output stream.", e2);
            }
        }
    }

    public static final void A00(C183659Zc r9, C20282AEq aEq, AnonymousClass9LV r11, File file, AtomicBoolean atomicBoolean) {
        Throwable th;
        ArrayList A00;
        boolean A1Z = AnonymousClass8BV.A1Z(atomicBoolean);
        StringBuilder A10 = AnonymousClass000.A10();
        C20282AEq aEq2 = aEq;
        if (A1Z) {
            A10.append("ArdAssetDownloader Download completed for ");
            A10.append(aEq.A01.A09);
            A10.append(". Exception = ");
            AnonymousClass9LV r7 = r11;
            C17900vP.A0b(r11, A10);
            C183659Zc r6 = r9;
            A65 a65 = r9.A01;
            synchronized (a65.A03) {
                A05 a05 = a65.A00;
                A05 a052 = r9.A00;
                if (a05 == a052) {
                    a65.A00 = null;
                    Map map = a65.A06;
                    String str = a052.A04.A08;
                    if (map.remove(str) == a052) {
                        a65.A05.remove(a052);
                        a052.A00(AnonymousClass00R.A0N);
                        a65.A04.add(new C21368Aix(r6, r7, aEq2, file, 6));
                        try {
                            A65.A01(a65);
                            A00 = A65.A00(a65);
                        } catch (IllegalArgumentException e) {
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append("old currentDownload uri=");
                            A102.append(str);
                            A102.append(" result=");
                            A102.append(file);
                            th = new RuntimeException(AnonymousClass001.A1E(r11, " old download exception=", A102), e);
                        }
                    } else {
                        th = new IllegalStateException();
                    }
                } else {
                    th = new IllegalStateException();
                }
                throw th;
            }
            A65.A02(a65, A00);
            return;
        }
        A10.append("ArdAssetDownloader Request canceled for ");
        A10.append(aEq.A01.A09);
        C17890vO.A1A(A10, ", ignoring failure callback.");
    }
}
