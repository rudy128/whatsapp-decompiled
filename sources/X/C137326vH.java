package X;

import android.content.Context;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.6vH  reason: invalid class name and case insensitive filesystem */
public abstract class C137326vH {
    public static final C25186Cac A00(Context context, AnonymousClass72S r4) {
        C26052CrM crM;
        C25186Cac cac;
        synchronized (r4) {
            crM = r4.A05;
        }
        if (crM != null) {
            cac = crM.A02();
        } else {
            cac = new C25186Cac();
        }
        if (r4.A0U()) {
            A01(context, cac, r4.A0C(), true);
        }
        return cac;
    }

    public static final void A01(Context context, C25186Cac cac, File file, boolean z) {
        Collection values;
        LinkedHashSet<C25833Cmm> A14 = C17880vN.A14();
        C24322BzJ bzJ = C24322BzJ.AUDIO;
        HashMap hashMap = cac.A02;
        Map map = (Map) hashMap.get(bzJ);
        if (!(map == null || (values = map.values()) == null)) {
            A14.addAll(values);
        }
        hashMap.remove(bzJ);
        cac.A00.remove(bzJ);
        Collection collection = null;
        HashMap A06 = CDC.A00(context, file).A06(bzJ);
        if (A06 != null) {
            collection = A06.values();
        }
        if (z) {
            if (collection != null) {
                A14.removeAll(C29431cG.A12(collection));
            }
        } else if (collection != null) {
            for (Object next : collection) {
                if (!A14.contains(next)) {
                    C18070vi.A0b(next);
                    A14.add(next);
                }
            }
        }
        for (C25833Cmm A02 : A14) {
            cac.A02(A02);
        }
    }
}
