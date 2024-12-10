package com.whatsapp.wds.components.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass4AH;
import X.AnonymousClass4AI;
import X.AnonymousClass6P4;
import X.AnonymousClass6Pf;
import X.AnonymousClass6UY;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C109005cf;
import X.C110745gz;
import X.C111225jD;
import X.C114365qe;
import X.C130506jX;
import X.C138946xx;
import X.C139436yq;
import X.C147977gh;
import X.C18070vi;
import X.C18090vk;
import X.C34691kv;
import X.C72453Mb;
import X.C72463Mc;
import X.C72483Me;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentContainerView;
import com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet;
import com.whatsapp.biz.catalog.view.variants.v2.TextVariantsBottomSheetV2;
import com.whatsapp.bot.home.AiHomePreviewBottomSheet;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;
import com.whatsapp.bot.onboarding.AiNotAvailableBottomSheet;
import com.whatsapp.companiondevice.SetDeviceNicknameFragment;
import com.whatsapp.contact.contactform.ContactFormBottomSheetFragment;
import com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.expression.stickers.StickerMakerChoiceBottomSheet;
import com.whatsapp.expressionstray.expression.stickers.funstickers.FunStickersNoticeBottomSheet;
import com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.mediacomposer.ui.bottomsheet.MediaQualitySettingsBottomSheetFragment;
import com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet;
import com.whatsapp.music.ui.MusicAttributionFragment;
import com.whatsapp.music.ui.MusicBaseBottomSheetFragment;
import com.whatsapp.music.ui.MusicBrowseFragment;
import com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet;
import com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet;
import com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet;
import com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesEuropeInfoBottomSheet;
import com.whatsapp.safetycheck.ui.SafetyCheckBottomSheet;
import com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment;
import com.whatsapp.stickers.info.bottomsheet.EditCustomStickerPackBottomSheet;
import com.whatsapp.stickers.info.bottomsheet.StickerAddToPackBottomSheet;
import com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet;
import com.whatsapp.usercontrol.view.UserControlBaseFragment;
import com.whatsapp.usercontrol.view.controls.UCOffersAndAnnouncementsFragment;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer;

