package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0Vy  reason: invalid class name and case insensitive filesystem */
public final class C05850Vy implements C16670so {
    public static final C16680sp A03 = C04580Ny.A01(C12030l6.A00, C14290om.A00);
    public AnonymousClass0tC A00;
    public final Map A01;
    public final Map A02;

    public static final LinkedHashMap A00(C05850Vy r6) {
        LinkedHashMap A08 = AnonymousClass1D7.A08(r6.A02);
        for (C03300Hl r3 : r6.A01.values()) {
            if (r3.A00) {
                Map CBf = r3.A01.CBf();
                boolean isEmpty = CBf.isEmpty();
                Object obj = r3.A02;
                if (isEmpty) {
                    A08.remove(obj);
                } else {
                    A08.put(obj, CBf);
                }
            }
        }
        if (A08.isEmpty()) {
            return null;
        }
        return A08;
    }

    public void CF2(Object obj) {
        C03300Hl r1 = (C03300Hl) this.A01.get(obj);
        if (r1 != null) {
            r1.A00 = false;
        } else {
            this.A02.remove(obj);
        }
    }

    public C05850Vy(Map map) {
        this.A02 = map;
        this.A01 = new LinkedHashMap();
    }

    public void BAG(C17130tn r6, Object obj, AnonymousClass1OS r8, int i) {
        r6.COC(-1198538093);
        r6.COB(444418301);
        r6.COD(obj);
        Object A1A = AnonymousClass001.A1A(r6);
        if (A1A == AnonymousClass0MH.A00) {
            AnonymousClass0tC r0 = this.A00;
            if (r0 == null || r0.BE7(obj)) {
                A1A = new C03300Hl(this, obj);
                AnonymousClass0VR.A0V(r6, A1A);
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Type of the key ");
                A10.append(obj);
                throw AnonymousClass001.A12(" is not supported. On Android you can only use types which can be stored inside the Bundle.", A10);
            }
        }
        AnonymousClass0VR r3 = (AnonymousClass0VR) r6;
        AnonymousClass0VR.A0R(r3, false);
        C03300Hl r4 = (C03300Hl) A1A;
        AnonymousClass0PZ.A03(r6, C04100Lv.A00.A03(r4.A01), r8, i & 112);
        AnonymousClass0QC.A03(r6, C27621Wu.A00, new C10440iL(r4, this, obj));
        r6.BKG();
        AnonymousClass0VR.A0R(r3, false);
        C05660Vf BKF = r6.BKF();
        if (BKF != null) {
            BKF.A03(new C13440nP(this, obj, r8, i));
        }
    }

    public C05850Vy() {
        this(new LinkedHashMap());
    }
}
