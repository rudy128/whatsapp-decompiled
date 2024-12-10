package com.whatsapp.events;

import X.AnonymousClass00H;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C19830z4;
import X.C88124Yk;
import X.C99154sM;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;

public final class EventResponseBottomSheet extends Hilt_EventResponseBottomSheet {
    public LinearLayout A00;
    public LinearLayout A01;
    public WaImageView A02;
    public WaImageView A03;
    public C19830z4 A04;
    public C88124Yk A05;
    public C18030ve A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public final C18100vl A0C = C99154sM.A01(this, 19);
    public final C18100vl A0D = C99154sM.A01(this, 20);
    public final C18100vl A0E = C99154sM.A01(this, 21);
    public final C18100vl A0F = C99154sM.A01(this, 18);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625263, viewGroup, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        if (r4 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r6, android.view.View r7) {
        /*
            r5 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            super.A21(r6, r7)
            r0 = 2131430579(0x7f0b0cb3, float:1.8482863E38)
            android.widget.LinearLayout r0 = X.AnonymousClass3MX.A0K(r7, r0)
            r5.A0A = r0
            r0 = 2131430613(0x7f0b0cd5, float:1.8482932E38)
            android.widget.LinearLayout r0 = X.AnonymousClass3MX.A0K(r7, r0)
            r5.A0B = r0
            X.0ve r1 = r5.A06
            if (r1 == 0) goto L_0x0125
            r0 = 9277(0x243d, float:1.3E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x004e
            r0 = 2131432342(0x7f0b1396, float:1.8486439E38)
            X.1bI r0 = X.C28931bI.A00(r7, r0)
            android.view.View r2 = X.C72463Mc.A0N(r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r5.A01 = r2
            if (r2 == 0) goto L_0x0041
            r1 = 3
            X.78O r0 = new X.78O
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.setOnClickListener(r0)
        L_0x0041:
            android.widget.LinearLayout r1 = r5.A01
            if (r1 == 0) goto L_0x004e
            r0 = 2131430611(0x7f0b0cd3, float:1.8482928E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0R(r1, r0)
            r5.A03 = r0
        L_0x004e:
            X.0ve r1 = r5.A06
            if (r1 == 0) goto L_0x0125
            r0 = 7421(0x1cfd, float:1.0399E-41)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x0089
            X.0vl r0 = r5.A0C
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0089
            r0 = 2131431160(0x7f0b0ef8, float:1.8484041E38)
            X.1bI r0 = X.C28931bI.A00(r7, r0)
            android.view.View r2 = X.C72463Mc.A0N(r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r5.A00 = r2
            if (r2 == 0) goto L_0x007c
            r1 = 0
            X.78O r0 = new X.78O
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.setOnClickListener(r0)
        L_0x007c:
            android.widget.LinearLayout r1 = r5.A00
            if (r1 == 0) goto L_0x0089
            r0 = 2131430581(0x7f0b0cb5, float:1.8482867E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0R(r1, r0)
            r5.A02 = r0
        L_0x0089:
            r0 = 2131430580(0x7f0b0cb4, float:1.8482865E38)
            android.widget.ImageView r4 = X.AnonymousClass3Ma.A0C(r7, r0)
            r0 = 2131430614(0x7f0b0cd6, float:1.8482934E38)
            android.widget.ImageView r2 = X.AnonymousClass3Ma.A0C(r7, r0)
            X.0vl r0 = r5.A0D
            java.lang.Object r0 = r0.getValue()
            X.2Qx r0 = (X.C49552Qx) r0
            int r1 = r0.ordinal()
            r3 = 1
            if (r1 == r3) goto L_0x00e5
            r0 = 2
            if (r1 == r0) goto L_0x00de
            r0 = 3
            if (r1 != r0) goto L_0x00c4
            com.whatsapp.WaImageView r1 = r5.A03
            if (r1 == 0) goto L_0x00b6
            r0 = 2131233318(0x7f080a26, float:1.808277E38)
            r1.setImageResource(r0)
        L_0x00b6:
            com.whatsapp.WaImageView r4 = r5.A03
            if (r4 == 0) goto L_0x00c4
        L_0x00ba:
            android.content.Context r1 = r2.getContext()
        L_0x00be:
            r0 = 2131888275(0x7f120893, float:1.941118E38)
            X.AnonymousClass3MY.A0w(r1, r4, r0)
        L_0x00c4:
            android.widget.LinearLayout r1 = r5.A0A
            if (r1 == 0) goto L_0x00d0
            X.78O r0 = new X.78O
            r0.<init>((java.lang.Object) r5, (int) r3)
            r1.setOnClickListener(r0)
        L_0x00d0:
            android.widget.LinearLayout r2 = r5.A0B
            if (r2 == 0) goto L_0x00dd
            r1 = 2
            X.78O r0 = new X.78O
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.setOnClickListener(r0)
        L_0x00dd:
            return
        L_0x00de:
            r0 = 2131231777(0x7f080421, float:1.8079645E38)
            r2.setImageResource(r0)
            goto L_0x00ba
        L_0x00e5:
            X.4Yk r2 = r5.A05
            if (r2 == 0) goto L_0x0122
            X.2Qx r1 = X.C49552Qx.GOING
            X.0vl r0 = r5.A0E
            int r0 = X.C72453Mb.A0I(r0)
            boolean r0 = r2.A03(r1, r0)
            if (r0 == 0) goto L_0x0117
            com.whatsapp.WaImageView r1 = r5.A02
            if (r1 == 0) goto L_0x0101
            r0 = 2131231797(0x7f080435, float:1.8079685E38)
            r1.setImageResource(r0)
        L_0x0101:
            com.whatsapp.WaImageView r2 = r5.A02
            if (r2 == 0) goto L_0x00c4
            android.content.Context r1 = r2.getContext()
            r0 = 0
            if (r1 == 0) goto L_0x0113
            r0 = 2131888275(0x7f120893, float:1.941118E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0113:
            r2.setContentDescription(r0)
            goto L_0x00c4
        L_0x0117:
            r0 = 2131231797(0x7f080435, float:1.8079685E38)
            r4.setImageResource(r0)
            android.content.Context r1 = r4.getContext()
            goto L_0x00be
        L_0x0122:
            java.lang.String r0 = "eventUtils"
            goto L_0x0127
        L_0x0125:
            java.lang.String r0 = "abProps"
        L_0x0127:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.events.EventResponseBottomSheet.A21(android.os.Bundle, android.view.View):void");
    }

    public static final boolean A00(EventResponseBottomSheet eventResponseBottomSheet) {
        Bundle bundle = eventResponseBottomSheet.A06;
        if (bundle != null) {
            return bundle.getBoolean("ALLOW_GUESTS_EXTRA");
        }
        return false;
    }

    public void A1s() {
        LinearLayout linearLayout = this.A0A;
        if (linearLayout != null) {
            linearLayout.setOnClickListener((View.OnClickListener) null);
        }
        LinearLayout linearLayout2 = this.A0B;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener((View.OnClickListener) null);
        }
        LinearLayout linearLayout3 = this.A01;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener((View.OnClickListener) null);
        }
        this.A0A = null;
        this.A0B = null;
        this.A03 = null;
        this.A01 = null;
        super.A1s();
    }
}
