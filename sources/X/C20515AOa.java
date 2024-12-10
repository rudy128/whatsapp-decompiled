package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.AOa  reason: case insensitive filesystem */
public final class C20515AOa implements C22537BBu {
    public final AnonymousClass00H A00;

    public C20515AOa(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.AeO, java.lang.Object, X.B5z] */
    public void CHT(Activity activity, C190469kz r8, Map map) {
        Intent intent;
        Bundle extras;
        String string;
        if (activity != null && (intent = activity.getIntent()) != null && (extras = intent.getExtras()) != null && (string = extras.getString("fds_observer_id")) != null && map != null) {
            LinkedHashMap A13 = C17880vN.A13();
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                if (!(A16.getKey() == null || A16.getValue() == null)) {
                    C108985cd.A1T(A16, A13);
                }
            }
            LinkedHashMap A0b = C108995ce.A0b(A13);
            Iterator A152 = AnonymousClass000.A15(A13);
            while (A152.hasNext()) {
                Map.Entry A162 = AnonymousClass000.A16(A152);
                A0b.put(String.valueOf(A162.getKey()), A162.getValue());
            }
            A2X A0c = C108985cd.A0c(this.A00, string);
            ? obj = new Object();
            obj.A00 = A0b;
            A0c.A02(obj);
        }
    }

    public String BOU(Activity activity) {
        throw AnonymousClass8BY.A0b();
    }

    public String BV6(Activity activity) {
        throw AnonymousClass8BY.A0b();
    }
}
