package X;

import android.content.Context;
import android.graphics.Rect;
import android.widget.SeekBar;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.google.android.material.slider.Slider;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BL7 extends C39401t1 {
    public final Rect A00 = AnonymousClass3MW.A07();
    public final Slider A01;

    public int A1b(float f, float f2) {
        int i = 0;
        while (true) {
            Slider slider = this.A01;
            if (i >= C17880vN.A10(slider.A0T).size()) {
                return -1;
            }
            Rect rect = this.A00;
            slider.A0E(rect, i);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    public void A1i(List list) {
        for (int i = 0; i < C17880vN.A10(this.A01.A0T).size(); i++) {
            BE7.A11(i, list);
        }
    }

    public void A1h(C26228CvK cvK, int i) {
        String str;
        Context context;
        int i2;
        cvK.A0L(C26137Ct0.A0g);
        Slider slider = this.A01;
        ArrayList A10 = C17880vN.A10(slider.A0T);
        Number number = (Number) A10.get(i);
        float floatValue = number.floatValue();
        float f = slider.A01;
        float f2 = slider.A02;
        if (slider.isEnabled()) {
            if (floatValue > f) {
                cvK.A0A(DefaultCrypto.BUFFER_SIZE);
            }
            if (floatValue < f2) {
                cvK.A0A(ZipDecompressor.UNZIP_BUFFER_SIZE);
            }
        }
        cvK.A0N(C25477CgW.A00(f, f2, floatValue, 1));
        cvK.A0O(SeekBar.class.getName());
        StringBuilder A102 = AnonymousClass000.A10();
        if (slider.getContentDescription() != null) {
            A102.append(slider.getContentDescription());
            BE6.A1K(A102);
        }
        if (((float) ((int) floatValue)) == floatValue) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        String format = String.format(str, AnonymousClass000.A1b(number, 1));
        String string = slider.getContext().getString(2131899143);
        if (A10.size() > 1) {
            if (i == AnonymousClass3MX.A01(C17880vN.A10(slider.A0T))) {
                context = slider.getContext();
                i2 = 2131899141;
            } else if (i == 0) {
                context = slider.getContext();
                i2 = 2131899142;
            } else {
                string = "";
            }
            string = context.getString(i2);
        }
        Locale locale = Locale.US;
        Object[] A1a = C17890vO.A1a(string);
        A1a[1] = format;
        cvK.A0Q(AnonymousClass000.A0y(String.format(locale, "%s, %s", A1a), A102));
        Rect rect = this.A00;
        slider.A0E(rect, i);
        cvK.A02.setBoundsInParent(rect);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        r2 = r7.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1m(int r8, int r9, android.os.Bundle r10) {
        /*
            r7 = this;
            com.google.android.material.slider.Slider r6 = r7.A01
            boolean r0 = r6.isEnabled()
            r4 = 0
            if (r0 == 0) goto L_0x007b
            r1 = 4096(0x1000, float:5.74E-42)
            r3 = 1
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r9 == r1) goto L_0x0052
            if (r9 == r0) goto L_0x0052
            r0 = 16908349(0x102003d, float:2.38774E-38)
            if (r9 != r0) goto L_0x007b
            if (r10 == 0) goto L_0x007b
            java.lang.String r1 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r0 = r10.containsKey(r1)
            if (r0 == 0) goto L_0x007b
            float r1 = r10.getFloat(r1)
        L_0x0025:
            boolean r0 = com.google.android.material.slider.Slider.A0D(r6, r1, r8)
            if (r0 == 0) goto L_0x007b
            com.google.android.material.slider.Slider.A08(r6)
            r6.postInvalidate()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r0) goto L_0x0051
            android.view.accessibility.AccessibilityManager r0 = r7.A05
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0051
            android.view.View r2 = r7.A04
            android.view.ViewParent r1 = r2.getParent()
            if (r1 == 0) goto L_0x0051
            r0 = 2048(0x800, float:2.87E-42)
            android.view.accessibility.AccessibilityEvent r0 = X.C39401t1.A02(r7, r8, r0)
            r0.setContentChangeTypes(r4)
            r1.requestSendAccessibilityEvent(r2, r0)
        L_0x0051:
            return r3
        L_0x0052:
            float r1 = com.google.android.material.slider.Slider.A01(r6)
            if (r9 != r0) goto L_0x0059
            float r1 = -r1
        L_0x0059:
            int r0 = r6.getLayoutDirection()
            if (r0 != r3) goto L_0x0060
            float r1 = -r1
        L_0x0060:
            java.util.ArrayList r0 = r6.A0T
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            float r5 = X.BE9.A05(r0, r8)
            float r5 = r5 + r1
            float r2 = r6.A01
            float r1 = r6.A02
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            r1 = r2
            goto L_0x0025
        L_0x0075:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0025
            r1 = r5
            goto L_0x0025
        L_0x007b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BL7.A1m(int, int, android.os.Bundle):boolean");
    }

    public BL7(Slider slider) {
        super(slider);
        this.A01 = slider;
    }
}
