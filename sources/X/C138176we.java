package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6we  reason: invalid class name and case insensitive filesystem */
public final class C138176we {
    public final AnonymousClass190 A00;
    public final AnonymousClass00H A01;
    public final Map A02 = C17880vN.A13();

    public static final void A00(C138176we r5, String str, String str2, String str3, C18090vk r9) {
        boolean z;
        synchronized (r5) {
            Map map = r5.A02;
            AnonymousClass6gD r3 = (AnonymousClass6gD) map.get(str);
            if (r3 == null) {
                map.put(str, new AnonymousClass6gD(str2));
                ((AnonymousClass11A) r5.A01.get()).A00.postDelayed(new C146817Qs(22, str, r5), C20113A7w.A0L);
                z = true;
            } else {
                List list = r3.A02;
                if (list.size() < 10 && str3 != null) {
                    list.add(str3);
                }
                r3.A00++;
                z = false;
            }
        }
        if (z) {
            r9.invoke();
        }
    }

    public C138176we(AnonymousClass190 r2, AnonymousClass00H r3) {
        C18070vi.A0j(r2, r3);
        this.A00 = r2;
        this.A01 = r3;
    }
}
