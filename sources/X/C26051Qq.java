package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Qq  reason: invalid class name and case insensitive filesystem */
public class C26051Qq {
    public Map A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1DL A02;
    public final AnonymousClass1Cd A03;
    public final AnonymousClass1QV A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass1LW A06;
    public final C24621La A07;

    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object, X.3Bh] */
    public ArrayList A01(boolean z, boolean z2) {
        AnonymousClass1Ez r6 = new AnonymousClass1Ez(false);
        r6.A04();
        Map A022 = A02();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : A022.entrySet()) {
            AnonymousClass1BI r4 = ((AnonymousClass2SC) entry.getKey()).A01;
            if ((!z || !C22971Dz.A0T(r4)) && !C22971Dz.A0S(r4)) {
                if (!z2 || C22971Dz.A0d(r4)) {
                    entry.getKey();
                    int intValue = ((Number) entry.getValue()).intValue();
                    if (intValue != 0) {
                        C70493Bh r2 = (C70493Bh) hashMap.get(r4);
                        C70493Bh r22 = r2;
                        if (r2 == null) {
                            long A08 = this.A01.A08(r4);
                            ? obj = new Object();
                            obj.A01 = A08;
                            r22 = obj;
                        }
                        r22.A00 += intValue;
                        hashMap.put(r4, r22);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList, new C147027Rn(9));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList2.add(entry2.getKey());
            entry2.getKey();
            entry2.getValue();
            entry2.getValue();
        }
        Log.i(String.format(Locale.US, "frequentmsgstore/getfrequents took %d ms", new Object[]{Long.valueOf(r6.A01())}));
        return arrayList2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r1v10, types: [X.2SC, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        if (r11 <= r15) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r18 = this;
            r4 = 0
            X.1Ez r5 = new X.1Ez
            r5.<init>((boolean) r4)
            java.lang.String r0 = "frequentmsgstore/updateFrequents"
            r5.A05(r0)
            r10 = r18
            X.1Cd r0 = r10.A03
            X.1au r17 = r0.A05()
            r0 = r17
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0162 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0162 }
            X.11P r8 = r10.A05     // Catch:{ all -> 0x0162 }
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0162 }
            r0 = 691200000(0x2932e000, double:3.414981744E-315)
            long r15 = r15 - r0
            java.lang.String r1 = "SELECT sort_id, received_timestamp FROM available_message_view WHERE received_timestamp > 0 ORDER BY sort_id DESC LIMIT 4096"
            java.lang.String r0 = "GET_SAMPLE_FOR_FREQUENTS"
            r2 = 0
            android.database.Cursor r13 = r3.A0A(r1, r0, r2)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "received_timestamp"
            int r14 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "sort_id"
            int r7 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0156 }
            r0 = 0
            r9 = 0
        L_0x003c:
            boolean r6 = r13.moveToNext()     // Catch:{ all -> 0x0156 }
            if (r6 == 0) goto L_0x0050
            long r11 = r13.getLong(r14)     // Catch:{ all -> 0x0156 }
            long r0 = r13.getLong(r7)     // Catch:{ all -> 0x0156 }
            int r9 = r9 + 1
            int r6 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r6 > 0) goto L_0x003c
        L_0x0050:
            r13.close()     // Catch:{ all -> 0x0162 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
            r7.<init>()     // Catch:{ all -> 0x0162 }
            java.lang.String r6 = "frequentmsgstore/updateFrequents/start sort_id:"
            r7.append(r6)     // Catch:{ all -> 0x0162 }
            r7.append(r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r6 = " "
            r7.append(r6)     // Catch:{ all -> 0x0162 }
            r7.append(r9)     // Catch:{ all -> 0x0162 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0162 }
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ all -> 0x0162 }
            r6 = 2
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0162 }
            r7[r4] = r0     // Catch:{ all -> 0x0162 }
            r0 = 6
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x0162 }
            r6 = 1
            r7[r6] = r0     // Catch:{ all -> 0x0162 }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x0162 }
            r9.<init>()     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "SELECT chat_row_id, message_type FROM available_message_view WHERE sort_id >= ? AND from_me = 1 AND status != ?"
            java.lang.String r0 = "GET_MESSAGES_FOR_FREQUENTS"
            android.database.Cursor r7 = r3.A0A(r1, r0, r7)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "message_type"
            int r11 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x014f }
        L_0x0093:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x00d0
            X.1LW r0 = r10.A06     // Catch:{ all -> 0x014f }
            X.1BI r12 = r0.A0C(r7)     // Catch:{ all -> 0x014f }
            if (r12 == 0) goto L_0x0093
            boolean r0 = X.C22971Dz.A0a(r12)     // Catch:{ all -> 0x014f }
            if (r0 != 0) goto L_0x0093
            int r0 = r7.getInt(r11)     // Catch:{ all -> 0x014f }
            byte r0 = (byte) r0     // Catch:{ all -> 0x014f }
            X.2SC r1 = new X.2SC     // Catch:{ all -> 0x014f }
            r1.<init>()     // Catch:{ all -> 0x014f }
            r1.A01 = r12     // Catch:{ all -> 0x014f }
            r1.A00 = r0     // Catch:{ all -> 0x014f }
            java.lang.Object r0 = r9.get(r1)     // Catch:{ all -> 0x014f }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x014f }
            if (r0 != 0) goto L_0x00c5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x014f }
        L_0x00c1:
            r9.put(r1, r0)     // Catch:{ all -> 0x014f }
            goto L_0x0093
        L_0x00c5:
            int r0 = r0.intValue()     // Catch:{ all -> 0x014f }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x014f }
            goto L_0x00c1
        L_0x00d0:
            r7.close()     // Catch:{ all -> 0x0162 }
            r9.size()     // Catch:{ all -> 0x0162 }
            X.1xA r11 = r17.BD0()     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "frequent"
            java.lang.String r0 = "updateFrequents/DELETE_FREQUENT"
            r3.A04(r1, r2, r0, r2)     // Catch:{ all -> 0x014a }
            java.util.Set r0 = r9.entrySet()     // Catch:{ all -> 0x014a }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x014a }
        L_0x00ea:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x0114
            java.lang.Object r3 = r7.next()     // Catch:{ all -> 0x014a }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x014a }
            java.lang.Object r0 = r3.getKey()     // Catch:{ all -> 0x014a }
            X.2SC r0 = (X.AnonymousClass2SC) r0     // Catch:{ all -> 0x014a }
            X.1BI r2 = r0.A01     // Catch:{ all -> 0x014a }
            java.lang.Object r0 = r3.getKey()     // Catch:{ all -> 0x014a }
            X.2SC r0 = (X.AnonymousClass2SC) r0     // Catch:{ all -> 0x014a }
            int r1 = r0.A00     // Catch:{ all -> 0x014a }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x014a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x014a }
            int r0 = r0.intValue()     // Catch:{ all -> 0x014a }
            A00(r10, r2, r1, r0, r6)     // Catch:{ all -> 0x014a }
            goto L_0x00ea
        L_0x0114:
            r11.A00()     // Catch:{ all -> 0x014a }
            r11.close()     // Catch:{ all -> 0x0162 }
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0162 }
            r0.<init>(r9)     // Catch:{ all -> 0x0162 }
            r10.A00 = r0     // Catch:{ all -> 0x0162 }
            X.1La r3 = r10.A07     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = "frequents"
            long r0 = X.AnonymousClass11P.A01(r8)     // Catch:{ all -> 0x0162 }
            r3.A05(r2, r0)     // Catch:{ all -> 0x0162 }
            r17.close()
            r5.A02()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r6]
            long r0 = r5.A01()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2[r4] = r0
            java.lang.String r0 = "frequentmsgstore/updateFrequents took %d ms"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x014a:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x015d }
            goto L_0x0161
        L_0x014f:
            r1 = move-exception
            if (r7 == 0) goto L_0x0161
            r7.close()     // Catch:{ all -> 0x015d }
            goto L_0x0161
        L_0x0156:
            r1 = move-exception
            if (r13 == 0) goto L_0x0161
            r13.close()     // Catch:{ all -> 0x015d }
            goto L_0x0161
        L_0x015d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0162 }
        L_0x0161:
            throw r1     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0167 }
            throw r1
        L_0x0167:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26051Qq.A03():void");
    }

    public static void A00(C26051Qq r8, AnonymousClass1BI r9, int i, int i2, boolean z) {
        long A09 = r8.A02.A09(r9);
        if (!z) {
            C60042nI A002 = r8.A04.A00("UPDATE frequent   SET message_count = ? WHERE jid_row_id = ? AND type = ?", "UPDATE_FREQUENT");
            SQLiteStatement sQLiteStatement = A002.A00;
            sQLiteStatement.bindLong(2, A09);
            sQLiteStatement.bindLong(3, (long) i);
            sQLiteStatement.bindLong(1, (long) i2);
            if (A002.A00() == 1) {
                return;
            }
        }
        C60042nI A003 = r8.A04.A00("INSERT INTO frequent(jid_row_id, type, message_count) VALUES (?, ?, ?)", "INSERT_FREQUENT");
        SQLiteStatement sQLiteStatement2 = A003.A00;
        sQLiteStatement2.bindLong(1, A09);
        sQLiteStatement2.bindLong(2, (long) i);
        sQLiteStatement2.bindLong(3, (long) i2);
        if (A003.A01() == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("frequentMessageStore/insertOrUpdateFrequent/failed jid=");
            sb.append(r9);
            sb.append(" type=");
            sb.append(i);
            Log.e(sb.toString());
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.2SC, java.lang.Object] */
    public Map A02() {
        Cursor A0A;
        if (this.A00 == null) {
            this.A00 = new ConcurrentHashMap();
            C28781at A042 = this.A03.get();
            try {
                A0A = ((C28801av) A042).A02.A0A("SELECT jid_row_id, type, message_count FROM frequent", "GET_FREQUENT", (String[]) null);
                int columnIndexOrThrow = A0A.getColumnIndexOrThrow("jid_row_id");
                int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                int columnIndexOrThrow3 = A0A.getColumnIndexOrThrow("message_count");
                while (A0A.moveToNext()) {
                    AnonymousClass1BI r1 = (AnonymousClass1BI) this.A02.A0E(AnonymousClass1BI.class, A0A.getLong(columnIndexOrThrow));
                    if (r1 != null) {
                        if (!C22971Dz.A0T(r1) || this.A01.A0P(r1)) {
                            ? obj = new Object();
                            obj.A01 = r1;
                            obj.A00 = (byte) A0A.getInt(columnIndexOrThrow2);
                            this.A00.put(obj, Integer.valueOf(A0A.getInt(columnIndexOrThrow3)));
                        }
                    }
                }
                A0A.close();
                A042.close();
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        }
        return this.A00;
        throw th;
    }

    public void A04(AnonymousClass1BI r7) {
        C28791au A052 = this.A03.A05();
        try {
            long A09 = this.A02.A09(r7);
            C60042nI A002 = this.A04.A00("DELETE FROM frequent WHERE jid_row_id = ?", "DELETE_FREQUENT_FOR_JID");
            A002.A00.bindLong(1, A09);
            A002.A00();
            A052.close();
            Map map = this.A00;
            if (map != null) {
                ArrayList arrayList = new ArrayList();
                for (AnonymousClass2SC r1 : map.keySet()) {
                    if (r7.equals(r1.A01)) {
                        arrayList.add(r1);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.A00.remove(it.next());
                }
            }
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public boolean A05() {
        if (this.A07.A01("frequents", 0) + 86400000 >= AnonymousClass11P.A01(this.A05)) {
            return false;
        }
        A03();
        return true;
    }

    public C26051Qq(AnonymousClass11P r1, AnonymousClass1LW r2, AnonymousClass1CJ r3, AnonymousClass1DL r4, AnonymousClass1Cd r5, C24621La r6, AnonymousClass1QV r7) {
        this.A05 = r1;
        this.A02 = r4;
        this.A06 = r2;
        this.A01 = r3;
        this.A07 = r6;
        this.A04 = r7;
        this.A03 = r5;
    }
}
