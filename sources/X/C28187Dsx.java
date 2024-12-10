package X;

import android.content.Context;

/* renamed from: X.Dsx  reason: case insensitive filesystem */
public final class C28187Dsx extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28187Dsx(Context context, CTH cth, BTQ btq) {
        super(2);
        this.$model = btq;
        this.$controller = cth;
        this.$context = context;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.1Dh, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        if (X.C26188CuE.A02(r9.getInputType()) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            r9 = r14
            com.facebook.primitive.textinput.TextInputView r9 = (com.facebook.primitive.textinput.TextInputView) r9
            r2 = 1
            X.C18070vi.A0d(r9, r2)
            X.1Dh r10 = new X.1Dh
            r10.<init>()
            X.BTQ r0 = r12.$model
            X.9Iw r0 = r0.A05
            r7 = 0
            if (r0 == 0) goto L_0x0120
            int r0 = r0.A00()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x001b:
            X.BTQ r0 = r12.$model
            X.ByX r1 = r0.A03
            boolean r0 = r0.A0O
            int r5 = X.C24562C9i.A00(r1, r3, r0)
            boolean r6 = X.C26188CuE.A02(r5)
            r4 = 0
            if (r6 != 0) goto L_0x0037
            int r0 = r9.getInputType()
            boolean r0 = X.C26188CuE.A02(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0038
        L_0x0037:
            r3 = 1
        L_0x0038:
            r0 = 131087(0x2000f, float:1.83692E-40)
            r1 = r5 & r0
            r0 = 131073(0x20001, float:1.83672E-40)
            if (r1 == r0) goto L_0x004f
            int r1 = r9.getInputType()
            r0 = 131087(0x2000f, float:1.83692E-40)
            r1 = r1 & r0
            r0 = 131073(0x20001, float:1.83672E-40)
            if (r1 != r0) goto L_0x0050
        L_0x004f:
            r4 = 1
        L_0x0050:
            int r0 = r9.getInputType()
            if (r5 == r0) goto L_0x005b
            if (r3 == 0) goto L_0x00f0
            r9.setInputType(r5)
        L_0x005b:
            X.CTH r0 = r12.$controller
            X.CUS r0 = r0.A03
            if (r0 == 0) goto L_0x0123
            android.graphics.Typeface r1 = r0.A0C
            X.BTQ r0 = r12.$model
            android.graphics.Typeface r0 = r0.A01
            if (r0 == 0) goto L_0x00e5
            r9.setTypeface(r0)
        L_0x006c:
            if (r6 != 0) goto L_0x007f
            X.BTQ r0 = r12.$model
            boolean r1 = r0.A0O
            boolean r0 = r9.A00()
            if (r1 == r0) goto L_0x007f
            X.BTQ r0 = r12.$model
            boolean r0 = r0.A0O
            r9.setSingleLine(r0)
        L_0x007f:
            X.BTQ r0 = r12.$model
            java.lang.String r4 = r0.A0H
            boolean r3 = r0.A0N
            boolean r0 = r0.A0Q
            android.text.method.KeyListener r1 = r9.getKeyListener()
            if (r3 == 0) goto L_0x00e3
            if (r0 != 0) goto L_0x00e3
            if (r4 == 0) goto L_0x0095
            android.text.method.DigitsKeyListener r1 = android.text.method.DigitsKeyListener.getInstance(r4)
        L_0x0095:
            android.text.method.KeyListener r0 = r9.getKeyListener()
            if (r1 == r0) goto L_0x00a0
            r9.setKeyListener(r1)
            r10.element = r2
        L_0x00a0:
            X.BTQ r0 = r12.$model
            boolean r0 = r0.A0N
            r9.setEnabled(r0)
            X.BTQ r0 = r12.$model
            boolean r0 = r0.A0Q
            r0 = r0 ^ 1
            X.C25319CdP.A01(r9, r0)
            X.4rF r11 = X.C98494rF.A00()
            android.view.View$OnFocusChangeListener r8 = r9.getOnFocusChangeListener()
            boolean r0 = r8 instanceof X.C26574D4o
            if (r0 == 0) goto L_0x00e1
            X.D4o r8 = (X.C26574D4o) r8
        L_0x00be:
            X.BTQ r0 = r12.$model
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x00d4
            android.content.Context r0 = r12.$context
            X.D4p r1 = new X.D4p
            r1.<init>(r0, r2)
            r11.element = r1
            if (r8 == 0) goto L_0x00d4
            java.util.List r0 = r8.A00
            r0.add(r1)
        L_0x00d4:
            X.CTH r7 = r12.$controller
            X.Dml r6 = new X.Dml
            r6.<init>(r7, r8, r9, r10, r11)
            X.0I3 r0 = new X.0I3
            r0.<init>(r6)
            return r0
        L_0x00e1:
            r8 = r7
            goto L_0x00be
        L_0x00e3:
            r1 = 0
            goto L_0x0095
        L_0x00e5:
            android.graphics.Typeface r0 = r9.getTypeface()
            if (r0 == r1) goto L_0x006c
            r9.setTypeface(r1)
            goto L_0x006c
        L_0x00f0:
            if (r4 == 0) goto L_0x010d
            if (r5 != 0) goto L_0x0108
            r0 = 0
            r9.setRawInputType(r0)
            java.lang.Object r1 = X.BE9.A0j(r9)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            X.C18070vi.A0z(r1, r0)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r1.restartInput(r9)
            goto L_0x005b
        L_0x0108:
            r9.setInputType(r5)
            goto L_0x005b
        L_0x010d:
            r9.setRawInputType(r5)
            java.lang.Object r1 = X.BE9.A0j(r9)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            X.C18070vi.A0z(r1, r0)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r1.restartInput(r9)
            goto L_0x005b
        L_0x0120:
            r3 = r7
            goto L_0x001b
        L_0x0123:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28187Dsx.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
