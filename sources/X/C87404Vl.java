package X;

import android.content.Context;
import android.content.Intent;
import java.util.Locale;

/* renamed from: X.4Vl  reason: invalid class name and case insensitive filesystem */
public abstract class C87404Vl {
    public static int A00(C88344Zh r3) {
        String str;
        AnonymousClass2RG r2 = r3.A09;
        String str2 = r3.A0A;
        if (str2 != null) {
            str = str2.toLowerCase(Locale.US);
        } else {
            str = null;
        }
        switch (r2.ordinal()) {
            case 0:
                if ("wear os".equals(str)) {
                    return 2131233157;
                }
                break;
            case 1:
                return 2131231328;
            case 2:
                return 2131231331;
            case 3:
                return 2131231332;
            case 4:
                return 2131231335;
            case 5:
                return 2131231337;
            case 6:
                return 2131231330;
            case 7:
                if ("windows".equals(str)) {
                    return 2131231340;
                }
                if ("mac os".equals(str)) {
                    return 2131231333;
                }
                return 2131231329;
            case 8:
                return 2131233155;
            case 9:
            case 16:
            case 17:
                return 2131233154;
            case 10:
            case 11:
            case 12:
            case 13:
                return 2131231336;
            case 14:
                return 2131233156;
            case 15:
                return 2131231333;
            case 18:
                return 2131233157;
            case 21:
                return 2131231340;
            case 22:
                return 2131231334;
        }
        return 2131231338;
    }

    public static Intent A01(Context context, int i) {
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(context.getPackageName(), "com.whatsapp.companiondevice.LinkedDevicesActivity");
        A0A.putExtra("entry_point", i);
        return A0A;
    }
}
