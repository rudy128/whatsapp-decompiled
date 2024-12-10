package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Cyd  reason: case insensitive filesystem */
public class C26377Cyd implements Handler.Callback {
    public static C26377Cyd A0F;
    public static final Status A0G = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status A0H = new Status(4, "The user must be signed in to make this API call.");
    public static final Object A0I = C17880vN.A0p();
    public long A00 = 10000;
    public BZQ A01 = null;
    public E5H A02;
    public boolean A03 = false;
    public C23039BaG A04;
    public final Context A05;
    public final Handler A06;
    public final C41381wH A07;
    public final C25651Cjh A08;
    public final Map A09 = new ConcurrentHashMap(5, 0.75f, 1);
    public final Set A0A = new AnonymousClass016(0);
    public final AtomicInteger A0B = new AtomicInteger(1);
    public final AtomicInteger A0C = new AtomicInteger(0);
    public final Set A0D = new AnonymousClass016(0);
    public volatile boolean A0E = true;

    public static final void A05(C26126Cso cso, C26377Cyd cyd, TaskCompletionSource taskCompletionSource, int i) {
        long currentTimeMillis;
        long elapsedRealtime;
        int i2 = i;
        if (i != 0) {
            C25121CYu cYu = cso.A06;
            C26377Cyd cyd2 = cyd;
            if (cyd.A08()) {
                C23087Bb2 bb2 = C25942Cp8.A00().A00;
                if (bb2 != null) {
                    if (bb2.A03) {
                        boolean z = bb2.A04;
                        C26910DIr dIr = (C26910DIr) cyd.A09.get(cYu);
                        if (dIr != null) {
                            EDS eds = dIr.A04;
                            if (eds instanceof C26157CtR) {
                                C26157CtR ctR = (C26157CtR) eds;
                                if (ctR.A0Q != null && !ctR.BeN()) {
                                    C23090Bb5 A002 = C26948DKd.A00(dIr, ctR, i);
                                    if (A002 != null) {
                                        dIr.A00++;
                                        z = A002.A03;
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        if (!z) {
                            currentTimeMillis = 0;
                            elapsedRealtime = 0;
                            C26948DKd dKd = new C26948DKd(cYu, cyd2, i2, currentTimeMillis, elapsedRealtime);
                            zzw zzw = taskCompletionSource.zza;
                            Handler handler = cyd2.A06;
                            handler.getClass();
                            zzw.addOnCompleteListener((Executor) new C27135DVw(handler), (OnCompleteListener) dKd);
                        }
                    } else {
                        return;
                    }
                }
                currentTimeMillis = System.currentTimeMillis();
                elapsedRealtime = SystemClock.elapsedRealtime();
                C26948DKd dKd2 = new C26948DKd(cYu, cyd2, i2, currentTimeMillis, elapsedRealtime);
                zzw zzw2 = taskCompletionSource.zza;
                Handler handler2 = cyd2.A06;
                handler2.getClass();
                zzw2.addOnCompleteListener((Executor) new C27135DVw(handler2), (OnCompleteListener) dKd2);
            }
        }
    }

    public static Status A00(C23203Bcx bcx, C25121CYu cYu) {
        String str = cYu.A00.A02;
        String valueOf = String.valueOf(bcx);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("API: ");
        A10.append(str);
        return new Status(bcx.A02, bcx, AnonymousClass001.A1H(" is not available on this device. Connection failed with: ", valueOf, A10), 17);
    }

    public static C26377Cyd A01(Context context) {
        C26377Cyd cyd;
        HandlerThread handlerThread;
        synchronized (A0I) {
            cyd = A0F;
            if (cyd == null) {
                synchronized (C26122Csk.A07) {
                    handlerThread = C26122Csk.A05;
                    if (handlerThread == null) {
                        HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                        C26122Csk.A05 = handlerThread2;
                        handlerThread2.start();
                        handlerThread = C26122Csk.A05;
                    }
                }
                cyd = new C26377Cyd(context.getApplicationContext(), handlerThread.getLooper(), C41381wH.A00);
                A0F = cyd;
            }
        }
        return cyd;
    }

    private final C26910DIr A02(C26126Cso cso) {
        Map map = this.A09;
        C25121CYu cYu = cso.A06;
        C26910DIr dIr = (C26910DIr) map.get(cYu);
        if (dIr == null) {
            dIr = new C26910DIr(cso, this);
            map.put(cYu, dIr);
        }
        if (dIr.A04.CFe()) {
            this.A0D.add(cYu);
        }
        dIr.A09();
        return dIr;
    }

    public static void A03() {
        synchronized (A0I) {
            C26377Cyd cyd = A0F;
            if (cyd != null) {
                cyd.A0C.incrementAndGet();
                Handler handler = cyd.A06;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [X.Cso, X.E5H] */
    private final void A04() {
        C23039BaG baG = this.A04;
        if (baG != null) {
            if (baG.A01 > 0 || A08()) {
                E5H e5h = this.A02;
                E5H e5h2 = e5h;
                if (e5h == null) {
                    ? cso = new C26126Cso(this.A05, C26891DHy.A00, BZ8.A00, C25540Chd.A02);
                    this.A02 = cso;
                    e5h2 = cso;
                }
                e5h2.Bi0(baG);
            }
            this.A04 = null;
        }
    }

    public final void A07(BZQ bzq) {
        synchronized (A0I) {
            if (this.A01 != bzq) {
                this.A01 = bzq;
                this.A0A.clear();
            }
            this.A0A.addAll(bzq.A01);
        }
    }

    public final boolean A08() {
        C23087Bb2 bb2;
        int i;
        if (this.A03 || (((bb2 = C25942Cp8.A00().A00) != null && !bb2.A03) || ((i = this.A08.A01.get(203400000, -1)) != -1 && i != 0))) {
            return false;
        }
        return true;
    }

    public final boolean A09(C23203Bcx bcx, int i) {
        PendingIntent activity;
        C41381wH r4 = this.A07;
        Context context = this.A05;
        if (C25438Cfl.A00(context)) {
            return false;
        }
        if (bcx.A00()) {
            activity = bcx.A02;
        } else {
            Intent A032 = r4.A03(context, (String) null, bcx.A01);
            if (A032 == null) {
                return false;
            }
            activity = PendingIntent.getActivity(context, 0, A032, CF9.A00 | 134217728);
        }
        if (activity == null) {
            return false;
        }
        int i2 = bcx.A01;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        r4.A05(PendingIntent.getActivity(context, 0, intent, CF5.A00 | 134217728), context, i2);
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v12, types: [X.Cso, X.E5H] */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x038e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018b, code lost:
        if (r1.A02 != false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018d, code lost:
        r1.A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0190, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r12) {
        /*
            r11 = this;
            int r5 = r12.what
            r8 = 13
            r0 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r2 = "GoogleApiManager"
            r6 = 17
            r4 = 1
            r3 = 0
            switch(r5) {
                case 1: goto L_0x032d;
                case 2: goto L_0x0395;
                case 3: goto L_0x030d;
                case 4: goto L_0x035a;
                case 5: goto L_0x02aa;
                case 6: goto L_0x025a;
                case 7: goto L_0x0252;
                case 8: goto L_0x035a;
                case 9: goto L_0x0170;
                case 10: goto L_0x0230;
                case 11: goto L_0x01dd;
                case 12: goto L_0x0198;
                case 13: goto L_0x035a;
                case 14: goto L_0x0191;
                case 15: goto L_0x0142;
                case 16: goto L_0x00a9;
                case 17: goto L_0x00a5;
                case 18: goto L_0x0021;
                case 19: goto L_0x001e;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown message id: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r5)
            android.util.Log.w(r2, r0)
            return r3
        L_0x001e:
            r11.A03 = r3
            return r4
        L_0x0021:
            java.lang.Object r5 = r12.obj
            X.CRZ r5 = (X.CRZ) r5
            long r1 = r5.A02
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0053
            int r2 = r5.A00
            X.BbD[] r1 = new X.C23098BbD[r4]
            X.BbD r0 = r5.A03
            java.util.List r0 = X.AnonymousClass8BR.A15(r0, r1, r3)
            X.BaG r6 = new X.BaG
            r6.<init>(r2, r0)
            X.E5H r5 = r11.A02
            if (r5 != 0) goto L_0x004f
            android.content.Context r3 = r11.A05
            X.DHy r2 = X.C26891DHy.A00
            X.CPx r1 = X.BZ8.A00
            X.Chd r0 = X.C25540Chd.A02
            X.BZ8 r5 = new X.BZ8
            r5.<init>(r3, r2, r1, r0)
            r11.A02 = r5
        L_0x004f:
            r5.Bi0(r6)
            return r4
        L_0x0053:
            X.BaG r0 = r11.A04
            if (r0 == 0) goto L_0x0071
            java.util.List r2 = r0.A00
            int r1 = r0.A01
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0069
            if (r2 == 0) goto L_0x0093
            int r1 = r2.size()
            int r0 = r5.A01
            if (r1 < r0) goto L_0x0093
        L_0x0069:
            android.os.Handler r0 = r11.A06
            r0.removeMessages(r6)
            r11.A04()
        L_0x0071:
            X.BaG r0 = r11.A04
            if (r0 != 0) goto L_0x038e
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            X.BbD r0 = r5.A03
            r2.add(r0)
            int r1 = r5.A00
            X.BaG r0 = new X.BaG
            r0.<init>(r1, r2)
            r11.A04 = r0
            android.os.Handler r3 = r11.A06
            android.os.Message r2 = r3.obtainMessage(r6)
            long r0 = r5.A02
            r3.sendMessageDelayed(r2, r0)
            return r4
        L_0x0093:
            X.BaG r2 = r11.A04
            X.BbD r1 = r5.A03
            java.util.List r0 = r2.A00
            if (r0 != 0) goto L_0x00a1
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r2.A00 = r0
        L_0x00a1:
            r0.add(r1)
            goto L_0x0071
        L_0x00a5:
            r11.A04()
            return r4
        L_0x00a9:
            java.lang.Object r2 = r12.obj
            X.CaC r2 = (X.C25161CaC) r2
            java.util.Map r1 = r11.A09
            X.CYu r0 = r2.A01
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x038e
            X.CYu r0 = r2.A01
            java.lang.Object r8 = r1.get(r0)
            X.DIr r8 = (X.C26910DIr) r8
            java.util.List r0 = r8.A07
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L_0x038e
            X.Cyd r0 = r8.A0C
            android.os.Handler r1 = r0.A06
            r0 = 15
            r1.removeMessages(r0, r2)
            r0 = 16
            r1.removeMessages(r0, r2)
            X.Bcl r7 = r2.A00
            java.util.Queue r6 = r8.A09
            int r0 = r6.size()
            java.util.ArrayList r5 = X.C17880vN.A0z(r0)
            java.util.Iterator r10 = r6.iterator()
        L_0x00e5:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0127
            java.lang.Object r9 = r10.next()
            X.Ckh r9 = (X.C25711Ckh) r9
            boolean r0 = r9 instanceof X.C23004BZe
            if (r0 == 0) goto L_0x00e5
            r2 = r9
            X.BZe r2 = (X.C23004BZe) r2
            boolean r0 = r2 instanceof X.C23002BZc
            if (r0 == 0) goto L_0x0119
            X.BZc r2 = (X.C23002BZc) r2
            X.Chw r0 = r2.A00
            X.Bcl[] r3 = r0.A02
            if (r3 == 0) goto L_0x00e5
            int r2 = r3.length
            r1 = 0
        L_0x0106:
            if (r1 >= r2) goto L_0x00e5
            r0 = r3[r1]
            boolean r0 = X.C25332Cdd.A01(r0, r7)
            if (r0 == 0) goto L_0x0116
            if (r1 < 0) goto L_0x00e5
            r5.add(r9)
            goto L_0x00e5
        L_0x0116:
            int r1 = r1 + 1
            goto L_0x0106
        L_0x0119:
            boolean r0 = r2 instanceof X.C23000BZa
            if (r0 == 0) goto L_0x00e5
            X.BZa r2 = (X.C23000BZa) r2
            java.util.Map r1 = r8.A08
            X.CYG r0 = r2.A00
            r1.get(r0)
            goto L_0x00e5
        L_0x0127:
            int r3 = r5.size()
            r2 = 0
        L_0x012c:
            if (r2 >= r3) goto L_0x038e
            java.lang.Object r1 = r5.get(r2)
            X.Ckh r1 = (X.C25711Ckh) r1
            r6.remove(r1)
            X.Dal r0 = new X.Dal
            r0.<init>(r7)
            r1.A02(r0)
            int r2 = r2 + 1
            goto L_0x012c
        L_0x0142:
            java.lang.Object r2 = r12.obj
            X.CaC r2 = (X.C25161CaC) r2
            java.util.Map r1 = r11.A09
            X.CYu r0 = r2.A01
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x038e
            X.CYu r0 = r2.A01
            java.lang.Object r1 = r1.get(r0)
            X.DIr r1 = (X.C26910DIr) r1
            java.util.List r0 = r1.A07
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x038e
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x038e
            X.EDS r0 = r1.A04
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x018d
            X.C26910DIr.A03(r1)
            return r4
        L_0x0170:
            java.util.Map r1 = r11.A09
            java.lang.Object r0 = r12.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x038e
            java.lang.Object r0 = r12.obj
            java.lang.Object r1 = r1.get(r0)
            X.DIr r1 = (X.C26910DIr) r1
            X.Cyd r0 = r1.A0C
            android.os.Handler r0 = r0.A06
            X.C18210vx.A01(r0)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x038e
        L_0x018d:
            r1.A09()
            return r4
        L_0x0191:
            java.lang.String r0 = "zaa"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0198:
            java.util.Map r1 = r11.A09
            java.lang.Object r0 = r12.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x038e
            java.lang.Object r0 = r12.obj
            java.lang.Object r3 = r1.get(r0)
            X.DIr r3 = (X.C26910DIr) r3
            X.Cyd r0 = r3.A0C
            android.os.Handler r0 = r0.A06
            X.C18210vx.A01(r0)
            X.EDS r2 = r3.A04
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x038e
            java.util.Map r0 = r3.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x038e
            X.ChQ r1 = r3.A06
            java.util.Map r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01d9
            java.util.Map r0 = r1.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01d9
            java.lang.String r0 = "Timing out service connection."
            r2.BIo(r0)
            return r4
        L_0x01d9:
            X.C26910DIr.A05(r3)
            return r4
        L_0x01dd:
            java.util.Map r1 = r11.A09
            java.lang.Object r0 = r12.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x038e
            java.lang.Object r0 = r12.obj
            java.lang.Object r5 = r1.get(r0)
            X.DIr r5 = (X.C26910DIr) r5
            X.Cyd r6 = r5.A0C
            android.os.Handler r2 = r6.A06
            X.C18210vx.A01(r2)
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x038e
            X.CYu r1 = r5.A05
            r0 = 11
            r2.removeMessages(r0, r1)
            r0 = 9
            r2.removeMessages(r0, r1)
            r5.A02 = r3
            X.1wH r2 = r6.A07
            android.content.Context r1 = r6.A05
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r1 = r2.A02(r1, r0)
            r0 = 18
            if (r1 != r0) goto L_0x022b
            r2 = 21
            java.lang.String r1 = "Connection timed out waiting for Google Play services update to complete."
        L_0x021b:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2, r1)
            X.C26910DIr.A01(r0, r5)
            X.EDS r1 = r5.A04
            java.lang.String r0 = "Timing out connection while resuming."
            r1.BIo(r0)
            return r4
        L_0x022b:
            r2 = 22
            java.lang.String r1 = "API failed to connect while resuming due to an unknown error."
            goto L_0x021b
        L_0x0230:
            java.util.Set r3 = r11.A0D
            java.util.Iterator r2 = r3.iterator()
        L_0x0236:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x024e
            java.lang.Object r1 = r2.next()
            java.util.Map r0 = r11.A09
            java.lang.Object r0 = r0.remove(r1)
            X.DIr r0 = (X.C26910DIr) r0
            if (r0 == 0) goto L_0x0236
            r0.A0A()
            goto L_0x0236
        L_0x024e:
            r3.clear()
            return r4
        L_0x0252:
            java.lang.Object r0 = r12.obj
            X.Cso r0 = (X.C26126Cso) r0
            r11.A02(r0)
            return r4
        L_0x025a:
            android.content.Context r3 = r11.A05
            android.content.Context r2 = r3.getApplicationContext()
            boolean r2 = r2 instanceof android.app.Application
            if (r2 == 0) goto L_0x038e
            android.content.Context r2 = r3.getApplicationContext()
            android.app.Application r2 = (android.app.Application) r2
            X.C18260w2.A00(r2)
            X.0w2 r6 = X.C18260w2.A04
            X.DIA r3 = new X.DIA
            r3.<init>(r11)
            monitor-enter(r6)
            java.util.ArrayList r2 = r6.A01     // Catch:{ all -> 0x02a7 }
            r2.add(r3)     // Catch:{ all -> 0x02a7 }
            monitor-exit(r6)     // Catch:{ all -> 0x02a7 }
            java.util.concurrent.atomic.AtomicBoolean r5 = r6.A03
            boolean r2 = r5.get()
            if (r2 != 0) goto L_0x029c
            android.app.ActivityManager$RunningAppProcessInfo r3 = new android.app.ActivityManager$RunningAppProcessInfo
            r3.<init>()
            android.app.ActivityManager.getMyMemoryState(r3)
            boolean r2 = r5.getAndSet(r4)
            if (r2 != 0) goto L_0x029c
            int r3 = r3.importance
            r2 = 100
            if (r3 <= r2) goto L_0x029c
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.A02
            r2.set(r4)
        L_0x029c:
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.A02
            boolean r2 = r2.get()
            if (r2 != 0) goto L_0x038e
            r11.A00 = r0
            return r4
        L_0x02a7:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x02a7 }
            throw r0
        L_0x02aa:
            int r3 = r12.arg1
            java.lang.Object r7 = r12.obj
            X.Bcx r7 = (X.C23203Bcx) r7
            java.util.Map r0 = r11.A09
            java.util.Iterator r1 = X.C17890vO.A0l(r0)
        L_0x02b6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02f2
            java.lang.Object r5 = r1.next()
            X.DIr r5 = (X.C26910DIr) r5
            int r0 = r5.A03
            if (r0 != r3) goto L_0x02b6
            int r0 = r7.A01
            if (r0 != r8) goto L_0x02eb
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.common.GooglePlayServicesUtil.A02
            java.lang.String r3 = "CANCELED"
            java.lang.String r2 = r7.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error resolution was canceled by the user, original error message: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ": "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r6, r1)
        L_0x02e7:
            X.C26910DIr.A01(r0, r5)
            return r4
        L_0x02eb:
            X.CYu r0 = r5.A05
            com.google.android.gms.common.api.Status r0 = A00(r7, r0)
            goto L_0x02e7
        L_0x02f2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Could not find API instance "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " while trying to fail enqueued calls."
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            android.util.Log.wtf(r2, r1, r0)
            return r4
        L_0x030d:
            java.util.Map r0 = r11.A09
            java.util.Iterator r2 = X.C17890vO.A0l(r0)
        L_0x0313:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x038e
            java.lang.Object r1 = r2.next()
            X.DIr r1 = (X.C26910DIr) r1
            X.Cyd r0 = r1.A0C
            android.os.Handler r0 = r0.A06
            X.C18210vx.A01(r0)
            r0 = 0
            r1.A01 = r0
            r1.A09()
            goto L_0x0313
        L_0x032d:
            java.lang.Object r2 = r12.obj
            boolean r2 = X.AnonymousClass000.A1Y(r2)
            if (r4 != r2) goto L_0x0337
            r0 = 10000(0x2710, double:4.9407E-320)
        L_0x0337:
            r11.A00 = r0
            android.os.Handler r6 = r11.A06
            r5 = 12
            r6.removeMessages(r5)
            java.util.Map r0 = r11.A09
            java.util.Iterator r3 = X.AnonymousClass8BU.A0x(r0)
        L_0x0346:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x038e
            java.lang.Object r0 = r3.next()
            android.os.Message r2 = r6.obtainMessage(r5, r0)
            long r0 = r11.A00
            r6.sendMessageDelayed(r2, r0)
            goto L_0x0346
        L_0x035a:
            java.lang.Object r3 = r12.obj
            X.CPz r3 = (X.C24926CPz) r3
            java.util.Map r1 = r11.A09
            X.Cso r0 = r3.A01
            X.CYu r0 = r0.A06
            java.lang.Object r2 = r1.get(r0)
            X.DIr r2 = (X.C26910DIr) r2
            if (r2 != 0) goto L_0x0372
            X.Cso r0 = r3.A01
            X.DIr r2 = r11.A02(r0)
        L_0x0372:
            X.EDS r0 = r2.A04
            boolean r0 = r0.CFe()
            if (r0 == 0) goto L_0x038f
            java.util.concurrent.atomic.AtomicInteger r0 = r11.A0C
            int r1 = r0.get()
            int r0 = r3.A00
            if (r1 == r0) goto L_0x038f
            X.Ckh r1 = r3.A02
            com.google.android.gms.common.api.Status r0 = A0G
            r1.A01(r0)
            r2.A0A()
        L_0x038e:
            return r4
        L_0x038f:
            X.Ckh r0 = r3.A02
            r2.A0D(r0)
            return r4
        L_0x0395:
            java.lang.String r0 = "zab"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26377Cyd.handleMessage(android.os.Message):boolean");
    }

    public C26377Cyd(Context context, Looper looper, C41381wH r8) {
        this.A05 = context;
        BG6 bg6 = new BG6(looper, this);
        this.A06 = bg6;
        this.A07 = r8;
        this.A08 = new C25651Cjh(r8);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = DeviceProperties.A03;
        if (bool == null) {
            boolean z = false;
            if (C25333Cde.A00() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            DeviceProperties.A03 = bool;
        }
        if (bool.booleanValue()) {
            this.A0E = false;
        }
        bg6.sendMessage(bg6.obtainMessage(6));
    }

    public final void A06(C23203Bcx bcx, int i) {
        if (!A09(bcx, i)) {
            Handler handler = this.A06;
            handler.sendMessage(handler.obtainMessage(5, i, 0, bcx));
        }
    }
}
