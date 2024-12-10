package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.4R1  reason: invalid class name */
public final class AnonymousClass4R1 {
    public final C32011gU A00;
    public final C18100vl A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final C18100vl A04;

    public final List A00(AnonymousClass206 r9) {
        String str;
        String A022;
        C18070vi.A0d(r9, 0);
        if (C72453Mb.A1a(this.A02)) {
            ArrayList A13 = AnonymousClass000.A13();
            File file = null;
            if (r9 instanceof AnonymousClass210) {
                str = r9.A0P();
            } else if (r9 instanceof AnonymousClass21V) {
                str = ((AnonymousClass21V) r9).A18();
            } else {
                str = null;
            }
            if (C72453Mb.A1a(this.A04) && (A022 = this.A00.A02(str)) != null) {
                A13.add(new AnonymousClass46p(A022));
            }
            if (r9 instanceof C438421d) {
                C62572rc r1 = ((AnonymousClass21V) r9).A02;
                if (r1 != null) {
                    file = r1.A0G;
                }
                if (!(!C72453Mb.A1a(this.A01) || r1 == null || file == null)) {
                    A13.add(new C1776399u(file, r1.A08, r1.A06));
                }
            }
            if (C72453Mb.A1a(this.A03) && str != null) {
                CharSequence charSequence = str;
                Pattern pattern = C50912Wg.A00;
                if (str.length() > 4096) {
                    charSequence = str.subSequence(0, ZipDecompressor.UNZIP_BUFFER_SIZE);
                }
                if (!pattern.matcher(charSequence).matches()) {
                    A13.add(new AnonymousClass46o(str));
                }
            }
            if (!A13.isEmpty()) {
                return A13;
            }
        }
        return null;
    }

    public AnonymousClass4R1(C18030ve r2, C32011gU r3) {
        C18070vi.A0j(r2, r3);
        this.A00 = r3;
        this.A04 = AnonymousClass1DF.A01(new AnonymousClass5LU(r2));
        this.A03 = AnonymousClass1DF.A01(new AnonymousClass5LT(r2));
        this.A01 = AnonymousClass1DF.A01(new AnonymousClass5LR(r2));
        this.A02 = AnonymousClass1DF.A01(new AnonymousClass5LS(r2));
    }
}
