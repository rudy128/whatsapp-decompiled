package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.DIp  reason: case insensitive filesystem */
public final class C26908DIp implements EA7 {
    public int A00 = 0;
    public Bundle A01;
    public C23203Bcx A02 = null;
    public C23203Bcx A03 = null;
    public boolean A04 = false;
    public final Context A05;
    public final EDS A06;
    public final BZB A07;
    public final C26909DIq A08;
    public final C26909DIq A09;
    public final Map A0A;
    public final Lock A0B;
    public final Looper A0C;
    public final Set A0D = Collections.newSetFromMap(new WeakHashMap());

    public final void CSs() {
        this.A00 = 2;
        this.A04 = false;
        this.A03 = null;
        this.A02 = null;
        this.A08.CSs();
        this.A09.CSs();
    }

    public final void CSt() {
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
        this.A08.CSt();
        this.A09.CSt();
        A00();
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.00O, java.util.Map] */
    public C26908DIp(Context context, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, C22993BYp bYp, EDS eds, BZB bzb, CTL ctl, ArrayList arrayList, ArrayList arrayList2, Map map, Map map2, Map map3, Map map4, Lock lock) {
        Context context2 = context;
        this.A05 = context2;
        BZB bzb2 = bzb;
        this.A07 = bzb2;
        Lock lock2 = lock;
        this.A0B = lock2;
        Looper looper2 = looper;
        this.A0C = looper2;
        this.A06 = eds;
        GoogleApiAvailabilityLight googleApiAvailabilityLight2 = googleApiAvailabilityLight;
        Map map5 = map2;
        this.A08 = new C26909DIq(context2, looper2, googleApiAvailabilityLight2, (C22993BYp) null, bzb2, new C26906DIn(this), (CTL) null, arrayList2, map5, map4, lock2);
        Map map6 = map;
        this.A09 = new C26909DIq(context2, looper2, googleApiAvailabilityLight2, bYp, bzb2, new C26907DIo(this), ctl, arrayList, map6, map3, lock2);
        ? r4 = new AnonymousClass00O(0);
        Iterator A0x = AnonymousClass8BU.A0x(map5);
        while (A0x.hasNext()) {
            r4.put(A0x.next(), this.A08);
        }
        Iterator A0x2 = AnonymousClass8BU.A0x(map6);
        while (A0x2.hasNext()) {
            r4.put(A0x2.next(), this.A09);
        }
        this.A0A = Collections.unmodifiableMap(r4);
    }

    private final void A00() {
        Set<C28443E1j> set = this.A0D;
        for (C28443E1j e1j : set) {
            ((C22701BLe) e1j).A01.release();
        }
        set.clear();
    }

