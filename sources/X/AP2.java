package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final /* synthetic */ class AP2 implements C22423B7f {
    public final /* synthetic */ C184169aW A00;
    public final /* synthetic */ C20272AEf A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ AnonymousClass1OS A04;

    public final void C2S() {
        C20272AEf aEf = this.A01;
        List list = this.A02;
        Map map = this.A03;
        AnonymousClass1OS r5 = this.A04;
        C18070vi.A0f(list, 2, r5);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator A15 = AnonymousClass000.A15(map);
        loop0:
        while (true) {
            int i = 0;
            if (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                Iterator A152 = AnonymousClass000.A15((Map) A16.getValue());
                while (true) {
                    if (A152.hasNext()) {
                        List list2 = (List) C17890vO.A0P(A152);
                        Iterator it = ((AEK) A16.getKey()).A04.iterator();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                int i4 = i2 + 1;
                                if (i2 < 0) {
                                    break loop0;
                                }
                                C20247ADf aDf = (C20247ADf) next;
                                if (i3 < list2.size()) {
                                    ArrayList arrayList = aEf.A03;
                                    float A042 = AnonymousClass000.A04(AnonymousClass8BS.A0Z(arrayList, aDf.A00));
                                    float A043 = AnonymousClass000.A04(AnonymousClass8BS.A0Z(arrayList, Math.max(0, i2 - ((AEK) A16.getKey()).A02)));
                                    C25411Oc A08 = C28851b7.A08(i3, C108955ca.A08(list2, aDf.A01));
                                    int i5 = A08.A00;
                                    int i6 = A08.A01;
                                    if (i5 <= i6) {
                                        while (true) {
                                            A13.add(new AF1((C20291AEz) list2.get(i5), A042, A043, false));
                                            if (i5 == i6) {
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                    i3 = A08.A01 + 1;
                                }
                                i2 = i4;
                            }
                        }
                    }
                }
            } else {
                List A002 = C21486Akr.A00(A13, 4);
                for (Object next2 : A002) {
                    int i7 = i + 1;
                    if (i >= 0) {
                        ((AF1) next2).A0B.A01 = i + 1;
                        i = i7;
                    }
                }
                r5.invoke(A002, list);
                return;
            }
        }
        AnonymousClass1ZU.A0B();
        throw null;
    }

    public /* synthetic */ AP2(C184169aW r1, C20272AEf aEf, List list, Map map, AnonymousClass1OS r5) {
        this.A00 = r1;
        this.A01 = aEf;
        this.A02 = list;
        this.A03 = map;
        this.A04 = r5;
    }
}
