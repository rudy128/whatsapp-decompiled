package X;

import android.net.Uri;
import java.util.HashMap;

/* renamed from: X.65c  reason: invalid class name */
public final class AnonymousClass65c extends AnonymousClass7H8 {
    public static final Uri A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass65c(X.AnonymousClass11C r10, X.C18030ve r11, com.whatsapp.media.WamediaManager r12, X.AnonymousClass1Q5 r13, java.lang.String r14, int r15) {
        /*
            r9 = this;
            android.net.Uri r0 = A00
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = "bucketId"
            r6 = r14
            android.net.Uri$Builder r2 = r1.appendQueryParameter(r0, r14)
            r0 = 1
            java.lang.String r1 = "include"
            if (r15 == r0) goto L_0x0032
            r0 = 2
            if (r15 == r0) goto L_0x002f
            r0 = 4
            if (r15 != r0) goto L_0x001d
            java.lang.String r0 = "video"
        L_0x001a:
            r2.appendQueryParameter(r1, r0)
        L_0x001d:
            android.net.Uri r1 = r2.build()
            X.C18070vi.A0X(r1)
            r7 = 2
            r8 = 0
            r0 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x002f:
            java.lang.String r0 = "gif"
            goto L_0x001a
        L_0x0032:
            java.lang.String r0 = "images"
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass65c.<init>(X.11C, X.0ve, com.whatsapp.media.WamediaManager, X.1Q5, java.lang.String, int):void");
    }

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("content://");
        A10.append("com.whatsapp");
        Uri parse = Uri.parse(AnonymousClass000.A0y(".provider.media/items", A10));
        C18070vi.A0X(parse);
        A00 = parse;
    }

    public HashMap BNm() {
        return C17880vN.A11();
    }
}
