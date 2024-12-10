package X;

import android.text.TextUtils;

public class A43 {
    public static final C185049bw A01 = new C185049bw("ICICI", 2131232452);
    public static final C185049bw A02 = new C185049bw("HDFC", 2131231570);
    public final C20080A6g A00;

    public A43(C20080A6g a6g) {
        this.A00 = a6g;
    }

    public static C185049bw A00(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            switch (str.hashCode()) {
                case 73456:
                    if (str.equals("JIO")) {
                        return new C185049bw("JIO", 2131232514);
                    }
                    break;
                case 81882:
                    if (str.equals("SBI")) {
                        return new C185049bw("SBI", 2131232913);
                    }
                    break;
                case 2023329:
                    if (str.equals("AXIS")) {
                        return new C185049bw("AXIS", 2131231066);
                    }
                    break;
                case 2212537:
                    if (str.equals("HDFC")) {
                        return new C185049bw("HDFC", 2131231570);
                    }
                    break;
            }
        }
        if (C18070vi.A18(str2, "CREDIT")) {
            return A02;
        }
        return A01;
    }
}
