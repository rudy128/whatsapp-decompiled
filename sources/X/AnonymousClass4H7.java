package X;

import android.os.Bundle;
import com.whatsapp.newsletter.insights.fragment.NewsletterInsightsInfoSheet;

/* renamed from: X.4H7  reason: invalid class name */
public abstract class AnonymousClass4H7 {
    public static final NewsletterInsightsInfoSheet A00(C29681ch r4, int i, int i2, long j) {
        NewsletterInsightsInfoSheet newsletterInsightsInfoSheet = new NewsletterInsightsInfoSheet();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("content", i);
        AnonymousClass3MY.A15(A0D, r4, "jid");
        A0D.putLong("session_id", j);
        A0D.putInt("surface", i2);
        newsletterInsightsInfoSheet.A1R(A0D);
        return newsletterInsightsInfoSheet;
    }
}
