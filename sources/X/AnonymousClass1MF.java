package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Parcelable;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1MF  reason: invalid class name */
public class AnonymousClass1MF {
    public final C24811Lt A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass00H A02;

    public int A01(GroupJid groupJid) {
        C41851xA BD0;
        try {
            C28791au A06 = this.A00.A06();
            try {
                BD0 = A06.BD0();
                String rawString = groupJid.getRawString();
                C23141Ev r4 = ((C28801av) A06).A02;
                r4.A04("subgroup_info", "subgroup_raw_jid = ?", "subgroup_info.removeSubgroup", new String[]{rawString});
                r4.A04("group_relationship", "subgroup_raw_id = ?", "group_relationship.removeSubgroup", new String[]{rawString});
                BD0.A00();
                BD0.close();
                A06.close();
                return 1;
            } catch (Throwable th) {
                A06.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            return -1;
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public C49652Ri A02(GroupJid groupJid, Integer num, Collection collection) {
        Cursor A0A;
        try {
            C24811Lt r30 = this.A00;
            C28791au A06 = r30.A06();
            try {
                C41851xA BD0 = A06.BD0();
                try {
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        A2B a2b = (A2B) it.next();
                        GroupJid groupJid2 = a2b.A02;
                        String str = a2b.A06;
                        long j = a2b.A01;
                        String rawString = groupJid2.getRawString();
                        Integer num2 = a2b.A03;
                        boolean z = true;
                        String[] strArr = {groupJid2.getRawString()};
                        C28781at A05 = r30.get();
                        try {
                            A0A = ((C28801av) A05).A02.A0A("SELECT subject_ts FROM subgroup_info WHERE subgroup_raw_jid = ?", "GET_TIMESTAMP_FROM_JID", strArr);
                            if (A0A.moveToFirst()) {
                                if (A0A.getLong(A0A.getColumnIndexOrThrow("subject_ts")) <= j) {
                                    z = false;
                                }
                                A0A.close();
                                A05.close();
                                if (z) {
                                    arrayList.add(a2b);
                                }
                            } else {
                                A0A.close();
                                A05.close();
                            }
                            ContentValues contentValues = new ContentValues(3);
                            contentValues.put("subgroup_raw_jid", rawString);
                            contentValues.put("subject", str);
                            contentValues.put("subject_ts", Long.valueOf(j));
                            int i = a2b.A00;
                            contentValues.put("group_type", Integer.valueOf(i));
                            contentValues.put("group_membership_approval_state", num2);
                            Long l = a2b.A05;
                            if (l != null) {
                                contentValues.put("linking_timestamp", l);
                            }
                            Integer num3 = a2b.A04;
                            if (num3 != null) {
                                contentValues.put("last_known_member_count", num3);
                            }
                            C23141Ev r6 = ((C28801av) A06).A02;
                            if (r6.A02(contentValues, "subgroup_info", "subgroup_raw_jid = ?", "subgroup_info.insertSubgroups", new String[]{rawString}) == 0) {
                                if (num == AnonymousClass00R.A0C && l == null) {
                                    Long valueOf = Long.valueOf(AnonymousClass11P.A01(this.A01));
                                    contentValues.put("linking_timestamp", valueOf);
                                    C18070vi.A0d(str, 2);
                                    a2b = new A2B(groupJid2, num2, (Integer) null, valueOf, str, i, j);
                                }
                                r6.A05("subgroup_info", "subgroup_info.insertSubgroups", contentValues);
                            }
                            arrayList.add(a2b);
                            ContentValues contentValues2 = new ContentValues(2);
                            contentValues2.put("parent_raw_jid", groupJid.getRawString());
                            contentValues2.put("subgroup_raw_id", rawString);
                            if (r6.A02(contentValues2, "group_relationship", "subgroup_raw_id = ?", "group_relationship.insertSubgroups", new String[]{rawString}) == 0) {
                                r6.A05("group_relationship", "group_relationship.insertSubgroups", contentValues2);
                            }
                        } catch (Throwable th) {
                            A05.close();
                            throw th;
                        }
                    }
                    BD0.A00();
                    C46192Dn r0 = new C46192Dn(arrayList);
                    BD0.close();
                    A06.close();
                    return r0;
                    throw th;
                } catch (Throwable th2) {
                    BD0.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                A06.close();
                throw th3;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            return new C116825yg(e);
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        } catch (Throwable th4) {
            AnonymousClass0DT.A00(th3, th4);
        }
    }

    public ArrayList A04(AnonymousClass1EC r7) {
        Cursor A0A;
        ArrayList arrayList = new ArrayList();
        String[] strArr = {r7.getRawString()};
        C28781at A05 = this.A00.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT subgroups.subgroup_raw_jid, subject, subject_ts, group_type, group_membership_approval_state, linking_timestamp, last_known_member_count FROM subgroup_info subgroups INNER JOIN group_relationship relationship ON subgroups.subgroup_raw_jid = relationship.subgroup_raw_id WHERE relationship.parent_raw_jid = ?", "GET_SUBGROUPS_WITH_PARENT_JID_SQL", strArr);
            while (A0A.moveToNext()) {
                A2B A002 = A00(A0A);
                if (A002 != null) {
                    arrayList.add(A002);
                }
            }
            A0A.close();
            A05.close();
            return arrayList;
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

    public ArrayList A05(AnonymousClass1EC r5, Collection collection) {
        A02(r5, AnonymousClass00R.A0Y, collection);
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((A2B) it.next()).A02);
        }
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        ArrayList A04 = A04(C42941yz.A00(r5));
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = A04.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((A2B) it2.next()).A02);
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            GroupJid groupJid = (GroupJid) it3.next();
            if (!arrayList.contains(groupJid)) {
                A01(groupJid);
            }
        }
        return A04(r5);
    }

    public AnonymousClass1MF(AnonymousClass11P r1, C24811Lt r2, AnonymousClass00H r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public static A2B A00(Cursor cursor) {
        Integer num;
        Long l;
        Integer num2;
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("subject");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("subject_ts");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("subgroup_raw_jid");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("group_type");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("group_membership_approval_state");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("linking_timestamp");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("last_known_member_count");
        try {
            String string = cursor2.getString(columnIndexOrThrow3);
            Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
            AnonymousClass1EC A012 = C42941yz.A01(string);
            String string2 = cursor2.getString(columnIndexOrThrow);
            long j = cursor2.getLong(columnIndexOrThrow2);
            int i = cursor2.getInt(columnIndexOrThrow4);
            if (cursor2.isNull(columnIndexOrThrow5)) {
                num = null;
            } else {
                num = Integer.valueOf(cursor2.getInt(columnIndexOrThrow5));
            }
            if (cursor2.isNull(columnIndexOrThrow6)) {
                l = null;
            } else {
                l = Long.valueOf(cursor2.getLong(columnIndexOrThrow6));
            }
            if (cursor2.isNull(columnIndexOrThrow7)) {
                num2 = null;
            } else {
                num2 = Integer.valueOf(cursor2.getInt(columnIndexOrThrow7));
            }
            if (string2 == null) {
                string2 = "";
            }
            return new A2B(A012, num, num2, l, string2, i, j);
        } catch (AnonymousClass11T e) {
            Log.e("SubgroupStore/invalid subgroup jid", e);
            return null;
        }
    }

    public AnonymousClass1EC A03(AnonymousClass1EC r8) {
        Cursor A0A;
        try {
            C28781at A05 = this.A00.get();
            try {
                A0A = ((C28801av) A05).A02.A0A("SELECT parent_raw_jid FROM group_relationship WHERE subgroup_raw_id = ?", "subgroupStore/getParentGroupJid", new String[]{r8.getRawString()});
                if (A0A.moveToFirst()) {
                    AnonymousClass1EC A022 = AnonymousClass1EC.A01.A02(A0A.getString(A0A.getColumnIndexOrThrow("parent_raw_jid")));
                    A0A.close();
                    A05.close();
                    return A022;
                }
                A0A.close();
                A05.close();
                return null;
            } catch (Throwable th) {
                A05.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("subgroupStore/getParentGroupJid", e);
            return null;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }
}
