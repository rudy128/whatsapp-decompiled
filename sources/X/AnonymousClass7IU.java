package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.7IU  reason: invalid class name */
public class AnonymousClass7IU implements AnonymousClass8AO {
    public C147037Ro A00;
    public boolean A01;
    public final AnonymousClass2Dg A02;
    public final C18030ve A03;
    public final AnonymousClass190 A04;
    public final C1193267r A05;
    public final C138206wh A06;

    public /* bridge */ /* synthetic */ Collection BL5(String str, int i, boolean z) {
        return A01(str, i, false);
    }

    public void BEs() {
        C41851xA BD0;
        C28791au A062 = this.A02.A06();
        try {
            BD0 = A062.BD0();
            C23141Ev r4 = ((C28801av) A062).A02;
            String[] strArr = new String[1];
            C17880vN.A1S(strArr, 1, 0);
            r4.A04("emoji_search_tag", "type=?", "EmojiDictionaryStore/clearAll/DELETE_EMOJI_SEARCH_TAG", strArr);
            BD0.A00();
            BD0.close();
            A062.close();
            return;
        } catch (Throwable th) {
            try {
                A062.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public Collection BL6(String[] strArr) {
        C17960vV.A0F(false, "Not implemented");
        return AnonymousClass000.A13();
    }

    public int getCount() {
        Cursor A0A;
        C28781at A052 = this.A02.get();
        try {
            int i = 0;
            A0A = ((C28801av) A052).A02.A0A("SELECT count(*) as count FROM emoji_search_tag WHERE type=?", "GET_COUNT_EMOJI_SEARCH_TAG", new String[]{String.valueOf(1)});
            if (A0A.moveToNext()) {
                i = C17890vO.A01(A0A, "count");
            }
            A0A.close();
            A052.close();
            return i;
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

    public AnonymousClass7IU(AnonymousClass190 r1, AnonymousClass2Dg r2, C1193267r r3, C138206wh r4, C18030ve r5) {
        this.A03 = r5;
        this.A04 = r1;
        this.A05 = r3;
        this.A06 = r4;
        this.A02 = r2;
    }

    private LinkedHashSet A00(String str, List list, List list2, int i, boolean z) {
        C147037Ro r1;
        String str2;
        String A0c;
        Cursor A0A;
        HashSet A12 = C17880vN.A12();
        LinkedHashSet A14 = C17880vN.A14();
        if (A14.size() < i) {
            if (!this.A01) {
                this.A04.A0G("emoji dictionary is not prepared yet", (String) null, false);
                return A14;
            }
            A12 = C17880vN.A12();
            StringBuilder A19 = AnonymousClass3MZ.A19(str, 0);
            A19.append("SELECT DISTINCT symbol FROM emoji_search_tag WHERE type=? AND (tag ");
            if (z) {
                str2 = " = ";
            } else {
                str2 = " LIKE ";
            }
            A19.append(str2);
            String A0y = AnonymousClass000.A0y(" ? OR symbol=?) ORDER BY _id ASC LIMIT ?", A19);
            String[] strArr = new String[4];
            strArr[0] = "1";
            if (z) {
                A0c = str;
            } else {
                A0c = C17890vO.A0c(AnonymousClass000.A11(str), '%');
            }
            strArr[1] = A0c;
            strArr[2] = str;
            C17880vN.A1S(strArr, 256, 3);
            C19760yx r12 = new C19760yx(A0y, strArr);
            try {
                C28781at A052 = this.A02.get();
                try {
                    A0A = ((C28801av) A052).A02.A0A((String) r12.A00, "DISTINCT_SYMBOL_FROM_EMOJI_SEARCH_TAG", (String[]) r12.A01);
                    int columnIndexOrThrow = A0A.getColumnIndexOrThrow("symbol");
                    while (A0A.moveToNext()) {
                        A12.add(C137176v2.A00(A0A.getString(columnIndexOrThrow)));
                    }
                    A0A.close();
                    A052.close();
                } catch (Throwable th) {
                    A052.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                Log.e((Throwable) e);
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
        }
        if (A14.size() < i) {
            LinkedHashSet A142 = C17880vN.A14();
            if (!A12.isEmpty()) {
                for (Object next : list) {
                    if (A12.contains(next)) {
                        A142.add(next);
                        A12.remove(next);
                    }
                }
            }
            A14.addAll(A142);
        }
        if (A14.size() < i) {
            LinkedHashSet A143 = C17880vN.A14();
            if (!A12.isEmpty()) {
                for (Object next2 : list2) {
                    if (A12.contains(next2)) {
                        A143.add(next2);
                        A12.remove(next2);
                    }
                }
            }
            A14.addAll(A143);
        }
        if (A14.size() < i && A12.size() > 0) {
            ArrayList A0g = C108975cc.A0g(A12);
            A0g.addAll(A12);
            synchronized (this) {
                r1 = this.A00;
                if (r1 == null) {
                    r1 = new C147037Ro(C137786w1.A00(this.A03));
                    this.A00 = r1;
                }
            }
            Collections.sort(A0g, r1);
            A14.addAll(A0g);
            return A14;
        }
        return A14;
        throw th;
    }

    public ArrayList A01(String str, int i, boolean z) {
        ArrayList arrayList;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = this.A05.A05().iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            if (iArr != null) {
                A13.add(new AnonymousClass737(iArr));
            }
        }
        C138206wh r3 = this.A06;
        synchronized (r3) {
            List list = r3.A00;
            if (list != null) {
                arrayList = C17880vN.A10(list);
            } else {
                ArrayList A132 = AnonymousClass000.A13();
                String A0r = C17880vN.A0r(C17890vO.A0B(r3.A02), "top_emojis");
                if (A0r != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(A0r);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            A132.add(C137176v2.A00(jSONArray.getString(i2)));
                        }
                        r3.A00 = A132;
                        arrayList = C17880vN.A10(A132);
                    } catch (JSONException e) {
                        C17900vP.A0X(e, "topemojisstore/get-top-emojis/failed ", AnonymousClass000.A10());
                        arrayList = C17880vN.A10(C138206wh.A03);
                    }
                } else {
                    arrayList = C17880vN.A10(C138206wh.A03);
                }
            }
        }
        return A02(str, A13, arrayList, i, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A02(java.lang.String r19, java.util.List r20, java.util.List r21, int r22, boolean r23) {
        /*
            r18 = this;
            java.lang.String r0 = r19.trim()
            java.lang.String r8 = X.AnonymousClass1EG.A06(r0)
            java.util.LinkedHashSet r1 = X.C17880vN.A14()
            r7 = r18
            r9 = r20
            r10 = r21
            r11 = r22
            if (r23 == 0) goto L_0x008d
            r12 = 1
            java.util.LinkedHashSet r0 = r7.A00(r8, r9, r10, r11, r12)
        L_0x001b:
            r1.addAll(r0)
        L_0x001e:
            X.0ve r3 = r7.A03
            r2 = 2880(0xb40, float:4.036E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 != 0) goto L_0x0035
            X.0vq r0 = X.C124576Yw.A00
            java.lang.Object r0 = r0.get()
            java.util.Collection r0 = (java.util.Collection) r0
            r1.removeAll(r0)
        L_0x0035:
            java.util.ArrayList r5 = X.C108975cc.A0g(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x003d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r6 = r10.next()
            X.737 r6 = (X.AnonymousClass737) r6
            int r0 = r5.size()
            if (r0 >= r11) goto L_0x00c1
            int[] r9 = r6.A00
            int r0 = r9.length
            r8 = 0
            r2 = 1
            if (r0 != r2) goto L_0x007a
            int[] r1 = X.C108945cZ.A1W()
            r0 = r9[r8]
            r1[r8] = r0
            r0 = 65039(0xfe0f, float:9.1139E-41)
            X.737 r7 = X.AnonymousClass737.A00(r1, r0, r2)
            int[] r1 = r7.A00
            X.5z5 r0 = new X.5z5
            r0.<init>(r1)
            long r3 = X.C43291zZ.A00(r0, r2)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x007a
            r5.add(r7)
            goto L_0x003d
        L_0x007a:
            X.5z5 r0 = new X.5z5
            r0.<init>(r9)
            long r3 = X.C43291zZ.A00(r0, r8)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x003d
            r5.add(r6)
            goto L_0x003d
        L_0x008d:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x009a
            r1.addAll(r9)
            r1.addAll(r10)
            goto L_0x001e
        L_0x009a:
            int r0 = r1.size()
            int r16 = r22 - r0
            r17 = 1
            r12 = r7
            r13 = r8
            r14 = r9
            r15 = r10
            java.util.LinkedHashSet r0 = r12.A00(r13, r14, r15, r16, r17)
            r1.addAll(r0)
            int r0 = r1.size()
            if (r0 >= r11) goto L_0x001e
            int r0 = r1.size()
            int r16 = r22 - r0
            r17 = 0
            java.util.LinkedHashSet r0 = r12.A00(r13, r14, r15, r16, r17)
            goto L_0x001b
        L_0x00c1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IU.A02(java.lang.String, java.util.List, java.util.List, int, boolean):java.util.ArrayList");
    }

    public void CJF(boolean z) {
        C17900vP.A0n("emojidictionarystore/setIsFetched:", AnonymousClass000.A10(), z);
        this.A01 = z;
    }
}
