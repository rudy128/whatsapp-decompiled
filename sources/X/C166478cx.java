package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.facebook.msys.mci.DefaultCrypto;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.8cx  reason: invalid class name and case insensitive filesystem */
public class C166478cx extends BV6 {
    public final /* synthetic */ C26025Cqj A00;

    public /* bridge */ /* synthetic */ void A0O(View view, DOZ doz, DFL dfl) {
        ALI ali = (ALI) C26272CwJ.A04(doz, dfl);
        ali.A04 = null;
        if (AnonymousClass3MW.A0C(view, 2131429504).getChildCount() != 0) {
            TextInputLayout textInputLayout = (TextInputLayout) AnonymousClass1HF.A06(view, 2131429868);
            EditText editText = (EditText) AnonymousClass1HF.A06(textInputLayout, 2131436091);
            ali.A00 = editText.getSelectionEnd();
            ali.A01 = editText.getSelectionStart();
            ali.A05 = AnonymousClass3Ma.A12(editText);
            editText.removeTextChangedListener(ali.A03);
            editText.setText("");
            TextWatcher textWatcher = ali.A02;
            if (textWatcher != null) {
                editText.removeTextChangedListener(textWatcher);
            }
            editText.setFilters(C20014A3g.A00);
            editText.setTypeface(Typeface.DEFAULT);
            editText.setEnabled(true);
            editText.setFocusableInTouchMode(true);
            editText.setFocusable(true);
            editText.setCursorVisible(true);
            textInputLayout.setPasswordVisibilityToggleEnabled(true);
            textInputLayout.setError((CharSequence) null);
            textInputLayout.setErrorEnabled(false);
            textInputLayout.setHint((CharSequence) "");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166478cx(DOZ doz, DFL dfl, C26025Cqj cqj) {
        super(doz, dfl);
        this.A00 = cqj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0M(android.view.View r16, X.DOZ r17, X.DFL r18, java.lang.Object r19) {
        /*
            r15 = this;
            r10 = r17
            r11 = r18
            java.lang.Object r12 = X.C26272CwJ.A04(r10, r11)
            X.C25344Ce3.A00(r12)
            X.ALI r12 = (X.ALI) r12
            android.content.Context r0 = r10.A00
            android.app.Activity r1 = X.AnonymousClass1L9.A00(r0)
            r5 = 0
            r0 = 41
            boolean r0 = r11.A0I(r0, r5)
            if (r0 == 0) goto L_0x001f
            X.AnonymousClass8BV.A11(r1)
        L_0x001f:
            java.lang.String r0 = r12.A05
            r1 = r16
            android.util.Pair r0 = X.C20014A3g.A01(r1, r10, r11, r0)
            java.lang.Object r4 = r0.first
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            java.lang.Object r3 = r0.second
            com.google.android.material.textfield.TextInputEditText r3 = (com.google.android.material.textfield.TextInputEditText) r3
            r12.A04 = r3
            r0 = 49
            java.lang.String r1 = r11.A0D(r0)
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            r3.setEnabled(r0)
            r3.setFocusableInTouchMode(r0)
            r3.setFocusable(r0)
            r2 = 1
            r3.setCursorVisible(r0)
            android.text.TextWatcher r9 = r12.A03
            if (r9 != 0) goto L_0x005f
            r6 = 58
            r0 = 0
            long r13 = r11.A05(r6, r0)
            X.AF7 r9 = new X.AF7
            r9.<init>(r10, r11, r12, r13)
            r12.A03 = r9
        L_0x005f:
            r3.addTextChangedListener(r9)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            X.D4G r0 = new X.D4G
            r0.<init>()
            r6.add(r0)
            r0 = 54
            java.lang.String r1 = r11.A0D(r0)
            if (r1 == 0) goto L_0x0086
            java.lang.String r0 = "lowercase"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0179
            X.8Cv r0 = new X.8Cv
            r0.<init>(r15)
        L_0x0083:
            r6.add(r0)
        L_0x0086:
            r1 = 44
            r0 = -1
            int r1 = r11.A04(r1, r0)
            if (r1 < 0) goto L_0x0097
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r1)
            r6.add(r0)
        L_0x0097:
            android.text.InputFilter[] r0 = new android.text.InputFilter[r5]
            java.lang.Object[] r0 = r6.toArray(r0)
            android.text.InputFilter[] r0 = (android.text.InputFilter[]) r0
            r3.setFilters(r0)
            r0 = 55
            java.lang.String r6 = r11.A0D(r0)
            r0 = 45
            java.lang.String r9 = r11.A0D(r0)
            r0 = 53
            java.lang.String r1 = r11.A0D(r0)
            r0 = 59
            java.lang.String r0 = r11.A0D(r0)
            r8 = 0
            if (r0 == 0) goto L_0x015e
            int r0 = X.C20014A3g.A00(r10, r0)
            if (r0 == 0) goto L_0x0176
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x00c7:
            if (r7 == 0) goto L_0x00e6
            if (r9 != 0) goto L_0x00cd
            if (r6 == 0) goto L_0x00e6
        L_0x00cd:
            int r0 = r7.intValue()
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x0158
            if (r6 != 0) goto L_0x00d9
            r6 = r9
        L_0x00d9:
            X.C18070vi.A0d(r6, r2)
            X.8jp r0 = new X.8jp
            r0.<init>(r3, r6)
        L_0x00e1:
            r12.A02 = r0
            r3.addTextChangedListener(r0)
        L_0x00e6:
            android.text.TextWatcher r1 = r12.A02
            if (r1 == 0) goto L_0x00f1
            android.text.Editable r0 = r3.getEditableText()
            r1.afterTextChanged(r0)
        L_0x00f1:
            int r6 = r12.A01
            if (r6 < 0) goto L_0x014c
            int r1 = r12.A00
            if (r1 < r6) goto L_0x014c
            java.lang.String r0 = r12.A05
            int r0 = r0.length()
            if (r1 > r0) goto L_0x014c
            r3.setSelection(r6, r1)
        L_0x0104:
            r0 = 46
            X.E8A r6 = r11.A0A(r0)
            if (r6 == 0) goto L_0x0123
            r0 = 11
            X.4dV r1 = new X.4dV
            r1.<init>((X.DOZ) r10, (X.DFL) r11, (X.E8A) r6, (int) r0)
            r4.setOnClickListener(r1)
            r0 = 2131436091(0x7f0b223b, float:1.8494043E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r4, r0)
            r0.setOnClickListener(r1)
            r0.setFocusable(r5)
        L_0x0123:
            java.util.Locale r0 = java.util.Locale.getDefault()
            int r0 = android.text.TextUtils.getLayoutDirectionFromLocale(r0)
            if (r0 != r2) goto L_0x012e
            r5 = 1
        L_0x012e:
            r1 = 5
            r2 = 3
            r0 = 3
            if (r5 == 0) goto L_0x0134
            r0 = 5
        L_0x0134:
            r4.setGravity(r0)
            if (r5 != 0) goto L_0x013a
            r1 = 3
        L_0x013a:
            r3.setGravity(r1)
            if (r7 == 0) goto L_0x014b
            int r1 = r7.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x0188
            if (r1 == r2) goto L_0x0188
            r0 = 4
            if (r1 == r0) goto L_0x0188
        L_0x014b:
            return r8
        L_0x014c:
            java.lang.String r0 = r12.A05
            if (r0 == 0) goto L_0x0104
            int r0 = r0.length()
            r3.setSelection(r0)
            goto L_0x0104
        L_0x0158:
            X.4ck r0 = new X.4ck
            r0.<init>(r3, r6)
            goto L_0x00e1
        L_0x015e:
            if (r1 == 0) goto L_0x0176
            X.9Iw r0 = X.A90.A09(r1)     // Catch:{ 9HX -> 0x016e }
            int r0 = r0.A00()     // Catch:{ 9HX -> 0x016e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ 9HX -> 0x016e }
            goto L_0x00c7
        L_0x016e:
            r6 = move-exception
            java.lang.String r1 = "WaRcFormInputComponentBinderUtils"
            java.lang.String r0 = "Error parsing text input type"
            X.C25913CoX.A00(r10, r1, r0, r6)
        L_0x0176:
            r7 = r8
            goto L_0x00e6
        L_0x0179:
            java.lang.String r0 = "uppercase"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0086
            android.text.InputFilter$AllCaps r0 = new android.text.InputFilter$AllCaps
            r0.<init>()
            goto L_0x0083
        L_0x0188:
            r3.setTextDirection(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166478cx.A0M(android.view.View, X.DOZ, X.DFL, java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0N(View view, DOZ doz, DFL dfl) {
        AnonymousClass3MW.A0C(view, 2131429504).removeAllViews();
        AnonymousClass1L9.A00(doz.A00).getWindow().clearFlags(DefaultCrypto.BUFFER_SIZE);
    }

    public /* bridge */ /* synthetic */ Object BHD(Context context) {
        return AnonymousClass3MX.A08(context, 2131627513);
    }
}