    private final void A01(C23203Bcx bcx) {
        int i = this.A00;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.A00 = 0;
            }
            this.A07.CSa(bcx);
        }
        A00();
        this.A00 = 0;
    }

    public static /* bridge */ /* synthetic */ void A02(C26908DIp dIp) {
        C23203Bcx bcx = dIp.A02;
        if (bcx != null) {
            int i = bcx.A01;
            C23203Bcx bcx2 = dIp.A03;
            if (i == 0) {
                if (bcx2 != null) {
                    int i2 = bcx2.A01;
                    if (AnonymousClass000.A1P(i2) || i2 == 4) {
                        int i3 = dIp.A00;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                                dIp.A00 = 0;
                            }
                            BZB bzb = dIp.A07;
                            C18210vx.A00(bzb);
                            bzb.CSe(dIp.A01);
                        }
                        dIp.A00();
                        dIp.A00 = 0;
                    } else if (dIp.A00 == 1) {
                        dIp.A00();
                    } else {
                        dIp.A01(bcx2);
                        dIp.A08.CSt();
                    }
                }
            } else if (bcx2 != null) {
                if (bcx2.A01 == 0) {
                    dIp.A09.CSt();
                    bcx = dIp.A02;
                    C18210vx.A00(bcx);
                } else {
                    if (dIp.A09.A00 < dIp.A08.A00) {
                        bcx = bcx2;
                    }
                }
                dIp.A01(bcx);
            }
        }
    }

    public final void CSm(BZL bzl) {
        PendingIntent activity;
        Object obj = this.A0A.get(bzl.A00);
        C18210vx.A02(obj, "GoogleApiClient is not configured to use the API required for this call.");
        C26909DIq dIq = this.A09;
        if (obj.equals(dIq)) {
            C23203Bcx bcx = this.A03;
            if (bcx != null && bcx.A01 == 4) {
                EDS eds = this.A06;
                if (eds == null) {
                    activity = null;
                } else {
                    activity = PendingIntent.getActivity(this.A05, System.identityHashCode(this.A07), eds.BZI(), CF5.A00 | 134217728);
                }
                bzl.CIq(new Status(activity, (C23203Bcx) null, (String) null, 4));
                return;
            }
        } else {
            dIq = this.A08;
        }
        dIq.CSm(bzl);
    }

    public final BZL CSn(BZL bzl) {
        PendingIntent activity;
        Object obj = this.A0A.get(bzl.A00);
        C18210vx.A02(obj, "GoogleApiClient is not configured to use the API required for this call.");
        C26909DIq dIq = this.A09;
        if (obj.equals(dIq)) {
            C23203Bcx bcx = this.A03;
            if (bcx != null && bcx.A01 == 4) {
                EDS eds = this.A06;
                if (eds == null) {
                    activity = null;
                } else {
                    activity = PendingIntent.getActivity(this.A05, System.identityHashCode(this.A07), eds.BZI(), CF5.A00 | 134217728);
                }
                bzl.CIq(new Status(activity, (C23203Bcx) null, (String) null, 4));
                return bzl;
            }
        } else {
            dIq = this.A08;
        }
        return dIq.CSn(bzl);
    }

    public final void CSu(PrintWriter printWriter, String str) {
        printWriter.append("").append("authClient").println(":");
        this.A09.CSu(printWriter, String.valueOf("").concat("  "));
        printWriter.append("").append("anonClient").println(":");
        this.A08.CSu(printWriter, String.valueOf("").concat("  "));
    }

    public final void CSv() {
        Lock lock = this.A0B;
        lock.lock();
        try {
            lock.lock();
            boolean A1T = AnonymousClass000.A1T(this.A00, 2);
            lock.unlock();
            this.A09.CSt();
            this.A03 = new C23203Bcx(4);
            if (A1T) {
                C27080DTf.A00(new BG6(this.A0C), this, 14);
            } else {
                A00();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r5.A00 == 1) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CSw() {
        /*
            r5 = this;
            java.util.concurrent.locks.Lock r4 = r5.A0B
            r4.lock()
            X.DIq r0 = r5.A08     // Catch:{ all -> 0x002a }
            X.EA6 r0 = r0.A0E     // Catch:{ all -> 0x002a }
            boolean r0 = r0 instanceof X.C26903DIk     // Catch:{ all -> 0x002a }
            r3 = 0
            if (r0 == 0) goto L_0x0026
            X.DIq r0 = r5.A09     // Catch:{ all -> 0x002a }
            X.EA6 r0 = r0.A0E     // Catch:{ all -> 0x002a }
            boolean r0 = r0 instanceof X.C26903DIk     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r0 != 0) goto L_0x0025
            X.Bcx r0 = r5.A03     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0021
            int r1 = r0.A01     // Catch:{ all -> 0x002a }
            r0 = 4
            if (r1 != r0) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r0 = r5.A00     // Catch:{ all -> 0x002a }
            if (r0 != r2) goto L_0x0026
        L_0x0025:
            r3 = 1
        L_0x0026:
            r4.unlock()
            return r3
        L_0x002a:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26908DIp.CSw():boolean");
    }

    public final boolean CSx(C28443E1j e1j) {
        Lock lock = this.A0B;
        lock.lock();
        try {
            lock.lock();
            boolean A1T = AnonymousClass000.A1T(this.A00, 2);
            lock.unlock();
            boolean z = false;
            if (A1T || CSw()) {
                C26909DIq dIq = this.A09;
                if (!(dIq.A0E instanceof C26903DIk)) {
                    this.A0D.add(e1j);
                    z = true;
                    if (this.A00 == 0) {
                        this.A00 = 1;
                    }
                    this.A03 = null;
                    dIq.CSs();
                }
            }
            return z;
        } catch (Throwable th) {
            throw th;
        } finally {
            lock.unlock();
        }
    }
}
