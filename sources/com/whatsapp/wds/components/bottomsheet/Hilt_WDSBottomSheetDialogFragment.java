package com.whatsapp.wds.components.bottomsheet;

import X.AnonymousClass009;
import X.AnonymousClass040;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass12E;
import X.AnonymousClass195;
import X.AnonymousClass1D9;
import X.AnonymousClass1K1;
import X.AnonymousClass1L2;
import X.AnonymousClass1R2;
import X.AnonymousClass1RK;
import X.AnonymousClass1UN;
import X.AnonymousClass2LK;
import X.AnonymousClass2YI;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4JA;
import X.AnonymousClass6a5;
import X.AnonymousClass6a7;
import X.AnonymousClass733;
import X.AnonymousClass73Z;
import X.AnonymousClass759;
import X.AnonymousClass7AN;
import X.BD4;
import X.C000200d;
import X.C008703w;
import X.C008803x;
import X.C008903z;
import X.C108965cb;
import X.C108975cc;
import X.C108995ce;
import X.C124876a8;
import X.C124916aC;
import X.C124946aF;
import X.C125016aM;
import X.C127086dm;
import X.C131286kq;
import X.C131346kw;
import X.C138056wS;
import X.C1411674o;
import X.C17880vN;
import X.C18600wl;
import X.C21466AkX;
import X.C24051Ir;
import X.C25811Ps;
import X.C26431Sc;
import X.C27011Uj;
import X.C34511kb;
import X.C34591kk;
import X.C35761ml;
import X.C36241nZ;
import X.C37301pI;
import X.C37311pJ;
import X.C38541rS;
import X.C51112Xa;
import X.C57642jP;
import X.C678831f;
import X.C72453Mb;
import X.C72483Me;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.whatsapp.biz.catalog.view.variants.Hilt_TextVariantsBottomSheet;
import com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet;
import com.whatsapp.biz.catalog.view.variants.v2.Hilt_TextVariantsBottomSheetV2;
import com.whatsapp.biz.catalog.view.variants.v2.TextVariantsBottomSheetV2;
import com.whatsapp.bot.home.AiHomePreviewBottomSheet;
import com.whatsapp.bot.home.Hilt_AiHomePreviewBottomSheet;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;
import com.whatsapp.bot.metaai.imagine.Hilt_AiImagineBottomSheet;
import com.whatsapp.bot.onboarding.Hilt_AiNotAvailableBottomSheet;
import com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet;
import com.whatsapp.calling.calllink.view.Hilt_CreateCallLinkBottomSheet;
import com.whatsapp.chatinfo.view.custom.CreatorPrivacyNewsletterBottomSheet;
import com.whatsapp.chatinfo.view.custom.Hilt_CreatorPrivacyNewsletterBottomSheet;
import com.whatsapp.chatinfo.view.custom.Hilt_PhoneNumberHiddenInNewsletterBottomSheet;
import com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInNewsletterBottomSheet;
import com.whatsapp.companiondevice.Hilt_SetDeviceNicknameFragment;
import com.whatsapp.companiondevice.SetDeviceNicknameFragment;
import com.whatsapp.contact.contactform.ContactFormBottomSheetFragment;
import com.whatsapp.contact.contactform.Hilt_ContactFormBottomSheetFragment;
import com.whatsapp.expressionstray.expression.stickers.Hilt_SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.expression.stickers.funstickers.FunStickersNoticeBottomSheet;
import com.whatsapp.expressionstray.expression.stickers.funstickers.Hilt_FunStickersNoticeBottomSheet;
import com.whatsapp.flows.phoenix.view.Hilt_PhoenixFlowsBottomSheetContainer;
import com.whatsapp.flows.phoenix.view.PhoenixFlowsBottomSheetContainer;
import com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.flows.webview.view.Hilt_FlowsWebBottomSheetContainer;
import com.whatsapp.identity.Hilt_CompareNumberBottomSheet;
import com.whatsapp.mediacomposer.ui.bottomsheet.Hilt_ImageQualitySettingsBottomSheetFragment;
import com.whatsapp.mediacomposer.ui.bottomsheet.Hilt_VideoQualitySettingsBottomSheetFragment;
import com.whatsapp.mediacomposer.ui.bottomsheet.ImageQualitySettingsBottomSheetFragment;
import com.whatsapp.mediacomposer.ui.bottomsheet.VideoQualitySettingsBottomSheetFragment;
import com.whatsapp.metaai.voice.ui.Hilt_MetaAiVoiceInputBottomSheet;
import com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet;
import com.whatsapp.music.ui.Hilt_MusicAttributionFragment;
import com.whatsapp.music.ui.Hilt_MusicBrowseFragment;
import com.whatsapp.music.ui.MusicAttributionFragment;
import com.whatsapp.music.ui.MusicBrowseFragment;
import com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet;
import com.whatsapp.newsletter.ui.directory.filter.country.Hilt_CountrySelectorBottomSheet;
import com.whatsapp.newsletter.ui.reactions.Hilt_NewsletterReactionsSheet;
import com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet;
import com.whatsapp.payments.pix.ui.FoundPixQrCodeBottomSheet;
import com.whatsapp.payments.pix.ui.Hilt_FoundPixQrCodeBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet;
import com.whatsapp.payments.ui.Hilt_BrazilPaymentIncomeCollectionBottomSheet;
import com.whatsapp.safetycheck.ui.Hilt_SafetyCheckBottomSheet;
import com.whatsapp.safetycheck.ui.SafetyCheckBottomSheet;
import com.whatsapp.status.audienceselector.sharesheet.Hilt_StatusAudienceSelectorShareSheetFragment;
import com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment;
import com.whatsapp.stickers.info.bottomsheet.EditCustomStickerPackBottomSheet;
import com.whatsapp.stickers.info.bottomsheet.Hilt_EditCustomStickerPackBottomSheet;
import com.whatsapp.stickers.info.bottomsheet.Hilt_StickerAddToPackBottomSheet;
import com.whatsapp.stickers.info.bottomsheet.Hilt_StickerInfoBottomSheet;
import com.whatsapp.stickers.info.bottomsheet.StickerAddToPackBottomSheet;
import com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet;
import com.whatsapp.thunderstorm.Hilt_ThunderstormReceiverBottomsheet;
import com.whatsapp.thunderstorm.ThunderstormReceiverBottomsheet;
import com.whatsapp.usercontrol.view.Hilt_UserControlBaseFragment;
import com.whatsapp.usercontrol.view.UserControlBaseFragment;
import com.whatsapp.usercontrol.view.controls.Hilt_UCOffersAndAnnouncementsFragment;
import com.whatsapp.usercontrol.view.controls.UCOffersAndAnnouncementsFragment;
import com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer;
import com.whatsapp.wabloks.ui.Hilt_FcsBottomSheetBaseContainer;

