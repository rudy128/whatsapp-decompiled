package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.DIr  reason: case insensitive filesystem */
public final class C26910DIr implements EDT, EDW, EDX {
    public int A00 = 0;
    public C23203Bcx A01 = null;
    public boolean A02;
    public final int A03;
    public final EDS A04;
    public final C25121CYu A05;
    public final C25528ChQ A06;
    public final List A07 = AnonymousClass000.A13();
    public final Map A08 = C17880vN.A11();
    public final Queue A09 = AnonymousClass8BR.A14();
    public final C23501Bi8 A0A;
    public final Set A0B = C17880vN.A12();
    public final /* synthetic */ C26377Cyd A0C;

    public final void CSb(C23203Bcx bcx, C24924CPx cPx, boolean z) {
        throw null;
    }

    public final void onConnectionFailed(C23203Bcx bcx) {
        A0C(bcx, (Exception) null);
    }

    public C26910DIr(C26126Cso cso, C26377Cyd cyd) {
        C26377Cyd cyd2 = cyd;
        this.A0C = cyd2;
        Handler handler = cyd2.A06;
        Looper looper = handler.getLooper();
        C26892DHz dHz = C26892DHz.A00;
        Set emptySet = Collections.emptySet();
        AnonymousClass016 r0 = new AnonymousClass016(0);
        r0.addAll(emptySet);
        C26126Cso cso2 = cso;
        Context context = cso2.A01;
        String A0U = C17890vO.A0U(context);
        CTL ctl = new CTL(dHz, context.getPackageName(), A0U, (Map) null, r0);
        C22993BYp bYp = cso2.A04.A00;
        C18210vx.A00(bYp);
        EDS A002 = bYp.A00(context, looper, this, this, ctl, cso2.A03);
        String str = cso2.A08;
        if (str != null && (A002 instanceof C26157CtR)) {
            ((C26157CtR) A002).A0R = str;
        }
        this.A04 = A002;
        this.A05 = cso2.A06;
        this.A06 = new C25528ChQ();
        this.A03 = cso2.A00;
        if (A002.CFe()) {
            Context context2 = cyd2.A05;
            Set emptySet2 = Collections.emptySet();
            AnonymousClass016 r02 = new AnonymousClass016(0);
            r02.addAll(emptySet2);
            this.A0A = new C23501Bi8(context2, handler, new CTL(dHz, context.getPackageName(), A0U, (Map) null, r02));
            return;
        }
        this.A0A = null;
    }

