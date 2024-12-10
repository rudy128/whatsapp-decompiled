package X;

import android.graphics.Bitmap;
import android.util.TypedValue;
import java.io.File;

/* renamed from: X.71H  reason: invalid class name */
public final class AnonymousClass71H {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public static final Bitmap A00(AnonymousClass71H r4, File file, String str) {
        if (file == null || !file.exists()) {
            return null;
        }
        int applyDimension = (int) TypedValue.applyDimension(1, 28.0f, AnonymousClass3MW.A05(r4.A02).getDisplayMetrics());
        Bitmap bitmap = AnonymousClass204.A0A(new AnonymousClass25O(applyDimension, applyDimension), file).A02;
        boolean A05 = C18020vd.A05(C18040vf.A02, r4.A00, 575);
        if (bitmap != null && A05) {
            ((C56992iM) r4.A03.get()).A00(bitmap, str);
        }
        return bitmap;
    }

    public static final File A01(AnonymousClass71H r1, String str, boolean z) {
        return ((C138926xv) r1.A04.get()).A01(C108995ce.A0Z(str), z);
    }

    public AnonymousClass71H(AnonymousClass118 r1, C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r2, r1, r3, r4, r5);
        this.A00 = r2;
        this.A02 = r1;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r5;
    }
}
