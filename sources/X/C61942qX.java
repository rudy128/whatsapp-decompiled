package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2qX  reason: invalid class name and case insensitive filesystem */
public final class C61942qX {
    public static final C197709x8 A02 = new C197709x8(AnonymousClass3I9.A00);
    public final C191939nR A00;
    public final AnonymousClass00H A01;

    public final C21319Ai4 A00(C22484B9q b9q, String str, int i) {
        Cursor A0A;
        String str2;
        AnonymousClass5YR r0;
        C21319Ai4 A002;
        C53362cP r2 = ((C54632eS) this.A01.get()).A00;
        Integer valueOf = Integer.valueOf(i);
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = String.valueOf(valueOf);
        A1Z[1] = str;
        C28781at A05 = r2.A00.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT qp_details FROM quick_promotion_payload WHERE surface_id =? AND trigger_id =?", "SELECT_QUICK_PROMOTION_PAYLOAD", A1Z);
            if (A0A.moveToNext()) {
                str2 = C17890vO.A0S(A0A, "qp_details");
            } else {
                str2 = null;
            }
            A0A.close();
            A05.close();
            ArrayList A13 = AnonymousClass000.A13();
            if (str2 != null) {
                JSONArray jSONArray = new JSONArray(str2);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    if (!(jSONObject == null || (A002 = C196949vu.A00(jSONObject)) == null)) {
                        A13.add(A002);
                    }
                }
            }
            if (!A13.isEmpty()) {
                HashSet A12 = C17880vN.A12();
                int i3 = 0;
                Integer num = ((C21319Ai4) A13.get(0)).A0B;
                if (num != null) {
                    i3 = num.intValue();
                }
                A12.add(str);
                C188729ht A003 = this.A00.A00(b9q, valueOf, Integer.valueOf(i3), A12);
                C197709x8 r02 = A02;
                ArrayList A132 = AnonymousClass000.A13();
                ArrayList A133 = AnonymousClass000.A13();
                C189789jr r4 = (C189789jr) r02.A00.invoke();
                Iterator it = A13.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        C197709x8.A00(A003, A132);
                        C197709x8.A00(A003, A133);
                        break;
                    }
                    AnonymousClass5YR r22 = (AnonymousClass5YR) it.next();
                    C188299hC A004 = r4.A00(A003, r22);
                    if (A004.A04) {
                        if (A004.A03) {
                            A132 = AnonymousClass1ZU.A05(r22);
                            break;
                        }
                        A132.add(r22);
                    } else if (A004.A02) {
                        A133.add(r22);
                    }
                }
                if (C17880vN.A1X(A132)) {
                    r0 = (AnonymousClass5YR) A132.get(0);
                } else {
                    r0 = null;
                }
                C21319Ai4 ai4 = (C21319Ai4) r0;
                if (ai4 != null) {
                    return ai4;
                }
            }
            return null;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public C61942qX(C191939nR r1, AnonymousClass00H r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