    private final void A00(C23203Bcx bcx) {
        Set set = this.A0B;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next();
            if (C25332Cdd.A01(bcx, C23203Bcx.A04)) {
                C26157CtR ctR = (C26157CtR) this.A04;
                if (!ctR.isConnected() || ctR.A0A == null) {
                    throw AnonymousClass8BR.A0w("Failed to connect when checking package");
                }
            }
            throw AnonymousClass000.A0s("zac");
        }
        set.clear();
    }

    public static final void A01(Status status, C26910DIr dIr) {
        C18210vx.A01(dIr.A0C.A06);
        dIr.A02(status, (Exception) null, false);
    }

    private final void A02(Status status, Exception exc, boolean z) {
        C18210vx.A01(this.A0C.A06);
        boolean z2 = false;
        boolean z3 = true;
        if (status != null) {
            z3 = false;
        }
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator it = this.A09.iterator();
            while (it.hasNext()) {
                C25711Ckh ckh = (C25711Ckh) it.next();
                if (!z || ckh.A00 == 2) {
                    if (status != null) {
                        ckh.A01(status);
                    } else {
                        ckh.A02(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw AnonymousClass000.A0k("Status XOR exception should be null");
    }

    public static final void A03(C26910DIr dIr) {
        Queue queue = dIr.A09;
        ArrayList A10 = C17880vN.A10(queue);
        int size = A10.size();
        int i = 0;
        while (i < size) {
            C25711Ckh ckh = (C25711Ckh) A10.get(i);
            if (dIr.A04.isConnected()) {
                if (dIr.A08(ckh)) {
                    queue.remove(ckh);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static final void A04(C26910DIr dIr) {
        Handler handler = dIr.A0C.A06;
        C18210vx.A01(handler);
        dIr.A01 = null;
        dIr.A00(C23203Bcx.A04);
        if (dIr.A02) {
            C25121CYu cYu = dIr.A05;
            handler.removeMessages(11, cYu);
            handler.removeMessages(9, cYu);
            dIr.A02 = false;
        }
        Iterator A0l = C17890vO.A0l(dIr.A08);
        while (A0l.hasNext()) {
            CQ1 cq1 = ((CQ0) A0l.next()).A00;
            try {
                cq1.A02.A02.accept(dIr.A04, new TaskCompletionSource());
            } catch (DeadObjectException unused) {
                dIr.onConnectionSuspended(3);
                dIr.A04.BIo("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException unused2) {
                A0l.remove();
            }
        }
        A03(dIr);
        A05(dIr);
    }

    public static final void A05(C26910DIr dIr) {
        C25121CYu cYu = dIr.A05;
        C26377Cyd cyd = dIr.A0C;
        Handler handler = cyd.A06;
        handler.removeMessages(12, cYu);
        handler.sendMessageDelayed(handler.obtainMessage(12, cYu), cyd.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0067 A[LOOP:0: B:7:0x0061->B:9:0x0067, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C26910DIr r7, int r8) {
        /*
            X.Cyd r5 = r7.A0C
            android.os.Handler r4 = r5.A06
            X.C18210vx.A01(r4)
            r0 = 0
            r7.A01 = r0
            r0 = 1
            r7.A02 = r0
            X.EDS r0 = r7.A04
            X.CtR r0 = (X.C26157CtR) r0
            java.lang.String r2 = r0.A0S
            X.ChQ r6 = r7.A06
            java.lang.String r0 = "The connection to Google Play services was lost"
            java.lang.StringBuilder r1 = X.BE6.A0u(r0)
            r3 = 1
            if (r8 != r3) goto L_0x0073
            java.lang.String r0 = " due to service disconnection."
        L_0x0020:
            r1.append(r0)
        L_0x0023:
            if (r2 == 0) goto L_0x002d
            java.lang.String r0 = " Last reason for disconnect: "
            r1.append(r0)
            r1.append(r2)
        L_0x002d:
            java.lang.String r2 = r1.toString()
            r1 = 20
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r1, r2)
            X.C25528ChQ.A00(r0, r6, r3)
            X.CYu r3 = r7.A05
            r0 = 9
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r3)
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.sendMessageDelayed(r2, r0)
            r0 = 11
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r3)
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r4.sendMessageDelayed(r2, r0)
            X.Cjh r0 = r5.A08
            android.util.SparseIntArray r0 = r0.A01
            r0.clear()
            java.util.Map r0 = r7.A08
            java.util.Iterator r1 = X.C17890vO.A0l(r0)
        L_0x0061:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r1.next()
            X.CQ0 r0 = (X.CQ0) r0
            java.lang.Runnable r0 = r0.A02
            r0.run()
            goto L_0x0061
        L_0x0073:
            r0 = 3
            if (r8 != r0) goto L_0x0023
            java.lang.String r0 = " due to dead object exception."
            goto L_0x0020
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26910DIr.A06(X.DIr, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A07(X.C23203Bcx r6) {
        /*
            r5 = this;
            java.lang.Object r4 = X.C26377Cyd.A0I
            monitor-enter(r4)
            X.Cyd r2 = r5.A0C     // Catch:{ all -> 0x003a }
            X.BZQ r0 = r2.A01     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0037
            java.util.Set r1 = r2.A0A     // Catch:{ all -> 0x003a }
            X.CYu r0 = r5.A05     // Catch:{ all -> 0x003a }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0037
            X.BZQ r3 = r2.A01     // Catch:{ all -> 0x003a }
            int r0 = r5.A03     // Catch:{ all -> 0x003a }
            X.CNr r2 = new X.CNr     // Catch:{ all -> 0x003a }
            r2.<init>(r6, r0)     // Catch:{ all -> 0x003a }
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference r1 = r3.A04     // Catch:{ all -> 0x003a }
            r0 = 0
            boolean r0 = X.AnonymousClass00N.A00(r0, r2, r1)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x002e
            android.os.Handler r1 = r3.A00     // Catch:{ all -> 0x003a }
            r0 = 46
            X.C27076DTa.A00(r1, r3, r2, r0)     // Catch:{ all -> 0x003a }
        L_0x002c:
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            goto L_0x0035
        L_0x002e:
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x001c
            goto L_0x002c
        L_0x0035:
            r0 = 1
            return r0
        L_0x0037:
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            r0 = 0
            return r0
        L_0x003a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26910DIr.A07(X.Bcx):boolean");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.00O, java.util.Map] */
    private final boolean A08(C25711Ckh ckh) {
        TaskCompletionSource taskCompletionSource;
        C23001BZb bZb;
        C23002BZc bZc;
        Parcel parcel;
        int i;
        IBinder iBinder;
        IBinder iBinder2;
        int length;
        C23191Bcl[] bclArr;
        C23191Bcl bcl;
        C25711Ckh ckh2 = ckh;
        if (ckh2 instanceof C23004BZe) {
            C23004BZe bZe = (C23004BZe) ckh2;
            if (bZe instanceof C23002BZc) {
                C25558Chw chw = ((C23002BZc) bZe).A00;
                C23191Bcl[] bclArr2 = chw.A02;
                if (bclArr2 != null && (length = bclArr2.length) != 0) {
                    EDS eds = this.A04;
                    C23082Bax bax = ((C26157CtR) eds).A0Q;
                    if (bax == null) {
                        bclArr = null;
                    } else {
                        bclArr = bax.A03;
                    }
                    int i2 = 0;
                    if (bclArr == null) {
                        bclArr = new C23191Bcl[0];
                    }
                    ? r9 = new AnonymousClass00O(r13);
                    for (C23191Bcl bcl2 : bclArr) {
                        String str = bcl2.A02;
                        long j = bcl2.A01;
                        if (j == -1) {
                            j = (long) bcl2.A00;
                        }
                        r9.put(str, Long.valueOf(j));
                    }
                    while (true) {
                        bcl = bclArr2[i2];
                        Number number = (Number) r9.get(bcl.A02);
                        if (number == null) {
                            break;
                        }
                        long longValue = number.longValue();
                        long j2 = bcl.A01;
                        if (j2 == -1) {
                            j2 = (long) bcl.A00;
                        }
                        if (longValue < j2) {
                            break;
                        }
                        i2++;
                        if (i2 >= length) {
                            break;
                        }
                    }
                    String A0U = C17890vO.A0U(eds);
                    String str2 = bcl.A02;
                    long j3 = bcl.A01;
                    if (j3 == -1) {
                        j3 = (long) bcl.A00;
                    }
                    StringBuilder A11 = AnonymousClass000.A11(A0U);
                    A11.append(" could not execute call because it requires feature (");
                    AnonymousClass8BT.A1V(A11, str2);
                    A11.append(j3);
                    Log.w("GoogleApiManager", AnonymousClass000.A0y(").", A11));
                    C26377Cyd cyd = this.A0C;
                    if (!cyd.A0E || !chw.A01) {
                        bZe.A02(new C27259Dal(bcl));
                        return true;
                    }
                    C25161CaC caC = new C25161CaC(bcl, this.A05);
                    List list = this.A07;
                    int indexOf = list.indexOf(caC);
                    if (indexOf >= 0) {
                        Object obj = list.get(indexOf);
                        Handler handler = cyd.A06;
                        handler.removeMessages(15, obj);
                        handler.sendMessageDelayed(Message.obtain(handler, 15, obj), 5000);
                        return false;
                    }
                    list.add(caC);
                    Handler handler2 = cyd.A06;
                    handler2.sendMessageDelayed(Message.obtain(handler2, 15, caC), 5000);
                    handler2.sendMessageDelayed(Message.obtain(handler2, 16, caC), 120000);
                    C23203Bcx bcx = new C23203Bcx(2, (PendingIntent) null);
                    if (A07(bcx)) {
                        return false;
                    }
                    cyd.A09(bcx, this.A03);
                    return false;
                }
            } else if (bZe instanceof C23000BZa) {
                this.A08.get(((C23000BZa) bZe).A00);
            }
        }
        C25528ChQ chQ = this.A06;
        EDS eds2 = this.A04;
        boolean CFe = eds2.CFe();
        boolean z = ckh2 instanceof C23002BZc;
        if (z) {
            TaskCompletionSource taskCompletionSource2 = ((C23002BZc) ckh2).A01;
            chQ.A01.put(taskCompletionSource2, Boolean.valueOf(CFe));
            taskCompletionSource2.zza.addOnCompleteListener(new DKZ(chQ, taskCompletionSource2));
        } else if (!(ckh2 instanceof C23000BZa) && !(ckh2 instanceof C23003BZd)) {
            BZL bzl = ((C23005BZf) ckh2).A00;
            chQ.A00.put(bzl, Boolean.valueOf(CFe));
            bzl.A02(new DI7(bzl, chQ));
        }
        try {
            if (ckh2 instanceof C23005BZf) {
                C23005BZf bZf = (C23005BZf) ckh2;
                try {
                    bZf.A00.A08(eds2);
                    return true;
                } catch (RuntimeException e) {
                    bZf.A02(e);
                    return true;
                }
            } else if (z) {
                bZc = (C23002BZc) ckh2;
                C25558Chw chw2 = bZc.A00;
                TaskCompletionSource taskCompletionSource3 = bZc.A01;
                if (chw2 instanceof BZS) {
                    ((BZS) chw2).A00.A01.accept(eds2, taskCompletionSource3);
                    return true;
                }
                BZR bzr = (BZR) chw2;
                bzr.A00 = taskCompletionSource3;
                C23246Bdw bdw = (C23246Bdw) ((C26157CtR) eds2).A04();
                if (bzr instanceof BYH) {
                    BYH byh = (BYH) bzr;
                    C23251Be1 be1 = new C23251Be1(byh, byh);
                    C23030Ba6 ba6 = byh.A00;
                    parcel = Parcel.obtain();
                    BE9.A15(be1, parcel, bdw.A00);
                    ba6.writeToParcel(parcel, BE8.A1V(parcel) ? 1 : 0);
                    i = 6;
                } else if (bzr instanceof BYJ) {
                    BYJ byj = (BYJ) bzr;
                    C23254Be4 be4 = byj.A00;
                    C23040BaH baH = byj.A00;
                    parcel = Parcel.obtain();
                    parcel.writeInterfaceToken(bdw.A00);
                    if (be4 == null) {
                        iBinder2 = null;
                    } else {
                        iBinder2 = be4.asBinder();
                    }
                    parcel.writeStrongBinder(iBinder2);
                    baH.writeToParcel(parcel, BE8.A1V(parcel) ? 1 : 0);
                    i = 9;
                } else {
                    BYI byi = (BYI) bzr;
                    C23254Be4 be42 = byi.A00;
                    C23041BaI baI = byi.A00;
                    parcel = Parcel.obtain();
                    parcel.writeInterfaceToken(bdw.A00);
                    if (be42 == null) {
                        iBinder = null;
                    } else {
                        iBinder = be42.asBinder();
                    }
                    parcel.writeStrongBinder(iBinder);
                    baI.writeToParcel(parcel, BE8.A1V(parcel) ? 1 : 0);
                    i = 5;
                }
                bdw.A01(i, parcel);
                return true;
            } else {
                bZb = (C23001BZb) ckh2;
                if (bZb instanceof C23000BZa) {
                    C23000BZa bZa = (C23000BZa) bZb;
                    CQ0 cq0 = (CQ0) this.A08.remove(bZa.A00);
                    if (cq0 != null) {
                        cq0.A01.A01.A03.accept(eds2, bZa.A00);
                        CWD cwd = cq0.A00.A01;
                        cwd.A02 = null;
                        cwd.A01 = null;
                        return true;
                    }
                    bZa.A00.trySetResult(AnonymousClass000.A0h());
                    return true;
                }
                C23003BZd bZd = (C23003BZd) bZb;
                CQ0 cq02 = bZd.A00;
                CQ1 cq1 = cq02.A00;
                cq1.A02.A02.accept(eds2, bZd.A00);
                CYG cyg = cq1.A01.A01;
                if (cyg != null) {
                    this.A08.put(cyg, cq02);
                    return true;
                }
                return true;
            }
        } catch (DeadObjectException e2) {
            bZb.A01(C25711Ckh.A00(e2));
            throw e2;
        } catch (RemoteException e3) {
            bZb.A01(C25711Ckh.A00(e3));
            return true;
        } catch (RuntimeException e4) {
            e = e4;
            taskCompletionSource = bZb.A00;
        } catch (DeadObjectException e5) {
            throw e5;
        } catch (RemoteException e6) {
            bZc.A01(C25711Ckh.A00(e6));
            return true;
        } catch (RuntimeException e7) {
            e = e7;
            taskCompletionSource = bZc.A01;
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            eds2.BIo("DeadObjectException thrown while running ApiCallRunner.");
            return true;
        }
        taskCompletionSource.trySetException(e);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.EDS, X.EDR] */
    public final void A09() {
        C26377Cyd cyd = this.A0C;
        C18210vx.A01(cyd.A06);
        EDS eds = this.A04;
        if (!eds.isConnected() && !eds.BeN()) {
            try {
                int A002 = cyd.A08.A00(cyd.A05, eds);
                if (A002 != 0) {
                    C23203Bcx bcx = new C23203Bcx(A002, (PendingIntent) null);
                    String A0U = C17890vO.A0U(eds);
                    String obj = bcx.toString();
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("The service for ");
                    A10.append(A0U);
                    BEA.A1N(" is not available: ", obj, "GoogleApiManager", A10);
                    A0C(bcx, (Exception) null);
                    return;
                }
                C26915DIw dIw = new C26915DIw(eds, this.A05, cyd);
                if (eds.CFe()) {
                    C23501Bi8 bi8 = this.A0A;
                    C18210vx.A00(bi8);
                    EDR edr = bi8.A01;
                    if (edr != null) {
                        edr.BIn();
                    }
                    CTL ctl = bi8.A05;
                    ctl.A00 = Integer.valueOf(System.identityHashCode(bi8));
                    C22993BYp bYp = bi8.A04;
                    Context context = bi8.A02;
                    Handler handler = bi8.A03;
                    bi8.A01 = bYp.A00(context, handler.getLooper(), bi8, bi8, ctl, ctl.A01);
                    bi8.A00 = dIw;
                    Set set = bi8.A06;
                    if (set == null || set.isEmpty()) {
                        C27080DTf.A00(handler, bi8, 13);
                    } else {
                        C26157CtR ctR = (C26157CtR) bi8.A01;
                        ctR.BFd(new C26913DIu(ctR));
                    }
                }
                try {
                    eds.BFd(dIw);
                } catch (SecurityException e) {
                    A0C(new C23203Bcx(10), e);
                }
            } catch (IllegalStateException e2) {
                A0C(new C23203Bcx(10), e2);
            }
        }
    }

    public final void A0A() {
        C18210vx.A01(this.A0C.A06);
        Status status = C26377Cyd.A0G;
        A01(status, this);
        C25528ChQ.A00(status, this.A06, false);
        for (CYG bZa : (CYG[]) this.A08.keySet().toArray(new CYG[0])) {
            A0D(new C23000BZa(bZa, new TaskCompletionSource()));
        }
        A00(new C23203Bcx(4));
        if (this.A04.isConnected()) {
            CLE cle = new CLE(this);
            C27080DTf.A00(cle.A00.A0C.A06, cle, 12);
        }
    }

    public final void A0B(C23203Bcx bcx) {
        C18210vx.A01(this.A0C.A06);
        EDS eds = this.A04;
        String A0U = C17890vO.A0U(eds);
        String valueOf = String.valueOf(bcx);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("onSignInFailed for ");
        A10.append(A0U);
        eds.BIo(AnonymousClass001.A1H(" with ", valueOf, A10));
        A0C(bcx, (Exception) null);
    }

    public final void A0C(C23203Bcx bcx, Exception exc) {
        Status A002;
        EDR edr;
        C26377Cyd cyd = this.A0C;
        Handler handler = cyd.A06;
        C18210vx.A01(handler);
        C23501Bi8 bi8 = this.A0A;
        if (!(bi8 == null || (edr = bi8.A01) == null)) {
            edr.BIn();
        }
        C18210vx.A01(handler);
        this.A01 = null;
        cyd.A08.A01.clear();
        A00(bcx);
        if ((this.A04 instanceof BZm) && bcx.A01 != 24) {
            cyd.A03 = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000);
        }
        int i = bcx.A01;
        if (i == 4) {
            A002 = C26377Cyd.A0H;
        } else {
            Queue queue = this.A09;
            if (queue.isEmpty()) {
                this.A01 = bcx;
                return;
            } else if (exc != null) {
                C18210vx.A01(handler);
                A02((Status) null, exc, false);
                return;
            } else {
                boolean z = cyd.A0E;
                C25121CYu cYu = this.A05;
                if (z) {
                    A02(C26377Cyd.A00(bcx, cYu), (Exception) null, true);
                    if (!queue.isEmpty() && !A07(bcx) && !cyd.A09(bcx, this.A03)) {
                        if (i == 18) {
                            this.A02 = true;
                        }
                        if (this.A02) {
                            handler.sendMessageDelayed(Message.obtain(handler, 9, cYu), 5000);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                A002 = C26377Cyd.A00(bcx, cYu);
            }
        }
        A01(A002, this);
    }

    public final void A0D(C25711Ckh ckh) {
        C18210vx.A01(this.A0C.A06);
        if (!this.A04.isConnected()) {
            this.A09.add(ckh);
            C23203Bcx bcx = this.A01;
            if (bcx == null || !bcx.A00()) {
                A09();
            } else {
                A0C(bcx, (Exception) null);
            }
        } else if (A08(ckh)) {
            A05(this);
        } else {
            this.A09.add(ckh);
        }
    }

    public final void onConnected(Bundle bundle) {
        C26377Cyd cyd = this.A0C;
        Looper myLooper = Looper.myLooper();
        Handler handler = cyd.A06;
        if (myLooper == handler.getLooper()) {
            A04(this);
        } else {
            C27080DTf.A00(handler, this, 11);
        }
    }

    public final void onConnectionSuspended(int i) {
        C26377Cyd cyd = this.A0C;
        Looper myLooper = Looper.myLooper();
        Handler handler = cyd.A06;
        if (myLooper == handler.getLooper()) {
            A06(this, i);
        } else {
            handler.post(new AnonymousClass7RP(this, i, 13));
        }
    }
}
