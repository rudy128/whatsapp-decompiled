package X;

import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity;

/* renamed from: X.8yK  reason: invalid class name and case insensitive filesystem */
public abstract class C175208yK extends C175188yE {
    public C19880zA A00;
    public AnonymousClass1PM A01;
    public C27201Vd A02;
    public AnonymousClass00H A03;
    public String A04;
    public String A05;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        if (r1 == null) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C175208yK r5) {
        /*
            boolean r0 = r5 instanceof com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity
            if (r0 == 0) goto L_0x005c
            X.2Dk r0 = r5.A4d()
            if (r0 == 0) goto L_0x002c
            com.whatsapp.WaEditText r4 = r5.A4c()
            java.lang.String r3 = r0.A0T
            if (r3 == 0) goto L_0x0029
            java.lang.String r2 = r5.A05
            if (r2 == 0) goto L_0x009e
            boolean r1 = r3.startsWith(r2)
            r0 = 1
            if (r1 != r0) goto L_0x0029
            int r0 = r2.length()
            java.lang.String r0 = X.C108955ca.A0z(r3, r0)
            java.lang.String r3 = X.AnonymousClass1YF.A0I(r0)
        L_0x0029:
            r4.setText(r3)
        L_0x002c:
            super.A4j()
            r0 = 2131433058(0x7f0b1662, float:1.848789E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r5, r0)
            com.whatsapp.WaEditText r1 = (com.whatsapp.WaEditText) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r5.A04 = r1
            r0 = 2131432912(0x7f0b15d0, float:1.8487595E38)
            android.view.View r3 = X.AnonymousClass3MY.A0C(r5, r0)
            com.google.android.material.textfield.TextInputLayout r3 = (com.google.android.material.textfield.TextInputLayout) r3
            java.lang.String r0 = r5.A04
            if (r0 == 0) goto L_0x009b
            r3.setPrefixText(r0)
            com.whatsapp.WaEditText r2 = r5.A4c()
            r1 = 0
            X.AFW r0 = new X.AFW
            r0.<init>(r5, r3, r1)
            r2.setOnFocusChangeListener(r0)
            return
        L_0x005c:
            boolean r0 = r5 instanceof com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity
            if (r0 == 0) goto L_0x002c
            X.2Dk r0 = r5.A4d()
            if (r0 == 0) goto L_0x007c
            java.lang.String r1 = r0.A0T
            if (r1 == 0) goto L_0x007c
            java.lang.String r0 = r5.A05
            if (r0 == 0) goto L_0x009e
            int r0 = r0.length()
            java.lang.String r0 = X.C29361c9.A0D(r1, r0)
            java.lang.String r1 = X.AnonymousClass1YF.A0I(r0)
            if (r1 != 0) goto L_0x007e
        L_0x007c:
            java.lang.String r1 = ""
        L_0x007e:
            com.whatsapp.WaEditText r0 = r5.A4c()
            r0.setText(r1)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x002c
            r0 = 2131432912(0x7f0b15d0, float:1.8487595E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r5, r0)
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r0 = 2132083881(0x7f1504a9, float:1.9807917E38)
            r1.setPrefixTextAppearance(r0)
            goto L_0x002c
        L_0x009b:
            java.lang.String r0 = "prefixText"
            goto L_0x00a0
        L_0x009e:
            java.lang.String r0 = "verifiedName"
        L_0x00a0:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175208yK.A03(X.8yK):void");
    }

    public void A4j() {
        this.A05.CGF(new C21356Ail(this, 49));
    }

    public final void A4v() {
        C19880zA r1 = this.A00;
        if (r1 == null) {
            C18070vi.A11("subscriptionAnalyticsManager");
            throw null;
        } else if (r1.A07()) {
            r1.A03();
            throw AnonymousClass000.A0s("logMetaVerifiedChannelAction");
        }
    }

    public void A4k() {
        TextView textView = (TextView) AnonymousClass3MY.A0C(this, 2131433082);
        AnonymousClass3Ma.A1D(textView, this, 22);
        textView.setText(2131892731);
    }

    public void A4o() {
        AnonymousClass3Ma.A19(A4e(), this, 19);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!(this instanceof NewsletterCreateMVActivity)) {
            getIntent().getIntExtra("mv_referral_surface", 5);
        }
        A4v();
    }
}
