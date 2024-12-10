package X;

import android.content.Intent;
import android.os.ConditionVariable;
import com.whatsapp.media.download.service.MediaDownloadService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.1hB  reason: invalid class name and case insensitive filesystem */
public class C32431hB {
    public static final C18180vt A0l = new C18180vt(1, 60, 200, false);
    public long A00;
    public Boolean A01 = null;
    public final ConditionVariable A02 = new ConditionVariable(true);
    public final AnonymousClass1KB A03;
    public final AnonymousClass11S A04;
    public final AnonymousClass1TJ A05 = new AnonymousClass1TJ();
    public final AnonymousClass11C A06;
    public final AnonymousClass118 A07;
    public final C24681Lg A08;
    public final C32331h1 A09;
    public final C18030ve A0A;
    public final C32031gW A0B;
    public final C32441hC A0C = new C32441hC(this);
    public final C25011Mn A0D;
    public final C24421Kg A0E;
    public final C32021gV A0F;
    public final AnonymousClass10I A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J = C221618v.A00(AnonymousClass168.class);
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final HashMap A0M = new HashMap();
    public final HashMap A0N = new HashMap();
    public final Set A0O = new HashSet();
    public final Executor A0P;
    public final Executor A0Q;
    public final AnonymousClass190 A0R;
    public final C32341h2 A0S;
    public final C218617r A0T;
    public final C25311Ns A0U;
    public final C25001Mm A0V;
    public final AnonymousClass11P A0W;
    public final AnonymousClass121 A0X;
    public final AnonymousClass1MZ A0Y;
    public final C32041gX A0Z;
    public final C32401h8 A0a;
    public final C32421hA A0b;
    public final C32411h9 A0c;
    public final C32351h3 A0d;
    public final C18010vc A0e;
    public final AnonymousClass1Nb A0f;
    public final C200710s A0g;
    public final AnonymousClass00H A0h;
    public final AnonymousClass00H A0i;
    public final AnonymousClass00H A0j;
    public final AnonymousClass00H A0k;

    public static void A04(C32431hB r3, AnonymousClass21V r4, int i, boolean z) {
        C32431hB r2 = r3;
        boolean A072 = A07(r3);
        AnonymousClass21V r32 = r4;
        int i2 = i;
        if (A072) {
            r2.A0g.execute(new AnonymousClass7RR(r2, r32, i2, 9, z));
        } else {
            A05(r2, r32, i, z, false);
        }
    }

