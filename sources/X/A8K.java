package X;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class A8K {
    public static final List A03;
    public final C18030ve A00;
    public final C18000vb A01;
    public final AnonymousClass1KI A02;

    static {
        ArrayList A0z = C17880vN.A0z(r3);
        for (Integer A012 : AnonymousClass00R.A00(3)) {
            A0z.add(C196769vc.A01(A012));
        }
        A03 = A0z;
    }

    public static final String A02(String str) {
        C18070vi.A0d(str, 0);
        Integer A002 = AnonymousClass9RA.A00(str);
        if (A002 == null) {
            return "other";
        }
        switch (A002.intValue()) {
            case 1:
                return "phonepe";
            case 2:
                return "paytm";
            default:
                return "gpay";
        }
    }

    public static final boolean A05(Context context, String str) {
        Iterator A0r = AnonymousClass8BS.A0r(context.getPackageManager().queryIntentActivities(AnonymousClass3MY.A07(Uri.parse("upi://pay")), 65536));
        while (A0r.hasNext()) {
            if (C18070vi.A18(((ResolveInfo) A0r.next()).activityInfo.packageName, str)) {
                return true;
            }
        }
        return false;
    }

    public static final AnonymousClass8pQ A00(Resources resources, String str) {
        int i;
        String str2 = str;
        if (C18070vi.A18(str, "WhatsappPay")) {
            i = 2131232428;
        } else {
            i = 2131232278;
            if (!C18070vi.A18(str, "other")) {
                Integer[] A002 = AnonymousClass00R.A00(3);
                int length = A002.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i = 0;
                        break;
                    }
                    Integer num = A002[i2];
                    if (C18070vi.A18(C196769vc.A01(num), str)) {
                        i = C196769vc.A00(num);
                        break;
                    }
                    i2++;
                }
            }
        }
        String A022 = A02(str);
        return new AnonymousClass8pQ(BitmapFactory.decodeResource(resources, i), str2, A01(resources, str), A022, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public static final LinkedHashMap A03(C18030ve r13, String str) {
        String A0J;
        String A0v = C108955ca.A0v(r13, 10662);
        LinkedHashMap A13 = C17880vN.A13();
        if (A0v.length() != 0) {
            JSONArray jSONArray = C17880vN.A16(A0v).getJSONArray("consolidated_payment_methods");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C195739tp r8 = new C195739tp(C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, jSONObject), C18070vi.A0J("android_process_id", jSONObject), C18070vi.A0J("logging_name", jSONObject), C18070vi.A0J("display_name", jSONObject), C18070vi.A0J("image_url", jSONObject));
                if (str.equals("android_process_id")) {
                    A0J = r8.A08;
                } else {
                    A0J = C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, jSONObject);
                }
                A13.put(A0J, r8);
            }
        }
        return A13;
    }

    public static final void A04(C195739tp r5, A8K a8k, C20928Abi abi) {
        ARR arr;
        String BLa;
        ARR arr2;
        C20937Abr abr = abi.A00;
        if (abr != null) {
            r5.A01 = abr.A02;
            r5.A02 = abr.A04;
            String str = abr.A03;
            r5.A00 = str;
            AnonymousClass1KJ A012 = a8k.A02.A01("INR");
            if (str.equals("flat_amount")) {
                C22565BDa bDa = abr.A00;
                if ((bDa instanceof ARR) && (arr2 = (ARR) bDa) != null) {
                    BLa = A012.BLc(a8k.A01, arr2.A02);
                } else {
                    return;
                }
            } else {
                C22565BDa bDa2 = abr.A01;
                if ((bDa2 instanceof ARR) && (arr = (ARR) bDa2) != null) {
                    BLa = A012.BLa(a8k.A01, arr.A02);
                } else {
                    return;
                }
            }
            r5.A03 = BLa;
        }
    }

    public A8K(C18000vb r1, AnonymousClass1KI r2, C18030ve r3) {
        C18070vi.A0o(r3, r1, r2);
        this.A00 = r3;
        this.A01 = r1;
        this.A02 = r2;
    }

    public static final String A01(Resources resources, String str) {
        int i;
        C18070vi.A0h(str, resources);
        if (str.equals("WhatsappPay")) {
            i = 2131893269;
        } else if (str.equals("com.google.android.apps.nbu.paisa.user")) {
            i = 2131893457;
        } else if (str.equals("com.phonepe.app")) {
            i = 2131893459;
        } else if (str.equals("net.one97.paytm")) {
            i = 2131893458;
        } else if (!str.equals("other")) {
            return "";
        } else {
            i = 2131893679;
        }
        return AnonymousClass3MY.A0m(resources, i);
    }
}
