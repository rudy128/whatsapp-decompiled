package X;

import android.graphics.Region;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Qs  reason: invalid class name and case insensitive filesystem */
public abstract class C05170Qs {
    public static final AnonymousClass0NU A00 = new AnonymousClass0NU(0.0f, 0.0f, 10.0f, 10.0f);

    public static final String A02(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static final boolean A09(AnonymousClass0KP r4, Object obj) {
        if (r4 != obj) {
            if (obj instanceof AnonymousClass0KP) {
                AnonymousClass0KP r5 = (AnonymousClass0KP) obj;
                if (C18070vi.A18(r4.A00, r5.A00)) {
                    C18080vj A002 = r4.A00();
                    C18080vj A003 = r5.A00();
                    if (A002 == null) {
                        if (A003 != null) {
                            return false;
                        }
                    } else if (A003 == null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1.A08 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(android.graphics.Region r9, android.graphics.Region r10, X.C05060Qg r11, X.C05060Qg r12, java.util.Map r13) {
        /*
            X.0XV r1 = r12.A03
            X.0Ok r0 = r1.A0Q
            X.0AK r0 = r0.A0G
            boolean r0 = r0.A08
            r3 = 1
            if (r0 == 0) goto L_0x0010
            X.0to r0 = r1.A08
            r2 = 0
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r2 = 1
        L_0x0011:
            r5 = r9
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x001e
            int r1 = r12.A02
            int r0 = r11.A02
            if (r1 != r0) goto L_0x0024
        L_0x001e:
            if (r2 == 0) goto L_0x0025
            boolean r0 = r12.A00
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            return
        L_0x0025:
            X.0NU r1 = r12.A0E()
            float r0 = r1.A01
            int r6 = X.C22339B3q.A01(r0)
            float r0 = r1.A03
            int r7 = X.C22339B3q.A01(r0)
            float r0 = r1.A02
            int r8 = X.C22339B3q.A01(r0)
            float r0 = r1.A00
            int r9 = X.C22339B3q.A01(r0)
            r10.set(r6, r7, r8, r9)
            int r2 = r12.A02
            int r0 = r11.A02
            r4 = -1
            if (r2 != r0) goto L_0x004c
            r2 = -1
        L_0x004c:
            android.graphics.Region$Op r0 = android.graphics.Region.Op.INTERSECT
            boolean r0 = r10.op(r5, r0)
            if (r0 == 0) goto L_0x0088
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.graphics.Rect r1 = r10.getBounds()
            X.0HU r0 = new X.0HU
            r0.<init>(r1, r12)
            r13.put(r2, r0)
            r0 = 0
            java.util.List r2 = X.C05060Qg.A03(r12, r0, r3)
            int r1 = r2.size()
            int r1 = r1 - r3
        L_0x006e:
            if (r4 >= r1) goto L_0x007c
            java.lang.Object r0 = r2.get(r1)
            X.0Qg r0 = (X.C05060Qg) r0
            A06(r5, r10, r11, r0, r13)
            int r1 = r1 + -1
            goto L_0x006e
        L_0x007c:
            boolean r0 = A0E(r12)
            if (r0 == 0) goto L_0x0024
            android.graphics.Region$Op r10 = android.graphics.Region.Op.DIFFERENCE
            r5.op(r6, r7, r8, r9, r10)
            return
        L_0x0088:
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x00cf
            X.0Qg r1 = r12.A0J()
            if (r1 == 0) goto L_0x00cc
            X.0XV r0 = r1.A03
            if (r0 == 0) goto L_0x00cc
            X.0Ok r0 = r0.A0Q
            X.0AK r0 = r0.A0G
            boolean r0 = r0.A08
            if (r0 != r3) goto L_0x00cc
            X.0NU r1 = r1.A0C()
        L_0x00a2:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            float r0 = r1.A01
            int r4 = X.C22339B3q.A01(r0)
            float r0 = r1.A03
            int r3 = X.C22339B3q.A01(r0)
            float r0 = r1.A02
            int r2 = X.C22339B3q.A01(r0)
            float r0 = r1.A00
            int r0 = X.C22339B3q.A01(r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r4, r3, r2, r0)
            X.0HU r0 = new X.0HU
            r0.<init>(r1, r12)
            r13.put(r5, r0)
            return
        L_0x00cc:
            X.0NU r1 = A00
            goto L_0x00a2
        L_0x00cf:
            if (r2 != r4) goto L_0x0024
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.graphics.Rect r1 = r10.getBounds()
            X.0HU r0 = new X.0HU
            r0.<init>(r1, r12)
            r13.put(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05170Qs.A06(android.graphics.Region, android.graphics.Region, X.0Qg, X.0Qg, java.util.Map):void");
    }

    public static final void A07(AnonymousClass05F r2, int i) {
        Object obj;
        Iterator it = r2.A00.entrySet().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (((AnonymousClass0XV) ((Map.Entry) obj).getKey()).A01 != i);
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            entry.getValue();
        }
    }

    public static final AnonymousClass0XV A00(AnonymousClass0XV r1, C22821Di r2) {
        do {
            r1 = r1.A0I();
            if (r1 == null) {
                return null;
            }
        } while (!AnonymousClass000.A1Y(r2.invoke(r1)));
        return r1;
    }

    public static final String A03(C05060Qg r1) {
        List list = (List) AnonymousClass0FY.A00(r1.A0H(), C03150Gu.A02);
        if (list != null) {
            return (String) C29431cG.A0c(list);
        }
        return null;
    }

    public static final String A04(C05060Qg r1) {
        List list = (List) AnonymousClass0FY.A00(r1.A0H(), C03150Gu.A0O);
        if (list != null) {
            return C25294Ccw.A00("\n", list);
        }
        return null;
    }

    public static final LinkedHashMap A05(AnonymousClass0I2 r6) {
        C05060Qg A002 = r6.A00();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnonymousClass0XV r1 = A002.A03;
        if (r1.A0Q.A0G.A08 && r1.A08 != null) {
            AnonymousClass0NU A0C = A002.A0C();
            A06(new Region(C22339B3q.A01(A0C.A01), C22339B3q.A01(A0C.A03), C22339B3q.A01(A0C.A02), C22339B3q.A01(A0C.A00)), new Region(), A002, A002, linkedHashMap);
        }
        return linkedHashMap;
    }

    public static final boolean A08(AnonymousClass0XV r3, AnonymousClass0XV r4) {
        AnonymousClass0XV A0I = r4.A0I();
        if (A0I == null) {
            return false;
        }
        if (A0I.equals(r3) || A08(r3, A0I)) {
            return true;
        }
        return false;
    }

    public static final /* synthetic */ boolean A0A(C06370Yb r2, C05060Qg r3) {
        Iterator it = r2.iterator();
        while (it.hasNext()) {
            if (!r3.A0G().A0B((AnonymousClass0PS) AnonymousClass000.A16(it).getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0B(C05060Qg r1) {
        return AnonymousClass000.A1X(AnonymousClass0FY.A00(r1.A0G(), C03150Gu.A03));
    }

    public static final boolean A0C(C05060Qg r4) {
        C06370Yb A0H = r4.A0H();
        if (!A0H.A0B(C03120Gr.A0M) || C18070vi.A18(AnonymousClass0FY.A00(A0H, C03150Gu.A06), true)) {
            AnonymousClass0XV A002 = A00(r4.A03, C12360ld.A00);
            if (A002 == null) {
                return false;
            }
            C06370Yb A0L = A002.A0L();
            if (A0L == null || !C18070vi.A18(AnonymousClass0FY.A00(A0L, C03150Gu.A06), true)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A0D(C05060Qg r1) {
        return r1.A0G().A0B(C03150Gu.A0G);
    }

    public static final boolean A0E(C05060Qg r1) {
        C06370Yb A0H = r1.A0H();
        if (A0H.A0A() || A0H.A08()) {
            return true;
        }
        return false;
    }

    public static final boolean A0F(C05060Qg r1) {
        if (r1.A0L() || r1.A0H().A0B(C03150Gu.A0B)) {
            return false;
        }
        return true;
    }
}
