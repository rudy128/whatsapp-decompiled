package X;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;
import com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingActivity;
import com.whatsapp.gallery.GalleryRecentsFragment;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5nr  reason: invalid class name and case insensitive filesystem */
public class C113845nr extends C6T {
    public final int A00;
    public final Object A01;

    public C113845nr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00(int i) {
        switch (this.A00) {
            case 0:
                if (i == 1) {
                    C111225jD r1 = ((AiImagineBottomSheet) this.A01).A0J;
                    if (r1 == null) {
                        AnonymousClass3MW.A1H();
                        throw null;
                    } else {
                        r1.A0A = true;
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                return;
            case 2:
                GalleryTabHostFragment galleryTabHostFragment = (GalleryTabHostFragment) this.A01;
                boolean z = false;
                if (i != 0) {
                    z = true;
                    if (i != 1) {
                        z = galleryTabHostFragment.A0f;
                    }
                }
                galleryTabHostFragment.A0f = z;
                return;
            default:
                super.A00(i);
                return;
        }
    }

    public void A01(int i) {
        C127036dh r1;
        String str;
        Integer A002;
        switch (this.A00) {
            case 0:
                AiImagineBottomSheet aiImagineBottomSheet = (AiImagineBottomSheet) this.A01;
                C111225jD r0 = aiImagineBottomSheet.A0J;
                if (r0 == null) {
                    C18070vi.A11("viewModel");
                    throw null;
                }
                List A10 = AnonymousClass3MW.A10(r0.A0T);
                if (A10 != null) {
                    r1 = (C127036dh) A10.get(i);
                } else {
                    r1 = null;
                }
                C111225jD r02 = aiImagineBottomSheet.A0J;
                if (r02 == null) {
                    C18070vi.A11("viewModel");
                    throw null;
                } else {
                    r02.A0W(r1);
                    return;
                }
            case 1:
                C010105w r03 = ((ImagineMeOnboardingActivity) this.A01).A00;
                if (r03 != null) {
                    r03.dismiss();
                    return;
                }
                return;
            case 2:
                GalleryTabHostFragment galleryTabHostFragment = (GalleryTabHostFragment) this.A01;
                if (!GalleryTabHostFragment.A0q(galleryTabHostFragment)) {
                    C18100vl r7 = galleryTabHostFragment.A0n;
                    Number A1C = C108945cZ.A1C(((GalleryPickerViewModel) r7.getValue()).A09);
                    if ((A1C == null || A1C.intValue() != i) && !galleryTabHostFragment.A0b && (A002 = GalleryPickerViewModel.A00(r7)) != null) {
                        int intValue = A002.intValue();
                        C20050A4v A0b = C108985cd.A0b(galleryTabHostFragment);
                        int i2 = 1;
                        if (galleryTabHostFragment.A0f) {
                            i2 = 6;
                        }
                        int i3 = 63;
                        if (i == 1) {
                            i3 = 62;
                        }
                        C108955ca.A1Q(A0b, i3, i2, intValue);
                    }
                    AnonymousClass3MX.A1J(((GalleryPickerViewModel) r7.getValue()).A09, i);
                    galleryTabHostFragment.A0b = false;
                    GalleryTabHostFragment.A0I(galleryTabHostFragment);
                    Toolbar toolbar = galleryTabHostFragment.A02;
                    if (toolbar != null) {
                        Bundle bundle = galleryTabHostFragment.A06;
                        if (bundle != null) {
                            str = bundle.getString("gallery_picker_title");
                        } else {
                            str = null;
                        }
                        toolbar.setTitle((CharSequence) str);
                    }
                    GalleryTabHostFragment.A0J(galleryTabHostFragment, i);
                    return;
                }
                ViewPager2 viewPager2 = galleryTabHostFragment.A04;
                if (viewPager2 != null) {
                    viewPager2.setUserInputEnabled(false);
                }
                if (galleryTabHostFragment.A0d) {
                    List A04 = galleryTabHostFragment.A1E().A0U.A04();
                    ArrayList A0t = C108965cb.A0t(A04);
                    for (Object next : A04) {
                        if (next instanceof GalleryRecentsFragment) {
                            A0t.add(next);
                        }
                    }
                    GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) C29431cG.A0c(A0t);
                    if (galleryRecentsFragment != null) {
                        AnonymousClass7DY A05 = GalleryTabHostFragment.A05(galleryTabHostFragment);
                        galleryRecentsFragment.A02 = galleryTabHostFragment;
                        galleryRecentsFragment.A00 = A05;
                    }
                    galleryTabHostFragment.A0d = false;
                    return;
                }
                return;
            case 3:
                C111205iq r04 = ((NewsletterReactionsSheet) this.A01).A09;
                if (r04 == null) {
                    AnonymousClass3MW.A1H();
                    throw null;
                } else {
                    r04.A0T(i);
                    return;
                }
            default:
                AnonymousClass6KQ r4 = (AnonymousClass6KQ) this.A01;
                List list = C42011xT.A0I;
                r4.A04.notifyAllObservers(new AnonymousClass7KP(AnonymousClass000.A1P(i), 3));
                r4.A05.BwL(i);
                return;
        }
    }

    public void A02(int i, float f, int i2) {
        if (1 - this.A00 != 0) {
            super.A02(i, f, i2);
        }
    }
}
