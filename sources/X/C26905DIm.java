package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: X.DIm  reason: case insensitive filesystem */
public final class C26905DIm implements EA6 {
    public IAccountAccessor A00;
    public EDR A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public int A08 = 0;
    public int A09;
    public C23203Bcx A0A;
    public final Context A0B;
    public final GoogleApiAvailabilityLight A0C;
    public final C26909DIq A0D;
    public final CTL A0E;
    public final ArrayList A0F = AnonymousClass000.A13();
    public final Lock A0G;
    public final Bundle A0H = C17880vN.A0D();
    public final C22993BYp A0I;
    public final Map A0J;
    public final Set A0K = C17880vN.A12();

    public static final void A03(C26905DIm dIm) {
        dIm.A03 = false;
        C26909DIq dIq = dIm.A0D;
        dIq.A05.A03 = Collections.emptySet();
        for (Object next : dIm.A0K) {
            Map map = dIq.A0A;
            if (!map.containsKey(next)) {
                map.put(next, new C23203Bcx(17, (PendingIntent) null));
            }
        }
    }

    public final void CSk() {
    }

    public final void CSo(Bundle bundle) {
        if (A07(this, 1)) {
            if (bundle != null) {
                this.A0H.putAll(bundle);
            }
            if (A06(this)) {
                A00();
            }
        }
    }

