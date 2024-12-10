package X;

import com.whatsapp.newsletter.insights.NewsletterInsightsActivity;

/* renamed from: X.5Io  reason: invalid class name and case insensitive filesystem */
public final class C102985Io extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ NewsletterInsightsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102985Io(NewsletterInsightsActivity newsletterInsightsActivity) {
        super(0);
        this.this$0 = newsletterInsightsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(this.this$0.getIntent().getIntExtra("page", 0));
    }
}
