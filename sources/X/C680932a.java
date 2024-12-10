package X;

import java.io.File;

/* renamed from: X.32a  reason: invalid class name and case insensitive filesystem */
public final class C680932a implements AnonymousClass16D {
    public final AnonymousClass18O A00;

    public C680932a(AnonymousClass18O r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public C59082lj C1O(AnonymousClass206 r8) {
        String str;
        C18070vi.A0d(r8, 0);
        if (r8 instanceof AnonymousClass21V) {
            if (r8 instanceof AnonymousClass21Y) {
                AnonymousClass21X r1 = (AnonymousClass21X) r8;
                if (r1.A1I()) {
                    if (r1.A08 == null) {
                        str = "media_enc_hash";
                        return new C59082lj(false, str);
                    }
                }
            }
            C62572rc r5 = ((AnonymousClass21V) r8).A02;
            if (r5 == null) {
                str = "null_media_data";
            } else if (r5.A0G == null) {
                str = "null_media_file";
            } else if (!r5.A01()) {
                str = "missing_media_file";
            } else {
                long j = r5.A0A;
                long j2 = 0;
                if (j != 0) {
                    File file = r5.A0G;
                    if (file != null) {
                        j2 = file.length();
                    }
                    if (j != j2) {
                        str = "wrong_file_size";
                    }
                }
                if (r8.A0v.A02 && !r5.A0V && !this.A00.A09(AnonymousClass18O.A0P)) {
                    str = "partially_uploaded";
                }
            }
            return new C59082lj(false, str);
        }
        return null;
    }

    public /* synthetic */ AnonymousClass206 C1M(C59652mf r2, AnonymousClass206 r3) {
        return null;
    }
}
