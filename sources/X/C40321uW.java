package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1uW  reason: invalid class name and case insensitive filesystem */
public abstract class C40321uW {
    public static C40111uB A00 = C40111uB.A01("k");

    public static ArrayList A00(C39801tf r8, C40301uU r9, C39941tt r10, float f, boolean z) {
        ArrayList arrayList = new ArrayList();
        C39941tt r5 = r10;
        C39801tf r3 = r8;
        if (r10.A0B() == AnonymousClass00R.A0j) {
            r8.A02("Lottie doesn't support expressions.");
            return arrayList;
        }
        r10.A0G();
        while (r10.A0M()) {
            if (r10.A09(A00) != 0) {
                r10.A0K();
            } else {
                C40301uU r4 = r9;
                float f2 = f;
                if (r10.A0B() == AnonymousClass00R.A00) {
                    r10.A0F();
                    if (r10.A0B() == AnonymousClass00R.A0u) {
                        C40111uB r0 = C40331uX.A00;
                        arrayList.add(new C40511up(r9.CB7(r10, f)));
                    } else {
                        while (r10.A0M()) {
                            arrayList.add(C40331uX.A01(r3, r4, r5, f2, true, z));
                        }
                    }
                    r10.A0H();
                } else {
                    C40111uB r02 = C40331uX.A00;
                    arrayList.add(new C40511up(r9.CB7(r10, f)));
                }
            }
        }
        r10.A0I();
        A01(arrayList);
        return arrayList;
    }

    public static void A01(List list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            C40511up r2 = (C40511up) list.get(i);
            C40511up r1 = (C40511up) list.get(i + 1);
            r2.A06 = Float.valueOf(r1.A0A);
            if (r2.A07 == null && r1.A0E != null) {
                r2.A07 = r1.A0E;
                if (r2 instanceof C40591ux) {
                    ((C40591ux) r2).A03();
                }
            }
        }
        C40511up r12 = (C40511up) list.get(size - 1);
        if ((r12.A0E == null || r12.A07 == null) && list.size() > 1) {
            list.remove(r12);
        }
    }
}
