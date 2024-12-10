package X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.DeadObjectException;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.whatsapp.connectivity.NetworkStateManager$Api24Utils;
import com.whatsapp.util.Log;

/* renamed from: X.1Kh  reason: invalid class name and case insensitive filesystem */
public final class C24431Kh {
    public final AnonymousClass190 A00;
    public final AnonymousClass11C A01;

    public C24431Kh(AnonymousClass190 r2, AnonymousClass11C r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final int A00(boolean z) {
        NetworkInfo networkInfo;
        String simCountryIso;
        String simOperator;
        String networkOperator;
        Boolean bool = C17960vV.A01;
        AnonymousClass11C r3 = this.A01;
        TelephonyManager A0K = r3.A0K();
        ConnectivityManager A0E = r3.A0E();
        int i = 0;
        if (!(A0E == null || A0K == null)) {
            try {
                networkInfo = A0E.getActiveNetworkInfo();
            } catch (RuntimeException e) {
                if (!(e.getCause() instanceof DeadObjectException)) {
                    if (AnonymousClass112.A02()) {
                        networkInfo = NetworkStateManager$Api24Utils.INSTANCE.logCriticalEventIfDeadSystemExceptionOrThrow$app_infra_core_core(this.A00, e);
                    } else {
                        throw e;
                    }
                }
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                if (networkInfo.getType() == 1) {
                    return 1;
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    Pair determineNetworkStateUsingSubscriptionManager$app_infra_core_core = NetworkStateManager$Api24Utils.INSTANCE.determineNetworkStateUsingSubscriptionManager$app_infra_core_core(r3, z);
                    Object obj = determineNetworkStateUsingSubscriptionManager$app_infra_core_core.first;
                    C18070vi.A0W(obj);
                    if (((Boolean) obj).booleanValue()) {
                        Object obj2 = determineNetworkStateUsingSubscriptionManager$app_infra_core_core.second;
                        C18070vi.A0W(obj2);
                        return ((Number) obj2).intValue();
                    }
                }
                i = 3;
                if (!(networkInfo.isRoaming() || A0K.isNetworkRoaming() || (simCountryIso = A0K.getSimCountryIso()) == null || simCountryIso.length() == 0 || (simOperator = A0K.getSimOperator()) == null || simOperator.length() == 0)) {
                    if (A0K.getPhoneType() != 2) {
                        String networkCountryIso = A0K.getNetworkCountryIso();
                        if (!(networkCountryIso == null || networkCountryIso.length() == 0 || !simCountryIso.equals(networkCountryIso) || (networkOperator = A0K.getNetworkOperator()) == null || networkOperator.length() == 0)) {
                            if (networkOperator.equals(simOperator) || AnonymousClass2W5.A00.contains(new C19760yx(networkOperator, simOperator))) {
                                return 2;
                            }
                            return 3;
                        }
                    }
                    return 2;
                }
            }
        }
        return i;
    }

    public final NetworkInfo A01() {
        try {
            Boolean bool = C17960vV.A01;
            AnonymousClass11C r1 = this.A01;
            AnonymousClass11C.A0P = true;
            ConnectivityManager A0E = r1.A0E();
            AnonymousClass11C.A0P = false;
            if (A0E != null) {
                return A0E.getActiveNetworkInfo();
            }
            Log.w("NetworkStateManager/getActiveNetworkInfo cm=null");
            return null;
        } catch (RuntimeException e) {
            if (AnonymousClass112.A02()) {
                return NetworkStateManager$Api24Utils.INSTANCE.logCriticalEventIfDeadSystemExceptionOrThrow$app_infra_core_core(this.A00, e);
            }
            throw e;
        }
    }

    public final boolean A02() {
        Boolean bool = C17960vV.A01;
        if (Build.VERSION.SDK_INT >= 24) {
            ConnectivityManager A0E = this.A01.A0E();
            if (A0E == null) {
                Log.w("NetworkStateManager/isDataSaverOn cm=null");
            } else if (A0E.isActiveNetworkMetered()) {
                A0E.getRestrictBackgroundStatus();
                if (A0E.getRestrictBackgroundStatus() == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
