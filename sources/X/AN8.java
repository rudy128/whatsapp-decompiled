package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class AN8 implements BAH {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AN8(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public /* bridge */ /* synthetic */ void Btw() {
        C190829la r0 = (C190829la) this.A01;
        AnonymousClass907.A00(r0.A00, r0.A01, AnonymousClass1D7.A0I(), false);
    }

    public /* bridge */ /* synthetic */ void C7i(Object obj) {
        C190829la r2;
        AnonymousClass1D6 r0;
        HashMap hashMap;
        String str;
        switch (this.A00) {
            case 0:
                AN7 an7 = (AN7) obj;
                C18070vi.A0d(an7, 1);
                r2 = (C190829la) this.A01;
                AnonymousClass9C4 r8 = (AnonymousClass9C4) this.A02;
                boolean isEmpty = r8.A00().isEmpty();
                hashMap = C17880vN.A11();
                HashMap A11 = C17880vN.A11();
                HashMap A112 = C17880vN.A11();
                for (C193519qE r4 : an7.A01) {
                    C195139sr r1 = r4.A00;
                    String str2 = r1.A01;
                    if (A11.get(str2) == null) {
                        A11.put(str2, r8.A00.A01(r1));
                    }
                    if (A112.get(str2) == null) {
                        A112.put(str2, AnonymousClass000.A13());
                    }
                    HashSet A12 = C17880vN.A12();
                    for (C195139sr r42 : r4.A01) {
                        String str3 = r42.A01;
                        if (A11.get(str3) == null) {
                            A11.put(str3, r8.A00.A01(r42));
                        }
                        A12.add(str3);
                    }
                    AbstractCollection abstractCollection = (AbstractCollection) A112.get(str2);
                    if (abstractCollection != null) {
                        abstractCollection.addAll(A12);
                    }
                }
                hashMap.put("categories_map", A11);
                hashMap.put("sub_categories", A112);
                if (isEmpty) {
                    HashSet A122 = AnonymousClass8BR.A12(A112.keySet());
                    Iterator A0j = C17890vO.A0j(A112);
                    while (A0j.hasNext()) {
                        ArrayList arrayList = (ArrayList) A0j.next();
                        C18070vi.A0b(arrayList);
                        A122.removeAll(C29431cG.A12(arrayList));
                    }
                    hashMap.put("top_categories", C29431cG.A0t(A122));
                }
                str = "categories";
                break;
            case 1:
            case 2:
                AN5 an5 = (AN5) obj;
                C18070vi.A0d(an5, 1);
                r2 = (C190829la) this.A01;
                C19950A0h a0h = ((AnonymousClass9C5) this.A02).A00;
                hashMap = C17880vN.A11();
                ArrayList A13 = AnonymousClass000.A13();
                Iterator it = an5.A03.iterator();
                while (it.hasNext()) {
                    A13.add(a0h.A02(AnonymousClass8BS.A0B(it)));
                }
                hashMap.put("products", A13);
                String str4 = an5.A02.A00;
                if (str4 == null) {
                    str4 = "-1";
                }
                hashMap.put("paging", C108975cc.A0h("after", str4));
                str = "product_catalog";
                break;
            case 3:
                C20287AEv aEv = (C20287AEv) obj;
                C18070vi.A0d(aEv, 1);
                r2 = (C190829la) this.A01;
                r0 = AnonymousClass1D6.A01("product_detail", ((AnonymousClass9C6) this.A02).A00.A02(aEv));
                break;
            case 6:
                AN6 an6 = (AN6) obj;
                ArrayList A16 = C108955ca.A16(an6, 1);
                List list = an6.A01;
                if (list != null) {
                    AnonymousClass9C8 r3 = (AnonymousClass9C8) this.A02;
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        A16.add(r3.A00.A02(AnonymousClass8BS.A0B(it2)));
                    }
                }
                ((C190829la) this.A01).A00(C108975cc.A0h("products", A16));
                return;
            default:
                AN4 an4 = (AN4) obj;
                C18070vi.A0d(an4, 1);
                r2 = (C190829la) this.A01;
                C19950A0h a0h2 = ((AnonymousClass9C7) this.A02).A00;
                hashMap = C17880vN.A11();
                ArrayList A132 = AnonymousClass000.A13();
                Iterator it3 = an4.A02.A04.iterator();
                while (it3.hasNext()) {
                    A132.add(a0h2.A02(AnonymousClass8BS.A0B(it3)));
                }
                hashMap.put("products", A132);
                String str5 = an4.A01.A00;
                if (str5 == null) {
                    str5 = "-1";
                }
                hashMap.put("paging", C108975cc.A0h("after", str5));
                str = "product_list";
                break;
        }
        r0 = AnonymousClass1D6.A01(str, hashMap);
        r2.A00(C200610r.A04(r0));
    }
}
