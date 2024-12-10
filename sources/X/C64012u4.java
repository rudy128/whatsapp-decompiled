package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2u4  reason: invalid class name and case insensitive filesystem */
public final class C64012u4 {
    public C59692mj A00;
    public final AnonymousClass10b A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public final File A0D(String str) {
        return C17880vN.A0e(((C17930vS) this.A05.get()).A02("account_switching", 0), str);
    }

    public final void A0H(String str) {
        C18070vi.A0d(str, 0);
        C17900vP.A0f("AccountSwitchingDataRepo/saveUniqueDirId/uniqueDirId: ", str, AnonymousClass000.A10());
        AnonymousClass10b r2 = this.A01;
        synchronized (r2) {
            r2.A00 = str;
            AnonymousClass3Gr.A01(C17880vN.A0e(r2.A01.A02("account_switching", 0), "active_account"), str, C26571Sq.A05);
        }
    }

    public final synchronized boolean A0M() {
        boolean z;
        Log.i("AccountSwitchingDataRepo/deleteBackup/");
        z = false;
        try {
            File A0D = A0D("accounts.bak");
            if (A0D.exists()) {
                C17900vP.A0n("AccountSwitchingDataRepo/deleteBackup/deleted backup file: ", AnonymousClass000.A10(), A0D.delete());
                z = true;
            } else {
                Log.i("AccountSwitchingDataRepo/deleteBackup/backup file does not exist");
            }
        } catch (SecurityException e) {
            Log.e("AccountSwitchingDataRepo/deleteBackup/", e);
        }
        return z;
    }

    public final synchronized boolean A0N() {
        String str;
        Log.i("AccountSwitchingDataRepo/restoreBackup/");
        try {
            File A0D = A0D("accounts.bak");
            if (!A0D.exists()) {
                Log.e("AccountSwitchingDataRepo/restoreBackup/backup file does not exist");
            } else {
                File A0D2 = A0D("accounts");
                if (A0D2.exists()) {
                    str = C17900vP.A0D("AccountSwitchingDataRepo/restoreBackup/deleted previous accounts file: ", AnonymousClass000.A10(), A0D2.delete());
                } else {
                    str = "AccountSwitchingDataRepo/restoreBackup/previous accounts file does not exist";
                }
                Log.i(str);
                boolean renameTo = A0D.renameTo(A0D2);
                C17900vP.A0n("AccountSwitchingDataRepo/restoreBackup/restored accounts file from backup file: ", AnonymousClass000.A10(), renameTo);
                return renameTo;
            }
        } catch (SecurityException e) {
            Log.e("AccountSwitchingDataRepo/restoreBackup/", e);
        }
        return false;
    }

