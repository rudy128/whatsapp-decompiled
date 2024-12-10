package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.04D  reason: invalid class name */
public final class AnonymousClass04D implements C18080vj, AnonymousClass1OS, C36001nB, AnonymousClass20G, AnonymousClass20H, AnonymousClass20I, AnonymousClass20J, AnonymousClass20K, AnonymousClass20L {
    public C15740r7 A00;
    public List A01;
    public Object A02;
    public final boolean A03;
    public final int A04;

    public Object A05(C17130tn r14, Object obj, Object obj2, Object obj3, int i) {
        C17130tn r6 = r14;
        r14.COC(this.A04);
        A00(r14);
        int i2 = 1;
        if (r14.BEf(this)) {
            i2 = 2;
        }
        int i3 = i;
        Object obj4 = this.A02;
        C18070vi.A0z(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C41681wt.A04(obj4, 5);
        Object obj5 = obj2;
        Object obj6 = obj3;
        Object invoke = ((AnonymousClass20H) obj4).invoke(obj, obj5, obj6, r6, Integer.valueOf((i2 << 10) | i));
        C05660Vf BKF = r14.BKF();
        if (BKF != null) {
            BKF.A03(new C12890mU(this, obj, obj5, obj6, i3));
        }
        return invoke;
    }

    public Object A06(C17130tn r16, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        C17130tn r7 = r16;
        r7.COC(this.A04);
        A00(r7);
        int i2 = 1;
        if (r7.BEf(this)) {
            i2 = 2;
        }
        int i3 = i;
        Object obj5 = this.A02;
        C18070vi.A0z(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C41681wt.A04(obj5, 6);
        Object obj6 = obj;
        Object obj7 = obj2;
        Object obj8 = obj3;
        Object obj9 = obj4;
        Object invoke = ((AnonymousClass20I) obj5).invoke(obj6, obj7, obj8, obj9, r7, Integer.valueOf((i2 << 13) | i));
        C05660Vf BKF = r7.BKF();
        if (BKF != null) {
            BKF.A03(new C12920mX(this, obj6, obj7, obj8, obj9, i3));
        }
        return invoke;
    }

    private final void A00(C17130tn r6) {
        C05660Vf A0Z;
        if (this.A03 && (A0Z = ((AnonymousClass0VR) r6).A0Z()) != null) {
            A0Z.A01 |= 1;
            if (A01(this.A00, A0Z)) {
                this.A00 = A0Z;
                return;
            }
            List list = this.A01;
            if (list == null) {
                list = new ArrayList();
                this.A01 = list;
            } else {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (A01((C15740r7) list.get(i), A0Z)) {
                        list.set(i, A0Z);
                        return;
                    }
                }
            }
            list.add(A0Z);
        }
    }

    public static final boolean A01(C15740r7 r3, C15740r7 r4) {
        C02090Cr r0;
        if (r3 == null) {
            return true;
        }
        if (!(r3 instanceof C05660Vf) || !(r4 instanceof C05660Vf)) {
            return false;
        }
        C05660Vf r2 = (C05660Vf) r3;
        if (r2.A05 == null || (r0 = r2.A04) == null || r0.A00 == Integer.MIN_VALUE || r3.equals(r4) || C18070vi.A18(r2.A04, ((C05660Vf) r4).A04)) {
            return true;
        }
        return false;
    }

    public Object A02(C17130tn r5, int i) {
        r5.COC(this.A04);
        A00(r5);
        int i2 = 1 << 1;
        if (r5.BEf(this)) {
            i2 = 2 << 1;
        }
        int i3 = i | i2;
        Object obj = this.A02;
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C41681wt.A04(obj, 2);
        Object invoke = ((AnonymousClass1OS) obj).invoke(r5, Integer.valueOf(i3));
        C05660Vf BKF = r5.BKF();
        if (BKF != null) {
            C18070vi.A0z(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            C41681wt.A04(this, 2);
            BKF.A03(this);
        }
        return invoke;
    }

    public Object A03(C17130tn r4, Object obj, int i) {
        r4.COC(this.A04);
        A00(r4);
        int i2 = 1;
        if (r4.BEf(this)) {
            i2 = 2;
        }
        Object obj2 = this.A02;
        C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C41681wt.A04(obj2, 3);
        Object invoke = ((C36001nB) obj2).invoke(obj, r4, Integer.valueOf((i2 << 4) | i));
        C05660Vf BKF = r4.BKF();
        if (BKF != null) {
            BKF.A03(new C12830mO(this, obj, i));
        }
        return invoke;
    }

    public Object A04(C17130tn r4, Object obj, Object obj2, int i) {
        r4.COC(this.A04);
        A00(r4);
        int i2 = 1;
        if (r4.BEf(this)) {
            i2 = 2;
        }
        Object obj3 = this.A02;
        C18070vi.A0z(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C41681wt.A04(obj3, 4);
        Object invoke = ((AnonymousClass20G) obj3).invoke(obj, obj2, r4, Integer.valueOf((i2 << 7) | i));
        C05660Vf BKF = r4.BKF();
        if (BKF != null) {
            BKF.A03(new C12860mR(this, obj, obj2, i));
        }
        return invoke;
    }

    public Object A07(C17130tn r18, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        C17130tn r8 = r18;
        r8.COC(this.A04);
        A00(r8);
        int i2 = 1;
        if (r8.BEf(this)) {
            i2 = 2;
        }
        int i3 = i;
        Object obj6 = this.A02;
        C18070vi.A0z(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C41681wt.A04(obj6, 7);
        Object obj7 = obj;
        Object obj8 = obj2;
        Object obj9 = obj3;
        Object obj10 = obj4;
        Object obj11 = obj5;
        Object invoke = ((AnonymousClass20J) obj6).invoke(obj7, obj8, obj9, obj10, obj11, r8, Integer.valueOf(i | (i2 << 16)));
        C05660Vf BKF = r8.BKF();
        if (BKF != null) {
            BKF.A03(new C12940mZ(this, obj7, obj8, obj9, obj10, obj11, i3));
        }
        return invoke;
    }

    public final void A08(Object obj) {
        if (!C18070vi.A18(this.A02, obj)) {
            this.A02 = obj;
            if (this.A03) {
                C15740r7 r2 = this.A00;
                if (r2 != null) {
                    C05660Vf r22 = (C05660Vf) r2;
                    C16660sn r1 = r22.A05;
                    if (r1 != null) {
                        r1.Bdk(r22, (Object) null);
                    }
                    this.A00 = null;
                }
                List list = this.A01;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C05660Vf r23 = (C05660Vf) ((C15740r7) list.get(i));
                        C16660sn r12 = r23.A05;
                        if (r12 != null) {
                            r12.Bdk(r23, (Object) null);
                        }
                    }
                    list.clear();
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A03((C17130tn) obj2, obj, ((Number) obj3).intValue());
    }

    public AnonymousClass04D(int i, Object obj, boolean z) {
        this.A04 = i;
        this.A03 = z;
        this.A02 = obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return A05((C17130tn) obj4, obj, obj2, obj3, ((Number) obj5).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return A07((C17130tn) obj6, obj, obj2, obj3, obj4, obj5, ((Number) obj7).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return A06((C17130tn) obj5, obj, obj2, obj3, obj4, ((Number) obj6).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return A04((C17130tn) obj3, obj, obj2, ((Number) obj4).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return A02((C17130tn) obj, ((Number) obj2).intValue());
    }
}
