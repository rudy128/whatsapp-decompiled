package X;

import android.text.InputFilter;

/* renamed from: X.A3g  reason: case insensitive filesystem */
public abstract class C20014A3g {
    public static final InputFilter[] A00 = new InputFilter[0];

    public static int A00(DOZ doz, String str) {
        if (str.equals("text_no_suggestion")) {
            return 655361;
        }
        if (!str.equals("numbers_and_punctuation")) {
            try {
                return A90.A09(str).A00();
            } catch (AnonymousClass9HX e) {
                C25913CoX.A00(doz, "WaRcFormInputComponentBinderUtils", "Error parsing text input type", e);
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0167, code lost:
        if ((r8 & 128) == 128) goto L_0x0169;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A01(android.view.View r10, X.DOZ r11, X.DFL r12, java.lang.String r13) {
        /*
            r0 = 36
            r5 = 0
            boolean r9 = r12.A0I(r0, r5)
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            android.view.ViewGroup r6 = X.AnonymousClass3MW.A0C(r10, r0)
            int r0 = r6.getChildCount()
            r2 = 0
            java.lang.String r4 = "WaRcFormInputComponentBinderUtils"
            if (r0 != 0) goto L_0x0068
            r0 = 52
            java.lang.String r0 = r12.A0D(r0)
            if (r0 == 0) goto L_0x002e
            float r0 = X.A90.A02(r0)     // Catch:{ 9HX -> 0x0028 }
            java.lang.Float r8 = java.lang.Float.valueOf(r0)     // Catch:{ 9HX -> 0x0028 }
            goto L_0x002f
        L_0x0028:
            r1 = move-exception
            java.lang.String r0 = "PAY: WaFormInputBinder/bindView cannot parse text size"
            X.C25913CoX.A00(r11, r4, r0, r1)
        L_0x002e:
            r8 = r2
        L_0x002f:
            android.content.Context r7 = r11.A00
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r7)
            r0 = 2131627516(0x7f0e0dfc, float:1.8882299E38)
            if (r9 == 0) goto L_0x003d
            r0 = 2131627517(0x7f0e0dfd, float:1.88823E38)
        L_0x003d:
            android.view.View r3 = r1.inflate(r0, r2, r5)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r7)
            r0 = 2131627514(0x7f0e0dfa, float:1.8882295E38)
            if (r9 == 0) goto L_0x004f
            r0 = 2131627515(0x7f0e0dfb, float:1.8882297E38)
        L_0x004f:
            android.view.View r1 = r1.inflate(r0, r2, r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r8 == 0) goto L_0x005e
            float r0 = r8.floatValue()
            r1.setTextSize(r0)
        L_0x005e:
            android.widget.LinearLayout$LayoutParams r0 = X.C72463Mc.A0R()
            r3.addView(r1, r5, r0)
            r6.addView(r3)
        L_0x0068:
            r0 = 2131429868(0x7f0b09ec, float:1.848142E38)
            android.view.View r6 = X.AnonymousClass1HF.A06(r10, r0)
            com.google.android.material.textfield.TextInputLayout r6 = (com.google.android.material.textfield.TextInputLayout) r6
            r0 = 2131436091(0x7f0b223b, float:1.8494043E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r6, r0)
            android.widget.EditText r3 = (android.widget.EditText) r3
            if (r13 == 0) goto L_0x0089
            java.lang.String r0 = X.AnonymousClass3Ma.A12(r3)
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0089
            r3.setText(r13)
        L_0x0089:
            r0 = 57
            java.lang.String r1 = r12.A0D(r0)
            r7 = 1
            if (r1 != 0) goto L_0x00bd
            r6.setError(r2)
            r6.setErrorEnabled(r5)
            r0 = 2132083246(0x7f15022e, float:1.9806629E38)
            r6.setErrorTextAppearance(r0)
            r0 = 2132083344(0x7f150290, float:1.9806828E38)
            if (r9 == 0) goto L_0x00a6
            r0 = 2132083345(0x7f150291, float:1.980683E38)
        L_0x00a6:
            r6.setHintTextAppearance(r0)
            r0 = 43
            java.lang.String r0 = r12.A0D(r0)
            if (r0 == 0) goto L_0x00b4
            r6.setHint((java.lang.CharSequence) r0)
        L_0x00b4:
            r0 = 51
            java.lang.String r0 = r12.A0D(r0)
            if (r0 == 0) goto L_0x00f5
            goto L_0x00e7
        L_0x00bd:
            r6.setErrorEnabled(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = " "
        L_0x00c8:
            r6.setError(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00de
            int r0 = r6.getChildCount()
            if (r0 <= r7) goto L_0x00de
            android.view.View r0 = r6.getChildAt(r7)
            X.C72453Mb.A1B(r0)
        L_0x00de:
            r0 = 2132083246(0x7f15022e, float:1.9806629E38)
            r6.setErrorTextAppearance(r0)
            goto L_0x00a6
        L_0x00e5:
            r0 = r1
            goto L_0x00c8
        L_0x00e7:
            int r0 = X.A90.A06(r0)     // Catch:{ 9HX -> 0x00ef }
            r3.setGravity(r0)     // Catch:{ 9HX -> 0x00ef }
            goto L_0x00f5
        L_0x00ef:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text align"
            X.C25913CoX.A00(r11, r4, r0, r1)
        L_0x00f5:
            r0 = 42
            java.lang.String r0 = r12.A0D(r0)
            if (r0 == 0) goto L_0x0104
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r5)
            r3.setTypeface(r0)
        L_0x0104:
            r0 = 59
            java.lang.String r1 = r12.A0D(r0)
            r0 = 53
            java.lang.String r0 = r12.A0D(r0)
            if (r1 == 0) goto L_0x0146
            int r0 = A00(r11, r1)
            if (r0 == 0) goto L_0x011b
            r3.setInputType(r0)
        L_0x011b:
            r0 = 35
            boolean r0 = r12.A0I(r0, r5)
            r0 = r0 ^ 1
            r3.setSingleLine(r0)
            r0 = 40
            boolean r0 = r12.A0I(r0, r5)
            if (r0 == 0) goto L_0x0131
            r6.setPasswordVisibilityToggleEnabled(r7)
        L_0x0131:
            r0 = 38
            boolean r0 = r12.A0I(r0, r5)
            if (r0 == 0) goto L_0x0141
            android.text.method.PasswordTransformationMethod r0 = new android.text.method.PasswordTransformationMethod
            r0.<init>()
            r3.setTransformationMethod(r0)
        L_0x0141:
            android.util.Pair r0 = X.C108945cZ.A0N(r6, r3)
            return r0
        L_0x0146:
            if (r0 == 0) goto L_0x011b
            X.9Iw r0 = X.A90.A09(r0)     // Catch:{ 9HX -> 0x0172 }
            int r8 = r0.A00()     // Catch:{ 9HX -> 0x0172 }
            r1 = 32
            r0 = r8 & 32
            if (r0 == r1) goto L_0x0169
            r1 = 8192(0x2000, float:1.14794E-41)
            r0 = r8 & r1
            if (r0 == r1) goto L_0x0169
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r8 & r1
            if (r0 == r1) goto L_0x0169
            r1 = 128(0x80, float:1.794E-43)
            r0 = r8 & r1
            r2 = 0
            if (r0 != r1) goto L_0x016a
        L_0x0169:
            r2 = 1
        L_0x016a:
            if (r2 != 0) goto L_0x016e
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
        L_0x016e:
            r3.setInputType(r8)     // Catch:{ 9HX -> 0x0172 }
            goto L_0x011b
        L_0x0172:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text input type"
            X.C25913CoX.A00(r11, r4, r0, r1)
            goto L_0x011b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20014A3g.A01(android.view.View, X.DOZ, X.DFL, java.lang.String):android.util.Pair");
    }
}
