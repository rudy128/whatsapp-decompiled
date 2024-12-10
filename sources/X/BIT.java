package X;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class BIT extends FrameLayout implements E58 {
    public float A00 = 0.0533f;
    public C25589CiU A01 = C25589CiU.A05;
    public List A02 = Collections.emptyList();
    public final WebView A03;
    public final C22640BHa A04;

    public BIT(Context context) {
        super(context, (AttributeSet) null);
        C22640BHa bHa = new C22640BHa(context, (AttributeSet) null);
        this.A04 = bHa;
        BI2 bi2 = new BI2(context, this);
        this.A03 = bi2;
        bi2.setBackgroundColor(0);
        addView(bHa);
        addView(bi2);
    }

    public void CQM(C25589CiU ciU, List list, float f, float f2) {
        this.A01 = ciU;
        this.A00 = f;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass000.A0s("bitmap");
        }
        if (!this.A02.isEmpty() || !A132.isEmpty()) {
            this.A02 = A132;
            A01();
        }
        this.A04.CQM(ciU, A13, f, f2);
        invalidate();
    }

    public static String A00(int i) {
        Object[] A1a = BE6.A1a();
        AnonymousClass000.A1L(A1a, Color.red(i));
        AnonymousClass000.A1M(A1a, Color.green(i));
        AnonymousClass3Ma.A1S(A1a, Color.blue(i));
        A1a[3] = Double.valueOf(((double) Color.alpha(i)) / 255.0d);
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", A1a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r9 = this;
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.Object[] r3 = X.BE6.A1a()
            X.CiU r0 = r9.A01
            int r0 = r0.A03
            java.lang.String r0 = A00(r0)
            r6 = 0
            r3[r6] = r0
            float r4 = r9.A00
            r9.getHeight()
            int r2 = X.C72473Md.A04(r9)
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00ec
            float r0 = (float) r2
            float r4 = r4 * r0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00ec
            float r0 = X.C72473Md.A00(r9)
            float r4 = r4 / r0
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            X.BE6.A1T(r2, r4, r6)
            java.lang.String r1 = "%.2fpx"
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
        L_0x003d:
            r4 = 1
            r3[r4] = r0
            r0 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = 2
            r3[r0] = r1
            X.CiU r7 = r9.A01
            int r1 = r7.A02
            if (r1 == r4) goto L_0x00cb
            if (r1 == r0) goto L_0x00be
            r0 = 3
            if (r1 == r0) goto L_0x00d8
            r0 = 4
            if (r1 == r0) goto L_0x00b1
            java.lang.String r1 = "unset"
        L_0x005a:
            r0 = 3
            r3[r0] = r1
            java.lang.String r0 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2fem;text-shadow:%s;'>"
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r0 = java.lang.String.format(r8, r0, r3)
            r5.append(r0)
            java.util.HashMap r7 = X.C17880vN.A11()
            java.lang.String r2 = "default_bg"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "."
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ",."
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " *"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.CiU r0 = r9.A01
            int r0 = r0.A00
            java.lang.String r0 = A00(r0)
            r1[r6] = r0
            java.lang.String r0 = "background-color:%s;"
            java.lang.String r0 = java.lang.String.format(r8, r0, r1)
            r7.put(r2, r0)
            java.util.List r0 = r9.A02
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x00f0
            java.util.List r0 = r9.A02
            r0.get(r6)
            java.lang.String r0 = "position"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00b1:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            int r0 = r7.A01
            java.lang.String r0 = A00(r0)
            r2[r6] = r0
            java.lang.String r1 = "-0.05em -0.05em 0.15em %s"
            goto L_0x00e4
        L_0x00be:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            int r0 = r7.A01
            java.lang.String r0 = A00(r0)
            r2[r6] = r0
            java.lang.String r1 = "0.1em 0.12em 0.15em %s"
            goto L_0x00e4
        L_0x00cb:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            int r0 = r7.A01
            java.lang.String r0 = A00(r0)
            r2[r6] = r0
            java.lang.String r1 = "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"
            goto L_0x00e4
        L_0x00d8:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            int r0 = r7.A01
            java.lang.String r0 = A00(r0)
            r2[r6] = r0
            java.lang.String r1 = "0.06em 0.08em 0.15em %s"
        L_0x00e4:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = java.lang.String.format(r0, r1, r2)
            goto L_0x005a
        L_0x00ec:
            java.lang.String r0 = "unset"
            goto L_0x003d
        L_0x00f0:
            java.lang.String r0 = "</div></body></html>"
            java.lang.StringBuilder r3 = X.AnonymousClass8BT.A0y(r0, r5)
            java.lang.String r0 = "<html><head><style>"
            r3.append(r0)
            java.util.Iterator r2 = X.C17890vO.A0k(r7)
        L_0x00ff:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x011e
            java.lang.String r1 = X.C17880vN.A0v(r2)
            r3.append(r1)
            java.lang.String r0 = "{"
            r3.append(r0)
            java.lang.String r0 = X.C108945cZ.A1G(r1, r7)
            r3.append(r0)
            java.lang.String r0 = "}"
            r3.append(r0)
            goto L_0x00ff
        L_0x011e:
            java.lang.String r0 = "</style></head>"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r3)
            r5.insert(r6, r0)
            android.webkit.WebView r3 = r9.A03
            java.lang.String r1 = r5.toString()
            java.nio.charset.Charset r0 = X.CIB.A05
            byte[] r0 = r1.getBytes(r0)
            java.lang.String r2 = android.util.Base64.encodeToString(r0, r4)
            java.lang.String r1 = "text/html"
            java.lang.String r0 = "base64"
            r3.loadData(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BIT.A01():void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.A02.isEmpty()) {
            A01();
        }
    }
}
