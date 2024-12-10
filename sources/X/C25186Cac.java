package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cac  reason: case insensitive filesystem */
public final class C25186Cac {
    public HashMap A00 = C17880vN.A11();
    public HashMap A01 = C17880vN.A11();
    public HashMap A02 = C17880vN.A11();

    /* JADX WARNING: type inference failed for: r3v0, types: [X.C6M, java.lang.Object] */
    public void A00(A5W a5w, C24322BzJ bzJ, MediaEffect mediaEffect) {
        ? obj = new Object();
        obj.A00 = a5w;
        obj.A01 = mediaEffect;
        List A13 = AnonymousClass000.A13();
        HashMap hashMap = this.A00;
        if (!hashMap.containsKey(bzJ) || (A13 = (List) hashMap.get(bzJ)) != null) {
            A13.add(obj);
        }
        hashMap.put(bzJ, A13);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.C6M, java.lang.Object] */
    public void A01(C24322BzJ bzJ, MediaEffect mediaEffect) {
        A5W a5w = new A5W(TimeUnit.MILLISECONDS, -1, -1);
        ? obj = new Object();
        obj.A00 = a5w;
        obj.A01 = mediaEffect;
        List A13 = AnonymousClass000.A13();
        HashMap hashMap = this.A00;
        if (!hashMap.containsKey(bzJ) || (A13 = (List) hashMap.get(bzJ)) != null) {
            A13.add(obj);
        }
        hashMap.put(bzJ, A13);
    }

    public void A02(C25833Cmm cmm) {
        int size;
        C26171Ctn.A03(C17880vN.A1X(C17880vN.A10(cmm.A04)), (String) null);
        C24322BzJ bzJ = cmm.A01;
        Iterator A0y = AnonymousClass8BV.A0y(cmm.A03.keySet());
        while (A0y.hasNext()) {
            String A0v = C17880vN.A0v(A0y);
            HashMap hashMap = this.A01;
            HashMap hashMap2 = this.A02;
            if (hashMap.containsKey(bzJ)) {
                AbstractMap abstractMap = (AbstractMap) hashMap.get(bzJ);
                abstractMap.getClass();
                if (abstractMap.containsKey(A0v)) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Effect id ");
                    A10.append(A0v);
                    A10.append(" with track type ");
                    A10.append(bzJ);
                    A10.append(" and track name ");
                    A10.append(cmm.A02);
                    throw AnonymousClass001.A12(" already exists", A10);
                }
            }
            if (hashMap2.containsKey(bzJ)) {
                ArrayList A13 = AnonymousClass000.A13();
                A13.addAll(((AbstractMap) hashMap2.get(bzJ)).values());
                Iterator it = A13.iterator();
                while (it.hasNext()) {
                    if (((C25833Cmm) it.next()).A03.containsKey(A0v)) {
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("Effect id ");
                        A102.append(A0v);
                        A102.append(" with track type ");
                        A102.append(bzJ);
                        A102.append(" and track name ");
                        A102.append(cmm.A02);
                        throw AnonymousClass001.A12(" already exists", A102);
                    }
                }
                continue;
            }
        }
        HashMap hashMap3 = this.A02;
        AbstractMap abstractMap2 = (AbstractMap) hashMap3.get(bzJ);
        if (abstractMap2 == null) {
            abstractMap2 = C17880vN.A11();
            size = 0;
        } else {
            size = abstractMap2.size();
        }
        C108955ca.A1V(cmm, abstractMap2, size);
        hashMap3.put(bzJ, abstractMap2);
    }
}
