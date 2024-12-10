package X;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.newsletter.ui.mv.NewsletterSelectToUpgradeMVActivity;

/* renamed from: X.80V  reason: invalid class name */
public final class AnonymousClass80V extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterSelectToUpgradeMVActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass80V(NewsletterSelectToUpgradeMVActivity newsletterSelectToUpgradeMVActivity) {
        super(1);
        this.this$0 = newsletterSelectToUpgradeMVActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        NewsletterSelectToUpgradeMVActivity newsletterSelectToUpgradeMVActivity = this.this$0;
        boolean A1a = AnonymousClass3MX.A1a((Boolean) obj);
        ImageView imageView = newsletterSelectToUpgradeMVActivity.A00;
        if (imageView == null) {
            str = "createButtonIcon";
        } else {
            imageView.setEnabled(A1a);
            WaTextView waTextView = newsletterSelectToUpgradeMVActivity.A06;
            if (waTextView == null) {
                str = "createButtonTextView";
            } else {
                waTextView.setEnabled(A1a);
                LinearLayout linearLayout = newsletterSelectToUpgradeMVActivity.A01;
                if (linearLayout != null) {
                    linearLayout.setClickable(A1a);
                    LinearLayout linearLayout2 = newsletterSelectToUpgradeMVActivity.A01;
                    if (linearLayout2 != null) {
                        linearLayout2.setEnabled(A1a);
                        return C27621Wu.A00;
                    }
                }
                C18070vi.A11("createButton");
                throw null;
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