public abstract class Hilt_WDSBottomSheetDialogFragment extends BottomSheetDialogFragment implements AnonymousClass009 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = C17880vN.A0p();
    public volatile C008803x A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1p(android.app.Activity r3) {
        /*
            r2 = this;
            r0 = 1
            r2.A0X = r0
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C008803x.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.AnonymousClass3MY.A1Z(r0)
            r2.A05()
            r2.A2E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.bottomsheet.Hilt_WDSBottomSheetDialogFragment.A1p(android.app.Activity):void");
    }

    private void A05() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    /* JADX WARNING: type inference failed for: r0v44, types: [X.6l9, java.lang.Object] */
    public void A2E() {
        if (this instanceof Hilt_UCOffersAndAnnouncementsFragment) {
            Hilt_UCOffersAndAnnouncementsFragment hilt_UCOffersAndAnnouncementsFragment = (Hilt_UCOffersAndAnnouncementsFragment) this;
            if (!hilt_UCOffersAndAnnouncementsFragment.A00) {
                hilt_UCOffersAndAnnouncementsFragment.A00 = true;
                C008903z A0S = AnonymousClass3MX.A0S(hilt_UCOffersAndAnnouncementsFragment);
                UCOffersAndAnnouncementsFragment uCOffersAndAnnouncementsFragment = (UCOffersAndAnnouncementsFragment) hilt_UCOffersAndAnnouncementsFragment;
                AnonymousClass10E r0 = ((C36241nZ) A0S).A2Q;
                C108965cb.A16(r0, uCOffersAndAnnouncementsFragment);
                uCOffersAndAnnouncementsFragment.A02 = (C35761ml) r0.Als.get();
            }
        } else if (this instanceof Hilt_UserControlBaseFragment) {
            Hilt_UserControlBaseFragment hilt_UserControlBaseFragment = (Hilt_UserControlBaseFragment) this;
            if (!hilt_UserControlBaseFragment.A00) {
                hilt_UserControlBaseFragment.A00 = true;
                C008903z A0S2 = AnonymousClass3MX.A0S(hilt_UserControlBaseFragment);
                UserControlBaseFragment userControlBaseFragment = (UserControlBaseFragment) hilt_UserControlBaseFragment;
                C36241nZ r2 = (C36241nZ) A0S2;
                AnonymousClass10E r1 = r2.A2Q;
                userControlBaseFragment.A05 = C108995ce.A0O(r1, r1.A00, userControlBaseFragment);
                userControlBaseFragment.A09 = AnonymousClass3MZ.A1B(r1);
                userControlBaseFragment.A06 = (C138056wS) r2.A2O.A5y.get();
                userControlBaseFragment.A04 = (C35761ml) r1.Als.get();
            }
        } else if (this instanceof Hilt_ThunderstormReceiverBottomsheet) {
            Hilt_ThunderstormReceiverBottomsheet hilt_ThunderstormReceiverBottomsheet = (Hilt_ThunderstormReceiverBottomsheet) this;
            if (!hilt_ThunderstormReceiverBottomsheet.A00) {
                hilt_ThunderstormReceiverBottomsheet.A00 = true;
                C008903z A0S3 = AnonymousClass3MX.A0S(hilt_ThunderstormReceiverBottomsheet);
                ThunderstormReceiverBottomsheet thunderstormReceiverBottomsheet = (ThunderstormReceiverBottomsheet) hilt_ThunderstormReceiverBottomsheet;
                AnonymousClass10E r02 = ((C36241nZ) A0S3).A2Q;
                C108965cb.A16(r02, thunderstormReceiverBottomsheet);
                thunderstormReceiverBottomsheet.A00 = AnonymousClass10E.A6Q(r02);
            }
        } else if (this instanceof Hilt_StickerInfoBottomSheet) {
            Hilt_StickerInfoBottomSheet hilt_StickerInfoBottomSheet = (Hilt_StickerInfoBottomSheet) this;
            if (!hilt_StickerInfoBottomSheet.A00) {
                hilt_StickerInfoBottomSheet.A00 = true;
                C008903z A0S4 = AnonymousClass3MX.A0S(hilt_StickerInfoBottomSheet);
                StickerInfoBottomSheet stickerInfoBottomSheet = (StickerInfoBottomSheet) hilt_StickerInfoBottomSheet;
                C36241nZ r4 = (C36241nZ) A0S4;
                AnonymousClass10E r22 = r4.A2Q;
                AnonymousClass10G r3 = r22.A00;
                stickerInfoBottomSheet.A03 = C108995ce.A0O(r22, r3, stickerInfoBottomSheet);
                stickerInfoBottomSheet.A0B = C000200d.A00(r22.A0E);
                stickerInfoBottomSheet.A0C = C000200d.A00(r4.A2O.A09);
                stickerInfoBottomSheet.A0D = C000200d.A00(r22.A0V);
                stickerInfoBottomSheet.A0E = C000200d.A00(r22.ADx);
                stickerInfoBottomSheet.A0F = C000200d.A00(r22.ADy);
                stickerInfoBottomSheet.A0G = C000200d.A00(r3.A8n);
                stickerInfoBottomSheet.A0H = C108965cb.A0j(r3);
                stickerInfoBottomSheet.A0I = AnonymousClass3MX.A12(r22);
                stickerInfoBottomSheet.A0J = C000200d.A00(r22.A4b);
                stickerInfoBottomSheet.A0K = C000200d.A00(r22.AAO);
                stickerInfoBottomSheet.A0L = C000200d.A00(r3.AHj);
                stickerInfoBottomSheet.A0M = C000200d.A00(r3.AHl);
                stickerInfoBottomSheet.A0N = C000200d.A00(r22.Ak2);
                stickerInfoBottomSheet.A0O = C000200d.A00(r22.AAv);
                stickerInfoBottomSheet.A0P = AnonymousClass3MW.A0s(r22);
                stickerInfoBottomSheet.A0Q = C000200d.A00(r22.AC1);
                stickerInfoBottomSheet.A02 = AnonymousClass10E.A6Q(r22);
            }
        } else if (this instanceof Hilt_StickerAddToPackBottomSheet) {
            Hilt_StickerAddToPackBottomSheet hilt_StickerAddToPackBottomSheet = (Hilt_StickerAddToPackBottomSheet) this;
            if (!hilt_StickerAddToPackBottomSheet.A00) {
                hilt_StickerAddToPackBottomSheet.A00 = true;
                C008903z A0S5 = AnonymousClass3MX.A0S(hilt_StickerAddToPackBottomSheet);
                StickerAddToPackBottomSheet stickerAddToPackBottomSheet = (StickerAddToPackBottomSheet) hilt_StickerAddToPackBottomSheet;
                AnonymousClass10E r32 = ((C36241nZ) A0S5).A2Q;
                AnonymousClass10G r12 = r32.A00;
                stickerAddToPackBottomSheet.A00 = AnonymousClass10G.A8i(r12);
                stickerAddToPackBottomSheet.A00 = C000200d.A00(r12.A8n);
                stickerAddToPackBottomSheet.A01 = C000200d.A00(r32.A4b);
                stickerAddToPackBottomSheet.A02 = C000200d.A00(r32.AAR);
                stickerAddToPackBottomSheet.A03 = C000200d.A00(r32.AAS);
                stickerAddToPackBottomSheet.A04 = C000200d.A00(r32.AC1);
                stickerAddToPackBottomSheet.A05 = C000200d.A00(r32.ABz);
            }
        } else if (this instanceof Hilt_EditCustomStickerPackBottomSheet) {
            Hilt_EditCustomStickerPackBottomSheet hilt_EditCustomStickerPackBottomSheet = (Hilt_EditCustomStickerPackBottomSheet) this;
            if (!hilt_EditCustomStickerPackBottomSheet.A00) {
                hilt_EditCustomStickerPackBottomSheet.A00 = true;
                C008903z A0S6 = AnonymousClass3MX.A0S(hilt_EditCustomStickerPackBottomSheet);
                EditCustomStickerPackBottomSheet editCustomStickerPackBottomSheet = (EditCustomStickerPackBottomSheet) hilt_EditCustomStickerPackBottomSheet;
                C36241nZ r33 = (C36241nZ) A0S6;
                AnonymousClass10E r23 = r33.A2Q;
                editCustomStickerPackBottomSheet.A00 = C108995ce.A0O(r23, r23.A00, editCustomStickerPackBottomSheet);
                editCustomStickerPackBottomSheet.A04 = C000200d.A00(r23.A4b);
                editCustomStickerPackBottomSheet.A05 = C000200d.A00(r23.AAO);
                editCustomStickerPackBottomSheet.A01 = (AnonymousClass2LK) r23.AAP.get();
                editCustomStickerPackBottomSheet.A06 = C000200d.A00(r23.AAR);
                editCustomStickerPackBottomSheet.A07 = C000200d.A00(r23.AAS);
                editCustomStickerPackBottomSheet.A08 = C000200d.A00(r33.A1c);
                editCustomStickerPackBottomSheet.A09 = C000200d.A00(r23.AC1);
                editCustomStickerPackBottomSheet.A0A = C000200d.A00(r23.ABz);
            }
        } else if (this instanceof Hilt_StatusAudienceSelectorShareSheetFragment) {
            Hilt_StatusAudienceSelectorShareSheetFragment hilt_StatusAudienceSelectorShareSheetFragment = (Hilt_StatusAudienceSelectorShareSheetFragment) this;
            if (!hilt_StatusAudienceSelectorShareSheetFragment.A00) {
                hilt_StatusAudienceSelectorShareSheetFragment.A00 = true;
                C008903z A0S7 = AnonymousClass3MX.A0S(hilt_StatusAudienceSelectorShareSheetFragment);
                StatusAudienceSelectorShareSheetFragment statusAudienceSelectorShareSheetFragment = (StatusAudienceSelectorShareSheetFragment) hilt_StatusAudienceSelectorShareSheetFragment;
                C36241nZ r42 = (C36241nZ) A0S7;
                AnonymousClass10E r24 = r42.A2Q;
                AnonymousClass10G r34 = r24.A00;
                statusAudienceSelectorShareSheetFragment.A00 = AnonymousClass10G.A8i(r34);
                statusAudienceSelectorShareSheetFragment.A0J = C000200d.A00(r24.A4L);
                statusAudienceSelectorShareSheetFragment.A07 = (C125016aM) r42.A13.get();
                statusAudienceSelectorShareSheetFragment.A0E = C36241nZ.A0i(r42);
                statusAudienceSelectorShareSheetFragment.A0K = C000200d.A00(r24.A9u);
                statusAudienceSelectorShareSheetFragment.A0L = C000200d.A00(r34.A4e);
                statusAudienceSelectorShareSheetFragment.A0M = C000200d.A00(r34.AHX);
                statusAudienceSelectorShareSheetFragment.A0D = C108965cb.A0X(r24);
                statusAudienceSelectorShareSheetFragment.A0N = C000200d.A00(r24.AAL);
            }
        } else if (this instanceof Hilt_SafetyCheckBottomSheet) {
            Hilt_SafetyCheckBottomSheet hilt_SafetyCheckBottomSheet = (Hilt_SafetyCheckBottomSheet) this;
            if (!hilt_SafetyCheckBottomSheet.A00) {
                hilt_SafetyCheckBottomSheet.A00 = true;
                C008903z A0S8 = AnonymousClass3MX.A0S(hilt_SafetyCheckBottomSheet);
                SafetyCheckBottomSheet safetyCheckBottomSheet = (SafetyCheckBottomSheet) hilt_SafetyCheckBottomSheet;
                C36241nZ r35 = (C36241nZ) A0S8;
                AnonymousClass10E r25 = r35.A2Q;
                safetyCheckBottomSheet.A0A = C108995ce.A0O(r25, r25.A00, safetyCheckBottomSheet);
                safetyCheckBottomSheet.A08 = AnonymousClass3Ma.A0d(r25);
                safetyCheckBottomSheet.A01 = (C34511kb) r25.A2L.get();
                safetyCheckBottomSheet.A02 = AnonymousClass10E.A4z(r25);
                safetyCheckBottomSheet.A04 = AnonymousClass3MZ.A0i(r25);
                safetyCheckBottomSheet.A05 = AnonymousClass3Ma.A0T(r25);
                safetyCheckBottomSheet.A0E = (C38541rS) r25.A5j.get();
                safetyCheckBottomSheet.A06 = AnonymousClass10E.A6O(r25);
                safetyCheckBottomSheet.A09 = (C34591kk) r25.AB5.get();
                safetyCheckBottomSheet.A00 = (C124946aF) r35.A0v.get();
                safetyCheckBottomSheet.A03 = AnonymousClass3MZ.A0g(r25);
                safetyCheckBottomSheet.A0B = AnonymousClass3MY.A0Z(r25);
                safetyCheckBottomSheet.A0F = AnonymousClass10E.AL1(r25);
                safetyCheckBottomSheet.A07 = AnonymousClass10E.A6Q(r25);
            }
        } else if (this instanceof Hilt_BrazilPaymentIncomeCollectionBottomSheet) {
            Hilt_BrazilPaymentIncomeCollectionBottomSheet hilt_BrazilPaymentIncomeCollectionBottomSheet = (Hilt_BrazilPaymentIncomeCollectionBottomSheet) this;
            if (!hilt_BrazilPaymentIncomeCollectionBottomSheet.A00) {
                hilt_BrazilPaymentIncomeCollectionBottomSheet.A00 = true;
                C008903z A0S9 = AnonymousClass3MX.A0S(hilt_BrazilPaymentIncomeCollectionBottomSheet);
                BrazilPaymentIncomeCollectionBottomSheet brazilPaymentIncomeCollectionBottomSheet = (BrazilPaymentIncomeCollectionBottomSheet) hilt_BrazilPaymentIncomeCollectionBottomSheet;
                AnonymousClass10E r03 = ((C36241nZ) A0S9).A2Q;
                C108965cb.A16(r03, brazilPaymentIncomeCollectionBottomSheet);
                brazilPaymentIncomeCollectionBottomSheet.A03 = (AnonymousClass1R2) r03.A8L.get();
            }
        } else if (this instanceof Hilt_FoundPixQrCodeBottomSheet) {
            Hilt_FoundPixQrCodeBottomSheet hilt_FoundPixQrCodeBottomSheet = (Hilt_FoundPixQrCodeBottomSheet) this;
            if (!hilt_FoundPixQrCodeBottomSheet.A00) {
                hilt_FoundPixQrCodeBottomSheet.A00 = true;
                C008903z A0S10 = AnonymousClass3MX.A0S(hilt_FoundPixQrCodeBottomSheet);
                FoundPixQrCodeBottomSheet foundPixQrCodeBottomSheet = (FoundPixQrCodeBottomSheet) hilt_FoundPixQrCodeBottomSheet;
                AnonymousClass10E r26 = ((C36241nZ) A0S10).A2Q;
                AnonymousClass10G r13 = r26.A00;
                foundPixQrCodeBottomSheet.A00 = AnonymousClass10G.A8i(r13);
                foundPixQrCodeBottomSheet.A02 = (BD4) r13.A0V.get();
                foundPixQrCodeBottomSheet.A00 = AnonymousClass3Ma.A0a(r26);
                foundPixQrCodeBottomSheet.A01 = AnonymousClass10E.A6Q(r26);
            }
        } else if (this instanceof Hilt_NewsletterReactionsSheet) {
            Hilt_NewsletterReactionsSheet hilt_NewsletterReactionsSheet = (Hilt_NewsletterReactionsSheet) this;
            if (!hilt_NewsletterReactionsSheet.A00) {
                hilt_NewsletterReactionsSheet.A00 = true;
                C008903z A0S11 = AnonymousClass3MX.A0S(hilt_NewsletterReactionsSheet);
                NewsletterReactionsSheet newsletterReactionsSheet = (NewsletterReactionsSheet) hilt_NewsletterReactionsSheet;
                C36241nZ r36 = (C36241nZ) A0S11;
                AnonymousClass10E r27 = r36.A2Q;
                AnonymousClass10G r14 = r27.A00;
                newsletterReactionsSheet.A00 = AnonymousClass10G.A8i(r14);
                newsletterReactionsSheet.A04 = AnonymousClass3MZ.A0N(r27);
                newsletterReactionsSheet.A0A = C000200d.A00(r14.A5n);
                newsletterReactionsSheet.A07 = AnonymousClass3MZ.A0i(r27);
                newsletterReactionsSheet.A0B = C000200d.A00(r27.A7C);
                newsletterReactionsSheet.A05 = (C124916aC) r36.A0r.get();
                newsletterReactionsSheet.A06 = AnonymousClass3MZ.A0g(r27);
                newsletterReactionsSheet.A08 = AnonymousClass10E.A6Q(r27);
            }
        } else if (this instanceof Hilt_CountrySelectorBottomSheet) {
            Hilt_CountrySelectorBottomSheet hilt_CountrySelectorBottomSheet = (Hilt_CountrySelectorBottomSheet) this;
            if (!hilt_CountrySelectorBottomSheet.A00) {
                hilt_CountrySelectorBottomSheet.A00 = true;
                C008903z A0S12 = AnonymousClass3MX.A0S(hilt_CountrySelectorBottomSheet);
                CountrySelectorBottomSheet countrySelectorBottomSheet = (CountrySelectorBottomSheet) hilt_CountrySelectorBottomSheet;
                AnonymousClass10E r15 = ((C36241nZ) A0S12).A2Q;
                countrySelectorBottomSheet.A02 = C108995ce.A0O(r15, r15.A00, countrySelectorBottomSheet);
                countrySelectorBottomSheet.A06 = C000200d.A00(r15.A7D);
            }
        } else if (this instanceof Hilt_MusicBrowseFragment) {
            Hilt_MusicBrowseFragment hilt_MusicBrowseFragment = (Hilt_MusicBrowseFragment) this;
            if (!hilt_MusicBrowseFragment.A00) {
                hilt_MusicBrowseFragment.A00 = true;
                C008903z A0S13 = AnonymousClass3MX.A0S(hilt_MusicBrowseFragment);
                MusicBrowseFragment musicBrowseFragment = (MusicBrowseFragment) hilt_MusicBrowseFragment;
                C36241nZ r37 = (C36241nZ) A0S13;
                AnonymousClass10E r28 = r37.A2Q;
                AnonymousClass10G r16 = r28.A00;
                musicBrowseFragment.A00 = AnonymousClass10G.A8i(r16);
                musicBrowseFragment.A03 = C000200d.A00(r16.A06);
                musicBrowseFragment.A04 = C000200d.A00(r28.A4b);
                musicBrowseFragment.A00 = (AnonymousClass6a7) r37.A0q.get();
                musicBrowseFragment.A05 = C000200d.A00(r37.A1N);
                musicBrowseFragment.A01 = (C124876a8) r37.A1J.get();
            }
        } else if (this instanceof Hilt_MusicAttributionFragment) {
            Hilt_MusicAttributionFragment hilt_MusicAttributionFragment = (Hilt_MusicAttributionFragment) this;
            if (!hilt_MusicAttributionFragment.A00) {
                hilt_MusicAttributionFragment.A00 = true;
                C008903z A0S14 = AnonymousClass3MX.A0S(hilt_MusicAttributionFragment);
                MusicAttributionFragment musicAttributionFragment = (MusicAttributionFragment) hilt_MusicAttributionFragment;
                AnonymousClass10E r17 = ((C36241nZ) A0S14).A2Q;
                C108965cb.A16(r17, musicAttributionFragment);
                musicAttributionFragment.A03 = C000200d.A00(r17.A4b);
                musicAttributionFragment.A04 = C000200d.A00(r17.A5h);
            }
        } else if (this instanceof Hilt_MetaAiVoiceInputBottomSheet) {
            Hilt_MetaAiVoiceInputBottomSheet hilt_MetaAiVoiceInputBottomSheet = (Hilt_MetaAiVoiceInputBottomSheet) this;
            if (!hilt_MetaAiVoiceInputBottomSheet.A00) {
                hilt_MetaAiVoiceInputBottomSheet.A00 = true;
                C008903z A0S15 = AnonymousClass3MX.A0S(hilt_MetaAiVoiceInputBottomSheet);
                MetaAiVoiceInputBottomSheet metaAiVoiceInputBottomSheet = (MetaAiVoiceInputBottomSheet) hilt_MetaAiVoiceInputBottomSheet;
                C36241nZ r18 = (C36241nZ) A0S15;
                AnonymousClass10E r38 = r18.A2Q;
                C108965cb.A16(r38, metaAiVoiceInputBottomSheet);
                metaAiVoiceInputBottomSheet.A00 = (AnonymousClass195) r38.A0L.get();
                metaAiVoiceInputBottomSheet.A08 = C000200d.A00(r38.A14);
                AnonymousClass1K1 r19 = r18.A2O;
                metaAiVoiceInputBottomSheet.A09 = C000200d.A00(r19.A4o);
                metaAiVoiceInputBottomSheet.A0A = C000200d.A00(r19.A4p);
                metaAiVoiceInputBottomSheet.A0B = C000200d.A00(r19.A4q);
                metaAiVoiceInputBottomSheet.A0C = C000200d.A00(r19.A4r);
                metaAiVoiceInputBottomSheet.A02 = AnonymousClass3Ma.A0a(r38);
                metaAiVoiceInputBottomSheet.A0D = C000200d.A00(r38.ABP);
                metaAiVoiceInputBottomSheet.A0E = AnonymousClass3MW.A0s(r38);
            }
        } else if (this instanceof Hilt_VideoQualitySettingsBottomSheetFragment) {
            Hilt_VideoQualitySettingsBottomSheetFragment hilt_VideoQualitySettingsBottomSheetFragment = (Hilt_VideoQualitySettingsBottomSheetFragment) this;
            if (!hilt_VideoQualitySettingsBottomSheetFragment.A00) {
                hilt_VideoQualitySettingsBottomSheetFragment.A00 = true;
                C008903z A0S16 = AnonymousClass3MX.A0S(hilt_VideoQualitySettingsBottomSheetFragment);
                VideoQualitySettingsBottomSheetFragment videoQualitySettingsBottomSheetFragment = (VideoQualitySettingsBottomSheetFragment) hilt_VideoQualitySettingsBottomSheetFragment;
                AnonymousClass10E r110 = ((C36241nZ) A0S16).A2Q;
                videoQualitySettingsBottomSheetFragment.A04 = C108995ce.A0O(r110, r110.A00, videoQualitySettingsBottomSheetFragment);
                videoQualitySettingsBottomSheetFragment.A02 = AnonymousClass10E.A12(r110);
                videoQualitySettingsBottomSheetFragment.A06 = C000200d.A00(r110.AVb);
                videoQualitySettingsBottomSheetFragment.A05 = AnonymousClass10E.AL1(r110);
                videoQualitySettingsBottomSheetFragment.A03 = AnonymousClass10E.A6Q(r110);
                videoQualitySettingsBottomSheetFragment.A00 = (C26431Sc) r110.AlU.get();
            }
        } else if (this instanceof Hilt_ImageQualitySettingsBottomSheetFragment) {
            Hilt_ImageQualitySettingsBottomSheetFragment hilt_ImageQualitySettingsBottomSheetFragment = (Hilt_ImageQualitySettingsBottomSheetFragment) this;
            if (!hilt_ImageQualitySettingsBottomSheetFragment.A00) {
                hilt_ImageQualitySettingsBottomSheetFragment.A00 = true;
                C008903z A0S17 = AnonymousClass3MX.A0S(hilt_ImageQualitySettingsBottomSheetFragment);
                ImageQualitySettingsBottomSheetFragment imageQualitySettingsBottomSheetFragment = (ImageQualitySettingsBottomSheetFragment) hilt_ImageQualitySettingsBottomSheetFragment;
                AnonymousClass10E r29 = ((C36241nZ) A0S17).A2Q;
                AnonymousClass10G r111 = r29.A00;
                imageQualitySettingsBottomSheetFragment.A04 = C108995ce.A0O(r29, r111, imageQualitySettingsBottomSheetFragment);
                imageQualitySettingsBottomSheetFragment.A02 = AnonymousClass10E.A12(r29);
                imageQualitySettingsBottomSheetFragment.A06 = C000200d.A00(r29.AVb);
                imageQualitySettingsBottomSheetFragment.A05 = AnonymousClass10E.AL1(r29);
                imageQualitySettingsBottomSheetFragment.A03 = AnonymousClass10E.A6Q(r29);
                imageQualitySettingsBottomSheetFragment.A00 = AnonymousClass3MY.A0N(r29);
                imageQualitySettingsBottomSheetFragment.A01 = C000200d.A00(r111.ACA);
            }
        } else if (this instanceof Hilt_CompareNumberBottomSheet) {
            Hilt_CompareNumberBottomSheet hilt_CompareNumberBottomSheet = (Hilt_CompareNumberBottomSheet) this;
            if (!hilt_CompareNumberBottomSheet.A00) {
                hilt_CompareNumberBottomSheet.A00 = true;
                hilt_CompareNumberBottomSheet.A00 = C72483Me.A0T(hilt_CompareNumberBottomSheet);
            }
        } else if (this instanceof Hilt_FlowsWebBottomSheetContainer) {
            Hilt_FlowsWebBottomSheetContainer hilt_FlowsWebBottomSheetContainer = (Hilt_FlowsWebBottomSheetContainer) this;
            if (!hilt_FlowsWebBottomSheetContainer.A00) {
                hilt_FlowsWebBottomSheetContainer.A00 = true;
                C008903z A0S18 = AnonymousClass3MX.A0S(hilt_FlowsWebBottomSheetContainer);
                FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = (FlowsWebBottomSheetContainer) hilt_FlowsWebBottomSheetContainer;
                C36241nZ r39 = (C36241nZ) A0S18;
                AnonymousClass10E r210 = r39.A2Q;
                flowsWebBottomSheetContainer.A09 = C108995ce.A0O(r210, r210.A00, flowsWebBottomSheetContainer);
                flowsWebBottomSheetContainer.A03 = AnonymousClass3MZ.A0N(r210);
                flowsWebBottomSheetContainer.A0F = C000200d.A00(r39.A02);
                flowsWebBottomSheetContainer.A0G = C000200d.A00(r210.A1p);
                flowsWebBottomSheetContainer.A0H = C000200d.A00(r210.A1s);
                flowsWebBottomSheetContainer.A08 = (AnonymousClass1RK) r210.A2R.get();
                flowsWebBottomSheetContainer.A04 = AnonymousClass3MZ.A0d(r210);
                flowsWebBottomSheetContainer.A0I = AnonymousClass3MX.A10(r210);
                flowsWebBottomSheetContainer.A07 = AnonymousClass3MZ.A0n(r210);
                flowsWebBottomSheetContainer.A0D = C108975cc.A0O(r210);
                flowsWebBottomSheetContainer.A0J = C000200d.A00(r210.ATr);
                flowsWebBottomSheetContainer.A0K = C000200d.A00(r39.A1A);
                flowsWebBottomSheetContainer.A0L = C000200d.A00(r210.AU0);
                flowsWebBottomSheetContainer.A0M = C000200d.A00(r210.AB2);
                flowsWebBottomSheetContainer.A05 = AnonymousClass3MZ.A0f(r210);
                flowsWebBottomSheetContainer.A0N = AnonymousClass3MW.A0s(r210);
                flowsWebBottomSheetContainer.A0E = AnonymousClass10E.AL1(r210);
                flowsWebBottomSheetContainer.A0O = C000200d.A00(r210.An4);
                flowsWebBottomSheetContainer.A06 = AnonymousClass10E.A6Q(r210);
            }
        } else if (this instanceof Hilt_FcsBottomSheetBaseContainer) {
            Hilt_FcsBottomSheetBaseContainer hilt_FcsBottomSheetBaseContainer = (Hilt_FcsBottomSheetBaseContainer) this;
            if (hilt_FcsBottomSheetBaseContainer instanceof Hilt_PhoenixFlowsBottomSheetContainer) {
                Hilt_PhoenixFlowsBottomSheetContainer hilt_PhoenixFlowsBottomSheetContainer = (Hilt_PhoenixFlowsBottomSheetContainer) hilt_FcsBottomSheetBaseContainer;
                if (!hilt_PhoenixFlowsBottomSheetContainer.A00) {
                    hilt_PhoenixFlowsBottomSheetContainer.A00 = true;
                    C008903z A0S19 = AnonymousClass3MX.A0S(hilt_PhoenixFlowsBottomSheetContainer);
                    PhoenixFlowsBottomSheetContainer phoenixFlowsBottomSheetContainer = (PhoenixFlowsBottomSheetContainer) hilt_PhoenixFlowsBottomSheetContainer;
                    C36241nZ r211 = (C36241nZ) A0S19;
                    AnonymousClass10E r112 = r211.A2Q;
                    C108965cb.A16(r112, phoenixFlowsBottomSheetContainer);
                    phoenixFlowsBottomSheetContainer.A0D = C000200d.A00(r211.A02);
                    phoenixFlowsBottomSheetContainer.A04 = AnonymousClass10E.A12(r112);
                    phoenixFlowsBottomSheetContainer.A0E = C000200d.A00(r211.A2O.A9f);
                    phoenixFlowsBottomSheetContainer.A0F = C000200d.A00(r112.AB2);
                    phoenixFlowsBottomSheetContainer.A09 = AnonymousClass10E.A6Q(r112);
                    phoenixFlowsBottomSheetContainer.A01 = AnonymousClass10E.A8r(r112);
                    phoenixFlowsBottomSheetContainer.A00 = AnonymousClass3MZ.A0N(r112);
                    phoenixFlowsBottomSheetContainer.A03 = C108975cc.A0O(r112);
                }
            } else if (!hilt_FcsBottomSheetBaseContainer.A00) {
                hilt_FcsBottomSheetBaseContainer.A00 = true;
                C008903z A0S20 = AnonymousClass3MX.A0S(hilt_FcsBottomSheetBaseContainer);
                FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = (FcsBottomSheetBaseContainer) hilt_FcsBottomSheetBaseContainer;
                C36241nZ r212 = (C36241nZ) A0S20;
                AnonymousClass10E r113 = r212.A2Q;
                C108965cb.A16(r113, fcsBottomSheetBaseContainer);
                fcsBottomSheetBaseContainer.A0D = C000200d.A00(r212.A02);
                fcsBottomSheetBaseContainer.A04 = AnonymousClass10E.A12(r113);
                fcsBottomSheetBaseContainer.A0E = C000200d.A00(r212.A2O.A9f);
                fcsBottomSheetBaseContainer.A0F = C000200d.A00(r113.AB2);
                fcsBottomSheetBaseContainer.A09 = AnonymousClass10E.A6Q(r113);
            }
        } else if (this instanceof Hilt_FunStickersNoticeBottomSheet) {
            Hilt_FunStickersNoticeBottomSheet hilt_FunStickersNoticeBottomSheet = (Hilt_FunStickersNoticeBottomSheet) this;
            if (!hilt_FunStickersNoticeBottomSheet.A00) {
                hilt_FunStickersNoticeBottomSheet.A00 = true;
                C008903z A0S21 = AnonymousClass3MX.A0S(hilt_FunStickersNoticeBottomSheet);
                FunStickersNoticeBottomSheet funStickersNoticeBottomSheet = (FunStickersNoticeBottomSheet) hilt_FunStickersNoticeBottomSheet;
                AnonymousClass10G r114 = ((C36241nZ) A0S21).A2Q.A00;
                funStickersNoticeBottomSheet.A00 = AnonymousClass10G.A8i(r114);
                funStickersNoticeBottomSheet.A00 = C000200d.A00(r114.ABR);
            }
        } else if (this instanceof Hilt_SearchFunStickersBottomSheet) {
            Hilt_SearchFunStickersBottomSheet hilt_SearchFunStickersBottomSheet = (Hilt_SearchFunStickersBottomSheet) this;
            if (!hilt_SearchFunStickersBottomSheet.A00) {
                hilt_SearchFunStickersBottomSheet.A00 = true;
                C008903z A0S22 = AnonymousClass3MX.A0S(hilt_SearchFunStickersBottomSheet);
                SearchFunStickersBottomSheet searchFunStickersBottomSheet = (SearchFunStickersBottomSheet) hilt_SearchFunStickersBottomSheet;
                C36241nZ r310 = (C36241nZ) A0S22;
                AnonymousClass10E r213 = r310.A2Q;
                AnonymousClass10G r115 = r213.A00;
                searchFunStickersBottomSheet.A0M = C108995ce.A0O(r213, r115, searchFunStickersBottomSheet);
                searchFunStickersBottomSheet.A0Q = C000200d.A00(r115.A2J);
                searchFunStickersBottomSheet.A09 = (AnonymousClass6a5) r310.A1Z.get();
                searchFunStickersBottomSheet.A0J = AnonymousClass3Ma.A0a(r213);
                searchFunStickersBottomSheet.A0K = AnonymousClass10E.A6O(r213);
            }
        } else if (this instanceof Hilt_ContactFormBottomSheetFragment) {
            Hilt_ContactFormBottomSheetFragment hilt_ContactFormBottomSheetFragment = (Hilt_ContactFormBottomSheetFragment) this;
            if (!hilt_ContactFormBottomSheetFragment.A00) {
                hilt_ContactFormBottomSheetFragment.A00 = true;
                C008903z A0S23 = AnonymousClass3MX.A0S(hilt_ContactFormBottomSheetFragment);
                ContactFormBottomSheetFragment contactFormBottomSheetFragment = (ContactFormBottomSheetFragment) hilt_ContactFormBottomSheetFragment;
                C36241nZ r311 = (C36241nZ) A0S23;
                AnonymousClass10E r214 = r311.A2Q;
                AnonymousClass10G r43 = r214.A00;
                contactFormBottomSheetFragment.A0P = C108995ce.A0O(r214, r43, contactFormBottomSheetFragment);
                contactFormBottomSheetFragment.A0U = C000200d.A00(r214.A0F);
                contactFormBottomSheetFragment.A0V = C000200d.A00(r214.A0x);
                contactFormBottomSheetFragment.A04 = AnonymousClass3MZ.A0d(r214);
                contactFormBottomSheetFragment.A0W = C000200d.A00(r214.A2b);
                AnonymousClass1K1 r312 = r311.A2O;
                contactFormBottomSheetFragment.A02 = (C131286kq) r312.A0i.get();
                contactFormBottomSheetFragment.A05 = AnonymousClass10E.A4z(r214);
                contactFormBottomSheetFragment.A0H = (C678831f) r43.A10.get();
                contactFormBottomSheetFragment.A0I = (AnonymousClass12E) r214.A2k.get();
                contactFormBottomSheetFragment.A06 = r214.A55();
                contactFormBottomSheetFragment.A07 = (C127086dm) r43.A8G.get();
                contactFormBottomSheetFragment.A00 = C72453Mb.A0b(r214);
                contactFormBottomSheetFragment.A0R = AnonymousClass3Ma.A0v(r214);
                contactFormBottomSheetFragment.A01 = AnonymousClass3MY.A0N(r214);
                contactFormBottomSheetFragment.A0N = AnonymousClass3Ma.A0f(r214);
                contactFormBottomSheetFragment.A03 = AnonymousClass10E.A12(r214);
                contactFormBottomSheetFragment.A0F = (AnonymousClass733) r43.A2s.get();
                contactFormBottomSheetFragment.A0X = C000200d.A00(r214.A6N);
                contactFormBottomSheetFragment.A0Y = C000200d.A00(r214.AaO);
                contactFormBottomSheetFragment.A0O = (AnonymousClass1UN) r214.A72.get();
                contactFormBottomSheetFragment.A0G = (C37311pJ) r312.A4y.get();
                contactFormBottomSheetFragment.A0S = (C37301pI) r43.A3I.get();
                contactFormBottomSheetFragment.A0Z = C000200d.A00(r312.A5n);
                contactFormBottomSheetFragment.A0J = AnonymousClass3Ma.A0a(r214);
                contactFormBottomSheetFragment.A0Q = AnonymousClass3MY.A0Z(r214);
                contactFormBottomSheetFragment.A0K = AnonymousClass3Ma.A0b(r214);
                contactFormBottomSheetFragment.A0L = AnonymousClass3Ma.A0c(r214);
                contactFormBottomSheetFragment.A0T = AnonymousClass10E.AL1(r214);
                contactFormBottomSheetFragment.A0M = AnonymousClass10E.A6Q(r214);
            }
        } else if (this instanceof Hilt_SetDeviceNicknameFragment) {
            Hilt_SetDeviceNicknameFragment hilt_SetDeviceNicknameFragment = (Hilt_SetDeviceNicknameFragment) this;
            if (!hilt_SetDeviceNicknameFragment.A00) {
                hilt_SetDeviceNicknameFragment.A00 = true;
                C008903z A0S24 = AnonymousClass3MX.A0S(hilt_SetDeviceNicknameFragment);
                SetDeviceNicknameFragment setDeviceNicknameFragment = (SetDeviceNicknameFragment) hilt_SetDeviceNicknameFragment;
                AnonymousClass10E r215 = ((C36241nZ) A0S24).A2Q;
                AnonymousClass10G r116 = r215.A00;
                setDeviceNicknameFragment.A04 = C108995ce.A0O(r215, r116, setDeviceNicknameFragment);
                setDeviceNicknameFragment.A03 = AnonymousClass3Ma.A0f(r215);
                setDeviceNicknameFragment.A02 = (AnonymousClass1L2) r116.A40.get();
                setDeviceNicknameFragment.A05 = AnonymousClass3Ma.A0r(r215);
                setDeviceNicknameFragment.A06 = C000200d.A00(r215.AA1);
                setDeviceNicknameFragment.A00 = AnonymousClass3Ma.A0a(r215);
                setDeviceNicknameFragment.A01 = AnonymousClass10E.A6Q(r215);
            }
        } else if (this instanceof Hilt_PhoneNumberHiddenInNewsletterBottomSheet) {
            Hilt_PhoneNumberHiddenInNewsletterBottomSheet hilt_PhoneNumberHiddenInNewsletterBottomSheet = (Hilt_PhoneNumberHiddenInNewsletterBottomSheet) this;
            if (hilt_PhoneNumberHiddenInNewsletterBottomSheet instanceof Hilt_CreatorPrivacyNewsletterBottomSheet) {
                Hilt_CreatorPrivacyNewsletterBottomSheet hilt_CreatorPrivacyNewsletterBottomSheet = (Hilt_CreatorPrivacyNewsletterBottomSheet) hilt_PhoneNumberHiddenInNewsletterBottomSheet;
                if (!hilt_CreatorPrivacyNewsletterBottomSheet.A00) {
                    hilt_CreatorPrivacyNewsletterBottomSheet.A00 = true;
                    C008903z A0S25 = AnonymousClass3MX.A0S(hilt_CreatorPrivacyNewsletterBottomSheet);
                    CreatorPrivacyNewsletterBottomSheet creatorPrivacyNewsletterBottomSheet = (CreatorPrivacyNewsletterBottomSheet) hilt_CreatorPrivacyNewsletterBottomSheet;
                    AnonymousClass10E r313 = ((C36241nZ) A0S25).A2Q;
                    AnonymousClass10G r117 = r313.A00;
                    creatorPrivacyNewsletterBottomSheet.A00 = AnonymousClass10G.A8i(r117);
                    creatorPrivacyNewsletterBottomSheet.A00 = AnonymousClass3MZ.A0N(r313);
                    creatorPrivacyNewsletterBottomSheet.A02 = AnonymousClass3MX.A10(r313);
                    creatorPrivacyNewsletterBottomSheet.A01 = AnonymousClass10E.A17(r313);
                    creatorPrivacyNewsletterBottomSheet.A03 = AnonymousClass3Ma.A0d(r313);
                    creatorPrivacyNewsletterBottomSheet.A05 = C000200d.A00(r117.A0z);
                    creatorPrivacyNewsletterBottomSheet.A02 = AnonymousClass3MZ.A0i(r313);
                    creatorPrivacyNewsletterBottomSheet.A04 = AnonymousClass3MY.A0e(r117);
                }
            } else if (!hilt_PhoneNumberHiddenInNewsletterBottomSheet.A00) {
                hilt_PhoneNumberHiddenInNewsletterBottomSheet.A00 = true;
                C008903z A0S26 = AnonymousClass3MX.A0S(hilt_PhoneNumberHiddenInNewsletterBottomSheet);
                PhoneNumberHiddenInNewsletterBottomSheet phoneNumberHiddenInNewsletterBottomSheet = (PhoneNumberHiddenInNewsletterBottomSheet) hilt_PhoneNumberHiddenInNewsletterBottomSheet;
                AnonymousClass10E r118 = ((C36241nZ) A0S26).A2Q;
                C108965cb.A16(r118, phoneNumberHiddenInNewsletterBottomSheet);
                phoneNumberHiddenInNewsletterBottomSheet.A00 = AnonymousClass3MZ.A0N(r118);
                phoneNumberHiddenInNewsletterBottomSheet.A02 = AnonymousClass3MX.A10(r118);
                phoneNumberHiddenInNewsletterBottomSheet.A01 = AnonymousClass10E.A17(r118);
            }
        } else if (this instanceof Hilt_CreateCallLinkBottomSheet) {
            Hilt_CreateCallLinkBottomSheet hilt_CreateCallLinkBottomSheet = (Hilt_CreateCallLinkBottomSheet) this;
            if (!hilt_CreateCallLinkBottomSheet.A00) {
                hilt_CreateCallLinkBottomSheet.A00 = true;
                C008903z A0S27 = AnonymousClass3MX.A0S(hilt_CreateCallLinkBottomSheet);
                CreateCallLinkBottomSheet createCallLinkBottomSheet = (CreateCallLinkBottomSheet) hilt_CreateCallLinkBottomSheet;
                C36241nZ r216 = (C36241nZ) A0S27;
                AnonymousClass10E r314 = r216.A2Q;
                AnonymousClass10G r44 = r314.A00;
                createCallLinkBottomSheet.A0E = C108995ce.A0O(r314, r44, createCallLinkBottomSheet);
                createCallLinkBottomSheet.A0I = C000200d.A00(r314.A0E);
                createCallLinkBottomSheet.A0J = C000200d.A00(r314.A1k);
                createCallLinkBottomSheet.A0K = C000200d.A00(r314.A1l);
                createCallLinkBottomSheet.A0B = AnonymousClass10E.A4z(r314);
                createCallLinkBottomSheet.A0L = C000200d.A00(r44.A15);
                createCallLinkBottomSheet.A04 = AnonymousClass10E.A12(r314);
                createCallLinkBottomSheet.A0M = C000200d.A00(r314.A4t);
                createCallLinkBottomSheet.A0R = C27011Uj.A00();
                createCallLinkBottomSheet.A0S = (C18600wl) r314.A9F.get();
                createCallLinkBottomSheet.A0N = C000200d.A00(r314.A8W);
                createCallLinkBottomSheet.A0O = C000200d.A00(r314.A8X);
                createCallLinkBottomSheet.A0D = AnonymousClass3Ma.A0a(r314);
                createCallLinkBottomSheet.A0P = C000200d.A00(r314.ABA);
                createCallLinkBottomSheet.A0C = AnonymousClass3MZ.A0g(r314);
                createCallLinkBottomSheet.A0F = AnonymousClass3MY.A0Z(r314);
                createCallLinkBottomSheet.A03 = (AnonymousClass4JA) r216.A2O.A69.get();
            }
        } else if (this instanceof Hilt_AiNotAvailableBottomSheet) {
            Hilt_AiNotAvailableBottomSheet hilt_AiNotAvailableBottomSheet = (Hilt_AiNotAvailableBottomSheet) this;
            if (!hilt_AiNotAvailableBottomSheet.A00) {
                hilt_AiNotAvailableBottomSheet.A00 = true;
                hilt_AiNotAvailableBottomSheet.A00 = C72483Me.A0T(hilt_AiNotAvailableBottomSheet);
            }
        } else if (this instanceof Hilt_AiImagineBottomSheet) {
            Hilt_AiImagineBottomSheet hilt_AiImagineBottomSheet = (Hilt_AiImagineBottomSheet) this;
            if (!hilt_AiImagineBottomSheet.A00) {
                hilt_AiImagineBottomSheet.A00 = true;
                C008903z A0S28 = AnonymousClass3MX.A0S(hilt_AiImagineBottomSheet);
                AiImagineBottomSheet aiImagineBottomSheet = (AiImagineBottomSheet) hilt_AiImagineBottomSheet;
                C36241nZ r315 = (C36241nZ) A0S28;
                AnonymousClass10E r217 = r315.A2Q;
                aiImagineBottomSheet.A0O = C108995ce.A0O(r217, r217.A00, aiImagineBottomSheet);
                AnonymousClass1K1 r316 = r315.A2O;
                aiImagineBottomSheet.A0E = (C51112Xa) r316.A8Z.get();
                aiImagineBottomSheet.A0K = (AnonymousClass73Z) r316.A0E.get();
                aiImagineBottomSheet.A0f = C000200d.A00(r217.A14);
                aiImagineBottomSheet.A0F = AnonymousClass10E.A12(r217);
                aiImagineBottomSheet.A0G = C108965cb.A0H(r217);
                aiImagineBottomSheet.A0L = AnonymousClass3Ma.A0a(r217);
                aiImagineBottomSheet.A0M = AnonymousClass3MZ.A0l(r217);
                aiImagineBottomSheet.A0P = (AnonymousClass1D9) r217.A0n.get();
                aiImagineBottomSheet.A0g = AnonymousClass3MW.A0s(r217);
                aiImagineBottomSheet.A0d = AnonymousClass10E.AL1(r217);
                aiImagineBottomSheet.A0N = AnonymousClass10E.A6Q(r217);
            }
        } else if (this instanceof Hilt_AiHomePreviewBottomSheet) {
            Hilt_AiHomePreviewBottomSheet hilt_AiHomePreviewBottomSheet = (Hilt_AiHomePreviewBottomSheet) this;
            if (!hilt_AiHomePreviewBottomSheet.A00) {
                hilt_AiHomePreviewBottomSheet.A00 = true;
                C008903z A0S29 = AnonymousClass3MX.A0S(hilt_AiHomePreviewBottomSheet);
                AiHomePreviewBottomSheet aiHomePreviewBottomSheet = (AiHomePreviewBottomSheet) hilt_AiHomePreviewBottomSheet;
                C36241nZ r317 = (C36241nZ) A0S29;
                AnonymousClass10E r218 = r317.A2Q;
                AnonymousClass10G r119 = r218.A00;
                aiHomePreviewBottomSheet.A04 = C108995ce.A0O(r218, r119, aiHomePreviewBottomSheet);
                aiHomePreviewBottomSheet.A03 = (C57642jP) r119.A04.get();
                aiHomePreviewBottomSheet.A02 = (C25811Ps) r218.A12.get();
                aiHomePreviewBottomSheet.A01 = (C131346kw) r317.A0D.get();
                aiHomePreviewBottomSheet.A05 = AnonymousClass3MY.A0e(r119);
                aiHomePreviewBottomSheet.A06 = AnonymousClass3MW.A0s(r218);
            }
        } else if (this instanceof Hilt_TextVariantsBottomSheetV2) {
            Hilt_TextVariantsBottomSheetV2 hilt_TextVariantsBottomSheetV2 = (Hilt_TextVariantsBottomSheetV2) this;
            if (!hilt_TextVariantsBottomSheetV2.A00) {
                hilt_TextVariantsBottomSheetV2.A00 = true;
                C008903z A0S30 = AnonymousClass3MX.A0S(hilt_TextVariantsBottomSheetV2);
                TextVariantsBottomSheetV2 textVariantsBottomSheetV2 = (TextVariantsBottomSheetV2) hilt_TextVariantsBottomSheetV2;
                C36241nZ r04 = (C36241nZ) A0S30;
                AnonymousClass10E r120 = r04.A2Q;
                C108965cb.A16(r120, textVariantsBottomSheetV2);
                textVariantsBottomSheetV2.A01 = C36241nZ.A0A(r04);
                textVariantsBottomSheetV2.A02 = AnonymousClass10E.A6Q(r120);
            }
        } else if (this instanceof Hilt_TextVariantsBottomSheet) {
            Hilt_TextVariantsBottomSheet hilt_TextVariantsBottomSheet = (Hilt_TextVariantsBottomSheet) this;
            if (!hilt_TextVariantsBottomSheet.A00) {
                hilt_TextVariantsBottomSheet.A00 = true;
                C008903z A0S31 = AnonymousClass3MX.A0S(hilt_TextVariantsBottomSheet);
                TextVariantsBottomSheet textVariantsBottomSheet = (TextVariantsBottomSheet) hilt_TextVariantsBottomSheet;
                C36241nZ r05 = (C36241nZ) A0S31;
                AnonymousClass10E r121 = r05.A2Q;
                C108965cb.A16(r121, textVariantsBottomSheet);
                textVariantsBottomSheet.A01 = (AnonymousClass2YI) r05.A0e.get();
                textVariantsBottomSheet.A02 = new Object();
                textVariantsBottomSheet.A03 = AnonymousClass10E.A6Q(r121);
            }
        } else if (!this.A02) {
            this.A02 = true;
            C108965cb.A16(((C36241nZ) ((C008903z) generatedComponent())).A2Q, (WDSBottomSheetDialogFragment) this);
        }
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C008803x(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }

    public Hilt_WDSBottomSheetDialogFragment(int i) {
        this.A02 = i;
        this.A07 = new C21466AkX((Object) this, 6);
        this.A04 = new C1411674o(this, 0);
        this.A05 = new AnonymousClass759(this, 0);
        this.A01 = 0;
        this.A02 = 0;
        this.A08 = true;
        this.A0D = true;
        this.A00 = -1;
        this.A06 = new AnonymousClass7AN(this, 0);
        this.A0A = false;
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A05();
        return this.A00;
    }

    public LayoutInflater A1o(Bundle bundle) {
        return C72453Mb.A0Q(super.A1o(bundle), this);
    }

    public void A1x(Context context) {
        super.A1x(context);
        A05();
        A2E();
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A01(this, super.BQR());
    }

    public Hilt_WDSBottomSheetDialogFragment() {
    }
}
