package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Csj  reason: case insensitive filesystem */
public class C26121Csj {
    public E2P A00;
    public boolean A01;
    public boolean A02;
    public final Map A03 = C17880vN.A11();
    public final Set A04 = C17880vN.A12();

    public static void A00(C26121Csj csj) {
        E2P e2p = csj.A00;
        if (e2p != null) {
            new HashSet(csj.A04);
            ChipGroup chipGroup = ((DL9) e2p).A00;
            C28520E5k e5k = chipGroup.A01;
            if (e5k != null) {
                chipGroup.A03.A03(chipGroup);
                e5k.Boa(chipGroup);
            }
        }
    }

    public ArrayList A03(ViewGroup viewGroup) {
        HashSet A12 = AnonymousClass8BR.A12(this.A04);
        ArrayList A13 = AnonymousClass000.A13();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof ECX) && C108965cb.A1Z(A12, childAt.getId())) {
                C17890vO.A1D(A13, childAt.getId());
            }
        }
        return A13;
    }

    public void A04() {
        boolean A1U = C108945cZ.A1U(this.A04);
        Iterator A0l = C17890vO.A0l(this.A03);
        while (A0l.hasNext()) {
            A02(this, (ECX) A0l.next(), false);
        }
        if (A1U) {
            A00(this);
        }
    }

    public static boolean A01(C26121Csj csj, ECX ecx) {
        int i;
        int id = ecx.getId();
        Set set = csj.A04;
        Integer valueOf = Integer.valueOf(id);
        if (set.contains(valueOf)) {
            return false;
        }
        Map map = csj.A03;
        if (!csj.A02 || set.isEmpty()) {
            i = -1;
        } else {
            i = C72453Mb.A0H(set.iterator());
        }
        ECX ecx2 = (ECX) AnonymousClass000.A0w(map, i);
        if (ecx2 != null) {
            A02(csj, ecx2, false);
        }
        boolean add = set.add(valueOf);
        if (!ecx.isChecked()) {
            ecx.setChecked(true);
        }
        return add;
    }

    public static boolean A02(C26121Csj csj, ECX ecx, boolean z) {
        int id = ecx.getId();
        Set set = csj.A04;
        Integer valueOf = Integer.valueOf(id);
        if (set.contains(valueOf)) {
            if (!z || set.size() != 1 || !set.contains(valueOf)) {
                boolean remove = set.remove(valueOf);
                if (ecx.isChecked()) {
                    ecx.setChecked(false);
                }
                return remove;
            }
            ecx.setChecked(true);
        }
        return false;
    }
}
