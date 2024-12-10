package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Wy  reason: invalid class name and case insensitive filesystem */
public final class C06100Wy implements C16870tM {
    public final C18090vk A00;

    public /* synthetic */ int BjA(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A00(r2, this, list, i);
    }

    public /* synthetic */ int BjD(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A01(r2, this, list, i);
    }

    public /* synthetic */ int Bjw(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A02(r2, this, list, i);
    }

    public /* synthetic */ int Bjz(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A03(r2, this, list, i);
    }

    public C16820tH BjZ(C17530uo r12, List list, long j) {
        List list2 = (List) this.A00.invoke();
        ArrayList arrayList = null;
        if (list2 != null) {
            arrayList = AnonymousClass000.A14(list2);
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass0NU r8 = (AnonymousClass0NU) list2.get(i);
                if (r8 != null) {
                    float f = r8.A02;
                    float f2 = r8.A01;
                    float f3 = r8.A00;
                    float f4 = r8.A03;
                    arrayList.add(new AnonymousClass1D6(((C17500ul) list.get(i)).Bjb(C26229CvL.A02((int) ((float) Math.floor((double) (f - f2))), (int) ((float) Math.floor((double) (f3 - f4))), 5)), C26143Ct6.A00(C7A.A00(C22339B3q.A01(f2), C22339B3q.A01(f4)))));
                }
            }
        }
        return r12.BhL(AnonymousClass1D7.A0I(), new C10670ii(arrayList), Constraints.A01(j), Constraints.A00(j));
    }

    public C06100Wy(C18090vk r1) {
        this.A00 = r1;
    }
}
