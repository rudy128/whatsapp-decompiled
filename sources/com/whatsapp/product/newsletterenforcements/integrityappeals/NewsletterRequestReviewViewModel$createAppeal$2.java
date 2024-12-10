package com.whatsapp.product.newsletterenforcements.integrityappeals;

import X.AnonymousClass000;
import X.AnonymousClass445;
import X.AnonymousClass446;
import X.AnonymousClass45L;
import X.C22821Di;
import X.C27621Wu;
import X.C29681ch;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C89494cY;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealReason;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory;
import com.whatsapp.newsletterenforcements.client.NewsletterEnforcementsClient;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.integrityappeals.NewsletterRequestReviewViewModel$createAppeal$2", f = "NewsletterRequestReviewViewModel.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterRequestReviewViewModel$createAppeal$2 extends C30431dv implements C22821Di {
    public final /* synthetic */ String $appealReason;
    public final /* synthetic */ C89494cY $enforcement;
    public final /* synthetic */ C29681ch $newsletterJid;
    public int label;
    public final /* synthetic */ NewsletterRequestReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterRequestReviewViewModel$createAppeal$2(C29681ch r2, C89494cY r3, NewsletterRequestReviewViewModel newsletterRequestReviewViewModel, String str, C30391dr r6) {
        super(1, r6);
        this.this$0 = newsletterRequestReviewViewModel;
        this.$newsletterJid = r2;
        this.$enforcement = r3;
        this.$appealReason = str;
    }

    public final C30391dr create(C30391dr r7) {
        return new NewsletterRequestReviewViewModel$createAppeal$2(this.$newsletterJid, this.$enforcement, this.this$0, this.$appealReason, r7);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C29681ch r2 = this.$newsletterJid;
            C89494cY r1 = this.$enforcement;
            String str = this.$appealReason;
            this.label = 1;
            obj2 = ((NewsletterEnforcementsClient) this.this$0.A01.get()).A08(r2, r1, str, this);
            if (obj2 == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C89494cY r22 = (C89494cY) obj2;
        if (r22 instanceof AnonymousClass446) {
            C89494cY r12 = this.$enforcement;
            if (r12 instanceof AnonymousClass446) {
                AnonymousClass446 r23 = (AnonymousClass446) r22;
                List list = ((AnonymousClass446) r12).A08;
                GraphQLXWA2AppealState graphQLXWA2AppealState = r23.A01;
                GraphQLXWA2AppealReason graphQLXWA2AppealReason = r23.A00;
                GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory = r23.A03;
                String str2 = r23.A05;
                String str3 = r23.A06;
                r22 = new AnonymousClass446(graphQLXWA2AppealReason, graphQLXWA2AppealState, r23.A02, graphQLXWA2ViolationCategory, r23.A04, str2, str3, r23.A07, list);
                return new AnonymousClass45L(r22);
            }
        }
        if (r22 instanceof AnonymousClass445) {
            C89494cY r13 = this.$enforcement;
            if (r13 instanceof AnonymousClass445) {
                AnonymousClass445 r24 = (AnonymousClass445) r22;
                List list2 = ((AnonymousClass445) r13).A08;
                GraphQLXWA2AppealState graphQLXWA2AppealState2 = r24.A01;
                GraphQLXWA2AppealReason graphQLXWA2AppealReason2 = r24.A00;
                GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory2 = r24.A03;
                String str4 = r24.A05;
                String str5 = r24.A06;
                r22 = new AnonymousClass445(graphQLXWA2AppealReason2, graphQLXWA2AppealState2, r24.A02, graphQLXWA2ViolationCategory2, r24.A04, str4, str5, r24.A07, list2);
            }
        }
        return new AnonymousClass45L(r22);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((NewsletterRequestReviewViewModel$createAppeal$2) create((C30391dr) obj)).invokeSuspend(C27621Wu.A00);
    }
}
