package X;

import android.util.Pair;
import java.util.UUID;

/* renamed from: X.1mP  reason: invalid class name and case insensitive filesystem */
public final class C35541mP {
    public final AnonymousClass18K A00;

    public C35541mP(AnonymousClass18K r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A01(int i) {
        C81473zI r1 = new C81473zI();
        r1.A00 = Integer.valueOf(i);
        this.A00.CC4(r1);
    }

    public final void A02(int i, String str) {
        C81473zI r1 = new C81473zI();
        r1.A00 = Integer.valueOf(i);
        if (str != null) {
            r1.A02 = str;
        }
        this.A00.CC4(r1);
    }

    public final void A03(String str, int i) {
        C1185063s r1 = new C1185063s();
        r1.A01 = Integer.valueOf(i);
        r1.A05 = str;
        this.A00.CC4(r1);
    }

    public final Pair A00() {
        String obj = UUID.randomUUID().toString();
        C18070vi.A0X(obj);
        C46472Er r1 = new C46472Er();
        r1.A00 = obj;
        this.A00.CC7(r1);
        return new Pair("anid", obj);
    }
}
