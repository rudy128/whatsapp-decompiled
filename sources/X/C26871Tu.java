package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Tu  reason: invalid class name and case insensitive filesystem */
public class C26871Tu {
    public static final String[] A0D = {"com.google", "com.microsoft.office.outlook.USER_ACCOUNT"};
    public static final String[] A0E = {"com.google.android.apps.tachyon"};
    public final AnonymousClass190 A00;
    public final C26861Tt A01;
    public final C26851Ts A02;
    public final AnonymousClass11C A03;
    public final AnonymousClass118 A04;
    public final C219217x A05;
    public final C19830z4 A06;
    public final C18030ve A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;

    public static C63562tJ A00(List list) {
        C63562tJ r4 = (C63562tJ) list.get(0);
        String[] strArr = A0D;
        int i = 2;
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C63562tJ r3 = (C63562tJ) it.next();
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (strArr[i2].equals(r3.A02)) {
                    z = true;
                    r4 = r3;
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (!z) {
            r4 = (C63562tJ) list.get(0);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C63562tJ r2 = (C63562tJ) it2.next();
                if (!A0E[0].equals(r2.A02)) {
                    return r2;
                }
            }
        }
        return r4;
    }

    public static AnonymousClass1E7 A01(C63562tJ r11, AnonymousClass1E7 r12) {
        AnonymousClass1E7 r2 = r12;
        if (r12 == null) {
            String str = r11.A05;
            long j = r11.A01;
            r2 = new AnonymousClass1E7((AnonymousClass1BI) null, str, r11.A03, r11.A04, r11.A00, j, false);
        }
        r2.A0M(-1);
        r2.A0Y = r11.A06;
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e7, code lost:
        if (android.text.TextUtils.equals(r6.A0X, r5.A04) == false) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(X.C55232fR r4, X.C63562tJ r5, X.AnonymousClass1E7 r6, boolean r7) {
        /*
            long r0 = r5.A01
            java.lang.String r3 = r5.A05
            X.2lf r2 = new X.2lf
            r2.<init>(r0, r3)
            X.2lf r0 = r6.A0H
            r3 = 1
            if (r0 == 0) goto L_0x00ec
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00ec
            r2 = 0
        L_0x0015:
            java.lang.String r1 = r5.A03
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = r6.A0K()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x002a
            r6.A0R = r1
            r2 = 1
        L_0x002a:
            java.lang.String r1 = r5.A06
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = r6.A0Y
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x003d
            r6.A0Y = r1
            r2 = 1
        L_0x003d:
            if (r4 == 0) goto L_0x006d
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0056
            java.lang.String r1 = r6.A0T
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = r4.A02
            r6.A0T = r0
            r2 = 1
        L_0x0056:
            java.lang.String r0 = r4.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x006d
            java.lang.String r1 = r6.A0S
            java.lang.String r0 = r4.A01
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = r4.A01
            r6.A0S = r0
            r2 = 1
        L_0x006d:
            java.lang.Integer r0 = r6.A0N
            int r0 = r0.intValue()
            int r1 = r5.A00
            if (r0 == r1) goto L_0x00dd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.A0N = r0
            if (r1 == 0) goto L_0x00e9
            r0 = 0
        L_0x0080:
            r6.A0X = r0
            r2 = 1
        L_0x0083:
            if (r4 == 0) goto L_0x00ca
            java.lang.String r0 = r4.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x009c
            java.lang.String r1 = r6.A0W
            java.lang.String r0 = r4.A03
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = r4.A03
            r6.A0W = r0
            r2 = 1
        L_0x009c:
            java.lang.String r0 = r4.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b3
            java.lang.String r1 = r6.A0Q
            java.lang.String r0 = r4.A00
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = r4.A00
            r6.A0Q = r0
            r2 = 1
        L_0x00b3:
            java.lang.String r0 = r4.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r1 = r6.A0b
            java.lang.String r0 = r4.A04
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = r4.A04
            r6.A0b = r0
            r2 = 1
        L_0x00ca:
            boolean r1 = r6.A0s
            boolean r0 = r5.A07
            if (r1 == r0) goto L_0x00d3
            r6.A0s = r0
            r2 = 1
        L_0x00d3:
            if (r7 == 0) goto L_0x00f1
            int r0 = r6.A09
            if (r0 == 0) goto L_0x00f1
            r0 = 0
            r6.A09 = r0
            return r3
        L_0x00dd:
            if (r0 != 0) goto L_0x0083
            java.lang.String r1 = r6.A0X
            java.lang.String r0 = r5.A04
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0083
        L_0x00e9:
            java.lang.String r0 = r5.A04
            goto L_0x0080
        L_0x00ec:
            r6.A0H = r2
            r2 = 1
            goto L_0x0015
        L_0x00f1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26871Tu.A03(X.2fR, X.2tJ, X.1E7, boolean):boolean");
    }

    public static boolean A04(C26871Tu r4) {
        if (((AnonymousClass1UN) r4.A0B.get()).A08()) {
            boolean z = false;
            if (r4.A05.A03("android.permission.READ_CONTACTS") == 0) {
                z = true;
            }
            boolean A2J = r4.A06.A2J();
            if (z || A2J) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A05(C26871Tu r3) {
        if (!((AnonymousClass1UN) r3.A0B.get()).A08() || r3.A05.A03("android.permission.READ_CONTACTS") == 0) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: X.2fR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: X.2fR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: X.2fR} */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02ee, code lost:
        if (r3 != null) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03c9, code lost:
        if (r1 != false) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03da, code lost:
        if (r2.contains((byte) 2) != false) goto L_0x03dc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x030e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0416  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C58152kE A06(java.lang.String r33, java.util.List r34, java.util.List r35, java.util.List r36) {
        /*
            r32 = this;
            r0 = r32
            X.118 r9 = r0.A04
            X.11C r12 = r0.A03
            X.17x r2 = r0.A05
            X.0z4 r8 = r0.A06
            X.1Tt r1 = r0.A01
            android.content.SharedPreferences r5 = X.C26861Tt.A00(r1)
            java.lang.String r1 = "last_contact_full_sync"
            r3 = -1
            long r14 = r5.getLong(r1, r3)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.lang.String r1 = "android.permission.READ_CONTACTS"
            int r3 = r2.A02(r1)
            if (r3 == 0) goto L_0x00f2
            java.lang.String r3 = "phonebook/getPhones/permission_denied"
            com.whatsapp.util.Log.i((java.lang.String) r3)
        L_0x002a:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.lang.String r5 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "lge"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0049
            java.lang.String r4 = "phonebook/get_sim_card_phones/lge"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            X.11B r13 = r12.A0O()
            if (r13 != 0) goto L_0x0082
            java.lang.String r4 = "phonebook/get-sim-card-phones cr=null"
            com.whatsapp.util.Log.e((java.lang.String) r4)
        L_0x0049:
            r7.addAll(r3)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Iterator r9 = r7.iterator()
        L_0x0055:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0175
            java.lang.Object r7 = r9.next()
            X.2tJ r7 = (X.C63562tJ) r7
            java.lang.String r5 = r7.A05
            java.lang.String r3 = r7.A03
            X.0yx r4 = new X.0yx
            r4.<init>(r5, r3)
            boolean r3 = r6.containsKey(r4)
            if (r3 != 0) goto L_0x0078
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6.put(r4, r3)
        L_0x0078:
            java.lang.Object r3 = r6.get(r4)
            java.util.List r3 = (java.util.List) r3
            r3.add(r7)
            goto L_0x0055
        L_0x0082:
            java.lang.String r4 = "content://icc/adn"
            android.net.Uri r14 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x00ea }
            r15 = 0
            r16 = r15
            r17 = r15
            r18 = r15
            android.database.Cursor r6 = r13.A03(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x00ea }
            if (r6 != 0) goto L_0x009b
            java.lang.String r4 = "phonebook/get-sim-card-phones null cursor returned from sim card phones query"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ all -> 0x00de }
            goto L_0x0049
        L_0x009b:
            java.lang.String r4 = "name"
            int r5 = r6.getColumnIndex(r4)     // Catch:{ all -> 0x00de }
            java.lang.String r4 = "number"
            int r4 = r6.getColumnIndex(r4)     // Catch:{ all -> 0x00de }
        L_0x00a7:
            boolean r10 = r6.moveToNext()     // Catch:{ all -> 0x00de }
            if (r10 == 0) goto L_0x00d9
            java.lang.String r14 = r6.getString(r5)     // Catch:{ all -> 0x00de }
            java.lang.String r10 = r6.getString(r4)     // Catch:{ all -> 0x00de }
            if (r10 == 0) goto L_0x00a7
            java.lang.String r15 = android.telephony.PhoneNumberUtils.stripSeparators(r10)     // Catch:{ all -> 0x00de }
            boolean r10 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r15)     // Catch:{ all -> 0x00de }
            if (r10 == 0) goto L_0x00a7
            android.content.Context r11 = r9.A00     // Catch:{ all -> 0x00de }
            r10 = 2131888859(0x7f120adb, float:1.9412365E38)
            java.lang.String r16 = r11.getString(r10)     // Catch:{ all -> 0x00de }
            r19 = 0
            r20 = -2
            X.2tJ r13 = new X.2tJ     // Catch:{ all -> 0x00de }
            r22 = r19
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r22)     // Catch:{ all -> 0x00de }
            r3.add(r13)     // Catch:{ all -> 0x00de }
            goto L_0x00a7
        L_0x00d9:
            r6.close()     // Catch:{ Exception -> 0x00ea }
            goto L_0x0049
        L_0x00de:
            r5 = move-exception
            if (r6 == 0) goto L_0x00e9
            r6.close()     // Catch:{ all -> 0x00e5 }
            goto L_0x00e9
        L_0x00e5:
            r4 = move-exception
            X.AnonymousClass0DT.A00(r5, r4)     // Catch:{ Exception -> 0x00ea }
        L_0x00e9:
            throw r5     // Catch:{ Exception -> 0x00ea }
        L_0x00ea:
            r5 = move-exception
            java.lang.String r4 = "exception while retrieving sim card contacts, will continue without them "
            com.whatsapp.util.Log.w(r4, r5)
            goto L_0x0049
        L_0x00f2:
            java.lang.String r3 = "phonebook/get_phones/"
            android.database.Cursor r5 = X.C63562tJ.A00(r12, r3)     // Catch:{ Exception -> 0x09ed }
            r4 = 0
            if (r5 != 0) goto L_0x011d
            java.lang.String r3 = "phonebook/Cursor is null"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x09e1 }
            X.00H r3 = r8.A00     // Catch:{ all -> 0x09e1 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x09e1 }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ all -> 0x09e1 }
            java.lang.String r6 = "phonebook_null_cursor_count"
            int r13 = r3.getInt(r6, r4)     // Catch:{ all -> 0x09e1 }
            r10 = 0
            int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r3 >= 0) goto L_0x0115
            r4 = 1
        L_0x0115:
            r3 = 10
            if (r13 >= r3) goto L_0x002a
            if (r4 != 0) goto L_0x002a
            goto L_0x09d3
        L_0x011d:
            boolean r3 = r5.moveToNext()     // Catch:{ all -> 0x09e1 }
            if (r3 == 0) goto L_0x0163
            r3 = 2
            java.lang.String r3 = r5.getString(r3)     // Catch:{ all -> 0x09e1 }
            java.lang.String r15 = android.telephony.PhoneNumberUtils.stripSeparators(r3)     // Catch:{ all -> 0x09e1 }
            boolean r3 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r15)     // Catch:{ all -> 0x09e1 }
            if (r3 == 0) goto L_0x011d
            long r20 = r5.getLong(r4)     // Catch:{ all -> 0x09e1 }
            r6 = 1
            java.lang.String r14 = r5.getString(r6)     // Catch:{ all -> 0x09e1 }
            r3 = 3
            int r19 = r5.getInt(r3)     // Catch:{ all -> 0x09e1 }
            r3 = 4
            java.lang.String r16 = r5.getString(r3)     // Catch:{ all -> 0x09e1 }
            r3 = 5
            java.lang.String r17 = r5.getString(r3)     // Catch:{ all -> 0x09e1 }
            r3 = 6
            java.lang.String r18 = r5.getString(r3)     // Catch:{ all -> 0x09e1 }
            r3 = 7
            int r3 = r5.getInt(r3)     // Catch:{ all -> 0x09e1 }
            r22 = 0
            if (r3 != r6) goto L_0x015a
            r22 = 1
        L_0x015a:
            X.2tJ r13 = new X.2tJ     // Catch:{ all -> 0x09e1 }
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r22)     // Catch:{ all -> 0x09e1 }
            r7.add(r13)     // Catch:{ all -> 0x09e1 }
            goto L_0x011d
        L_0x0163:
            r5.close()     // Catch:{ Exception -> 0x09ed }
            android.content.SharedPreferences$Editor r5 = X.C19830z4.A00(r8)
            java.lang.String r3 = "phonebook_null_cursor_count"
            android.content.SharedPreferences$Editor r3 = r5.putInt(r3, r4)
            r3.apply()
            goto L_0x002a
        L_0x0175:
            X.2kE r7 = new X.2kE
            r7.<init>()
            X.00H r3 = r0.A0B
            r31 = r3
            java.lang.Object r3 = r31.get()
            X.1UN r3 = (X.AnonymousClass1UN) r3
            boolean r5 = r3.A08()
            if (r5 == 0) goto L_0x01d8
            int r4 = r2.A03(r1)
            r3 = -1
            if (r4 != r3) goto L_0x01d8
            boolean r3 = r8.A2J()
            if (r3 == 0) goto L_0x01d8
            java.util.Iterator r15 = r34.iterator()
        L_0x019b:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x01d8
            java.lang.Object r13 = r15.next()
            X.1E7 r13 = (X.AnonymousClass1E7) r13
            int r3 = r13.A09
            r14 = 0
            if (r3 != 0) goto L_0x01af
            r14 = 1
            r13.A09 = r14
        L_0x01af:
            X.00H r3 = r8.A00
            java.lang.Object r9 = r3.get()
            android.content.SharedPreferences r9 = (android.content.SharedPreferences) r9
            java.lang.String r4 = "native_contacts_delete_contacts"
            r3 = 0
            boolean r3 = r9.getBoolean(r4, r3)
            if (r3 == 0) goto L_0x01d5
            X.2lf r3 = r13.A0H
            if (r3 == 0) goto L_0x01d5
            long r3 = r3.A00
            r10 = -5
            int r9 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x01d5
            r3 = 2
            r13.A01 = r3
        L_0x01cf:
            java.util.List r3 = r7.A0C
            r3.add(r13)
            goto L_0x019b
        L_0x01d5:
            if (r14 == 0) goto L_0x019b
            goto L_0x01cf
        L_0x01d8:
            java.util.HashMap r24 = new java.util.HashMap
            r24.<init>()
            java.util.HashMap r16 = new java.util.HashMap
            r16.<init>()
            java.util.Iterator r10 = r34.iterator()
        L_0x01e6:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0215
            java.lang.Object r9 = r10.next()
            X.1E7 r9 = (X.AnonymousClass1E7) r9
            X.1BI r3 = r9.A0J
            boolean r3 = X.C22971Dz.A0T(r3)
            if (r3 != 0) goto L_0x01e6
            X.2lf r3 = r9.A0H
            X.C17960vV.A07(r3)
            java.lang.String r8 = r3.A01
            java.lang.String r3 = r9.A0K()
            X.0yx r4 = new X.0yx
            r4.<init>(r8, r3)
            r3 = r24
            r3.put(r4, r9)
            r3 = r16
            r3.put(r8, r9)
            goto L_0x01e6
        L_0x0215:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            int r1 = r2.A02(r1)
            if (r1 == 0) goto L_0x0475
            java.lang.String r1 = "returning empty name map because contact permissions are denied"
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x0225:
            X.1Ts r1 = r0.A02
            java.util.HashSet r23 = r1.A00()
            r25 = r36
            boolean r1 = r25.isEmpty()
            if (r1 == 0) goto L_0x046d
            r10 = 0
        L_0x0234:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            boolean r22 = A05(r0)
            X.0ve r3 = r0.A07
            r1 = 8680(0x21e8, float:1.2163E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r21 = X.C18020vd.A05(r2, r3, r1)
            r1 = 8434(0x20f2, float:1.1819E-41)
            boolean r20 = X.C18020vd.A05(r2, r3, r1)
            X.00H r1 = r0.A08
            java.lang.Object r1 = r1.get()
            X.2hp r1 = (X.C56662hp) r1
            java.util.HashMap r19 = r1.A00()
            java.util.Set r1 = r6.entrySet()
            java.util.Iterator r18 = r1.iterator()
        L_0x0266:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x05cb
            java.lang.Object r12 = r18.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r1 = r12.getValue()
            java.util.List r1 = (java.util.List) r1
            X.2tJ r11 = A00(r1)
            java.lang.Object r2 = r12.getKey()
            r1 = r24
            java.lang.Object r3 = r1.get(r2)
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            if (r5 == 0) goto L_0x02ee
            if (r3 != 0) goto L_0x02f0
            java.lang.String r15 = r11.A05
            java.lang.String r14 = r11.A03
            java.util.Iterator r17 = r34.iterator()
        L_0x0294:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x033b
            java.lang.Object r3 = r17.next()
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            int r1 = r3.A09
            if (r1 == 0) goto L_0x0294
            int r2 = r3.A01
            r1 = 2
            if (r2 == r1) goto L_0x0294
            X.1BI r1 = r3.A0J
            java.lang.String r13 = X.AnonymousClass17K.A03(r1)
            X.00H r1 = r0.A0C     // Catch:{ 1Mf -> 0x02d6 }
            java.lang.Object r2 = r1.get()     // Catch:{ 1Mf -> 0x02d6 }
            X.1yi r2 = (X.C42771yi) r2     // Catch:{ 1Mf -> 0x02d6 }
            java.lang.String r1 = ""
            X.1ym r1 = r2.A0H(r13, r1)     // Catch:{ 1Mf -> 0x02d6 }
            if (r14 == 0) goto L_0x0294
            int r1 = r1.countryCode_
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r1 = X.C63942tw.A06(r15, r13, r1)
            if (r1 == 0) goto L_0x0294
            java.lang.String r1 = r3.A0K()
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto L_0x0294
            goto L_0x02f0
        L_0x02d6:
            r3 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "Couldn't parse the contact number: "
            r2.append(r1)
            java.lang.String r1 = r3.message
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0294
        L_0x02ee:
            if (r3 == 0) goto L_0x033b
        L_0x02f0:
            boolean r1 = r25.isEmpty()
            if (r1 != 0) goto L_0x0312
            boolean r1 = r3.A10
            if (r1 != 0) goto L_0x0312
            X.1BI r2 = r3.A0J
            X.C17960vV.A07(r2)
            r1 = r25
            boolean r1 = X.C63412t2.A02(r2, r10, r1)
            if (r1 == 0) goto L_0x0312
            java.util.List r1 = r7.A07
        L_0x0309:
            r1.add(r3)
            if (r21 != 0) goto L_0x037a
            if (r20 != 0) goto L_0x037a
            goto L_0x0266
        L_0x0312:
            if (r22 == 0) goto L_0x0338
            long r1 = r11.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r9.get(r1)
            X.2fR r1 = (X.C55232fR) r1
            boolean r1 = A03(r1, r11, r3, r5)
            if (r1 == 0) goto L_0x0338
            java.lang.Object r1 = r31.get()
            X.1UN r1 = (X.AnonymousClass1UN) r1
            boolean r1 = r1.A09()
            if (r1 == 0) goto L_0x0335
            r1 = 0
            r3.A01 = r1
        L_0x0335:
            java.util.List r1 = r7.A0C
            goto L_0x0309
        L_0x0338:
            java.util.List r1 = r7.A0B
            goto L_0x0309
        L_0x033b:
            java.lang.Object r1 = r12.getKey()
            X.0yx r1 = (X.C19760yx) r1
            java.lang.Object r2 = r1.A00
            r1 = r16
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x0378
            java.lang.Object r1 = r12.getKey()
            X.0yx r1 = (X.C19760yx) r1
            java.lang.Object r2 = r1.A00
            r1 = r16
            java.lang.Object r1 = r1.get(r2)
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            if (r1 == 0) goto L_0x0378
            X.1E7 r13 = r1.A05()
        L_0x0361:
            X.1E7 r3 = A01(r11, r13)
            java.lang.Object r1 = r12.getKey()
            X.0yx r1 = (X.C19760yx) r1
            java.lang.Object r2 = r1.A00
            r1 = r23
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0416
            java.util.List r1 = r7.A0B
            goto L_0x03e3
        L_0x0378:
            r13 = 0
            goto L_0x0361
        L_0x037a:
            X.2lf r1 = r3.A0H
            if (r1 != 0) goto L_0x0412
            r1 = 0
        L_0x0380:
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            r1 = r19
            java.lang.Object r2 = r1.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x03e1
            if (r20 == 0) goto L_0x03ec
            boolean r1 = r3.A0q
            if (r1 == 0) goto L_0x03ea
            r1 = 3
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x03aa
            r1 = 4
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x03ea
        L_0x03aa:
            r11 = 1
        L_0x03ab:
            boolean r1 = r3.A0q
            if (r1 != 0) goto L_0x03e8
            r1 = 3
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x03c5
            r1 = 4
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x03e8
        L_0x03c5:
            r1 = 1
        L_0x03c6:
            if (r11 != 0) goto L_0x03cb
            r11 = 0
            if (r1 == 0) goto L_0x03cc
        L_0x03cb:
            r11 = 1
        L_0x03cc:
            boolean r1 = r3.A10
            if (r1 == 0) goto L_0x03dc
            r1 = 2
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            boolean r2 = r2.contains(r1)
            r1 = 1
            if (r2 == 0) goto L_0x03dd
        L_0x03dc:
            r1 = 0
        L_0x03dd:
            if (r11 != 0) goto L_0x03e1
            if (r1 == 0) goto L_0x0266
        L_0x03e1:
            java.util.List r1 = r7.A0A
        L_0x03e3:
            r1.add(r3)
            goto L_0x0266
        L_0x03e8:
            r1 = 0
            goto L_0x03c6
        L_0x03ea:
            r11 = 0
            goto L_0x03ab
        L_0x03ec:
            boolean r1 = r3.A10
            if (r1 == 0) goto L_0x0266
            r1 = 4
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x03e1
            r1 = 3
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x03e1
            r1 = 2
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x0266
            goto L_0x03e1
        L_0x0412:
            long r1 = r1.A00
            goto L_0x0380
        L_0x0416:
            if (r22 == 0) goto L_0x0266
            long r1 = r11.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r9.get(r1)
            X.2fR r1 = (X.C55232fR) r1
            A03(r1, r11, r3, r5)
            java.lang.Object r1 = r31.get()
            X.1UN r1 = (X.AnonymousClass1UN) r1
            boolean r1 = r1.A09()
            if (r1 == 0) goto L_0x0436
            r1 = 0
            r3.A01 = r1
        L_0x0436:
            java.util.List r1 = r7.A05
            r1.add(r3)
            if (r13 != 0) goto L_0x044f
            java.util.List r1 = r7.A06
            r1.add(r3)
            java.lang.Object r1 = r12.getKey()
            X.0yx r1 = (X.C19760yx) r1
            java.lang.Object r1 = r1.A00
            r4.add(r1)
            goto L_0x0266
        L_0x044f:
            java.lang.Object r1 = r31.get()
            X.1UN r1 = (X.AnonymousClass1UN) r1
            boolean r1 = r1.A08()
            if (r1 == 0) goto L_0x0460
            java.util.List r1 = r7.A06
            r1.add(r3)
        L_0x0460:
            java.lang.Object r1 = r12.getKey()
            X.0yx r1 = (X.C19760yx) r1
            java.lang.Object r1 = r1.A00
            r8.add(r1)
            goto L_0x0266
        L_0x046d:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r10 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x09c0 }
            goto L_0x0234
        L_0x0475:
            r1 = 6
            java.lang.String[] r11 = new java.lang.String[r1]
            r18 = 0
            java.lang.String r10 = "raw_contact_id"
            r11[r18] = r10
            r17 = 1
            java.lang.String r8 = "mimetype"
            r11[r17] = r8
            r15 = 2
            java.lang.String r4 = "data1"
            r11[r15] = r4
            r13 = 3
            java.lang.String r3 = "data2"
            r11[r13] = r3
            r1 = 4
            java.lang.String r2 = "data3"
            r11[r1] = r2
            r1 = 5
            java.lang.String r14 = "data4"
            r11[r1] = r14
            java.lang.String[] r1 = new java.lang.String[r13]
            java.lang.String r20 = "vnd.android.cursor.item/name"
            r1[r18] = r20
            java.lang.String r19 = "vnd.android.cursor.item/nickname"
            r1[r17] = r19
            java.lang.String r18 = "vnd.android.cursor.item/organization"
            r1[r15] = r18
            X.11B r25 = r12.A0O()
            android.net.Uri r26 = android.provider.ContactsContract.Data.CONTENT_URI
            java.lang.String r28 = "mimetype IN (?,?,?)"
            r30 = 0
            r27 = r11
            r29 = r1
            android.database.Cursor r11 = r25.A03(r26, r27, r28, r29, r30)
            if (r11 != 0) goto L_0x04c4
            java.lang.String r1 = "null cursor returned from structured name query"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x09c7 }
            goto L_0x0225
        L_0x04c4:
            int r10 = r11.getColumnIndex(r10)     // Catch:{ all -> 0x09c7 }
            r12 = -1
            if (r10 != r12) goto L_0x04d2
            java.lang.String r1 = "invalid column index for the raw contact id"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x09c7 }
            goto L_0x05c6
        L_0x04d2:
            int r8 = r11.getColumnIndex(r8)     // Catch:{ all -> 0x09c7 }
            if (r8 != r12) goto L_0x04df
            java.lang.String r1 = "invalid column index for the mimetype"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x09c7 }
            goto L_0x05c6
        L_0x04df:
            int r17 = r11.getColumnIndex(r3)     // Catch:{ all -> 0x09c7 }
            r1 = r17
            if (r1 != r12) goto L_0x04ee
            java.lang.String r1 = "invalid column index for the given name"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x09c7 }
            goto L_0x05c6
        L_0x04ee:
            int r13 = r11.getColumnIndex(r2)     // Catch:{ all -> 0x09c7 }
            if (r13 != r12) goto L_0x04fb
            java.lang.String r1 = "invalid column index for the family name"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x09c7 }
            goto L_0x05c6
        L_0x04fb:
            int r3 = r11.getColumnIndex(r4)     // Catch:{ all -> 0x09c7 }
            if (r3 != r12) goto L_0x0508
            java.lang.String r1 = "invalid column index for the nickname"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x09c7 }
            goto L_0x05c6
        L_0x0508:
            int r4 = r11.getColumnIndex(r4)     // Catch:{ all -> 0x09c7 }
            if (r4 != r12) goto L_0x0515
            java.lang.String r1 = "invalid column index for the company"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x09c7 }
            goto L_0x05c6
        L_0x0515:
            int r2 = r11.getColumnIndex(r14)     // Catch:{ all -> 0x09c7 }
            if (r2 != r12) goto L_0x0522
            java.lang.String r1 = "invalid column index for the title"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x09c7 }
            goto L_0x05c6
        L_0x0522:
            boolean r1 = r11.moveToNext()     // Catch:{ all -> 0x09c7 }
            if (r1 == 0) goto L_0x05c6
            boolean r1 = r11.isNull(r10)     // Catch:{ all -> 0x09c7 }
            if (r1 == 0) goto L_0x0534
            java.lang.String r1 = "null raw contact id for record; skipping"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x09c7 }
            goto L_0x0522
        L_0x0534:
            boolean r1 = r11.isNull(r8)     // Catch:{ all -> 0x09c7 }
            if (r1 == 0) goto L_0x0540
            java.lang.String r1 = "null mimetype for record; skipping"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x09c7 }
            goto L_0x0522
        L_0x0540:
            long r14 = r11.getLong(r10)     // Catch:{ all -> 0x09c7 }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x09c7 }
            java.lang.Object r12 = r9.get(r1)     // Catch:{ all -> 0x09c7 }
            X.2fR r12 = (X.C55232fR) r12     // Catch:{ all -> 0x09c7 }
            if (r12 != 0) goto L_0x0558
            X.2fR r12 = new X.2fR     // Catch:{ all -> 0x09c7 }
            r12.<init>()     // Catch:{ all -> 0x09c7 }
            r9.put(r1, r12)     // Catch:{ all -> 0x09c7 }
        L_0x0558:
            java.lang.String r14 = r11.getString(r8)     // Catch:{ all -> 0x09c7 }
            if (r14 != 0) goto L_0x0564
            java.lang.String r1 = "mimetype was returned as null even though cursor said it wasn't null; skipping"
        L_0x0560:
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x09c7 }
            goto L_0x0522
        L_0x0564:
            int r15 = r14.hashCode()     // Catch:{ all -> 0x09c7 }
            r1 = -1079224304(0xffffffffbfac5810, float:-1.3464375)
            if (r15 == r1) goto L_0x059b
            r1 = 689862072(0x291e75b8, float:3.5185152E-14)
            if (r15 == r1) goto L_0x0586
            r1 = 2034973555(0x794b3b73, float:6.5952627E34)
            if (r15 != r1) goto L_0x05b3
            r1 = r19
            boolean r1 = r14.equals(r1)     // Catch:{ all -> 0x09c7 }
            if (r1 == 0) goto L_0x05b3
            java.lang.String r1 = r11.getString(r3)     // Catch:{ all -> 0x09c7 }
            r12.A03 = r1     // Catch:{ all -> 0x09c7 }
            goto L_0x0522
        L_0x0586:
            r1 = r18
            boolean r1 = r14.equals(r1)     // Catch:{ all -> 0x09c7 }
            if (r1 == 0) goto L_0x05b3
            java.lang.String r1 = r11.getString(r4)     // Catch:{ all -> 0x09c7 }
            r12.A00 = r1     // Catch:{ all -> 0x09c7 }
            java.lang.String r1 = r11.getString(r2)     // Catch:{ all -> 0x09c7 }
            r12.A04 = r1     // Catch:{ all -> 0x09c7 }
            goto L_0x0522
        L_0x059b:
            r1 = r20
            boolean r1 = r14.equals(r1)     // Catch:{ all -> 0x09c7 }
            if (r1 == 0) goto L_0x05b3
            r1 = r17
            java.lang.String r1 = r11.getString(r1)     // Catch:{ all -> 0x09c7 }
            r12.A02 = r1     // Catch:{ all -> 0x09c7 }
            java.lang.String r1 = r11.getString(r13)     // Catch:{ all -> 0x09c7 }
            r12.A01 = r1     // Catch:{ all -> 0x09c7 }
            goto L_0x0522
        L_0x05b3:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x09c7 }
            r12.<init>()     // Catch:{ all -> 0x09c7 }
            java.lang.String r1 = "unrecognized mimetype; skipping; mimetype="
            r12.append(r1)     // Catch:{ all -> 0x09c7 }
            r12.append(r14)     // Catch:{ all -> 0x09c7 }
            java.lang.String r1 = r12.toString()     // Catch:{ all -> 0x09c7 }
            goto L_0x0560
        L_0x05c6:
            r11.close()
            goto L_0x0225
        L_0x05cb:
            X.0yx r1 = new X.0yx
            r1.<init>(r8, r4)
            java.lang.Object r8 = r1.A00
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Object r4 = r1.A01
            java.util.Set r4 = (java.util.Set) r4
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            boolean r10 = A05(r0)
            boolean r1 = A04(r0)
            if (r1 == 0) goto L_0x0614
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Set r1 = r24.entrySet()
            java.util.Iterator r12 = r1.iterator()
        L_0x05f4:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0645
            java.lang.Object r3 = r12.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            A02(r7, r3, r11)
            java.lang.Object r2 = r3.getValue()
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            r1 = 2
            r2.A01 = r1
            java.lang.Object r1 = r3.getValue()
            r10.add(r1)
            goto L_0x05f4
        L_0x0614:
            java.util.Set r1 = r24.entrySet()
            java.util.Iterator r3 = r1.iterator()
        L_0x061c:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0656
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r5 == 0) goto L_0x0635
            java.lang.Object r1 = r2.getValue()
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            int r1 = r1.A09
            if (r1 == 0) goto L_0x0635
            goto L_0x061c
        L_0x0635:
            if (r10 == 0) goto L_0x061c
            java.lang.Object r1 = r2.getKey()
            boolean r1 = r6.containsKey(r1)
            if (r1 != 0) goto L_0x061c
            A02(r7, r2, r11)
            goto L_0x061c
        L_0x0645:
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L_0x0656
            X.00H r1 = r0.A09
            java.lang.Object r1 = r1.get()
            X.1M9 r1 = (X.AnonymousClass1M9) r1
            r1.A0w(r10)
        L_0x0656:
            java.util.Set r1 = r24.entrySet()
            java.util.Iterator r12 = r1.iterator()
        L_0x065e:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0708
            java.lang.Object r3 = r12.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r1 = r3.getKey()
            X.0yx r1 = (X.C19760yx) r1
            java.lang.Object r1 = r1.A00
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x06d2
            java.util.List r2 = r7.A08
            java.lang.Object r1 = r3.getValue()
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x06d2
            java.lang.Object r2 = r3.getValue()
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            java.lang.Object r1 = r31.get()
            X.1UN r1 = (X.AnonymousClass1UN) r1
            boolean r1 = r1.A09()
            if (r1 == 0) goto L_0x0699
            r1 = 0
            r2.A01 = r1
        L_0x0699:
            r10 = 0
            X.C18070vi.A0d(r2, r10)
            java.util.List r1 = r7.A05
            r1.add(r2)
            java.lang.Object r2 = r3.getValue()
            X.C18070vi.A0d(r2, r10)
            java.util.List r1 = r7.A06
        L_0x06ab:
            r1.add(r2)
        L_0x06ae:
            java.lang.Object r2 = r3.getValue()
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r10 = r2.A06(r1)
            if (r10 == 0) goto L_0x065e
            boolean r1 = r11.contains(r10)
            if (r1 == 0) goto L_0x065e
            java.util.List r2 = r7.A09
            java.lang.Object r1 = r3.getValue()
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x065e
            r11.remove(r10)
            goto L_0x065e
        L_0x06d2:
            java.lang.Object r1 = r3.getKey()
            X.0yx r1 = (X.C19760yx) r1
            java.lang.Object r1 = r1.A00
            boolean r1 = r8.contains(r1)
            if (r1 == 0) goto L_0x06ae
            java.util.List r2 = r7.A08
            java.lang.Object r1 = r3.getValue()
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x06ae
            java.lang.Object r2 = r3.getValue()
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            java.lang.Object r1 = r31.get()
            X.1UN r1 = (X.AnonymousClass1UN) r1
            boolean r1 = r1.A09()
            if (r1 == 0) goto L_0x0701
            r1 = 0
            r2.A01 = r1
        L_0x0701:
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            java.util.List r1 = r7.A05
            goto L_0x06ab
        L_0x0708:
            java.util.List r4 = r7.A09
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x073e
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.Iterator r8 = r4.iterator()
        L_0x0719:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x073b
            java.lang.Object r3 = r8.next()
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r3.A06(r2)
            if (r1 == 0) goto L_0x0719
            com.whatsapp.jid.Jid r1 = r3.A06(r2)
            boolean r1 = r11.contains(r1)
            if (r1 != 0) goto L_0x0719
            r10.add(r3)
            goto L_0x0719
        L_0x073b:
            r4.removeAll(r10)
        L_0x073e:
            X.00H r1 = r0.A0A
            java.lang.Object r2 = r1.get()
            X.2c7 r2 = (X.C53182c7) r2
            X.1UN r13 = r2.A01
            boolean r1 = r13.A08()
            if (r1 != 0) goto L_0x0781
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.2rL r12 = new X.2rL
            r12.<init>(r3, r2, r1)
        L_0x0762:
            java.util.List r1 = r12.A00
            java.util.Iterator r3 = r1.iterator()
        L_0x0768:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x082d
            java.lang.Object r2 = r3.next()
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            java.util.List r1 = r7.A05
            r1.add(r2)
            java.util.List r1 = r7.A06
            r1.add(r2)
            goto L_0x0768
        L_0x0781:
            X.1M9 r1 = r2.A00
            X.1M2 r11 = r1.A04
            r12 = 1
            X.1Ez r10 = new X.1Ez
            r10.<init>((boolean) r12)
            r10.A04()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r8 = 0
            X.1Lt r1 = r11.A00     // Catch:{ IllegalStateException -> 0x07d7 }
            X.1at r3 = r1.get()     // Catch:{ IllegalStateException -> 0x07d7 }
            java.lang.String r15 = X.C42631yU.A03     // Catch:{ all -> 0x07cd }
            java.lang.String r2 = "NATIVE_CONTACTS_NOT_SYNC_WITH_DEVICE"
            r1 = 0
            android.database.Cursor r15 = X.C24861Ly.A03(r3, r15, r2, r1)     // Catch:{ all -> 0x07cd }
            r15.getCount()     // Catch:{ all -> 0x07c1 }
            int r8 = r15.getCount()     // Catch:{ all -> 0x07c1 }
        L_0x07aa:
            boolean r1 = r15.moveToNext()     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x07ba
            X.0vb r1 = r11.A00     // Catch:{ all -> 0x07c1 }
            X.1E7 r1 = X.C42651yW.A02(r15, r1)     // Catch:{ all -> 0x07c1 }
            r14.add(r1)     // Catch:{ all -> 0x07c1 }
            goto L_0x07aa
        L_0x07ba:
            r15.close()     // Catch:{ all -> 0x07cd }
            r3.close()     // Catch:{ IllegalStateException -> 0x07d7 }
            goto L_0x07e1
        L_0x07c1:
            r2 = move-exception
            if (r15 == 0) goto L_0x07cc
            r15.close()     // Catch:{ all -> 0x07c8 }
            goto L_0x07cc
        L_0x07c8:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ all -> 0x07cd }
        L_0x07cc:
            throw r2     // Catch:{ all -> 0x07cd }
        L_0x07cd:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x07d2 }
            goto L_0x07d6
        L_0x07d2:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ IllegalStateException -> 0x07d7 }
        L_0x07d6:
            throw r2     // Catch:{ IllegalStateException -> 0x07d7 }
        L_0x07d7:
            r3 = move-exception
            java.lang.String r2 = "ContactManagerDatabase/getSyncPendingNativeContacts/"
            int r1 = r14.size()
            X.AnonymousClass1M2.A0G(r3, r2, r8, r1)
        L_0x07e1:
            X.1Lz r1 = r11.A07
            r1.A0J(r14)
            r14.size()
            r10.A01()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x07ff:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0826
            java.lang.Object r3 = r14.next()
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            int r2 = r3.A01
            if (r2 == 0) goto L_0x0818
            if (r2 == r12) goto L_0x0822
            r1 = 2
            if (r2 != r1) goto L_0x07ff
            r10.add(r3)
            goto L_0x07ff
        L_0x0818:
            boolean r1 = r13.A09()
            if (r1 != 0) goto L_0x0822
            r11.add(r3)
            goto L_0x07ff
        L_0x0822:
            r8.add(r3)
            goto L_0x07ff
        L_0x0826:
            X.2rL r12 = new X.2rL
            r12.<init>(r11, r10, r8)
            goto L_0x0762
        L_0x082d:
            java.util.List r1 = r12.A01
            java.util.Iterator r3 = r1.iterator()
        L_0x0833:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x084a
            java.lang.Object r2 = r3.next()
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            java.util.List r1 = r7.A08
            r1.add(r2)
            r4.add(r2)
            goto L_0x0833
        L_0x084a:
            java.util.List r1 = r12.A02
            java.util.Iterator r3 = r1.iterator()
        L_0x0850:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0864
            java.lang.Object r2 = r3.next()
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            java.util.List r1 = r7.A0B
            r1.add(r2)
            goto L_0x0850
        L_0x0864:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r10 = r35.iterator()
        L_0x086d:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x08b4
            java.lang.Object r8 = r10.next()
            X.1E7 r8 = (X.AnonymousClass1E7) r8
            X.1BI r3 = r8.A0J
            boolean r1 = X.C22971Dz.A0T(r3)
            if (r1 == 0) goto L_0x089b
            X.190 r8 = r0.A00
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "JID: "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r2 = 0
            java.lang.String r1 = "jid_in_ab_table"
            r8.A0G(r1, r3, r2)
            goto L_0x086d
        L_0x089b:
            X.2lf r1 = r8.A0H
            if (r1 != 0) goto L_0x08a5
            java.util.List r1 = r7.A02
            r1.add(r8)
            goto L_0x086d
        L_0x08a5:
            java.lang.String r3 = r1.A01
            java.lang.String r2 = r8.A0K()
            X.0yx r1 = new X.0yx
            r1.<init>(r3, r2)
            r4.put(r1, r8)
            goto L_0x086d
        L_0x08b4:
            java.util.Set r1 = r6.entrySet()
            java.util.Iterator r11 = r1.iterator()
        L_0x08bc:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0928
            java.lang.Object r2 = r11.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r1 = r2.getValue()
            java.util.List r1 = (java.util.List) r1
            X.2tJ r8 = A00(r1)
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r3 = r4.get(r1)
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            if (r3 != 0) goto L_0x0910
            r1 = 0
            X.1E7 r3 = A01(r8, r1)
            X.2lf r10 = r3.A0H
            if (r10 == 0) goto L_0x08bc
            long r1 = r8.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r9.get(r1)
            X.2fR r1 = (X.C55232fR) r1
            A03(r1, r8, r3, r5)
            java.lang.String r2 = r10.A01
            r1 = r16
            java.lang.Object r2 = r1.get(r2)
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            if (r2 == 0) goto L_0x090a
            X.1BI r1 = r2.A0J
            r3.A0J = r1
            boolean r1 = r2.A10
            r3.A10 = r1
        L_0x090a:
            java.util.List r1 = r7.A00
        L_0x090c:
            r1.add(r3)
            goto L_0x08bc
        L_0x0910:
            long r1 = r8.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r9.get(r1)
            X.2fR r1 = (X.C55232fR) r1
            boolean r1 = A03(r1, r8, r3, r5)
            if (r1 == 0) goto L_0x0925
            java.util.List r1 = r7.A04
            goto L_0x090c
        L_0x0925:
            java.util.List r1 = r7.A03
            goto L_0x090c
        L_0x0928:
            java.util.Set r1 = r4.entrySet()
            java.util.Iterator r4 = r1.iterator()
        L_0x0930:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x097b
            java.lang.Object r3 = r4.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r1 = r3.getKey()
            boolean r1 = r6.containsKey(r1)
            if (r1 != 0) goto L_0x0930
            java.lang.Object r2 = r3.getValue()
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            java.lang.Object r1 = r31.get()
            X.1UN r1 = (X.AnonymousClass1UN) r1
            boolean r1 = r1.A08()
            if (r1 == 0) goto L_0x0971
            boolean r1 = A04(r0)
            if (r1 != 0) goto L_0x0968
            boolean r1 = A05(r0)
            if (r1 == 0) goto L_0x096e
            int r1 = r2.A09
            if (r1 != 0) goto L_0x096e
        L_0x0968:
            java.util.List r1 = r7.A01
        L_0x096a:
            r1.add(r2)
            goto L_0x0930
        L_0x096e:
            java.util.List r1 = r7.A03
            goto L_0x096a
        L_0x0971:
            java.util.List r2 = r7.A01
            java.lang.Object r1 = r3.getValue()
            r2.add(r1)
            goto L_0x0930
        L_0x097b:
            java.util.List r1 = r7.A05
            java.lang.String r0 = "add"
            r2 = r33
            X.AnonymousClass1M9.A04(r2, r0, r1)
            java.util.List r1 = r7.A0C
            java.lang.String r0 = "update"
            X.AnonymousClass1M9.A04(r2, r0, r1)
            java.util.List r1 = r7.A08
            java.lang.String r0 = "remove"
            X.AnonymousClass1M9.A04(r2, r0, r1)
            java.util.List r1 = r7.A0B
            java.lang.String r0 = "unchanged"
            X.AnonymousClass1M9.A04(r2, r0, r1)
            java.util.List r1 = r7.A07
            java.lang.String r0 = "updateContactsMatchingJidHash"
            X.AnonymousClass1M9.A04(r2, r0, r1)
            java.util.List r1 = r7.A00
            java.lang.String r0 = "ab-add"
            X.AnonymousClass1M9.A04(r2, r0, r1)
            java.util.List r1 = r7.A04
            java.lang.String r0 = "ab-update"
            X.AnonymousClass1M9.A04(r2, r0, r1)
            java.util.List r1 = r7.A01
            java.lang.String r0 = "ab-remove"
            X.AnonymousClass1M9.A04(r2, r0, r1)
            java.util.List r1 = r7.A03
            java.lang.String r0 = "ab-unchanged"
            X.AnonymousClass1M9.A04(r2, r0, r1)
            return r7
        L_0x09c0:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x09c7:
            r1 = move-exception
            if (r11 == 0) goto L_0x09d2
            r11.close()     // Catch:{ all -> 0x09ce }
            throw r1
        L_0x09ce:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x09d2:
            throw r1
        L_0x09d3:
            int r1 = r13 + 1
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r8)     // Catch:{ all -> 0x09e1 }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r6, r1)     // Catch:{ all -> 0x09e1 }
            r0.apply()     // Catch:{ all -> 0x09e1 }
            goto L_0x09f3
        L_0x09e1:
            r1 = move-exception
            if (r5 == 0) goto L_0x09ec
            r5.close()     // Catch:{ all -> 0x09e8 }
            goto L_0x09ec
        L_0x09e8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x09ed }
        L_0x09ec:
            throw r1     // Catch:{ Exception -> 0x09ed }
        L_0x09ed:
            r1 = move-exception
            java.lang.String r0 = "phonebook/error in retrieving phone numbers"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x09f3:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26871Tu.A06(java.lang.String, java.util.List, java.util.List, java.util.List):X.2kE");
    }

    public C26871Tu(AnonymousClass190 r1, C26861Tt r2, C26851Ts r3, AnonymousClass11C r4, AnonymousClass118 r5, C219217x r6, C19830z4 r7, C18030ve r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        this.A07 = r8;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A0A = r9;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r2;
        this.A08 = r10;
        this.A0C = r11;
        this.A09 = r12;
        this.A0B = r13;
    }

    public static void A02(C58152kE r3, Map.Entry entry, Set set) {
        Object value = entry.getValue();
        C18070vi.A0d(value, 0);
        r3.A08.add(value);
        Object value2 = entry.getValue();
        C18070vi.A0d(value2, 0);
        r3.A09.add(value2);
        Jid A062 = ((AnonymousClass1E7) entry.getValue()).A06(UserJid.class);
        if (A062 != null) {
            set.add(A062);
        }
    }
}