    public void A0D(BC9 bc9, AnonymousClass21V r23, int i) {
        AnonymousClass21V r8 = r23;
        int i2 = i;
        C115295ti A092 = A09(bc9, r8, i2, -1, true, false);
        if (A092 != null) {
            C32411h9 r14 = this.A0c;
            int i3 = A092.A07;
            int i4 = A092.A0e.A05;
            AnonymousClass205 r2 = r8.A0v;
            r14.A04(r2.A00, i3, i2, i4, true, false);
            StringBuilder sb = new StringBuilder();
            sb.append("MediaDownloadManager/start manual download ");
            sb.append(r2);
            sb.append(", message.mediaHash=");
            sb.append(r8.A05);
            Log.i(sb.toString());
            if (A08(r8)) {
                if (AnonymousClass112.A0A()) {
                    if (C18020vd.A05(C18040vf.A02, this.A0A, 7218)) {
                        if (C22781De.A03()) {
                            this.A0G.CGF(new AnonymousClass7RA((Object) this, 31));
                        } else {
                            C123866Wd.A00(this.A07.A00, this.A06);
                        }
                        A02(this);
                    }
                }
                ((C139916ze) this.A0I.get()).A02(this.A07.A00, new Intent("com.whatsapp.media.download.service.MediaDownloadService.DOWNLOAD_STARTED"), MediaDownloadService.class);
                A02(this);
            }
            if (C22781De.A03()) {
                this.A0G.CGF(A092);
            } else {
                A092.run();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F(X.BC9 r10, X.C72283Li r11, X.C139666zF r12, X.AnonymousClass21V r13, java.lang.String r14, boolean r15) {
        /*
            r9 = this;
            r5 = r9
            java.util.HashMap r2 = r9.A0N
            monitor-enter(r2)
            java.lang.Object r0 = r2.get(r14)     // Catch:{ all -> 0x003d }
            X.3Li r0 = (X.C72283Li) r0     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x001d
            X.C123836Wa.A00(r14)     // Catch:{ all -> 0x003d }
            r2.put(r14, r11)     // Catch:{ all -> 0x003d }
            X.347 r0 = new X.347     // Catch:{ all -> 0x003d }
            r0.<init>(r9, r14)     // Catch:{ all -> 0x003d }
            r11.BB6(r0)     // Catch:{ all -> 0x003d }
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            r0 = 0
            return r0
        L_0x001d:
            X.C123836Wa.A00(r14)     // Catch:{ all -> 0x003d }
            r7 = r13
            if (r13 == 0) goto L_0x003a
            r6 = r12
            if (r12 == 0) goto L_0x003a
            X.5ti r0 = r9.A0A(r13)     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x003a
            X.3AZ r3 = new X.3AZ     // Catch:{ all -> 0x003d }
            r4 = r10
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x003d }
            java.util.concurrent.Executor r1 = r9.A0Q     // Catch:{ all -> 0x003d }
            X.1TJ r0 = r0.A0E     // Catch:{ all -> 0x003d }
            r0.A03(r3, r1)     // Catch:{ all -> 0x003d }
        L_0x003a:
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            r0 = 1
            return r0
        L_0x003d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32431hB.A0F(X.BC9, X.3Li, X.6zF, X.21V, java.lang.String, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r6.A01 != r3.A00) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r3.A01().A02 == null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C136996uk r17, X.C32431hB r18, X.C139666zF r19, X.AnonymousClass21V r20, boolean r21) {
        /*
            r1 = r20
            monitor-enter(r1)
            X.2rc r4 = r1.A02     // Catch:{ all -> 0x0130 }
            X.C17960vV.A07(r4)     // Catch:{ all -> 0x0130 }
            r3 = r17
            X.73o r9 = r3.A01()     // Catch:{ all -> 0x0130 }
            X.C17960vV.A07(r9)     // Catch:{ all -> 0x0130 }
            r2 = r18
            if (r21 == 0) goto L_0x001b
            boolean r0 = r9.A03()     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x00e1
        L_0x001b:
            java.io.File r5 = r3.A03()     // Catch:{ all -> 0x0130 }
            if (r5 == 0) goto L_0x00e1
            r4.A0G = r5     // Catch:{ all -> 0x0130 }
            boolean r0 = r1 instanceof X.C438421d     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x003d
            com.whatsapp.jid.UserJid r0 = r1.A0I()     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x003d
            boolean r0 = X.C42701yb.A01(r0)     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x003d
            X.C26511Sk.A0R(r5)     // Catch:{ all -> 0x0130 }
            long r5 = r5.length()     // Catch:{ all -> 0x0130 }
            r3.A0B(r5)     // Catch:{ all -> 0x0130 }
        L_0x003d:
            r6 = r19
            if (r21 == 0) goto L_0x0048
            int r5 = r6.A01     // Catch:{ all -> 0x0130 }
            int r0 = r3.A00     // Catch:{ all -> 0x0130 }
            r8 = 1
            if (r5 == r0) goto L_0x0049
        L_0x0048:
            r8 = 0
        L_0x0049:
            X.73o r0 = r3.A01()     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x0058
            X.73o r0 = r3.A01()     // Catch:{ all -> 0x0130 }
            java.io.File r0 = r0.A02     // Catch:{ all -> 0x0130 }
            r7 = 1
            if (r0 != 0) goto L_0x0059
        L_0x0058:
            r7 = 0
        L_0x0059:
            if (r21 == 0) goto L_0x00bf
            if (r8 != 0) goto L_0x00bf
            if (r7 != 0) goto L_0x00bf
            boolean r10 = r6.A0Z     // Catch:{ all -> 0x0130 }
            java.lang.Integer r14 = r6.A0E     // Catch:{ all -> 0x0130 }
            boolean r8 = r6.A0V     // Catch:{ all -> 0x0130 }
            boolean r7 = r6.A0c     // Catch:{ all -> 0x0130 }
            X.1So r13 = r6.A0A     // Catch:{ all -> 0x0130 }
            int r5 = r6.A04     // Catch:{ all -> 0x0130 }
            int r0 = r6.A01     // Catch:{ all -> 0x0130 }
            java.lang.String r15 = r6.A0K     // Catch:{ all -> 0x0130 }
            java.lang.String r9 = r9.A03     // Catch:{ all -> 0x0130 }
            java.lang.String r11 = r6.A0L     // Catch:{ all -> 0x0130 }
            if (r9 != 0) goto L_0x007e
            if (r11 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r9 = 0
            goto L_0x007e
        L_0x007a:
            java.lang.String r9 = X.C64062u9.A09(r11)     // Catch:{ all -> 0x0130 }
        L_0x007e:
            X.17r r11 = r2.A0T     // Catch:{ all -> 0x0130 }
            X.0vc r12 = r2.A0e     // Catch:{ all -> 0x0130 }
            r20 = r8
            r21 = r7
            r19 = r10
            r18 = r0
            r17 = r5
            r16 = r9
            java.io.File r0 = X.C26511Sk.A0F(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0130 }
            r4.A0G = r0     // Catch:{ all -> 0x0130 }
            r0.getAbsolutePath()     // Catch:{ all -> 0x0130 }
            java.io.File r3 = r3.A03()     // Catch:{ IOException -> 0x00a1 }
            java.io.File r0 = r4.A0G     // Catch:{ IOException -> 0x00a1 }
            r11.A0i(r3, r0)     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00e1
        L_0x00a1:
            r5 = move-exception
            r0 = 0
            r4.A0V = r0     // Catch:{ all -> 0x0130 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0130 }
            r3.<init>()     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = "MediaDownload/applyDownloadDataInWorkerThread/MMS download failed to copy file to duplicate download; mediaHash = "
            r3.append(r0)     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = r6.A0H     // Catch:{ all -> 0x0130 }
            r3.append(r0)     // Catch:{ all -> 0x0130 }
            r3.append(r5)     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0130 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0130 }
            goto L_0x00e1
        L_0x00bf:
            java.io.File r0 = r3.A03()     // Catch:{ all -> 0x0130 }
            r0.getAbsolutePath()     // Catch:{ all -> 0x0130 }
            java.io.File r0 = r3.A03()     // Catch:{ all -> 0x0130 }
            r4.A0G = r0     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x00d5
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0130 }
            r0.setLastModified(r5)     // Catch:{ all -> 0x0130 }
        L_0x00d5:
            if (r8 != 0) goto L_0x00d9
            if (r7 == 0) goto L_0x00e1
        L_0x00d9:
            X.1Ns r5 = r2.A0U     // Catch:{ all -> 0x0130 }
            java.io.File r3 = r4.A0G     // Catch:{ all -> 0x0130 }
            r0 = 1
            r5.A06(r3, r0, r0)     // Catch:{ all -> 0x0130 }
        L_0x00e1:
            java.util.Set r3 = r2.A0O     // Catch:{ all -> 0x0130 }
            monitor-enter(r3)     // Catch:{ all -> 0x0130 }
            X.205 r0 = r1.A0v     // Catch:{ all -> 0x012d }
            boolean r0 = r3.remove(r0)     // Catch:{ all -> 0x012d }
            monitor-exit(r3)     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x00fb
            java.io.File r4 = r4.A0G     // Catch:{ all -> 0x0130 }
            if (r4 == 0) goto L_0x00fb
            X.1Ns r3 = r2.A0U     // Catch:{ all -> 0x0130 }
            int r5 = r1.A0u     // Catch:{ all -> 0x0130 }
            r6 = 1
            r8 = 0
            r7 = r6
            r3.A05(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0130 }
        L_0x00fb:
            boolean r0 = r1 instanceof X.C441322g     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x012b
            r4 = r1
            X.22g r4 = (X.C441322g) r4     // Catch:{ all -> 0x0130 }
            X.00H r0 = r2.A0j     // Catch:{ all -> 0x0130 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0130 }
            X.70H r0 = (X.AnonymousClass70H) r0     // Catch:{ all -> 0x0130 }
            X.77d r0 = r0.A01(r4)     // Catch:{ all -> 0x0130 }
            X.73B r0 = r0.A04     // Catch:{ all -> 0x0130 }
            r4.A05 = r0     // Catch:{ all -> 0x0130 }
            X.0ve r3 = r2.A0A     // Catch:{ all -> 0x0130 }
            r0 = 0
            X.C18070vi.A0d(r3, r0)     // Catch:{ all -> 0x0130 }
            r0 = 12434(0x3092, float:1.7424E-41)
            boolean r0 = X.C25291Nq.A04(r3, r0)     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x012b
            X.00H r0 = r2.A0h     // Catch:{ all -> 0x0130 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0130 }
            X.17l r0 = (X.C218017l) r0     // Catch:{ all -> 0x0130 }
            r0.CQy(r4)     // Catch:{ all -> 0x0130 }
        L_0x012b:
            monitor-exit(r1)     // Catch:{ all -> 0x0130 }
            return
        L_0x012d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x012d }
            throw r0     // Catch:{ all -> 0x0130 }
        L_0x0130:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0130 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32431hB.A00(X.6uk, X.1hB, X.6zF, X.21V, boolean):void");
    }

    public static void A01(C136996uk r6, C32431hB r7, AnonymousClass21V r8, boolean z) {
        Boolean bool;
        boolean z2;
        String str;
        String str2;
        byte[] bArr;
        Integer num;
        Integer num2;
        Long l;
        String str3;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        String str4;
        Long l2;
        Integer num9;
        Integer num10;
        byte[] bArr2;
        String str5;
        Boolean bool2;
        C62572rc r2 = r8.A02;
        C17960vV.A07(r2);
        C1409173o A012 = r6.A01();
        C17960vV.A07(A012);
        r2.A0f = false;
        r2.A0e = false;
        r2.A0d = false;
        r2.A0c = false;
        synchronized (r6) {
            bool = r6.A02;
        }
        if (bool != null) {
            synchronized (r6) {
                bool2 = r6.A02;
            }
            r2.A0Q = bool2.booleanValue();
        }
        if (r6.A04() != null) {
            r2.A0V = r6.A04().booleanValue();
        }
        synchronized (r6) {
            z2 = r6.A0H;
        }
        if (z2) {
            if (r8.A17() != null) {
                r8.A17().A01();
            }
            r2.A0O = null;
            r2.A0N = null;
        }
        r2.A07 = r6.A00();
        synchronized (r6) {
            str = r6.A0C;
        }
        r2.A0I = str;
        synchronized (r6) {
            str2 = r6.A0D;
        }
        if (str2 != null) {
            synchronized (r6) {
                str5 = r6.A0D;
            }
            r2.A0L = str5;
        }
        synchronized (r6) {
            bArr = r6.A0I;
        }
        if (bArr != null) {
            C441322g r4 = (C441322g) r8;
            AnonymousClass70H r3 = (AnonymousClass70H) r7.A0j.get();
            synchronized (r6) {
                bArr2 = r6.A0I;
            }
            r4.A05 = r3.A04(r8.A06, bArr2);
        }
        synchronized (r6) {
            num = r6.A07;
        }
        if (num != null) {
            synchronized (r6) {
                num10 = r6.A07;
            }
            r2.A02 = num10.intValue();
        }
        synchronized (r6) {
            num2 = r6.A08;
        }
        if (num2 != null) {
            synchronized (r6) {
                num9 = r6.A08;
            }
            r2.A03 = num9.intValue();
        }
        synchronized (r6) {
            l = r6.A0B;
        }
        if (l != null) {
            synchronized (r6) {
                l2 = r6.A0B;
            }
            r2.A09 = l2.longValue();
        }
        synchronized (r6) {
            str3 = r6.A0E;
        }
        if (str3 != null) {
            synchronized (r6) {
                str4 = r6.A0E;
            }
            r2.A0J = str4;
        }
        synchronized (r6) {
            num3 = r6.A05;
        }
        if (num3 != null) {
            synchronized (r6) {
                num8 = r6.A05;
            }
            r2.A01 = num8.intValue();
        }
        if (!z || A012.A03()) {
            synchronized (r6) {
                num4 = r6.A0A;
            }
            if (num4 != null) {
                synchronized (r6) {
                    num7 = r6.A0A;
                }
                r2.A08 = num7.intValue();
            }
            synchronized (r6) {
                num5 = r6.A09;
            }
            if (num5 != null) {
                synchronized (r6) {
                    num6 = r6.A09;
                }
                r2.A06 = num6.intValue();
            }
            if (r6.A05() != null) {
                r2.A0A = r6.A05().longValue();
            }
            if (r8.A0O() != null && r6.A0G() != null) {
                r8.A0p(r6.A0G());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r1 == false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C32431hB r8, X.AnonymousClass21V r9) {
        /*
            X.2rc r0 = r9.A02
            X.C17960vV.A07(r0)
            X.00H r0 = r8.A0J
            java.lang.Object r1 = r0.get()
            X.168 r1 = (X.AnonymousClass168) r1
            X.2rc r0 = r9.A02
            X.5ti r1 = r1.A00(r0)
            if (r1 == 0) goto L_0x00b8
            X.1hA r7 = r8.A0b
            boolean r0 = r7.A02(r9)
            if (r0 == 0) goto L_0x00b8
            r0 = 1
            r1.A16 = r0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.1hC r5 = r8.A0C
            monitor-enter(r5)
            android.os.ConditionVariable r0 = r8.A02     // Catch:{ all -> 0x00b5 }
            r0.close()     // Catch:{ all -> 0x00b5 }
            java.util.ArrayList r0 = r8.A0B()     // Catch:{ all -> 0x00b5 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x00b5 }
        L_0x0035:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0064
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x00b5 }
            X.21V r3 = (X.AnonymousClass21V) r3     // Catch:{ all -> 0x00b5 }
            X.2rc r0 = r3.A02     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0035
            X.2KB r2 = r7.A01(r3)     // Catch:{ all -> 0x00b5 }
            monitor-enter(r2)     // Catch:{ all -> 0x00b5 }
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x0061 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0061 }
            X.3Cx r0 = (X.C70893Cx) r0     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0059
            boolean r1 = r0.A03     // Catch:{ all -> 0x0061 }
            r0 = 1
            if (r1 != 0) goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            monitor-exit(r2)     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0035
            r6.add(r3)     // Catch:{ all -> 0x00b5 }
            goto L_0x0035
        L_0x0061:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b5 }
            throw r0     // Catch:{ all -> 0x00b5 }
        L_0x0064:
            monitor-exit(r5)     // Catch:{ all -> 0x00b5 }
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x00a4
            java.util.Iterator r5 = r6.iterator()
        L_0x006f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r4 = r5.next()
            X.21V r4 = (X.AnonymousClass21V) r4
            X.5ti r3 = r8.A0A(r4)
            if (r3 == 0) goto L_0x006f
            boolean r0 = r3.A16
            if (r0 != 0) goto L_0x006f
            int r1 = r3.A15
            r0 = 1
            if (r1 == r0) goto L_0x008f
            int r1 = r3.A15
            r0 = 2
            if (r1 != r0) goto L_0x006f
        L_0x008f:
            java.util.HashMap r2 = r8.A0M
            monitor-enter(r2)
            long r0 = r3.A08     // Catch:{ all -> 0x00a1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            r2.put(r4, r0)     // Catch:{ all -> 0x00a1 }
            monitor-exit(r2)     // Catch:{ all -> 0x00a1 }
            r0 = 0
            A06(r8, r4, r0, r0, r0)
            goto L_0x006f
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a1 }
            throw r0
        L_0x00a4:
            X.2rc r3 = r9.A02
            if (r3 == 0) goto L_0x00b8
            X.10I r2 = r8.A0G
            r1 = 34
            X.7Qr r0 = new X.7Qr
            r0.<init>(r8, r3, r1)
            r2.CGF(r0)
            return
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b5 }
            throw r0
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32431hB.A03(X.1hB, X.21V):void");
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.206] */
    /* JADX WARNING: type inference failed for: r0v18, types: [X.206] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r8 == 24) goto L_0x0049;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.C32431hB r6, X.AnonymousClass21V r7, int r8, boolean r9, boolean r10) {
        /*
            if (r9 == 0) goto L_0x004d
            boolean r0 = X.A3I.A02(r7)
            if (r0 == 0) goto L_0x001d
            X.1Mm r5 = r6.A0V
            long r2 = r7.A0x
            long r0 = r7.A0y
            com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob r4 = new com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob
            r4.<init>(r2, r0)
            r5.A01(r4)
            X.1KB r1 = r6.A03
            r0 = 20
            r6.A0C(r1, r7, r0)
        L_0x001d:
            boolean r0 = X.C20120A8f.A06(r7)
            if (r0 == 0) goto L_0x003e
            boolean r0 = X.C22781De.A03()
            if (r0 != 0) goto L_0x004e
            if (r10 == 0) goto L_0x004e
            X.00H r0 = r6.A0H
            java.lang.Object r0 = r0.get()
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            X.205 r1 = r7.A0v
            X.1W2 r0 = r0.A01
            X.206 r0 = r0.A05(r1)
        L_0x003b:
            if (r0 == 0) goto L_0x003e
            r7 = r0
        L_0x003e:
            X.121 r2 = r6.A0X
            r0 = 13
            if (r8 == r0) goto L_0x0049
            r1 = 24
            r0 = 3
            if (r8 != r1) goto L_0x004a
        L_0x0049:
            r0 = -1
        L_0x004a:
            r2.CQx(r7, r0)
        L_0x004d:
            return
        L_0x004e:
            X.205 r1 = r7.A0v
            X.00H r0 = r6.A0H     // Catch:{ all -> 0x005f }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x005f }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x005f }
            X.1W2 r0 = r0.A01     // Catch:{ all -> 0x005f }
            X.206 r0 = r0.A05(r1)     // Catch:{ all -> 0x005f }
            goto L_0x003b
        L_0x005f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32431hB.A05(X.1hB, X.21V, int, boolean, boolean):void");
    }

    public static void A06(C32431hB r6, AnonymousClass21V r7, boolean z, boolean z2, boolean z3) {
        C72283Li r5;
        HashMap hashMap = r6.A0N;
        synchronized (hashMap) {
            r5 = (C72283Li) hashMap.get(r7.A05);
        }
        if (r5 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaDownloadManager/cancelDownload key=");
            sb.append(r7.A0v);
            sb.append(", message.mediaHash=");
            sb.append(r7.A05);
            sb.append(" cancel manually=");
            sb.append(z);
            Log.i(sb.toString());
            if (C18020vd.A05(C18040vf.A01, r6.A0A, 8520)) {
                C32401h8 r4 = r6.A0a;
                String str = r7.A08;
                if (str != null) {
                    r4.A07.CGF(new C146817Qs(30, str, r4));
                }
            }
            r5.BEU(z3);
        }
        if (r5 instanceof C115295ti) {
            ((C115295ti) r5).A0k.A0L = Boolean.valueOf(z);
        }
        C32421hA r3 = r6.A0b;
        if (C22781De.A03()) {
            r3.A03.CGF(new C146807Qr(r3, r7, 40));
        } else {
            r3.A01(r7).A08(r7);
        }
        if (z2) {
            Set set = r6.A0O;
            synchronized (set) {
                set.add(r7.A0v);
            }
        }
    }

    public static boolean A07(C32431hB r3) {
        Boolean bool = r3.A01;
        if (bool == null) {
            C18030ve r2 = r3.A0A;
            C18070vi.A0d(r2, 0);
            bool = Boolean.valueOf(C18020vd.A05(C18040vf.A02, r2, 10991));
            r3.A01 = bool;
        }
        return bool.booleanValue();
    }

    private boolean A08(AnonymousClass21V r7) {
        C18030ve r2 = this.A0A;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 1147) || ((!(r7 instanceof C438921i) && !(r7 instanceof AnonymousClass21Y)) || C22971Dz.A0a(r7.A0v.A00) || r7.A01 <= ((long) C18020vd.A00(r1, r2, 1148)) * 1048576)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [java.lang.Object, X.3D9] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0294, code lost:
        if (r0 != 12) goto L_0x0296;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02a4, code lost:
        if (r2.A16() == false) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0336, code lost:
        if (X.C20120A8f.A06(r2) == false) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01dc, code lost:
        if (r11.A02(r4) == false) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0229, code lost:
        if (((X.C441322g) r2).A1I() == false) goto L_0x022b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x028e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C115295ti A09(X.BC9 r66, X.AnonymousClass21V r67, int r68, long r69, boolean r71, boolean r72) {
        /*
            r65 = this;
            r2 = r67
            X.2rc r5 = r2.A02
            r17 = 0
            if (r5 != 0) goto L_0x0029
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS unable to download due to missing media data; message.key="
        L_0x000f:
            r1.append(r0)
            X.205 r0 = r2.A0v
            r1.append(r0)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r2.A05
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r17
        L_0x0029:
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x0039
            boolean r0 = r5.A0c
            if (r0 != 0) goto L_0x0039
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS download already completed; message.key="
            goto L_0x000f
        L_0x0039:
            r3 = r65
            X.00H r0 = r3.A0J
            r64 = r0
            java.lang.Object r0 = r64.get()
            X.168 r0 = (X.AnonymousClass168) r0
            X.5ti r4 = r0.A00(r5)
            boolean r0 = r5.A0f
            r1 = 0
            r8 = r66
            r10 = r68
            r61 = r72
            if (r0 == 0) goto L_0x0066
            if (r4 == 0) goto L_0x0066
            if (r72 != 0) goto L_0x005a
            r4.A05 = r1
        L_0x005a:
            int r0 = r4.A15
            if (r10 >= r0) goto L_0x012c
            r5.A0d = r1
            r4.A15 = r10
            X.70W r1 = r4.A0k
            monitor-enter(r1)
            goto L_0x0073
        L_0x0066:
            int r0 = r5.A07
            r1 = 1
            if (r0 != r1) goto L_0x00b7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS media has been marked suspicious; message.key="
            goto L_0x000f
        L_0x0073:
            r1.A00 = r10     // Catch:{ all -> 0x00b4 }
            monitor-exit(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS existing download upgraded to "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; message.key="
            r1.append(r0)
            X.205 r0 = r2.A0v
            r1.append(r0)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r2.A05
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1KB r1 = r3.A03
            r0 = -1
            r3.A0C(r1, r2, r0)
            if (r68 != 0) goto L_0x014c
            X.1hA r0 = r3.A0b
            boolean r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x014c
            if (r66 == 0) goto L_0x00b3
            r4.BB6(r8)
        L_0x00b3:
            return r4
        L_0x00b4:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00b7:
            java.lang.String r0 = r5.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = r2.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x014d
            X.205 r0 = r2.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 != 0) goto L_0x014d
        L_0x00d1:
            X.1BI r0 = r2.A0H()
            boolean r0 = X.C22971Dz.A0Z(r0)
            if (r0 != 0) goto L_0x014d
            X.0vt r0 = A0l
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0117
            X.190 r6 = r3.A0R
            java.lang.String r4 = "MediaDownloadManager/createMediaDownloadForFMessage"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "createMediaDownloadForFMessage/direct_path is "
            r7.append(r0)
            java.lang.String r0 = r5.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0129
            java.lang.String r0 = "null"
        L_0x00fb:
            r7.append(r0)
            java.lang.String r0 = " encHash is "
            r7.append(r0)
            java.lang.String r0 = r2.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0126
            java.lang.String r0 = "null"
        L_0x010d:
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r6.A0G(r4, r0, r1)
        L_0x0117:
            if (r66 == 0) goto L_0x014c
            java.util.concurrent.Executor r2 = r3.A0P
            r1 = 30
            X.7RA r0 = new X.7RA
            r0.<init>((java.lang.Object) r8, (int) r1)
            r2.execute(r0)
            return r17
        L_0x0126:
            java.lang.String r0 = "not null"
            goto L_0x010d
        L_0x0129:
            java.lang.String r0 = "not null"
            goto L_0x00fb
        L_0x012c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS download already in progress (according to media data); message.key="
            r1.append(r0)
            X.205 r0 = r2.A0v
            r1.append(r0)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r2.A05
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x014c:
            return r17
        L_0x014d:
            X.1KB r0 = r3.A03
            r63 = r0
            r16 = 31
            X.Aiu r1 = new X.Aiu
            r11 = r1
            r12 = r3
            r13 = r2
            r14 = r5
            r15 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            r0.CGP(r1)
            X.1hC r6 = r3.A0C
            monitor-enter(r6)
            X.205 r7 = r2.A0v     // Catch:{ all -> 0x044d }
            boolean r0 = r6.containsKey(r7)     // Catch:{ all -> 0x044d }
            r0 = r0 ^ 1
            monitor-exit(r6)     // Catch:{ all -> 0x044d }
            if (r0 == 0) goto L_0x0366
            X.1BI r15 = r7.A00
            if (r15 == 0) goto L_0x0366
            X.0ve r1 = r3.A0A
            X.17r r0 = r3.A0T
            r18 = r0
            X.00H r0 = r3.A0k
            java.lang.Object r11 = r0.get()
            X.6yx r11 = (X.C139506yx) r11
            X.00H r0 = r3.A0i
            java.lang.Object r9 = r0.get()
            X.2r5 r9 = (X.C62242r5) r9
            X.1Nb r0 = r3.A0f
            r33 = r0
            X.1h3 r13 = r3.A0d
            X.1gX r14 = r3.A0Z
            X.2rc r4 = r2.A02
            X.C17960vV.A07(r4)
            boolean r0 = X.C63652tT.A04(r2)
            if (r0 == 0) goto L_0x035a
            r41 = 3
        L_0x019d:
            boolean r47 = X.C22971Dz.A0a(r15)
            java.lang.String r0 = r4.A0L
            if (r0 != 0) goto L_0x01af
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r4.A0L = r0
        L_0x01af:
            int r12 = r4.A08
            int r1 = r4.A06
            X.6r5 r16 = new X.6r5
            r0 = r16
            r0.<init>(r12, r1)
            boolean r0 = X.C22971Dz.A0R(r15)
            if (r0 == 0) goto L_0x0356
            java.lang.String r1 = "gdpr.zip"
            java.lang.String r0 = r2.A19()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0346
            java.lang.Integer r25 = X.AnonymousClass00R.A01
        L_0x01ce:
            boolean r0 = r2 instanceof X.AnonymousClass215
            r62 = r0
            boolean r0 = r2 instanceof X.AnonymousClass21Y
            if (r0 == 0) goto L_0x01de
            boolean r0 = r11.A02(r4)
            r57 = 1
            if (r0 != 0) goto L_0x01e0
        L_0x01de:
            r57 = 0
        L_0x01e0:
            X.1So r21 = X.C63972u0.A02(r2)
            java.lang.String r1 = r2.A08
            java.lang.String r11 = r2.A05
            java.lang.String r0 = r2.A07
            r30 = r0
            r49 = 0
            r23 = r18
            r24 = r21
            r26 = r1
            r27 = r11
            r28 = r0
            r29 = r49
            java.io.File r24 = r23.A0M(r24, r25, r26, r27, r28, r29)
            r26 = r18
            r27 = r21
            r28 = r25
            r29 = r11
            r31 = r49
            r32 = r62
            java.io.File r23 = r26.A0N(r27, r28, r29, r30, r31, r32)
            boolean r56 = r4.A01()
            boolean r0 = X.AnonymousClass21V.A0A(r30)
            r42 = 0
            if (r0 == 0) goto L_0x021c
            r42 = 2
        L_0x021c:
            boolean r0 = r2 instanceof X.C441322g
            if (r0 == 0) goto L_0x022b
            r0 = r2
            X.22g r0 = (X.C441322g) r0
            boolean r0 = r0.A1I()
            r58 = 1
            if (r0 != 0) goto L_0x022d
        L_0x022b:
            r58 = 0
        L_0x022d:
            X.9gX r11 = r13.A00(r2)
            r59 = 0
            if (r11 == 0) goto L_0x0237
            r59 = 1
        L_0x0237:
            int r0 = r4.A04
            r37 = r0
            byte[] r0 = r4.A0X
            r35 = r0
            java.io.File r0 = r4.A0G
            r22 = r0
            long r0 = r2.A01
            r45 = r0
            int r0 = r2.A0D
            long r0 = (long) r0
            r54 = r0
            X.36v r0 = r2.A17()
            X.3D9 r12 = new X.3D9
            r12.<init>()
            r12.A01 = r0
            r12.A00 = r14
            java.lang.String r0 = r2.A05
            r20 = r0
            java.lang.String r28 = r2.A19()
            java.lang.String r0 = r4.A0L
            r19 = r0
            java.lang.String r0 = r2.A08
            r18 = r0
            java.lang.String r0 = r2.A06
            r14 = r0
            if (r59 == 0) goto L_0x0342
            java.lang.String r11 = r11.A05
        L_0x0270:
            int r13 = r2.A09
            r0 = r33
            int r39 = X.C26521Sl.A01(r2, r0)
            int r40 = r9.A01(r2)
            X.1BI r0 = r2.A0H()
            boolean r48 = X.C22971Dz.A0Z(r0)
            int r0 = r2.A0D()
            r1 = 11
            r50 = 1
            if (r0 == r1) goto L_0x0296
            r50 = 0
            r1 = 12
            r51 = 1
            if (r0 == r1) goto L_0x0298
        L_0x0296:
            r51 = 0
        L_0x0298:
            X.36u r0 = r2.A0O()
            if (r0 == 0) goto L_0x02a6
            boolean r0 = r2.A16()
            r52 = 1
            if (r0 != 0) goto L_0x02a8
        L_0x02a6:
            r52 = 0
        L_0x02a8:
            int r1 = r2.A0u
            r0 = 20
            if (r1 != r0) goto L_0x033e
            r0 = r2
            X.22g r0 = (X.C441322g) r0
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x02b9
            int r0 = r4.A04
            if (r0 <= 0) goto L_0x033e
        L_0x02b9:
            r53 = 1
        L_0x02bb:
            byte[] r1 = r4.A0a
            X.2rc r0 = r2.A02
            java.lang.String r0 = r0.A0O
            boolean r60 = r2.A0x()
            X.6zF r4 = new X.6zF
            r26 = r30
            r27 = r20
            r29 = r19
            r30 = r18
            r31 = r14
            r32 = r11
            r33 = r0
            r34 = r12
            r36 = r1
            r38 = r13
            r43 = r45
            r45 = r54
            r54 = r62
            r55 = r49
            r18 = r4
            r19 = r15
            r20 = r16
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            X.1h2 r1 = r3.A0S
            android.os.ConditionVariable r0 = r3.A02
            int r58 = X.A8F.A00(r15)
            r59 = r69
            r54 = r1
            r55 = r0
            r56 = r4
            r57 = r10
            X.5ti r9 = r54.A00(r55, r56, r57, r58, r59, r61)
            X.1MZ r0 = r3.A0Y
            java.util.HashSet r0 = r0.A08(r15)
            int r0 = r0.size()
            X.70W r10 = r9.A0k
            r10.A01 = r0
            long r0 = r2.A0G
            r10.A0E = r0
            java.lang.String r0 = r7.A01
            r10.A0Y = r0
            boolean r11 = X.C22971Dz.A0R(r15)
            int r10 = r2.A0E()
            r1 = 2
            r0 = 0
            if (r10 != r1) goto L_0x0325
            r0 = 1
        L_0x0325:
            if (r11 != 0) goto L_0x0338
            if (r0 != 0) goto L_0x0338
            long r0 = r2.A0x
            r11 = -1
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0338
            boolean r1 = X.C20120A8f.A06(r2)
            r0 = 0
            if (r1 == 0) goto L_0x0339
        L_0x0338:
            r0 = 1
        L_0x0339:
            X.C17960vV.A0D(r0)
        L_0x033c:
            monitor-enter(r6)
            goto L_0x036a
        L_0x033e:
            r53 = 0
            goto L_0x02bb
        L_0x0342:
            java.lang.String r11 = r4.A0J
            goto L_0x0270
        L_0x0346:
            java.lang.String r1 = "channels_gdpr.zip"
            java.lang.String r0 = r2.A19()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0356
            java.lang.Integer r25 = X.AnonymousClass00R.A0C
            goto L_0x01ce
        L_0x0356:
            r25 = 0
            goto L_0x01ce
        L_0x035a:
            boolean r0 = X.AnonymousClass72Z.A01(r1, r2)
            r41 = 1
            if (r0 == 0) goto L_0x019d
            r41 = 2
            goto L_0x019d
        L_0x0366:
            r9 = r17
            r4 = r9
            goto L_0x033c
        L_0x036a:
            boolean r0 = r6.containsKey(r7)     // Catch:{ all -> 0x044a }
            if (r0 != 0) goto L_0x0386
            if (r9 == 0) goto L_0x0386
            r6.put(r7, r2)     // Catch:{ all -> 0x044a }
            java.lang.Object r0 = r64.get()     // Catch:{ all -> 0x044a }
            X.168 r0 = (X.AnonymousClass168) r0     // Catch:{ all -> 0x044a }
            java.util.HashMap r1 = r0.A00     // Catch:{ all -> 0x044a }
            monitor-enter(r1)     // Catch:{ all -> 0x044a }
            r1.put(r5, r9)     // Catch:{ all -> 0x0383 }
            monitor-exit(r1)     // Catch:{ all -> 0x0383 }
            goto L_0x0389
        L_0x0383:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0383 }
            throw r0     // Catch:{ all -> 0x044a }
        L_0x0386:
            r9 = r17
            r4 = r9
        L_0x0389:
            monitor-exit(r6)     // Catch:{ all -> 0x044a }
            r5 = r71
            if (r71 == 0) goto L_0x0394
            r1 = -1
            r0 = r63
            r3.A0C(r0, r2, r1)
        L_0x0394:
            java.lang.String r0 = r2.A05
            if (r9 == 0) goto L_0x0449
            if (r0 == 0) goto L_0x0425
            r10 = r3
            r11 = r8
            r12 = r9
            r13 = r4
            r14 = r2
            r15 = r0
            r16 = r5
            boolean r0 = r10.A0F(r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x03c7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS existing download with hash for message.key="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r2.A05
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r17
        L_0x03c7:
            if (r66 == 0) goto L_0x03cc
            r9.BB6(r8)
        L_0x03cc:
            r0 = 17
            X.7Nc r1 = new X.7Nc
            r1.<init>(r2, r0)
            java.util.concurrent.Executor r7 = r3.A0P
            X.1TJ r0 = r9.A0K
            r0.A03(r1, r7)
            r0 = 14
            X.7Ne r1 = new X.7Ne
            r1.<init>(r2, r3, r0)
            X.1TJ r0 = r9.A0I
            r0.A03(r1, r7)
            if (r71 == 0) goto L_0x0401
            r0 = 5
            X.Af1 r6 = new X.Af1
            r6.<init>(r2, r3, r0)
            java.util.concurrent.Executor r1 = r3.A0Q
            X.1TJ r0 = r9.A0G
            r0.A03(r6, r1)
            r0 = 10
            X.3AW r1 = new X.3AW
            r1.<init>(r4, r3, r2, r0)
            X.1TJ r0 = r9.A0J
            r0.A03(r1, r7)
        L_0x0401:
            r0 = 15
            X.7Ne r1 = new X.7Ne
            r1.<init>(r2, r3, r0)
            X.1TJ r0 = r9.A0F
            r0.A03(r1, r7)
            X.3AX r1 = new X.3AX
            r1.<init>(r3, r4, r2, r5)
            java.util.concurrent.Executor r4 = r3.A0Q
            X.1TJ r0 = r9.A0E
            r0.A03(r1, r4)
            r0 = 13
            X.7Ne r1 = new X.7Ne
            r1.<init>(r2, r3, r0)
            X.1TJ r0 = r9.A0H
            r0.A03(r1, r4)
        L_0x0425:
            java.lang.String r0 = r2.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0449
            X.0ve r2 = r3.A0A
            X.0vf r1 = X.C18040vf.A01
            r0 = 8520(0x2148, float:1.1939E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0449
            X.1h8 r1 = r3.A0a
            r0 = 17
            X.7Ne r2 = new X.7Ne
            r2.<init>(r9, r1, r0)
            java.util.concurrent.Executor r1 = r1.A09
            X.1TJ r0 = r9.A0E
            r0.A03(r2, r1)
        L_0x0449:
            return r9
        L_0x044a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x044a }
            throw r0
        L_0x044d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x044d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32431hB.A09(X.BC9, X.21V, int, long, boolean, boolean):X.5ti");
    }

    public C115295ti A0A(AnonymousClass21V r4) {
        C72283Li r1;
        HashMap hashMap = this.A0N;
        synchronized (hashMap) {
            r1 = (C72283Li) hashMap.get(r4.A05);
        }
        if (r1 instanceof C115295ti) {
            return (C115295ti) r1;
        }
        return null;
    }

    public ArrayList A0B() {
        ArrayList arrayList;
        C32441hC r2 = this.A0C;
        synchronized (r2) {
            arrayList = new ArrayList(r2.values());
        }
        return arrayList;
    }

    public void A0C(AnonymousClass1KB r3, AnonymousClass21V r4, int i) {
        r3.CGP(new C70863Cu(this, i, 15, r4));
    }

    public void A0E(BC9 bc9, AnonymousClass21V r19, int i, long j, boolean z, boolean z2) {
        long j2;
        AnonymousClass21V r8 = r19;
        int i2 = i;
        C115295ti A092 = A09(bc9, r8, i2, j, z, z2);
        if (A092 != null) {
            C32411h9 r10 = this.A0c;
            int i3 = A092.A07;
            int i4 = A092.A0e.A05;
            AnonymousClass205 r2 = r8.A0v;
            r10.A04(r2.A00, i3, i2, i4, false, false);
            r10.A03(i3, AnonymousClass00R.A0C);
            StringBuilder sb = new StringBuilder();
            sb.append("MediaDownloadManager/queueDownload auto download ");
            sb.append(r2);
            sb.append(", message.mediaHash=");
            sb.append(r8.A05);
            Log.i(sb.toString());
            boolean A0w = r8.A0w();
            C32421hA r6 = this.A0b;
            if (A0w) {
                if (AnonymousClass1c4.A00((AnonymousClass1c4) r6.A04.get(), 3)) {
                    j2 = (long) C50292Tw.A00(r6.A01, r6.A02, r8);
                } else {
                    j2 = 0;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MediaDownloadPriorityQueueManager/queueDownload queue newsletter with delay ");
                sb2.append(j2);
                sb2.append(" ms");
                Log.i(sb2.toString());
                r6.A00.postDelayed(new AnonymousClass7R0(r6, r8, A092, 26), j2);
                return;
            }
            r6.A00().A04(A092, r8);
        }
    }

    public C32431hB(AnonymousClass190 r5, C32341h2 r6, C218617r r7, AnonymousClass1KB r8, AnonymousClass11S r9, C25311Ns r10, C25001Mm r11, AnonymousClass11C r12, AnonymousClass11P r13, AnonymousClass118 r14, AnonymousClass121 r15, AnonymousClass1MZ r16, C24681Lg r17, C32331h1 r18, C18030ve r19, C32041gX r20, C32031gW r21, C32401h8 r22, C32421hA r23, C32411h9 r24, C32351h3 r25, C25011Mn r26, C18010vc r27, C24421Kg r28, AnonymousClass1Nb r29, C32021gV r30, AnonymousClass10I r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38, AnonymousClass00H r39) {
        this.A0W = r13;
        this.A0A = r19;
        this.A03 = r8;
        this.A04 = r9;
        this.A0R = r5;
        this.A07 = r14;
        AnonymousClass10I r3 = r31;
        this.A0G = r3;
        this.A0T = r7;
        this.A0D = r26;
        this.A0k = r32;
        this.A0V = r11;
        this.A0E = r28;
        this.A0i = r33;
        this.A0H = r34;
        this.A0X = r15;
        this.A0I = r35;
        this.A08 = r17;
        this.A0f = r29;
        this.A0j = r36;
        this.A0F = r30;
        this.A09 = r18;
        this.A0S = r6;
        this.A0L = r37;
        this.A0Y = r16;
        this.A0e = r27;
        this.A0K = r38;
        this.A0a = r22;
        this.A0B = r21;
        this.A0U = r10;
        this.A0Z = r20;
        this.A0d = r25;
        this.A0c = r24;
        this.A0b = r23;
        C18070vi.A0d(r8, 0);
        this.A0P = new AnonymousClass3DL(r8, 3);
        C18070vi.A0d(r3, 0);
        this.A0Q = new AnonymousClass3DL(r3, 2);
        this.A06 = r12;
        this.A0h = r39;
        this.A0g = new C200710s(r3, false);
    }

    public static void A02(C32431hB r4) {
        ArrayList A0B2 = r4.A0B();
        ArrayList arrayList = new ArrayList();
        Iterator it = A0B2.iterator();
        while (it.hasNext()) {
            AnonymousClass21V r1 = (AnonymousClass21V) it.next();
            if (r4.A08(r1)) {
                arrayList.add(r1);
            }
        }
        r4.A05.A04(arrayList);
    }
}
