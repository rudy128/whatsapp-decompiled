package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.32O  reason: invalid class name */
public class AnonymousClass32O implements AnonymousClass20p {
    public final C18030ve A00;

    public AnonymousClass32O(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean Bes(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        if (r4.A0w()) {
            if (!C18020vd.A05(C18040vf.A02, this.A00, 10412)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final AnonymousClass206 BHO(C59652mf r8, AnonymousClass206 r9) {
        C18070vi.A0h(r9, r8);
        if (r9 instanceof AnonymousClass22H) {
            AnonymousClass24P r6 = new AnonymousClass24P(r8.A01, r8.A00);
            AnonymousClass22H r92 = (AnonymousClass22H) r9;
            C18070vi.A0d(r92, 0);
            String str = r92.A05;
            C18070vi.A0X(str);
            r6.A00 = str;
            List<A18> list = r92.A07;
            C18070vi.A0X(list);
            ArrayList A0D = C29351c6.A0D(list);
            for (A18 a18 : list) {
                String str2 = a18.A04;
                C18070vi.A0X(str2);
                A0D.add(new C59152lq(str2, (long) a18.A00));
            }
            r6.A01 = A0D;
            return r6;
        }
        throw AnonymousClass000.A0k("Failed requirement.");
    }
}
