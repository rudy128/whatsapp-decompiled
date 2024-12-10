package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0P1  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass0P1 {
    public static int A00(C17740v9 r6, C16870tM r7, List list, int i) {
        ArrayList A14 = AnonymousClass000.A14(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C16860tL A0g = AnonymousClass000.A0g(list, i2);
            Integer num = AnonymousClass00R.A01;
            A14.add(new C06040Ws(A0g, num, num));
        }
        return r7.BjZ(new C05970Wl(r6, r6.getLayoutDirection()), A14, C26229CvL.A02(i, 0, 13)).getHeight();
    }

    public static int A01(C17740v9 r7, C16870tM r8, List list, int i) {
        ArrayList A14 = AnonymousClass000.A14(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            A14.add(new C06040Ws(AnonymousClass000.A0g(list, i2), AnonymousClass00R.A01, AnonymousClass00R.A00));
        }
        return r8.BjZ(new C05970Wl(r7, r7.getLayoutDirection()), A14, C26229CvL.A02(0, i, 7)).getWidth();
    }

    public static int A02(C17740v9 r7, C16870tM r8, List list, int i) {
        ArrayList A14 = AnonymousClass000.A14(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            A14.add(new C06040Ws(AnonymousClass000.A0g(list, i2), AnonymousClass00R.A00, AnonymousClass00R.A01));
        }
        return r8.BjZ(new C05970Wl(r7, r7.getLayoutDirection()), A14, C26229CvL.A02(i, 0, 13)).getHeight();
    }

    public static int A03(C17740v9 r6, C16870tM r7, List list, int i) {
        ArrayList A14 = AnonymousClass000.A14(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C16860tL A0g = AnonymousClass000.A0g(list, i2);
            Integer num = AnonymousClass00R.A00;
            A14.add(new C06040Ws(A0g, num, num));
        }
        return r7.BjZ(new C05970Wl(r6, r6.getLayoutDirection()), A14, C26229CvL.A02(0, i, 7)).getWidth();
    }
}
