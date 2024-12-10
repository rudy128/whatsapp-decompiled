package X;

import com.whatsapp.status.StatusesFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6LR  reason: invalid class name */
public final class AnonymousClass6LR extends A34 {
    public final AnonymousClass1TG A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6LR(AnonymousClass1TG r2, StatusesFragment statusesFragment) {
        super(statusesFragment, true);
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        return this.A00.A04(AnonymousClass1E5.A00, -1);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C62572rc r1;
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        StatusesFragment statusesFragment = (StatusesFragment) A0A(StatusesFragment.class);
        if (statusesFragment != null) {
            statusesFragment.A0n = null;
            List list2 = statusesFragment.A1M;
            list2.clear();
            List list3 = statusesFragment.A1N;
            list3.clear();
            List list4 = statusesFragment.A1L;
            list4.clear();
            int A01 = AnonymousClass3MX.A01(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass206 A0Y = C17880vN.A0Y(it);
                int A0D = A0Y.A0D();
                if (C446824j.A03(A0D, 4)) {
                    if (A0D != 20) {
                        if (AnonymousClass25A.A0p(A0Y)) {
                            list4.add(Integer.valueOf(A01));
                        } else if (!(A0Y instanceof AnonymousClass21V) || (r1 = ((AnonymousClass21V) A0Y).A02) == null || r1.A0V || r1.A0f) {
                            list3.add(Integer.valueOf(A01));
                        }
                    }
                    list2.add(Integer.valueOf(A01));
                }
                A01--;
                C63372sx r0 = statusesFragment.A0k.A00;
                if (r0 != null && r0.A03() == A0Y.A0y) {
                    long j = A0Y.A0H;
                    if (j > 0) {
                        statusesFragment.A0k.A00.A0B(j);
                    }
                }
            }
            C110285fE.A00(statusesFragment);
        }
    }
}
