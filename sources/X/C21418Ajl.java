package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: X.Ajl  reason: case insensitive filesystem */
public final /* synthetic */ class C21418Ajl implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ A5M A03;
    public final /* synthetic */ AnonymousClass1E7 A04;
    public final /* synthetic */ AnonymousClass1BI A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ C98494rF A09;
    public final /* synthetic */ C98494rF A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    public final void run() {
        Integer num;
        String str;
        Long l;
        String str2;
        Boolean bool;
        Boolean valueOf;
        Boolean bool2;
        Integer num2;
        Long l2;
        AnonymousClass1BI r10;
        C178119Bw r102;
        C20956AcA A002;
        Object obj;
        A5M a5m = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        C98494rF r11 = this.A09;
        AnonymousClass1BI r103 = this.A05;
        boolean z = this.A0C;
        C98494rF r2 = this.A0A;
        AnonymousClass1E7 r15 = this.A04;
        int i3 = this.A02;
        String str3 = this.A08;
        boolean z2 = this.A0B;
        String str4 = this.A07;
        Integer num3 = this.A06;
        C108965cb.A1O(r11, 3, r2);
        AnonymousClass00H r32 = a5m.A0H;
        r32.get();
        int i4 = i;
        if ((i4 != 13 && i4 != 14) || AnonymousClass8BR.A0K(r32).A0N(i2)) {
            C18030ve r6 = AnonymousClass8BR.A0K(r32).A07;
            C18040vf r30 = C18040vf.A02;
            if (!C18020vd.A05(r30, r6, 8531)) {
                ArrayList A012 = AnonymousClass1R3.A01(C199410f.of(), AnonymousClass8BR.A0K(r32).A06, r103, 1, false, z);
                if (C17880vN.A1X(A012)) {
                    obj = A012.get(0);
                } else {
                    obj = null;
                }
                r11.element = obj;
                ArrayList A082 = AnonymousClass8BR.A0K(r32).A06.A08(r103, 5);
                if (!C17880vN.A1X(A082)) {
                    A082 = null;
                }
                r2.element = A082;
            }
            AnonymousClass206 r1 = (AnonymousClass206) r11.element;
            String str5 = null;
            if (r1 != null) {
                num = AnonymousClass8BR.A0K(r32).A0G(r1);
            } else {
                num = null;
            }
            int A022 = C20136A8x.A02(r103, r32);
            AnonymousClass206 r0 = (AnonymousClass206) r11.element;
            if (r0 != null) {
                r32.get();
                str = C20136A8x.A08(r0);
            } else {
                str = null;
            }
            Long A062 = C20136A8x.A06((AnonymousClass206) r11.element, AnonymousClass11P.A01(((C20136A8x) C18070vi.A0E(r32)).A02));
            AnonymousClass206 r5 = (AnonymousClass206) r11.element;
            if (r5 != null) {
                l = Long.valueOf(C20136A8x.A03(r5, C20136A8x.A04(r32)));
            } else {
                l = null;
            }
            AnonymousClass206 r62 = (AnonymousClass206) r11.element;
            if (r62 != null) {
                boolean A0N = AnonymousClass8BR.A0K(r32).A0N(i2);
                C20136A8x A0K = AnonymousClass8BR.A0K(r32);
                if (A0N) {
                    str2 = A0K.A0K(r62);
                } else {
                    str2 = C20136A8x.A07(r62.A0u);
                }
            } else {
                str2 = null;
            }
            boolean A0x = a5m.A0C.A0x(r103);
            AnonymousClass206 r02 = (AnonymousClass206) r11.element;
            if (r02 == null || (A002 = AnonymousClass9RV.A00(r02)) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(A002.A02);
            }
            r32.get();
            C42741yf r03 = r15.A0G;
            boolean z3 = false;
            if (r03 != null && r03.A01()) {
                z3 = true;
            }
            boolean A0A2 = C20136A8x.A0A(a5m, r103, r32);
            Integer A0E = AnonymousClass8BR.A0K(r32).A0E(r103);
            String A0J = AnonymousClass8BR.A0K(r32).A0J(r103);
            if (!C18020vd.A05(r30, AnonymousClass8BR.A0K(r32).A07, 11082)) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(AnonymousClass000.A1W(r15.A0H));
            }
            C186519eK r63 = (C186519eK) a5m.A0G.get();
            String A0I = AnonymousClass8BR.A0K(r32).A0I(r15);
            Boolean valueOf2 = Boolean.valueOf(A0x);
            Boolean A0D = AnonymousClass8BR.A0K(r32).A0D(z2);
            Boolean valueOf3 = Boolean.valueOf(A0A2);
            C171808sJ r04 = new C171808sJ();
            Integer valueOf4 = Integer.valueOf(i3);
            r04.A09 = valueOf4;
            Integer valueOf5 = Integer.valueOf(i);
            r04.A0B = valueOf5;
            r04.A08 = num;
            r04.A0V = str2;
            Integer valueOf6 = Integer.valueOf(i2);
            r04.A07 = valueOf6;
            r04.A0W = A0I;
            r04.A0A = A0E;
            r04.A0J = A062;
            r04.A0S = A0J;
            r04.A03 = valueOf;
            r04.A0K = l;
            r04.A0T = str3;
            r04.A0U = str;
            Boolean valueOf7 = Boolean.valueOf(z3);
            r04.A02 = valueOf7;
            r04.A01 = bool;
            r04.A04 = valueOf2;
            Integer valueOf8 = Integer.valueOf(A022);
            r04.A06 = valueOf8;
            r04.A00 = A0D;
            A7T a7t = r63.A00;
            Long A052 = a7t.A05(i2);
            if (i2 == 3) {
                r04.A0D = A052;
                r04.A0E = a7t.A06(i2);
                r04.A0F = a7t.A07(i2);
                r04.A0H = a7t.A09(i2);
                r04.A0I = a7t.A0A(i2);
                r04.A0C = a7t.A04(i2);
                r04.A0G = a7t.A08(i2);
            } else {
                r04.A0M = A052;
                r04.A0N = a7t.A06(i2);
                r04.A0O = a7t.A07(i2);
                r04.A0Q = a7t.A09(i2);
                r04.A0R = a7t.A0A(i2);
                r04.A0L = a7t.A04(i2);
                r04.A0P = a7t.A08(i2);
            }
            r04.A05 = valueOf3;
            C20136A8x.A09(r04, r63.A03);
            C187609g5 r4 = (C187609g5) a5m.A0F.get();
            AnonymousClass206 r64 = (AnonymousClass206) r11.element;
            if (r64 != null) {
                bool2 = Boolean.valueOf(a5m.A07.A0A(r103, r64.A0I));
            } else {
                bool2 = null;
            }
            List list = (List) r2.element;
            if (str3 != null) {
                num2 = Integer.valueOf(C88244Yx.A00(str3));
            } else {
                num2 = null;
            }
            AnonymousClass206 r12 = (AnonymousClass206) r11.element;
            if (r12 != null) {
                str5 = AnonymousClass8BR.A0K(r32).A0L(r12);
            }
            Long A053 = C20136A8x.A05(r103, r32);
            Boolean A0D2 = AnonymousClass8BR.A0K(r32).A0D(z2);
            C171868sP r22 = new C171868sP();
            r22.A0C = valueOf4;
            r22.A0E = valueOf5;
            r22.A0Q = A053;
            r22.A0O = A062;
            r22.A0P = l;
            r22.A0N = C88244Yx.A02(r15);
            r22.A02 = bool;
            r22.A0D = A0E;
            r22.A0h = str5;
            r22.A0B = num;
            r22.A0g = str;
            r22.A09 = valueOf8;
            r22.A0Z = A0J;
            r22.A0A = valueOf6;
            r22.A03 = valueOf7;
            r22.A01 = A0D2;
            Long l3 = null;
            if (r64 != null) {
                l2 = AnonymousClass8BT.A0p(TimeUnit.MILLISECONDS, r64.A0I);
            } else {
                l2 = null;
            }
            r22.A0M = l2;
            if (r64 != null) {
                l3 = AnonymousClass8BT.A0p(TimeUnit.MILLISECONDS, r64.A0G);
            }
            r22.A0R = l3;
            r22.A00 = bool2;
            r22.A05 = C108945cZ.A1A(r15.A0B());
            if (list != null) {
                ArrayList A13 = AnonymousClass000.A13();
                ArrayList A132 = AnonymousClass000.A13();
                ArrayList A133 = AnonymousClass000.A13();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AnonymousClass206 A0Y = C17880vN.A0Y(it);
                    A13.add(AnonymousClass8BR.A0K(r4.A05).A0L(A0Y));
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    C17880vN.A1R(A132, timeUnit.toSeconds(A0Y.A0G));
                    C17880vN.A1R(A133, timeUnit.toSeconds(A0Y.A0I));
                }
                r22.A0i = new JSONArray(A13).toString();
                r22.A0a = new JSONArray(A132).toString();
                r22.A0b = new JSONArray(A133).toString();
            }
            Integer[] numArr = new Integer[2];
            AnonymousClass000.A1L(numArr, 6);
            if (C18070vi.A0O(C108955ca.A0e(), numArr, 1).contains(valueOf5)) {
                AnonymousClass00H r8 = r4.A05;
                C20136A8x A0K2 = AnonymousClass8BR.A0K(r8);
                if (i2 == 3) {
                    if (C18020vd.A05(r30, A0K2.A07, 9687) && (r10 = r15.A0J) != null) {
                        ArrayList A134 = AnonymousClass000.A13();
                        ArrayList A135 = AnonymousClass000.A13();
                        ArrayList A136 = AnonymousClass000.A13();
                        ArrayList A092 = AnonymousClass8BR.A0K(r8).A06.A09(r10, 5);
                        if (C17880vN.A1X(A092)) {
                            Iterator it2 = A092.iterator();
                            while (it2.hasNext()) {
                                AnonymousClass206 A0Y2 = C17880vN.A0Y(it2);
                                if ((A0Y2 instanceof AnonymousClass22M) && (r102 = (C178119Bw) ((AnonymousClass22M) A0Y2).A00.A02) != null) {
                                    C17880vN.A1R(A134, TimeUnit.MILLISECONDS.toHours(A0Y2.A0I) * 3600);
                                    r8.get();
                                    boolean z4 = r102.A04.A03;
                                    int i5 = 1;
                                    if (!z4) {
                                        if (!z4) {
                                            i5 = 0;
                                        } else {
                                            throw AnonymousClass3MW.A14();
                                        }
                                    }
                                    C17890vO.A1D(A135, i5);
                                    C17890vO.A1D(A136, r102.A08);
                                }
                            }
                        }
                        r22.A0e = new JSONArray(A134).toString();
                        r22.A0c = new JSONArray(A135).toString();
                        r22.A0d = new JSONArray(A136).toString();
                    }
                }
            }
            if (i == 6) {
                r22.A08 = num2;
                r22.A0f = str4;
                r22.A07 = num3;
            }
            r22.A04 = valueOf2;
            A7T a7t2 = r4.A01;
            Long A054 = a7t2.A05(i2);
            if (i2 == 3) {
                r22.A0G = A054;
                r22.A0H = a7t2.A06(i2);
                r22.A0I = a7t2.A07(i2);
                r22.A0K = a7t2.A09(i2);
                r22.A0L = a7t2.A0A(i2);
                r22.A0F = a7t2.A04(i2);
                r22.A0J = a7t2.A08(i2);
            } else {
                r22.A0T = A054;
                r22.A0U = a7t2.A06(i2);
                r22.A0V = a7t2.A07(i2);
                r22.A0X = a7t2.A09(i2);
                r22.A0Y = a7t2.A0A(i2);
                r22.A0S = a7t2.A04(i2);
                r22.A0W = a7t2.A08(i2);
            }
            r22.A06 = valueOf3;
            C20136A8x.A09(r22, r4.A05);
            if (i2 == 3) {
                AnonymousClass8BR.A0K(r32).A0M(true);
            }
        }
    }

    public /* synthetic */ C21418Ajl(A5M a5m, AnonymousClass1E7 r2, AnonymousClass1BI r3, Integer num, String str, String str2, C98494rF r7, C98494rF r8, int i, int i2, int i3, boolean z, boolean z2) {
        this.A03 = a5m;
        this.A00 = i;
        this.A01 = i2;
        this.A09 = r7;
        this.A05 = r3;
        this.A0C = z;
        this.A0A = r8;
        this.A04 = r2;
        this.A02 = i3;
        this.A08 = str;
        this.A0B = z2;
        this.A07 = str2;
        this.A06 = num;
    }
}
