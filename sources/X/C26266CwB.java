package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.CwB  reason: case insensitive filesystem */
public abstract class C26266CwB {
    public static final ComponentName A00 = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final C25122CYv A01 = new C25122CYv("Auth", "GoogleAuthUtil");
    public static final String[] A02 = {"com.google", "com.google.work", "cn.google"};

    public static Object A01(Task task, String str) {
        try {
            return Tasks.await(task);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof ApiException) {
                throw cause;
            }
            String format = String.format("Unable to get a result for %s due to ExecutionException.", new Object[]{str});
            A01.A01(format, new Object[0]);
            throw new IOException(format, e);
        } catch (InterruptedException e2) {
            String format2 = String.format("Interrupted while waiting for the task of %s to finish.", new Object[]{str});
            A01.A01(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (CancellationException e3) {
            String format3 = String.format("Canceled while waiting for the task of %s to finish.", new Object[]{str});
            A01.A01(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    public static TokenData A00(Context context, Bundle bundle) {
        C24355Bzq bzq;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 != null) {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            TokenData tokenData = (TokenData) bundle2.getParcelable("TokenData");
            if (tokenData != null) {
                return tokenData;
            }
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent");
        C24355Bzq[] values = C24355Bzq.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bzq = C24355Bzq.A0I;
                break;
            }
            bzq = values[i];
            if (bzq.zzak.equals(string)) {
                break;
            }
            i++;
        }
        C25122CYv cYv = A01;
        Object[] objArr = new Object[2];
        char A1X = BE7.A1X(bzq, "getTokenWithDetails", objArr);
        cYv.A01(String.format("[GoogleAuthUtil] error status:%s with method:%s", objArr), new Object[0]);
        if (C24355Bzq.A0G.equals(bzq) || C24355Bzq.A0J.equals(bzq) || C24355Bzq.A0K.equals(bzq) || C24355Bzq.A0L.equals(bzq) || C24355Bzq.A0H.equals(bzq) || C24355Bzq.A0M.equals(bzq) || C24355Bzq.A0A.equals(bzq) || C24355Bzq.A02.equals(bzq) || C24355Bzq.A03.equals(bzq) || C24355Bzq.A04.equals(bzq) || C24355Bzq.A05.equals(bzq) || C24355Bzq.A06.equals(bzq) || C24355Bzq.A07.equals(bzq) || C24355Bzq.A09.equals(bzq) || C24355Bzq.A01.equals(bzq) || C24355Bzq.A08.equals(bzq)) {
            C26123Csl.A00(context);
            DJF.A01.A00.CT0();
            if (!AnonymousClass000.A1Y(C25460CgD.A00.A02())) {
                throw new UserRecoverableAuthException((PendingIntent) null, intent, C24237Bxr.LEGACY, string);
            } else if (pendingIntent == null || intent == null) {
                AtomicBoolean atomicBoolean = GooglePlayServicesUtil.A02;
                try {
                    if (context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode >= Integer.MAX_VALUE && pendingIntent == null) {
                        Object[] A1a = AnonymousClass8BR.A1a();
                        A1a[0] = Integer.MAX_VALUE;
                        A1a[A1X] = "getTokenWithDetails";
                        A1a[2] = Integer.MAX_VALUE;
                        BE7.A1K(cYv.A02, String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", A1a), "Auth");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
                }
                if (intent == null) {
                    BE7.A1K(cYv.A02, String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", C108945cZ.A1a(string, "getTokenWithDetails", 2, A1X)), "Auth");
                }
                throw new UserRecoverableAuthException((PendingIntent) null, intent, C24237Bxr.LEGACY, string);
            } else {
                throw new UserRecoverableAuthException(pendingIntent, intent, C24237Bxr.AUTH_INSTANTIATION, string);
            }
        } else if (C24355Bzq.A0D.equals(bzq) || C24355Bzq.A0E.equals(bzq) || C24355Bzq.A0F.equals(bzq) || C24355Bzq.A0B.equals(bzq) || C24355Bzq.A0C.equals(bzq)) {
            throw C17880vN.A0f(string);
        } else {
            throw new C2U(string);
        }
    }

    public static void A03(Account account) {
        if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = A02;
            int i = 0;
            while (!strArr[i].equals(account.type)) {
                i++;
                if (i >= 3) {
                    throw AnonymousClass000.A0k("Account type not supported");
                }
            }
            return;
        }
        throw AnonymousClass000.A0k("Account name cannot be empty!");
    }

    public static void A06(Context context, String str) {
        Throwable th;
        Object obj;
        C18210vx.A04("Calling this from your main thread can lead to deadlock");
        A04(context);
        Bundle A0D = C17880vN.A0D();
        A05(context, A0D);
        C26123Csl.A00(context);
        DJG.A01.A00.CT0();
        if (AnonymousClass000.A1Y(C25470CgP.A09.A02()) && A07(context)) {
            BZ4 bz4 = new BZ4(context);
            C23176BcW bcW = new C23176BcW();
            bcW.A00 = str;
            C25069CWc A002 = C25558Chw.A00();
            A002.A03 = new C23191Bcl[]{CIP.A0B};
            A002.A01 = new DIU(bz4, bcW);
            A002.A00 = 1513;
            try {
                A01(C26126Cso.A02(bz4, A002.A00(), 1), "clear token");
                return;
            } catch (ApiException e) {
                C25122CYv cYv = A01;
                Object[] A1a = C17890vO.A1a("clear token");
                A1a[1] = Log.getStackTraceString(e);
                cYv.A01("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", A1a);
            }
        }
        ComponentName componentName = A00;
        C26338Cxv cxv = new C26338Cxv();
        C26122Csk A003 = C26122Csk.A00(context);
        try {
            if (A003.A02(cxv, new C26021Cqe(componentName), "GoogleAuthUtil")) {
                try {
                    C18210vx.A04("BlockingServiceConnection.getService() called on main thread");
                    if (!cxv.A00) {
                        cxv.A00 = true;
                        IBinder iBinder = (IBinder) cxv.A01.take();
                        if (iBinder == null) {
                            obj = null;
                        } else {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                            if (queryLocalInterface instanceof C28632EBm) {
                                obj = (C28632EBm) queryLocalInterface;
                            } else {
                                obj = new C26396Cyw(iBinder, "com.google.android.auth.IAuthManagerService");
                            }
                        }
                        C23249Bdz bdz = (C23249Bdz) obj;
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(bdz.A00);
                        obtain.writeString(str);
                        int A1V = BE8.A1V(obtain);
                        A0D.writeToParcel(obtain, A1V);
                        Parcel A004 = bdz.A00(2, obtain);
                        Bundle bundle = (Bundle) BEA.A0M(A004, Bundle.CREATOR);
                        A004.recycle();
                        if (bundle != null) {
                            String string = bundle.getString("Error");
                            if (bundle.getBoolean("booleanResult")) {
                                A003.A01(cxv, new C26021Cqe(componentName));
                                return;
                            }
                            th = new C2U(string);
                        } else {
                            A01.A01("Service call returned null.", new Object[A1V]);
                            th = C17880vN.A0f("Service unavailable.");
                        }
                    } else {
                        th = AnonymousClass000.A0n("Cannot call get on this connection more than once");
                    }
                    throw th;
                } catch (RemoteException | InterruptedException | TimeoutException e2) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e2);
                    throw new IOException("Error on service connection.", e2);
                } catch (Throwable th2) {
                    A003.A01(cxv, new C26021Cqe(componentName));
                    throw th2;
                }
            } else {
                throw C17880vN.A0f("Could not bind to service.");
            }
        } catch (SecurityException e3) {
            Object[] A1a2 = AnonymousClass3MW.A1a();
            BE6.A1M(e3, A1a2, 0);
            BE7.A1M("SecurityException while bind to auth service: %s", "GoogleAuthUtil", A1a2);
            throw new IOException("SecurityException while binding to Auth service.", e3);
        }
    }

    public static boolean A07(Context context) {
        if (C41381wH.A00.A02(context, 17895000) == 0) {
            DJG.A01.A00.CT0();
            EE6 ee6 = ((C23273BeN) C25470CgP.A04.A02()).zzd;
            String str = context.getApplicationInfo().packageName;
            Iterator it = ee6.iterator();
            while (it.hasNext()) {
                if (C17880vN.A0v(it).equals(str)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String A02(Account account, Context context, String str) {
        TokenData tokenData;
        Throwable th;
        Object obj;
        Bundle A0D = C17880vN.A0D();
        A03(account);
        C18210vx.A04("Calling this from your main thread can lead to deadlock");
        C18210vx.A05(str, "Scope cannot be empty or null.");
        A03(account);
        A04(context);
        Bundle bundle = new Bundle(A0D);
        A05(context, bundle);
        C26123Csl.A00(context);
        DJG.A01.A00.CT0();
        if (AnonymousClass000.A1Y(C25470CgP.A09.A02()) && A07(context)) {
            BZ4 bz4 = new BZ4(context);
            C18210vx.A05(str, "Scope cannot be null!");
            C25069CWc A002 = C25558Chw.A00();
            A002.A03 = new C23191Bcl[]{CIP.A0B};
            A002.A01 = new C26893DIa(account, bundle, bz4, str);
            A002.A00 = 1512;
            try {
                Bundle bundle2 = (Bundle) A01(C26126Cso.A02(bz4, A002.A00(), 1), "token retrieval");
                if (bundle2 != null) {
                    tokenData = A00(context, bundle2);
                    return tokenData.A01;
                }
                A01.A01("Service call returned null.", BE6.A1Z());
                throw C17880vN.A0f("Service unavailable.");
            } catch (ApiException e) {
                C25122CYv cYv = A01;
                Object[] A1a = C17890vO.A1a("token retrieval");
                A1a[1] = Log.getStackTraceString(e);
                cYv.A01("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", A1a);
            }
        }
        ComponentName componentName = A00;
        C26338Cxv cxv = new C26338Cxv();
        C26122Csk A003 = C26122Csk.A00(context);
        try {
            if (A003.A02(cxv, new C26021Cqe(componentName), "GoogleAuthUtil")) {
                try {
                    C18210vx.A04("BlockingServiceConnection.getService() called on main thread");
                    if (!cxv.A00) {
                        cxv.A00 = true;
                        IBinder iBinder = (IBinder) cxv.A01.take();
                        if (iBinder == null) {
                            obj = null;
                        } else {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                            if (queryLocalInterface instanceof C28632EBm) {
                                obj = (C28632EBm) queryLocalInterface;
                            } else {
                                obj = new C26396Cyw(iBinder, "com.google.android.auth.IAuthManagerService");
                            }
                        }
                        C23249Bdz bdz = (C23249Bdz) obj;
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(bdz.A00);
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                        obtain.writeString(str);
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                        Parcel A004 = bdz.A00(5, obtain);
                        Bundle bundle3 = (Bundle) BEA.A0M(A004, Bundle.CREATOR);
                        A004.recycle();
                        if (bundle3 != null) {
                            tokenData = A00(context, bundle3);
                            A003.A01(cxv, new C26021Cqe(componentName));
                            return tokenData.A01;
                        }
                        th = C17880vN.A0f("Service call returned null");
                    } else {
                        th = AnonymousClass000.A0n("Cannot call get on this connection more than once");
                    }
                    throw th;
                } catch (RemoteException | InterruptedException | TimeoutException e2) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e2);
                    throw new IOException("Error on service connection.", e2);
                } catch (Throwable th2) {
                    A003.A01(cxv, new C26021Cqe(componentName));
                    throw th2;
                }
            } else {
                throw C17880vN.A0f("Could not bind to service.");
            }
        } catch (SecurityException e3) {
            Object[] A1a2 = AnonymousClass3MW.A1a();
            BE6.A1M(e3, A1a2, 0);
            BE7.A1M("SecurityException while bind to auth service: %s", "GoogleAuthUtil", A1a2);
            throw new IOException("SecurityException while binding to Auth service.", e3);
        }
    }

    public static void A04(Context context) {
        try {
            GooglePlayServicesUtil.A01(context.getApplicationContext(), 8400000);
        } catch (BYT e) {
            int i = e.zza;
            throw new BYF(new Intent(e.zza), e.getMessage(), i);
        } catch (C24394C1p | GooglePlayServicesIncorrectManifestValueException e2) {
            throw new C2U(e2.getMessage(), e2);
        }
    }

    public static void A05(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        if (TextUtils.isEmpty(bundle.getString("androidPackageName"))) {
            bundle.putString("androidPackageName", str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }
}
