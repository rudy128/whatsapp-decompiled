package X;

import java.util.Locale;

/* renamed from: X.4Ha  reason: invalid class name and case insensitive filesystem */
public abstract class C83884Ha {
    public static final int A00(String str) {
        int i;
        boolean z;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C18070vi.A0X(lowerCase);
            switch (lowerCase.hashCode()) {
                case -2139208497:
                    z = lowerCase.equals("misleading");
                    i = 2131895049;
                    break;
                case -1771213723:
                    z = lowerCase.equals("gambling");
                    i = 2131895046;
                    break;
                case -1560609346:
                    z = lowerCase.equals("digital_services_products");
                    i = 2131895045;
                    break;
                case -1338910485:
                    z = lowerCase.equals("dating");
                    i = 2131895043;
                    break;
                case -1152426539:
                    z = lowerCase.equals("tobacco");
                    i = 2131895054;
                    break;
                case -919668978:
                    z = lowerCase.equals("alcohol");
                    i = 2131895040;
                    break;
                case -856935945:
                    z = lowerCase.equals("animals");
                    i = 2131895041;
                    break;
                case -850113115:
                    z = lowerCase.equals("body_parts_fluids");
                    i = 2131895042;
                    break;
                case -596951334:
                    z = lowerCase.equals("supplements");
                    i = 2131895052;
                    break;
                case -371061680:
                    z = lowerCase.equals("illegal_products_services");
                    i = 2131895048;
                    break;
                case 3536713:
                    z = lowerCase.equals("spam");
                    i = 2131895051;
                    break;
                case 92676538:
                    z = lowerCase.equals("adult");
                    i = 2131895039;
                    break;
                case 306174265:
                    z = lowerCase.equals("violation_drugs");
                    i = 2131895056;
                    break;
                case 329032921:
                    z = lowerCase.equals("unauthorized_media");
                    i = 2131895055;
                    break;
                case 908259181:
                    z = lowerCase.equals("healthcare");
                    i = 2131895047;
                    break;
                case 1155840218:
                    z = lowerCase.equals("real_fake_currency");
                    i = 2131895050;
                    break;
                case 1223328215:
                    z = lowerCase.equals("weapons");
                    i = 2131895058;
                    break;
                case 1659800405:
                    z = lowerCase.equals("violent_content");
                    i = 2131895057;
                    break;
                case 1945443043:
                    z = lowerCase.equals("third_party_infringement");
                    i = 2131895053;
                    break;
            }
            if (!z) {
                return 2131895044;
            }
            return i;
        }
        return 2131895044;
    }
}
