package X;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class A8P {
    public final float A00;
    public final Context A01;
    public final DAE A02;
    public final A64 A03;
    public final List A04 = AnonymousClass000.A13();
    public final Map A05;
    public final Set A06 = C17880vN.A12();
    public final double[] A07 = new double[2];

    public static C199339zp A01(AF1 af1, A8P a8p) {
        AF1 af12 = af1;
        A8P a8p2 = a8p;
        double[] A062 = A06(af12.BXJ(), a8p2);
        Context context = a8p2.A01;
        C18070vi.A0d(context, 0);
        float A012 = af12.A03 + af12.A00 + AnonymousClass8BR.A01(context, 3.0f);
        float f = af12.A07;
        if (f == -1.0f) {
            f = AnonymousClass8BR.A01(context, 4.0f);
            af12.A07 = f;
        }
        float A002 = af12.A00(context);
        float A013 = AnonymousClass8BR.A01(context, 20.0f);
        double A072 = a8p2.A07(A012 / 2.0f);
        float f2 = A013 / 2.0f;
        return new C199339zp(A062[0] + a8p2.A07(f2), A062[1] - A072, a8p2.A07(f2 + A002 + f) + A062[0], A062[1] + A072);
    }

    public static boolean A05(C199339zp r5, C199339zp r6) {
        if (r6 == null || r5.A01 >= r6.A02 || r6.A01 >= r5.A02 || r5.A03 >= r6.A00 || r6.A03 >= r5.A00) {
            return false;
        }
        return true;
    }

    public static double[] A06(C20269AEc aEc, A8P a8p) {
        double[] dArr = a8p.A07;
        dArr[0] = C26152CtJ.A01(aEc.A01);
        dArr[1] = C26152CtJ.A00(aEc.A00);
        return dArr;
    }

    public double A07(float f) {
        DAE dae = this.A02;
        C26152CtJ ctJ = dae.A0R;
        float f2 = dae.A02().A02;
        return (double) (f / (((float) ((1 << ((int) f2)) * ctJ.A00.A0N)) * ((f2 % 1.0f) + 1.0f)));
    }

    public C199339zp A08(C20278AEl aEl, int i) {
        double A072 = A07(AnonymousClass8BR.A01(this.A01, (float) i));
        C20269AEc aEc = aEl.A01;
        C20269AEc aEc2 = aEl.A00;
        return new C199339zp(C26152CtJ.A01(aEc.A01) - A072, C26152CtJ.A00(aEc2.A00) - A072, C26152CtJ.A01(aEc2.A01) + A072, C26152CtJ.A00(aEc.A00) + A072);
    }

    public A8P(DAE dae) {
        this.A02 = dae;
        this.A03 = new A64();
        Context context = dae.A0O;
        this.A01 = context;
        this.A05 = C17880vN.A11();
        this.A00 = AnonymousClass8BR.A01(context, 80.0f);
    }

    public static C199339zp A00(AF1 af1, A8P a8p) {
        double[] A062 = A06(af1.BXJ(), a8p);
        Context context = a8p.A01;
        float A012 = AnonymousClass8BR.A01(context, 20.0f);
        C18070vi.A0d(context, 0);
        float A013 = af1.A03 + af1.A00 + AnonymousClass8BR.A01(context, 3.0f);
        float f = af1.A07;
        if (f == -1.0f) {
            f = AnonymousClass8BR.A01(context, 4.0f);
            af1.A07 = f;
        }
        float A002 = af1.A00(context);
        double A072 = a8p.A07(A013 / 2.0f);
        float f2 = A012 / 2.0f;
        return new C199339zp(A062[0] - a8p.A07((float) ((int) ((f2 + A002) + f))), A062[1] - A072, A062[0] - a8p.A07(f2), A062[1] + A072);
    }

    public static C199339zp A02(AF1 af1, A8P a8p, double d) {
        double[] A062 = A06(af1.BXJ(), a8p);
        double A072 = a8p.A07(AnonymousClass8BR.A01(a8p.A01, 20.0f) / 2.0f);
        double d2 = A062[0];
        double d3 = A062[1];
        return new C199339zp((d2 - A072) - d, (d3 - A072) - d, d2 + A072 + d, d3 + A072 + d);
    }

    public static HashSet A03(C199339zp r10, AF1 af1, A8P a8p, Set set) {
        HashSet A12 = C17880vN.A12();
        Double d = af1.A0B.A04;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C21345AiY aiY = (C21345AiY) it.next();
            AF1 af12 = (AF1) aiY.A03;
            Double d2 = af12.A0B.A04;
            if (!a8p.A06.contains(af12) || d == null || d2 == null || d2.doubleValue() > d.doubleValue()) {
                C199339zp A022 = A02(af12, a8p, 0.0d);
                C199339zp r1 = null;
                if (af12.A0A) {
                    if (af12.A08 == 2) {
                        r1 = A01(af12, a8p);
                    } else {
                        r1 = A00(af12, a8p);
                    }
                }
                if (A05(r10, A022) || A05(r10, r1)) {
                    A12.add(aiY);
                }
            }
        }
        return A12;
    }

    public static void A04(List list, Set set) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (set.contains(listIterator.next())) {
                listIterator.remove();
            }
        }
    }
}
