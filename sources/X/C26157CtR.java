package X;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.CtR  reason: case insensitive filesystem */
public abstract class C26157CtR {
    public static final C23191Bcl[] A0T = new C23191Bcl[0];
    public int A00;
    public int A01;
    public int A02 = 1;
    public long A03;
    public long A04;
    public long A05;
    public IInterface A06;
    public C23203Bcx A07 = null;
    public E5F A08;
    public IGmsServiceBroker A09;
    public CQ3 A0A;
    public AtomicInteger A0B = new AtomicInteger(0);
    public boolean A0C = false;
    public C26339Cxw A0D;
    public final int A0E;
    public final Context A0F;
    public final Handler A0G;
    public final C28445E1l A0H;
    public final C28446E1m A0I;
    public final Object A0J = C17880vN.A0p();
    public final Object A0K = C17880vN.A0p();
    public final String A0L;
    public final ArrayList A0M = AnonymousClass000.A13();
    public final Looper A0N;
    public final GoogleApiAvailabilityLight A0O;
    public final C26122Csk A0P;
    public volatile C23082Bax A0Q = null;
    public volatile String A0R;
    public volatile String A0S = null;

    public static final void A02(IInterface iInterface, C26157CtR ctR, int i) {
        String str;
        String str2;
        boolean z;
        CQ3 cq3;
        boolean z2 = false;
        boolean z3 = true;
        if (i != 4) {
            z3 = false;
        }
        boolean z4 = true;
        if (iInterface == null) {
            z4 = false;
        }
        if (z3 == z4) {
            z2 = true;
        }
        C18210vx.A06(z2);
        synchronized (ctR.A0J) {
            ctR.A02 = i;
            ctR.A06 = iInterface;
            if (i == 1) {
                C26339Cxw cxw = ctR.A0D;
                if (cxw != null) {
                    C26122Csk csk = ctR.A0P;
                    CQ3 cq32 = ctR.A0A;
                    String str3 = cq32.A00;
                    C18210vx.A00(str3);
                    csk.A01(cxw, new C26021Cqe(str3, cq32.A01, cq32.A02));
                    ctR.A0D = null;
                }
            } else if (i == 2 || i == 3) {
                C26339Cxw cxw2 = ctR.A0D;
                if (!(cxw2 == null || (cq3 = ctR.A0A) == null)) {
                    String str4 = cq3.A00;
                    String str5 = cq3.A01;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Calling connect() while still connected, missing disconnect() for ");
                    A10.append(str4);
                    Log.e("GmsClient", AnonymousClass001.A1H(" on ", str5, A10));
                    C26122Csk csk2 = ctR.A0P;
                    CQ3 cq33 = ctR.A0A;
                    String str6 = cq33.A00;
                    C18210vx.A00(str6);
                    csk2.A01(cxw2, new C26021Cqe(str6, cq33.A01, cq33.A02));
                    ctR.A0B.incrementAndGet();
                }
                AtomicInteger atomicInteger = ctR.A0B;
                C26339Cxw cxw3 = new C26339Cxw(ctR, atomicInteger.get());
                ctR.A0D = cxw3;
                if (ctR instanceof C23020BZw) {
                    str = "com.google.android.wearable.app.cn";
                    if (!((C23020BZw) ctR).A00.A01()) {
                        str = "com.google.android.gms";
                    }
                    str2 = "com.google.android.gms.wearable.BIND";
                } else {
                    str = "com.google.android.gms";
                    if (ctR instanceof C23022BZy) {
                        str2 = "com.google.android.gms.signin.service.START";
                    } else if (ctR instanceof C23019BZv) {
                        str2 = "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
                    } else if (ctR instanceof C23015BZr) {
                        str2 = "com.google.android.gms.safetynet.service.START";
                    } else if (ctR instanceof C23010BZk) {
                        str2 = "com.google.android.gms.nearby.bootstrap.service.NearbyBootstrapService.START";
                    } else if (ctR instanceof C23021BZx) {
                        str2 = "com.google.android.gms.nearby.connection.service.START";
                    } else if (ctR instanceof C23018BZu) {
                        str2 = "com.google.android.location.internal.GoogleLocationManagerService.START";
                    } else if (ctR instanceof C23009BZj) {
                        str2 = "com.google.android.gms.fido.fido2.regular.START";
                    } else if (ctR instanceof C23008BZi) {
                        str2 = "com.google.android.gms.clearcut.service.START";
                    } else if (ctR instanceof C23007BZh) {
                        str2 = "com.google.android.gms.auth.blockstore.service.START";
                    } else if (ctR instanceof C23011BZl) {
                        str2 = "com.google.android.gms.auth.account.authapi.START";
                    } else if (ctR instanceof C23016BZs) {
                        str2 = "com.google.android.gms.auth.service.START";
                    } else if (ctR instanceof C23014BZq) {
                        str2 = "com.google.android.gms.auth.api.accounttransfer.service.START";
                    } else if (ctR instanceof BZp) {
                        str2 = "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
                    } else if (ctR instanceof C23013BZo) {
                        str2 = "com.google.android.gms.auth.api.credentials.service.START";
                    } else if (ctR instanceof C23012BZn) {
                        str2 = "com.google.android.gms.auth.api.identity.service.signin.START";
                    } else if (ctR instanceof C23006BZg) {
                        str2 = "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
                    } else if (ctR instanceof BZm) {
                        str2 = "com.google.android.gms.common.telemetry.service.START";
                    } else {
                        str2 = "com.google.android.gms.auth.api.signin.service.START";
                    }
                }
                if ((ctR instanceof C23007BZh) || (ctR instanceof C23011BZl) || (ctR instanceof BZp) || (ctR instanceof C23012BZn) || (ctR instanceof BZm)) {
                    z = true;
                } else {
                    z = C108975cc.A1C(ctR.BUx(), 211700000);
                }
                CQ3 cq34 = new CQ3(str, str2, z);
                ctR.A0A = cq34;
                boolean z5 = cq34.A02;
                if (!z5 || ctR.BUx() >= 17895000) {
                    C26122Csk csk3 = ctR.A0P;
                    String str7 = cq34.A00;
                    C18210vx.A00(str7);
                    String str8 = cq34.A01;
                    String str9 = ctR.A0L;
                    if (str9 == null) {
                        str9 = C17890vO.A0U(ctR.A0F);
                    }
                    if (!csk3.A02(cxw3, new C26021Cqe(str7, str8, z5), str9)) {
                        CQ3 cq35 = ctR.A0A;
                        String str10 = cq35.A00;
                        String str11 = cq35.A01;
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("unable to connect to service: ");
                        A102.append(str10);
                        BEA.A1N(" on ", str11, "GmsClient", A102);
                        int i2 = atomicInteger.get();
                        C23215BdR bdR = new C23215BdR(ctR, 16);
                        Handler handler = ctR.A0G;
                        handler.sendMessage(handler.obtainMessage(7, i2, -1, bdR));
                    }
                } else {
                    throw AnonymousClass000.A0n(BE7.A0m("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ", cq34.A00));
                }
            } else if (i == 4) {
                C18210vx.A00(iInterface);
                ctR.A09(iInterface);
            }
        }
    }

