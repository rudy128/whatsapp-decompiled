package X;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.LRUCache;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1NA  reason: invalid class name */
public class AnonymousClass1NA {
    public final AnonymousClass190 A00;
    public final AnonymousClass1NC A01 = new AnonymousClass1NC();
    public final C22611Cn A02;
    public final AnonymousClass1Cd A03;
    public final C19830z4 A04;
    public final Map A05 = Collections.synchronizedMap(new LRUCache(200));

    public static ArrayList A02(Cursor cursor, boolean z) {
        int i;
        Cursor cursor2 = cursor;
        ArrayList arrayList = new ArrayList(cursor.getCount());
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("label_name");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("predefined_id");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("color_id");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("sort_id");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("hidden");
        if (z) {
            i = cursor2.getColumnIndexOrThrow("labelItemCount");
        } else {
            i = -1;
        }
        while (cursor2.moveToNext()) {
            arrayList.add(A00(cursor2, columnIndexOrThrow5, i, columnIndexOrThrow7, columnIndexOrThrow, columnIndexOrThrow3, columnIndexOrThrow4, columnIndexOrThrow6, columnIndexOrThrow2, z));
        }
        return arrayList;
    }

    public static void A03(AnonymousClass1NA r8, List list) {
        Collections.sort(list, new AnonymousClass3D1(2));
        long j = ((SharedPreferences) r8.A04.A00.get()).getLong("smb_priority_inbox_label_id", -1);
        int i = -1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((C41761x1) list.get(i2)).A03 == j) {
                i = i2;
            }
        }
        if (i != -1) {
            list.add(0, list.remove(i));
        }
    }

    public static void A04(C28791au r8, String str, long j, long j2) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("sort_id", Long.valueOf(j2));
        ((C28801av) r8).A02.A02(contentValues, "labels", "_id = ?", str, new String[]{String.valueOf(j)});
    }

    public static C41761x1 A00(Cursor cursor, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        long j;
        long j2;
        int i9;
        int i10 = cursor.getInt(i8);
        long j3 = cursor.getLong(i4);
        String string = cursor.getString(i5);
        if (string == null) {
            string = "";
        }
        int i11 = i6;
        if (cursor.isNull(i11)) {
            j = 0;
        } else {
            j = cursor.getLong(i11);
        }
        int i12 = cursor.getInt(i);
        int i13 = cursor.getInt(i7);
        boolean A052 = AnonymousClass1Eu.A05(cursor, i3);
        if (z) {
            i9 = cursor.getInt(i2);
            j2 = (long) i13;
        } else {
            j2 = (long) i13;
            i9 = -1;
        }
        return new C41761x1(string, i10, i12, i9, j3, j, j2, A052);
    }

    private C41761x1 A01(Cursor cursor, boolean z) {
        int i;
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("label_name");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("predefined_id");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("color_id");
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("sort_id");
        int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("hidden");
        boolean z2 = z;
        if (z) {
            i = cursor.getColumnIndexOrThrow("labelItemCount");
        } else {
            i = -1;
        }
        return A00(cursor2, columnIndexOrThrow5, i, columnIndexOrThrow7, columnIndexOrThrow, columnIndexOrThrow3, columnIndexOrThrow4, columnIndexOrThrow6, columnIndexOrThrow2, z2);
    }

    public C41761x1 A06(long j) {
        Cursor A0A;
        AnonymousClass1NC r1 = this.A01;
        Map map = r1.A01;
        Long valueOf = Long.valueOf(j);
        C41761x1 r6 = (C41761x1) map.get(valueOf);
        r1.A03.incrementAndGet();
        if (r6 == null) {
            r1.A02.incrementAndGet();
            C28781at A042 = this.A03.get();
            try {
                A0A = ((C28801av) A042).A02.A0A("SELECT _id, type, label_name, predefined_id, sort_id, color_id, hidden FROM labels WHERE _id = ?", "SELECT_LABEL_INFO", new String[]{String.valueOf(j)});
                if (A0A.moveToNext()) {
                    r6 = A01(A0A, false);
                    map.put(valueOf, r6);
                } else {
                    map.remove(valueOf);
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
        return r6;
        throw th;
    }

    public C41761x1 A07(long j) {
        Cursor A0A;
        AnonymousClass1NC r2 = this.A01;
        Map map = r2.A01;
        Long valueOf = Long.valueOf(j);
        C41761x1 r6 = (C41761x1) map.get(valueOf);
        r2.A03.incrementAndGet();
        if (r6 == null || r6.A00 == -1) {
            r2.A02.incrementAndGet();
            String[] strArr = {String.valueOf(j)};
            C28781at A042 = this.A03.get();
            try {
                A0A = ((C28801av) A042).A02.A0A("SELECT labels._id, labels.type, labels.label_name, labels.predefined_id, labels.sort_id, labels.color_id, labels.hidden,  COUNT(labeled_jid.jid_row_id)  AS labelItemCount FROM labels LEFT JOIN labeled_jid ON labels._id = labeled_jid.label_id WHERE labels._id = ? GROUP BY labels._id", "SELECT_LABEL_INFO_AND_COUNT", strArr);
                if (A0A.moveToNext()) {
                    r6 = A01(A0A, true);
                    map.put(valueOf, r6);
                } else {
                    map.remove(valueOf);
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
        return r6;
        throw th;
    }

    public ArrayList A08() {
        Cursor A0A;
        ArrayList A022;
        AnonymousClass1NC r4 = this.A01;
        synchronized (r4) {
            if (r4.A00) {
                A022 = new ArrayList(r4.A01.values());
                r4.A03.addAndGet(A022.size());
            } else {
                C28781at A042 = this.A03.get();
                try {
                    A0A = ((C28801av) A042).A02.A0A("SELECT _id, type, label_name, predefined_id, color_id, sort_id, hidden FROM labels ORDER BY sort_id ASC", "getLabelList/QUERY_LABELS", (String[]) null);
                    A022 = A02(A0A, false);
                    Iterator it = A022.iterator();
                    while (it.hasNext()) {
                        C41761x1 r3 = (C41761x1) it.next();
                        r4.A01.put(Long.valueOf(r3.A03), r3);
                        r4.A03.incrementAndGet();
                        r4.A02.incrementAndGet();
                    }
                    r4.A00 = true;
                    if (A0A != null) {
                        A0A.close();
                    }
                    A042.close();
                } catch (Throwable th) {
                    try {
                        A042.close();
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                    }
                    throw th;
                }
            }
        }
        A03(this, A022);
        return A022;
        throw th;
    }

    public void A09() {
        AnonymousClass1NC r2 = this.A01;
        synchronized (r2) {
            Map map = r2.A01;
            for (C41761x1 r0 : map.values()) {
                long j = r0.A03;
                Long valueOf = Long.valueOf(j);
                int i = r0.A02;
                map.put(valueOf, new C41761x1(r0.A06, i, r0.A01, -1, j, r0.A04, r0.A05, r0.A07));
            }
        }
    }

    public void A0A(List list) {
        C41851xA BD0;
        AnonymousClass1NC r1 = this.A01;
        synchronized (r1) {
            r1.A01.clear();
            r1.A03.set(0);
            r1.A02.set(0);
            r1.A00 = false;
        }
        try {
            C28791au A052 = this.A03.A05();
            try {
                BD0 = A052.BD0();
                for (int i = 0; i < list.size(); i++) {
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("sort_id", Integer.valueOf(i));
                    ((C28801av) A052).A02.A02(contentValues, "labels", "_id = ?", "updateLabelOrder/UPDATE_SORT_ID", new String[]{String.valueOf(list.get(i))});
                }
                BD0.A00();
                BD0.close();
                A052.close();
                return;
            } catch (Throwable th) {
                A052.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A02.A03();
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public void A0B(long[] jArr) {
        AnonymousClass1NC r13 = this.A01;
        synchronized (r13) {
            for (long j : jArr) {
                Map map = r13.A01;
                C41761x1 r1 = (C41761x1) map.get(Long.valueOf(j));
                if (r1 != null) {
                    Long valueOf = Long.valueOf(j);
                    long j2 = r1.A03;
                    String str = r1.A06;
                    long j3 = r1.A04;
                    long j4 = j2;
                    int i = r1.A01;
                    int i2 = r1.A02;
                    String str2 = str;
                    map.put(valueOf, new C41761x1(str2, i2, i, -1, j4, j3, r1.A05, r1.A07));
                }
            }
        }
    }

    public AnonymousClass1NA(AnonymousClass190 r3, C19830z4 r4, C22611Cn r5, AnonymousClass1Cd r6) {
        this.A00 = r3;
        this.A03 = r6;
        this.A04 = r4;
        this.A02 = r5;
    }

    public int A05() {
        C41761x1 r1;
        List A0z = C29431cG.A0z(A08(), new C99234sU(15));
        if (!A0z.isEmpty()) {
            r1 = (C41761x1) A0z.get(A0z.size() - 1);
        } else {
            r1 = null;
        }
        if (r1 != null) {
            return (r1.A01 + 1) % 20;
        }
        return 1;
    }

    public boolean A0C(long[] jArr) {
        C41851xA BD0;
        C17960vV.A01();
        StringBuilder sb = new StringBuilder();
        sb.append("_id IN ");
        sb.append(AnonymousClass1H2.A00(r6));
        String obj = sb.toString();
        String[] strArr = new String[r6];
        for (int i = 0; i < r6; i++) {
            strArr[i] = Long.toString(jArr[i]);
        }
        try {
            C28791au A052 = this.A03.A05();
            try {
                BD0 = A052.BD0();
                int A042 = ((C28801av) A052).A02.A04("labels", obj, "deleteLabels/DELETE_LABELS", strArr);
                if (A042 != r6) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("core-label-store/delete-label: error, attempting to delete ");
                    sb2.append(r6);
                    sb2.append(" labels, actually deleted: ");
                    sb2.append(A042);
                    Log.e(sb2.toString());
                }
                BD0.A00();
                for (long valueOf : jArr) {
                    this.A01.A01.remove(Long.valueOf(valueOf));
                }
                boolean z = false;
                if (A042 == r6) {
                    z = true;
                }
                BD0.close();
                A052.close();
                return z;
            } catch (Throwable th) {
                A052.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A02.A03();
            return false;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }
}
