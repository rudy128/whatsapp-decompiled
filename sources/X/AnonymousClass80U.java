package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;
import com.whatsapp.newsletter.ui.mv.NewsletterSelectToUpgradeMVActivity;

/* renamed from: X.80U  reason: invalid class name */
public final class AnonymousClass80U extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterSelectToUpgradeMVActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass80U(NewsletterSelectToUpgradeMVActivity newsletterSelectToUpgradeMVActivity) {
        super(1);
        this.this$0 = newsletterSelectToUpgradeMVActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        NewsletterSelectToUpgradeMVActivity newsletterSelectToUpgradeMVActivity = this.this$0;
        boolean A1a = AnonymousClass3MX.A1a((Boolean) obj);
        WaTextView waTextView = newsletterSelectToUpgradeMVActivity.A07;
        if (waTextView == null) {
            str = "unverifiedNewsletterTitle";
        } else {
            int i = 0;
            waTextView.setVisibility(C72453Mb.A07(A1a ? 1 : 0));
            RecyclerView recyclerView = newsletterSelectToUpgradeMVActivity.A02;
            if (recyclerView == null) {
                str = "unverifiedNewsletterRecyclerView";
            } else {
                if (!A1a) {
                    i = 8;
                }
                recyclerView.setVisibility(i);
                return C27621Wu.A00;
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
