package com.whatsapp.camera.recording;

import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;

public class RecordingView extends RelativeLayout {
    public TextView A00;
    public CircularProgressBar A01;
    public final Context A02;

    public RecordingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = context;
        A00();
    }

    public void A00() {
        View.inflate(getContext(), 2131626693, this);
        this.A01 = (CircularProgressBar) AnonymousClass1HF.A06(this, 2131434413);
        this.A00 = AnonymousClass3MW.A0J(this, 2131434415);
        this.A01.setMax(100);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r9 == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C75393hQ r6, boolean r7, boolean r8, boolean r9, boolean r10) {
        /*
            r5 = this;
            android.view.ViewGroup$MarginLayoutParams r3 = X.AnonymousClass3MW.A0B(r5)
            android.content.res.Resources r1 = r5.getResources()
            if (r7 == 0) goto L_0x0011
            if (r8 != 0) goto L_0x0011
            r0 = 2131168452(0x7f070cc4, float:1.7951206E38)
            if (r9 != 0) goto L_0x0014
        L_0x0011:
            r0 = 2131168775(0x7f070e07, float:1.7951861E38)
        L_0x0014:
            int r1 = r1.getDimensionPixelSize(r0)
            if (r10 == 0) goto L_0x0070
            int r0 = r3.topMargin
            android.animation.ValueAnimator r2 = X.C108995ce.A0B(r0, r1)
            X.C108955ca.A19(r2)
            r1 = 3
            X.4ae r0 = new X.4ae
            r0.<init>(r3, r5, r1)
            r2.addUpdateListener(r0)
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            r2.start()
        L_0x0034:
            if (r6 == 0) goto L_0x005b
            if (r8 == 0) goto L_0x005c
            r3 = 2131165444(0x7f070104, float:1.7945105E38)
            if (r7 == 0) goto L_0x0040
            r3 = 2131165440(0x7f070100, float:1.7945097E38)
        L_0x0040:
            X.0ve r4 = r6.A01
            r0 = 12765(0x31dd, float:1.7888E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r4, r0)
            if (r0 != 0) goto L_0x005b
            X.1bI r2 = r6.A00
            android.view.View r0 = r2.A00
            if (r0 == 0) goto L_0x0076
            android.view.View r0 = X.AnonymousClass3MX.A0D(r2)
            com.whatsapp.actionfeedback.view.ActionFeedbackViewGroup r0 = (com.whatsapp.actionfeedback.view.ActionFeedbackViewGroup) r0
            X.C75393hQ.A00(r0, r3)
        L_0x005b:
            return
        L_0x005c:
            if (r7 == 0) goto L_0x0067
            r3 = 2131165441(0x7f070101, float:1.79451E38)
            if (r9 == 0) goto L_0x0040
            r3 = 2131165442(0x7f070102, float:1.7945101E38)
            goto L_0x0040
        L_0x0067:
            r3 = 2131165445(0x7f070105, float:1.7945107E38)
            if (r9 == 0) goto L_0x0040
            r3 = 2131165446(0x7f070106, float:1.794511E38)
            goto L_0x0040
        L_0x0070:
            r3.topMargin = r1
            r5.setLayoutParams(r3)
            goto L_0x0034
        L_0x0076:
            r0 = 12764(0x31dc, float:1.7886E-41)
            boolean r0 = X.C18020vd.A05(r1, r4, r0)
            if (r0 == 0) goto L_0x0097
            android.view.ViewGroup$LayoutParams r1 = r2.A03()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.C18070vi.A0z(r1, r0)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            android.view.View r0 = X.AnonymousClass3MX.A0D(r2)
            int r0 = X.AnonymousClass3Ma.A02(r0, r3)
            r1.topMargin = r0
            r2.A06(r1)
            return
        L_0x0097:
            r1 = 0
            X.4qm r0 = new X.4qm
            r0.<init>(r6, r3, r1)
            r2.A07(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.recording.RecordingView.A01(X.3hQ, boolean, boolean, boolean, boolean):void");
    }

    public RecordingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A02 = context;
        A00();
    }

    public RecordingView(Context context) {
        super(context, (AttributeSet) null);
        this.A02 = context;
        A00();
    }
}
