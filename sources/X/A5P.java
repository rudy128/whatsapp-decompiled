package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class A5P {
    public int A00;
    public int A01;
    public Bitmap A02;
    public Bitmap A03;
    public C20079A6f A04;
    public Set A05 = C17880vN.A14();
    public AnonymousClass1D6 A06;
    public final AnonymousClass1DT A07 = AnonymousClass3MW.A0L();
    public final DAE A08;
    public final C189379iz A09;
    public final C129976ig A0A;
    public final A8P A0B;
    public final BF2 A0C;
    public final List A0D = AnonymousClass000.A13();
    public final List A0E = AnonymousClass000.A13();

    public A5P(DAE dae, C189379iz r5, C129976ig r6) {
        C18070vi.A0d(dae, 1);
        this.A08 = dae;
        this.A0A = r6;
        this.A09 = r5;
        this.A0B = new A8P(dae);
        Context context = dae.A0O;
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), 2131231047);
        C18070vi.A0X(decodeResource);
        this.A02 = decodeResource;
        Bitmap decodeResource2 = BitmapFactory.decodeResource(context.getResources(), 2131231782);
        C18070vi.A0X(decodeResource2);
        this.A03 = decodeResource2;
        this.A0C = new BF2(context);
        dae.A0V.add(new AI8(this, 1));
    }

    public static final void A01(D44 d44, A5P a5p) {
        Number A1C;
        A5P a5p2 = a5p;
        a5p2.A01 = 0;
        a5p2.A00 = 0;
        DAE dae = a5p2.A08;
        C26152CtJ ctJ = dae.A0R;
        C20278AEl aEl = ctJ.A06().A04;
        A8P a8p = a5p2.A0B;
        A64 a64 = a8p.A03;
        C199339zp A082 = a8p.A08(aEl, 60);
        HashSet A12 = C17880vN.A12();
        C188189h1 r3 = a64.A00;
        A64.A00(r3, a64, A082, A12);
        Iterator it = A12.iterator();
        while (it.hasNext()) {
            AF1 af1 = (AF1) ((C21345AiY) it.next()).A03;
            float f = af1.A06;
            float f2 = d44.A02;
            if (f > f2 && af1.A05 > f2) {
                Map map = a8p.A05;
                DA3 da3 = (DA3) map.get(af1);
                if (da3 != null) {
                    dae.A0C(da3);
                    a5p2.A0D.add(da3);
                    a8p.A06.remove(af1);
                    map.remove(af1);
                }
                it.remove();
            }
        }
        ArrayList A0m = C29431cG.A0m(C21486Akr.A00(C29431cG.A0t(A12), 11));
        Iterator it2 = A0m.iterator();
        while (it2.hasNext()) {
            C22405B6i b6i = ((C21345AiY) it2.next()).A03;
            AF1 af12 = (AF1) b6i;
            Set set = a8p.A06;
            if (set.size() < 5) {
                if (a8p.A02.A02().A02 >= af12.A06) {
                    Iterator it3 = set.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            set.add(af12);
                            break;
                        }
                        AF1 af13 = (AF1) it3.next();
                        if (!af13.equals(af12)) {
                            double A072 = a8p.A07(a8p.A00);
                            if (A8P.A05(A8P.A02(af13, a8p, A072), A8P.A02(af12, a8p, A072))) {
                                break;
                            }
                        }
                    }
                } else {
                    set.remove(af12);
                }
            }
            af12.A0A = set.contains(b6i);
        }
        Set<AF1> set2 = a8p.A06;
        for (AF1 af14 : set2) {
            double[] A062 = A8P.A06(af14.BXJ(), a8p);
            Context context = a8p.A01;
            float A002 = af14.A00(context);
            C18070vi.A0d(context, 0);
            float f3 = af14.A07;
            if (f3 == -1.0f) {
                f3 = AnonymousClass8BR.A01(context, 4.0f);
                af14.A07 = f3;
            }
            float f4 = af14.A02;
            if (f4 == -1.0f) {
                f4 = AnonymousClass8BR.A01(context, 120.0f);
                af14.A02 = f4;
            }
            float A012 = af14.A03 + af14.A00 + AnonymousClass8BR.A01(context, 3.0f);
            float A013 = AnonymousClass8BR.A01(context, 20.0f);
            float f5 = A013 / 2.0f;
            double A073 = a8p.A07((f3 * 2.0f) + f5 + A002 + f4 + A013);
            double A074 = a8p.A07(f5 + A012);
            double d = A062[0];
            double d2 = A062[1];
            C199339zp r18 = new C199339zp(d - A073, d2 - A074, d + A073, d2 + A074);
            HashSet A122 = C17880vN.A12();
            A64.A00(r3, a64, r18, A122);
            C199339zp A014 = A8P.A01(af14, a8p);
            HashSet A032 = A8P.A03(A8P.A00(af14, a8p), af14, a8p, A122);
            HashSet A033 = A8P.A03(A014, af14, a8p, A122);
            int size = A032.size();
            int size2 = A033.size();
            int i = 1;
            int i2 = af14.A08;
            if (size2 == 0 || size == 0) {
                if ((i2 == -1 && size2 == 0) || (size != 0 && i2 == 1)) {
                    i = 2;
                } else if (!(i2 == -1 && size == 0) && (size2 == 0 || i2 != 2)) {
                    i = i2;
                }
            } else if (i2 == -1) {
                if (size >= size2) {
                    A8P.A04(A0m, A033);
                    af14.A08 = 2;
                } else {
                    A8P.A04(A0m, A032);
                }
            } else if (i2 == 1) {
                A8P.A04(A0m, A032);
            } else {
                A8P.A04(A0m, A033);
            }
            af14.A08 = i;
        }
        ArrayList A0D2 = C29351c6.A0D(A0m);
        Iterator it4 = A0m.iterator();
        while (it4.hasNext()) {
            A0D2.add(((C21345AiY) it4.next()).A03);
        }
        Set A11 = C29431cG.A11(A0D2);
        a5p2.A05 = A11;
        AnonymousClass1D6 r0 = a5p2.A06;
        if (r0 != null) {
            A11.add(r0.first);
        }
        Set set3 = a5p2.A05;
        Map map2 = a8p.A05;
        C18070vi.A0X(map2);
        Iterator A15 = AnonymousClass000.A15(map2);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            if (!set3.contains(A16.getKey())) {
                dae.A0C((DA3) A16.getValue());
                List list = a5p2.A0D;
                Object value = A16.getValue();
                C18070vi.A0X(value);
                list.add(value);
                set2.remove(A16.getKey());
                A15.remove();
            }
        }
        for (AF1 af15 : a5p2.A05) {
            int A003 = a5p2.A00(d44, af15);
            boolean A022 = aEl.A02(af15.BXJ());
            if (A003 == 1) {
                if (A022) {
                    a5p2.A01++;
                }
            } else if (A022) {
                a5p2.A00++;
            }
        }
        C20079A6f a6f = a5p2.A04;
        if (a6f != null) {
            C20278AEl aEl2 = ctJ.A06().A04;
            C20269AEc A004 = aEl2.A00();
            Double d3 = a6f.A03;
            C17960vV.A07(d3);
            C18070vi.A0X(d3);
            double doubleValue = d3.doubleValue();
            Double d4 = a6f.A04;
            C17960vV.A07(d4);
            C18070vi.A0X(d4);
            if (C196579vI.A00(A004, new C20269AEc(doubleValue, d4.doubleValue())) > 3000.0f || ((A1C = C108945cZ.A1C(a5p2.A07)) != null && A1C.intValue() == 3)) {
                for (AF1 BXJ : a5p2.A05) {
                    if (aEl2.A02(BXJ.BXJ())) {
                        AnonymousClass1DT r2 = a5p2.A07;
                        Number A1C2 = C108945cZ.A1C(r2);
                        if (A1C2 != null && A1C2.intValue() == 3) {
                            AnonymousClass3MX.A1J(r2, 0);
                            return;
                        }
                        return;
                    }
                }
                AnonymousClass3MX.A1J(a5p2.A07, 3);
            }
        }
    }

    public final void A02() {
        this.A06 = null;
        this.A0E.clear();
        A8P a8p = this.A0B;
        C188189h1 r1 = a8p.A03.A00;
        r1.A07.clear();
        r1.A04 = true;
        r1.A01 = null;
        r1.A00 = null;
        r1.A03 = null;
        r1.A02 = null;
        Map map = a8p.A05;
        Iterator A0l = C17890vO.A0l(map);
        while (A0l.hasNext()) {
            DA3 da3 = (DA3) A0l.next();
            da3.A07.A0C(da3);
        }
        a8p.A06.clear();
        map.clear();
        this.A0D.clear();
    }

    public final void A05(AF1 af1, Integer num) {
        Object obj;
        AnonymousClass8KV r0;
        C18070vi.A0d(af1, 0);
        AnonymousClass1D6 r02 = this.A06;
        if (r02 != null) {
            obj = r02.first;
        } else {
            obj = null;
        }
        if (!C18070vi.A18(obj, af1)) {
            AnonymousClass1D6 r03 = this.A06;
            if (!(r03 == null || (r0 = (AnonymousClass8KV) r03.second) == null)) {
                r0.A0A();
            }
            A8P a8p = this.A0B;
            Map map = a8p.A05;
            if (map.get(af1) == null) {
                A00(this.A08.A02(), af1);
            }
            AnonymousClass8KV r4 = (AnonymousClass8KV) map.get(af1);
            if (r4 != null) {
                int i = 1;
                r4.A02.A09 = true;
                r4.A04 = true;
                Bitmap bitmap = r4.A01;
                BF2 bf2 = r4.A03;
                if (bitmap == null) {
                    bf2.A00();
                    AnonymousClass8KV.A01(r4);
                } else {
                    bf2.A02(bitmap);
                }
                if (r4.A00 == 2) {
                    i = 0;
                }
                float f = (float) i;
                if (r4.A02.A09) {
                    f = 2.0f;
                }
                DAE dae = r4.A07;
                dae.A0C(r4);
                r4.A02 = f;
                dae.A0B(r4);
                r4.A03();
                this.A06 = AnonymousClass1D6.A01(af1, r4);
                if (num != null) {
                    int intValue = num.intValue();
                    DAE dae2 = this.A08;
                    C199339zp A082 = a8p.A08(dae2.A0R.A06().A04, 0);
                    double A072 = a8p.A07((float) intValue);
                    double A073 = a8p.A07(AnonymousClass8BR.A01(dae2.A0O, 120.0f));
                    double d = A082.A00 - A082.A03;
                    C20291AEz aEz = r4.A02.A0B;
                    double d2 = aEz.A06;
                    double d3 = aEz.A07;
                    C20269AEc aEc = new C20269AEc(C26152CtJ.A02((C26152CtJ.A00(new C20269AEc(d2, d3).A00) - (((d - A072) / 2.0d) + (A073 / 2.0d))) + (d / 2.0d)), new C20269AEc(d2, d3).A01);
                    CXL cxl = new CXL();
                    cxl.A06 = aEc;
                    dae2.A0A(cxl, new AI6(), 300);
                }
            }
        }
    }

    private final int A00(D44 d44, AF1 af1) {
        AF1 af12 = af1;
        int i = 2;
        if (d44.A02 >= af12.A06) {
            i = 1;
        }
        if (!af12.A09) {
            Map map = this.A0B.A05;
            AnonymousClass8KV r7 = (AnonymousClass8KV) map.get(af12);
            if (r7 == null) {
                List list = this.A0D;
                if (AnonymousClass000.A1a(list)) {
                    r7 = (AnonymousClass8KV) list.remove(0);
                    r7.A02 = af12;
                    r7.A01 = null;
                    r7.A0B(3);
                    C20291AEz aEz = r7.A02.A0B;
                    r7.A00 = C26152CtJ.A01(aEz.A07);
                    r7.A01 = C26152CtJ.A00(aEz.A06);
                    r7.A09();
                    AnonymousClass8CJ r5 = r7.A0B;
                    r5.A0I = false;
                    r5.A0B = -1;
                    r5.A0C = -1;
                    r5.A0E = null;
                    AnonymousClass8KV.A00(r7);
                    String str = af12.A0B.A09.A02;
                    if (str != null) {
                        r5.A08 = Color.parseColor(str);
                    }
                    map.put(af12, r7);
                    this.A08.A0B(r7);
                } else {
                    DAE dae = this.A08;
                    r7 = new AnonymousClass8KV(this.A02, this.A03, dae, this.A09, this.A0A, af12, this.A0C);
                    map.put(af12, r7);
                    dae.A0B(r7);
                }
            }
            r7.A0B(i);
            boolean z = af12.A0A;
            AnonymousClass8CJ r1 = r7.A0B;
            r1.A0I = z;
            r1.A0A = af12.A08;
            r7.A09();
        }
        return i;
    }

    public final void A03() {
        AnonymousClass8KV r0;
        AnonymousClass1D6 r02 = this.A06;
        if (!(r02 == null || (r0 = (AnonymousClass8KV) r02.second) == null)) {
            Bitmap bitmap = r0.A01;
            if (bitmap == null) {
                AnonymousClass8KV.A01(r0);
            } else {
                r0.A03.A02(bitmap);
            }
        }
        DAE dae = this.A08;
        A01(dae.A02(), this);
        dae.A0Q.invalidate();
    }

    public final void A04(C20079A6f a6f, List list) {
        this.A04 = a6f;
        this.A0E.addAll(list);
        A8P a8p = this.A0B;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A64 a64 = a8p.A03;
            A64.A01(new C21345AiY((AF1) it.next(), new C21486Akr(12)), a64.A00, a64);
        }
        DAE dae = this.A08;
        A01(dae.A02(), this);
        dae.A0Q.invalidate();
    }

    public final void A06(List list) {
        LinkedHashSet<AF1> A14 = C17880vN.A14();
        A14.addAll(C29431cG.A0v(C21486Akr.A00(list, 10), 1));
        C198889z5 r4 = C198889z5.A00;
        DAE dae = this.A08;
        ArrayList A0E2 = C29351c6.A0E(A14);
        for (AF1 BXJ : A14) {
            A0E2.add(BXJ.BXJ());
        }
        r4.A00(dae, A0E2, false);
    }
}
