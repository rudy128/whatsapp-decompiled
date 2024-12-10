package com.whatsapp.ml.v2;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11E;
import X.AnonymousClass708;
import X.C108975cc;
import X.C122716Rq;
import X.C127536eW;
import X.C134406qX;
import X.C17880vN;
import X.C17890vO;
import X.C17930vS;
import X.C18070vi;
import X.C18600wl;
import X.C64062u9;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public final class MLModelUtilV2 {
    public final AnonymousClass11E A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C18600wl A03;
    public final AnonymousClass00H A04;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass708 r7, java.io.InputStream r8, X.C30391dr r9, X.C22821Di r10, boolean r11) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.AnonymousClass7TR
            if (r0 == 0) goto L_0x0038
            r4 = r9
            X.7TR r4 = (X.AnonymousClass7TR) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0038
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0024
            if (r0 != r1) goto L_0x003e
            X.C30691eM.A01(r3)
        L_0x0020:
            X.C18070vi.A0a(r3)
            return r3
        L_0x0024:
            X.C30691eM.A01(r3)
            X.0wl r0 = r6.A03
            r9 = 0
            com.whatsapp.ml.v2.MLModelUtilV2$saveFile$3 r5 = new com.whatsapp.ml.v2.MLModelUtilV2$saveFile$3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.label = r1
            java.lang.Object r3 = X.C30451dy.A00(r4, r0, r5)
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x0038:
            X.7TR r4 = new X.7TR
            r4.<init>(r6, r9)
            goto L_0x0012
        L_0x003e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ml.v2.MLModelUtilV2.A02(X.708, java.io.InputStream, X.1dr, X.1Di, boolean):java.lang.Object");
    }

    public MLModelUtilV2(AnonymousClass11E r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, C18600wl r5) {
        C18070vi.A0w(r2, r3, r1, r4, r5);
        this.A02 = r2;
        this.A04 = r3;
        this.A00 = r1;
        this.A01 = r4;
        this.A03 = r5;
    }

    public static final String A00(AnonymousClass708 r2) {
        StringBuilder A0K = C18070vi.A0K(r2);
        C108975cc.A14(A0K, r2.A06);
        return C17880vN.A0t(A0K, r2.A01);
    }

    public static final void A01(MLModelUtilV2 mLModelUtilV2, AnonymousClass708 r3, File file, InputStream inputStream) {
        String A002 = A00(r3);
        C18070vi.A0d(A002, 0);
        C127536eW r2 = ((C134406qX) mLModelUtilV2.A04.get()).A00;
        String A0y = AnonymousClass000.A0y("_cancel", AnonymousClass000.A11(A002));
        C18070vi.A0d(A0y, 0);
        if (C17880vN.A0C(r2.A01).getBoolean(A0y, false)) {
            C64062u9.A0Q(file);
        }
        try {
            inputStream.close();
        } catch (IOException e) {
            Log.e("MLModelUtilV2/failed to cleanup", e);
        }
    }

    public final String A03(AnonymousClass708 r5) {
        StringBuilder A0K = C18070vi.A0K(r5);
        C122716Rq r2 = r5.A02;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(((C17930vS) this.A01.get()).A01().getCanonicalPath());
        A10.append("/ML_MODEL/");
        A10.append(r2);
        A0K.append(C17890vO.A0c(A10, '/'));
        A0K.append(A00(r5));
        A0K.append('.');
        return AnonymousClass000.A0y(r5.A05, A0K);
    }

    public final String A04(AnonymousClass708 r3) {
        String str;
        StringBuilder A0K = C18070vi.A0K(r3);
        A0K.append(A03(r3));
        A0K.append('.');
        if (r3.A03.intValue() != 0) {
            str = "TAR_BROTLI";
        } else {
            str = "NONE";
        }
        return AnonymousClass000.A0y(str, A0K);
    }
}
