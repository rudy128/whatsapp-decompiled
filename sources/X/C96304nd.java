package X;

import com.whatsapp.info.views.PhoneNumberPrivacyInfoView;

/* renamed from: X.4nd  reason: invalid class name and case insensitive filesystem */
public class C96304nd implements AnonymousClass3L6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C96304nd(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    public final void BvL(AnonymousClass1BI r5) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            AnonymousClass8GZ r3 = (AnonymousClass8GZ) obj;
            AnonymousClass1EC r2 = (AnonymousClass1EC) this.A02;
            C34511kb r1 = (C34511kb) this.A03;
            if (r5.equals(r3.A03)) {
                AnonymousClass3MY.A1U(r3.A0c, r3, 12);
            } else if (r2 != null) {
                AnonymousClass1EC A04 = r1.A04(r2);
                if (r5.equals(r2) || r5.equals(A04)) {
                    r3.A0S.A0G(r3.A04, C17890vO.A1R(C72463Mc.A1O(r3.A0E) ? 1 : 0));
                }
            }
        } else {
            AnonymousClass1EC r32 = (AnonymousClass1EC) obj;
            PhoneNumberPrivacyInfoView phoneNumberPrivacyInfoView = (PhoneNumberPrivacyInfoView) this.A02;
            AnonymousClass1EC r12 = (AnonymousClass1EC) this.A03;
            C18070vi.A0d(phoneNumberPrivacyInfoView, 1);
            if (C18070vi.A18(r5, r32)) {
                phoneNumberPrivacyInfoView.A0A(r32, r12);
            }
        }
    }
}
