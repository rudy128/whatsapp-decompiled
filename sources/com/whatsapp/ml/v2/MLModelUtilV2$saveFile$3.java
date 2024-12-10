package com.whatsapp.ml.v2;

import X.AnonymousClass1OS;
import X.AnonymousClass708;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.io.InputStream;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.MLModelUtilV2$saveFile$3", f = "MLModelUtilV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MLModelUtilV2$saveFile$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $append;
    public final /* synthetic */ InputStream $inputStream;
    public final /* synthetic */ AnonymousClass708 $model;
    public final /* synthetic */ C22821Di $progressListener;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ MLModelUtilV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelUtilV2$saveFile$3(MLModelUtilV2 mLModelUtilV2, AnonymousClass708 r3, InputStream inputStream, C30391dr r5, C22821Di r6, boolean z) {
        super(2, r5);
        this.this$0 = mLModelUtilV2;
        this.$model = r3;
        this.$append = z;
        this.$inputStream = inputStream;
        this.$progressListener = r6;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        C30391dr r4 = r9;
        MLModelUtilV2$saveFile$3 mLModelUtilV2$saveFile$3 = new MLModelUtilV2$saveFile$3(this.this$0, this.$model, this.$inputStream, r4, this.$progressListener, this.$append);
        mLModelUtilV2$saveFile$3.L$0 = obj;
        return mLModelUtilV2$saveFile$3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            if (r0 != 0) goto L_0x00f3
            X.C30691eM.A01(r11)
            java.lang.Object r2 = r10.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
            com.whatsapp.ml.v2.MLModelUtilV2 r1 = r10.this$0
            X.708 r0 = r10.$model
            java.lang.String r0 = r1.A04(r0)
            java.io.File r5 = X.C108945cZ.A17(r0)
            java.io.File r1 = r5.getParentFile()     // Catch:{ Exception -> 0x0074 }
            if (r1 == 0) goto L_0x0029
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x0074 }
            if (r0 != 0) goto L_0x002f
            boolean r0 = r1.mkdirs()     // Catch:{ Exception -> 0x0074 }
            if (r0 != 0) goto L_0x002f
        L_0x0029:
            X.8Jj r3 = new X.8Jj     // Catch:{ Exception -> 0x0074 }
            r3.<init>()     // Catch:{ Exception -> 0x0074 }
            goto L_0x0063
        L_0x002f:
            boolean r0 = r10.$append     // Catch:{ Exception -> 0x0074 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0074 }
            r9.<init>(r5, r0)     // Catch:{ Exception -> 0x0074 }
            java.io.InputStream r8 = r10.$inputStream     // Catch:{ Exception -> 0x0074 }
            X.1Di r0 = r10.$progressListener     // Catch:{ Exception -> 0x0074 }
            X.82s r7 = new X.82s     // Catch:{ all -> 0x006d }
            r7.<init>(r8, r0, r2)     // Catch:{ all -> 0x006d }
            r6 = 8192(0x2000, float:1.14794E-41)
            r4 = 0
            X.C18070vi.A0d(r8, r4)     // Catch:{ all -> 0x006d }
            byte[] r3 = new byte[r6]     // Catch:{ all -> 0x006d }
            r2 = 0
        L_0x0048:
            int r1 = r8.read(r3, r4, r6)     // Catch:{ all -> 0x006d }
            r0 = -1
            if (r1 == r0) goto L_0x005b
            r9.write(r3, r4, r1)     // Catch:{ all -> 0x006d }
            int r2 = r2 + r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x006d }
            r7.invoke(r0)     // Catch:{ all -> 0x006d }
            goto L_0x0048
        L_0x005b:
            r9.close()     // Catch:{ Exception -> 0x0074 }
            X.8Jk r3 = new X.8Jk     // Catch:{ Exception -> 0x0074 }
            r3.<init>()     // Catch:{ Exception -> 0x0074 }
        L_0x0063:
            com.whatsapp.ml.v2.MLModelUtilV2 r2 = r10.this$0
            X.708 r1 = r10.$model
            java.io.InputStream r0 = r10.$inputStream
            com.whatsapp.ml.v2.MLModelUtilV2.A01(r2, r1, r5, r0)
            return r3
        L_0x006d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006f }
        L_0x006f:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ Exception -> 0x0074 }
            throw r0     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            r8 = move-exception
            com.whatsapp.ml.v2.MLModelUtilV2 r9 = r10.this$0     // Catch:{ all -> 0x00e8 }
            X.708 r1 = r10.$model     // Catch:{ all -> 0x00e8 }
            boolean r0 = r8 instanceof java.io.IOException     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00b5
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ all -> 0x00e8 }
            int r7 = r1.A00     // Catch:{ all -> 0x00e8 }
            int r1 = r7 * 2
            X.00H r6 = r9.A02     // Catch:{ all -> 0x00e8 }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x00e8 }
            X.11Z r0 = (X.AnonymousClass11Z) r0     // Catch:{ all -> 0x00e8 }
            long r3 = r0.A02()     // Catch:{ all -> 0x00e8 }
            long r1 = (long) r1     // Catch:{ all -> 0x00e8 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00b6
            X.11E r0 = r9.A00     // Catch:{ all -> 0x00e8 }
            boolean r0 = r0.A09()     // Catch:{ all -> 0x00e8 }
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = r8.getMessage()     // Catch:{ all -> 0x00e8 }
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = "NetworkIO Exception"
        L_0x00a6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = ": Network Error"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x00e8 }
            X.6SH r8 = new X.6SH     // Catch:{ all -> 0x00e8 }
            r8.<init>(r0)     // Catch:{ all -> 0x00e8 }
        L_0x00b5:
            throw r8     // Catch:{ all -> 0x00e8 }
        L_0x00b6:
            java.lang.String r4 = r8.getMessage()     // Catch:{ all -> 0x00e8 }
            if (r4 != 0) goto L_0x00be
            java.lang.String r4 = "Low Storage"
        L_0x00be:
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x00e8 }
            X.11Z r0 = (X.AnonymousClass11Z) r0     // Catch:{ all -> 0x00e8 }
            long r2 = r0.A02()     // Catch:{ all -> 0x00e8 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "Required: "
            r1.append(r0)     // Catch:{ all -> 0x00e8 }
            r1.append(r7)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = " MBs, Available: "
            r1.append(r0)     // Catch:{ all -> 0x00e8 }
            r1.append(r2)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = " MBs - "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)     // Catch:{ all -> 0x00e8 }
            X.6SF r8 = new X.6SF     // Catch:{ all -> 0x00e8 }
            r8.<init>(r0)     // Catch:{ all -> 0x00e8 }
            goto L_0x00b5
        L_0x00e8:
            r3 = move-exception
            com.whatsapp.ml.v2.MLModelUtilV2 r2 = r10.this$0
            X.708 r1 = r10.$model
            java.io.InputStream r0 = r10.$inputStream
            com.whatsapp.ml.v2.MLModelUtilV2.A01(r2, r1, r5, r0)
            throw r3
        L_0x00f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ml.v2.MLModelUtilV2$saveFile$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MLModelUtilV2$saveFile$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
