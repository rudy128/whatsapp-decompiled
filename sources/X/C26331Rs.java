package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1Rs  reason: invalid class name and case insensitive filesystem */
public class C26331Rs {
    public final C25551Oq A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass190 A02;

    public C20126A8l A08(C19999A2n a2n, String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, boolean z) {
        byte[] bArr4 = bArr2;
        try {
            C18070vi.A0d(bArr4, 0);
            C62382rJ r5 = C62382rJ.A03;
            if (!Arrays.equals(r5.A01, bArr4)) {
                r5 = C62382rJ.A02;
                if (!Arrays.equals(r5.A01, bArr4)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Incorrect operation bytes: ");
                    sb.append(new String(bArr4, C26571Sq.A05));
                    throw new IllegalStateException(sb.toString());
                }
            }
            A6U a6u = new A6U(r5, a2n, str2, bArr, bArr3, i);
            C60192nY A002 = ((C58862lN) this.A01.get()).A00(a6u.A06[0]);
            if (A002 != null && A002.A0J()) {
                C20126A8l A0C = A002.A0C(a6u, str, z);
                if (A0C != null) {
                    A0C.A01 = a6u.A05;
                }
                return A0C;
            }
        } catch (C26341Rt | IllegalArgumentException e) {
            Log.e("sync-mutation/from-key-value couldn't create sync action data", e);
        }
        return null;
    }

