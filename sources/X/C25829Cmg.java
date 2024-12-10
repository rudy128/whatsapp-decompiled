package X;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tasks.zzw;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Cmg  reason: case insensitive filesystem */
public final class C25829Cmg {
    public static final Map A03 = new AnonymousClass00O(0);
    public final Map A00 = new AnonymousClass00O(0);
    public final Set A01 = new AnonymousClass016(0);
    public final Map A02 = new AnonymousClass00O(0);

    public final synchronized CWD A00(C26126Cso cso, Object obj, String str) {
        CWD A012;
        C18210vx.A00(obj);
        A012 = C25934Coz.A01(cso.A02, obj, str);
        CYG cyg = A012.A01;
        C18210vx.A02(cyg, "Key must not be null");
        Map map = this.A02;
        Set set = (Set) map.get(str);
        if (set == null) {
            set = new AnonymousClass016(0);
            map.put(str, set);
        }
        set.add(cyg);
        return A012;
    }

    public final synchronized Task A01(C26126Cso cso, String str) {
        Task task;
        AnonymousClass016 r4 = new AnonymousClass016(0);
        Map map = this.A02;
        Set set = (Set) map.get(str);
        if (set == null) {
            task = Tasks.whenAll((Collection) r4);
        } else {
            Iterator it = new AnonymousClass016((Collection) set).iterator();
            while (it.hasNext()) {
                CYG cyg = (CYG) it.next();
                if (this.A01.contains(cyg)) {
                    r4.add(A02(cso, cyg));
                }
            }
            map.remove(str);
            task = Tasks.whenAll((Collection) r4);
        }
        return task;
    }

    public final synchronized zzw A02(C26126Cso cso, CYG cyg) {
        this.A01.remove(cyg);
        Map map = this.A02;
        Iterator A0x = AnonymousClass8BU.A0x(map);
        while (true) {
            if (!A0x.hasNext()) {
                break;
            }
            String A0v = C17880vN.A0v(A0x);
            Set set = (Set) map.get(A0v);
            if (set.contains(cyg)) {
                set.remove(cyg);
                if (A0v != null) {
                    Map map2 = this.A00;
                    Iterator A15 = AnonymousClass000.A15(map2);
                    while (true) {
                        if (!A15.hasNext()) {
                            break;
                        }
                        Map.Entry A16 = AnonymousClass000.A16(A15);
                        if (C25934Coz.A00(A16.getValue(), A0v).equals(cyg)) {
                            map2.remove(A16.getKey());
                            break;
                        }
                    }
                }
            }
        }
        return cso.A04(cyg);
    }

    public final synchronized zzw A03(C26126Cso cso, C24925CPy cPy) {
        zzw A05;
        CYG cyg = cPy.A00.A01.A01;
        C18210vx.A02(cyg, "Key must not be null");
        boolean add = this.A01.add(cyg);
        A05 = cso.A05(cPy);
        A05.addOnFailureListener(new C26951DKl(cso, cyg, this, add));
        return A05;
    }
}
