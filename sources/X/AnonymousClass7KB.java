package X;

import android.graphics.Bitmap;
import java.io.ByteArrayInputStream;

/* renamed from: X.7KB  reason: invalid class name */
public final class AnonymousClass7KB implements AnonymousClass89E {
    public final AnonymousClass89E A00;
    public final String A01;
    public final /* synthetic */ C129756iJ A02;

    public void Bt7(Integer num) {
        C18070vi.A0d(num, 0);
        this.A00.Bt7(num);
    }

    public AnonymousClass7KB(AnonymousClass89E r1, C129756iJ r2, String str) {
        this.A02 = r2;
        this.A01 = str;
        this.A00 = r1;
    }

    public void C7X(byte[] bArr) {
        String A04;
        C127556eY r4 = (C127556eY) this.A02.A02.get();
        String str = this.A01;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        int dimensionPixelSize = AnonymousClass3MW.A05(r4.A00).getDimensionPixelSize(2131166784);
        Bitmap bitmap = AnonymousClass204.A0B(new AnonymousClass25O(dimensionPixelSize, dimensionPixelSize), byteArrayInputStream).A02;
        if (!(bitmap == null || (A04 = C17970vW.A04(str)) == null)) {
            ((A5O) r4.A01.getValue()).A03(bitmap, A04);
        }
        this.A00.C7X(bArr);
    }
}
