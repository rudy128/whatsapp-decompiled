package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass1OS;
import X.C144347Gy;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.GalleryViewModel$loadSections$1", f = "GalleryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GalleryViewModel$loadSections$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $cursorCallback;
    public final /* synthetic */ String $logName;
    public final /* synthetic */ C144347Gy $timeBucketsProvider;
    public int label;
    public final /* synthetic */ GalleryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryViewModel$loadSections$1(C144347Gy r2, GalleryViewModel galleryViewModel, String str, C30391dr r5, C22821Di r6) {
        super(2, r5);
        this.this$0 = galleryViewModel;
        this.$cursorCallback = r6;
        this.$logName = str;
        this.$timeBucketsProvider = r2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        GalleryViewModel galleryViewModel = this.this$0;
        C22821Di r5 = this.$cursorCallback;
        return new GalleryViewModel$loadSections$1(this.$timeBucketsProvider, galleryViewModel, this.$logName, r8, r5);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, X.1yT] */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b6, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092 A[Catch:{ all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x009e A[EDGE_INSN: B:65:0x009e->B:35:0x009e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.label
            if (r0 != 0) goto L_0x00f3
            X.C30691eM.A01(r19)
            r4 = 0
            com.whatsapp.gallery.viewmodel.GalleryViewModel r0 = r3.this$0     // Catch:{ 1QC -> 0x00cd, SQLiteDiskIOException -> 0x00be, CancellationException -> 0x00b7 }
            X.1yT r1 = new X.1yT     // Catch:{ 1QC -> 0x00cd, SQLiteDiskIOException -> 0x00be, CancellationException -> 0x00b7 }
            r1.<init>()     // Catch:{ 1QC -> 0x00cd, SQLiteDiskIOException -> 0x00be, CancellationException -> 0x00b7 }
            r0.A01 = r1     // Catch:{ 1QC -> 0x00cd, SQLiteDiskIOException -> 0x00be, CancellationException -> 0x00b7 }
            X.1Di r0 = r3.$cursorCallback     // Catch:{ 1QC -> 0x00cd, SQLiteDiskIOException -> 0x00be, CancellationException -> 0x00b7 }
            java.lang.Object r7 = r0.invoke(r1)     // Catch:{ 1QC -> 0x00cd, SQLiteDiskIOException -> 0x00be, CancellationException -> 0x00b7 }
            java.io.Closeable r7 = (java.io.Closeable) r7     // Catch:{ 1QC -> 0x00cd, SQLiteDiskIOException -> 0x00be, CancellationException -> 0x00b7 }
            com.whatsapp.gallery.viewmodel.GalleryViewModel r9 = r3.this$0     // Catch:{ 1QC -> 0x00cd, SQLiteDiskIOException -> 0x00be, CancellationException -> 0x00b7 }
            X.7Gy r10 = r3.$timeBucketsProvider     // Catch:{ 1QC -> 0x00cd, SQLiteDiskIOException -> 0x00be, CancellationException -> 0x00b7 }
            r8 = r7
            android.database.Cursor r8 = (android.database.Cursor) r8     // Catch:{ all -> 0x00b0 }
            int r0 = r8.getCount()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00aa
            long r16 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x00b0 }
            r8.moveToFirst()     // Catch:{ all -> 0x00b0 }
            r5 = 0
            r2 = 0
        L_0x0035:
            boolean r0 = r8 instanceof X.C109335dH     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0041
            r0 = r8
            X.5dH r0 = (X.C109335dH) r0     // Catch:{ all -> 0x00b0 }
            X.21V r0 = r0.A01()     // Catch:{ all -> 0x00b0 }
            goto L_0x004b
        L_0x0041:
            X.00H r0 = r9.A06     // Catch:{ all -> 0x00b0 }
            X.1W6 r0 = X.C17880vN.A0c(r0)     // Catch:{ all -> 0x00b0 }
            X.206 r0 = r0.A01(r8)     // Catch:{ all -> 0x00b0 }
        L_0x004b:
            r11 = 1
            if (r0 != 0) goto L_0x0051
            if (r5 == 0) goto L_0x00a1
            goto L_0x009e
        L_0x0051:
            long r0 = r0.A0I     // Catch:{ all -> 0x00b0 }
            X.7Sz r1 = r10.A00(r0)     // Catch:{ all -> 0x00b0 }
            if (r5 == 0) goto L_0x0062
            boolean r0 = r5.equals(r1)     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x0066
            r6.add(r5)     // Catch:{ all -> 0x00b0 }
        L_0x0062:
            r0 = 0
            r1.bucketCount = r0     // Catch:{ all -> 0x00b0 }
            r5 = r1
        L_0x0066:
            int r0 = r5.bucketCount     // Catch:{ all -> 0x00b0 }
            int r0 = r0 + 1
            r5.bucketCount = r0     // Catch:{ all -> 0x00b0 }
            boolean r0 = X.C17880vN.A1X(r6)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x008e
            r14 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 + r16
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00b0 }
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x008e
            long r16 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r0 = X.C17880vN.A10(r6)     // Catch:{ all -> 0x00b0 }
            r6.clear()     // Catch:{ all -> 0x00b0 }
            int r0 = com.whatsapp.gallery.viewmodel.GalleryViewModel.A00(r9, r0, r2)     // Catch:{ all -> 0x00b0 }
            int r2 = r2 + r0
        L_0x008e:
            X.1OB r0 = r9.A03     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x009e
            boolean r0 = r0.Be2()     // Catch:{ all -> 0x00b0 }
            if (r0 != r11) goto L_0x009e
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x0035
        L_0x009e:
            r6.add(r5)     // Catch:{ all -> 0x00b0 }
        L_0x00a1:
            boolean r0 = X.C17880vN.A1X(r6)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00aa
            com.whatsapp.gallery.viewmodel.GalleryViewModel.A00(r9, r6, r2)     // Catch:{ all -> 0x00b0 }
        L_0x00aa:
            if (r7 == 0) goto L_0x00d3
            r7.close()     // Catch:{ 1QC -> 0x00cd, SQLiteDiskIOException -> 0x00be, CancellationException -> 0x00b7 }
            goto L_0x00d3
        L_0x00b0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ 1QC -> 0x00cd, SQLiteDiskIOException -> 0x00be, CancellationException -> 0x00b7 }
            throw r0     // Catch:{ 1QC -> 0x00cd, SQLiteDiskIOException -> 0x00be, CancellationException -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            java.lang.String r0 = "GalleryViewModel/loadSections/CancellationException/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00ed }
            goto L_0x00d3
        L_0x00be:
            r2 = move-exception
            com.whatsapp.gallery.viewmodel.GalleryViewModel r0 = r3.this$0     // Catch:{ all -> 0x00ed }
            X.1CL r1 = r0.A05     // Catch:{ all -> 0x00ed }
            r0 = 1
            r1.A00(r0)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "GalleryViewModel/loadSections/SQLiteDiskIOException/error"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00ed }
            goto L_0x00d3
        L_0x00cd:
            r1 = move-exception
            java.lang.String r0 = "GalleryViewModel/loadSections/OperationCanceledException/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00ed }
        L_0x00d3:
            com.whatsapp.gallery.viewmodel.GalleryViewModel r0 = r3.this$0
            r0.A01 = r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GalleryViewModel/"
            r1.append(r0)
            java.lang.String r0 = r3.$logName
            r1.append(r0)
            java.lang.String r0 = "/all buckets assigned"
            X.C17890vO.A1A(r1, r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00ed:
            r1 = move-exception
            com.whatsapp.gallery.viewmodel.GalleryViewModel r0 = r3.this$0
            r0.A01 = r4
            throw r1
        L_0x00f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.viewmodel.GalleryViewModel$loadSections$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GalleryViewModel$loadSections$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
