package X;

import com.whatsapp.voipcalling.CallLinkInfo;

/* renamed from: X.Cd5  reason: case insensitive filesystem */
public abstract class C25301Cd5 {
    public static Integer A00(String str) {
        for (Integer num : AnonymousClass00R.A00(3)) {
            if (A01(num).equals(str)) {
                return num;
            }
        }
        return AnonymousClass00R.A00;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "fade";
            case 2:
                return "none";
            default:
                return CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
        }
    }
}
