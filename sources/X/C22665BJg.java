package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.BJg  reason: case insensitive filesystem */
public class C22665BJg extends AnonymousClass1XU {
    public final TextInputLayout A00;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e6, code lost:
        if (r9 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0040, code lost:
        if (android.text.TextUtils.isEmpty(r14) == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Z(android.view.View r16, X.C26228CvK r17) {
        /*
            r15 = this;
            r2 = r17
            r0 = r16
            super.A1Z(r0, r2)
            com.google.android.material.textfield.TextInputLayout r4 = r15.A00
            android.widget.EditText r0 = r4.A0B
            if (r0 == 0) goto L_0x00f4
            android.text.Editable r7 = r0.getText()
        L_0x0011:
            java.lang.CharSequence r3 = r4.getHint()
            java.lang.CharSequence r6 = r4.getError()
            java.lang.CharSequence r9 = r4.getPlaceholderText()
            int r5 = r4.A07
            java.lang.CharSequence r14 = r4.getCounterOverflowDescription()
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r13 = r0 ^ 1
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = r0 ^ 1
            boolean r0 = r4.A0P
            r12 = r0 ^ 1
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r11 = r0 ^ 1
            if (r11 != 0) goto L_0x0042
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r10 = 0
            if (r0 != 0) goto L_0x0043
        L_0x0042:
            r10 = 1
        L_0x0043:
            if (r1 == 0) goto L_0x00f0
            java.lang.String r8 = r3.toString()
        L_0x0049:
            X.BIl r3 = r4.A17
            android.widget.TextView r1 = r3.A07
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00e9
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.A02
            r0.setLabelFor(r1)
            r2.A0F(r1)
        L_0x005b:
            java.lang.String r3 = ", "
            if (r13 == 0) goto L_0x00cc
            r2.A0X(r7)
        L_0x0062:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0076
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00be
            r2.A0S(r8)
        L_0x0071:
            r0 = r13 ^ 1
            r2.A0r(r0)
        L_0x0076:
            if (r7 == 0) goto L_0x00bc
            int r0 = r7.length()
            if (r0 != r5) goto L_0x00bc
        L_0x007e:
            android.view.accessibility.AccessibilityNodeInfo r1 = r2.A02
            r1.setMaxTextLength(r5)
            if (r10 == 0) goto L_0x008b
            if (r11 != 0) goto L_0x0088
            r6 = r14
        L_0x0088:
            r2.A0R(r6)
        L_0x008b:
            X.CtC r0 = r4.A16
            android.widget.TextView r0 = r0.A0B
            if (r0 == 0) goto L_0x0094
            r1.setLabelFor(r0)
        L_0x0094:
            X.BIm r0 = r4.A15
            X.CcZ r1 = r0.A03()
            boolean r0 = r1 instanceof X.Bio
            if (r0 == 0) goto L_0x00bb
            X.Bio r1 = (X.Bio) r1
            android.widget.AutoCompleteTextView r0 = r1.A04
            int r0 = r0.getInputType()
            if (r0 != 0) goto L_0x00b1
            java.lang.Class<android.widget.Spinner> r0 = android.widget.Spinner.class
            java.lang.String r0 = r0.getName()
            r2.A0O(r0)
        L_0x00b1:
            boolean r0 = r2.A0v()
            if (r0 == 0) goto L_0x00bb
            r0 = 0
            r2.A0S(r0)
        L_0x00bb:
            return
        L_0x00bc:
            r5 = -1
            goto L_0x007e
        L_0x00be:
            if (r13 == 0) goto L_0x00c8
            java.lang.StringBuilder r0 = X.C17890vO.A0f(r7)
            java.lang.String r8 = X.AnonymousClass001.A1H(r3, r8, r0)
        L_0x00c8:
            r2.A0X(r8)
            goto L_0x0071
        L_0x00cc:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00e6
            r2.A0X(r8)
            if (r12 == 0) goto L_0x0062
            if (r9 == 0) goto L_0x0062
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0o(r8, r3)
            java.lang.String r9 = X.C17890vO.A0V(r9, r0)
        L_0x00e1:
            r2.A0X(r9)
            goto L_0x0062
        L_0x00e6:
            if (r9 == 0) goto L_0x0062
            goto L_0x00e1
        L_0x00e9:
            com.google.android.material.internal.CheckableImageButton r0 = r3.A08
            r2.A0F(r0)
            goto L_0x005b
        L_0x00f0:
            java.lang.String r8 = ""
            goto L_0x0049
        L_0x00f4:
            r7 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22665BJg.A1Z(android.view.View, X.CvK):void");
    }

    public C22665BJg(TextInputLayout textInputLayout) {
        this.A00 = textInputLayout;
    }

    public void A1U(View view, AccessibilityEvent accessibilityEvent) {
        super.A1U(view, accessibilityEvent);
        C25277CcZ A03 = this.A00.A15.A03();
        if (A03 instanceof Bio) {
            Bio bio = (Bio) A03;
            if (accessibilityEvent.getEventType() == 1 && bio.A03.isEnabled() && bio.A04.getInputType() == 0) {
                Bio.A00(bio);
                bio.A05 = true;
                bio.A00 = System.currentTimeMillis();
            }
        }
    }
}
