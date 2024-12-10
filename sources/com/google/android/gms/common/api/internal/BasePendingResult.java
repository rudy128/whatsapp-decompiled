package com.google.android.gms.common.api.internal;

import X.AJB;
import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.BE7;
import X.BG6;
import X.BZA;
import X.BZB;
import X.BZJ;
import X.BZK;
import X.C17880vN;
import X.C18210vx;
import X.C23084Baz;
import X.C23286Bea;
import X.C23437Bh2;
import X.C23499Bi4;
import X.C23509BiJ;
import X.C23510BiK;
import X.C24475C5q;
import X.C25260Cbz;
import X.CLF;
import X.DL1;
import X.DL2;
import X.E59;
import X.E5A;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult extends C24475C5q {
    public static final ThreadLocal A0C = new ThreadLocal();
    public E5A A00;
    public Status A01;
    public boolean A02;
    public boolean A03 = false;
    public boolean A04;
    public final Object A05 = C17880vN.A0p();
    public final WeakReference A06;
    public final ArrayList A07 = AnonymousClass000.A13();
    public final CountDownLatch A08 = BE7.A0u();
    public final AtomicReference A09 = new AtomicReference();
    public final C23286Bea A0A;
    public volatile boolean A0B;

    public static final E5A A00(BasePendingResult basePendingResult) {
        E5A e5a;
        synchronized (basePendingResult.A05) {
            C18210vx.A08(!basePendingResult.A0B, "Result has already been consumed.");
            C18210vx.A08(AnonymousClass000.A1P((basePendingResult.A08.getCount() > 0 ? 1 : (basePendingResult.A08.getCount() == 0 ? 0 : -1))), "Result is not ready.");
            e5a = basePendingResult.A00;
            basePendingResult.A00 = null;
            basePendingResult.A0B = true;
        }
        CLF clf = (CLF) basePendingResult.A09.getAndSet((Object) null);
        if (clf != null) {
            clf.A00.A01.remove(basePendingResult);
        }
        C18210vx.A00(e5a);
        return e5a;
    }

    private final void A01(E5A e5a) {
        this.A00 = e5a;
        this.A01 = e5a.BZg();
        this.A08.countDown();
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((E59) arrayList.get(i)).BpI(this.A01);
        }
        arrayList.clear();
    }

    public E5A A03(Status status) {
        if (this instanceof BZK) {
            return ((BZK) this).A00;
        }
        if (!(this instanceof BZJ)) {
            if (this instanceof C23509BiJ) {
                return new DL2(status, AnonymousClass000.A13());
            }
            if (this instanceof C23510BiK) {
                return new DL1(status, -1);
            }
            if (this instanceof C23437Bh2) {
                return new AJB(status, (C23084Baz) null);
            }
            boolean z = this instanceof C23499Bi4;
        }
        return status;
    }

    public void A04() {
        synchronized (this.A05) {
            if (!this.A02 && !this.A0B) {
                this.A02 = true;
                A01(A03(Status.A04));
            }
        }
    }

    public final void A05() {
        boolean z = true;
        if (!this.A03 && !AnonymousClass000.A1Y(A0C.get())) {
            z = false;
        }
        this.A03 = z;
    }

    public final void A06(E5A e5a) {
        synchronized (this.A05) {
            if (!this.A04 && !this.A02) {
                CountDownLatch countDownLatch = this.A08;
                countDownLatch.getCount();
                C18210vx.A08(!AnonymousClass000.A1P((countDownLatch.getCount() > 0 ? 1 : (countDownLatch.getCount() == 0 ? 0 : -1))), "Results have already been set");
                C18210vx.A08(!this.A0B, "Result has already been consumed");
                A01(e5a);
            }
        }
    }

    @Deprecated
    public final void A07(Status status) {
        synchronized (this.A05) {
            if (!AnonymousClass000.A1P((this.A08.getCount() > 0 ? 1 : (this.A08.getCount() == 0 ? 0 : -1)))) {
                A06(A03(status));
                this.A04 = true;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.BG6, X.Bea] */
    public BasePendingResult(C25260Cbz cbz) {
        Looper mainLooper;
        if (cbz == null) {
            mainLooper = Looper.getMainLooper();
        } else if (cbz instanceof BZA) {
            mainLooper = ((BZA) cbz).A00.A02;
        } else {
            mainLooper = ((BZB) cbz).A05;
        }
        this.A0A = new BG6(mainLooper);
        this.A06 = AnonymousClass3MW.A0z(cbz);
    }
}
