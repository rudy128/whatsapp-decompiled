package X;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1GR  reason: invalid class name */
public class AnonymousClass1GR {
    public AnonymousClass1JL A00;
    public final ArrayList A01 = new ArrayList();
    public final HashMap A02 = new HashMap();
    public final HashMap A03 = new HashMap();

    public Fragment A00(String str) {
        C35821mr r0 = (C35821mr) this.A02.get(str);
        if (r0 != null) {
            return r0.A02;
        }
        return null;
    }

    public Fragment A01(String str) {
        Fragment A1A;
        for (C35821mr r0 : this.A02.values()) {
            if (r0 != null && (A1A = r0.A02.A1A(str)) != null) {
                return A1A;
            }
        }
        return null;
    }

    public ArrayList A02() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.A02.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public ArrayList A03() {
        Fragment fragment;
        ArrayList arrayList = new ArrayList();
        for (C35821mr r0 : this.A02.values()) {
            if (r0 != null) {
                fragment = r0.A02;
            } else {
                fragment = null;
            }
            arrayList.add(fragment);
        }
        return arrayList;
    }

    public List A04() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.A01;
        if (arrayList2.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2);
        }
        return arrayList;
    }

    public void A05(Fragment fragment) {
        ArrayList arrayList = this.A01;
        if (!arrayList.contains(fragment)) {
            synchronized (arrayList) {
                arrayList.add(fragment);
            }
            fragment.A0W = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment already added: ");
        sb.append(fragment);
        throw new IllegalStateException(sb.toString());
    }

    public void A06(C35821mr r4) {
        Fragment fragment = r4.A02;
        String str = fragment.A0V;
        HashMap hashMap = this.A02;
        if (hashMap.get(str) == null) {
            hashMap.put(fragment.A0V, r4);
            if (AnonymousClass1GP.A0G(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Added fragment to active set ");
                sb.append(fragment);
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    public void A07(C35821mr r5) {
        Fragment fragment = r5.A02;
        if (fragment.A0l) {
            this.A00.A0T(fragment);
        }
        HashMap hashMap = this.A02;
        if (hashMap.get(fragment.A0V) == r5 && hashMap.put(fragment.A0V, (Object) null) != null && AnonymousClass1GP.A0G(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
    }
}
