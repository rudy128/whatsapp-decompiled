package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1Lj  reason: invalid class name and case insensitive filesystem */
public class C24711Lj {
    public final AnonymousClass1Cd A00;
    public final AtomicLong A01 = new AtomicLong(-1);

    public C70523Bk A01(long j) {
        Cursor A0A;
        C70523Bk r8 = new C70523Bk();
        C28781at A04 = this.A00.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT lid_row_id, sort_id\nFROM jid_map\nWHERE jid_row_id = ?\nORDER BY sort_id DESC, lid_row_id DESC", "JidMapStore/GET_LIDS_BY_JID", new String[]{String.valueOf(j)});
            int columnIndex = A0A.getColumnIndex("lid_row_id");
            int columnIndex2 = A0A.getColumnIndex("sort_id");
            if (columnIndex >= 0 && columnIndex2 >= 0) {
                while (A0A.moveToNext()) {
                    r8.A00.put(Long.valueOf(A0A.getLong(columnIndex2)), Long.valueOf(A0A.getLong(columnIndex)));
                }
            }
            A0A.close();
            A04.close();
            return r8;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public ArrayList A02(List list) {
        long incrementAndGet;
        Cursor A0A;
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        AnonymousClass1Cd r7 = this.A00;
        C28791au A05 = r7.A05();
        try {
            C41851xA BD0 = A05.BD0();
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C58512ko r6 = (C58512ko) it.next();
                    ContentValues contentValues = new ContentValues();
                    Long l = r6.A02;
                    if (l != null) {
                        incrementAndGet = l.longValue();
                    } else {
                        AtomicLong atomicLong = this.A01;
                        if (atomicLong.get() == -1) {
                            synchronized (atomicLong) {
                                if (atomicLong.get() == -1) {
                                    C28781at A04 = r7.get();
                                    try {
                                        A0A = ((C28801av) A04).A02.A0A("SELECT \n  COALESCE(\n      MAX(sort_id), \n      (\n          SELECT MAX(_id) from jid\n      )\n  ) as sort_id \n  FROM jid_map", "JidMapStore/GET_MAX_SORT_ID", (String[]) null);
                                        int columnIndex = A0A.getColumnIndex("sort_id");
                                        A0A.moveToNext();
                                        atomicLong.set(A0A.getLong(columnIndex));
                                        A0A.close();
                                        A04.close();
                                    } catch (Throwable th) {
                                        try {
                                            A04.close();
                                        } catch (Throwable th2) {
                                            AnonymousClass0DT.A00(th, th2);
                                        }
                                        throw th;
                                    }
                                }
                            }
                        }
                        incrementAndGet = atomicLong.incrementAndGet();
                    }
                    contentValues.put("sort_id", Long.valueOf(incrementAndGet));
                    contentValues.put("lid_row_id", Long.valueOf(r6.A01));
                    contentValues.put("jid_row_id", Long.valueOf(r6.A00));
                    boolean z = false;
                    if (((C28801av) A05).A02.A09("jid_map", "JidMapStore/INSERT_MAPPING", contentValues, 5) != -1) {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(r6);
                    }
                }
                BD0.A00();
                BD0.close();
                A05.close();
                return arrayList;
            } catch (Throwable th3) {
                BD0.close();
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                A05.close();
                throw th4;
            } catch (Throwable th5) {
                AnonymousClass0DT.A00(th4, th5);
                throw th4;
            }
        }
        throw th;
    }

    public C24711Lj(AnonymousClass1Cd r4) {
        this.A00 = r4;
    }

    public static HashMap A00(C24711Lj r13, String str, Set set, boolean z) {
        String str2;
        Cursor A0A;
        HashMap hashMap = new HashMap(set.size());
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.toString(((Number) it.next()).longValue()));
        }
        C443423b r1 = new C443423b(arrayList.toArray(C19620yd.A0M), 975);
        C28781at A04 = r13.A00.get();
        try {
            Iterator it2 = r1.iterator();
            while (it2.hasNext()) {
                String[] strArr = (String[]) it2.next();
                C23141Ev r3 = ((C28801av) A04).A02;
                int length = strArr.length;
                StringBuilder sb = new StringBuilder();
                sb.append(" SELECT lid_row_id, jid_row_id, sort_id ");
                sb.append(" FROM jid_map ");
                sb.append(" WHERE ");
                if (z) {
                    str2 = "lid_row_id";
                } else {
                    str2 = "jid_row_id";
                }
                sb.append(str2);
                sb.append(" IN ");
                sb.append(AnonymousClass1H2.A00(length));
                sb.append(" ORDER BY sort_id DESC, lid_row_id DESC ");
                String obj = sb.toString();
                C18070vi.A0X(obj);
                A0A = r3.A0A(obj, str, strArr);
                int columnIndexOrThrow = A0A.getColumnIndexOrThrow("lid_row_id");
                int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("jid_row_id");
                int columnIndexOrThrow3 = A0A.getColumnIndexOrThrow("sort_id");
                while (A0A.moveToNext()) {
                    long j = A0A.getLong(columnIndexOrThrow);
                    long j2 = A0A.getLong(columnIndexOrThrow2);
                    long j3 = A0A.getLong(columnIndexOrThrow3);
                    Long valueOf = Long.valueOf(j2);
                    if (!hashMap.containsKey(valueOf)) {
                        hashMap.put(valueOf, new C70523Bk());
                    }
                    C70523Bk r0 = (C70523Bk) hashMap.get(valueOf);
                    C17960vV.A07(r0);
                    r0.A00.put(Long.valueOf(j3), Long.valueOf(j));
                }
                A0A.close();
            }
            A04.close();
            return hashMap;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }
}
