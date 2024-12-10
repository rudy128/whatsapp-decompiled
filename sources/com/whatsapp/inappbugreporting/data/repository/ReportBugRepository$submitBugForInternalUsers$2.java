package com.whatsapp.inappbugreporting.data.repository;

import X.AnonymousClass1OS;
import X.AnonymousClass4X1;
import X.C106975Xx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForInternalUsers$2", f = "ReportBugRepository.kt", i = {0, 1}, l = {138, 139, 143, 155, 163}, m = "invokeSuspend", n = {"logsInfoDeferred", "debugInfoJson"}, s = {"L$0", "L$0"})
public final class ReportBugRepository$submitBugForInternalUsers$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C106975Xx $bugReportCallback;
    public final /* synthetic */ String $bugReportingEndpoint;
    public final /* synthetic */ String $category;
    public final /* synthetic */ String $description;
    public final /* synthetic */ List $screenshotList;
    public final /* synthetic */ String $title;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass4X1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportBugRepository$submitBugForInternalUsers$2(C106975Xx r2, AnonymousClass4X1 r3, String str, String str2, String str3, String str4, List list, C30391dr r9) {
        super(2, r9);
        this.this$0 = r3;
        this.$title = str;
        this.$description = str2;
        this.$screenshotList = list;
        this.$category = str3;
        this.$bugReportingEndpoint = str4;
        this.$bugReportCallback = r2;
    }

    public final C30391dr create(Object obj, C30391dr r11) {
        AnonymousClass4X1 r2 = this.this$0;
        String str = this.$title;
        String str2 = this.$description;
        List list = this.$screenshotList;
        ReportBugRepository$submitBugForInternalUsers$2 reportBugRepository$submitBugForInternalUsers$2 = new ReportBugRepository$submitBugForInternalUsers$2(this.$bugReportCallback, r2, str, str2, this.$category, this.$bugReportingEndpoint, list, r11);
        reportBugRepository$submitBugForInternalUsers$2.L$0 = obj;
        return reportBugRepository$submitBugForInternalUsers$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r12 = r16
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r15.label
            r4 = 5
            r6 = 4
            r1 = 3
            r11 = 1
            r2 = 2
            r3 = 0
            if (r0 == 0) goto L_0x001d
            if (r0 == r11) goto L_0x0070
            if (r0 == r2) goto L_0x0085
            if (r0 == r1) goto L_0x00ab
            if (r0 == r6) goto L_0x00f8
            if (r0 == r4) goto L_0x00f8
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001d:
            X.C30691eM.A01(r12)
            java.lang.Object r12 = r15.L$0
            X.1OX r12 = (X.AnonymousClass1OX) r12
            X.4X1 r0 = r15.this$0
            X.6lx r0 = X.AnonymousClass4X1.A00(r0)
            r10 = 476715896(0x1c6a1b78, float:7.745961E-22)
            X.19T r0 = r0.A00
            r0.markerStart(r10)
            X.4X1 r0 = r15.this$0
            X.6lx r9 = X.AnonymousClass4X1.A00(r0)
            X.4X1 r0 = r15.this$0
            X.6lx r0 = X.AnonymousClass4X1.A00(r0)
            java.lang.String r8 = r0.A00()
            java.lang.String r7 = "network_type"
            X.19T r0 = r9.A00
            r0.markerAnnotate((int) r10, (java.lang.String) r7, (java.lang.String) r8)
            X.4X1 r8 = r15.this$0
            java.lang.String r7 = r15.$bugReportingEndpoint
            com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForInternalUsers$2$debugInfoDeferred$1 r0 = new com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForInternalUsers$2$debugInfoDeferred$1
            r0.<init>(r8, r7, r3)
            X.1OR r10 = X.AnonymousClass1OR.A00
            java.lang.Integer r9 = X.AnonymousClass00R.A00
            X.5WH r8 = X.C30451dy.A01(r9, r10, r0, r12)
            X.4X1 r7 = r15.this$0
            com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForInternalUsers$2$logsInfoDeferred$1 r0 = new com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForInternalUsers$2$logsInfoDeferred$1
            r0.<init>(r7, r3)
            X.5WH r0 = X.C30451dy.A01(r9, r10, r0, r12)
            r15.L$0 = r0
            r15.label = r11
            java.lang.Object r12 = r8.BCp(r15)
            if (r12 != r5) goto L_0x0077
            return r5
        L_0x0070:
            java.lang.Object r0 = r15.L$0
            X.EEF r0 = (X.EEF) r0
            X.C30691eM.A01(r12)
        L_0x0077:
            r11 = r12
            java.lang.String r11 = (java.lang.String) r11
            r15.L$0 = r11
            r15.label = r2
            java.lang.Object r12 = r0.BCp(r15)
            if (r12 != r5) goto L_0x008c
            return r5
        L_0x0085:
            java.lang.Object r11 = r15.L$0
            java.lang.String r11 = (java.lang.String) r11
            X.C30691eM.A01(r12)
        L_0x008c:
            java.lang.String r12 = (java.lang.String) r12
            X.4X1 r0 = r15.this$0
            X.00H r0 = r0.A02
            java.lang.Object r8 = r0.get()
            com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper r8 = (com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper) r8
            java.lang.String r9 = r15.$title
            java.lang.String r10 = r15.$description
            java.util.List r14 = r15.$screenshotList
            java.lang.String r13 = r15.$category
            r15.L$0 = r3
            r15.label = r1
            java.lang.Object r12 = r8.A00(r9, r10, r11, r12, r13, r14, r15)
            if (r12 != r5) goto L_0x00ae
            return r5
        L_0x00ab:
            X.C30691eM.A01(r12)
        L_0x00ae:
            X.4Eg r12 = (X.C83214Eg) r12
            boolean r0 = r12 instanceof X.AnonymousClass41X
            if (r0 == 0) goto L_0x00d6
            X.4X1 r0 = r15.this$0
            X.6lx r0 = X.AnonymousClass4X1.A00(r0)
            r1 = 476715896(0x1c6a1b78, float:7.745961E-22)
            X.19T r0 = r0.A00
            r0.markerEnd(r1, r2)
            X.4X1 r0 = r15.this$0
            X.0wl r2 = r0.A06
            X.5Xx r0 = r15.$bugReportCallback
            com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForInternalUsers$2$1 r1 = new com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForInternalUsers$2$1
            r1.<init>(r12, r3)
            r15.label = r6
        L_0x00cf:
            java.lang.Object r0 = X.C30451dy.A00(r15, r2, r1)
            if (r0 != r5) goto L_0x00fb
            return r5
        L_0x00d6:
            boolean r0 = r12 instanceof X.AnonymousClass41W
            if (r0 == 0) goto L_0x00fb
            X.4X1 r0 = r15.this$0
            X.6lx r0 = X.AnonymousClass4X1.A00(r0)
            r2 = 87
            r1 = 476715896(0x1c6a1b78, float:7.745961E-22)
            X.19T r0 = r0.A00
            r0.markerEnd(r1, r2)
            X.4X1 r0 = r15.this$0
            X.0wl r2 = r0.A06
            X.5Xx r0 = r15.$bugReportCallback
            com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForInternalUsers$2$2 r1 = new com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForInternalUsers$2$2
            r1.<init>(r12, r3)
            r15.label = r4
            goto L_0x00cf
        L_0x00f8:
            X.C30691eM.A01(r12)
        L_0x00fb:
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForInternalUsers$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportBugRepository$submitBugForInternalUsers$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
