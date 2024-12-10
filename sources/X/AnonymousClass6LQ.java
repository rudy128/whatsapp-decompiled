package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

/* renamed from: X.6LQ  reason: invalid class name */
public abstract class AnonymousClass6LQ extends A34 {
    public final WeakReference A00;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        List<AnonymousClass1D6> list;
        int i;
        C130886kA r10 = (C130886kA) obj;
        C18070vi.A0d(r10, 0);
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00.get();
        if (contactPickerFragment != null && contactPickerFragment.A1b()) {
            List list2 = r10.A01;
            list2.size();
            r10.A0A.size();
            List list3 = r10.A02;
            if (list3 != null) {
                list3.size();
            }
            contactPickerFragment.A4B.A01();
            contactPickerFragment.A0p = null;
            if (contactPickerFragment.A2l() && !list2.isEmpty()) {
                C003401n A002 = C142977Bn.A00(contactPickerFragment);
                C18000vb r5 = contactPickerFragment.A19;
                long size = (long) list2.size();
                Object[] A1a = AnonymousClass3MW.A1a();
                C108985cd.A1S(list2, A1a, 0);
                A002.A0R(r5.A0K(A1a, 2131755250, size));
            }
            contactPickerFragment.A2X(r10);
            if (contactPickerFragment.A3V && (list = contactPickerFragment.A36) != null) {
                for (AnonymousClass1D6 r0 : list) {
                    if (!((Collection) r0.second).isEmpty()) {
                        C37611pq r4 = (C37611pq) contactPickerFragment.A2o.get();
                        C18030ve r3 = r4.A00;
                        C18040vf r1 = C18040vf.A02;
                        if (C18020vd.A05(r1, r3, 8726)) {
                            AnonymousClass63R r2 = new AnonymousClass63R();
                            r2.A04 = C17880vN.A0m();
                            if (C18020vd.A05(r1, r3, 9906)) {
                                i = 4;
                            } else {
                                int A003 = C18020vd.A00(r1, r3, 7746);
                                i = 1;
                                if (A003 == 1) {
                                    i = 0;
                                }
                            }
                            r2.A03 = Integer.valueOf(i);
                            r4.A01.CC7(r2);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ void A0I(Object[] objArr) {
        C130886kA[] r4 = (C130886kA[]) objArr;
        C18070vi.A0d(r4, 0);
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00.get();
        if (contactPickerFragment != null && contactPickerFragment.A1b()) {
            contactPickerFragment.A2X(r4[0]);
        }
    }

    public AnonymousClass6LQ(ContactPickerFragment contactPickerFragment) {
        this.A00 = AnonymousClass3MW.A0z(contactPickerFragment);
    }
}
