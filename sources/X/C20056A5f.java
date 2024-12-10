package X;

import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.A5f  reason: case insensitive filesystem */
public abstract class C20056A5f {
    public static String A02(String str) {
        if (str != null) {
            Matcher A0z = AnonymousClass8BU.A0z(str.replaceAll("\\D", ""), "^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$");
            if (A0z.find()) {
                return A0z.group(1);
            }
        }
        return null;
    }

    public static C89384cN A00(C42771yi r6, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            String replaceAll = str.replaceAll("\\D", "");
            if (!TextUtils.isEmpty(str3) && !str3.equals("ZZ")) {
                try {
                    C42811ym A0H = r6.A0H(replaceAll, C108955ca.A0y(str3));
                    return new C89384cN(String.valueOf(A0H.countryCode_), String.valueOf(A0H.nationalNumber_), str2);
                } catch (C24931Mf e) {
                    Log.w("parsePhoneNumber/exception", e);
                }
            }
            String A02 = A02(replaceAll);
            if (A02 != null) {
                return new C89384cN(A02, replaceAll.substring(A02.length()), str2);
            }
        }
        return null;
    }

    public static String A01(AnonymousClass11C r3, AnonymousClass118 r4, C219217x r5) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        if (!r5.A0I()) {
            Log.i("verifynumber/getphonennumber/permission denied");
        } else {
            if (Build.VERSION.SDK_INT >= 22 && (activeSubscriptionInfoList = SubscriptionManager.from(r4.A00).getActiveSubscriptionInfoList()) != null) {
                for (SubscriptionInfo number : activeSubscriptionInfoList) {
                    String number2 = number.getNumber();
                    if (number2 != null) {
                        return number2;
                    }
                }
            }
            try {
                TelephonyManager A0K = r3.A0K();
                if (A0K != null) {
                    return A0K.getLine1Number();
                }
            } catch (Exception e) {
                Log.w("verifynumber/getphonennumber/error ", e);
                return null;
            }
        }
        return null;
    }

    public static ArrayList A03(C42771yi r6, AnonymousClass11C r7, C219217x r8) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        C89384cN A00;
        ArrayList A13 = AnonymousClass000.A13();
        if (!r8.A0I()) {
            Log.i("verifynumber/getphonennumbers/permission denied");
        } else if (Build.VERSION.SDK_INT >= 22) {
            SubscriptionManager A0J = r7.A0J();
            if (!(A0J == null || (activeSubscriptionInfoList = A0J.getActiveSubscriptionInfoList()) == null)) {
                for (SubscriptionInfo next : activeSubscriptionInfoList) {
                    if (!(next.getCarrierName() == null || (A00 = A00(r6, next.getNumber(), next.getCarrierName().toString(), next.getCountryIso())) == null)) {
                        A13.add(A00);
                    }
                }
            }
        } else {
            try {
                TelephonyManager A0K = r7.A0K();
                if (A0K != null) {
                    String line1Number = A0K.getLine1Number();
                    String networkOperatorName = A0K.getNetworkOperatorName();
                    Charset charset = AnonymousClass1K3.A06;
                    C89384cN A002 = A00(r6, line1Number, networkOperatorName, A0K.getSimCountryIso());
                    if (A002 != null) {
                        A13.add(A002);
                        return A13;
                    }
                }
            } catch (Exception e) {
                Log.w("verifynumber/getphonennumbers/error ", e);
                return A13;
            }
        }
        return A13;
    }
}
