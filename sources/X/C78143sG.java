package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.TextAndDateLayout;

/* renamed from: X.3sG  reason: invalid class name and case insensitive filesystem */
public abstract class C78143sG extends AnonymousClass3sH {
    public final ImageView A00 = AnonymousClass3MW.A0G(this, 2131427946);
    public final View A01 = AnonymousClass1HF.A06(this, 2131428595);
    public final View A02 = AnonymousClass1HF.A06(this, 2131430717);
    public final View A03 = AnonymousClass1HF.A06(this, 2131431314);
    public final TextEmojiLabel A04 = ((TextEmojiLabel) AnonymousClass1HF.A06(this, 2131431266));
    public final TextAndDateLayout A05 = ((TextAndDateLayout) AnonymousClass1HF.A06(this, 2131436057));
    public final AnonymousClass3M2 A06 = new C98124qc(this, 0);
    public final TextEmojiLabel A07 = ((TextEmojiLabel) AnonymousClass1HF.A06(this, 2131427528));
    public final TextEmojiLabel A08 = ((TextEmojiLabel) AnonymousClass1HF.A06(this, 2131431715));
    public final TextEmojiLabel A09 = ((TextEmojiLabel) AnonymousClass1HF.A06(this, 2131431270));

    public abstract String getInviteCaption();

    public abstract View.OnClickListener getOnActionClickListener();

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public boolean A1X() {
        return C79103uS.A1K(this, getFMessage(), this.A1h);
    }

    public C78143sG(Context context, C108875cR r4, AnonymousClass206 r5) {
        super(context, r4, r5);
        A1M();
        A2i();
    }

    public void A1u() {
        A2i();
        AnonymousClass3uP.A0h(this, false);
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A2i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c8, code lost:
        if (r6.A07 != false) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2i() {
        /*
            r11 = this;
            X.206 r7 = r11.getFMessage()
            com.whatsapp.TextEmojiLabel r0 = r11.A09
            X.C43421zm.A04(r0)
            java.lang.String r8 = r11.getInviteCaption()
            r2 = r11
            boolean r0 = r11 instanceof X.C78133sE
            if (r0 == 0) goto L_0x00b2
            X.3sE r2 = (X.C78133sE) r2
            X.24N r1 = r2.getFMessage()
            X.11P r0 = r2.A0u
            long r3 = X.AnonymousClass11P.A01(r0)
            long r1 = r1.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r10 = X.AnonymousClass000.A1Q(r0)
        L_0x0026:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r3 = 8
            r2 = 0
            if (r0 != 0) goto L_0x00a5
            com.whatsapp.TextEmojiLabel r0 = r11.A04
            r11.setMessageText(r8, r0, r7)
            android.view.View r1 = r11.A01
            r0 = 0
            if (r10 == 0) goto L_0x003b
            r0 = 8
        L_0x003b:
            r1.setVisibility(r0)
        L_0x003e:
            com.whatsapp.components.TextAndDateLayout r9 = r11.A05
            if (r9 == 0) goto L_0x0069
            boolean r6 = android.text.TextUtils.isEmpty(r8)
            r5 = 7
            r1 = -2
            r0 = -1
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r4.<init>(r0, r1)
            r1 = 2131431808(0x7f0b1180, float:1.8485356E38)
            if (r6 == 0) goto L_0x009a
            r4.addRule(r5, r1)
            r4.addRule(r3, r1)
            r9.setLayoutParams(r4)
            android.view.ViewGroup r4 = r11.A06
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            r4.measure(r1, r0)
        L_0x0069:
            if (r10 == 0) goto L_0x0086
            r0 = 0
            r11.setOnClickListener(r0)
            r11.setClickable(r2)
            android.view.View r0 = r11.A03
            r0.setVisibility(r3)
            android.view.View r0 = r11.A02
        L_0x0079:
            r0.setVisibility(r2)
            X.1gV r2 = r11.A1S
            android.widget.ImageView r1 = r11.A00
            X.3M2 r0 = r11.A06
            r2.A0D(r1, r7, r0)
            return
        L_0x0086:
            android.view.View$OnClickListener r1 = r11.getOnActionClickListener()
            r11.setOnClickListener(r1)
            com.whatsapp.TextEmojiLabel r0 = r11.A07
            r0.setOnClickListener(r1)
            android.view.View r0 = r11.A02
            r0.setVisibility(r3)
            android.view.View r0 = r11.A03
            goto L_0x0079
        L_0x009a:
            r4.addRule(r5, r1)
            r0 = 3
            r4.addRule(r0, r1)
            r9.setLayoutParams(r4)
            goto L_0x0069
        L_0x00a5:
            java.lang.String r1 = ""
            com.whatsapp.TextEmojiLabel r0 = r11.A04
            r11.setMessageText(r1, r0, r7)
            android.view.View r0 = r11.A01
            r0.setVisibility(r3)
            goto L_0x003e
        L_0x00b2:
            X.206 r6 = r11.A0I
            X.23S r6 = (X.AnonymousClass23S) r6
            X.11P r0 = r11.A0u
            long r4 = X.AnonymousClass11P.A01(r0)
            long r2 = r6.A01
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ca
            boolean r0 = r6.A07
            r10 = 0
            if (r0 == 0) goto L_0x0026
        L_0x00ca:
            r10 = 1
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78143sG.A2i():void");
    }

    public int getCenteredLayoutId() {
        return 2131624835;
    }

    public int getIncomingLayoutId() {
        return 2131624833;
    }

    public int getOutgoingLayoutId() {
        return 2131624835;
    }
}
