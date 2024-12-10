package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.71F  reason: invalid class name */
public final class AnonymousClass71F {
    public final C18000vb A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final Map A03 = C17880vN.A13();
    public final Set A04 = C17880vN.A14();

    public static final List A01(AnonymousClass71F r2, List list, int i) {
        if (i == 5) {
            if (!C18020vd.A05(C18040vf.A02, r2.A01, 6383)) {
                ArrayList A13 = AnonymousClass000.A13();
                for (Object next : list) {
                    C1418377d r1 = (C1418377d) next;
                    if (!r1.A0J && !r1.A0N) {
                        A13.add(next);
                    }
                }
                return A13;
            }
        }
        return list;
    }

    public static final String A00(AnonymousClass71F r5, C1418377d r6, String str) {
        String A07 = AnonymousClass1YE.A07(str, " ", "", false);
        StringBuilder A11 = AnonymousClass000.A11(A07);
        String str2 = r6.A0H;
        if (str2 != null) {
            A11.append("-");
            A11.append(str2);
        }
        String str3 = r6.A0B;
        if (str3 != null) {
            A11.append("-");
            A11.append(str3);
        }
        String str4 = r6.A0F;
        if (str4 != null) {
            A11.append("-");
            A11.append(str4);
        }
        String str5 = r6.A0I;
        if (str5 != null) {
            A11.append(str5.hashCode());
        }
        String A0H = C18070vi.A0H(A11);
        if (r5.A04.add(A0H)) {
            return A0H;
        }
        Map map = r5.A03;
        int A0B = C72463Mc.A0B(C108945cZ.A1E(A07, map)) + 1;
        String A1I = AnonymousClass001.A1I("-collision-prevention-", AnonymousClass000.A11(A07), A0B);
        C17880vN.A1P(A07, map, A0B);
        return A1I;
    }

    public AnonymousClass71F(C18000vb r2, C18030ve r3, AnonymousClass00H r4) {
        C18070vi.A0o(r3, r2, r4);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }
}
