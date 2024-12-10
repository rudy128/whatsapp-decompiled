package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.ARq  reason: case insensitive filesystem */
public class C20606ARq implements C201511a {
    public final AnonymousClass1DL A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass122 A03;
    public final AnonymousClass1Cd A04;
    public final C26331Rs A05;
    public final AnonymousClass00H A06;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r9 > 0) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C196029uL A00(android.database.Cursor r13, X.AnonymousClass1BI r14) {
        /*
            r12 = this;
            java.lang.String r0 = "key_id"
            java.lang.String r8 = X.C17890vO.A0S(r13, r0)
            java.lang.String r0 = "from_me"
            int r0 = X.C17890vO.A01(r13, r0)
            boolean r11 = X.C17890vO.A1R(r0)
            java.lang.String r3 = "timestamp"
            if (r11 == 0) goto L_0x0052
            java.lang.String r0 = "status"
            int r0 = X.C17890vO.A01(r13, r0)
            r1 = 0
            if (r0 != 0) goto L_0x0047
            r9 = 0
        L_0x0020:
            r6 = r14
            boolean r0 = X.C22971Dz.A0e(r14)
            r5 = 0
            if (r0 == 0) goto L_0x0069
            if (r11 != 0) goto L_0x0069
            java.lang.String r0 = "sender_jid_row_id"
            long r0 = X.C17890vO.A06(r13, r0)
            X.1DL r2 = r12.A00
            com.whatsapp.jid.Jid r4 = r2.A0B(r0)
            com.whatsapp.jid.UserJid r7 = X.C22941Dw.A00(r4)
            if (r7 != 0) goto L_0x006a
            com.whatsapp.jid.DeviceJid r2 = X.AnonymousClass1E0.A00(r4)
            if (r2 == 0) goto L_0x0057
            com.whatsapp.jid.UserJid r7 = r2.userJid
            if (r7 != 0) goto L_0x006a
            return r5
        L_0x0047:
            java.lang.String r0 = "receipt_server_timestamp"
            long r9 = X.C17890vO.A06(r13, r0)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0052
            goto L_0x0020
        L_0x0052:
            long r9 = X.C17890vO.A06(r13, r3)
            goto L_0x0020
        L_0x0057:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "MessageRangeUtil/getSenderJid null or not UserJid/DeviceJid when db migration is completed; senderJidRowId="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = "; jid="
            X.C17900vP.A0X(r4, r0, r3)
            return r5
        L_0x0069:
            r7 = r5
        L_0x006a:
            X.00H r0 = r12.A06
            java.lang.Object r1 = r0.get()
            X.2mE r1 = (X.C59392mE) r1
            X.205 r0 = X.AnonymousClass205.A01(r14, r8, r11)
            X.205 r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0080
            java.lang.String r8 = r0.A01
            boolean r11 = r0.A02
        L_0x0080:
            X.9uL r5 = new X.9uL
            r5.<init>(r6, r7, r8, r9, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20606ARq.A00(android.database.Cursor, X.1BI):X.9uL");
    }

    public A7L A02(AnonymousClass1BI r20, boolean z) {
        Cursor A0A;
        long j;
        long j2;
        Cursor A0A2;
        AnonymousClass122 r4 = this.A03;
        String[] A1b = AnonymousClass8BR.A1b();
        AnonymousClass1LW r7 = r4.A0C;
        AnonymousClass1BI r12 = r20;
        C17890vO.A1J(A1b, r7.A09(r12));
        AnonymousClass11P r6 = r4.A0A;
        C17890vO.A1K(A1b, AnonymousClass11P.A01(r6));
        String valueOf = String.valueOf(1000);
        A1b[2] = valueOf;
        AnonymousClass1Cd r8 = r4.A0V;
        C28781at A042 = r8.get();
        try {
            A0A = ((C28801av) A042).A02.A0A("   SELECT MAX(timestamp) as timestamp FROM  ( SELECT timestamp FROM available_message_view WHERE chat_row_id = ? AND from_me = 0 AND (message_type != '7') AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC  LIMIT ? )", "SELECT_LATEST_TIMESTAMP_OF_RECEIVED_MESSAGES_IN_CHAT_SQL", A1b);
            if (!A0A.moveToFirst()) {
                A0A.close();
                A042.close();
                j = -1;
            } else {
                j = C17890vO.A06(A0A, "timestamp");
                A0A.close();
                A042.close();
            }
            if (z) {
                String[] A1Y = C17880vN.A1Y();
                C17890vO.A1J(A1Y, r7.A09(r12));
                C28781at A043 = r8.get();
                try {
                    A0A2 = ((C28801av) A043).A02.A0A("   SELECT timestamp FROM available_message_view WHERE chat_row_id = ? AND from_me = 1 AND message_type = 7 ORDER BY sort_id DESC LIMIT 1", "SELECT_LATEST_TIMESTAMP_OF_SYSTEM_MESSAGES_IN_CHAT_SQL", A1Y);
                    if (!A0A2.moveToFirst()) {
                        A0A2.close();
                        A043.close();
                        j2 = -1;
                    } else {
                        j2 = C17890vO.A06(A0A2, "timestamp");
                        A0A2.close();
                        A043.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        A043.close();
                        throw th;
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                        throw th;
                    }
                }
            } else {
                j2 = 0;
            }
            HashSet A12 = C17880vN.A12();
            HashSet A122 = C17880vN.A12();
            C28781at A044 = this.A04.get();
            try {
                String valueOf2 = String.valueOf(j);
                String[] strArr = new String[6];
                AnonymousClass001.A1Q(String.valueOf(r7.A09(r12)), valueOf2, strArr);
                strArr[2] = valueOf2;
                strArr[3] = valueOf2;
                C72453Mb.A1T(String.valueOf(AnonymousClass11P.A01(r6)), valueOf, strArr);
                A044 = r8.get();
                try {
                    Cursor A0A3 = ((C28801av) A044).A02.A0A("   SELECT key_id, from_me, timestamp, receipt_server_timestamp, sender_jid_row_id, status FROM available_message_view WHERE chat_row_id = ? AND (message_type != '7') AND  (  ( from_me = 0 AND timestamp >= ? ) OR ( from_me = 1 AND (  CASE  WHEN status = 0 THEN 1  WHEN receipt_server_timestamp > 0  THEN receipt_server_timestamp >= ?  WHEN timestamp >= 0  THEN timestamp >= ?  ELSE 0  END  ) ))  AND (status != '7')  AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC LIMIT ?", "SELECT_MESSAGE_KEYS_FROM_C2S_TIMESTAMP_IN_CHAT_SQL", strArr);
                    if (A0A3 != null) {
                        while (A0A3.moveToNext()) {
                            try {
                                C196029uL A002 = A00(A0A3, r12);
                                if (A002 == null) {
                                    Log.e("MessageRangeUtil/createRange unable to create message");
                                } else if (A002.A00 <= 0) {
                                    A122.add(A002);
                                } else {
                                    A12.add(A002);
                                }
                            } catch (Throwable th3) {
                                AnonymousClass0DT.A00(th, th3);
                            }
                        }
                        A0A3.close();
                    }
                    A044.close();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    long millis = timeUnit.toMillis(timeUnit2.toSeconds(j));
                    long millis2 = timeUnit.toMillis(timeUnit2.toSeconds(j2));
                    if (millis2 <= millis) {
                        millis2 = 0;
                    }
                    return new A7L(A12, A122, millis, millis2);
                } catch (Throwable th4) {
                    AnonymousClass0DT.A00(th, th4);
                }
            } finally {
                th = th;
                A044.close();
            }
            throw th;
            throw th;
            throw th;
        } catch (Throwable th5) {
            th = th5;
            A042.close();
            throw th;
        }
    }

    public C20606ARq(AnonymousClass190 r1, AnonymousClass11P r2, AnonymousClass122 r3, AnonymousClass1DL r4, AnonymousClass1Cd r5, C26331Rs r6, AnonymousClass00H r7) {
        this.A02 = r2;
        this.A00 = r4;
        this.A01 = r1;
        this.A03 = r3;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
    }

    public A7L A01(AnonymousClass1BI r18) {
        UserJid userJid;
        String[] A1b = AnonymousClass8BR.A1b();
        A1b[0] = "clearChat";
        A1b[1] = "deleteChat";
        HashSet A0I = C17900vP.A0I("deleteMessageForMe", A1b, 2);
        ArrayList A13 = AnonymousClass000.A13();
        C26331Rs r1 = this.A05;
        AnonymousClass1BI r6 = r18;
        A13.addAll(r1.A0C(r6, A0I, false));
        A13.addAll(r1.A0C(r6, A0I, true));
        A7L A022 = A02(r6, true);
        HashSet A12 = C17880vN.A12();
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            C20126A8l a8l = (C20126A8l) it.next();
            if (a8l instanceof AnonymousClass8q2) {
                A022 = A7L.A01(A022, ((AnonymousClass8q2) a8l).A00);
            } else if (a8l instanceof C170478pv) {
                C170478pv r62 = (C170478pv) a8l;
                long j = r62.A00;
                if (j > 0) {
                    long A002 = AnonymousClass9QP.A00(j, r62.A04);
                    AnonymousClass205 r0 = r62.A01;
                    boolean z = r0.A02;
                    String str = r0.A01;
                    AnonymousClass1BI r11 = r62.A00;
                    AnonymousClass1BI r02 = r62.A01;
                    if (r02 != null) {
                        userJid = C22941Dw.A02(r02.getRawString());
                    } else {
                        userJid = null;
                    }
                    A12.add(new C196029uL(r11, userJid, str, A002, z));
                }
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("MessageRangeUtil/createActiveRange unhandledMutation:");
                C17890vO.A19(A10, a8l.A0B());
            }
        }
        return A7L.A01(A022, new A7L(A12, Collections.emptySet(), 0, 0));
    }

    public C20606ARq() {
    }
}
