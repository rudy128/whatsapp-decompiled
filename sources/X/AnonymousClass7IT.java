package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.7IT  reason: invalid class name */
public class AnonymousClass7IT implements AnonymousClass8AO {
    public final Map A00;
    public final Map A01;
    public final AnonymousClass1KW A02;
    public final AnonymousClass7IU A03;
    public final C1193367s A04;
    public final Map A05 = C17880vN.A11();

    public synchronized void A01(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A00((AnonymousClass8B0) it.next(), this.A01);
        }
    }

    public Collection BL5(String str, int i, boolean z) {
        HashMap A11 = C17880vN.A11();
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = this.A04.A05().iterator();
        while (it.hasNext()) {
            AnonymousClass8B0 r1 = (AnonymousClass8B0) it.next();
            if (r1 instanceof AnonymousClass7JE) {
                A00(r1, A11);
            }
            A13.addAll(Arrays.asList(r1.BRD()));
        }
        ArrayList A022 = this.A03.A02(str, A13, AnonymousClass000.A13(), i, false);
        LinkedHashSet A14 = C17880vN.A14();
        LinkedHashSet A142 = C17880vN.A14();
        ArrayList A0z = C17880vN.A0z(4);
        A0z.add(A11);
        A0z.add(this.A00);
        A0z.add(this.A01);
        A0z.add(this.A05);
        synchronized (this) {
            Iterator it2 = A0z.iterator();
            while (it2.hasNext()) {
                Map map = (Map) it2.next();
                Iterator it3 = A022.iterator();
                while (it3.hasNext()) {
                    Collection<AnonymousClass8B0> collection = (Collection) map.get((AnonymousClass737) it3.next());
                    if (collection != null) {
                        for (AnonymousClass8B0 r12 : collection) {
                            if (r12 instanceof AnonymousClass7JE) {
                                A142.add(r12);
                            } else {
                                A14.add(r12);
                            }
                        }
                    }
                }
            }
        }
        Iterator it4 = A022.iterator();
        while (it4.hasNext()) {
            A14.add(new AnonymousClass7JD((AnonymousClass737) it4.next(), this.A02));
        }
        LinkedHashSet linkedHashSet = A142;
        if (z) {
            linkedHashSet = A14;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashSet);
        if (z) {
            A14 = A142;
        }
        linkedHashSet2.addAll(A14);
        return linkedHashSet2;
    }

    public void BEs() {
        this.A03.BEs();
    }

    public Collection BL6(String[] strArr) {
        C17960vV.A0F(false, "Not implemented");
        return AnonymousClass000.A13();
    }

    public void CJF(boolean z) {
        this.A03.CJF(z);
    }

    public int getCount() {
        return this.A03.getCount();
    }

    public AnonymousClass7IT(AnonymousClass1KW r4, AnonymousClass7IU r5, C18030ve r6, C1193367s r7) {
        this.A02 = r4;
        this.A04 = r7;
        this.A03 = r5;
        Iterator it = AnonymousClass711.A00(r6).iterator();
        while (it.hasNext()) {
            A00((AnonymousClass8B0) it.next(), this.A05);
        }
        this.A00 = C17880vN.A11();
        this.A01 = C17880vN.A11();
    }

    public static void A00(AnonymousClass8B0 r5, Map map) {
        for (AnonymousClass737 r1 : r5.BRD()) {
            Collection collection = (Collection) map.get(r1);
            if (collection == null) {
                collection = C17880vN.A14();
                map.put(r1, collection);
            }
            collection.add(r5);
        }
    }
}
