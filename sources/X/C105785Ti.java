package X;

import android.view.ViewGroup;
import com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity;

/* renamed from: X.5Ti  reason: invalid class name and case insensitive filesystem */
public final class C105785Ti extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterAppealsOutcomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105785Ti(NewsletterAppealsOutcomeActivity newsletterAppealsOutcomeActivity) {
        super(1);
        this.this$0 = newsletterAppealsOutcomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        AnonymousClass206 r6 = (AnonymousClass206) obj;
        NewsletterAppealsOutcomeActivity newsletterAppealsOutcomeActivity = this.this$0;
        AnonymousClass4SX r0 = newsletterAppealsOutcomeActivity.A02;
        if (r0 != null) {
            C94584kr r3 = new C94584kr(newsletterAppealsOutcomeActivity, r0);
            AnonymousClass5ZI r2 = newsletterAppealsOutcomeActivity.A01;
            if (r2 != null) {
                AnonymousClass3uP A05 = r2.BGL(newsletterAppealsOutcomeActivity, newsletterAppealsOutcomeActivity.getSupportFragmentManager(), AnonymousClass68H.A01(newsletterAppealsOutcomeActivity.A05)).A05(r3, r6);
                A05.setHeaderChevronVisibility(false);
                AnonymousClass4HL.A00(this.this$0, A05);
                ((ViewGroup) C72463Mc.A0O(this.this$0.A0A)).addView(A05);
                return C27621Wu.A00;
            }
            str = "conversationRowInflaterFactory";
        } else {
            str = "conversationRowCustomizers";
        }
        C18070vi.A11(str);
        throw null;
    }
}
