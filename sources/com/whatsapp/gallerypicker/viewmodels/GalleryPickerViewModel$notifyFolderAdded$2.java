package com.whatsapp.gallerypicker.viewmodels;

import X.AnonymousClass1OS;
import X.C122446Qh;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$notifyFolderAdded$2", f = "GalleryPickerViewModel.kt", i = {0}, l = {771}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
public final class GalleryPickerViewModel$notifyFolderAdded$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $galleryFolders;
    public final /* synthetic */ C122446Qh $type;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ GalleryPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryPickerViewModel$notifyFolderAdded$2(C122446Qh r2, GalleryPickerViewModel galleryPickerViewModel, List list, C30391dr r5) {
        super(2, r5);
        this.$type = r2;
        this.this$0 = galleryPickerViewModel;
        this.$galleryFolders = list;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new GalleryPickerViewModel$notifyFolderAdded$2(this.$type, this.this$0, this.$galleryFolders, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d A[Catch:{ all -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088 A[SYNTHETIC, Splitter:B:27:0x0088] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r6 = 0
            r3 = 1
            if (r0 == 0) goto L_0x001f
            if (r0 != r3) goto L_0x001a
            java.lang.Object r2 = r7.L$2
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r7.L$1
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r1 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r1
            java.lang.Object r5 = r7.L$0
            X.1n2 r5 = (X.C35911n2) r5
            X.C30691eM.A01(r8)
            goto L_0x0053
        L_0x001a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001f:
            X.C30691eM.A01(r8)
            X.6Qh r0 = r7.$type
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x003e
            r0 = 0
            if (r1 != r0) goto L_0x0083
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r0 = r7.this$0
            X.1DT r2 = r0.A07
            java.util.List r1 = r7.$galleryFolders
            X.65j r0 = new X.65j
            r0.<init>(r1)
            r2.A0F(r0)
        L_0x003b:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x003e:
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r1 = r7.this$0
            X.1n2 r5 = r1.A0I
            java.util.List r2 = r7.$galleryFolders
            r7.L$0 = r5
            r7.L$1 = r1
            r7.L$2 = r2
            r7.label = r3
            java.lang.Object r0 = r5.Bhx(r7)
            if (r0 != r4) goto L_0x0053
            return r4
        L_0x0053:
            X.1DT r4 = r1.A06     // Catch:{ all -> 0x008e }
            java.lang.Object r0 = r4.A06()     // Catch:{ all -> 0x008e }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0088
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch:{ all -> 0x008e }
            r3.<init>(r0)     // Catch:{ all -> 0x008e }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x008e }
        L_0x0066:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x007c
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x008e }
            X.6yS r1 = (X.C139226yS) r1     // Catch:{ all -> 0x008e }
            int r0 = r1.A02     // Catch:{ all -> 0x008e }
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)     // Catch:{ all -> 0x008e }
            r3.put(r0, r1)     // Catch:{ all -> 0x008e }
            goto L_0x0066
        L_0x007c:
            r4.A0F(r3)     // Catch:{ all -> 0x008e }
            r5.CQ9(r6)
            goto L_0x003b
        L_0x0083:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0088:
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x008e }
            r5.CQ9(r6)
            return r0
        L_0x008e:
            r0 = move-exception
            r5.CQ9(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$notifyFolderAdded$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GalleryPickerViewModel$notifyFolderAdded$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
