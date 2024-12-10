package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.communitymedia.itemviews.MediaMessageTitleView;
import java.util.Map;

/* renamed from: X.5hG  reason: invalid class name and case insensitive filesystem */
public final class C110855hG extends ConstraintLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public Map A01;
    public boolean A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;

    public C110855hG(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
            this.A01 = C27691Xc.A03();
        }
        this.A03 = AnonymousClass1DF.A01(new C149167ic(this));
        this.A05 = AnonymousClass1DF.A01(new C149187ie(this));
        this.A04 = AnonymousClass1DF.A01(new C149177id(this));
        View inflate = View.inflate(context, 2131625963, this);
        C72473Md.A0z(inflate);
        C42491yG.A02(inflate);
        inflate.setBackgroundResource(2131232618);
        AnonymousClass3MY.A14(getResources(), this, 2131167702);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.C135666sZ r13, X.AnonymousClass4ZN r14, java.util.List r15, X.C22821Di r16, X.C22821Di r17, boolean r18) {
        /*
            r12 = this;
            r11 = 0
            X.C18070vi.A0d(r13, r11)
            java.util.Map r1 = r12.getCustomViewsBinders$app_productinfra_communitymedia_communitymedia()
            java.lang.Object r2 = r13.A03
            java.lang.Class r0 = r2.getClass()
            java.lang.Object r3 = r1.get(r0)
            X.8A6 r3 = (X.AnonymousClass8A6) r3
            if (r3 != 0) goto L_0x001d
            java.lang.String r0 = "Unsupported data received or not registered."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x001d:
            X.0vl r4 = r12.A03
            X.1bI r0 = X.AnonymousClass3MX.A0v(r4)
            android.view.View r0 = r0.A00
            if (r0 != 0) goto L_0x003d
            X.1bI r0 = X.AnonymousClass3MX.A0v(r4)
            android.view.ViewStub r1 = r0.A01
            if (r1 == 0) goto L_0x0036
            int r0 = r3.BSf()
            r1.setLayoutResource(r0)
        L_0x0036:
            X.1bI r0 = X.AnonymousClass3MX.A0v(r4)
            r0.A04(r11)
        L_0x003d:
            X.0vl r5 = r12.A04
            X.1bI r0 = X.AnonymousClass3MX.A0v(r5)
            android.view.View r0 = r0.A00
            if (r0 != 0) goto L_0x005d
            X.1bI r0 = X.AnonymousClass3MX.A0v(r5)
            android.view.ViewStub r1 = r0.A01
            if (r1 == 0) goto L_0x0056
            int r0 = r3.BZr()
            r1.setLayoutResource(r0)
        L_0x0056:
            X.1bI r0 = X.AnonymousClass3MX.A0v(r5)
            r0.A04(r11)
        L_0x005d:
            android.content.Context r1 = X.AnonymousClass3MY.A04(r12)
            X.1bI r0 = X.AnonymousClass3MX.A0v(r4)
            android.view.View r0 = X.AnonymousClass3MX.A0D(r0)
            r3.BD7(r1, r0, r13)
            android.content.Context r0 = r12.getContext()
            X.C18070vi.A0X(r0)
            X.1bI r0 = X.AnonymousClass3MX.A0v(r5)
            android.view.View r0 = X.AnonymousClass3MX.A0D(r0)
            r3.BDC(r0, r14, r13, r15)
            com.whatsapp.communitymedia.itemviews.MediaMessageTitleView r3 = r12.getTitleView()
            X.4ZN r1 = r13.A00
            r4 = 8
            if (r1 == 0) goto L_0x0132
            com.whatsapp.TextEmojiLabel r6 = r3.A05
            android.content.Context r5 = r3.getContext()
            android.content.Context r0 = X.AnonymousClass3MY.A04(r3)
            java.lang.CharSequence r1 = r1.A03(r0)
            X.0vb r0 = r3.getWhatsAppLocale()
            java.lang.CharSequence r1 = X.C43351zf.A03(r5, r0, r1, r15)
            r0 = 0
            r6.A0S(r1, r0, r11, r11)
            com.whatsapp.WaTextView r1 = r3.A00
            r1.setVisibility(r11)
            java.lang.String r0 = ":"
            r1.setText(r0)
        L_0x00ac:
            java.lang.Integer r0 = r13.A02
            if (r0 == 0) goto L_0x012c
            int r5 = r0.intValue()
            com.whatsapp.WaImageView r4 = r3.A07
            android.content.Context r1 = r3.getContext()
            r0 = 2131101314(0x7f060682, float:1.7815034E38)
            X.AnonymousClass4aX.A0B(r1, r4, r5, r0)
            r4.setVisibility(r11)
        L_0x00c3:
            X.4ZN r1 = r13.A01
            android.content.Context r0 = X.AnonymousClass3MY.A04(r3)
            java.lang.CharSequence r5 = r1.A03(r0)
            boolean r0 = r2 instanceof X.AnonymousClass206
            r1 = 0
            if (r0 != 0) goto L_0x00da
            boolean r0 = r2 instanceof X.AnonymousClass4TL
            if (r0 == 0) goto L_0x00f7
            X.4TL r2 = (X.AnonymousClass4TL) r2
            X.210 r2 = r2.A00
        L_0x00da:
            X.206 r2 = (X.AnonymousClass206) r2
            if (r2 == 0) goto L_0x00f7
            android.text.SpannableStringBuilder r8 = X.AnonymousClass3MW.A09(r5)
            X.1gc r6 = r3.getMentions()
            android.content.Context r7 = r3.getContext()
            X.1BI r9 = r2.A0H()
            java.util.List r10 = r2.A0h
            r6.A06(r7, r8, r9, r10, r11)
            java.lang.String r1 = r8.toString()
        L_0x00f7:
            com.whatsapp.TextEmojiLabel r4 = r3.A06
            android.content.Context r2 = r3.getContext()
            if (r1 == 0) goto L_0x0100
            r5 = r1
        L_0x0100:
            java.lang.String r1 = r5.toString()
            r0 = 150(0x96, float:2.1E-43)
            java.lang.String r1 = X.AnonymousClass1EG.A0F(r1, r0)
            X.0vb r0 = r3.getWhatsAppLocale()
            java.lang.CharSequence r1 = X.C43351zf.A03(r2, r0, r1, r15)
            r0 = 0
            r4.A0S(r1, r0, r11, r11)
            X.82D r0 = new X.82D
            r1 = r16
            r0.<init>(r13, r1)
            X.C84084Hu.A00(r12, r0)
            r0 = 5
            r1 = r17
            X.C1421578j.A00(r12, r13, r1, r0)
            r0 = r18
            r12.setSelected(r0)
            return
        L_0x012c:
            com.whatsapp.WaImageView r0 = r3.A07
            r0.setVisibility(r4)
            goto L_0x00c3
        L_0x0132:
            com.whatsapp.WaTextView r0 = r3.A00
            r0.setVisibility(r4)
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110855hG.A07(X.6sZ, X.4ZN, java.util.List, X.1Di, X.1Di, boolean):void");
    }

    public final void setCustomViewsBinders$app_productinfra_communitymedia_communitymedia(Map map) {
        C18070vi.A0d(map, 0);
        this.A01 = map;
    }

    private final C28931bI getIconViewStub() {
        return AnonymousClass3MX.A0v(this.A03);
    }

    private final C28931bI getMetadataViewStub() {
        return AnonymousClass3MX.A0v(this.A04);
    }

    private final MediaMessageTitleView getTitleView() {
        return (MediaMessageTitleView) AnonymousClass3MX.A14(this.A05);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public final Map getCustomViewsBinders$app_productinfra_communitymedia_communitymedia() {
        Map map = this.A01;
        if (map != null) {
            return map;
        }
        C18070vi.A11("customViewsBinders");
        throw null;
    }
}
