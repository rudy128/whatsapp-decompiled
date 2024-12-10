package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2rX  reason: invalid class name and case insensitive filesystem */
public final class C62522rX {
    public static final List A06;
    public final AnonymousClass1NA A00;
    public final AnonymousClass2LO A01;
    public final AnonymousClass11S A02;
    public final C19830z4 A03;
    public final C24621La A04;
    public final AnonymousClass00H A05;

    static {
        Long[] lArr = new Long[7];
        C17890vO.A1L(lArr, 2);
        C17890vO.A1M(lArr, 3);
        C17890vO.A1N(lArr, 4);
        C17890vO.A1O(lArr, 5);
        C17890vO.A1P(lArr, 1);
        C17890vO.A1Q(lArr, 7);
        A06 = C18070vi.A0O(8L, lArr, 6);
    }

    public final long A01(String str, int i) {
        long j;
        Cursor A002;
        String str2 = str;
        C18070vi.A0d(str2, 0);
        int i2 = i;
        C41761x1 r12 = new C41761x1(str2, 0, i2, -1, -1, 0, 0, false);
        AnonymousClass2LO r2 = this.A01;
        C17890vO.A0r(r2, r12, 13);
        AnonymousClass1NA r3 = this.A00;
        C41761x1 r18 = new C41761x1(str2, 0, i2, -1, -1, 0, 0, false);
        C17960vV.A01();
        try {
            AnonymousClass1Cd r6 = r3.A03;
            C28791au A052 = r6.A05();
            try {
                C41851xA BD0 = A052.BD0();
                try {
                    String str3 = r18.A06;
                    C28781at A042 = r6.get();
                    try {
                        A002 = C23141Ev.A00(((C28801av) A042).A02, "SELECT _id, type, label_name, predefined_id, color_id, sort_id, hidden FROM labels ORDER BY sort_id ASC", "getLabels/QUERY_LABELS");
                        ArrayList A13 = AnonymousClass000.A13();
                        int columnIndexOrThrow = A002.getColumnIndexOrThrow("label_name");
                        while (A002.moveToNext()) {
                            A13.add(A002.getString(columnIndexOrThrow));
                        }
                        A002.close();
                        A042.close();
                        Iterator it = A13.iterator();
                        while (it.hasNext()) {
                            if (C17880vN.A0v(it).equalsIgnoreCase(str3)) {
                                BD0.close();
                                A052.close();
                                j = -2;
                                break;
                            }
                        }
                        ContentValues A09 = C17880vN.A09(5);
                        C17880vN.A18(A09, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 0);
                        A09.put("label_name", str3);
                        C17880vN.A18(A09, "color_id", r18.A01);
                        C17880vN.A19(A09, "predefined_id", 0);
                        A09.put("hidden", false);
                        j = ((C28801av) A052).A02.A05("labels", "insertNewLabel/INSERT_LABELS", A09);
                        AnonymousClass1NA.A04(A052, "insertNewLabel/UPDATE_SORT_ID", j, j);
                        BD0.A00();
                        A052.BJ7(new AnonymousClass3C3(r3, r18, 6, j));
                        BD0.close();
                        A052.close();
                        C17890vO.A0q(r2, 15);
                        return j;
                    } catch (Throwable th) {
                        A042.close();
                        throw th;
                    }
                    throw th;
                } catch (Throwable th2) {
                    BD0.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                A052.close();
                throw th3;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            r3.A02.A03();
            j = -1;
        } catch (Throwable th4) {
            AnonymousClass0DT.A00(th3, th4);
        }
    }

    public final long A00(long j, long j2, boolean z) {
        C41851xA BD0;
        long j3 = j;
        AnonymousClass1NA r2 = this.A00;
        C41761x1 A062 = r2.A06(j3);
        if (A062 == null) {
            return -1;
        }
        int i = A062.A02;
        long j4 = A062.A03;
        long j5 = j2;
        boolean z2 = z;
        C41761x1 r7 = new C41761x1(A062.A06, i, A062.A01, -1, j4, A062.A04, j5, z2);
        AnonymousClass2LO r6 = this.A01;
        C17890vO.A0r(r6, r7, 15);
        C17960vV.A01();
        try {
            C28791au A052 = r2.A03.A05();
            try {
                BD0 = A052.BD0();
                ContentValues A08 = C17890vO.A08();
                C17880vN.A18(A08, "hidden", z2 ? 1 : 0);
                C17880vN.A19(A08, "sort_id", j5);
                C23141Ev r4 = ((C28801av) A052).A02;
                String[] strArr = new String[1];
                C17880vN.A1V(strArr, 0, j3);
                int A022 = r4.A02(A08, "labels", "_id = ?", "editLabel/UPDATE_LABEL_HIDDEN", strArr);
                if (A022 != 1) {
                    C17900vP.A0i("core-label-store/edit-label: error, attempting to edit 1 label hidden, actually edited: ", AnonymousClass000.A10(), A022);
                    r2.A00.A0G("CoreLabelStore/editLabel", "core-label-store-edit-failure", true);
                }
                BD0.A00();
                if (A022 == 1) {
                    C41761x1 A07 = r2.A07(j3);
                    if (A07 != null) {
                        Map map = r2.A01.A01;
                        Long valueOf = Long.valueOf(j3);
                        int i2 = A07.A02;
                        long j6 = A07.A03;
                        String str = A07.A06;
                        long j7 = A07.A04;
                        map.put(valueOf, new C41761x1(str, i2, A07.A01, A07.A00, j6, j7, j5, z2));
                    }
                    BD0.close();
                    A052.close();
                    C17890vO.A0q(r6, 15);
                    return j3;
                }
                BD0.close();
                A052.close();
                j3 = -1;
                C17890vO.A0q(r6, 15);
                return j3;
            } catch (Throwable th) {
                A052.close();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            r2.A02.A03();
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
        throw th;
    }

    public final long A02(String str, long j, long j2) {
        C41851xA BD0;
        long j3 = j;
        String str2 = str;
        C18070vi.A0d(str2, 1);
        AnonymousClass1NA r4 = this.A00;
        C41761x1 A062 = r4.A06(j3);
        if (A062 == null) {
            return -1;
        }
        int i = A062.A02;
        long j4 = A062.A03;
        int i2 = A062.A01;
        String str3 = str2;
        int i3 = i;
        int i4 = i2;
        long j5 = j4;
        C41761x1 r13 = new C41761x1(str3, i3, i4, -1, j5, 0, A062.A05, A062.A07);
        AnonymousClass2LO r7 = this.A01;
        C17890vO.A0r(r7, r13, 15);
        C17960vV.A01();
        try {
            C28791au A052 = r4.A03.A05();
            try {
                BD0 = A052.BD0();
                if (i == 0) {
                    for (C41761x1 r3 : C29431cG.A0z(r4.A08(), new C99234sU(15))) {
                        if (r3.A06.equalsIgnoreCase(str2) && r3.A03 != j) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("core-label-store/edit-label/duplicate-name labelId=");
                            A10.append(j3);
                            C17900vP.A0e(", newName = ", str2, A10);
                            BD0.close();
                            A052.close();
                            j3 = -2;
                            break;
                        }
                    }
                }
                ContentValues A08 = C17890vO.A08();
                A08.put("label_name", str2);
                long j6 = j2;
                C17880vN.A19(A08, "predefined_id", j6);
                C23141Ev r10 = ((C28801av) A052).A02;
                String[] strArr = new String[1];
                C17890vO.A1J(strArr, j3);
                int A022 = r10.A02(A08, "labels", "_id = ?", "editLabel/UPDATE_LABELS", strArr);
                if (A022 != 1) {
                    C17900vP.A0i("core-label-store/edit-label: error, attempting to edit 1 label, actually edited: ", AnonymousClass000.A10(), A022);
                    r4.A00.A0G("CoreLabelStore/editLabel", "core-label-store-edit-failure", true);
                }
                BD0.A00();
                if (A022 == 1) {
                    C41761x1 A07 = r4.A07(j3);
                    if (A07 != null) {
                        Map map = r4.A01.A01;
                        Long valueOf = Long.valueOf(j3);
                        int i5 = A07.A02;
                        long j7 = A07.A03;
                        map.put(valueOf, new C41761x1(str2, i5, A07.A01, A07.A00, j7, j6, A07.A05, A07.A07));
                    }
                    BD0.close();
                    A052.close();
                    C17890vO.A0q(r7, 15);
                    return j3;
                }
                BD0.close();
                A052.close();
                j3 = -1;
                C17890vO.A0q(r7, 15);
                return j3;
            } catch (Throwable th) {
                A052.close();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            r4.A02.A03();
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
        throw th;
    }

    public C62522rX(AnonymousClass11S r2, C19830z4 r3, AnonymousClass1NA r4, AnonymousClass2LO r5, C24621La r6, AnonymousClass00H r7) {
        C18070vi.A0w(r4, r5, r6, r7, r3);
        C18070vi.A0d(r2, 6);
        this.A00 = r4;
        this.A01 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r3;
        this.A02 = r2;
    }
}
