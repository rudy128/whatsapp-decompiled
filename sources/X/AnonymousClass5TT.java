package X;

import android.graphics.Bitmap;
import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.5TT  reason: invalid class name */
public final class AnonymousClass5TT extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5TT(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        if (bitmap != null) {
            newsletterInfoActivity.A4h(bitmap);
        } else {
            newsletterInfoActivity.A4j(Integer.valueOf(((AnonymousClass1VW) C18070vi.A0E(newsletterInfoActivity.A0S)).A03(newsletterInfoActivity.A4m(), false)));
        }
        return C27621Wu.A00;
    }
}
