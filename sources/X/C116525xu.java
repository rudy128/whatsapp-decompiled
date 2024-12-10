package X;

import androidx.fragment.app.Fragment;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.5xu  reason: invalid class name and case insensitive filesystem */
public class C116525xu extends C121926Ma {
    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        long j;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        ArrayList A133 = AnonymousClass000.A13();
        HashSet A12 = C17880vN.A12();
        ArrayList A134 = AnonymousClass000.A13();
        HashSet A122 = C17880vN.A12();
        boolean A0O = A0O();
        A0N(this.A09, A132, A12, A122, A0O);
        AnonymousClass8CU r3 = this.A02;
        if (!r3.isCancelled()) {
            Iterator it = this.A08.iterator();
            while (it.hasNext()) {
                AnonymousClass1E7 A0O2 = C17880vN.A0O(it);
                if (A0O2 != null) {
                    Jid A0g = AnonymousClass3MW.A0g(A0O2);
                    if (!A12.contains(A0g) && !A0O2.A0F() && this.A02.A0l(A0O2, this.A06) && !this.A0B.contains(A0g) && !C22971Dz.A0Z(A0g) && !C22971Dz.A0a(A0g) && A0Q(A0O2, A0O)) {
                        A133.add(A0O2);
                        C59042lf r0 = A0O2.A0H;
                        if (r0 == null) {
                            j = 0;
                        } else {
                            j = r0.A00;
                        }
                        C17880vN.A1R(A134, j);
                    }
                }
            }
            if (!r3.isCancelled()) {
                Fragment fragment = (Fragment) this.A05.get();
                if (fragment != null && fragment.A1b()) {
                    A0M(A13, A132, AnonymousClass000.A13(), AnonymousClass000.A13(), A133);
                }
                C121926Ma.A08(A13, A133);
                if (!r3.isCancelled() && A13.isEmpty()) {
                    A0K(A13);
                }
            }
        }
        return new C127096dn(A13, this.A06);
    }
}
