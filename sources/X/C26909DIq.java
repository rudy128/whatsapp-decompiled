package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: X.DIq  reason: case insensitive filesystem */
public final class C26909DIq implements EA7, EDT {
    public int A00;
    public C23203Bcx A01 = null;
    public final Context A02;
    public final GoogleApiAvailabilityLight A03;
    public final C22993BYp A04;
    public final BZB A05;
    public final C23288Bec A06;
    public final C28578E8o A07;
    public final CTL A08;
    public final Map A09;
    public final Map A0A = C17880vN.A11();
    public final Map A0B;
    public final Condition A0C;
    public final Lock A0D;
    public volatile EA6 A0E;

    public final void CSv() {
    }

    public final boolean CSw() {
        return this.A0E instanceof C26903DIk;
    }

    public final boolean CSx(C28443E1j e1j) {
        return false;
    }

    public final void A00(C23203Bcx bcx) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A01 = bcx;
            this.A0E = new C26904DIl(this);
            this.A0E.CSi();
            this.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public final void CSb(C23203Bcx bcx, C24924CPx cPx, boolean z) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.CSp(bcx, cPx, z);
        } finally {
            lock.unlock();
        }
    }

    public final void CSs() {
        this.A0E.CSk();
    }

    public final void CSt() {
        this.A0E.CSr();
        this.A0A.clear();
    }

    public final void CSu(PrintWriter printWriter, String str) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        String str2;
        String str3;
        PrintWriter printWriter2 = printWriter;
        String str4 = str;
        printWriter2.append(str4).append("mState=").println(this.A0E);
        Iterator A0x = AnonymousClass8BU.A0x(this.A0B);
        while (A0x.hasNext()) {
            String valueOf = String.valueOf(str4);
            C24924CPx cPx = (C24924CPx) A0x.next();
            printWriter2.append(str4).append(cPx.A02).println(":");
            Object obj = this.A09.get(cPx.A01);
            C18210vx.A00(obj);
            String concat = valueOf.concat("  ");
            C26157CtR ctR = (C26157CtR) ((EDS) obj);
            synchronized (ctR.A0J) {
                i = ctR.A02;
                iInterface = ctR.A06;
            }
            synchronized (ctR.A0K) {
                iGmsServiceBroker = ctR.A09;
            }
            printWriter2.append(concat).append("mConnectState=");
            if (i == 1) {
                str2 = "DISCONNECTED";
            } else if (i == 2) {
                str2 = "REMOTE_CONNECTING";
            } else if (i == 3) {
                str2 = "LOCAL_CONNECTING";
            } else if (i != 4) {
                str2 = "DISCONNECTING";
            } else {
                str2 = "CONNECTED";
            }
            printWriter2.print(str2);
            printWriter2.append(" mService=");
            if (iInterface == null) {
                printWriter2.append("null");
            } else {
                printWriter2.append(ctR.A05()).append("@").append(BE8.A0h(iInterface.asBinder()));
            }
            printWriter2.append(" mServiceBroker=");
            if (iGmsServiceBroker == null) {
                printWriter2.println("null");
            } else {
                printWriter2.append("IGmsServiceBroker@").println(BE8.A0h(iGmsServiceBroker.asBinder()));
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
            if (ctR.A04 > 0) {
                PrintWriter append = printWriter2.append(concat).append("lastConnectedTime=");
                long j = ctR.A04;
                String A0r = AnonymousClass8BU.A0r(simpleDateFormat, j);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(j);
                append.println(AnonymousClass001.A1H(" ", A0r, A10));
            }
            if (ctR.A03 > 0) {
                printWriter2.append(concat).append("lastSuspendedCause=");
                int i2 = ctR.A00;
                if (i2 == 1) {
                    str3 = "CAUSE_SERVICE_DISCONNECTED";
                } else if (i2 == 2) {
                    str3 = "CAUSE_NETWORK_LOST";
                } else if (i2 != 3) {
                    str3 = String.valueOf(i2);
                } else {
                    str3 = "CAUSE_DEAD_OBJECT_EXCEPTION";
                }
                printWriter2.append(str3);
                PrintWriter append2 = printWriter2.append(" lastSuspendedTime=");
                long j2 = ctR.A03;
                String A0r2 = AnonymousClass8BU.A0r(simpleDateFormat, j2);
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append(j2);
                append2.println(AnonymousClass001.A1H(" ", A0r2, A102));
            }
            if (ctR.A05 > 0) {
                printWriter2.append(concat).append("lastFailedStatus=").append(C24600CAw.A00(ctR.A01));
                PrintWriter append3 = printWriter2.append(" lastFailedTime=");
                long j3 = ctR.A05;
                String A0r3 = AnonymousClass8BU.A0r(simpleDateFormat, j3);
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append(j3);
                append3.println(AnonymousClass001.A1H(" ", A0r3, A103));
            }
        }
    }

    public final void onConnected(Bundle bundle) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.CSo(bundle);
        } finally {
            lock.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.CSq(i);
        } finally {
            lock.unlock();
        }
    }

    public C26909DIq(Context context, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, C22993BYp bYp, BZB bzb, C28578E8o e8o, CTL ctl, ArrayList arrayList, Map map, Map map2, Lock lock) {
        this.A02 = context;
        this.A0D = lock;
        this.A03 = googleApiAvailabilityLight;
        this.A09 = map;
        this.A08 = ctl;
        this.A0B = map2;
        this.A04 = bYp;
        this.A05 = bzb;
        this.A07 = e8o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((DI6) arrayList.get(i)).A00 = this;
        }
        this.A06 = new C23288Bec(looper, this);
        this.A0C = lock.newCondition();
        this.A0E = new C26904DIl(this);
    }

    public final void CSm(BZL bzl) {
        bzl.A05();
        this.A0E.CSc(bzl);
    }

    public final BZL CSn(BZL bzl) {
        bzl.A05();
        return this.A0E.CSd(bzl);
    }
}
