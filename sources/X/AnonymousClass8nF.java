package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8nF  reason: invalid class name */
public class AnonymousClass8nF extends AnonymousClass6LQ {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass1QR A01;
    public final AnonymousClass1QO A02;
    public final AnonymousClass1QS A03;

    public AnonymousClass8nF(AnonymousClass1M9 r1, ContactPickerFragment contactPickerFragment, AnonymousClass1QR r3, AnonymousClass1QO r4, AnonymousClass1QS r5) {
        super(contactPickerFragment);
        this.A00 = r1;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        ArrayList arrayList;
        ArrayList A13 = AnonymousClass000.A13();
        this.A00.A0u(A13);
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            if (C22971Dz.A0T(C72453Mb.A0l(it))) {
                it.remove();
            }
        }
        if (C18020vd.A05(C18040vf.A02, this.A02.A02, 2026)) {
            ArrayList A0Q = this.A01.A0Q();
            arrayList = AnonymousClass000.A13();
            if (!A0Q.isEmpty()) {
                HashMap A11 = C17880vN.A11();
                Iterator it2 = A13.iterator();
                while (it2.hasNext()) {
                    AnonymousClass8BY.A1M(A11, it2);
                }
                Iterator it3 = A0Q.iterator();
                while (it3.hasNext()) {
                    Object obj = A11.get(((C21346Aia) it3.next()).A04.getRawString());
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
            }
        } else {
            arrayList = AnonymousClass000.A13();
        }
        ArrayList A132 = AnonymousClass000.A13();
        ArrayList A133 = AnonymousClass000.A13();
        ArrayList A134 = AnonymousClass000.A13();
        A0C(new C130886kA((C199429zz) null, arrayList, A13, A132, A133, (List) null, (List) null, A134, (List) null, (List) null, (List) null));
        return new C130886kA((C199429zz) null, arrayList, A13, A132, A133, (List) null, AnonymousClass8BR.A0R(this.A03).A0C(), A134, (List) null, (List) null, (List) null);
    }
}
