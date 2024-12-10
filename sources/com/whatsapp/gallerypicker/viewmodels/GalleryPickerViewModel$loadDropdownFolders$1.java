package com.whatsapp.gallerypicker.viewmodels;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$loadDropdownFolders$1", f = "GalleryPickerViewModel.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {302, 304, 312, 318, 327}, m = "invokeSuspend", n = {"$this$launch", "bucketsCollector", "$this$launch", "bucketsCollector", "$this$launch", "bucketsCollector", "$this$launch", "bucketsCollector"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
public final class GalleryPickerViewModel$loadDropdownFolders$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $approxFirstPageThumbCount;
    public final /* synthetic */ boolean $includeGoogle;
    public final /* synthetic */ int $includeMediaTypes;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ GalleryPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryPickerViewModel$loadDropdownFolders$1(GalleryPickerViewModel galleryPickerViewModel, C30391dr r3, int i, int i2, boolean z) {
        super(2, r3);
        this.this$0 = galleryPickerViewModel;
        this.$approxFirstPageThumbCount = i;
        this.$includeMediaTypes = i2;
        this.$includeGoogle = z;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        GalleryPickerViewModel$loadDropdownFolders$1 galleryPickerViewModel$loadDropdownFolders$1 = new GalleryPickerViewModel$loadDropdownFolders$1(this.this$0, r8, this.$approxFirstPageThumbCount, this.$includeMediaTypes, this.$includeGoogle);
        galleryPickerViewModel$loadDropdownFolders$1.L$0 = obj;
        return galleryPickerViewModel$loadDropdownFolders$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f2 A[Catch:{ CancellationException -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0129 A[Catch:{ CancellationException -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012c A[Catch:{ CancellationException -> 0x014b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            r5 = r20
            int r1 = r5.label
            r0 = 5
            r7 = 4
            r6 = 3
            r10 = 2
            r8 = 1
            r13 = 0
            if (r1 == 0) goto L_0x004d
            if (r1 == r8) goto L_0x0043
            if (r1 == r10) goto L_0x0039
            if (r1 == r6) goto L_0x002c
            if (r1 == r7) goto L_0x0022
            if (r1 != r0) goto L_0x001d
            X.C30691eM.A01(r21)     // Catch:{ CancellationException -> 0x014b }
            goto L_0x0151
        L_0x001d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0022:
            java.lang.Object r1 = r5.L$1
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r1 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r1
            java.lang.Object r4 = r5.L$0
            X.1OX r4 = (X.AnonymousClass1OX) r4
            goto L_0x0120
        L_0x002c:
            java.lang.Object r1 = r5.L$1
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r1 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r1
            java.lang.Object r4 = r5.L$0
            X.1OX r4 = (X.AnonymousClass1OX) r4
            X.C30691eM.A01(r21)     // Catch:{ all -> 0x00ee }
            goto L_0x00ee
        L_0x0039:
            java.lang.Object r1 = r5.L$1
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r1 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r1
            java.lang.Object r4 = r5.L$0
            X.1OX r4 = (X.AnonymousClass1OX) r4
            goto L_0x00d7
        L_0x0043:
            java.lang.Object r1 = r5.L$1
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r1 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r1
            java.lang.Object r4 = r5.L$0
            X.1OX r4 = (X.AnonymousClass1OX) r4
            goto L_0x00eb
        L_0x004d:
            X.C30691eM.A01(r21)
            java.lang.Object r4 = r5.L$0
            X.1OX r4 = (X.AnonymousClass1OX) r4
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r0 = r5.this$0     // Catch:{ CancellationException -> 0x014b }
            X.0ve r2 = r0.A0C     // Catch:{ CancellationException -> 0x014b }
            r1 = 12648(0x3168, float:1.7724E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ CancellationException -> 0x014b }
            boolean r9 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ CancellationException -> 0x014b }
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r2 = r5.this$0     // Catch:{ CancellationException -> 0x014b }
            int r0 = r5.$approxFirstPageThumbCount     // Catch:{ CancellationException -> 0x014b }
            X.6Qh r15 = X.C122446Qh.DROPDOWN     // Catch:{ CancellationException -> 0x014b }
            if (r9 == 0) goto L_0x006b
            r18 = 0
            goto L_0x006d
        L_0x006b:
            r18 = 1000(0x3e8, double:4.94E-321)
        L_0x006d:
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r1 = new com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector     // Catch:{ CancellationException -> 0x014b }
            r14 = r1
            r16 = r2
            r17 = r0
            r14.<init>(r15, r16, r17, r18)     // Catch:{ CancellationException -> 0x014b }
            if (r9 == 0) goto L_0x00bf
            X.EEF[] r11 = new X.EEF[r10]     // Catch:{ CancellationException -> 0x014b }
            X.0vl r0 = r2.A0F     // Catch:{ CancellationException -> 0x014b }
            java.lang.Object r9 = r0.getValue()     // Catch:{ CancellationException -> 0x014b }
            X.1OX r9 = (X.AnonymousClass1OX) r9     // Catch:{ CancellationException -> 0x014b }
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r6 = r5.this$0     // Catch:{ CancellationException -> 0x014b }
            int r2 = r5.$includeMediaTypes     // Catch:{ CancellationException -> 0x014b }
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$loadDropdownFolders$1$1 r0 = new com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$loadDropdownFolders$1$1     // Catch:{ CancellationException -> 0x014b }
            r0.<init>(r1, r6, r13, r2)     // Catch:{ CancellationException -> 0x014b }
            X.1OR r12 = X.AnonymousClass1OR.A00     // Catch:{ CancellationException -> 0x014b }
            java.lang.Integer r10 = X.AnonymousClass00R.A00     // Catch:{ CancellationException -> 0x014b }
            X.5WH r2 = X.C30451dy.A01(r10, r12, r0, r9)     // Catch:{ CancellationException -> 0x014b }
            r0 = 0
            r11[r0] = r2     // Catch:{ CancellationException -> 0x014b }
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r0 = r5.this$0     // Catch:{ CancellationException -> 0x014b }
            X.0vl r0 = r0.A0F     // Catch:{ CancellationException -> 0x014b }
            java.lang.Object r9 = r0.getValue()     // Catch:{ CancellationException -> 0x014b }
            X.1OX r9 = (X.AnonymousClass1OX) r9     // Catch:{ CancellationException -> 0x014b }
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r6 = r5.this$0     // Catch:{ CancellationException -> 0x014b }
            int r2 = r5.$includeMediaTypes     // Catch:{ CancellationException -> 0x014b }
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$loadDropdownFolders$1$2 r0 = new com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$loadDropdownFolders$1$2     // Catch:{ CancellationException -> 0x014b }
            r0.<init>(r1, r6, r13, r2)     // Catch:{ CancellationException -> 0x014b }
            X.5WH r0 = X.C30451dy.A01(r10, r12, r0, r9)     // Catch:{ CancellationException -> 0x014b }
            java.util.List r0 = X.C18070vi.A0O(r0, r11, r8)     // Catch:{ CancellationException -> 0x014b }
            r5.L$0 = r4     // Catch:{ CancellationException -> 0x014b }
            r5.L$1 = r1     // Catch:{ CancellationException -> 0x014b }
            r5.label = r8     // Catch:{ CancellationException -> 0x014b }
            java.lang.Object r0 = X.C197009w0.A00(r0, r5)     // Catch:{ CancellationException -> 0x014b }
            if (r0 != r3) goto L_0x00ee
            return r3
        L_0x00bf:
            int r0 = r5.$includeMediaTypes     // Catch:{ CancellationException -> 0x014b }
            r5.L$0 = r4     // Catch:{ CancellationException -> 0x014b }
            r5.L$1 = r1     // Catch:{ CancellationException -> 0x014b }
            r5.label = r10     // Catch:{ CancellationException -> 0x014b }
            r19 = r8
            r15 = r2
            r16 = r5
            r17 = r0
            r18 = r8
            java.lang.Object r0 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A0A(r14, r15, r16, r17, r18, r19)     // Catch:{ CancellationException -> 0x014b }
            if (r0 != r3) goto L_0x00da
            return r3
        L_0x00d7:
            X.C30691eM.A01(r21)     // Catch:{ CancellationException -> 0x014b }
        L_0x00da:
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r2 = r5.this$0     // Catch:{ CancellationException -> 0x014b }
            int r0 = r5.$includeMediaTypes     // Catch:{ CancellationException -> 0x014b }
            r5.L$0 = r4     // Catch:{ all -> 0x00ee }
            r5.L$1 = r1     // Catch:{ all -> 0x00ee }
            r5.label = r6     // Catch:{ all -> 0x00ee }
            java.lang.Object r0 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A08(r1, r2, r5, r0)     // Catch:{ all -> 0x00ee }
            if (r0 != r3) goto L_0x00ee
            return r3
        L_0x00eb:
            X.C30691eM.A01(r21)     // Catch:{ CancellationException -> 0x014b }
        L_0x00ee:
            int r0 = r1.A00     // Catch:{ CancellationException -> 0x014b }
            if (r0 <= 0) goto L_0x0123
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r2 = r5.this$0     // Catch:{ CancellationException -> 0x014b }
            int r6 = r5.$includeMediaTypes     // Catch:{ CancellationException -> 0x014b }
            boolean r0 = r5.$includeGoogle     // Catch:{ CancellationException -> 0x014b }
            r5.L$0 = r4     // Catch:{ CancellationException -> 0x014b }
            r5.L$1 = r1     // Catch:{ CancellationException -> 0x014b }
            r5.label = r7     // Catch:{ CancellationException -> 0x014b }
            if (r0 == 0) goto L_0x0123
            X.118 r0 = r2.A0B     // Catch:{ CancellationException -> 0x014b }
            android.content.Context r2 = r0.A00     // Catch:{ CancellationException -> 0x014b }
            r0 = 2131895587(0x7f122523, float:1.9426011E38)
            java.lang.String r15 = X.C18070vi.A0F(r2, r0)     // Catch:{ CancellationException -> 0x014b }
            r16 = 12
            r18 = -1
            r19 = 0
            X.6yS r12 = new X.6yS     // Catch:{ CancellationException -> 0x014b }
            r14 = r13
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ CancellationException -> 0x014b }
            java.lang.Object r0 = r1.A01(r12, r5)     // Catch:{ CancellationException -> 0x014b }
            if (r0 != r3) goto L_0x0123
            return r3
        L_0x0120:
            X.C30691eM.A01(r21)     // Catch:{ CancellationException -> 0x014b }
        L_0x0123:
            boolean r0 = X.AnonymousClass1OW.A05(r4)     // Catch:{ CancellationException -> 0x014b }
            if (r0 != 0) goto L_0x012c
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ CancellationException -> 0x014b }
            return r0
        L_0x012c:
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r6 = r5.this$0     // Catch:{ CancellationException -> 0x014b }
            java.util.List r4 = r1.A02     // Catch:{ CancellationException -> 0x014b }
            X.6Qh r2 = X.C122446Qh.DROPDOWN     // Catch:{ CancellationException -> 0x014b }
            r5.L$0 = r13     // Catch:{ CancellationException -> 0x014b }
            r5.L$1 = r13     // Catch:{ CancellationException -> 0x014b }
            r0 = 5
            r5.label = r0     // Catch:{ CancellationException -> 0x014b }
            X.0wl r1 = r6.A0H     // Catch:{ CancellationException -> 0x014b }
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$notifyFolderAdded$2 r0 = new com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$notifyFolderAdded$2     // Catch:{ CancellationException -> 0x014b }
            r0.<init>(r2, r6, r4, r13)     // Catch:{ CancellationException -> 0x014b }
            java.lang.Object r0 = X.C30451dy.A00(r5, r1, r0)     // Catch:{ CancellationException -> 0x014b }
            java.lang.Object r0 = X.AnonymousClass3MX.A13(r0)     // Catch:{ CancellationException -> 0x014b }
            if (r0 != r3) goto L_0x0151
            return r3
        L_0x014b:
            r1 = move-exception
            java.lang.String r0 = "GalleryPickerViewModel/loadFolders/error"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0151:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$loadDropdownFolders$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GalleryPickerViewModel$loadDropdownFolders$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
