package com.whatsapp.productinfra.reportingtoken.cron;

import X.AnonymousClass1OS;
import X.C17880vN;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C95364m7;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.reportingtoken.cron.ReportingTokenCleanupDailyCron$onDailyCron$1", f = "ReportingTokenCleanupDailyCron.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportingTokenCleanupDailyCron$onDailyCron$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ long J$0;
    public int label;
    public final /* synthetic */ C95364m7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportingTokenCleanupDailyCron$onDailyCron$1(C95364m7 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        ReportingTokenCleanupDailyCron$onDailyCron$1 reportingTokenCleanupDailyCron$onDailyCron$1 = new ReportingTokenCleanupDailyCron$onDailyCron$1(this.this$0, r5);
        reportingTokenCleanupDailyCron$onDailyCron$1.J$0 = C17880vN.A05(obj);
        return reportingTokenCleanupDailyCron$onDailyCron$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            if (r0 != 0) goto L_0x009f
            X.C30691eM.A01(r12)
            long r2 = r11.J$0
            X.4m7 r0 = r11.this$0
            X.00H r0 = r0.A01
            java.lang.Object r5 = r0.get()
            X.1Qp r5 = (X.C26041Qp) r5
            X.1Cd r0 = r5.A01     // Catch:{ all -> 0x0087 }
            X.1au r6 = r0.A05()     // Catch:{ all -> 0x0087 }
            r9 = 0
            r10 = 1
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0034 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0034 }
            java.lang.String r7 = "reporting_token"
            java.lang.String r4 = "timestamp < ? OR timestamp IS NULL"
            java.lang.String[] r1 = new java.lang.String[r10]     // Catch:{ all -> 0x0034 }
            X.C17880vN.A1V(r1, r9, r2)     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = "DELETE_REPORTING_TOKEN_INFO_OLDER_THAN"
            int r0 = r8.A04(r7, r4, r0, r1)     // Catch:{ all -> 0x0034 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0034 }
            goto L_0x003a
        L_0x0034:
            r0 = move-exception
            X.1IU r1 = new X.1IU     // Catch:{ all -> 0x0080 }
            r1.<init>(r0)     // Catch:{ all -> 0x0080 }
        L_0x003a:
            java.lang.Throwable r7 = X.C30671eK.A00(r1)     // Catch:{ all -> 0x0080 }
            if (r7 == 0) goto L_0x0049
            X.1Qo r4 = r5.A00     // Catch:{ all -> 0x0080 }
            X.8oI r1 = X.AnonymousClass8oI.A09     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = "deleteReportingInfoOlderThan_old"
            r4.A01(r1, r0, r7)     // Catch:{ all -> 0x0080 }
        L_0x0049:
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0062 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0062 }
            java.lang.String r7 = "reporting_info"
            java.lang.String r4 = "receive_timestamp < ? OR receive_timestamp IS NULL"
            java.lang.String[] r1 = new java.lang.String[r10]     // Catch:{ all -> 0x0062 }
            X.C17880vN.A1V(r1, r9, r2)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "DELETE_REPORTING_INFO_OLDER_THAN"
            int r0 = r8.A04(r7, r4, r0, r1)     // Catch:{ all -> 0x0062 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0062 }
            goto L_0x0068
        L_0x0062:
            r0 = move-exception
            X.1IU r4 = new X.1IU     // Catch:{ all -> 0x0080 }
            r4.<init>(r0)     // Catch:{ all -> 0x0080 }
        L_0x0068:
            java.lang.Throwable r3 = X.C30671eK.A00(r4)     // Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x0077
            X.1Qo r2 = r5.A00     // Catch:{ all -> 0x0080 }
            X.8oI r1 = X.AnonymousClass8oI.A09     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = "deleteReportingInfoOlderThan_new"
            r2.A01(r1, r0, r3)     // Catch:{ all -> 0x0080 }
        L_0x0077:
            r6.close()     // Catch:{ all -> 0x0087 }
            X.1eK r1 = new X.1eK     // Catch:{ all -> 0x0087 }
            r1.<init>(r4)     // Catch:{ all -> 0x0087 }
            goto L_0x008d
        L_0x0080:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x0087 }
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r0 = move-exception
            X.1IU r1 = new X.1IU
            r1.<init>(r0)
        L_0x008d:
            java.lang.Throwable r3 = X.C30671eK.A00(r1)
            if (r3 == 0) goto L_0x009c
            X.1Qo r2 = r5.A00
            X.8oI r1 = X.AnonymousClass8oI.A09
            java.lang.String r0 = "deleteReportingInfoOlderThan"
            r2.A01(r1, r0, r3)
        L_0x009c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x009f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.reportingtoken.cron.ReportingTokenCleanupDailyCron$onDailyCron$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportingTokenCleanupDailyCron$onDailyCron$1) create(Long.valueOf(C17880vN.A05(obj)), (C30391dr) obj2)).invokeSuspend(C27621Wu.A00);
    }
}
