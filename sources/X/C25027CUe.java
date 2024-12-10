package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.CUe  reason: case insensitive filesystem */
public abstract class C25027CUe {
    public static void A00(ECs eCs, Object obj, Object obj2, int i) {
        eCs.BB2(new C22852BSe(obj, obj2, i));
    }

    public void A01() {
        Pair pair;
        boolean remove;
        ArrayList arrayList;
        DDI ddi;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        C25268CcD ccD;
        if (this instanceof C22853BSf) {
            C22853BSf bSf = (C22853BSf) this;
            if (bSf.A00 != 0) {
                BSY bsy = (BSY) bSf.A01;
                bsy.A01.A02();
                bsy.A00 = true;
                obj = bSf.A02;
            } else if (((Future) bSf.A03).cancel(false)) {
                C24990CSq cSq = ((CNG) bSf.A02).A00;
                ECs eCs = cSq.A05;
                ((DDI) eCs).A05.C1o(eCs, "NetworkFetchProducer");
                ccD = cSq.A04;
                ccD.A04();
            } else {
                return;
            }
        } else if (this instanceof C22852BSe) {
            C22852BSe bSe = (C22852BSe) this;
            switch (bSe.A00) {
                case 0:
                    ((AtomicBoolean) bSe.A02).set(true);
                    return;
                case 5:
                    C26269CwE cwE = (C26269CwE) bSe.A01;
                    synchronized (cwE) {
                        CopyOnWriteArraySet copyOnWriteArraySet = cwE.A06;
                        pair = (Pair) bSe.A02;
                        remove = copyOnWriteArraySet.remove(pair);
                        arrayList = null;
                        if (!remove) {
                            ddi = null;
                            arrayList3 = null;
                        } else if (copyOnWriteArraySet.isEmpty()) {
                            ddi = cwE.A02;
                            arrayList3 = null;
                        } else {
                            ArrayList A02 = C26269CwE.A02(cwE);
                            arrayList3 = C26269CwE.A03(cwE);
                            arrayList2 = C26269CwE.A01(cwE);
                            ddi = null;
                            arrayList = A02;
                        }
                        arrayList2 = null;
                    }
                    DDI.A01(arrayList);
                    DDI.A02(arrayList3);
                    DDI.A00(arrayList2);
                    if (ddi != null) {
                        ddi.A03();
                    }
                    if (remove) {
                        obj = pair.first;
                        break;
                    } else {
                        return;
                    }
                case 6:
                    DTQ dtq = (DTQ) bSe.A01;
                    if (dtq.A00.compareAndSet(0, 2)) {
                        dtq.A01();
                    }
                    CNH cnh = ((DD7) bSe.A02).A01;
                    synchronized (cnh) {
                        cnh.A00.remove(dtq);
                    }
                    return;
                default:
                    DTQ dtq2 = (DTQ) bSe.A02;
                    if (dtq2.A00.compareAndSet(0, 2)) {
                        dtq2.A01();
                        return;
                    }
                    return;
            }
        } else {
            return;
        }
        ccD = (C25268CcD) obj;
        ccD.A04();
    }
}
