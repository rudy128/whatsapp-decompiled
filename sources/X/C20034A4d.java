package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.A4d  reason: case insensitive filesystem */
public final class C20034A4d {
    public final AnonymousClass1M2 A00;
    public final AnonymousClass118 A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    /* JADX WARNING: type inference failed for: r4v0, types: [boolean, int] */
    public final String A02(C62562rb r18, String str, String str2, String str3) {
        String A0K;
        String A0K2;
        String str4;
        Throwable th;
        long j;
        String str5 = str2;
        String str6 = str;
        ? A1Z = C72453Mb.A1Z(str6);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NotificationUiBuilder/getNameForSenderJid/");
        C62562rb r6 = r18;
        C17890vO.A1A(A10, C49842Sd.A00(r6));
        Jid A0n = AnonymousClass3MX.A0n(str6);
        if (A0n != null) {
            String str7 = str3;
            if (C22971Dz.A0T(A0n)) {
                Log.i("NotificationUiBuilder/getNameForSenderJid/isLidJid:true");
                A8T a8t = (A8T) this.A03.get();
                File A0C = a8t.A0C(r6);
                if (A0C == null || !A0C.exists()) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    AnonymousClass8BW.A18(r6, "AccountSwitchingFileManager/getLidFromJidFromInactiveAccount/account ", A102);
                    C17890vO.A1A(A102, " databases dir does not exist");
                    AnonymousClass8BX.A16(a8t, "AccountSwitchingFileManager/getLidFromJidFromInactiveAccount/stagingDirLogString/", AnonymousClass000.A10());
                    A0n = null;
                } else {
                    File A0u = AnonymousClass8BR.A0u(A0C.getAbsolutePath(), "msgstore.db");
                    AnonymousClass1CO r10 = a8t.A01;
                    AnonymousClass00H r12 = a8t.A06;
                    AnonymousClass1CP r13 = (AnonymousClass1CP) r12.get();
                    SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(A0u.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, A1Z);
                    long A002 = AnonymousClass1DL.A00(AnonymousClass1Eu.A03(openDatabase, r13, r10, "msgstore.db"), A0n);
                    if (openDatabase != null) {
                        openDatabase.close();
                    }
                    AnonymousClass1CP r132 = (AnonymousClass1CP) r12.get();
                    openDatabase = SQLiteDatabase.openDatabase(A0u.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, A1Z);
                    C23141Ev A032 = AnonymousClass1Eu.A03(openDatabase, r132, r10, "msgstore.db");
                    String[] A1Y = C17880vN.A1Y();
                    C17880vN.A1V(A1Y, A1Z, A002);
                    Cursor A0A = A032.A0A("SELECT jid_row_id\nFROM jid_map\nWHERE lid_row_id = ?", "JidMapStore/GET_JID_BY_LID", A1Y);
                    try {
                        int columnIndex = A0A.getColumnIndex("jid_row_id");
                        if (columnIndex < 0 || !A0A.moveToFirst()) {
                            try {
                                A0A.close();
                                if (openDatabase != null) {
                                    openDatabase.close();
                                }
                                j = -1;
                            } catch (Throwable th2) {
                                if (openDatabase != null) {
                                    try {
                                        openDatabase.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        AnonymousClass0DT.A00(th2, th3);
                                        throw th2;
                                    }
                                }
                                throw th2;
                            }
                        } else {
                            j = (long) A0A.getInt(columnIndex);
                            A0A.close();
                            if (openDatabase != null) {
                                openDatabase.close();
                            }
                        }
                        AnonymousClass1CP r14 = (AnonymousClass1CP) r12.get();
                        String absolutePath = A0u.getAbsolutePath();
                        A0n = null;
                        if (j > 0) {
                            openDatabase = SQLiteDatabase.openDatabase(absolutePath, (SQLiteDatabase.CursorFactory) null, A1Z);
                            C23141Ev A033 = AnonymousClass1Eu.A03(openDatabase, r14, r10, "msgstore.db");
                            String[] A1Y2 = C17880vN.A1Y();
                            A1Y2[A1Z] = Long.toString(j);
                            Cursor A0A2 = A033.A0A("SELECT user, server, agent, device, type, raw_string FROM jid WHERE _id = ?", "GET_JID_BY_ROW_ID_SQL", A1Y2);
                            try {
                                if (A0A2.moveToLast()) {
                                    A0n = AnonymousClass1DL.A03(A0A2, A0A2.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_USER), A0A2.getColumnIndexOrThrow("server"), A0A2.getColumnIndexOrThrow("agent"), A0A2.getColumnIndexOrThrow("device"), A0A2.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), A0A2.getColumnIndexOrThrow("raw_string"));
                                }
                                A0A2.close();
                                if (openDatabase != null) {
                                    openDatabase.close();
                                }
                            } catch (Throwable th4) {
                                AnonymousClass0DT.A00(th, th4);
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (A0A != null) {
                            A0A.close();
                        }
                        throw th;
                    }
                }
                if (A0n != null) {
                    str4 = "NotificationUiBuilder/getNameForSenderJid/lid mapping found";
                } else {
                    Log.i("NotificationUiBuilder/getNameForSenderJid/lid mapping not found");
                    A0n = PhoneUserJid.Companion.A04(str7);
                    if (A0n != null) {
                        str4 = "NotificationUiBuilder/getNameForSenderJid/sender pn jid found";
                    } else {
                        Log.i("NotificationUiBuilder/getNameForSenderJid/sender pn jid null");
                        if (!(str2 == null || str5.length() == 0)) {
                            return str5;
                        }
                    }
                }
                Log.i(str4);
            }
            if (C22971Dz.A0X(A0n)) {
                Log.i("NotificationUiBuilder/getNameForSenderJid/isPhoneJid:true");
                AnonymousClass1E7 A09 = ((A8T) this.A03.get()).A09(r6, A0n);
                if (A09 != null && (A0K2 = A09.A0K()) != null) {
                    return A0K2;
                }
                AnonymousClass1E7 A0K3 = this.A00.A0K(A0n);
                if (A0K3 == null || (A0K = A0K3.A0K()) == null) {
                    return C17880vN.A0I(this.A02).A08(A0n.user);
                }
                return A0K;
            }
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("rawJid=");
            A103.append(str6);
            A103.append(",displayName=");
            A103.append(str5);
            ((AnonymousClass190) this.A05.get()).A0G("NotificationUiBuilder/getNameForSenderJid", AnonymousClass001.A1H(",senderPnJid=", str7, A103), A1Z);
        }
        Log.e("NotificationUiBuilder/getUnknownJidPlaceholder/");
        return C18070vi.A0G(this.A01, 2131891604);
    }

    public C20034A4d(AnonymousClass1M2 r2, AnonymousClass118 r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r4, r5, r2, r6);
        C18070vi.A0d(r7, 6);
        this.A01 = r3;
        this.A05 = r4;
        this.A02 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A03 = r7;
    }

    public static final SpannableString A00(String str, int i) {
        if (str.length() > i) {
            i++;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(1), 0, i, 33);
        return spannableString;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r14.equals("group_message") != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        r9 = r6.A06;
        r10 = (X.C195449tM) r3.get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r10 != null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (r9 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r1 = X.AnonymousClass3MX.A0n(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        if (r1 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        r0 = ((X.A8T) r7.A03.get()).A09(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        r15 = r0.A0K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r15 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r15.length() == 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        r13 = new X.C195449tM(r14, r15, r7.A02(r8, r6.A08, r6.A05, r6.A09), r6.A01, r6.A02, 1);
        r3.put(r9, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        r0 = "NotificationUiBuilder/addOrModifyGroupNotification/unable to resolve group name, skipping notification";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        r10.A00 += r6.A01;
        r10.A01++;
        r0 = r10.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a0, code lost:
        if (r0 == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a6, code lost:
        if (r0.length() != 0) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a8, code lost:
        r10.A03 = r7.A02(r8, r6.A08, r6.A05, r6.A09);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        if (r14.equals(r0) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c1, code lost:
        r13 = new X.C195449tM(r14, r7.A02(r8, r6.A08, r6.A05, r6.A09), (java.lang.String) null, r6.A01, r6.A02, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00dc, code lost:
        r2.add(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e5, code lost:
        throw X.C17880vN.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        r0 = X.AnonymousClass001.A1H("NotificationUiBuilder/getAllNotificationUiDataForAccount/unknown notification type: ", r14, X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        if (r14.equals("voip_call_offer_group") == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A01(X.C62562rb r23, X.C20034A4d r24, java.util.List r25) {
        /*
            java.util.LinkedHashMap r3 = X.C17880vN.A13()
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r12 = r25.iterator()
        L_0x000c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r6 = r12.next()
            X.9ti r6 = (X.C195669ti) r6
            java.lang.String r14 = r6.A07
            int r0 = r14.hashCode()
            r8 = r23
            r7 = r24
            switch(r0) {
                case -1127809222: goto L_0x0033;
                case 239102022: goto L_0x00b6;
                case 954925063: goto L_0x00b9;
                case 1006153287: goto L_0x003c;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "NotificationUiBuilder/getAllNotificationUiDataForAccount/unknown notification type: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r14, r1)
        L_0x002f:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x000c
        L_0x0033:
            java.lang.String r0 = "voip_call_offer_group"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0044
            goto L_0x0025
        L_0x003c:
            java.lang.String r0 = "group_message"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0025
        L_0x0044:
            java.lang.String r9 = r6.A06
            java.lang.Object r10 = r3.get(r9)
            X.9tM r10 = (X.C195449tM) r10
            if (r10 != 0) goto L_0x0090
            if (r9 == 0) goto L_0x00e1
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3MX.A0n(r9)
            if (r1 == 0) goto L_0x008d
            X.00H r0 = r7.A03
            java.lang.Object r0 = r0.get()
            X.A8T r0 = (X.A8T) r0
            X.1E7 r0 = r0.A09(r8, r1)
            if (r0 == 0) goto L_0x008d
            java.lang.String r15 = r0.A0K()
            if (r15 == 0) goto L_0x008d
            int r0 = r15.length()
            if (r0 == 0) goto L_0x008d
            long r4 = r6.A01
            long r0 = r6.A02
            java.lang.String r11 = r6.A08
            java.lang.String r10 = r6.A05
            java.lang.String r6 = r6.A09
            java.lang.String r16 = r7.A02(r8, r11, r10, r6)
            r21 = 1
            X.9tM r13 = new X.9tM
            r19 = r0
            r17 = r4
            r13.<init>(r14, r15, r16, r17, r19, r21)
            r3.put(r9, r13)
            goto L_0x00dc
        L_0x008d:
            java.lang.String r0 = "NotificationUiBuilder/addOrModifyGroupNotification/unable to resolve group name, skipping notification"
            goto L_0x002f
        L_0x0090:
            long r4 = r10.A00
            long r0 = r6.A01
            long r4 = r4 + r0
            r10.A00 = r4
            long r0 = r10.A01
            r4 = 1
            long r0 = r0 + r4
            r10.A01 = r0
            java.lang.String r0 = r10.A03
            if (r0 == 0) goto L_0x00a8
            int r0 = r0.length()
            if (r0 != 0) goto L_0x000c
        L_0x00a8:
            java.lang.String r4 = r6.A08
            java.lang.String r1 = r6.A05
            java.lang.String r0 = r6.A09
            java.lang.String r0 = r7.A02(r8, r4, r1, r0)
            r10.A03 = r0
            goto L_0x000c
        L_0x00b6:
            java.lang.String r0 = "voip_call_offer_1on1"
            goto L_0x00bb
        L_0x00b9:
            java.lang.String r0 = "message"
        L_0x00bb:
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0025
            java.lang.String r4 = r6.A08
            java.lang.String r1 = r6.A05
            java.lang.String r0 = r6.A09
            java.lang.String r15 = r7.A02(r8, r4, r1, r0)
            long r4 = r6.A01
            long r0 = r6.A02
            r16 = 0
            r21 = 0
            X.9tM r13 = new X.9tM
            r19 = r0
            r17 = r4
            r13.<init>(r14, r15, r16, r17, r19, r21)
        L_0x00dc:
            r2.add(r13)
            goto L_0x000c
        L_0x00e1:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x00e6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20034A4d.A01(X.2rb, X.A4d, java.util.List):java.util.ArrayList");
    }
}
