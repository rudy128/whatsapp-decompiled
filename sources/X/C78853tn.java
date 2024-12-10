package X;

import android.content.Context;
import android.content.res.Configuration;
import com.whatsapp.conversation.carousel.CarouselView;

/* renamed from: X.3tn  reason: invalid class name and case insensitive filesystem */
public final class C78853tn extends AnonymousClass3tX {
    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        C79103uS.A1G(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78853tn(Context context, C108875cR r4, AnonymousClass210 r5) {
        super(context, r4, r5);
        C18070vi.A0o(context, r5, r4);
        A1M();
        A2n();
        CarouselView reelCarousel = getReelCarousel();
        reelCarousel.setVisibility(0);
        reelCarousel.setAdapter(this.A06);
        reelCarousel.A14();
        this.A00 = reelCarousel;
        A2u();
        A2i();
        A2v(r5);
    }

    private final CarouselView getReelCarousel() {
        return (CarouselView) AnonymousClass3MX.A0C(this, 2131429582);
    }

    public void A2i() {
        super.A2i();
        C78033s1 r0 = this.A06;
        if (r0 != null) {
            r0.notifyDataSetChanged();
            A2t();
        }
    }
}
