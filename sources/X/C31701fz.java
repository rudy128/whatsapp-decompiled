package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1fz  reason: invalid class name and case insensitive filesystem */
public class C31701fz extends HandlerThread {
    public long A00;
    public C62662rl A01;
    public AnonymousClass26z A02;
    public C31801g9 A03;
    public C31871gG A04;
    public C31841gD A05;
    public C59412mG A06;
    public C63342su A07;
    public C62642rj A08;
    public final C19880zA A09;
    public final AnonymousClass195 A0A;
    public final C22701Cw A0B;
    public final C31361fR A0C;
    public final AnonymousClass190 A0D;
    public final C31691fy A0E;
    public final AnonymousClass11S A0F;
    public final AnonymousClass120 A0G;
    public final AnonymousClass194 A0H;
    public final AnonymousClass18O A0I;
    public final AnonymousClass181 A0J;
    public final C31451fa A0K;
    public final AnonymousClass1HS A0L;
    public final C31301fL A0M;
    public final C22871Dn A0N;
    public final AnonymousClass11P A0O;
    public final AnonymousClass118 A0P;
    public final C24521Kq A0Q;
    public final C19830z4 A0R;
    public final AnonymousClass11O A0S;
    public final AnonymousClass1CJ A0T;
    public final AnonymousClass122 A0U;
    public final AnonymousClass1Cd A0V;
    public final C22631Cp A0W;
    public final C18030ve A0X;
    public final AnonymousClass188 A0Y;
    public final AnonymousClass18K A0Z;
    public final AnonymousClass126 A0a;
    public final C31351fQ A0b;
    public final C31401fV A0c;
    public final C31281fJ A0d;
    public final C31601fp A0e;
    public final C29871d0 A0f;
    public final C31271fI A0g;
    public final C31641ft A0h;
    public final C29861cz A0i = new C29861cz("connection_thread/logged_flag/connected", false);
    public final C29861cz A0j = new C29861cz("connection_thread/logged_flag/disconnecting", false);
    public final C29861cz A0k = new C29861cz("connection_thread/logged_flag/quit", false);
    public final AnonymousClass1OZ A0l;
    public final C29791cs A0m;
    public final C31681fx A0n;
    public final AnonymousClass1O4 A0o;
    public final C31291fK A0p;
    public final C31431fY A0q;
    public final AnonymousClass1N7 A0r;
    public final C31441fZ A0s;
    public final AnonymousClass1PT A0t;
    public final C31411fW A0u;
    public final C31331fO A0v;
    public final C31251fG A0w;
    public final C31061ex A0x;
    public final C31661fv A0y;
    public final C31611fq A0z;
    public final C31371fS A10;
    public final C31621fr A11;
    public final C31631fs A12;
    public final C31311fM A13;
    public final C22881Do A14;
    public final AnonymousClass1CM A15;
    public final C31321fN A16;
    public final C31461fb A17;
    public final AnonymousClass1W6 A18;
    public final C25431Oe A19;
    public final AnonymousClass10I A1A;
    public final AnonymousClass1O1 A1B;
    public final C29971dB A1C;
    public final AnonymousClass00H A1D;
    public final AnonymousClass00H A1E;
    public final Map A1F = new HashMap(0);
    public final Random A1G;
    public final Set A1H;
    public final AtomicBoolean A1I = new AtomicBoolean();

    public static int A00(int i, int i2) {
        return i2 != -1 ? i2 : i;
    }

    public static Message A01() {
        return Message.obtain((Handler) null, 0, 24, 0);
    }

    public static Message A02() {
        return Message.obtain((Handler) null, 0, 22, 0);
    }

    public static Message A03() {
        return Message.obtain((Handler) null, 0, 0, 0);
    }

    public static Message A04() {
        return Message.obtain((Handler) null, 0, 23, 0);
    }

    public static Message A05(List list) {
        return Message.obtain((Handler) null, 0, 406, 0, list);
    }

    private void A0I() {
        A15(false);
    }

    public static final void A0f(AnonymousClass188 r2, String str) {
        C18070vi.A0d(r2, 0);
        r2.CHx(str, 2795, 0);
        r2.CHx(str, 2795, 1);
    }

    private void A0x(AnonymousClass2BY r10, C30971eo r11, C62642rj r12, C62652rk r13, AtomicReference atomicReference, AtomicReference atomicReference2) {
        C31281fJ r1;
        int i;
        try {
            C31281fJ r14 = this.A0d;
            r14.A07(r13);
            A0y(r10, r11, r12, atomicReference, atomicReference2);
            this.A0R.A13();
            r14.A06(r13);
        } catch (AnonymousClass1UI e) {
            e = e;
            r1 = this.A0d;
            i = 7;
            r1.A0D(r13, e, i);
            throw e;
        } catch (IOException e2) {
            e = e2;
            r1 = this.A0d;
            i = 8;
            r1.A0D(r13, e, i);
            throw e;
        } catch (C31711g0 e3) {
            e = e3;
            r1 = this.A0d;
            i = 9;
            r1.A0D(r13, e, i);
            throw e;
        }
    }

    private C54962ez A07(C61692q6 r19, int i) {
        C61692q6 r4 = r19;
        int i2 = r4.A01;
        C53412cU r7 = r4.A03;
        String str = null;
        int i3 = i;
        C62652rk r6 = new C62652rk(r7, (String) null, 0, i2, i3);
        try {
            C31281fJ r5 = this.A0d;
            r5.A09(r6);
            C62662rl A022 = this.A0e.A02(r4);
            this.A01 = A022;
            InetAddress A012 = A022.A01();
            if (A012 != null) {
                str = A012.getHostAddress();
            }
            this.A01.A05(30000);
            A0J();
            int nextInt = this.A1G.nextInt();
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectionThread/tryOpenSocket: socket connected; sessionId=");
            sb.append(nextInt);
            Log.i(sb.toString());
            ((C30181dW) this.A1E.get()).A00();
            C62652rk r12 = new C62652rk(r7, str, nextInt, r4.A01, i3);
            AnonymousClass00H r2 = this.A1D;
            ((C20003A2s) r2.get()).A05(r12);
            try {
                InputStream A002 = C31601fp.A00(this.A01, r4);
                AnonymousClass181 r8 = this.A0J;
                C170608qI r62 = new C170608qI(r8, (C20003A2s) r2.get(), A002, 1);
                C170618qJ r22 = new C170618qJ(r8, (C20003A2s) r2.get(), C31601fp.A01(this.A01, r4), 1);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ConnectionThread/tryOpenSocket: created IO streams; sessionId=");
                sb2.append(nextInt);
                Log.i(sb2.toString());
                r5.A08(r12);
                return new C54962ez(r4, r12, r62, r22);
            } catch (IOException e) {
                r5.A0B(r12, e, 3);
                throw e;
            }
        } catch (SocketException e2) {
            this.A0d.A0B(r6, e2, 2);
            throw e2;
        } catch (IOException e3) {
            this.A0d.A0B(r6, e3, 3);
            throw e3;
        }
    }

    private C61692q6 A0A(C63602tO r6, int i) {
        try {
            C31281fJ r4 = this.A0d;
            r4.A01(i);
            C61692q6 A032 = r6.A03();
            r4.A03(new C62652rk(A032.A03, A032.A01, i));
            return A032;
        } catch (UnknownHostException e) {
            this.A0d.A0E(e, i);
            throw e;
        }
    }

    private HashMap A0F(C54762ef r33, AnonymousClass37L r34, Map map) {
        HashMap hashMap = new HashMap();
        AnonymousClass37L r21 = r34;
        Map map2 = map;
        C59612mb r2 = new C59612mb(r33, r21, map2, this.A1F);
        for (C31471fc BHs : this.A1H) {
            A12(BHs.BHs(r2), hashMap);
        }
        AnonymousClass11P r15 = this.A0O;
        C18030ve r12 = this.A0X;
        AnonymousClass190 r11 = this.A0D;
        AnonymousClass18K r10 = this.A0Z;
        AnonymousClass1OZ r9 = this.A0l;
        C31411fW r8 = this.A0u;
        C31441fZ r7 = this.A0s;
        C31061ex r1 = this.A0x;
        C31641ft r6 = this.A0h;
        A12(new C48462Mo(r11, r15, r12, r10, r21, r6, r9, r7, r8, r1, map2), hashMap);
        AnonymousClass1PT r5 = this.A0t;
        AnonymousClass122 r4 = this.A0U;
        C19830z4 r3 = this.A0R;
        C31621fr r22 = this.A11;
        C31631fs r13 = this.A12;
        Map map3 = map2;
        AnonymousClass1OZ r24 = r9;
        C31441fZ r25 = r7;
        AnonymousClass37L r222 = r21;
        C31641ft r23 = r6;
        C18030ve r20 = r12;
        AnonymousClass18K r212 = r10;
        C19830z4 r18 = r3;
        AnonymousClass122 r19 = r4;
        AnonymousClass190 r16 = r11;
        AnonymousClass11P r17 = r15;
        A12(new C48452Mn(r16, r17, r18, r19, r20, r212, r222, r23, r24, r25, r5, r8, this.A0y, r22, r13, map3), hashMap);
        return hashMap;
    }

    private A7J A0H(AnonymousClass2BY r13, C62652rk r14, InputStream inputStream, OutputStream outputStream, C21523AlW alW, C21521AlU alU) {
        C31281fJ r1;
        int i;
        try {
            C31281fJ r2 = this.A0d;
            r2.A05(r14);
            A7J a7j = new A7J(this.A0O, this.A0Q, r13, this.A16, inputStream, outputStream, alW, alU);
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectionThread/performHandshake: completed noise handshake; sessionId=");
            sb.append(r14.A04);
            Log.i(sb.toString());
            r2.A04(r14);
            return a7j;
        } catch (C31721g1 e) {
            e = e;
            r1 = this.A0d;
            i = 4;
            r1.A0C(r14, e, i);
            throw e;
        } catch (IOException e2) {
            e = e2;
            r1 = this.A0d;
            i = 5;
            r1.A0C(r14, e, i);
            throw e;
        } catch (C31741g3 e3) {
            e = e3;
            r1 = this.A0d;
            i = 6;
            r1.A0C(r14, e, i);
            throw e;
        }
    }

