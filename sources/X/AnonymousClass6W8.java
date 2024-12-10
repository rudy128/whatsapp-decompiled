package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6W8  reason: invalid class name */
public abstract class AnonymousClass6W8 {
    public static final C135686sb A00(String str) {
        ArrayList arrayList;
        Integer num;
        List A0s;
        C18070vi.A0d(str, 0);
        try {
            JSONObject A16 = C17880vN.A16(str);
            String A01 = C20064A5n.A01("source_type", (String) null, A16);
            if (A01 == null) {
                return null;
            }
            int parseInt = Integer.parseInt(A01);
            C29681ch A012 = C29681ch.A03.A01(C20064A5n.A01("channel_jid", (String) null, A16));
            String A013 = C20064A5n.A01("message_row_ids", (String) null, A16);
            if (A013 == null || (A0s = C108985cd.A0s(A013, 1)) == null) {
                arrayList = null;
            } else {
                arrayList = C29351c6.A0D(A0s);
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    C17880vN.A1R(arrayList, Long.parseLong(C17880vN.A0v(it)));
                }
            }
            String A014 = C20064A5n.A01("expiration_time", (String) null, A16);
            if (A014 != null) {
                num = C108955ca.A0l(A014);
            } else {
                num = null;
            }
            C135686sb r0 = new C135686sb(parseInt);
            r0.A00 = A012;
            r0.A02 = arrayList;
            r0.A01 = num;
            return r0;
        } catch (JSONException e) {
            C17900vP.A0X(e, "InviteSourceData/toInviteSourceData: failed to parse json string ", AnonymousClass000.A10());
            return null;
        } catch (NumberFormatException e2) {
            C17900vP.A0X(e2, "InviteSourceData/toInviteSourceData: failed to parse json string ", AnonymousClass000.A10());
            return null;
        }
    }
}