    public final boolean A0O(String str) {
        C18070vi.A0d(str, 0);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingDataRepo/removeAccount/");
        C17890vO.A1A(A10, C60322np.A01(str));
        C59692mj A012 = A01(this);
        ArrayList A042 = A04(A012);
        if (!A0A(str, A042)) {
            Log.e("AccountSwitchingDataRepo/removeAccount/Account doesn't exist");
            return false;
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!C18070vi.A18(((C62562rb) next).A07, str)) {
                A13.add(next);
            }
        }
        return A08(A00(A012, A13), this);
    }

    public static final C59692mj A00(C59692mj r8, List list) {
        List list2 = r8.A02;
        List list3 = list;
        if (AnonymousClass000.A1a(list2)) {
            List list4 = r8.A03;
            String str = r8.A01;
            boolean z = r8.A05;
            boolean z2 = r8.A04;
            int i = r8.A00;
            C18070vi.A0d(list, 1);
            return new C59692mj(str, list4, list3, i, z, z2);
        }
        String str2 = r8.A01;
        boolean z3 = r8.A05;
        boolean z4 = r8.A04;
        int i2 = r8.A00;
        C18070vi.A0d(list, 0);
        return new C59692mj(str2, list3, list2, i2, z3, z4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        X.C17900vP.A0X(r2, "AccountSwitchingDataRepo/getAccountSwitchingData/JSONException : ", X.AnonymousClass000.A10());
        r4 = X.C18460wS.A00;
        r2 = new X.C59692mj((java.lang.String) null, r4, r4, 1000, false, false);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C59692mj A01(X.C64012u4 r9) {
        /*
            X.2mj r2 = r9.A00
            if (r2 != 0) goto L_0x00a3
            java.lang.String r2 = "current_max_multi_account_unique_dir_id"
            monitor-enter(r9)     // Catch:{ JSONException -> 0x008a }
            java.lang.String r0 = "accounts"
            java.io.File r1 = r9.A0D(r0)     // Catch:{ IOException -> 0x003b }
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x003b }
            if (r0 != 0) goto L_0x0017
            java.lang.String r1 = "{}"
            goto L_0x0048
        L_0x0017:
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x003b }
            r0.<init>(r1)     // Catch:{ IOException -> 0x003b }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003b }
            r5.<init>(r0)     // Catch:{ IOException -> 0x003b }
            long r3 = r1.length()     // Catch:{ all -> 0x0034 }
            int r0 = (int) r3     // Catch:{ all -> 0x0034 }
            char[] r0 = new char[r0]     // Catch:{ all -> 0x0034 }
            r5.read(r0)     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0034 }
            r1.<init>(r0)     // Catch:{ all -> 0x0034 }
            r5.close()     // Catch:{ IOException -> 0x003b }
            goto L_0x0048
        L_0x0034:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ IOException -> 0x003b }
            throw r0     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "AccountSwitchingDataRepo/readJsonFromFile/IOException : "
            X.C17900vP.A0X(r3, r0, r1)     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = "{}"
        L_0x0048:
            monitor-exit(r9)     // Catch:{ JSONException -> 0x008a }
            org.json.JSONObject r1 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x008a }
            java.lang.String r0 = "inactiveAccounts"
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x008a }
            java.util.ArrayList r4 = A05(r0)     // Catch:{ JSONException -> 0x008a }
            java.lang.String r0 = "allAccounts"
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x008a }
            java.util.ArrayList r5 = A05(r0)     // Catch:{ JSONException -> 0x008a }
            java.lang.String r0 = "paymentsOnboardedLid"
            java.lang.String r3 = r1.optString(r0)     // Catch:{ JSONException -> 0x008a }
            java.lang.String r0 = "shownMeTabMenuItemToolTip"
            boolean r7 = r1.optBoolean(r0)     // Catch:{ JSONException -> 0x008a }
            java.lang.String r0 = "isCompanionModeEnabled"
            boolean r8 = r1.optBoolean(r0)     // Catch:{ JSONException -> 0x008a }
            boolean r0 = r1.has(r2)     // Catch:{ JSONException -> 0x008a }
            if (r0 == 0) goto L_0x0084
            int r6 = r1.optInt(r2)     // Catch:{ JSONException -> 0x008a }
        L_0x007e:
            X.2mj r2 = new X.2mj     // Catch:{ JSONException -> 0x008a }
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x008a }
            goto L_0x00a1
        L_0x0084:
            r6 = 1000(0x3e8, float:1.401E-42)
            goto L_0x007e
        L_0x0087:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ JSONException -> 0x008a }
            throw r0     // Catch:{ JSONException -> 0x008a }
        L_0x008a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingDataRepo/getAccountSwitchingData/JSONException : "
            X.C17900vP.A0X(r2, r0, r1)
            X.0wS r4 = X.C18460wS.A00
            r3 = 0
            r7 = 0
            r6 = 1000(0x3e8, float:1.401E-42)
            X.2mj r2 = new X.2mj
            r5 = r4
            r8 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8)
        L_0x00a1:
            r9.A00 = r2
        L_0x00a3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64012u4.A01(X.2u4):X.2mj");
    }

    public static final C62562rb A02(C59692mj r3, C62562rb r4) {
        Object obj;
        List list = r3.A02;
        boolean A1a = AnonymousClass000.A1a(list);
        if (!AnonymousClass000.A1a(list)) {
            list = r3.A03;
        }
        if (A1a) {
            return A03(r4.A05, list);
        }
        String str = r4.A07;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C18070vi.A18(((C62562rb) obj).A07, str)) {
                break;
            }
        }
        return (C62562rb) obj;
    }

    public static final JSONArray A06(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C62562rb r5 = (C62562rb) it.next();
            C18070vi.A0d(r5, 0);
            JSONObject A15 = C17880vN.A15();
            A15.put("dir_id", r5.A05);
            A15.put("lid", r5.A07);
            A15.put("jid", r5.A06);
            A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r5.A08);
            A15.put("badge_count", r5.A00);
            A15.put("is_logged_in", r5.A0A);
            A15.put("unread_message_count", r5.A01);
            A15.put("last_active_timestamp_ms", r5.A03);
            A15.put("last_buzzed_timestamp_ms", r5.A04);
            A15.put("account_added_timestamp_ms", r5.A02);
            A15.put("is_external_media_location_user_scoped", r5.A09);
            jSONArray.put(C18070vi.A0H(A15));
        }
        return jSONArray;
    }

    public static final boolean A0A(String str, List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C18070vi.A18(((C62562rb) it.next()).A07, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0L() {
        if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(this.A03), 8161) || A0K()) {
            return true;
        }
        return false;
    }

    public C64012u4(AnonymousClass10b r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r2, r3, r1, r4, r5);
        this.A03 = r2;
        this.A04 = r3;
        this.A01 = r1;
        this.A05 = r4;
        this.A02 = r5;
    }

    public static final C62562rb A03(String str, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (A09(((C62562rb) obj).A05, str)) {
                break;
            }
        }
        return (C62562rb) obj;
    }

    public static final ArrayList A04(C59692mj r3) {
        ArrayList A13 = AnonymousClass000.A13();
        List list = r3.A02;
        if (!AnonymousClass000.A1a(list)) {
            list = r3.A03;
        }
        A13.addAll(list);
        return A13;
    }

    public static final ArrayList A05(JSONArray jSONArray) {
        ArrayList A13 = AnonymousClass000.A13();
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray != null) {
            Iterator it = C28851b7.A08(0, jSONArray2.length()).iterator();
            while (it.hasNext()) {
                String string = jSONArray2.getString(((AnonymousClass20T) it).A00());
                C18070vi.A0X(string);
                JSONObject A16 = C17880vN.A16(string);
                A13.add(new C62562rb(A16.optString("dir_id"), C18070vi.A0J("lid", A16), C18070vi.A0J("jid", A16), C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A16), A16.optInt("badge_count"), A16.getInt("unread_message_count"), A16.getLong("last_active_timestamp_ms"), A16.optLong("last_buzzed_timestamp_ms"), A16.optLong("account_added_timestamp_ms"), A16.getBoolean("is_logged_in"), A16.optBoolean("is_external_media_location_user_scoped")));
            }
        }
        return A13;
    }

    public static final void A07(C59692mj r6, C64012u4 r7, C62562rb r8) {
        List<C62562rb> list;
        boolean A18;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingDataRepo/updateAccountInList/");
        C17890vO.A1A(A10, C49842Sd.A00(r8));
        List list2 = r6.A02;
        if (AnonymousClass000.A1a(list2)) {
            list = list2;
        } else {
            list = r6.A03;
        }
        ArrayList A0D = C29351c6.A0D(list);
        for (C62562rb r2 : list) {
            if (AnonymousClass000.A1a(list2)) {
                A18 = A09(r8.A05, r2.A05);
            } else {
                A18 = C18070vi.A18(r8.A07, r2.A07);
            }
            if (A18) {
                r2 = r8;
            }
            A0D.add(r2);
        }
        A08(A00(r6, A0D), r7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A08(X.C59692mj r4, X.C64012u4 r5) {
        /*
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x0087 }
            java.util.List r2 = r4.A03     // Catch:{ JSONException -> 0x0087 }
            boolean r0 = X.AnonymousClass000.A1a(r2)     // Catch:{ JSONException -> 0x0087 }
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = "inactiveAccounts"
            org.json.JSONArray r0 = A06(r2)     // Catch:{ JSONException -> 0x0087 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0087 }
        L_0x0015:
            java.util.List r2 = r4.A02     // Catch:{ JSONException -> 0x0087 }
            boolean r0 = X.AnonymousClass000.A1a(r2)     // Catch:{ JSONException -> 0x0087 }
            if (r0 == 0) goto L_0x0026
            java.lang.String r1 = "allAccounts"
            org.json.JSONArray r0 = A06(r2)     // Catch:{ JSONException -> 0x0087 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0087 }
        L_0x0026:
            java.lang.String r1 = r4.A01     // Catch:{ JSONException -> 0x0087 }
            if (r1 == 0) goto L_0x0035
            int r0 = r1.length()     // Catch:{ JSONException -> 0x0087 }
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "paymentsOnboardedLid"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0087 }
        L_0x0035:
            java.lang.String r1 = "shownMeTabMenuItemToolTip"
            boolean r0 = r4.A05     // Catch:{ JSONException -> 0x0087 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0087 }
            java.lang.String r1 = "isCompanionModeEnabled"
            boolean r0 = r4.A04     // Catch:{ JSONException -> 0x0087 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0087 }
            java.lang.String r1 = "current_max_multi_account_unique_dir_id"
            int r0 = r4.A00     // Catch:{ JSONException -> 0x0087 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0087 }
            java.lang.String r3 = X.C18070vi.A0H(r3)     // Catch:{ JSONException -> 0x0087 }
            monitor-enter(r5)     // Catch:{ JSONException -> 0x0087 }
            java.lang.String r0 = "accounts"
            java.io.File r1 = r5.A0D(r0)     // Catch:{ IOException -> 0x0072 }
            r1.getAbsolutePath()     // Catch:{ IOException -> 0x0072 }
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ IOException -> 0x0072 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0072 }
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0072 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0072 }
            r2.write(r3)     // Catch:{ all -> 0x006b }
            r2.close()     // Catch:{ IOException -> 0x0072 }
            r0 = 1
            goto L_0x007d
        L_0x006b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x0072 }
            throw r0     // Catch:{ IOException -> 0x0072 }
        L_0x0072:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "AccountSwitchingDataRepo/writeJsonToFile/IOException : "
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ all -> 0x0084 }
            r0 = 0
        L_0x007d:
            monitor-exit(r5)     // Catch:{ JSONException -> 0x0087 }
            if (r0 == 0) goto L_0x0091
            r5.A00 = r4
            r0 = 1
            return r0
        L_0x0084:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ JSONException -> 0x0087 }
            throw r0     // Catch:{ JSONException -> 0x0087 }
        L_0x0087:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingDataRepo/setAccountSwitchingData/JSONException : "
            X.C17900vP.A0X(r2, r0, r1)
        L_0x0091:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64012u4.A08(X.2mj, X.2u4):boolean");
    }

    public static final boolean A09(String str, String str2) {
        if (C18070vi.A18(str, str2)) {
            return true;
        }
        if (str != null && str.length() != 0) {
            return false;
        }
        if (str2 == null || str2.length() == 0) {
            return true;
        }
        return false;
    }

    public final C62562rb A0B() {
        Object next;
        List A0F = A0F();
        if (A0F.isEmpty()) {
            Log.e("AccountSwitchingDataRepo/getLastActiveAccount/No inactive accounts");
            return null;
        }
        Iterator it = A0F.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                long j = ((C62562rb) next).A03;
                do {
                    Object next2 = it.next();
                    long j2 = ((C62562rb) next2).A03;
                    if (j < j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it.hasNext());
            }
        }
        C62562rb r7 = (C62562rb) next;
        if (r7 != null) {
            return r7;
        }
        Log.w("AccountSwitchingDataRepo/getLastActiveAccount/cannot find last active account");
        ((AnonymousClass190) this.A04.get()).A0G("AccountSwitchingDataRepo/getLastActiveAccount/cannot find last active account", (String) null, false);
        return (C62562rb) C29431cG.A0c(A0F);
    }

    public final C62562rb A0C(String str) {
        C17900vP.A0f("AccountSwitchingDataRepo/getAccountByDirId/dirId=", str, AnonymousClass000.A10());
        C62562rb A032 = A03(str, A01(this).A02);
        if (A032 != null) {
            return A032;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingDataRepo/getAccountByDirId(");
        A10.append(str);
        C17890vO.A1A(A10, ")/Account doesn't exist");
        return null;
    }

    public final String A0E() {
        C59692mj A012 = A01(this);
        int i = A012.A00 + 1;
        C17900vP.A0j("AccountSwitchingDataRepo/generateUniqueDirIdForActiveUser/uniqueDirId: ", AnonymousClass000.A10(), i);
        if (A08(new C59692mj(A012.A01, A012.A03, A012.A02, i, A012.A05, A012.A04), this)) {
            return String.valueOf(i);
        }
        throw AnonymousClass000.A0n("Unable to generate and save uniqueDirId");
    }

    public final List A0F() {
        boolean A0K = A0K();
        C59692mj A012 = A01(this);
        if (!A0K) {
            return A012.A03;
        }
        List list = A012.A02;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (!A09(((C62562rb) next).A05, this.A01.A00())) {
                A13.add(next);
            }
        }
        return A13;
    }

    public final void A0G(C62562rb r5) {
        StringBuilder A0K = C18070vi.A0K(r5);
        A0K.append("AccountSwitchingDataRepo/addAccount/");
        C17890vO.A1A(A0K, C49842Sd.A00(r5));
        C59692mj A012 = A01(this);
        List list = A012.A02;
        boolean A1a = AnonymousClass000.A1a(list);
        if (!AnonymousClass000.A1a(list)) {
            list = A012.A03;
        }
        if (!A1a ? !A0A(r5.A07, list) : A03(r5.A05, list) == null) {
            ArrayList A042 = A04(A012);
            A042.add(r5);
            A08(A00(A012, A042), this);
            return;
        }
        Log.e("AccountSwitchingDataRepo/addAccount/Account already exists");
    }

    public final void A0I(String str) {
        String str2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingDataRepo/setPaymentsOnboardedLid/");
        String str3 = str;
        if (str != null) {
            str2 = C60322np.A01(str);
        } else {
            str2 = null;
        }
        C17890vO.A1A(A10, str2);
        C59692mj A012 = A01(this);
        A08(new C59692mj(str3, A012.A03, A012.A02, A012.A00, A012.A05, A012.A04), this);
    }

    public final void A0J(List list) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingDataRepo/migrate/accounts size=");
        List list2 = list;
        C17900vP.A0o(A10, list.size());
        C59692mj A012 = A01(this);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("AccountSwitchingDataRepo/migrate/account:");
            C17890vO.A1A(A102, C49842Sd.A00((C62562rb) it.next()));
        }
        C18460wS r6 = C18460wS.A00;
        String str = A012.A01;
        boolean z = A012.A05;
        boolean z2 = A012.A04;
        int i = A012.A00;
        C18070vi.A0d(r6, 0);
        A08(new C59692mj(str, r6, list2, i, z, z2), this);
    }

    public final boolean A0K() {
        return AnonymousClass000.A1a(A01(this).A02);
    }
}
