package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1b2  reason: invalid class name */
public abstract class AnonymousClass1b2 extends AnonymousClass1b1 {
    public static final C147157Sa A09(C22821Di r2, AnonymousClass1JQ r3) {
        return new C147157Sa(r2, r3, true);
    }

    public static final C147157Sa A0A(C22821Di r1, AnonymousClass1JQ r2) {
        C18070vi.A0d(r2, 0);
        return A0B(new AnonymousClass1b3(r1, r2));
    }

    public static final AnonymousClass1b3 A0C(C22821Di r1, AnonymousClass1JQ r2) {
        C18070vi.A0d(r2, 0);
        return new AnonymousClass1b3(r1, r2);
    }

    public static final String A05(CharSequence charSequence, C22821Di r7, AnonymousClass1JQ r8) {
        C18070vi.A0d(charSequence, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        int i = 0;
        for (Object next : r8) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AnonymousClass1Y6.A00(sb, next, r7);
        }
        sb.append("");
        String obj = sb.toString();
        C18070vi.A0X(obj);
        return obj;
    }

    public static final List A07(AnonymousClass1JQ r3) {
        ArrayList arrayList = new ArrayList();
        for (Object add : r3) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public static final C147157Sa A0B(AnonymousClass1JQ r3) {
        return new C147157Sa(AnonymousClass3J4.A00, r3, false);
    }

    public static final Object A04(AnonymousClass1JQ r1) {
        Iterator it = r1.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final List A06(AnonymousClass1JQ r3) {
        Iterator it = r3.iterator();
        if (!it.hasNext()) {
            return C18460wS.A00;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            List singletonList = Collections.singletonList(next);
            C18070vi.A0X(singletonList);
            return singletonList;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = it.next();
        }
    }

    public static final Set A08(AnonymousClass1JQ r3) {
        Iterator it = r3.iterator();
        if (!it.hasNext()) {
            return C25511Om.A00;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Set singleton = Collections.singleton(next);
            C18070vi.A0X(singleton);
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            linkedHashSet.add(next);
            if (!it.hasNext()) {
                return linkedHashSet;
            }
            next = it.next();
        }
    }
}
