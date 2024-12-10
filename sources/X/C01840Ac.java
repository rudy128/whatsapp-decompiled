package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Ac  reason: invalid class name and case insensitive filesystem */
public final class C01840Ac extends C06070Wv {
    public static final C01840Ac A00 = new C01840Ac();

    public C01840Ac() {
        super("Undefined intrinsics block and it is required");
    }

    public C16820tH BjZ(C17530uo r8, List list, long j) {
        int A01;
        int A002;
        C22821Di r0;
        C22821Di r02;
        if (list.isEmpty()) {
            A01 = Constraints.A03(j);
            A002 = Constraints.A02(j);
            r02 = C12130lG.A00;
        } else {
            if (list.size() == 1) {
                AnonymousClass0XJ Bjb = ((C17500ul) list.get(0)).Bjb(j);
                A01 = C26229CvL.A01(j, Bjb.A01);
                A002 = C26229CvL.A00(j, Bjb.A00);
                r02 = new C09990hc(Bjb);
            } else {
                ArrayList A14 = AnonymousClass000.A14(list);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    AnonymousClass001.A1T(A14, list, i, j);
                }
                int size2 = A14.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    AnonymousClass0XJ r1 = (AnonymousClass0XJ) A14.get(i4);
                    i2 = Math.max(r1.A01, i2);
                    i3 = Math.max(r1.A00, i3);
                }
                A01 = C26229CvL.A01(j, i2);
                A002 = C26229CvL.A00(j, i3);
                r0 = new C10000hd(A14);
                return r8.BhL(AnonymousClass1D7.A0I(), r0, A01, A002);
            }
        }
        r0 = r02;
        return r8.BhL(AnonymousClass1D7.A0I(), r0, A01, A002);
    }
}
