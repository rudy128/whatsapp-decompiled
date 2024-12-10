package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public abstract class A3P {
    public static final String A01(Integer num) {
        if (num == null) {
            return "no_action";
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            return "click";
        }
        if (intValue == 2) {
            return "crop";
        }
        if (intValue == 3) {
            return "draw";
        }
        if (intValue == 4) {
            return "long_click";
        }
        if (intValue == 5) {
            return "start";
        }
        if (intValue == 6) {
            return "swipe";
        }
        if (intValue == 7) {
            return "switch";
        }
        if (intValue == 8) {
            return "trim";
        }
        if (intValue == 9) {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }
        if (intValue == 10) {
            return "pinch";
        }
        if (intValue == 11) {
            return "slide";
        }
        if (intValue == 12) {
            return "double_click";
        }
        if (intValue == 13) {
            return "scroll";
        }
        return "no_action";
    }

    public static final String A02(Integer num) {
        if (num == null) {
            return "no_chat_type";
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            return "individual";
        }
        if (intValue == 2) {
            return "group";
        }
        if (intValue == 3) {
            return "broadcast";
        }
        if (intValue == 4) {
            return "status";
        }
        if (intValue == 5) {
            return "channel";
        }
        if (intValue == 6) {
            return "interop";
        }
        if (intValue == 7) {
            return "multiple";
        }
        if (intValue == 8) {
            return "flows";
        }
        return "no_chat_type";
    }

    public static final Integer A00(AnonymousClass1BI r1) {
        int i;
        if (C22971Dz.A0e(r1)) {
            i = 2;
        } else if (C22971Dz.A0a(r1)) {
            i = 4;
        } else if (C22971Dz.A0O(r1)) {
            i = 3;
        } else if (C22971Dz.A0V(r1)) {
            i = 5;
        } else if (C22971Dz.A0S(r1)) {
            i = 6;
        } else if (!C22971Dz.A0d(r1)) {
            return null;
        } else {
            i = 1;
        }
        return Integer.valueOf(i);
    }
}
