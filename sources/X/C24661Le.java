package X;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Le  reason: invalid class name and case insensitive filesystem */
public class C24661Le {
    public final AnonymousClass190 A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1DL A02;
    public final AnonymousClass1Cd A03;
    public final C24621La A04;
    public final C24631Lb A05;
    public final C18030ve A06;
    public final C24651Ld A07;
    public final AnonymousClass00H A08;
    public final Object A09 = new Object();
    public final AnonymousClass00H A0A;
    public final Object A0B = new Object();
    public volatile ConcurrentHashMap A0C;

    public static String[] A04(C24661Le r3, UserJid userJid) {
        long j;
        String[] strArr = new String[1];
        if (userJid != null) {
            j = r3.A02.A09(userJid);
        } else {
            j = -1;
        }
        strArr[0] = String.valueOf(j);
        return strArr;
    }

    public C63372sx A08(UserJid userJid) {
        if (userJid == null) {
            this.A00.A0G("StatusStore/getStatusInfo for null UserJid", (String) null, true);
        }
        A03(this);
        if (userJid == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.A0C;
        C17960vV.A07(concurrentHashMap);
        return (C63372sx) concurrentHashMap.get(userJid);
    }

    public static String A00(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append("status".toUpperCase(Locale.ROOT));
        return sb.toString();
    }

    public static void A02(ContentValues contentValues, C24661Le r16, UserJid userJid, AnonymousClass206 r18, boolean z) {
        C41851xA BD0;
        C24661Le r2 = r16;
        C28791au A052 = r2.A03.A05();
        try {
            BD0 = A052.BD0();
            C23141Ev r9 = ((C28801av) A052).A02;
            UserJid userJid2 = userJid;
            if (r9.A02(contentValues, "status", "jid_row_id=?", A00("updateStatusesListForNewMessage/UPDATE"), A04(r2, userJid2)) == 0) {
                contentValues.put("jid_row_id", Long.valueOf(r2.A02.A09(userJid2)));
                long A053 = r9.A05("status", A00("updateStatusesListForNewMessage/INSERT"), contentValues);
                if (z && r2.A0C != null && r2.A0C.size() == 1) {
                    r2.A04.A05("earliest_status_time", r18.A0I);
                }
                if (A053 == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("statusmsgstore/addmsg/statuslist/insert/failed gid=");
                    sb.append(userJid2);
                    sb.append(";");
                    Log.e(sb.toString());
                }
            }
            BD0.A00();
            BD0.close();
            A052.close();
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A03(C24661Le r25) {
        C24661Le r1 = r25;
        if (r1.A0C == null) {
            C28791au A052 = r1.A03.A05();
            try {
                synchronized (r1.A0B) {
                    if (r1.A0C == null) {
                        Cursor A0A2 = ((C28801av) A052).A02.A0A("SELECT jid_row_id, message_table_id, last_read_message_table_id, last_read_receipt_sent_message_table_id, first_unread_message_table_id, autodownload_limit_message_table_id, timestamp, unseen_count, total_count FROM status", "SELECT_STATUS_LIST_V2", (String[]) null);
                        try {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            while (A0A2.moveToNext()) {
                                UserJid userJid = (UserJid) r1.A02.A0E(UserJid.class, A0A2.getLong(A0A2.getColumnIndexOrThrow("jid_row_id")));
                                if (userJid != null) {
                                    C63372sx r9 = new C63372sx(r1.A01, userJid, A0A2.getInt(A0A2.getColumnIndexOrThrow("unseen_count")), A0A2.getInt(A0A2.getColumnIndexOrThrow("total_count")), A0A2.getLong(A0A2.getColumnIndexOrThrow("message_table_id")), A0A2.getLong(A0A2.getColumnIndexOrThrow("last_read_message_table_id")), A0A2.getLong(A0A2.getColumnIndexOrThrow("last_read_receipt_sent_message_table_id")), A0A2.getLong(A0A2.getColumnIndexOrThrow("first_unread_message_table_id")), A0A2.getLong(A0A2.getColumnIndexOrThrow("autodownload_limit_message_table_id")), A0A2.getLong(A0A2.getColumnIndexOrThrow("timestamp")));
                                    concurrentHashMap.put(r9.A0A, r9);
                                }
                            }
                            A0A2.close();
                            r1.A0C = concurrentHashMap;
                        } catch (Throwable th) {
                            AnonymousClass0DT.A00(th, th);
                        }
                    }
                }
                A052.close();
                return;
            } catch (Throwable th2) {
                try {
                    A052.close();
                    throw th2;
                } catch (Throwable th3) {
                    AnonymousClass0DT.A00(th2, th3);
                    throw th2;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public int A05() {
        return this.A04.A00("status_distribution", 0);
    }

    public int A06(UserJid userJid) {
        C28791au A052 = this.A03.A05();
        try {
            int A042 = ((C28801av) A052).A02.A04("status", "jid_row_id=?", A00("deleteStatus/DELETE"), A04(this, userJid));
            A03(this);
            ConcurrentHashMap concurrentHashMap = this.A0C;
            C17960vV.A07(concurrentHashMap);
            concurrentHashMap.remove(userJid);
            A052.close();
            return A042;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public ArrayList A0A() {
        String A022 = this.A04.A02("status_white_list");
        if (TextUtils.isEmpty(A022)) {
            return new ArrayList();
        }
        return C22971Dz.A0A(AnonymousClass1BI.class, Arrays.asList(A022.split(",")));
    }

    public ArrayList A0B() {
        String A022 = this.A04.A02("status_black_list");
        if (TextUtils.isEmpty(A022)) {
            return new ArrayList();
        }
        return C22971Dz.A0A(AnonymousClass1BI.class, Arrays.asList(A022.split(",")));
    }

    public void A0D(C63372sx r10, UserJid userJid) {
        C28791au A052 = this.A03.A05();
        try {
            ContentValues contentValues = new ContentValues(8);
            A01(contentValues, r10);
            if (((C28801av) A052).A02.A02(contentValues, "status", "jid_row_id=?", A00("updateStatus/UPDATE"), A04(this, userJid)) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("StatusStore/updateStatus/failed jid=");
                sb.append(userJid);
                sb.append(";");
                Log.e(sb.toString());
            }
            A03(this);
            ConcurrentHashMap concurrentHashMap = this.A0C;
            C17960vV.A07(concurrentHashMap);
            concurrentHashMap.put(userJid, r10);
            A052.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void A0E(UserJid userJid, int i, int i2) {
        C28791au A052 = this.A03.A05();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("unseen_count", Integer.valueOf(i));
            contentValues.put("total_count", Integer.valueOf(i2));
            if (((C28801av) A052).A02.A02(contentValues, "status", "jid_row_id=?", A00("updateStatusCount/UPDATE"), A04(this, userJid)) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("StatusStore/updateStatusCount/update count failed jid=");
                sb.append(userJid);
                sb.append("; ");
                Log.e(sb.toString());
            }
            A052.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void A0F(Collection collection) {
        SharedPreferences.Editor edit;
        if (C18020vd.A05(C18040vf.A02, this.A06, 10187)) {
            Iterator it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                Collection<C62452rQ> values = ((AnonymousClass1WW) this.A0A.get()).A00(((AnonymousClass206) it.next()).A0x).A00.values();
                C18070vi.A0X(values);
                for (C62452rQ A012 : values) {
                    if (A012.A01(13) > 0) {
                        i++;
                    }
                }
            }
            C24651Ld r0 = this.A07;
            int A002 = r0.A00("num_views_received_key");
            SharedPreferences sharedPreferences = (SharedPreferences) r0.A03.getValue();
            if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
                edit.putInt("num_views_received_key", A002 + i);
                edit.apply();
            }
        }
    }

    public void A0G(Collection collection, int i) {
        ArrayList A0B2;
        String str;
        if (collection == null) {
            A0B2 = null;
        } else {
            A0B2 = C22971Dz.A0B(collection);
        }
        C24621La r3 = this.A04;
        r3.A04("status_distribution", i);
        if (A0B2 != null) {
            if (i == 2) {
                str = "status_black_list";
            } else if (i == 1) {
                str = "status_white_list";
            } else {
                return;
            }
            r3.A06(str, TextUtils.join(",", A0B2));
        }
    }

    public boolean A0I() {
        if (this.A04.A02("status_distribution") != null) {
            return true;
        }
        return false;
    }

    public boolean A0J(AnonymousClass206 r11) {
        int i;
        C17960vV.A0F(C22971Dz.A0a(r11.A0v.A00), "isStatusExpired should be called for statuses only");
        if (C22971Dz.A0Z(r11.A0H())) {
            C63322ss A002 = this.A05.A00(r11);
            if (!A002.A00()) {
                StringBuilder sb = new StringBuilder();
                sb.append("StatusStore/isStatusExpired/is new status psa/campaign id: ");
                sb.append(A002.A04);
                sb.append(", campaign first seen time: ");
                sb.append(A002.A01);
                sb.append(", campaign expiration time:");
                sb.append(A002.A00);
                Log.i(sb.toString());
                if (!A002.A01(AnonymousClass11P.A01(this.A01)) || A002.A04 == null) {
                    return false;
                }
                return true;
            }
            C24621La r3 = this.A04;
            long A012 = r3.A01("status_psa_viewed_time", 0);
            long A013 = r3.A01("status_psa_exipration_time", 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("StatusStore/isStatusExpired/is legacy status psa/psa seen ts: ");
            sb2.append(A012);
            sb2.append(", psa expire ts: ");
            sb2.append(A013);
            Log.i(sb2.toString());
            if (r11.A0I >= A012 || A013 == 0) {
                return false;
            }
            i = (A013 > AnonymousClass11P.A01(this.A01) ? 1 : (A013 == AnonymousClass11P.A01(this.A01) ? 0 : -1));
        } else {
            i = (r11.A0I > (AnonymousClass11P.A01(this.A01) - 86400000) ? 1 : (r11.A0I == (AnonymousClass11P.A01(this.A01) - 86400000) ? 0 : -1));
        }
        if (i < 0) {
            return true;
        }
        return false;
    }

    public boolean A0K(AnonymousClass206 r3, boolean z) {
        C63372sx A082;
        if (r3.A0v.A02) {
            A082 = A07();
        } else {
            A082 = A08(r3.A0I());
        }
        if (A082 != null) {
            return !C20133A8t.A0C(r3, A082.A05(), z);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("statusmsgstore/isstatusunseen/no status for ");
        sb.append(r3.A0I());
        Log.w(sb.toString());
        return false;
    }

    public C24661Le(AnonymousClass190 r2, AnonymousClass11P r3, AnonymousClass1DL r4, AnonymousClass1Cd r5, C24621La r6, C24631Lb r7, C18030ve r8, C24651Ld r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        this.A06 = r8;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        this.A04 = r6;
        this.A08 = r10;
        this.A03 = r5;
        this.A05 = r7;
        this.A07 = r9;
        this.A0A = r11;
    }

    public static void A01(ContentValues contentValues, C63372sx r3) {
        long j;
        long j2;
        contentValues.put("message_table_id", Long.valueOf(r3.A03()));
        contentValues.put("last_read_message_table_id", Long.valueOf(r3.A05()));
        synchronized (r3) {
            j = r3.A06;
        }
        contentValues.put("last_read_receipt_sent_message_table_id", Long.valueOf(j));
        contentValues.put("first_unread_message_table_id", Long.valueOf(r3.A02()));
        synchronized (r3) {
            j2 = r3.A02;
        }
        contentValues.put("autodownload_limit_message_table_id", Long.valueOf(j2));
        contentValues.put("timestamp", Long.valueOf(r3.A04()));
        contentValues.put("unseen_count", Integer.valueOf(r3.A01()));
        contentValues.put("total_count", Integer.valueOf(r3.A00()));
    }

    public C63372sx A07() {
        A03(this);
        ConcurrentHashMap concurrentHashMap = this.A0C;
        C17960vV.A07(concurrentHashMap);
        return (C63372sx) concurrentHashMap.get(AnonymousClass1E5.A00);
    }

    public ArrayList A09() {
        A03(this);
        ConcurrentHashMap concurrentHashMap = this.A0C;
        C17960vV.A07(concurrentHashMap);
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (C63372sx r1 : concurrentHashMap.values()) {
            if (!r1.A0D()) {
                arrayList.add(r1.A06());
            }
        }
        return arrayList;
    }

    public Map A0C() {
        A03(this);
        ConcurrentHashMap concurrentHashMap = this.A0C;
        C17960vV.A07(concurrentHashMap);
        if (concurrentHashMap.isEmpty()) {
            Log.e("StatusStore is empty");
        }
        ConcurrentHashMap concurrentHashMap2 = this.A0C;
        C17960vV.A07(concurrentHashMap2);
        return Collections.unmodifiableMap(concurrentHashMap2);
    }

    public boolean A0H() {
        if (A05() != 1 || !A0A().isEmpty()) {
            return false;
        }
        return true;
    }
}