    private void A0J() {
        String str;
        if (!this.A01.A0A()) {
            str = "ConnectionThread/configureTcpKeepalive: not supported";
        } else {
            C18030ve r2 = this.A0X;
            if (!r2.A0N(7831)) {
                str = "ConnectionThread/configureTcpKeepalive: not enabled";
            } else {
                try {
                    this.A01.A03();
                    this.A01.A06(r2.A0G(7832));
                    this.A01.A07(r2.A0G(7833));
                    this.A01.A08(r2.A0G(7834));
                } catch (Exception e) {
                    Log.e("ConnectionThread/configureTcpKeepalive: failed to set socket options", e);
                    this.A0D.A0E("setsockopt-tcp-keepalive", e.getMessage(), e);
                }
                str = "ConnectionThread/configureTcpKeepalive: set socket options";
            }
        }
        Log.i(str);
    }

    /* access modifiers changed from: private */
    public void A0K() {
        A0V(9, 0, true);
    }

    private void A0L() {
        this.A04.CHe(A02());
    }

    /* access modifiers changed from: private */
    public void A0N() {
        A0V(8, 0, true);
    }

    /* access modifiers changed from: private */
    public void A0O() {
        this.A04.CHe(A01());
        C31361fR r1 = this.A0C;
        if (r1.A02()) {
            r1.A01();
        }
    }

    /* access modifiers changed from: private */
    public void A0P() {
        this.A04.CHe(A04());
    }

    /* access modifiers changed from: private */
    public void A0Q() {
        Log.i("ConnectionThread/sendActiveModeIq");
        this.A04.CHe(C63902ts.A05(true));
        this.A03.A02();
    }

    /* access modifiers changed from: private */
    public void A0R(int i) {
        if (this.A0L.A01()) {
            Log.i("ConnectionThread/handleLogoutTimeout/skip-voip-active");
            this.A03.A07(i);
            A0L();
            return;
        }
        A0U(i);
        Log.i("ConnectionThread/handleLogoutTimeout/close-socket");
        A0I();
    }

    /* access modifiers changed from: private */
    public void A0S(int i) {
        this.A0k.A00(true);
        A17(false, i);
    }

    private void A0U(int i) {
        ((C20003A2s) this.A1D.get()).A04(i);
    }

    /* access modifiers changed from: private */
    public void A0V(int i, long j, boolean z) {
        if (j > 0) {
            long j2 = this.A00;
            if (j2 > j) {
                StringBuilder sb = new StringBuilder();
                sb.append("ConnectionThread/handleDisconnect/skip disconnectRequestTime:");
                sb.append(j);
                sb.append(" lastConnectedTime:");
                sb.append(j2);
                Log.i(sb.toString());
                return;
            }
        }
        A17(z, i);
    }

    private void A0W(long j) {
        C19830z4 r1 = this.A0R;
        r1.A1L(j);
        r1.A2C(false);
    }

    private void A0X(long j, long j2) {
        C46352Ef r5 = new C46352Ef();
        long abs = Math.abs(j - j2);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(abs);
        if (timeUnit.toMinutes(abs) % 60 >= 30) {
            hours++;
        }
        if (j < j2) {
            hours = -hours;
        }
        if (hours != 0) {
            r5.A00 = Long.valueOf(hours);
            this.A0Z.CC7(r5);
        }
    }

    /* access modifiers changed from: private */
    public void A0a(Message message) {
        this.A04.CHe(Message.obtain(message));
        if (AnonymousClass2U7.A00(message) == 37) {
            this.A03.A02();
        }
    }

