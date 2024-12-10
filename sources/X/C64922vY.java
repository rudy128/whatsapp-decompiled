package X;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.2vY  reason: invalid class name and case insensitive filesystem */
public class C64922vY implements C33981jh {
    public final /* synthetic */ AnonymousClass1GP A00;

    public C64922vY(AnonymousClass1GP r1) {
        this.A00 = r1;
    }

    public boolean BLr(ArrayList arrayList, ArrayList arrayList2) {
        boolean A15;
        AnonymousClass1GP r3 = this.A00;
        if (AnonymousClass1GP.A0G(2)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("FragmentManager has the following pending actions inside of prepareBackStackState: ");
            Log.v("FragmentManager", C17890vO.A0V(r3.A0V, A10));
        }
        ArrayList arrayList3 = r3.A0D;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (arrayList3.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            A15 = false;
        } else {
            C34001jj r0 = (C34001jj) arrayList3.get(arrayList3.size() - 1);
            r3.A05 = r0;
            Iterator it = r0.A0C.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((C34271kD) it.next()).A05;
                if (fragment != null) {
                    fragment.A0m = true;
                }
            }
            A15 = r3.A15((String) null, arrayList4, arrayList5, -1, 0);
        }
        ArrayList arrayList6 = r3.A0E;
        if (!arrayList6.isEmpty() && arrayList.size() > 0) {
            arrayList2.get(arrayList.size() - 1);
            LinkedHashSet A14 = C17880vN.A14();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                A14.addAll(AnonymousClass1GP.A02((C34001jj) it2.next()));
            }
            Iterator it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                it3.next();
                Iterator it4 = A14.iterator();
                while (it4.hasNext()) {
                    it4.next();
                }
            }
        }
        return A15;
    }
}
