package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class AJ3 implements C22411B6q {
    public final Context A00;
    public final ConnectivityManager A01;
    public final C19130xi A02;
    public final C19130xi A03;
    public final C182409Ug A04;
    public final URL A05;

    public AnonymousClass8R7 BI9(C180739Ns r9) {
        int type;
        int subtype;
        AnonymousClass9IS r0;
        int i;
        NetworkInfo activeNetworkInfo = this.A01.getActiveNetworkInfo();
        C195339tB A002 = r9.A00();
        A002.A01("sdk-version", Build.VERSION.SDK_INT);
        A002.A02("model", Build.MODEL);
        A002.A02("hardware", Build.HARDWARE);
        A002.A02("device", Build.DEVICE);
        A002.A02("product", Build.PRODUCT);
        A002.A02("os-uild", Build.ID);
        A002.A02("manufacturer", Build.MANUFACTURER);
        A002.A02("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
        Map map = A002.A05;
        if (map != null) {
            map.put("tz-offset", String.valueOf(offset));
            if (activeNetworkInfo == null) {
                type = C24313BzA.NONE.value;
            } else {
                type = activeNetworkInfo.getType();
            }
            A002.A01("net-type", type);
            if (activeNetworkInfo == null) {
                r0 = AnonymousClass9IS.UNKNOWN_MOBILE_SUBTYPE;
            } else {
                subtype = activeNetworkInfo.getSubtype();
                if (subtype == -1) {
                    r0 = AnonymousClass9IS.COMBINED;
                } else {
                    if (AnonymousClass9IS.A00.get(subtype) == null) {
                        subtype = 0;
                    }
                    A002.A01("mobile-subtype", subtype);
                    A002.A02("country", Locale.getDefault().getCountry());
                    A002.A02("locale", Locale.getDefault().getLanguage());
                    Context context = this.A00;
                    A002.A02("mcc_mnc", AnonymousClass8BR.A09(context).getSimOperator());
                    i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    A002.A02("application_build", Integer.toString(i));
                    return A002.A00();
                }
            }
            subtype = r0.value;
            A002.A01("mobile-subtype", subtype);
            A002.A02("country", Locale.getDefault().getCountry());
            A002.A02("locale", Locale.getDefault().getLanguage());
            Context context2 = this.A00;
            A002.A02("mcc_mnc", AnonymousClass8BR.A09(context2).getSimOperator());
            try {
                i = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                A3G.A02("CctTransportBackend", "Unable to find version code for package", e);
                i = -1;
            }
            A002.A02("application_build", Integer.toString(i));
            return A002.A00();
        }
        throw AnonymousClass000.A0n("Property \"autoMetadata\" has not been set");
    }

    public AJ3(Context context, C19130xi r6, C19130xi r7) {
        C20396AJj aJj = new C20396AJj();
        C20393AJg.A00.BFY(aJj);
        aJj.A01 = true;
        this.A04 = new C182409Ug(aJj);
        this.A00 = context;
        this.A01 = (ConnectivityManager) context.getSystemService("connectivity");
        String str = C19430yC.A03;
        try {
            this.A05 = new URL(str);
            this.A02 = r7;
            this.A03 = r6;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(AnonymousClass001.A1H("Invalid url: ", str, AnonymousClass000.A10()), e);
        }
    }
}
