package X;

import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1US  reason: invalid class name */
public class AnonymousClass1US implements C26181Rd {
    public Handler A00;
    public final C19880zA A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass11S A04;
    public final C23651Hc A05;
    public final C26271Rm A06;
    public final C26911Ty A07;
    public final AnonymousClass11E A08;
    public final AnonymousClass1M9 A09;
    public final AnonymousClass1UO A0A;
    public final C26861Tt A0B;
    public final AnonymousClass1UR A0C;
    public final AnonymousClass1UU A0D;
    public final AnonymousClass1UT A0E;
    public final C25161Nd A0F;
    public final AnonymousClass11C A0G;
    public final AnonymousClass11P A0H;
    public final AnonymousClass118 A0I;
    public final C219217x A0J;
    public final AnonymousClass1UN A0K;
    public final AnonymousClass1UZ A0L;
    public final C18030ve A0M;
    public final AnonymousClass1QO A0N;
    public final AnonymousClass1CM A0O;
    public final C200710s A0P;
    public final C26301Rp A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;
    public final Runnable A0V;
    public final Random A0W = new Random();
    public final AtomicBoolean A0X = new AtomicBoolean(false);

    public static synchronized Handler A00(AnonymousClass1US r3) {
        Handler handler;
        synchronized (r3) {
            handler = r3.A00;
            if (handler == null) {
                HandlerThread handlerThread = new HandlerThread("sync", 10);
                handlerThread.start();
                handler = new Handler(handlerThread.getLooper());
                r3.A00 = handler;
            }
        }
        return handler;
    }

    public /* synthetic */ void BvR() {
    }

    public /* synthetic */ void BvS() {
    }

    public /* synthetic */ void BvT() {
    }

    public /* synthetic */ void BvV() {
    }

