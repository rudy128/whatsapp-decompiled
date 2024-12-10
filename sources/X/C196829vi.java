package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9vi  reason: invalid class name and case insensitive filesystem */
public abstract class C196829vi {
    public static final C180039Kw A00(A6Z a6z) {
        C18070vi.A0d(a6z, 0);
        List<BC4> list = a6z.A01;
        if (list.size() <= 1) {
            return A01(a6z.A02());
        }
        ArrayList A0D = C29351c6.A0D(list);
        for (BC4 A01 : list) {
            A0D.add(A01(A01));
        }
        return new AnonymousClass972(A0D);
    }

    public static final C180039Kw A01(BC4 bc4) {
        switch (bc4.BOq()) {
            case 3847001:
                return AnonymousClass975.A00;
            case 3847002:
                return AnonymousClass974.A00;
            default:
                return new AnonymousClass973(bc4.BOq());
        }
    }
}
