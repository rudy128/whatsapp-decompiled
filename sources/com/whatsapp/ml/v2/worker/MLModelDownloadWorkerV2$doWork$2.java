package com.whatsapp.ml.v2.worker;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2$doWork$2", f = "MLModelDownloadWorkerV2.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {154, 164, 175}, m = "invokeSuspend", n = {"provider", "mlQplLogger", "processException", "provider", "mlQplLogger", "processException", "provider", "processException"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
public final class MLModelDownloadWorkerV2$doWork$2 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ MLModelDownloadWorkerV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelDownloadWorkerV2$doWork$2(MLModelDownloadWorkerV2 mLModelDownloadWorkerV2, C30391dr r3) {
        super(2, r3);
        this.this$0 = mLModelDownloadWorkerV2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MLModelDownloadWorkerV2$doWork$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MLModelDownloadWorkerV2$doWork$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x01ea A[Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209, all -> 0x0269 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r4 = r16
            X.1g4 r8 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r15.label
            r10 = 2
            r5 = 1
            r7 = 3
            if (r0 == 0) goto L_0x002e
            if (r0 == r5) goto L_0x018d
            if (r0 == r10) goto L_0x0020
            if (r0 != r7) goto L_0x001b
            java.lang.Object r3 = r15.L$1
            X.1Di r3 = (X.C22821Di) r3
            java.lang.Object r1 = r15.L$0
            X.8Ak r1 = (X.AnonymousClass8Ak) r1
            goto L_0x0203
        L_0x001b:
            java.lang.IllegalStateException r4 = X.AnonymousClass000.A0l()
            throw r4
        L_0x0020:
            java.lang.Object r3 = r15.L$2
            X.1Di r3 = (X.C22821Di) r3
            java.lang.Object r6 = r15.L$1
            X.8AS r6 = (X.AnonymousClass8AS) r6
            java.lang.Object r1 = r15.L$0
            X.8Ak r1 = (X.AnonymousClass8Ak) r1
            goto L_0x01da
        L_0x002e:
            X.C30691eM.A01(r4)
            com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2 r0 = r15.this$0
            X.6lN r3 = r0.A07
            androidx.work.WorkerParameters r0 = r0.A01
            X.A6Y r0 = r0.A01
            java.lang.String r9 = "ML_MODEL_WORKER_MODEL_FEATURE_NAME"
            java.lang.String r0 = r0.A03(r9)
            if (r0 == 0) goto L_0x029e
            X.6Rq r2 = X.C124056Ww.A00(r0)
            if (r2 == 0) goto L_0x0297
            com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2 r0 = r15.this$0
            androidx.work.WorkerParameters r0 = r0.A01
            X.A6Y r0 = r0.A01
            java.lang.String r4 = "SILENT_MODEL_UPDATE_KEY"
            java.util.Map r0 = r0.A00
            java.lang.Object r1 = r0.get(r4)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x018a
            boolean r0 = X.AnonymousClass000.A1Y(r1)
        L_0x005d:
            X.8Ak r1 = r3.A00(r2, r0)
            X.708 r0 = r1.BV1()
            java.lang.String r3 = com.whatsapp.ml.v2.MLModelUtilV2.A00(r0)
            com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2 r0 = r15.this$0
            X.6m5 r11 = r0.A04
            X.708 r0 = r1.BV1()
            int r6 = r0.hashCode()
            java.lang.String r2 = "ML_DOWNLOADER_MODEL_DOWNLOADING"
            r0 = 721696229(0x2b0435e5, float:4.6970614E-13)
            X.8AS r6 = r11.A00(r2, r0, r6)
            com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2 r12 = r15.this$0
            r6.Bj0()
            androidx.work.WorkerParameters r0 = r12.A01
            X.A6Y r0 = r0.A01
            java.lang.String r0 = r0.A03(r9)
            if (r0 == 0) goto L_0x0290
            X.6Rq r0 = X.C124056Ww.A00(r0)
            if (r0 == 0) goto L_0x0289
            java.lang.String r2 = r0.name()
            java.lang.String r0 = "feature"
            r6.Bir(r0, r2)
            java.lang.String r0 = "unique_name"
            r6.Bir(r0, r3)
            java.lang.String r11 = "is_silent_update"
            androidx.work.WorkerParameters r0 = r12.A01
            X.A6Y r0 = r0.A01
            java.util.Map r0 = r0.A00
            java.lang.Object r2 = r0.get(r4)
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0187
            boolean r0 = X.AnonymousClass000.A1Y(r2)
        L_0x00b5:
            r6.Bis(r11, r0)
            java.lang.String r2 = "is_enabled"
            boolean r0 = r1.isEnabled()
            r6.Bis(r2, r0)
            X.A6e r0 = r1.Bbr()
            java.lang.Integer r0 = r0.A00
            java.lang.String r2 = X.AnonymousClass9OD.A00(r0)
            java.lang.String r0 = "network_type"
            r6.Bir(r0, r2)
            com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2 r0 = r15.this$0
            X.6qX r0 = r0.A03
            r0.A02(r3)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "retry_count_"
            r2.append(r0)
            com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2 r0 = r15.this$0
            androidx.work.WorkerParameters r0 = r0.A01
            int r0 = r0.A00
            java.lang.String r0 = X.C17880vN.A0t(r2, r0)
            r6.Biz(r0)
            com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2 r2 = r15.this$0
            androidx.work.WorkerParameters r0 = r2.A01
            int r0 = r0.A00
            if (r0 >= r7) goto L_0x0283
            X.6hJ r12 = r2.A05
            X.118 r0 = r12.A01
            android.content.Context r3 = r0.A00
            android.content.Context r14 = r3.getApplicationContext()
            java.lang.Class<com.whatsapp.ml.v2.actions.MLModelDownloadCancelReceiver> r0 = com.whatsapp.ml.v2.actions.MLModelDownloadCancelReceiver.class
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r3, r0)
            X.708 r0 = r1.BV1()
            X.6Rq r0 = r0.A02
            java.lang.String r0 = r0.toString()
            r2.putExtra(r9, r0)
            boolean r0 = r1 instanceof X.AnonymousClass7K2
            r2.putExtra(r4, r0)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r13 = 0
            android.app.PendingIntent r11 = X.C1408573i.A01(r3, r13, r2, r0)
            X.6gL r4 = r1.BVR()
            X.73t r9 = X.C217217d.A03(r14)
            java.lang.String r0 = "sending_media@1"
            r9.A0M = r0
            long r2 = java.lang.System.currentTimeMillis()
            r9.A09(r2)
            java.lang.String r0 = r4.A02
            r9.A0F(r0)
            r9.A0E(r0)
            r2 = 17301633(0x1080081, float:2.4979616E-38)
            android.app.Notification r0 = r9.A08
            r0.icon = r2
            r0 = 100
            r9.A07(r0, r13, r13)
            r9.A0H(r5)
            java.lang.String r0 = r4.A01
            r9.A08(r13, r0, r11)
            java.lang.String r0 = "progress"
            r9.A0L = r0
            r12.A00 = r9
            int r4 = r4.A00
            android.app.Notification r3 = r9.A05()
            boolean r0 = X.AnonymousClass112.A06()
            X.9rG r2 = new X.9rG
            r2.<init>(r4, r3, r0)
            com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2 r0 = r15.this$0
            r0.A06(r2)
            com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2 r0 = r15.this$0
            X.82t r3 = new X.82t
            r3.<init>(r6, r1, r0)
            java.lang.String r0 = "fetch_metadata_start"
            r6.Biz(r0)
            com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2 r0 = r15.this$0
            com.whatsapp.ml.v2.MLModelDownloaderManagerV2 r0 = r0.A02
            r15.L$0 = r1
            r15.L$1 = r6
            r15.L$2 = r3
            r15.label = r5
            java.lang.Object r2 = r0.A03(r1, r15)
            if (r2 != r8) goto L_0x01a0
            return r8
        L_0x0187:
            r0 = 0
            goto L_0x00b5
        L_0x018a:
            r0 = 0
            goto L_0x005d
        L_0x018d:
            java.lang.Object r3 = r15.L$2
            X.1Di r3 = (X.C22821Di) r3
            java.lang.Object r6 = r15.L$1
            X.8AS r6 = (X.AnonymousClass8AS) r6
            java.lang.Object r1 = r15.L$0
            X.8Ak r1 = (X.AnonymousClass8Ak) r1
            X.C30691eM.A01(r4)
            X.1eK r4 = (X.C30671eK) r4
            java.lang.Object r2 = r4.value
        L_0x01a0:
            java.lang.Throwable r0 = X.C30671eK.A00(r2)
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r4 = r3.invoke(r0)
            return r4
        L_0x01ab:
            java.lang.String r0 = "fetch_metadata_complete"
            r6.Biz(r0)
            java.lang.String r0 = "file_downloading_start"
            r6.Biz(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2 r9 = r15.this$0     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            r9.A00 = r4     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            com.whatsapp.ml.v2.MLModelDownloaderManagerV2 r4 = r9.A02     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            X.C30691eM.A01(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            X.6u0 r2 = (X.C136556u0) r2     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            java.lang.String r2 = r2.A02     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            X.7gn r0 = new X.7gn     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            r0.<init>(r9, r10)     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            r15.L$0 = r1     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            r15.L$1 = r6     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            r15.L$2 = r3     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            r15.label = r10     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            java.lang.Object r4 = r4.A02(r1, r2, r15, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            if (r4 != r8) goto L_0x01dd
            return r8
        L_0x01da:
            X.C30691eM.A01(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
        L_0x01dd:
            X.9Lg r4 = (X.C180129Lg) r4     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            X.8Jj r0 = new X.8Jj     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            r0.<init>()     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            boolean r0 = X.C18070vi.A18(r4, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            if (r0 != 0) goto L_0x0250
            java.lang.String r0 = "file_downloading_complete"
            r6.Biz(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2 r0 = r15.this$0     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            com.whatsapp.ml.v2.postprocessing.PostProcessingManager r2 = r0.A06     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            r15.L$0 = r1     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            r15.L$1 = r3     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            r0 = 0
            r15.L$2 = r0     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            r15.label = r7     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            java.lang.Object r4 = r2.A00(r6, r1, r15)     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            if (r4 != r8) goto L_0x0206
            return r8
        L_0x0203:
            X.C30691eM.A01(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
        L_0x0206:
            X.9Lg r4 = (X.C180129Lg) r4     // Catch:{ NoSuchAlgorithmException -> 0x0249, FileNotFoundException -> 0x0241, SecurityException -> 0x0239, 6SI -> 0x0231, 6SE -> 0x0229, 6SF -> 0x0221, 6SG -> 0x0219, IOException -> 0x0211, Exception -> 0x0209 }
            goto L_0x0250
        L_0x0209:
            r0 = move-exception
            java.lang.Object r4 = r3.invoke(r0)     // Catch:{ all -> 0x0269 }
            X.9Lg r4 = (X.C180129Lg) r4     // Catch:{ all -> 0x0269 }
            goto L_0x0250
        L_0x0211:
            r0 = move-exception
            java.lang.Object r4 = r3.invoke(r0)     // Catch:{ all -> 0x0269 }
            X.9Lg r4 = (X.C180129Lg) r4     // Catch:{ all -> 0x0269 }
            goto L_0x0250
        L_0x0219:
            r0 = move-exception
            java.lang.Object r4 = r3.invoke(r0)     // Catch:{ all -> 0x0269 }
            X.9Lg r4 = (X.C180129Lg) r4     // Catch:{ all -> 0x0269 }
            goto L_0x0250
        L_0x0221:
            r0 = move-exception
            java.lang.Object r4 = r3.invoke(r0)     // Catch:{ all -> 0x0269 }
            X.9Lg r4 = (X.C180129Lg) r4     // Catch:{ all -> 0x0269 }
            goto L_0x0250
        L_0x0229:
            r0 = move-exception
            java.lang.Object r4 = r3.invoke(r0)     // Catch:{ all -> 0x0269 }
            X.9Lg r4 = (X.C180129Lg) r4     // Catch:{ all -> 0x0269 }
            goto L_0x0250
        L_0x0231:
            r0 = move-exception
            java.lang.Object r4 = r3.invoke(r0)     // Catch:{ all -> 0x0269 }
            X.9Lg r4 = (X.C180129Lg) r4     // Catch:{ all -> 0x0269 }
            goto L_0x0250
        L_0x0239:
            r0 = move-exception
            java.lang.Object r4 = r3.invoke(r0)     // Catch:{ all -> 0x0269 }
            X.9Lg r4 = (X.C180129Lg) r4     // Catch:{ all -> 0x0269 }
            goto L_0x0250
        L_0x0241:
            r0 = move-exception
            java.lang.Object r4 = r3.invoke(r0)     // Catch:{ all -> 0x0269 }
            X.9Lg r4 = (X.C180129Lg) r4     // Catch:{ all -> 0x0269 }
            goto L_0x0250
        L_0x0249:
            r0 = move-exception
            java.lang.Object r4 = r3.invoke(r0)     // Catch:{ all -> 0x0269 }
            X.9Lg r4 = (X.C180129Lg) r4     // Catch:{ all -> 0x0269 }
        L_0x0250:
            com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2 r0 = r15.this$0
            X.6hJ r3 = r0.A05
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.1Vn r2 = r3.A02
            X.6gL r0 = r1.BVR()
            int r1 = r0.A00
            java.lang.String r0 = "MLModelDownloadNotificationManagerV2"
            r2.BEJ(r1, r0)
            r0 = 0
            r3.A00 = r0
            return r4
        L_0x0269:
            r4 = move-exception
            com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2 r0 = r15.this$0
            X.6hJ r3 = r0.A05
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.1Vn r2 = r3.A02
            X.6gL r0 = r1.BVR()
            int r1 = r0.A00
            java.lang.String r0 = "MLModelDownloadNotificationManagerV2"
            r2.BEJ(r1, r0)
            r0 = 0
            r3.A00 = r0
            throw r4
        L_0x0283:
            X.6SG r4 = new X.6SG
            r4.<init>(r3)
            throw r4
        L_0x0289:
            java.lang.String r0 = "Feature name is not registered"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0290:
            java.lang.String r0 = "Feature name is missing"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0297:
            java.lang.String r0 = "Feature name is not registered"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x029e:
            java.lang.String r0 = "Feature name is missing"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ml.v2.worker.MLModelDownloadWorkerV2$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
