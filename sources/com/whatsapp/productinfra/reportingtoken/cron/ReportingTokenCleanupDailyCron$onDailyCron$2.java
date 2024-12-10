package com.whatsapp.productinfra.reportingtoken.cron;

import X.AnonymousClass1OS;
import X.C17880vN;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C95364m7;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.reportingtoken.cron.ReportingTokenCleanupDailyCron$onDailyCron$2", f = "ReportingTokenCleanupDailyCron.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportingTokenCleanupDailyCron$onDailyCron$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ long J$0;
    public int label;
    public final /* synthetic */ C95364m7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportingTokenCleanupDailyCron$onDailyCron$2(C95364m7 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        ReportingTokenCleanupDailyCron$onDailyCron$2 reportingTokenCleanupDailyCron$onDailyCron$2 = new ReportingTokenCleanupDailyCron$onDailyCron$2(this.this$0, r5);
        reportingTokenCleanupDailyCron$onDailyCron$2.J$0 = C17880vN.A05(obj);
        return reportingTokenCleanupDailyCron$onDailyCron$2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            if (r0 != 0) goto L_0x006e
            X.C30691eM.A01(r11)
            long r2 = r10.J$0
            X.4m7 r0 = r10.this$0
            X.00H r0 = r0.A01
            java.lang.Object r5 = r0.get()
            X.1Qp r5 = (X.C26041Qp) r5
            java.lang.String r4 = "deleteReportingInfoContentOlderThan"
            X.1Cd r0 = r5.A01     // Catch:{ all -> 0x0058 }
            X.1au r6 = r0.A05()     // Catch:{ all -> 0x0058 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0035 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0035 }
            java.lang.String r8 = "reporting_info_content"
            java.lang.String r7 = "receive_timestamp < ? OR receive_timestamp IS NULL"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0035 }
            X.C17890vO.A1J(r1, r2)     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "DELETE_REPORTING_INFO_CONTENT_OLDER_THAN"
            int r0 = r9.A04(r8, r7, r0, r1)     // Catch:{ all -> 0x0035 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x003b
        L_0x0035:
            r0 = move-exception
            X.1IU r3 = new X.1IU     // Catch:{ all -> 0x0051 }
            r3.<init>(r0)     // Catch:{ all -> 0x0051 }
        L_0x003b:
            java.lang.Throwable r2 = X.C30671eK.A00(r3)     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x0048
            X.1Qo r1 = r5.A00     // Catch:{ all -> 0x0051 }
            X.8oI r0 = X.AnonymousClass8oI.A09     // Catch:{ all -> 0x0051 }
            r1.A01(r0, r4, r2)     // Catch:{ all -> 0x0051 }
        L_0x0048:
            r6.close()     // Catch:{ all -> 0x0058 }
            X.1eK r1 = new X.1eK     // Catch:{ all -> 0x0058 }
            r1.<init>(r3)     // Catch:{ all -> 0x0058 }
            goto L_0x005e
        L_0x0051:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            X.1IU r1 = new X.1IU
            r1.<init>(r0)
        L_0x005e:
            java.lang.Throwable r2 = X.C30671eK.A00(r1)
            if (r2 == 0) goto L_0x006b
            X.1Qo r1 = r5.A00
            X.8oI r0 = X.AnonymousClass8oI.A09
            r1.A01(r0, r4, r2)
        L_0x006b:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x006e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.reportingtoken.cron.ReportingTokenCleanupDailyCron$onDailyCron$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportingTokenCleanupDailyCron$onDailyCron$2) create(Long.valueOf(C17880vN.A05(obj)), (C30391dr) obj2)).invokeSuspend(C27621Wu.A00);
    }
}