    public static C20126A8l A00(Cursor cursor, C26331Rs r10) {
        boolean z = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("are_dependencies_missing")) == 1) {
            z = true;
        }
        String string = cursor.getString(cursor.getColumnIndexOrThrow("_id"));
        C19999A2n A022 = A02(cursor);
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("mutation_index"));
        byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("mutation_value"));
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("mutation_version"));
        return r10.A08(A022, string, string2, blob, cursor.getBlob(cursor.getColumnIndexOrThrow("operation")), (byte[]) null, i, z);
    }

    public static C20126A8l A01(Cursor cursor, C26331Rs r10) {
        boolean z = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("are_dependencies_missing")) == 1) {
            z = true;
        }
        C19999A2n A022 = A02(cursor);
        C17960vV.A07(A022);
        String string = cursor.getString(cursor.getColumnIndexOrThrow("mutation_index"));
        byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("mutation_value"));
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("mutation_version"));
        return r10.A08(A022, (String) null, string, blob, C62382rJ.A03.A01, cursor.getBlob(cursor.getColumnIndexOrThrow("mutation_mac")), i, z);
    }

    public static C19999A2n A02(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("device_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("epoch");
        if (cursor.isNull(columnIndexOrThrow) || cursor.isNull(columnIndexOrThrow2)) {
            return null;
        }
        return new C19999A2n(cursor.getInt(columnIndexOrThrow), cursor.getInt(columnIndexOrThrow2));
    }

    public static ArrayList A03(C26331Rs r6, String str, boolean z) {
        String str2;
        Cursor A0A;
        C20126A8l a8l;
        ArrayList arrayList = new ArrayList();
        C28781at A05 = r6.A00.get();
        try {
            C23141Ev r3 = ((C28801av) A05).A02;
            if (z) {
                str2 = "SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE mutation_name = ?";
            } else {
                str2 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE mutation_name = ?";
            }
            A0A = r3.A0A(str2, "syncd_mutations.SELECT_MUTATIONS_BY_MUTATION_NAME", new String[]{str});
            while (A0A.moveToNext()) {
                if (z) {
                    a8l = A00(A0A, r6);
                } else {
                    a8l = A01(A0A, r6);
                }
                if (a8l != null) {
                    arrayList.add(a8l);
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

    public static void A04(C23141Ev r6, C26331Rs r7, C19999A2n a2n, AnonymousClass1BI r9, String str, String str2, String str3, byte[] bArr, byte[] bArr2, int i, boolean z) {
        long j;
        byte[] bArr3 = a2n.A00;
        if (A8G.A01(bArr3, 2) == 0) {
            AnonymousClass190 r5 = r7.A02;
            StringBuilder sb = new StringBuilder();
            sb.append("keyId=");
            sb.append(a2n);
            r5.A0G("syncdMutationStore/insertOrReplaceMutation unexpected key", sb.toString(), true);
        }
        C60042nI A0D = r6.A0D("INSERT OR REPLACE INTO syncd_mutations (mutation_index, mutation_value, mutation_version, collection_name, are_dependencies_missing, device_id, epoch, mutation_mac, chat_jid, mutation_name) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", "SyncdMutationsTable.INSERT_OR_REPLACE");
        SQLiteStatement sQLiteStatement = A0D.A00;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, str);
        if (bArr == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindBlob(2, bArr);
        }
        sQLiteStatement.bindLong(3, (long) i);
        sQLiteStatement.bindString(4, str2);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        sQLiteStatement.bindLong(5, j);
        sQLiteStatement.bindLong(6, (long) a2n.A00());
        sQLiteStatement.bindLong(7, (long) A8G.A01(bArr3, 2));
        sQLiteStatement.bindBlob(8, bArr2);
        if (r9 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindString(9, r9.getRawString());
        }
        sQLiteStatement.bindString(10, str3);
        if (A0D.A01() == -1) {
            Log.e("SyncdMutationsStore/insertOrReplaceMutation was unsuccessful");
        }
    }

    public static void A05(C23141Ev r16, C26331Rs r17, Collection collection) {
        AnonymousClass1BI r9;
        C23141Ev r6 = r16;
        C17960vV.A0C(r6.A00.inTransaction());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C20126A8l a8l = (C20126A8l) it.next();
            C62382rJ r2 = a8l.A05;
            if (r2 == C62382rJ.A03) {
                arrayList.add(a8l);
            } else if (r2 == C62382rJ.A02) {
                arrayList2.add(a8l);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Incorrect operation: ");
                sb.append(r2);
                throw new IllegalStateException(sb.toString());
            }
        }
        A07(r6, C20068A5s.A02(arrayList2));
        arrayList.size();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C20126A8l a8l2 = (C20126A8l) it2.next();
            String A0A = a8l2.A0A();
            byte[] A0E = a8l2.A0E();
            int i = a8l2.A03;
            String str = a8l2.A06;
            boolean A0D = a8l2.A0D();
            C19999A2n a2n = a8l2.A00;
            C17960vV.A07(a2n);
            byte[] bArr = a8l2.A01;
            C17960vV.A07(bArr);
            if (a8l2 instanceof C72173Kx) {
                r9 = ((C72173Kx) a8l2).getChatJid();
            } else {
                r9 = null;
            }
            A04(r6, r17, a2n, r9, A0A, str, a8l2.A0B(), A0E, bArr, i, A0D);
        }
    }

    public static void A06(C23141Ev r5, String[] strArr) {
        C17960vV.A0C(r5.A00.inTransaction());
        Iterator it = new C443423b(strArr, 975).iterator();
        while (it.hasNext()) {
            String[] strArr2 = (String[]) it.next();
            int length = strArr2.length;
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM pending_mutations WHERE _id IN ( ");
            sb.append(TextUtils.join(",", Collections.nCopies(length, "?")));
            sb.append(" )");
            r5.A0F(sb.toString(), "SyncdMutationsStore.deletePendingMutations", strArr2);
        }
    }

    public static void A07(C23141Ev r5, String[] strArr) {
        C17960vV.A0C(r5.A00.inTransaction());
        Iterator it = new C443423b(strArr, 975).iterator();
        while (it.hasNext()) {
            String[] strArr2 = (String[]) it.next();
            int length = strArr2.length;
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM syncd_mutations WHERE mutation_index IN ");
            sb.append(AnonymousClass1H2.A00(length));
            r5.A0F(sb.toString(), "SyncdMutationsStore.deleteStoredMutations", strArr2);
        }
    }

    public C20126A8l A09(String str) {
        Cursor A0A;
        C28781at A05 = this.A00.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE mutation_index = ?", "PendingMutationsTable.SELECT_BY_KEY", new String[]{str});
            if (!A0A.moveToNext()) {
                A0A.close();
                A05.close();
                return null;
            }
            C20126A8l A002 = A00(A0A, this);
            A0A.close();
            A05.close();
            return A002;
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

    public C20126A8l A0A(String str) {
        Cursor A0A;
        C28781at A05 = this.A00.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE mutation_index = ? ", "SyncdMutationsTable.SELECT_MUTATION_WITH_INDEX", new String[]{str});
            if (!A0A.moveToNext()) {
                A0A.close();
                A05.close();
                return null;
            }
            C20126A8l A012 = A01(A0A, this);
            A0A.close();
            A05.close();
            return A012;
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

    public ArrayList A0B() {
        Cursor A0A;
        ArrayList arrayList = new ArrayList();
        C28781at A05 = this.A00.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE mutation_name = ? AND are_dependencies_missing = ?", "syncd_mutationsSELECT_STORED_MUTATIONS_BY_MUTATION_NAME_AND_DEPENDENCY", new String[]{"archive", String.valueOf(0)});
            while (A0A.moveToNext()) {
                C20126A8l A012 = A01(A0A, this);
                if (A012 != null) {
                    arrayList.add(A012);
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

    public ArrayList A0C(AnonymousClass1BI r8, Set set, boolean z) {
        String obj;
        String str;
        Cursor A0A;
        C20126A8l a8l;
        ArrayList arrayList = new ArrayList();
        if (set.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(r8.getRawString());
        arrayList2.addAll(set);
        C28781at A05 = this.A00.get();
        try {
            C23141Ev r4 = ((C28801av) A05).A02;
            if (z) {
                int size = set.size();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE chat_jid = ?  AND mutation_name IN ");
                sb.append(AnonymousClass1H2.A00(size));
                obj = sb.toString();
            } else {
                int size2 = set.size();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE chat_jid = ?  AND mutation_name IN ");
                sb2.append(AnonymousClass1H2.A00(size2));
                obj = sb2.toString();
            }
            String[] strArr = (String[]) arrayList2.toArray(C19620yd.A0M);
            if (z) {
                str = "PendingMutationsTable.buildSelectMutationsByChatIdAndMutationNames";
            } else {
                str = "SyncdMutationsTable.buildSelectMutationsByChatIdAndMutationNames";
            }
            A0A = r4.A0A(obj, str, strArr);
            while (A0A.moveToNext()) {
                if (z) {
                    a8l = A00(A0A, this);
                } else {
                    a8l = A01(A0A, this);
                }
                if (a8l != null) {
                    arrayList.add(a8l);
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

    public ArrayList A0D(Set set, int i) {
        Cursor A0A;
        ArrayList arrayList = new ArrayList(set);
        arrayList.add(String.valueOf(i));
        ArrayList arrayList2 = new ArrayList();
        C28781at A05 = this.A00.get();
        try {
            C23141Ev r4 = ((C28801av) A05).A02;
            int size = set.size();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE collection_name IN ");
            sb.append(AnonymousClass1H2.A00(size));
            sb.append(" OR ");
            sb.append("collection_name");
            sb.append(" IS NULL  ORDER BY ");
            sb.append("_id");
            sb.append(" ASC  LIMIT ?");
            A0A = r4.A0A(sb.toString(), "PendingMutationsTable.buildSelectMutationsByCollections", (String[]) arrayList.toArray(C19620yd.A0M));
            while (A0A.moveToNext()) {
                arrayList2.add(A00(A0A, this));
            }
            A0A.close();
            A05.close();
            return arrayList2;
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

    public HashMap A0E(String str, String[] strArr) {
        Cursor A0A;
        HashMap hashMap = new HashMap();
        if (strArr.length == 0) {
            return hashMap;
        }
        C443423b r1 = new C443423b(strArr, 975);
        ArrayList arrayList = new ArrayList();
        C28781at A05 = this.A00.get();
        try {
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                String[] strArr2 = (String[]) it.next();
                arrayList.clear();
                arrayList.add(str);
                arrayList.addAll(Arrays.asList(strArr2));
                C23141Ev r3 = ((C28801av) A05).A02;
                int length = strArr2.length;
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT mutation_index, mutation_mac FROM syncd_mutations WHERE collection_name = ? AND mutation_index IN ");
                sb.append(AnonymousClass1H2.A00(length));
                A0A = r3.A0A(sb.toString(), "SyncdMutationsStore.getMutationsMac", (String[]) arrayList.toArray(C19620yd.A0M));
                int columnIndexOrThrow = A0A.getColumnIndexOrThrow("mutation_index");
                int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("mutation_mac");
                while (A0A.moveToNext()) {
                    String string = A0A.getString(columnIndexOrThrow);
                    byte[] blob = A0A.getBlob(columnIndexOrThrow2);
                    if (blob != null) {
                        hashMap.put(string, blob);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SyncdMutationsStore/getLatestMutationsMac: Should never be null for index:");
                        sb2.append(string);
                        Log.e(sb2.toString());
                    }
                }
                A0A.close();
            }
            A05.close();
            return hashMap;
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

    public HashSet A0F(Collection collection) {
        C41851xA BD0;
        boolean z;
        HashSet hashSet = new HashSet();
        C28791au A06 = this.A00.A06();
        try {
            BD0 = A06.BD0();
            C60042nI A0D = ((C28801av) A06).A02.A0D("INSERT OR REPLACE INTO pending_mutations (mutation_index, mutation_value, mutation_version, operation, device_id, epoch, is_ready_to_sync, collection_name, are_dependencies_missing, mutation_name, chat_jid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", "PendingMutationsTable.INSERT_OR_REPLACE");
            collection.size();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C20126A8l a8l = (C20126A8l) it.next();
                String A0B = a8l.A0B();
                C18070vi.A0d(A0B, 0);
                C60192nY A002 = ((C58862lN) this.A01.get()).A00(A0B);
                if (A002 != null) {
                    z = A002.A0J();
                } else {
                    z = false;
                }
                if (z) {
                    SQLiteStatement sQLiteStatement = A0D.A00;
                    sQLiteStatement.clearBindings();
                    sQLiteStatement.bindString(1, a8l.A0A());
                    if (a8l.A0E() != null) {
                        sQLiteStatement.bindBlob(2, a8l.A0E());
                    } else {
                        sQLiteStatement.bindNull(2);
                    }
                    sQLiteStatement.bindLong(3, (long) a8l.A03);
                    sQLiteStatement.bindBlob(4, a8l.A05.A01);
                    C19999A2n a2n = a8l.A00;
                    if (a2n == null) {
                        sQLiteStatement.bindNull(5);
                        sQLiteStatement.bindNull(6);
                    } else {
                        sQLiteStatement.bindLong(5, (long) a2n.A00());
                        sQLiteStatement.bindLong(6, (long) A8G.A01(a8l.A00.A00, 2));
                    }
                    long j = 0;
                    sQLiteStatement.bindLong(7, 0);
                    sQLiteStatement.bindString(8, a8l.A06);
                    if (a8l.A0D()) {
                        j = 1;
                    }
                    sQLiteStatement.bindLong(9, j);
                    sQLiteStatement.bindString(10, a8l.A0B());
                    if (a8l instanceof C72173Kx) {
                        sQLiteStatement.bindString(11, ((C72173Kx) a8l).getChatJid().getRawString());
                    } else {
                        sQLiteStatement.bindNull(11);
                    }
                    hashSet.add(String.valueOf(A0D.A01()));
                }
            }
            BD0.A00();
            BD0.close();
            A06.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                A06.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0G(C20126A8l a8l) {
        C41851xA BD0;
        C28791au A06 = this.A00.A06();
        try {
            BD0 = A06.BD0();
            A06(((C28801av) A06).A02, new String[]{a8l.A07});
            BD0.A00();
            BD0.close();
            A06.close();
            return;
        } catch (Throwable th) {
            try {
                A06.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0H(C20126A8l a8l) {
        C41851xA BD0;
        C28791au A06 = this.A00.A06();
        try {
            BD0 = A06.BD0();
            A07(((C28801av) A06).A02, C20068A5s.A02(Collections.singleton(a8l)));
            BD0.A00();
            BD0.close();
            A06.close();
            return;
        } catch (Throwable th) {
            try {
                A06.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0I(Collection collection) {
        C41851xA BD0;
        C28791au A06 = this.A00.A06();
        try {
            BD0 = A06.BD0();
            A0K(A0F(collection));
            BD0.A00();
            BD0.close();
            A06.close();
            return;
        } catch (Throwable th) {
            try {
                A06.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0J(Collection collection) {
        C41851xA BD0;
        C28791au A06 = this.A00.A06();
        try {
            BD0 = A06.BD0();
            A05(((C28801av) A06).A02, this, collection);
            BD0.A00();
            BD0.close();
            A06.close();
            return;
        } catch (Throwable th) {
            try {
                A06.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A0L() {
        Cursor A0A;
        C28781at A05 = this.A00.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT _id FROM syncd_mutations LIMIT 1", "SyncdMutationsTable.SELECT_ANY_MUTATION", (String[]) null);
            boolean z = false;
            if (A0A.moveToNext() && A0A.getString(A0A.getColumnIndexOrThrow("_id")) != null) {
                z = true;
            }
            A0A.close();
            A05.close();
            return z;
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

    public boolean A0M(Set set) {
        C23141Ev Bbw = this.A00.Bbw();
        int size = set.size();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT _id FROM syncd_mutations WHERE collection_name IN ");
        sb.append(AnonymousClass1H2.A00(size));
        sb.append(" LIMIT 1");
        Cursor A0A = Bbw.A0A(sb.toString(), "SyncdMutationsTable.buildSelectAnyMutationFromAnyCollection", (String[]) set.toArray(C19620yd.A0M));
        try {
            boolean z = false;
            if (A0A.moveToNext() && A0A.getString(A0A.getColumnIndexOrThrow("_id")) != null) {
                z = true;
            }
            A0A.close();
            return z;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public C26331Rs(AnonymousClass190 r1, C25551Oq r2, AnonymousClass00H r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public void A0K(Set set) {
        C41851xA BD0;
        if (!set.isEmpty()) {
            C28791au A06 = this.A00.A06();
            try {
                BD0 = A06.BD0();
                Iterator it = new C443423b((String[]) set.toArray(C19620yd.A0M), 975).iterator();
                while (it.hasNext()) {
                    String[] strArr = (String[]) it.next();
                    C23141Ev r3 = ((C28801av) A06).A02;
                    int length = strArr.length;
                    StringBuilder sb = new StringBuilder();
                    sb.append("UPDATE pending_mutations SET is_ready_to_sync = 1 WHERE _id IN ( ");
                    sb.append(TextUtils.join(",", Collections.nCopies(length, "?")));
                    sb.append(" )");
                    r3.A0F(sb.toString(), "SyncdMutationsStore.markPendingMutationsReadyToSync", strArr);
                }
                BD0.A00();
                BD0.close();
                A06.close();
                return;
            } catch (Throwable th) {
                try {
                    A06.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
