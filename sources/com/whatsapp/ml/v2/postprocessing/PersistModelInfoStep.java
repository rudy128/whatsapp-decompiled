package com.whatsapp.ml.v2.postprocessing;

import X.AnonymousClass89D;
import X.C18070vi;
import com.whatsapp.ml.v2.repo.MLModelRepository;

public final class PersistModelInfoStep implements AnonymousClass89D {
    public final MLModelRepository A00;

    public PersistModelInfoStep(MLModelRepository mLModelRepository) {
        C18070vi.A0d(mLModelRepository, 1);
        this.A00 = mLModelRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object CCc(X.AnonymousClass708 r6, java.io.File r7, java.lang.String r8, X.C30391dr r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.AnonymousClass7TT
            if (r0 == 0) goto L_0x0034
            r4 = r9
            X.7TT r4 = (X.AnonymousClass7TT) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0034
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 != r1) goto L_0x003a
            X.C30691eM.A01(r3)
        L_0x0020:
            X.8Jk r0 = new X.8Jk
            r0.<init>()
            return r0
        L_0x0026:
            X.C30691eM.A01(r3)
            com.whatsapp.ml.v2.repo.MLModelRepository r0 = r5.A00
            r4.label = r1
            java.lang.Object r0 = r0.A02(r6, r4)
            if (r0 != r2) goto L_0x0020
            return r2
        L_0x0034:
            X.7TT r4 = new X.7TT
            r4.<init>(r5, r9)
            goto L_0x0012
        L_0x003a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ml.v2.postprocessing.PersistModelInfoStep.CCc(X.708, java.io.File, java.lang.String, X.1dr):java.lang.Object");
    }

    public String Ba8() {
        return "PersistModelInfoStep";
    }
}
