package X;

import java.util.Arrays;

/* renamed from: X.4ZD  reason: invalid class name */
public abstract class AnonymousClass4ZD {
    public static final String[] A00 = {"were-updating-our-terms-and-privacy-policy", "were-updating-our-terms-and-privacy-policy", "were-updating-our-terms-and-privacy-policy-eea"};
    public static final String[] A01 = {"https://www.whatsapp.com/legal/updates/privacy-policy", "https://www.whatsapp.com/legal/brazil-privacy-notice", "https://www.whatsapp.com/legal/updates/privacy-policy-eea"};
    public static final String[] A02 = {"how-we-work-with-facebook-to-offer-new-products-and-services", "how-we-work-with-facebook-to-offer-new-products-and-services", "how-we-work-with-facebook-to-offer-new-products-and-services"};
    public static final String[] A03 = {"https://www.whatsapp.com/legal/updates/terms-of-service", "https://www.whatsapp.com/legal/updates/terms-of-service", "https://www.whatsapp.com/legal/updates/terms-of-service-eea"};
    public static final String[] A04 = {"what-happens-when-our-terms-and-privacy-policy-updates-take-effect", "what-happens-when-our-terms-and-privacy-policy-updates-take-effect", "what-happens-when-our-terms-and-privacy-policy-updates-take-effect"};

    public static final int A00(AnonymousClass1K3 r3, int[] iArr) {
        C18070vi.A0d(iArr, 2);
        if (!A01(r3)) {
            C24521Kq r0 = C24521Kq.$redex_init_class;
            if (!r3.A05("BR") || !Arrays.equals(iArr, C74403Zv.A0F)) {
                return iArr[0];
            }
        }
        return iArr[1];
    }

    public static final boolean A01(AnonymousClass1K3 r1) {
        C24521Kq r0 = C24521Kq.$redex_init_class;
        if (r1.A04() || r1.A05("GI")) {
            return true;
        }
        return false;
    }
}
