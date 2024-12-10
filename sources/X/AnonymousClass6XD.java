package X;

import android.os.Bundle;

/* renamed from: X.6XD  reason: invalid class name */
public abstract class AnonymousClass6XD {
    public static final void A00(AnonymousClass1GP r3, Integer num) {
        String str;
        C18070vi.A0d(r3, 0);
        Bundle A0D = C17880vN.A0D();
        switch (num.intValue()) {
            case 0:
                str = "RESULT_ACCEPT";
                break;
            case 1:
                str = "RESULT_OK";
                break;
            case 2:
                str = "RESULT_DENY";
                break;
            case 3:
                str = "RESULT_BACK";
                break;
            case 4:
                str = "RESULT_OPT_IN";
                break;
            case 5:
                str = "RESULT_OPT_OUT";
                break;
            default:
                str = "RESULT_ERROR";
                break;
        }
        A0D.putString("result", str);
        r3.A0w("fragResultRequestKey", A0D);
    }
}
