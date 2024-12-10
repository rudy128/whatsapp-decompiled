package X;

import java.util.LinkedHashMap;

public abstract class CC4 {
    public static final LinkedHashMap A00(CO8 co8, Integer num) {
        String str;
        CO7 co7;
        boolean A17 = C18070vi.A17(num, co8);
        AnonymousClass1D6[] r4 = new AnonymousClass1D6[2];
        switch (num.intValue()) {
            case 0:
                str = "resolved_sync";
                break;
            case 1:
                str = "resolved_async";
                break;
            default:
                str = "failed";
                break;
        }
        AnonymousClass1D6.A03("resolution_type", str, r4, 0);
        if (co8 instanceof C23725BoW) {
            co7 = ((C23725BoW) co8).A00;
        } else {
            co7 = co8.A00;
        }
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[2];
        AnonymousClass1D6.A03("points", co7.A01, r2, 0);
        AnonymousClass1D6.A03("annotations", co7.A00, r2, A17 ? 1 : 0);
        AnonymousClass1D6.A03("response_summary", AnonymousClass1D7.A0B(r2), r4, A17);
        return AnonymousClass1D7.A0B(r4);
    }
}
