package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.3Q5  reason: invalid class name */
public final class AnonymousClass3Q5 extends LinearLayout {
    public boolean A00;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setData$lambda$2$lambda$0(X.AnonymousClass3Q5 r12, X.C106655Wr r13, int r14, android.view.View r15) {
        /*
            r3 = 0
            boolean r1 = X.C18070vi.A17(r12, r13)
            boolean r0 = r12.A00
            if (r0 != 0) goto L_0x00a6
            r12.A00 = r1
            X.4iG r13 = (X.C92994iG) r13
            int r0 = r13.A00
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r0 = r13.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.3Uv r1 = r0.A1j
            java.lang.Integer r10 = r0.A6K
            java.lang.String r13 = r0.A6Q
            r9 = 0
            X.1Dg r0 = r1.A03
            java.util.List r4 = X.AnonymousClass3MW.A10(r0)
            if (r4 == 0) goto L_0x00a6
            if (r14 < 0) goto L_0x00d9
            int r0 = r4.size()
            if (r14 >= r0) goto L_0x00d9
            X.1DT r7 = r1.A00
            X.206 r0 = X.AnonymousClass3MX.A0r(r7)
            if (r0 == 0) goto L_0x00a6
            X.205 r0 = r0.A0v
            if (r0 == 0) goto L_0x00a6
            X.1BI r8 = r0.A00
            if (r8 == 0) goto L_0x00a6
            java.lang.String r11 = X.C17880vN.A0w(r4, r14)
            java.util.concurrent.atomic.AtomicBoolean r4 = r1.A02
            boolean r6 = r4.get()
            if (r6 != 0) goto L_0x00a7
            X.1UD r0 = r1.A09
            X.0ve r5 = r0.A00
            X.0vf r2 = X.C18040vf.A01
            r0 = 12043(0x2f0b, float:1.6876E-41)
            boolean r0 = X.C18020vd.A05(r2, r5, r0)
            if (r0 == 0) goto L_0x00a7
            X.206 r2 = X.AnonymousClass3MX.A0r(r7)
            if (r2 == 0) goto L_0x00a7
            java.lang.Class<X.Ac9> r0 = X.C20955Ac9.class
            X.25F r0 = X.C18070vi.A09(r2, r0)
            X.229 r0 = r0.A02
            X.Ac9 r0 = (X.C20955Ac9) r0
            if (r0 == 0) goto L_0x00a7
            java.util.Map r0 = r0.A04
            if (r0 == 0) goto L_0x00a7
            java.lang.String r12 = X.C17880vN.A0s(r11, r0)
        L_0x0070:
            X.1iW r7 = r1.A05
            if (r6 != 0) goto L_0x0078
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
        L_0x0078:
            r7.A0T(r8, r9, r10, r11, r12, r13)
            boolean r0 = r4.get()
            if (r0 != 0) goto L_0x00a6
            X.1BI r0 = r1.A0E
            X.1i1 r5 = r1.A0A
            android.content.SharedPreferences r4 = X.C32951i1.A00(r5)
            java.lang.String r0 = r0.getRawString()
            X.C18070vi.A0d(r0, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "_BotMessagePromptsRowCount"
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r1)
            X.10s r2 = r5.A0T
            r1 = 8
            X.AkY r0 = new X.AkY
            r0.<init>(r5, r4, r3, r1)
            r2.execute(r0)
        L_0x00a6:
            return
        L_0x00a7:
            r12 = r9
            goto L_0x0070
        L_0x00a9:
            java.lang.Object r3 = r13.A01
            X.3Uy r3 = (X.C73343Uy) r3
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x00d6
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x00d6
            java.lang.String r0 = r3.A01
            int r0 = r0.length()
            if (r0 > 0) goto L_0x00d6
            java.util.List r0 = r3.A02
        L_0x00bf:
            java.lang.Object r0 = X.C29431cG.A0f(r0, r14)
            X.24Z r0 = (X.AnonymousClass24Z) r0
            if (r0 == 0) goto L_0x00a6
            X.1BI r2 = r3.A00
            if (r2 == 0) goto L_0x00a6
            X.1iW r1 = r3.A06
            java.lang.String r0 = r0.A01
            r1.A0W(r2, r0)
            X.C73343Uy.A00(r3)
            return
        L_0x00d6:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x00bf
        L_0x00d9:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BotMessagePromptsViewModel/onPromptClick "
            r2.append(r0)
            r2.append(r14)
            java.lang.String r0 = " out of range "
            r2.append(r0)
            int r1 = X.AnonymousClass3MX.A01(r4)
            X.1Oc r0 = new X.1Oc
            r0.<init>(r3, r1)
            java.lang.String r0 = X.C17890vO.A0V(r0, r2)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Q5.setData$lambda$2$lambda$0(X.3Q5, X.5Wr, int, android.view.View):void");
    }

    public final void setData(List list, C106655Wr r11) {
        boolean A15 = C18070vi.A15(list, r11);
        removeAllViews();
        int dimensionPixelSize = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131168779);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                AnonymousClass1ZU.A0B();
                throw null;
            }
            String str = (String) next;
            View inflate = AnonymousClass3MZ.A0D(this).inflate(2131624316, this, A15);
            AnonymousClass3MW.A1Q(inflate);
            C18070vi.A0b(inflate);
            TextView A0E = C17880vN.A0E(inflate, 2131428305);
            if (A0E != null) {
                A0E.setText(str);
            }
            inflate.setOnClickListener(new AnonymousClass78T(this, i, 5, r11));
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = dimensionPixelSize;
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                inflate.setLayoutParams(marginLayoutParams);
                addView(inflate);
                i = i2;
            } else {
                throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        this.A00 = A15;
    }
}
