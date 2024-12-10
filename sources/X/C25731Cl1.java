package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.Cl1  reason: case insensitive filesystem */
public class C25731Cl1 {
    public C26338Cxv A00;
    public C28631EBl A01;
    public boolean A02;
    public final Context A03;
    public final Object A04 = C17880vN.A0p();

    public static C25058CVo A00(Context context) {
        Throwable th;
        Throwable th2;
        C28631EBl eBl;
        IOException th3;
        C25058CVo cVo;
        C25731Cl1 cl1 = new C25731Cl1(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C18210vx.A04("Calling this from your main thread can lead to deadlock");
            synchronized (cl1) {
                try {
                    if (cl1.A02) {
                        cl1.A01();
                    }
                    Context context2 = cl1.A03;
                    try {
                        context2.getPackageManager().getPackageInfo("com.android.vending", 0);
                        int A022 = GoogleApiAvailabilityLight.A00.A02(context2, 12451000);
                        if (A022 == 0 || A022 == 2) {
                            C26338Cxv cxv = new C26338Cxv();
                            Intent A0G = C108945cZ.A0G("com.google.android.gms.ads.identifier.service.START");
                            A0G.setPackage("com.google.android.gms");
                            try {
                                if (C26111CsX.A01(context2, A0G, cxv, C26111CsX.A00(), C17890vO.A0U(context2), 1)) {
                                    cl1.A00 = cxv;
                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                    C18210vx.A04("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
                                    if (!cxv.A00) {
                                        cxv.A00 = true;
                                        IBinder iBinder = (IBinder) cxv.A01.poll(10000, timeUnit);
                                        if (iBinder != null) {
                                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                            if (queryLocalInterface instanceof C28631EBl) {
                                                eBl = (C28631EBl) queryLocalInterface;
                                            } else {
                                                eBl = new C26400Cz0(iBinder);
                                            }
                                            cl1.A01 = eBl;
                                            cl1.A02 = true;
                                        } else {
                                            th2 = new TimeoutException("Timed out waiting for the service connection");
                                        }
                                    } else {
                                        th2 = AnonymousClass000.A0n("Cannot call get on this connection more than once");
                                    }
                                    throw th2;
                                }
                                th = C17880vN.A0f("Connection failure");
                                throw th;
                            } catch (Throwable th4) {
                                th = new IOException(th4);
                            }
                        } else {
                            th = C17880vN.A0f("Google Play services not available");
                            throw th;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        th = new C24394C1p(9);
                    }
                } catch (InterruptedException unused2) {
                    th = C17880vN.A0f("Interrupted exception");
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            }
            C18210vx.A04("Calling this from your main thread can lead to deadlock");
            synchronized (cl1) {
                try {
                    if (!cl1.A02) {
                        synchronized (cl1.A04) {
                            try {
                                throw C17880vN.A0f("AdvertisingIdClient is not connected.");
                            } catch (Throwable th6) {
                                th3 = th6;
                                throw th3;
                            }
                        }
                    } else {
                        C18210vx.A00(cl1.A00);
                        C28631EBl eBl2 = cl1.A01;
                        C18210vx.A00(eBl2);
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel A002 = ((C26400Cz0) eBl2).A00(1, obtain);
                        String readString = A002.readString();
                        A002.recycle();
                        Parcel obtain2 = Parcel.obtain();
                        obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        obtain2.writeInt(1);
                        Parcel A003 = ((C26400Cz0) cl1.A01).A00(2, obtain2);
                        boolean A1O = AnonymousClass000.A1O(A003.readInt());
                        A003.recycle();
                        cVo = new C25058CVo(readString, A1O);
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    th3 = C17880vN.A0f("Remote exception");
                } catch (Throwable th7) {
                    th = th7;
                    throw th;
                }
            }
            synchronized (cl1.A04) {
                try {
                } catch (Throwable th8) {
                    while (true) {
                        th = th8;
                        break;
                    }
                }
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (Math.random() <= 0.0d) {
                HashMap A11 = C17880vN.A11();
                String str = "1";
                A11.put("app_context", str);
                if (true != cVo.A01) {
                    str = "0";
                }
                A11.put("limit_ad_tracking", str);
                String str2 = cVo.A00;
                if (str2 != null) {
                    A11.put("ad_id_size", Integer.toString(str2.length()));
                }
                A11.put("tag", "AdvertisingIdClient");
                A11.put("time_spent", Long.toString(elapsedRealtime2));
                new C27240DaK(A11).start();
            }
            cl1.A01();
            return cVo;
        } catch (Throwable th9) {
            cl1.A01();
            throw th9;
        }
    }

    public final void A01() {
        C18210vx.A04("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Context context = this.A03;
            if (this.A00 != null) {
                try {
                    if (this.A02) {
                        C26111CsX.A00().A02(context, this.A00);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.A02 = false;
                this.A01 = null;
                this.A00 = null;
            }
        }
    }

    public C25731Cl1(Context context) {
        C18210vx.A00(context);
        Context applicationContext = context.getApplicationContext();
        this.A03 = applicationContext != null ? applicationContext : context;
        this.A02 = false;
    }

    public final void finalize() {
        A01();
    }
}
