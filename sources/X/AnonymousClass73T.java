package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.73T  reason: invalid class name */
public final class AnonymousClass73T {
    public static final AnonymousClass73T A00 = new Object();

    public static final C134016ps A00(String str) {
        return new C134016ps(str, C108955ca.A16(str, 0), AnonymousClass000.A13(), AnonymousClass000.A13(), AnonymousClass000.A13(), AnonymousClass000.A13(), AnonymousClass000.A13(), -1);
    }

    public final C134016ps A03(C126876dR r13, C134016ps r14) {
        ArrayList A10 = C17880vN.A10(r14.A07);
        ArrayList A102 = C17880vN.A10(r14.A02);
        ArrayList A103 = C17880vN.A10(r14.A06);
        ArrayList A104 = C17880vN.A10(r14.A04);
        ArrayList A105 = C17880vN.A10(r14.A03);
        ArrayList A106 = C17880vN.A10(r14.A05);
        long j = r14.A00;
        C114065q6 r1 = (C114065q6) r13;
        switch (r1.A04.intValue()) {
            case 0:
                A01(r13, A10);
                float f = r1.A00;
                if (f >= 1.0f || f < 0.5f) {
                    if (f == 1.0f) {
                        A01(r13, A102);
                        A01(r13, A104);
                        break;
                    }
                } else {
                    A01(r13, A102);
                    break;
                }
                break;
            case 1:
                A02(r13, A10);
                A02(r13, A102);
                A02(r13, A104);
                A02(r13, A105);
                A02(r13, A106);
                break;
            default:
                A10.isEmpty();
                float f2 = r1.A00;
                if (f2 >= 1.0f || f2 < 0.5f) {
                    if (f2 != 1.0f) {
                        if (f2 < 0.5f && f2 >= 0.0f) {
                            A04(r13, A10);
                            A02(r13, A102);
                            A02(r13, A104);
                            break;
                        }
                    } else {
                        A04(r13, A104);
                    }
                } else {
                    A02(r13, A104);
                }
                A04(r13, A102);
                A04(r13, A10);
                break;
        }
        return new C134016ps(r14.A01, A10, A102, A103, A104, A105, A106, j);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.6Uf] */
    public static final void A01(C126876dR r4, List list) {
        if (!list.isEmpty()) {
            list.get(AnonymousClass3MX.A01(list));
        }
        long j = ((C114065q6) r4).A01;
        ? obj = new Object();
        obj.A00 = j;
        obj.A01 = -1;
        list.add(obj);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.6Uf] */
    public static final void A02(C126876dR r6, List list) {
        if (!list.isEmpty()) {
            C123376Uf r5 = (C123376Uf) list.get(AnonymousClass3MX.A01(list));
            if (r5.A01 == -1) {
                long j = r5.A00;
                long j2 = ((C114065q6) r6).A01;
                ? obj = new Object();
                obj.A00 = j;
                obj.A01 = j2;
                list.set(AnonymousClass3MX.A01(list), obj);
            }
        }
    }

    public final void A04(C126876dR r7, List list) {
        if (!list.isEmpty()) {
            C123376Uf r5 = (C123376Uf) list.get(AnonymousClass3MX.A01(list));
            if (r5.A00 == -1 || r5.A01 == -1) {
                return;
            }
        }
        A01(r7, list);
    }
}
