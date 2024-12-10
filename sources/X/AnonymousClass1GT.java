package X;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.1GT  reason: invalid class name */
public class AnonymousClass1GT extends AnonymousClass01T {
    public final /* synthetic */ AnonymousClass1GP A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1GT(AnonymousClass1GP r2) {
        super(false);
        this.A00 = r2;
    }

    public void A01() {
        if (AnonymousClass1GP.A0G(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("handleOnBackCancelled. PREDICTIVE_BACK = ");
            sb.append(true);
            sb.append(" fragment manager ");
            sb.append(this.A00);
            Log.d("FragmentManager", sb.toString());
        }
        AnonymousClass1GP r3 = this.A00;
        C34001jj r2 = r3.A05;
        if (r2 != null) {
            r2.A0I = false;
            C21466AkX akX = new C21466AkX((Object) r3, 8);
            ArrayList arrayList = r2.A0B;
            if (arrayList == null) {
                arrayList = new ArrayList();
                r2.A0B = arrayList;
            }
            arrayList.add(akX);
            r2.A00(false);
            r3.A0Z();
        }
        r3.A05 = null;
    }

    public void A02() {
        if (AnonymousClass1GP.A0G(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("handleOnBackStarted. PREDICTIVE_BACK = ");
            sb.append(true);
            sb.append(" fragment manager ");
            sb.append(this.A00);
            Log.d("FragmentManager", sb.toString());
        }
        AnonymousClass1GP r2 = this.A00;
        AnonymousClass1GP.A09(r2);
        r2.A0r(new C64922vY(r2), false);
    }

    public void A03() {
        if (AnonymousClass1GP.A0G(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("handleOnBackPressed. PREDICTIVE_BACK = ");
            sb.append(true);
            sb.append(" fragment manager ");
            sb.append(this.A00);
            Log.d("FragmentManager", sb.toString());
        }
        AnonymousClass1GP r3 = this.A00;
        r3.A0y(true);
        C34001jj r4 = r3.A05;
        if (r4 != null) {
            ArrayList arrayList = r3.A0E;
            if (!arrayList.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(AnonymousClass1GP.A02(r4));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
            }
            Iterator it3 = r3.A05.A0C.iterator();
            while (it3.hasNext()) {
                Fragment fragment = ((C34271kD) it3.next()).A05;
                if (fragment != null) {
                    fragment.A0m = false;
                }
            }
            Iterator it4 = r3.A0W(new ArrayList(Collections.singletonList(r3.A05)), 0, 1).iterator();
            while (it4.hasNext()) {
                C39461t7 r1 = (C39461t7) it4.next();
                if (AnonymousClass1GP.A0G(3)) {
                    Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                }
                List list = r1.A04;
                C39461t7.A06(r1, list);
                r1.A0B(list);
            }
            Iterator it5 = r3.A05.A0C.iterator();
            while (it5.hasNext()) {
                Fragment fragment2 = ((C34271kD) it5.next()).A05;
                if (fragment2 != null && fragment2.A0C == null) {
                    r3.A0U(fragment2).A03();
                }
            }
            r3.A05 = null;
            AnonymousClass1GP.A0A(r3);
            if (AnonymousClass1GP.A0G(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("OnBackPressedCallback enabled=");
                sb2.append(r3.A0R.A00);
                sb2.append(" for  FragmentManager ");
                sb2.append(r3);
                Log.d("FragmentManager", sb2.toString());
                return;
            }
            return;
        }
        boolean z = r3.A0R.A00;
        boolean A0G = AnonymousClass1GP.A0G(3);
        if (z) {
            if (A0G) {
                Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
            }
            AnonymousClass1GP.A0J(r3, (String) null);
            return;
        }
        if (A0G) {
            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
        }
        r3.A01.A07();
    }

    public void A04(C005002d r7) {
        if (AnonymousClass1GP.A0G(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("handleOnBackProgressed. PREDICTIVE_BACK = ");
            sb.append(true);
            sb.append(" fragment manager ");
            sb.append(this.A00);
            Log.v("FragmentManager", sb.toString());
        }
        AnonymousClass1GP r4 = this.A00;
        C34001jj r0 = r4.A05;
        if (r0 != null) {
            Iterator it = r4.A0W(new ArrayList(Collections.singletonList(r0)), 0, 1).iterator();
            while (it.hasNext()) {
                C39461t7 r2 = (C39461t7) it.next();
                if (AnonymousClass1GP.A0G(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: Processing Progress ");
                    sb2.append(r7.A00);
                    Log.v("FragmentManager", sb2.toString());
                }
                List<C39481t9> list = r2.A04;
                ArrayList arrayList = new ArrayList();
                for (C39481t9 r02 : list) {
                    C29401cD.A0J(r02.A0B, arrayList);
                }
                List A0t = C29431cG.A0t(C29431cG.A12(arrayList));
                int size = A0t.size();
                for (int i = 0; i < size; i++) {
                    ((AnonymousClass2SF) A0t.get(i)).A02(r7);
                }
            }
            Iterator it2 = r4.A0E.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }
}
