package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.73M  reason: invalid class name */
public final class AnonymousClass73M {
    public final AnonymousClass118 A00;

    public AnonymousClass73M(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final File A01(File file, String str) {
        File A0e = C17880vN.A0e(file, "coin_flip");
        if (!A0e.exists()) {
            return null;
        }
        File A0e2 = C17880vN.A0e(A0e, str);
        if (A0e2.exists()) {
            return A0e2;
        }
        return null;
    }

    public static final void A02(File file, String str, byte[] bArr) {
        try {
            File A0e = C17880vN.A0e(file, "coin_flip");
            if (!A0e.exists()) {
                A0e.mkdir();
            }
            C64062u9.A0L(C17880vN.A0e(A0e, str), bArr);
        } catch (IOException e) {
            Log.e("AvatarCoinFlipCacheHelper/saveFile", e);
            throw e;
        }
    }

    public static final void A03(String str, File file) {
        C108985cd.A1C(C17880vN.A0e(C17880vN.A0e(file, "coin_flip"), str));
    }

    public static File A00(AnonymousClass00H r0) {
        File filesDir = ((AnonymousClass73M) r0.get()).A00.A00.getFilesDir();
        C18070vi.A0X(filesDir);
        return filesDir;
    }
}
