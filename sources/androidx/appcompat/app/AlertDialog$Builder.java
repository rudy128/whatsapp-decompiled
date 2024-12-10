package androidx.appcompat.app;

import X.C010105w;
import X.C03360Ht;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListAdapter;

public class AlertDialog$Builder {
    public final int A00;
    public final C03360Ht A01;

    public void A0D(int i) {
        C03360Ht r1 = this.A01;
        r1.A0F = r1.A0P.getText(i);
    }

    public void A0E(int i) {
        C03360Ht r1 = this.A01;
        r1.A0J = r1.A0P.getText(i);
    }

    public void A0F(int i) {
        C03360Ht r1 = this.A01;
        r1.A0D = null;
        r1.A02 = i;
    }

    public void A0G(DialogInterface.OnCancelListener onCancelListener) {
        this.A01.A03 = onCancelListener;
    }

    public void A0H(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter) {
        C03360Ht r0 = this.A01;
        r0.A0E = listAdapter;
        r0.A06 = onClickListener;
    }

    public void A0I(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter, int i) {
        C03360Ht r1 = this.A01;
        r1.A0E = listAdapter;
        r1.A06 = onClickListener;
        r1.A00 = i;
        r1.A0M = true;
    }

    public void A0J(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        C03360Ht r0 = this.A01;
        r0.A0G = charSequence;
        r0.A04 = onClickListener;
    }

    public void A0K(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        C03360Ht r0 = this.A01;
        r0.A0H = charSequence;
        r0.A05 = onClickListener;
    }

    public void A0L(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        C03360Ht r0 = this.A01;
        r0.A0I = charSequence;
        r0.A07 = onClickListener;
    }

    public void A0M(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr) {
        C03360Ht r0 = this.A01;
        r0.A0N = charSequenceArr;
        r0.A06 = onClickListener;
    }

    public void A0N(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr, int i) {
        C03360Ht r1 = this.A01;
        r1.A0N = charSequenceArr;
        r1.A06 = onClickListener;
        r1.A00 = i;
        r1.A0M = true;
    }

    public void A0O(DialogInterface.OnDismissListener onDismissListener) {
        this.A01.A08 = onDismissListener;
    }

    public void A0P(DialogInterface.OnKeyListener onKeyListener) {
        this.A01.A09 = onKeyListener;
    }

    public void A0Q(DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener, CharSequence[] charSequenceArr, boolean[] zArr) {
        C03360Ht r1 = this.A01;
        r1.A0N = charSequenceArr;
        r1.A0A = onMultiChoiceClickListener;
        r1.A0O = zArr;
        r1.A0L = true;
    }

    public void A0R(View view) {
        this.A01.A0C = view;
    }

    public void A0S(CharSequence charSequence) {
        this.A01.A0F = charSequence;
    }

