package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A64 {
    public static final C199339zp A03 = new C199339zp(0.0d, 0.0d, 1.0d, 1.0d);
    public final C188189h1 A00 = new C188189h1(A03, 0);
    public final C199339zp A01 = new Object();
    public final double[] A02 = new double[2];

    public static void A00(C188189h1 r19, A64 a64, C199339zp r21, Collection collection) {
        C199339zp r13 = r21;
        double d = r13.A01;
        double d2 = r13.A02;
        C188189h1 r14 = r19;
        A64 a642 = a64;
        Collection collection2 = collection;
        if (d > d2) {
            C199339zp r2 = a642.A01;
            r2.A03 = r13.A03;
            r2.A00 = r13.A00;
            r2.A01 = d;
            r2.A02 = d2;
            r2.A02 = 1.0d;
            A00(r14, a642, r2, collection2);
            r2.A03 = r13.A03;
            r2.A00 = r13.A00;
            r2.A01 = r13.A01;
            r2.A02 = r13.A02;
            r2.A01 = 0.0d;
            A00(r14, a642, r2, collection2);
            return;
        }
        C199339zp r15 = r14.A06;
        double d3 = r15.A01;
        double d4 = d3;
        if (d3 <= d2) {
            double d5 = r15.A02;
            double d6 = d5;
            if (d <= d5) {
                double d7 = r15.A03;
                double d8 = r13.A00;
                if (d7 <= d8) {
                    double d9 = r13.A03;
                    double d10 = r15.A00;
                    if (d9 > d10) {
                        return;
                    }
                    if (!r14.A04) {
                        A64 a643 = a642;
                        A00(r14.A01, a643, r13, collection2);
                        A00(r14.A00, a643, r13, collection2);
                        A00(r14.A03, a643, r13, collection2);
                        A00(r14.A02, a643, r13, collection2);
                        return;
                    }
                    boolean z = false;
                    if (d9 <= d8 && d <= d4 && d6 <= d2 && d10 <= d8 && d9 <= d7) {
                        z = true;
                    }
                    ArrayList arrayList = r14.A07;
                    if (z) {
                        collection2.addAll(arrayList);
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C21345AiY aiY = (C21345AiY) it.next();
                        double[] dArr = a642.A02;
                        aiY.A00(dArr);
                        double d11 = dArr[0];
                        double d12 = dArr[1];
                        double d13 = r13.A01;
                        double d14 = r13.A02;
                        if (d13 <= d14) {
                            double d15 = r13.A03;
                            double d16 = r13.A00;
                            if (d15 <= d16 && d13 <= d11 && d11 <= d14 && d15 <= d12 && d12 <= d16) {
                                collection2.add(aiY);
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean A01(C21345AiY aiY, C188189h1 r29, A64 a64) {
        int i;
        A64 a642 = a64;
        double[] dArr = a642.A02;
        C21345AiY aiY2 = aiY;
        aiY2.A00(dArr);
        C188189h1 r10 = r29;
        C199339zp r8 = r10.A06;
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = r8.A01;
        double d4 = r8.A02;
        if (d3 <= d4) {
            double d5 = r8.A03;
            double d6 = r8.A00;
            if (d5 <= d6 && d3 <= d && d <= d4 && d5 <= d2 && d2 <= d6) {
                if (r10.A04) {
                    ArrayList arrayList = r10.A07;
                    if (arrayList.size() < 40 || (i = r10.A05) > 20) {
                        arrayList.add(aiY2);
                        return true;
                    }
                    double d7 = r8.A01;
                    double d8 = r8.A02;
                    double d9 = (d7 + d8) * 0.5d;
                    double d10 = r8.A03;
                    double d11 = (d10 + r8.A00) * 0.5d;
                    int i2 = i + 1;
                    r10.A00 = new C188189h1(new C199339zp(d9, d10, d8, d11), i2);
                    r10.A03 = new C188189h1(new C199339zp(r8.A01, d11, d9, r8.A00), i2);
                    r10.A01 = new C188189h1(new C199339zp(r8.A01, r8.A03, d9, d11), i2);
                    r10.A02 = new C188189h1(new C199339zp(d9, d11, r8.A02, r8.A00), i2);
                    r10.A04 = false;
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        C21345AiY aiY3 = (C21345AiY) arrayList.get(i3);
                        if (!A01(aiY3, r10.A01, a642) && !A01(aiY3, r10.A00, a642) && !A01(aiY3, r10.A03, a642)) {
                            A01(aiY3, r10.A02, a642);
                        }
                    }
                    arrayList.clear();
                }
                if (!A01(aiY2, r10.A01, a642) && !A01(aiY2, r10.A00, a642) && !A01(aiY2, r10.A03, a642)) {
                    if (!A01(aiY2, r10.A02, a642)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
