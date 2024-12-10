package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public final class BZB extends C25260Cbz implements C28578E8o {
    public AnonymousClass26E A00;
    public EA7 A01 = null;
    public Integer A02 = null;
    public Set A03 = C17880vN.A12();
    public final Context A04;
    public final Looper A05;
    public final C41381wH A06;
    public final C22993BYp A07;
    public final C25934Coz A08 = new C25934Coz();
    public final C25541Che A09;
    public final CTL A0A;
    public final C26371CyX A0B;
    public final ArrayList A0C;
    public final Map A0D;
    public final Map A0E;
    public final Queue A0F = AnonymousClass8BR.A14();
    public final Lock A0G;
    public final int A0H;
    public final C23287Beb A0I;
    public final E5I A0J;
    public volatile boolean A0K;

    public BZB(Context context, Looper looper, C41381wH r11, C22993BYp bYp, CTL ctl, ArrayList arrayList, List list, List list2, Map map, Map map2, Lock lock) {
        DJ1 dj1 = new DJ1(this);
        this.A0J = dj1;
        this.A04 = context;
        this.A0G = lock;
        this.A0B = new C26371CyX(looper, dj1);
        this.A05 = looper;
        this.A0I = new C23287Beb(looper, this);
        this.A06 = r11;
        this.A0H = -1;
        this.A0E = map;
        this.A0D = map2;
        this.A0C = arrayList;
        this.A09 = new C25541Che();
        for (Object next : list) {
            C26371CyX cyX = this.A0B;
            C18210vx.A00(next);
            synchronized (cyX.A03) {
                ArrayList arrayList2 = cyX.A05;
                if (arrayList2.contains(next)) {
                    String valueOf = String.valueOf(next);
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("registerConnectionCallbacks(): listener ");
                    A10.append(valueOf);
                    BE9.A1H(" is already registered", "GmsClientEvents", A10);
                } else {
                    arrayList2.add(next);
                }
            }
            if (cyX.A02.isConnected()) {
                C108955ca.A1F(cyX.A01, next, 1);
            }
        }
        for (Object next2 : list2) {
            C26371CyX cyX2 = this.A0B;
            C18210vx.A00(next2);
            synchronized (cyX2.A03) {
                ArrayList arrayList3 = cyX2.A06;
                if (arrayList3.contains(next2)) {
                    String valueOf2 = String.valueOf(next2);
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("registerConnectionFailedListener(): listener ");
                    A102.append(valueOf2);
                    BE9.A1H(" is already registered", "GmsClientEvents", A102);
                } else {
                    arrayList3.add(next2);
                }
            }
        }
        this.A0A = ctl;
        this.A07 = bYp;
    }

    public final void CSh(int i) {
        AtomicInteger atomicInteger;
        if (i == 1) {
            if (!this.A0K) {
                this.A0K = true;
                if (this.A00 == null) {
                    try {
                        this.A00 = this.A06.A04(this.A04.getApplicationContext(), new BZY(this));
                    } catch (SecurityException unused) {
                    }
                }
                C23287Beb beb = this.A0I;
                beb.sendMessageDelayed(beb.obtainMessage(1), 120000);
                beb.sendMessageDelayed(beb.obtainMessage(2), 5000);
            }
            i = 1;
        }
        for (BasePendingResult A072 : (BasePendingResult[]) this.A09.A01.toArray(new BasePendingResult[0])) {
            A072.A07(C25541Che.A02);
        }
        C26371CyX cyX = this.A0B;
        Handler handler = cyX.A01;
        if (Looper.myLooper() == handler.getLooper()) {
            handler.removeMessages(1);
            synchronized (cyX.A03) {
                cyX.A00 = true;
                ArrayList arrayList = cyX.A05;
                ArrayList A10 = C17880vN.A10(arrayList);
                atomicInteger = cyX.A07;
                int i2 = atomicInteger.get();
                Iterator it = A10.iterator();
                while (it.hasNext()) {
                    EDW edw = (EDW) it.next();
                    if (!cyX.A08 || atomicInteger.get() != i2) {
                        break;
                    } else if (arrayList.contains(edw)) {
                        edw.onConnectionSuspended(i);
                    }
                }
                cyX.A04.clear();
                cyX.A00 = false;
            }
            cyX.A08 = false;
            atomicInteger.incrementAndGet();
            if (i == 2) {
                A01(this);
                return;
            }
            return;
        }
        throw AnonymousClass000.A0n("onUnintentionalDisconnection must only be called on the Handler thread");
    }

    public static final void A01(BZB bzb) {
        bzb.A0B.A08 = true;
        EA7 ea7 = bzb.A01;
        C18210vx.A00(ea7);
        ea7.CSs();
    }

    public static /* bridge */ /* synthetic */ void A02(BZB bzb) {
        Lock lock = bzb.A0G;
        lock.lock();
        try {
            if (bzb.A0K) {
                A01(bzb);
            }
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.EA7] */
    /* JADX WARNING: type inference failed for: r9v1, types: [X.00O, java.util.Map] */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.00O, java.util.Map] */
    /* JADX WARNING: type inference failed for: r7v2, types: [X.00O, java.util.Map] */
    /* JADX WARNING: type inference failed for: r6v2, types: [X.00O, java.util.Map] */
    /* JADX WARNING: type inference failed for: r9v2, types: [X.DIq] */
    /* JADX WARNING: type inference failed for: r15v3, types: [X.DIp] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058 A[Catch:{ all -> 0x01f7, all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062 A[Catch:{ all -> 0x01f7, all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081 A[Catch:{ all -> 0x01f7, all -> 0x0210 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
            r30 = this;
            r14 = r30
            java.util.concurrent.locks.Lock r0 = r14.A0G
            r29 = r0
            r29.lock()
            int r0 = r14.A0H     // Catch:{ all -> 0x0210 }
            r4 = 2
            r2 = 0
            r3 = 1
            if (r0 < 0) goto L_0x001c
            java.lang.Integer r0 = r14.A02     // Catch:{ all -> 0x0210 }
            boolean r1 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "Sign-in mode should have been set explicitly by auto-manage."
            X.C18210vx.A08(r1, r0)     // Catch:{ all -> 0x0210 }
            goto L_0x0030
        L_0x001c:
            java.lang.Integer r0 = r14.A02     // Catch:{ all -> 0x0210 }
            if (r0 != 0) goto L_0x01fc
            java.util.Map r0 = r14.A0D     // Catch:{ all -> 0x0210 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0210 }
            int r0 = A00(r0, r2)     // Catch:{ all -> 0x0210 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0210 }
            r14.A02 = r0     // Catch:{ all -> 0x0210 }
        L_0x0030:
            java.lang.Integer r0 = r14.A02     // Catch:{ all -> 0x0210 }
            X.C18210vx.A00(r0)     // Catch:{ all -> 0x0210 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x0210 }
            r29.lock()     // Catch:{ all -> 0x0210 }
            r0 = 3
            if (r1 == r0) goto L_0x0045
            if (r1 == r3) goto L_0x0045
            if (r1 == r4) goto L_0x0046
            r4 = r1
            goto L_0x0047
        L_0x0045:
            r4 = r1
        L_0x0046:
            r2 = 1
        L_0x0047:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01f7 }
            java.lang.String r0 = "Illegal sign-in mode: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r4)     // Catch:{ all -> 0x01f7 }
            X.C18210vx.A07(r2, r0)     // Catch:{ all -> 0x01f7 }
            java.lang.Integer r0 = r14.A02     // Catch:{ all -> 0x01f7 }
            if (r0 != 0) goto L_0x0081
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x01f7 }
            r14.A02 = r0     // Catch:{ all -> 0x01f7 }
        L_0x005e:
            X.EA7 r0 = r14.A01     // Catch:{ all -> 0x01f7 }
            if (r0 != 0) goto L_0x01b0
            java.util.Map r5 = r14.A0D     // Catch:{ all -> 0x01f7 }
            java.util.Iterator r6 = X.C17890vO.A0l(r5)     // Catch:{ all -> 0x01f7 }
            r4 = 0
            r2 = 0
        L_0x006a:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x01f7 }
            if (r0 == 0) goto L_0x0089
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x01f7 }
            X.EDS r1 = (X.EDS) r1     // Catch:{ all -> 0x01f7 }
            boolean r0 = r1.CFe()     // Catch:{ all -> 0x01f7 }
            r4 = r4 | r0
            boolean r0 = r1.CCu()     // Catch:{ all -> 0x01f7 }
            r2 = r2 | r0
            goto L_0x006a
        L_0x0081:
            int r1 = r0.intValue()     // Catch:{ all -> 0x01f7 }
            if (r1 == r4) goto L_0x005e
            goto L_0x01b4
        L_0x0089:
            java.lang.Integer r0 = r14.A02     // Catch:{ all -> 0x01f7 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x01f7 }
            if (r1 == r3) goto L_0x015b
            r0 = 2
            if (r1 != r0) goto L_0x0167
            if (r4 == 0) goto L_0x0167
            android.content.Context r0 = r14.A04     // Catch:{ all -> 0x01f7 }
            r16 = r0
            android.os.Looper r15 = r14.A05     // Catch:{ all -> 0x01f7 }
            X.1wH r13 = r14.A06     // Catch:{ all -> 0x01f7 }
            X.CTL r12 = r14.A0A     // Catch:{ all -> 0x01f7 }
            java.util.Map r1 = r14.A0E     // Catch:{ all -> 0x01f7 }
            X.BYp r11 = r14.A07     // Catch:{ all -> 0x01f7 }
            java.util.ArrayList r10 = r14.A0C     // Catch:{ all -> 0x01f7 }
            r2 = 0
            X.00P r9 = new X.00P     // Catch:{ all -> 0x01f7 }
            r9.<init>(r2)     // Catch:{ all -> 0x01f7 }
            X.00P r8 = new X.00P     // Catch:{ all -> 0x01f7 }
            r8.<init>(r2)     // Catch:{ all -> 0x01f7 }
            java.util.Iterator r7 = X.AnonymousClass000.A15(r5)     // Catch:{ all -> 0x01f7 }
            r20 = 0
        L_0x00b7:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x01f7 }
            if (r0 == 0) goto L_0x00e1
            java.util.Map$Entry r6 = X.AnonymousClass000.A16(r7)     // Catch:{ all -> 0x01f7 }
            java.lang.Object r5 = r6.getValue()     // Catch:{ all -> 0x01f7 }
            X.EDS r5 = (X.EDS) r5     // Catch:{ all -> 0x01f7 }
            boolean r0 = r5.CCu()     // Catch:{ all -> 0x01f7 }
            if (r3 != r0) goto L_0x00cf
            r20 = r5
        L_0x00cf:
            boolean r4 = r5.CFe()     // Catch:{ all -> 0x01f7 }
            java.lang.Object r0 = r6.getKey()     // Catch:{ all -> 0x01f7 }
            if (r4 == 0) goto L_0x00dd
            r9.put(r0, r5)     // Catch:{ all -> 0x01f7 }
            goto L_0x00b7
        L_0x00dd:
            r8.put(r0, r5)     // Catch:{ all -> 0x01f7 }
            goto L_0x00b7
        L_0x00e1:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x01f7 }
            r3 = r0 ^ 1
            java.lang.String r0 = "CompositeGoogleApiClient should not be used without any APIs that require sign-in."
            X.C18210vx.A08(r3, r0)     // Catch:{ all -> 0x01f7 }
            X.00P r7 = new X.00P     // Catch:{ all -> 0x01f7 }
            r7.<init>(r2)     // Catch:{ all -> 0x01f7 }
            X.00P r6 = new X.00P     // Catch:{ all -> 0x01f7 }
            r6.<init>(r2)     // Catch:{ all -> 0x01f7 }
            java.util.Iterator r4 = X.AnonymousClass8BU.A0x(r1)     // Catch:{ all -> 0x01f7 }
        L_0x00fa:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x01f7 }
            if (r0 == 0) goto L_0x0124
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x01f7 }
            X.CPx r2 = (X.C24924CPx) r2     // Catch:{ all -> 0x01f7 }
            X.CAv r3 = r2.A01     // Catch:{ all -> 0x01f7 }
            boolean r0 = r9.containsKey(r3)     // Catch:{ all -> 0x01f7 }
            if (r0 == 0) goto L_0x0116
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x01f7 }
            r7.put(r2, r0)     // Catch:{ all -> 0x01f7 }
            goto L_0x00fa
        L_0x0116:
            boolean r0 = r8.containsKey(r3)     // Catch:{ all -> 0x01f7 }
            if (r0 == 0) goto L_0x01f0
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x01f7 }
            r6.put(r2, r0)     // Catch:{ all -> 0x01f7 }
            goto L_0x00fa
        L_0x0124:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x01f7 }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x01f7 }
            int r3 = r10.size()     // Catch:{ all -> 0x01f7 }
            r2 = 0
        L_0x0131:
            if (r2 >= r3) goto L_0x0192
            java.lang.Object r1 = r10.get(r2)     // Catch:{ all -> 0x01f7 }
            X.DI6 r1 = (X.DI6) r1     // Catch:{ all -> 0x01f7 }
            X.CPx r0 = r1.A01     // Catch:{ all -> 0x01f7 }
            boolean r0 = r7.containsKey(r0)     // Catch:{ all -> 0x01f7 }
            if (r0 == 0) goto L_0x0145
            r5.add(r1)     // Catch:{ all -> 0x01f7 }
            goto L_0x0150
        L_0x0145:
            X.CPx r0 = r1.A01     // Catch:{ all -> 0x01f7 }
            boolean r0 = r6.containsKey(r0)     // Catch:{ all -> 0x01f7 }
            if (r0 == 0) goto L_0x0153
            r4.add(r1)     // Catch:{ all -> 0x01f7 }
        L_0x0150:
            int r2 = r2 + 1
            goto L_0x0131
        L_0x0153:
            java.lang.String r0 = "Each ClientCallbacks must have a corresponding API in the isOptionalMap"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x01f7 }
            goto L_0x01f6
        L_0x015b:
            if (r4 == 0) goto L_0x018b
            if (r2 == 0) goto L_0x0167
            java.lang.String r0 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x01f7 }
            goto L_0x01f6
        L_0x0167:
            android.content.Context r8 = r14.A04     // Catch:{ all -> 0x01f7 }
            android.os.Looper r7 = r14.A05     // Catch:{ all -> 0x01f7 }
            X.1wH r6 = r14.A06     // Catch:{ all -> 0x01f7 }
            X.CTL r4 = r14.A0A     // Catch:{ all -> 0x01f7 }
            java.util.Map r2 = r14.A0E     // Catch:{ all -> 0x01f7 }
            X.BYp r1 = r14.A07     // Catch:{ all -> 0x01f7 }
            java.util.ArrayList r0 = r14.A0C     // Catch:{ all -> 0x01f7 }
            X.DIq r3 = new X.DIq     // Catch:{ all -> 0x01f7 }
            r9 = r3
            r10 = r8
            r11 = r7
            r12 = r6
            r13 = r1
            r15 = r14
            r16 = r4
            r17 = r0
            r18 = r5
            r19 = r2
            r20 = r29
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01f7 }
            goto L_0x01ae
        L_0x018b:
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x01f7 }
            goto L_0x01f6
        L_0x0192:
            X.DIp r3 = new X.DIp     // Catch:{ all -> 0x01f7 }
            r23 = r5
            r24 = r4
            r25 = r9
            r26 = r8
            r27 = r7
            r28 = r6
            r19 = r11
            r21 = r14
            r22 = r12
            r17 = r15
            r18 = r13
            r15 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x01f7 }
        L_0x01ae:
            r14.A01 = r3     // Catch:{ all -> 0x01f7 }
        L_0x01b0:
            A01(r14)     // Catch:{ all -> 0x01f7 }
            goto L_0x0209
        L_0x01b4:
            if (r1 == r3) goto L_0x01c2
            r0 = 2
            if (r1 == r0) goto L_0x01bf
            r0 = 3
            if (r1 == r0) goto L_0x01c5
            java.lang.String r2 = "UNKNOWN"
            goto L_0x01c7
        L_0x01bf:
            java.lang.String r2 = "SIGN_IN_MODE_OPTIONAL"
            goto L_0x01c7
        L_0x01c2:
            java.lang.String r2 = "SIGN_IN_MODE_REQUIRED"
            goto L_0x01c7
        L_0x01c5:
            java.lang.String r2 = "SIGN_IN_MODE_NONE"
        L_0x01c7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01f7 }
            java.lang.String r0 = "Cannot use sign-in mode: "
            r1.append(r0)     // Catch:{ all -> 0x01f7 }
            if (r4 == r3) goto L_0x01de
            r0 = 2
            if (r4 == r0) goto L_0x01db
            r0 = 3
            if (r4 == r0) goto L_0x01e1
            java.lang.String r0 = "UNKNOWN"
            goto L_0x01e3
        L_0x01db:
            java.lang.String r0 = "SIGN_IN_MODE_OPTIONAL"
            goto L_0x01e3
        L_0x01de:
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED"
            goto L_0x01e3
        L_0x01e1:
            java.lang.String r0 = "SIGN_IN_MODE_NONE"
        L_0x01e3:
            r1.append(r0)     // Catch:{ all -> 0x01f7 }
            java.lang.String r0 = ". Mode was already set to "
            r1.append(r0)     // Catch:{ all -> 0x01f7 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r2, r1)     // Catch:{ all -> 0x01f7 }
            goto L_0x01f6
        L_0x01f0:
            java.lang.String r0 = "Each API in the isOptionalMap must have a corresponding client in the clients map."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x01f7 }
        L_0x01f6:
            throw r0     // Catch:{ all -> 0x01f7 }
        L_0x01f7:
            r0 = move-exception
            r29.unlock()     // Catch:{ all -> 0x0210 }
            goto L_0x0208
        L_0x01fc:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0210 }
            if (r0 != r4) goto L_0x0030
            java.lang.String r0 = "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0210 }
        L_0x0208:
            throw r0     // Catch:{ all -> 0x0210 }
        L_0x0209:
            r29.unlock()     // Catch:{ all -> 0x0210 }
            r29.unlock()
            return
        L_0x0210:
            r0 = move-exception
            r29.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BZB.A07():void");
    }

    public final String A08() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append("").append("mContext=").println(this.A04);
        printWriter.append("").append("mResuming=").print(this.A0K);
        printWriter.append(" mWorkQueue.size()=").print(this.A0F.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.A09.A01.size());
        EA7 ea7 = this.A01;
        if (ea7 != null) {
            ea7.CSu(printWriter, "");
        }
        return stringWriter.toString();
    }

    public final boolean A09() {
        boolean z = false;
        if (this.A0K) {
            this.A0K = false;
            C23287Beb beb = this.A0I;
            beb.removeMessages(2);
            z = true;
            beb.removeMessages(1);
            AnonymousClass26E r0 = this.A00;
            if (r0 != null) {
                r0.A00();
                this.A00 = null;
            }
        }
        return z;
    }

    public final void CSa(C23203Bcx bcx) {
        AtomicInteger atomicInteger;
        Context context = this.A04;
        int i = bcx.A01;
        AtomicBoolean atomicBoolean = GooglePlayServicesUtil.A02;
        if (i != 18 && (i != 1 || !GooglePlayServicesUtil.A03(context))) {
            A09();
        }
        if (!this.A0K) {
            C26371CyX cyX = this.A0B;
            Handler handler = cyX.A01;
            if (Looper.myLooper() == handler.getLooper()) {
                handler.removeMessages(1);
                synchronized (cyX.A03) {
                    ArrayList arrayList = cyX.A06;
                    ArrayList A10 = C17880vN.A10(arrayList);
                    atomicInteger = cyX.A07;
                    int i2 = atomicInteger.get();
                    Iterator it = A10.iterator();
                    while (it.hasNext()) {
                        EDX edx = (EDX) it.next();
                        if (!cyX.A08 || atomicInteger.get() != i2) {
                            break;
                        } else if (arrayList.contains(edx)) {
                            edx.onConnectionFailed(bcx);
                        }
                    }
                }
                cyX.A08 = false;
                atomicInteger.incrementAndGet();
                return;
            }
            throw AnonymousClass000.A0n("onConnectionFailure must only be called on the Handler thread");
        }
    }

    public final void CSe(Bundle bundle) {
        IllegalStateException illegalStateException;
        while (true) {
            Queue queue = this.A0F;
            if (queue.isEmpty()) {
                break;
            }
            A03((BZL) queue.remove());
        }
        C26371CyX cyX = this.A0B;
        Handler handler = cyX.A01;
        if (Looper.myLooper() == handler.getLooper()) {
            synchronized (cyX.A03) {
                if (!cyX.A00) {
                    handler.removeMessages(1);
                    cyX.A00 = true;
                    ArrayList arrayList = cyX.A04;
                    if (arrayList.isEmpty()) {
                        ArrayList A10 = C17880vN.A10(cyX.A05);
                        AtomicInteger atomicInteger = cyX.A07;
                        int i = atomicInteger.get();
                        Iterator it = A10.iterator();
                        while (it.hasNext()) {
                            EDW edw = (EDW) it.next();
                            if (!cyX.A08 || !cyX.A02.isConnected() || atomicInteger.get() != i) {
                                break;
                            } else if (!arrayList.contains(edw)) {
                                edw.onConnected(bundle);
                            }
                        }
                        arrayList.clear();
                        cyX.A00 = false;
                    } else {
                        illegalStateException = BE6.A0k();
                    }
                } else {
                    illegalStateException = BE6.A0k();
                }
                throw illegalStateException;
            }
            return;
        }
        throw AnonymousClass000.A0n("onConnectionSuccess must only be called on the Handler thread");
    }

    public static int A00(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            EDS eds = (EDS) it.next();
            z2 |= eds.CFe();
            z3 |= eds.CCu();
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }
}
