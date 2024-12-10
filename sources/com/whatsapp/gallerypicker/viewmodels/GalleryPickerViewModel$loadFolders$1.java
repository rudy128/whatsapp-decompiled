package com.whatsapp.gallerypicker.viewmodels;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$loadFolders$1", f = "GalleryPickerViewModel.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {233, 238, 240, 243, 249}, m = "invokeSuspend", n = {"$this$launch", "bucketsCollector", "$this$launch", "bucketsCollector", "$this$launch", "bucketsCollector", "$this$launch", "bucketsCollector"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
public final class GalleryPickerViewModel$loadFolders$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $approxFirstPageThumbCount;
    public final /* synthetic */ int $includeMediaTypes;
    public final /* synthetic */ boolean $whatsAppOnly;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ GalleryPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryPickerViewModel$loadFolders$1(GalleryPickerViewModel galleryPickerViewModel, C30391dr r3, int i, int i2, boolean z) {
        super(2, r3);
        this.this$0 = galleryPickerViewModel;
        this.$approxFirstPageThumbCount = i;
        this.$whatsAppOnly = z;
        this.$includeMediaTypes = i2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C30391dr r2 = r8;
        GalleryPickerViewModel$loadFolders$1 galleryPickerViewModel$loadFolders$1 = new GalleryPickerViewModel$loadFolders$1(this.this$0, r2, this.$approxFirstPageThumbCount, this.$includeMediaTypes, this.$whatsAppOnly);
        galleryPickerViewModel$loadFolders$1.L$0 = obj;
        return galleryPickerViewModel$loadFolders$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096 A[Catch:{ CancellationException -> 0x00d8 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa A[Catch:{ CancellationException -> 0x00d8 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4 A[Catch:{ CancellationException -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7 A[Catch:{ CancellationException -> 0x00d8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            r9 = r16
            int r2 = r9.label
            r0 = 5
            r4 = 4
            r5 = 3
            r1 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r6) goto L_0x003d
            if (r2 == r1) goto L_0x0034
            if (r2 == r5) goto L_0x002b
            if (r2 == r4) goto L_0x0021
            if (r2 != r0) goto L_0x001c
            X.C30691eM.A01(r17)     // Catch:{ CancellationException -> 0x00d8 }
            goto L_0x00de
        L_0x001c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0021:
            java.lang.Object r7 = r9.L$1
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r7 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r7
            java.lang.Object r2 = r9.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
            goto L_0x00ab
        L_0x002b:
            java.lang.Object r7 = r9.L$1
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r7 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r7
            java.lang.Object r2 = r9.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
            goto L_0x0097
        L_0x0034:
            java.lang.Object r7 = r9.L$1
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r7 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r7
            java.lang.Object r2 = r9.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
            goto L_0x0083
        L_0x003d:
            java.lang.Object r7 = r9.L$1
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r7 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r7
            java.lang.Object r2 = r9.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
            goto L_0x0071
        L_0x0046:
            X.C30691eM.A01(r17)
            java.lang.Object r2 = r9.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r8 = r9.this$0     // Catch:{ CancellationException -> 0x00d8 }
            int r13 = r9.$approxFirstPageThumbCount     // Catch:{ CancellationException -> 0x00d8 }
            X.6Qh r11 = X.C122446Qh.DEFAULT     // Catch:{ CancellationException -> 0x00d8 }
            r14 = 1000(0x3e8, double:4.94E-321)
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r7 = new com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector     // Catch:{ CancellationException -> 0x00d8 }
            r10 = r7
            r12 = r8
            r10.<init>(r11, r12, r13, r14)     // Catch:{ CancellationException -> 0x00d8 }
            boolean r0 = r9.$whatsAppOnly     // Catch:{ CancellationException -> 0x00d8 }
            if (r0 != 0) goto L_0x009a
            int r10 = r9.$includeMediaTypes     // Catch:{ CancellationException -> 0x00d8 }
            r9.L$0 = r2     // Catch:{ CancellationException -> 0x00d8 }
            r9.L$1 = r7     // Catch:{ CancellationException -> 0x00d8 }
            r9.label = r6     // Catch:{ CancellationException -> 0x00d8 }
            r11 = 0
            r12 = r11
            java.lang.Object r0 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A0A(r7, r8, r9, r10, r11, r12)     // Catch:{ CancellationException -> 0x00d8 }
            if (r0 != r3) goto L_0x0074
            return r3
        L_0x0071:
            X.C30691eM.A01(r17)     // Catch:{ CancellationException -> 0x00d8 }
        L_0x0074:
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r0 = r9.this$0     // Catch:{ CancellationException -> 0x00d8 }
            r9.L$0 = r2     // Catch:{ CancellationException -> 0x00d8 }
            r9.L$1 = r7     // Catch:{ CancellationException -> 0x00d8 }
            r9.label = r1     // Catch:{ CancellationException -> 0x00d8 }
            java.lang.Object r0 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A06(r7, r0, r9)     // Catch:{ CancellationException -> 0x00d8 }
            if (r0 != r3) goto L_0x0086
            return r3
        L_0x0083:
            X.C30691eM.A01(r17)     // Catch:{ CancellationException -> 0x00d8 }
        L_0x0086:
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r1 = r9.this$0     // Catch:{ CancellationException -> 0x00d8 }
            int r0 = r9.$includeMediaTypes     // Catch:{ CancellationException -> 0x00d8 }
            r9.L$0 = r2     // Catch:{ CancellationException -> 0x00d8 }
            r9.L$1 = r7     // Catch:{ CancellationException -> 0x00d8 }
            r9.label = r5     // Catch:{ CancellationException -> 0x00d8 }
            java.lang.Object r0 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A07(r7, r1, r9, r0)     // Catch:{ CancellationException -> 0x00d8 }
            if (r0 != r3) goto L_0x009a
            return r3
        L_0x0097:
            X.C30691eM.A01(r17)     // Catch:{ CancellationException -> 0x00d8 }
        L_0x009a:
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r1 = r9.this$0     // Catch:{ CancellationException -> 0x00d8 }
            int r0 = r9.$includeMediaTypes     // Catch:{ CancellationException -> 0x00d8 }
            r9.L$0 = r2     // Catch:{ CancellationException -> 0x00d8 }
            r9.L$1 = r7     // Catch:{ CancellationException -> 0x00d8 }
            r9.label = r4     // Catch:{ CancellationException -> 0x00d8 }
            java.lang.Object r0 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A09(r7, r1, r9, r0)     // Catch:{ CancellationException -> 0x00d8 }
            if (r0 != r3) goto L_0x00ae
            return r3
        L_0x00ab:
            X.C30691eM.A01(r17)     // Catch:{ CancellationException -> 0x00d8 }
        L_0x00ae:
            boolean r0 = X.AnonymousClass1OW.A05(r2)     // Catch:{ CancellationException -> 0x00d8 }
            if (r0 != 0) goto L_0x00b7
            X.1Wu r3 = X.C27621Wu.A00     // Catch:{ CancellationException -> 0x00d8 }
            return r3
        L_0x00b7:
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r6 = r9.this$0     // Catch:{ CancellationException -> 0x00d8 }
            java.util.List r5 = r7.A02     // Catch:{ CancellationException -> 0x00d8 }
            X.6Qh r4 = X.C122446Qh.DEFAULT     // Catch:{ CancellationException -> 0x00d8 }
            r0 = 0
            r9.L$0 = r0     // Catch:{ CancellationException -> 0x00d8 }
            r9.L$1 = r0     // Catch:{ CancellationException -> 0x00d8 }
            r0 = 5
            r9.label = r0     // Catch:{ CancellationException -> 0x00d8 }
            X.0wl r2 = r6.A0H     // Catch:{ CancellationException -> 0x00d8 }
            r1 = 0
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$notifyFolderAdded$2 r0 = new com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$notifyFolderAdded$2     // Catch:{ CancellationException -> 0x00d8 }
            r0.<init>(r4, r6, r5, r1)     // Catch:{ CancellationException -> 0x00d8 }
            java.lang.Object r0 = X.C30451dy.A00(r9, r2, r0)     // Catch:{ CancellationException -> 0x00d8 }
            java.lang.Object r0 = X.AnonymousClass3MX.A13(r0)     // Catch:{ CancellationException -> 0x00d8 }
            if (r0 != r3) goto L_0x00de
            return r3
        L_0x00d8:
            r1 = move-exception
            java.lang.String r0 = "GalleryPickerViewModel/loadFolders/error"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00de:
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$loadFolders$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GalleryPickerViewModel$loadFolders$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
