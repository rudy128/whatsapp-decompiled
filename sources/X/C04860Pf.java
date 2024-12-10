package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.0Pf  reason: invalid class name and case insensitive filesystem */
public abstract class C04860Pf {
    public static final Class[] A00 = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final LinkedHashMap A02(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String next : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(next);
            C18070vi.A0z(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(next, parcelableArrayList);
        }
        return linkedHashMap;
    }

    public static final boolean A03(Object obj) {
        if (obj instanceof C17260uN) {
            C17260uN r6 = (C17260uN) obj;
            if (r6.BXD() == AnonymousClass0Q9.A00() || r6.BXD() == AnonymousClass0Q9.A06() || r6.BXD() == AnonymousClass0Q9.A05()) {
                Object value = r6.getValue();
                if (value != null) {
                    return A03(value);
                }
                return true;
            }
        } else if (!(obj instanceof C18080vj) || !(obj instanceof Serializable)) {
            Class[] clsArr = A00;
            int i = 0;
            while (!clsArr[i].isInstance(obj)) {
                i++;
                if (i >= 7) {
                }
            }
            return true;
        }
        return false;
    }

    public static final AnonymousClass0W1 A00(View view, AnonymousClass1FE r3) {
        String str;
        ViewParent parent = view.getParent();
        C18070vi.A0z(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(2131429328);
        if (!(tag instanceof String) || (str = (String) tag) == null) {
            str = String.valueOf(view2.getId());
        }
        return A01(r3, str);
    }

    public static final AnonymousClass0W1 A01(AnonymousClass1FE r3, String str) {
        LinkedHashMap linkedHashMap;
        boolean z;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SaveableStateRegistry");
        A10.append(':');
        String A0y = AnonymousClass000.A0y(str, A10);
        AnonymousClass1GB BYX = r3.BYX();
        Bundle A002 = BYX.A00(A0y);
        if (A002 != null) {
            linkedHashMap = A02(A002);
        } else {
            linkedHashMap = null;
        }
        AnonymousClass0W0 A003 = C04100Lv.A00(linkedHashMap, C12380lf.A00);
        try {
            BYX.A03(new AnonymousClass0YC(A003), A0y);
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new AnonymousClass0W1(A003, new C08770fd(BYX, A0y, z));
    }
}
