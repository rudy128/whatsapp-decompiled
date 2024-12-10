package X;

import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerActivity;
import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel;

/* renamed from: X.80j  reason: invalid class name and case insensitive filesystem */
public final class C1583580j extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ PrivacyDisclosureContainerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1583580j(PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity) {
        super(1);
        this.this$0 = privacyDisclosureContainerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C135406s9 r7 = (C135406s9) obj;
        int intValue = r7.A00.intValue();
        if (intValue == 2) {
            this.this$0.A44((String) null);
        } else if (intValue != 0) {
            PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity = this.this$0;
            privacyDisclosureContainerActivity.A00 = true;
            privacyDisclosureContainerActivity.CEx();
            C23520Bik A01 = C23520Bik.A01(AnonymousClass3MZ.A0F(privacyDisclosureContainerActivity), 2131898914, -1);
            A01.A0F(new C89964dJ(privacyDisclosureContainerActivity, 12), 2131898913);
            A01.A0C(new C114385qi(privacyDisclosureContainerActivity, 1));
            A01.A08();
            C18100vl r2 = privacyDisclosureContainerActivity.A03;
            r2.getValue();
            AnonymousClass71X.A05.A01(499, true);
            ((PrivacyDisclosureContainerViewModel) r2.getValue()).A0T(499);
        } else {
            PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity2 = this.this$0;
            privacyDisclosureContainerActivity2.CEx();
            if (r7.A01 != null) {
                PrivacyDisclosureContainerActivity.A0W(privacyDisclosureContainerActivity2);
            } else {
                PrivacyDisclosureContainerActivity.A0V(privacyDisclosureContainerActivity2, 499);
            }
        }
        return C27621Wu.A00;
    }
}