    public void A0T(boolean z) {
        this.A01.A0K = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C010105w create() {
        /*
            r12 = this;
            X.0Ht r8 = r12.A01
            android.content.Context r7 = r8.A0P
            int r0 = r12.A00
            X.05w r3 = new X.05w
            r3.<init>(r7, r0)
            X.0QH r2 = r3.A00
            android.view.View r0 = r8.A0C
            if (r0 == 0) goto L_0x00f6
            r2.A0D = r0
        L_0x0013:
            java.lang.CharSequence r1 = r8.A0F
            if (r1 == 0) goto L_0x0020
            r2.A0R = r1
            android.widget.TextView r0 = r2.A0L
            if (r0 == 0) goto L_0x0020
            r0.setText(r1)
        L_0x0020:
            java.lang.CharSequence r5 = r8.A0I
            if (r5 == 0) goto L_0x0034
            android.content.DialogInterface$OnClickListener r4 = r8.A07
            r1 = -1
            r0 = 0
            if (r4 == 0) goto L_0x0030
            android.os.Handler r0 = r2.A09
            android.os.Message r0 = r0.obtainMessage(r1, r4)
        L_0x0030:
            r2.A0Q = r5
            r2.A0C = r0
        L_0x0034:
            java.lang.CharSequence r5 = r8.A0G
            if (r5 == 0) goto L_0x0048
            android.content.DialogInterface$OnClickListener r4 = r8.A04
            r1 = -2
            r0 = 0
            if (r4 == 0) goto L_0x0044
            android.os.Handler r0 = r2.A09
            android.os.Message r0 = r0.obtainMessage(r1, r4)
        L_0x0044:
            r2.A0O = r5
            r2.A0A = r0
        L_0x0048:
            java.lang.CharSequence r5 = r8.A0H
            if (r5 == 0) goto L_0x005c
            android.content.DialogInterface$OnClickListener r4 = r8.A05
            r1 = -3
            r0 = 0
            if (r4 == 0) goto L_0x0058
            android.os.Handler r0 = r2.A09
            android.os.Message r0 = r0.obtainMessage(r1, r4)
        L_0x0058:
            r2.A0P = r5
            r2.A0B = r0
        L_0x005c:
            java.lang.CharSequence[] r0 = r8.A0N
            if (r0 != 0) goto L_0x0064
            android.widget.ListAdapter r0 = r8.A0E
            if (r0 == 0) goto L_0x0099
        L_0x0064:
            android.view.LayoutInflater r4 = r8.A0Q
            int r1 = r2.A04
            r0 = 0
            android.view.View r9 = r4.inflate(r1, r0)
            androidx.appcompat.app.AlertController$RecycleListView r9 = (androidx.appcompat.app.AlertController$RecycleListView) r9
            boolean r0 = r8.A0L
            r5 = 1
            if (r0 == 0) goto L_0x00de
            int r11 = r2.A05
            java.lang.CharSequence[] r10 = r8.A0N
            X.05N r6 = new X.05N
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x007d:
            r2.A0J = r6
            int r0 = r8.A00
            r2.A01 = r0
            android.content.DialogInterface$OnClickListener r0 = r8.A06
            if (r0 == 0) goto L_0x00d4
            r1 = 0
            X.0Ru r0 = new X.0Ru
            r0.<init>(r8, r2, r1)
        L_0x008d:
            r9.setOnItemClickListener(r0)
        L_0x0090:
            boolean r0 = r8.A0M
            if (r0 == 0) goto L_0x00cb
            r9.setChoiceMode(r5)
        L_0x0097:
            r2.A0K = r9
        L_0x0099:
            android.view.View r0 = r8.A0D
            if (r0 == 0) goto L_0x00c1
            r2.A0E = r0
            r0 = 0
            r2.A07 = r0
        L_0x00a2:
            boolean r0 = r8.A0K
            r3.setCancelable(r0)
            boolean r0 = r8.A0K
            if (r0 == 0) goto L_0x00af
            r0 = 1
            r3.setCanceledOnTouchOutside(r0)
        L_0x00af:
            android.content.DialogInterface$OnCancelListener r0 = r8.A03
            r3.setOnCancelListener(r0)
            android.content.DialogInterface$OnDismissListener r0 = r8.A08
            r3.setOnDismissListener(r0)
            android.content.DialogInterface$OnKeyListener r0 = r8.A09
            if (r0 == 0) goto L_0x00c0
            r3.setOnKeyListener(r0)
        L_0x00c0:
            return r3
        L_0x00c1:
            int r1 = r8.A02
            if (r1 == 0) goto L_0x00a2
            r0 = 0
            r2.A0E = r0
            r2.A07 = r1
            goto L_0x00a2
        L_0x00cb:
            boolean r0 = r8.A0L
            if (r0 == 0) goto L_0x0097
            r0 = 2
            r9.setChoiceMode(r0)
            goto L_0x0097
        L_0x00d4:
            android.content.DialogInterface$OnMultiChoiceClickListener r0 = r8.A0A
            if (r0 == 0) goto L_0x0090
            X.0Rt r0 = new X.0Rt
            r0.<init>(r8, r9, r2)
            goto L_0x008d
        L_0x00de:
            boolean r0 = r8.A0M
            if (r0 == 0) goto L_0x00f3
            int r4 = r2.A06
        L_0x00e4:
            android.widget.ListAdapter r6 = r8.A0E
            if (r6 != 0) goto L_0x007d
            java.lang.CharSequence[] r1 = r8.A0N
            r0 = 16908308(0x1020014, float:2.3877285E-38)
            X.05M r6 = new X.05M
            r6.<init>(r7, r4, r0, r1)
            goto L_0x007d
        L_0x00f3:
            int r4 = r2.A03
            goto L_0x00e4
        L_0x00f6:
            java.lang.CharSequence r1 = r8.A0J
            if (r1 == 0) goto L_0x0103
            r2.A0S = r1
            android.widget.TextView r0 = r2.A0M
            if (r0 == 0) goto L_0x0103
            r0.setText(r1)
        L_0x0103:
            android.graphics.drawable.Drawable r4 = r8.A0B
            if (r4 == 0) goto L_0x0118
            r2.A08 = r4
            r1 = 0
            r2.A02 = r1
            android.widget.ImageView r0 = r2.A0I
            if (r0 == 0) goto L_0x0118
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.A0I
            r0.setImageDrawable(r4)
        L_0x0118:
            int r1 = r8.A01
            if (r1 == 0) goto L_0x0013
            r0 = 0
            r2.A08 = r0
            r2.A02 = r1
            android.widget.ImageView r1 = r2.A0I
            if (r1 == 0) goto L_0x0013
            r0 = 0
            r1.setVisibility(r0)
            android.widget.ImageView r1 = r2.A0I
            int r0 = r2.A02
            r1.setImageResource(r0)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertDialog$Builder.create():X.05w");
    }

    public Context getContext() {
        return this.A01.A0P;
    }

    public AlertDialog$Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        C03360Ht r1 = this.A01;
        r1.A0G = r1.A0P.getText(i);
        r1.A04 = onClickListener;
        return this;
    }

    public AlertDialog$Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        C03360Ht r1 = this.A01;
        r1.A0I = r1.A0P.getText(i);
        r1.A07 = onClickListener;
        return this;
    }

    public AlertDialog$Builder setTitle(CharSequence charSequence) {
        this.A01.A0J = charSequence;
        return this;
    }

    public AlertDialog$Builder setView(View view) {
        C03360Ht r1 = this.A01;
        r1.A0D = view;
        r1.A02 = 0;
        return this;
    }

    public AlertDialog$Builder(Context context, int i) {
        this.A01 = new C03360Ht(new ContextThemeWrapper(context, C010105w.A00(context, i)));
        this.A00 = i;
    }

    public C010105w A0C() {
        C010105w create = create();
        create.show();
        return create;
    }

    public AlertDialog$Builder(Context context) {
        this(context, C010105w.A00(context, 0));
    }
}
