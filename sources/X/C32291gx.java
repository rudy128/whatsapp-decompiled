package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1gx  reason: invalid class name and case insensitive filesystem */
public class C32291gx {
    public long A00 = (System.currentTimeMillis() - 200);
    public boolean A01;
    public Handler A02;
    public C70873Cv A03;
    public final C32261gu A04;
    public final C32271gv A05;
    public final C32281gw A06;
    public final C32251gt A07;
    public final AnonymousClass11P A08;
    public final C27301Vn A09;
    public final C19830z4 A0A;
    public final AnonymousClass1DL A0B;
    public final AnonymousClass1R3 A0C;
    public final AnonymousClass1WM A0D;
    public final C217217d A0E;
    public final C32241gs A0F;
    public final AnonymousClass1Nb A0G;
    public final AnonymousClass10I A0H;
    public final AnonymousClass00H A0I;
    public final Map A0J = new HashMap();
    public final AnonymousClass190 A0K;
    public final AnonymousClass11S A0L;
    public final AnonymousClass18O A0M;
    public final AnonymousClass1M9 A0N;
    public final C24921Me A0O;
    public final AnonymousClass11C A0P;
    public final AnonymousClass118 A0Q;
    public final C18000vb A0R;
    public final AnonymousClass1CJ A0S;
    public final C32211gp A0T;
    public final C18030ve A0U;
    public final AnonymousClass1LU A0V;
    public final C32301gy A0W = new C32301gy(this);
    public final C32201go A0X;
    public final AnonymousClass00H A0Y;
    public final AnonymousClass00H A0Z;
    public final AnonymousClass00H A0a;
    public final AnonymousClass00H A0b;
    public final AnonymousClass00H A0c;
    public volatile long A0d;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r2 == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        if ((X.AnonymousClass11P.A01(r3.A09) - r2.longValue()) < java.util.concurrent.TimeUnit.SECONDS.toMillis(5)) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b8, code lost:
        if (r0.A0w() == false) goto L_0x01ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C32291gx r13, X.AnonymousClass206 r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r0 = r14
            if (r14 == 0) goto L_0x0012
            X.205 r1 = r14.A0v
            X.1BI r1 = r1.A00
            boolean r1 = X.C22971Dz.A0a(r1)
            if (r1 == 0) goto L_0x0012
            boolean r1 = r14 instanceof X.AnonymousClass227
            if (r1 != 0) goto L_0x0012
            return
        L_0x0012:
            r1 = r13
            r13 = r16
            r14 = r17
            if (r15 != 0) goto L_0x006a
            if (r0 == 0) goto L_0x0041
            X.1go r4 = r1.A0X
            X.1gy r3 = r1.A0W
            monitor-enter(r4)
            boolean r2 = r4.A03     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x0038
            X.205 r10 = r0.A0v     // Catch:{ all -> 0x003b }
            X.C18070vi.A0W(r10)     // Catch:{ all -> 0x003b }
            X.11P r2 = r4.A04     // Catch:{ all -> 0x003b }
            long r11 = X.AnonymousClass11P.A01(r2)     // Catch:{ all -> 0x003b }
            X.2mX r9 = new X.2mX     // Catch:{ all -> 0x003b }
            r9.<init>(r10, r11, r13, r14)     // Catch:{ all -> 0x003b }
            r4.A01 = r9     // Catch:{ all -> 0x003b }
            r4.A00 = r3     // Catch:{ all -> 0x003b }
        L_0x0038:
            boolean r2 = r4.A03     // Catch:{ all -> 0x003b }
            goto L_0x003e
        L_0x003b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x003e:
            monitor-exit(r4)
            if (r2 != 0) goto L_0x006a
        L_0x0041:
            X.00H r2 = r1.A0Y
            java.lang.Object r3 = r2.get()
            X.1cN r3 = (X.C29491cN) r3
            boolean r2 = r3.A0F()
            if (r2 == 0) goto L_0x015c
            java.lang.Long r2 = r3.A00
            if (r2 == 0) goto L_0x015c
            long r7 = r2.longValue()
            X.11P r2 = r3.A09
            long r5 = X.AnonymousClass11P.A01(r2)
            long r5 = r5 - r7
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 5
            long r3 = r4.toMillis(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x015c
        L_0x006a:
            r12 = 1
        L_0x006b:
            r15 = r20
            if (r0 == 0) goto L_0x015f
            X.00H r3 = r1.A0c
            java.lang.Object r2 = r3.get()
            X.2rD r2 = (X.C62322rD) r2
            boolean r2 = r2.A02(r0)
            if (r2 == 0) goto L_0x01b0
            java.lang.Object r9 = r3.get()
            X.2rD r9 = (X.C62322rD) r9
            r2 = 0
            X.118 r1 = r9.A02
            android.content.Context r8 = r1.A00
            X.C18070vi.A0X(r8)
            X.205 r1 = r0.A0v
            X.1BI r7 = r1.A00
            X.C17960vV.A07(r7)
            X.C18070vi.A0X(r7)
            X.1M9 r11 = r9.A00
            X.1E7 r6 = r11.A0H(r7)
            android.net.Uri r5 = X.C62952sG.A00(r6)
            java.lang.String r1 = X.AnonymousClass2WR.A00
            r4 = 2
            android.content.Intent r3 = X.AnonymousClass1LU.A0C(r8, r4)
            r3.setData(r5)
            r3.setAction(r1)
            r1 = 335544320(0x14000000, float:6.4623485E-27)
            r3.addFlags(r1)
            java.lang.String r1 = "fromNotification"
            r5 = 1
            android.content.Intent r1 = r3.putExtra(r1, r5)
            X.C18070vi.A0X(r1)
            android.app.PendingIntent r4 = X.C1408573i.A00(r8, r4, r1, r2)
            X.00H r1 = r9.A06
            java.lang.Object r10 = r1.get()
            X.17d r10 = (X.C217217d) r10
            java.lang.String r15 = r10.A0K(r6, r0)
            java.lang.CharSequence r3 = r10.A0J(r0)
            X.11C r1 = r9.A01
            X.11B r1 = r1.A0O()
            r17 = 0
            if (r1 == 0) goto L_0x00e3
            android.net.Uri r1 = r11.A09(r6, r1)
            if (r1 == 0) goto L_0x00e3
            java.lang.String r17 = r1.toString()
        L_0x00e3:
            android.graphics.Bitmap r1 = r10.A0F(r6)
            if (r1 == 0) goto L_0x015a
            androidx.core.graphics.drawable.IconCompat r14 = androidx.core.graphics.drawable.IconCompat.A03(r1)
        L_0x00ed:
            r1 = 0
            r10 = 0
            X.6uT r13 = new X.6uT
            r19 = r2
            r18 = r2
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            X.73t r11 = new X.73t
            r11.<init>(r8, r1)
            r1 = 2131102244(0x7f060a24, float:1.781692E38)
            int r1 = X.C19740yt.A00(r8, r1)
            r11.A00 = r1
            java.lang.String r1 = "otp_notification_group"
            r11.A0N = r1
            long r1 = r0.A0I
            r11.A09(r1)
            r1 = 3
            r11.A06(r1)
            r11.A03 = r5
            r11.A0E(r15)
            r11.A0D(r3)
            r11.A0A = r4
            java.util.ArrayList r1 = r11.A0T
            r1.add(r13)
            r2 = 2131231578(0x7f08035a, float:1.807924E38)
            android.app.Notification r1 = r11.A08
            r1.icon = r2
            X.00H r1 = r9.A05
            java.lang.Object r1 = r1.get()
            X.17n r1 = (X.C218217n) r1
            java.lang.String r1 = r1.A00(r7, r12)
            if (r1 == 0) goto L_0x013b
            r11.A0M = r1
        L_0x013b:
            r9.A01(r8, r11, r6, r0)
            X.1Vn r4 = r9.A03
            android.app.Notification r3 = r11.A05()
            X.C18070vi.A0X(r3)
            X.1Vo r4 = (X.AnonymousClass1Vo) r4
            java.lang.String r2 = r4.BHf(r7)
            boolean r1 = X.C22971Dz.A0V(r7)
            r0 = 1
            if (r1 == 0) goto L_0x0156
            r0 = 59
        L_0x0156:
            r4.BkT(r3, r2, r0, r10)
            return
        L_0x015a:
            r14 = 0
            goto L_0x00ed
        L_0x015c:
            r12 = 0
            goto L_0x006b
        L_0x015f:
            if (r19 == 0) goto L_0x01b0
            r9 = 0
            r11 = 0
            r16 = 1
            X.1gw r8 = r1.A06
            r10 = r9
            X.3Cv r3 = r8.A01(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x016c:
            X.3Cv r0 = r1.A03
            if (r0 == 0) goto L_0x017f
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x017f
            android.os.Handler r2 = r1.A03()
            X.3Cv r0 = r1.A03
            r2.removeCallbacks(r0)
        L_0x017f:
            r1.A03 = r3
            if (r18 == 0) goto L_0x01a6
            long r5 = android.os.SystemClock.uptimeMillis()
            long r2 = r1.A0d
            long r5 = r5 - r2
            r3 = 4000(0xfa0, double:1.9763E-320)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a6
            java.lang.String r0 = "messagenotification/posting delayed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Handler r2 = r1.A03()
            X.3Cv r0 = r1.A03
            long r3 = r3 - r5
            r2.postDelayed(r0, r3)
        L_0x019f:
            long r2 = android.os.SystemClock.uptimeMillis()
            r1.A0d = r2
            return
        L_0x01a6:
            android.os.Handler r2 = r1.A03()
            X.3Cv r0 = r1.A03
            r2.post(r0)
            goto L_0x019f
        L_0x01b0:
            r3 = 0
            if (r0 == 0) goto L_0x01ba
            boolean r2 = r0.A0w()
            r10 = 1
            if (r2 != 0) goto L_0x01bb
        L_0x01ba:
            r10 = 0
        L_0x01bb:
            X.1gw r2 = r1.A06
            r5 = 0
            r4 = r0
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            X.3Cv r3 = r2.A01(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x016c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32291gx.A00(X.1gx, X.206, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public synchronized Handler A03() {
        Handler handler;
        handler = this.A02;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("Notifications", 10);
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            C18070vi.A0d(looper, 1);
            handler = new Handler(looper);
            this.A02 = handler;
        }
        return handler;
    }

    public void A08() {
        A00(this, (AnonymousClass206) null, true, true, false, false, false, false);
    }

    public void A0B(AnonymousClass1BI r9, AnonymousClass206 r10, long j, boolean z, boolean z2) {
        if (C18020vd.A05(C18040vf.A02, this.A0U, 11281) && !z2) {
            AnonymousClass1BI r5 = r9;
            if (r9 != null) {
                A03().postDelayed(new AnonymousClass7RT(this, r10, r5, 35, z), j);
            }
        }
    }

    public void A0C(AnonymousClass206 r9, boolean z, boolean z2) {
        A00(this, r9, z, this.A01, false, false, false, z2);
    }

    public static void A01(List list) {
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append(((C60182nW) it.next()).A00.A0v.A01);
                sb.append(' ');
            }
            sb.toString();
        }
    }

    public AnonymousClass2KZ A04(C55072fA r19) {
        C18030ve r13 = this.A0U;
        AnonymousClass118 r9 = this.A0Q;
        AnonymousClass1LU r14 = this.A0V;
        AnonymousClass190 r3 = this.A0K;
        AnonymousClass11S r4 = this.A0L;
        AnonymousClass18O r5 = this.A0M;
        AnonymousClass1M9 r6 = this.A0N;
        AnonymousClass11C r8 = this.A0P;
        return new AnonymousClass2KZ(r3, r4, r5, r6, this.A0O, r8, r9, this.A0R, this.A0T, (C42351y2) this.A0Z.get(), r13, r14, this.A0E, r19, (AnonymousClass72L) this.A0a.get());
    }

    public C60182nW A05(AnonymousClass206 r16) {
        C18030ve r10 = this.A0U;
        AnonymousClass190 r1 = this.A0K;
        AnonymousClass11S r2 = this.A0L;
        AnonymousClass118 r7 = this.A0Q;
        AnonymousClass1LU r11 = this.A0V;
        AnonymousClass1M9 r4 = this.A0N;
        AnonymousClass11C r6 = this.A0P;
        C24921Me r5 = this.A0O;
        C18000vb r8 = this.A0R;
        C217217d r12 = this.A0E;
        return new C60182nW(r1, r2, this.A0M, r4, r5, r6, r7, r8, this.A0T, r10, r11, r12, r16, (AnonymousClass72L) this.A0a.get());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0260, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0255, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0259, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x025c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x025d, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01e6 A[Catch:{ all -> 0x0255 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A06(X.AnonymousClass1BI r23, int r24) {
        /*
            r22 = this;
            r13 = r22
            X.1CJ r0 = r13.A0S
            r2 = r23
            int r3 = r0.A03(r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = r24
            if (r3 <= r0) goto L_0x0021
            X.1R3 r1 = r13.A0C
            r0 = 7
            int r0 = java.lang.Math.min(r3, r0)
            java.util.ArrayList r0 = r1.A07(r2, r0)
            r5.addAll(r0)
        L_0x0021:
            r4 = 0
            r3 = 0
        L_0x0023:
            int r0 = r5.size()
            if (r3 >= r0) goto L_0x003a
            java.lang.Object r0 = r5.get(r3)
            X.206 r0 = (X.AnonymousClass206) r0
            int r1 = r0.A0D()
            r0 = 13
            if (r1 > r0) goto L_0x003a
            int r3 = r3 + 1
            goto L_0x0023
        L_0x003a:
            int r0 = r5.size()
            if (r3 >= r0) goto L_0x0044
            java.util.List r5 = r5.subList(r4, r3)
        L_0x0044:
            X.1gt r0 = r13.A07
            java.util.List r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x004f
            r5.addAll(r0)
        L_0x004f:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r1 = r5.iterator()
        L_0x0058:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r0 = r1.next()
            X.206 r0 = (X.AnonymousClass206) r0
            X.2nW r0 = r13.A05(r0)
            r12.add(r0)
            goto L_0x0058
        L_0x006c:
            java.util.List r1 = java.util.Collections.emptyList()
            X.1Nb r0 = r13.A0G
            X.1yM r0 = r0.A0a(r2)
            X.1yM r0 = r0.A02()
            boolean r0 = r0.A0R
            if (r0 != 0) goto L_0x0086
            X.1WM r1 = r13.A0D
            r0 = 56
            java.util.List r1 = r1.A0F(r2, r0)
        L_0x0086:
            java.util.Iterator r1 = r1.iterator()
        L_0x008a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r1.next()
            X.2fA r0 = (X.C55072fA) r0
            X.2KZ r0 = r13.A04(r0)
            r12.add(r0)
            goto L_0x008a
        L_0x009e:
            X.1WM r4 = r13.A0D
            java.util.List r0 = r4.A0E(r2)
            java.util.Iterator r3 = r0.iterator()
        L_0x00a8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00be
            java.lang.Object r1 = r3.next()
            X.2eF r1 = (X.C54502eF) r1
            X.1gv r0 = r13.A05
            X.2KX r0 = r0.A00(r1)
            r12.add(r0)
            goto L_0x00a8
        L_0x00be:
            r0 = 67
            java.util.List r0 = r4.A0F(r2, r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00c8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r1.next()
            X.2fA r0 = (X.C55072fA) r0
            X.2KZ r0 = r13.A04(r0)
            r12.add(r0)
            goto L_0x00c8
        L_0x00dc:
            r0 = 93
            java.util.List r0 = r4.A0F(r2, r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00e6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r0 = r1.next()
            X.2fA r0 = (X.C55072fA) r0
            X.2KZ r0 = r13.A04(r0)
            r12.add(r0)
            goto L_0x00e6
        L_0x00fa:
            X.00H r0 = r13.A0b
            java.lang.Object r11 = r0.get()
            X.2ms r11 = (X.C59782ms) r11
            r9 = 10
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            X.1LW r0 = r11.A00
            long r7 = r0.A09(r2)
            X.1CJ r0 = r11.A01
            long r5 = r0.A07(r2)
            X.1Cd r0 = r11.A05
            X.1at r10 = r0.get()
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x025a }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x025a }
            java.lang.String r3 = "\n          SELECT \n            message_row_id,\n            last_comment_ts,\n            last_comment_message_row_id\n          FROM message_comment_parent JOIN available_message_view \n          WHERE \n            message_row_id = _id\n            AND message_comment_parent.chat_row_id = ? \n            AND last_comment_message_row_id > ?\n            AND from_me = 1\n          ORDER BY last_comment_message_row_id\n          LIMIT ?\n        "
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x025a }
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x025a }
            r2[r1] = r0     // Catch:{ all -> 0x025a }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x025a }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x025a }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x025a }
            r0 = 2
            r2[r0] = r1     // Catch:{ all -> 0x025a }
            java.lang.String r0 = "SELECT_PARENT_MESSAGES_FOR_COMMENTS_NOTIFICATION"
            android.database.Cursor r9 = r4.A0A(r3, r0, r2)     // Catch:{ all -> 0x025a }
            X.C18070vi.A0b(r9)     // Catch:{ all -> 0x0253 }
            java.lang.String r1 = "message_row_id"
            r0 = 0
            X.C18070vi.A0d(r9, r0)     // Catch:{ all -> 0x0253 }
            int r8 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "last_comment_ts"
            int r7 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "last_comment_message_row_id"
            int r6 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0253 }
            int r0 = r9.getCount()     // Catch:{ all -> 0x0253 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0253 }
            r5.<init>(r0)     // Catch:{ all -> 0x0253 }
            r0 = -1
            r9.moveToPosition(r0)     // Catch:{ all -> 0x0253 }
            boolean r0 = r9.isBeforeFirst()     // Catch:{ all -> 0x0253 }
            r4 = 0
            if (r0 == 0) goto L_0x0172
            boolean r0 = r9.moveToFirst()     // Catch:{ all -> 0x0253 }
            if (r0 != 0) goto L_0x0172
            goto L_0x01ef
        L_0x0172:
            boolean r0 = r9.isAfterLast()     // Catch:{ all -> 0x0253 }
            if (r0 == 0) goto L_0x0179
            goto L_0x01ef
        L_0x0179:
            long r2 = r9.getLong(r8)     // Catch:{ all -> 0x0253 }
            boolean r0 = r9.isNull(r7)     // Catch:{ all -> 0x0253 }
            if (r0 == 0) goto L_0x0185
            r14 = r4
            goto L_0x018d
        L_0x0185:
            long r0 = r9.getLong(r7)     // Catch:{ all -> 0x0253 }
            java.lang.Long r14 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0253 }
        L_0x018d:
            boolean r0 = r9.isNull(r6)     // Catch:{ all -> 0x0253 }
            if (r0 == 0) goto L_0x0194
            goto L_0x019d
        L_0x0194:
            long r0 = r9.getLong(r6)     // Catch:{ all -> 0x0253 }
            java.lang.Long r16 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0253 }
            goto L_0x019f
        L_0x019d:
            r16 = r4
        L_0x019f:
            if (r16 == 0) goto L_0x01e3
            if (r14 == 0) goto L_0x01e3
            X.00H r1 = r11.A07     // Catch:{ all -> 0x0253 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0253 }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x0253 }
            X.1W2 r0 = r0.A01     // Catch:{ all -> 0x0253 }
            X.206 r14 = r0.A03(r2)     // Catch:{ all -> 0x0253 }
            java.lang.Object r15 = r1.get()     // Catch:{ all -> 0x0253 }
            X.1W6 r15 = (X.AnonymousClass1W6) r15     // Catch:{ all -> 0x0253 }
            long r0 = r16.longValue()     // Catch:{ all -> 0x0253 }
            X.1W2 r15 = r15.A01     // Catch:{ all -> 0x0253 }
            X.206 r1 = r15.A03(r0)     // Catch:{ all -> 0x0253 }
            if (r14 == 0) goto L_0x01e3
            if (r1 == 0) goto L_0x01e3
            boolean r0 = r1 instanceof X.AnonymousClass23N     // Catch:{ all -> 0x0253 }
            if (r0 != 0) goto L_0x01e3
            X.205 r0 = r14.A0v     // Catch:{ all -> 0x0253 }
            r16 = r0
            X.C18070vi.A0W(r16)     // Catch:{ all -> 0x0253 }
            long r14 = r14.A0y     // Catch:{ all -> 0x0253 }
            java.util.LinkedHashSet r17 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0253 }
            r17.<init>()     // Catch:{ all -> 0x0253 }
            X.2mk r0 = new X.2mk     // Catch:{ all -> 0x0253 }
            r18 = r2
            r20 = r14
            r15 = r1
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r20)     // Catch:{ all -> 0x0253 }
            goto L_0x01e4
        L_0x01e3:
            r0 = r4
        L_0x01e4:
            if (r0 == 0) goto L_0x01e9
            r5.add(r0)     // Catch:{ all -> 0x0253 }
        L_0x01e9:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0253 }
            if (r0 != 0) goto L_0x0179
        L_0x01ef:
            r9.close()     // Catch:{ all -> 0x025a }
            r10.close()
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.util.Iterator r9 = r5.iterator()
            r8 = r4
        L_0x01ff:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0220
            java.lang.Object r6 = r9.next()
            X.2mk r6 = (X.C59702mk) r6
            java.util.Set r0 = r6.A05
            r7.addAll(r0)
            if (r8 == 0) goto L_0x021e
            X.206 r0 = r8.A03
            long r2 = r0.A0x
            X.206 r0 = r6.A03
            long r0 = r0.A0x
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x01ff
        L_0x021e:
            r8 = r6
            goto L_0x01ff
        L_0x0220:
            if (r8 == 0) goto L_0x023e
            java.util.Set r0 = r8.A05
            r0.addAll(r7)
            long r5 = r8.A02
            X.205 r3 = r8.A04
            long r1 = r8.A00
            X.206 r0 = r8.A03
            X.2mk r4 = new X.2mk
            r14 = r4
            r15 = r0
            r16 = r3
            r17 = r7
            r18 = r5
            r20 = r1
            r14.<init>(r15, r16, r17, r18, r20)
        L_0x023e:
            if (r4 == 0) goto L_0x0249
            X.1gu r0 = r13.A04
            X.2KY r0 = r0.A00(r4)
            r12.add(r0)
        L_0x0249:
            r1 = 1
            X.3D2 r0 = new X.3D2
            r0.<init>(r1)
            java.util.Collections.sort(r12, r0)
            return r12
        L_0x0253:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0255 }
        L_0x0255:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ all -> 0x025a }
            throw r0     // Catch:{ all -> 0x025a }
        L_0x025a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x025c }
        L_0x025c:
            r0 = move-exception
            X.CDX.A00(r10, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32291gx.A06(X.1BI, int):java.util.ArrayList");
    }

    public void A07() {
        C32201go r1 = this.A0X;
        synchronized (r1) {
            r1.A01 = null;
            r1.A00 = null;
        }
    }

    public void A0D(AnonymousClass205 r10, boolean z, boolean z2) {
        if (r10 != null) {
            AnonymousClass206 A052 = ((AnonymousClass1W6) this.A0I.get()).A01.A05(r10);
            if (A052 != null) {
                A00(this, A052, false, z, z2, false, false, true);
            } else {
                Log.i("messagenotification/refreshStatusBarNotificationIfMessageExists/no-message");
            }
        } else {
            Log.e("messagenotification/refreshStatusBarNotificationIfMessageExists/no-messag-key");
        }
    }

    public C32291gx(AnonymousClass190 r5, C32261gu r6, C32271gv r7, C32281gw r8, AnonymousClass11S r9, AnonymousClass18O r10, C32251gt r11, AnonymousClass1M9 r12, C24921Me r13, AnonymousClass11C r14, AnonymousClass11P r15, AnonymousClass118 r16, C27301Vn r17, C19830z4 r18, C18000vb r19, AnonymousClass1CJ r20, AnonymousClass1DL r21, AnonymousClass1R3 r22, AnonymousClass1WM r23, C32211gp r24, C18030ve r25, AnonymousClass1LU r26, C217217d r27, C32241gs r28, C32201go r29, AnonymousClass1Nb r30, AnonymousClass10I r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36, AnonymousClass00H r37) {
        this.A0Q = r16;
        this.A08 = r15;
        this.A0U = r25;
        this.A0B = r21;
        this.A0K = r5;
        this.A0L = r9;
        this.A0V = r26;
        this.A0H = r31;
        this.A0S = r20;
        this.A0M = r10;
        this.A0a = r32;
        this.A0N = r12;
        this.A0P = r14;
        this.A0O = r13;
        this.A0R = r19;
        this.A0Y = r33;
        this.A0I = r34;
        this.A0C = r22;
        this.A0G = r30;
        this.A0E = r27;
        this.A0X = r29;
        AnonymousClass1WM r1 = r23;
        this.A0D = r1;
        this.A0T = r24;
        this.A0A = r18;
        this.A0F = r28;
        this.A09 = r17;
        this.A07 = r11;
        this.A0c = r35;
        this.A0Z = r37;
        this.A0b = r36;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r8;
        r1.A0W = new C32311gz(this);
    }

    public static boolean A02(AnonymousClass206 r4, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C60182nW r2 = (C60182nW) it.next();
            if (r2.A00.A0v.equals(r4.A0v) && r2.A00.A0u == r4.A0u) {
                return true;
            }
        }
        return false;
    }

    public void A09(AnonymousClass1BI r4) {
        A03().post(new C70653Bz(this, r4, 12));
        A07();
    }

    public void A0A(AnonymousClass1BI r4, AnonymousClass206 r5) {
        A03().post(new C21435Ak2(this, r5, r4, 21));
    }

    public void A0E(boolean z) {
        A03().post(new C70813Cp(this, 19, z));
        A07();
    }
}
