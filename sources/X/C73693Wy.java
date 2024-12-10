package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.3Wy  reason: invalid class name and case insensitive filesystem */
public final class C73693Wy extends C38391rD {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AnonymousClass1KW A01;
    public final List A02 = AnonymousClass000.A13();

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 2131625550) {
            return new AnonymousClass42g(C72473Md.A0I(2131625550, viewGroup));
        }
        if (i == 2131625162) {
            return new AnonymousClass42i(C72473Md.A0I(2131625162, viewGroup));
        }
        int i2 = 2131626158;
        if (i != 2131626158) {
            i2 = 2131626159;
            if (i != 2131626159) {
                if (i == 2131625870) {
                    View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131625870, viewGroup, false);
                    List list = C42011xT.A0I;
                    AnonymousClass1KW r1 = this.A01;
                    C18070vi.A0b(inflate);
                    return new AnonymousClass42j(inflate, r1, new AnonymousClass5TH(this));
                } else if (i == 2131625866) {
                    return new AnonymousClass42h(C72473Md.A0I(2131625866, viewGroup));
                } else {
                    throw AnonymousClass000.A0n("Unsupported view type");
                }
            }
        }
        return new C820942f(C72473Md.A0I(i2, viewGroup));
    }

    public int A0Q() {
        return this.A02.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0110, code lost:
        if (r6.A02 == 4) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x017b, code lost:
        if (r5.A01 != false) goto L_0x017d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r11, int r12) {
        /*
            r10 = this;
            X.3Xn r11 = (X.C73843Xn) r11
            r3 = 0
            X.C18070vi.A0d(r11, r3)
            java.util.List r0 = r10.A02
            java.lang.Object r5 = r0.get(r12)
            X.5Y4 r5 = (X.AnonymousClass5Y4) r5
            boolean r0 = r11 instanceof X.AnonymousClass42h
            if (r0 == 0) goto L_0x0038
            X.42h r11 = (X.AnonymousClass42h) r11
            X.4oK r5 = (X.C96734oK) r5
            X.C18070vi.A0d(r5, r3)
            X.0vp r0 = r11.A01
            java.lang.Object r1 = X.AnonymousClass3MY.A0l(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.1x1 r0 = r5.A00
            java.lang.String r0 = r0.A06
            r1.setText(r0)
            X.0vp r0 = r11.A00
            android.view.View r0 = X.AnonymousClass3Ma.A0A(r0)
            r2 = 3
        L_0x002f:
            X.78K r1 = new X.78K
            r1.<init>(r5, r2)
            r0.setOnClickListener(r1)
        L_0x0037:
            return
        L_0x0038:
            boolean r0 = r11 instanceof X.C820942f
            if (r0 == 0) goto L_0x005d
            X.42f r11 = (X.C820942f) r11
            X.C18070vi.A0d(r5, r3)
            boolean r0 = r5 instanceof X.C96714oI
            if (r0 == 0) goto L_0x004f
            X.0vp r0 = r11.A00
            java.lang.Object r0 = X.C72463Mc.A0m(r0)
            android.view.View r0 = (android.view.View) r0
            r2 = 1
            goto L_0x002f
        L_0x004f:
            boolean r0 = r5 instanceof X.C96724oJ
            if (r0 == 0) goto L_0x0037
            X.0vp r0 = r11.A00
            java.lang.Object r0 = X.C72463Mc.A0m(r0)
            android.view.View r0 = (android.view.View) r0
            r2 = 2
            goto L_0x002f
        L_0x005d:
            boolean r0 = r11 instanceof X.AnonymousClass42i
            if (r0 == 0) goto L_0x00ae
            X.42i r11 = (X.AnonymousClass42i) r11
            X.4oL r5 = (X.C96744oL) r5
            X.C18070vi.A0d(r5, r3)
            X.0vp r0 = r11.A02
            java.lang.Object r1 = X.AnonymousClass3MY.A0l(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r5.A00
            r1.setText(r0)
            X.0vp r0 = r11.A01
            android.view.View r2 = X.AnonymousClass3Ma.A0A(r0)
            X.C18070vi.A0X(r2)
            boolean r0 = r5.A02
            r1 = 8
            int r0 = X.C72453Mb.A07(r0)
            r2.setVisibility(r0)
            java.lang.Integer r0 = r5.A01
            if (r0 == 0) goto L_0x00a4
            int r2 = r0.intValue()
            X.0vp r1 = r11.A00
            android.view.View r0 = X.AnonymousClass3Ma.A0A(r1)
            r0.setVisibility(r3)
            java.lang.Object r0 = r1.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
            return
        L_0x00a4:
            X.0vp r0 = r11.A00
            android.view.View r0 = X.AnonymousClass3Ma.A0A(r0)
            r0.setVisibility(r1)
            return
        L_0x00ae:
            boolean r0 = r11 instanceof X.AnonymousClass42j
            if (r0 == 0) goto L_0x016b
            X.42j r11 = (X.AnonymousClass42j) r11
            X.4oN r5 = (X.C96764oN) r5
            X.C18070vi.A0d(r5, r3)
            boolean r7 = r5.A04
            X.1Di r0 = r5.A01
            X.1x1 r6 = r5.A00
            java.lang.Object r1 = r0.invoke(r6)
            java.lang.String r1 = (java.lang.String) r1
            X.0vp r8 = r11.A03
            java.lang.Object r0 = X.AnonymousClass3MY.A0l(r8)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r1 != 0) goto L_0x00d1
            java.lang.String r1 = ""
        L_0x00d1:
            r0.setText(r1)
            X.0vp r1 = r11.A05
            java.lang.Object r9 = X.AnonymousClass3MY.A0l(r1)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.String r4 = r6.A06
            android.view.View r0 = r11.A0H
            android.content.Context r2 = r0.getContext()
            java.lang.Object r0 = r1.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.text.TextPaint r1 = r0.getPaint()
            X.1KW r0 = r11.A01
            X.AnonymousClass3MY.A0u(r2, r1, r9, r0, r4)
            android.view.View r1 = r11.A00
            if (r7 == 0) goto L_0x0162
            r0 = 0
            r1.setOnClickListener(r0)
            r1.setClickable(r3)
        L_0x00fe:
            X.0vp r9 = r11.A02
            java.lang.Object r3 = X.AnonymousClass3MY.A0l(r9)
            X.C18070vi.A0X(r3)
            android.view.View r3 = (android.view.View) r3
            r4 = 0
            if (r7 == 0) goto L_0x0112
            int r2 = r6.A02
            r1 = 4
            r0 = 0
            if (r2 != r1) goto L_0x0114
        L_0x0112:
            r0 = 8
        L_0x0114:
            r3.setVisibility(r0)
            java.lang.Object r1 = r9.get()
            X.C18070vi.A0X(r1)
            android.view.View r1 = (android.view.View) r1
            r0 = 6
            X.AnonymousClass3MZ.A1O(r1, r5, r11, r0)
            X.0vp r3 = r11.A04
            java.lang.Object r2 = X.AnonymousClass3MY.A0l(r3)
            X.C18070vi.A0X(r2)
            android.view.View r2 = (android.view.View) r2
            r1 = 10
            X.4dr r0 = new X.4dr
            r0.<init>(r5, r11, r1)
            r2.setOnTouchListener(r0)
            java.lang.Object r1 = r3.get()
            X.C18070vi.A0X(r1)
            android.view.View r1 = (android.view.View) r1
            int r0 = X.C72453Mb.A07(r7)
            r1.setVisibility(r0)
            java.lang.Object r2 = r8.get()
            android.view.View r2 = (android.view.View) r2
            X.C18070vi.A0X(r2)
            if (r7 == 0) goto L_0x015b
            int r1 = r6.A02
            r0 = 4
            if (r1 == r0) goto L_0x015f
            if (r1 == 0) goto L_0x015f
        L_0x015b:
            r2.setVisibility(r4)
            return
        L_0x015f:
            r4 = 8
            goto L_0x015b
        L_0x0162:
            X.78K r0 = new X.78K
            r0.<init>(r5, r3)
            r1.setOnClickListener(r0)
            goto L_0x00fe
        L_0x016b:
            X.42g r11 = (X.AnonymousClass42g) r11
            X.4oM r5 = (X.C96754oM) r5
            X.C18070vi.A0d(r5, r3)
            boolean r4 = r5.A02
            if (r4 != 0) goto L_0x017d
            boolean r0 = r5.A01
            r1 = 2132084414(0x7f1506be, float:1.9808998E38)
            if (r0 == 0) goto L_0x0180
        L_0x017d:
            r1 = 2132084416(0x7f1506c0, float:1.9809002E38)
        L_0x0180:
            X.0vp r0 = r11.A00
            java.lang.Object r2 = X.AnonymousClass3MY.A0l(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            int r0 = r5.A00
            r2.setText(r0)
            X.C29261bv.A08(r2, r1)
            android.content.Context r1 = r2.getContext()
            r0 = 2131103152(0x7f060db0, float:1.7818762E38)
            X.AnonymousClass3MX.A1C(r1, r2, r0)
            boolean r0 = r5.A03
            r0 = r0 ^ 1
            r3 = 8
            int r0 = X.C72453Mb.A07(r0)
            r2.setVisibility(r0)
            X.0vp r2 = r11.A01
            android.view.View r1 = X.AnonymousClass3Ma.A0A(r2)
            X.C18070vi.A0X(r1)
            if (r4 != 0) goto L_0x01b7
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x01b7
            r3 = 0
        L_0x01b7:
            r1.setVisibility(r3)
            java.lang.Object r1 = r2.get()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131233507(0x7f080ae3, float:1.8083153E38)
            r1.setImageResource(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73693Wy.Bmc(X.1xT, int):void");
    }

    public int getItemViewType(int i) {
        Object obj = this.A02.get(i);
        if (obj instanceof C96754oM) {
            return 2131625550;
        }
        if (obj instanceof C96714oI) {
            return 2131626158;
        }
        if (obj instanceof C96724oJ) {
            return 2131626159;
        }
        if (obj instanceof C96764oN) {
            return 2131625870;
        }
        if (obj instanceof C96744oL) {
            return 2131625162;
        }
        if (obj instanceof C96734oK) {
            return 2131625866;
        }
        throw AnonymousClass3MW.A14();
    }

    public C73693Wy(AnonymousClass1KW r2) {
        this.A01 = r2;
    }
}
