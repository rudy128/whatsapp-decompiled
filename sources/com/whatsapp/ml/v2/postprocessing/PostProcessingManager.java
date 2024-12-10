package com.whatsapp.ml.v2.postprocessing;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.C18070vi;
import java.util.List;

public final class PostProcessingManager {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final List A02 = AnonymousClass000.A13();

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass8AS r10, X.AnonymousClass8Ak r11, X.C30391dr r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.AnonymousClass7VA
            if (r0 == 0) goto L_0x00e8
            r4 = r12
            X.7VA r4 = (X.AnonymousClass7VA) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e8
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r8 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L_0x0059
            if (r0 != r3) goto L_0x00ef
            java.lang.Object r0 = r4.L$5
            X.89D r0 = (X.AnonymousClass89D) r0
            java.lang.Object r6 = r4.L$4
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r4.L$3
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r7 = r4.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = r4.L$1
            X.708 r1 = (X.AnonymousClass708) r1
            java.lang.Object r10 = r4.L$0
            X.8AS r10 = (X.AnonymousClass8AS) r10
            X.C30691eM.A01(r8)
        L_0x0038:
            java.lang.String r0 = r0.Ba8()
            r10.Biz(r0)
            X.8Jj r0 = new X.8Jj
            r0.<init>()
            boolean r0 = X.C18070vi.A18(r8, r0)
            if (r0 == 0) goto L_0x00c1
            java.io.File r0 = X.C108945cZ.A17(r7)
            X.C64062u9.A0Q(r0)
            X.C64062u9.A0Q(r2)
            r0 = 3
            r10.Biu(r0)
            return r8
        L_0x0059:
            X.C30691eM.A01(r8)
            java.lang.String r0 = "file_post_processing_start"
            r10.Biz(r0)
            X.708 r0 = r11.BV1()
            java.lang.Integer r0 = r0.A03
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x00e2
            com.whatsapp.ml.v2.compression.BrotliDecompressor r0 = new com.whatsapp.ml.v2.compression.BrotliDecompressor
            r0.<init>()
        L_0x0073:
            java.util.List r6 = r9.A02
            r6.add(r0)
            X.00H r2 = r9.A01
            java.lang.Object r1 = X.C18070vi.A0E(r2)
            com.whatsapp.ml.v2.MLModelUtilV2 r1 = (com.whatsapp.ml.v2.MLModelUtilV2) r1
            X.7K0 r0 = new X.7K0
            r0.<init>(r1)
            r6.add(r0)
            X.00H r0 = r9.A00
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            com.whatsapp.ml.v2.repo.MLModelRepository r1 = (com.whatsapp.ml.v2.repo.MLModelRepository) r1
            com.whatsapp.ml.v2.postprocessing.PersistModelInfoStep r0 = new com.whatsapp.ml.v2.postprocessing.PersistModelInfoStep
            r0.<init>(r1)
            r6.add(r0)
            java.util.List r0 = r11.BXN()
            if (r0 == 0) goto L_0x00a1
            r6.addAll(r0)
        L_0x00a1:
            X.708 r1 = r11.BV1()
            java.lang.Object r0 = r2.get()
            com.whatsapp.ml.v2.MLModelUtilV2 r0 = (com.whatsapp.ml.v2.MLModelUtilV2) r0
            java.lang.String r7 = r0.A03(r1)
            java.lang.Object r0 = r2.get()
            com.whatsapp.ml.v2.MLModelUtilV2 r0 = (com.whatsapp.ml.v2.MLModelUtilV2) r0
            java.lang.String r0 = r0.A04(r1)
            java.io.File r2 = X.C108945cZ.A17(r0)
            java.util.Iterator r6 = r6.iterator()
        L_0x00c1:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r0 = r6.next()
            X.89D r0 = (X.AnonymousClass89D) r0
            r4.L$0 = r10
            r4.L$1 = r1
            r4.L$2 = r7
            r4.L$3 = r2
            r4.L$4 = r6
            r4.L$5 = r0
            r4.label = r3
            java.lang.Object r8 = r0.CCc(r1, r2, r7, r4)
            if (r8 != r5) goto L_0x0038
            return r5
        L_0x00e2:
            X.7Jz r0 = new X.7Jz
            r0.<init>()
            goto L_0x0073
        L_0x00e8:
            X.7VA r4 = new X.7VA
            r4.<init>(r9, r12)
            goto L_0x0012
        L_0x00ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00f4:
            java.lang.String r0 = "file_post_processing_complete"
            r10.Biz(r0)
            r0 = 2
            r10.Biu(r0)
            X.8Jk r0 = new X.8Jk
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ml.v2.postprocessing.PostProcessingManager.A00(X.8AS, X.8Ak, X.1dr):java.lang.Object");
    }

    public PostProcessingManager(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0j(r2, r3);
        this.A01 = r2;
        this.A00 = r3;
    }
}
