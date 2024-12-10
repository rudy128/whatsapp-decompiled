package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2kM  reason: invalid class name and case insensitive filesystem */
public abstract class C58232kM {
    public final String A00;

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A00(org.json.JSONObject r12) {
        /*
            r11 = this;
            java.lang.String r2 = r11.A00
            boolean r0 = r12.has(r2)
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r6 = r12.get(r2)
            boolean r0 = r6 instanceof org.json.JSONArray
            if (r0 == 0) goto L_0x00e4
            org.json.JSONArray r6 = (org.json.JSONArray) r6
            int r0 = r6.length()
            java.util.ArrayList r5 = X.C17880vN.A0z(r0)
            r4 = 0
        L_0x001b:
            int r0 = r6.length()
            if (r4 >= r0) goto L_0x00e3
            boolean r0 = r11 instanceof X.AnonymousClass2C0
            if (r0 == 0) goto L_0x0064
            org.json.JSONObject r9 = r6.getJSONObject(r4)
            java.util.HashMap r3 = X.C17880vN.A11()
            java.util.Iterator r10 = r9.keys()
        L_0x0031:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.String r8 = X.C17880vN.A0v(r10)
            java.lang.Object r7 = r9.get(r8)
            boolean r0 = r7 instanceof org.json.JSONArray
            if (r0 == 0) goto L_0x0060
            org.json.JSONArray r7 = (org.json.JSONArray) r7
            int r0 = r7.length()
            byte[] r2 = new byte[r0]
            r1 = 0
        L_0x004c:
            int r0 = r7.length()
            if (r1 >= r0) goto L_0x005c
            int r0 = r7.getInt(r1)
            byte r0 = (byte) r0
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x004c
        L_0x005c:
            r3.put(r8, r2)
            goto L_0x0031
        L_0x0060:
            r3.put(r8, r7)
            goto L_0x0031
        L_0x0064:
            boolean r0 = r11 instanceof X.C45872Bz
            if (r0 == 0) goto L_0x0074
            java.lang.String r3 = r6.getString(r4)
        L_0x006c:
            if (r3 == 0) goto L_0x0071
        L_0x006e:
            r5.add(r3)
        L_0x0071:
            int r4 = r4 + 1
            goto L_0x001b
        L_0x0074:
            boolean r0 = r11 instanceof X.C45862By
            if (r0 == 0) goto L_0x0081
            long r0 = r6.getLong(r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            goto L_0x006c
        L_0x0081:
            org.json.JSONObject r7 = r6.getJSONObject(r4)
            java.lang.String r0 = "table_name"
            java.lang.String r8 = r7.getString(r0)
            java.lang.String r0 = "table_id_field"
            java.lang.String r2 = r7.getString(r0)
            java.lang.String r1 = "lookup_field"
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = r7.optString(r1)
        L_0x009f:
            X.2q3 r3 = new X.2q3
            r3.<init>(r8, r2, r0)
            java.lang.String r1 = "deleted_id_files"
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x00ba
            X.2Bz r0 = new X.2Bz
            r0.<init>(r1)
            java.util.ArrayList r1 = r0.A00(r7)
            java.util.List r0 = r3.A04
            r0.addAll(r1)
        L_0x00ba:
            java.lang.String r1 = "modified_entity_files"
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x00d0
            X.2Bz r0 = new X.2Bz
            r0.<init>(r1)
            java.util.ArrayList r1 = r0.A00(r7)
            java.util.List r0 = r3.A05
            r0.addAll(r1)
        L_0x00d0:
            java.lang.String r2 = "records_count_in_db"
            boolean r0 = r7.has(r2)
            if (r0 == 0) goto L_0x006e
            r0 = 0
            long r0 = r7.optLong(r2, r0)
            r3.A00 = r0
            goto L_0x006e
        L_0x00e1:
            r0 = 0
            goto L_0x009f
        L_0x00e3:
            return r5
        L_0x00e4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid type of element '"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "' - expect JSONArray."
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x00fc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Missing root element '"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "'"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58232kM.A00(org.json.JSONObject):java.util.ArrayList");
    }

    public JSONObject A01(List list) {
        boolean z;
        JSONArray jSONArray = new JSONArray();
        for (Object next : list) {
            if (this instanceof AnonymousClass2C0) {
                jSONArray.put(new JSONObject((Map) next));
            } else if ((this instanceof C45872Bz) || (this instanceof C45862By)) {
                jSONArray.put(next);
            } else {
                C61662q3 r5 = (C61662q3) next;
                JSONObject A15 = C17880vN.A15();
                A15.put("table_name", r5.A03);
                A15.put("table_id_field", r5.A02);
                String str = r5.A01;
                if (str != null) {
                    A15.put("lookup_field", str);
                }
                List list2 = r5.A04;
                boolean z2 = true;
                if (Collections.unmodifiableList(list2).size() > 0) {
                    List unmodifiableList = Collections.unmodifiableList(list2);
                    if (unmodifiableList.size() != 0) {
                        A15.put("deleted_id_files", new C58232kM("deleted_id_files").A01(unmodifiableList).get("deleted_id_files"));
                    }
                    z = true;
                } else {
                    z = false;
                }
                List list3 = r5.A05;
                if (Collections.unmodifiableList(list3).size() > 0) {
                    List unmodifiableList2 = Collections.unmodifiableList(list3);
                    if (unmodifiableList2.size() != 0) {
                        A15.put("modified_entity_files", new C58232kM("modified_entity_files").A01(unmodifiableList2).get("modified_entity_files"));
                    }
                } else {
                    z2 = z;
                }
                A15.put("records_count_in_db", r5.A00);
                if (z2) {
                    jSONArray.put(A15);
                }
            }
        }
        JSONObject A152 = C17880vN.A15();
        A152.put(this.A00, jSONArray);
        return A152;
    }

    public C58232kM(String str) {
        this.A00 = str;
    }
}
