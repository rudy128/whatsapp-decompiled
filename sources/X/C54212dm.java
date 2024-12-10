package X;

import android.os.Environment;
import com.whatsapp.util.Log;

/* renamed from: X.2dm  reason: invalid class name and case insensitive filesystem */
public class C54212dm {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass00H A02;

    public C54212dm(AnonymousClass190 r8, AnonymousClass1L7 r9, C219217x r10, AnonymousClass11Z r11) {
        String A1H;
        C219217x r1 = r10;
        this.A02 = C18150vq.A01(new C70973Df(r1, r9, this, r11, r8, 1));
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            this.A00 = false;
            this.A01 = false;
            return;
        }
        if ("mounted_ro".equals(externalStorageState)) {
            this.A00 = false;
            this.A01 = true;
            A1H = "media-state-manager/main/media/read-only";
        } else {
            this.A00 = true;
            this.A01 = false;
            A1H = AnonymousClass001.A1H("media-state-manager/main/media/unavailable ", externalStorageState, AnonymousClass000.A10());
        }
        Log.i(A1H);
    }
}
