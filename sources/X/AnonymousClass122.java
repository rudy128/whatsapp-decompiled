package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.whatsapp.data.ConversationDeleteWorker;
import com.whatsapp.data.OrderRequestMessageManager$getOrderRequestMessageRowId$1;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.122  reason: invalid class name */
public class AnonymousClass122 implements AnonymousClass121, C201511a {
    public AnonymousClass118 A00;
    public C32331h1 A01;
    public final C19880zA A02;
    public final C19880zA A03;
    public final AnonymousClass190 A04;
    public final C218617r A05;
    public final AnonymousClass11S A06;
    public final C25311Ns A07;
    public final AnonymousClass1M9 A08;
    public final AnonymousClass1PM A09;
    public final AnonymousClass11P A0A;
    public final C19830z4 A0B;
    public final AnonymousClass1LW A0C;
    public final AnonymousClass1CJ A0D;
    public final AnonymousClass1RQ A0E;
    public final AnonymousClass1NN A0F;
    public final AnonymousClass1NA A0G;
    public final AnonymousClass1LY A0H;
    public final C25991Qk A0I;
    public final C26141Qz A0J;
    public final AnonymousClass1RR A0K;
    public final C26051Qq A0L;
    public final AnonymousClass1QB A0M;
    public final AnonymousClass1MZ A0N;
    public final AnonymousClass1Q2 A0O;
    public final AnonymousClass1N3 A0P;
    public final C25321Nt A0Q;
    public final AnonymousClass1Q6 A0R;
    public final C24681Lg A0S;
    public final AnonymousClass1CL A0T;
    public final C22611Cn A0U;
    public final AnonymousClass1Cd A0V;
    public final C26021Qn A0W;
    public final AnonymousClass1R6 A0X;
    public final AnonymousClass125 A0Y;
    public final C26111Qw A0Z;
    public final AnonymousClass1NK A0a;
    public final AnonymousClass1R7 A0b;
    public final AnonymousClass1RT A0c;
    public final AnonymousClass1NJ A0d;
    public final AnonymousClass1RS A0e;
    public final C24631Lb A0f;
    public final C24661Le A0g;
    public final AnonymousClass1N2 A0h;
    public final C25911Qc A0i;
    public final AnonymousClass1QU A0j;
    public final C25331Nu A0k;
    public final C24751Ln A0l;
    public final AnonymousClass1RL A0m;
    public final AnonymousClass1RK A0n;
    public final AnonymousClass1KH A0o;
    public final AnonymousClass1PS A0p;
    public final C18030ve A0q;
    public final C26161Rb A0r;
    public final AnonymousClass12L A0s;
    public final AnonymousClass18K A0t;
    public final AnonymousClass1MB A0u;
    public final AnonymousClass1O2 A0v;
    public final AnonymousClass1PT A0w;
    public final AnonymousClass1RU A0x;
    public final AnonymousClass1R5 A0y;
    public final AnonymousClass1QS A0z;
    public final C59422mH A10;
    public final AnonymousClass1PQ A11;
    public final AnonymousClass11A A12;
    public final AnonymousClass10I A13;
    public final AnonymousClass1RZ A14;
    public final AnonymousClass1PV A15;
    public final AnonymousClass00H A16;
    public final AnonymousClass00H A17;
    public final AnonymousClass00H A18;
    public final AnonymousClass00H A19;
    public final AnonymousClass00H A1A;
    public final AnonymousClass00H A1B;
    public final AnonymousClass00H A1C;
    public final AnonymousClass00H A1D;
    public final AnonymousClass00H A1E;
    public final AnonymousClass00H A1F;
    public final AnonymousClass00H A1G;
    public final AnonymousClass00H A1H;
    public final AnonymousClass00H A1I;
    public final AnonymousClass00H A1J;
    public final AnonymousClass00H A1K;
    public final AnonymousClass00H A1L;
    public final Map A1M;
    public final C19880zA A1N;
    public final C19880zA A1O;
    public final C25111Mx A1P;
    public final AnonymousClass1RW A1Q;
    public final AnonymousClass1Q0 A1R;
    public final AnonymousClass11C A1S;
    public final AnonymousClass1Q8 A1T;
    public final AnonymousClass1QT A1U;
    public final AnonymousClass1QW A1V;
    public final C25951Qg A1W;
    public final AnonymousClass1DL A1X;
    public final C26001Ql A1Y;
    public final C26011Qm A1Z;
    public final AnonymousClass1RP A1a;
    public final C24621La A1b;
    public final C26041Qp A1c;
    public final C26121Qx A1d;
    public final AnonymousClass1LX A1e;
    public final AnonymousClass1QV A1f;
    public final C26131Qy A1g;
    public final C26061Qr A1h;
    public final AnonymousClass1N5 A1i;
    public final AnonymousClass1N9 A1j;
    public final AnonymousClass1N7 A1k;
    public final C25981Qj A1l;
    public final AnonymousClass1RY A1m;
    public final AnonymousClass1R0 A1n;
    public final C24901Mc A1o;
    public final AnonymousClass00H A1p;
    public final AnonymousClass00H A1q;
    public final AnonymousClass00H A1r;
    public final AnonymousClass00H A1s;
    public final AnonymousClass00H A1t;
    public final AnonymousClass00H A1u;
    public final AnonymousClass00H A1v;
    public final AnonymousClass00H A1w;
    public final AnonymousClass00H A1x;
    public final AnonymousClass00H A1y;
    public final AnonymousClass00H A1z;
    public final AnonymousClass00H A20;

