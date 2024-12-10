package X;

import java.util.ArrayList;

/* renamed from: X.1uv  reason: invalid class name and case insensitive filesystem */
public abstract class C40571uv {
    public static final C40111uB A00 = C40111uB.A01("k", "x", "y");

    public static C40601uy A00(C39801tf r9, C39941tt r10) {
        ArrayList arrayList = new ArrayList();
        C39941tt r5 = r10;
        if (r10.A0B() == AnonymousClass00R.A00) {
            r10.A0F();
            while (r10.A0M()) {
                boolean z = false;
                if (r10.A0B() == AnonymousClass00R.A0C) {
                    z = true;
                }
                C39801tf r3 = r9;
                arrayList.add(new C40591ux(r9, C40331uX.A01(r3, C40581uw.A00, r5, C40171uH.A00(), z, false)));
            }
            r10.A0H();
            C40321uW.A01(arrayList);
        } else {
            arrayList.add(new C40511up(C40491un.A02(r10, C40171uH.A00())));
        }
        return new C40601uy(arrayList);
    }

    public static C40521uq A01(C39801tf r7, C39941tt r8) {
        r8.A0G();
        C40601uy r6 = null;
        C40561uu r4 = null;
        C40561uu r3 = null;
        boolean z = false;
        while (r8.A0B() != AnonymousClass00R.A0N) {
            int A09 = r8.A09(A00);
            if (A09 != 0) {
                if (A09 != 1) {
                    if (A09 != 2) {
                        r8.A0J();
                        r8.A0K();
                    } else if (r8.A0B() != AnonymousClass00R.A0j) {
                        r3 = C40291uT.A01(r7, r8, true);
                    }
                } else if (r8.A0B() != AnonymousClass00R.A0j) {
                    r4 = C40291uT.A01(r7, r8, true);
                }
                r8.A0K();
                z = true;
            } else {
                r6 = A00(r7, r8);
            }
        }
        r8.A0I();
        if (z) {
            r7.A02("Lottie doesn't support expressions.");
        }
        if (r6 != null) {
            return r6;
        }
        return new C40671v5(r4, r3);
    }
}
