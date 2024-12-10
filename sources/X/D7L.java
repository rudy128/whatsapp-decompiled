package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Binder;
import android.util.Pair;
import androidx.window.extensions.core.util.function.Predicate;
import java.util.Collection;
import java.util.Set;

public class D7L implements Predicate {
    public final int A00;
    public final Object A01;

    public D7L(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean test(Object obj) {
        boolean z;
        int i = this.A00;
        Object obj2 = this.A01;
        switch (i) {
            case 0:
                C22728BMp bMp = (C22728BMp) obj2;
                Activity activity = (Activity) obj;
                Binder binder = C26275CwR.A03;
                C18070vi.A0d(bMp, 0);
                Set<C25129CZc> set = bMp.A02;
                z = false;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    for (C25129CZc cZc : set) {
                        C18070vi.A0Y(activity);
                        if (C26129Csr.A00.A02(activity, cZc.A00)) {
                            return true;
                        }
                    }
                    break;
                } else {
                    return false;
                }
                break;
            case 1:
                C22728BMp bMp2 = (C22728BMp) obj2;
                Intent intent = (Intent) obj;
                Binder binder2 = C26275CwR.A03;
                C18070vi.A0d(bMp2, 0);
                Set<C25129CZc> set2 = bMp2.A02;
                z = false;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (C25129CZc cZc2 : set2) {
                        C18070vi.A0Y(intent);
                        if (C26129Csr.A00.A03(intent, cZc2.A00)) {
                            return true;
                        }
                    }
                    break;
                } else {
                    return false;
                }
                break;
            case 2:
                C22727BMo bMo = (C22727BMo) obj2;
                Pair pair = (Pair) obj;
                Binder binder3 = C26275CwR.A03;
                C18070vi.A0d(bMo, 0);
                Set<C25150Ca1> set3 = bMo.A02;
                z = false;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    for (C25150Ca1 ca1 : set3) {
                        Object obj3 = pair.first;
                        C18070vi.A0W(obj3);
                        Activity activity2 = (Activity) obj3;
                        Object obj4 = pair.second;
                        C18070vi.A0W(obj4);
                        Activity activity3 = (Activity) obj4;
                        C18070vi.A0d(activity2, 0);
                        C18070vi.A0d(activity3, 1);
                        C26129Csr csr = C26129Csr.A00;
                        if (csr.A02(activity2, ca1.A00) && csr.A02(activity3, ca1.A01)) {
                            return true;
                        }
                    }
                    break;
                } else {
                    return false;
                }
                break;
            case 3:
                C22727BMo bMo2 = (C22727BMo) obj2;
                Pair pair2 = (Pair) obj;
                Binder binder4 = C26275CwR.A03;
                C18070vi.A0d(bMo2, 0);
                Set<C25150Ca1> set4 = bMo2.A02;
                z = false;
                if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                    for (C25150Ca1 ca12 : set4) {
                        Object obj5 = pair2.first;
                        C18070vi.A0W(obj5);
                        Activity activity4 = (Activity) obj5;
                        Object obj6 = pair2.second;
                        C18070vi.A0W(obj6);
                        Intent intent2 = (Intent) obj6;
                        C18070vi.A0d(activity4, 0);
                        C18070vi.A0d(intent2, 1);
                        C26129Csr csr2 = C26129Csr.A00;
                        if (csr2.A02(activity4, ca12.A00) && csr2.A03(intent2, ca12.A01)) {
                            return true;
                        }
                    }
                    break;
                } else {
                    return false;
                }
                break;
            case 4:
                C22726BMn bMn = (C22726BMn) obj2;
                Activity activity5 = (Activity) obj;
                Binder binder5 = C26275CwR.A03;
                C18070vi.A0d(bMn, 0);
                Set<C25129CZc> set5 = bMn.A00;
                z = false;
                if (!(set5 instanceof Collection) || !set5.isEmpty()) {
                    for (C25129CZc cZc3 : set5) {
                        C18070vi.A0Y(activity5);
                        if (C26129Csr.A00.A02(activity5, cZc3.A00)) {
                            return true;
                        }
                    }
                    break;
                } else {
                    return false;
                }
                break;
            default:
                C22726BMn bMn2 = (C22726BMn) obj2;
                Intent intent3 = (Intent) obj;
                Binder binder6 = C26275CwR.A03;
                C18070vi.A0d(bMn2, 0);
                Set<C25129CZc> set6 = bMn2.A00;
                z = false;
                if (!(set6 instanceof Collection) || !set6.isEmpty()) {
                    for (C25129CZc cZc4 : set6) {
                        C18070vi.A0Y(intent3);
                        if (C26129Csr.A00.A03(intent3, cZc4.A00)) {
                            return true;
                        }
                    }
                    break;
                }
        }
        return z;
    }
}
