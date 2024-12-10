package X;

import android.content.ContentValues;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1MK  reason: invalid class name */
public final class AnonymousClass1MK {
    public final AnonymousClass190 A00;
    public final AnonymousClass1MI A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass1MH A03;
    public final AnonymousClass1MJ A04;
    public final C18030ve A05;
    public final AnonymousClass10I A06;
    public final AnonymousClass00H A07;

    public AnonymousClass1MK(AnonymousClass190 r2, AnonymousClass11S r3, AnonymousClass1MI r4, AnonymousClass1MH r5, AnonymousClass1MJ r6, C18030ve r7, AnonymousClass10I r8, AnonymousClass00H r9) {
        C18070vi.A0d(r7, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r8, 4);
        C18070vi.A0d(r5, 5);
        C18070vi.A0d(r4, 6);
        C18070vi.A0d(r6, 7);
        C18070vi.A0d(r9, 8);
        this.A05 = r7;
        this.A00 = r2;
        this.A02 = r3;
        this.A06 = r8;
        this.A03 = r5;
        this.A01 = r4;
        this.A04 = r6;
        this.A07 = r9;
    }

    public static final void A00(C28791au r8, AnonymousClass1E1 r9, PhoneUserJid phoneUserJid, String str, String str2, String str3, String str4, String str5) {
        C18070vi.A0d(r9, 1);
        C18070vi.A0d(phoneUserJid, 2);
        ContentValues contentValues = new ContentValues();
        C60002nE A022 = C63962tz.A02(r9.getPrimaryDevice());
        contentValues.put(str4, A022.A03);
        contentValues.put(str5, Integer.valueOf(A022.A01));
        C23141Ev r4 = ((C28801av) r8).A02;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" = ? AND ");
        sb.append(str3);
        sb.append(" = 0 ");
        String obj = sb.toString();
        String[] strArr = {phoneUserJid.user};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_update_existing_pn_with_account_id");
        r4.A02(contentValues, str, obj, sb2.toString(), strArr);
    }

    private final void A01(PhoneUserJid phoneUserJid, String str, String str2) {
        PhoneUserJid phoneUserJid2 = phoneUserJid;
        if (!C42701yb.A01(phoneUserJid)) {
            this.A06.CGS(new C21438Ak5(phoneUserJid2, this, new IllegalStateException("Missing accountJid"), str2, str, 4), "AxolotlAccountJidMigrationUtils/reportMissingAccountCriticalEvent");
        }
    }

    public final C60002nE A02(C60002nE r4, String str, String str2) {
        AnonymousClass1E1 A032;
        C18070vi.A0d(r4, 2);
        if (r4.A01 != 0) {
            return r4;
        }
        String str3 = r4.A03;
        C18070vi.A0X(str3);
        PhoneUserJid A042 = A04(str3);
        if (A042 == null || (A032 = A03(A042, str, str2)) == null) {
            return null;
        }
        DeviceJid A043 = DeviceJid.Companion.A04(A032, r4.A00);
        C17960vV.A07(A043);
        if (A043 != null) {
            return C63962tz.A02(A043);
        }
        return null;
    }

    public final AnonymousClass1E1 A03(PhoneUserJid phoneUserJid, String str, String str2) {
        C18070vi.A0d(phoneUserJid, 2);
        if (C42701yb.A01(phoneUserJid)) {
            return null;
        }
        AnonymousClass1E1 A0A = this.A04.A00.A0A(phoneUserJid);
        if (A0A != null) {
            return A0A;
        }
        A01(phoneUserJid, str, str2);
        return A0A;
    }

    public final PhoneUserJid A04(String str) {
        C18070vi.A0d(str, 0);
        if (!str.equals("0") && !str.equals("Server")) {
            PhoneUserJid A032 = PhoneUserJid.Companion.A03(str);
            if (A032 == null) {
                AnonymousClass190 r2 = this.A00;
                StringBuilder sb = new StringBuilder();
                sb.append("InvalidJid: ");
                sb.append(C29361c9.A0Z(str, 4));
                sb.append("; size=");
                sb.append(str.length());
                r2.A0G("AxolotlAccountJidMigrationUtils/getFromPhoneNumberNullable", sb.toString(), false);
            }
            if (!C42701yb.A01(A032)) {
                return A032;
            }
        }
        return null;
    }

    public final void A07(C60002nE r4, String str, String str2) {
        C18070vi.A0d(r4, 0);
        if (C18020vd.A05(C18040vf.A02, this.A05, 8566) && r4.A01 == 0) {
            String str3 = r4.A03;
            C18070vi.A0X(str3);
            PhoneUserJid A042 = A04(str3);
            if (A042 != null && !this.A02.A0O(A042)) {
                A03(A042, str2, str);
            }
        }
    }

    public final boolean A0A(C60002nE r5) {
        C18070vi.A0d(r5, 0);
        if (!(r5 instanceof AnonymousClass2DV)) {
            C18030ve r3 = this.A05;
            Object obj = this.A07.get();
            C18070vi.A0X(obj);
            C63182se r0 = (C63182se) obj;
            C18070vi.A0d(r0, 1);
            if (!r0.A02() || C18020vd.A00(C18040vf.A02, r3, 7821) == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final LinkedHashMap A05(String str, String str2, Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Object next : set) {
            if (((C60002nE) next).A01 != 0) {
                arrayList.add(next);
            }
        }
        for (Object next2 : arrayList) {
            linkedHashMap.put(next2, next2);
        }
        ArrayList<C60002nE> arrayList2 = new ArrayList<>();
        for (Object next3 : set) {
            if (((C60002nE) next3).A01 == 0) {
                arrayList2.add(next3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (C60002nE r2 : arrayList2) {
            String str3 = r2.A03;
            C18070vi.A0X(str3);
            PhoneUserJid A042 = A04(str3);
            if (A042 != null) {
                arrayList3.add(new AnonymousClass1D6(r2, A042));
            }
        }
        Map A0D = AnonymousClass1D7.A0D(arrayList3);
        Map A062 = A06(str, str2, C29431cG.A12(A0D.values()));
        ArrayList arrayList4 = new ArrayList();
        for (Map.Entry entry : A0D.entrySet()) {
            C60002nE r3 = (C60002nE) entry.getKey();
            UserJid userJid = (UserJid) A062.get(entry.getValue());
            if (userJid != null) {
                DeviceJid A043 = DeviceJid.Companion.A04(userJid, r3.A00);
                C17960vV.A07(A043);
                C18070vi.A0X(A043);
                linkedHashMap.put(r3, C63962tz.A02(A043));
                arrayList4.add(C27621Wu.A00);
            }
        }
        return linkedHashMap;
    }

    public final Map A06(String str, String str2, Set set) {
        Map A0L = this.A04.A00.A0L(set);
        Set A062 = C41841x9.A06(A0L.keySet(), set);
        if (!A062.isEmpty()) {
            A01((PhoneUserJid) C29431cG.A0X(A062), str, str2);
        }
        return A0L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00db, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dc, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00df, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00eb, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ee, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            r25 = this;
            java.lang.String r7 = "_id"
            r16 = 0
            r15 = 1
            r6 = 2
            r13 = -1
        L_0x0008:
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            r10 = r25
            X.1MH r2 = r10.A03
            X.1at r3 = r2.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00e8 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x00e8 }
            java.lang.String[] r4 = new java.lang.String[r6]     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x00e8 }
            r4[r16] = r0     // Catch:{ all -> 0x00e8 }
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00e8 }
            r4[r15] = r0     // Catch:{ all -> 0x00e8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e8 }
            r1.<init>()     // Catch:{ all -> 0x00e8 }
            r9 = r26
            r1.append(r9)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "_get_existing_pn_with_missing_account_id"
            r1.append(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e8 }
            r1 = r31
            android.database.Cursor r4 = r8.A0A(r1, r0, r4)     // Catch:{ all -> 0x00e8 }
            r8 = r27
            int r12 = r4.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x00e1 }
            int r11 = r4.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x00e1 }
        L_0x004d:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x0069
            long r0 = r4.getLong(r12)     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00e1 }
            long r13 = r4.getLong(r11)     // Catch:{ all -> 0x00e1 }
            com.whatsapp.jid.PhoneUserJid r0 = r10.A04(r0)     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x004d
            r5.add(r0)     // Catch:{ all -> 0x00e1 }
            goto L_0x004d
        L_0x0069:
            r4.close()     // Catch:{ all -> 0x00e8 }
            r3.close()
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00e0
            java.lang.String r0 = "updateAccountIdForPnRowsOneTime"
            java.util.Map r1 = r10.A06(r0, r9, r5)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00c9
            X.1au r4 = r2.A06()
            X.1xA r3 = r4.BD0()     // Catch:{ all -> 0x00d9 }
            java.util.Set r0 = r1.entrySet()     // Catch:{ all -> 0x00d2 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x00d2 }
        L_0x0094:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x00d2 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x00d2 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x00d2 }
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1     // Catch:{ all -> 0x00d2 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00d2 }
            X.1E1 r0 = (X.AnonymousClass1E1) r0     // Catch:{ all -> 0x00d2 }
            r20 = r9
            r21 = r8
            r22 = r28
            r23 = r29
            r24 = r30
            r18 = r0
            r19 = r1
            r17 = r4
            A00(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x00d2 }
            goto L_0x0094
        L_0x00c0:
            r3.A00()     // Catch:{ all -> 0x00d2 }
            r3.close()     // Catch:{ all -> 0x00d9 }
            r4.close()
        L_0x00c9:
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0008
            return
        L_0x00d2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00db }
        L_0x00db:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x00e0:
            return
        L_0x00e1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00e8 }
            throw r0     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MK.A08(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final boolean A09(C60002nE r4) {
        if ((r4 instanceof AnonymousClass2DV) && ((C63182se) this.A07.get()).A02()) {
            if (C18020vd.A00(C18040vf.A02, this.A05, 7821) <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}
