package com.whatsapp.product.newsletterenforcements.userreports;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$fetchReports$1", f = "NewsletterUserReportsViewModel.kt", i = {1}, l = {77, 78}, m = "invokeSuspend", n = {"userReports"}, s = {"L$0"})
public final class NewsletterUserReportsViewModel$fetchReports$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public int label;
    public final /* synthetic */ NewsletterUserReportsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterUserReportsViewModel$fetchReports$1(NewsletterUserReportsViewModel newsletterUserReportsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = newsletterUserReportsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new NewsletterUserReportsViewModel$fetchReports$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NewsletterUserReportsViewModel$fetchReports$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b A[Catch:{ 4tL -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095 A[Catch:{ 4tL -> 0x009c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0016
            if (r0 == r1) goto L_0x004f
            if (r0 != r5) goto L_0x0011
            java.lang.Object r2 = r6.L$0
            java.util.List r2 = (java.util.List) r2
            goto L_0x006b
        L_0x0011:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0016:
            X.C30691eM.A01(r7)
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r0 = r6.this$0     // Catch:{ 4tL -> 0x009c }
            X.11E r0 = r0.A01     // Catch:{ 4tL -> 0x009c }
            boolean r0 = r0.A09()     // Catch:{ 4tL -> 0x009c }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "Fetching user reports: No network, so returning..."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 4tL -> 0x009c }
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r0 = r6.this$0     // Catch:{ 4tL -> 0x009c }
            X.1DT r1 = r0.A00     // Catch:{ 4tL -> 0x009c }
            X.4p8 r0 = X.C97234p8.A00     // Catch:{ 4tL -> 0x009c }
            r1.A0E(r0)     // Catch:{ 4tL -> 0x009c }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ 4tL -> 0x009c }
            return r0
        L_0x0034:
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r0 = r6.this$0     // Catch:{ 4tL -> 0x009c }
            X.00H r0 = r0.A03     // Catch:{ 4tL -> 0x009c }
            java.lang.Object r3 = r0.get()     // Catch:{ 4tL -> 0x009c }
            com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient r3 = (com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient) r3     // Catch:{ 4tL -> 0x009c }
            r6.label = r1     // Catch:{ 4tL -> 0x009c }
            X.1Ho r2 = X.C23761Hn.A01     // Catch:{ 4tL -> 0x009c }
            r1 = 0
            com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient$fetchUserReports$2 r0 = new com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient$fetchUserReports$2     // Catch:{ 4tL -> 0x009c }
            r0.<init>(r3, r1)     // Catch:{ 4tL -> 0x009c }
            java.lang.Object r7 = X.C30451dy.A00(r6, r2, r0)     // Catch:{ 4tL -> 0x009c }
            if (r7 != r4) goto L_0x0052
            return r4
        L_0x004f:
            X.C30691eM.A01(r7)     // Catch:{ 4tL -> 0x009c }
        L_0x0052:
            java.util.List r7 = (java.util.List) r7     // Catch:{ 4tL -> 0x009c }
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r3 = r6.this$0     // Catch:{ 4tL -> 0x009c }
            r6.L$0 = r7     // Catch:{ 4tL -> 0x009c }
            r6.label = r5     // Catch:{ 4tL -> 0x009c }
            X.1Ho r2 = X.C23761Hn.A00     // Catch:{ 4tL -> 0x009c }
            r1 = 0
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$processUserReports$2 r0 = new com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$processUserReports$2     // Catch:{ 4tL -> 0x009c }
            r0.<init>(r3, r7, r1)     // Catch:{ 4tL -> 0x009c }
            java.lang.Object r0 = X.C30451dy.A00(r6, r2, r0)     // Catch:{ 4tL -> 0x009c }
            if (r0 == r4) goto L_0x009b
            r2 = r7
            r7 = r0
            goto L_0x006e
        L_0x006b:
            X.C30691eM.A01(r7)     // Catch:{ 4tL -> 0x009c }
        L_0x006e:
            java.util.List r7 = (java.util.List) r7     // Catch:{ 4tL -> 0x009c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 4tL -> 0x009c }
            java.lang.String r0 = "Successfully fetched user reports: from network: "
            X.C17890vO.A15(r0, r1, r2)     // Catch:{ 4tL -> 0x009c }
            java.lang.String r0 = ", after filtering: "
            r1.append(r0)     // Catch:{ 4tL -> 0x009c }
            int r0 = r7.size()     // Catch:{ 4tL -> 0x009c }
            X.C17900vP.A0o(r1, r0)     // Catch:{ 4tL -> 0x009c }
            boolean r0 = r7.isEmpty()     // Catch:{ 4tL -> 0x009c }
            if (r0 == 0) goto L_0x0095
            X.4pA r1 = X.C97254pA.A00     // Catch:{ 4tL -> 0x009c }
        L_0x008d:
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r0 = r6.this$0     // Catch:{ 4tL -> 0x009c }
            X.1DT r0 = r0.A00     // Catch:{ 4tL -> 0x009c }
            r0.A0E(r1)     // Catch:{ 4tL -> 0x009c }
            goto L_0x00bf
        L_0x0095:
            X.4p6 r1 = new X.4p6     // Catch:{ 4tL -> 0x009c }
            r1.<init>(r7)     // Catch:{ 4tL -> 0x009c }
            goto L_0x008d
        L_0x009b:
            return r4
        L_0x009c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Exception while fetching newsletter reports: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", "
            r1.append(r0)
            X.A6Z r0 = r2.error
            r1.append(r0)
            X.C17890vO.A0w(r1)
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r0 = r6.this$0
            X.1DT r1 = r0.A00
            X.4p7 r0 = X.C97224p7.A00
            r1.A0E(r0)
        L_0x00bf:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$fetchReports$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
