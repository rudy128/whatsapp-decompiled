package X;

import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: X.6mC  reason: invalid class name and case insensitive filesystem */
public final class C132096mC {
    public final C25311Ns A00;
    public final AnonymousClass00H A01;

    public final String A00(String str, String str2) {
        File A04 = this.A00.A04(str, str2);
        if (A04.exists()) {
            C136706uF A012 = ((C138906xt) this.A01.get()).A01(A04, str2);
            if (A012 != null) {
                return A012.A01(A04);
            }
            return null;
        }
        throw new FileNotFoundException("StickerImageHashCalculator/getImageHash/could not get internally managed media file for sticker");
    }

    public C132096mC(C25311Ns r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