    public static void A0e(C19830z4 r3, AnonymousClass188 r4, C29621ca r5) {
        String A0O2 = r5.A0O("location");
        if (TextUtils.isEmpty(A0O2) || A0O2.length() < 40) {
            A0f(r4, A0O2);
            r3.A1a(A0O2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0498, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x049e, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04a1, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04a3, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04a5, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04a6, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04d1, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04d2, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04fd, code lost:
        if (r0.A01 != null) goto L_0x04ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0531, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0532, code lost:
        r8 = 8;
        r5 = 0;
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0538, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0539, code lost:
        r8 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x054e, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0550, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0552, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0554, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0555, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x055d, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x055e, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0560, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0561, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0572, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0573, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0595, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0596, code lost:
        r8 = 8;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05c1, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05ea, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05eb, code lost:
        r8 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0630, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0631, code lost:
        r8 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0670, code lost:
        r3 = -1;
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0673, code lost:
        if (r3 == r8) goto L_0x0675;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0675, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0679, code lost:
        if (r3 == 10) goto L_0x067b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x067b, code lost:
        r3 = -1;
        r2 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:?, code lost:
        r3 = r4.serverErrorCode;
        r2 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x068c, code lost:
        r61.A1E(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x069a, code lost:
        r20 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06b5, code lost:
        r14.A0A(r1, r2, true, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x06e8, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x06e9, code lost:
        r5 = r24;
        r3 = -1;
        r2 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x06f3, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x06f4, code lost:
        r3 = -1;
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x06f8, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x06f9, code lost:
        r5 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x070a, code lost:
        r20 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0725, code lost:
        r14.A0A(r1, r2, false, r6);
        r11.Bro(true, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0731, code lost:
        r11.Bpj((java.lang.Integer) r58.get(), r1.A04, r9, r16);
        r0.A04.CHO(r0.A08);
        r14.A02(r1);
        ((X.C20003A2s) r0.A1D.get()).A05(r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0377 A[Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04a1 A[ExcHandler: 1UI (e X.1UI), PHI: r17 
      PHI: (r17v32 int) = (r17v7 int), (r17v7 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v7 int) binds: [B:53:0x014d, B:54:?, B:131:0x03b0, B:140:0x03ff, B:144:0x0408, B:107:0x032d, B:102:0x0307, B:103:?, B:94:0x02bb, B:89:0x021e, B:90:?, B:83:0x020e, B:73:0x01d1] A[DONT_GENERATE, DONT_INLINE], Splitter:B:53:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04a3 A[ExcHandler: IOException (e java.io.IOException), PHI: r17 
      PHI: (r17v31 int) = (r17v7 int), (r17v7 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v7 int) binds: [B:53:0x014d, B:54:?, B:131:0x03b0, B:140:0x03ff, B:144:0x0408, B:107:0x032d, B:102:0x0307, B:103:?, B:94:0x02bb, B:89:0x021e, B:90:?, B:83:0x020e, B:73:0x01d1] A[DONT_GENERATE, DONT_INLINE], Splitter:B:53:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x04a5 A[ExcHandler: 1UI (e X.1UI), PHI: r1 
      PHI: (r1v44 X.2rk) = (r1v20 X.2rk), (r1v20 X.2rk), (r1v20 X.2rk), (r1v59 X.2rk) binds: [B:49:0x0146, B:51:0x014a, B:52:?, B:58:0x015f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:49:0x0146] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x04c1 A[Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04d1 A[ExcHandler: IOException (e java.io.IOException), PHI: r1 
      PHI: (r1v42 X.2rk) = (r1v20 X.2rk), (r1v20 X.2rk), (r1v20 X.2rk), (r1v59 X.2rk) binds: [B:49:0x0146, B:51:0x014a, B:52:?, B:58:0x015f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:49:0x0146] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04ed A[Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0504 A[Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x054e A[ExcHandler: 1g3 (e X.1g3), PHI: r17 
      PHI: (r17v30 int) = (r17v7 int), (r17v7 int), (r17v7 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v7 int), (r17v7 int) binds: [B:53:0x014d, B:54:?, B:62:0x016a, B:171:0x047f, B:86:0x0214, B:91:0x0221, B:97:0x02ce, B:98:?, B:99:0x02e1, B:104:0x030c, B:131:0x03b0, B:140:0x03ff, B:144:0x0408, B:110:0x0334, B:107:0x032d, B:102:0x0307, B:103:?, B:94:0x02bb, B:89:0x021e, B:90:?, B:83:0x020e, B:77:0x01e2, B:73:0x01d1] A[DONT_GENERATE, DONT_INLINE], Splitter:B:91:0x0221] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0550 A[ExcHandler: 1g2 (e X.1g2), PHI: r17 
      PHI: (r17v29 int) = (r17v7 int), (r17v7 int), (r17v7 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v7 int), (r17v7 int) binds: [B:53:0x014d, B:54:?, B:62:0x016a, B:171:0x047f, B:86:0x0214, B:91:0x0221, B:97:0x02ce, B:98:?, B:99:0x02e1, B:104:0x030c, B:131:0x03b0, B:140:0x03ff, B:144:0x0408, B:110:0x0334, B:107:0x032d, B:102:0x0307, B:103:?, B:94:0x02bb, B:89:0x021e, B:90:?, B:83:0x020e, B:77:0x01e2, B:73:0x01d1] A[DONT_GENERATE, DONT_INLINE], Splitter:B:53:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0552 A[ExcHandler: 1g1 (e X.1g1), PHI: r17 
      PHI: (r17v28 int) = (r17v7 int), (r17v7 int), (r17v7 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v39 int), (r17v7 int), (r17v7 int) binds: [B:53:0x014d, B:54:?, B:62:0x016a, B:171:0x047f, B:86:0x0214, B:91:0x0221, B:97:0x02ce, B:98:?, B:99:0x02e1, B:104:0x030c, B:131:0x03b0, B:140:0x03ff, B:144:0x0408, B:110:0x0334, B:107:0x032d, B:102:0x0307, B:103:?, B:94:0x02bb, B:77:0x01e2, B:73:0x01d1] A[DONT_GENERATE, DONT_INLINE], Splitter:B:53:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0554 A[ExcHandler: 1g1 (e X.1g1), PHI: r1 
      PHI: (r1v46 X.2rk) = (r1v20 X.2rk), (r1v20 X.2rk), (r1v59 X.2rk) binds: [B:51:0x014a, B:52:?, B:58:0x015f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:51:0x014a] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x055d A[ExcHandler: all (th java.lang.Throwable), PHI: r1 
      PHI: (r1v35 X.2rk) = (r1v20 X.2rk), (r1v20 X.2rk), (r1v20 X.2rk), (r1v59 X.2rk) binds: [B:49:0x0146, B:51:0x014a, B:52:?, B:58:0x015f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:49:0x0146] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0560 A[ExcHandler: 1g3 (e X.1g3), PHI: r1 
      PHI: (r1v34 X.2rk) = (r1v20 X.2rk), (r1v20 X.2rk), (r1v20 X.2rk), (r1v59 X.2rk) binds: [B:49:0x0146, B:51:0x014a, B:52:?, B:58:0x015f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:49:0x0146] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0572 A[ExcHandler: 1g2 (e X.1g2), PHI: r1 
      PHI: (r1v31 X.2rk) = (r1v20 X.2rk), (r1v20 X.2rk), (r1v20 X.2rk), (r1v59 X.2rk) binds: [B:49:0x0146, B:51:0x014a, B:52:?, B:58:0x015f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:49:0x0146] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x05cd A[Catch:{ 1g0 -> 0x05e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0630 A[ExcHandler: 1g0 (e X.1g0), Splitter:B:31:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0670 A[Catch:{ all -> 0x06ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0673 A[Catch:{ all -> 0x06ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x068a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x069a  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x06b5  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x06f3 A[ExcHandler: all (th java.lang.Throwable), PHI: r5 
      PHI: (r5v9 int) = (r5v8 int), (r5v14 int) binds: [B:31:0x00e2, B:316:0x05f3] A[DONT_GENERATE, DONT_INLINE], Splitter:B:31:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x06f8 A[ExcHandler: all (th java.lang.Throwable), PHI: r1 r17 
      PHI: (r1v23 X.2rk) = (r1v20 X.2rk), (r1v20 X.2rk), (r1v20 X.2rk), (r1v41 X.2rk), (r1v43 X.2rk), (r1v20 X.2rk) binds: [B:38:0x00f0, B:47:0x0126, B:48:?, B:211:0x04e7, B:196:0x04bb, B:43:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r17v10 int) = (r17v7 int), (r17v7 int), (r17v7 int), (r17v25 int), (r17v26 int), (r17v7 int) binds: [B:38:0x00f0, B:47:0x0126, B:48:?, B:211:0x04e7, B:196:0x04bb, B:43:0x00fe] A[DONT_GENERATE, DONT_INLINE], Splitter:B:38:0x00f0] */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x070a  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0725  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0731  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0524 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0524 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0524 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0h(com.whatsapp.jid.UserJid r66, X.C54412e6 r67, java.lang.String r68, boolean r69, boolean r70) {
        /*
            r65 = this;
            java.lang.String r29 = "ConnectionThread/connect/socket/disconnect "
            java.lang.String r26 = "ConnectionThread/connect/socket/closed"
            r0 = r65
            X.1Dn r1 = r0.A0N
            boolean r28 = r1.A02()
            r44 = r66
            if (r66 != 0) goto L_0x0018
            if (r28 != 0) goto L_0x0018
            java.lang.String r0 = "ConnectionThread/connect/ignored/jid null and not in companion reg"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0017:
            return
        L_0x0018:
            X.1cz r1 = r0.A0i
            r64 = r1
            boolean r1 = r64.A01()
            if (r1 != 0) goto L_0x0017
            X.1fG r1 = r0.A0w
            r63 = r1
            r63.A04()
            X.1ft r1 = r0.A0h
            r1.A00()
            X.194 r2 = r0.A0H
            boolean r1 = r2.A02()
            if (r1 == 0) goto L_0x0041
            java.lang.String r1 = "ConnectionThread/connect/not-allowed/clock"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.1d0 r0 = r0.A0f
            r0.Bp5()
            return
        L_0x0041:
            if (r28 != 0) goto L_0x0051
            X.1Do r1 = r0.A14
            boolean r1 = r1.A01()
            if (r1 == 0) goto L_0x0051
            java.lang.String r0 = "ConnectionThread/connect/not-allowed/login-failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0051:
            boolean r1 = r2.A01()
            if (r1 == 0) goto L_0x0062
            java.lang.String r1 = "ConnectionThread/connect/not-allowed/software-expired"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.1d0 r0 = r0.A0f
            r0.C5y()
            return
        L_0x0062:
            X.1cz r1 = r0.A0k
            boolean r1 = r1.A01()
            if (r1 == 0) goto L_0x0070
            java.lang.String r1 = "ConnectionThread/connect/not-allowed/quit-flag-set"
            r0.A14(r1)
            return
        L_0x0070:
            java.lang.String r1 = "ConnectionThread/connect"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1fJ r14 = r0.A0d
            r14.A00()
            X.1d0 r11 = r0.A0f
            r11.Bpk()
            X.2rl r1 = r0.A01
            if (r1 == 0) goto L_0x008c
            boolean r1 = r1.A09()
            if (r1 != 0) goto L_0x008c
            r0.A0I()
        L_0x008c:
            X.1fI r1 = r0.A0g
            java.util.ArrayList r22 = r1.A01()
            X.11P r1 = r0.A0O
            r62 = r1
            long r48 = r62.A06()
            X.0z4 r1 = r0.A0R
            r61 = r1
            int r1 = r61.A05()
            r4 = 1
            int r7 = r1 + 1
            r5 = 0
            r3 = -1
            r2 = 0
            X.2rk r1 = new X.2rk
            r1.<init>(r2, r3, r5)
            java.util.concurrent.atomic.AtomicReference r58 = new java.util.concurrent.atomic.AtomicReference
            r58.<init>()
            r16 = r69
            android.net.TrafficStats.setThreadStatsTag(r4)     // Catch:{ 1g0 -> 0x0642, all -> 0x063a }
            X.1Cp r8 = r0.A0W     // Catch:{ 1g0 -> 0x0642, all -> 0x063a }
            X.0ve r2 = r0.A0X     // Catch:{ 1g0 -> 0x0642, all -> 0x063a }
            r60 = r2
            X.1fM r2 = r0.A13     // Catch:{ 1g0 -> 0x0642, all -> 0x063a }
            X.4Yf r20 = r2.A02()     // Catch:{ 1g0 -> 0x0642, all -> 0x063a }
            java.util.Random r4 = r0.A1G     // Catch:{ 1g0 -> 0x0642, all -> 0x063a }
            r6 = -1
            r2 = 0
            X.2tO r27 = new X.2tO     // Catch:{ 1g0 -> 0x0642, all -> 0x063a }
            r21 = r68
            r17 = r27
            r18 = r8
            r19 = r60
            r23 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ 1g0 -> 0x0642, all -> 0x063a }
            int r8 = r61.A0C()     // Catch:{ 1g0 -> 0x0642, all -> 0x063a }
            r4 = r27
            r4.A04(r8)     // Catch:{ 1g0 -> 0x0642, all -> 0x063a }
            r9 = 0
            r17 = -1
        L_0x00e2:
            boolean r3 = r27.A05()     // Catch:{ 1g0 -> 0x0630, all -> 0x06f3 }
            if (r3 == 0) goto L_0x05f0
            boolean r3 = r64.A01()     // Catch:{ 1g0 -> 0x0630, all -> 0x05ff }
            if (r3 != 0) goto L_0x05f0
            int r24 = r5 + 1
            java.util.concurrent.atomic.AtomicBoolean r3 = r0.A1I     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            boolean r3 = r3.get()     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            java.lang.String r4 = " state="
            if (r3 == 0) goto L_0x0126
            r5 = 11395(0x2c83, float:1.5968E-41)
            r3 = r60
            boolean r3 = r3.A0N(r5)     // Catch:{ 1g0 -> 0x052a, all -> 0x06f8 }
            if (r3 == 0) goto L_0x0126
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ 1g0 -> 0x052a, all -> 0x06f8 }
            r5.<init>()     // Catch:{ 1g0 -> 0x052a, all -> 0x06f8 }
            java.lang.String r3 = "ConnectionThread/connect: Network blocked, skipping connection sequence attempt="
            r5.append(r3)     // Catch:{ 1g0 -> 0x052a, all -> 0x06f8 }
            r3 = r24
            r5.append(r3)     // Catch:{ 1g0 -> 0x052a, all -> 0x06f8 }
            r5.append(r4)     // Catch:{ 1g0 -> 0x052a, all -> 0x06f8 }
            int r3 = r27.A02()     // Catch:{ 1g0 -> 0x052a, all -> 0x06f8 }
            r5.append(r3)     // Catch:{ 1g0 -> 0x052a, all -> 0x06f8 }
            java.lang.String r3 = r5.toString()     // Catch:{ 1g0 -> 0x052a, all -> 0x06f8 }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 1g0 -> 0x052a, all -> 0x06f8 }
            goto L_0x05ee
        L_0x0126:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            r3.<init>()     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            java.lang.String r2 = "ConnectionThread/connect: connecting; attempt="
            r3.append(r2)     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            r2 = r24
            r3.append(r2)     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            r3.append(r4)     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            int r2 = r27.A02()     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            r3.append(r2)     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            java.lang.String r2 = r3.toString()     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            int r2 = r27.A02()     // Catch:{ 1g1 -> 0x0595, 1g2 -> 0x0572, IOException -> 0x04d1, 1UI -> 0x04a5, 1g3 -> 0x0560, all -> 0x055d }
            X.2rk r10 = new X.2rk     // Catch:{ 1g1 -> 0x0554, 1g2 -> 0x0572, IOException -> 0x04d1, 1UI -> 0x04a5, 1g3 -> 0x0560, all -> 0x055d }
            r4 = 0
            r10.<init>(r4, r6, r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r1 = r27
            X.2q6 r5 = r0.A0A(r1, r2)     // Catch:{ 1g1 -> 0x0557, 1g2 -> 0x054a, IOException -> 0x049b, 1UI -> 0x0495, 1g3 -> 0x0546, all -> 0x0543 }
            int r4 = r5.A01     // Catch:{ 1g1 -> 0x0557, 1g2 -> 0x054a, IOException -> 0x049b, 1UI -> 0x0495, 1g3 -> 0x0546, all -> 0x0543 }
            X.2cU r3 = r5.A03     // Catch:{ 1g1 -> 0x0557, 1g2 -> 0x054a, IOException -> 0x049b, 1UI -> 0x0495, 1g3 -> 0x0546, all -> 0x0543 }
            X.2rk r1 = new X.2rk     // Catch:{ 1g1 -> 0x0557, 1g2 -> 0x054a, IOException -> 0x049b, 1UI -> 0x0495, 1g3 -> 0x0546, all -> 0x0543 }
            r1.<init>(r3, r4, r2)     // Catch:{ 1g1 -> 0x0557, 1g2 -> 0x054a, IOException -> 0x049b, 1UI -> 0x0495, 1g3 -> 0x0546, all -> 0x0543 }
            X.2ez r8 = r0.A07(r5, r2)     // Catch:{ 1g1 -> 0x0554, 1g2 -> 0x0572, IOException -> 0x04d1, 1UI -> 0x04a5, 1g3 -> 0x0560, all -> 0x055d }
            X.2rk r1 = r8.A01     // Catch:{ 1g1 -> 0x0554, 1g2 -> 0x0572, IOException -> 0x04d1, 1UI -> 0x04a5, 1g3 -> 0x0560, all -> 0x055d }
            X.26z r4 = new X.26z     // Catch:{ 1g1 -> 0x0554, 1g2 -> 0x0572, IOException -> 0x0492, 1UI -> 0x048f, 1g3 -> 0x0560, all -> 0x0540 }
            r4.<init>(r0)     // Catch:{ 1g1 -> 0x0554, 1g2 -> 0x0572, IOException -> 0x0492, 1UI -> 0x048f, 1g3 -> 0x0560, all -> 0x0540 }
            X.37L r5 = new X.37L     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r2 = r62
            r5.<init>(r2, r4)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            boolean r25 = r61.A2X()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            boolean r23 = r63.A07()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            X.1fO r2 = r0.A0v     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r59 = r2
            boolean r22 = r59.A02()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            if (r28 != 0) goto L_0x018d
            if (r70 != 0) goto L_0x018b
            if (r23 != 0) goto L_0x018b
            if (r25 != 0) goto L_0x018b
            if (r22 == 0) goto L_0x018d
        L_0x018b:
            r3 = 1
            goto L_0x018e
        L_0x018d:
            r3 = 0
        L_0x018e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r6.<init>()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            java.lang.String r2 = "ConnectionThread/connect: connecting; passiveLogin="
            r6.append(r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r6.append(r3)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            java.lang.String r2 = " hasPreacks="
            r6.append(r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r2 = r23
            r6.append(r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            java.lang.String r2 = " isOfflineResumeInProgress="
            r6.append(r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r2 = r22
            r6.append(r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            java.lang.String r2 = r6.toString()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            X.1fV r6 = r0.A0c     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            int r15 = r1.A04     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            X.2cU r2 = r1.A05     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r45 = r67
            r42 = r6
            r43 = r2
            r46 = r15
            r47 = r7
            r50 = r3
            X.2BY r51 = r42.A01(r43, r44, r45, r46, r47, r48, r50)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r1.A04(r3)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            if (r3 == 0) goto L_0x01dd
            int r2 = r63.A01()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            long r12 = (long) r2     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r1.A03(r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
        L_0x01dd:
            if (r28 == 0) goto L_0x01e2
            r56 = 0
            goto L_0x01e8
        L_0x01e2:
            X.1Cw r2 = r0.A0B     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            X.AlU r56 = r2.A0F()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
        L_0x01e8:
            X.1Cw r10 = r0.A0B     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            X.2cV r6 = r10.A0D()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            int r2 = r6.A00     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r17 = r2
            X.AlW r2 = r6.A01     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            if (r2 == 0) goto L_0x047c
            java.io.InputStream r12 = r8.A02     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            java.io.OutputStream r6 = r8.A03     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r50 = r0
            r52 = r1
            r53 = r12
            r54 = r6
            r55 = r2
            X.A7J r12 = r50.A0H(r51, r52, r53, r54, r55, r56)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            X.AlU r6 = r12.A05()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            if (r56 == 0) goto L_0x0213
            byte[] r8 = r56.A00()     // Catch:{ 1g1 -> 0x0538, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e, all -> 0x0531 }
            goto L_0x0214
        L_0x0213:
            r8 = 0
        L_0x0214:
            byte[] r2 = r6.A00()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            boolean r2 = java.util.Arrays.equals(r8, r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            if (r2 != 0) goto L_0x0221
            r10.A0I(r6)     // Catch:{ 1g1 -> 0x0538, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e, all -> 0x0531 }
        L_0x0221:
            X.1en r8 = new X.1en     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r8.<init>()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            X.190 r2 = r0.A0D     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            X.2dR r6 = r12.A03()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            X.1eo r13 = new X.1eo     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r13.<init>(r2, r8, r6)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            X.2dS r10 = r12.A04()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            X.37M r12 = new X.37M     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r6 = r60
            r12.<init>(r2, r6, r8, r10)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            java.util.concurrent.ConcurrentHashMap r8 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r8.<init>()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            X.1fy r6 = r0.A0E     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            X.2ef r6 = r6.A00(r5)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            java.util.HashMap r42 = r0.A0F(r6, r5, r8)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            X.11S r6 = r0.A0F     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r33 = r6
            X.1CJ r6 = r0.A0T     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r21 = r6
            X.18K r6 = r0.A0Z     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r20 = r6
            X.1OZ r6 = r0.A0l     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r19 = r6
            X.1dB r6 = r0.A1C     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r18 = r6
            X.1O1 r6 = r0.A1B     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r45 = r6
            X.195 r6 = r0.A0A     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r10 = r6
            X.2su r6 = new X.2su     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r30 = r6
            r31 = r10
            r32 = r2
            r34 = r62
            r35 = r21
            r36 = r60
            r37 = r20
            r38 = r19
            r39 = r13
            r40 = r45
            r41 = r18
            r43 = r8
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r0.A07 = r6     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            X.2U1 r36 = new X.2U1     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r36.<init>()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            X.118 r6 = r0.A0P     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r19 = r6
            X.10I r6 = r0.A1A     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r18 = r6
            X.18O r6 = r0.A0I     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r32 = r6
            X.1N7 r6 = r0.A0r     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r10 = r6
            X.2rj r6 = new X.2rj     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r30 = r6
            r31 = r2
            r33 = r19
            r34 = r61
            r35 = r60
            r37 = r5
            r38 = r10
            r39 = r12
            r40 = r18
            r41 = r8
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r0.A08 = r6     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            java.util.concurrent.atomic.AtomicReference r57 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r57.<init>()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            if (r28 != 0) goto L_0x02cd
            X.2rj r5 = r0.A08     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r52 = r0
            r53 = r51
            r54 = r13
            r55 = r5
            r56 = r1
            r52.A0x(r53, r54, r55, r56, r57, r58)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r8 = 17
            goto L_0x02ce
        L_0x02cd:
            r8 = 3
        L_0x02ce:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r6.<init>()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            java.lang.String r5 = "ConnectionThread/connect: switching to "
            r6.append(r5)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r6.append(r8)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            java.lang.String r5 = " minute read timeout; sessionId="
            r6.append(r5)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x048c, 1UI -> 0x0489, 1g3 -> 0x054e, all -> 0x053c }
            r10 = r1
            r6.append(r15)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            java.lang.String r5 = r6.toString()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            X.2rl r5 = r0.A01     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            int r6 = r8 * 60
            int r6 = r6 * 1000
            r5.A05(r6)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            long r5 = r62.A08()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            r0.A00 = r5     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            X.2rj r5 = r0.A08     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            boolean r6 = r5.A05()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            X.1fb r5 = r0.A17     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            r5.A00()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            if (r6 == 0) goto L_0x030c
            X.1fa r5 = r0.A0K     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r5.A00()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
        L_0x030c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            r6.<init>()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            java.lang.String r5 = "ConnectionThread/connect: fetching client config; sessionId="
            r6.append(r5)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            r6.append(r15)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            java.lang.String r5 = r6.toString()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            X.2rj r5 = r0.A08     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            r5.A01()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            X.1Oe r5 = r0.A19     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            X.1ca r6 = r5.A02()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            if (r6 == 0) goto L_0x0332
            X.2rj r5 = r0.A08     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r5.A02(r6)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
        L_0x0332:
            if (r28 != 0) goto L_0x0378
            int r5 = r32.A03()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            java.lang.Object r6 = r57.get()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            if (r6 == 0) goto L_0x034d
            int r6 = r6.intValue()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            if (r6 == r5) goto L_0x034d
            X.2rj r5 = r0.A08     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            r6 = 1
        L_0x0349:
            r5.A04(r6)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            goto L_0x0375
        L_0x034d:
            r6 = 1
            X.11O r5 = r0.A0S     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            boolean r5 = r5.A02()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            if (r5 == 0) goto L_0x0359
            X.2rj r5 = r0.A08     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            goto L_0x0349
        L_0x0359:
            long r20 = r62.A03()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            long r18 = r32.A06()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            long r12 = r32.A05()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            long r12 = r12 + r18
            int r5 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r5 < 0) goto L_0x036f
            int r5 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r5 >= 0) goto L_0x0375
        L_0x036f:
            X.2rj r8 = r0.A08     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            r5 = 0
            r8.A04(r5)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
        L_0x0375:
            if (r69 == 0) goto L_0x037f
            goto L_0x037a
        L_0x0378:
            r6 = 1
            goto L_0x037f
        L_0x037a:
            X.2rj r5 = r0.A08     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            r5.A00()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
        L_0x037f:
            X.1fW r5 = r0.A0u     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            r5.A04()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            X.00H r5 = r0.A1D     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            java.lang.Object r5 = r5.get()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            X.A2s r5 = (X.C20003A2s) r5     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            r5.A01()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            X.2su r8 = r0.A07     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            X.2Pz r5 = new X.2Pz     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            r5.<init>(r2, r4, r8)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            r5.start()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            r2 = r64
            r2.A00(r6)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            java.lang.String r5 = "offline_resume"
            r2 = r45
            r2.A01(r5, r6)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            X.2rl r2 = r0.A01     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            java.net.InetAddress r2 = r2.A01()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            boolean r9 = r2 instanceof java.net.Inet6Address     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            r5 = 0
            r2 = r61
            r2.A1A(r5)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r0.A02 = r4     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            if (r28 != 0) goto L_0x0458
            if (r70 != 0) goto L_0x03fd
            if (r23 == 0) goto L_0x03fd
            java.util.List r8 = r63.A03()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            boolean r2 = r8.isEmpty()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            if (r2 != 0) goto L_0x03fd
            int r2 = r8.size()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            int r2 = r2 - r6
            java.lang.Object r2 = r8.get(r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            X.2mG r2 = (X.C59412mG) r2     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r0.A06 = r2     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r5.<init>()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            java.lang.String r2 = "ConnectionThread/send preacks, size="
            r5.append(r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            int r2 = r8.size()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r5.append(r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            java.lang.String r2 = " lastSentPreack="
            r5.append(r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            X.2mG r2 = r0.A06     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r5.append(r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            java.lang.String r2 = r5.toString()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            X.1gG r2 = r0.A04     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            android.os.Message r5 = A05(r8)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r2.CHe(r5)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
        L_0x03fd:
            if (r25 == 0) goto L_0x0413
            X.120 r2 = r0.A0G     // Catch:{ InterruptedException -> 0x040c, ExecutionException -> 0x0405 }
            r2.A04()     // Catch:{ InterruptedException -> 0x040c, ExecutionException -> 0x0405 }
            goto L_0x041e
        L_0x0405:
            r5 = move-exception
            java.lang.String r2 = "ConnectionThread/connect/signal/execution-exception"
            com.whatsapp.util.Log.w(r2, r5)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            goto L_0x041e
        L_0x040c:
            r5 = move-exception
            java.lang.String r2 = "ConnectionThread/connect/signal/interrupted-exception"
            com.whatsapp.util.Log.w(r2, r5)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            goto L_0x041e
        L_0x0413:
            boolean r2 = r61.A2W()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            if (r2 == 0) goto L_0x041e
            X.120 r2 = r0.A0G     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r2.A06()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
        L_0x041e:
            if (r70 != 0) goto L_0x0434
            if (r3 == 0) goto L_0x0434
            if (r22 == 0) goto L_0x0431
            r2 = 40
            X.3Br r3 = new X.3Br     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r3.<init>(r0, r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r2 = r59
            r2.A01(r3)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            goto L_0x0434
        L_0x0431:
            r0.A0Q()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
        L_0x0434:
            java.lang.Integer r5 = r61.A0Z()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            if (r5 == 0) goto L_0x044b
            X.1Cd r2 = r0.A0V     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            boolean r2 = r2.A07()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            if (r2 == 0) goto L_0x044b
            X.126 r3 = r0.A0a     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            int r2 = r5.intValue()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r3.A0P(r2, r6)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
        L_0x044b:
            X.1fR r3 = r0.A0C     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            boolean r2 = r3.A02()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            if (r2 == 0) goto L_0x0458
            if (r69 == 0) goto L_0x0458
            r3.A01()     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
        L_0x0458:
            r3 = 1190(0x4a6, float:1.668E-42)
            r2 = r60
            boolean r2 = r2.A0N(r3)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            if (r2 == 0) goto L_0x046b
            X.2rj r2 = r0.A08     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            long r5 = r2.A02     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            long r2 = r2.A01     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r0.A0X(r5, r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
        L_0x046b:
            X.2rj r2 = r0.A08     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            long r5 = r2.A02     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            r12 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r12
            long r2 = r2.A01     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            long r2 = r2 * r12
            r8 = r62
            r8.A0A(r5, r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x04a3, 1UI -> 0x04a1, 1g3 -> 0x054e }
            goto L_0x0505
        L_0x047c:
            r10 = r1
            java.lang.String r2 = "ConnectionThread/connect/failed to load auth key, postponing login"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            r3 = 0
            X.1g2 r2 = new X.1g2     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            r2.<init>(r3)     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
            throw r2     // Catch:{ 1g1 -> 0x0552, 1g2 -> 0x0550, IOException -> 0x049e, 1UI -> 0x0498, 1g3 -> 0x054e, all -> 0x05c1 }
        L_0x0489:
            r3 = move-exception
            r10 = r1
            goto L_0x0499
        L_0x048c:
            r3 = move-exception
            r10 = r1
            goto L_0x049f
        L_0x048f:
            r3 = move-exception
            r10 = r1
            goto L_0x0496
        L_0x0492:
            r3 = move-exception
            r10 = r1
            goto L_0x049c
        L_0x0495:
            r3 = move-exception
        L_0x0496:
            r4 = 0
            goto L_0x0499
        L_0x0498:
            r3 = move-exception
        L_0x0499:
            r1 = r10
            goto L_0x04a7
        L_0x049b:
            r3 = move-exception
        L_0x049c:
            r4 = 0
            goto L_0x049f
        L_0x049e:
            r3 = move-exception
        L_0x049f:
            r1 = r10
            goto L_0x04d3
        L_0x04a1:
            r3 = move-exception
            goto L_0x04a7
        L_0x04a3:
            r3 = move-exception
            goto L_0x04d3
        L_0x04a5:
            r3 = move-exception
            r4 = 0
        L_0x04a7:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0570 }
            r5.<init>()     // Catch:{ all -> 0x0570 }
            java.lang.String r2 = "ConnectionThread/connect/socket/next-port/corrupt-stream-exception "
            r5.append(r2)     // Catch:{ all -> 0x0570 }
            r5.append(r3)     // Catch:{ all -> 0x0570 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0570 }
            com.whatsapp.util.Log.i(r2, r3)     // Catch:{ all -> 0x0570 }
            boolean r2 = r64.A01()     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            if (r2 != 0) goto L_0x0524
            X.2rl r2 = r0.A01     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            if (r2 == 0) goto L_0x04cc
            boolean r2 = r2.A09()     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            if (r2 != 0) goto L_0x04cc
            goto L_0x04f7
        L_0x04cc:
            X.2rl r2 = r0.A01     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            if (r2 == 0) goto L_0x0502
            goto L_0x04ff
        L_0x04d1:
            r3 = move-exception
            r4 = 0
        L_0x04d3:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0570 }
            r5.<init>()     // Catch:{ all -> 0x0570 }
            r2 = r29
            r5.append(r2)     // Catch:{ all -> 0x0570 }
            r5.append(r3)     // Catch:{ all -> 0x0570 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0570 }
            com.whatsapp.util.Log.i(r2, r3)     // Catch:{ all -> 0x0570 }
            boolean r2 = r64.A01()     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            if (r2 != 0) goto L_0x0524
            X.2rl r2 = r0.A01     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            if (r2 == 0) goto L_0x04fb
            boolean r2 = r2.A09()     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            if (r2 != 0) goto L_0x04fb
        L_0x04f7:
            r0.A0I()     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            goto L_0x0502
        L_0x04fb:
            X.2rl r2 = r0.A01     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            if (r2 == 0) goto L_0x0502
        L_0x04ff:
            com.whatsapp.util.Log.i((java.lang.String) r26)     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
        L_0x0502:
            if (r4 == 0) goto L_0x0524
            goto L_0x0518
        L_0x0505:
            boolean r2 = r64.A01()     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            if (r2 != 0) goto L_0x0524
            X.2rl r2 = r0.A01     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            if (r2 == 0) goto L_0x051c
            boolean r2 = r2.A09()     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            if (r2 != 0) goto L_0x051c
            r0.A0I()     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
        L_0x0518:
            r4.A00()     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            goto L_0x0524
        L_0x051c:
            X.2rl r2 = r0.A01     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            if (r2 == 0) goto L_0x0518
            com.whatsapp.util.Log.i((java.lang.String) r26)     // Catch:{ 1g0 -> 0x05ea, all -> 0x06f8 }
            goto L_0x0518
        L_0x0524:
            r5 = r24
            r2 = 0
            r6 = -1
            goto L_0x00e2
        L_0x052a:
            r4 = move-exception
            r8 = 8
            r5 = 0
            r6 = 0
            goto L_0x064b
        L_0x0531:
            r3 = move-exception
            r8 = 8
            r5 = 0
            r6 = 0
            goto L_0x05c7
        L_0x0538:
            r5 = move-exception
            r8 = 8
            goto L_0x0599
        L_0x053c:
            r3 = move-exception
            r10 = r1
            goto L_0x05c2
        L_0x0540:
            r3 = move-exception
            r10 = r1
            goto L_0x0544
        L_0x0543:
            r3 = move-exception
        L_0x0544:
            r4 = 0
            goto L_0x05c2
        L_0x0546:
            r3 = move-exception
            r4 = 0
            r1 = r10
            goto L_0x0562
        L_0x054a:
            r5 = move-exception
            r4 = 0
            r1 = r10
            goto L_0x0574
        L_0x054e:
            r3 = move-exception
            goto L_0x0562
        L_0x0550:
            r5 = move-exception
            goto L_0x0574
        L_0x0552:
            r5 = move-exception
            goto L_0x055a
        L_0x0554:
            r5 = move-exception
            r4 = 0
            goto L_0x055a
        L_0x0557:
            r5 = move-exception
            r4 = 0
            r1 = r10
        L_0x055a:
            r8 = 8
            goto L_0x0599
        L_0x055d:
            r3 = move-exception
            r4 = 0
            goto L_0x05c3
        L_0x0560:
            r3 = move-exception
            r4 = 0
        L_0x0562:
            java.lang.String r2 = "ConnectionThread/connect/socket/invalid-certificate-exception"
            com.whatsapp.util.Log.w(r2, r3)     // Catch:{ all -> 0x0570 }
            r5 = 10
            r3 = -1
            X.1g0 r2 = new X.1g0     // Catch:{ all -> 0x0570 }
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0570 }
            throw r2     // Catch:{ all -> 0x0570 }
        L_0x0570:
            r3 = move-exception
            goto L_0x05c3
        L_0x0572:
            r5 = move-exception
            r4 = 0
        L_0x0574:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0591 }
            r3.<init>()     // Catch:{ all -> 0x0591 }
            r2 = r29
            r3.append(r2)     // Catch:{ all -> 0x0591 }
            r3.append(r5)     // Catch:{ all -> 0x0591 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0591 }
            com.whatsapp.util.Log.i(r2, r5)     // Catch:{ all -> 0x0591 }
            r8 = 8
            r3 = -1
            X.1g0 r2 = new X.1g0     // Catch:{ all -> 0x05bf }
            r2.<init>(r8, r3)     // Catch:{ all -> 0x05bf }
            throw r2     // Catch:{ all -> 0x05bf }
        L_0x0591:
            r3 = move-exception
            r8 = 8
            goto L_0x05c5
        L_0x0595:
            r5 = move-exception
            r8 = 8
            r4 = 0
        L_0x0599:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x05bf }
            r3.<init>()     // Catch:{ all -> 0x05bf }
            java.lang.String r2 = "ConnectionThread/connect/socket/goaway"
            r3.append(r2)     // Catch:{ all -> 0x05bf }
            r3.append(r5)     // Catch:{ all -> 0x05bf }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x05bf }
            com.whatsapp.util.Log.i(r2, r5)     // Catch:{ all -> 0x05bf }
            int r5 = r27.A02()     // Catch:{ all -> 0x05bb }
            r6 = 6
            r3 = -1
            X.1g0 r2 = new X.1g0     // Catch:{ all -> 0x05b9 }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x05b9 }
            throw r2     // Catch:{ all -> 0x05b9 }
        L_0x05b9:
            r3 = move-exception
            goto L_0x05bd
        L_0x05bb:
            r3 = move-exception
            r5 = 0
        L_0x05bd:
            r6 = 1
            goto L_0x05c7
        L_0x05bf:
            r3 = move-exception
            goto L_0x05c5
        L_0x05c1:
            r3 = move-exception
        L_0x05c2:
            r1 = r10
        L_0x05c3:
            r8 = 8
        L_0x05c5:
            r5 = 0
            r6 = 0
        L_0x05c7:
            boolean r2 = r64.A01()     // Catch:{ 1g0 -> 0x05e8 }
            if (r2 != 0) goto L_0x05e7
            X.2rl r2 = r0.A01     // Catch:{ 1g0 -> 0x05e8 }
            if (r2 == 0) goto L_0x05db
            boolean r2 = r2.A09()     // Catch:{ 1g0 -> 0x05e8 }
            if (r2 != 0) goto L_0x05db
            r0.A0I()     // Catch:{ 1g0 -> 0x05e8 }
            goto L_0x05e2
        L_0x05db:
            X.2rl r2 = r0.A01     // Catch:{ 1g0 -> 0x05e8 }
            if (r2 == 0) goto L_0x05e2
            com.whatsapp.util.Log.i((java.lang.String) r26)     // Catch:{ 1g0 -> 0x05e8 }
        L_0x05e2:
            if (r4 == 0) goto L_0x05e7
            r4.A00()     // Catch:{ 1g0 -> 0x05e8 }
        L_0x05e7:
            throw r3     // Catch:{ 1g0 -> 0x05e8 }
        L_0x05e8:
            r4 = move-exception
            goto L_0x064b
        L_0x05ea:
            r4 = move-exception
            r8 = 8
            goto L_0x0637
        L_0x05ee:
            r5 = r24
        L_0x05f0:
            r8 = 8
            r3 = 1
            boolean r4 = r64.A01()     // Catch:{ 1g0 -> 0x0634, all -> 0x06f3 }
            if (r4 != 0) goto L_0x0602
            r4 = r61
            r4.A1A(r7)     // Catch:{ 1g0 -> 0x0634, all -> 0x05ff }
            goto L_0x0602
        L_0x05ff:
            r10 = move-exception
            goto L_0x06fb
        L_0x0602:
            r61.A0y()
            boolean r4 = r64.A01()
            r20 = 5
            if (r4 == 0) goto L_0x060f
            r20 = 1
        L_0x060f:
            int r7 = r7 - r3
            int r22 = r5 + -1
            r26 = -1
            r4 = 2
            r18 = r0
            r19 = r1
            r21 = r7
            r23 = r17
            r24 = r48
            r18.A13(r19, r20, r21, r22, r23, r24, r26)
            boolean r5 = r64.A01()
            if (r5 != 0) goto L_0x06bd
            r14.A0A(r1, r4, r2, r2)
            r11.Bro(r3, r6)
            goto L_0x06b9
        L_0x0630:
            r4 = move-exception
            r8 = 8
            goto L_0x0635
        L_0x0634:
            r4 = move-exception
        L_0x0635:
            r24 = r5
        L_0x0637:
            r5 = 0
            r6 = 0
            goto L_0x064b
        L_0x063a:
            r10 = move-exception
            r17 = -1
            r2 = 2
            r6 = 0
            r9 = 0
            goto L_0x06fe
        L_0x0642:
            r4 = move-exception
            r8 = 8
            r17 = -1
            r9 = 0
            r6 = 0
            r24 = 0
        L_0x064b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x06ee }
            r3.<init>()     // Catch:{ all -> 0x06ee }
            java.lang.String r2 = "ConnectionThread/connect/login/failure type:"
            r3.append(r2)     // Catch:{ all -> 0x06ee }
            int r2 = r4.type     // Catch:{ all -> 0x06ee }
            r3.append(r2)     // Catch:{ all -> 0x06ee }
            java.lang.String r2 = " code:"
            r3.append(r2)     // Catch:{ all -> 0x06ee }
            int r2 = r4.code     // Catch:{ all -> 0x06ee }
            r3.append(r2)     // Catch:{ all -> 0x06ee }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x06ee }
            com.whatsapp.util.Log.w(r2, r4)     // Catch:{ all -> 0x06ee }
            int r3 = r4.type     // Catch:{ all -> 0x06ee }
            r2 = 6
            if (r3 != r2) goto L_0x0673
            r3 = -1
            r2 = 4
            goto L_0x0681
        L_0x0673:
            if (r3 != r8) goto L_0x0677
            r3 = -1
            goto L_0x0681
        L_0x0677:
            r2 = 10
            if (r3 != r2) goto L_0x067e
            r3 = -1
            r2 = 7
            goto L_0x0681
        L_0x067e:
            int r3 = r4.serverErrorCode     // Catch:{ all -> 0x06e8 }
            r2 = 3
        L_0x0681:
            r11.BxQ(r4)     // Catch:{ all -> 0x06e4 }
            boolean r4 = r64.A01()
            if (r4 != 0) goto L_0x06e0
            if (r6 == 0) goto L_0x06e0
            r4 = r61
            r4.A1E(r5)
        L_0x0691:
            boolean r5 = r64.A01()
            r20 = r2
            r4 = 1
            if (r5 == 0) goto L_0x069c
            r20 = 1
        L_0x069c:
            int r7 = r7 - r4
            int r22 = r24 + -1
            long r3 = (long) r3
            r18 = r0
            r19 = r1
            r21 = r7
            r23 = r17
            r24 = r48
            r26 = r3
            r18.A13(r19, r20, r21, r22, r23, r24, r26)
            boolean r3 = r64.A01()
            if (r3 != 0) goto L_0x06bd
            r0 = 1
            r14.A0A(r1, r2, r0, r6)
        L_0x06b9:
            android.net.TrafficStats.clearThreadStatsTag()
            return
        L_0x06bd:
            int r4 = r1.A04
            java.lang.Object r3 = r58.get()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r2 = r16
            r11.Bpj(r3, r4, r9, r2)
            X.1gG r3 = r0.A04
            X.2rj r2 = r0.A08
            r3.CHO(r2)
            r14.A02(r1)
            X.00H r0 = r0.A1D
            java.lang.Object r0 = r0.get()
            X.A2s r0 = (X.C20003A2s) r0
            r0.A05(r1)
            goto L_0x06b9
        L_0x06e0:
            r61.A0y()
            goto L_0x0691
        L_0x06e4:
            r10 = move-exception
            r5 = r24
            goto L_0x06fe
        L_0x06e8:
            r10 = move-exception
            r5 = r24
            r3 = -1
            r2 = 3
            goto L_0x06fe
        L_0x06ee:
            r10 = move-exception
            r5 = r24
            r3 = -1
            goto L_0x06f6
        L_0x06f3:
            r10 = move-exception
            r3 = -1
            r6 = 0
        L_0x06f6:
            r2 = 2
            goto L_0x06fe
        L_0x06f8:
            r10 = move-exception
            r5 = r24
        L_0x06fb:
            r3 = -1
            r2 = 2
            r6 = 0
        L_0x06fe:
            r61.A0y()
            boolean r4 = r64.A01()
            r8 = 1
            r20 = 5
            if (r4 == 0) goto L_0x070c
            r20 = 1
        L_0x070c:
            int r7 = r7 - r8
            int r22 = r5 + -1
            long r3 = (long) r3
            r18 = r0
            r19 = r1
            r21 = r7
            r23 = r17
            r24 = r48
            r26 = r3
            r18.A13(r19, r20, r21, r22, r23, r24, r26)
            boolean r3 = r64.A01()
            if (r3 != 0) goto L_0x0731
            r0 = 0
            r14.A0A(r1, r2, r0, r6)
            r0 = -1
            r11.Bro(r8, r0)
        L_0x072d:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r10
        L_0x0731:
            int r4 = r1.A04
            java.lang.Object r3 = r58.get()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r2 = r16
            r11.Bpj(r3, r4, r9, r2)
            X.1gG r3 = r0.A04
            X.2rj r2 = r0.A08
            r3.CHO(r2)
            r14.A02(r1)
            X.00H r0 = r0.A1D
            java.lang.Object r0 = r0.get()
            X.A2s r0 = (X.C20003A2s) r0
            r0.A05(r1)
            goto L_0x072d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31701fz.A0h(com.whatsapp.jid.UserJid, X.2e6, java.lang.String, boolean, boolean):void");
    }

    /* access modifiers changed from: private */
    public void A0w(C31871gG r3) {
        this.A04 = r3;
        this.A0f.Bpr(new C36291ne(this));
    }

    /* access modifiers changed from: private */
    public void A0z(AnonymousClass205 r2) {
        this.A03.A08(r2);
    }

    public static void A10(C31711g0 r2, C29621ca r3) {
        r2.logoutMessageHeader = r3.A0Q("logout_message_header", (String) null);
        r2.logoutMessageSubtext = r3.A0Q("logout_message_subtext", (String) null);
        r2.logoutMessageLocale = r3.A0Q("logout_message_locale", (String) null);
        r2.logoutMainButtonText = r3.A0Q("logout_main_button_text", (String) null);
        r2.logoutMainButtonUrl = r3.A0Q("logout_main_button_url", (String) null);
        r2.logoutSecondaryButtonText = r3.A0Q("logout_secondary_button_text", (String) null);
        r2.logoutSecondaryButtonUrl = r3.A0Q("logout_secondary_button_url", (String) null);
    }

    /* access modifiers changed from: private */
    public void A11(C62642rj r3) {
        if (r3 == this.A08) {
            A17(true, 2);
        }
    }

    private void A13(C62652rk r13, int i, int i2, int i3, int i4, long j, long j2) {
        AnonymousClass184 A002 = this.A0p.A00(r13, i, i2, i3, i4, j, j2);
        if (A002 != null) {
            if (i == 1 || i == 5) {
                this.A0Z.CC7(A002);
            } else {
                this.A0Z.CC6(A002, C18180vt.A06);
            }
        }
        C29791cs r0 = this.A0m;
        if (i == 1) {
            r0.A02();
        } else {
            r0.A01();
        }
    }

    /* access modifiers changed from: private */
    public void A14(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("ConnectionThread/quitIfNeeded should quit: ");
        C29861cz r1 = this.A0k;
        sb.append(r1.A01());
        Log.i(sb.toString());
        if (r1.A01()) {
            Log.i(str);
            this.A05.quit();
            quit();
        }
    }

    private void A15(boolean z) {
        if (z) {
            try {
                Log.i("ConnectionThread/setSoLinger");
                this.A01.A04();
            } catch (SocketException e) {
                this.A0D.A0E("set-so-linger-failed", (String) null, e);
            }
        }
        Log.i("ConnectionThread/closeSocket");
        this.A01.A02();
    }

    private void A16(boolean z) {
        if (z) {
            ((C20003A2s) this.A1D.get()).A03();
            this.A0u.A05();
            C59412mG r1 = this.A06;
            if (r1 != null) {
                this.A0w.A06(r1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r6.A0X.A0N(7106) == false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A17(boolean r7, int r8) {
        /*
            r6 = this;
            X.1g9 r0 = r6.A03
            boolean r1 = r0.A09()
            X.1g9 r0 = r6.A03
            int r4 = r0.A00
            r0.A03()
            X.2su r0 = r6.A07
            if (r0 == 0) goto L_0x0016
            r0.A02()
        L_0x0016:
            X.1cz r5 = r6.A0i
            boolean r0 = r5.A01()
            java.lang.String r3 = "quit during forced disconnect"
            if (r0 == 0) goto L_0x005d
            X.1cz r2 = r6.A0j
            boolean r0 = r2.A01()
            if (r0 != 0) goto L_0x005d
            r4 = 1
            if (r7 == 0) goto L_0x0087
            java.lang.String r0 = "ConnectionThread/disconnect/reader_thread/mark_finished"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.26z r0 = r6.A02
            if (r0 == 0) goto L_0x0037
            r0.A00()
        L_0x0037:
            r6.A0U(r8)
            r2 = 0
            if (r4 != r8) goto L_0x0048
            X.0ve r1 = r6.A0X
            r0 = 7106(0x1bc2, float:9.958E-42)
            boolean r1 = r1.A0N(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            r6.A15(r0)
            X.1gG r0 = r6.A04
            r0.CHS()
            X.1d0 r0 = r6.A0f
            r0.Bro(r4, r8)
            r5.A00(r2)
        L_0x0059:
            r6.A14(r3)
        L_0x005c:
            return
        L_0x005d:
            if (r1 == 0) goto L_0x0073
            if (r7 == 0) goto L_0x0079
            X.1g9 r1 = r6.A03
            int r0 = A00(r8, r4)
            r1.A06(r0)
        L_0x006a:
            X.1cz r0 = r6.A0j
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x005c
            goto L_0x0059
        L_0x0073:
            if (r7 == 0) goto L_0x0079
            r6.A0U(r8)
            goto L_0x006a
        L_0x0079:
            X.1cz r0 = r6.A0j
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "quit even if not connected"
            r6.A14(r0)
            return
        L_0x0087:
            X.1g9 r0 = r6.A03
            r0.A07(r8)
            X.1gG r1 = r6.A04
            android.os.Message r0 = X.C63902ts.A01()
            r1.CHe(r0)
            r2.A00(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31701fz.A17(boolean, int):void");
    }

    private void A18(boolean z, int i) {
        C63342su r0 = this.A07;
        if (r0 != null) {
            r0.A02();
        }
        this.A0i.A00(false);
        this.A0j.A00(false);
        if (!this.A0k.A01()) {
            C31801g9 r02 = this.A03;
            int A012 = r02.A01();
            r02.A05();
            int i2 = -1;
            if (z) {
                if (i == 0) {
                    this.A0D.A0G("logout-report-new-exception", "please include correct error type", false);
                } else if (i != 1) {
                    if (i == 2) {
                        if (A012 == -1) {
                            A012 = 5;
                        }
                    }
                } else if (A012 == -1) {
                    A012 = 3;
                }
                this.A04.CHS();
                this.A0f.Bro(z, i2);
            } else if (A012 == -1) {
                A012 = 4;
            }
            A0U(A012);
            i2 = A012;
            this.A04.CHS();
            this.A0f.Bro(z, i2);
        } else {
            A14("ConnectionThread/quit after disconnected");
        }
        this.A03.A03();
    }

    /* access modifiers changed from: private */
    public boolean A19() {
        return this.A03.A09();
    }

    public void A1C() {
        C63342su r0 = this.A07;
        if (r0 != null) {
            r0.A04();
        }
    }

    public void onLooperPrepared() {
        this.A03 = new C31801g9(this);
        C31821gB r2 = new C31821gB(this);
        C31681fx r0 = this.A0n;
        r0.getClass();
        C31841gD r02 = new C31841gD(new C31831gC(r0), r2);
        this.A05 = r02;
        r02.start();
        this.A0q.A00();
    }

    /* access modifiers changed from: private */
    public void A0M() {
        A0I();
        A18(false, -1);
    }

    /* access modifiers changed from: private */
    public void A0T(int i) {
        A0I();
        A18(true, i);
    }

    /* access modifiers changed from: private */
    public void A0Y(Message message) {
        String string = message.getData().getString("iqId");
        C17960vV.A07(string);
        if (!this.A0o.A08((C29621ca) message.obj, string)) {
            this.A0f.BwA(string);
        }
    }

    /* access modifiers changed from: private */
    public void A0Z(Message message) {
        int A002 = AnonymousClass2U6.A00(message);
        if (A002 == 4) {
            long j = message.getData().getLong("timestamp");
            AnonymousClass11P r2 = this.A0O;
            r2.A0A(j * 1000, r2.A04());
            this.A04.CHe(A03());
            ((C20003A2s) this.A1D.get()).A02();
        } else if (A002 != 87) {
            AnonymousClass1O4 r1 = this.A0o;
            if (r1.A07(A002)) {
                r1.A03(Message.obtain(message), A002);
            } else {
                this.A0f.CAf(Message.obtain(message));
            }
        } else {
            this.A03.A04();
            A16(((Boolean) message.obj).booleanValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e0, code lost:
        if (r2 != 106) goto L_0x01e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0y(X.AnonymousClass2BY r16, X.C30971eo r17, X.C62642rj r18, java.util.concurrent.atomic.AtomicReference r19, java.util.concurrent.atomic.AtomicReference r20) {
        /*
            r15 = this;
            X.8cj r0 = r16.A0R()
            boolean r2 = r0.A0R()
            X.1ca r3 = r17.A06()
            r4 = 0
            r1 = 0
        L_0x000e:
            if (r3 == 0) goto L_0x0226
            java.lang.String r0 = "web"
            boolean r0 = X.C29621ca.A07(r3, r0)
            r8 = 500(0x1f4, float:7.0E-43)
            java.lang.String r7 = "code"
            if (r0 == 0) goto L_0x0047
            if (r1 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x0036
            java.lang.String r0 = "error"
            X.1ca r0 = r3.A0K(r0)
            if (r0 == 0) goto L_0x0030
            int r0 = r0.A0A(r7, r8)
            X.AnonymousClass37L.A00(r0)
        L_0x0030:
            X.1ca r3 = r17.A06()
            r1 = 1
            goto L_0x000e
        L_0x0036:
            java.lang.String r1 = "web node given during login without any web ref provided"
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x003f:
            java.lang.String r1 = "multiple web nodes encountered on login"
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0047:
            java.lang.String r0 = "success"
            boolean r0 = X.C29621ca.A07(r3, r0)
            r13 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r11 = "t"
            r9 = -1
            r5 = 0
            if (r0 == 0) goto L_0x00e3
            if (r2 == 0) goto L_0x0064
            if (r1 != 0) goto L_0x0064
            java.lang.String r1 = "web was expected but not seen before success"
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0064:
            java.lang.String r4 = r3.A0O(r11)
            if (r4 == 0) goto L_0x0096
            long r0 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x007f }
            r8 = r18
            r8.A02 = r0     // Catch:{ NumberFormatException -> 0x007f }
            X.11P r2 = r15.A0O     // Catch:{ NumberFormatException -> 0x007f }
            long r6 = r2.A04()     // Catch:{ NumberFormatException -> 0x007f }
            long r6 = r6 / r13
            r8.A01 = r6     // Catch:{ NumberFormatException -> 0x007f }
            r15.A0W(r0)     // Catch:{ NumberFormatException -> 0x007f }
            goto L_0x0096
        L_0x007f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "invalid server time; timeString="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0096:
            java.lang.String r0 = "props"
            int r0 = r3.A0A(r0, r9)
            if (r0 == r9) goto L_0x00a7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = r19
            r1.set(r0)
        L_0x00a7:
            java.lang.String r0 = "abprops"
            int r0 = r3.A0A(r0, r9)
            if (r0 == r9) goto L_0x00b8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = r20
            r1.set(r0)
        L_0x00b8:
            java.lang.Class<com.whatsapp.jid.Jid> r1 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "lid"
            com.whatsapp.jid.Jid r1 = r3.A0F(r1, r0)
            if (r1 == 0) goto L_0x00c7
            X.11S r0 = r15.A0F
            r0.A0J(r1)
        L_0x00c7:
            java.lang.String r0 = "display_name"
            java.lang.String r1 = r3.A0Q(r0, r5)
            if (r1 == 0) goto L_0x00d4
            X.11S r0 = r15.A0F
            r0.A0M(r1)
        L_0x00d4:
            X.188 r1 = r15.A0Y
            X.0z4 r0 = r15.A0R
            A0e(r0, r1, r3)
            X.2su r0 = r15.A07
            if (r0 == 0) goto L_0x00e2
            r0.A03()
        L_0x00e2:
            return
        L_0x00e3:
            java.lang.String r0 = "failure"
            boolean r0 = X.C29621ca.A07(r3, r0)
            if (r0 == 0) goto L_0x020a
            java.lang.String r0 = "reason"
            int r6 = r3.A09(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ConnectionThread/login/failure/reason="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.11S r0 = r15.A0F
            boolean r0 = r0.A0N()
            r12 = 3
            if (r0 == 0) goto L_0x011c
            X.0z4 r0 = r15.A0R
            boolean r0 = r0.A2X()
            if (r0 == 0) goto L_0x011c
            X.1fL r2 = r15.A0M
            long r0 = (long) r6
            r2.A01(r12, r0)
        L_0x011c:
            X.188 r1 = r15.A0Y
            X.0z4 r0 = r15.A0R
            A0e(r0, r1, r3)
            if (r6 < r8) goto L_0x0130
            r0 = 600(0x258, float:8.41E-43)
            if (r6 >= r0) goto L_0x0130
            r1 = 4
            X.1g0 r0 = new X.1g0
            r0.<init>(r1, r6)
            throw r0
        L_0x0130:
            r0 = 416(0x1a0, float:5.83E-43)
            java.lang.String r8 = "violation_reason"
            java.lang.String r10 = "vt"
            java.lang.String r2 = "appeal_token"
            if (r6 == r0) goto L_0x0193
            switch(r6) {
                case 402: goto L_0x01d2;
                case 403: goto L_0x0166;
                case 404: goto L_0x015e;
                case 405: goto L_0x01c3;
                case 406: goto L_0x01b6;
                default: goto L_0x013f;
            }
        L_0x013f:
            r0 = 401(0x191, float:5.62E-43)
            if (r6 != r0) goto L_0x0158
            X.0ve r1 = r15.A0X
            r0 = 3281(0xcd1, float:4.598E-42)
            boolean r0 = r1.A0N(r0)
            if (r0 == 0) goto L_0x0158
            r0 = 9
            X.1g0 r1 = new X.1g0
            r1.<init>(r0, r6)
        L_0x0154:
            A10(r1, r3)
            throw r1
        L_0x0158:
            X.1g0 r1 = new X.1g0
            r1.<init>(r4, r6)
            goto L_0x0154
        L_0x015e:
            r0 = 12
            X.1g0 r1 = new X.1g0
            r1.<init>(r0, r6)
            goto L_0x0154
        L_0x0166:
            r0 = 7
            X.1g0 r1 = new X.1g0
            r1.<init>(r0, r6)
            java.lang.String r0 = "is_eu"
            java.lang.String r0 = r3.A0O(r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r1.isEu = r0
            int r0 = r3.A0A(r10, r4)
            r1.violationType = r0
            java.lang.String r0 = r3.A0Q(r8, r5)
            r1.violationReason = r0
            java.lang.String r0 = r3.A0Q(r2, r5)
            r1.banAppealToken = r0
            java.lang.String r0 = "reg_info"
            java.lang.String r0 = r3.A0Q(r0, r5)
            r1.regInfo = r0
            goto L_0x0154
        L_0x0193:
            r0 = 11
            X.1g0 r1 = new X.1g0
            r1.<init>(r0, r6)
            int r0 = r3.A0A(r10, r4)
            r1.violationType = r0
            java.lang.String r0 = r3.A0Q(r8, r5)
            r1.violationReason = r0
            java.lang.String r0 = "source_acct"
            int r0 = r3.A0A(r0, r9)
            r1.violationSourceAcct = r0
            java.lang.String r0 = r3.A0Q(r2, r5)
            r1.banAppealToken = r0
            goto L_0x0154
        L_0x01b6:
            r0 = 5
            X.1g0 r1 = new X.1g0
            r1.<init>(r0, r6)
            int r0 = r3.A0A(r7, r4)
            r1.code = r0
            throw r1
        L_0x01c3:
            X.1g0 r2 = new X.1g0
            r2.<init>(r12, r6)
            r0 = 0
            long r0 = r3.A0D(r11, r0)
            long r0 = r0 * r13
            r2.expiration_time = r0
            throw r2
        L_0x01d2:
            java.lang.String r4 = r3.A0Q(r2, r5)
            int r2 = r3.A09(r7)
            if (r4 == 0) goto L_0x01e2
            r1 = 106(0x6a, float:1.49E-43)
            r0 = 13
            if (r2 == r1) goto L_0x01e3
        L_0x01e2:
            r0 = 2
        L_0x01e3:
            X.1g0 r1 = new X.1g0
            r1.<init>(r0, r6)
            java.lang.String r0 = "expire"
            int r0 = r3.A09(r0)
            r1.expire_time_out = r0
            int r0 = r3.A09(r7)
            r1.code = r0
            java.lang.String r0 = "message"
            java.lang.String r0 = r3.A0Q(r0, r5)
            r1.banMessage = r0
            java.lang.String r0 = "url"
            java.lang.String r0 = r3.A0Q(r0, r5)
            r1.faqUrl = r0
            r1.banAppealToken = r4
            throw r1
        L_0x020a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "unexpected node received during login sequence; node="
            r1.append(r0)
            java.lang.String r0 = r3.A0N()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0226:
            java.lang.String r1 = "node stream ended unexpectedly"
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31701fz.A0y(X.2BY, X.1eo, X.2rj, java.util.concurrent.atomic.AtomicReference, java.util.concurrent.atomic.AtomicReference):void");
    }

    public static void A12(C59662mg r5, Map map) {
        String[] A032 = r5.A03();
        int length = A032.length;
        int i = 0;
        while (i < length) {
            String str = A032[i];
            if (!map.containsKey(str)) {
                map.put(str, r5);
                i++;
            } else {
                throw new IllegalStateException("ConnectionReader/addStanzaHandler this stanza is already handled");
            }
        }
    }

    public static /* synthetic */ boolean A1B(C166418cr r1) {
        if (C20102A7g.A00(r1) == 0) {
            return true;
        }
        return false;
    }

    public boolean quit() {
        boolean quit = super.quit();
        this.A0f.C2R();
        return quit;
    }

    public C31701fz(C19880zA r4, AnonymousClass195 r5, C22701Cw r6, C31361fR r7, AnonymousClass190 r8, C31691fy r9, AnonymousClass11S r10, AnonymousClass120 r11, AnonymousClass194 r12, AnonymousClass18O r13, AnonymousClass181 r14, C31451fa r15, AnonymousClass1HS r16, C31301fL r17, C22871Dn r18, AnonymousClass11P r19, AnonymousClass118 r20, C24521Kq r21, C19830z4 r22, AnonymousClass11O r23, AnonymousClass1CJ r24, AnonymousClass122 r25, AnonymousClass1Cd r26, C22631Cp r27, C18030ve r28, AnonymousClass188 r29, AnonymousClass18K r30, AnonymousClass126 r31, C31351fQ r32, C31401fV r33, C31281fJ r34, C31601fp r35, C29871d0 r36, C31271fI r37, C31641ft r38, AnonymousClass1OZ r39, C29791cs r40, C31681fx r41, AnonymousClass1O4 r42, C31291fK r43, C31431fY r44, AnonymousClass1N7 r45, C31441fZ r46, AnonymousClass1PT r47, C31411fW r48, C31331fO r49, C31251fG r50, C31061ex r51, C31661fv r52, C31611fq r53, C31371fS r54, C31621fr r55, C31631fs r56, C31311fM r57, C22881Do r58, AnonymousClass1CM r59, C31321fN r60, C31461fb r61, AnonymousClass1W6 r62, C25431Oe r63, AnonymousClass10I r64, AnonymousClass1O1 r65, C29971dB r66, AnonymousClass00H r67, AnonymousClass00H r68, Set set) {
        super("ConnectionThread", 1);
        this.A0f = r36;
        this.A0P = r20;
        this.A0O = r19;
        this.A0X = r28;
        this.A0W = r27;
        this.A0D = r8;
        this.A0F = r10;
        this.A1A = r64;
        this.A0H = r12;
        this.A0J = r14;
        this.A0T = r24;
        this.A0Z = r30;
        this.A0I = r13;
        this.A0B = r6;
        this.A14 = r58;
        this.A0w = r50;
        this.A0l = r39;
        this.A0L = r16;
        this.A0t = r47;
        this.A0g = r37;
        this.A19 = r63;
        this.A0d = r34;
        this.A0p = r43;
        this.A1D = r67;
        this.A1E = r68;
        this.A1C = r66;
        this.A13 = r57;
        this.A09 = r4;
        this.A0U = r25;
        this.A18 = r62;
        this.A0a = r31;
        this.A0G = r11;
        this.A16 = r60;
        this.A0Y = r29;
        this.A0v = r49;
        this.A0b = r32;
        this.A0C = r7;
        this.A0r = r45;
        this.A0m = r40;
        this.A0V = r26;
        this.A0R = r22;
        this.A10 = r54;
        this.A0c = r33;
        this.A0u = r48;
        this.A0q = r44;
        this.A0s = r46;
        this.A0x = r51;
        this.A0K = r15;
        this.A17 = r61;
        this.A1B = r65;
        this.A1H = set;
        this.A0e = r35;
        this.A15 = r59;
        this.A0A = r5;
        this.A0z = r53;
        this.A0o = r42;
        this.A11 = r55;
        this.A12 = r56;
        this.A0S = r23;
        this.A0M = r17;
        this.A0h = r38;
        this.A0Q = r21;
        this.A0y = r52;
        this.A0N = r18;
        this.A0n = r41;
        this.A0E = r9;
        this.A1G = new Random();
    }
}
