package X;

import java.util.Arrays;

/* renamed from: X.0EU  reason: invalid class name */
public abstract class AnonymousClass0EU {
    public static final Object A00(C17130tn r10, C16680sp r11, C18090vk r12, Object[] objArr, int i) {
        Object obj;
        Object obj2;
        Object BFi;
        C16680sp r6 = r11;
        r10.COB(441892779);
        if ((i & 2) != 0) {
            r6 = C04580Ny.A00();
        }
        AnonymousClass0VR r1 = (AnonymousClass0VR) r10;
        String num = Integer.toString(r1.A01, 36);
        C18070vi.A0X(num);
        C18070vi.A0z(r6, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        AnonymousClass0tC r5 = (AnonymousClass0tC) r10.BFh(C04100Lv.A00);
        Object A1A = AnonymousClass001.A1A(r10);
        Object[] objArr2 = objArr;
        if (A1A == AnonymousClass0MH.A00) {
            if (r5 == null || (BFi = r5.BFi(num)) == null || (obj2 = r6.CFy(BFi)) == null) {
                obj2 = r12.invoke();
            }
            A1A = new C05720Vl(r5, r6, obj2, num, objArr2);
            r10.CRH(A1A);
        }
        AnonymousClass0VR.A0R(r1, false);
        C05720Vl r4 = (C05720Vl) A1A;
        if (!Arrays.equals(objArr, r4.A03) || (obj = r4.A02) == null) {
            obj = r12.invoke();
        }
        AnonymousClass0QC.A05(r10, new C08400f2(r4, r5, r6, obj, num, objArr2));
        AnonymousClass0VR.A0R(r1, false);
        return obj;
    }
}
