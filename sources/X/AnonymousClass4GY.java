package X;

import com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment;

/* renamed from: X.4GY  reason: invalid class name */
public abstract class AnonymousClass4GY {
    public static final ConsumerDisclosureFragment A00(AnonymousClass1BI r8, Boolean bool, Integer num, Integer num2, Integer num3, boolean z) {
        AnonymousClass1BI r5 = r8;
        ConsumerDisclosureFragment consumerDisclosureFragment = new ConsumerDisclosureFragment(r5, bool, num2, num3, z);
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[2];
        C72463Mc.A1N(r2, num.intValue(), 0, "blocking_key");
        r2[1] = AnonymousClass1D6.A01("jid", r5);
        AnonymousClass3MX.A1I(consumerDisclosureFragment, r2);
        return consumerDisclosureFragment;
    }
}
