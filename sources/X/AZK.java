package X;

import android.net.Uri;
import java.util.Map;

public final class AZK implements AnonymousClass8BF {
    public final C184029aI A00;

    public AZK(C184029aI r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean BAd(String str) {
        return AnonymousClass000.A1W(this.A00.A01.get(str));
    }

    public void Bc9(String str, String str2) {
        C194839sN r3 = (C194839sN) this.A00.A01.get(str);
        Uri parse = Uri.parse(str2);
        C18070vi.A0b(parse);
        Object A002 = AnonymousClass6X4.A00(parse);
        if (A002 == null) {
            A002 = AnonymousClass1D7.A0I();
        }
        if (r3 != null) {
            AnonymousClass1D6[] r1 = new AnonymousClass1D6[2];
            AnonymousClass1D6.A03("deeplink", str2, r1, 0);
            AnonymousClass1D6.A03("parameters", A002, r1, 1);
            r3.A02("on_success", AnonymousClass1D7.A0B(r1));
        }
    }

    public void BcA(String str, Map map) {
        C194839sN r2 = (C194839sN) this.A00.A01.get(str);
        if (r2 != null) {
            r2.A02("on_success", C108975cc.A0h("parameters", map));
        }
    }
}
