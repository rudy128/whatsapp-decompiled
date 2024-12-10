package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import android.widget.EditText;
import java.util.HashMap;

/* renamed from: X.488  reason: invalid class name */
public final class AnonymousClass488 extends AnonymousClass48A {
    public boolean A00;
    public final EditText A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass1L2 A03;
    public final AnonymousClass1KW A04;
    public final C18030ve A05;
    public final C18010vc A06;
    public final boolean A07;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        if (X.AnonymousClass1YE.A0A(r2, r1, false) != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r8) {
        /*
            r7 = this;
            r6 = 0
            X.C18070vi.A0d(r8, r6)
            android.widget.EditText r5 = r7.A01
            android.text.Layout r0 = r5.getLayout()
            if (r0 == 0) goto L_0x006b
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x006b
            r7.A00 = r6
            r5.removeTextChangedListener(r7)
            int r4 = r5.getSelectionStart()
            android.text.Layout r0 = r5.getLayout()
            int r1 = r0.getLineForOffset(r4)
            if (r1 <= 0) goto L_0x0060
            android.text.Layout r0 = r5.getLayout()
            int r1 = r1 + -1
            int r3 = r0.getLineStart(r1)
            android.text.Layout r0 = r5.getLayout()
            int r1 = r0.getLineEnd(r1)
            java.lang.CharSequence r0 = r8.subSequence(r3, r1)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "* \n"
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "- \n"
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 != 0) goto L_0x0067
            java.lang.String r1 = "* "
            boolean r0 = X.AnonymousClass1YE.A0A(r2, r1, r6)
            if (r0 != 0) goto L_0x005d
            java.lang.String r1 = "- "
            boolean r0 = X.AnonymousClass1YE.A0A(r2, r1, r6)
            if (r0 == 0) goto L_0x0060
        L_0x005d:
            r8.insert(r4, r1)
        L_0x0060:
            r7.A00(r8)
            r5.addTextChangedListener(r7)
            return
        L_0x0067:
            r8.delete(r3, r1)
            goto L_0x0060
        L_0x006b:
            r7.A00(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass488.afterTextChanged(android.text.Editable):void");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i3 >= 1 && charSequence != null && charSequence.charAt(i) == 10) {
            this.A00 = true;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass488(android.widget.EditText r15, android.widget.TextView r16, X.AnonymousClass11C r17, X.C18000vb r18, X.AnonymousClass1L2 r19, X.AnonymousClass1KW r20, X.C18030ve r21, X.C18010vc r22, int r23, int r24, boolean r25) {
        /*
            r14 = this;
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
            r8 = r22
            X.C18070vi.A0w(r7, r6, r3, r4, r8)
            r1 = r15
            r5 = r19
            X.C18070vi.A0l(r5, r15)
            r12 = 0
            r0 = r14
            r2 = r16
            r9 = r23
            r10 = r24
            r11 = r25
            r13 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.A05 = r7
            r14.A04 = r6
            r14.A02 = r3
            r14.A06 = r8
            r14.A03 = r5
            r14.A01 = r15
            r14.A07 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass488.<init>(android.widget.EditText, android.widget.TextView, X.11C, X.0vb, X.1L2, X.1KW, X.0ve, X.0vc, int, int, boolean):void");
    }

    public final void A00(Editable editable) {
        Editable editable2 = editable;
        if (this.A07) {
            C18030ve r7 = this.A05;
            EditText editText = this.A01;
            Context context = editText.getContext();
            AnonymousClass1KW r6 = this.A04;
            AnonymousClass11C r2 = this.A02;
            C18010vc r1 = this.A06;
            TextPaint paint = editText.getPaint();
            HashMap hashMap = C26302CxJ.A01;
            C18070vi.A0g(context, 2, r6);
            C43251zV.A08(context, paint, editable2, r6, r7, 1.3f);
            C26302CxJ.A0S(editable, false);
            C26302CxJ.A02(editable, paint.getTextSize(), -16777216, C26302CxJ.A00(r2, r1), true);
            return;
        }
        EditText editText2 = this.A01;
        C43251zV.A07(editText2.getContext(), editText2.getPaint(), editable, this.A04, this.A05);
    }
}
