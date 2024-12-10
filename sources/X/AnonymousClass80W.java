package X;

import android.content.res.Resources;
import com.whatsapp.WaTextView;
import com.whatsapp.newsletter.ui.mv.NewsletterSelectToUpgradeMVActivity;
import java.util.List;

/* renamed from: X.80W  reason: invalid class name */
public final class AnonymousClass80W extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterSelectToUpgradeMVActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass80W(NewsletterSelectToUpgradeMVActivity newsletterSelectToUpgradeMVActivity) {
        super(1);
        this.this$0 = newsletterSelectToUpgradeMVActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C19880zA r1 = C108985cd.A0W(this.this$0).A04;
        if (r1.A07()) {
            r1.A03();
            throw AnonymousClass000.A0s("getLimit");
        }
        NewsletterSelectToUpgradeMVActivity newsletterSelectToUpgradeMVActivity = this.this$0;
        WaTextView waTextView = newsletterSelectToUpgradeMVActivity.A08;
        if (waTextView == null) {
            C18070vi.A11("verifiedChannelTitle");
            throw null;
        }
        Resources resources = newsletterSelectToUpgradeMVActivity.getResources();
        int size = list.size();
        Object[] objArr = new Object[1];
        C108985cd.A1S(list, objArr, 0);
        AnonymousClass3MX.A1E(resources, waTextView, objArr, 2131755279, size);
        return C27621Wu.A00;
    }
}
