package X;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.1JL  reason: invalid class name */
public final class AnonymousClass1JL extends AnonymousClass1J2 {
    public static final C24051Ir A06 = new C65052vl(0);
    public boolean A00 = false;
    public boolean A01 = false;
    public final HashMap A02 = new HashMap();
    public final HashMap A03 = new HashMap();
    public final HashMap A04 = new HashMap();
    public final boolean A05;

    public void A0S() {
        if (AnonymousClass1GP.A0G(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        this.A00 = true;
    }

    public void A0U(Fragment fragment, boolean z) {
        if (AnonymousClass1GP.A0G(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
            Log.d("FragmentManager", sb.toString());
        }
        A00(fragment.A0V, z);
    }

    public void A0V(String str, boolean z) {
        if (AnonymousClass1GP.A0G(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for saved state of Fragment ");
            sb.append(str);
            Log.d("FragmentManager", sb.toString());
        }
        A00(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass1JL r5 = (AnonymousClass1JL) obj;
            if (!this.A03.equals(r5.A03) || !this.A02.equals(r5.A02) || !this.A04.equals(r5.A04)) {
                return false;
            }
        }
        return true;
    }

    private void A00(String str, boolean z) {
        HashMap hashMap = this.A02;
        AnonymousClass1JL r3 = (AnonymousClass1JL) hashMap.get(str);
        if (r3 != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r3.A02.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r3.A0V((String) it.next(), true);
                }
            }
            r3.A0S();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.A04;
        C24081Iu r0 = (C24081Iu) hashMap2.get(str);
        if (r0 != null) {
            r0.A00();
            hashMap2.remove(str);
        }
    }

    public void A0T(Fragment fragment) {
        String obj;
        if (this.A01) {
            if (AnonymousClass1GP.A0G(2)) {
                obj = "Ignoring removeRetainedFragment as the state is already saved";
            } else {
                return;
            }
        } else if (this.A03.remove(fragment.A0V) != null && AnonymousClass1GP.A0G(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
            obj = sb.toString();
        } else {
            return;
        }
        Log.v("FragmentManager", obj);
    }

    public int hashCode() {
        return (((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A04.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.A03.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.A02.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.A04.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass1JL(boolean z) {
        this.A05 = z;
    }
}
