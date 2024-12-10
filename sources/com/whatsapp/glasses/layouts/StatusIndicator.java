package com.whatsapp.glasses.layouts;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C18070vi;
import X.C19740yt;
import X.C25695CkQ;
import X.C25970Cpd;
import X.C72453Mb;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Map;

public final class StatusIndicator extends RelativeLayout {
    public int A00;
    public Bitmap A01;
    public ImageView A02;
    public LinearLayout A03;
    public Map A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public GradientDrawable A0C;
    public View A0D;
    public final float A0E;
    public final int A0F;
    public final View A0G;
    public final ImageView A0H;
    public final ImageView A0I;
    public final TextView A0J;
    public final TextView A0K;
    public final TextView A0L;
    public final C25695CkQ A0M;
    public final String A0N;
    public final int A0O;
    public final ImageView A0P;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        View inflate = LayoutInflater.from(context).inflate(2131627011, this);
        C18070vi.A0X(inflate);
        this.A0G = inflate;
        this.A03 = (LinearLayout) C18070vi.A05(this, 2131435931);
        this.A0L = AnonymousClass3Ma.A0E(this, 2131435709);
        this.A0K = AnonymousClass3Ma.A0E(this, 2131435612);
        this.A0N = AnonymousClass3MY.A0m(getResources(), 2131886098);
        this.A0B = getResources().getDimensionPixelSize(2131168812);
        this.A09 = getResources().getDimensionPixelSize(2131168810);
        this.A07 = getResources().getDimensionPixelSize(2131168807);
        this.A0A = getResources().getDimensionPixelSize(2131168811);
        this.A08 = getResources().getDimensionPixelSize(2131168808);
        this.A0E = AnonymousClass3MW.A00(inflate.getResources(), 2131168819);
        this.A0O = C19740yt.A00(context, 2131102666);
        this.A06 = C19740yt.A00(context, 2131102662);
        this.A05 = C19740yt.A00(context, 2131102655);
        this.A0F = C19740yt.A00(context, 2131102661);
        this.A00 = C19740yt.A00(context, 2131102663);
        this.A0I = (ImageView) C18070vi.A05(this, 2131435650);
        this.A0H = (ImageView) C18070vi.A05(this, 2131428261);
        this.A0M = new C25695CkQ(C18070vi.A05(inflate, 2131437083));
        this.A0P = (ImageView) C18070vi.A05(this, 2131437082);
        this.A0J = AnonymousClass3Ma.A0E(this, 2131428100);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C24867CNl r9, boolean r10) {
        /*
            r8 = this;
            r5 = 0
            r8.A00()
            boolean r0 = r9 instanceof X.C22973BXt
            r3 = 1
            if (r0 == 0) goto L_0x0029
            if (r10 != 0) goto L_0x0014
            android.widget.ImageView r2 = r8.A0H
            int r1 = r8.A06
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
        L_0x0014:
            r8.A04(r3, r10, r3)
            android.widget.TextView r2 = r8.A0L
            r0 = 2131886104(0x7f120018, float:1.9406777E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "__external__sup_lost_connection"
        L_0x0022:
            r8.A02(r2, r1, r0, r3)
        L_0x0025:
            A03(r8)
            return
        L_0x0029:
            boolean r0 = r9 instanceof X.C22977BXx
            if (r0 == 0) goto L_0x0069
            if (r10 == 0) goto L_0x005f
            X.CkQ r2 = r8.A0M
            android.widget.ImageView r0 = r2.A05
            r0.clearColorFilter()
            android.widget.ImageView r0 = r2.A04
            r0.clearColorFilter()
            android.widget.ImageView r1 = r2.A03
            int r0 = r2.A00
            r1.setColorFilter(r0)
        L_0x0042:
            r8.A04(r3, r10, r5)
            android.widget.TextView r2 = r8.A0L
            r0 = 2131886108(0x7f12001c, float:1.9406786E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "__external__sup_poor_connection"
            r8.A02(r2, r1, r0, r3)
            android.widget.TextView r2 = r8.A0K
            r0 = 2131886103(0x7f120017, float:1.9406775E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "__external__sup_learn_more"
            goto L_0x0022
        L_0x005f:
            android.widget.ImageView r2 = r8.A0H
            int r1 = r8.A0O
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            goto L_0x0042
        L_0x0069:
            boolean r0 = r9 instanceof X.BY5
            if (r0 == 0) goto L_0x0078
            if (r10 == 0) goto L_0x0074
            X.CkQ r0 = r8.A0M
            r0.A01()
        L_0x0074:
            r8.A04(r3, r10, r5)
            goto L_0x0025
        L_0x0078:
            boolean r0 = r9 instanceof X.BY2
            if (r0 == 0) goto L_0x009c
            java.util.Map r1 = r8.A04
            if (r1 == 0) goto L_0x0090
            X.C0L r0 = X.C0L.A0v
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x0090
            android.widget.ImageView r1 = r8.A0I
            r0 = 0
            r8.A01(r2, r1, r0)
        L_0x0090:
            android.widget.TextView r2 = r8.A0L
            r0 = 2131886113(0x7f120021, float:1.9406796E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "__external__sup_zero_battery"
            goto L_0x0022
        L_0x009c:
            boolean r0 = r9 instanceof X.C22964BXk
            if (r0 == 0) goto L_0x00cb
            java.util.Map r1 = r8.A04
            if (r1 == 0) goto L_0x00b6
            X.C0L r0 = X.C0L.A0t
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x00b6
            android.widget.ImageView r1 = r8.A0I
            r0 = 0
            r8.A01(r2, r1, r0)
            r8.A01 = r2
        L_0x00b6:
            android.widget.TextView r2 = r8.A0L
            r0 = 2131886105(0x7f120019, float:1.940678E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "__external__sup_low_battery"
            r8.A02(r2, r1, r0, r3)
            android.widget.TextView r0 = r8.A0J
            r0.setVisibility(r5)
            goto L_0x0025
        L_0x00cb:
            boolean r0 = r9 instanceof X.BY3
            if (r0 == 0) goto L_0x010a
            java.util.Map r1 = r8.A04
            if (r1 == 0) goto L_0x00df
            X.C0L r0 = X.C0L.A0u
        L_0x00d5:
            java.lang.Object r0 = r1.get(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L_0x00df
            r8.A01 = r0
        L_0x00df:
            if (r10 == 0) goto L_0x0100
            X.CkQ r0 = r8.A0M
            r0.A01()
        L_0x00e6:
            android.widget.TextView r0 = r8.A0L
            java.lang.CharSequence r1 = r0.getText()
            java.lang.String r0 = r8.A0N
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0025
            android.graphics.Bitmap r2 = r8.A01
            if (r2 == 0) goto L_0x0074
            android.widget.ImageView r1 = r8.A0I
            r0 = 0
            r8.A01(r2, r1, r0)
            goto L_0x0074
        L_0x0100:
            android.widget.ImageView r2 = r8.A0H
            int r1 = r8.A0F
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            goto L_0x00e6
        L_0x010a:
            boolean r0 = r9 instanceof X.BY9
            if (r0 == 0) goto L_0x0115
            java.util.Map r1 = r8.A04
            if (r1 == 0) goto L_0x00df
            X.C0L r0 = X.C0L.A0s
            goto L_0x00d5
        L_0x0115:
            boolean r0 = r9 instanceof X.C22970BXq
            if (r0 == 0) goto L_0x013a
            java.util.Map r1 = r8.A04
            if (r1 == 0) goto L_0x012d
            X.C0L r0 = X.C0L.A17
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x012d
            android.widget.ImageView r1 = r8.A0I
            r0 = 0
            r8.A01(r2, r1, r0)
        L_0x012d:
            android.widget.TextView r2 = r8.A0L
            r0 = 2131886099(0x7f120013, float:1.9406767E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "__external__sup_exceed_thermal"
            goto L_0x0022
        L_0x013a:
            boolean r0 = r9 instanceof X.C22971BXr
            if (r0 == 0) goto L_0x015f
            java.util.Map r1 = r8.A04
            if (r1 == 0) goto L_0x0152
            X.C0L r0 = X.C0L.A18
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x0152
            android.widget.ImageView r1 = r8.A0I
            r0 = 0
            r8.A01(r2, r1, r0)
        L_0x0152:
            android.widget.TextView r2 = r8.A0L
            r0 = 2131886101(0x7f120015, float:1.9406771E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "__external__sup_high_thermal"
            goto L_0x0022
        L_0x015f:
            boolean r0 = r9 instanceof X.C22969BXp
            java.lang.String r6 = "__external__sup_doff"
            if (r0 == 0) goto L_0x018c
            java.util.Map r1 = r8.A04
            if (r1 == 0) goto L_0x017e
            X.C0L r0 = X.C0L.A0y
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x017e
            android.widget.ImageView r1 = r8.A0I
            int r0 = r8.A0O
        L_0x0177:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A01(r2, r1, r0)
        L_0x017e:
            android.widget.TextView r1 = r8.A0L
            r0 = 2131886097(0x7f120011, float:1.9406763E38)
        L_0x0183:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A02(r1, r0, r6, r3)
            goto L_0x0025
        L_0x018c:
            boolean r0 = r9 instanceof X.C22968BXo
            if (r0 == 0) goto L_0x01a3
            java.util.Map r1 = r8.A04
            if (r1 == 0) goto L_0x017e
            X.C0L r0 = X.C0L.A0y
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x017e
            android.widget.ImageView r1 = r8.A0I
            int r0 = r8.A06
            goto L_0x0177
        L_0x01a3:
            boolean r0 = r9 instanceof X.C22979BXz
            if (r0 == 0) goto L_0x01cd
            java.util.Map r1 = r8.A04
            if (r1 == 0) goto L_0x01c0
            X.C0L r0 = X.C0L.A0y
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x01c0
            android.widget.ImageView r1 = r8.A0I
            int r0 = r8.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A01(r2, r1, r0)
        L_0x01c0:
            android.widget.TextView r2 = r8.A0L
            r0 = 2131886111(0x7f12001f, float:1.9406792E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "__external__sup_tampering_led"
            goto L_0x0022
        L_0x01cd:
            boolean r0 = r9 instanceof X.C22967BXn
            if (r0 == 0) goto L_0x01f7
            java.util.Map r1 = r8.A04
            if (r1 == 0) goto L_0x01ea
            X.C0L r0 = X.C0L.A0y
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x01ea
            android.widget.ImageView r1 = r8.A0I
            int r0 = r8.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A01(r2, r1, r0)
        L_0x01ea:
            android.widget.TextView r2 = r8.A0L
            r0 = 2131886096(0x7f120010, float:1.9406761E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "__external__sup_device_error"
            goto L_0x0022
        L_0x01f7:
            boolean r0 = r9 instanceof X.C22976BXw
            java.lang.String r6 = "__external__sup_app_store_link"
            if (r0 == 0) goto L_0x021e
            android.widget.TextView r7 = r8.A0L
            android.view.View r0 = r8.A0G
            android.content.res.Resources r4 = r0.getResources()
            r2 = 2131886081(0x7f120001, float:1.940673E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = "Meta View"
            r1[r5] = r0
            java.lang.String r0 = r4.getString(r2, r1)
        L_0x0212:
            r7.setText(r0)
            r7.setVisibility(r5)
            android.widget.TextView r1 = r8.A0K
            r0 = 2131886080(0x7f120000, float:1.9406729E38)
            goto L_0x0183
        L_0x021e:
            boolean r0 = r9 instanceof X.C22974BXu
            if (r0 == 0) goto L_0x0250
            android.content.Context r0 = r8.getContext()
            android.content.Context r1 = r0.getApplicationContext()
            android.content.Context r0 = r8.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.labelRes
            java.lang.String r4 = X.C18070vi.A0F(r1, r0)
            android.widget.TextView r7 = r8.A0L
            android.view.View r0 = r8.A0G
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131886081(0x7f120001, float:1.940673E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r5] = r4
            java.lang.String r0 = r2.getString(r1, r0)
            goto L_0x0212
        L_0x0250:
            boolean r0 = r9 instanceof X.C22975BXv
            if (r0 == 0) goto L_0x026f
            android.widget.TextView r2 = r8.A0L
            r0 = 2131886100(0x7f120014, float:1.940677E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "__external__sup_glasses_update"
            r8.A02(r2, r1, r0, r3)
            android.widget.TextView r2 = r8.A0K
            r0 = 2131886107(0x7f12001b, float:1.9406784E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "__external__sup_mwa_link"
            goto L_0x0022
        L_0x026f:
            boolean r0 = r9 instanceof X.BY1
            if (r0 == 0) goto L_0x0299
            java.util.Map r1 = r8.A04
            if (r1 == 0) goto L_0x028c
            X.C0L r0 = X.C0L.A0y
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x028c
            android.widget.ImageView r1 = r8.A0I
            int r0 = r8.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A01(r2, r1, r0)
        L_0x028c:
            android.widget.TextView r2 = r8.A0L
            r0 = 2131886116(0x7f120024, float:1.9406802E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "__external__wifi_disabled"
            goto L_0x0022
        L_0x0299:
            boolean r0 = r9 instanceof X.C22972BXs
            if (r0 == 0) goto L_0x02c3
            java.util.Map r1 = r8.A04
            if (r1 == 0) goto L_0x02b6
            X.C0L r0 = X.C0L.A0y
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x02b6
            android.widget.ImageView r1 = r8.A0I
            int r0 = r8.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A01(r2, r1, r0)
        L_0x02b6:
            android.widget.TextView r2 = r8.A0L
            r0 = 2131886115(0x7f120023, float:1.94068E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "__external__turn_off_wifi_hotspot"
            goto L_0x0022
        L_0x02c3:
            boolean r0 = r9 instanceof X.BY0
            if (r0 == 0) goto L_0x00df
            java.util.Map r1 = r8.A04
            if (r1 == 0) goto L_0x02e0
            X.C0L r0 = X.C0L.A0y
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x02e0
            android.widget.ImageView r1 = r8.A0I
            int r0 = r8.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A01(r2, r1, r0)
        L_0x02e0:
            android.widget.TextView r2 = r8.A0L
            r0 = 2131886114(0x7f120022, float:1.9406798E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "__external__turn_off_vpn"
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.glasses.layouts.StatusIndicator.A06(X.CNl, boolean):void");
    }

    private final void A00() {
        this.A0H.setVisibility(8);
        this.A0M.A02.setVisibility(8);
        this.A0P.setVisibility(8);
        this.A0I.setVisibility(8);
        this.A0J.setVisibility(8);
        TextView textView = this.A0L;
        if (!C18070vi.A18(textView.getText(), this.A0N)) {
            textView.setVisibility(8);
        }
        this.A0K.setVisibility(8);
    }

    private final void A02(TextView textView, Integer num, String str, boolean z) {
        if (num != null) {
            C25970Cpd.A03.A01(textView, num.intValue(), str);
        } else {
            textView.setText("");
        }
        textView.setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    public static final void A03(StatusIndicator statusIndicator) {
        LinearLayout linearLayout = statusIndicator.A03;
        linearLayout.measure(0, 0);
        ViewGroup.LayoutParams layoutParams = statusIndicator.getLayoutParams();
        layoutParams.height = linearLayout.getMeasuredHeight();
        layoutParams.width = linearLayout.getMeasuredWidth();
    }

    private final void A04(boolean z, boolean z2, boolean z3) {
        View view;
        if (z2) {
            view = this.A0M.A02;
            if (z3) {
                view.setVisibility(8);
                view = this.A0P;
            }
        } else {
            view = this.A0H;
        }
        view.setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    public static /* synthetic */ void setConnectionIconVisibility$default(StatusIndicator statusIndicator, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z3 = false;
        }
        statusIndicator.A04(z, z2, z3);
    }

    private final void setStatusIndicatorCollapsedDimensions(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i = this.A09;
            i2 = this.A07;
        } else {
            i = this.A0A;
            i2 = this.A08;
        }
        GradientDrawable gradientDrawable = this.A0C;
        if (gradientDrawable == null) {
            str = "statusIndicatorCollapsedOutlineDrawable";
        } else {
            gradientDrawable.setSize(i, i);
            ImageView imageView = this.A02;
            if (imageView == null) {
                str = "statusIndicatorCollapsedOutline";
            } else {
                imageView.setPadding(i2, i2, i2, i2);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    private final void setStatusIndicatorCollapsedOutlineColor(int i) {
        GradientDrawable gradientDrawable = this.A0C;
        if (gradientDrawable == null) {
            C18070vi.A11("statusIndicatorCollapsedOutlineDrawable");
            throw null;
        } else {
            gradientDrawable.setStroke(this.A0B, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C24867CNl r4, boolean r5) {
        /*
            r3 = this;
            r0 = 8
            r3.setVisibility(r0)
            if (r4 == 0) goto L_0x0030
            java.lang.Integer r0 = r4.A01
            int r1 = r0.intValue()
        L_0x000d:
            java.lang.String r2 = "statusIndicatorCollapsedOutline"
            r0 = 1
            if (r1 == r0) goto L_0x001f
            r0 = 2
            if (r1 == r0) goto L_0x0022
            android.widget.ImageView r1 = r3.A02
            if (r1 == 0) goto L_0x0032
            r0 = 8
        L_0x001b:
            r1.setVisibility(r0)
            return
        L_0x001f:
            int r0 = r3.A0O
            goto L_0x0024
        L_0x0022:
            int r0 = r3.A06
        L_0x0024:
            r3.setStatusIndicatorCollapsedOutlineColor(r0)
            r3.setStatusIndicatorCollapsedDimensions(r5)
            android.widget.ImageView r1 = r3.A02
            if (r1 == 0) goto L_0x0032
            r0 = 0
            goto L_0x001b
        L_0x0030:
            r1 = -1
            goto L_0x000d
        L_0x0032:
            X.C18070vi.A11(r2)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.glasses.layouts.StatusIndicator.A05(X.CNl, boolean):void");
    }

    public final Map getImageBitmaps() {
        return this.A04;
    }

    public final View getParentView() {
        return this.A0D;
    }

    public final void setConnected(boolean z) {
        if (z) {
            C25695CkQ ckQ = this.A0M;
            ckQ.A01.pause();
            ckQ.A05.clearColorFilter();
            ImageView imageView = ckQ.A04;
            int i = ckQ.A00;
            imageView.setColorFilter(i);
            ckQ.A03.setColorFilter(i);
        }
        A03(this);
    }

    public final void setDoublePressPromptVisibility(boolean z) {
        TextView textView = this.A0K;
        int i = null;
        if (z) {
            i = 2131886098;
        }
        A02(textView, i, "__external__sup_double_press_prompt", z);
    }

    public final void setParentView(View view) {
        this.A0D = view;
        if (view != null) {
            ImageView A0G2 = AnonymousClass3MW.A0G(view, 2131435649);
            this.A02 = A0G2;
            if (A0G2 == null) {
                C18070vi.A11("statusIndicatorCollapsedOutline");
                throw null;
            }
            Drawable drawable = A0G2.getDrawable();
            C18070vi.A0z(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            this.A0C = (GradientDrawable) drawable;
        }
    }

    private final void A01(Bitmap bitmap, ImageView imageView, Integer num) {
        imageView.setImageBitmap(bitmap);
        if (num != null) {
            imageView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            imageView.clearColorFilter();
        }
        imageView.setVisibility(0);
    }

    public final void setConnecting(boolean z) {
        A00();
        if (z) {
            C25695CkQ ckQ = this.A0M;
            ckQ.A03.setColorFilter(ckQ.A00);
            ckQ.A01.start();
        } else {
            this.A0H.setColorFilter(this.A05, PorterDuff.Mode.SRC_IN);
        }
        A04(true, z, false);
        A02(this.A0L, 2131886095, "__external__sup_connecting", true);
        ImageView imageView = this.A02;
        if (imageView == null) {
            C18070vi.A11("statusIndicatorCollapsedOutline");
            throw null;
        }
        imageView.setVisibility(8);
        setTranslationY(0.0f);
        A03(this);
        A03(this);
    }

    public final void setImageBitmaps(Map map) {
        this.A04 = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StatusIndicator(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StatusIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StatusIndicator(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
