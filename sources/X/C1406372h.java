package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.72h  reason: invalid class name and case insensitive filesystem */
public class C1406372h {
    public final AnonymousClass6O0 A00;
    public final C19830z4 A01;
    public final AnonymousClass1CJ A02;
    public final C25321Nt A03;
    public final C55592g3 A04;
    public final C1403671d A05;
    public final AnonymousClass00H A06;
    public final CopyOnWriteArrayList A07 = new CopyOnWriteArrayList();
    public final AnonymousClass1M9 A08;
    public final AnonymousClass11P A09;
    public final AnonymousClass1LW A0A;

    public static boolean A02(AnonymousClass7PZ r5) {
        D3j d3j = r5.A00;
        if (d3j.A0I == 0 && d3j.A06 == 0) {
            return true;
        }
        return false;
    }

    public C1406372h(AnonymousClass1M9 r2, AnonymousClass6O0 r3, AnonymousClass11P r4, C19830z4 r5, AnonymousClass1LW r6, AnonymousClass1CJ r7, C25321Nt r8, C55592g3 r9, C26301Rp r10, AnonymousClass00H r11) {
        this.A09 = r4;
        this.A0A = r6;
        this.A02 = r7;
        this.A08 = r2;
        this.A01 = r5;
        this.A06 = r11;
        this.A03 = r8;
        this.A00 = r3;
        this.A04 = r9;
        this.A05 = new C1403671d(r4, r10);
    }

