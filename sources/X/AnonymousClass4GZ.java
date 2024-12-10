package X;

import com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment;

/* renamed from: X.4GZ  reason: invalid class name */
public abstract class AnonymousClass4GZ {
    public static final ConsumerMarketingDisclosureFragment A00(AnonymousClass1BI r6, Integer num) {
        C18070vi.A0d(r6, 0);
        ConsumerMarketingDisclosureFragment consumerMarketingDisclosureFragment = new ConsumerMarketingDisclosureFragment();
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[2];
        C72463Mc.A1N(r2, num.intValue(), 0, "blocking_key");
        AnonymousClass1D6.A03("chat_jid", r6.getRawString(), r2, 1);
        AnonymousClass3MX.A1I(consumerMarketingDisclosureFragment, r2);
        return consumerMarketingDisclosureFragment;
    }
}
