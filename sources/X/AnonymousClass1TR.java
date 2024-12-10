package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.1TR  reason: invalid class name */
public final class AnonymousClass1TR {
    public static final byte[] A0E;
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass18O A02;
    public final C25851Pw A03;
    public final AnonymousClass1S4 A04;
    public final AnonymousClass1TV A05;
    public final AnonymousClass1S0 A06;
    public final AnonymousClass11P A07;
    public final AnonymousClass1TT A08;
    public final AnonymousClass1TS A09;
    public final C26331Rs A0A;
    public final C18030ve A0B;
    public final AnonymousClass10I A0C;
    public final C26371Rw A0D;

    public AnonymousClass1TR(AnonymousClass190 r2, AnonymousClass11S r3, AnonymousClass18O r4, C26371Rw r5, C25851Pw r6, AnonymousClass1S4 r7, AnonymousClass1TV r8, AnonymousClass1S0 r9, AnonymousClass11P r10, AnonymousClass1TT r11, AnonymousClass1TS r12, C26331Rs r13, C18030ve r14, AnonymousClass10I r15) {
        C18070vi.A0d(r10, 1);
        C18070vi.A0d(r14, 2);
        C18070vi.A0d(r2, 3);
        C18070vi.A0d(r3, 4);
        C18070vi.A0d(r15, 5);
        C18070vi.A0d(r4, 6);
        C18070vi.A0d(r9, 7);
        C18070vi.A0d(r5, 8);
        C18070vi.A0d(r7, 9);
        C18070vi.A0d(r13, 10);
        C18070vi.A0d(r12, 11);
        C18070vi.A0d(r11, 12);
        C18070vi.A0d(r6, 13);
        C18070vi.A0d(r8, 14);
        this.A07 = r10;
        this.A0B = r14;
        this.A00 = r2;
        this.A01 = r3;
        this.A0C = r15;
        this.A02 = r4;
        this.A06 = r9;
        this.A0D = r5;
        this.A04 = r7;
        this.A0A = r13;
        this.A09 = r12;
        this.A08 = r11;
        this.A03 = r6;
        this.A05 = r8;
    }

    static {
        byte[] bytes = "WhatsApp Patch Integrity".getBytes(C26571Sq.A05);
        C18070vi.A0X(bytes);
        A0E = bytes;
    }

    public static final void A01(AnonymousClass1TR r11, String str, int i) {
        Cursor A0A2;
        Cursor A0A3;
        String A062;
        AnonymousClass1TS r0 = r11.A09;
        HashMap hashMap = new HashMap();
        C28781at A052 = r0.A00.get();
        try {
            A0A2 = ((C28801av) A052).A02.A0A("SELECT collection_name, lt_hash FROM collection_versions", "CollectionVersionsTable.GET_ALL_LT_HASHES", (String[]) null);
            while (A0A2.moveToNext()) {
                String string = A0A2.getString(A0A2.getColumnIndexOrThrow("collection_name"));
                byte[] blob = A0A2.getBlob(A0A2.getColumnIndexOrThrow("lt_hash"));
                if (blob == null) {
                    blob = new byte[128];
                }
                hashMap.put(string, blob);
            }
            A0A2.close();
            A052.close();
            C26331Rs r02 = r11.A0A;
            HashMap hashMap2 = new HashMap();
            C28781at A053 = r02.A00.get();
            try {
                A0A3 = ((C28801av) A053).A02.A0A("SELECT collection_name, mutation_mac FROM syncd_mutations", "SyncdMutationsStore.SELECT_COLLECTION_NAME_AND_MUTATION_MAC", (String[]) null);
                int columnIndexOrThrow = A0A3.getColumnIndexOrThrow("collection_name");
                int columnIndexOrThrow2 = A0A3.getColumnIndexOrThrow("mutation_mac");
                while (A0A3.moveToNext()) {
                    String string2 = A0A3.getString(columnIndexOrThrow);
                    byte[] blob2 = A0A3.getBlob(columnIndexOrThrow2);
                    List list = (List) hashMap2.get(string2);
                    if (list == null) {
                        list = new ArrayList();
                        hashMap2.put(string2, list);
                    }
                    list.add(blob2);
                }
                A0A3.close();
                A053.close();
                LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
                if (str == null) {
                    linkedHashSet.addAll(hashMap.keySet());
                    linkedHashSet.addAll(hashMap2.keySet());
                } else {
                    linkedHashSet.add(str);
                }
                for (String str2 : linkedHashSet) {
                    List list2 = (List) hashMap2.get(str2);
                    if (list2 == null) {
                        list2 = C18460wS.A00;
                    }
                    byte[] A002 = AnonymousClass2TC.A00(list2, new byte[128], A0E, true);
                    C18070vi.A0X(A002);
                    byte[] bArr = (byte[]) hashMap.get(str2);
                    if (!Arrays.equals(A002, bArr)) {
                        r11.A0D.A09(i, str2);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("\n                        SyncEncryptionHelper/checkLtHashConsistency collection=");
                    sb.append(str2);
                    sb.append("\n                        ltHashFromMutations: ");
                    String A063 = C17970vW.A06(A002);
                    int length = A063.length();
                    if (length > 16) {
                        if (!C18020vd.A05(C18040vf.A02, r11.A0B, 624)) {
                            A063 = A063.substring(length - 16);
                            C18070vi.A0X(A063);
                        }
                    }
                    sb.append(A063);
                    sb.append("\n                        ltHashFromDb: ");
                    if (bArr == null) {
                        A062 = "NULL";
                    } else {
                        A062 = C17970vW.A06(bArr);
                        int length2 = A062.length();
                        if (length2 > 16) {
                            if (!C18020vd.A05(C18040vf.A02, r11.A0B, 624)) {
                                A062 = A062.substring(length2 - 16);
                                C18070vi.A0X(A062);
                            }
                        }
                    }
                    sb.append(A062);
                    sb.append("\n                        ");
                    AnonymousClass1Y7.A01(sb.toString());
                }
                return;
            } catch (Throwable th) {
                th = th;
                try {
                    A053.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
            throw th;
            throw th;
        } catch (Throwable th3) {
            th = th3;
            A052.close();
            throw th;
        }
    }

    public static final C46272Dx A00(C20126A8l a8l) {
        String[] A0F = a8l.A0F();
        return new C46272Dx(a8l.A00, a8l.A0A(), a8l.A06, A0F, a8l.A03);
    }
}