    private ArrayList A00(Set set) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0Q = C17880vN.A0Q(it);
            if (this.A08.A0E(A0Q) != null) {
                D3j A002 = C25321Nt.A00(this.A03, A0Q);
                C18070vi.A0d(A0Q, 1);
                A13.add(new AnonymousClass7PZ(A002, A0Q, A0Q.getRawString()));
            }
        }
        return A13;
    }

    public static void A01(C42621yT r12, C1406372h r13, AtomicBoolean atomicBoolean) {
        Throwable th;
        C28791au r8;
        Throwable th2;
        C28791au r82;
        int i;
        Cursor A032;
        AnonymousClass1BI r83;
        SystemClock.elapsedRealtime();
        ArrayList A13 = AnonymousClass000.A13();
        HashSet A12 = C17880vN.A12();
        AnonymousClass1CJ r4 = r13.A02;
        HashSet hashSet = new HashSet(r4.A0I());
        AnonymousClass6O0 r2 = r13.A00;
        Cursor A0I = r2.A0I();
        try {
            if (A0I.getCount() != 0) {
                HashSet hashSet2 = new HashSet(hashSet);
                while (A0I.moveToNext()) {
                    AnonymousClass1BI A0l = AnonymousClass3MX.A0l(A0I.getString(0));
                    if (A0l != null) {
                        hashSet2.remove(A0l);
                    }
                }
                ArrayList A10 = C17880vN.A10(hashSet2);
                A10.size();
                if (!A10.isEmpty()) {
                    r2.A0K(A10);
                }
                A0I.close();
                A0I = r2.A0I();
            } else {
                A0I.close();
                C55592g3 r3 = r13.A04;
                long A092 = r3.A00.A09(C29671cg.A00);
                AnonymousClass1Cd r0 = r3.A04;
                r0.A06();
                C23141Ev BXw = r0.A02.BXw();
                String[] A1Y = C17880vN.A1Y();
                A1Y[0] = Long.toString(A092);
                A0I = BXw.A0A("SELECT message.chat_row_id AS chat_row_id, sum(file_size) AS media_sum FROM message_media message_media JOIN message message ON message_media.message_row_id = message._id WHERE message.message_type IN ('0','1','2','3','4','5','9','13','14') AND message.chat_row_id != ? GROUP BY message.chat_row_id ORDER BY media_sum DESC", "GET_CONTACTS_SORTED_LIST_BY_MEDIA_SIZE_SQL", A1Y);
            }
            A0I.getCount();
            if (A0I.moveToFirst()) {
                boolean z = false;
                do {
                    if (r12 != null) {
                        r12.A02();
                    }
                    if (atomicBoolean.get()) {
                        A0I.close();
                        return;
                    }
                    if (A13.size() > 16 && !z) {
                        SystemClock.elapsedRealtime();
                        z = true;
                    }
                    int columnIndex = A0I.getColumnIndex("chat_row_id");
                    if (columnIndex > -1) {
                        r83 = r13.A0A.A0B(A0I.getLong(columnIndex));
                    } else {
                        r83 = AnonymousClass3MX.A0l(C17890vO.A0S(A0I, "jid"));
                    }
                    if (r83 != null) {
                        if (!r4.A0S(r83) || ((C31191fA) r13.A06.get()).A03) {
                            Iterator it = A13.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((AnonymousClass7PZ) it.next()).A01().equals(r83)) {
                                        break;
                                    }
                                } else {
                                    Iterator it2 = A12.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (C17880vN.A0S(it2).equals(r83)) {
                                                break;
                                            }
                                        } else {
                                            A12.add(r83);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if ((A13.size() < 16 && A12.size() >= 2) || (A13.size() >= 16 && A12.size() >= 5)) {
                        ArrayList A002 = r13.A00(A12);
                        A12.clear();
                        if (!A002.isEmpty()) {
                            A13.addAll(A002);
                            A13.size();
                            C125816bj r9 = new C125816bj(A002);
                            Iterator it3 = r13.A07.iterator();
                            while (it3.hasNext()) {
                                ((C1606589k) it3.next()).BoI(r9);
                            }
                            for (int i2 = 0; i2 < A002.size(); i2++) {
                                r2.A0J((AnonymousClass7PZ) A002.get(i2));
                            }
                        }
                    }
                } while (A0I.moveToNext());
                if (A12.size() > 0) {
                    A13.addAll(r13.A00(A12));
                }
                Collections.sort(A13);
            }
            A0I.close();
            try {
                C24811Lt r10 = r2.A00;
                C28791au A062 = r10.A06();
                try {
                    C41851xA BD0 = A062.BD0();
                    try {
                        Cursor A0I2 = r2.A0I();
                        try {
                            HashSet hashSet3 = new HashSet(hashSet);
                            while (A0I2.moveToNext()) {
                                AnonymousClass1BI A0l2 = AnonymousClass3MX.A0l(A0I2.getString(0));
                                if (A0l2 != null) {
                                    hashSet3.remove(A0l2);
                                }
                            }
                            ArrayList A102 = C17880vN.A10(hashSet3);
                            r2.A0K(A102);
                            A0I2.close();
                            if (A102.size() == 0) {
                                C28781at A052 = r10.get();
                                try {
                                    r8 = A052;
                                    Cursor A033 = C24861Ly.A03(A052, "SELECT COUNT(*) as count FROM wa_contact_storage_usage", "CONTACT_STORAGE_USAGES", (String[]) null);
                                    try {
                                        if (A033.moveToNext()) {
                                            i = C17890vO.A01(A033, "count");
                                            r8 = A052;
                                            A033.close();
                                            A052.close();
                                        } else {
                                            A033.close();
                                            A052.close();
                                            i = 0;
                                        }
                                        if (i != hashSet.size()) {
                                            HashSet A122 = C17880vN.A12();
                                            HashSet hashSet4 = new HashSet(hashSet);
                                            C28791au A063 = r10.A06();
                                            r8 = A063;
                                            C41851xA BD02 = A063.BD0();
                                            try {
                                                A032 = C24861Ly.A03(A063, "SELECT jid FROM wa_contact_storage_usage", "CONTACT_STORAGE_USAGES", (String[]) null);
                                                int columnIndexOrThrow = A032.getColumnIndexOrThrow("jid");
                                                while (A032.moveToNext()) {
                                                    AnonymousClass1BI A0l3 = AnonymousClass3MX.A0l(A032.getString(columnIndexOrThrow));
                                                    if (A0l3 == null) {
                                                        Log.w("contact-manager-database/remove-copies-and-not-wa-contacts/jid is null or invalid!");
                                                    } else if (hashSet4.contains(A0l3)) {
                                                        hashSet4.remove(A0l3);
                                                    } else {
                                                        A122.add(A0l3);
                                                    }
                                                }
                                                A032.close();
                                                Iterator it4 = A122.iterator();
                                                while (it4.hasNext()) {
                                                    AnonymousClass1BI A0Q = C17880vN.A0Q(it4);
                                                    String[] A1Y2 = C17880vN.A1Y();
                                                    A1Y2[0] = A0Q.getRawString();
                                                    C24861Ly.A02(A063, "wa_contact_storage_usage", "jid = ? ", A1Y2);
                                                }
                                                BD02.A00();
                                                r8 = A063;
                                                BD02.close();
                                                r8 = A063;
                                                A063.close();
                                            } catch (Throwable th3) {
                                                th2 = th3;
                                                r82 = A063;
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        r8 = r82;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    r8.close();
                                    throw th;
                                }
                            }
                            ContentValues A082 = C17880vN.A08();
                            Iterator it5 = A13.iterator();
                            while (it5.hasNext()) {
                                AnonymousClass7PZ r02 = (AnonymousClass7PZ) it5.next();
                                AnonymousClass1BI A012 = r02.A01();
                                D3j d3j = r02.A00;
                                long j = d3j.A0I;
                                int i3 = d3j.A06;
                                A082.clear();
                                C17880vN.A19(A082, "conversation_size", j);
                                C17880vN.A18(A082, "conversation_message_count", i3);
                                String[] A1Y3 = C17880vN.A1Y();
                                C17880vN.A1J(A012, A1Y3, 0);
                                C24861Ly.A01(A082, A062, "wa_contact_storage_usage", "jid = ?", A1Y3);
                            }
                            BD0.A00();
                            BD0.close();
                            A062.close();
                            ArrayList A132 = AnonymousClass000.A13();
                            Iterator it6 = A13.iterator();
                            while (it6.hasNext()) {
                                AnonymousClass7PZ r1 = (AnonymousClass7PZ) it6.next();
                                if (r1 != null && !A02(r1)) {
                                    if (((C31191fA) r13.A06.get()).A03 || !r4.A0S(r1.A01())) {
                                        A132.add(r1);
                                    }
                                }
                            }
                            if (!atomicBoolean.get()) {
                                C1403671d.A00(r13.A05, "STORAGE_USAGE_CHAT_LIST_CACHE_TIME");
                                C125806bi r22 = new C125806bi(A132);
                                Iterator it7 = r13.A07.iterator();
                                while (it7.hasNext()) {
                                    ((C1606589k) it7.next()).BoH(r22);
                                }
                                SystemClock.elapsedRealtime();
                                return;
                            }
                            return;
                            throw th;
                        } catch (Throwable th6) {
                            AnonymousClass0DT.A00(th, th6);
                        }
                    } finally {
                        BD0.close();
                    }
                } catch (Throwable th7) {
                    A062.close();
                    throw th7;
                }
            } catch (IllegalArgumentException e) {
                C17960vV.A09("contact-mgr-db/unable to update batch on storage usage table", e);
            } catch (Throwable th8) {
                AnonymousClass0DT.A00(th7, th8);
            }
        } catch (Throwable th9) {
            AnonymousClass0DT.A00(th, th9);
            throw th;
        }
    }
}
