package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2Ja  reason: invalid class name and case insensitive filesystem */
public class C47602Ja extends A3R {
    public final AnonymousClass11S A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1TM A02;
    public final C20047A4q A03;
    public final AnonymousClass19T A04;
    public final C37551pj A05;
    public final AnonymousClass1M9 A06;
    public final AnonymousClass11P A07;
    public final AnonymousClass122 A08;
    public final AnonymousClass1MZ A09;
    public final C25351Nw A0A;
    public final C95684md A0B;
    public final C47632Jd A0C;
    public final C53502cd A0D;
    public final AnonymousClass1Nb A0E;
    public final AnonymousClass1W6 A0F;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9 A[Catch:{ Exception -> 0x00c9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A00(X.C29691ci r11, X.C47602Ja r12, X.C60012nF r13, int r14) {
        /*
            java.lang.String r2 = "InboxRequest/getMessageList"
            X.122 r3 = r12.A08     // Catch:{ Exception -> 0x00c9 }
            X.1BI r4 = r11.A08()     // Catch:{ Exception -> 0x00c9 }
            int r5 = r14 + 1
            X.11P r0 = r12.A07     // Catch:{ Exception -> 0x00c9 }
            long r8 = X.AnonymousClass11P.A01(r0)     // Catch:{ Exception -> 0x00c9 }
            r6 = 1
            r10 = 1
            X.2dp r0 = X.AnonymousClass122.A00(r3, r4, r5, r6, r8, r10)     // Catch:{ Exception -> 0x00c9 }
            android.database.Cursor r7 = r0.A00     // Catch:{ Exception -> 0x00c9 }
            if (r7 == 0) goto L_0x00c4
            boolean r0 = r7.moveToFirst()     // Catch:{ Exception -> 0x00c9 }
            if (r0 == 0) goto L_0x00c4
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x00c9 }
            r5 = 0
            r8 = r5
        L_0x0027:
            X.1W6 r1 = r12.A0F     // Catch:{ Exception -> 0x00c9 }
            X.1BI r0 = r11.A08()     // Catch:{ Exception -> 0x00c9 }
            X.206 r9 = r1.A02(r7, r0)     // Catch:{ Exception -> 0x00c9 }
            if (r9 != 0) goto L_0x0040
            java.lang.String r0 = "InboxRequest/getMessageList/null_messages"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x00c9 }
        L_0x0038:
            boolean r0 = r7.moveToNext()     // Catch:{ Exception -> 0x00c9 }
            if (r0 != 0) goto L_0x0027
            goto L_0x00c2
        L_0x0040:
            boolean r0 = r9.A16()     // Catch:{ Exception -> 0x00c9 }
            if (r0 == 0) goto L_0x0051
            X.1Nw r1 = r12.A0A     // Catch:{ Exception -> 0x00c9 }
            java.lang.Class<X.36u> r0 = X.C693336u.class
            X.25F r0 = X.C18070vi.A09(r9, r0)     // Catch:{ Exception -> 0x00c9 }
            r1.Bhl(r0)     // Catch:{ Exception -> 0x00c9 }
        L_0x0051:
            X.2Jd r3 = r12.A0C     // Catch:{ Exception -> 0x00c9 }
            boolean r0 = r9 instanceof X.C436420i     // Catch:{ Exception -> 0x00c9 }
            if (r0 == 0) goto L_0x0086
            r1 = r9
            X.20i r1 = (X.C436420i) r1     // Catch:{ Exception -> 0x00c9 }
            boolean r0 = r1 instanceof X.C48392Mh     // Catch:{ Exception -> 0x00c9 }
            if (r0 != 0) goto L_0x0063
            boolean r0 = r1 instanceof X.AnonymousClass2MC     // Catch:{ Exception -> 0x00c9 }
            if (r0 != 0) goto L_0x0063
            goto L_0x0082
        L_0x0063:
            org.json.JSONObject r4 = X.C17880vN.A15()     // Catch:{ Exception -> 0x00c9 }
            X.1gn r0 = r3.A01     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r1 = r0.A0S(r1, r10)     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r0 = "text"
            r4.put(r0, r1)     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r1 = "type"
            java.lang.String r0 = "system"
            r4.put(r1, r0)     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r0 = "is_admin_message"
            r4.put(r0, r10)     // Catch:{ Exception -> 0x00c9 }
            goto L_0x0083
        L_0x0082:
            r4 = 0
        L_0x0083:
            if (r4 == 0) goto L_0x00a7
            goto L_0x009c
        L_0x0086:
            org.json.JSONObject r4 = r3.A08(r9, r13, r10)     // Catch:{ Exception -> 0x00c9 }
            if (r4 != 0) goto L_0x009c
            org.json.JSONObject r4 = X.C17880vN.A15()     // Catch:{ Exception -> 0x00c9 }
            A03(r3, r9, r13, r4)     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r1 = "type"
            java.lang.String r0 = "unknown"
            r4.put(r1, r0)     // Catch:{ Exception -> 0x00c9 }
        L_0x009c:
            A03(r3, r9, r13, r4)     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r3 = "timestamp"
            long r0 = r9.A0I     // Catch:{ Exception -> 0x00c9 }
            r4.put(r3, r0)     // Catch:{ Exception -> 0x00c9 }
        L_0x00a7:
            if (r4 == 0) goto L_0x0038
            java.lang.String r0 = "message_id"
            java.lang.String r1 = r4.optString(r0, r5)     // Catch:{ Exception -> 0x00c9 }
            if (r8 == 0) goto L_0x00b6
            java.lang.String r0 = "prev_mid"
            r8.put(r0, r1)     // Catch:{ Exception -> 0x00c9 }
        L_0x00b6:
            int r0 = r6.size()     // Catch:{ Exception -> 0x00c9 }
            if (r0 >= r14) goto L_0x00c3
            r6.add(r4)     // Catch:{ Exception -> 0x00c9 }
            r8 = r4
            goto L_0x0038
        L_0x00c2:
            return r6
        L_0x00c3:
            return r6
        L_0x00c4:
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x00c9 }
            return r0
        L_0x00c9:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47602Ja.A00(X.1ci, X.2Ja, X.2nF, int):java.util.List");
    }

    public static JSONArray A01(List list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object put : list) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    public static void A03(C47632Jd r3, AnonymousClass206 r4, C60012nF r5, JSONObject jSONObject) {
        jSONObject.put("message_id", r3.A09.A01(r4.A0v, r5));
        AnonymousClass1E7 A002 = C47632Jd.A00(r3, r4);
        C19959A0q a0q = r3.A08;
        AnonymousClass1BI r0 = A002.A0J;
        C17960vV.A07(r0);
        jSONObject.put("author_id", a0q.A02(r0, r5));
    }

    public C47602Ja(AnonymousClass11S r2, C37551pj r3, AnonymousClass1M9 r4, AnonymousClass11P r5, AnonymousClass1CJ r6, AnonymousClass122 r7, AnonymousClass1MZ r8, C25351Nw r9, C95684md r10, AnonymousClass1TM r11, C20047A4q a4q, C47632Jd r13, C53502cd r14, AnonymousClass19T r15, AnonymousClass1Nb r16, AnonymousClass1W6 r17) {
        this.A04 = r15;
        this.A07 = r5;
        this.A00 = r2;
        this.A01 = r6;
        this.A06 = r4;
        this.A05 = r3;
        this.A0B = r10;
        this.A08 = r7;
        this.A0D = r14;
        this.A0F = r17;
        this.A0A = r9;
        this.A0E = r16;
        this.A02 = r11;
        this.A09 = r8;
        this.A0C = r13;
        this.A03 = a4q;
    }

    public static JSONObject A02(C29691ci r14, C47602Ja r15, C60012nF r16, String str) {
        String str2;
        String str3;
        String A0I;
        String A0I2;
        String A0I3;
        AnonymousClass1BI A082 = r14.A08();
        C47602Ja r9 = r15;
        C53502cd r2 = r15.A0D;
        AnonymousClass1E7 A0E2 = r2.A00.A0E(r14.A08());
        if (A0E2 != null) {
            str2 = r2.A01.A0I(A0E2);
        } else {
            Log.w("DisplayNameUtils/getThreadName/contact_for_jid_not_found");
            str2 = null;
        }
        C20047A4q a4q = r15.A03;
        C60012nF r3 = r16;
        String A032 = a4q.A03(r3, A082.getRawString());
        boolean A0e = C22971Dz.A0e(A082);
        boolean A042 = C43391zj.A04(r15.A06, r15.A01, A082);
        if (C22971Dz.A0d(A082) && r15.A05.A0P((UserJid) A082)) {
            str3 = "blocked";
        } else if ((A082 instanceof GroupJid) && !r15.A09.A0J((GroupJid) A082)) {
            str3 = "no_longer_part_of_group";
        } else if (r15.A0B.A01(A082)) {
            str3 = "read_only";
        } else {
            str3 = "allowed";
        }
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        if (A0e && C22971Dz.A0e(A082)) {
            AnonymousClass1IZ it = r15.A09.A08.A0B((AnonymousClass1E9) A082).A0B().iterator();
            while (it.hasNext()) {
                UserJid userJid = ((C63312sr) it.next()).A04;
                A13.add(a4q.A03(r3, userJid.getRawString()));
                C47632Jd r142 = r9.A0C;
                AnonymousClass1E7 A0E3 = r142.A02.A0E(userJid);
                if (A0E3 == null || (A0I3 = r142.A03.A0I(A0E3)) == null) {
                    Log.e("InboxRequest/createThreadHeaderJson/null_contact_name");
                    A132.add("<<unknown>>");
                } else {
                    A132.add(A0I3);
                }
            }
        } else if (C22971Dz.A0d(A082)) {
            A13.add(a4q.A03(r3, A082.getRawString()));
            C47632Jd r32 = r15.A0C;
            AnonymousClass1E7 A0E4 = r32.A02.A0E(A082);
            if (A0E4 == null || (A0I2 = r32.A03.A0I(A0E4)) == null) {
                Log.e("InboxRequest/createThreadHeaderJson/null_contact_name");
                A132.add("<<unknown>>");
            } else {
                A132.add(A0I2);
            }
            A13.add(str);
            AnonymousClass11S r0 = r15.A00;
            r0.A0I();
            AnonymousClass1E8 r1 = r0.A0D;
            if (r1 == null) {
                A0I = null;
            } else {
                A0I = r32.A03.A0I(r1);
            }
            A132.add(A0I);
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("InboxRequest/handleSnapshotRequest/unsupported jid type ");
            A10.append(A082.getType());
            C17890vO.A0w(A10);
            return null;
        }
        JSONObject A15 = C17880vN.A15();
        A15.put("thread_name", str2);
        A15.put("thread_id", A032);
        A15.put("is_group", A0e);
        A15.put("is_muted", r9.A0E.A0a(A082).A0A());
        A15.put("is_ephemeral", A042);
        A15.put("compose_state", str3);
        A15.put("participant_ids", A01(A13));
        A15.put("participant_names", A01(A132));
        return A15;
    }
}
