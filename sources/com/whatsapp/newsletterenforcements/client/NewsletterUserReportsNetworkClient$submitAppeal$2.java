package com.whatsapp.newsletterenforcements.client;

import X.A7K;
import X.AIj;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C199610h;
import X.C20125A8k;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C85984Pr;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateReportAppealResponseImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient$submitAppeal$2", f = "NewsletterUserReportsNetworkClient.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterUserReportsNetworkClient$submitAppeal$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $reason;
    public final /* synthetic */ String $reportId;
    public int label;
    public final /* synthetic */ NewsletterUserReportsNetworkClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterUserReportsNetworkClient$submitAppeal$2(NewsletterUserReportsNetworkClient newsletterUserReportsNetworkClient, String str, String str2, C30391dr r5) {
        super(2, r5);
        this.$reportId = str;
        this.$reason = str2;
        this.this$0 = newsletterUserReportsNetworkClient;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new NewsletterUserReportsNetworkClient$submitAppeal$2(this.this$0, this.$reportId, this.$reason, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            A7K a7k = new A7K();
            String str = this.$reportId;
            a7k.A07("report_id", str);
            boolean A1W = AnonymousClass000.A1W(str);
            String str2 = this.$reason;
            a7k.A07("reason", str2);
            boolean A1W2 = AnonymousClass000.A1W(str2);
            C199610h.A07(A1W);
            C199610h.A07(A1W2);
            AIj aIj = new AIj(a7k, NewsletterCreateReportAppealResponseImpl.class, "NewsletterCreateReportAppeal");
            this.label = 1;
            obj = ((C85984Pr) this.this$0.A00.get()).A00(aIj, this);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return new C20125A8k(((C20125A8k) obj).A09(NewsletterCreateReportAppealResponseImpl.Xwa2CreateChannelReportAppealV2.class, "xwa2_create_channel_report_appeal_v2").A00);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterUserReportsNetworkClient$submitAppeal$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
