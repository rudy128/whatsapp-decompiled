package X;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class DP4 implements C72113Kr {
    public final C24933CQg A00;

    public void Bqf() {
        SharedPreferences.Editor edit;
        C24933CQg cQg = this.A00;
        if (C18020vd.A05(C18040vf.A02, cQg.A00, 10724)) {
            AnonymousClass18K r4 = cQg.A01;
            r4.CC4(new C23829Bqm());
            r4.CC4(new AnonymousClass2FG());
            C24934CQh cQh = (C24934CQh) cQg.A02.get();
            C18100vl r3 = cQh.A02;
            Map<String, ?> all = ((SharedPreferences) AnonymousClass3MX.A14(r3)).getAll();
            C18070vi.A0X(all);
            LinkedHashMap A13 = C17880vN.A13();
            Iterator A15 = AnonymousClass000.A15(all);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                if (A16.getValue() instanceof Integer) {
                    C108985cd.A1R(A13, A16);
                }
            }
            LinkedHashMap A132 = C17880vN.A13();
            Iterator A152 = AnonymousClass000.A15(A13);
            while (A152.hasNext()) {
                Map.Entry A162 = AnonymousClass000.A16(A152);
                if (AnonymousClass72X.A02(C17880vN.A0x(A162))) {
                    C108985cd.A1R(A132, A162);
                }
            }
            LinkedHashMap A0b = C108995ce.A0b(A132);
            Iterator A153 = AnonymousClass000.A15(A132);
            while (A153.hasNext()) {
                Map.Entry A163 = AnonymousClass000.A16(A153);
                Object key = A163.getKey();
                Object value = A163.getValue();
                C18070vi.A0z(value, "null cannot be cast to non-null type kotlin.Int");
                A0b.put(key, value);
            }
            List<AnonymousClass1D6> A0v = C29431cG.A0v(C29431cG.A0y(C99834tX.A0L(A0b), new DUR(17)), 10);
            C23850Br7 br7 = new C23850Br7();
            int i = 0;
            for (AnonymousClass1D6 r0 : A0v) {
                int i2 = i + 1;
                String str = (String) r0.first;
                long A09 = (long) C108955ca.A09(r0);
                switch (i) {
                    case 0:
                        br7.A0C = str;
                        br7.A02 = Long.valueOf(A09);
                        break;
                    case 1:
                        br7.A0F = str;
                        br7.A05 = Long.valueOf(A09);
                        break;
                    case 2:
                        br7.A0J = str;
                        br7.A09 = Long.valueOf(A09);
                        break;
                    case 3:
                        br7.A0D = str;
                        br7.A03 = Long.valueOf(A09);
                        break;
                    case 4:
                        br7.A0B = str;
                        br7.A01 = Long.valueOf(A09);
                        break;
                    case 5:
                        br7.A0H = str;
                        br7.A07 = Long.valueOf(A09);
                        break;
                    case 6:
                        br7.A0G = str;
                        br7.A06 = Long.valueOf(A09);
                        break;
                    case 7:
                        br7.A0A = str;
                        br7.A00 = Long.valueOf(A09);
                        break;
                    case 8:
                        br7.A0E = str;
                        br7.A04 = Long.valueOf(A09);
                        break;
                    case 9:
                        br7.A0I = str;
                        br7.A08 = Long.valueOf(A09);
                        break;
                }
                i = i2;
            }
            r4.CC4(br7);
            synchronized (cQh) {
                edit = ((SharedPreferences) AnonymousClass3MX.A14(r3)).edit();
                C18070vi.A0X(edit);
            }
            edit.clear().apply();
        }
    }

    public DP4(C24933CQg cQg) {
        this.A00 = cQg;
    }
}
