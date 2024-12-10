package X;

import android.graphics.Color;
import android.widget.ImageView;
import java.text.NumberFormat;
import java.text.ParseException;

public abstract class A90 {
    public static final ThreadLocal A00 = new C21594Ami("#dp");
    public static final ThreadLocal A01 = new C21594Ami("#%");
    public static final ThreadLocal A02 = new C21594Ami("#px");
    public static final ThreadLocal A03 = new C21594Ami("#sp");

    public static float A00(String str) {
        try {
            return A03(str, A01) * 100.0f;
        } catch (ParseException e) {
            throw new AnonymousClass9HX(AnonymousClass001.A1H("can't parse pixel value: ", str, AnonymousClass000.A10()), e);
        }
    }

    public static float A01(String str) {
        try {
            if (str.endsWith("px")) {
                return A03(str, A02);
            }
            if (str.endsWith("sp")) {
                return (float) Math.round(A03(str, A03) * C108965cb.A08(C25995CqB.A00().A00).scaledDensity);
            }
            if (str.endsWith("%")) {
                return A00(str);
            }
            return (float) Math.round(A03(str, A00) * (((float) C108965cb.A08(C25995CqB.A00().A00).densityDpi) / 160.0f));
        } catch (ParseException e) {
            throw new AnonymousClass9HX(AnonymousClass001.A1H("can't parse pixel value: ", str, AnonymousClass000.A10()), e);
        }
    }

    public static float A02(String str) {
        try {
            return A03(str, A03);
        } catch (ParseException e) {
            throw new AnonymousClass9HX(AnonymousClass001.A1H("can't parse scaled pixel value: ", str, AnonymousClass000.A10()), e);
        }
    }

    public static C25662Cjs A0A(String str) {
        float A012;
        Integer num;
        if ("auto".equalsIgnoreCase(str)) {
            return C25662Cjs.A02;
        }
        if (str.endsWith("%")) {
            A012 = Float.parseFloat(AnonymousClass8BS.A0o(str, str.length() - 1));
            num = AnonymousClass00R.A01;
        } else {
            A012 = A01(str);
            num = AnonymousClass00R.A00;
        }
        return new C25662Cjs(num, A012);
    }

    public static float A03(String str, ThreadLocal threadLocal) {
        return ((NumberFormat) threadLocal.get()).parse(str).floatValue();
    }

    public static int A04(String str) {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException e) {
            throw new AnonymousClass9HX(AnonymousClass001.A1H("can't parse color value: ", str, AnonymousClass000.A10()), e);
        }
    }

    public static int A05(String str) {
        switch (str.hashCode()) {
            case -1078030475:
                if (str.equals("medium")) {
                    return 2;
                }
                break;
            case 3154575:
                if (str.equals("full")) {
                    return 0;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    return 1;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    return 3;
                }
                break;
        }
        throw new AnonymousClass9HX(AnonymousClass001.A1H("Can't parse unknown datetime format: ", str, AnonymousClass000.A10()));
    }

    public static int A06(String str) {
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    return 1;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    return 8388613;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    return 8388611;
                }
                break;
        }
        throw new AnonymousClass9HX(AnonymousClass001.A1H("can't parse unknown textAlign: ", str, AnonymousClass000.A10()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r8.equals("bold") == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        throw new X.AnonymousClass9HX(X.AnonymousClass001.A1H("can't parse unknown typeface: ", r8, X.AnonymousClass000.A10()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A07(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            java.lang.String r7 = "semibold"
            java.lang.String r6 = "light"
            java.lang.String r5 = "heavy"
            r4 = 3
            java.lang.String r3 = "normal"
            java.lang.String r2 = "medium"
            java.lang.String r1 = "bold"
            switch(r0) {
                case -1178781136: goto L_0x0024;
                case -1078030475: goto L_0x002e;
                case -1039745817: goto L_0x0038;
                case 3029637: goto L_0x004a;
                case 99152071: goto L_0x0051;
                case 102970646: goto L_0x003f;
                case 1223860979: goto L_0x0064;
                case 1734741290: goto L_0x005b;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "can't parse unknown typeface: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r8, r1)
            X.9HX r0 = new X.9HX
            r0.<init>(r1)
            throw r0
        L_0x0024:
            java.lang.String r0 = "italic"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            r4 = 2
            return r4
        L_0x002e:
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L_0x0014
            A0B(r2, r1)
            goto L_0x006d
        L_0x0038:
            boolean r0 = r8.equals(r3)
            if (r0 != 0) goto L_0x0048
            goto L_0x0014
        L_0x003f:
            boolean r0 = r8.equals(r6)
            if (r0 == 0) goto L_0x0014
            A0B(r6, r3)
        L_0x0048:
            r4 = 0
            return r4
        L_0x004a:
            boolean r0 = r8.equals(r1)
            if (r0 != 0) goto L_0x006d
            goto L_0x0014
        L_0x0051:
            boolean r0 = r8.equals(r5)
            if (r0 == 0) goto L_0x0014
            A0B(r5, r1)
            goto L_0x006d
        L_0x005b:
            java.lang.String r0 = "bold_italic"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x006e
            goto L_0x0014
        L_0x0064:
            boolean r0 = r8.equals(r7)
            if (r0 == 0) goto L_0x0014
            A0B(r7, r1)
        L_0x006d:
            r4 = 1
        L_0x006e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A90.A07(java.lang.String):int");
    }

    public static ImageView.ScaleType A08(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    return ImageView.ScaleType.FIT_XY;
                }
                break;
            case 94852023:
                if (str.equals("cover")) {
                    return ImageView.ScaleType.CENTER_CROP;
                }
                break;
            case 951526612:
                if (str.equals("contain")) {
                    return ImageView.ScaleType.FIT_CENTER;
                }
                break;
        }
        throw new AnonymousClass9HX(AnonymousClass001.A1H("can't parse unknown scaleType: ", str, AnonymousClass000.A10()));
    }

    public static C179669Iw A09(String str) {
        switch (str.hashCode()) {
            case -2141169668:
                if (str.equals("cap_words")) {
                    return C179669Iw.CAP_WORDS;
                }
                break;
            case -2066832464:
                if (str.equals("text_no_suggestion")) {
                    return C179669Iw.TEXT_NO_SUGGESTIONS;
                }
                break;
            case -1831299680:
                if (str.equals("cap_letters")) {
                    return C179669Iw.CAP_LETTERS;
                }
                break;
            case -1413853096:
                if (str.equals("amount")) {
                    return C179669Iw.AMOUNT;
                }
                break;
            case -1034364087:
                if (str.equals("number")) {
                    return C179669Iw.NUMBER;
                }
                break;
            case 3076014:
                if (str.equals("date")) {
                    return C179669Iw.DATE;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    return C179669Iw.TEXT;
                }
                break;
            case 96619420:
                if (str.equals("email")) {
                    return C179669Iw.EMAIL;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    return C179669Iw.PHONE;
                }
                break;
            case 260133443:
                if (str.equals("cap_sentences")) {
                    return C179669Iw.CAP_SENTENCES;
                }
                break;
            case 1216389502:
                if (str.equals("passcode")) {
                    return C179669Iw.PASSCODE;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    return C179669Iw.PASSWORD;
                }
                break;
        }
        throw new AnonymousClass9HX(AnonymousClass001.A1H("can't parse unknown inputType: ", str, AnonymousClass000.A10()));
    }

    public static void A0B(String str, String str2) {
        C25913CoX.A01("text_style_ignored", AnonymousClass001.A1H(" is not supported, defaulting to ", str2, AnonymousClass000.A11(str)));
    }
}
