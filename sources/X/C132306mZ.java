package X;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6mZ  reason: invalid class name and case insensitive filesystem */
public final class C132306mZ {
    public final C18010vc A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C149597jJ(this));
    public final AnonymousClass11P A02;

    public final void A00() {
        SharedPreferences.Editor remove;
        Integer num;
        C18100vl r7 = this.A01;
        Map<String, ?> all = C17880vN.A0C(r7).getAll();
        C18070vi.A0X(all);
        Iterator A15 = AnonymousClass000.A15(all);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            if (A16.getValue() instanceof String) {
                Object value = A16.getValue();
                C18070vi.A0z(value, "null cannot be cast to non-null type kotlin.String");
                C135686sb A002 = AnonymousClass6W8.A00((String) value);
                if (!(A002 == null || (num = A002.A01) == null)) {
                    Object key = A16.getKey();
                    C18070vi.A0X(key);
                    String str = (String) key;
                    if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) > ((long) num.intValue())) {
                        SharedPreferences.Editor A0A = C17890vO.A0A(r7);
                        C18070vi.A0X(A0A);
                        remove = A0A.remove(str);
                        remove.apply();
                    }
                }
            }
            SharedPreferences.Editor A0A2 = C17890vO.A0A(r7);
            C18070vi.A0X(A0A2);
            remove = A0A2.remove(C17880vN.A0x(A16));
            remove.apply();
        }
    }

    public C132306mZ(AnonymousClass11P r2, C18010vc r3) {
        C18070vi.A0j(r2, r3);
        this.A02 = r2;
        this.A00 = r3;
    }
}