    public abstract int BUx();

    public boolean CCu() {
        return false;
    }

    public boolean CFd() {
        return true;
    }

    public boolean CFe() {
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean A03(IInterface iInterface, C26157CtR ctR, int i, int i2) {
        synchronized (ctR.A0J) {
            if (ctR.A02 != i) {
                return false;
            }
            A02(iInterface, ctR, i2);
            return true;
        }
    }

    public final IInterface A04() {
        IInterface iInterface;
        synchronized (this.A0J) {
            if (this.A02 != 5) {
                A06();
                iInterface = this.A06;
                C18210vx.A02(iInterface, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    public String A05() {
        if (this instanceof C23020BZw) {
            return "com.google.android.gms.wearable.internal.IWearableService";
        }
        if (this instanceof C23022BZy) {
            return "com.google.android.gms.signin.internal.ISignInService";
        }
        if (this instanceof C23019BZv) {
            return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
        }
        if (this instanceof C23015BZr) {
            return "com.google.android.gms.safetynet.internal.ISafetyNetService";
        }
        if (this instanceof C23010BZk) {
            return "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
        }
        if (this instanceof C23021BZx) {
            return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
        }
        if (this instanceof C23018BZu) {
            return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
        }
        if (this instanceof C23009BZj) {
            return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
        }
        if (this instanceof C23008BZi) {
            return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
        }
        if (this instanceof C23007BZh) {
            return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
        }
        if (this instanceof C23011BZl) {
            return "com.google.android.gms.auth.account.data.IGoogleAuthService";
        }
        if (this instanceof C23016BZs) {
            return "com.google.android.gms.auth.api.internal.IAuthService";
        }
        if (this instanceof C23014BZq) {
            return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
        }
        if (this instanceof BZp) {
            return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
        }
        if (this instanceof C23013BZo) {
            return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
        }
        if (this instanceof C23012BZn) {
            return "com.google.android.gms.auth.api.identity.internal.ISignInService";
        }
        if (this instanceof C23006BZg) {
            return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
        }
        if (this instanceof BZm) {
            return "com.google.android.gms.common.internal.service.IClientTelemetryService";
        }
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public void A07(int i) {
        this.A00 = i;
        this.A03 = System.currentTimeMillis();
    }

    public void A08(Bundle bundle, IBinder iBinder, int i, int i2) {
        C23216BdS bdS = new C23216BdS(bundle, iBinder, this, i);
        Handler handler = this.A0G;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, bdS));
    }

    public boolean A0A() {
        if ((this instanceof C23020BZw) || (this instanceof C23019BZv) || (this instanceof C23015BZr) || (this instanceof C23010BZk) || (this instanceof C23021BZx) || (this instanceof C23018BZu) || (this instanceof C23009BZj) || (this instanceof C23007BZh) || (this instanceof C23011BZl) || (this instanceof C23016BZs) || (this instanceof C23014BZq) || (this instanceof BZp) || (this instanceof C23012BZn) || (this instanceof C23006BZg)) {
            return true;
        }
        return false;
    }

    public void BFd(E5F e5f) {
        C18210vx.A02(e5f, "Connection progress callbacks cannot be null.");
        this.A08 = e5f;
        A02((IInterface) null, this, 2);
    }

    public void BIn() {
        this.A0B.incrementAndGet();
        ArrayList arrayList = this.A0M;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                CWE cwe = (CWE) arrayList.get(i);
                synchronized (cwe) {
                    cwe.A00 = null;
                }
            }
            arrayList.clear();
        }
        synchronized (this.A0K) {
            this.A09 = null;
        }
        A02((IInterface) null, this, 1);
    }

    public void BIo(String str) {
        this.A0S = str;
        BIn();
    }

    /* JADX INFO: finally extract failed */
    public void BY1(IAccountAccessor iAccountAccessor, Set set) {
        Bundle A0D2;
        String str;
        String str2;
        C23191Bcl[] bclArr;
        char c;
        C23191Bcl bcl;
        if (this instanceof C23022BZy) {
            C23022BZy bZy = (C23022BZy) this;
            String str3 = bZy.A01.A02;
            if (!bZy.A0F.getPackageName().equals(str3)) {
                bZy.A00.putString("com.google.android.gms.signin.internal.realClientPackageName", str3);
            }
            A0D2 = bZy.A00;
        } else if (this instanceof C23019BZv) {
            C23019BZv bZv = (C23019BZv) this;
            A0D2 = C17880vN.A0D();
            A0D2.putInt("NearbyPermissions", bZv.A00);
            A0D2.putParcelable("ClientAppContext", bZv.A01);
        } else if (this instanceof C23021BZx) {
            A0D2 = C17880vN.A0D();
            A0D2.putLong("clientId", ((C23021BZx) this).A00);
        } else {
            if (this instanceof C23018BZu) {
                A0D2 = C17880vN.A0D();
                str = "client_name";
                str2 = ((C23018BZu) this).A02;
            } else if (this instanceof C23009BZj) {
                A0D2 = C17880vN.A0D();
                str = "FIDO2_ACTION_START_SERVICE";
                str2 = "com.google.android.gms.fido.fido2.regular.START";
            } else if (this instanceof C23016BZs) {
                A0D2 = ((C23016BZs) this).A00;
            } else if (this instanceof C23014BZq) {
                A0D2 = ((C23014BZq) this).A00;
            } else if (this instanceof BZp) {
                A0D2 = ((BZp) this).A00;
            } else if (this instanceof C23013BZo) {
                A0D2 = ((C23013BZo) this).A00.A00();
            } else if (this instanceof C23012BZn) {
                A0D2 = ((C23012BZn) this).A00;
            } else {
                A0D2 = C17880vN.A0D();
            }
            A0D2.putString(str, str2);
        }
        String str4 = this.A0R;
        Scope[] scopeArr = C23102BbH.A0F;
        Bundle A0D3 = C17880vN.A0D();
        int i = this.A0E;
        C23191Bcl[] bclArr2 = C23102BbH.A0E;
        C23102BbH bbH = new C23102BbH((Account) null, A0D3, (IBinder) null, (String) null, str4, bclArr2, bclArr2, scopeArr, 6, i, 12451000, 0, true, false);
        bbH.A03 = this.A0F.getPackageName();
        bbH.A01 = A0D2;
        Set set2 = set;
        if (set != null) {
            bbH.A07 = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (CFe()) {
            bbH.A00 = new Account("<<default account>>", "com.google");
            if (iAccountAccessor != null) {
                bbH.A02 = iAccountAccessor.asBinder();
            }
        }
        bbH.A05 = A0T;
        if (this instanceof C23020BZw) {
            bclArr = CI3.A04;
        } else {
            if (this instanceof C23021BZx) {
                bclArr = new C23191Bcl[10];
                bclArr[0] = CIV.A0j;
                bclArr[1] = CIV.A07;
                bclArr[2] = CIV.A0B;
                bclArr[3] = CIV.A09;
                bclArr[4] = CIV.A0C;
                bclArr[5] = CIV.A08;
                bclArr[6] = CIV.A0k;
                bclArr[7] = CIV.A0A;
                bclArr[8] = CIV.A0l;
                c = 9;
                bcl = CIV.A0D;
            } else if (this instanceof C23018BZu) {
                bclArr = CI9.A05;
            } else if (this instanceof C23009BZj) {
                bclArr = new C23191Bcl[2];
                bclArr[0] = CIT.A0A;
                c = 1;
                bcl = CIT.A09;
            } else if (this instanceof C23007BZh) {
                bclArr = AnonymousClass9UG.A06;
            } else if (this instanceof C23011BZl) {
                bclArr = new C23191Bcl[3];
                bclArr[0] = CIP.A0B;
                bclArr[1] = CIP.A0A;
                c = 2;
                bcl = CIP.A00;
            } else if ((this instanceof BZp) || (this instanceof C23012BZn)) {
                bclArr = CIJ.A08;
            } else if (this instanceof C23006BZg) {
                bclArr = CI2.A04;
            } else if (this instanceof BZm) {
                bclArr = CH5.A01;
            } else {
                bclArr = A0T;
            }
            bclArr[c] = bcl;
        }
        bbH.A06 = bclArr;
        if (A0A()) {
            bbH.A04 = true;
        }
        try {
            synchronized (this.A0K) {
                IGmsServiceBroker iGmsServiceBroker = this.A09;
                if (iGmsServiceBroker != null) {
                    C23329BfH bfH = new C23329BfH(this, this.A0B.get());
                    C26916DIx dIx = (C26916DIx) iGmsServiceBroker;
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        BE9.A15(bfH, obtain, "com.google.android.gms.common.internal.IGmsServiceBroker");
                        obtain.writeInt(1);
                        D39.A00(obtain, bbH, 0);
                        dIx.A00.transact(46, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i2 = this.A0B.get();
            Handler handler = this.A0G;
            handler.sendMessage(handler.obtainMessage(6, i2, 3));
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            A08((Bundle) null, (IBinder) null, 8, this.A0B.get());
        }
    }

    public Intent BZI() {
        throw BE6.A0v("Not a sign in API");
    }

    public boolean BeN() {
        boolean z;
        synchronized (this.A0J) {
            int i = this.A02;
            z = true;
            if (!(i == 2 || i == 3)) {
                z = false;
            }
        }
        return z;
    }

    public boolean isConnected() {
        boolean A1T;
        synchronized (this.A0J) {
            A1T = AnonymousClass000.A1T(this.A02, 4);
        }
        return A1T;
    }

    public C26157CtR(Context context, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, C28445E1l e1l, C28446E1m e1m, C26122Csk csk, String str, int i) {
        C18210vx.A02(context, "Context must not be null");
        this.A0F = context;
        C18210vx.A02(looper, "Looper must not be null");
        this.A0N = looper;
        C18210vx.A02(csk, "Supervisor must not be null");
        this.A0P = csk;
        C18210vx.A02(googleApiAvailabilityLight, "API availability must not be null");
        this.A0O = googleApiAvailabilityLight;
        this.A0G = new C23332BfK(looper, this);
        this.A0E = i;
        this.A0H = e1l;
        this.A0I = e1m;
        this.A0L = str;
    }

    public final void A06() {
        if (!isConnected()) {
            throw AnonymousClass000.A0n("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void A09(IInterface iInterface) {
        this.A04 = System.currentTimeMillis();
    }
}
