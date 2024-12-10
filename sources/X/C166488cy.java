package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.CodeInputField;

/* renamed from: X.8cy  reason: invalid class name and case insensitive filesystem */
public class C166488cy extends BV6 {
    public final /* synthetic */ C26025Cqj A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166488cy(DOZ doz, DFL dfl, C26025Cqj cqj) {
        super(doz, dfl);
        this.A00 = cqj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a0, code lost:
        if (r2.equals("fb_pay") == false) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0M(android.view.View r19, X.DOZ r20, X.DFL r21, java.lang.Object r22) {
        /*
            r18 = this;
            r14 = r19
            r11 = 0
            r14.setFocusable(r11)
            r0 = 45
            r13 = r21
            java.lang.String r2 = r13.A0D(r0)
            r0 = 41
            java.lang.String r0 = r13.A0D(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0026
            int r0 = X.A90.A06(r0)     // Catch:{ 9HX -> 0x0020 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)     // Catch:{ 9HX -> 0x0020 }
            goto L_0x0028
        L_0x0020:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x0026:
            r17 = r5
        L_0x0028:
            r0 = 35
            java.lang.String r10 = r13.A0D(r0)
            r0 = 40
            java.lang.String r9 = r13.A0D(r0)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0 = 43
            r1 = 1
            boolean r0 = r13.A0I(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.equals(r0)
            r8 = r0 ^ 1
            r0 = 44
            boolean r0 = r13.A0I(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.equals(r0)
            r0 = r0 ^ 1
            r3 = r20
            if (r0 == 0) goto L_0x0143
            r0 = 42
            X.DFL r0 = r13.A09(r0)
            if (r0 == 0) goto L_0x0140
            int r0 = X.C25340Cdz.A01(r3, r0, r11)
        L_0x0067:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
        L_0x006b:
            r0 = 36
            int r7 = r13.A04(r0, r11)
            r0 = 2
            X.D6J r12 = new X.D6J
            r12.<init>(r3, r13, r0)
            r0 = 3
            X.D6J r6 = new X.D6J
            r6.<init>(r3, r13, r0)
            r0 = r18
            X.Cqj r4 = r0.A00
            android.content.Context r15 = r3.A00
            android.app.Activity r0 = X.AnonymousClass1L9.A00(r15)
            X.AnonymousClass8BV.A11(r0)
            r0 = 2131429150(0x7f0b071e, float:1.8479965E38)
            android.view.View r3 = r14.findViewById(r0)
            com.whatsapp.CodeInputField r3 = (com.whatsapp.CodeInputField) r3
            if (r3 != 0) goto L_0x00c6
            if (r2 == 0) goto L_0x00a2
            java.lang.String r0 = "fb_pay"
            boolean r2 = r2.equals(r0)
            r0 = 2131624546(0x7f0e0262, float:1.8876275E38)
            if (r2 != 0) goto L_0x00a5
        L_0x00a2:
            r0 = 2131624545(0x7f0e0261, float:1.8876273E38)
        L_0x00a5:
            android.view.View r3 = android.view.View.inflate(r15, r0, r5)
            com.whatsapp.CodeInputField r3 = (com.whatsapp.CodeInputField) r3
            X.4cl r0 = new X.4cl
            r0.<init>(r4, r1)
            r3.setCustomSelectionActionModeCallback(r0)
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            r14.addView(r3)
            X.ALi r2 = new X.ALi
            r2.<init>(r12, r6)
            if (r16 == 0) goto L_0x013c
            int r0 = r16.intValue()
            r3.A0M(r2, r7, r0)
        L_0x00c6:
            if (r17 == 0) goto L_0x00cf
            int r0 = r17.intValue()
            r3.setGravity(r0)
        L_0x00cf:
            if (r10 == 0) goto L_0x0138
            java.lang.String r0 = "error"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0138
            r3.setErrorState(r1)
            r3.A0K()
            java.lang.String r2 = "no_error"
            r1 = 40
            java.lang.String r0 = ""
            r13.A0H(r1, r0)
            r0 = 35
            r13.A0H(r0, r2)
            X.4ci r0 = r3.A03
            r3.removeTextChangedListener(r0)
            X.ALi r1 = new X.ALi
            r1.<init>(r12, r6)
            if (r16 == 0) goto L_0x0134
            int r0 = r16.intValue()
            r3.A0M(r1, r7, r0)
        L_0x0100:
            r3.setEnabled(r8)
            r3.setCursorVisible(r11)
            if (r10 != 0) goto L_0x0117
            if (r9 == 0) goto L_0x0117
            java.lang.String r0 = r3.getCode()
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0117
            r3.setCode(r9)
        L_0x0117:
            if (r8 == 0) goto L_0x0147
            r3.requestFocus()
            java.lang.Object r2 = r3.getTag()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 != 0) goto L_0x012e
            r0 = 14
            X.AkI r2 = new X.AkI
            r2.<init>(r4, r3, r0)
            r3.setTag(r2)
        L_0x012e:
            r0 = 0
            r3.postDelayed(r2, r0)
            return r5
        L_0x0134:
            r3.A0L(r1, r7)
            goto L_0x0100
        L_0x0138:
            r3.setErrorState(r11)
            goto L_0x0100
        L_0x013c:
            r3.A0L(r2, r7)
            goto L_0x00c6
        L_0x0140:
            r0 = 0
            goto L_0x0067
        L_0x0143:
            r16 = r5
            goto L_0x006b
        L_0x0147:
            r3.A0K()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166488cy.A0M(android.view.View, X.DOZ, X.DFL, java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0N(View view, DOZ doz, DFL dfl) {
        Context context = doz.A00;
        CodeInputField codeInputField = (CodeInputField) AnonymousClass1HF.A06(view, 2131429150);
        codeInputField.removeTextChangedListener(codeInputField.A03);
        if (codeInputField.getTag() != null) {
            codeInputField.removeCallbacks((Runnable) codeInputField.getTag());
        }
        ((ViewGroup) view).removeAllViews();
        AnonymousClass1L9.A00(context).getWindow().clearFlags(DefaultCrypto.BUFFER_SIZE);
    }

    public /* bridge */ /* synthetic */ void A0O(View view, DOZ doz, DFL dfl) {
    }

    public /* bridge */ /* synthetic */ Object BHD(Context context) {
        return AnonymousClass3MX.A08(context, 2131627509);
    }
}
