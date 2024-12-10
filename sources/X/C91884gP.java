package X;

import android.content.res.Resources;
import androidx.viewpager2.widget.ViewPager2;
import com.whatsapp.newsletter.insights.NewsletterInsightsActivity;
import com.whatsapp.profile.coinflip.edit.CoinFlipEditBottomSheet;

/* renamed from: X.4gP  reason: invalid class name and case insensitive filesystem */
public class C91884gP implements AnonymousClass86N {
    public final int A00;
    public final Object A01;

    public C91884gP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BpX(C136836uU r4, int i) {
        Resources resources;
        int i2;
        int i3;
        String string;
        C38391rD r1;
        switch (this.A00) {
            case 0:
                C38391rD r12 = ((ViewPager2) this.A01).A04.A0B;
                C18070vi.A0z(r12, "null cannot be cast to non-null type com.whatsapp.gallery.GalleryTabsPagerAdapter");
                C113825np r13 = (C113825np) r12;
                if (i == 0) {
                    resources = r13.A01;
                    i2 = 2131890635;
                    break;
                } else if (i == 1) {
                    resources = r13.A01;
                    i2 = 2131890634;
                    break;
                } else {
                    throw AnonymousClass001.A13("Invalid item position: ", AnonymousClass000.A10(), i);
                }
            case 1:
                NewsletterInsightsActivity newsletterInsightsActivity = (NewsletterInsightsActivity) this.A01;
                AnonymousClass4VW r14 = (AnonymousClass4VW) AnonymousClass000.A0w(AnonymousClass3MW.A12(newsletterInsightsActivity.A0A), i);
                if (r14 != null) {
                    if (r14 instanceof AnonymousClass43Z) {
                        i3 = 2131892704;
                    } else if (r14 instanceof AnonymousClass43a) {
                        i3 = 2131892703;
                    } else {
                        i3 = 2131892702;
                    }
                    string = newsletterInsightsActivity.getString(i3);
                    break;
                } else {
                    return;
                }
            default:
                CoinFlipEditBottomSheet coinFlipEditBottomSheet = (CoinFlipEditBottomSheet) this.A01;
                ViewPager2 viewPager2 = coinFlipEditBottomSheet.A00;
                if (viewPager2 != null) {
                    r1 = viewPager2.A04.A0B;
                } else {
                    r1 = null;
                }
                C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.profile.coinflip.edit.CoinFlipEditTabAdapter");
                resources = AnonymousClass3MZ.A09(coinFlipEditBottomSheet);
                C18070vi.A0X(resources);
                if (i == 0) {
                    i2 = 2131888355;
                    break;
                } else if (i == 1) {
                    i2 = 2131888354;
                    break;
                } else {
                    throw AnonymousClass001.A13("Invalid item position: ", AnonymousClass000.A10(), i);
                }
        }
        string = AnonymousClass3MY.A0m(resources, i2);
        r4.A02(string);
    }
}
