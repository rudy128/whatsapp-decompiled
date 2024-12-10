package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl;

/* renamed from: X.4HK  reason: invalid class name */
public abstract class AnonymousClass4HK {
    public static final String A00(AnonymousClass1CJ r2, NewsletterReportAppealStateResponseImpl newsletterReportAppealStateResponseImpl) {
        C46162Dk r1;
        if (newsletterReportAppealStateResponseImpl.A0F("channel_name") != null) {
            return newsletterReportAppealStateResponseImpl.A0F("channel_name");
        }
        AnonymousClass25J r0 = C29681ch.A03;
        C29691ci A0A = r2.A0A(AnonymousClass25J.A00(newsletterReportAppealStateResponseImpl.A00.optString("channel_jid")));
        if (!(A0A instanceof C46162Dk) || (r1 = (C46162Dk) A0A) == null) {
            return null;
        }
        return r1.A0T;
    }
}
