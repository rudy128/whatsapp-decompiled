package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.8DW  reason: invalid class name */
public abstract class AnonymousClass8DW extends LinearLayout {
    public int A00 = 2;
    public ImageView A01;
    public LinearLayout A02;
    public View.OnClickListener A03;
    public FrameLayout A04;
    public TextView A05;
    public CharSequence A06;
    public CharSequence A07;
    public ViewGroup A08;
    public TextView A09;
    public final List A0A = AnonymousClass000.A13();

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.util.List r8) {
        /*
            r7 = this;
            java.util.List r3 = r7.A0A
            r3.clear()
            android.widget.LinearLayout r0 = r7.A02
            r0.removeAllViews()
            boolean r1 = r8.isEmpty()
            r4 = 8
            r2 = 0
            android.widget.FrameLayout r0 = r7.A04
            if (r1 == 0) goto L_0x0089
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto L_0x00a5
            android.widget.FrameLayout r0 = r7.A04
            r0.setVisibility(r2)
        L_0x0020:
            android.view.ViewGroup r0 = r7.A08
            r0.setVisibility(r4)
        L_0x0025:
            int r1 = r8.size()
            int r0 = r7.A00
            X.AnonymousClass8BW.A1P(r8, r3, r1, r0)
        L_0x002e:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x00b9
            java.lang.Object r6 = r8.get(r2)
            r4 = r7
            com.whatsapp.payments.ui.widget.TransactionsExpandableView r4 = (com.whatsapp.payments.ui.widget.TransactionsExpandableView) r4
            X.AW0 r6 = (X.AW0) r6
            X.9NN r5 = r4.A00
            int r1 = r6.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x007d
            boolean r0 = r6.A0P
            if (r0 == 0) goto L_0x007d
            android.content.Context r0 = r5.A01
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131626423(0x7f0e09b7, float:1.8880082E38)
            android.view.View r5 = X.AnonymousClass3MX.A09(r1, r4, r0)
        L_0x0056:
            java.lang.Object r4 = r8.get(r2)
            int r1 = r3.size()
            r0 = r5
            X.BBc r0 = (X.C22519BBc) r0
            r0.BDE(r4)
            int r4 = r1 + -1
            r0 = 2131430073(0x7f0b0ab9, float:1.8481837E38)
            android.view.View r1 = r5.findViewById(r0)
            r0 = 8
            if (r2 >= r4) goto L_0x0072
            r0 = 0
        L_0x0072:
            r1.setVisibility(r0)
            android.widget.LinearLayout r0 = r7.A02
            r0.addView(r5)
            int r2 = r2 + 1
            goto L_0x002e
        L_0x007d:
            android.content.Context r4 = r5.A01
            X.B8b r1 = r5.A02
            int r0 = r5.A00
            X.96T r5 = new X.96T
            r5.<init>(r4, r1, r0)
            goto L_0x0056
        L_0x0089:
            r0.setVisibility(r4)
            int r1 = r8.size()
            int r0 = r7.A00
            if (r1 <= r0) goto L_0x0020
            android.view.ViewGroup r0 = r7.A08
            r0.setVisibility(r2)
            android.widget.TextView r1 = r7.A09
            java.lang.CharSequence r0 = r7.A07
            r1.setText(r0)
            android.view.ViewGroup r1 = r7.A08
            android.view.View$OnClickListener r0 = r7.A03
            goto L_0x00b4
        L_0x00a5:
            android.view.ViewGroup r0 = r7.A08
            r0.setVisibility(r2)
            android.widget.TextView r1 = r7.A09
            java.lang.CharSequence r0 = r7.A06
            r1.setText(r0)
            android.view.ViewGroup r1 = r7.A08
            r0 = 0
        L_0x00b4:
            r1.setOnClickListener(r0)
            goto L_0x0025
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8DW.A01(java.util.List):void");
    }

    public void setCustomEmptyView(View view) {
        this.A04.addView(view);
    }

    public void setSeeMoreView(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.A07 = charSequence;
        this.A06 = charSequence2;
        this.A03 = onClickListener;
    }

    public void setTitle(CharSequence charSequence) {
        this.A05.setText(charSequence);
        this.A05.setVisibility(0);
    }

    public AnonymousClass8DW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(2131626359, this, true);
        setOrientation(1);
        this.A05 = AnonymousClass3MW.A0J(this, 2131431358);
        this.A08 = AnonymousClass3MW.A0C(this, 2131435068);
        this.A01 = AnonymousClass3MW.A0G(this, 2131435069);
        this.A09 = AnonymousClass3MW.A0J(this, 2131435070);
        this.A04 = C108945cZ.A0P(this, 2131429750);
        this.A02 = AnonymousClass3MX.A0K(this, 2131432090);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass6Z4.A03);
            try {
                this.A00 = obtainStyledAttributes.getInt(2, 2);
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId > 0) {
                    this.A01.setImageDrawable(context.getResources().getDrawable(resourceId));
                }
                int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId2 > 0) {
                    this.A09.setText(resourceId2);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public ImageView getSeeMoreImageView() {
        return this.A01;
    }

    public int getSizeLimit() {
        return this.A00;
    }

    public void setSizeLimit(int i) {
        this.A00 = i;
    }

    public AnonymousClass8DW(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public AnonymousClass8DW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }
}
