package com.whatsapp.inappbugreporting.data.repository;

import X.AnonymousClass1OS;
import X.AnonymousClass4X1;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForExternalUsers$1", f = "ReportBugRepository.kt", i = {0, 1}, l = {78, 79, 85}, m = "invokeSuspend", n = {"logsInfoDeferred", "debugInfoJson"}, s = {"L$0", "L$0"})
public final class ReportBugRepository$submitBugForExternalUsers$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $bugReportingEndpoint;
    public final /* synthetic */ String $description;
    public final /* synthetic */ List $screenshotList;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass4X1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportBugRepository$submitBugForExternalUsers$1(AnonymousClass4X1 r2, String str, String str2, List list, C30391dr r6) {
        super(2, r6);
        this.this$0 = r2;
        this.$description = str;
        this.$screenshotList = list;
        this.$bugReportingEndpoint = str2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        ReportBugRepository$submitBugForExternalUsers$1 reportBugRepository$submitBugForExternalUsers$1 = new ReportBugRepository$submitBugForExternalUsers$1(this.this$0, this.$description, this.$bugReportingEndpoint, this.$screenshotList, r8);
        reportBugRepository$submitBugForExternalUsers$1.L$0 = obj;
        return reportBugRepository$submitBugForExternalUsers$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cf A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r14 = r19
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            r5 = r18
            int r0 = r5.label
            r4 = 3
            r9 = 1
            r11 = 0
            r3 = 2
            if (r0 == 0) goto L_0x0041
            if (r0 == r9) goto L_0x0094
            if (r0 == r3) goto L_0x00a9
            if (r0 != r4) goto L_0x00d0
            X.C30691eM.A01(r14)
        L_0x0017:
            boolean r0 = r14 instanceof X.AnonymousClass41X
            if (r0 == 0) goto L_0x002c
            X.4X1 r0 = r5.this$0
            X.6lx r0 = X.AnonymousClass4X1.A00(r0)
            r1 = 476715896(0x1c6a1b78, float:7.745961E-22)
            X.19T r0 = r0.A00
            r0.markerEnd(r1, r3)
        L_0x0029:
            X.1Wu r6 = X.C27621Wu.A00
            return r6
        L_0x002c:
            boolean r0 = r14 instanceof X.AnonymousClass41W
            if (r0 == 0) goto L_0x0029
            X.4X1 r0 = r5.this$0
            X.6lx r0 = X.AnonymousClass4X1.A00(r0)
            r2 = 87
            r1 = 476715896(0x1c6a1b78, float:7.745961E-22)
            X.19T r0 = r0.A00
            r0.markerEnd(r1, r2)
            goto L_0x0029
        L_0x0041:
            X.C30691eM.A01(r14)
            java.lang.Object r10 = r5.L$0
            X.1OX r10 = (X.AnonymousClass1OX) r10
            X.4X1 r0 = r5.this$0
            X.6lx r0 = X.AnonymousClass4X1.A00(r0)
            r8 = 476715896(0x1c6a1b78, float:7.745961E-22)
            X.19T r0 = r0.A00
            r0.markerStart(r8)
            X.4X1 r0 = r5.this$0
            X.6lx r7 = X.AnonymousClass4X1.A00(r0)
            X.4X1 r0 = r5.this$0
            X.6lx r0 = X.AnonymousClass4X1.A00(r0)
            java.lang.String r2 = r0.A00()
            java.lang.String r1 = "network_type"
            X.19T r0 = r7.A00
            r0.markerAnnotate((int) r8, (java.lang.String) r1, (java.lang.String) r2)
            X.4X1 r2 = r5.this$0
            java.lang.String r1 = r5.$bugReportingEndpoint
            com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForExternalUsers$1$debugInfoDeferred$1 r0 = new com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForExternalUsers$1$debugInfoDeferred$1
            r0.<init>(r2, r1, r11)
            X.1OR r8 = X.AnonymousClass1OR.A00
            java.lang.Integer r7 = X.AnonymousClass00R.A00
            X.5WH r2 = X.C30451dy.A01(r7, r8, r0, r10)
            X.4X1 r1 = r5.this$0
            com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForExternalUsers$1$logsInfoDeferred$1 r0 = new com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForExternalUsers$1$logsInfoDeferred$1
            r0.<init>(r1, r11)
            X.5WH r0 = X.C30451dy.A01(r7, r8, r0, r10)
            r5.L$0 = r0
            r5.label = r9
            java.lang.Object r14 = r2.BCp(r5)
            if (r14 != r6) goto L_0x009b
            return r6
        L_0x0094:
            java.lang.Object r0 = r5.L$0
            X.EEF r0 = (X.EEF) r0
            X.C30691eM.A01(r14)
        L_0x009b:
            r13 = r14
            java.lang.String r13 = (java.lang.String) r13
            r5.L$0 = r13
            r5.label = r3
            java.lang.Object r14 = r0.BCp(r5)
            if (r14 != r6) goto L_0x00b0
            return r6
        L_0x00a9:
            java.lang.Object r13 = r5.L$0
            java.lang.String r13 = (java.lang.String) r13
            X.C30691eM.A01(r14)
        L_0x00b0:
            java.lang.String r14 = (java.lang.String) r14
            X.4X1 r0 = r5.this$0
            X.00H r0 = r0.A02
            java.lang.Object r10 = r0.get()
            com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper r10 = (com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper) r10
            java.lang.String r12 = r5.$description
            java.util.List r0 = r5.$screenshotList
            r5.L$0 = r11
            r5.label = r4
            r15 = r11
            r17 = r5
            r16 = r0
            java.lang.Object r14 = r10.A00(r11, r12, r13, r14, r15, r16, r17)
            if (r14 != r6) goto L_0x0017
            return r6
        L_0x00d0:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForExternalUsers$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportBugRepository$submitBugForExternalUsers$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