public class WDSBottomSheetDialogFragment extends Hilt_WDSBottomSheetDialogFragment {
    public C34691kv A00;
    public C139436yq A01;
    public final C138946xx A02 = AnonymousClass6Pf.A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int A2F;
        C18070vi.A0d(layoutInflater, 0);
        if (!A2H().A01 || (A2F = A2F()) == 0) {
            return super.A1q(bundle, layoutInflater, viewGroup);
        }
        return layoutInflater.inflate(A2F, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        GradientDrawable gradientDrawable;
        C18070vi.A0d(view, 0);
        if (A2H().A01) {
            if (A2G().A06) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    Log.i("WDS: Cannot access parent to inflate bottom sheet handle. Please add it manually.");
                } else {
                    C72463Mc.A14(view, view.getPaddingLeft(), view.getPaddingTop() + AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131169341));
                    ViewGroup A0H = C108955ca.A0H(view.getParent());
                    if (!(A0H instanceof FragmentContainerView)) {
                        A16().inflate(2131627557, A0H, true);
                    }
                }
            }
            View A0L = C72463Mc.A0L(view);
            if (A2G().A00 != -1) {
                float f = (float) A2G().A00;
                Drawable background = A0L.getBackground();
                Drawable drawable = null;
                if (background != null) {
                    drawable = background.mutate();
                }
                if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
                    float[] fArr = new float[8];
                    fArr[0] = f;
                    fArr[1] = f;
                    C109005cf.A0Q(gradientDrawable, fArr, f);
                }
            }
            if (A2G().A02 != -1) {
                A0L.setMinimumHeight(A2G().A02);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C110745gz r1;
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (A2H().A01) {
            Dialog dialog = this.A03;
            if ((dialog instanceof C110745gz) && (r1 = (C110745gz) dialog) != null) {
                A0I(r1, this);
            }
        }
    }

    public void A23(boolean z) {
        C34691kv r1 = this.A00;
        if (r1 != null) {
            r1.A00(this, this.A0n, z);
            super.A23(z);
            return;
        }
        C18070vi.A11("fragmentPerfUtils");
        throw null;
    }

    public int A25() {
        if (this instanceof FcsBottomSheetBaseContainer) {
            return 2132083619;
        }
        if (this instanceof CountrySelectorBottomSheet) {
            return 2132084407;
        }
        if (this instanceof MusicBaseBottomSheetFragment) {
            return 2132083471;
        }
        if (this instanceof FlowsWebBottomSheetContainer) {
            return 2132083618;
        }
        if (this instanceof ContactFormBottomSheetFragment) {
            return 2132083130;
        }
        if (this instanceof SetDeviceNicknameFragment) {
            return 2132083971;
        }
        if (this instanceof AiImagineBottomSheet) {
            return 2132084404;
        }
        return 2132084406;
    }

    public int A2F() {
        if (this instanceof UCOffersAndAnnouncementsFragment) {
            return 2131627126;
        }
        if (this instanceof UserControlBaseFragment) {
            return 2131627284;
        }
        if (this instanceof StickerInfoBottomSheet) {
            return ((StickerInfoBottomSheet) this).A0W;
        }
        if (this instanceof StickerAddToPackBottomSheet) {
            return 2131627091;
        }
        if (this instanceof EditCustomStickerPackBottomSheet) {
            return 2131625156;
        }
        if (this instanceof SafetyCheckBottomSheet) {
            return 2131626762;
        }
        if (this instanceof NewsletterGuidelinesEuropeInfoBottomSheet) {
            return 2131626193;
        }
        if (this instanceof BrazilPaymentIncomeCollectionBottomSheet) {
            return 2131626367;
        }
        if (this instanceof MusicBrowseFragment) {
            return ((MusicBrowseFragment) this).A0A;
        }
        if (this instanceof MusicAttributionFragment) {
            return ((MusicAttributionFragment) this).A06;
        }
        if (this instanceof MetaAiVoiceInputBottomSheet) {
            return ((MetaAiVoiceInputBottomSheet) this).A0N;
        }
        if (this instanceof FunStickersNoticeBottomSheet) {
            return 2131625405;
        }
        if (this instanceof StickerMakerChoiceBottomSheet) {
            return ((StickerMakerChoiceBottomSheet) this).A00;
        }
        if (this instanceof SearchFunStickersBottomSheet) {
            return ((SearchFunStickersBottomSheet) this).A0T;
        }
        if (this instanceof SetDeviceNicknameFragment) {
            return 2131626891;
        }
        if (this instanceof AiNotAvailableBottomSheet) {
            return 2131624176;
        }
        if (this instanceof AiImagineBottomSheet) {
            return ((AiImagineBottomSheet) this).A0h;
        }
        if (this instanceof AiHomePreviewBottomSheet) {
            return ((AiHomePreviewBottomSheet) this).A07;
        }
        if (this instanceof TextVariantsBottomSheetV2) {
            return 2131627320;
        }
        if (this instanceof TextVariantsBottomSheet) {
            return 2131627319;
        }
        return 0;
    }

    public final C130506jX A2G() {
        C139436yq r0 = this.A01;
        if (r0 != null) {
            return r0.A00;
        }
        C18070vi.A11("builder");
        throw null;
    }

    public void A2I(C139436yq r4) {
        AnonymousClass6UY r0;
        if (this instanceof StickerInfoBottomSheet) {
            C18070vi.A0d(r4, 0);
        } else if (this instanceof StatusAudienceSelectorShareSheetFragment) {
            C18070vi.A0d(r4, 0);
            r4.A00.A01 = -1;
            return;
        } else {
            if (!(this instanceof NewsletterReactionsSheet)) {
                if (this instanceof CountrySelectorBottomSheet) {
                    C18070vi.A0d(r4, 0);
                    r4.A00(AnonymousClass4AI.A00);
                    r4.A00.A02 = C108965cb.A07().heightPixels / 2;
                    return;
                } else if (this instanceof MusicBrowseFragment) {
                    C72483Me.A13(r4);
                    return;
                } else if (this instanceof MetaAiVoiceInputBottomSheet) {
                    C18070vi.A0d(r4, 0);
                    r4.A01(true);
                } else if (!(this instanceof MediaQualitySettingsBottomSheetFragment)) {
                    if (this instanceof StickerMakerChoiceBottomSheet) {
                        C72453Mb.A1N(r4);
                        return;
                    } else if (this instanceof SearchFunStickersBottomSheet) {
                        C72483Me.A13(r4);
                        return;
                    } else if (this instanceof AiImagineBottomSheet) {
                        C72483Me.A13(r4);
                        return;
                    } else if (this instanceof AiHomePreviewBottomSheet) {
                        C72453Mb.A1N(r4);
                        return;
                    } else if (this instanceof TextVariantsBottomSheetV2) {
                        C18070vi.A0d(r4, 0);
                        r0 = AnonymousClass4AI.A00;
                        r4.A00(r0);
                    } else if (this instanceof TextVariantsBottomSheet) {
                        C72453Mb.A1N(r4);
                        r4.A00(new AnonymousClass6P4((C18090vk) null, (AnonymousClass1Y1) null, 1));
                        return;
                    } else {
                        return;
                    }
                }
            }
            C18070vi.A0d(r4, 0);
            r4.A00(AnonymousClass4AH.A00);
            r4.A01(true);
            return;
        }
        r0 = AnonymousClass4AH.A00;
        r4.A00(r0);
    }

    public boolean A2J() {
        if (!(this instanceof AiImagineBottomSheet)) {
            return false;
        }
        C111225jD r0 = ((AiImagineBottomSheet) this).A0J;
        if (r0 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        r0.A0U();
        return true;
    }

    public WDSBottomSheetDialogFragment(int i) {
        super(i);
    }

    public static final void A0I(C110745gz r2, WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment) {
        AnonymousClass6UY r1;
        boolean A1T = AnonymousClass000.A1T(C72453Mb.A08(wDSBottomSheetDialogFragment.A1D()), 2);
        C130506jX A2G = wDSBottomSheetDialogFragment.A2G();
        if (A1T) {
            r1 = A2G.A05;
        } else {
            r1 = A2G.A04;
        }
        View findViewById = r2.findViewById(2131429948);
        if (findViewById != null) {
            r1.A00(findViewById);
        }
    }

    public void A1z(Bundle bundle) {
        int i;
        super.A1z(bundle);
        if (A2H().A01) {
            Context A14 = A14();
            Resources A09 = AnonymousClass3MZ.A09(this);
            C18070vi.A0X(A09);
            int A25 = A25();
            Resources.Theme newTheme = A09.newTheme();
            newTheme.applyStyle(A25, true);
            TypedValue typedValue = new TypedValue();
            if (newTheme.resolveAttribute(2130968836, typedValue, true)) {
                i = typedValue.resourceId;
            } else {
                i = 2132084435;
            }
            this.A01 = new C139436yq(A14, i);
            C138946xx A2H = A2H();
            Resources A092 = AnonymousClass3MZ.A09(this);
            C18070vi.A0X(A092);
            C139436yq r0 = this.A01;
            if (r0 != null) {
                A2H.A01(A092, r0);
                C139436yq r02 = this.A01;
                if (r02 != null) {
                    A2I(r02);
                    return;
                }
            }
            C18070vi.A11("builder");
            throw null;
        }
    }

    public Dialog A27(Bundle bundle) {
        C147977gh r3;
        Window window;
        if (!A2H().A01) {
            return super.A27(bundle);
        }
        if (A2H().A00) {
            r3 = C108945cZ.A1K(this, 38);
        } else {
            r3 = null;
        }
        C114365qe r2 = new C114365qe(A14(), this, r3, A25());
        if (!A2H().A00) {
            if (r2.A01 == null) {
                C110745gz.A02(r2);
            }
            r2.A01.A0D = A2G().A01;
        }
        if (!(A2G().A03 == -1 || (window = r2.getWindow()) == null)) {
            window.setBackgroundDrawableResource(A2G().A03);
        }
        return r2;
    }

    public C138946xx A2H() {
        return this.A02;
    }

    public WDSBottomSheetDialogFragment() {
    }
}
