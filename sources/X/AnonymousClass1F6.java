package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.1F6  reason: invalid class name */
public class AnonymousClass1F6 implements AnonymousClass1F3, AnonymousClass1F4, AnonymousClass1F5 {
    public final Map A00 = new HashMap();
    public final Map A01 = new LinkedHashMap();
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();
    public final Map A08 = new HashMap();

    private boolean A01(C23141Ev r3, String str) {
        if (str == null) {
            return false;
        }
        Map map = this.A07;
        Boolean bool = (Boolean) map.get(str);
        if (bool == null) {
            bool = Boolean.valueOf(!TextUtils.isEmpty(C28331Zy.A00(r3, "table", str)));
            map.put(str, bool);
        }
        return bool.booleanValue();
    }

    public void A02(C23141Ev r16) {
        C23141Ev r9;
        Map map = this.A08;
        map.size();
        this.A07.clear();
        Iterator it = this.A06.entrySet().iterator();
        while (true) {
            r9 = r16;
            if (!it.hasNext()) {
                break;
            }
            ((AnonymousClass137) ((Map.Entry) it.next()).getValue()).BHt(r9);
        }
        for (Map.Entry entry : map.entrySet()) {
            C25051Mr r0 = (C25051Mr) entry.getValue();
            String str = (String) entry.getKey();
            List<C25031Mp> list = r0.A00;
            List list2 = r0.A01;
            String A002 = C28331Zy.A00(r9, "table", str);
            if (TextUtils.isEmpty(A002)) {
                ArrayList arrayList = new ArrayList(list.size() + list2.size());
                for (C25031Mp r1 : list) {
                    String str2 = r1.A02;
                    String str3 = r1.A00.value;
                    String str4 = r1.A01;
                    if (!AnonymousClass1EG.A0H(str4)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append(" ");
                        sb.append(str4.trim());
                        str3 = sb.toString();
                    }
                    if (!AnonymousClass1EG.A0H(str3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(" ");
                        sb2.append(str3);
                        str2 = sb2.toString();
                    }
                    arrayList.add(str2);
                }
                arrayList.addAll(list2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("CREATE TABLE IF NOT EXISTS ");
                sb3.append(str);
                sb3.append("(");
                sb3.append(TextUtils.join(",", arrayList));
                sb3.append(")");
                String obj = sb3.toString();
                C18070vi.A0d(str, 0);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("CREATE_");
                sb4.append(str);
                r9.A0E(obj, sb4.toString());
            } else {
                for (C25031Mp r12 : list) {
                    String str5 = r12.A02;
                    String str6 = r12.A00.value;
                    String str7 = r12.A01;
                    if (!AnonymousClass1EG.A0H(str7)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str6);
                        sb5.append(" ");
                        sb5.append(str7.trim());
                        str6 = sb5.toString();
                    }
                    C28331Zy.A04(r9, A002, str, str5, str6, "SharedDBQueryExecutor/createOrAlterTable");
                }
            }
        }
    }

    public void A03(C23141Ev r4, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/createIndexes");
        A00(r4, this, sb.toString(), this.A01, true);
    }

    public void A04(C23141Ev r18, String str) {
        String str2;
        String replace;
        Cursor A0A;
        TreeMap treeMap = new TreeMap(new C21486Akr(23));
        treeMap.putAll(Collections.unmodifiableMap(this.A03));
        TreeMap treeMap2 = new TreeMap(new C21486Akr(23));
        C23141Ev r4 = r18;
        try {
            A0A = r4.A0A("SELECT name,sql FROM sqlite_master WHERE type='trigger'", "GET_TRIGGER_SQL", (String[]) null);
            int columnIndexOrThrow = A0A.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("sql");
            while (A0A.moveToNext()) {
                treeMap2.put(A0A.getString(columnIndexOrThrow), A0A.getString(columnIndexOrThrow2));
            }
            A0A.close();
        } catch (Exception e) {
            Log.e("schema-registry/scanExistingTriggers", e);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : treeMap2.entrySet()) {
            Object key = entry.getKey();
            String str3 = (String) this.A02.get(key);
            if (!TextUtils.isEmpty(str3) && A01(r4, str3) && (str2 = (String) treeMap.get(key)) != null) {
                String str4 = (String) entry.getValue();
                String replace2 = str2.toLowerCase(Locale.getDefault()).replaceAll("\\s*", "").replace("ifnotexists", "").replace(";", "");
                if (str4 == null) {
                    replace = null;
                } else {
                    replace = str4.toLowerCase(Locale.getDefault()).replaceAll("\\s*", "").replace("ifnotexists", "").replace(";", "");
                }
                if (replace2.equalsIgnoreCase(replace)) {
                    arrayList2.add(key);
                }
            }
            arrayList.add(String.format("DROP TRIGGER %s;", new Object[]{key}));
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            treeMap.remove(it.next());
        }
        for (Map.Entry entry2 : treeMap.entrySet()) {
            String str5 = (String) this.A02.get(entry2.getKey());
            C17960vV.A0F(!TextUtils.isEmpty(str5), "Table name is not specified for the trigger.");
            if (A01(r4, str5)) {
                arrayList.add(entry2.getValue());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/schema-registry/createTriggers");
            r4.A0E((String) it2.next(), sb.toString());
        }
        return;
        throw th;
    }

    public void A05(C23141Ev r3, String str) {
        for (String A032 : this.A08.keySet()) {
            C28331Zy.A03(r3, str, A032);
        }
    }

    public void CE5(String str, List list, List list2) {
        if (this.A08.put(str, new C25051Mr(list, list2)) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" table is already registered");
            C17960vV.A0F(false, sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A08.containsKey(r6) != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CE7(X.AnonymousClass137 r5, java.lang.String r6) {
        /*
            r4 = this;
            java.util.Map r3 = r4.A06
            boolean r0 = r3.containsKey(r6)
            if (r0 != 0) goto L_0x0011
            java.util.Map r0 = r4.A08
            boolean r0 = r0.containsKey(r6)
            r2 = 1
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r0 = " table is already registered"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C17960vV.A0F(r2, r0)
            r3.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1F6.CE7(X.137, java.lang.String):void");
    }

    public void CE8(String str, String str2, String str3) {
        this.A02.put(str2, str);
        if (this.A03.put(str2, str3) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" trigger is already registered");
            C17960vV.A0F(false, sb.toString());
        }
    }

    public /* synthetic */ void CE9(Pair pair, String str) {
        CE8(str, (String) pair.first, (String) pair.second);
    }

    public static boolean A00(C23141Ev r7, AnonymousClass1F6 r8, String str, Map map, boolean z) {
        map.size();
        boolean z2 = true;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) r8.A05.get(str2);
            C17960vV.A0F(!TextUtils.isEmpty(str3), "Table name is not specified for the index.");
            if (!TextUtils.isEmpty(str3)) {
                if (r8.A01(r7, str3)) {
                    String str4 = (String) entry.getValue();
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("schema-registry/createAsyncIndexes/");
                        sb.append(str2);
                        r7.A0E(str4, sb.toString());
                    } catch (SQLiteException e) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("/Failed to create index '");
                        sb2.append(str2);
                        sb2.append("; ");
                        sb2.append(e.getMessage());
                        Log.e(sb2.toString());
                        if (z) {
                            throw e;
                        }
                    }
                } else {
                    continue;
                }
            }
            z2 = false;
        }
        return z2;
    }

    public void CDt(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            C17960vV.A0F(false, "Malformed index");
        }
        if (this.A00.put(str2, str3) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" index is already registered");
            C17960vV.A0F(false, sb.toString());
        }
        Map map = this.A04;
        List list = (List) map.get(str);
        if (list == null) {
            list = new ArrayList();
            map.put(str, list);
        }
        list.add(str2);
        this.A05.put(str2, str);
    }

    public void CDx(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            C17960vV.A0F(false, "Malformed index");
        }
        if (this.A01.put(str2, str3) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" index is already registered");
            C17960vV.A0F(false, sb.toString());
        }
        Map map = this.A04;
        List list = (List) map.get(str);
        if (list == null) {
            list = new ArrayList();
            map.put(str, list);
        }
        list.add(str2);
        this.A05.put(str2, str);
    }

    public /* synthetic */ void CE6(String str, C25031Mp... r4) {
        CE5(str, Arrays.asList(r4), Collections.emptyList());
    }
}
