package com.whatsapp.pininchat.banner;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11P;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass22C;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4YP;
import X.C137196v4;
import X.C17880vN;
import X.C18070vi;
import X.C29431cG;
import X.C41111vp;
import X.C41681wt;
import X.C41731wy;
import X.C56952iI;
import X.C63892tr;
import X.C86974Tu;
import X.C98954rz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PinInChatBannerViewModel extends AnonymousClass1J2 {
    public Runnable A00;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass1KB A02;
    public final C41111vp A03 = AnonymousClass3MW.A0n(new C86974Tu(0, 0));
    public final C41731wy A04 = AnonymousClass3MW.A0o();
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final LinkedHashMap A07 = C17880vN.A13();
    public final AnonymousClass11P A08;

    public final void A0T(List list) {
        AnonymousClass205 r0;
        C41111vp r1;
        C86974Tu r02;
        Integer num;
        AnonymousClass22C A032;
        AnonymousClass205 r03;
        AnonymousClass205 r04;
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A02.A0I(runnable);
        }
        AnonymousClass205 r12 = null;
        this.A00 = null;
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AnonymousClass4YP r4 = (AnonymousClass4YP) it.next();
            Integer num2 = r4.A02;
            int intValue = num2.intValue();
            if (intValue == 4 || intValue == 0 || intValue == 3) {
                LinkedHashMap linkedHashMap = this.A07;
                AnonymousClass206 r13 = r4.A00;
                AnonymousClass205 r2 = r13.A0v;
                if (!linkedHashMap.containsKey(r2)) {
                    linkedHashMap.put(r2, r13);
                    if (num2 == AnonymousClass00R.A00 && (A032 = C63892tr.A03(r13)) != null && (r03 = A032.A0v) != null && r03.A02) {
                        r12 = r2;
                    }
                    z = true;
                }
                if (linkedHashMap.size() > ((C56952iI) this.A05.get()).A00()) {
                    ArrayList A13 = AnonymousClass000.A13();
                    Iterator A15 = AnonymousClass000.A15(linkedHashMap);
                    while (A15.hasNext()) {
                        Map.Entry A16 = AnonymousClass000.A16(A15);
                        AnonymousClass22C A033 = C63892tr.A03((AnonymousClass206) A16.getValue());
                        if (A033 == null || A033.A1D(this.A08)) {
                            A13.add(A16.getKey());
                        }
                    }
                    Iterator it2 = A13.iterator();
                    C18070vi.A0X(it2);
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        C18070vi.A0X(next);
                        linkedHashMap.remove(next);
                    }
                }
            } else {
                if (intValue != 2) {
                    LinkedHashMap linkedHashMap2 = this.A07;
                    AnonymousClass205 r14 = r4.A00.A0v;
                    if (linkedHashMap2.containsKey(r14)) {
                        linkedHashMap2.remove(r14);
                    }
                } else {
                    AnonymousClass205 r3 = r4.A01;
                    LinkedHashMap linkedHashMap3 = this.A07;
                    if (linkedHashMap3.containsKey(r3)) {
                        C41681wt.A03(linkedHashMap3).remove(r3);
                        AnonymousClass206 r05 = r4.A00;
                        AnonymousClass205 r15 = r05.A0v;
                        C18070vi.A0W(r15);
                        linkedHashMap3.put(r15, r05);
                        if (r12 == null && r3 != null) {
                            AnonymousClass206 A0r = AnonymousClass3MX.A0r(this.A01);
                            if (A0r != null) {
                                r04 = A0r.A0v;
                            } else {
                                r04 = null;
                            }
                            if (r3.equals(r04)) {
                                r12 = r15;
                            }
                        }
                    }
                }
                z = true;
            }
        }
        if (z) {
            LinkedHashMap linkedHashMap4 = this.A07;
            if (linkedHashMap4.size() > 1) {
                if (((C56952iI) this.A05.get()).A00() > 1) {
                    num = AnonymousClass00R.A00;
                } else {
                    num = AnonymousClass00R.A01;
                }
                Set entrySet = linkedHashMap4.entrySet();
                C18070vi.A0X(entrySet);
                List A0y = C29431cG.A0y(entrySet, new C98954rz(this, num, 3));
                linkedHashMap4.clear();
                Iterator it3 = A0y.iterator();
                while (it3.hasNext()) {
                    Map.Entry A162 = AnonymousClass000.A16(it3);
                    C18070vi.A0b(A162);
                    Object key = A162.getKey();
                    C18070vi.A0X(key);
                    Object value = A162.getValue();
                    C18070vi.A0X(value);
                    linkedHashMap4.put(key, value);
                }
            }
            Collection values = linkedHashMap4.values();
            C18070vi.A0X(values);
            List A0t = C29431cG.A0t(values);
            AnonymousClass00H r16 = this.A05;
            List A10 = C29431cG.A10(A0t, ((C56952iI) r16.get()).A00());
            if (A10.isEmpty()) {
                C137196v4.A01(this.A01, (Object) null);
                r1 = this.A03;
                r02 = new C86974Tu(0, 0);
            } else if (((C56952iI) r16.get()).A00() == 1) {
                C137196v4.A01(this.A01, A10.get(AnonymousClass3MX.A02(A10, 1)));
                r1 = this.A03;
                r02 = new C86974Tu(1, 0);
            } else {
                int A022 = AnonymousClass3MX.A02(A10, 1);
                Object obj = A10.get(A022);
                C18070vi.A0X(obj);
                AnonymousClass1DT r6 = this.A01;
                AnonymousClass206 A0r2 = AnonymousClass3MX.A0r(r6);
                int size = A10.size();
                AnonymousClass206 r142 = null;
                int i = -1;
                int i2 = -1;
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj2 = A10.get(i3);
                    C18070vi.A0X(obj2);
                    AnonymousClass206 r17 = (AnonymousClass206) obj2;
                    if (C18070vi.A18(r17.A0v, r12)) {
                        i2 = i3;
                        r142 = r17;
                    }
                    AnonymousClass205 r18 = r17.A0v;
                    if (A0r2 != null) {
                        r0 = A0r2.A0v;
                    } else {
                        r0 = null;
                    }
                    if (C18070vi.A18(r18, r0)) {
                        i = i3;
                    }
                }
                if (r142 != null) {
                    obj = r142;
                    A022 = i2;
                } else if (!(i == -1 || A0r2 == null)) {
                    obj = A0r2;
                    A022 = i;
                }
                C137196v4.A01(r6, obj);
                this.A03.A0G(new C86974Tu(A10.size(), A022));
                return;
            }
            r1.A0G(r02);
        }
    }

    public PinInChatBannerViewModel(AnonymousClass1KB r3, AnonymousClass11P r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0s(r4, r3, r5, r6);
        this.A08 = r4;
        this.A02 = r3;
        this.A05 = r5;
        this.A06 = r6;
    }
}
