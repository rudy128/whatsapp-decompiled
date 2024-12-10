package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.base.WaFragment;
import com.whatsapp.status.tiles.StatusGridPageFragment;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5nq  reason: invalid class name and case insensitive filesystem */
public final class C113835nq extends BLs implements AnonymousClass8AU, C161008Az {
    public C140066zt A00;
    public Map A01 = C17880vN.A13();
    public List A02;
    public boolean A03;
    public final C34551kg A04;

    public void ByX(AnonymousClass206 r3, int i) {
        C18070vi.A0d(r3, 0);
        Iterator A0l = C17890vO.A0l(this.A01);
        while (A0l.hasNext()) {
            StatusGridPageFragment statusGridPageFragment = (StatusGridPageFragment) ((Reference) A0l.next()).get();
            if (statusGridPageFragment != null) {
                statusGridPageFragment.ByX(r3, i);
            }
        }
    }

    public void CRO(C140066zt r6, List list) {
        int i;
        C18070vi.A0d(r6, 1);
        this.A03 = true;
        int A0Q = A0Q();
        this.A00 = r6;
        int ceil = (int) ((float) Math.ceil((double) (((float) list.size()) / ((float) (this.A00.A00 * 2)))));
        if (A0Q > ceil) {
            int A0Q2 = A0Q() - 1;
            int i2 = A0Q2 - (A0Q - ceil);
            int i3 = A0Q2;
            if (i2 <= A0Q2) {
                do {
                    A0I(i3);
                    i = i3;
                    i3--;
                } while (i != i2);
            }
            if (i2 < 0) {
                i2 = 0;
            }
            int i4 = i2 + 1;
            if (i4 <= A0Q2) {
                while (true) {
                    this.A01.remove(Integer.valueOf(A0Q2));
                    if (A0Q2 == i4) {
                        break;
                    }
                    A0Q2--;
                }
            }
            this.A02 = list;
        } else {
            this.A02 = list;
            int i5 = ceil - A0Q;
            A0J((A0Q() - i5) - 1, i5);
        }
        A00();
    }

    private final void A00() {
        StatusGridPageFragment statusGridPageFragment;
        List list = this.A02;
        if (list == null) {
            list = C18460wS.A00;
        }
        int A0Q = A0Q();
        for (int i = 0; i < A0Q; i++) {
            Reference reference = (Reference) AnonymousClass000.A0w(this.A01, i);
            if (!(reference == null || (statusGridPageFragment = (StatusGridPageFragment) reference.get()) == null)) {
                List list2 = list;
                if (!list.isEmpty()) {
                    int i2 = this.A00.A00 * 2;
                    int i3 = i * i2;
                    list2 = list.subList(i3, C108955ca.A08(list, i2 + i3));
                }
                C140066zt r1 = this.A00;
                C18070vi.A0h(list2, r1);
                statusGridPageFragment.A04 = r1;
                C112275lD r0 = statusGridPageFragment.A06;
                if (r0 != null) {
                    r0.A0V(r1, list2);
                }
                if (statusGridPageFragment.A06 == null || statusGridPageFragment.A01 == null) {
                    statusGridPageFragment.A0C = list2;
                }
            }
        }
    }

    public int A0Q() {
        float f;
        List list = this.A02;
        if (list != null) {
            f = (float) list.size();
        } else {
            f = 1.0f;
        }
        return (int) ((float) Math.ceil((double) (f / ((float) (this.A00.A00 * 2)))));
    }

    public Fragment A0U(int i) {
        StatusGridPageFragment statusGridPageFragment = new StatusGridPageFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("page_index", i);
        statusGridPageFragment.A1R(A0D);
        statusGridPageFragment.A05 = this.A04;
        statusGridPageFragment.A04 = this.A00;
        this.A01.put(Integer.valueOf(i), AnonymousClass3MW.A0z(statusGridPageFragment));
        List list = this.A02;
        if (list != null && (!list.isEmpty())) {
            A00();
        }
        return statusGridPageFragment;
    }

    public void BIZ() {
        Iterator A0l = C17890vO.A0l(this.A01);
        while (A0l.hasNext()) {
            StatusGridPageFragment statusGridPageFragment = (StatusGridPageFragment) ((Reference) A0l.next()).get();
            if (statusGridPageFragment != null) {
                statusGridPageFragment.BIZ();
            }
        }
    }

    public List BTZ() {
        List list = this.A02;
        if (list == null) {
            return C18460wS.A00;
        }
        return list;
    }

    public void BjN(C140066zt r2, List list) {
        if (!this.A03) {
            CRO(r2, list);
        }
    }

    public void BwL(int i) {
        Reference reference;
        StatusGridPageFragment statusGridPageFragment;
        Map map = this.A01;
        Iterator A0l = C17890vO.A0l(map);
        while (A0l.hasNext()) {
            StatusGridPageFragment statusGridPageFragment2 = (StatusGridPageFragment) ((Reference) A0l.next()).get();
            if (statusGridPageFragment2 != null) {
                statusGridPageFragment2.A0D = AnonymousClass000.A1T(i, statusGridPageFragment2.A00);
            }
        }
        List list = this.A02;
        if (list != null && (reference = (Reference) AnonymousClass000.A0w(map, i)) != null && (statusGridPageFragment = (StatusGridPageFragment) reference.get()) != null) {
            if (!list.isEmpty()) {
                int i2 = this.A00.A00 * 2;
                int i3 = i * i2;
                list = list.subList(i3, C108955ca.A08(list, i2 + i3));
            }
            C140066zt r1 = this.A00;
            C18070vi.A0h(list, r1);
            statusGridPageFragment.A04 = r1;
            C112275lD r0 = statusGridPageFragment.A06;
            if (r0 != null) {
                r0.A0V(r1, list);
            }
            if (statusGridPageFragment.A06 == null || statusGridPageFragment.A01 == null) {
                statusGridPageFragment.A0C = list;
            }
        }
    }

    public C113835nq(WaFragment waFragment, C140066zt r4, C34551kg r5) {
        super(waFragment.A1E(), waFragment.A0L);
        this.A04 = r5;
        this.A00 = r4;
    }

    public C140066zt BTV() {
        return this.A00;
    }
}
