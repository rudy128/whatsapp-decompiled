package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass1OS;
import X.C144347Gy;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.GalleryViewModel$loadData$1", f = "GalleryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GalleryViewModel$loadData$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $approxScreenItemCount;
    public final /* synthetic */ C22821Di $cursorCallback;
    public final /* synthetic */ String $logName;
    public final /* synthetic */ List $timeBuckets;
    public final /* synthetic */ C144347Gy $timeBucketsProvider;
    public int label;
    public final /* synthetic */ GalleryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryViewModel$loadData$1(C144347Gy r2, GalleryViewModel galleryViewModel, String str, List list, C30391dr r6, C22821Di r7, int i) {
        super(2, r6);
        this.this$0 = galleryViewModel;
        this.$logName = str;
        this.$cursorCallback = r7;
        this.$timeBuckets = list;
        this.$timeBucketsProvider = r2;
        this.$approxScreenItemCount = i;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        GalleryViewModel galleryViewModel = this.this$0;
        String str = this.$logName;
        C22821Di r6 = this.$cursorCallback;
        return new GalleryViewModel$loadData$1(this.$timeBucketsProvider, galleryViewModel, str, this.$timeBuckets, r10, r6, this.$approxScreenItemCount);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.1yT] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0065 A[EDGE_INSN: B:42:0x0065->B:11:0x0065 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0061 A[Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4, all -> 0x00c8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            if (r0 != 0) goto L_0x00ce
            X.C30691eM.A01(r9)
            r2 = 0
            com.whatsapp.gallery.viewmodel.GalleryViewModel r1 = r8.this$0     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            X.1yT r0 = new X.1yT     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            r0.<init>()     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            r1.A00 = r0     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            java.lang.String r0 = r8.$logName     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            r1.append(r0)     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            java.lang.String r0 = "/getCursor"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            X.1Ez r3 = new X.1Ez     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            r3.<init>((java.lang.String) r0)     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            X.1Di r1 = r8.$cursorCallback     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            com.whatsapp.gallery.viewmodel.GalleryViewModel r0 = r8.this$0     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            X.1yT r0 = r0.A00     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            java.lang.Object r6 = r1.invoke(r0)     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            android.database.Cursor r6 = (android.database.Cursor) r6     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            r3.A02()     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            int r5 = r6.getCount()     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            java.lang.String r0 = "GalleryViewModel/"
            r1.append(r0)     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            java.lang.String r0 = r8.$logName     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            r1.append(r0)     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            java.lang.String r0 = "/loadInBackground/"
            X.C17900vP.A0j(r0, r1, r5)     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            java.util.List r0 = r8.$timeBuckets     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            r0.clear()     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            boolean r0 = r6.moveToFirst()     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            if (r0 == 0) goto L_0x006a
            r7 = r2
            r4 = 0
            goto L_0x0077
        L_0x0059:
            int r4 = r4 + 1
            boolean r0 = r6.moveToNext()     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            if (r0 == 0) goto L_0x0065
            int r0 = r8.$approxScreenItemCount     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            if (r4 < r0) goto L_0x0077
        L_0x0065:
            java.util.List r0 = r8.$timeBuckets     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            r0.add(r7)     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
        L_0x006a:
            com.whatsapp.gallery.viewmodel.GalleryViewModel r0 = r8.this$0     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            X.1DT r1 = r0.A04     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            X.40K r0 = new X.40K     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            r0.<init>(r6, r5)     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            r1.A0E(r0)     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            goto L_0x00c1
        L_0x0077:
            com.whatsapp.gallery.viewmodel.GalleryViewModel r1 = r8.this$0     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            boolean r0 = r6 instanceof X.C109335dH     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            if (r0 == 0) goto L_0x0085
            r0 = r6
            X.5dH r0 = (X.C109335dH) r0     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            X.21V r0 = r0.A01()     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            goto L_0x008f
        L_0x0085:
            X.00H r0 = r1.A06     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            X.1W6 r0 = X.C17880vN.A0c(r0)     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            X.206 r0 = r0.A01(r6)     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
        L_0x008f:
            if (r0 != 0) goto L_0x0094
            if (r7 == 0) goto L_0x006a
            goto L_0x0065
        L_0x0094:
            X.7Gy r3 = r8.$timeBucketsProvider     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            long r0 = r0.A0I     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            X.7Sz r1 = r3.A00(r0)     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            if (r7 == 0) goto L_0x00a9
            boolean r0 = r7.equals(r1)     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            if (r0 != 0) goto L_0x00ad
            java.util.List r0 = r8.$timeBuckets     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            r0.add(r7)     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
        L_0x00a9:
            r0 = 0
            r1.bucketCount = r0     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            r7 = r1
        L_0x00ad:
            int r0 = r7.bucketCount     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            int r0 = r0 + 1
            r7.bucketCount = r0     // Catch:{ 1QC -> 0x00bb, CancellationException -> 0x00b4 }
            goto L_0x0059
        L_0x00b4:
            r1 = move-exception
            java.lang.String r0 = "GalleryViewModel/loadData/CancellationException/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00c8 }
            goto L_0x00c1
        L_0x00bb:
            r1 = move-exception
            java.lang.String r0 = "GalleryViewModel/loadData/OperationCanceledException/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00c8 }
        L_0x00c1:
            com.whatsapp.gallery.viewmodel.GalleryViewModel r0 = r8.this$0
            r0.A00 = r2
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00c8:
            r1 = move-exception
            com.whatsapp.gallery.viewmodel.GalleryViewModel r0 = r8.this$0
            r0.A00 = r2
            throw r1
        L_0x00ce:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.viewmodel.GalleryViewModel$loadData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GalleryViewModel$loadData$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
