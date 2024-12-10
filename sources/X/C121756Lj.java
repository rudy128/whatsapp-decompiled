package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.6Lj  reason: invalid class name and case insensitive filesystem */
public final class C121756Lj extends A34 {
    public final AnonymousClass12E A00;
    public final WeakReference A01;
    public final AnonymousClass1M9 A02;
    public final C25161Nd A03;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C63212sh r1 = new C63212sh(AnonymousClass2R1.A0D, (Integer) null);
        r1.A00 = C62132qq.A0C;
        r1.A03 = true;
        C62602rf A032 = this.A00.A03(r1.A02());
        C18070vi.A0b(A032);
        return A032;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C62602rf r5 = (C62602rf) obj;
        C18070vi.A0d(r5, 0);
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A01.get();
        if (contactPickerFragment != null && contactPickerFragment.A1b()) {
            contactPickerFragment.A0r.A00.A2v(false);
            ContactPickerFragment.A0I(contactPickerFragment);
            int i = r5.A00;
            if (i == 0) {
                contactPickerFragment.A0r.BhQ(2131888361);
            } else if (i == 1 || i == 2 || i == 3) {
                if (C72463Mc.A1W(contactPickerFragment.A2G)) {
                    C23520Bik bik = contactPickerFragment.A0G;
                    if (bik == null || !bik.A0D()) {
                        contactPickerFragment.A0S.A08(2131888362, 0);
                    }
                }
            } else if (i == 4 || i == 6) {
                contactPickerFragment.A0r.BhQ(2131888360);
                contactPickerFragment.A10.A06();
            }
        }
    }

    public C121756Lj(AnonymousClass1M9 r2, ContactPickerFragment contactPickerFragment, AnonymousClass12E r4, C25161Nd r5) {
        C18070vi.A0p(r2, r4, r5);
        this.A02 = r2;
        this.A00 = r4;
        this.A03 = r5;
        this.A01 = AnonymousClass3MW.A0z(contactPickerFragment);
    }
}