    public static ArrayList A01(AnonymousClass1US r4, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI r1 = (AnonymousClass1BI) it.next();
            AnonymousClass1E7 A0E2 = r4.A09.A0E(r1);
            if (A0E2 == null) {
                A0E2 = new AnonymousClass1E7(r1);
            }
            arrayList.add(A0E2);
        }
        return arrayList;
    }

    public static void A02(AnonymousClass1US r7) {
        Cursor A032;
        AnonymousClass1UO r1 = r7.A0A;
        if (r1.A0I.A03() && ((C33821jR) r1.A0S.get()).A00.A00() != null) {
            AnonymousClass1M2 r12 = r7.A09.A04;
            AnonymousClass1Ez r6 = new AnonymousClass1Ez(true);
            r6.A04();
            String[] strArr = {String.valueOf(1)};
            try {
                C28781at A052 = r12.A00.get();
                try {
                    A032 = C24861Ly.A03(A052, "SELECT wa_contacts.jid FROM wa_contacts WHERE jid IS NOT NULL AND is_whatsapp_user = 1 AND raw_contact_id NOT NULL AND raw_contact_id != -1 AND raw_contact_id != -4 AND is_contact_synced != 1 AND is_contact_synced != 2 LIMIT ?", "IS_NEED_TO_UPLOAD_CONTACTS", strArr);
                    if (!A032.moveToNext()) {
                        Log.w("ContactManagerDatabase/isNeedToUploadContacts missing cursor");
                    }
                    A032.close();
                    A052.close();
                } catch (Throwable th) {
                    A052.close();
                    throw th;
                }
            } catch (IllegalStateException e) {
                AnonymousClass1M2.A0G(e, "ContactManagerDatabase/isNeedToUploadContacts/", 0, 0);
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
            r6.A01();
            C63212sh r13 = new C63212sh(AnonymousClass2R1.A0A, (Integer) null);
            r13.A05 = true;
            r13.A00 = C62132qq.A0G;
            A03(r7, r13.A02());
            return;
        }
        return;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0136, code lost:
        if (r0.A0L == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0138, code lost:
        r22 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x013c, code lost:
        if (r2.A0K != false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x013e, code lost:
        r23 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0142, code lost:
        if (r0.A0K == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0144, code lost:
        r23 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0146, code lost:
        r3.A00 = new X.C62132qq(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
        r9 = r3.A02();
        r9.A00 = java.lang.Math.max(r2.A00, r0.A00);
        r3 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x015d, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r2 = new java.util.ArrayList(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0163, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r3 = r9.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0166, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r3.addAll(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x016a, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        r2 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x016d, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r0 = new java.util.ArrayList(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0173, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r3.addAll(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0178, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0179, code lost:
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x017b, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x017e, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0181, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0184, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("these requests cannot be combined ");
        r3.append(r2);
        r3.append(" and ");
        r3.append(r0);
        r1 = new java.lang.IllegalStateException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x01a6, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        com.whatsapp.util.Log.i("ContactSyncRequestExecutor/combineRequests");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.A02.remove(r0);
        r3 = (X.C53192c8) r1.A01.remove(r0);
        X.AnonymousClass1UT.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        r5 = java.lang.Math.max(r3.A00 - android.os.SystemClock.elapsedRealtime(), 0);
        A00(r4).removeCallbacks(r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        if (r11 == r12) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        r3 = new X.C63212sh(r11, (java.lang.Integer) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        if (r2.A02 != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        if (r0.A02 == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0079, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        r3.A03 = r9;
        r9 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        if (r9 != null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        r9 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        r3.A01 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        if (r2.A08 == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        if (r0.A08 != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008d, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        r3.A04 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0092, code lost:
        if (r2.A09 == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0097, code lost:
        if (r0.A09 != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0099, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009a, code lost:
        r3.A05 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009e, code lost:
        if (r2.A07 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a0, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a3, code lost:
        if (r0.A07 == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a5, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a6, code lost:
        r3.A02 = r9;
        X.C63212sh.A01(r3, r2.A05);
        X.C63212sh.A01(r3, r0.A05);
        r9 = r2.A06;
        r11 = r3.A08;
        r11.addAll(r9);
        r11.addAll(r0.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c0, code lost:
        if (r2.A0C != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c2, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c5, code lost:
        if (r0.A0C == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c7, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ca, code lost:
        if (r2.A0I != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cc, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cf, code lost:
        if (r0.A0I == false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d1, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d4, code lost:
        if (r2.A0J != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d6, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d9, code lost:
        if (r0.A0J == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00db, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00de, code lost:
        if (r2.A0H != false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e0, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e3, code lost:
        if (r0.A0H == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e5, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e8, code lost:
        if (r2.A0B != false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ea, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ee, code lost:
        if (r0.A0B == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f0, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f4, code lost:
        if (r2.A0D != false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f6, code lost:
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00fa, code lost:
        if (r0.A0D == false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00fc, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0100, code lost:
        if (r2.A0G != false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0102, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0106, code lost:
        if (r0.A0G == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0108, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x010c, code lost:
        if (r2.A0E != false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x010e, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0112, code lost:
        if (r0.A0E == false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0114, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0118, code lost:
        if (r2.A0F != false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x011a, code lost:
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x011e, code lost:
        if (r0.A0F == false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0120, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0124, code lost:
        if (r2.A0A != false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0126, code lost:
        r21 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x012a, code lost:
        if (r0.A0A == false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x012c, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0130, code lost:
        if (r2.A0L != false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0132, code lost:
        r22 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.AnonymousClass1US r22, X.C62592re r23) {
        /*
            r2 = r23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ContactSyncRequestExecutor/queueRequest "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = r22
            java.util.concurrent.atomic.AtomicBoolean r10 = r4.A0X
            monitor-enter(r10)
            X.1UT r1 = r4.A0E     // Catch:{ all -> 0x02a0 }
            monitor-enter(r1)     // Catch:{ all -> 0x02a0 }
            java.util.Set r0 = r1.A02     // Catch:{ all -> 0x029d }
            monitor-exit(r1)     // Catch:{ all -> 0x02a0 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x02a0 }
        L_0x0025:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02a0 }
            r7 = 0
            if (r0 == 0) goto L_0x01a7
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x02a0 }
            X.2re r0 = (X.C62592re) r0     // Catch:{ all -> 0x02a0 }
            X.2R1 r3 = r0.A03     // Catch:{ all -> 0x02a0 }
            X.2R1 r11 = r2.A03     // Catch:{ all -> 0x02a0 }
            if (r3 != r11) goto L_0x0025
            X.2R1 r12 = X.AnonymousClass2R1.A0N     // Catch:{ all -> 0x02a0 }
            if (r3 == r12) goto L_0x0025
            java.lang.String r3 = "ContactSyncRequestExecutor/combineRequests"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x02a0 }
            monitor-enter(r1)     // Catch:{ all -> 0x02a0 }
            java.util.Set r3 = r1.A02     // Catch:{ all -> 0x029d }
            r3.remove(r0)     // Catch:{ all -> 0x029d }
            java.util.Map r3 = r1.A01     // Catch:{ all -> 0x029d }
            java.lang.Object r3 = r3.remove(r0)     // Catch:{ all -> 0x029d }
            X.2c8 r3 = (X.C53192c8) r3     // Catch:{ all -> 0x029d }
            X.AnonymousClass1UT.A00(r1)     // Catch:{ all -> 0x029d }
            monitor-exit(r1)     // Catch:{ all -> 0x02a0 }
            long r5 = r3.A00     // Catch:{ all -> 0x02a0 }
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02a0 }
            long r5 = r5 - r13
            long r5 = java.lang.Math.max(r5, r7)     // Catch:{ all -> 0x02a0 }
            android.os.Handler r9 = A00(r4)     // Catch:{ all -> 0x02a0 }
            java.lang.Runnable r3 = r3.A01     // Catch:{ all -> 0x02a0 }
            r9.removeCallbacks(r3)     // Catch:{ all -> 0x02a0 }
            if (r11 == r12) goto L_0x0187
            r9 = 0
            X.2sh r3 = new X.2sh     // Catch:{ all -> 0x02a0 }
            r3.<init>(r11, r9)     // Catch:{ all -> 0x02a0 }
            boolean r9 = r2.A02     // Catch:{ all -> 0x02a0 }
            if (r9 != 0) goto L_0x0079
            boolean r11 = r0.A02     // Catch:{ all -> 0x02a0 }
            r9 = 0
            if (r11 == 0) goto L_0x007a
        L_0x0079:
            r9 = 1
        L_0x007a:
            r3.A03 = r9     // Catch:{ all -> 0x02a0 }
            java.lang.Integer r9 = r2.A01     // Catch:{ all -> 0x02a0 }
            if (r9 != 0) goto L_0x0082
            java.lang.Integer r9 = r0.A01     // Catch:{ all -> 0x02a0 }
        L_0x0082:
            r3.A01 = r9     // Catch:{ all -> 0x02a0 }
            boolean r9 = r2.A08     // Catch:{ all -> 0x02a0 }
            if (r9 == 0) goto L_0x008d
            boolean r11 = r0.A08     // Catch:{ all -> 0x02a0 }
            r9 = 1
            if (r11 != 0) goto L_0x008e
        L_0x008d:
            r9 = 0
        L_0x008e:
            r3.A04 = r9     // Catch:{ all -> 0x02a0 }
            boolean r9 = r2.A09     // Catch:{ all -> 0x02a0 }
            if (r9 == 0) goto L_0x0099
            boolean r11 = r0.A09     // Catch:{ all -> 0x02a0 }
            r9 = 1
            if (r11 != 0) goto L_0x009a
        L_0x0099:
            r9 = 0
        L_0x009a:
            r3.A05 = r9     // Catch:{ all -> 0x02a0 }
            boolean r9 = r2.A07     // Catch:{ all -> 0x02a0 }
            if (r9 != 0) goto L_0x00a5
            boolean r11 = r0.A07     // Catch:{ all -> 0x02a0 }
            r9 = 0
            if (r11 == 0) goto L_0x00a6
        L_0x00a5:
            r9 = 1
        L_0x00a6:
            r3.A02 = r9     // Catch:{ all -> 0x02a0 }
            java.util.List r9 = r2.A05     // Catch:{ all -> 0x02a0 }
            X.C63212sh.A01(r3, r9)     // Catch:{ all -> 0x02a0 }
            java.util.List r9 = r0.A05     // Catch:{ all -> 0x02a0 }
            X.C63212sh.A01(r3, r9)     // Catch:{ all -> 0x02a0 }
            java.util.Set r9 = r2.A06     // Catch:{ all -> 0x02a0 }
            java.util.Set r11 = r3.A08     // Catch:{ all -> 0x02a0 }
            r11.addAll(r9)     // Catch:{ all -> 0x02a0 }
            java.util.Set r9 = r0.A06     // Catch:{ all -> 0x02a0 }
            r11.addAll(r9)     // Catch:{ all -> 0x02a0 }
            boolean r9 = r2.A0C     // Catch:{ all -> 0x02a0 }
            if (r9 != 0) goto L_0x00c7
            boolean r9 = r0.A0C     // Catch:{ all -> 0x02a0 }
            r12 = 0
            if (r9 == 0) goto L_0x00c8
        L_0x00c7:
            r12 = 1
        L_0x00c8:
            boolean r9 = r2.A0I     // Catch:{ all -> 0x02a0 }
            if (r9 != 0) goto L_0x00d1
            boolean r9 = r0.A0I     // Catch:{ all -> 0x02a0 }
            r13 = 0
            if (r9 == 0) goto L_0x00d2
        L_0x00d1:
            r13 = 1
        L_0x00d2:
            boolean r9 = r2.A0J     // Catch:{ all -> 0x02a0 }
            if (r9 != 0) goto L_0x00db
            boolean r9 = r0.A0J     // Catch:{ all -> 0x02a0 }
            r14 = 0
            if (r9 == 0) goto L_0x00dc
        L_0x00db:
            r14 = 1
        L_0x00dc:
            boolean r9 = r2.A0H     // Catch:{ all -> 0x02a0 }
            if (r9 != 0) goto L_0x00e5
            boolean r9 = r0.A0H     // Catch:{ all -> 0x02a0 }
            r15 = 0
            if (r9 == 0) goto L_0x00e6
        L_0x00e5:
            r15 = 1
        L_0x00e6:
            boolean r9 = r2.A0B     // Catch:{ all -> 0x02a0 }
            if (r9 != 0) goto L_0x00f0
            boolean r9 = r0.A0B     // Catch:{ all -> 0x02a0 }
            r16 = 0
            if (r9 == 0) goto L_0x00f2
        L_0x00f0:
            r16 = 1
        L_0x00f2:
            boolean r9 = r2.A0D     // Catch:{ all -> 0x02a0 }
            if (r9 != 0) goto L_0x00fc
            boolean r9 = r0.A0D     // Catch:{ all -> 0x02a0 }
            r17 = 0
            if (r9 == 0) goto L_0x00fe
        L_0x00fc:
            r17 = 1
        L_0x00fe:
            boolean r9 = r2.A0G     // Catch:{ all -> 0x02a0 }
            if (r9 != 0) goto L_0x0108
            boolean r9 = r0.A0G     // Catch:{ all -> 0x02a0 }
            r18 = 0
            if (r9 == 0) goto L_0x010a
        L_0x0108:
            r18 = 1
        L_0x010a:
            boolean r9 = r2.A0E     // Catch:{ all -> 0x02a0 }
            if (r9 != 0) goto L_0x0114
            boolean r9 = r0.A0E     // Catch:{ all -> 0x02a0 }
            r19 = 0
            if (r9 == 0) goto L_0x0116
        L_0x0114:
            r19 = 1
        L_0x0116:
            boolean r9 = r2.A0F     // Catch:{ all -> 0x02a0 }
            if (r9 != 0) goto L_0x0120
            boolean r9 = r0.A0F     // Catch:{ all -> 0x02a0 }
            r20 = 0
            if (r9 == 0) goto L_0x0122
        L_0x0120:
            r20 = 1
        L_0x0122:
            boolean r9 = r2.A0A     // Catch:{ all -> 0x02a0 }
            if (r9 != 0) goto L_0x012c
            boolean r9 = r0.A0A     // Catch:{ all -> 0x02a0 }
            r21 = 0
            if (r9 == 0) goto L_0x012e
        L_0x012c:
            r21 = 1
        L_0x012e:
            boolean r9 = r2.A0L     // Catch:{ all -> 0x02a0 }
            if (r9 != 0) goto L_0x0138
            boolean r9 = r0.A0L     // Catch:{ all -> 0x02a0 }
            r22 = 0
            if (r9 == 0) goto L_0x013a
        L_0x0138:
            r22 = 1
        L_0x013a:
            boolean r9 = r2.A0K     // Catch:{ all -> 0x02a0 }
            if (r9 != 0) goto L_0x0144
            boolean r9 = r0.A0K     // Catch:{ all -> 0x02a0 }
            r23 = 0
            if (r9 == 0) goto L_0x0146
        L_0x0144:
            r23 = 1
        L_0x0146:
            X.2qq r11 = new X.2qq     // Catch:{ all -> 0x02a0 }
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x02a0 }
            r3.A00 = r11     // Catch:{ all -> 0x02a0 }
            X.2re r9 = r3.A02()     // Catch:{ all -> 0x02a0 }
            int r11 = r2.A00     // Catch:{ all -> 0x02a0 }
            int r3 = r0.A00     // Catch:{ all -> 0x02a0 }
            int r3 = java.lang.Math.max(r11, r3)     // Catch:{ all -> 0x02a0 }
            r9.A00 = r3     // Catch:{ all -> 0x02a0 }
            java.util.List r3 = r2.A04     // Catch:{ all -> 0x02a0 }
            monitor-enter(r3)     // Catch:{ all -> 0x02a0 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0184 }
            r2.<init>(r3)     // Catch:{ all -> 0x0184 }
            monitor-exit(r3)     // Catch:{ all -> 0x0184 }
            java.util.List r3 = r9.A04     // Catch:{ all -> 0x02a0 }
            monitor-enter(r3)     // Catch:{ all -> 0x02a0 }
            r3.addAll(r2)     // Catch:{ all -> 0x0181 }
            monitor-exit(r3)     // Catch:{ all -> 0x0181 }
            java.util.List r2 = r0.A04     // Catch:{ all -> 0x02a0 }
            monitor-enter(r2)     // Catch:{ all -> 0x02a0 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x017e }
            r0.<init>(r2)     // Catch:{ all -> 0x017e }
            monitor-exit(r2)     // Catch:{ all -> 0x017e }
            monitor-enter(r3)     // Catch:{ all -> 0x02a0 }
            r3.addAll(r0)     // Catch:{ all -> 0x017b }
            monitor-exit(r3)     // Catch:{ all -> 0x017b }
            r2 = r9
            goto L_0x01a9
        L_0x017b:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x017b }
            goto L_0x01a6
        L_0x017e:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x017e }
            goto L_0x01a6
        L_0x0181:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0181 }
            goto L_0x01a6
        L_0x0184:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0184 }
            goto L_0x01a6
        L_0x0187:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a0 }
            r3.<init>()     // Catch:{ all -> 0x02a0 }
            java.lang.String r1 = "these requests cannot be combined "
            r3.append(r1)     // Catch:{ all -> 0x02a0 }
            r3.append(r2)     // Catch:{ all -> 0x02a0 }
            java.lang.String r1 = " and "
            r3.append(r1)     // Catch:{ all -> 0x02a0 }
            r3.append(r0)     // Catch:{ all -> 0x02a0 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x02a0 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02a0 }
            r1.<init>(r0)     // Catch:{ all -> 0x02a0 }
        L_0x01a6:
            throw r1     // Catch:{ all -> 0x02a0 }
        L_0x01a7:
            r5 = -1
        L_0x01a9:
            X.3Cw r0 = new X.3Cw     // Catch:{ all -> 0x02a0 }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x02a0 }
            boolean r3 = r2.A02     // Catch:{ all -> 0x02a0 }
            if (r3 == 0) goto L_0x01d0
            X.2R1 r3 = r2.A03     // Catch:{ all -> 0x02a0 }
            X.2Qw r5 = r3.mode     // Catch:{ all -> 0x02a0 }
            X.2Qw r3 = X.C49542Qw.DOWNLOAD     // Catch:{ all -> 0x02a0 }
            if (r5 != r3) goto L_0x01c8
            android.os.Handler r3 = A00(r4)     // Catch:{ all -> 0x02a0 }
            r3.postAtFrontOfQueue(r0)     // Catch:{ all -> 0x02a0 }
        L_0x01c1:
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02a0 }
        L_0x01c5:
            monitor-enter(r1)     // Catch:{ all -> 0x02a0 }
            goto L_0x0285
        L_0x01c8:
            android.os.Handler r3 = A00(r4)     // Catch:{ all -> 0x02a0 }
            r3.postDelayed(r0, r7)     // Catch:{ all -> 0x02a0 }
            goto L_0x01c1
        L_0x01d0:
            X.1Hc r9 = r4.A05     // Catch:{ all -> 0x02a0 }
            boolean r3 = r9.A02()     // Catch:{ all -> 0x02a0 }
            if (r3 == 0) goto L_0x027a
            boolean r3 = r9.A01()     // Catch:{ all -> 0x02a0 }
            if (r3 != 0) goto L_0x027a
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0203
            android.os.Handler r3 = A00(r4)     // Catch:{ all -> 0x02a0 }
            r3.postDelayed(r0, r5)     // Catch:{ all -> 0x02a0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a0 }
            r4.<init>()     // Catch:{ all -> 0x02a0 }
            java.lang.String r3 = "ContactSyncRequestExecutor/delay/combine "
            r4.append(r3)     // Catch:{ all -> 0x02a0 }
            r4.append(r5)     // Catch:{ all -> 0x02a0 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x02a0 }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x02a0 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02a0 }
            long r3 = r3 + r5
            goto L_0x01c5
        L_0x0203:
            boolean r3 = r2.A02     // Catch:{ all -> 0x02a0 }
            if (r3 == 0) goto L_0x020a
            r5 = 0
            goto L_0x0214
        L_0x020a:
            int r3 = r2.A00     // Catch:{ all -> 0x02a0 }
            if (r3 != 0) goto L_0x021f
            X.1UU r3 = r4.A0D     // Catch:{ all -> 0x02a0 }
            long r5 = r3.A00()     // Catch:{ all -> 0x02a0 }
        L_0x0214:
            android.os.Handler r3 = A00(r4)     // Catch:{ all -> 0x02a0 }
            r3.postDelayed(r0, r5)     // Catch:{ all -> 0x02a0 }
            X.1UU r8 = r4.A0D     // Catch:{ all -> 0x02a0 }
            monitor-enter(r8)     // Catch:{ all -> 0x02a0 }
            goto L_0x0244
        L_0x021f:
            int r5 = r3 * 2
            r3 = 8
            int r3 = java.lang.Math.min(r5, r3)     // Catch:{ all -> 0x02a0 }
            r7 = 1
            long r7 = r7 << r3
            r5 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r5
            java.util.Random r3 = r4.A0W     // Catch:{ all -> 0x02a0 }
            long r5 = r3.nextLong()     // Catch:{ all -> 0x02a0 }
            long r5 = r5 % r7
            long r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x02a0 }
            long r7 = r7 + r5
            X.1UU r3 = r4.A0D     // Catch:{ all -> 0x02a0 }
            long r5 = r3.A00()     // Catch:{ all -> 0x02a0 }
            long r5 = java.lang.Math.max(r7, r5)     // Catch:{ all -> 0x02a0 }
            goto L_0x0214
        L_0x0244:
            java.util.LinkedList r7 = r8.A00     // Catch:{ all -> 0x029a }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x029a }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x029a }
            r7.addFirst(r3)     // Catch:{ all -> 0x029a }
            java.util.LinkedList r7 = r8.A00     // Catch:{ all -> 0x029a }
            int r4 = r7.size()     // Catch:{ all -> 0x029a }
            r3 = 10
            if (r4 != r3) goto L_0x025e
            r7.removeLast()     // Catch:{ all -> 0x029a }
        L_0x025e:
            monitor-exit(r8)     // Catch:{ all -> 0x02a0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a0 }
            r4.<init>()     // Catch:{ all -> 0x02a0 }
            java.lang.String r3 = "ContactSyncRequestExecutor/delay "
            r4.append(r3)     // Catch:{ all -> 0x02a0 }
            r4.append(r5)     // Catch:{ all -> 0x02a0 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x02a0 }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x02a0 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02a0 }
            long r3 = r3 + r5
            goto L_0x01c5
        L_0x027a:
            java.lang.String r3 = "ContactSyncRequestExecutor/freeze until connection returns"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x02a0 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02a0 }
            goto L_0x01c5
        L_0x0285:
            java.util.Set r5 = r1.A02     // Catch:{ all -> 0x029d }
            r5.add(r2)     // Catch:{ all -> 0x029d }
            java.util.Map r6 = r1.A01     // Catch:{ all -> 0x029d }
            X.2c8 r5 = new X.2c8     // Catch:{ all -> 0x029d }
            r5.<init>(r0, r3)     // Catch:{ all -> 0x029d }
            r6.put(r2, r5)     // Catch:{ all -> 0x029d }
            X.AnonymousClass1UT.A00(r1)     // Catch:{ all -> 0x029d }
            monitor-exit(r1)     // Catch:{ all -> 0x02a0 }
            monitor-exit(r10)     // Catch:{ all -> 0x02a0 }
            return
        L_0x029a:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x02a0 }
            goto L_0x029f
        L_0x029d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02a0 }
        L_0x029f:
            throw r0     // Catch:{ all -> 0x02a0 }
        L_0x02a0:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x02a0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1US.A03(X.1US, X.2re):void");
    }

    public void BvU() {
        this.A0P.execute(new C70563Bp(this, 36));
    }

    public AnonymousClass1US(C19880zA r4, AnonymousClass190 r5, AnonymousClass1KB r6, AnonymousClass11S r7, C23651Hc r8, C26271Rm r9, C26911Ty r10, AnonymousClass11E r11, AnonymousClass1M9 r12, C24791Lr r13, AnonymousClass1UO r14, C26861Tt r15, AnonymousClass1UR r16, C25161Nd r17, AnonymousClass11C r18, AnonymousClass11P r19, AnonymousClass118 r20, C219217x r21, AnonymousClass1UN r22, AnonymousClass1UZ r23, C18030ve r24, AnonymousClass1QO r25, AnonymousClass1CM r26, AnonymousClass10I r27, C26301Rp r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32) {
        this.A0I = r20;
        this.A0H = r19;
        this.A0M = r24;
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = r7;
        this.A0U = r29;
        this.A0Q = r28;
        this.A09 = r12;
        this.A0G = r18;
        this.A05 = r8;
        this.A0R = r30;
        this.A01 = r4;
        this.A0C = r16;
        this.A0J = r21;
        this.A0S = r31;
        this.A0T = r32;
        this.A0F = r17;
        this.A0N = r25;
        this.A07 = r10;
        this.A0O = r26;
        this.A08 = r11;
        this.A0B = r15;
        this.A0K = r22;
        this.A0L = r23;
        this.A0A = r14;
        this.A06 = r9;
        this.A0V = new C70563Bp(r13, 38);
        this.A0P = new C200710s(r27, false);
        this.A0E = new AnonymousClass1UT(r15);
        this.A0D = new AnonymousClass1UU();
    }
}
