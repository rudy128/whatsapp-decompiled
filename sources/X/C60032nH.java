package X;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.2nH  reason: invalid class name and case insensitive filesystem */
public final class C60032nH {
    public final AnonymousClass1NH A00;
    public final AnonymousClass10I A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass7FG A03;
    public final AnonymousClass00H A04;

    public final int A00(Collection collection, long j) {
        int i;
        ArrayList arrayList;
        C28791au A05;
        Collection collection2 = collection;
        C18070vi.A0d(collection2, 1);
        Iterator it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            it.next();
            A03();
        }
        AnonymousClass1NH r8 = this.A00;
        try {
            AnonymousClass1Cd r12 = r8.A03;
            C28791au A052 = r12.A05();
            try {
                C41851xA BD0 = A052.BD0();
                try {
                    Iterator it2 = collection2.iterator();
                    i = 0;
                    while (true) {
                        long j2 = j;
                        if (!it2.hasNext()) {
                            break;
                        }
                        long A09 = r8.A01.A09(C17880vN.A0Q(it2));
                        ContentValues A08 = C17880vN.A08();
                        C17880vN.A19(A08, "label_id", j2);
                        C17880vN.A19(A08, "jid_row_id", A09);
                        A05 = r12.A05();
                        if (((C28801av) A05).A02.A09("labeled_jid", "INSERT_LABELED_JID", A08, 5) >= 0) {
                            i++;
                        } else {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("LabelJidStore/addLabelToJidsV2/insert error, labelId=");
                            A10.append(j2);
                            C17900vP.A0l("; jidRowId=", A10, A09);
                        }
                        A05.close();
                    }
                    C18030ve r1 = r8.A07;
                    C18040vf r10 = C18040vf.A02;
                    if (C18020vd.A05(r10, r1, 10618)) {
                        for (int i2 = 0; i2 < i; i2++) {
                            AnonymousClass1ND r14 = r8.A06;
                            Log.i("LabelJidUsageTracker/addLabelAppliedTimestamp start");
                            C18100vl r19 = r14.A02;
                            if (C17880vN.A0C(r19).contains("label_applied_timestamp_list")) {
                                String A0r = C17880vN.A0r(C17880vN.A0C(r19), "label_applied_timestamp_list");
                                ArrayList A13 = AnonymousClass000.A13();
                                if (A0r != null) {
                                    try {
                                        JSONArray jSONArray = new JSONArray(A0r);
                                        int length = jSONArray.length();
                                        for (int i3 = 0; i3 < length; i3++) {
                                            C17880vN.A1R(A13, jSONArray.getLong(i3));
                                        }
                                    } catch (JSONException e) {
                                        Log.e("LabelJidUsageTracker/jsonStringToList", e);
                                    }
                                }
                                arrayList = C29431cG.A0m(C29431cG.A0s(A13));
                            } else {
                                arrayList = AnonymousClass000.A13();
                            }
                            C17900vP.A0Y(arrayList, "LabelJidUsageTracker/addLabelAppliedTimestamp persisted sorted timestamps: ", AnonymousClass000.A10());
                            if (C17880vN.A1X(arrayList) && arrayList.size() >= C18020vd.A00(r10, r14.A00, 10619)) {
                                arrayList.remove(0);
                            }
                            C17880vN.A1R(arrayList, System.currentTimeMillis());
                            SharedPreferences.Editor A0A = C17890vO.A0A(r19);
                            JSONArray jSONArray2 = new JSONArray();
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                jSONArray2.put(C17890vO.A07(it3));
                            }
                            C17880vN.A1E(A0A, "label_applied_timestamp_list", C18070vi.A0H(jSONArray2));
                            C17900vP.A0Y(arrayList, "LabelJidUsageTracker/addLabelAppliedTimestamp updated timestamps: ", AnonymousClass000.A10());
                            Log.i("LabelJidUsageTracker/addLabelAppliedTimestamp end");
                        }
                    }
                    Iterator it4 = collection2.iterator();
                    while (it4.hasNext()) {
                        r8.A09.remove(C17880vN.A0Q(it4));
                    }
                    r8.A00.A0B(new long[]{j});
                    C24621La r13 = r8.A04;
                    String A022 = r13.A02("is_labels_user");
                    if (A022 == null || !Boolean.parseBoolean(A022)) {
                        r13.A06("is_labels_user", Boolean.toString(true));
                        C17890vO.A0q((C37421pV) r8.A08.get(), 16);
                    }
                    BD0.A00();
                    BD0.close();
                    A052.close();
                } catch (Throwable th) {
                    BD0.close();
                    throw th;
                }
            } catch (Throwable th2) {
                A052.close();
                throw th2;
            }
        } catch (SQLiteDatabaseCorruptException e2) {
            C17900vP.A0X(e2, "LabelJidStore/addLabelToJids/ex=", AnonymousClass000.A10());
            r8.A02.A03();
            i = -1;
        } catch (Throwable th3) {
            AnonymousClass0DT.A00(th2, th3);
        }
        A02();
        return i;
        throw th;
    }

    public final int A01(Collection collection, long j) {
        int i;
        C28791au A05;
        Collection collection2 = collection;
        C18070vi.A0d(collection2, 1);
        Iterator it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            it.next();
            A03();
        }
        AnonymousClass1NH r5 = this.A00;
        C17960vV.A01();
        if (collection2.isEmpty()) {
            i = 0;
        } else {
            try {
                AnonymousClass1Cd r11 = r5.A03;
                C28791au A052 = r11.A05();
                try {
                    C41851xA BD0 = A052.BD0();
                    try {
                        Iterator it2 = collection2.iterator();
                        i = 0;
                        while (true) {
                            long j2 = j;
                            if (!it2.hasNext()) {
                                break;
                            }
                            long A09 = r5.A01.A09(C17880vN.A0Q(it2));
                            A05 = r11.A05();
                            C23141Ev r10 = ((C28801av) A05).A02;
                            String[] A1Z = C17880vN.A1Z();
                            C17880vN.A1V(A1Z, 0, j2);
                            C17890vO.A1K(A1Z, A09);
                            i += r10.A04("labeled_jid", "label_id = ?  AND jid_row_id = ?", "DELETE_LABEL_FOR_JID", A1Z);
                            A05.close();
                        }
                        Iterator it3 = collection2.iterator();
                        while (it3.hasNext()) {
                            r5.A09.remove(C17880vN.A0Q(it3));
                        }
                        r5.A00.A0B(new long[]{j});
                        BD0.A00();
                        BD0.close();
                        A052.close();
                    } catch (Throwable th) {
                        BD0.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    A052.close();
                    throw th2;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                C17900vP.A0X(e, "LabelJidStore/removeLabelFromJids/ex=", AnonymousClass000.A10());
                r5.A02.A03();
                i = -1;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
            }
        }
        A02();
        return i;
        throw th;
    }

    public final void A02() {
        Iterator A0h = C17890vO.A0h(this.A04);
        if (A0h.hasNext()) {
            A0h.next();
            throw AnonymousClass000.A0s("afterApplyLabelJid");
        }
    }

    public final void A03() {
        Iterator A0h = C17890vO.A0h(this.A04);
        if (A0h.hasNext()) {
            A0h.next();
            throw AnonymousClass000.A0s("beforeApplyLabelJid");
        }
    }

    public C60032nH(AnonymousClass1NN r3, AnonymousClass1NH r4, AnonymousClass10I r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r5, r6, r4, r7, r3);
        this.A01 = r5;
        this.A02 = r6;
        this.A00 = r4;
        this.A04 = r7;
        AnonymousClass7FG r0 = new AnonymousClass7FG(this, 0);
        this.A03 = r0;
        r3.registerObserver(r0);
    }
}
