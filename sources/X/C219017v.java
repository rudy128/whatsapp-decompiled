package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.17v  reason: invalid class name and case insensitive filesystem */
public class C219017v implements C218917u, C201511a {
    public static CountDownLatch A1A = new CountDownLatch(1);
    public static final AtomicBoolean A1B = new AtomicBoolean();
    public static final long A1C = TimeUnit.MINUTES.toMillis(15);
    public long A00 = -1;
    public long A01 = 0;
    public long A02;
    public BroadcastReceiver A03;
    public HandlerThread A04;
    public UserJid A05;
    public C54412e6 A06;
    public C36281nd A07;
    public C63222si A08;
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C = false;
    public int A0D;
    public int A0E;
    public HandlerThread A0F;
    public final C29841cx A0G;
    public final AnonymousClass11S A0H;
    public final C23651Hc A0I;
    public final AnonymousClass1HS A0J;
    public final C22871Dn A0K;
    public final AnonymousClass11E A0L;
    public final AnonymousClass1R8 A0M;
    public final C29831cw A0N;
    public final AnonymousClass11C A0O;
    public final C29781cr A0P;
    public final AnonymousClass11P A0Q;
    public final AnonymousClass118 A0R;
    public final C18030ve A0S;
    public final AnonymousClass19F A0T;
    public final C23641Hb A0U;
    public final C29771cq A0V;
    public final C29861cz A0W = new C29861cz("message_handler/logged_flag/disconnected", true);
    public final AnonymousClass1O3 A0X;
    public final C29881d1 A0Y;
    public final C29891d2 A0Z;
    public final C30031dH A0a;
    public final AnonymousClass1O4 A0b;
    public final C24451Kj A0c;
    public final AnonymousClass10I A0d;
    public final C29811cu A0e;
    public final AnonymousClass00H A0f;
    public final AnonymousClass00H A0g;
    public final AnonymousClass00H A0h;
    public final AnonymousClass00H A0i;
    public final AnonymousClass00H A0j;
    public final Object A0k = new Object();
    public final AtomicBoolean A0l = new AtomicBoolean();
    public final C18140vp A0m;
    public final Handler A0n;
    public final AnonymousClass195 A0o;
    public final C22701Cw A0p;
    public final C27301Vn A0q;
    public final C29861cz A0r = new C29861cz("message_handler/logged_flag/must_ignore_network_once", false);
    public final C29861cz A0s = new C29861cz("message_handler/logged_flag/must_reconnect", true);
    public final C29791cs A0t;
    public final C29631cb A0u;
    public final AnonymousClass1N7 A0v;
    public final C29851cy A0w;
    public final C29641cc A0x;
    public final AnonymousClass00H A0y;
    public final AnonymousClass00H A0z;
    public final AnonymousClass00H A10;
    public final AnonymousClass00H A11;
    public final Random A12 = new Random();
    public final AtomicBoolean A13 = new AtomicBoolean();
    public final AtomicBoolean A14 = new AtomicBoolean();
    public volatile C31701fz A15;
    public volatile boolean A16 = false;
    public volatile boolean A17;
    public volatile boolean A18;
    public volatile boolean A19;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void A00(X.C54412e6 r11, X.C219017v r12, java.lang.String r13, java.lang.String r14, int r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r4 = 1
            r6 = 0
            if (r17 == 0) goto L_0x0014
            long r0 = r12.A02
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x001d
            long r7 = android.os.SystemClock.elapsedRealtime()
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x001d
        L_0x0014:
            r10 = 0
        L_0x0015:
            X.118 r0 = r12.A0R
            android.content.Context r5 = r0.A00
            java.lang.Object r1 = r12.A0k
            monitor-enter(r1)
            goto L_0x001f
        L_0x001d:
            r10 = 1
            goto L_0x0015
        L_0x001f:
            X.1cz r0 = r12.A0W     // Catch:{ all -> 0x0172 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x0172 }
            r7 = r20
            if (r0 != 0) goto L_0x0075
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0172 }
            if (r0 != 0) goto L_0x0071
            int r3 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x005c }
            int r2 = r12.A0E     // Catch:{ NumberFormatException -> 0x005c }
            if (r3 != r2) goto L_0x004b
            int r0 = r12.A0D     // Catch:{ NumberFormatException -> 0x005c }
            if (r3 == r0) goto L_0x004b
            r12.A0D = r3     // Catch:{ NumberFormatException -> 0x005c }
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.A14     // Catch:{ NumberFormatException -> 0x005c }
            r0.compareAndSet(r6, r7)     // Catch:{ NumberFormatException -> 0x005c }
            X.1nd r2 = r12.A07     // Catch:{ NumberFormatException -> 0x005c }
            X.C17960vV.A07(r2)     // Catch:{ NumberFormatException -> 0x005c }
            r0 = 6
            r2.CHR(r4, r0)     // Catch:{ NumberFormatException -> 0x005c }
            goto L_0x016d
        L_0x004b:
            if (r3 != r2) goto L_0x0071
            X.00H r0 = r12.A0y     // Catch:{ NumberFormatException -> 0x005c }
            java.lang.Object r3 = r0.get()     // Catch:{ NumberFormatException -> 0x005c }
            X.190 r3 = (X.AnonymousClass190) r3     // Catch:{ NumberFormatException -> 0x005c }
            java.lang.String r2 = "double_push_with_same_session_id"
            r0 = 0
            r3.A0G(r2, r0, r6)     // Catch:{ NumberFormatException -> 0x005c }
            goto L_0x0071
        L_0x005c:
            r3 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0172 }
            r2.<init>()     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary invalid sessionId="
            r2.append(r0)     // Catch:{ all -> 0x0172 }
            r2.append(r13)     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0172 }
            com.whatsapp.util.Log.w(r0, r3)     // Catch:{ all -> 0x0172 }
        L_0x0071:
            if (r18 == 0) goto L_0x015f
            goto L_0x0155
        L_0x0075:
            X.1cs r9 = r12.A0t     // Catch:{ all -> 0x0172 }
            monitor-enter(r9)     // Catch:{ all -> 0x0172 }
            X.1ct r8 = r9.A00     // Catch:{ all -> 0x016f }
            int r0 = r8.A00     // Catch:{ all -> 0x016f }
            if (r0 != 0) goto L_0x008a
            if (r15 == 0) goto L_0x008a
            r8.A00 = r15     // Catch:{ all -> 0x016f }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x016f }
            r8.A02 = r2     // Catch:{ all -> 0x016f }
            r8.A01 = r6     // Catch:{ all -> 0x016f }
        L_0x008a:
            monitor-exit(r9)     // Catch:{ all -> 0x0172 }
            if (r16 != 0) goto L_0x0097
            if (r10 != 0) goto L_0x0097
            X.1cz r10 = r12.A0s     // Catch:{ all -> 0x0172 }
            boolean r0 = r10.A00     // Catch:{ all -> 0x0172 }
            if (r0 != 0) goto L_0x00a1
            goto L_0x016d
        L_0x0097:
            X.1cz r10 = r12.A0s     // Catch:{ all -> 0x0172 }
            r10.A00(r4)     // Catch:{ all -> 0x0172 }
            X.1cz r0 = r12.A0r     // Catch:{ all -> 0x0172 }
            r0.A00(r4)     // Catch:{ all -> 0x0172 }
        L_0x00a1:
            boolean r0 = r12.A09     // Catch:{ all -> 0x0172 }
            if (r0 == 0) goto L_0x00ad
            long r2 = r12.A00     // Catch:{ all -> 0x0172 }
            r8 = -1
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00df
        L_0x00ad:
            boolean r0 = r10.A00     // Catch:{ all -> 0x0172 }
            if (r0 == 0) goto L_0x014f
            X.1cz r2 = r12.A0r     // Catch:{ all -> 0x0172 }
            boolean r0 = r2.A00     // Catch:{ all -> 0x0172 }
            if (r0 == 0) goto L_0x014f
            r2.A00(r6)     // Catch:{ all -> 0x0172 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0172 }
            r8.<init>()     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary/network/ignore ("
            r8.append(r0)     // Catch:{ all -> 0x0172 }
            boolean r0 = r12.A09     // Catch:{ all -> 0x0172 }
            r8.append(r0)     // Catch:{ all -> 0x0172 }
            r0 = 44
            r8.append(r0)     // Catch:{ all -> 0x0172 }
            long r2 = r12.A00     // Catch:{ all -> 0x0172 }
            r8.append(r2)     // Catch:{ all -> 0x0172 }
            r0 = 41
            r8.append(r0)     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0172 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0172 }
        L_0x00df:
            boolean r0 = r12.A19     // Catch:{ all -> 0x0172 }
            if (r0 == 0) goto L_0x016d
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.A0l     // Catch:{ all -> 0x0172 }
            r2 = r19
            r0.compareAndSet(r6, r2)     // Catch:{ all -> 0x0172 }
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.A14     // Catch:{ all -> 0x0172 }
            r2.compareAndSet(r6, r7)     // Catch:{ all -> 0x0172 }
            X.2si r0 = r12.A08     // Catch:{ all -> 0x0172 }
            if (r0 == 0) goto L_0x016d
            X.1nd r0 = r12.A07     // Catch:{ all -> 0x0172 }
            if (r0 == 0) goto L_0x016d
            boolean r0 = r12.A0A     // Catch:{ all -> 0x0172 }
            if (r0 != 0) goto L_0x016d
            boolean r0 = r2.getAndSet(r6)     // Catch:{ all -> 0x0172 }
            if (r0 == 0) goto L_0x0122
            X.1Vn r3 = r12.A0q     // Catch:{ all -> 0x0172 }
            java.lang.String r2 = "MessageHandler3"
            r0 = 10
            r3.BEJ(r0, r2)     // Catch:{ all -> 0x0172 }
            X.195 r0 = r12.A0o     // Catch:{ all -> 0x0172 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x0172 }
            if (r0 != 0) goto L_0x0122
            X.00H r0 = r12.A0z     // Catch:{ all -> 0x0172 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x0172 }
            X.6ze r3 = (X.C139916ze) r3     // Catch:{ all -> 0x0172 }
            java.lang.Class<com.whatsapp.service.GcmFGService> r2 = com.whatsapp.service.GcmFGService.class
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0172 }
            r0.<init>()     // Catch:{ all -> 0x0172 }
            r3.A02(r5, r0, r2)     // Catch:{ all -> 0x0172 }
        L_0x0122:
            X.00H r0 = r12.A10     // Catch:{ all -> 0x0172 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0172 }
            X.1ef r0 = (X.C30881ef) r0     // Catch:{ all -> 0x0172 }
            int r3 = r0.A00     // Catch:{ all -> 0x0172 }
            r2 = 3
            r0 = 0
            if (r3 != r2) goto L_0x0131
            r0 = 1
        L_0x0131:
            r6 = r0 ^ 1
            com.whatsapp.jid.UserJid r0 = r12.A05     // Catch:{ all -> 0x0172 }
            if (r0 != 0) goto L_0x0140
            X.1Dn r0 = r12.A0K     // Catch:{ all -> 0x0172 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0172 }
            if (r0 != 0) goto L_0x0140
            r4 = 0
        L_0x0140:
            X.C17960vV.A0C(r4)     // Catch:{ all -> 0x0172 }
            X.1nd r2 = r12.A07     // Catch:{ all -> 0x0172 }
            com.whatsapp.jid.UserJid r3 = r12.A05     // Catch:{ all -> 0x0172 }
            boolean r7 = r12.A16     // Catch:{ all -> 0x0172 }
            r4 = r11
            r5 = r14
            r2.CHN(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0172 }
            goto L_0x016d
        L_0x014f:
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary/network_unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0172 }
            goto L_0x016d
        L_0x0155:
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary/not_disconnected/check_connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0172 }
            X.1cq r0 = r12.A0V     // Catch:{ all -> 0x0172 }
            r0.A08()     // Catch:{ all -> 0x0172 }
        L_0x015f:
            X.1cs r0 = r12.A0t     // Catch:{ all -> 0x0172 }
            boolean r0 = r0.A03()     // Catch:{ all -> 0x0172 }
            if (r0 == 0) goto L_0x016d
            X.1cu r2 = r12.A0e     // Catch:{ all -> 0x0172 }
            r0 = 2
            X.C29811cu.A01(r2, r0)     // Catch:{ all -> 0x0172 }
        L_0x016d:
            monitor-exit(r1)     // Catch:{ all -> 0x0172 }
            return
        L_0x016f:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0172 }
            throw r0     // Catch:{ all -> 0x0172 }
        L_0x0172:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0172 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219017v.A00(X.2e6, X.17v, java.lang.String, java.lang.String, int, boolean, boolean, boolean, boolean, boolean):void");
    }

    public static void A06(C219017v r6, boolean z, boolean z2, boolean z3) {
        C54412e6 r0;
        C219017v r1 = r6;
        if (r6.A0K.A02()) {
            r0 = r6.A06;
        } else {
            r0 = null;
        }
        A00(r0, r1, (String) null, (String) null, 0, z, z2, z3, false, false);
    }

    public void A07() {
        Message obtain = Message.obtain((Handler) null, 0);
        obtain.getData().putBoolean("should_register", true);
        this.A0Z.sendMessage(obtain);
    }

    public void A08() {
        Message obtain = Message.obtain((Handler) null, 0);
        obtain.getData().putBoolean("should_register", false);
        this.A0Z.sendMessage(obtain);
    }

    public void A09() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("long_connect", true);
        this.A0Z.sendMessage(Message.obtain((Handler) null, 3, bundle));
        A0B(0, true, false, false, false);
    }

    public void A0A(int i) {
        Message obtain = Message.obtain((Handler) null, 2);
        obtain.getData().putBoolean("force", true);
        obtain.getData().putInt("connect_reason", i);
        if (this.A13.getAndSet(false)) {
            if (C18020vd.A05(C18040vf.A02, this.A0S, 10846)) {
                obtain.getData().putBoolean("fgservice", true);
            }
        }
        this.A0Z.sendMessage(obtain);
    }

    public void A0B(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        A0E((String) null, (String) null, i, z, z2, z3, z4, false, false);
    }

    public void A0D(C54412e6 r5) {
        Message obtain = Message.obtain((Handler) null, 0, r5);
        obtain.getData().putBoolean("should_register", true);
        this.A0Z.sendMessage(obtain);
    }

    public void A0E(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Message obtain = Message.obtain((Handler) null, 2);
        obtain.getData().putBoolean("force", z);
        obtain.getData().putBoolean("force_no_ongoing_backoff", z2);
        obtain.getData().putBoolean("reset", z3);
        obtain.getData().putBoolean("check_connection", z4);
        obtain.getData().putBoolean("notify_on_failure", z5);
        obtain.getData().putString("ip_address", str);
        obtain.getData().putString("cl_sess", str2);
        obtain.getData().putBoolean("fgservice", z6);
        obtain.getData().putInt("connect_reason", i);
        this.A0Z.sendMessage(obtain);
    }

    public /* synthetic */ void BzP() {
    }

    public /* synthetic */ void BzQ(Integer num, Integer num2) {
    }

    public static void A01(C219017v r3) {
        synchronized (r3.A0k) {
            r3.A0s.A00(!r3.A0t.A03());
        }
    }

    public static void A02(C219017v r3) {
        if (!r3.A19) {
            Log.i("MessageHandler/start");
            r3.A19 = true;
            if (C18020vd.A05(C18040vf.A02, r3.A0S, 12799)) {
                r3.A0d.CGN(new C449025f((Object) r3, 47));
                return;
            }
            r3.A15 = r3.A0G.A00(r3.A0Y);
            r3.A15.start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (r1 == false) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C219017v r9, int r10, boolean r11) {
        /*
            X.1cq r7 = r9.A0V
            long r2 = r7.A0K
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x000c
            r0 = 1
        L_0x000c:
            r5 = 1
            if (r0 == 0) goto L_0x0010
            r11 = 1
        L_0x0010:
            X.1N7 r4 = r9.A0v
            monitor-enter(r4)
            X.0ve r2 = r4.A00     // Catch:{ all -> 0x0180 }
            X.0vf r1 = X.C18040vf.A01     // Catch:{ all -> 0x0180 }
            r0 = 4923(0x133b, float:6.899E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "LoggableStanzaCache/clearNonMessageStanzas"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0180 }
            java.util.Map r0 = r4.A04     // Catch:{ all -> 0x0180 }
            r0.clear()     // Catch:{ all -> 0x0180 }
            java.util.Map r0 = r4.A02     // Catch:{ all -> 0x0180 }
            r0.clear()     // Catch:{ all -> 0x0180 }
            java.util.Map r0 = r4.A03     // Catch:{ all -> 0x0180 }
            r0.clear()     // Catch:{ all -> 0x0180 }
        L_0x0033:
            X.1N6 r2 = r4.A01     // Catch:{ all -> 0x0180 }
            r1 = 27
            X.AWq r0 = new X.AWq     // Catch:{ all -> 0x0180 }
            r0.<init>(r1)     // Catch:{ all -> 0x0180 }
            r2.notifyAllObservers(r0)     // Catch:{ all -> 0x0180 }
            goto L_0x0057
        L_0x0040:
            java.lang.String r0 = "LoggableStanzaCache/clear"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0180 }
            int[] r3 = r4.A05     // Catch:{ all -> 0x0180 }
            r2 = 4
            r1 = 0
        L_0x0049:
            r0 = r3[r1]     // Catch:{ all -> 0x0180 }
            java.util.Map r0 = r4.A02(r0)     // Catch:{ all -> 0x0180 }
            r0.clear()     // Catch:{ all -> 0x0180 }
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x0033
            goto L_0x0049
        L_0x0057:
            monitor-exit(r4)
            X.118 r0 = r9.A0R
            android.content.Context r2 = r0.A00
            java.lang.Object r4 = r9.A0k
            monitor-enter(r4)
            X.1cz r0 = r9.A0W     // Catch:{ all -> 0x017d }
            r0.A00(r5)     // Catch:{ all -> 0x017d }
            X.2si r0 = r9.A08     // Catch:{ all -> 0x017d }
            r0.A02()     // Catch:{ all -> 0x017d }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x017d }
            r0 = 26
            if (r1 < r0) goto L_0x0071
            if (r11 != 0) goto L_0x0081
        L_0x0071:
            X.1cb r3 = r9.A0u     // Catch:{ all -> 0x017d }
            r0 = 0
            X.C18070vi.A0d(r2, r0)     // Catch:{ all -> 0x017d }
            r1 = 14
            X.3Bs r0 = new X.3Bs     // Catch:{ all -> 0x017d }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x017d }
            X.C29631cb.A02(r3, r0)     // Catch:{ all -> 0x017d }
        L_0x0081:
            X.1O3 r3 = r9.A0X     // Catch:{ all -> 0x017d }
            java.lang.String r1 = "disconnected"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x017d }
            r0.<init>(r1)     // Catch:{ all -> 0x017d }
            r3.A01(r0)     // Catch:{ all -> 0x017d }
            X.1O4 r3 = r9.A0b     // Catch:{ all -> 0x017d }
            X.1nd r0 = r9.A07     // Catch:{ all -> 0x017d }
            r6 = 0
            if (r0 == 0) goto L_0x009b
            boolean r1 = r0.Bcm()     // Catch:{ all -> 0x017d }
            r0 = 1
            if (r1 != 0) goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            r3.A06(r0)     // Catch:{ all -> 0x017d }
            X.00H r0 = r9.A0g     // Catch:{ all -> 0x017d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x017d }
            X.1OZ r0 = (X.AnonymousClass1OZ) r0     // Catch:{ all -> 0x017d }
            r0.A0D()     // Catch:{ all -> 0x017d }
            X.10s r3 = r7.A0F     // Catch:{ all -> 0x017d }
            r1 = 35
            X.3Br r0 = new X.3Br     // Catch:{ all -> 0x017d }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x017d }
            r3.execute(r0)     // Catch:{ all -> 0x017d }
            X.00H r0 = r9.A11     // Catch:{ all -> 0x017d }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x017d }
            X.2jl r3 = (X.C57862jl) r3     // Catch:{ all -> 0x017d }
            X.0vl r0 = r3.A03     // Catch:{ all -> 0x017d }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x017d }
            android.os.Handler r1 = (android.os.Handler) r1     // Catch:{ all -> 0x017d }
            X.0vl r0 = r3.A04     // Catch:{ all -> 0x017d }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x017d }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x017d }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x017d }
            X.1cu r0 = r9.A0e     // Catch:{ all -> 0x017d }
            r7 = 3
            X.C29811cu.A01(r0, r7)     // Catch:{ all -> 0x017d }
            X.00H r0 = r9.A0z     // Catch:{ all -> 0x017d }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x017d }
            X.6ze r1 = (X.C139916ze) r1     // Catch:{ all -> 0x017d }
            java.lang.Class<com.whatsapp.service.GcmFGService> r0 = com.whatsapp.service.GcmFGService.class
            boolean r0 = r1.A03(r2, r0)     // Catch:{ all -> 0x017d }
            if (r0 != 0) goto L_0x00ef
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A14     // Catch:{ all -> 0x017d }
            boolean r0 = r0.getAndSet(r6)     // Catch:{ all -> 0x017d }
            if (r0 == 0) goto L_0x00f7
        L_0x00ef:
            r0 = 6
            if (r10 != r0) goto L_0x00f7
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A13     // Catch:{ all -> 0x017d }
            r0.compareAndSet(r6, r5)     // Catch:{ all -> 0x017d }
        L_0x00f7:
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A0l     // Catch:{ all -> 0x017d }
            boolean r0 = r0.getAndSet(r6)     // Catch:{ all -> 0x017d }
            if (r0 == 0) goto L_0x0167
            r0 = 2131899103(0x7f1232df, float:1.9433143E38)
            java.lang.String r8 = r2.getString(r0)     // Catch:{ all -> 0x017d }
            X.73t r3 = X.C217217d.A03(r2)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "failure_notifications@1"
            r3.A0M = r0     // Catch:{ all -> 0x017d }
            r1 = 2131893003(0x7f121b0b, float:1.942077E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x017d }
            r0[r6] = r8     // Catch:{ all -> 0x017d }
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ all -> 0x017d }
            r3.A0F(r0)     // Catch:{ all -> 0x017d }
            X.11P r0 = r9.A0Q     // Catch:{ all -> 0x017d }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x017d }
            r3.A09(r0)     // Catch:{ all -> 0x017d }
            r3.A06(r7)     // Catch:{ all -> 0x017d }
            r3.A0G(r5)     // Catch:{ all -> 0x017d }
            r3.A0E(r8)     // Catch:{ all -> 0x017d }
            r0 = 2131893004(0x7f121b0c, float:1.9420772E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x017d }
            r3.A0D(r0)     // Catch:{ all -> 0x017d }
            android.content.Intent r0 = X.AnonymousClass1LU.A0A(r2)     // Catch:{ all -> 0x017d }
            android.app.PendingIntent r0 = X.C1408573i.A00(r2, r5, r0, r6)     // Catch:{ all -> 0x017d }
            r3.A0A = r0     // Catch:{ all -> 0x017d }
            r1 = 2131231578(0x7f08035a, float:1.807924E38)
            android.app.Notification r0 = r3.A08     // Catch:{ all -> 0x017d }
            r0.icon = r1     // Catch:{ all -> 0x017d }
            X.1Vn r2 = r9.A0q     // Catch:{ all -> 0x017d }
            android.app.Notification r1 = r3.A05()     // Catch:{ all -> 0x017d }
            r0 = 10
            r2.BkR(r0, r1)     // Catch:{ all -> 0x017d }
            X.1cc r3 = r9.A0x     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "Scheduling job to restore chat connection"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x017d }
            X.10I r2 = r3.A02     // Catch:{ all -> 0x017d }
            r1 = 30
            X.7Qo r0 = new X.7Qo     // Catch:{ all -> 0x017d }
            r0.<init>((java.lang.Object) r3, (int) r1)     // Catch:{ all -> 0x017d }
            r2.CGN(r0)     // Catch:{ all -> 0x017d }
        L_0x0167:
            if (r11 == 0) goto L_0x0174
            X.1dH r0 = r9.A0a     // Catch:{ all -> 0x017d }
            boolean r0 = r0.isConnected()     // Catch:{ all -> 0x017d }
            if (r0 == 0) goto L_0x0176
            A05(r9, r6)     // Catch:{ all -> 0x017d }
        L_0x0174:
            monitor-exit(r4)     // Catch:{ all -> 0x017d }
            goto L_0x017c
        L_0x0176:
            X.1cz r0 = r9.A0s     // Catch:{ all -> 0x017d }
            r0.A00(r5)     // Catch:{ all -> 0x017d }
            goto L_0x0174
        L_0x017c:
            return
        L_0x017d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x017d }
            throw r0
        L_0x0180:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219017v.A03(X.17v, int, boolean):void");
    }

    public static void A04(C219017v r21, Integer num, int i, boolean z, boolean z2) {
        C188099gs r9;
        C200710s r8;
        int i2;
        AnonymousClass1BI r82;
        C219017v r6 = r21;
        Context context = r6.A0R.A00;
        synchronized (r6.A0k) {
            r6.A0W.A00(false);
            r6.A0d.CGN(new C70643By(r6, num, 33));
            C29851cy r7 = r6.A0w;
            r7.A02.CGL(new C21433Ak0(r7, r6.A0p.A0J(), 48), "sendKeystoreAttestation");
            if (!r6.A09 && Build.VERSION.SDK_INT < 29) {
                r6.A09 = r6.A0a.isConnected();
                Log.i("MessageHandler/handleConnected setting isNetworkUp to true");
            }
            int i3 = i;
            r6.A0E = i3;
            ((C29971dB) r6.A0j.get()).A06 = Integer.valueOf(i3);
            boolean z3 = z;
            if (!r6.A0K.A02()) {
                C63222si r72 = r6.A08;
                r72.A08.A04();
                C23651Hc r4 = (C23651Hc) r72.A0w.get();
                r4.A05 = 2;
                r4.A01 = true;
                r4.A06 = z3;
                r4.A02.open();
                r4.A03.CGP(new C70613Bu(r4, 14));
                AnonymousClass00H r1 = r72.A0Q;
                ((C216316u) r1.get()).A00.set(false);
                ((C54512eG) r72.A0N.get()).A02 = false;
                ((C216316u) r1.get()).A01.set(false);
                AnonymousClass00H r10 = r72.A0O;
                AnonymousClass1O2 r12 = (AnonymousClass1O2) r10.get();
                Map map = r12.A03;
                synchronized (map) {
                    try {
                        Log.i("in-flight-messages/clearInFlightMessages");
                        for (Pair pair : map.values()) {
                            AnonymousClass1O0 r83 = r12.A00;
                            AnonymousClass206 r2 = (AnonymousClass206) pair.second;
                            C18070vi.A0d(r2, 0);
                            r83.notifyAllObservers(new AnonymousClass35V(r2, 30));
                        }
                        map.clear();
                        r12.A01.A01("message_send", false);
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                            break;
                        }
                    }
                }
                C32501hI r13 = (C32501hI) r72.A0e.get();
                synchronized (r13) {
                    try {
                        r13.A08.clear();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                AnonymousClass120 r22 = (AnonymousClass120) r72.A0Y.get();
                synchronized (r22) {
                    try {
                        r22.A01 = false;
                        r22.A00 = 0;
                        AnonymousClass120.A01(r22, 0);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                Log.i("server connected");
                AnonymousClass00H r24 = r72.A0s;
                C19830z4 r92 = (C19830z4) r24.get();
                C19830z4.A00(r92).putBoolean("spam_banned", false).apply();
                r92.A1q("spam_banned_expiry_timestamp", 0);
                C19830z4.A00((C19830z4) r24.get()).putBoolean("underage_account_banned", false).apply();
                C24421Kg r84 = (C24421Kg) r72.A0k.get();
                r84.A0K = true;
                C24421Kg.A07(r84);
                AnonymousClass00H r85 = r72.A0R;
                if (!((AnonymousClass11S) r85.get()).A0N()) {
                    AnonymousClass11S r23 = (AnonymousClass11S) r85.get();
                    r23.A0I();
                    if (r23.A0E != null) {
                        r72.A09.CGF(new C70593Bs(r72, 4));
                    }
                }
                AnonymousClass10I r25 = r72.A09;
                r25.CGF(new C70593Bs(r72, 5));
                C145887Mz r11 = (C145887Mz) r72.A0o.get();
                r11.getClass();
                r25.CGF(new C70593Bs(r11, 6));
                C19880zA r93 = r72.A01;
                if (r93.A07()) {
                    r93.A03();
                    th = new NullPointerException("isOnlyPremiumFeatureEnabled");
                    throw th;
                }
                AnonymousClass1U4 r112 = (AnonymousClass1U4) r72.A0J.get();
                r112.getClass();
                r25.CGF(new C70593Bs(r112, 7));
                if (((AnonymousClass1Cd) r72.A0X.get()).A07) {
                    if (C18020vd.A05(C18040vf.A02, r72.A06, 7883)) {
                        C34641kp r122 = (C34641kp) r72.A0p.get();
                        AnonymousClass2PG r94 = r122.A00;
                        if (r94 != null) {
                            r94.A0B(true);
                        }
                        AnonymousClass2PG r113 = new AnonymousClass2PG(r122);
                        r122.A00 = r113;
                        r122.A0C.CGD(r113, new Void[0]);
                    } else {
                        r25.CGF(new C70593Bs(r72, 8));
                    }
                }
                AnonymousClass00H r15 = r72.A0S;
                AnonymousClass1OZ r123 = (AnonymousClass1OZ) r15.get();
                C25381Nz r114 = r123.A06;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = r114.A01;
                synchronized (linkedHashMap2) {
                    AnonymousClass2U3.A00(linkedHashMap2, linkedHashMap);
                    StringBuilder sb = new StringBuilder();
                    sb.append("unacked-messages/getUnackedMessages: ");
                    sb.append(linkedHashMap.size());
                    Log.i(sb.toString());
                }
                AnonymousClass1OZ.A05(r123, linkedHashMap);
                AnonymousClass1OZ.A05(r123, r114.A01());
                AnonymousClass1KB r115 = r72.A03;
                r115.CGP(new C70593Bs(r72, 9));
                List list = ((AnonymousClass1O2) r10.get()).A02;
                synchronized (list) {
                    try {
                        if (!list.isEmpty()) {
                            ArrayList arrayList = new ArrayList(list);
                            list.clear();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("in-flight-messages/for-each/send-pending-requests: ");
                            sb2.append(arrayList.size());
                            Log.i(sb2.toString());
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C54972f0 r95 = (C54972f0) it.next();
                                String str = r95.A02;
                                Message message = r95.A00;
                                boolean z4 = r95.A03;
                                C26971Uf r102 = r95.A01;
                                AnonymousClass1OZ r96 = (AnonymousClass1OZ) r15.get();
                                if (z4) {
                                    C17960vV.A07(str);
                                    if (r102 != null) {
                                        C18070vi.A0d(str, 1);
                                        Message message2 = message;
                                        AnonymousClass1OZ.A02(message2, r96, r102, str, 0, true);
                                    } else {
                                        r96.A0F(message, str);
                                    }
                                } else {
                                    r96.A0G(message, str);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                AnonymousClass00H r103 = r72.A0a;
                if (((C30881ef) r103.get()).A00 != 3) {
                    AnonymousClass1RX A002 = ((AnonymousClass1RW) r72.A0G.get()).A00();
                    if (A002.A01 && (r82 = (AnonymousClass1BI) A002.A00().getContact().A06(AnonymousClass1BI.class)) != null) {
                        r115.CGP(new C70643By(r72, r82, 34));
                    }
                }
                boolean z5 = false;
                if (((C30881ef) r103.get()).A00 == 3) {
                    z5 = true;
                }
                if (z2 == z5) {
                    if (((C30881ef) r103.get()).A00 != 3) {
                        r9 = (C188099gs) r72.A0g.get();
                        r8 = r9.A05;
                        i2 = 31;
                    } else if (((C30881ef) r103.get()).A00 == 3) {
                        r9 = (C188099gs) r72.A0g.get();
                        r8 = r9.A05;
                        i2 = 32;
                    }
                    r8.execute(new C21448AkF(r9, i2));
                }
                if (((AnonymousClass11O) r72.A0t.get()).A02()) {
                    ((C19830z4) r24.get()).A21(true);
                    r25.CGF(new C70583Br(r72, 45));
                }
                if (((SharedPreferences) ((C19830z4) r24.get()).A00.get()).getBoolean("future_proof_processing_needed", false)) {
                    C56262hB r86 = (C56262hB) r72.A0M.get();
                    r86.A0G.CGL(new C70583Br(r86, 41), "FutureProofMessageHandler/processFutureMessages");
                }
                if (C18020vd.A00(C18040vf.A02, r72.A06, 7018) == 600) {
                    r72.A07.CHJ(false);
                }
            } else {
                C23651Hc r42 = r6.A0I;
                r42.A05 = 2;
                r42.A01 = true;
                r42.A06 = z3;
                r42.A02.open();
                r42.A03.CGP(new C70613Bu(r42, 14));
            }
            C29631cb r26 = r6.A0u;
            C18070vi.A0d(context, 0);
            C29631cb.A02(r26, new C70593Bs(context, 13));
            C29791cs r27 = r6.A0t;
            if (r27.A03()) {
                C29811cu.A01(r6.A0e, 1);
            }
            r6.A0c.A02();
            A01(r6);
            C29771cq r43 = r6.A0V;
            C36281nd r3 = r6.A07;
            r43.A04 = r27.A03();
            r43.A0F.execute(new C70643By(r43, r3, 17));
            ((C57862jl) r6.A11.get()).A00();
            r6.A0q.BEJ(10, "MessageHandler1");
        }
    }

    public void A0C(long j, boolean z, boolean z2) {
        Handler handler = this.A0n;
        Message obtain = Message.obtain(handler, 0, z ? 1 : 0, 0);
        Bundle data = obtain.getData();
        data.putLong("networkId", j);
        data.putBoolean("networkIsBlocked", z2);
        handler.sendMessage(obtain);
    }

    public void A0F(boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("MessageHandler/service/stop/unregister:");
        sb.append(z);
        sb.append(" logoutReason=");
        sb.append(i);
        Log.i(sb.toString());
        C23651Hc r1 = this.A0I;
        r1.A07 = false;
        r1.A04 = i;
        Message obtain = Message.obtain((Handler) null, 1);
        Bundle data = obtain.getData();
        data.putBoolean("should_unregister", z);
        data.putInt("logoutReason", i);
        this.A0Z.sendMessage(obtain);
    }

    public void A0G(boolean z, boolean z2) {
        Context context = this.A0R.A00;
        AlarmManager A052 = this.A0O.A05();
        if (A052 != null) {
            Intent intent = new Intent("com.whatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION").setPackage("com.whatsapp");
            if (!z) {
                PendingIntent A012 = C1408573i.A01(context, 0, intent, 536870912);
                if (A012 != null) {
                    Log.i("MessageHandler/onCaptivePortalDetectionAndWaitDone retry alarm canceled");
                    A052.cancel(A012);
                    A012.cancel();
                }
            } else if (!z2) {
                if (this.A03 == null) {
                    AnonymousClass2DQ r2 = new AnonymousClass2DQ(this, 0);
                    this.A03 = r2;
                    this.A0N.A01(context, r2, new IntentFilter("com.whatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION"), false);
                }
                this.A0M.A00(C1408573i.A01(context, 0, intent, 134217728), 2, SystemClock.elapsedRealtime() + 60000);
                Log.i("MessageHandler/onCaptivePortalDetectionAndWaitDone retry alarm set for 60000ms from now");
                return;
            }
        } else {
            Log.w("MessageHandler/onCaptivePortalDetectionAndWaitDone AlarmManager is null");
        }
        A1B.set(z);
        A1A.countDown();
    }

    public void BzR() {
        if (this.A15 != null) {
            this.A15.A1C();
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void A05(X.C219017v r11, boolean r12) {
        /*
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r11.A02
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0016
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0016
            java.lang.String r0 = "MessageHandler/scheduleReconnect/already-pending"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0016:
            X.118 r0 = r11.A0R
            android.content.Context r7 = r0.A00
            boolean r0 = r11.A0C
            if (r0 == 0) goto L_0x0028
            X.1Kj r0 = r11.A0c
            long r3 = r11.A01
            r0.A03(r3)
            r0 = 0
            r11.A0C = r0
        L_0x0028:
            X.1Kj r0 = r11.A0c
            long r9 = r0.A01()
            long r3 = r0.A00()
            r11.A01 = r3
            r3 = 10000(0x2710, double:4.9407E-320)
            long r9 = r9 * r3
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "MessageHandler/scheduleReconnect/immediate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r11.A0A(r0)
            return
        L_0x0045:
            java.util.Random r8 = r11.A12
            long r5 = r8.nextLong()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r5 = r5 & r3
            r3 = 2
            long r3 = r9 / r3
            long r5 = r5 % r9
            long r3 = r3 + r5
            if (r12 == 0) goto L_0x0072
            long r5 = A1C
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0072
            r0 = 60
            int r0 = r8.nextInt(r0)
            int r0 = r0 + -30
            long r3 = (long) r0
            long r5 = r5 + r3
            java.lang.String r0 = "MessageHandler/scheduleReconnect/backoff clamped to ~15mins"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x006e:
            java.lang.Object r8 = r11.A0k
            monitor-enter(r8)
            goto L_0x0074
        L_0x0072:
            r5 = r3
            goto L_0x006e
        L_0x0074:
            boolean r0 = r11.A0B     // Catch:{ all -> 0x00c8 }
            if (r0 != 0) goto L_0x0087
            X.10I r4 = r11.A0d     // Catch:{ all -> 0x00c8 }
            r3 = 32
            X.3By r0 = new X.3By     // Catch:{ all -> 0x00c8 }
            r0.<init>(r11, r7, r3)     // Catch:{ all -> 0x00c8 }
            r4.CGF(r0)     // Catch:{ all -> 0x00c8 }
            r0 = 1
            r11.A0B = r0     // Catch:{ all -> 0x00c8 }
        L_0x0087:
            monitor-exit(r8)     // Catch:{ all -> 0x00c8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "MessageHandler/scheduleReconnect backoff="
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "com.whatsapp.MessageHandler.RECONNECT_ACTION"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            java.lang.String r0 = "com.whatsapp"
            android.content.Intent r4 = r3.setPackage(r0)
            java.lang.String r3 = "connect_reason"
            r0 = 3
            r4.putExtra(r3, r0)
            r0 = 0
            android.app.PendingIntent r4 = X.C1408573i.A01(r7, r0, r4, r0)
            long r1 = r1 + r5
            X.1R8 r3 = r11.A0M
            r0 = 2
            boolean r0 = r3.A00(r4, r0, r1)
            if (r0 != 0) goto L_0x00c5
            java.lang.String r0 = "MessageHandler/scheduleReconnect AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1 = 0
        L_0x00c5:
            r11.A02 = r1
            return
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00c8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219017v.A05(X.17v, boolean):void");
    }

    public C219017v(AnonymousClass195 r10, C22701Cw r11, C29841cx r12, AnonymousClass11S r13, C23651Hc r14, AnonymousClass1HS r15, C22871Dn r16, AnonymousClass11E r17, AnonymousClass1R8 r18, C29831cw r19, AnonymousClass11C r20, C29781cr r21, AnonymousClass11P r22, AnonymousClass118 r23, C27301Vn r24, C18030ve r25, AnonymousClass19F r26, C23641Hb r27, C29771cq r28, AnonymousClass1O3 r29, C29791cs r30, C29631cb r31, AnonymousClass1O4 r32, AnonymousClass1N7 r33, C29851cy r34, C29641cc r35, AnonymousClass10I r36, C29811cu r37, AnonymousClass00H r38, AnonymousClass00H r39, AnonymousClass00H r40, AnonymousClass00H r41, AnonymousClass00H r42, AnonymousClass00H r43, AnonymousClass00H r44, AnonymousClass00H r45, AnonymousClass00H r46, C18140vp r47) {
        Looper mainLooper;
        C30031dH r3;
        Boolean bool = C17960vV.A01;
        this.A0R = r23;
        this.A0Q = r22;
        C18030ve r5 = r25;
        this.A0S = r5;
        this.A0M = r18;
        this.A0H = r13;
        this.A0d = r36;
        this.A0y = r38;
        this.A0g = r39;
        this.A0J = r15;
        this.A0T = r26;
        this.A0O = r20;
        this.A10 = r40;
        this.A0z = r41;
        this.A0I = r14;
        this.A0V = r28;
        this.A0f = r46;
        this.A0U = r27;
        this.A0P = r21;
        this.A11 = r42;
        this.A0v = r33;
        this.A0t = r30;
        this.A0i = r43;
        this.A0e = r37;
        this.A0N = r19;
        this.A0j = r44;
        this.A0q = r24;
        this.A0X = r29;
        this.A0G = r12;
        this.A0o = r10;
        this.A0L = r17;
        this.A0b = r32;
        this.A0x = r35;
        this.A0K = r16;
        this.A0m = r47;
        this.A0p = r11;
        this.A0w = r34;
        this.A0h = r45;
        this.A0u = r31;
        this.A0c = new C24451Kj(1, 17280);
        if (C18020vd.A05(C18040vf.A02, r5, 9606)) {
            HandlerThread handlerThread = new HandlerThread("MessageHandlerThread");
            this.A0F = handlerThread;
            handlerThread.start();
            mainLooper = this.A0F.getLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.A0Y = new C29881d1(mainLooper, this);
        this.A0Z = new C29891d2(mainLooper, this);
        this.A0n = new C29901d3(mainLooper, this);
        if (Build.VERSION.SDK_INT >= 29) {
            r3 = new C30041dI(this.A0O, this.A0P, this, (C29971dB) this.A0j.get());
        } else {
            AnonymousClass118 r8 = this.A0R;
            C29781cr r7 = this.A0P;
            C29831cw r6 = this.A0N;
            r3 = new AnonymousClass34U(this.A0L, (C24431Kh) this.A0i.get(), r6, r7, r8, this);
        }
        this.A0a = r3;
    }
}
