package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2zT  reason: invalid class name and case insensitive filesystem */
public final class C67242zT implements AnonymousClass1L0 {
    public final AnonymousClass1DN A00;

    public C67242zT(AnonymousClass1DN r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqh() {
    }

    public void Bqi() {
        Map map;
        AnonymousClass1DN r5 = this.A00;
        AnonymousClass11S r0 = r5.A01;
        r0.A0I();
        if (r0.A00 != null) {
            String A01 = C18020vd.A01(C18040vf.A02, r5.A07, 2804);
            if (AnonymousClass1EG.A0H(A01)) {
                map = Collections.emptyMap();
            } else {
                HashMap A11 = C17880vN.A11();
                try {
                    JSONObject A16 = C17880vN.A16(A01);
                    Iterator<String> keys = A16.keys();
                    while (keys.hasNext()) {
                        String A0v = C17880vN.A0v(keys);
                        C17890vO.A0z(A0v, A11, A16.getInt(A0v));
                    }
                    map = A11;
                } catch (JSONException e) {
                    C17900vP.A0h("DatabaseMigrationManager/parseKnownVersions/malformed json ", A01, AnonymousClass000.A10(), e);
                    r5.A00.A0G("db-migration-parse-known-versions/malformed", e.getMessage(), false);
                    map = A11;
                }
            }
            if (!map.isEmpty()) {
                AnonymousClass1IZ it = r5.A06.A00().values().iterator();
                while (it.hasNext()) {
                    C28381a4 r2 = (C28381a4) it.next();
                    if (r2.A0G()) {
                        int i = r2.A00;
                        String str = r2.A05;
                        Number number = (Number) map.get(str);
                        if (number != null && number.intValue() > i) {
                            C17900vP.A0f("DatabaseMigrationManager/analyzeStuckMigrations/need to upgrade app because of ", str, AnonymousClass000.A10());
                            r5.A02.A01(AnonymousClass11P.A01(r5.A03) + 1209600000);
                            return;
                        }
                    }
                }
            }
        }
    }
}
