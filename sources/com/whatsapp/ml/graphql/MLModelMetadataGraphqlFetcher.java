package com.whatsapp.ml.graphql;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass190;
import X.AnonymousClass3Ma;
import X.AnonymousClass7I6;
import X.C108945cZ;
import X.C108965cb;
import X.C172468tT;
import X.C17890vO;
import X.C18030ve;
import X.C18070vi;
import X.C22821Di;
import X.C51402Yd;

public final class MLModelMetadataGraphqlFetcher {
    public final AnonymousClass190 A00;
    public final C51402Yd A01;

    public void A01(String str, String str2, C22821Di r12, int i) {
        C18070vi.A0i(str, str2);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MLModelMetadataGraphqlFetcher/fetch/start to fetch ml model metadata for ");
        A10.append(str);
        A10.append(' ');
        A10.append(i);
        C17890vO.A1A(A10, " #");
        AnonymousClass10E r0 = this.A01.A00.A00;
        C18030ve A8r = AnonymousClass10E.A8r(r0);
        new C172468tT(C108965cb.A0H(r0), AnonymousClass3Ma.A0c(r0), A8r, C108945cZ.A14(r0), str, str2, i).CBv(new AnonymousClass7I6(this, str, r12, i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A00(java.lang.String r6, java.lang.String r7, X.C30391dr r8, int r9) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.AnonymousClass7V2
            if (r0 == 0) goto L_0x0045
            r4 = r8
            X.7V2 r4 = (X.AnonymousClass7V2) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0045
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 != r0) goto L_0x004b
            X.C30691eM.A01(r3)
        L_0x0020:
            X.1eK r3 = (X.C30671eK) r3
            java.lang.Object r0 = r3.value
            return r0
        L_0x0025:
            X.C30691eM.A01(r3)
            r4.L$0 = r5
            r4.L$1 = r6
            r4.L$2 = r7
            r4.I$0 = r9
            r4.label = r0
            X.3Dp r1 = X.C108975cc.A0k(r4)
            X.80H r0 = new X.80H
            r0.<init>(r1)
            r5.A01(r6, r7, r0, r9)
            java.lang.Object r3 = r1.A00()
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x0045:
            X.7V2 r4 = new X.7V2
            r4.<init>(r5, r8)
            goto L_0x0012
        L_0x004b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ml.graphql.MLModelMetadataGraphqlFetcher.A00(java.lang.String, java.lang.String, X.1dr, int):java.lang.Object");
    }

    public MLModelMetadataGraphqlFetcher(AnonymousClass190 r1, C51402Yd r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
