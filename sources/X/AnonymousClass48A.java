package X;

import android.widget.EditText;
import android.widget.TextView;

/* renamed from: X.48A  reason: invalid class name */
public class AnonymousClass48A extends C89564cf {
    public int A00;
    public Runnable A01;
    public final int A02;
    public final EditText A03;
    public final TextView A04;
    public final AnonymousClass11C A05;
    public final C18000vb A06;
    public final int A07;
    public final AnonymousClass1L2 A08;
    public final AnonymousClass1KW A09;
    public final C18030ve A0A;
    public final C18010vc A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r10 < r1) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b1, code lost:
        if (r10 != r8) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b4, code lost:
        r7.setVisibility(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r16) {
        /*
            r15 = this;
            boolean r0 = r15.A0C
            r6 = r16
            if (r0 == 0) goto L_0x00c8
            X.0ve r10 = r15.A0A
            android.widget.EditText r4 = r15.A03
            android.content.Context r5 = r4.getContext()
            X.1KW r9 = r15.A09
            X.11C r8 = r15.A05
            X.0vc r11 = r15.A0B
            android.text.TextPaint r7 = r4.getPaint()
            boolean r0 = r15.A0E
            if (r0 == 0) goto L_0x00b8
            r12 = 2131102329(0x7f060a79, float:1.7817093E38)
        L_0x001f:
            android.content.Context r2 = r4.getContext()
            r1 = 2130970132(0x7f040614, float:1.7548965E38)
            r0 = 2131101250(0x7f060642, float:1.7814904E38)
            int r13 = X.AnonymousClass1YL.A00(r2, r1, r0)
            boolean r14 = r15.A0D
            X.C26302CxJ.A0L(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0032:
            int r8 = r15.A02
            if (r8 == 0) goto L_0x00a4
            java.lang.Runnable r1 = r15.A01
            if (r1 == 0) goto L_0x003f
            android.widget.TextView r0 = r15.A04
            r0.removeCallbacks(r1)
        L_0x003f:
            java.lang.String r6 = r6.toString()
            int r9 = X.C137186v3.A00(r6)
            android.widget.TextView r7 = r15.A04
            if (r7 == 0) goto L_0x0086
            int r10 = r8 - r9
            int r1 = r15.A07
            if (r1 == 0) goto L_0x00b0
            r0 = 8
            if (r10 >= r1) goto L_0x00b4
        L_0x0055:
            r0 = 43
            X.7RM r2 = new X.7RM
            r2.<init>((java.lang.Object) r15, (int) r10, (int) r0)
            r15.A01 = r2
            r0 = 1000(0x3e8, double:4.94E-321)
            r7.postDelayed(r2, r0)
            r11 = 0
            r7.setVisibility(r11)
            X.0vb r5 = r15.A06
            java.text.NumberFormat r0 = r5.A0L()
            long r2 = (long) r10
            java.lang.String r0 = r0.format(r2)
            r7.setText(r0)
            r1 = 2131755454(0x7f1001be, float:1.9141788E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            X.C17880vN.A1T(r0, r10, r11)
            java.lang.String r0 = r5.A0K(r0, r1, r2)
            r7.setContentDescription(r0)
        L_0x0086:
            if (r9 < r8) goto L_0x00a5
            int r0 = r15.A00
            if (r0 != 0) goto L_0x00a5
            int r1 = r4.getInputType()
            r15.A00 = r1
            if (r1 == 0) goto L_0x00a4
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r4.setInputType(r1)
            r4.setText(r6)
            int r0 = r6.length()
            r4.setSelection(r0)
        L_0x00a4:
            return
        L_0x00a5:
            int r0 = r15.A00
            if (r0 == 0) goto L_0x00a4
            r4.setInputType(r0)
            r0 = 0
            r15.A00 = r0
            return
        L_0x00b0:
            r0 = 4
            if (r10 == r8) goto L_0x00b4
            goto L_0x0055
        L_0x00b4:
            r7.setVisibility(r0)
            goto L_0x0086
        L_0x00b8:
            android.content.Context r2 = r4.getContext()
            r1 = 2130970892(0x7f04090c, float:1.7550507E38)
            r0 = 2131102330(0x7f060a7a, float:1.7817095E38)
            int r12 = X.AnonymousClass1YL.A00(r2, r1, r0)
            goto L_0x001f
        L_0x00c8:
            android.widget.EditText r4 = r15.A03
            android.content.Context r3 = r4.getContext()
            android.text.TextPaint r2 = r4.getPaint()
            X.1KW r1 = r15.A09
            X.0ve r0 = r15.A0A
            X.C43251zV.A07(r3, r2, r6, r1, r0)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48A.afterTextChanged(android.text.Editable):void");
    }

    public AnonymousClass48A(EditText editText, TextView textView, AnonymousClass11C r8, C18000vb r9, AnonymousClass1L2 r10, AnonymousClass1KW r11, C18030ve r12, C18010vc r13, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A0A = r12;
        this.A09 = r11;
        this.A05 = r8;
        this.A06 = r9;
        this.A0B = r13;
        this.A08 = r10;
        this.A03 = editText;
        this.A04 = textView;
        this.A02 = i;
        this.A07 = i2;
        this.A0C = z;
        this.A0D = z3;
        this.A0E = z2;
        AnonymousClass3MZ.A1K(editText, this, 12);
        if (textView != null) {
            long j = (long) i;
            Object[] A1a = AnonymousClass3MW.A1a();
            C17880vN.A1T(A1a, i, 0);
            textView.setContentDescription(r9.A0K(A1a, 2131755454, j));
            if (i != 0 && i2 == 0) {
                textView.setText(r9.A0L().format(j));
            }
        }
    }
}
