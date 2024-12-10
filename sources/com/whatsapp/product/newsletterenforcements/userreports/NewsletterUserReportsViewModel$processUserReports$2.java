package com.whatsapp.product.newsletterenforcements.userreports;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C200510q;
import X.C20125A8k;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C85054Lx;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$processUserReports$2", f = "NewsletterUserReportsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterUserReportsViewModel$processUserReports$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $userReports;
    public int label;
    public final /* synthetic */ NewsletterUserReportsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterUserReportsViewModel$processUserReports$2(NewsletterUserReportsViewModel newsletterUserReportsViewModel, List list, C30391dr r4) {
        super(2, r4);
        this.$userReports = list;
        this.this$0 = newsletterUserReportsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new NewsletterUserReportsViewModel$processUserReports$2(this.this$0, this.$userReports, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            List list = this.$userReports;
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : list) {
                GraphQLXWA2ReportStatus graphQLXWA2ReportStatus = GraphQLXWA2ReportStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                if (((C20125A8k) next).A0D(graphQLXWA2ReportStatus, "status") != graphQLXWA2ReportStatus) {
                    A13.add(next);
                }
            }
            ConcurrentHashMap concurrentHashMap = ((C85054Lx) this.this$0.A04.get()).A00;
            concurrentHashMap.clear();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(A13));
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                linkedHashMap.put(((C20125A8k) next2).A00.optString("report_id"), next2);
            }
            concurrentHashMap.putAll(linkedHashMap);
            return A13;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterUserReportsViewModel$processUserReports$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
