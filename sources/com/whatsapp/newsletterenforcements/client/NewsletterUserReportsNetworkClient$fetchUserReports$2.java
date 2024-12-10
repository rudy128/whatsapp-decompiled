package com.whatsapp.newsletterenforcements.client;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient$fetchUserReports$2", f = "NewsletterUserReportsNetworkClient.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterUserReportsNetworkClient$fetchUserReports$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ NewsletterUserReportsNetworkClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterUserReportsNetworkClient$fetchUserReports$2(NewsletterUserReportsNetworkClient newsletterUserReportsNetworkClient, C30391dr r3) {
        super(2, r3);
        this.this$0 = newsletterUserReportsNetworkClient;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new NewsletterUserReportsNetworkClient$fetchUserReports$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NewsletterUserReportsNetworkClient$fetchUserReports$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0061, code lost:
        if (r7 == r4) goto L_0x0063;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r5) goto L_0x0064
            X.C30691eM.A01(r7)
        L_0x000c:
            X.A8k r7 = (X.C20125A8k) r7
            java.lang.String r1 = "xwa2_channels_reports"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterUserReportsResponseImpl$Xwa2ChannelsReports> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterUserReportsResponseImpl.Xwa2ChannelsReports.class
            X.A8k r2 = r7.A09(r0, r1)
            java.lang.String r1 = "channels_reports"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterUserReportsResponseImpl$Xwa2ChannelsReports$ChannelsReports> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterUserReportsResponseImpl.Xwa2ChannelsReports.ChannelsReports.class
            X.1IX r0 = r2.A0A(r0, r1)
            X.C18070vi.A0X(r0)
            java.util.ArrayList r4 = X.C29351c6.A0D(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0029:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r2.next()
            X.A8k r0 = (X.C20125A8k) r0
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl
            r0.<init>(r1)
            r4.add(r0)
            goto L_0x0029
        L_0x0040:
            X.C30691eM.A01(r7)
            X.A7K r3 = new X.A7K
            r3.<init>()
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterUserReportsResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterUserReportsResponseImpl.class
            java.lang.String r0 = "NewsletterUserReports"
            X.AIj r1 = new X.AIj
            r1.<init>(r3, r2, r0)
            com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient r0 = r6.this$0
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.4Pr r0 = (X.C85984Pr) r0
            r6.label = r5
            java.lang.Object r7 = r0.A00(r1, r6)
            if (r7 != r4) goto L_0x000c
        L_0x0063:
            return r4
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient$fetchUserReports$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