    public static void A07(AnonymousClass122 r6, AnonymousClass206 r7, int i) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        r6.A12.A00(new C21365Aiu(r6, r7, countDownLatch, i, 19));
        try {
            countDownLatch.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e((Throwable) e);
        }
    }

    public Cursor A0H(int i, long j, long j2) {
        String[] strArr = {String.valueOf(j), String.valueOf(j2), String.valueOf(i)};
        C28781at A042 = this.A0V.get();
        try {
            Cursor A0A2 = ((C28801av) A042).A02.A0A(AnonymousClass203.A0L, "SELECT_MESSAGES_FOR_HISTORY_CHUNK_BY_VIEW_FOR_HOSTED_SYNC_SQL", strArr);
            A042.close();
            return A0A2;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public Cursor A0I(int i, long j, long j2, long j3) {
        String[] strArr = {String.valueOf(j), String.valueOf(j2), String.valueOf(j3), String.valueOf(i)};
        C28781at A042 = this.A0V.get();
        try {
            Cursor A0A2 = ((C28801av) A042).A02.A0A(AnonymousClass203.A0M, "SELECT_MESSAGES_FOR_HISTORY_CHUNK_BY_VIEW_SQL", strArr);
            A042.close();
            return A0A2;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public synchronized void A0L() {
        ArrayList A0D2;
        AnonymousClass1QS r0 = this.A0z;
        AnonymousClass1QS.A00(r0);
        AnonymousClass1QR r2 = r0.A04;
        synchronized (r2) {
            r2.A04.A06("failReceiverPendingTransactions/failPendingTransactions");
            A0D2 = AnonymousClass1QR.A0D(r2, false);
        }
        A0A(A0D2);
    }

    public synchronized void A0M() {
        ArrayList A0D2;
        AnonymousClass1QS r0 = this.A0z;
        AnonymousClass1QS.A00(r0);
        AnonymousClass1QR r2 = r0.A04;
        synchronized (r2) {
            r2.A04.A06("PaymentTransactionStore/failReceiverPendingTransactions");
            A0D2 = AnonymousClass1QR.A0D(r2, true);
        }
        A0A(A0D2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00ce */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0N(X.AnonymousClass1BI r16, com.whatsapp.jid.UserJid r17) {
        /*
            r15 = this;
            monitor-enter(r15)
            X.1QS r0 = r15.A0z     // Catch:{ all -> 0x011d }
            X.AnonymousClass1QS.A00(r0)     // Catch:{ all -> 0x011d }
            X.1QR r4 = r0.A04     // Catch:{ all -> 0x011d }
            boolean r0 = X.C22971Dz.A0e(r16)     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x0016
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ all -> 0x011d }
            com.whatsapp.jid.GroupJid r9 = X.C36321nh.A00(r16)     // Catch:{ all -> 0x011d }
        L_0x0014:
            monitor-enter(r4)     // Catch:{ all -> 0x011d }
            goto L_0x0018
        L_0x0016:
            r9 = 0
            goto L_0x0014
        L_0x0018:
            java.util.ArrayList r1 = r4.A0R()     // Catch:{ all -> 0x011a }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x011a }
            r5.<init>()     // Catch:{ all -> 0x011a }
            X.1Cd r0 = r4.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ce }
            X.1au r6 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ce }
            X.1xA r14 = r6.BD0()     // Catch:{ all -> 0x00c4 }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x00ba }
        L_0x002f:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r10 = r13.next()     // Catch:{ all -> 0x00ba }
            X.AW0 r10 = (X.AW0) r10     // Catch:{ all -> 0x00ba }
            if (r9 == 0) goto L_0x0059
            X.1BI r0 = r10.A0C     // Catch:{ all -> 0x00ba }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x002f
            r1 = r17
            if (r17 == 0) goto L_0x002f
            com.whatsapp.jid.UserJid r0 = r10.A0E     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ba }
            if (r0 != 0) goto L_0x0059
            com.whatsapp.jid.UserJid r0 = r10.A0D     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x002f
        L_0x0059:
            X.1QE r2 = r4.A04     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r1.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "mark pending request as failed: "
            r1.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r10.A0L     // Catch:{ all -> 0x00ba }
            r1.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ba }
            r2.A06(r0)     // Catch:{ all -> 0x00ba }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x00ba }
            r12.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = r10.A0L     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r10.A0K     // Catch:{ all -> 0x00ba }
            android.util.Pair r11 = X.AnonymousClass1QR.A07(r1, r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "status"
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ba }
            r12.put(r1, r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "timestamp"
            X.11P r0 = r4.A01     // Catch:{ all -> 0x00ba }
            long r1 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x00ba }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r7
            int r0 = (int) r1     // Catch:{ all -> 0x00ba }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ba }
            r12.put(r3, r0)     // Catch:{ all -> 0x00ba }
            X.AnonymousClass1QR.A0F(r12, r11, r6)     // Catch:{ all -> 0x00ba }
            X.1BI r3 = r10.A0C     // Catch:{ all -> 0x00ba }
            boolean r2 = r10.A0Q     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = r10.A0L     // Catch:{ all -> 0x00ba }
            X.205 r0 = new X.205     // Catch:{ all -> 0x00ba }
            r0.<init>(r3, r1, r2)     // Catch:{ all -> 0x00ba }
            r5.add(r0)     // Catch:{ all -> 0x00ba }
            goto L_0x002f
        L_0x00b0:
            r14.A00()     // Catch:{ all -> 0x00ba }
            r14.close()     // Catch:{ all -> 0x00c4 }
            r6.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ce }
            goto L_0x00d5
        L_0x00ba:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x00bf }
            goto L_0x00c3
        L_0x00bf:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00c4 }
        L_0x00c3:
            throw r1     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00c9 }
            goto L_0x00cd
        L_0x00c9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ce }
        L_0x00cd:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ce }
        L_0x00ce:
            X.1QE r1 = r4.A04     // Catch:{ all -> 0x011a }
            java.lang.String r0 = "failPendingRequests failed."
            r1.A05(r0)     // Catch:{ all -> 0x011a }
        L_0x00d5:
            monitor-exit(r4)     // Catch:{ all -> 0x011d }
            java.util.Iterator r4 = r5.iterator()     // Catch:{ all -> 0x011d }
        L_0x00da:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x0118
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x011d }
            X.205 r1 = (X.AnonymousClass205) r1     // Catch:{ all -> 0x011d }
            X.00H r0 = r15.A1E     // Catch:{ all -> 0x011d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x011d }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x011d }
            X.1W2 r0 = r0.A01     // Catch:{ all -> 0x011d }
            X.206 r3 = r0.A05(r1)     // Catch:{ all -> 0x011d }
            if (r3 == 0) goto L_0x00da
            X.AW0 r0 = X.AnonymousClass25B.A00(r3)     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x00da
            X.AW0 r1 = X.AnonymousClass25B.A00(r3)     // Catch:{ all -> 0x011d }
            r0 = 13
            r1.A02 = r0     // Catch:{ all -> 0x011d }
            X.AW0 r2 = X.AnonymousClass25B.A00(r3)     // Catch:{ all -> 0x011d }
            X.11P r0 = r15.A0A     // Catch:{ all -> 0x011d }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x011d }
            r2.A06 = r0     // Catch:{ all -> 0x011d }
            X.1Q2 r1 = r15.A0O     // Catch:{ all -> 0x011d }
            r0 = 16
            r1.A01(r3, r0)     // Catch:{ all -> 0x011d }
            goto L_0x00da
        L_0x0118:
            monitor-exit(r15)
            return
        L_0x011a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x011d }
            throw r0     // Catch:{ all -> 0x011d }
        L_0x011d:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.A0N(X.1BI, com.whatsapp.jid.UserJid):void");
    }

    @Deprecated
    public void A0P(AnonymousClass206 r2) {
        A0J(r2, -1);
    }

    public void BBO(AnonymousClass1BI r8, AnonymousClass205 r9, int i, long j) {
        A0O(r8, r9, (String) null, i, j);
    }

    public void BIE(AnonymousClass1BI r12, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("CoreMessageStore/deletemsgs/service/jid ");
        sb.append(r12);
        Log.i(sb.toString());
        Handler handler = this.A0O.A01;
        Message.obtain(handler, 1, r12.getRawString()).sendToTarget();
        C56192h3 A032 = this.A0I.A03(r12, (Long) null, (List) null, true, z, false);
        if (A032 != null) {
            Message.obtain(handler, 2, r12.getRawString()).sendToTarget();
            this.A0E.A00(A032, "action_delete");
        }
    }

    public void BIJ(AnonymousClass206 r7, int i, boolean z) {
        BIK(r7, i, z, false, false);
    }

    public long BTu(AnonymousClass1BI r6, long j) {
        Cursor A0A2;
        String valueOf = String.valueOf(j);
        String[] strArr = {String.valueOf(this.A0C.A09(r6)), valueOf, valueOf, String.valueOf(AnonymousClass11P.A01(this.A0A))};
        C28781at A042 = this.A0V.get();
        try {
            A0A2 = ((C28801av) A042).A02.A0A(" SELECT sort_id FROM available_message_view WHERE chat_row_id = ?  AND  (  ( from_me = 1 AND (  CASE  WHEN status = 0 THEN 0  WHEN receipt_server_timestamp > 0  THEN receipt_server_timestamp <= ?  WHEN timestamp > 0  THEN timestamp <= ?  ELSE 0  END  ) ) OR  ( timestamp <= ?  AND from_me = 0 )  )  AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC  LIMIT 1", "SELECT_LATEST_SORT_ID_IN_TIMERANGE_IN_CHAT_SQL", strArr);
            if (!A0A2.moveToFirst()) {
                A0A2.close();
                A042.close();
                return -1;
            }
            long j2 = A0A2.getLong(A0A2.getColumnIndexOrThrow("sort_id"));
            A0A2.close();
            A042.close();
            return j2;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    @Deprecated
    public C54242dp BUp(AnonymousClass1BI r9, int i, long j, long j2) {
        return A00(this, r9, i, j, j2, true);
    }

    public Cursor Ba5(AnonymousClass1BI r6, long j, long j2, long j3) {
        String[] strArr = {String.valueOf(this.A0C.A09(r6)), String.valueOf(j), String.valueOf(j2), String.valueOf(j3), String.valueOf(AnonymousClass11P.A01(this.A0A))};
        C28781at A042 = this.A0V.get();
        try {
            Cursor A0A2 = ((C28801av) A042).A02.A0A(AnonymousClass203.A0N, "SELECT_SYSTEM_MESSAGE_IN_RANGE_IN_CHAT_SQL", strArr);
            A042.close();
            return A0A2;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (X.C22971Dz.A0e(r15) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C54242dp A00(X.AnonymousClass122 r14, X.AnonymousClass1BI r15, int r16, long r17, long r19, boolean r21) {
        /*
            r10 = r17
            long r7 = android.os.SystemClock.uptimeMillis()
            X.1Qr r0 = r14.A1h
            X.0vl r0 = r0.A01
            java.lang.Object r3 = r0.getValue()
            X.10f r3 = (X.C199410f) r3
            boolean r0 = X.C22971Dz.A0N(r15)
            if (r0 != 0) goto L_0x001d
            boolean r0 = X.C22971Dz.A0e(r15)
            r4 = 1
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            r1 = 0
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d0
            r1 = 1
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d0
            int r2 = r3.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.AnonymousClass203.A0J
            r1.append(r0)
            r0 = 1
            java.util.ArrayList r0 = X.C26121Qx.A01(r4, r0)
            X.C26121Qx.A02(r1, r0)
            java.lang.String r0 = " "
            r1.append(r0)
            java.lang.String r0 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass203.A00(r2)
            r1.append(r0)
            java.lang.String r0 = " AND sort_id >= ?"
            r1.append(r0)
            if (r21 == 0) goto L_0x00b0
            java.lang.String r0 = " ORDER BY sort_id DESC"
        L_0x005a:
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/messages "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = r1.toString()
            X.1Ez r4 = new X.1Ez
            r4.<init>((java.lang.String) r0)
            X.1NJ r0 = r14.A0d
            long r12 = r0.A04(r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.1LW r0 = r14.A0C
            long r0 = r0.A09(r15)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.add(r0)
            java.lang.String r0 = java.lang.String.valueOf(r19)
            r2.add(r0)
            X.C26061Qr.A01(r3, r2)
            java.lang.String r0 = java.lang.String.valueOf(r12)
            r2.add(r0)
            int r0 = r2.size()
            java.lang.String[] r3 = new java.lang.String[r0]
            r2.toArray(r3)
            X.1Cd r0 = r14.A0V
            X.1at r2 = r0.get()
            goto L_0x00b3
        L_0x00b0:
            java.lang.String r0 = " ORDER BY sort_id ASC"
            goto L_0x005a
        L_0x00b3:
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00c6 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "GET_MESSAGES_FOR_JID_WITH_START_REF"
            android.database.Cursor r9 = r1.A0A(r5, r0, r3)     // Catch:{ all -> 0x00c6 }
            r2.close()
            r4.A02()
            goto L_0x0186
        L_0x00c6:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00cb }
            throw r1
        L_0x00cb:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x00d0:
            int r2 = r3.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.AnonymousClass203.A0J
            r1.append(r0)
            r0 = 1
            java.util.ArrayList r0 = X.C26121Qx.A01(r4, r0)
            X.C26121Qx.A02(r1, r0)
            java.lang.String r0 = " "
            r1.append(r0)
            java.lang.String r0 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass203.A00(r2)
            r1.append(r0)
            if (r21 == 0) goto L_0x014a
            java.lang.String r0 = " ORDER BY sort_id DESC"
        L_0x00fb:
            r1.append(r0)
            java.lang.String r0 = " LIMIT ?"
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/messages/indexed "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = r1.toString()
            X.1Ez r2 = new X.1Ez
            r2.<init>((java.lang.String) r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.1LW r0 = r14.A0C
            long r0 = r0.A09(r15)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6.add(r0)
            java.lang.String r0 = java.lang.String.valueOf(r19)
            r6.add(r0)
            X.C26061Qr.A01(r3, r6)
            java.lang.String r0 = java.lang.String.valueOf(r16)
            r6.add(r0)
            int r0 = r6.size()
            java.lang.String[] r4 = new java.lang.String[r0]
            r6.toArray(r4)
            goto L_0x014d
        L_0x014a:
            java.lang.String r0 = " ORDER BY sort_id ASC"
            goto L_0x00fb
        L_0x014d:
            X.1Cd r0 = r14.A0V     // Catch:{ all -> 0x01a2 }
            X.1at r3 = r0.get()     // Catch:{ all -> 0x01a2 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0198 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = "GET_MESSAGES_FOR_JID_NO_START_REF"
            android.database.Cursor r9 = r1.A0A(r5, r0, r4)     // Catch:{ all -> 0x0198 }
            boolean r0 = r9.moveToLast()     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x017d
            java.lang.String r0 = "_id"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0198 }
            long r10 = r9.getLong(r0)     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = "sort_id"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0198 }
            long r12 = r9.getLong(r0)     // Catch:{ all -> 0x0198 }
        L_0x0179:
            r9.moveToFirst()     // Catch:{ all -> 0x0198 }
            goto L_0x0180
        L_0x017d:
            r12 = -9223372036854775808
            goto L_0x0179
        L_0x0180:
            r3.close()     // Catch:{ all -> 0x01a2 }
            r2.A02()
        L_0x0186:
            X.1LY r3 = r14.A0H
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r7
            java.lang.String r0 = "CoreMessageStore/getMessagesForJid"
            r3.A01(r0, r1)
            X.2dp r8 = new X.2dp
            r8.<init>(r9, r10, r12)
            return r8
        L_0x0198:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x019d }
            goto L_0x01a1
        L_0x019d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01a2 }
        L_0x01a1:
            throw r1     // Catch:{ all -> 0x01a2 }
        L_0x01a2:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.A00(X.122, X.1BI, int, long, long, boolean):X.2dp");
    }

    private void A01(long j) {
        int i;
        AnonymousClass1N7 r3 = this.A1k;
        if (AnonymousClass1N7.A00(r3, 0, j) != null) {
            i = 5;
        } else {
            i = -1;
            if (AnonymousClass1N7.A00(r3, 2, j) != null) {
                i = 4;
            }
        }
        C63622tQ A012 = r3.A01(j);
        if (i != -1 && A012 != null) {
            A012.A05(i);
        }
    }

    public static void A02(AnonymousClass122 r6) {
        File A0J2 = r6.A05.A0J();
        A0G(A0J2);
        Uri contentUri = MediaStore.Files.getContentUri("external");
        AnonymousClass11B A0O2 = r6.A1S.A0O();
        if (A0O2 == null) {
            Log.w("CoreMessageStore/delete-all-media cr=null");
            return;
        }
        try {
            A0O2.A01(contentUri, "_data LIKE ?||'%'", new String[]{A0J2.getAbsolutePath()});
        } catch (IllegalArgumentException | SecurityException | UnsupportedOperationException e) {
            Log.e("CoreMessageStore/delete-all-media", e);
        }
    }

    public static void A03(AnonymousClass122 r5, C56192h3 r6) {
        List<Number> list = r6.A09;
        if (list != null) {
            for (Number longValue : list) {
                AnonymousClass206 A032 = ((AnonymousClass1W6) r5.A1E.get()).A01.A03(longValue.longValue());
                if (A032 != null) {
                    r5.A0R.A0C(A032.A0v);
                }
            }
        }
        if (r6.A04 != Long.MIN_VALUE) {
            r5.A0R.A0A(r6.A07);
        }
    }

    public static void A04(AnonymousClass122 r9, AnonymousClass1BI r10, String str, List list, boolean z, boolean z2) {
        C56192h3 A032 = r9.A0I.A03(r10, Long.MIN_VALUE, list, true, z2, z);
        if (A032 == null) {
            return;
        }
        if (list == null) {
            r9.A0E.A00(A032, str);
            return;
        }
        AnonymousClass1RQ r6 = r9.A0E;
        String valueOf = String.valueOf(r10.hashCode());
        C196269uj r5 = new C196269uj(ConversationDeleteWorker.class);
        C192939pH r4 = new C192939pH();
        Map map = r4.A00;
        map.put("delete_action", str);
        map.put("job_id", Long.valueOf(A032.A06));
        r5.A04(r4.A00());
        r5.A02(4000, TimeUnit.MILLISECONDS);
        r5.A07(valueOf);
        ((A7W) r6.A02.get()).A08(r5.A00());
    }

    public static void A05(AnonymousClass122 r5, UserJid userJid, AnonymousClass206 r7, boolean z) {
        if (!z) {
            AnonymousClass2M9 A042 = r5.A0p.A04(userJid);
            AnonymousClass1CJ r3 = r5.A0D;
            AnonymousClass1PM r2 = r5.A09;
            if (!(r7 instanceof AnonymousClass2M9)) {
                AnonymousClass205 r1 = r7.A0v;
                if (r1.A02) {
                    AnonymousClass1BI r12 = r1.A00;
                    if (C22971Dz.A0Y(r12) && !r2.A04((UserJid) r12) && r7.A0T != null && r3.A0A(r12) == null && A042 != null) {
                        ((AnonymousClass1W6) r5.A1E.get()).A04(A042);
                        r5.A0Q(A042);
                    }
                }
            }
        }
    }

    public static void A06(AnonymousClass122 r23, AnonymousClass206 r24, int i) {
        C20285AEt BPK;
        C20277AEk aEk;
        AnonymousClass206 r6 = r24;
        AnonymousClass205 r3 = r6.A0v;
        AnonymousClass122 r2 = r23;
        int i2 = i;
        if (r3.A02 && !r6.A19) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (C18020vd.A05(C18040vf.A02, r2.A0q, 10399)) {
                AnonymousClass206 A062 = ((AnonymousClass1R3) r2.A1v.get()).A06(r3.A00, true);
                if (!(!(A062 instanceof AnonymousClass21K) || (BPK = ((AnonymousClass21K) A062).BPK()) == null || (aEk = BPK.A06) == null || aEk.A01 != 3 || C60532oB.A00(A062) == null)) {
                    C60532oB.A01(C60532oB.A00(A062), r6);
                }
            }
            AnonymousClass1PT r5 = r2.A0w;
            int i3 = r6.A0A;
            long j = uptimeMillis - r6.A12;
            long j2 = uptimeMillis - r6.A1F;
            r5.A0G(r6, Integer.valueOf(i2), (Collection) null, 4, 0, 0, 0, 0, i3, j, j2, j2, false, false, false, false, false);
        }
        if (r2.BBZ(r6, i2).A00) {
            r2.A0F.notifyAllObservers(new AnonymousClass35V(r3.A00, 28));
        }
    }

    public static void A08(AnonymousClass122 r9, AnonymousClass1Ez r10) {
        C28791au A052;
        C28791au A053 = r9.A0V.A05();
        try {
            C41851xA BD0 = A053.BD0();
            try {
                C23141Ev r2 = ((C28801av) A053).A02;
                r2.A04("receipt_device", (String) null, "clearAllMessagesInDB/DELETE_RECEIPT_DEVICE", (String[]) null);
                r2.A04("receipt_user", (String) null, "clearAllMessagesInDB/DELETE_RECEIPT_USER", (String[]) null);
                r2.A04("receipt_orphaned", (String) null, "clearAllMessagesInDB/DELETE_RECEIPT_ORPHANED", (String[]) null);
                r10.A03("receipts tables");
                r2.A0E("UPDATE chat SET display_message_row_id=1, unseen_message_count = 0, unseen_missed_calls_count = 0, unseen_row_count = 0, unseen_earliest_message_received_time = 0", "UPDATE_ALL_LAST_MESSAGES_CHAT");
                r2.A04("media_refs", (String) null, "clearAllMessagesInDB/DELETE_MEDIA_REFS", (String[]) null);
                r2.A04("message_streaming_sidecar", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_STREAMING_SIDECAR", (String[]) null);
                r2.A04("message_thumbnail", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_THUMBNAIL", (String[]) null);
                r2.A04("message_media", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_MEDIA", (String[]) null);
                r10.A03("media tables");
                r2.A04("mms_thumbnail_metadata", (String) null, "clearAllMessagesInDB/DELETE_MMS_THUMBNAIL_METADATA", (String[]) null);
                r10.A03("mms thumbnail metadata tables");
                r2.A04("mms_metadata", (String) null, "clearAllMessagesInDB/DELETE_MMS_METADATA", (String[]) null);
                r10.A03("mms metadata tables");
                r2.A04("audio_data", (String) null, "clearAllMessagesInDB/DELETE_AUDIO_DATA", (String[]) null);
                r10.A03("audio data tables");
                r2.A04("transcription_segment", (String) null, "clearAllMessagesInDB/DELETE_TRANSCRIPTION_SEGMENTS", (String[]) null);
                r10.A03("transcription segment tables");
                C26051Qq r6 = r9.A0L;
                A052 = r6.A03.A05();
                ((C28801av) A052).A02.A04("frequent", (String) null, "deleteAllFrequents/DELETE_FREQUENT", (String[]) null);
                A052.close();
                r2.A04("status", (String) null, "clearAllMessagesInDB/DELETE_STATUS_LIST_V2", (String[]) null);
                r6.A00 = new ConcurrentHashMap();
                r10.A03("frequent tables");
                r2.A04("message_ftsv2", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_FTS", (String[]) null);
                r10.A03("fts tables");
                r2.A04("message_send_count", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_SEND_COUNT", (String[]) null);
                r2.A04("message_location", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_LOCATION", (String[]) null);
                r2.A04("message_template", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_TEMPLATE", (String[]) null);
                r2.A04("message_template_button", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_TEMPLATE_BUTTON", (String[]) null);
                r2.A04("message_quoted", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_QUOTED", (String[]) null);
                r2.A04("message_mentions", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_MENTIONS", (String[]) null);
                r2.A04("message_product", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_PRODUCT", (String[]) null);
                r2.A04("message_translation_request", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_TRANSLATION_REQUEST_DATA", (String[]) null);
                r10.A03("message translation request table");
                r2.A04("message_link", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_LINK", (String[]) null);
                r2.A04("message_future", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_FUTURE", (String[]) null);
                r2.A04("message_system", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_SYSTEM", (String[]) null);
                r2.A04("message_text", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_TEXT", (String[]) null);
                r10.A03("extra data tables");
                r2.A0E("DELETE FROM message WHERE _id!=1", "CLEAR_ALL_MESSAGES_SQL");
                r10.A03("message table");
                BD0.A00();
                r10.A03("set transaction");
                BD0.close();
                A053.close();
                return;
            } catch (Throwable th) {
                BD0.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A053.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void A09(AnonymousClass206 r5, AnonymousClass206 r6, boolean z) {
        if (r6.A0l && r6.A0I == r5.A0I) {
            AnonymousClass205 r1 = r6.A0v;
            if (r1.A02 && r1.A01.equals(r5.A0v.A01)) {
                r6.A0a(r5.A0D());
                int i = r6.A05;
                if (i > 0 && z) {
                    r6.A0U = Long.valueOf(r5.A0H + (((long) i) * 1000));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r14.A0N.A08.A0B((X.AnonymousClass1E9) r13).A0W(r14.A06) != false) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0B(X.AnonymousClass122 r14, X.AnonymousClass206 r15) {
        /*
            X.205 r2 = r15.A0v
            X.1BI r13 = r2.A00
            X.C17960vV.A07(r13)
            boolean r0 = r15.A0w()
            r3 = 0
            if (r0 != 0) goto L_0x0282
            boolean r0 = X.AnonymousClass25A.A0f(r15)
            if (r0 != 0) goto L_0x0282
            boolean r0 = X.AnonymousClass25A.A0b(r15)
            if (r0 != 0) goto L_0x0282
            X.1NK r8 = r14.A0a
            boolean r0 = r8.A09(r13)
            if (r0 != 0) goto L_0x0282
            X.1CJ r4 = r14.A0D
            boolean r0 = r4.A0T(r13)
            r9 = 0
            if (r0 != 0) goto L_0x0040
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass1CJ.A01(r4)
            java.lang.Object r0 = r0.get(r13)
            X.1ci r0 = (X.C29691ci) r0
            if (r0 == 0) goto L_0x0040
            long r4 = r0.A0P
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0040
            r9 = 1
        L_0x0040:
            r6 = 1
            if (r9 != 0) goto L_0x01c4
            boolean r0 = r15.A0u()
            if (r0 != 0) goto L_0x01c4
            boolean r0 = X.C22971Dz.A0e(r13)
            if (r0 == 0) goto L_0x0063
            X.1MZ r0 = r14.A0N
            r4 = r13
            X.1E9 r4 = (X.AnonymousClass1E9) r4
            X.1MW r0 = r0.A08
            X.2tp r4 = r0.A0B(r4)
            X.11S r0 = r14.A06
            boolean r0 = r4.A0W(r0)
            if (r0 == 0) goto L_0x0282
        L_0x0063:
            long r4 = r8.A04(r13)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00d3
            java.lang.Long r0 = r15.A0W
            boolean r6 = r14.A0Y(r13, r0)
        L_0x0071:
            X.0ve r10 = r14.A0q
            r0 = 10126(0x278e, float:1.419E-41)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r10, r0)
            if (r0 != 0) goto L_0x00b1
            boolean r3 = r14.BBj(r13)
        L_0x0081:
            r6 = r6 | r3
            X.12L r11 = r14.A0s
            X.1M9 r8 = r14.A08
            X.1Ln r9 = r14.A0l
            X.11S r4 = r14.A06
            X.0zA r3 = r14.A03
            X.00H r0 = r14.A17
            java.lang.Object r7 = r0.get()
            X.1mm r7 = (X.C35771mm) r7
            X.1MB r12 = r14.A0u
            if (r13 == 0) goto L_0x01a1
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x01a1
            boolean r0 = r13 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r3.A07()
            if (r0 == 0) goto L_0x00d5
            r3.A03()
            java.lang.String r1 = "isCtwaUser"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x00b1:
            X.1MB r0 = r14.A0u
            boolean r0 = r0.A03(r13)
            if (r0 == 0) goto L_0x0081
            X.0zA r4 = r14.A1N
            boolean r0 = r4.A07()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r4.A03()
            X.1Ra r0 = (X.C26151Ra) r0
            X.0ve r4 = r0.A00
            r0 = 5626(0x15fa, float:7.884E-42)
            boolean r0 = X.C18020vd.A05(r5, r4, r0)
            if (r0 == 0) goto L_0x0081
            r3 = 1
            goto L_0x0081
        L_0x00d3:
            r6 = 0
            goto L_0x0071
        L_0x00d5:
            boolean r0 = X.AnonymousClass25A.A0T(r4, r15)
            if (r0 != 0) goto L_0x01a1
            boolean r0 = X.C60622oL.A00(r7, r8, r9, r10, r11, r12, r13)
            r5 = 0
            if (r0 == 0) goto L_0x01a1
            X.1PQ r2 = r14.A11
            X.11P r0 = r14.A0A
            long r0 = X.AnonymousClass11P.A01(r0)
            X.1PP r3 = r2.A02
            r2 = 1
            X.205 r3 = r3.A01(r13, r2)
            r2 = 129(0x81, float:1.81E-43)
            X.97c r4 = new X.97c
            r4.<init>(r3, r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Creating FMX card system message for chat: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = -1
            A07(r14, r4, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/added contact info message; jid="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3zf r2 = new X.3zf
            r2.<init>()
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.A03 = r0
            X.1Rb r0 = r14.A0r
            java.lang.String r1 = r13.getRawString()
            byte[] r0 = r0.A08()
            java.lang.String r0 = X.C25241Nl.A00(r0, r1)
            r2.A07 = r0
            X.1E7 r0 = r8.A0E(r13)
            if (r0 == 0) goto L_0x0153
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0153
            r5 = 1
        L_0x0153:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.A01 = r0
            X.18K r0 = r14.A0t
            r0.CC7(r2)
            X.0z4 r5 = r14.A0B
            java.lang.String r2 = "fmx_card_view_pending_chats"
            java.util.Set r0 = r5.A0w(r2)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            java.lang.String r0 = r13.toString()
            r1.add(r0)
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r5)
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r2, r1)
            r0.apply()
            java.lang.String r2 = "pref_fmx_card_view_trust_signal_fb_ig_pending_chats"
            java.util.Set r0 = r5.A0w(r2)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            java.lang.String r0 = r13.toString()
            r1.add(r0)
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r5)
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r2, r1)
            r0.apply()
            X.2Rs r0 = r14.A0J(r4, r3)
            boolean r3 = r0.A00
            goto L_0x01a2
        L_0x01a1:
            r3 = 0
        L_0x01a2:
            r3 = r3 | r6
            r2 = 0
            boolean r0 = r14.A0D(r13)
            if (r0 == 0) goto L_0x01c2
            X.1PV r1 = r14.A15
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x01c2
            X.2M8 r1 = r1.A01(r13, r2)
            r0 = -1
            A07(r14, r1, r0)
            X.2Rs r0 = r14.A0J(r1, r0)
            boolean r0 = r0.A00
        L_0x01c0:
            r3 = r3 | r0
            return r3
        L_0x01c2:
            r0 = 0
            goto L_0x01c0
        L_0x01c4:
            long r4 = r8.A04(r13)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0282
            boolean r0 = X.C22971Dz.A0Z(r13)
            if (r0 != 0) goto L_0x0282
            X.C17960vV.A07(r13)
            X.1R6 r2 = r14.A0X
            r0 = 15
            X.3Bx r6 = new X.3Bx
            r6.<init>(r14, r15, r0)
            X.1CJ r0 = r2.A01
            X.1ci r8 = r0.A0A(r13)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 == 0) goto L_0x0270
            r1.<init>()
            java.lang.String r0 = "disabling plaintext chat; jid="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = "; current="
            r1.append(r0)
            int r0 = r8.A01
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = r8.A01
            r0 = 1
            if (r1 == r0) goto L_0x0282
            r8.A01 = r0
            X.1Cd r0 = r2.A02
            X.1au r7 = r0.A05()
            X.1xA r5 = r7.BD0()     // Catch:{ all -> 0x0266 }
            X.1LW r4 = r2.A00     // Catch:{ all -> 0x025c }
            monitor-enter(r8)     // Catch:{ all -> 0x025c }
            r0 = 2
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0259 }
            r2.<init>(r0)     // Catch:{ all -> 0x0259 }
            java.lang.String r1 = "plaintext_disabled"
            int r0 = r8.A01     // Catch:{ all -> 0x0259 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0259 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0259 }
            monitor-exit(r8)     // Catch:{ all -> 0x025c }
            int r2 = r4.A05(r2, r8)     // Catch:{ all -> 0x025c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x025c }
            r1.<init>()     // Catch:{ all -> 0x025c }
            java.lang.String r0 = "disabled plaintext chat; jid="
            r1.append(r0)     // Catch:{ all -> 0x025c }
            r1.append(r13)     // Catch:{ all -> 0x025c }
            java.lang.String r0 = "; numRows="
            r1.append(r0)     // Catch:{ all -> 0x025c }
            r1.append(r2)     // Catch:{ all -> 0x025c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x025c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x025c }
            if (r2 <= 0) goto L_0x024f
            r6.run()     // Catch:{ all -> 0x025c }
        L_0x024f:
            r5.A00()     // Catch:{ all -> 0x025c }
            r5.close()     // Catch:{ all -> 0x0266 }
            r7.close()
            return r3
        L_0x0259:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x025c }
            throw r0     // Catch:{ all -> 0x025c }
        L_0x025c:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0261 }
            goto L_0x0265
        L_0x0261:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0266 }
        L_0x0265:
            throw r1     // Catch:{ all -> 0x0266 }
        L_0x0266:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x026b }
            throw r1
        L_0x026b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0270:
            r1.<init>()
            java.lang.String r0 = "missing chat info; jid="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0282:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.A0B(X.122, X.206):boolean");
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [X.20i, X.2MA, X.206] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        r1 = r8.A0D;
        r2 = r3.A0v.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bc, code lost:
        if (r1 == 2) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0C(X.AnonymousClass122 r8, X.AnonymousClass206 r9, long r10) {
        /*
            X.1RR r7 = r8.A0K
            X.205 r4 = r9.A0v
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x00d1
            X.1E5 r5 = X.AnonymousClass1E5.A00
        L_0x000a:
            int r3 = r9.A0u
            r0 = 36
            if (r3 == r0) goto L_0x00c8
            r0 = 77
            long r1 = r9.A0I
            if (r3 == r0) goto L_0x00c1
            int r6 = r9.A05
        L_0x0018:
            X.0vl r0 = r7.A0K
            java.lang.Object r3 = r0.getValue()
            X.1PQ r3 = (X.AnonymousClass1PQ) r3
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            X.1BI r0 = r4.A00
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A01(r0)
            if (r4 == 0) goto L_0x00d4
            X.1PP r3 = r3.A02
            r0 = 1
            X.205 r4 = r3.A01(r4, r0)
            r0 = 59
            X.2MA r3 = new X.2MA
            r3.<init>(r4, r0, r1)
            r3.A00 = r6
            r3.A0d(r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r3.A0h(r0)
            X.0ve r2 = r8.A0q
            r1 = 4131(0x1023, float:5.789E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00bf
            X.1CJ r1 = r8.A0D
            X.205 r0 = r3.A0v
            X.1BI r2 = r0.A00
            X.1ci r1 = r1.A0A(r2)
            if (r1 == 0) goto L_0x00bf
            X.1cl r0 = r1.A0e
            int r0 = r0.expiration
            r6 = 1
            if (r0 > 0) goto L_0x006d
            if (r0 != 0) goto L_0x00bf
            int r0 = r9.A00
            if (r0 != r6) goto L_0x00bf
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x00bf
        L_0x006d:
            boolean r0 = X.C22971Dz.A0Y(r2)
            if (r0 == 0) goto L_0x00bf
            X.1PS r0 = r8.A0p
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x00bf
            java.lang.Long r0 = r9.A0T
            if (r0 == 0) goto L_0x00bf
            long r4 = r0.longValue()
            X.1cl r0 = r1.A0e
            long r1 = r0.ephemeralSettingTimestamp
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00bf
            long r1 = r9.A0I
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00bf
            int r1 = r9.A00
            r0 = 2
            if (r1 != r6) goto L_0x00bc
            r6 = 2
        L_0x0097:
            r3.A00 = r6
            r2 = -1
            A07(r8, r3, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/added ephemeral setting message; jid="
            r1.append(r0)
            X.205 r0 = r3.A0v
            X.1BI r0 = r0.A00
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2Rs r0 = r8.A0J(r3, r2)
            boolean r0 = r0.A00
            return r0
        L_0x00bc:
            if (r1 != r0) goto L_0x00bf
            goto L_0x0097
        L_0x00bf:
            r6 = 0
            goto L_0x0097
        L_0x00c1:
            r0 = r9
            X.22t r0 = (X.C442622t) r0
            int r6 = r0.A00
            goto L_0x0018
        L_0x00c8:
            long r1 = r9.A0H
            r0 = r9
            X.22v r0 = (X.C442822v) r0
            int r6 = r0.A00
            goto L_0x0018
        L_0x00d1:
            r5 = 0
            goto L_0x000a
        L_0x00d4:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.A0C(X.122, X.206, long):boolean");
    }

    private boolean A0E(AnonymousClass206 r3, AnonymousClass206 r4) {
        this.A0R.A0C(r4.A0v);
        A0V(Collections.singleton(r4), 0);
        if (r3.A0N != null) {
            this.A1j.A08(AnonymousClass9AU.A00((AnonymousClass207) this.A1G.get(), r3));
        }
        this.A1j.A08(r3);
        return true;
    }

    public AnonymousClass206 A0K(UserJid userJid, AnonymousClass206 r7, Map map, long j) {
        DeviceJid deviceJid;
        AnonymousClass1RY r4 = this.A1m;
        AnonymousClass205 r3 = r7.A0v;
        AnonymousClass205 r1 = new AnonymousClass205(userJid, r3.A01, true);
        C17960vV.A0D(r7.A0l);
        try {
            AnonymousClass206 A002 = ((C57512jC) r4.A00.get()).A00(r7, r1);
            A002.A0f = null;
            A002.A0d(r3.A00);
            C29721cl A052 = this.A0J.A05(A002, j);
            AnonymousClass1E0 r0 = DeviceJid.Companion;
            if (userJid != null) {
                deviceJid = userJid.getPrimaryDevice();
            } else {
                deviceJid = null;
            }
            map.put(deviceJid, A052);
            return A002;
        } catch (AnonymousClass1R1 unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot clone message: ");
            sb.append(r7.A0u);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.23s, X.206] */
    public void A0O(AnonymousClass1BI r5, AnonymousClass205 r6, String str, int i, long j) {
        String valueOf;
        if (C18020vd.A05(C18040vf.A02, this.A0q, 7287)) {
            StringBuilder sb = new StringBuilder();
            sb.append("CoreMessageStore/addMessageDropPlaceholder/add msg drop placeholder/reason=");
            sb.append(i);
            sb.append("; key=");
            sb.append(r6);
            Log.w(sb.toString());
            ? r2 = new AnonymousClass206(r6, 96, j);
            r2.A0d(r5);
            if (str != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(String.valueOf(i));
                sb2.append("/");
                sb2.append(str);
                valueOf = sb2.toString();
            } else {
                valueOf = String.valueOf(i);
            }
            r2.A00 = valueOf;
            C49742Rs BBY = BBY(r2);
            AnonymousClass190 r3 = this.A04;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i);
            sb3.append("-");
            sb3.append(BBY.A01);
            r3.A0G("message-drop-placeholder", sb3.toString(), false);
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.2SC, java.lang.Object] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0722  */
    /* JADX WARNING: Removed duplicated region for block: B:461:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0147  */
    public void A0Q(X.AnonymousClass206 r27) {
        /*
            r26 = this;
            r6 = r27
            X.205 r9 = r6.A0v
            X.1BI r5 = r9.A00
            if (r5 == 0) goto L_0x0018
            r4 = r26
            X.1CJ r8 = r4.A0D
            X.1ci r3 = X.AnonymousClass1CJ.A00(r8, r5)
            if (r3 != 0) goto L_0x0019
            boolean r0 = X.AnonymousClass25A.A0n(r6)
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            int r10 = r6.A0u
            r0 = 8
            if (r10 == r0) goto L_0x0018
            r7 = 90
            if (r3 != 0) goto L_0x0026
            if (r10 != r7) goto L_0x0026
            return
        L_0x0026:
            boolean r0 = r6 instanceof X.C442522s
            if (r0 != 0) goto L_0x0018
            boolean r0 = X.C83574Fq.A00(r6)
            if (r0 != 0) goto L_0x0018
            r11 = 0
            if (r3 == 0) goto L_0x00d7
            X.1cl r0 = r3.A0e
            long r0 = r0.ephemeralSettingTimestamp
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x00d7
            X.2lr r0 = r3.A0d
            if (r0 != 0) goto L_0x00d7
            X.0ve r2 = r4.A0q
            r1 = 5309(0x14bd, float:7.44E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00d7
            X.00H r0 = r4.A1u
            java.lang.Object r14 = r0.get()
            X.2if r14 = (X.C57182if) r14
            r16 = 0
            X.1Cd r0 = r14.A01     // Catch:{ all -> 0x00b5 }
            X.1at r2 = r0.get()     // Catch:{ all -> 0x00b5 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ae }
            X.1Ev r12 = r0.A02     // Catch:{ all -> 0x00ae }
            java.lang.String r11 = "SELECT ephemeral_trigger, ephemeral_initiated_by_me FROM chat_ephemeral WHERE chat_row_id = ?"
            r13 = 1
            java.lang.String[] r1 = new java.lang.String[r13]     // Catch:{ all -> 0x00ae }
            X.1LW r14 = r14.A00     // Catch:{ all -> 0x00ae }
            X.1BI r0 = r3.A0u     // Catch:{ all -> 0x00ae }
            long r14 = r14.A09(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x00ae }
            r1[r16] = r0     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "GET_EPHEMERAL_CHATS_SQL"
            android.database.Cursor r11 = r12.A0A(r11, r0, r1)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "ephemeral_trigger"
            int r1 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = "ephemeral_initiated_by_me"
            int r12 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a7 }
            boolean r0 = r11.moveToFirst()     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x009e
            int r1 = r11.getInt(r1)     // Catch:{ all -> 0x00a7 }
            int r0 = r11.getInt(r12)     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x0097
            r13 = 0
        L_0x0097:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x00a7 }
            r3.A0L(r0, r1)     // Catch:{ all -> 0x00a7 }
        L_0x009e:
            X.1Wu r1 = X.C27621Wu.A00     // Catch:{ all -> 0x00a7 }
            r11.close()     // Catch:{ all -> 0x00ae }
            r2.close()     // Catch:{ all -> 0x00b5 }
            goto L_0x00bb
        L_0x00a7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            X.CDX.A00(r11, r1)     // Catch:{ all -> 0x00ae }
            throw r0     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x00b5 }
            throw r0     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r0 = move-exception
            X.1IU r1 = new X.1IU
            r1.<init>(r0)
        L_0x00bb:
            java.lang.Throwable r2 = X.C30671eK.A00(r1)
            if (r2 == 0) goto L_0x00d7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "EphemeralChatStore/ Failed to load ephemeral chats from db for chat: "
            r1.append(r0)
            X.1BI r0 = r3.A0u
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
        L_0x00d7:
            X.1Qr r13 = r4.A1h
            r12 = 0
            r2 = 1
            r0 = 0
            if (r3 == 0) goto L_0x00df
            r0 = 1
        L_0x00df:
            boolean r24 = X.AnonymousClass25A.A0X(r13, r6, r0)
            r0 = 10
            if (r10 != r0) goto L_0x037a
            r7 = 0
            r23 = 1
        L_0x00ea:
            r22 = 0
            r18 = 1
        L_0x00ee:
            r17 = 0
        L_0x00f0:
            boolean r0 = r6 instanceof X.C436420i
            r21 = r0
            r14 = 5
            r15 = 11
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 == 0) goto L_0x0373
            r0 = r6
            X.20i r0 = (X.C436420i) r0
            int r11 = r0.A00
            r0 = 9
            if (r11 == r0) goto L_0x0367
            if (r11 == r15) goto L_0x0367
            if (r11 == r1) goto L_0x0367
            r0 = 152(0x98, float:2.13E-43)
            if (r11 == r0) goto L_0x0367
            r0 = 168(0xa8, float:2.35E-43)
            if (r11 == r0) goto L_0x0367
            r0 = 143(0x8f, float:2.0E-43)
            if (r11 == r0) goto L_0x0357
            r0 = 148(0x94, float:2.07E-43)
            if (r11 == r0) goto L_0x0357
            if (r11 != r2) goto L_0x034e
            java.lang.String r1 = r6.A0P()
            r19 = 0
        L_0x0120:
            r16 = 0
        L_0x0122:
            X.11S r0 = r4.A06
            boolean r0 = X.AnonymousClass25A.A0S(r0, r6)
            r20 = 1
            if (r0 != 0) goto L_0x012e
        L_0x012c:
            r20 = 0
        L_0x012e:
            X.1Q0 r0 = r4.A1R
            boolean r0 = r0.A06(r3, r6)
            if (r0 == 0) goto L_0x034a
            r3.A0l = r12
        L_0x0138:
            X.11S r0 = r4.A06
            boolean r0 = X.AnonymousClass25A.A0O(r0, r6)
            if (r0 == 0) goto L_0x0142
            r3.A0t = r2
        L_0x0142:
            X.11S r11 = r4.A06
            r14 = 0
            if (r3 == 0) goto L_0x0148
            r14 = 1
        L_0x0148:
            X.0ve r0 = r4.A0q
            r25 = r0
            boolean r0 = X.AnonymousClass25A.A0c(r6)
            if (r0 != 0) goto L_0x0175
            boolean r0 = r6 instanceof X.C442822v
            if (r0 != 0) goto L_0x0175
            boolean r0 = r6 instanceof X.C442622t
            if (r0 != 0) goto L_0x0175
            boolean r0 = r6 instanceof X.C1771197i
            if (r0 != 0) goto L_0x0175
            boolean r0 = r6 instanceof X.AnonymousClass988
            if (r0 != 0) goto L_0x0175
            boolean r0 = r6 instanceof X.AnonymousClass23S
            if (r0 == 0) goto L_0x016a
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x0175
        L_0x016a:
            if (r21 == 0) goto L_0x0270
            r0 = r6
            X.20i r0 = (X.C436420i) r0
            int r15 = r0.A00
            r0 = 118(0x76, float:1.65E-43)
            if (r15 != r0) goto L_0x0270
        L_0x0175:
            boolean r13 = X.AnonymousClass25A.A0Q(r11, r6)
            r0 = -1
            if (r13 == 0) goto L_0x017d
            r0 = 1
        L_0x017d:
            if (r3 != 0) goto L_0x024e
            X.1Mc r15 = r4.A1o
            java.util.ArrayList r3 = X.C24901Mc.A01(r15)
            if (r3 == 0) goto L_0x01c7
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L_0x01c7
            java.util.ArrayList r3 = X.C24901Mc.A01(r15)
            if (r3 == 0) goto L_0x023e
            boolean r0 = r3.contains(r5)
            if (r0 == 0) goto L_0x023e
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r3)
            r14.remove(r5)
            java.lang.String r13 = ","
            r3 = 0
            java.lang.String r0 = ""
            java.lang.String r0 = X.C29431cG.A0g(r13, r0, r0, r14, r3)
            X.1La r13 = r15.A02
            java.lang.String r3 = "call_not_spam_jids"
            r13.A06(r3, r0)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r3 = "spamManager/removeCallNotSpamProp/true: "
            r13.append(r3)
            r13.append(r0)
        L_0x01bf:
            java.lang.String r0 = r13.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
        L_0x01c7:
            if (r24 == 0) goto L_0x0717
            boolean r3 = r6.A0w()
            if (r3 != 0) goto L_0x0717
            X.1ci r3 = new X.1ci
            r3.<init>((X.AnonymousClass1BI) r5)
            r8.A0K(r3, r5)
            r3.A06 = r0
            r3.A01 = r2
        L_0x01db:
            X.2Qs r0 = r3.A0b
            if (r0 != 0) goto L_0x01fb
            X.2Qs r8 = r6.A0J
            if (r8 != 0) goto L_0x01f5
            boolean r0 = X.C22971Dz.A0T(r5)
            if (r0 == 0) goto L_0x01fb
            X.00H r0 = r4.A1A
            java.lang.Object r0 = r0.get()
            X.9oM r0 = (X.C192419oM) r0
            X.2Qs r8 = r0.A00(r5)
        L_0x01f5:
            X.2Qs r0 = r3.A0b
            if (r0 != 0) goto L_0x01fb
            r3.A0b = r8
        L_0x01fb:
            if (r1 == 0) goto L_0x01ff
            r3.A0k = r1
        L_0x01ff:
            if (r12 == 0) goto L_0x0205
            long r0 = r6.A0I
            r3.A0Z = r0
        L_0x0205:
            if (r24 == 0) goto L_0x0211
            r3.A0g = r6
            long r0 = r6.A0x
            r3.A0W = r0
            long r0 = r6.A0y
            r3.A0X = r0
        L_0x0211:
            if (r7 == 0) goto L_0x021b
            long r0 = r6.A0x
            r3.A0R = r0
            long r0 = r6.A0y
            r3.A0S = r0
        L_0x021b:
            long r0 = r3.A0T
            r7 = 0
            int r12 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x022f
            long r0 = r6.A0x
            r12 = 1
            long r0 = r0 - r12
            r3.A0T = r0
            long r0 = r6.A0y
            long r0 = r0 - r12
            r3.A0U = r0
        L_0x022f:
            X.11P r0 = r4.A0A
            r24 = r0
            long r0 = X.AnonymousClass11P.A01(r24)
            r12 = 167(0xa7, float:2.34E-43)
            monitor-enter(r3)
            if (r17 == 0) goto L_0x0416
            goto L_0x0409
        L_0x023e:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "spamManager/removeCallNotSpamProp/false/not spam jids: "
            r13.append(r0)
            r13.append(r3)
            goto L_0x01bf
        L_0x024e:
            int r8 = r3.A06
            r0 = -1
            if (r8 == r0) goto L_0x025b
            r0 = -3
            if (r8 == r0) goto L_0x025b
            r0 = -2
            if (r8 == r0) goto L_0x025b
            if (r8 != 0) goto L_0x01db
        L_0x025b:
            if (r13 == 0) goto L_0x01db
            if (r16 != 0) goto L_0x01db
            r3.A06 = r2
            X.1Q2 r0 = r4.A0O
            android.os.Handler r8 = r0.A02
            r0 = 12
            android.os.Message r0 = android.os.Message.obtain(r8, r0, r6)
            r0.sendToTarget()
            goto L_0x01db
        L_0x0270:
            boolean r0 = X.AnonymousClass25A.A0X(r13, r6, r14)
            if (r0 == 0) goto L_0x0175
            boolean r0 = r6 instanceof X.AnonymousClass22M
            if (r0 == 0) goto L_0x0291
            r0 = r6
            X.22M r0 = (X.AnonymousClass22M) r0
            X.25F r0 = r0.A00
            X.229 r0 = r0.A02
            X.9Bw r0 = (X.C178119Bw) r0
            if (r0 == 0) goto L_0x0291
            boolean r0 = r0.A0M()
            if (r0 == 0) goto L_0x0291
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0291
            goto L_0x0175
        L_0x0291:
            boolean r0 = X.AnonymousClass25A.A0s(r6)
            if (r0 != 0) goto L_0x0175
            boolean r0 = X.AnonymousClass25A.A0o(r6)
            if (r0 != 0) goto L_0x0175
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x02b6
            boolean r0 = X.AnonymousClass25A.A0r(r6)
            if (r0 == 0) goto L_0x02b6
            boolean r0 = r6 instanceof X.AnonymousClass97W
            if (r0 == 0) goto L_0x02b6
            r0 = r6
            X.20i r0 = (X.C436420i) r0
            int r13 = r0.A00
            r0 = 180(0xb4, float:2.52E-43)
            if (r13 != r0) goto L_0x02b6
            goto L_0x0175
        L_0x02b6:
            if (r21 == 0) goto L_0x02f8
            r0 = r6
            X.20i r0 = (X.C436420i) r0
            int r13 = r0.A00
            r0 = 4
            if (r13 == r0) goto L_0x032c
            r0 = 5
            if (r13 == r0) goto L_0x0175
            r0 = 6
            if (r13 == r0) goto L_0x0175
            r0 = 7
            if (r13 == r0) goto L_0x032c
            r0 = 20
            if (r13 == r0) goto L_0x0335
            r0 = 21
            if (r13 == r0) goto L_0x0175
            r0 = 79
            if (r13 == r0) goto L_0x0335
            r0 = 80
            if (r13 == r0) goto L_0x0175
            r0 = 93
            if (r13 == r0) goto L_0x0175
            r0 = 94
            if (r13 == r0) goto L_0x0175
            r0 = 97
            if (r13 == r0) goto L_0x0313
            r0 = 98
            if (r13 == r0) goto L_0x0175
            switch(r13) {
                case 10: goto L_0x0175;
                case 12: goto L_0x0335;
                case 13: goto L_0x0335;
                case 14: goto L_0x0335;
                case 15: goto L_0x0175;
                case 16: goto L_0x0175;
                case 17: goto L_0x0175;
                case 37: goto L_0x0175;
                case 39: goto L_0x0175;
                case 44: goto L_0x0175;
                case 56: goto L_0x0175;
                case 59: goto L_0x0175;
                case 68: goto L_0x0175;
                case 90: goto L_0x0335;
                case 105: goto L_0x0175;
                case 106: goto L_0x0335;
                case 116: goto L_0x0175;
                case 123: goto L_0x0335;
                case 124: goto L_0x0335;
                case 126: goto L_0x0335;
                case 127: goto L_0x0335;
                case 130: goto L_0x0175;
                case 131: goto L_0x0175;
                case 137: goto L_0x0175;
                case 138: goto L_0x0175;
                case 140: goto L_0x0175;
                case 141: goto L_0x0175;
                case 144: goto L_0x0335;
                case 149: goto L_0x0335;
                case 150: goto L_0x0175;
                case 151: goto L_0x0175;
                case 152: goto L_0x0175;
                case 173: goto L_0x0335;
                default: goto L_0x02ec;
            }
        L_0x02ec:
            switch(r13) {
                case 27: goto L_0x0175;
                case 28: goto L_0x0175;
                case 29: goto L_0x0175;
                case 30: goto L_0x0175;
                case 31: goto L_0x0175;
                case 32: goto L_0x0175;
                default: goto L_0x02ef;
            }
        L_0x02ef:
            switch(r13) {
                case 51: goto L_0x0175;
                case 52: goto L_0x0335;
                case 53: goto L_0x0175;
                case 54: goto L_0x0175;
                default: goto L_0x02f2;
            }
        L_0x02f2:
            switch(r13) {
                case 73: goto L_0x0175;
                case 74: goto L_0x0175;
                case 75: goto L_0x02fb;
                case 76: goto L_0x0175;
                default: goto L_0x02f5;
            }
        L_0x02f5:
            switch(r13) {
                case 84: goto L_0x0175;
                case 85: goto L_0x0175;
                case 86: goto L_0x0175;
                case 87: goto L_0x0175;
                default: goto L_0x02f8;
            }
        L_0x02f8:
            r12 = 1
            goto L_0x0175
        L_0x02fb:
            boolean r0 = r6 instanceof X.AnonymousClass2MW
            if (r0 == 0) goto L_0x02f8
            r13 = r6
            X.2MW r13 = (X.AnonymousClass2MW) r13
            java.lang.Integer r0 = r13.A02
            if (r0 == 0) goto L_0x02f8
            int r12 = r0.intValue()
            r0 = 2
            if (r12 != r0) goto L_0x02f8
            int r0 = r13.A00
            r12 = 0
            if (r0 == 0) goto L_0x0175
            goto L_0x02f8
        L_0x0313:
            boolean r0 = r6 instanceof X.AnonymousClass2ML
            if (r0 == 0) goto L_0x02f8
            r0 = r6
            X.2ML r0 = (X.AnonymousClass2ML) r0
            boolean r0 = r0.A01
            r13 = 2787(0xae3, float:3.905E-42)
            if (r0 == 0) goto L_0x0322
            r13 = 2788(0xae4, float:3.907E-42)
        L_0x0322:
            X.0vf r12 = X.C18040vf.A02
            r0 = r25
            boolean r12 = X.C18020vd.A05(r12, r0, r13)
            goto L_0x0175
        L_0x032c:
            X.1BI r0 = r6.A0H()
            boolean r0 = r11.A0O(r0)
            goto L_0x0346
        L_0x0335:
            r0 = r6
            X.2Mh r0 = (X.C48392Mh) r0
            java.util.List r13 = r0.A01
            r11.A0I()
            com.whatsapp.jid.PhoneUserJid r0 = r11.A0E
            X.C17960vV.A07(r0)
            boolean r0 = r13.contains(r0)
        L_0x0346:
            if (r0 != 0) goto L_0x02f8
            goto L_0x0175
        L_0x034a:
            if (r3 == 0) goto L_0x0142
            goto L_0x0138
        L_0x034e:
            r19 = 0
            r1 = 0
            r16 = 1
            if (r11 == r14) goto L_0x0122
            goto L_0x0120
        L_0x0357:
            long r0 = r6.A0I
            java.lang.Long r19 = java.lang.Long.valueOf(r0)
            r1 = r6
            X.2Mg r1 = (X.C48382Mg) r1
            r0 = 2
            java.lang.String r1 = r1.A1B(r0)
            goto L_0x0120
        L_0x0367:
            long r0 = r6.A0I
            java.lang.Long r19 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r6.A0P()
            goto L_0x0120
        L_0x0373:
            r1 = 0
            r16 = 0
            r19 = 0
            goto L_0x012c
        L_0x037a:
            if (r10 != r7) goto L_0x0381
            r7 = 0
            r23 = 0
            goto L_0x00ea
        L_0x0381:
            int r0 = r8.A03(r5)
            if (r0 > 0) goto L_0x03a0
            X.1RW r0 = r4.A1Q
            X.1RX r0 = r0.A00()
            boolean r0 = r0.A01(r5)
            if (r0 == 0) goto L_0x03a0
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x039e
            r0 = 13
            r6.A0a(r0)
            r6.A1B = r2
        L_0x039e:
            r6.A0m = r2
        L_0x03a0:
            boolean r7 = r6.A0m
            if (r7 != 0) goto L_0x0404
            java.lang.Class<X.36b> r0 = X.C691436b.class
            X.229 r0 = X.AnonymousClass206.A01(r6, r0)
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r0 != 0) goto L_0x0404
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x03d1
            X.1Qj r0 = r4.A1l
            boolean r0 = r0.A00(r6)
            if (r0 != 0) goto L_0x03d1
            boolean r0 = r6 instanceof X.C436420i
            if (r0 == 0) goto L_0x0404
            r0 = r6
            X.20i r0 = (X.C436420i) r0
            int r0 = r0.A00
            java.util.Set r1 = X.AnonymousClass2WQ.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0404
        L_0x03d1:
            boolean r0 = X.AnonymousClass25A.A0k(r6)
            if (r0 != 0) goto L_0x0404
            X.11S r0 = r4.A06
            boolean r0 = X.AnonymousClass25A.A0M(r0, r6)
            r22 = 0
            if (r0 == 0) goto L_0x03e3
            r22 = 1
        L_0x03e3:
            r17 = 1
        L_0x03e5:
            r0 = 16777216(0x1000000, double:8.289046E-317)
            boolean r0 = r6.A11(r0)
            if (r0 == 0) goto L_0x03f4
            int r0 = r3.A07
            int r0 = r0 + 1
            r3.A07 = r0
        L_0x03f4:
            java.lang.Integer r0 = r6.A0S
            boolean r0 = r13.A02(r0)
            r23 = 0
            r18 = 1
            if (r0 != 0) goto L_0x00f0
            r18 = 0
            goto L_0x00ee
        L_0x0404:
            r22 = 0
            r17 = 0
            goto L_0x03e5
        L_0x0409:
            int r13 = r3.A0A     // Catch:{ all -> 0x075e }
            if (r13 > 0) goto L_0x0412
            r3.A0A = r2     // Catch:{ all -> 0x075e }
            r3.A0a = r0     // Catch:{ all -> 0x075e }
            goto L_0x0416
        L_0x0412:
            int r0 = r13 + 1
            r3.A0A = r0     // Catch:{ all -> 0x075e }
        L_0x0416:
            if (r22 == 0) goto L_0x0423
            int r0 = r3.A08     // Catch:{ all -> 0x075e }
            if (r0 > 0) goto L_0x041f
            r3.A08 = r2     // Catch:{ all -> 0x075e }
            goto L_0x0423
        L_0x041f:
            int r0 = r0 + 1
            r3.A08 = r0     // Catch:{ all -> 0x075e }
        L_0x0423:
            if (r23 == 0) goto L_0x042b
            int r0 = r3.A0B     // Catch:{ all -> 0x075e }
            int r0 = r0 + 1
            r3.A0B = r0     // Catch:{ all -> 0x075e }
        L_0x042b:
            if (r18 == 0) goto L_0x043b
            int r0 = r3.A0A     // Catch:{ all -> 0x075e }
            if (r0 > 0) goto L_0x0435
            int r0 = r3.A0B     // Catch:{ all -> 0x075e }
            if (r0 <= 0) goto L_0x043b
        L_0x0435:
            int r0 = r3.A0C     // Catch:{ all -> 0x075e }
            int r0 = r0 + 1
            r3.A0C = r0     // Catch:{ all -> 0x075e }
        L_0x043b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x075e }
            r1.<init>()     // Catch:{ all -> 0x075e }
            java.lang.String r0 = "chatInfo/addUnseen "
            r1.append(r0)     // Catch:{ all -> 0x075e }
            java.lang.String r0 = r3.A0B()     // Catch:{ all -> 0x075e }
            r1.append(r0)     // Catch:{ all -> 0x075e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x075e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x075e }
            monitor-exit(r3)
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0470
            boolean r0 = r6.A19
            if (r0 == 0) goto L_0x0470
            int r0 = r3.A0A
            if (r0 >= 0) goto L_0x0470
            r0 = 8388608(0x800000, double:4.144523E-317)
            boolean r0 = r6.A11(r0)
            if (r0 != 0) goto L_0x0470
            monitor-enter(r3)
            r0 = 0
            r3.A0A = r0     // Catch:{ all -> 0x075e }
            r3.A0a = r7     // Catch:{ all -> 0x075e }
            monitor-exit(r3)
        L_0x0470:
            long r0 = r6.A0x
            r3.A0P = r0
            long r0 = r6.A0y
            r3.A0Q = r0
            r0 = 0
            r3.A0f = r0
            X.1BI r1 = r3.A0u
            boolean r0 = X.C22971Dz.A0S(r1)
            if (r0 == 0) goto L_0x0489
            X.1ED r1 = (X.AnonymousClass1ED) r1
            int r0 = r1.A00
            r3.A05 = r0
        L_0x0489:
            if (r17 == 0) goto L_0x0495
            boolean r0 = X.AnonymousClass25A.A0M(r11, r6)
            if (r0 == 0) goto L_0x0495
            long r0 = r6.A0x
            r3.A0N = r0
        L_0x0495:
            r0 = 36
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r10 != r0) goto L_0x06ab
            r15 = r6
            X.22v r15 = (X.C442822v) r15
            int r14 = r15.A00
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x06a6
            int r13 = r15.A04
            X.1cl r0 = r3.A0e
            long r0 = r0.ephemeralSettingTimestamp
            long r0 = r0 + r16
            r8 = 4
            r7 = 0
            if (r13 != r8) goto L_0x04b3
            r7 = 3
        L_0x04b3:
            r3.A0E(r14, r0, r7)
            int r1 = r15.A04
            java.lang.Boolean r0 = r15.A0Q
            boolean r18 = r3.A0L(r0, r1)
        L_0x04be:
            boolean r0 = r6 instanceof X.AnonymousClass2MA
            if (r0 == 0) goto L_0x04e5
            r0 = r6
            X.2MA r0 = (X.AnonymousClass2MA) r0
            int r8 = r0.A00
            java.lang.Long r0 = r6.A0T
            X.C17960vV.A07(r0)
            long r0 = r0.longValue()
            int r7 = r6.A00
            r3.A0E(r8, r0, r7)
            if (r18 != 0) goto L_0x04e3
            int r1 = r6.A04
            java.lang.Boolean r0 = r6.A0Q
            boolean r0 = r3.A0L(r0, r1)
            r18 = 0
            if (r0 == 0) goto L_0x04e5
        L_0x04e3:
            r18 = 1
        L_0x04e5:
            boolean r0 = r6 instanceof X.AnonymousClass2M9
            if (r0 == 0) goto L_0x050c
            r0 = r6
            X.2M9 r0 = (X.AnonymousClass2M9) r0
            int r8 = r0.A00
            java.lang.Long r0 = r6.A0T
            X.C17960vV.A07(r0)
            long r0 = r0.longValue()
            int r7 = r6.A00
            r3.A0E(r8, r0, r7)
            if (r18 != 0) goto L_0x050a
            int r1 = r6.A04
            java.lang.Boolean r0 = r6.A0Q
            boolean r0 = r3.A0L(r0, r1)
            r18 = 0
            if (r0 == 0) goto L_0x050c
        L_0x050a:
            r18 = 1
        L_0x050c:
            int r1 = r6.A05
            if (r1 <= 0) goto L_0x0546
            X.1cl r0 = r3.A0e
            int r7 = r0.expiration
            if (r1 != r7) goto L_0x0546
            java.lang.Long r8 = r6.A0T
            if (r8 == 0) goto L_0x0546
            long r14 = r8.longValue()
            long r0 = r0.ephemeralSettingTimestamp
            int r13 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x0546
            long r0 = r6.A0I
            int r13 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r13 > 0) goto L_0x0546
            X.C17960vV.A07(r8)
            long r0 = r8.longValue()
            int r8 = r6.A00
            r3.A0E(r7, r0, r8)
            if (r18 != 0) goto L_0x0544
            int r1 = r6.A04
            java.lang.Boolean r0 = r6.A0Q
            boolean r0 = r3.A0L(r0, r1)
            r18 = 0
            if (r0 == 0) goto L_0x0546
        L_0x0544:
            r18 = 1
        L_0x0546:
            boolean r0 = r6 instanceof X.AnonymousClass2MS
            if (r0 == 0) goto L_0x06a3
            r0 = r6
            X.2MS r0 = (X.AnonymousClass2MS) r0
            int r8 = r0.A00
            r7 = 0
            r0 = 0
            r3.A0E(r8, r0, r7)
            if (r18 != 0) goto L_0x0563
            int r1 = r6.A04
            java.lang.Boolean r0 = r6.A0Q
            boolean r0 = r3.A0L(r0, r1)
            r18 = 0
            if (r0 == 0) goto L_0x0565
        L_0x0563:
            r18 = 1
        L_0x0565:
            boolean r0 = r6 instanceof X.AnonymousClass2MW
            if (r0 == 0) goto L_0x0588
            java.lang.String r0 = "CoreMessageStore/set group type"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r6
            X.2MW r0 = (X.AnonymousClass2MW) r0
            int r1 = r0.A00
            int r0 = r0.A00
            if (r0 == r2) goto L_0x0578
            r7 = 1
        L_0x0578:
            r3.A03 = r1
            if (r1 != r2) goto L_0x0588
            if (r7 == 0) goto L_0x0588
            long r0 = X.AnonymousClass11P.A01(r24)
            long r0 = r0 / r16
            r3.A0K = r0
            r20 = 1
        L_0x0588:
            boolean r0 = r6 instanceof X.C48392Mh
            if (r0 == 0) goto L_0x05d3
            r0 = r6
            X.20i r0 = (X.C436420i) r0
            int r1 = r0.A00
            java.util.Set r0 = X.AnonymousClass2WQ.A01
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 == r0) goto L_0x05a7
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L_0x05a7
            r0 = 124(0x7c, float:1.74E-43)
            if (r1 == r0) goto L_0x05a7
            r0 = 144(0x90, float:2.02E-43)
            if (r1 == r0) goto L_0x05a7
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 != r0) goto L_0x05b2
        L_0x05a7:
            r0 = r6
            X.2Mf r0 = (X.C48372Mf) r0
            int r0 = r0.A1E()
            r3.A03 = r0
            r20 = 1
        L_0x05b2:
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 == r0) goto L_0x05ca
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 == r0) goto L_0x05ca
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == r0) goto L_0x05ca
            r0 = 143(0x8f, float:2.0E-43)
            if (r1 == r0) goto L_0x05ca
            r0 = 148(0x94, float:2.07E-43)
            if (r1 == r0) goto L_0x05ca
            r0 = 149(0x95, float:2.09E-43)
            if (r1 != r0) goto L_0x05d3
        L_0x05ca:
            r0 = r6
            X.2Mf r0 = (X.C48372Mf) r0
            int r0 = r0.A1E()
            r3.A03 = r0
        L_0x05d3:
            boolean r0 = r6 instanceof X.C48352Md
            if (r0 == 0) goto L_0x05f0
            r1 = r6
            X.2Md r1 = (X.C48352Md) r1
            int r0 = r1.A1E()
            r3.A03 = r0
            if (r0 != r2) goto L_0x05f0
            int r0 = r1.A00
            if (r0 == r2) goto L_0x05f0
            long r0 = X.AnonymousClass11P.A01(r24)
            long r0 = r0 / r16
            r3.A0K = r0
            r20 = 1
        L_0x05f0:
            if (r21 == 0) goto L_0x0685
            boolean r0 = r5 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0685
            r0 = r6
            X.20i r0 = (X.C436420i) r0
            int r14 = r0.A00
            r0 = 11
            if (r14 == r0) goto L_0x0601
            if (r14 != r12) goto L_0x0685
        L_0x0601:
            X.00H r8 = r4.A1s
            java.lang.Object r0 = r8.get()
            X.4Q3 r0 = (X.AnonymousClass4Q3) r0
            r13 = 0
            X.0vl r0 = r0.A01
            java.lang.Object r1 = r0.getValue()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r7 = "closed_"
            r15.append(r7)
            java.lang.String r0 = r5.getRawString()
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            boolean r13 = r1.getBoolean(r0, r13)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CommunitySharedPrefs/ getTempIsClosed()/isClosed = "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r14 != r12) goto L_0x0648
            java.lang.String r0 = "CoreMessageStore/updateChatsListForNewMessage/set group type parent (1)"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.A03 = r2
        L_0x0648:
            if (r13 == 0) goto L_0x0651
            r3.A0r = r2
            X.1QW r0 = r4.A1V
            r0.A01(r3)
        L_0x0651:
            java.lang.Object r1 = r8.get()
            X.4Q3 r1 = (X.AnonymousClass4Q3) r1
            java.lang.String r0 = "CommunitySharedPrefs/ clearTempIsClosed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0vl r0 = r1.A01
            java.lang.Object r0 = r0.getValue()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r2 = r0.edit()
            X.C18070vi.A0X(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r0 = r5.getRawString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.content.SharedPreferences$Editor r0 = r2.remove(r0)
            r0.apply()
        L_0x0685:
            if (r20 == 0) goto L_0x06c6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/community activity key="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = X.AnonymousClass11P.A01(r24)
            long r0 = r0 / r16
            monitor-enter(r3)
            goto L_0x06af
        L_0x06a3:
            r7 = 0
            goto L_0x0565
        L_0x06a6:
            r7 = 0
            long r0 = r15.A0I
            goto L_0x04b3
        L_0x06ab:
            r18 = 0
            goto L_0x04be
        L_0x06af:
            r3.A0M = r0     // Catch:{ all -> 0x075e }
            monitor-exit(r3)
            X.0z4 r2 = r4.A0B
            android.content.SharedPreferences$Editor r7 = X.C19830z4.A00(r2)
            java.lang.String r2 = "last_community_activity"
            android.content.SharedPreferences$Editor r0 = r7.putLong(r2, r0)
            r0.apply()
            X.1QW r0 = r4.A1V
            r0.A01(r3)
        L_0x06c6:
            r0 = 2097152(0x200000, double:1.0361308E-317)
            boolean r0 = r6.A11(r0)
            if (r0 == 0) goto L_0x06dc
            X.1BI r0 = r3.A08()
            boolean r0 = X.C22971Dz.A0O(r0)
            if (r0 == 0) goto L_0x06dc
            r0 = 5
            r3.A03 = r0
        L_0x06dc:
            if (r18 == 0) goto L_0x06f5
            r2 = 5309(0x14bd, float:7.44E-42)
            X.0vf r1 = X.C18040vf.A02
            r0 = r25
            boolean r0 = X.C18020vd.A05(r1, r0, r2)
            if (r0 == 0) goto L_0x06f5
            X.00H r0 = r4.A1u
            java.lang.Object r0 = r0.get()
            X.2if r0 = (X.C57182if) r0
            r0.A00(r3)
        L_0x06f5:
            X.1LW r1 = r4.A0C
            r0 = r19
            android.content.ContentValues r0 = r3.A07(r0)
            boolean r0 = r1.A0M(r0, r3)
            if (r0 != 0) goto L_0x074b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/addmsg/chatlist/insert/failed gid="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0717:
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0018
            int r1 = r6.A0D()
            r0 = 6
            if (r1 == r0) goto L_0x0018
            X.1Qq r4 = r4.A0L
            java.util.Map r3 = r4.A02()
            X.2SC r2 = new X.2SC
            r2.<init>()
            r2.A01 = r5
            r2.A00 = r10
            java.lang.Object r0 = r3.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            r1 = 1
            if (r0 == 0) goto L_0x073f
            int r0 = r0.intValue()
            int r1 = r1 + r0
        L_0x073f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.put(r2, r0)
            r0 = 0
            X.C26051Qq.A00(r4, r5, r10, r1, r0)
            return
        L_0x074b:
            boolean r0 = X.AnonymousClass25A.A0O(r11, r6)
            if (r0 == 0) goto L_0x0717
            X.11A r2 = r4.A12
            r1 = 14
            X.3Bx r0 = new X.3Bx
            r0.<init>(r4, r5, r1)
            r2.A00(r0)
            goto L_0x0717
        L_0x075e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.A0Q(X.206):void");
    }

    public void A0T(AnonymousClass21L r6) {
        C20285AEt aEt;
        C20279AEn aEn;
        AnonymousClass206 A032;
        if (C18020vd.A05(C18040vf.A02, this.A0q, 4893) && (aEt = r6.A00) != null && (aEn = aEt.A02) != null && aEn.A0H != null) {
            AEU aeu = aEn.A0D;
            if (C20089A6r.A01(aeu.A01) == 1 || C20089A6r.A01(aeu.A01) == 7) {
                String str = aEn.A0H;
                C18070vi.A0d(str, 0);
                String str2 = (String) AnonymousClass4GT.A00(AnonymousClass1OR.A00, new OrderRequestMessageManager$getOrderRequestMessageRowId$1((C54262dr) this.A20.get(), str, (C30391dr) null));
                if (str2 != null && (A032 = ((AnonymousClass1W6) this.A1E.get()).A01.A03(Long.parseLong(str2))) != null && (A032 instanceof AnonymousClass22U)) {
                    AnonymousClass22U r1 = (AnonymousClass22U) A032;
                    r1.A02 = 2;
                    CQw(r1);
                }
            }
        }
    }

    public void A0U(Collection collection) {
        C24661Le r4 = this.A0g;
        r4.A0F(collection);
        C63372sx A072 = r4.A07();
        if (A072 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("regenerateStatsInfo for MeJid ");
            sb.append(A072);
            Log.i(sb.toString());
            AnonymousClass1TG r2 = (AnonymousClass1TG) this.A1L.get();
            C17960vV.A01();
            C63372sx A002 = AnonymousClass1TG.A00(A072, r2, r2.A04(A072.A0A, -1));
            if (A002 != null) {
                r4.A0D(A002, AnonymousClass1E5.A00);
            } else {
                Log.i("deleting MeJid status from StatusStore/updateMyStatus");
                r4.A06(AnonymousClass1E5.A00);
            }
        }
        this.A0O.A01.post(new AnonymousClass3Bx(this, collection, 12));
    }

    public void A0V(Collection collection, int i) {
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        boolean z = false;
        if ((i & 8) == 8) {
            z = true;
        }
        Collection collection2 = collection;
        Iterator it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                AnonymousClass206 r1 = (AnonymousClass206) it.next();
                BIJ(r1, i, false);
                AnonymousClass1BI r4 = r1.A0v.A00;
                hashSet.add(r4);
                if (z) {
                    Long l = r1.A0U;
                    C17960vV.A07(l);
                    long longValue = l.longValue();
                    Number number = (Number) hashMap.get(r4);
                    if (number != null) {
                        longValue = Math.max(number.longValue(), longValue);
                    }
                    hashMap.put(r4, Long.valueOf(longValue));
                }
            } else {
                this.A0O.A01.post(new C21437Ak4(this, collection2, hashMap, hashSet, 11, z));
                return;
            }
        }
    }

    public void A0W(Collection collection, int i, boolean z) {
        boolean z2;
        Collection<AnonymousClass206> collection2 = collection;
        int i2 = i;
        if (z) {
            AnonymousClass1BI A062 = AnonymousClass25A.A06(collection2);
            if (A062 != null) {
                C25991Qk r2 = this.A0I;
                C56192h3 A012 = C25991Qk.A01(r2, r2.A00.A09(A062));
                String str = "action_singular_delete";
                if (A012 != null) {
                    List list = A012.A09;
                    if (list != null) {
                        BID(A012, new C676830l(this), true);
                    }
                    AnonymousClass1RQ r4 = this.A0E;
                    ((A7W) r4.A02.get()).A09(String.valueOf(A062.hashCode()));
                    if (this.A0D.A0T(A012.A07)) {
                        str = "action_delete";
                    } else if (list == null || A012.A04 != Long.MIN_VALUE) {
                        str = "action_clear";
                    }
                    z2 = A012.A0C;
                } else {
                    z2 = false;
                }
                ArrayList arrayList = new ArrayList();
                for (AnonymousClass206 r0 : collection2) {
                    arrayList.add(Long.valueOf(r0.A0x));
                }
                boolean z3 = false;
                if ((i & 1) == 1) {
                    z3 = true;
                }
                A04(this, A062, str, arrayList, z3, z2);
                C29691ci A002 = AnonymousClass1CJ.A00(this.A0D, A062);
                if (A002 != null) {
                    Iterator it = collection2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (A002.A0P == ((AnonymousClass206) it.next()).A0x) {
                                CQa(A062);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                this.A0O.A01.post(new AnonymousClass7RT(this, collection2, A062, 23, true));
                return;
            }
            return;
        }
        A0V(collection2, i2);
    }

    public void A0X(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass206 r6 = (AnonymousClass206) it.next();
            if (r6 instanceof AnonymousClass21V) {
                AnonymousClass21V r5 = (AnonymousClass21V) r6;
                C17960vV.A01();
                if (r5.A02 != null) {
                    C25321Nt r3 = this.A0Q;
                    r3.A06(r5, true, false);
                    C62572rc r2 = r5.A02;
                    if (!(r2 == null || r2.A0G == null)) {
                        r2.A0A = 0;
                        r2.A0G = null;
                        r2.A0J = null;
                        r2.A0a = null;
                        r3.A05(r5);
                    }
                }
            } else if (r6 instanceof AnonymousClass210) {
                r6.A0i("");
            }
            hashSet.add(String.valueOf(r6.A0x));
        }
        this.A1c.A05(hashSet);
    }

    public boolean A0Y(AnonymousClass1BI r7, Long l) {
        boolean z;
        AnonymousClass206 A0D2;
        AnonymousClass1PM r2 = this.A09;
        C22941Dw r0 = UserJid.Companion;
        C63852tn r5 = new C63852tn(r2, (C25491Ok) this.A1r.get(), C22941Dw.A01(r7));
        AnonymousClass1E7 A0E2 = this.A08.A0E(r7);
        if (!C84104Hw.A00(this.A0q) || A0E2 == null || !A0E2.A0E()) {
            z = false;
            A0D2 = this.A11.A0D(r7, r5.A02(), AnonymousClass11P.A01(this.A0A));
        } else {
            z = true;
            A0D2 = this.A15.A01(r7, true);
        }
        A0D2.A0W = l;
        A07(this, A0D2, -1);
        StringBuilder sb = new StringBuilder();
        sb.append("CoreMessageStore/added plaintext disabled message; jid=");
        sb.append(r7);
        sb.append("; is3P=");
        sb.append(z);
        Log.i(sb.toString());
        return A0J(A0D2, -1).A00;
    }

    public void BAz(AnonymousClass1BI r16, C59812mv r17) {
        int[][] iArr;
        C63852tn r5;
        C63852tn r2;
        C42691ya r1;
        C59812mv r3 = r17;
        C42691ya r22 = r3.A05;
        AnonymousClass1BI r10 = r16;
        if ((r22 == null || (r22.actualActors == 0 && r22.privacyModeTs == 0 && r22.hostStorage == 0)) && (r1 = r3.A03) == 0 && r3.A07 == null && r16 != null && !this.A0a.A09(r10)) {
            C22941Dw r0 = UserJid.Companion;
            if (!((C25491Ok) this.A1r.get()).A00(C22941Dw.A01(r10))) {
                A0Y(r10, (Long) null);
                r5 = new C63852tn(r22, r3.A02, r1);
                r2 = new C63852tn(r3.A04, r3.A00, r3.A01);
                r1 = r5.A01;
                if (r1.actualActors != 0 && r1.hostStorage != 0 && r5.A05() && !r2.A05() && this.A0B.A2M() && r16 != null) {
                    AnonymousClass1PQ r12 = this.A11;
                    BBY(new C436420i(r12.A02.A01(r10, true), 63, AnonymousClass11P.A01(this.A0A)));
                    return;
                }
            }
        }
        AnonymousClass1RZ r4 = this.A14;
        int i = r3.A03;
        int i2 = r3.A01;
        String str = r3.A06;
        if (C22971Dz.A0Y(r10) || C22971Dz.A0U(r10)) {
            C18030ve r8 = r4.A03;
            if (!C43381zi.A01(r8, r10)) {
                C63852tn r7 = new C63852tn(r22, r3.A02, i);
                C63852tn r52 = new C63852tn(r3.A04, r3.A00, i2);
                Arrays.toString(Thread.currentThread().getStackTrace());
                int A022 = r7.A02();
                int A023 = r52.A02();
                if (C18020vd.A05(C18040vf.A02, r8, 2320)) {
                    A022 = C60962ot.A00(A022);
                    A023 = C60962ot.A00(A023);
                    iArr = C60962ot.A00;
                } else if (A022 <= 10 && A023 <= 10) {
                    iArr = AnonymousClass2W7.A00;
                }
                int i3 = iArr[A022][A023];
                if (i3 > 0) {
                    if (TextUtils.isEmpty(str)) {
                        str = AnonymousClass17K.A00(C42771yi.A00(), r10);
                    }
                    BBY(r4.A04.A03(r10, str, i3, AnonymousClass11P.A01(r4.A02)));
                }
            }
        }
        r5 = new C63852tn(r22, r3.A02, i);
        r2 = new C63852tn(r3.A04, r3.A00, r3.A01);
        r1 = r5.A01;
        if (r1.actualActors != 0 || r1.hostStorage != 0 || r5.A05() || !r2.A05() || this.A0B.A2M()) {
        }
    }

    public void BBM(AnonymousClass206 r3) {
        int i = -1;
        if (r3.A19) {
            i = 22;
        }
        BBN(r3, i);
    }

    public void BBN(AnonymousClass206 r6, int i) {
        AnonymousClass1PT r1 = this.A0w;
        if (r1.A0b) {
            r1.A0G.A04(r6.A0v.A01.hashCode(), 4, -1, r6.A0u);
        }
        ((C31931gM) this.A16.get()).A01(new C21470Akb((Object) this, i, 49, (Object) r6), 26);
    }

    public C49742Rs BBY(AnonymousClass206 r3) {
        int i = -1;
        if (r3.A19) {
            i = 22;
        }
        return BBZ(r3, i);
    }

    public boolean BBj(AnonymousClass1BI r6) {
        if (!this.A0u.A02(r6)) {
            return false;
        }
        C19880zA r1 = this.A1N;
        if (!r1.A07()) {
            return false;
        }
        if (!C18020vd.A05(C18040vf.A02, ((C26151Ra) r1.A03()).A00, 5626)) {
            return false;
        }
        AnonymousClass1PQ r12 = this.A11;
        C436420i r13 = new C436420i(r12.A02.A01(r6, true), 156, AnonymousClass11P.A01(this.A0A));
        A07(this, r13, -1);
        return A0J(r13, -1).A00;
    }

    public boolean BEj(AnonymousClass1BI r9) {
        Cursor A0A2;
        boolean z = false;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(String.valueOf(this.A0C.A09(r9)));
        arrayList.add(String.valueOf(new int[]{87}[0]));
        C28781at A042 = this.A0V.get();
        try {
            C23141Ev r3 = ((C28801av) A042).A02;
            String str = AnonymousClass203.A0P;
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT  1  FROM available_message_view WHERE chat_row_id = ? AND ");
            sb.append("message_type IN ");
            sb.append(AnonymousClass1H2.A00(1));
            sb.append(" LIMIT 1");
            A0A2 = r3.A0A(sb.toString(), "CHECK_MSG_EXISTENCE_BY_JID_IN_CHAT", (String[]) arrayList.toArray(new String[0]));
            if (A0A2.getCount() > 0) {
                z = true;
            }
            A0A2.close();
            A042.close();
            return z;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ce, code lost:
        if (r11 != false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012e, code lost:
        if (((X.C57492jA) r7.A15.A01.get()).A00(r14) <= 0) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0060, code lost:
        if (r0.A01 != 1) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BEq(X.AnonymousClass1BI r21, java.lang.Long r22, boolean r23, boolean r24) {
        /*
            r20 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/clearmsgs/service/jid "
            r1.append(r0)
            r14 = r21
            r1.append(r14)
            java.lang.String r0 = " excludeStarred:"
            r1.append(r0)
            r2 = r23
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = r20
            X.1Q2 r0 = r7.A0O
            android.os.Handler r6 = r0.A01
            java.lang.String r0 = r14.getRawString()
            r5 = 1
            android.os.Message r0 = android.os.Message.obtain(r6, r5, r0)
            r0.sendToTarget()
            X.1Qk r13 = r7.A0I
            X.1LW r0 = r13.A00
            long r0 = r0.A09(r14)
            X.2h3 r0 = X.C25991Qk.A01(r13, r0)
            if (r0 == 0) goto L_0x007a
            java.util.List r1 = r0.A09
            boolean r0 = r0.A0B
        L_0x0044:
            r17 = r23 ^ 1
            r8 = 0
            r15 = r22
            r18 = r24
            r19 = r0
            r16 = r1
            X.2h3 r9 = r13.A03(r14, r15, r16, r17, r18, r19)
            if (r9 == 0) goto L_0x0118
            X.1CJ r0 = r7.A0D
            X.1ci r0 = X.AnonymousClass1CJ.A00(r0, r14)
            if (r0 == 0) goto L_0x0062
            int r0 = r0.A01
            r13 = 1
            if (r0 == r5) goto L_0x0063
        L_0x0062:
            r13 = 0
        L_0x0063:
            if (r23 == 0) goto L_0x00d0
            boolean r0 = X.C22971Dz.A0e(r14)
            if (r0 != 0) goto L_0x0134
            boolean r0 = X.C22971Dz.A0N(r14)
            if (r0 != 0) goto L_0x0134
            X.1N2 r1 = r7.A0h
            X.1Cd r0 = r1.A03
            X.1at r12 = r0.get()
            goto L_0x007d
        L_0x007a:
            r1 = 0
            r0 = 0
            goto L_0x0044
        L_0x007d:
            r0 = r12
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00c1 }
            X.1Ev r10 = r0.A02     // Catch:{ all -> 0x00c1 }
            java.lang.String r4 = "SELECT EXISTS( SELECT * FROM message_system JOIN message ON message._id = message_system.message_row_id  WHERE chat_row_id = ?  AND  (action_type = 61 OR action_type = 69 )) as has_biz_state_change"
            r11 = 1
            java.lang.String[] r3 = new java.lang.String[r5]     // Catch:{ all -> 0x00c1 }
            X.1LW r0 = r1.A01     // Catch:{ all -> 0x00c1 }
            long r0 = r0.A09(r14)     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00c1 }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "GET_BIZ_STATE_CHANGE_SQL"
            android.database.Cursor r3 = r10.A0A(r4, r0, r3)     // Catch:{ all -> 0x00c1 }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = "has_biz_state_change"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b5 }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x00b5 }
            if (r0 == r5) goto L_0x00ad
            r11 = 0
        L_0x00ad:
            r3.close()     // Catch:{ all -> 0x00c1 }
            goto L_0x00cb
        L_0x00b1:
            r3.close()     // Catch:{ all -> 0x00c1 }
            goto L_0x0131
        L_0x00b5:
            r1 = move-exception
            if (r3 == 0) goto L_0x00c0
            r3.close()     // Catch:{ all -> 0x00bc }
            goto L_0x00c0
        L_0x00bc:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00c1 }
        L_0x00c0:
            throw r1     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x00c6 }
            throw r1
        L_0x00c6:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x00cb:
            r12.close()
            if (r11 == 0) goto L_0x0134
        L_0x00d0:
            boolean r0 = r7.A0D(r14)
            if (r0 == 0) goto L_0x00db
            if (r23 == 0) goto L_0x011b
            r7.CI5(r14, r5)
        L_0x00db:
            r1 = 0
        L_0x00dc:
            r7.CQa(r14)
            if (r13 == 0) goto L_0x00ec
            java.lang.String r0 = "CoreMessageStore/clearmsgs/service/ adding plaintext disabled message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7.A0Y(r14, r8)
            r7.BBj(r14)
        L_0x00ec:
            if (r1 == 0) goto L_0x0105
            X.1M9 r0 = r7.A08
            X.1E7 r0 = r0.A0E(r14)
            X.1PV r1 = r7.A15
            if (r0 == 0) goto L_0x0119
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x0119
        L_0x00fe:
            X.2M8 r0 = r1.A01(r14, r5)
            r7.BBM(r0)
        L_0x0105:
            r1 = 2
            java.lang.String r0 = r14.getRawString()
            android.os.Message r0 = android.os.Message.obtain(r6, r1, r0)
            r0.sendToTarget()
            X.1RQ r1 = r7.A0E
            java.lang.String r0 = "action_clear"
            r1.A00(r9, r0)
        L_0x0118:
            return
        L_0x0119:
            r5 = 0
            goto L_0x00fe
        L_0x011b:
            X.1PV r0 = r7.A15
            X.00H r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.2jA r0 = (X.C57492jA) r0
            long r3 = r0.A00(r14)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 > 0) goto L_0x00dc
            goto L_0x00db
        L_0x0131:
            r12.close()
        L_0x0134:
            boolean r0 = r7.CIH(r14, r5)
            r0 = r0 ^ 1
            r13 = r13 & r0
            goto L_0x00d0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.BEq(X.1BI, java.lang.Long, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        r23.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03bb, code lost:
        if (r6 == null) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03c5, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0269, code lost:
        r10 = new java.lang.StringBuilder();
        r10.append("CoreMessageStore/deletemsgs/batches stopped at ref:");
        r10.append(r3);
        com.whatsapp.util.Log.w(r10.toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03c8 A[EDGE_INSN: B:194:0x03c8->B:186:0x03c8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0146 A[Catch:{ SQLiteDiskIOException -> 0x037d, all -> 0x03ae }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BID(X.C56192h3 r37, X.AnonymousClass3MJ r38, boolean r39) {
        /*
            r36 = this;
            r2 = r37
            r1 = 1
            if (r39 == 0) goto L_0x000a
            java.util.List r0 = r2.A09
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            int r3 = r2.A00
            if (r3 >= r1) goto L_0x0061
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/deletemsgs/batches block size is not positive:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " for jid:"
            r1.append(r0)
            X.1BI r13 = r2.A07
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            long r11 = r2.A06
            long r9 = r2.A01
            long r7 = r2.A04
            long r5 = r2.A05
            boolean r0 = r2.A0C
            r33 = r0
            boolean r0 = r2.A0B
            r34 = r0
            long r3 = r2.A02
            long r0 = r2.A03
            java.lang.String r15 = r2.A08
            java.util.List r14 = r2.A09
            r20 = 100
            X.2h3 r2 = new X.2h3
            r16 = r2
            r17 = r13
            r18 = r15
            r19 = r14
            r21 = r11
            r23 = r9
            r25 = r7
            r27 = r5
            r29 = r3
            r31 = r0
            r35 = r33
            r16.<init>(r17, r18, r19, r20, r21, r23, r25, r27, r29, r31, r33, r34, r35)
        L_0x0061:
            X.C17960vV.A01()
            java.lang.String r1 = "msgstore/deletemsgs/batches"
            X.1Ez r21 = new X.1Ez
            r0 = r21
            r0.<init>((java.lang.String) r1)
            r28 = r38
            r28.C6A()
            r1 = r36
            if (r39 == 0) goto L_0x0369
            java.util.List r0 = r2.A09
            if (r0 != 0) goto L_0x0363
            r7 = 0
        L_0x007b:
            X.1N2 r3 = r1.A0h
            X.1BI r0 = r2.A07
            long r3 = r3.A01(r0)
            X.1NJ r5 = r1.A0d
            r5.A04(r3)
            A03(r1, r2)
            r6 = 0
            r5 = 0
        L_0x008d:
            boolean r3 = r28.CMS()
            if (r3 != 0) goto L_0x03c8
            X.1Qk r4 = r1.A0I     // Catch:{ all -> 0x03ba }
            X.1Cd r9 = r4.A02     // Catch:{ all -> 0x03ba }
            X.1at r12 = r9.get()     // Catch:{ all -> 0x03ba }
            if (r39 == 0) goto L_0x00f0
            java.util.List r8 = r2.A09     // Catch:{ all -> 0x03b0 }
            if (r8 == 0) goto L_0x00f0
            int r4 = r8.size()     // Catch:{ all -> 0x03b0 }
            r3 = 999(0x3e7, float:1.4E-42)
            if (r4 <= r3) goto L_0x00b0
            java.lang.String r3 = "msgstore/deletemsgs/getSingularDeletedChats too many messages to delete"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x03b0 }
            goto L_0x0134
        L_0x00b0:
            int r11 = r8.size()     // Catch:{ all -> 0x03b0 }
            java.lang.String[] r10 = new java.lang.String[r11]     // Catch:{ all -> 0x03b0 }
            r4 = 0
        L_0x00b7:
            if (r4 >= r11) goto L_0x00c8
            java.lang.Object r3 = r8.get(r4)     // Catch:{ all -> 0x03b0 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x03b0 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x03b0 }
            r10[r4] = r3     // Catch:{ all -> 0x03b0 }
            int r4 = r4 + 1
            goto L_0x00b7
        L_0x00c8:
            X.1at r9 = r9.get()     // Catch:{ all -> 0x03b0 }
            r3 = r9
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x0373 }
            X.1Ev r8 = r3.A02     // Catch:{ all -> 0x0373 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0373 }
            r4.<init>()     // Catch:{ all -> 0x0373 }
            java.lang.String r3 = "SELECT * FROM deleted_messages_view WHERE _id IN "
            r4.append(r3)     // Catch:{ all -> 0x0373 }
            java.lang.String r3 = X.AnonymousClass1H2.A00(r11)     // Catch:{ all -> 0x0373 }
            r4.append(r3)     // Catch:{ all -> 0x0373 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0373 }
            java.lang.String r3 = "GET_SINGULAR_MESSAGE_CURSOR"
            android.database.Cursor r13 = r8.A0A(r4, r3, r10)     // Catch:{ all -> 0x0373 }
            r9.close()     // Catch:{ all -> 0x03b0 }
            goto L_0x0116
        L_0x00f0:
            r3 = r12
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x03b0 }
            X.1Ev r10 = r3.A02     // Catch:{ all -> 0x03b0 }
            java.lang.String r9 = X.C50702Vl.A00     // Catch:{ all -> 0x03b0 }
            r3 = 2
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x03b0 }
            X.1LW r3 = r4.A00     // Catch:{ all -> 0x03b0 }
            long r3 = r3.A09(r0)     // Catch:{ all -> 0x03b0 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x03b0 }
            r3 = 0
            r8[r3] = r4     // Catch:{ all -> 0x03b0 }
            int r3 = r2.A00     // Catch:{ all -> 0x03b0 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x03b0 }
            r3 = 1
            r8[r3] = r4     // Catch:{ all -> 0x03b0 }
            java.lang.String r3 = "GET_DELETED_MESSAGES_BY_ID_SQL"
            android.database.Cursor r13 = r10.A0A(r9, r3, r8)     // Catch:{ all -> 0x03b0 }
        L_0x0116:
            if (r13 == 0) goto L_0x0135
            boolean r3 = r13.moveToFirst()     // Catch:{ all -> 0x03b0 }
            if (r3 == 0) goto L_0x0135
            java.lang.String r3 = "_id"
            int r3 = r13.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x03b0 }
            long r14 = r13.getLong(r3)     // Catch:{ all -> 0x03b0 }
            java.lang.String r3 = "sort_id"
            int r3 = r13.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x03b0 }
            long r16 = r13.getLong(r3)     // Catch:{ all -> 0x03b0 }
            goto L_0x0139
        L_0x0134:
            r13 = 0
        L_0x0135:
            r14 = 1
            r16 = -9223372036854775808
        L_0x0139:
            r12.close()     // Catch:{ all -> 0x03ba }
            X.2dp r12 = new X.2dp     // Catch:{ all -> 0x03ba }
            r12.<init>(r13, r14, r16)     // Catch:{ all -> 0x03ba }
            r6 = r12
            android.database.Cursor r8 = r12.A00     // Catch:{ all -> 0x03ae }
            if (r8 == 0) goto L_0x03c8
            long r3 = r12.A01     // Catch:{ all -> 0x03ae }
            r10 = 1
            int r9 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x03a9
            r8.getCount()     // Catch:{ all -> 0x03ae }
            java.util.HashSet r20 = r1.Br7(r8, r0)     // Catch:{ all -> 0x03ae }
            java.util.ArrayList r19 = new java.util.ArrayList     // Catch:{ all -> 0x03ae }
            r19.<init>()     // Catch:{ all -> 0x03ae }
            r8.moveToFirst()     // Catch:{ all -> 0x03ae }
        L_0x015d:
            java.lang.String r15 = "key_id"
            int r9 = r8.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x03ae }
            java.lang.String r10 = r8.getString(r9)     // Catch:{ all -> 0x03ae }
            r9 = r19
            r9.add(r10)     // Catch:{ all -> 0x03ae }
            boolean r9 = r8.moveToNext()     // Catch:{ all -> 0x03ae }
            if (r9 != 0) goto L_0x015d
            java.util.List r9 = r2.A09     // Catch:{ all -> 0x03ae }
            if (r9 == 0) goto L_0x01ff
            int r10 = r9.size()     // Catch:{ all -> 0x03ae }
            if (r10 <= 0) goto L_0x01ff
            X.0ve r12 = r1.A0q     // Catch:{ all -> 0x03ae }
            r11 = 9868(0x268c, float:1.3828E-41)
            X.0vf r10 = X.C18040vf.A02     // Catch:{ all -> 0x03ae }
            boolean r10 = X.C18020vd.A05(r10, r12, r11)     // Catch:{ all -> 0x03ae }
            if (r10 == 0) goto L_0x01ff
            java.util.LinkedList r12 = new java.util.LinkedList     // Catch:{ all -> 0x03ae }
            r12.<init>()     // Catch:{ all -> 0x03ae }
            r10 = 1
            boolean r11 = r8.moveToFirst()     // Catch:{ SQLiteDiskIOException -> 0x037d }
            if (r11 == 0) goto L_0x01b2
        L_0x0194:
            X.00H r11 = r1.A1E     // Catch:{ SQLiteDiskIOException -> 0x037d }
            java.lang.Object r11 = r11.get()     // Catch:{ SQLiteDiskIOException -> 0x037d }
            X.1W6 r11 = (X.AnonymousClass1W6) r11     // Catch:{ SQLiteDiskIOException -> 0x037d }
            r13 = 0
            X.C18070vi.A0d(r0, r10)     // Catch:{ SQLiteDiskIOException -> 0x037d }
            X.1W2 r11 = r11.A01     // Catch:{ SQLiteDiskIOException -> 0x037d }
            X.206 r11 = r11.A04(r8, r0, r10, r13)     // Catch:{ SQLiteDiskIOException -> 0x037d }
            X.C17960vV.A07(r11)     // Catch:{ SQLiteDiskIOException -> 0x037d }
            r12.add(r11)     // Catch:{ SQLiteDiskIOException -> 0x037d }
            boolean r11 = r8.moveToNext()     // Catch:{ SQLiteDiskIOException -> 0x037d }
            if (r11 != 0) goto L_0x0194
        L_0x01b2:
            java.util.HashSet r11 = new java.util.HashSet     // Catch:{ all -> 0x03ae }
            r11.<init>()     // Catch:{ all -> 0x03ae }
            java.util.Iterator r13 = r9.iterator()     // Catch:{ all -> 0x03ae }
        L_0x01bb:
            boolean r10 = r13.hasNext()     // Catch:{ all -> 0x03ae }
            if (r10 == 0) goto L_0x01cb
            java.lang.Object r10 = r13.next()     // Catch:{ all -> 0x03ae }
            if (r10 == 0) goto L_0x01bb
            r11.add(r10)     // Catch:{ all -> 0x03ae }
            goto L_0x01bb
        L_0x01cb:
            java.util.LinkedList r14 = new java.util.LinkedList     // Catch:{ all -> 0x03ae }
            r14.<init>()     // Catch:{ all -> 0x03ae }
            java.util.Iterator r16 = r12.iterator()     // Catch:{ all -> 0x03ae }
        L_0x01d4:
            boolean r10 = r16.hasNext()     // Catch:{ all -> 0x03ae }
            if (r10 == 0) goto L_0x01f2
            java.lang.Object r10 = r16.next()     // Catch:{ all -> 0x03ae }
            X.206 r10 = (X.AnonymousClass206) r10     // Catch:{ all -> 0x03ae }
            if (r10 == 0) goto L_0x01d4
            long r12 = r10.A0x     // Catch:{ all -> 0x03ae }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x03ae }
            boolean r12 = r11.contains(r12)     // Catch:{ all -> 0x03ae }
            if (r12 == 0) goto L_0x01d4
            r14.add(r10)     // Catch:{ all -> 0x03ae }
            goto L_0x01d4
        L_0x01f2:
            X.1RT r13 = r1.A0c     // Catch:{ all -> 0x03ae }
            boolean r12 = r2.A0B     // Catch:{ all -> 0x03ae }
            r11 = 6
            X.35W r10 = new X.35W     // Catch:{ all -> 0x03ae }
            r10.<init>((java.util.Collection) r14, (int) r11, (boolean) r12)     // Catch:{ all -> 0x03ae }
            r13.notifyAllObservers(r10)     // Catch:{ all -> 0x03ae }
        L_0x01ff:
            X.1Cd r10 = r1.A0V     // Catch:{ all -> 0x03ae }
            X.1au r23 = r10.A05()     // Catch:{ all -> 0x03ae }
            X.1xA r18 = r23.BD0()     // Catch:{ all -> 0x039f }
            if (r9 == 0) goto L_0x022d
            java.util.Iterator r12 = r9.iterator()     // Catch:{ all -> 0x0395 }
        L_0x020f:
            boolean r10 = r12.hasNext()     // Catch:{ all -> 0x0395 }
            if (r10 == 0) goto L_0x022d
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x0395 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0395 }
            if (r11 == 0) goto L_0x020f
            X.1RU r10 = r1.A0x     // Catch:{ all -> 0x0395 }
            long r25 = r11.longValue()     // Catch:{ all -> 0x0395 }
            r24 = 1
            r27 = 0
            r22 = r10
            r22.ByM(r23, r24, r25, r27)     // Catch:{ all -> 0x0395 }
            goto L_0x020f
        L_0x022d:
            r12 = 0
            r10 = 3
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ all -> 0x0395 }
            long r10 = r2.A01     // Catch:{ all -> 0x0395 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0395 }
            r13[r12] = r10     // Catch:{ all -> 0x0395 }
            long r10 = r6.A02     // Catch:{ all -> 0x0395 }
            java.lang.String r11 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0395 }
            r10 = 1
            r13[r10] = r11     // Catch:{ all -> 0x0395 }
            int r10 = r2.A00     // Catch:{ all -> 0x0395 }
            java.lang.String r11 = java.lang.Integer.toString(r10)     // Catch:{ all -> 0x0395 }
            r10 = 2
            r13[r10] = r11     // Catch:{ all -> 0x0395 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0395 }
            r11.<init>()     // Catch:{ all -> 0x0395 }
            java.lang.String r10 = "_id IN (   SELECT _id   FROM deleted_messages_ids_view   WHERE chat_row_id = ?    AND sort_id>=?    ORDER BY sort_id ASC   LIMIT ?)"
            r11.append(r10)     // Catch:{ all -> 0x0395 }
            java.lang.String r14 = r11.toString()     // Catch:{ all -> 0x0395 }
            java.lang.String r12 = "deleteAllMessagesForJidInBatchesBackground/DELETE_MESSAGE"
            r10 = r23
            X.1av r10 = (X.C28801av) r10     // Catch:{ all -> 0x0395 }
            X.1Ev r11 = r10.A02     // Catch:{ all -> 0x0395 }
            java.lang.String r10 = "message"
            int r17 = r11.A04(r10, r14, r12, r13)     // Catch:{ all -> 0x0395 }
            if (r17 != 0) goto L_0x027f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0395 }
            r10.<init>()     // Catch:{ all -> 0x0395 }
            java.lang.String r9 = "CoreMessageStore/deletemsgs/batches stopped at ref:"
            r10.append(r9)     // Catch:{ all -> 0x0395 }
            r10.append(r3)     // Catch:{ all -> 0x0395 }
            java.lang.String r3 = r10.toString()     // Catch:{ all -> 0x0395 }
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ all -> 0x0395 }
            goto L_0x0384
        L_0x027f:
            if (r9 == 0) goto L_0x02c8
            java.util.Iterator r13 = r9.iterator()     // Catch:{ all -> 0x0395 }
        L_0x0285:
            boolean r3 = r13.hasNext()     // Catch:{ all -> 0x0395 }
            if (r3 == 0) goto L_0x02c8
            java.lang.Object r3 = r13.next()     // Catch:{ all -> 0x0395 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0395 }
            if (r3 == 0) goto L_0x0285
            long r3 = r3.longValue()     // Catch:{ all -> 0x0395 }
            r10 = 1
            r9 = 0
            java.lang.String[] r12 = new java.lang.String[r10]     // Catch:{ all -> 0x0395 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0395 }
            r12[r9] = r3     // Catch:{ all -> 0x0395 }
            java.lang.String r4 = X.C50862Wb.A00     // Catch:{ all -> 0x0395 }
            java.lang.String r3 = "SELECT_ALL_COMMENTS_FOR_PARENT_MESSAGE_QUERY_ID"
            android.database.Cursor r4 = r11.A0A(r4, r3, r12)     // Catch:{ all -> 0x0395 }
            X.C18070vi.A0X(r4)     // Catch:{ all -> 0x0395 }
        L_0x02ac:
            boolean r3 = r4.moveToNext()     // Catch:{ all -> 0x038b }
            if (r3 == 0) goto L_0x02c4
            X.00H r3 = r1.A1E     // Catch:{ all -> 0x038b }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x038b }
            X.1W6 r3 = (X.AnonymousClass1W6) r3     // Catch:{ all -> 0x038b }
            X.206 r3 = r3.A01(r4)     // Catch:{ all -> 0x038b }
            if (r3 == 0) goto L_0x02ac
            r1.BIJ(r3, r10, r9)     // Catch:{ all -> 0x038b }
            goto L_0x02ac
        L_0x02c4:
            r4.close()     // Catch:{ all -> 0x0395 }
            goto L_0x0285
        L_0x02c8:
            X.1Nu r9 = r1.A0k     // Catch:{ all -> 0x0395 }
            X.1Cd r3 = r9.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x0340 }
            X.1au r16 = r3.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0340 }
            r3 = r16
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x0336 }
            X.1Ev r10 = r3.A02     // Catch:{ all -> 0x0336 }
            java.lang.String r4 = "message_thumbnail"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0336 }
            r11.<init>()     // Catch:{ all -> 0x0336 }
            java.lang.String r3 = "message_row_id IN "
            r11.append(r3)     // Catch:{ all -> 0x0336 }
            java.lang.String r3 = "(SELECT _id FROM message WHERE chat_row_id = ? AND "
            r11.append(r3)     // Catch:{ all -> 0x0336 }
            r11.append(r15)     // Catch:{ all -> 0x0336 }
            java.lang.String r3 = " IN (\""
            r11.append(r3)     // Catch:{ all -> 0x0336 }
            java.lang.String r12 = "\",\""
            r3 = r19
            java.lang.String r3 = android.text.TextUtils.join(r12, r3)     // Catch:{ all -> 0x0336 }
            r11.append(r3)     // Catch:{ all -> 0x0336 }
            java.lang.String r3 = "\")"
            r11.append(r3)     // Catch:{ all -> 0x0336 }
            java.lang.String r3 = ")"
            r11.append(r3)     // Catch:{ all -> 0x0336 }
            java.lang.String r12 = r11.toString()     // Catch:{ all -> 0x0336 }
            r3 = 1
            java.lang.String[] r11 = new java.lang.String[r3]     // Catch:{ all -> 0x0336 }
            X.1LW r3 = r9.A00     // Catch:{ all -> 0x0336 }
            long r13 = r3.A09(r0)     // Catch:{ all -> 0x0336 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0336 }
            r3 = 0
            r11[r3] = r13     // Catch:{ all -> 0x0336 }
            java.lang.String r3 = "deleteMessageThumbnailsFor/DELETE_MESSAGE_THUMBNAILS_BY_ID"
            int r10 = r10.A04(r4, r12, r3, r11)     // Catch:{ all -> 0x0336 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0336 }
            r4.<init>()     // Catch:{ all -> 0x0336 }
            java.lang.String r3 = "msgstore/deleteMessageThumbnailsFor-jid/"
            r4.append(r3)     // Catch:{ all -> 0x0336 }
            r4.append(r10)     // Catch:{ all -> 0x0336 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0336 }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0336 }
            r16.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0340 }
            goto L_0x0346
        L_0x0336:
            r4 = move-exception
            r16.close()     // Catch:{ all -> 0x033b }
            goto L_0x033f
        L_0x033b:
            r3 = move-exception
            X.AnonymousClass0DT.A00(r4, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0340 }
        L_0x033f:
            throw r4     // Catch:{ SQLiteDatabaseCorruptException -> 0x0340 }
        L_0x0340:
            r4 = move-exception
            java.lang.String r3 = "msgstore/deleteMessageThumbnailsFor-jid"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x0395 }
        L_0x0346:
            r3 = r20
            r9.A04(r3)     // Catch:{ all -> 0x0395 }
            r18.A00()     // Catch:{ all -> 0x0395 }
            int r5 = r5 + r17
            r21.A01()     // Catch:{ all -> 0x0395 }
            r18.close()     // Catch:{ all -> 0x039f }
            r23.close()     // Catch:{ all -> 0x03ae }
            r8.close()
            r3 = r28
            r3.C21(r5)
            goto L_0x008d
        L_0x0363:
            int r7 = r0.size()
            goto L_0x007b
        L_0x0369:
            X.1Qk r3 = r1.A0I
            X.1BI r0 = r2.A07
            int r7 = r3.A02(r0)
            goto L_0x007b
        L_0x0373:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0378 }
            goto L_0x037c
        L_0x0378:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x03b0 }
        L_0x037c:
            throw r1     // Catch:{ all -> 0x03b0 }
        L_0x037d:
            r2 = move-exception
            X.1CL r0 = r1.A0T     // Catch:{ all -> 0x03ae }
            r0.A00(r10)     // Catch:{ all -> 0x03ae }
            goto L_0x03a8
        L_0x0384:
            r18.close()     // Catch:{ all -> 0x039f }
            r23.close()     // Catch:{ all -> 0x03ae }
            goto L_0x03c5
        L_0x038b:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0390 }
            goto L_0x0394
        L_0x0390:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0395 }
        L_0x0394:
            throw r1     // Catch:{ all -> 0x0395 }
        L_0x0395:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x039a }
            goto L_0x039e
        L_0x039a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x039f }
        L_0x039e:
            throw r1     // Catch:{ all -> 0x039f }
        L_0x039f:
            r2 = move-exception
            r23.close()     // Catch:{ all -> 0x03a4 }
            goto L_0x03a8
        L_0x03a4:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x03ae }
        L_0x03a8:
            throw r2     // Catch:{ all -> 0x03ae }
        L_0x03a9:
            r8.close()
            r3 = 0
            goto L_0x03c9
        L_0x03ae:
            r1 = move-exception
            goto L_0x03bd
        L_0x03b0:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x03b5 }
            goto L_0x03b9
        L_0x03b5:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x03ba }
        L_0x03b9:
            throw r1     // Catch:{ all -> 0x03ba }
        L_0x03ba:
            r1 = move-exception
            if (r6 == 0) goto L_0x03c4
        L_0x03bd:
            android.database.Cursor r0 = r6.A00
            if (r0 == 0) goto L_0x03c4
            r0.close()
        L_0x03c4:
            throw r1
        L_0x03c5:
            r8.close()
        L_0x03c8:
            r3 = 1
        L_0x03c9:
            boolean r4 = r28.CMS()
            if (r4 != 0) goto L_0x03d6
            if (r39 != 0) goto L_0x03d6
            X.1Qq r4 = r1.A0L
            r4.A04(r0)
        L_0x03d6:
            A03(r1, r2)
            X.1NA r1 = r1.A0G
            r1.A09()
            r28.Buc()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "CoreMessageStore/deletemsgs/batches "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = " haveMessagesToDelete:"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = " timeSpent:"
            r2.append(r0)
            long r0 = r21.A02()
            r2.append(r0)
            java.lang.String r0 = " currentMessages:"
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = " totalMessages:"
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            r0 = r0 ^ r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.BID(X.2h3, X.3MJ, boolean):boolean");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:231:0x0412=Splitter:B:231:0x0412, B:333:0x0525=Splitter:B:333:0x0525, B:252:0x043e=Splitter:B:252:0x043e} */
    public void BIK(X.AnonymousClass206 r30, int r31, boolean r32, boolean r33, boolean r34) {
        /*
            r29 = this;
            r9 = r29
            X.0zA r1 = r9.A1O
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0015
            r1.A03()
            java.lang.String r1 = "beforeRemoveAllLabelsFromMessage"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0015:
            X.1Cd r0 = r9.A0V
            X.1au r17 = r0.A05()
            X.1xA r18 = r17.BD0()     // Catch:{ all -> 0x0533 }
            X.00H r0 = r9.A1E     // Catch:{ all -> 0x0529 }
            r20 = r0
            java.lang.Object r1 = r20.get()     // Catch:{ all -> 0x0529 }
            X.1W6 r1 = (X.AnonymousClass1W6) r1     // Catch:{ all -> 0x0529 }
            r0 = 0
            r4 = r30
            X.C18070vi.A0d(r4, r0)     // Catch:{ all -> 0x0529 }
            X.1W5 r13 = r1.A00     // Catch:{ all -> 0x0529 }
            r12 = 0
            r5 = r31
            r19 = r32
            X.1Cd r0 = r13.A01     // Catch:{ all -> 0x013d }
            X.1au r11 = r0.A05()     // Catch:{ all -> 0x013d }
            X.1xA r16 = r11.BD0()     // Catch:{ all -> 0x0136 }
            X.00H r0 = r13.A02     // Catch:{ all -> 0x012d }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x012d }
            X.24k r10 = (X.C446924k) r10     // Catch:{ all -> 0x012d }
            X.3IQ r8 = new X.3IQ     // Catch:{ all -> 0x012d }
            r8.<init>(r11)     // Catch:{ all -> 0x012d }
            int r3 = r4.A0E()     // Catch:{ all -> 0x012d }
            r2 = 1
            if (r3 == r2) goto L_0x0055
            r2 = 0
        L_0x0055:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
            r1.<init>()     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "Should only delete message marked as MAIN; storageType="
            r1.append(r0)     // Catch:{ all -> 0x012d }
            r1.append(r3)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x012d }
            X.C17960vV.A0F(r2, r0)     // Catch:{ all -> 0x012d }
            X.1Q6 r0 = r10.A02     // Catch:{ all -> 0x012d }
            X.205 r7 = r4.A0v     // Catch:{ all -> 0x012d }
            r0.A0C(r7)     // Catch:{ all -> 0x012d }
            r0 = 1
            r4.A0z = r0     // Catch:{ all -> 0x012d }
            X.0vl r0 = r10.A0B     // Catch:{ all -> 0x012d }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x012d }
            X.20Z r1 = (X.AnonymousClass20Z) r1     // Catch:{ all -> 0x012d }
            int r0 = r4.A0u     // Catch:{ all -> 0x012d }
            X.20A r0 = r1.A00(r0)     // Catch:{ all -> 0x012d }
            boolean r1 = r0 instanceof X.AnonymousClass39J     // Catch:{ all -> 0x012d }
            if (r1 == 0) goto L_0x00b4
            X.39J r0 = (X.AnonymousClass39J) r0     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x00b5
            java.lang.Class r2 = r0.getClass()     // Catch:{ all -> 0x012d }
        L_0x008d:
            X.20F r1 = new X.20F     // Catch:{ all -> 0x012d }
            r1.<init>(r2)     // Catch:{ all -> 0x012d }
            r6 = 0
            X.00H r1 = r10.A05     // Catch:{ all -> 0x012d }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x012d }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x012d }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x012d }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x012d }
        L_0x00a2:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x012d }
            if (r1 == 0) goto L_0x00b8
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x012d }
            X.3LJ r2 = (X.AnonymousClass3LJ) r2     // Catch:{ all -> 0x012d }
            r1 = r19
            r2.CCa(r4, r6, r5, r1)     // Catch:{ all -> 0x012d }
            goto L_0x00a2
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            java.lang.Class<X.39J> r2 = X.AnonymousClass39J.class
            goto L_0x008d
        L_0x00b8:
            if (r0 == 0) goto L_0x00de
            r3 = 1
            r1 = r31 & 1
            if (r1 == r3) goto L_0x00c0
            r3 = 0
        L_0x00c0:
            X.00H r1 = r0.A01     // Catch:{ all -> 0x012d }
            java.lang.Object r2 = r1.get()     // Catch:{ all -> 0x012d }
            X.1Nt r2 = (X.C25321Nt) r2     // Catch:{ all -> 0x012d }
            r15 = r4
            X.21V r15 = (X.AnonymousClass21V) r15     // Catch:{ all -> 0x012d }
            X.00H r0 = r0.A00     // Catch:{ all -> 0x012d }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x012d }
            X.0vd r1 = (X.C18020vd) r1     // Catch:{ all -> 0x012d }
            r14 = 2364(0x93c, float:3.313E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x012d }
            boolean r0 = X.C18020vd.A05(r0, r1, r14)     // Catch:{ all -> 0x012d }
            r2.A06(r15, r3, r0)     // Catch:{ all -> 0x012d }
        L_0x00de:
            java.lang.Object r0 = r8.invoke(r4)     // Catch:{ all -> 0x012d }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x012d }
            int r3 = r0.intValue()     // Catch:{ all -> 0x012d }
            if (r3 <= 0) goto L_0x010b
            X.00H r0 = r10.A04     // Catch:{ all -> 0x012d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x012d }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x012d }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x012d }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x012d }
        L_0x00f9:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x011f
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x012d }
            X.3LJ r1 = (X.AnonymousClass3LJ) r1     // Catch:{ all -> 0x012d }
            r0 = r19
            r1.CCa(r4, r6, r5, r0)     // Catch:{ all -> 0x012d }
            goto L_0x00f9
        L_0x010b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
            r1.<init>()     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "FMessageDatabaseSubsystem/deletemsg/nothing-deleted "
            r1.append(r0)     // Catch:{ all -> 0x012d }
            r1.append(r7)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x012d }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x012d }
        L_0x011f:
            r16.A00()     // Catch:{ all -> 0x012d }
            r16.close()     // Catch:{ all -> 0x0136 }
            r11.close()     // Catch:{ all -> 0x013d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x013d }
            goto L_0x0143
        L_0x012d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x012f }
        L_0x012f:
            r1 = move-exception
            r0 = r16
            X.CDX.A00(r0, r2)     // Catch:{ all -> 0x0136 }
            throw r1     // Catch:{ all -> 0x0136 }
        L_0x0136:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            X.CDX.A00(r11, r1)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x013d:
            r0 = move-exception
            X.1IU r1 = new X.1IU     // Catch:{ all -> 0x0529 }
            r1.<init>(r0)     // Catch:{ all -> 0x0529 }
        L_0x0143:
            boolean r0 = r1 instanceof X.AnonymousClass1IU     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x0171
            java.lang.Throwable r1 = X.C30671eK.A00(r1)     // Catch:{ all -> 0x0529 }
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteDoneException     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x015b
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x0529 }
        L_0x0152:
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0529 }
            if (r12 == 0) goto L_0x051b
            int r0 = r12.intValue()     // Catch:{ all -> 0x0529 }
            goto L_0x0173
        L_0x015b:
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteDatabaseCorruptException     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x0168
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x0529 }
            X.1Cn r0 = r13.A00     // Catch:{ all -> 0x0529 }
            r0.A03()     // Catch:{ all -> 0x0529 }
            goto L_0x0152
        L_0x0168:
            boolean r0 = r1 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0529 }
            if (r0 != 0) goto L_0x0525
            boolean r0 = r1 instanceof java.lang.Error     // Catch:{ all -> 0x0529 }
            if (r0 != 0) goto L_0x0525
            goto L_0x0152
        L_0x0171:
            r12 = r1
            goto L_0x0152
        L_0x0173:
            if (r0 <= 0) goto L_0x051b
            X.205 r11 = r4.A0v     // Catch:{ all -> 0x0529 }
            X.1BI r15 = r11.A00     // Catch:{ all -> 0x0529 }
            boolean r0 = X.C22971Dz.A0a(r15)     // Catch:{ all -> 0x0529 }
            r10 = 1
            r12 = 0
            if (r0 == 0) goto L_0x045b
            boolean r0 = X.AnonymousClass25A.A0p(r4)     // Catch:{ all -> 0x0529 }
            if (r0 != 0) goto L_0x051b
            boolean r0 = X.C20133A8t.A0A(r4)     // Catch:{ all -> 0x0529 }
            if (r0 != 0) goto L_0x051b
            if (r33 != 0) goto L_0x051b
            if (r34 != 0) goto L_0x051b
            com.whatsapp.jid.UserJid r5 = r4.A0I()     // Catch:{ all -> 0x0529 }
            if (r5 != 0) goto L_0x01ab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0529 }
            r1.<init>()     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = "StatusStore/deletemsg/ remote resource is null or not a UserJid"
            r1.append(r0)     // Catch:{ all -> 0x0529 }
            r1.append(r11)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0529 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0529 }
        L_0x01ab:
            X.1Le r3 = r9.A0g     // Catch:{ all -> 0x0529 }
            X.2sx r2 = r3.A08(r5)     // Catch:{ all -> 0x0529 }
            if (r2 != 0) goto L_0x01c9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0529 }
            r1.<init>()     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = "StatusStore/deletemsg/statuslist/no statusInfo for "
            r1.append(r0)     // Catch:{ all -> 0x0529 }
            r1.append(r5)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0529 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0529 }
            goto L_0x051b
        L_0x01c9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0529 }
            r1.<init>()     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = "deleting message, StatusInfo before deletion: "
            r1.append(r0)     // Catch:{ all -> 0x0529 }
            r1.append(r2)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = " senderJid: "
            r1.append(r0)     // Catch:{ all -> 0x0529 }
            r1.append(r5)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0529 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0529 }
            r16 = 1
            if (r32 != 0) goto L_0x029a
            int r0 = r2.A01()     // Catch:{ all -> 0x0529 }
            if (r0 <= 0) goto L_0x0211
            long r13 = r2.A05()     // Catch:{ all -> 0x0529 }
            long r6 = r2.A03()     // Catch:{ all -> 0x0529 }
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0211
            X.0ve r6 = r3.A06     // Catch:{ all -> 0x0529 }
            r1 = 10541(0x292d, float:1.4771E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0529 }
            boolean r0 = X.C18020vd.A05(r0, r6, r1)     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x0211
            X.190 r6 = r3.A00     // Catch:{ all -> 0x0529 }
            java.lang.String r1 = "StatusStore/updateStatusesListForDeletedMessage/unseenCount in bad state"
            r0 = 0
            r6.A0G(r1, r0, r12)     // Catch:{ all -> 0x0529 }
        L_0x020f:
            monitor-enter(r2)     // Catch:{ all -> 0x0529 }
            goto L_0x0214
        L_0x0211:
            r16 = 0
            goto L_0x020f
        L_0x0214:
            int r0 = r2.A00     // Catch:{ all -> 0x0453 }
            int r0 = r0 + -1
            r2.A00 = r0     // Catch:{ all -> 0x0453 }
            long r6 = r4.A0y     // Catch:{ all -> 0x0453 }
            long r0 = r2.A05     // Catch:{ all -> 0x0453 }
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0228
            int r0 = r2.A01     // Catch:{ all -> 0x0453 }
            int r0 = r0 + -1
            r2.A01 = r0     // Catch:{ all -> 0x0453 }
        L_0x0228:
            if (r16 == 0) goto L_0x022c
            r2.A01 = r12     // Catch:{ all -> 0x0453 }
        L_0x022c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0453 }
            r6.<init>()     // Catch:{ all -> 0x0453 }
            java.lang.String r0 = "msgstore/status-deleted/ "
            r6.append(r0)     // Catch:{ all -> 0x0453 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0453 }
            r7.<init>()     // Catch:{ all -> 0x0453 }
            java.lang.String r0 = "[id="
            r7.append(r0)     // Catch:{ all -> 0x0453 }
            java.lang.String r0 = r11.A01     // Catch:{ all -> 0x0453 }
            r7.append(r0)     // Catch:{ all -> 0x0453 }
            java.lang.String r0 = ", from_me="
            r7.append(r0)     // Catch:{ all -> 0x0453 }
            boolean r1 = r11.A02     // Catch:{ all -> 0x0453 }
            r7.append(r1)     // Catch:{ all -> 0x0453 }
            java.lang.String r0 = ", remote_resource="
            r7.append(r0)     // Catch:{ all -> 0x0453 }
            X.1BI r0 = r4.A0H()     // Catch:{ all -> 0x0453 }
            r7.append(r0)     // Catch:{ all -> 0x0453 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x0453 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0453 }
            r6.append(r0)     // Catch:{ all -> 0x0453 }
            java.lang.String r0 = " unseen:"
            r6.append(r0)     // Catch:{ all -> 0x0453 }
            int r0 = r2.A01     // Catch:{ all -> 0x0453 }
            r6.append(r0)     // Catch:{ all -> 0x0453 }
            java.lang.String r0 = " total:"
            r6.append(r0)     // Catch:{ all -> 0x0453 }
            int r0 = r2.A00     // Catch:{ all -> 0x0453 }
            r6.append(r0)     // Catch:{ all -> 0x0453 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0453 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0453 }
            int r0 = r2.A00     // Catch:{ all -> 0x0453 }
            if (r0 > 0) goto L_0x0288
            monitor-exit(r2)     // Catch:{ all -> 0x0529 }
            goto L_0x028e
        L_0x0288:
            X.2sx r8 = r2.A06()     // Catch:{ all -> 0x0453 }
            monitor-exit(r2)     // Catch:{ all -> 0x0529 }
            goto L_0x028f
        L_0x028e:
            r8 = 0
        L_0x028f:
            if (r1 == 0) goto L_0x039f
            java.util.Set r0 = java.util.Collections.singleton(r4)     // Catch:{ all -> 0x0529 }
            r3.A0F(r0)     // Catch:{ all -> 0x0529 }
            goto L_0x039f
        L_0x029a:
            monitor-enter(r2)     // Catch:{ all -> 0x0529 }
            int r0 = r2.A00     // Catch:{ all -> 0x0456 }
            r8 = 0
            if (r0 <= r10) goto L_0x0332
            com.whatsapp.jid.UserJid r6 = r2.A0A     // Catch:{ all -> 0x0456 }
            X.1E5 r1 = X.AnonymousClass1E5.A00     // Catch:{ all -> 0x0456 }
            r0 = 0
            if (r6 != r1) goto L_0x02a8
            r0 = 1
        L_0x02a8:
            r13 = -1
            if (r0 == 0) goto L_0x02ad
            goto L_0x02d6
        L_0x02ad:
            long r6 = r4.A0y     // Catch:{ all -> 0x0456 }
            long r0 = r2.A05     // Catch:{ all -> 0x0456 }
            int r16 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r16 == 0) goto L_0x02de
            long r6 = r4.A0y     // Catch:{ all -> 0x0456 }
            long r0 = r2.A03     // Catch:{ all -> 0x0456 }
            int r16 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r16 < 0) goto L_0x02c5
            long r6 = r4.A0y     // Catch:{ all -> 0x0456 }
            long r0 = r2.A02     // Catch:{ all -> 0x0456 }
            int r16 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r16 <= 0) goto L_0x02de
        L_0x02c5:
            long r6 = r4.A0y     // Catch:{ all -> 0x0456 }
            long r0 = r2.A06     // Catch:{ all -> 0x0456 }
            int r16 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r16 == 0) goto L_0x02de
            long r6 = r4.A0y     // Catch:{ all -> 0x0456 }
            long r0 = r2.A04     // Catch:{ all -> 0x0456 }
            int r16 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r16 != 0) goto L_0x02e2
            goto L_0x02de
        L_0x02d6:
            long r6 = r4.A0y     // Catch:{ all -> 0x0456 }
            long r0 = r2.A04     // Catch:{ all -> 0x0456 }
            int r16 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r16 != 0) goto L_0x02e2
        L_0x02de:
            r2.A04 = r13     // Catch:{ all -> 0x0456 }
            r8 = r2
            goto L_0x030a
        L_0x02e2:
            int r0 = r2.A00     // Catch:{ all -> 0x0456 }
            int r0 = r0 - r10
            r2.A00 = r0     // Catch:{ all -> 0x0456 }
            long r6 = r4.A0y     // Catch:{ all -> 0x0456 }
            long r0 = r2.A05     // Catch:{ all -> 0x0456 }
            int r13 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x02f6
            int r0 = r2.A01     // Catch:{ all -> 0x0456 }
            if (r0 <= 0) goto L_0x02f6
            int r0 = r0 - r10
            r2.A01 = r0     // Catch:{ all -> 0x0456 }
        L_0x02f6:
            X.206 r0 = r2.A07     // Catch:{ all -> 0x0456 }
            if (r0 == 0) goto L_0x0306
            long r6 = r4.A0y     // Catch:{ all -> 0x0456 }
            X.206 r0 = r2.A07     // Catch:{ all -> 0x0456 }
            long r0 = r0.A0y     // Catch:{ all -> 0x0456 }
            int r13 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r13 != 0) goto L_0x0306
            r2.A07 = r8     // Catch:{ all -> 0x0456 }
        L_0x0306:
            X.2sx r8 = r2.A06()     // Catch:{ all -> 0x0456 }
        L_0x030a:
            long r13 = r8.A03()     // Catch:{ all -> 0x0458 }
            r6 = -1
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x032c
            X.00H r0 = r3.A08     // Catch:{ all -> 0x0458 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x0458 }
            X.1TG r6 = (X.AnonymousClass1TG) r6     // Catch:{ all -> 0x0458 }
            X.C17960vV.A01()     // Catch:{ all -> 0x0458 }
            com.whatsapp.jid.UserJid r1 = r8.A0A     // Catch:{ all -> 0x0458 }
            r0 = -1
            java.util.ArrayList r0 = r6.A04(r1, r0)     // Catch:{ all -> 0x0458 }
            X.2sx r8 = X.AnonymousClass1TG.A00(r8, r6, r0)     // Catch:{ all -> 0x0458 }
            if (r8 == 0) goto L_0x0332
        L_0x032c:
            X.C17960vV.A07(r5)     // Catch:{ all -> 0x0458 }
            r3.A0D(r8, r5)     // Catch:{ all -> 0x0458 }
        L_0x0332:
            monitor-exit(r2)     // Catch:{ all -> 0x0458 }
            boolean r0 = r11.A02     // Catch:{ all -> 0x0529 }
            if (r0 != 0) goto L_0x039f
            if (r5 == 0) goto L_0x039f
            boolean r0 = X.C22971Dz.A0Z(r5)     // Catch:{ all -> 0x0529 }
            if (r0 != 0) goto L_0x039f
            long r0 = r2.A05()     // Catch:{ all -> 0x0529 }
            X.0ve r11 = r3.A06     // Catch:{ all -> 0x0529 }
            r7 = 8880(0x22b0, float:1.2444E-41)
            X.0vf r6 = X.C18040vf.A02     // Catch:{ all -> 0x0529 }
            boolean r6 = X.C18020vd.A05(r6, r11, r7)     // Catch:{ all -> 0x0529 }
            boolean r26 = X.C20133A8t.A0C(r4, r0, r6)     // Catch:{ all -> 0x0529 }
            X.36j r0 = X.C63672tV.A02(r4)     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x035f
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0529 }
            r27 = 1
            if (r0 != 0) goto L_0x0361
        L_0x035f:
            r27 = 0
        L_0x0361:
            X.1Ld r1 = r3.A07     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = r5.user     // Catch:{ all -> 0x0529 }
            java.util.Set r21 = java.util.Collections.singleton(r0)     // Catch:{ all -> 0x0529 }
            if (r26 == 0) goto L_0x0372
            java.lang.String r0 = r5.user     // Catch:{ all -> 0x0529 }
            java.util.Set r22 = java.util.Collections.singleton(r0)     // Catch:{ all -> 0x0529 }
            goto L_0x0376
        L_0x0372:
            java.util.Set r22 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0529 }
        L_0x0376:
            if (r27 == 0) goto L_0x0383
            java.lang.String r0 = r5.user     // Catch:{ all -> 0x0529 }
            java.util.Set r23 = java.util.Collections.singleton(r0)     // Catch:{ all -> 0x0529 }
            r28 = 1
            if (r26 != 0) goto L_0x038d
            goto L_0x0387
        L_0x0383:
            java.util.Set r23 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0529 }
        L_0x0387:
            r28 = 0
            if (r27 == 0) goto L_0x0394
            if (r26 == 0) goto L_0x0394
        L_0x038d:
            java.lang.String r0 = r5.user     // Catch:{ all -> 0x0529 }
            java.util.Set r24 = java.util.Collections.singleton(r0)     // Catch:{ all -> 0x0529 }
            goto L_0x0398
        L_0x0394:
            java.util.Set r24 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0529 }
        L_0x0398:
            r20 = r1
            r25 = r10
            r20.A02(r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0529 }
        L_0x039f:
            if (r8 != 0) goto L_0x041b
            r3.A06(r5)     // Catch:{ all -> 0x0529 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0529 }
            r1.<init>()     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = "StatusStore/deletemsg/statuslist/delete jid="
            r1.append(r0)     // Catch:{ all -> 0x0529 }
            r1.append(r5)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = " oldStatusInfo "
            r1.append(r0)     // Catch:{ all -> 0x0529 }
            r1.append(r2)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0529 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0529 }
            boolean r0 = X.C22971Dz.A0Z(r15)     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x0418
            X.1Lb r3 = r3.A05     // Catch:{ all -> 0x0529 }
            long r0 = r4.A0x     // Catch:{ all -> 0x0529 }
            monitor-enter(r3)     // Catch:{ all -> 0x0529 }
            X.C17960vV.A01()     // Catch:{ all -> 0x0414 }
            X.1Cd r4 = r3.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x040c }
            X.1au r13 = r4.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x040c }
            X.1xA r11 = r13.BD0()     // Catch:{ all -> 0x0402 }
            r4 = r13
            X.1av r4 = (X.C28801av) r4     // Catch:{ all -> 0x03f8 }
            X.1Ev r8 = r4.A02     // Catch:{ all -> 0x03f8 }
            java.lang.String r7 = "message_status_psa_campaign"
            java.lang.String r6 = "message_row_id = ? "
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ all -> 0x03f8 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x03f8 }
            r4[r12] = r0     // Catch:{ all -> 0x03f8 }
            java.lang.String r0 = "StatusPsaCampaignStore/delete"
            r8.A04(r7, r6, r0, r4)     // Catch:{ all -> 0x03f8 }
            r11.A00()     // Catch:{ all -> 0x03f8 }
            r11.close()     // Catch:{ all -> 0x0402 }
            r13.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x040c }
            goto L_0x0412
        L_0x03f8:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x03fd }
            goto L_0x0401
        L_0x03fd:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0402 }
        L_0x0401:
            throw r1     // Catch:{ all -> 0x0402 }
        L_0x0402:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0407 }
            goto L_0x040b
        L_0x0407:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x040c }
        L_0x040b:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x040c }
        L_0x040c:
            r1 = move-exception
            java.lang.String r0 = "messagestatuspsacampaign/delete"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0414 }
        L_0x0412:
            monitor-exit(r3)     // Catch:{ all -> 0x0529 }
            goto L_0x0418
        L_0x0414:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0529 }
            goto L_0x049c
        L_0x0418:
            if (r32 != 0) goto L_0x051b
            goto L_0x0428
        L_0x041b:
            if (r32 != 0) goto L_0x051b
            int r1 = r8.A01()     // Catch:{ all -> 0x0529 }
            int r0 = r8.A00()     // Catch:{ all -> 0x0529 }
            r3.A0E(r5, r1, r0)     // Catch:{ all -> 0x0529 }
        L_0x0428:
            X.1E5 r0 = X.AnonymousClass1E5.A00     // Catch:{ all -> 0x0529 }
            if (r5 == r0) goto L_0x051b
            X.1M9 r4 = r9.A08     // Catch:{ all -> 0x0529 }
            X.1E7 r3 = r4.A0H(r5)     // Catch:{ all -> 0x0529 }
            monitor-enter(r2)     // Catch:{ all -> 0x0529 }
            int r0 = r2.A00     // Catch:{ all -> 0x0453 }
            r1 = 1
            if (r0 != r10) goto L_0x043d
            int r0 = r2.A01     // Catch:{ all -> 0x0453 }
            if (r0 != r10) goto L_0x043d
            goto L_0x043e
        L_0x043d:
            r1 = 0
        L_0x043e:
            monitor-exit(r2)     // Catch:{ all -> 0x0529 }
            if (r1 == 0) goto L_0x0448
            boolean r0 = r3.A14     // Catch:{ all -> 0x0529 }
            if (r0 != 0) goto L_0x051b
            r3.A14 = r10     // Catch:{ all -> 0x0529 }
            goto L_0x044e
        L_0x0448:
            boolean r0 = r3.A14     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x051b
            r3.A14 = r12     // Catch:{ all -> 0x0529 }
        L_0x044e:
            r4.A0V(r3)     // Catch:{ all -> 0x0529 }
            goto L_0x051b
        L_0x0453:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0529 }
            goto L_0x049c
        L_0x0456:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0458 }
        L_0x0458:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0458 }
            goto L_0x049c
        L_0x045b:
            X.1CJ r7 = r9.A0D     // Catch:{ all -> 0x0529 }
            X.1ci r6 = r7.A0A(r15)     // Catch:{ all -> 0x0529 }
            if (r6 == 0) goto L_0x051b
            long r2 = r6.A0W     // Catch:{ all -> 0x0529 }
            long r0 = r4.A0x     // Catch:{ all -> 0x0529 }
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r14 = 0
            if (r8 != 0) goto L_0x046d
            r14 = 1
        L_0x046d:
            long r2 = r6.A0P     // Catch:{ all -> 0x0529 }
            long r0 = r4.A0x     // Catch:{ all -> 0x0529 }
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0476
            r12 = 1
        L_0x0476:
            long r2 = r4.A0y     // Catch:{ all -> 0x0529 }
            long r0 = r6.A0S     // Catch:{ all -> 0x0529 }
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x04a8
            r2 = r31 & 16
            r0 = 16
            r1 = 0
            if (r2 != r0) goto L_0x0486
            r1 = 1
        L_0x0486:
            int r0 = r6.A0A     // Catch:{ all -> 0x0529 }
            if (r0 <= 0) goto L_0x049e
            int r0 = r0 + -1
            monitor-enter(r6)     // Catch:{ all -> 0x0529 }
            r6.A0A = r0     // Catch:{ all -> 0x049a }
            monitor-exit(r6)     // Catch:{ all -> 0x0529 }
            if (r1 == 0) goto L_0x049e
            int r0 = r6.A0C     // Catch:{ all -> 0x0529 }
            int r0 = r0 + -1
            monitor-enter(r6)     // Catch:{ all -> 0x0529 }
            r6.A0C = r0     // Catch:{ all -> 0x049a }
            goto L_0x049d
        L_0x049a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0529 }
        L_0x049c:
            throw r0     // Catch:{ all -> 0x0529 }
        L_0x049d:
            monitor-exit(r6)     // Catch:{ all -> 0x0529 }
        L_0x049e:
            X.11S r0 = r9.A06     // Catch:{ all -> 0x0529 }
            X.AnonymousClass25A.A0E(r0, r7, r4)     // Catch:{ all -> 0x0529 }
            X.1LW r0 = r9.A0C     // Catch:{ all -> 0x0529 }
            r0.A0I(r6)     // Catch:{ all -> 0x0529 }
        L_0x04a8:
            if (r32 != 0) goto L_0x050f
            if (r14 != 0) goto L_0x04ae
            if (r12 == 0) goto L_0x050f
        L_0x04ae:
            r1 = 4
            r0 = r31 & 4
            r13 = 0
            if (r0 != r1) goto L_0x04b5
            r13 = 1
        L_0x04b5:
            X.1NK r0 = r9.A0a     // Catch:{ all -> 0x0529 }
            long r0 = r0.A04(r15)     // Catch:{ all -> 0x0529 }
            X.1NJ r2 = r9.A0d     // Catch:{ all -> 0x0529 }
            long r2 = r2.A06(r15)     // Catch:{ all -> 0x0529 }
            java.lang.Object r5 = r20.get()     // Catch:{ all -> 0x0529 }
            X.1W6 r5 = (X.AnonymousClass1W6) r5     // Catch:{ all -> 0x0529 }
            X.1W2 r5 = r5.A01     // Catch:{ all -> 0x0529 }
            X.206 r10 = r5.A03(r0)     // Catch:{ all -> 0x0529 }
            X.1LW r11 = r9.A0C     // Catch:{ all -> 0x0529 }
            X.1CJ r5 = r11.A00     // Catch:{ all -> 0x0529 }
            X.1ci r9 = r5.A0A(r15)     // Catch:{ all -> 0x0529 }
            if (r9 == 0) goto L_0x04f5
            r7 = 1
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x04e5
            if (r13 != 0) goto L_0x04e5
            if (r10 == 0) goto L_0x04e5
            long r7 = r10.A0I     // Catch:{ all -> 0x0529 }
            r9.A0Z = r7     // Catch:{ all -> 0x0529 }
        L_0x04e5:
            if (r14 == 0) goto L_0x04ed
            r9.A0W = r0     // Catch:{ all -> 0x0529 }
            r9.A0X = r2     // Catch:{ all -> 0x0529 }
            r9.A0g = r10     // Catch:{ all -> 0x0529 }
        L_0x04ed:
            if (r12 == 0) goto L_0x04f5
            r9.A0P = r0     // Catch:{ all -> 0x0529 }
            r9.A0Q = r2     // Catch:{ all -> 0x0529 }
            r9.A0f = r10     // Catch:{ all -> 0x0529 }
        L_0x04f5:
            boolean r0 = r11.A0N(r6)     // Catch:{ all -> 0x0529 }
            if (r0 != 0) goto L_0x050f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0529 }
            r1.<init>()     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = "CoreMessageStore/deletemsg/chatlist/insert/failed gid="
            r1.append(r0)     // Catch:{ all -> 0x0529 }
            r1.append(r15)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0529 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0529 }
        L_0x050f:
            long r7 = r6.A0J     // Catch:{ all -> 0x0529 }
            long r1 = r4.A0y     // Catch:{ all -> 0x0529 }
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x051b
            r0 = -9223372036854775808
            r6.A0J = r0     // Catch:{ all -> 0x0529 }
        L_0x051b:
            r18.A00()     // Catch:{ all -> 0x0529 }
            r18.close()     // Catch:{ all -> 0x0533 }
            r17.close()
            return
        L_0x0525:
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x0529 }
            throw r1     // Catch:{ all -> 0x0529 }
        L_0x0529:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x052e }
            goto L_0x0532
        L_0x052e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0533 }
        L_0x0532:
            throw r1     // Catch:{ all -> 0x0533 }
        L_0x0533:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0538 }
            throw r1
        L_0x0538:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.BIK(X.206, int, boolean, boolean, boolean):void");
    }

    public void BIL(Collection collection, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("CoreMessageStore/deletemessages ");
        sb.append(collection.size());
        Log.i(sb.toString());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.A0R.A0C(((AnonymousClass206) it.next()).A0v);
        }
        ((C31931gM) this.A16.get()).A01(new C70863Cu(this, i, 2, collection), 20);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 BUh(long r11) {
        /*
            r10 = this;
            X.00H r0 = r10.A1E
            java.lang.Object r0 = r0.get()
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            X.1W2 r5 = r0.A01
            java.lang.String r4 = "CachedMessageStore/getMessageBySortId/sortId"
            long r8 = android.os.SystemClock.uptimeMillis()
            X.1Cd r0 = r5.A06     // Catch:{ all -> 0x006b }
            X.1at r3 = r0.get()     // Catch:{ all -> 0x006b }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0064 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x0064 }
            java.lang.String r6 = X.AnonymousClass203.A0E     // Catch:{ all -> 0x0064 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0064 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "GET_MESSAGE_BY_SORT_ID_SQL"
            android.database.Cursor r7 = r7.A0A(r6, r0, r2)     // Catch:{ all -> 0x0064 }
            boolean r0 = r7.moveToLast()     // Catch:{ all -> 0x005d }
            r6 = 0
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "chat_row_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005d }
            long r1 = r7.getLong(r0)     // Catch:{ all -> 0x005d }
            X.1LW r0 = r5.A01     // Catch:{ all -> 0x005d }
            X.1BI r2 = r0.A0B(r1)     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x004c
            r1 = 0
            r0 = 1
            X.206 r6 = r5.A04(r7, r2, r1, r0)     // Catch:{ all -> 0x005d }
        L_0x004c:
            r7.close()     // Catch:{ all -> 0x0064 }
            r3.close()     // Catch:{ all -> 0x006b }
            X.1LY r2 = r5.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r8
            r2.A01(r4, r0)
            return r6
        L_0x005d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x006b:
            r3 = move-exception
            X.1LY r2 = r5.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r8
            r2.A01(r4, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.BUh(long):X.206");
    }

    public Integer BUn(Long l) {
        Cursor A0A2;
        C28781at A042 = this.A0V.get();
        try {
            A0A2 = ((C28801av) A042).A02.A0A("SELECT message_type FROM message WHERE _id = ?", "GET_MESSAGE_TYPE_OF_MESSAGE", new String[]{Long.toString(l.longValue())});
            if (A0A2.moveToNext()) {
                Integer valueOf = Integer.valueOf(A0A2.getInt(A0A2.getColumnIndexOrThrow("message_type")));
                A0A2.close();
                A042.close();
                return valueOf;
            }
            A0A2.close();
            A042.close();
            return null;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public long BVU(long j, long j2) {
        Cursor A0A2;
        long j3;
        AnonymousClass1Ez r3 = new AnonymousClass1Ez("CoreMessageStore/getNumOfMessagesReceivedFromJid");
        try {
            C28781at A042 = this.A0V.get();
            try {
                A0A2 = ((C28801av) A042).A02.A0A("SELECT COUNT(*) as count FROM (SELECT _id FROM available_message_view WHERE chat_row_id = ? AND from_me = ? AND (message_type != '7') AND (message_type != '8') LIMIT ?)", "GET_NON_SYSTEM_MESSAGES_COUNT_IN_CHAT_FROM_ME_OR_OTHERS_SQL", new String[]{String.valueOf(j), "0", String.valueOf(j2)});
                if (A0A2.moveToFirst()) {
                    j3 = A0A2.getLong(A0A2.getColumnIndexOrThrow("count"));
                } else {
                    j3 = -1;
                }
                A0A2.close();
                A042.close();
                r3.A02();
                return j3;
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            r3.A02();
            throw th2;
        }
    }

    public long BVV(long j, long j2) {
        Cursor A0A2;
        long j3;
        AnonymousClass1Ez r3 = new AnonymousClass1Ez("CoreMessageStore/getNumOfMessagesSentToJid");
        try {
            C28781at A042 = this.A0V.get();
            try {
                A0A2 = ((C28801av) A042).A02.A0A("SELECT COUNT(*) as count FROM (SELECT _id FROM available_message_view WHERE chat_row_id = ? AND from_me = ? AND (message_type != '7') AND (message_type != '8') LIMIT ?)", "GET_NON_SYSTEM_MESSAGES_COUNT_IN_CHAT_FROM_ME_OR_OTHERS_SQL", new String[]{String.valueOf(j), "1", String.valueOf(j2)});
                if (A0A2.moveToFirst()) {
                    j3 = A0A2.getLong(A0A2.getColumnIndexOrThrow("count"));
                } else {
                    j3 = -1;
                }
                A0A2.close();
                A042.close();
                r3.A02();
                return j3;
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            r3.A02();
            throw th2;
        }
    }

    public long BVc(long j) {
        Cursor A0A2;
        long j2 = -1;
        if (j < 0) {
            return -1;
        }
        C28781at A042 = this.A0V.get();
        try {
            A0A2 = ((C28801av) A042).A02.A0A("SELECT timestamp FROM message WHERE chat_row_id = ? ORDER BY sort_id LIMIT 1", "GET_OLDEST_MESSAGE_TIMESTAMP_FOR_CHAT_ID", new String[]{Long.toString(j)});
            if (A0A2.moveToNext()) {
                j2 = A0A2.getLong(A0A2.getColumnIndexOrThrow("timestamp"));
            }
            A0A2.close();
            A042.close();
            return j2;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public int BYx(AnonymousClass206 r8) {
        Cursor A0A2;
        AnonymousClass1R7 r6 = this.A0b;
        int i = 0;
        if (r8.A0x <= 0) {
            return 0;
        }
        AnonymousClass1R7.A00(r8);
        String[] strArr = {Long.toString(r8.A0x)};
        C28781at A042 = r6.A00.get();
        try {
            A0A2 = ((C28801av) A042).A02.A0A("SELECT send_count FROM message_send_count WHERE message_row_id = ?", "GET_SEND_COUNT_MESSAGE_BY_ROW_ID_SQL", strArr);
            if (A0A2.moveToNext()) {
                i = A0A2.getInt(A0A2.getColumnIndexOrThrow("send_count"));
            }
            A0A2.close();
            A042.close();
            return i;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        if (X.AnonymousClass1Q8.A00(r7, new X.C100985Am(r6.A00, 49)) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (X.AnonymousClass1Q8.A00(r7, new X.C100985Am(r6.A00, 46)) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (X.AnonymousClass1Q8.A00(r7, new X.C100985Am(r6.A00, 47)) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (X.AnonymousClass1Q8.A00(r7, new X.C100985Am(r6.A00, 48)) == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BfY(X.AnonymousClass205 r9) {
        /*
            r8 = this;
            X.00H r0 = r8.A1E
            java.lang.Object r0 = r0.get()
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            X.1W2 r0 = r0.A01
            X.206 r7 = r0.A05(r9)
            if (r7 == 0) goto L_0x0050
            X.1Q8 r6 = r8.A1T
            X.205 r0 = r7.A0v
            X.1BI r5 = r0.A00
            X.C17960vV.A07(r5)
            X.C18070vi.A0X(r5)
            int r4 = r7.A0u
            r0 = 8
            if (r4 == r0) goto L_0x0052
            boolean r0 = r7.A0q
            if (r0 != 0) goto L_0x0036
            X.1CJ r2 = r6.A00
            r1 = 48
            X.5Am r0 = new X.5Am
            r0.<init>(r2, r1)
            boolean r0 = X.AnonymousClass1Q8.A00(r7, r0)
            r3 = 1
            if (r0 != 0) goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            boolean r0 = r7.A0q
            if (r0 == 0) goto L_0x004b
            X.1CJ r2 = r6.A00
            r1 = 49
            X.5Am r0 = new X.5Am
            r0.<init>(r2, r1)
            boolean r1 = X.AnonymousClass1Q8.A00(r7, r0)
            r0 = 1
            if (r1 != 0) goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r3 != 0) goto L_0x0050
            if (r0 == 0) goto L_0x0052
        L_0x0050:
            r0 = 1
            return r0
        L_0x0052:
            boolean r0 = r7.A0q
            if (r0 != 0) goto L_0x0066
            X.1CJ r2 = r6.A00
            r1 = 46
            X.5Am r0 = new X.5Am
            r0.<init>(r2, r1)
            boolean r0 = X.AnonymousClass1Q8.A00(r7, r0)
            r3 = 1
            if (r0 != 0) goto L_0x0067
        L_0x0066:
            r3 = 0
        L_0x0067:
            boolean r0 = r7.A0q
            if (r0 == 0) goto L_0x007b
            X.1CJ r2 = r6.A00
            r1 = 47
            X.5Am r0 = new X.5Am
            r0.<init>(r2, r1)
            boolean r1 = X.AnonymousClass1Q8.A00(r7, r0)
            r0 = 1
            if (r1 != 0) goto L_0x007c
        L_0x007b:
            r0 = 0
        L_0x007c:
            if (r3 != 0) goto L_0x0080
            if (r0 == 0) goto L_0x0089
        L_0x0080:
            X.1CJ r0 = r6.A00
            boolean r0 = r0.A0V(r5, r4)
            if (r0 == 0) goto L_0x0089
            goto L_0x0050
        L_0x0089:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.BfY(X.205):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b4 A[Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashSet Br7(android.database.Cursor r18, X.AnonymousClass1BI r19) {
        /*
            r17 = this;
            java.lang.String r11 = "CoreMessageStore/deleteMediaMessageFilesBatch: "
            java.lang.String r1 = "msgstore/deletemedia/batch/files"
            X.1Ez r16 = new X.1Ez
            r0 = r16
            r0.<init>((java.lang.String) r1)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r12 = 1
            r13 = r17
            r14 = r18
            r8 = r19
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            if (r0 == 0) goto L_0x011e
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            r10.<init>()     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            java.lang.String r0 = "remove_files"
            int r9 = r14.getColumnIndexOrThrow(r0)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            java.lang.String r0 = "message_type"
            int r7 = r14.getColumnIndex(r0)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            java.lang.String r0 = "raw_string"
            int r0 = r14.getColumnIndex(r0)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            if (r19 == 0) goto L_0x0038
            r15 = r8
            goto L_0x0042
        L_0x0038:
            java.lang.String r1 = r14.getString(r0)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            X.1Dv r0 = X.AnonymousClass1BI.A00     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            X.1BI r15 = X.C22931Dv.A01(r1)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
        L_0x0042:
            int r1 = r14.getInt(r7)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            boolean r0 = X.AnonymousClass25A.A0H(r1)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            if (r0 != 0) goto L_0x0052
            boolean r0 = X.AnonymousClass25A.A0I(r1)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            if (r0 == 0) goto L_0x00d3
        L_0x0052:
            X.00H r0 = r13.A1E     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            java.lang.Object r0 = r0.get()     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            r6 = 0
            X.1W2 r0 = r0.A01     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            X.206 r5 = r0.A04(r14, r15, r12, r6)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            X.C17960vV.A07(r5)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            boolean r0 = r5 instanceof X.AnonymousClass21V     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            if (r0 == 0) goto L_0x00d3
            X.21V r5 = (X.AnonymousClass21V) r5     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            java.lang.String r0 = r5.A05     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            if (r0 == 0) goto L_0x0071
            r4.add(r0)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
        L_0x0071:
            boolean r1 = X.AnonymousClass1Eu.A05(r14, r9)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            X.0ve r3 = r13.A0q     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            r2 = 421(0x1a5, float:5.9E-43)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            boolean r0 = X.C18020vd.A05(r0, r3, r2)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            if (r0 == 0) goto L_0x00b8
            X.2rc r2 = r5.A02     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            if (r2 == 0) goto L_0x00b1
            java.io.File r6 = r2.A0G     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            if (r6 == 0) goto L_0x00b1
            X.1Ns r3 = r13.A07     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            boolean r0 = X.C25311Ns.A02(r3, r6)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            if (r0 == 0) goto L_0x00af
            int r3 = X.C25311Ns.A00(r3, r6, r12)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
        L_0x0095:
            boolean r0 = X.AnonymousClass25A.A10(r5)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            r1 = r1 | r0
            if (r1 == 0) goto L_0x00b1
            if (r3 >= 0) goto L_0x00b1
            r1 = 2
            X.3DD r0 = new X.3DD     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            r0.<init>(r2, r13, r5, r1)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            r1.<init>(r0)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            X.10I r0 = r13.A13     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            r0.CGF(r1)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            goto L_0x00b2
        L_0x00af:
            r3 = 0
            goto L_0x0095
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            if (r1 == 0) goto L_0x00d3
            r10.add(r1)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            goto L_0x00d3
        L_0x00b8:
            X.1Nt r3 = r13.A0Q     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            r3.A06(r5, r1, r6)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            X.2rc r2 = r5.A02     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            if (r2 == 0) goto L_0x00d3
            java.io.File r0 = r2.A0G     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            if (r0 == 0) goto L_0x00d3
            r0 = 0
            r2.A0A = r0     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            r0 = 0
            r2.A0G = r0     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            r2.A0U = r6     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            r2.A0V = r6     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            r3.A05(r5)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
        L_0x00d3:
            boolean r0 = r14.moveToNext()     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            if (r0 != 0) goto L_0x0042
            java.util.Iterator r3 = r10.iterator()     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
        L_0x00dd:
            boolean r0 = r3.hasNext()     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            if (r0 == 0) goto L_0x011e
            java.lang.Object r0 = r3.next()     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            java.util.concurrent.FutureTask r0 = (java.util.concurrent.FutureTask) r0     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x00ed }
            goto L_0x00dd
        L_0x00ed:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            r1.<init>()     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            r1.append(r11)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            r1.append(r8)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            java.lang.String r0 = " failed to delete a media file"
            r1.append(r0)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ SQLiteDiskIOException -> 0x013f, 11T -> 0x0106 }
            goto L_0x00dd
        L_0x0106:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r1.append(r8)
            java.lang.String r0 = "invalid jid"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
        L_0x011e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "CoreMessageStore/deletemedia/batch/files "
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = " timeSpent:"
            r2.append(r0)
            long r0 = r16.A02()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r4
        L_0x013f:
            r1 = move-exception
            X.1CL r0 = r13.A0T
            r0.A00(r12)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.Br7(android.database.Cursor, X.1BI):java.util.HashSet");
    }

    public void CI5(AnonymousClass1BI r8, boolean z) {
        C41851xA BD0;
        C18030ve r3 = this.A0q;
        C18070vi.A0d(r3, 0);
        if (C18020vd.A05(C18040vf.A02, r3, 4873)) {
            C28791au A052 = this.A0V.A05();
            try {
                BD0 = A052.BD0();
                AnonymousClass1PV r0 = this.A15;
                C18070vi.A0d(r8, 0);
                long A002 = ((C57492jA) r0.A01.get()).A00(r8);
                if (A002 > 0) {
                    this.A0P.A05(Collections.singleton(Long.valueOf(A002)), z);
                }
                BD0.A00();
                BD0.close();
                A052.close();
                return;
            } catch (Throwable th) {
                try {
                    A052.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public boolean CIH(AnonymousClass1BI r8, boolean z) {
        C41851xA BD0;
        boolean z2;
        C28791au A052 = this.A0V.A05();
        try {
            BD0 = A052.BD0();
            long A012 = this.A0h.A01(r8);
            if (A012 > 1) {
                z2 = this.A0P.A05(Collections.singleton(Long.valueOf(A012)), z);
            } else {
                z2 = false;
            }
            BD0.A00();
            BD0.close();
            A052.close();
            return z2;
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

    public void CKc(AnonymousClass1BI r8, boolean z) {
        Cursor A0A2;
        long BTu = BTu(r8, AnonymousClass11P.A01(this.A0A) - TimeUnit.HOURS.toMillis(24));
        AnonymousClass1N2 r1 = this.A0h;
        HashSet hashSet = new HashSet();
        C28781at A042 = r1.A03.get();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(String.valueOf(BTu));
            arrayList.add(String.valueOf(r1.A01.A09(r8)));
            for (Integer valueOf : (Set) AnonymousClass2WQ.A00.get()) {
                arrayList.add(String.valueOf(valueOf));
            }
            A0A2 = ((C28801av) A042).A02.A0A(C50932Wi.A04, "GET_SYSTEM_MESSAGES_ROW_IDS_BY_ACTION_TYPES_SQL", (String[]) arrayList.toArray(C19620yd.A0M));
            int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("_id");
            while (A0A2.moveToNext()) {
                hashSet.add(Long.valueOf(A0A2.getLong(columnIndexOrThrow)));
            }
            A0A2.close();
            A042.close();
            this.A0P.A05(hashSet, z);
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void CQa(AnonymousClass1BI r12) {
        AnonymousClass1CJ r1 = this.A0D;
        C29691ci A0A2 = r1.A0A(r12);
        if (A0A2 != null) {
            long A042 = this.A0a.A04(r12);
            long A062 = this.A0d.A06(r12);
            C29691ci A0A3 = r1.A0A(r12);
            C17960vV.A07(A0A3);
            synchronized (A0A3) {
                A0A2.A0C();
                if (A042 != 1) {
                    AnonymousClass206 A032 = ((AnonymousClass1W6) this.A1E.get()).A01.A03(A042);
                    A0A2.A0g = A032;
                    if (A032 != null) {
                        if (AnonymousClass25A.A0f(A032) || AnonymousClass25A.A0b(A032)) {
                            A0A2.A0g = null;
                        } else {
                            A0A2.A0W = A042;
                            A0A2.A0X = A062;
                            A0A2.A0Z = A032.A0I;
                        }
                        A0A2.A0R = A042;
                        A0A2.A0S = A062;
                        A0A2.A0T = A042;
                        A0A2.A0U = A062;
                        A0A2.A0P = A042;
                        A0A2.A0Q = A062;
                        A0A2.A0f = null;
                    }
                }
            }
            int A063 = this.A0C.A06(A0A2);
            StringBuilder sb = new StringBuilder();
            sb.append("CoreMessageStore/updateChatTable/updated:");
            sb.append(A063);
            Log.i(sb.toString());
        }
    }

    public void CQw(AnonymousClass206 r6) {
        if (r6.A0x < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("CoreMessageStore/updateMessageAsync/message must have row_id set; key=");
            sb.append(r6.A0v);
            C17960vV.A0F(false, sb.toString());
        }
        CQx(r6, -1);
    }

    public void CQx(AnonymousClass206 r4, int i) {
        ((C31931gM) this.A16.get()).A01(new C70863Cu(this, i, 3, r4), 22);
    }

    public void CQz(AW0 aw0, AnonymousClass205 r5) {
        StringBuilder sb = new StringBuilder();
        sb.append("CoreMessageStore/updateMessagePaymentTransaction/PAY transactionStatus:");
        sb.append(aw0.A02);
        sb.append(" for key:");
        sb.append(r5);
        Log.i(sb.toString());
        ((C31931gM) this.A16.get()).A01(new AnonymousClass3C4(this, r5, aw0, 15), 28);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02b5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02b6, code lost:
        r9 = 0;
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x036f, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A0q, 4905) == false) goto L_0x0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ad, code lost:
        if (r0.A02() == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bd, code lost:
        if (r2.A0D < X.AnonymousClass11P.A01(r3.A0A)) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06f0, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:?, code lost:
        com.whatsapp.util.Log.e(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06f6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06f7, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0757, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fe, code lost:
        if (r10 == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0758, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:?, code lost:
        com.whatsapp.util.Log.w("CoreMessageStore/addmsg/will retry ", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:?, code lost:
        r25.close();
        android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0767, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:?, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("CoreMessageStore/end transaction ");
        r5.append(r8);
        com.whatsapp.util.Log.e(r5.toString(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0792, code lost:
        r5 = r3.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0798, code lost:
        if (r5.A0O() != false) goto L_0x079a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x079a, code lost:
        r6 = r3.A1b;
        r6.A04("fts_ready", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:?, code lost:
        r40 = CST(r4, 0);
        r5.A0K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x07a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r3.A0U.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:?, code lost:
        com.whatsapp.util.Log.e(r5);
        r3.A0T.A00(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x07bd, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x07be, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x07bf, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x07e1, code lost:
        r4.A0F = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x083a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x083b, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0132, code lost:
        if ((r1.A0I + (((long) r0) * 1000)) >= r6) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0977, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:?, code lost:
        r25.close();
        android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x097f, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:?, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("CoreMessageStore/end transaction ");
        r5.append(r8);
        com.whatsapp.util.Log.e(r5.toString(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x09ac, code lost:
        r5 = r3.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x09b2, code lost:
        if (r5.A0O() != false) goto L_0x09b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x09b4, code lost:
        r6 = r3.A1b;
        r6.A04("fts_ready", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:?, code lost:
        r40 = CST(r4, 0);
        r5.A0K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x09c4, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:?, code lost:
        r6.A04("fts_ready", 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x09ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x09cb, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r3.A0U.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0207, code lost:
        if (X.C22971Dz.A0a(r21) != false) goto L_0x0209;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x03e4 A[Catch:{ all -> 0x039c, IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0453 A[Catch:{ all -> 0x039c, IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0471 A[Catch:{ all -> 0x039c, IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0489 A[Catch:{ all -> 0x039c, IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x06f0 A[ExcHandler: Error | RuntimeException (e java.lang.Throwable), Splitter:B:130:0x02ba] */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0757 A[ExcHandler: SQLiteDiskIOException (e android.database.sqlite.SQLiteDiskIOException), Splitter:B:123:0x0291] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x075b  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x07b4 A[SYNTHETIC, Splitter:B:394:0x07b4] */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x07be A[ExcHandler: SQLiteConstraintException (e android.database.sqlite.SQLiteConstraintException), Splitter:B:123:0x0291] */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x07e1 A[Catch:{ all -> 0x0977 }] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x083a A[ExcHandler: IOException (e java.io.IOException), Splitter:B:123:0x0291] */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x08b9  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:399:0x07c0=Splitter:B:399:0x07c0, B:347:0x06fb=Splitter:B:347:0x06fb, B:424:0x083c=Splitter:B:424:0x083c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C62062qj CST(X.AnonymousClass206 r48, int r49) {
        /*
            r47 = this;
            java.lang.String r20 = "SQL logic error or missing database"
            java.lang.String r23 = "CoreMessageStore/end transaction "
            java.lang.String r24 = " "
            java.lang.String r14 = "fts_ready"
            r4 = r48
            X.205 r5 = r4.A0v
            X.1BI r0 = r5.A00
            r21 = r0
            boolean r0 = X.C22971Dz.A0a(r21)
            r3 = r47
            if (r0 == 0) goto L_0x008d
            X.1Le r0 = r3.A0g
            boolean r0 = r0.A0J(r4)
            java.lang.String r9 = " timestamp:"
            if (r0 == 0) goto L_0x004e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "CoreMessageStore/statusexpired/"
            r2.append(r0)
            r2.append(r5)
            r2.append(r9)
            long r0 = r4.A0I
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r41 = 0
            r45 = 1
            X.2qj r40 = new X.2qj
            r43 = r41
            r44 = r41
            r42 = r41
            r40.<init>(r41, r42, r43, r44, r45)
            return r40
        L_0x004e:
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x008d
            X.1BI r0 = r4.A0H()
            boolean r0 = X.C22971Dz.A0Z(r0)
            if (r0 != 0) goto L_0x008d
            X.1M9 r8 = r3.A08
            com.whatsapp.jid.UserJid r0 = r4.A0I()
            X.1E7 r2 = r8.A0E(r0)
            if (r2 == 0) goto L_0x00a2
            boolean r0 = r2.A0B()
            if (r0 == 0) goto L_0x00a2
            long r6 = r2.A0D
            long r0 = r4.A0I
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 + r9
            int r9 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x008d
            X.11P r0 = r3.A0A
            long r0 = X.AnonymousClass11P.A01(r0)
            r6 = 604800000(0x240c8400, double:2.988109026E-315)
            long r0 = r0 + r6
            r2.A0D = r0
            java.util.List r0 = java.util.Collections.singletonList(r2)
            r8.A0q(r0)
        L_0x008d:
            boolean r7 = r5.A02
            if (r7 == 0) goto L_0x0101
            X.190 r6 = r3.A04
            X.11S r2 = r3.A06
            X.1CJ r1 = r3.A0D
            X.1MZ r0 = r3.A0N
            boolean r0 = X.AnonymousClass25A.A0L(r6, r2, r1, r0, r4)
            if (r0 != 0) goto L_0x0101
        L_0x009f:
            X.2qj r40 = X.C62062qj.A05
            return r40
        L_0x00a2:
            X.36j r0 = X.C63672tV.A02(r4)
            if (r0 == 0) goto L_0x00af
            boolean r0 = r0.A02()
            r10 = 1
            if (r0 != 0) goto L_0x00b0
        L_0x00af:
            r10 = 0
        L_0x00b0:
            if (r2 == 0) goto L_0x00bf
            long r0 = r2.A0D
            X.11P r6 = r3.A0A
            long r7 = X.AnonymousClass11P.A01(r6)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r7 = 1
            if (r6 >= 0) goto L_0x00c0
        L_0x00bf:
            r7 = 0
        L_0x00c0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "CoreMessageStore/status-from-unknown/ id:"
            r6.append(r0)
            java.lang.String r0 = r5.A01
            r6.append(r0)
            java.lang.String r0 = " from:"
            r6.append(r0)
            com.whatsapp.jid.UserJid r0 = r4.A0I()
            r6.append(r0)
            r6.append(r9)
            long r0 = r4.A0I
            r6.append(r0)
            java.lang.String r0 = " cached:"
            r6.append(r0)
            r6.append(r7)
            java.lang.String r0 = " contact-is-null:"
            r6.append(r0)
            r0 = 0
            if (r2 != 0) goto L_0x00f4
            r0 = 1
        L_0x00f4:
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r10 != 0) goto L_0x008d
            goto L_0x009f
        L_0x0101:
            int r1 = r4.A05
            r0 = 0
            if (r1 <= 0) goto L_0x0107
            r0 = 1
        L_0x0107:
            r19 = 0
            r43 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0158
            X.00H r0 = r3.A1E
            java.lang.Object r0 = r0.get()
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            X.1W2 r0 = r0.A01
            X.206 r1 = r0.A05(r5)
            X.11P r0 = r3.A0A
            if (r1 == 0) goto L_0x0142
            long r6 = X.AnonymousClass11P.A01(r0)
            int r0 = r4.A05
            if (r0 <= 0) goto L_0x0134
            long r4 = r1.A0I
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            long r4 = r4 + r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 1
            if (r0 < 0) goto L_0x0135
        L_0x0134:
            r5 = 0
        L_0x0135:
            r4 = 1
            X.2qj r40 = new X.2qj
            r2 = r19
            r3 = r2
            r0 = r40
            r1 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            return r40
        L_0x0142:
            long r0 = X.AnonymousClass11P.A01(r0)
            boolean r0 = X.AnonymousClass25A.A0y(r4, r0)
            if (r0 == 0) goto L_0x0158
            r5 = 1
            X.2qj r40 = new X.2qj
            r3 = r2
            r4 = r2
            r0 = r40
            r1 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            return r40
        L_0x0158:
            if (r7 != 0) goto L_0x01ac
            X.206 r0 = r4.A0K()
            if (r0 == 0) goto L_0x01ac
            X.205 r8 = r0.A0v
            X.00H r0 = r3.A1E
            java.lang.Object r0 = r0.get()
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            X.1W2 r0 = r0.A01
            X.206 r1 = r0.A05(r8)
            if (r1 == 0) goto L_0x01ac
            boolean r0 = X.AnonymousClass25A.A0p(r1)
            if (r0 != 0) goto L_0x01ac
            int r6 = r1.A0u
            r0 = 12
            if (r6 == r0) goto L_0x01ac
            r0 = 90
            if (r6 == r0) goto L_0x01ac
            boolean r0 = X.C20133A8t.A0A(r4)
            if (r0 != 0) goto L_0x01ac
            boolean r0 = r8 instanceof X.AnonymousClass2M2
            if (r0 == 0) goto L_0x0280
            boolean r0 = r1 instanceof X.AnonymousClass21L
            if (r0 == 0) goto L_0x0280
            r0 = r1
            X.21L r0 = (X.AnonymousClass21L) r0
            java.util.List r6 = r0.A17()
            if (r6 == 0) goto L_0x0280
            X.1R0 r6 = r3.A1n
            java.util.List r1 = r0.A17()
            X.2M2 r8 = (X.AnonymousClass2M2) r8
            int r0 = r8.A00
            java.lang.Object r0 = r1.get(r0)
            X.206 r0 = (X.AnonymousClass206) r0
            r6.A00(r4, r0)
        L_0x01ac:
            X.206 r0 = r4.A0K()
            if (r0 == 0) goto L_0x01c0
            X.1QS r0 = r3.A0z
            X.AnonymousClass1QS.A00(r0)
            X.1QR r1 = r0.A04
            X.206 r0 = r4.A0K()
            r1.A0Z(r0)
        L_0x01c0:
            X.206 r1 = r4.A0K()
            boolean r0 = r1 instanceof X.C441322g
            if (r0 == 0) goto L_0x01f8
            X.21V r1 = (X.AnonymousClass21V) r1
            X.2rc r0 = r1.A02
            if (r0 == 0) goto L_0x01f8
            java.io.File r0 = r0.A0G
            if (r0 != 0) goto L_0x01f8
            X.00H r0 = r3.A1E
            java.lang.Object r6 = r0.get()
            X.1W6 r6 = (X.AnonymousClass1W6) r6
            X.206 r0 = r4.A0K()
            X.205 r1 = r0.A0v
            X.1W2 r0 = r6.A01
            X.206 r1 = r0.A05(r1)
            boolean r0 = r1 instanceof X.C441322g
            if (r0 == 0) goto L_0x0279
            X.21V r1 = (X.AnonymousClass21V) r1
            X.2rc r1 = r1.A02
            if (r1 == 0) goto L_0x01f8
            X.206 r0 = r4.A0K()
            X.21V r0 = (X.AnonymousClass21V) r0
            r0.A02 = r1
        L_0x01f8:
            boolean r9 = X.C22971Dz.A0e(r21)
            boolean r0 = X.C22971Dz.A0N(r21)
            if (r0 == 0) goto L_0x0209
            boolean r0 = X.C22971Dz.A0a(r21)
            r6 = 1
            if (r0 == 0) goto L_0x020a
        L_0x0209:
            r6 = 0
        L_0x020a:
            if (r9 == 0) goto L_0x0230
            boolean r0 = r4 instanceof X.C436420i
            if (r0 != 0) goto L_0x0230
            X.1BI r0 = r4.A0H()
            if (r0 != 0) goto L_0x0230
            if (r7 != 0) goto L_0x0230
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/addmsg/error/group/remote_resource is null! "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass25A.A0D(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0230:
            X.00H r0 = r3.A18
            java.lang.Object r0 = r0.get()
            X.1PW r0 = (X.AnonymousClass1PW) r0
            boolean r8 = r0.A0B(r4)
            if (r9 != 0) goto L_0x0254
            if (r6 != 0) goto L_0x0254
            if (r8 == 0) goto L_0x024b
            boolean r0 = X.C22971Dz.A0d(r21)
            if (r0 == 0) goto L_0x024b
            r0 = 2
            r4.A0A = r0
        L_0x024b:
            X.1Cd r0 = r3.A0V
            r46 = r0
            X.1au r18 = r46.A05()
            goto L_0x0287
        L_0x0254:
            X.1MZ r0 = r3.A0N
            r1 = r21
            X.1E9 r1 = (X.AnonymousClass1E9) r1
            X.1MW r0 = r0.A08
            X.2tp r6 = r0.A0C(r1)
            if (r7 == 0) goto L_0x0266
            boolean r0 = r4.A19
            if (r0 != 0) goto L_0x024b
        L_0x0266:
            int r1 = r6.A06()
            int r1 = r1 + r8
            if (r9 == 0) goto L_0x0272
            r0 = 1
        L_0x026e:
            int r1 = r1 - r0
            r4.A0A = r1
            goto L_0x024b
        L_0x0272:
            X.11S r0 = r3.A06
            boolean r0 = r6.A0W(r0)
            goto L_0x026e
        L_0x0279:
            java.lang.String r0 = "CoreMessageStore/addmsg/background/error fetching quoted sticker message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x01f8
        L_0x0280:
            X.1R0 r0 = r3.A1n
            r0.A00(r4, r1)
            goto L_0x01ac
        L_0x0287:
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x09d8 }
            X.1xA r25 = r18.BD0()     // Catch:{ all -> 0x09d8 }
            r8 = r49
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f6, Error | RuntimeException -> 0x06f0 }
            long r0 = r0 - r9
            r9 = 60000(0xea60, double:2.9644E-319)
            int r6 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x02ba
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x02b5, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r9.<init>()     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x02b5, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.lang.String r6 = "CoreMessageStore/addmsg/background/transaction-delayed "
            r9.append(r6)     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x02b5, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r10
            r9.append(r0)     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x02b5, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.lang.String r0 = r9.toString()     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x02b5, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x02b5, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            goto L_0x02ba
        L_0x02b5:
            r0 = move-exception
            r9 = 0
            r10 = 1
            goto L_0x06fb
        L_0x02ba:
            boolean r0 = X.C22971Dz.A0N(r21)     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f6, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x0356
            if (r7 == 0) goto L_0x0356
            int r1 = r4.A0D()     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f6, Error | RuntimeException -> 0x06f0 }
            if (r1 == 0) goto L_0x02cb
            r0 = 2
            if (r1 != r0) goto L_0x0356
        L_0x02cb:
            boolean r0 = X.C22971Dz.A0a(r21)     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f6, Error | RuntimeException -> 0x06f0 }
            if (r0 != 0) goto L_0x0356
            r0 = 1
            r4.A0l = r0     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f6, Error | RuntimeException -> 0x06f0 }
            java.util.List r13 = r4.A0T()     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f6, Error | RuntimeException -> 0x06f0 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f6, Error | RuntimeException -> 0x06f0 }
            r6.<init>()     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f6, Error | RuntimeException -> 0x06f0 }
            X.C17960vV.A07(r13)     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f6, Error | RuntimeException -> 0x06f0 }
            java.util.Iterator r12 = r13.iterator()     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f6, Error | RuntimeException -> 0x06f0 }
        L_0x02e4:
            boolean r0 = r12.hasNext()     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f6, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x0338
            java.lang.Object r9 = r12.next()     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f6, Error | RuntimeException -> 0x06f0 }
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f6, Error | RuntimeException -> 0x06f0 }
            long r0 = r4.A0I     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f6, Error | RuntimeException -> 0x06f0 }
            r10 = 1
            r26 = r3
            r27 = r9
            r28 = r4
            r29 = r6
            r30 = r0
            X.206 r11 = r26.A0K(r27, r28, r29, r30)     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1NK r0 = r3.A0a     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            boolean r0 = r0.A09(r9)     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            A0B(r3, r11)     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            A05(r3, r9, r11, r0)     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.0zA r9 = r3.A02     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            boolean r0 = r9.A07()     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x0329
            r0 = 2097152(0x200000, double:1.0361308E-317)
            boolean r0 = r11.A11(r0)     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x0329
            r9.A03()     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.lang.String r1 = "hasPlaceholder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            throw r0     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
        L_0x0329:
            X.00H r0 = r3.A1E     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r0.A04(r11)     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r3.A0Q(r11)     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            goto L_0x02e4
        L_0x0338:
            r10 = 1
            int r1 = r13.size()     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            int r0 = r6.size()     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r1 != r0) goto L_0x034a
            r4.A0j = r6     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
        L_0x0345:
            int r9 = r13.size()     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            goto L_0x0358
        L_0x034a:
            int r0 = r6.size()     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x0345
            java.lang.String r0 = "msgstore/validateBroadcastParticipantSizes failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x083a, SQLiteConstraintException -> 0x07be, SQLiteDiskIOException -> 0x0757, SQLiteDatabaseCorruptException -> 0x06f9, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            goto L_0x0345
        L_0x0356:
            r10 = 1
            r9 = 0
        L_0x0358:
            boolean r0 = X.C22971Dz.A0a(r21)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x03a1
            r13 = 1
            if (r7 == 0) goto L_0x03a1
            boolean r0 = r4.A19     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x0371
            X.0ve r6 = r3.A0q     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r1 = 4905(0x1329, float:6.873E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            boolean r0 = X.C18020vd.A05(r0, r6, r1)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 != 0) goto L_0x03a6
        L_0x0371:
            X.1RS r1 = r3.A0e     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            boolean r0 = X.C22971Dz.A0a(r21)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x03a6
            X.1Cd r0 = r1.A05     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1au r11 = r0.A05()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1xA r6 = r11.BD0()     // Catch:{ all -> 0x0397 }
            r1.A02(r4, r10, r2)     // Catch:{ all -> 0x038d }
            r6.A00()     // Catch:{ all -> 0x038d }
            r6.close()     // Catch:{ all -> 0x0397 }
            goto L_0x03a3
        L_0x038d:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0392 }
            goto L_0x0396
        L_0x0392:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0397 }
        L_0x0396:
            throw r1     // Catch:{ all -> 0x0397 }
        L_0x0397:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x039c }
            goto L_0x03a0
        L_0x039c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
        L_0x03a0:
            throw r1     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
        L_0x03a1:
            r13 = 0
            goto L_0x03a6
        L_0x03a3:
            r11.close()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
        L_0x03a6:
            X.1RP r11 = r3.A1a     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.util.HashSet r6 = r11.A06(r4)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r6 == 0) goto L_0x03c6
            boolean r0 = X.C22971Dz.A0d(r21)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x03c6
            boolean r0 = X.C62832s4.A02(r6)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x03c6
            r0 = 134217728(0x8000000, double:6.63123685E-316)
            boolean r12 = r4.A11(r0)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r12 != 0) goto L_0x03c6
            r4.A0b(r0)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
        L_0x03c6:
            X.00H r0 = r3.A1E     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r0.A04(r4)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            long r0 = r4.A0x     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r31 = -1
            int r12 = (r0 > r31 ? 1 : (r0 == r31 ? 0 : -1))
            if (r12 != 0) goto L_0x03dd
            boolean r0 = r4 instanceof X.C442522s     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x0453
        L_0x03dd:
            int r1 = r4.A0D()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r0 = 6
            if (r1 == r0) goto L_0x0453
            if (r6 != 0) goto L_0x03eb
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r6.<init>()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
        L_0x03eb:
            boolean r0 = r6.isEmpty()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 != 0) goto L_0x042c
            r11.A08(r4, r6)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1Qw r0 = r3.A0Z     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1Qt r0 = X.C26111Qw.A00(r0, r4)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            boolean r0 = r0.A0B(r4, r6)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 != 0) goto L_0x042c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r1.<init>()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.lang.String r0 = "CoreMessageStore/addmsg error adding blank receipts for: "
            r1.append(r0)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r1.append(r5)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r0 = 20
            r4.A0a(r0)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1PT r11 = r3.A0w     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.2qt r1 = new X.2qt     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r0 = 3
            r1.A04 = r0     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r1.A0B = r10     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.2h5 r0 = r1.A01()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r11.A08(r0)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
        L_0x042c:
            if (r13 == 0) goto L_0x0467
            boolean r0 = r4.A19     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x0467
            X.0ve r11 = r3.A0q     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r1 = 4905(0x1329, float:6.873E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            boolean r0 = X.C18020vd.A05(r0, r11, r1)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x0467
            X.00H r0 = r3.A16     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.lang.Object r11 = r0.get()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1gM r11 = (X.C31931gM) r11     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r1 = 16
            X.3C4 r0 = new X.3C4     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r0.<init>(r3, r4, r6, r1)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r1 = 74
            r11.A02(r0, r1)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            goto L_0x0467
        L_0x0453:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r1.<init>()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.lang.String r0 = "CoreMessageStore/addmsg not adding blank receipts for: "
            r1.append(r0)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r1.append(r5)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
        L_0x0467:
            long r0 = r4.A0x     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            int r6 = (r0 > r31 ? 1 : (r0 == r31 ? 0 : -1))
            if (r6 != 0) goto L_0x0489
            boolean r0 = r4 instanceof X.C442522s     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 != 0) goto L_0x0489
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r1.<init>()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.lang.String r0 = "CoreMessageStore/addmsg failed to insert: "
            r1.append(r0)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r1.append(r5)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r41 = 0
            goto L_0x0690
        L_0x0489:
            boolean r0 = X.C22971Dz.A0a(r21)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x05b7
            boolean r0 = X.C20133A8t.A0A(r4)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 != 0) goto L_0x0643
            boolean r0 = r4 instanceof X.C442522s     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 != 0) goto L_0x0643
            X.1Le r13 = r3.A0g     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.lang.Object r0 = r13.A09     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r22 = r0
            monitor-enter(r22)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.C24661Le.A03(r13)     // Catch:{ all -> 0x05b4 }
            if (r7 == 0) goto L_0x04a6
            goto L_0x04b2
        L_0x04a6:
            com.whatsapp.jid.UserJid r0 = r4.A0I()     // Catch:{ all -> 0x05b4 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x05b4 }
            X.2sx r1 = r13.A08(r0)     // Catch:{ all -> 0x05b4 }
            goto L_0x04b6
        L_0x04b2:
            X.2sx r1 = r13.A07()     // Catch:{ all -> 0x05b4 }
        L_0x04b6:
            r0 = 4
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x05b4 }
            r6.<init>(r0)     // Catch:{ all -> 0x05b4 }
            if (r1 != 0) goto L_0x0552
            if (r7 == 0) goto L_0x04df
            X.11P r1 = r13.A01     // Catch:{ all -> 0x05b4 }
            X.1E5 r28 = X.AnonymousClass1E5.A00     // Catch:{ all -> 0x05b4 }
            r41 = 0
            X.2sx r0 = new X.2sx     // Catch:{ all -> 0x05b4 }
            r30 = r2
            r35 = r31
            r37 = r31
            r39 = r31
            r26 = r0
            r27 = r1
            r29 = r2
            r33 = r31
            r26.<init>(r27, r28, r29, r30, r31, r33, r35, r37, r39, r41)     // Catch:{ all -> 0x05b4 }
            r0.A07(r4)     // Catch:{ all -> 0x05b4 }
            goto L_0x052b
        L_0x04df:
            X.11P r0 = r13.A01     // Catch:{ all -> 0x05b4 }
            r17 = r0
            com.whatsapp.jid.UserJid r28 = r4.A0I()     // Catch:{ all -> 0x05b4 }
            X.C17960vV.A07(r28)     // Catch:{ all -> 0x05b4 }
            long r0 = r4.A0y     // Catch:{ all -> 0x05b4 }
            r33 = r0
            long r15 = r4.A0y     // Catch:{ all -> 0x05b4 }
            r0 = 1
            long r15 = r15 - r0
            long r11 = r4.A0y     // Catch:{ all -> 0x05b4 }
            long r11 = r11 - r0
            long r0 = r4.A0y     // Catch:{ all -> 0x05b4 }
            r39 = r0
            long r0 = r4.A0y     // Catch:{ all -> 0x05b4 }
            r41 = r0
            long r0 = r4.A0I     // Catch:{ all -> 0x05b4 }
            r44 = r0
            X.2sx r0 = new X.2sx     // Catch:{ all -> 0x05b4 }
            r30 = r2
            r26 = r0
            r27 = r17
            r29 = r2
            r31 = r33
            r33 = r15
            r35 = r11
            r37 = r39
            r39 = r41
            r41 = r44
            r26.<init>(r27, r28, r29, r30, r31, r33, r35, r37, r39, r41)     // Catch:{ all -> 0x05b4 }
            r0.A08 = r4     // Catch:{ all -> 0x05b4 }
            r0.A07 = r4     // Catch:{ all -> 0x05b4 }
            int r1 = r0.A00     // Catch:{ all -> 0x05b4 }
            int r1 = r1 + 1
            r0.A00 = r1     // Catch:{ all -> 0x05b4 }
            int r1 = r0.A01     // Catch:{ all -> 0x05b4 }
            int r1 = r1 + 1
            r0.A01 = r1     // Catch:{ all -> 0x05b4 }
        L_0x052b:
            java.lang.String r1 = "last_read_message_table_id"
            long r11 = r4.A0y     // Catch:{ all -> 0x05b4 }
            r15 = 1
            long r11 = r11 - r15
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x05b4 }
            r6.put(r1, r11)     // Catch:{ all -> 0x05b4 }
            java.lang.String r1 = "last_read_receipt_sent_message_table_id"
            long r11 = r4.A0y     // Catch:{ all -> 0x05b4 }
            long r11 = r11 - r15
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x05b4 }
            r6.put(r1, r11)     // Catch:{ all -> 0x05b4 }
            java.util.concurrent.ConcurrentHashMap r11 = r13.A0C     // Catch:{ all -> 0x05b4 }
            X.C17960vV.A07(r11)     // Catch:{ all -> 0x05b4 }
            com.whatsapp.jid.UserJid r1 = r0.A0A     // Catch:{ all -> 0x05b4 }
            r11.put(r1, r0)     // Catch:{ all -> 0x05b4 }
            r17 = 1
            goto L_0x0558
        L_0x0552:
            X.2sx r0 = r1.A07(r4)     // Catch:{ all -> 0x05b4 }
            r17 = 0
        L_0x0558:
            java.lang.String r1 = "message_table_id"
            long r11 = r4.A0y     // Catch:{ all -> 0x05b4 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x05b4 }
            r6.put(r1, r11)     // Catch:{ all -> 0x05b4 }
            java.lang.String r11 = "timestamp"
            long r15 = r0.A04()     // Catch:{ all -> 0x05b4 }
            java.lang.Long r1 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x05b4 }
            r6.put(r11, r1)     // Catch:{ all -> 0x05b4 }
            java.lang.String r11 = "unseen_count"
            int r1 = r0.A01()     // Catch:{ all -> 0x05b4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x05b4 }
            r6.put(r11, r1)     // Catch:{ all -> 0x05b4 }
            java.lang.String r11 = "total_count"
            int r1 = r0.A00()     // Catch:{ all -> 0x05b4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x05b4 }
            r6.put(r11, r1)     // Catch:{ all -> 0x05b4 }
            java.lang.String r11 = "first_unread_message_table_id"
            long r15 = r0.A02()     // Catch:{ all -> 0x05b4 }
            java.lang.Long r1 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x05b4 }
            r6.put(r11, r1)     // Catch:{ all -> 0x05b4 }
            java.lang.String r1 = "autodownload_limit_message_table_id"
            monitor-enter(r0)     // Catch:{ all -> 0x05b4 }
            long r11 = r0.A02     // Catch:{ all -> 0x05b1 }
            monitor-exit(r0)     // Catch:{ all -> 0x05b4 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x05b4 }
            r6.put(r1, r11)     // Catch:{ all -> 0x05b4 }
            com.whatsapp.jid.UserJid r0 = r0.A0A     // Catch:{ all -> 0x05b4 }
            X.C24661Le.A02(r6, r13, r0, r4, r10)     // Catch:{ all -> 0x05b4 }
            monitor-exit(r22)     // Catch:{ all -> 0x05b4 }
            r19 = r17
            goto L_0x0643
        L_0x05b1:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x05b4 }
            throw r1     // Catch:{ all -> 0x05b4 }
        L_0x05b4:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x05b4 }
            throw r0     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
        L_0x05b7:
            boolean r0 = r4.A0w()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 != 0) goto L_0x0643
            X.1CJ r6 = r3.A0D     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r0 = r21
            X.1ci r1 = r6.A0A(r0)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1Q0 r0 = r3.A1R     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            boolean r43 = r0.A06(r1, r4)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r3.A0Q(r4)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r1 != 0) goto L_0x05da
            r0 = r21
            X.1ci r0 = r6.A0A(r0)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x05da
            r19 = 1
        L_0x05da:
            boolean r0 = r4 instanceof X.C436420i     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x0643
            if (r7 == 0) goto L_0x0643
            r0 = r21
            boolean r0 = r0 instanceof X.AnonymousClass1E9     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x0643
            r1 = r4
            X.20i r1 = (X.C436420i) r1     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1MZ r13 = r3.A0N     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r13.A0G(r1)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.205 r0 = r1.A0v     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1BI r12 = r0.A00     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1Dv r0 = X.AnonymousClass1BI.A00     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1E9 r11 = X.C50242Tr.A00(r12)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.C17960vV.A07(r11)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            int r6 = r1.A00     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r0 = 5
            if (r6 == r0) goto L_0x060b
            r0 = 7
            if (r6 == r0) goto L_0x060b
            r0 = 13
            if (r6 == r0) goto L_0x060b
            r0 = 14
            if (r6 != r0) goto L_0x061c
        L_0x060b:
            boolean r0 = r11 instanceof com.whatsapp.jid.GroupJid     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x061c
            X.2mH r15 = r3.A10     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            com.whatsapp.jid.GroupJid r11 = (com.whatsapp.jid.GroupJid) r11     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            boolean r1 = r13.A0J(r11)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r0 = r18
            r15.A00(r0, r11, r1)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
        L_0x061c:
            r0 = 5
            if (r6 == r0) goto L_0x062a
            r0 = 7
            if (r6 == r0) goto L_0x062a
            r0 = 13
            if (r6 == r0) goto L_0x062a
            r0 = 14
            if (r6 != r0) goto L_0x0643
        L_0x062a:
            boolean r0 = r12 instanceof com.whatsapp.jid.GroupJid     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x0643
            com.whatsapp.jid.GroupJid r12 = (com.whatsapp.jid.GroupJid) r12     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            boolean r0 = r13.A0J(r12)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 != 0) goto L_0x0643
            X.00H r0 = r3.A1D     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.2r4 r1 = (X.C62232r4) r1     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r0 = r18
            r1.A01(r0, r12)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
        L_0x0643:
            r25.A00()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1Q6 r1 = r3.A0R     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1Q7 r0 = r1.A01     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r0.A01(r4, r5)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.util.concurrent.ConcurrentHashMap r0 = r1.A03     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r0.remove(r5)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.0ve r6 = r3.A0q     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r1 = 4893(0x131d, float:6.857E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            boolean r0 = X.C18020vd.A05(r0, r6, r1)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x066a
            boolean r0 = r4 instanceof X.AnonymousClass21L     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x066a
            if (r7 != 0) goto L_0x066a
            r0 = r4
            X.21L r0 = (X.AnonymousClass21L) r0     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r3.A0T(r0)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
        L_0x066a:
            boolean r0 = r4 instanceof X.C436420i     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 != 0) goto L_0x068e
            long r0 = r4.A0G     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r11 = 0
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x068e
            X.1h1 r0 = r3.A01     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            if (r0 == 0) goto L_0x068e
            X.00H r0 = r3.A16     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            java.lang.Object r6 = r0.get()     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            X.1gM r6 = (X.C31931gM) r6     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r0 = 19
            X.3Bx r1 = new X.3Bx     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r1.<init>(r3, r4, r0)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
            r0 = 25
            r6.A02(r1, r0)     // Catch:{ IOException -> 0x06ed, SQLiteConstraintException -> 0x06ea, SQLiteDiskIOException -> 0x06e8, SQLiteDatabaseCorruptException -> 0x06e6, Error | RuntimeException -> 0x06f0, Error | RuntimeException -> 0x06f0 }
        L_0x068e:
            r41 = 1
        L_0x0690:
            r25.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x06da, SQLiteException -> 0x0697 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x06da, SQLiteException -> 0x0697 }
            goto L_0x06e3
        L_0x0697:
            r1 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x09d8 }
            r5.<init>()     // Catch:{ all -> 0x09d8 }
            r0 = r23
            r5.append(r0)     // Catch:{ all -> 0x09d8 }
            r5.append(r8)     // Catch:{ all -> 0x09d8 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x09d8 }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x09d8 }
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x09d8 }
            if (r0 != 0) goto L_0x06c2
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d7
            java.lang.String r5 = r1.getMessage()     // Catch:{ all -> 0x09d8 }
            r0 = r20
            boolean r0 = r5.contains(r0)     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d7
        L_0x06c2:
            if (r49 == 0) goto L_0x09d7
            X.1QB r5 = r3.A0M     // Catch:{ all -> 0x09d8 }
            boolean r0 = r5.A0O()     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d7
            X.1La r0 = r3.A1b     // Catch:{ all -> 0x09d8 }
            r0.A04(r14, r2)     // Catch:{ all -> 0x09d8 }
            X.2qj r40 = r3.CST(r4, r2)     // Catch:{ Exception -> 0x074e }
            r5.A0K()     // Catch:{ Exception -> 0x074e }
            goto L_0x09c0
        L_0x06da:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x09d8 }
            X.1Cn r0 = r3.A0U     // Catch:{ all -> 0x09d8 }
            r0.A03()     // Catch:{ all -> 0x09d8 }
        L_0x06e3:
            r0 = 0
            goto L_0x0895
        L_0x06e6:
            r0 = move-exception
            goto L_0x06fb
        L_0x06e8:
            r5 = move-exception
            goto L_0x0759
        L_0x06ea:
            r6 = move-exception
            goto L_0x07c0
        L_0x06ed:
            r0 = move-exception
            goto L_0x083c
        L_0x06f0:
            r5 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r5)     // Catch:{ all -> 0x0977 }
            goto L_0x07bd
        L_0x06f6:
            r0 = move-exception
            r10 = 1
            goto L_0x06fa
        L_0x06f9:
            r0 = move-exception
        L_0x06fa:
            r9 = 0
        L_0x06fb:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0977 }
            X.1Cn r1 = r3.A0U     // Catch:{ all -> 0x0977 }
            r1.A03()     // Catch:{ all -> 0x0977 }
            r25.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0751, SQLiteException -> 0x070b }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0751, SQLiteException -> 0x070b }
            goto L_0x0892
        L_0x070b:
            r1 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x09d8 }
            r5.<init>()     // Catch:{ all -> 0x09d8 }
            r0 = r23
            r5.append(r0)     // Catch:{ all -> 0x09d8 }
            r5.append(r8)     // Catch:{ all -> 0x09d8 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x09d8 }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x09d8 }
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x09d8 }
            if (r0 != 0) goto L_0x0736
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d7
            java.lang.String r5 = r1.getMessage()     // Catch:{ all -> 0x09d8 }
            r0 = r20
            boolean r0 = r5.contains(r0)     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d7
        L_0x0736:
            if (r49 == 0) goto L_0x09d7
            X.1QB r5 = r3.A0M     // Catch:{ all -> 0x09d8 }
            boolean r0 = r5.A0O()     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d7
            X.1La r0 = r3.A1b     // Catch:{ all -> 0x09d8 }
            r0.A04(r14, r2)     // Catch:{ all -> 0x09d8 }
            X.2qj r40 = r3.CST(r4, r2)     // Catch:{ Exception -> 0x074e }
            r5.A0K()     // Catch:{ Exception -> 0x074e }
            goto L_0x09c0
        L_0x074e:
            r1 = move-exception
            goto L_0x09d4
        L_0x0751:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x09d8 }
            goto L_0x088f
        L_0x0757:
            r5 = move-exception
            r9 = 0
        L_0x0759:
            if (r49 == 0) goto L_0x07b4
            java.lang.String r0 = "CoreMessageStore/addmsg/will retry "
            com.whatsapp.util.Log.w(r0, r5)     // Catch:{ all -> 0x0977 }
            r25.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x07a8, SQLiteException -> 0x0767 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x07a8, SQLiteException -> 0x0767 }
            goto L_0x07b1
        L_0x0767:
            r1 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x09d8 }
            r5.<init>()     // Catch:{ all -> 0x09d8 }
            r0 = r23
            r5.append(r0)     // Catch:{ all -> 0x09d8 }
            r5.append(r8)     // Catch:{ all -> 0x09d8 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x09d8 }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x09d8 }
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x09d8 }
            if (r0 != 0) goto L_0x0792
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x07b1
            java.lang.String r5 = r1.getMessage()     // Catch:{ all -> 0x09d8 }
            r0 = r20
            boolean r0 = r5.contains(r0)     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x07b1
        L_0x0792:
            X.1QB r5 = r3.A0M     // Catch:{ all -> 0x09d8 }
            boolean r0 = r5.A0O()     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d7
            X.1La r6 = r3.A1b     // Catch:{ all -> 0x09d8 }
            r6.A04(r14, r2)     // Catch:{ all -> 0x09d8 }
            X.2qj r40 = r3.CST(r4, r2)     // Catch:{ Exception -> 0x09c4 }
            r5.A0K()     // Catch:{ Exception -> 0x09c4 }
            goto L_0x09c0
        L_0x07a8:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x09d8 }
            X.1Cn r0 = r3.A0U     // Catch:{ all -> 0x09d8 }
            r0.A03()     // Catch:{ all -> 0x09d8 }
        L_0x07b1:
            r0 = 1
            goto L_0x0893
        L_0x07b4:
            com.whatsapp.util.Log.e((java.lang.Throwable) r5)     // Catch:{ all -> 0x0977 }
            X.1CL r1 = r3.A0T     // Catch:{ all -> 0x0977 }
            r0 = 1
            r1.A00(r0)     // Catch:{ all -> 0x0977 }
        L_0x07bd:
            throw r5     // Catch:{ all -> 0x0977 }
        L_0x07be:
            r6 = move-exception
            r9 = 0
        L_0x07c0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0977 }
            r1.<init>()     // Catch:{ all -> 0x0977 }
            java.lang.String r0 = "CoreMessageStore/addmsg duplicate "
            r1.append(r0)     // Catch:{ all -> 0x0977 }
            java.lang.String r0 = r5.A01     // Catch:{ all -> 0x0977 }
            r1.append(r0)     // Catch:{ all -> 0x0977 }
            r0 = r24
            r1.append(r0)     // Catch:{ all -> 0x0977 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0977 }
            com.whatsapp.util.Log.i(r0, r6)     // Catch:{ all -> 0x0977 }
            X.206 r0 = r4.A0K()     // Catch:{ all -> 0x0977 }
            if (r0 == 0) goto L_0x07e5
            r0 = 0
            r4.A0F = r0     // Catch:{ all -> 0x0977 }
        L_0x07e5:
            r25.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0830, SQLiteException -> 0x07ed }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0830, SQLiteException -> 0x07ed }
            goto L_0x08b0
        L_0x07ed:
            r1 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x09d8 }
            r5.<init>()     // Catch:{ all -> 0x09d8 }
            r0 = r23
            r5.append(r0)     // Catch:{ all -> 0x09d8 }
            r5.append(r8)     // Catch:{ all -> 0x09d8 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x09d8 }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x09d8 }
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x09d8 }
            if (r0 != 0) goto L_0x0818
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d7
            java.lang.String r5 = r1.getMessage()     // Catch:{ all -> 0x09d8 }
            r0 = r20
            boolean r0 = r5.contains(r0)     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d7
        L_0x0818:
            if (r49 == 0) goto L_0x09d7
            X.1QB r5 = r3.A0M     // Catch:{ all -> 0x09d8 }
            boolean r0 = r5.A0O()     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d7
            X.1La r6 = r3.A1b     // Catch:{ all -> 0x09d8 }
            r6.A04(r14, r2)     // Catch:{ all -> 0x09d8 }
            X.2qj r40 = r3.CST(r4, r2)     // Catch:{ Exception -> 0x09c4 }
            r5.A0K()     // Catch:{ Exception -> 0x09c4 }
            goto L_0x09c0
        L_0x0830:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x09d8 }
            X.1Cn r0 = r3.A0U     // Catch:{ all -> 0x09d8 }
            r0.A03()     // Catch:{ all -> 0x09d8 }
            goto L_0x08b0
        L_0x083a:
            r0 = move-exception
            r9 = 0
        L_0x083c:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0977 }
            r25.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0889, SQLiteException -> 0x0846 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0889, SQLiteException -> 0x0846 }
            goto L_0x0892
        L_0x0846:
            r1 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x09d8 }
            r5.<init>()     // Catch:{ all -> 0x09d8 }
            r0 = r23
            r5.append(r0)     // Catch:{ all -> 0x09d8 }
            r5.append(r8)     // Catch:{ all -> 0x09d8 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x09d8 }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x09d8 }
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x09d8 }
            if (r0 != 0) goto L_0x0871
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d7
            java.lang.String r5 = r1.getMessage()     // Catch:{ all -> 0x09d8 }
            r0 = r20
            boolean r0 = r5.contains(r0)     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d7
        L_0x0871:
            if (r49 == 0) goto L_0x09d7
            X.1QB r5 = r3.A0M     // Catch:{ all -> 0x09d8 }
            boolean r0 = r5.A0O()     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d7
            X.1La r6 = r3.A1b     // Catch:{ all -> 0x09d8 }
            r6.A04(r14, r2)     // Catch:{ all -> 0x09d8 }
            X.2qj r40 = r3.CST(r4, r2)     // Catch:{ Exception -> 0x09c4 }
            r5.A0K()     // Catch:{ Exception -> 0x09c4 }
            goto L_0x09c0
        L_0x0889:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x09d8 }
            X.1Cn r1 = r3.A0U     // Catch:{ all -> 0x09d8 }
        L_0x088f:
            r1.A03()     // Catch:{ all -> 0x09d8 }
        L_0x0892:
            r0 = 0
        L_0x0893:
            r41 = 0
        L_0x0895:
            r44 = 0
            if (r0 == 0) goto L_0x08b4
            if (r49 <= 0) goto L_0x08b4
            r46.A06()     // Catch:{ all -> 0x09d8 }
            r0 = r46
            X.1Cm r0 = r0.A02     // Catch:{ all -> 0x09d8 }
            r0.close()     // Catch:{ all -> 0x09d8 }
            X.1QV r0 = r3.A1f     // Catch:{ all -> 0x09d8 }
            r0.A01()     // Catch:{ all -> 0x09d8 }
            X.2qj r40 = r3.CST(r4, r2)     // Catch:{ all -> 0x09d8 }
            goto L_0x09c0
        L_0x08b0:
            r41 = 0
            r44 = 1
        L_0x08b4:
            r18.close()
            if (r41 == 0) goto L_0x0951
            boolean r0 = r4 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x08dc
            r0 = r4
            X.21V r0 = (X.AnonymousClass21V) r0
            X.2rc r8 = r0.A02
            X.C17960vV.A07(r8)
            if (r7 == 0) goto L_0x08dc
            java.io.File r6 = r8.A0G
            if (r6 == 0) goto L_0x08dc
            X.1Ns r5 = r3.A07
            boolean r0 = X.A3I.A01(r4)
            r1 = 1
            r5.A06(r6, r1, r0)
            if (r9 <= 0) goto L_0x08dc
            java.io.File r0 = r8.A0G
            r5.A06(r0, r9, r1)
        L_0x08dc:
            X.206 r1 = r4.A0K()
            boolean r0 = r1 instanceof X.C441322g
            if (r0 == 0) goto L_0x08fd
            X.21V r1 = (X.AnonymousClass21V) r1
            X.2rc r6 = r1.A02
            if (r6 == 0) goto L_0x08fd
            java.io.File r0 = r6.A0G
            if (r0 == 0) goto L_0x08fd
            X.1Ns r5 = r3.A07
            r1 = 1
            r5.A06(r0, r1, r1)
            if (r7 == 0) goto L_0x08fd
            if (r9 <= 0) goto L_0x08fd
            java.io.File r0 = r6.A0G
            r5.A06(r0, r9, r1)
        L_0x08fd:
            X.1BI r0 = r4.A0H()
            boolean r0 = X.C22971Dz.A0Z(r0)
            if (r0 != 0) goto L_0x0951
            boolean r0 = r4.A0p
            if (r0 != 0) goto L_0x0951
            boolean r0 = r4.A0w()
            if (r0 != 0) goto L_0x0951
            int r1 = r4.A0D()
            r0 = 6
            if (r1 == r0) goto L_0x0951
            boolean r0 = X.AnonymousClass1N9.A05(r4)
            if (r0 != 0) goto L_0x0951
            X.1BI r7 = r4.A0H()
            if (r7 != 0) goto L_0x0926
            r7 = r21
        L_0x0926:
            X.1Mx r6 = r3.A1P
            X.C18070vi.A0d(r7, r2)
            X.0ve r3 = r6.A04
            r1 = 6163(0x1813, float:8.636E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x0951
            boolean r0 = X.C22971Dz.A0d(r7)
            if (r0 == 0) goto L_0x0951
            r3 = r7
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.2dk r0 = X.C25111Mx.A01(r6, r3)
            if (r0 != 0) goto L_0x0951
            X.2lX r0 = r6.A05(r3)
            if (r0 == 0) goto L_0x095b
            long r0 = r0.A00
            X.C25111Mx.A02(r6, r3, r0)
        L_0x0951:
            X.2qj r40 = new X.2qj
            r42 = r19
            r45 = r2
            r40.<init>(r41, r42, r43, r44, r45)
            return r40
        L_0x095b:
            X.0vl r0 = r6.A06
            java.lang.Object r5 = r0.getValue()
            X.C18070vi.A0X(r5)
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Integer r4 = X.AnonymousClass00R.A00
            X.11P r0 = r6.A02
            long r0 = r0.A05()
            X.2dk r3 = new X.2dk
            r3.<init>(r6, r4, r0)
            r5.put(r7, r3)
            goto L_0x0951
        L_0x0977:
            r1 = move-exception
            r25.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x09ca, SQLiteException -> 0x097f }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x09ca, SQLiteException -> 0x097f }
            goto L_0x09d7
        L_0x097f:
            r1 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x09d8 }
            r5.<init>()     // Catch:{ all -> 0x09d8 }
            r0 = r23
            r5.append(r0)     // Catch:{ all -> 0x09d8 }
            r5.append(r8)     // Catch:{ all -> 0x09d8 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x09d8 }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x09d8 }
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x09d8 }
            if (r0 != 0) goto L_0x09aa
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d7
            java.lang.String r5 = r1.getMessage()     // Catch:{ all -> 0x09d8 }
            r0 = r20
            boolean r0 = r5.contains(r0)     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d7
        L_0x09aa:
            if (r49 == 0) goto L_0x09d7
            X.1QB r5 = r3.A0M     // Catch:{ all -> 0x09d8 }
            boolean r0 = r5.A0O()     // Catch:{ all -> 0x09d8 }
            if (r0 == 0) goto L_0x09d7
            X.1La r6 = r3.A1b     // Catch:{ all -> 0x09d8 }
            r6.A04(r14, r2)     // Catch:{ all -> 0x09d8 }
            X.2qj r40 = r3.CST(r4, r2)     // Catch:{ Exception -> 0x09c4 }
            r5.A0K()     // Catch:{ Exception -> 0x09c4 }
        L_0x09c0:
            r18.close()
            return r40
        L_0x09c4:
            r1 = move-exception
            r0 = 1
            r6.A04(r14, r0)     // Catch:{ all -> 0x09d8 }
            goto L_0x09d7
        L_0x09ca:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x09d8 }
            X.1Cn r0 = r3.A0U     // Catch:{ all -> 0x09d8 }
            r0.A03()     // Catch:{ all -> 0x09d8 }
            goto L_0x09d7
        L_0x09d4:
            r0.A04(r14, r10)     // Catch:{ all -> 0x09d8 }
        L_0x09d7:
            throw r1     // Catch:{ all -> 0x09d8 }
        L_0x09d8:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x09dd }
            throw r1
        L_0x09dd:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.CST(X.206, int):X.2qj");
    }

    private void A0A(List list) {
        AW0 A002;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A052 = ((AnonymousClass1W6) this.A1E.get()).A01.A05((AnonymousClass205) it.next());
            if (!(A052 == null || (A002 = AnonymousClass25B.A00(A052)) == null)) {
                A002.A02 = 0;
                A002.A06 = AnonymousClass11P.A01(this.A0A);
                this.A0O.A01(A052, 16);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (X.C22971Dz.A0N(r5) != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0D(X.AnonymousClass1BI r5) {
        /*
            r4 = this;
            boolean r0 = X.C22971Dz.A0e(r5)
            if (r0 != 0) goto L_0x000d
            boolean r1 = X.C22971Dz.A0N(r5)
            r0 = 1
            if (r1 == 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r3 = 0
            if (r0 == 0) goto L_0x003d
            X.0ve r2 = r4.A0q
            X.C18070vi.A0d(r2, r3)
            r1 = 4873(0x1309, float:6.829E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x003d
            X.1MB r0 = r4.A0u
            boolean r0 = r0.A03(r5)
            if (r0 != 0) goto L_0x003d
            X.1M9 r0 = r4.A08
            X.1E7 r1 = r0.A0E(r5)
            if (r1 == 0) goto L_0x003d
            boolean r0 = r1.A0C()
            if (r0 == 0) goto L_0x003d
            boolean r0 = r1.A0D()
            if (r0 == 0) goto L_0x003d
            r3 = 1
        L_0x003d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.A0D(X.1BI):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
        if (r8.A1j.A0I(r9, 1) == false) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0F(X.AnonymousClass206 r9, X.AnonymousClass206 r10) {
        /*
            r8 = this;
            r9.A0e(r10)
            X.AW0 r0 = X.AnonymousClass25B.A00(r9)
            r3 = 1
            if (r0 == 0) goto L_0x001b
            X.AW0 r0 = X.AnonymousClass25B.A00(r9)
            boolean r0 = r0.A0K()
            if (r0 == 0) goto L_0x001b
            X.AW0 r0 = X.AnonymousClass25B.A00(r9)
            r0.A0E(r3)
        L_0x001b:
            r0 = 134217728(0x8000000, double:6.63123685E-316)
            boolean r2 = r9.A11(r0)
            if (r2 == 0) goto L_0x003b
            boolean r0 = r10.A11(r0)
            if (r0 != 0) goto L_0x003b
            r0 = 33554432(0x2000000, double:1.6578092E-316)
            r9.A0b(r0)
            X.00H r0 = r8.A1y
            java.lang.Object r0 = r0.get()
            X.6lu r0 = (X.C131936lu) r0
            r0.A00(r9)
        L_0x003b:
            X.00H r0 = r8.A1E
            java.lang.Object r0 = r0.get()
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            r1 = 5
            r0.A05(r9, r1)
            X.1Q2 r0 = r8.A0O
            r0.A01(r9, r1)
            X.205 r4 = r9.A0v
            X.1BI r2 = r4.A00
            android.os.Handler r1 = r0.A02
            r7 = 13
            X.3Bx r0 = new X.3Bx
            r0.<init>(r8, r2, r7)
            r1.post(r0)
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x009b
            X.1CJ r0 = r8.A0D
            X.1ci r0 = r0.A0A(r2)
            if (r0 == 0) goto L_0x0070
            long r4 = r0.A0S
            long r0 = r9.A0y
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0076
        L_0x0070:
            int r0 = r9.A0D()
            if (r0 != r7) goto L_0x009b
        L_0x0076:
            X.1N5 r0 = r8.A1i
            boolean r0 = r0.A03(r2)
            if (r0 == 0) goto L_0x009b
            X.205 r0 = r9.A0N
            if (r0 == 0) goto L_0x0093
            X.1N9 r1 = r8.A1j
            X.00H r0 = r8.A1G
            java.lang.Object r0 = r0.get()
            X.207 r0 = (X.AnonymousClass207) r0
            X.206 r0 = X.AnonymousClass9AU.A00(r0, r9)
            r1.A0I(r0, r3)
        L_0x0093:
            X.1N9 r0 = r8.A1j
            boolean r0 = r0.A0I(r9, r3)
            if (r0 != 0) goto L_0x00b5
        L_0x009b:
            X.205 r0 = r9.A0N
            if (r0 == 0) goto L_0x00b0
            X.1N9 r1 = r8.A1j
            X.00H r0 = r8.A1G
            java.lang.Object r0 = r0.get()
            X.207 r0 = (X.AnonymousClass207) r0
            X.206 r0 = X.AnonymousClass9AU.A00(r0, r9)
            r1.A08(r0)
        L_0x00b0:
            X.1N9 r0 = r8.A1j
            r0.A08(r9)
        L_0x00b5:
            X.11S r0 = r8.A06
            X.1CJ r1 = r8.A0D
            boolean r0 = X.AnonymousClass25A.A0M(r0, r9)
            if (r0 == 0) goto L_0x00e9
            X.1ci r2 = r1.A0A(r2)
            if (r2 == 0) goto L_0x00e9
            monitor-enter(r2)
            int r0 = r2.A08     // Catch:{ all -> 0x00e5 }
            int r0 = r0 + 1
            r2.A08 = r0     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r1.<init>()     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = "chatInfo/incrementUnseenImportantMessageCount "
            r1.append(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = r2.A0B()     // Catch:{ all -> 0x00e5 }
            r1.append(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e5 }
            goto L_0x00e8
        L_0x00e5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00e8:
            monitor-exit(r2)
        L_0x00e9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.A0F(X.206, X.206):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v2, types: [int] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0G(java.io.File r7) {
        /*
            java.io.File[] r6 = r7.listFiles()
            r5 = 0
            if (r6 == 0) goto L_0x0030
            int r4 = r6.length
            r3 = 0
        L_0x0009:
            if (r5 >= r4) goto L_0x002f
            r2 = r6[r5]
            java.lang.String r1 = r2.getName()
            java.lang.String r0 = ".nomedia"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001d
            r3 = 1
        L_0x001a:
            int r5 = r5 + 1
            goto L_0x0009
        L_0x001d:
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L_0x0028
            boolean r3 = A0G(r2)
            goto L_0x001a
        L_0x0028:
            r2.getPath()
            X.C64062u9.A0Q(r2)
            goto L_0x001a
        L_0x002f:
            r5 = r3
        L_0x0030:
            r7.getPath()
            if (r5 != 0) goto L_0x0038
            X.C64062u9.A0Q(r7)
        L_0x0038:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.A0G(java.io.File):boolean");
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [X.2Rs, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v2, types: [X.2MJ, X.20i, X.206] */
    /* JADX WARNING: type inference failed for: r1v14, types: [X.2Rs, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v16, types: [X.2Rs, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dd, code lost:
        if (r4 >= 0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r15.A19 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C49742Rs A0J(X.AnonymousClass206 r36, int r37) {
        /*
            r35 = this;
            long r12 = android.os.SystemClock.uptimeMillis()
            r6 = 1
            r2 = r35
            r15 = r36
            X.2qj r1 = r2.CST(r15, r6)
            X.205 r0 = r15.A0v
            boolean r5 = r0.A02
            if (r5 == 0) goto L_0x0018
            boolean r3 = r15.A19
            r11 = 0
            if (r3 == 0) goto L_0x0019
        L_0x0018:
            r11 = 1
        L_0x0019:
            boolean r9 = r1.A04
            r10 = r37
            if (r9 == 0) goto L_0x00b3
            X.1LY r8 = r2.A0H
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r12
            java.lang.String r7 = "CoreMessageStore/writeMessageToDatabase"
            r8.A01(r7, r3)
            if (r11 != 0) goto L_0x00b1
            long r28 = android.os.SystemClock.uptimeMillis()
            long r3 = r15.A1F
            long r28 = r28 - r3
            long r26 = android.os.SystemClock.uptimeMillis()
            X.1PT r14 = r2.A0w
            int r11 = r15.A0A
            long r7 = r15.A12
            long r24 = r26 - r7
            long r26 = r26 - r3
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)
            r18 = 2
            r19 = 0
            r17 = 0
            r3 = 0
            r21 = r3
            r22 = r3
            r30 = r3
            r31 = r3
            r32 = r3
            r33 = r3
            r34 = r3
            r20 = r3
            r23 = r11
            r14.A0G(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r31, r32, r33, r34)
        L_0x0063:
            r7 = 4
            if (r5 == 0) goto L_0x0075
            int r4 = r15.A0D()
            boolean r4 = X.C446824j.A03(r4, r7)
            if (r4 == 0) goto L_0x0075
            java.util.Map r4 = r2.A1M
            r4.put(r0, r15)
        L_0x0075:
            long r4 = r15.A10
            r2.A01(r4)
            boolean r4 = r1.A00
            X.1Q2 r0 = r2.A0O
            if (r4 == 0) goto L_0x0093
            android.os.Handler r0 = r0.A00
            android.os.Message r0 = android.os.Message.obtain(r0, r7, r10, r3, r15)
            r0.sendToTarget()
            X.2Rs r1 = new X.2Rs
            r1.<init>()
            r1.A00 = r6
        L_0x0090:
            r1.A01 = r9
            return r1
        L_0x0093:
            android.os.Handler r2 = r0.A00
            r0 = 5
            android.os.Message r0 = android.os.Message.obtain(r2, r0, r10, r3, r15)
            r0.sendToTarget()
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x00a9
            r0 = 6
            android.os.Message r0 = android.os.Message.obtain(r2, r0, r10, r3, r15)
            r0.sendToTarget()
        L_0x00a9:
            X.2Rs r1 = new X.2Rs
            r1.<init>()
            r1.A00 = r3
            goto L_0x0090
        L_0x00b1:
            r3 = 0
            goto L_0x0063
        L_0x00b3:
            boolean r3 = r1.A02
            if (r3 == 0) goto L_0x01e3
            if (r11 == 0) goto L_0x01d3
            X.00H r1 = r2.A1E
            java.lang.Object r1 = r1.get()
            X.1W6 r1 = (X.AnonymousClass1W6) r1
            X.1W2 r1 = r1.A01
            X.206 r1 = r1.A05(r0)
            if (r1 == 0) goto L_0x01d3
            X.11P r3 = r2.A0A
            long r13 = X.AnonymousClass11P.A01(r3)
            int r3 = r15.A05
            if (r3 <= 0) goto L_0x00df
            long r7 = r1.A0I
            long r3 = (long) r3
            r11 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r11
            long r7 = r7 + r3
            int r4 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            r3 = 1
            if (r4 < 0) goto L_0x00e0
        L_0x00df:
            r3 = 0
        L_0x00e0:
            r5 = 11
            r8 = 0
            if (r3 == 0) goto L_0x0106
            boolean r7 = r2.A0E(r15, r1)
        L_0x00e9:
            if (r7 == 0) goto L_0x01d3
            X.1Q2 r0 = r2.A0O
            android.os.Handler r2 = r0.A02
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r8, r1)
            android.os.Message r0 = android.os.Message.obtain(r2, r5, r0)
        L_0x00f8:
            r0.sendToTarget()
        L_0x00fb:
            r0 = 0
            X.2Rs r1 = new X.2Rs
            r1.<init>()
            r1.A00 = r0
            r1.A01 = r0
            return r1
        L_0x0106:
            int r4 = r1.A0u
            r3 = 31
            if (r4 != r3) goto L_0x0112
            boolean r7 = r2.A0F(r15, r1)
        L_0x0110:
            r8 = r15
            goto L_0x00e9
        L_0x0112:
            r7 = 0
            if (r4 != r5) goto L_0x01ba
            X.205 r3 = r1.A0v
            X.1BI r3 = r3.A00
            boolean r3 = X.C22971Dz.A0a(r3)
            if (r3 == 0) goto L_0x0150
            long r3 = r1.A0I
            r15.A0I = r3
            r2.BIJ(r1, r6, r7)
            long r8 = android.os.SystemClock.uptimeMillis()
            X.2qj r0 = r2.CST(r15, r6)
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x014b
            X.1LY r6 = r2.A0H
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r8
            java.lang.String r0 = "CoreMessageStore/writeMessageToDatabase"
            r6.A01(r0, r3)
            X.1Q2 r0 = r2.A0O
            android.os.Handler r3 = r0.A00
            X.3Cu r0 = new X.3Cu
            r0.<init>(r2, r10, r7, r15)
            r3.post(r0)
            r7 = 1
        L_0x014b:
            r8 = r15
        L_0x014c:
            X.C50352Uc.A00(r15)
            goto L_0x00e9
        L_0x0150:
            r3 = 32
            boolean r3 = r1.A11(r3)
            if (r3 == 0) goto L_0x0181
            r3 = 8
            boolean r3 = r15.A11(r3)
            if (r3 != 0) goto L_0x01b5
            boolean r3 = r15 instanceof X.C439421n
            if (r3 != 0) goto L_0x01b5
            java.lang.String r3 = "CoreMessageStore/addmessage/crypto-retry-reject/mismatch declared hsm"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.00H r3 = r2.A1G
            java.lang.Object r8 = r3.get()
            X.207 r8 = (X.AnonymousClass207) r8
            long r3 = r15.A0I
            r7 = 19
            X.206 r0 = r8.A00(r0, r7, r3)
            r0.A14(r6)
            boolean r7 = r2.A0F(r0, r1)
            goto L_0x014b
        L_0x0181:
            r4 = 36
            int r3 = r15.A0u
            if (r4 != r3) goto L_0x01b5
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0d(r0)
            if (r0 == 0) goto L_0x01b0
            r6 = r15
            X.22v r6 = (X.C442822v) r6
            X.1RR r0 = r2.A0K
            X.C18070vi.A0d(r6, r7)
            X.0vl r0 = r0.A0K
            r0.getValue()
            X.205 r7 = r6.A0v
            long r3 = r6.A0I
            int r6 = r6.A00
            r0 = 60
            X.2MJ r8 = new X.2MJ
            r8.<init>(r7, r0, r3)
            r8.A00 = r6
            boolean r7 = r2.A0F(r8, r1)
            goto L_0x014c
        L_0x01b0:
            boolean r7 = r2.A0E(r15, r1)
            goto L_0x014c
        L_0x01b5:
            boolean r7 = r2.A0F(r15, r1)
            goto L_0x014b
        L_0x01ba:
            r0 = 98
            if (r4 != r0) goto L_0x01d3
            boolean r7 = r2.A0F(r15, r1)
            java.lang.Integer r0 = r15.A0S
            if (r0 == 0) goto L_0x01ce
            int r3 = r0.intValue()
            r0 = 100
            if (r3 == r0) goto L_0x0110
        L_0x01ce:
            r2.A0Q(r15)
            goto L_0x0110
        L_0x01d3:
            long r0 = r15.A10
            r2.A01(r0)
            X.1Q2 r0 = r2.A0O
            android.os.Handler r1 = r0.A00
            r0 = 3
            android.os.Message r0 = android.os.Message.obtain(r1, r0, r15)
            goto L_0x00f8
        L_0x01e3:
            if (r11 == 0) goto L_0x00fb
            boolean r3 = r1.A03
            if (r3 != 0) goto L_0x022c
            X.2qj r3 = X.C62062qj.A05
            if (r1 != r3) goto L_0x01f4
            X.1N9 r0 = r2.A1j
            r0.A08(r15)
            goto L_0x00fb
        L_0x01f4:
            boolean r1 = r15 instanceof X.C445123s
            if (r1 != 0) goto L_0x0216
            X.1PT r4 = r2.A0w
            r3 = 9
            r1 = 0
            r4.A0F(r15, r1, r3)
            X.1N9 r3 = r2.A1j
            r1 = 552(0x228, float:7.74E-43)
            r3.A0B(r15, r1)
            X.1BI r6 = r15.A0H()
            long r3 = r15.A0I
            r5 = r2
            r7 = r0
            r8 = r1
            r9 = r3
            r5.BBO(r6, r7, r8, r9)
            goto L_0x00fb
        L_0x0216:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "CoreMessageStore/Error inserting drop placeholder for "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00fb
        L_0x022c:
            X.1PT r3 = r2.A0w
            r1 = 11
            r0 = 0
            r3.A0F(r15, r0, r1)
            X.1N9 r1 = r2.A1j
            r0 = 419(0x1a3, float:5.87E-43)
            r1.A0B(r15, r0)
            goto L_0x00fb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.A0J(X.206, int):X.2Rs");
    }

    public void A0R(AnonymousClass206 r5) {
        AnonymousClass206 A0K2 = r5.A0K();
        boolean z = true;
        boolean z2 = false;
        if (A0K2 != null) {
            z2 = true;
        }
        C17960vV.A0D(z2);
        int A0E2 = A0K2.A0E();
        if (A0E2 != 2) {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("coremessagestore/updatemessagequote/quoted message type: ");
        sb.append(A0E2);
        C17960vV.A0H(z, sb.toString());
        ((C31931gM) this.A16.get()).A01(new AnonymousClass3Bx(this, r5, 18), 21);
    }

    public void A0S(AnonymousClass205 r13, int i) {
        long uptimeMillis = SystemClock.uptimeMillis();
        AnonymousClass1N3 r2 = this.A0P;
        C28791au A052 = r2.A03.A05();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", Integer.valueOf(i));
            if (((C28801av) A052).A02.A02(contentValues, "message", "chat_row_id = ? AND from_me = ? AND key_id = ?", "UPDATE_MESSAGE_STATUS_MAIN_SQL", AnonymousClass1N3.A02(r2, r13)) != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("MainMessageStore/updateMessageStatus/update/failed ");
                sb.append(r13.A01);
                sb.append(" ");
                sb.append(r13.A00);
                Log.e(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MainMessageStore/updateMessageStatus/update/success ");
                sb2.append(r13);
                sb2.append(" ");
                sb2.append(i);
                Log.i(sb2.toString());
            }
            A052.close();
            this.A0H.A01("CoreMessageStore/updateMessageStatusTimestamp", SystemClock.uptimeMillis() - uptimeMillis);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [X.22v, X.206] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.2Rs, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v15, types: [X.22t, X.206] */
    /* JADX WARNING: type inference failed for: r3v32, types: [X.2M9, X.20i, X.206] */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0243, code lost:
        if ((!r1) != false) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x034f, code lost:
        if (r0 > (r17 + r16[r14])) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0454, code lost:
        if (r4 != false) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0491, code lost:
        if (r22 != false) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0568, code lost:
        if (r20 != false) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05b4, code lost:
        if (r0 != false) goto L_0x05b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05dc, code lost:
        if (X.C26131Qy.A00(r8, r11, r4.A0D(r11), r7.A0T, r7.A05, r0) != false) goto L_0x05de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0649, code lost:
        if (r0 != false) goto L_0x064b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x070e, code lost:
        if (r0 != false) goto L_0x0710;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x07c4, code lost:
        if (r0 != false) goto L_0x07c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0133, code lost:
        if (r0.longValue() <= r7.A0I) goto L_0x05b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013f, code lost:
        if (X.C43391zj.A07(r4, r7) == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0178, code lost:
        if (r2 != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c5, code lost:
        if (r0 != false) goto L_0x01c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x07af  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x07c2  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x083b  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x086d  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x08c4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C49742Rs BBZ(X.AnonymousClass206 r39, int r40) {
        /*
            r38 = this;
            boolean r0 = X.C39761tb.A07()
            r7 = r39
            if (r0 == 0) goto L_0x0048
            boolean r0 = r7 instanceof X.AnonymousClass219
            java.lang.String r4 = ""
            java.lang.String r3 = "­"
            if (r0 == 0) goto L_0x088a
            r2 = r7
            X.219 r2 = (X.AnonymousClass219) r2
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x0024
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r1.replace(r3, r4)
            r2.A03 = r0
        L_0x0024:
            boolean r0 = r7.A0r()
            if (r0 == 0) goto L_0x0048
            int r0 = r7.A0B()
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = r7.A0P()
            X.C17960vV.A07(r0)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = r7.A0P()
            java.lang.String r0 = r0.replace(r3, r4)
            r7.A0i(r0)
        L_0x0048:
            X.205 r0 = r7.A0v
            r28 = r0
            X.1BI r6 = r0.A00
            boolean r0 = X.C22971Dz.A0d(r6)
            r5 = r38
            if (r0 == 0) goto L_0x0884
            X.1CJ r1 = r5.A0D
            r0 = r6
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.1cl r27 = r1.A0D(r0)
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass1CJ.A01(r1)
            java.lang.Object r0 = r0.get(r6)
            X.1ci r0 = (X.C29691ci) r0
            if (r0 != 0) goto L_0x087e
            r19 = 0
        L_0x006d:
            boolean r0 = X.C22971Dz.A0a(r6)
            r9 = 1
            r3 = 0
            r29 = r40
            if (r0 != 0) goto L_0x0877
            X.C17960vV.A07(r6)
            boolean r2 = A0B(r5, r7)
            boolean r0 = r7.A0q()
            if (r0 == 0) goto L_0x0874
            X.C17960vV.A07(r6)
            X.1CJ r0 = r5.A0D
            X.1ci r12 = r0.A0A(r6)
            if (r12 == 0) goto L_0x0874
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r9)
            java.lang.Boolean r0 = r12.A0x
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0874
            X.1N2 r1 = r5.A0h
            r0 = 146(0x92, float:2.05E-43)
            boolean r1 = X.AnonymousClass1N2.A00(r1, r6, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r12.A0x = r0
            if (r1 != 0) goto L_0x0874
            X.1PQ r4 = r5.A11
            X.11P r0 = r5.A0A
            long r0 = X.AnonymousClass11P.A01(r0)
            X.1PP r4 = r4.A02
            X.205 r10 = r4.A01(r6, r9)
            r8 = 146(0x92, float:2.05E-43)
            X.97l r4 = new X.97l
            r4.<init>(r10, r8, r0)
            r0 = -1
            X.2Rs r0 = r5.A0J(r4, r0)
            boolean r0 = r0.A00
            r12.A0x = r11
        L_0x00c9:
            r2 = r2 | r0
            X.1MB r0 = r5.A0u
            boolean r0 = r0.A03(r6)
            if (r0 == 0) goto L_0x00eb
            X.2mc r0 = r7.A0P
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x00eb
            X.0ve r4 = r5.A0q
            r1 = 10126(0x278e, float:1.419E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r5.BBj(r6)
            r2 = r2 | r0
        L_0x00eb:
            X.1Qy r8 = r5.A1g
            int r11 = r8.A01(r7)
            X.1Qz r4 = r5.A0J
            if (r11 == 0) goto L_0x086d
            X.C18070vi.A0d(r6, r9)
            X.1CJ r0 = r4.A02
            X.1ci r0 = X.AnonymousClass1CJ.A00(r0, r6)
            if (r0 == 0) goto L_0x0845
            int r0 = r0.A02
            if (r0 != r9) goto L_0x0845
        L_0x0104:
            boolean r10 = r7 instanceof X.C442822v
            if (r10 == 0) goto L_0x010f
            int r0 = r7.A05
            if (r0 != 0) goto L_0x010f
            r4.A07(r6, r3)
        L_0x010f:
            X.1CJ r4 = r5.A0D
            X.C18070vi.A0d(r4, r9)
            X.1PM r13 = r8.A01
            X.1PS r12 = r8.A02
            r0 = r28
            boolean r3 = r0.A02
            if (r3 != 0) goto L_0x0135
            boolean r0 = X.C22971Dz.A0Y(r6)
            if (r0 == 0) goto L_0x0135
            java.lang.Long r0 = r7.A0T
            if (r0 == 0) goto L_0x0135
            X.C17960vV.A07(r0)
            long r14 = r0.longValue()
            long r0 = r7.A0I
            int r11 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x05b9
        L_0x0135:
            boolean r0 = X.C43391zj.A06(r13, r4, r12, r7)
            if (r0 != 0) goto L_0x05b9
            boolean r0 = X.C43391zj.A07(r4, r7)
            if (r0 != 0) goto L_0x05b9
        L_0x0141:
            r20 = 0
        L_0x0143:
            r22 = 0
        L_0x0145:
            X.11S r1 = r5.A06
            boolean r0 = X.AnonymousClass25A.A0T(r1, r7)
            if (r0 == 0) goto L_0x0168
            com.whatsapp.jid.DeviceJid r0 = r7.A13
            boolean r0 = r1.A0S(r0)
            if (r0 != 0) goto L_0x0163
            X.1RK r0 = r5.A0n
            java.util.ArrayList r0 = r0.A06()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0168
        L_0x0163:
            r0 = 13
            r7.A0a(r0)
        L_0x0168:
            r0 = r29
            A07(r5, r7, r0)
        L_0x016d:
            r0 = r29
            X.2Rs r1 = r5.A0J(r7, r0)
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x017a
            r4 = 0
            if (r2 == 0) goto L_0x017b
        L_0x017a:
            r4 = 1
        L_0x017b:
            boolean r0 = r1.A01
            r37 = r0
            X.0ve r0 = r5.A0q
            r36 = r0
            r1 = 2714(0xa9a, float:3.803E-42)
            X.0vf r15 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r15, r0, r1)
            if (r0 == 0) goto L_0x0568
            if (r20 == 0) goto L_0x019b
            X.1CJ r1 = r5.A0D
            X.1M9 r0 = r5.A08
            boolean r0 = X.C43391zj.A05(r0, r1, r7)
            if (r0 == 0) goto L_0x056a
            r20 = 0
        L_0x019b:
            r0 = r28
            boolean r0 = r0.A02
            r21 = r0
            if (r0 != 0) goto L_0x01c8
            boolean r0 = r7 instanceof X.C442622t
            if (r0 == 0) goto L_0x01c8
            r1 = 2714(0xa9a, float:3.803E-42)
            r0 = r36
            boolean r0 = X.C18020vd.A05(r15, r0, r1)
            if (r0 == 0) goto L_0x0557
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/process ESR"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r14 = r4
            r11 = r7
            X.22t r11 = (X.C442622t) r11
            if (r6 != 0) goto L_0x0495
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/no chat"
        L_0x01be:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01c1:
            if (r14 != 0) goto L_0x01c7
            r0 = r4
            r4 = 0
            if (r0 == 0) goto L_0x01c8
        L_0x01c7:
            r4 = 1
        L_0x01c8:
            X.1Qy r1 = r5.A1g
            X.1CJ r12 = r5.A0D
            X.1M9 r2 = r5.A08
            X.C18070vi.A0d(r12, r9)
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            if (r21 != 0) goto L_0x0490
            boolean r0 = X.C22971Dz.A0Y(r6)
            if (r0 == 0) goto L_0x0490
            X.1PM r1 = r1.A01
            r0 = r6
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x0490
            boolean r0 = r7 instanceof X.C442822v
            if (r0 != 0) goto L_0x0490
            boolean r0 = r7 instanceof X.C442622t
            if (r0 != 0) goto L_0x0490
            X.1ci r0 = r12.A0A(r6)
            if (r0 == 0) goto L_0x0490
            boolean r0 = X.C43391zj.A05(r2, r12, r7)
            if (r0 == 0) goto L_0x0490
        L_0x01fc:
            r0 = 1
        L_0x01fd:
            if (r20 != 0) goto L_0x0215
            if (r0 == 0) goto L_0x0215
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/process ESR if needed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r20 = r4
            if (r6 != 0) goto L_0x02b6
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/no chat info"
        L_0x020c:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x020f:
            if (r20 != 0) goto L_0x0214
            if (r4 != 0) goto L_0x0214
            r9 = 0
        L_0x0214:
            r4 = r9
        L_0x0215:
            r1 = 1302(0x516, float:1.824E-42)
            r0 = r36
            boolean r0 = X.C18020vd.A05(r15, r0, r1)
            if (r0 == 0) goto L_0x0282
            java.lang.String r1 = "directory"
            java.lang.String r0 = r7.A0d
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0282
            if (r6 == 0) goto L_0x0282
            X.1NK r0 = r5.A0a
            boolean r0 = r0.A09(r6)
            if (r0 == 0) goto L_0x0245
            java.util.Map r2 = X.AnonymousClass2VZ.A00
            java.lang.Object r0 = r2.get(r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x02a6
            boolean r1 = r0.booleanValue()
        L_0x0241:
            r0 = r1 ^ 1
            if (r0 == 0) goto L_0x0282
        L_0x0245:
            X.11S r1 = r5.A06
            r1.A0I()
            com.whatsapp.jid.PhoneUserJid r0 = r1.A0E
            if (r0 == 0) goto L_0x0282
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r9 = X.C22941Dw.A01(r6)
            if (r9 == 0) goto L_0x0282
            X.1PQ r3 = r5.A11
            if (r21 == 0) goto L_0x028e
            r1.A0I()
            com.whatsapp.jid.PhoneUserJid r10 = r1.A0E
            X.11P r0 = r5.A0A
            long r0 = X.AnonymousClass11P.A01(r0)
            X.1PP r2 = r3.A02
            r8 = 1
            X.205 r3 = r2.A01(r9, r8)
            r2 = 76
            X.97b r7 = new X.97b
            r7.<init>(r3, r2, r0)
            r7.A0d(r10)
        L_0x0276:
            r5.BBY(r7)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            java.util.Map r0 = X.AnonymousClass2VZ.A00
            r0.put(r6, r1)
        L_0x0282:
            X.2Rs r1 = new X.2Rs
            r1.<init>()
            r1.A00 = r4
            r0 = r37
            r1.A01 = r0
            return r1
        L_0x028e:
            X.11P r0 = r5.A0A
            long r1 = X.AnonymousClass11P.A01(r0)
            X.1PP r0 = r3.A02
            r8 = 1
            X.205 r3 = r0.A01(r9, r8)
            r0 = 76
            X.97b r7 = new X.97b
            r7.<init>(r3, r0, r1)
            r7.A0d(r9)
            goto L_0x0276
        L_0x02a6:
            X.1N2 r1 = r5.A0h
            r0 = 76
            boolean r1 = X.AnonymousClass1N2.A00(r1, r6, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.put(r6, r0)
            goto L_0x0241
        L_0x02b6:
            r1 = 2714(0xa9a, float:3.803E-42)
            r0 = r36
            boolean r0 = X.C18020vd.A05(r15, r0, r1)
            if (r0 != 0) goto L_0x02d3
            X.00H r0 = r5.A1C
            java.lang.Object r1 = r0.get()
            X.Cbs r1 = (X.C25253Cbs) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1.A03(r6, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/esr abprop off"
            goto L_0x020c
        L_0x02d3:
            X.1Qz r8 = r5.A0J
            int[] r1 = X.C26141Qz.A0E
            int r0 = r7.A0u
            boolean r0 = X.C200410p.A0V(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02f5
            X.00H r0 = r5.A1C
            java.lang.Object r1 = r0.get()
            X.Cbs r1 = (X.C25253Cbs) r1
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03(r6, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/invalid message type"
            goto L_0x020c
        L_0x02f5:
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r10 = X.C22941Dw.A01(r6)
            if (r10 != 0) goto L_0x0311
            X.00H r0 = r5.A1C
            java.lang.Object r1 = r0.get()
            X.Cbs r1 = (X.C25253Cbs) r1
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03(r6, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/no user info"
            goto L_0x020c
        L_0x0311:
            X.1cl r11 = r12.A0D(r10)
            if (r11 != 0) goto L_0x032b
            X.00H r0 = r5.A1C
            java.lang.Object r1 = r0.get()
            X.Cbs r1 = (X.C25253Cbs) r1
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03(r6, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/no ephemeral info"
            goto L_0x020c
        L_0x032b:
            java.lang.String r0 = r6.getRawString()
            int r14 = r8.A03(r0)
            long r17 = r8.A04(r0)
            r1 = 7069(0x1b9d, float:9.906E-42)
            r0 = r36
            int r0 = X.C18020vd.A00(r15, r0, r1)
            long r2 = (long) r0
            long r0 = java.lang.System.currentTimeMillis()
            long[] r16 = X.C25831Pu.A08
            r13 = 3
            if (r14 >= r13) goto L_0x0375
            r2 = r16[r14]
            long r17 = r17 + r2
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 <= 0) goto L_0x047c
        L_0x0351:
            java.lang.Long r0 = r7.A0T
            if (r0 == 0) goto L_0x0388
            long r13 = r0.longValue()
            long r0 = r11.ephemeralSettingTimestamp
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0388
            if (r22 != 0) goto L_0x0388
            X.00H r0 = r5.A1C
            java.lang.Object r1 = r0.get()
            X.Cbs r1 = (X.C25253Cbs) r1
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03(r6, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/older EST"
            goto L_0x020c
        L_0x0375:
            r13 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 * r13
            long r17 = r17 + r2
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 <= 0) goto L_0x047c
            java.lang.String r3 = r6.getRawString()
            r2 = 0
            r8.A0A(r3, r0, r2)
            goto L_0x0351
        L_0x0388:
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass1CJ.A01(r12)
            java.lang.Object r0 = r0.get(r10)
            X.1ci r0 = (X.C29691ci) r0
            if (r0 != 0) goto L_0x0478
            r3 = 0
        L_0x0395:
            X.00H r0 = r5.A1F
            java.lang.Object r2 = r0.get()
            X.2aR r2 = (X.C52142aR) r2
            com.whatsapp.jid.DeviceJid r0 = r7.A13
            r20 = r0
            int r0 = r11.expiration
            r18 = r0
            long r0 = r11.ephemeralSettingTimestamp
            r22 = r0
            X.11P r0 = r5.A0A
            long r16 = X.AnonymousClass11P.A01(r0)
            int r14 = r11.disappearingMessagesInitiator
            if (r3 == 0) goto L_0x0472
            int r13 = r3.A00
            java.lang.Boolean r12 = r3.A01
        L_0x03b7:
            X.1PP r0 = r2.A00
            X.205 r11 = r0.A01(r10, r9)
            r3 = 77
            X.22t r2 = new X.22t
            r0 = r16
            r2.<init>(r11, r3, r0)
            r2.A0d(r10)
            r0 = r20
            r2.A02 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r22)
            r2.A0h(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r2.A17(r0)
            r2.A00 = r14
            r2.A04 = r13
            if (r12 == 0) goto L_0x03e3
            r2.A0Q = r12
        L_0x03e3:
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/added ephemeral sync response message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Boolean r0 = X.C17970vW.A03
            int r11 = r2.A00
            long r0 = r2.A01
            int r3 = r2.A00
            X.1cl r10 = new X.1cl
            r10.<init>(r11, r0, r3)
            int r1 = r2.A04
            java.lang.Boolean r0 = r2.A0Q
            X.2lr r12 = new X.2lr
            r12.<init>(r0, r1)
            java.lang.Long r0 = r7.A0T
            if (r0 == 0) goto L_0x046f
            long r0 = r0.longValue()
        L_0x0406:
            int r13 = r7.A05
            int r11 = r7.A00
            X.1cl r3 = new X.1cl
            r3.<init>(r13, r0, r11)
            int r11 = r7.A04
            java.lang.Boolean r0 = r7.A0Q
            X.2lr r1 = new X.2lr
            r1.<init>(r0, r11)
            X.00H r0 = r5.A1C
            java.lang.Object r0 = r0.get()
            X.Cbs r0 = (X.C25253Cbs) r0
            r30 = 0
            r22 = r0
            r23 = r6
            r24 = r19
            r25 = r1
            r26 = r12
            r28 = r3
            r29 = r10
            r31 = r9
            r22.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/send ESR "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = -1
            X.2Rs r0 = r5.A0J(r2, r0)
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0456
            r20 = 0
            if (r4 == 0) goto L_0x0458
        L_0x0456:
            r20 = 1
        L_0x0458:
            java.lang.String r0 = r6.getRawString()
            int r2 = r8.A03(r0)
            java.lang.String r3 = r6.getRawString()
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = r2 + 1
            r8.A0A(r3, r0, r2)
            goto L_0x020f
        L_0x046f:
            r0 = 0
            goto L_0x0406
        L_0x0472:
            int r13 = r7.A04
            java.lang.Boolean r12 = r7.A0Q
            goto L_0x03b7
        L_0x0478:
            X.2lr r3 = r0.A0d
            goto L_0x0395
        L_0x047c:
            X.00H r0 = r5.A1C
            java.lang.Object r1 = r0.get()
            X.Cbs r1 = (X.C25253Cbs) r1
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03(r6, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/backoff retry implemented"
            goto L_0x020c
        L_0x0490:
            r0 = 0
            if (r22 == 0) goto L_0x01fd
            goto L_0x01fc
        L_0x0495:
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A01(r6)
            if (r1 != 0) goto L_0x04b4
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/not a user"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.00H r0 = r5.A1C
            java.lang.Object r1 = r0.get()
            X.Cbs r1 = (X.C25253Cbs) r1
            r0 = 7
        L_0x04ab:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02(r6, r0)
            goto L_0x01c1
        L_0x04b4:
            X.1CJ r0 = r5.A0D
            X.1cl r10 = r0.A0D(r1)
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass1CJ.A01(r0)
            java.lang.Object r0 = r0.get(r1)
            X.1ci r0 = (X.C29691ci) r0
            if (r0 != 0) goto L_0x04dd
            r8 = 0
        L_0x04c7:
            if (r10 != 0) goto L_0x04e0
            X.00H r0 = r5.A1C
            java.lang.Object r1 = r0.get()
            X.Cbs r1 = (X.C25253Cbs) r1
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02(r6, r0)
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/no ephemeral info"
            goto L_0x01be
        L_0x04dd:
            X.2lr r8 = r0.A0d
            goto L_0x04c7
        L_0x04e0:
            long r2 = r10.ephemeralSettingTimestamp
            long r0 = r11.A01
            r13 = 1
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r2 = 0
            if (r12 > 0) goto L_0x04eb
            r2 = 1
        L_0x04eb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/newer EST "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 == 0) goto L_0x054c
            int r1 = r10.expiration
            int r0 = r11.A00
            if (r0 == r1) goto L_0x0523
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/add ephemeral setting change system msg"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = r11.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C17960vV.A07(r0)
            long r0 = r0.longValue()
            boolean r0 = A0C(r5, r7, r0)
            if (r0 != 0) goto L_0x0522
            if (r4 != 0) goto L_0x0522
            r13 = 0
        L_0x0522:
            r14 = r13
        L_0x0523:
            X.1RR r0 = r5.A0K
            X.1ci r0 = r0.A03(r11)
            if (r0 == 0) goto L_0x01c1
            X.1cl r2 = r0.A0e
            X.2lr r1 = r0.A0d
            X.00H r0 = r5.A1C
            java.lang.Object r0 = r0.get()
            X.Cbs r0 = (X.C25253Cbs) r0
            r34 = 0
            r28 = r0
            r29 = r6
            r30 = r8
            r31 = r1
            r32 = r10
            r33 = r2
            r35 = r9
            r28.A01(r29, r30, r31, r32, r33, r34, r35)
            goto L_0x01c1
        L_0x054c:
            X.00H r0 = r5.A1C
            java.lang.Object r1 = r0.get()
            X.Cbs r1 = (X.C25253Cbs) r1
            r0 = 4
            goto L_0x04ab
        L_0x0557:
            X.00H r0 = r5.A1C
            java.lang.Object r1 = r0.get()
            X.Cbs r1 = (X.C25253Cbs) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1.A02(r6, r0)
            goto L_0x01c8
        L_0x0568:
            if (r20 == 0) goto L_0x019b
        L_0x056a:
            X.00H r0 = r5.A1F
            java.lang.Object r3 = r0.get()
            X.2aR r3 = (X.C52142aR) r3
            X.1PS r0 = r5.A0p
            int r12 = r0.A00()
            X.11P r0 = r5.A0A
            long r0 = X.AnonymousClass11P.A01(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r9)
            r10 = 2
            r2 = 0
            X.C18070vi.A0d(r6, r2)
            X.1PP r2 = r3.A00
            X.205 r8 = r2.A01(r6, r9)
            r3 = 36
            X.22v r2 = new X.22v
            r2.<init>(r8, r3, r0)
            r2.A0d(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r2.A17(r0)
            if (r12 <= 0) goto L_0x05a4
            r2.A04 = r10
            r2.A0Q = r11
        L_0x05a4:
            java.lang.String r0 = "CoreMessageStore/addOrUpdateMessage/added backwards compat dmm ephemeral setting message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = -1
            X.2Rs r0 = r5.A0J(r2, r0)
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x05b6
            r0 = r4
            r4 = 0
            if (r0 == 0) goto L_0x019b
        L_0x05b6:
            r4 = 1
            goto L_0x019b
        L_0x05b9:
            if (r6 == 0) goto L_0x08d0
            r11 = r6
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            boolean r0 = X.C43391zj.A06(r13, r4, r12, r7)
            if (r0 != 0) goto L_0x05de
            long r0 = r7.A0I
            int r13 = r7.A05
            java.lang.Long r12 = r7.A0T
            X.1cl r22 = r4.A0D(r11)
            r21 = r11
            r23 = r12
            r24 = r13
            r25 = r0
            r20 = r8
            boolean r0 = X.C26131Qy.A00(r20, r21, r22, r23, r24, r25)
            if (r0 == 0) goto L_0x0141
        L_0x05de:
            X.1PM r14 = r5.A09
            X.1PS r13 = r5.A0p
            boolean r0 = X.C43391zj.A06(r14, r4, r13, r7)
            if (r0 != 0) goto L_0x06b4
            boolean r0 = X.C43391zj.A07(r4, r7)
            if (r0 != 0) goto L_0x06b4
            boolean r0 = X.C43391zj.A08(r4, r7)
            if (r0 != 0) goto L_0x06b4
            boolean r0 = r7 instanceof X.C1771097h
            if (r0 == 0) goto L_0x0638
            X.1RR r0 = r5.A0K
            X.0vl r0 = r0.A0K
            java.lang.Object r2 = r0.getValue()
            X.1PQ r2 = (X.AnonymousClass1PQ) r2
            long r0 = r7.A0I
            X.1PP r2 = r2.A02
            X.205 r4 = r2.A01(r6, r9)
            r2 = 80
            X.97h r3 = new X.97h
            r3.<init>(r4, r2, r0)
            r3.A0d(r6)
            r2 = -1
            A07(r5, r3, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/added ephemeral keep in chat system message; jid="
            r1.append(r0)
            X.205 r0 = r3.A0v
            X.1BI r0 = r0.A00
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2Rs r0 = r5.A0J(r3, r2)
            boolean r2 = r0.A00
            goto L_0x0141
        L_0x0638:
            java.lang.Long r0 = r7.A0T
            X.C17960vV.A07(r0)
            long r0 = r0.longValue()
            boolean r0 = A0C(r5, r7, r0)
            if (r0 != 0) goto L_0x064b
            r0 = r2
            r2 = 0
            if (r0 == 0) goto L_0x064c
        L_0x064b:
            r2 = 1
        L_0x064c:
            r12 = 2
            X.C18070vi.A0d(r14, r12)
            r0 = 3
            X.C18070vi.A0d(r13, r0)
            if (r11 == 0) goto L_0x0141
            X.1cl r8 = r4.A0D(r11)
            if (r8 == 0) goto L_0x0141
            java.lang.Long r0 = r7.A0T
            if (r0 == 0) goto L_0x0141
            if (r3 != 0) goto L_0x0141
            boolean r0 = X.C22971Dz.A0Y(r6)
            if (r0 == 0) goto L_0x0141
            boolean r0 = r14.A04(r11)
            if (r0 != 0) goto L_0x0141
            if (r10 != 0) goto L_0x0141
            boolean r0 = r7 instanceof X.C442622t
            if (r0 != 0) goto L_0x0141
            X.1ci r0 = X.AnonymousClass1CJ.A00(r4, r6)
            if (r0 == 0) goto L_0x0141
            int r0 = r7.A05
            if (r0 <= 0) goto L_0x0141
            boolean r0 = r13.A06()
            if (r0 != 0) goto L_0x0141
            int r1 = r8.expiration
            int r0 = r7.A05
            if (r1 != r0) goto L_0x0141
            long r0 = r8.ephemeralSettingTimestamp
            java.lang.Long r3 = r7.A0T
            if (r3 == 0) goto L_0x0141
            long r10 = r3.longValue()
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0141
            int r0 = r7.A00
            if (r0 != r12) goto L_0x0141
            int r0 = r8.disappearingMessagesInitiator
            if (r0 != 0) goto L_0x0141
            X.0ve r3 = r5.A0q
            r1 = 4131(0x1023, float:5.789E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x0141
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/initiator different so send ESR"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r20 = 0
            goto L_0x0716
        L_0x06b4:
            boolean r20 = X.C43391zj.A06(r14, r4, r13, r7)
            r0 = 2
            X.C18070vi.A0d(r14, r0)
            r0 = 3
            X.C18070vi.A0d(r13, r0)
            if (r3 != 0) goto L_0x071a
            boolean r0 = X.C22971Dz.A0Y(r6)
            if (r0 == 0) goto L_0x071a
            boolean r0 = r14.A04(r11)
            if (r0 != 0) goto L_0x071a
            if (r10 != 0) goto L_0x071a
            boolean r0 = r7 instanceof X.C442622t
            if (r0 != 0) goto L_0x071a
            X.1ci r0 = X.AnonymousClass1CJ.A00(r4, r6)
            if (r0 != 0) goto L_0x071a
            int r0 = r7.A05
            if (r0 <= 0) goto L_0x071a
            boolean r0 = r13.A06()
            if (r0 != 0) goto L_0x071a
            int r1 = r7.A00
            r0 = 2
            if (r1 != r0) goto L_0x071a
        L_0x06e9:
            X.0ve r4 = r5.A0q
            r0 = 2714(0xa9a, float:3.803E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r4, r0)
            if (r0 == 0) goto L_0x072e
            r0 = 4131(0x1023, float:5.789E-42)
            boolean r0 = X.C18020vd.A05(r1, r4, r0)
            if (r0 == 0) goto L_0x072e
            java.lang.Long r0 = r7.A0T
            X.C17960vV.A07(r0)
            long r0 = r0.longValue()
            boolean r0 = A0C(r5, r7, r0)
            if (r0 != 0) goto L_0x0710
            r0 = r2
            r2 = 0
            if (r0 == 0) goto L_0x0711
        L_0x0710:
            r2 = 1
        L_0x0711:
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/ephemeral setting added and send ESR"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0716:
            r22 = 1
            goto L_0x0145
        L_0x071a:
            boolean r0 = X.C43391zj.A08(r4, r7)
            if (r0 == 0) goto L_0x072e
            int r1 = r13.A00()
            int r0 = r7.A05
            if (r1 <= r0) goto L_0x072e
            int r1 = r7.A00
            r0 = 2
            if (r1 != r0) goto L_0x072e
            goto L_0x06e9
        L_0x072e:
            X.1RR r13 = r5.A0K
            X.0vl r15 = r13.A0D
            java.lang.Object r0 = r15.getValue()
            X.1CJ r0 = (X.AnonymousClass1CJ) r0
            X.C18070vi.A0X(r0)
            boolean r0 = X.C43391zj.A07(r0, r7)
            java.lang.String r12 = "Required value was null."
            r11 = 1
            if (r0 != 0) goto L_0x07c9
            java.lang.Object r0 = r15.getValue()
            X.1CJ r0 = (X.AnonymousClass1CJ) r0
            X.C18070vi.A0X(r0)
            boolean r0 = X.C43391zj.A08(r0, r7)
            if (r0 != 0) goto L_0x07c9
            long r0 = r7.A0I
            X.0vl r4 = r13.A0E
            java.lang.Object r3 = r4.getValue()
            X.1PS r3 = (X.AnonymousClass1PS) r3
            int r10 = r3.A00()
            java.lang.Object r4 = r4.getValue()
            X.1PS r4 = (X.AnonymousClass1PS) r4
            X.0vl r3 = r13.A0I
            java.lang.Object r3 = r3.getValue()
            X.11S r3 = (X.AnonymousClass11S) r3
            r3.A0I()
            com.whatsapp.jid.PhoneUserJid r3 = r3.A0E
            X.C17960vV.A07(r3)
            X.C18070vi.A0X(r3)
            long r16 = r4.A02(r3)
            X.0vl r3 = r13.A0K
            java.lang.Object r8 = r3.getValue()
            X.1PQ r8 = (X.AnonymousClass1PQ) r8
            X.1Dw r3 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A01(r6)
            if (r4 == 0) goto L_0x08be
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r9)
        L_0x0792:
            X.1PP r3 = r8.A02
            X.205 r8 = r3.A01(r4, r9)
            r4 = 68
            X.2M9 r3 = new X.2M9
            r3.<init>(r8, r4, r0)
            r3.A00 = r10
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r3.A0h(r0)
            r3.A00 = r11
            r0 = 2
            r3.A04 = r0
            if (r12 == 0) goto L_0x07b1
            r3.A0Q = r12
        L_0x07b1:
            r1 = -1
            A07(r5, r3, r1)
            java.lang.String r0 = "CoreMessageStore/added Disappearing Mode System Message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2Rs r0 = r5.A0J(r3, r1)
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x07c6
            r0 = r2
            r2 = 0
            if (r0 == 0) goto L_0x0143
        L_0x07c6:
            r2 = 1
            goto L_0x0143
        L_0x07c9:
            long r0 = r7.A0I
            int r10 = r7.A05
            int r8 = r7.A00
            java.lang.Long r4 = r7.A0T
            if (r4 == 0) goto L_0x08ca
            long r16 = r4.longValue()
            if (r3 != 0) goto L_0x0842
            r18 = 1
            if (r8 != r9) goto L_0x07df
            r18 = 2
        L_0x07df:
            X.0vl r3 = r13.A0B
            java.lang.Object r14 = r3.getValue()
            X.0vd r14 = (X.C18020vd) r14
            r4 = 2714(0xa9a, float:3.803E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r14, r4)
            if (r3 == 0) goto L_0x083f
            java.lang.Object r3 = r15.getValue()
            X.1CJ r3 = (X.AnonymousClass1CJ) r3
            X.C18070vi.A0X(r3)
            boolean r3 = X.C43391zj.A08(r3, r7)
            if (r3 == 0) goto L_0x083f
            X.0vl r4 = r13.A0E
            java.lang.Object r3 = r4.getValue()
            X.1PS r3 = (X.AnonymousClass1PS) r3
            int r3 = r3.A00()
            if (r3 == 0) goto L_0x083f
            if (r3 >= r10) goto L_0x083f
            if (r8 == 0) goto L_0x083f
            java.lang.Object r3 = r4.getValue()
            X.1PS r3 = (X.AnonymousClass1PS) r3
            int r10 = r3.A00()
            X.0vl r3 = r13.A0L
            r3.getValue()
            long r16 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 / r3
            long r16 = r16 * r3
        L_0x082b:
            X.0vl r3 = r13.A0K
            java.lang.Object r8 = r3.getValue()
            X.1PQ r8 = (X.AnonymousClass1PQ) r8
            X.1Dw r3 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A01(r6)
            if (r4 == 0) goto L_0x08c4
            java.lang.Boolean r12 = r7.A0Q
            goto L_0x0792
        L_0x083f:
            r11 = r18
            goto L_0x082b
        L_0x0842:
            r18 = r8
            goto L_0x07df
        L_0x0845:
            X.1RR r0 = r5.A0K
            X.0vl r0 = r0.A0K
            java.lang.Object r2 = r0.getValue()
            X.1PQ r2 = (X.AnonymousClass1PQ) r2
            long r0 = r7.A0I
            X.1PP r2 = r2.A02
            X.205 r12 = r2.A01(r6, r9)
            r10 = 130(0x82, float:1.82E-43)
            X.20i r2 = new X.20i
            r2.<init>(r12, r10, r0)
            r2.A0d(r6)
            r0 = -1
            X.2Rs r0 = r5.A0J(r2, r0)
            boolean r2 = r0.A00
            r4.A07(r6, r11)
            goto L_0x0104
        L_0x086d:
            long r0 = r7.A0I
            r4.A05(r7, r0)
            goto L_0x0104
        L_0x0874:
            r0 = 0
            goto L_0x00c9
        L_0x0877:
            r2 = 0
            r20 = 0
            r22 = 0
            goto L_0x016d
        L_0x087e:
            X.2lr r0 = r0.A0d
            r19 = r0
            goto L_0x006d
        L_0x0884:
            r27 = 0
            r19 = r27
            goto L_0x006d
        L_0x088a:
            boolean r0 = r7 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x08a5
            r2 = r7
            X.21V r2 = (X.AnonymousClass21V) r2
            java.lang.String r1 = r2.A18()
            if (r1 == 0) goto L_0x0024
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r1.replace(r3, r4)
            r2.A04 = r0
            goto L_0x0024
        L_0x08a5:
            boolean r0 = r7 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x0024
            r2 = r7
            X.210 r2 = (X.AnonymousClass210) r2
            java.lang.String r1 = r2.A06
            if (r1 == 0) goto L_0x0024
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r1.replace(r3, r4)
            r2.A06 = r0
            goto L_0x0024
        L_0x08be:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x08c4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x08ca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x08d0:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass122.BBZ(X.206, int):X.2Rs");
    }

    public void CQc(AW0 aw0) {
        C17960vV.A01();
        AnonymousClass8pG r0 = aw0.A0A;
        C17960vV.A07(r0);
        C26021Qn r1 = this.A0W;
        C20280AEo aEo = r0.A02;
        C17960vV.A07(aEo);
        AnonymousClass21K A012 = r1.A01(aEo.A02);
        if (A012 != null) {
            C20285AEt BPK = A012.BPK();
            C17960vV.A07(BPK);
            C17960vV.A07(BPK);
            C20279AEn aEn = BPK.A02;
            if (aEn == null) {
                Log.e("CoreMessageStore/updateCheckoutMessageWithTransactionInfo -> checkoutInfoContent is null PAY");
            } else if (TextUtils.isEmpty(aEn.A08) || !aEn.A08.equals(aw0.A0K) || aEn.A00 != aw0.A02) {
                aEn.A08 = aw0.A0K;
                aEn.A00 = aw0.A02;
                this.A1W.A0F(A012, ((AnonymousClass206) A012).A0x);
            }
        }
    }

    public void CQv(AnonymousClass206 r19) {
        C28791au A052;
        long uptimeMillis = SystemClock.uptimeMillis();
        AnonymousClass206 r6 = r19;
        r6.A14(1);
        C28791au A053 = this.A0V.A05();
        try {
            C41851xA BD0 = A053.BD0();
            try {
                AnonymousClass1N3 r3 = this.A0P;
                long j = r6.A0x;
                int i = r6.A08;
                A052 = r3.A03.A05();
                ContentValues contentValues = new ContentValues();
                contentValues.put("message_add_on_flags", Integer.valueOf(i));
                if (((C28801av) A052).A02.A02(contentValues, "message", "_id = ?", "UPDATE_MESSAGE_ADD_ON_FLAGS_MAIN_SQL", new String[]{String.valueOf(j)}) == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MainMessageStore/updateMessageAddOnFlagsByRowIdV2/update failed; message.rowId=");
                    sb.append(j);
                    Log.e(sb.toString());
                }
                A052.close();
                BD0.A00();
                A053.BJ7(new AnonymousClass3Bx(this, r6, 20));
                BD0.close();
                A053.close();
                this.A0H.A01("CoreMessageStore/updateMessageForMessageAddOnOnCurrentThread", SystemClock.uptimeMillis() - uptimeMillis);
                return;
            } catch (Throwable th) {
                BD0.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A053.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public AnonymousClass122(C19880zA r3, C19880zA r4, C19880zA r5, C19880zA r6, AnonymousClass190 r7, C218617r r8, AnonymousClass11S r9, C25311Ns r10, AnonymousClass1M9 r11, C25111Mx r12, AnonymousClass1PM r13, AnonymousClass1RW r14, AnonymousClass1Q0 r15, AnonymousClass11C r16, AnonymousClass11P r17, C19830z4 r18, AnonymousClass1Q8 r19, AnonymousClass1QT r20, AnonymousClass1LW r21, AnonymousClass1CJ r22, AnonymousClass1QW r23, AnonymousClass1RQ r24, AnonymousClass1NN r25, AnonymousClass1NA r26, AnonymousClass1LY r27, C25991Qk r28, C26141Qz r29, AnonymousClass1RR r30, C26051Qq r31, AnonymousClass1QB r32, AnonymousClass1MZ r33, AnonymousClass1Q2 r34, C25951Qg r35, AnonymousClass1DL r36, AnonymousClass1N3 r37, C25321Nt r38, AnonymousClass1Q6 r39, C26001Ql r40, C26011Qm r41, AnonymousClass1RP r42, C24681Lg r43, AnonymousClass1CL r44, C22611Cn r45, AnonymousClass1Cd r46, C26021Qn r47, AnonymousClass1R6 r48, C24621La r49, AnonymousClass125 r50, C26111Qw r51, C26041Qp r52, AnonymousClass1NK r53, C26121Qx r54, AnonymousClass1R7 r55, AnonymousClass1RT r56, AnonymousClass1NJ r57, AnonymousClass1LX r58, AnonymousClass1QV r59, AnonymousClass1RS r60, C24631Lb r61, C24661Le r62, AnonymousClass1N2 r63, C25911Qc r64, AnonymousClass1QU r65, C25331Nu r66, C24751Ln r67, AnonymousClass1RL r68, AnonymousClass1RK r69, AnonymousClass1KH r70, AnonymousClass1PS r71, C26131Qy r72, C18030ve r73, C26161Rb r74, AnonymousClass12L r75, AnonymousClass18K r76, AnonymousClass1MB r77, C26061Qr r78, AnonymousClass1O2 r79, AnonymousClass1N5 r80, AnonymousClass1N9 r81, AnonymousClass1N7 r82, AnonymousClass1PT r83, AnonymousClass1RU r84, AnonymousClass1R5 r85, AnonymousClass1QS r86, C59422mH r87, C25981Qj r88, AnonymousClass1RY r89, AnonymousClass1R0 r90, AnonymousClass1PQ r91, C24901Mc r92, AnonymousClass11A r93, AnonymousClass10I r94, AnonymousClass1RZ r95, AnonymousClass1PV r96, AnonymousClass00H r97, AnonymousClass00H r98, AnonymousClass00H r99, AnonymousClass00H r100, AnonymousClass00H r101, AnonymousClass00H r102, AnonymousClass00H r103, AnonymousClass00H r104, AnonymousClass00H r105, AnonymousClass00H r106, AnonymousClass00H r107, AnonymousClass00H r108, AnonymousClass00H r109, AnonymousClass00H r110, AnonymousClass00H r111, AnonymousClass00H r112, AnonymousClass00H r113, AnonymousClass00H r114, AnonymousClass00H r115, AnonymousClass00H r116, AnonymousClass00H r117, AnonymousClass00H r118, AnonymousClass00H r119, AnonymousClass00H r120, AnonymousClass00H r121, AnonymousClass00H r122, AnonymousClass00H r123, AnonymousClass00H r124) {
        this.A1m = r89;
        Boolean bool = C17960vV.A01;
        this.A0A = r17;
        this.A0q = r73;
        this.A1X = r36;
        this.A0C = r21;
        this.A04 = r7;
        this.A06 = r9;
        this.A1e = r58;
        this.A13 = r94;
        this.A0D = r22;
        this.A05 = r8;
        this.A0a = r53;
        this.A0t = r76;
        this.A0d = r57;
        this.A1R = r15;
        this.A1o = r92;
        this.A0g = r62;
        this.A0s = r75;
        this.A0o = r70;
        this.A1j = r81;
        this.A19 = r97;
        this.A18 = r99;
        this.A08 = r11;
        this.A0G = r26;
        this.A0O = r34;
        this.A0w = r83;
        this.A1S = r16;
        this.A1A = r98;
        this.A0M = r32;
        this.A0z = r86;
        this.A1U = r20;
        this.A1E = r100;
        this.A0v = r79;
        this.A0l = r67;
        this.A0P = r37;
        this.A0S = r43;
        this.A10 = r87;
        this.A1i = r80;
        this.A0j = r65;
        this.A1r = r101;
        this.A1L = r102;
        this.A1D = r103;
        this.A12 = r93;
        this.A1z = r104;
        this.A1b = r49;
        this.A1f = r59;
        this.A1y = r105;
        this.A15 = r96;
        this.A16 = r106;
        this.A1T = r19;
        this.A1V = r23;
        this.A0T = r44;
        this.A0Y = r50;
        this.A0h = r63;
        this.A1l = r88;
        this.A0H = r27;
        this.A0I = r28;
        this.A1k = r82;
        AnonymousClass1Q6 r1 = r39;
        this.A0R = r1;
        this.A1Y = r40;
        this.A1Z = r41;
        this.A1P = r12;
        this.A1c = r52;
        this.A0B = r18;
        this.A0r = r74;
        this.A1s = r107;
        this.A0V = r46;
        this.A0W = r47;
        this.A09 = r13;
        this.A0L = r31;
        this.A1h = r78;
        this.A0Z = r51;
        this.A1d = r54;
        this.A11 = r91;
        this.A0i = r64;
        this.A17 = r108;
        this.A0F = r25;
        this.A0J = r29;
        this.A1n = r90;
        this.A0Q = r38;
        this.A0y = r85;
        this.A0X = r48;
        this.A0b = r55;
        this.A0k = r66;
        this.A1B = r109;
        this.A0f = r61;
        this.A0n = r69;
        this.A0m = r68;
        this.A1W = r35;
        this.A1I = r117;
        this.A1F = r110;
        this.A0N = r33;
        this.A1G = r111;
        this.A1x = r112;
        this.A1H = r113;
        this.A20 = r114;
        this.A1a = r42;
        this.A0E = r24;
        this.A07 = r10;
        this.A1C = r115;
        this.A0K = r30;
        this.A1g = r72;
        this.A0U = r45;
        this.A1J = r116;
        this.A0e = r60;
        this.A1O = r3;
        this.A02 = r4;
        this.A0c = r56;
        this.A0p = r71;
        this.A0x = r84;
        this.A1Q = r14;
        this.A14 = r95;
        this.A1u = r118;
        this.A1M = r1.A02;
        this.A0u = r77;
        this.A1N = r5;
        this.A03 = r6;
        this.A1p = r119;
        this.A1w = r120;
        this.A1K = r121;
        this.A1v = r122;
        this.A1t = r123;
        this.A1q = r124;
    }
}
