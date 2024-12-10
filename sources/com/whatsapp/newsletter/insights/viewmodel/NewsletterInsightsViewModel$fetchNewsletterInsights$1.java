package com.whatsapp.newsletter.insights.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass1OS;
import X.AnonymousClass3Ma;
import X.AnonymousClass3VG;
import X.AnonymousClass4QY;
import X.AnonymousClass5Y9;
import X.C18070vi;
import X.C27621Wu;
import X.C29681ch;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C35681md;
import X.C821643h;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.insights.viewmodel.NewsletterInsightsViewModel$fetchNewsletterInsights$1", f = "NewsletterInsightsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterInsightsViewModel$fetchNewsletterInsights$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $explicitly;
    public final /* synthetic */ Set $metricRequests;
    public int label;
    public final /* synthetic */ AnonymousClass3VG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterInsightsViewModel$fetchNewsletterInsights$1(AnonymousClass3VG r2, Set set, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = r2;
        this.$metricRequests = set;
        this.$explicitly = z;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new NewsletterInsightsViewModel$fetchNewsletterInsights$1(this.this$0, this.$metricRequests, r6, this.$explicitly);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass3VG r2 = this.this$0;
            C35681md r1 = r2.A05;
            C29681ch r3 = r2.A03;
            Set set = this.$metricRequests;
            AnonymousClass4QY r5 = new AnonymousClass4QY(r2, set, this.$explicitly);
            C18070vi.A0d(set, 1);
            AnonymousClass10E r0 = r1.A0B.A00.A00;
            new C821643h(AnonymousClass3Ma.A0l(r0), r3, (AnonymousClass5Y9) r0.A7S.get(), r5, AnonymousClass10E.AL1(r0), set).A01();
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterInsightsViewModel$fetchNewsletterInsights$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
