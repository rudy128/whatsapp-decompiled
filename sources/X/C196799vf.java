package X;

import com.whatsapp.payments.ui.PaymentsWarmWelcomeBottomSheet;

/* renamed from: X.9vf  reason: invalid class name and case insensitive filesystem */
public abstract class C196799vf {
    public static final PaymentsWarmWelcomeBottomSheet A00(String str) {
        C18070vi.A0d(str, 2);
        PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet = new PaymentsWarmWelcomeBottomSheet();
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[4];
        C72463Mc.A1H("bundle_key_headline", 2131893486, r2);
        C108985cd.A1G("bundle_key_body", 2131893485, r2);
        AnonymousClass1D6.A03("referral_screen", str, r2, 2);
        AnonymousClass1D6.A03("bundle_screen_name", "more_verification_needed_prompt", r2, 3);
        paymentsWarmWelcomeBottomSheet.A1R(AnonymousClass9O6.A00(r2));
        return paymentsWarmWelcomeBottomSheet;
    }

    public static final PaymentsWarmWelcomeBottomSheet A01(String str) {
        C18070vi.A0d(str, 4);
        PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet = new PaymentsWarmWelcomeBottomSheet();
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[6];
        C72463Mc.A1H("bundle_key_title", 2131896067, r2);
        C108985cd.A1G("bundle_key_image", 2131232464, r2);
        C72463Mc.A1I("bundle_key_headline", 2131893490, r2);
        C72463Mc.A1J("bundle_key_body", 2131893489, r2);
        AnonymousClass1D6.A03("referral_screen", str, r2, 4);
        AnonymousClass1D6.A03("bundle_screen_name", "get_started", r2, 5);
        paymentsWarmWelcomeBottomSheet.A1R(AnonymousClass9O6.A00(r2));
        return paymentsWarmWelcomeBottomSheet;
    }
}
