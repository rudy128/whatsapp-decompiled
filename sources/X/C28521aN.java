package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1aN  reason: invalid class name and case insensitive filesystem */
public class C28521aN {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass1LY A01;
    public final C25991Qk A02;
    public final AnonymousClass1QB A03;
    public final AnonymousClass1Q2 A04;
    public final AnonymousClass1N3 A05;
    public final AnonymousClass1Q6 A06;
    public final C24681Lg A07;
    public final C22611Cn A08;
    public final AnonymousClass1Cd A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass11P A0B;
    public final AnonymousClass1LW A0C;

    public static /* synthetic */ void A01(AnonymousClass1BI r4, AnonymousClass206 r5, Long l) {
        if (r4 != null) {
            AnonymousClass1BI r0 = r5.A0v.A00;
            C17960vV.A07(r0);
            if (!r0.equals(r4)) {
                return;
            }
        }
        if (l == null || r5.A0y <= l.longValue()) {
            r5.A0q = false;
        }
    }

    public long A02(AnonymousClass1BI r7) {
        Cursor A0A2;
        long j;
        C28781at A042 = this.A09.get();
        try {
            A0A2 = ((C28801av) A042).A02.A0A("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND starred = 1 AND (message_type != '7')", "GET_STARRED_MESSAGE_COUNT_FOR_JID_SQL", new String[]{String.valueOf(this.A0C.A09(r7))});
            if (A0A2.moveToNext()) {
                j = A0A2.getLong(A0A2.getColumnIndexOrThrow("count"));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/countStarredMessages/db no message for ");
                sb.append(r7);
                Log.i(sb.toString());
                j = 0;
            }
            A0A2.close();
            A042.close();
            return j;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public /* synthetic */ void A03(AnonymousClass206 r11, AnonymousClass206 r12, long j, boolean z) {
        if (r12.A0v.equals(r11.A0v)) {
            r12.A0q = z;
            AnonymousClass1QB r4 = this.A03;
            if (j != 1) {
                C28791au A052 = r4.A0C.A05();
                try {
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("fts_namespace", AnonymousClass1QB.A02(r4, r12));
                    ((C28801av) A052).A02.A02(contentValues, "message_ftsv2", "docid = ?", "UPDATE_FTS_NAMESPACED", new String[]{String.valueOf(r12.A0x)});
                    A052.close();
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                    throw th;
                }
            }
        }
    }

    public C28521aN(AnonymousClass11P r1, AnonymousClass1LW r2, AnonymousClass1CJ r3, AnonymousClass1LY r4, C25991Qk r5, AnonymousClass1QB r6, AnonymousClass1Q2 r7, AnonymousClass1N3 r8, AnonymousClass1Q6 r9, C24681Lg r10, C22611Cn r11, AnonymousClass1Cd r12, AnonymousClass00H r13) {
        this.A0B = r1;
        this.A0C = r2;
        this.A00 = r3;
        this.A0A = r13;
        this.A04 = r7;
        this.A03 = r6;
        this.A05 = r8;
        this.A07 = r10;
        this.A01 = r4;
        this.A02 = r5;
        this.A06 = r9;
        this.A09 = r12;
        this.A08 = r11;
    }

    public static void A00(C28521aN r20, Collection collection, boolean z) {
        boolean z2;
        C28791au A052;
        C17960vV.A01();
        Collection<AnonymousClass206> collection2 = collection;
        Iterator it = collection2.iterator();
        while (true) {
            z2 = z;
            if (!it.hasNext()) {
                break;
            }
            ((AnonymousClass206) it.next()).A0q = z2;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        C28521aN r2 = r20;
        try {
            C28791au A053 = r2.A09.A05();
            try {
                C41851xA BD0 = A053.BD0();
                AnonymousClass1N3 r8 = r2.A05;
                HashSet hashSet = new HashSet();
                AnonymousClass1Cd r6 = r8.A03;
                C28791au A054 = r6.A05();
                try {
                    C41851xA BD02 = A054.BD0();
                    try {
                        for (AnonymousClass206 r3 : collection2) {
                            A052 = r6.A05();
                            ContentValues contentValues = new ContentValues();
                            C63432t4.A02(contentValues, "starred", z2);
                            C23141Ev r0 = ((C28801av) A052).A02;
                            AnonymousClass205 r32 = r3.A0v;
                            if (r0.A02(contentValues, "message", "chat_row_id = ? AND from_me = ? AND key_id = ?", "UPDATE_MESSAGE_STARRED_MAIN_SQL", AnonymousClass1N3.A02(r8, r32)) == 0) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("MainMessageStore/updateMessageStarredStatusV2/update failed; message.key=");
                                sb.append(r32);
                                Log.e(sb.toString());
                                A052.close();
                            } else {
                                A052.close();
                                hashSet.add(r32.A00);
                            }
                        }
                        BD02.A00();
                        BD02.close();
                        A054.close();
                        BD0.A00();
                        long BS5 = r2.A03.BS5();
                        for (AnonymousClass206 r33 : collection2) {
                            AnonymousClass1Q6 r62 = r2.A06;
                            AnonymousClass1Q7 r7 = r62.A01;
                            synchronized (r7) {
                                for (AnonymousClass206 A032 : r7.A01.A06().values()) {
                                    r2.A03(r33, A032, BS5, z2);
                                }
                                for (Map.Entry value : r7.A02.entrySet()) {
                                    AnonymousClass206 r02 = (AnonymousClass206) ((WeakReference) value.getValue()).get();
                                    if (r02 != null) {
                                        r2.A03(r33, r02, BS5, z2);
                                    }
                                }
                            }
                            for (AnonymousClass206 A033 : r62.A02.values()) {
                                r2.A03(r33, A033, BS5, z2);
                            }
                            for (C29691ci r03 : r62.A00.A0H()) {
                                AnonymousClass206 r04 = r03.A0g;
                                if (r04 != null) {
                                    r2.A03(r33, r04, BS5, z2);
                                }
                            }
                        }
                        r2.A04.A02.post(new AnonymousClass7RF(r2, collection2, 44, z2));
                        r2.A01.A01("StarredMessageStore/updateMessageStarredStateInternal", SystemClock.uptimeMillis() - uptimeMillis);
                        BD0.close();
                        A053.close();
                        return;
                    } catch (Throwable th) {
                        BD02.close();
                        throw th;
                    }
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A054.close();
                    } catch (Throwable th3) {
                        BD0.close();
                        throw th3;
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                A053.close();
                throw th4;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            r2.A08.A03();
        } catch (Throwable th5) {
            AnonymousClass0DT.A00(th4, th5);
        }
    }

    public boolean A04(AnonymousClass1BI r18, Long l) {
        C28791au A052;
        long uptimeMillis = SystemClock.uptimeMillis();
        HashSet A042 = this.A02.A04();
        AnonymousClass1BI r4 = r18;
        if (r18 == null) {
            if (!A042.isEmpty()) {
                return false;
            }
        } else if (A042.contains(r4)) {
            return false;
        }
        try {
            C28791au A053 = this.A09.A05();
            try {
                C41851xA BD0 = A053.BD0();
                try {
                    AnonymousClass1N3 r2 = this.A05;
                    A052 = r2.A03.A05();
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("starred", 0);
                    String str = "starred = ? AND message_type != ?";
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("1");
                    arrayList.add(String.valueOf(7));
                    if (r18 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(" AND chat_row_id = ? ");
                        str = sb.toString();
                        arrayList.add(String.valueOf(r2.A01.A09(r4)));
                    }
                    Long l2 = l;
                    if (l != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(" AND sort_id <= ?");
                        str = sb2.toString();
                        arrayList.add(String.valueOf(l2));
                    }
                    int A022 = ((C28801av) A052).A02.A02(contentValues, "message", str, "unStarAllMessageV2/UPDATE_MESSAGE", (String[]) arrayList.toArray(C19620yd.A0M));
                    if (A022 != 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("MainMessageStore/unStarAllMessage/rowChanged=");
                        sb3.append(A022);
                        sb3.append(" jid=");
                        sb3.append(r4);
                        Log.i(sb3.toString());
                    }
                    A052.close();
                    BD0.A00();
                    AnonymousClass1Q6 r5 = this.A06;
                    AnonymousClass1Q7 r6 = r5.A01;
                    synchronized (r6) {
                        for (AnonymousClass206 A012 : r6.A01.A06().values()) {
                            A01(r4, A012, l2);
                        }
                        for (Map.Entry value : r6.A02.entrySet()) {
                            AnonymousClass206 r0 = (AnonymousClass206) ((WeakReference) value.getValue()).get();
                            if (r0 != null) {
                                A01(r4, r0, l2);
                            }
                        }
                    }
                    for (AnonymousClass206 A013 : r5.A02.values()) {
                        A01(r4, A013, l2);
                    }
                    for (C29691ci r02 : r5.A00.A0H()) {
                        AnonymousClass206 r03 = r02.A0g;
                        if (r03 != null) {
                            A01(r4, r03, l2);
                        }
                    }
                    this.A01.A01("StarredMessageStore/unstarAll", SystemClock.uptimeMillis() - uptimeMillis);
                    BD0.close();
                    A053.close();
                    this.A04.A02.post(new C70733Ch(this, r4, 1));
                    return true;
                } catch (Throwable th) {
                    BD0.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                A053.close();
                throw th2;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A08.A03();
        } catch (Throwable th3) {
            AnonymousClass0DT.A00(th2, th3);
        }
    }
}
