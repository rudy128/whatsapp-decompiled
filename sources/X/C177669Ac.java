package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9Ac  reason: invalid class name and case insensitive filesystem */
public final class C177669Ac extends C38471rL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ CatalogCarouselDetailImageView A02;
    public final /* synthetic */ String A03;

    public C177669Ac(ImageView imageView, CatalogCarouselDetailImageView catalogCarouselDetailImageView, String str, int i) {
        this.A01 = imageView;
        this.A02 = catalogCarouselDetailImageView;
        this.A03 = str;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.A7D, java.lang.Object] */
    public void A04(View view) {
        String str;
        ImageView imageView = this.A01;
        if (imageView.getTag(2131432150) != null) {
            CatalogCarouselDetailImageView catalogCarouselDetailImageView = this.A02;
            UserJid userJid = catalogCarouselDetailImageView.A08;
            String str2 = this.A03;
            if (userJid != null) {
                int i = this.A00;
                imageView.setTag(A1M.A00(str2, i));
                catalogCarouselDetailImageView.getWaIntents().get();
                Context context = catalogCarouselDetailImageView.getContext();
                Intent A0A = C17880vN.A0A();
                A0A.setClassName(context.getPackageName(), "com.whatsapp.CatalogMediaView");
                A0A.putExtra("target_image_index", i);
                AnonymousClass3MY.A12(A0A, userJid, "cached_jid");
                A0A.putExtra("product", catalogCarouselDetailImageView.A01);
                AnonymousClass745.A09(catalogCarouselDetailImageView.getContext(), A0A, imageView, catalogCarouselDetailImageView.getAbProps());
                AnonymousClass745.A08(catalogCarouselDetailImageView.getContext(), A0A, imageView, new AnonymousClass4ZR(AnonymousClass3MY.A04(catalogCarouselDetailImageView)), AnonymousClass001.A1H("thumb-transition-", A1M.A00(str2, i), AnonymousClass000.A10()));
                ? obj = new Object();
                obj.A0B = catalogCarouselDetailImageView.getCatalogAnalyticManager().A03;
                A8Q.A04(obj, catalogCarouselDetailImageView.getCatalogAnalyticManager());
                A8Q.A03(obj, A8Q.A01(obj, catalogCarouselDetailImageView));
                C20287AEv aEv = catalogCarouselDetailImageView.A01;
                if (aEv != null) {
                    str = aEv.A0H;
                } else {
                    str = null;
                }
                obj.A0H = str;
                obj.A00 = catalogCarouselDetailImageView.A08;
                A7D.A01(obj, 51);
                A7D.A02(obj, 89);
                catalogCarouselDetailImageView.getCatalogAnalyticManager().A09(obj);
            }
        }
    }
}
