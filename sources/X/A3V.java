package X;

import android.text.TextUtils;

public abstract class A3V {
    public static String A01(String str, String str2) {
        if ("PHONE".equals(str)) {
            return str2.replaceFirst("^\\+55", "");
        }
        return str2;
    }

    public static boolean A02(C20934Abo abo) {
        if (TextUtils.isEmpty(abo.A02)) {
            return false;
        }
        String str = abo.A03;
        if ("CPF".equals(str) || "CNPJ".equals(str) || "PHONE".equals(str) || "EMAIL".equals(str) || "EVP".equals(str)) {
            return true;
        }
        return false;
    }

    public static int A00(String str) {
        switch (str.hashCode()) {
            case 66937:
                if (str.equals("CPF")) {
                    return 2131893589;
                }
                break;
            case 69055:
                if (str.equals("EVP")) {
                    return 2131893591;
                }
                break;
            case 2073509:
                if (str.equals("CNPJ")) {
                    return 2131893588;
                }
                break;
            case 66081660:
                if (str.equals("EMAIL")) {
                    return 2131893590;
                }
                break;
            case 76105038:
                if (str.equals("PHONE")) {
                    return 2131893592;
                }
                break;
        }
        return 0;
    }
}