    public final void CSp(C23203Bcx bcx, C24924CPx cPx, boolean z) {
        if (A07(this, 1)) {
            A01(bcx, cPx, this, z);
            if (A06(this)) {
                A00();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private final void A00() {
        IBinder iBinder;
        C26909DIq dIq = this.A0D;
        Lock lock = dIq.A0D;
        lock.lock();
        try {
            dIq.A05.A09();
            dIq.A0E = new C26903DIk(dIq);
            dIq.A0E.CSi();
            dIq.A0C.signalAll();
            lock.unlock();
            C24685CEz.A00.execute(new C27080DTf((Object) this, 10));
            EDR edr = this.A01;
            if (edr != null) {
                if (this.A05) {
                    IAccountAccessor iAccountAccessor = this.A00;
                    C18210vx.A00(iAccountAccessor);
                    boolean z = this.A06;
                    C23022BZy bZy = (C23022BZy) edr;
                    try {
                        C26392Cys cys = (C26392Cys) bZy.A04();
                        Integer num = bZy.A02;
                        C18210vx.A00(num);
                        int intValue = num.intValue();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(cys.A01);
                        if (iAccountAccessor == null) {
                            iBinder = null;
                        } else {
                            iBinder = iAccountAccessor.asBinder();
                        }
                        obtain.writeStrongBinder(iBinder);
                        obtain.writeInt(intValue);
                        obtain.writeInt(z ? 1 : 0);
                        cys.A00(9, obtain);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                A05(false);
            }
            Iterator A0x = AnonymousClass8BU.A0x(dIq.A0A);
            while (A0x.hasNext()) {
                Object obj = dIq.A09.get(A0x.next());
                C18210vx.A00(obj);
                ((EDS) obj).BIn();
            }
            Bundle bundle = this.A0H;
            if (bundle.isEmpty()) {
                bundle = null;
            }
            dIq.A07.CSe(bundle);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public static final void A02(C23203Bcx bcx, C26905DIm dIm) {
        ArrayList arrayList = dIm.A0F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        dIm.A05(!bcx.A00());
        C26909DIq dIq = dIm.A0D;
        dIq.A00(bcx);
        dIq.A07.CSa(bcx);
    }

    public static final void A04(C26905DIm dIm) {
        if (dIm.A09 != 0) {
            return;
        }
        if (!dIm.A03 || dIm.A04) {
            ArrayList A13 = AnonymousClass000.A13();
            dIm.A08 = 1;
            C26909DIq dIq = dIm.A0D;
            Map map = dIq.A09;
            dIm.A09 = map.size();
            Iterator A0x = AnonymousClass8BU.A0x(map);
            while (A0x.hasNext()) {
                Object next = A0x.next();
                if (!dIq.A0A.containsKey(next)) {
                    A13.add(map.get(next));
                } else if (A06(dIm)) {
                    dIm.A00();
                }
            }
            if (!A13.isEmpty()) {
                dIm.A0F.add(C24685CEz.A00.submit(new BZT(dIm, A13)));
            }
        }
    }

    private final void A05(boolean z) {
        EDR edr = this.A01;
        if (edr != null) {
            if (edr.isConnected() && z) {
                C23022BZy bZy = (C23022BZy) edr;
                try {
                    C26392Cys cys = (C26392Cys) bZy.A04();
                    Integer num = bZy.A02;
                    C18210vx.A00(num);
                    int intValue = num.intValue();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(cys.A01);
                    obtain.writeInt(intValue);
                    cys.A00(7, obtain);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            edr.BIn();
            C18210vx.A00(this.A0E);
            this.A00 = null;
        }
    }

    public static final boolean A06(C26905DIm dIm) {
        C23203Bcx bcx;
        int i = dIm.A09 - 1;
        dIm.A09 = i;
        if (i <= 0) {
            if (i < 0) {
                Log.w("GACConnecting", dIm.A0D.A05.A08());
                Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
                bcx = new C23203Bcx(8, (PendingIntent) null);
            } else {
                bcx = dIm.A0A;
                if (bcx == null) {
                    return true;
                }
                dIm.A0D.A00 = dIm.A07;
            }
            A02(bcx, dIm);
        }
        return false;
    }

    public static final boolean A07(C26905DIm dIm, int i) {
        String str;
        String str2;
        if (dIm.A08 == i) {
            return true;
        }
        Log.w("GACConnecting", dIm.A0D.A05.A08());
        Log.w("GACConnecting", "Unexpected callback in ".concat(dIm.toString()));
        Log.w("GACConnecting", AnonymousClass001.A1I("mRemainingConnections=", AnonymousClass000.A10(), dIm.A09));
        if (dIm.A08 != 0) {
            str = "STEP_GETTING_REMOTE_SERVICE";
        } else {
            str = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GoogleApiClient connecting is in step ");
        A10.append(str);
        A10.append(" but received callback for step ");
        if (i != 0) {
            str2 = "STEP_GETTING_REMOTE_SERVICE";
        } else {
            str2 = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        }
        Log.e("GACConnecting", AnonymousClass000.A0y(str2, A10), new Exception());
        A02(new C23203Bcx(8, (PendingIntent) null), dIm);
        return false;
    }

    public final void CSc(BZL bzl) {
        this.A0D.A05.A0F.add(bzl);
    }

    public final BZL CSd(BZL bzl) {
        throw AnonymousClass000.A0n("GoogleApiClient is not connected yet.");
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.EDS, X.EDR] */
    public final void CSi() {
        C26909DIq dIq = this.A0D;
        dIq.A0A.clear();
        this.A03 = false;
        this.A0A = null;
        this.A08 = 0;
        this.A02 = true;
        this.A04 = false;
        this.A05 = false;
        HashMap A11 = C17880vN.A11();
        Map map = this.A0J;
        Iterator A0x = AnonymousClass8BU.A0x(map);
        while (A0x.hasNext()) {
            C24924CPx cPx = (C24924CPx) A0x.next();
            C24599CAv cAv = cPx.A01;
            Object obj = dIq.A09.get(cAv);
            C18210vx.A00(obj);
            EDS eds = (EDS) obj;
            boolean A1Y = AnonymousClass000.A1Y(map.get(cPx));
            if (eds.CFe()) {
                this.A03 = true;
                if (A1Y) {
                    this.A0K.add(cAv);
                } else {
                    this.A02 = false;
                }
            }
            A11.put(eds, new C26914DIv(cPx, this, A1Y));
        }
        if (this.A03) {
            CTL ctl = this.A0E;
            C18210vx.A00(ctl);
            C22993BYp bYp = this.A0I;
            C18210vx.A00(bYp);
            BZB bzb = dIq.A05;
            ctl.A00 = Integer.valueOf(System.identityHashCode(bzb));
            DI5 di5 = new DI5(this);
            this.A01 = bYp.A00(this.A0B, bzb.A05, di5, di5, ctl, ctl.A01);
        }
        this.A09 = dIq.A09.size();
        this.A0F.add(C24685CEz.A00.submit(new BZT(this, (Map) A11)));
    }

    public final void CSq(int i) {
        A02(new C23203Bcx(8, (PendingIntent) null), this);
    }

    public final void CSr() {
        ArrayList arrayList = this.A0F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        A05(true);
        this.A0D.A00((C23203Bcx) null);
    }

    public C26905DIm(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight, C22993BYp bYp, C26909DIq dIq, CTL ctl, Map map, Lock lock) {
        this.A0D = dIq;
        this.A0E = ctl;
        this.A0J = map;
        this.A0C = googleApiAvailabilityLight;
        this.A0I = bYp;
        this.A0G = lock;
        this.A0B = context;
    }

    public static final void A01(C23203Bcx bcx, C24924CPx cPx, C26905DIm dIm, boolean z) {
        if ((!z || bcx.A00() || dIm.A0C.A03((Context) null, (String) null, bcx.A01) != null) && dIm.A0A == null) {
            dIm.A0A = bcx;
            dIm.A07 = Integer.MAX_VALUE;
        }
        C26909DIq dIq = dIm.A0D;
        dIq.A0A.put(cPx.A01, bcx);
    }
}
