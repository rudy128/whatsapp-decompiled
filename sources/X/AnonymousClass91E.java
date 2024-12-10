package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilDyiReportActivity;
import com.whatsapp.payments.ui.P2mLiteDyiReportActivity;

/* renamed from: X.91E  reason: invalid class name */
public abstract class AnonymousClass91E extends C166918eJ {
    public View A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public C36361nl A03;
    public WaImageView A04;
    public WaTextView A05;
    public WaTextView A06;
    public WaTextView A07;
    public C18000vb A08;
    public AnonymousClass122 A09;
    public AnonymousClass1QD A0A;
    public C31061ex A0B;
    public C20110A7s A0C;
    public C33701jF A0D;
    public AnonymousClass1QS A0E;
    public A54 A0F;
    public A5B A0G;
    public A5H A0H;
    public A4K A0I;
    public C195929uA A0J;
    public AnonymousClass96M A0K;
    public C30931ek A0L;
    public AnonymousClass129 A0M;
    public C36401np A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public String A0Q;
    public String A0R = "";
    public boolean A0S;
    public TextEmojiLabel A0T;
    public WaTextView A0U;
    public WaTextView A0V;
    public AHB A0W;
    public String A0X = "";

    public Spannable A4b() {
        String obj;
        String str = this.A0Q;
        if (str.equals("business")) {
            return AnonymousClass8BU.A09(this, 2131893815);
        }
        if (str.equals("personal")) {
            if (this instanceof P2mLiteDyiReportActivity) {
                obj = C108955ca.A0v(this.A0E, 2759);
            } else {
                obj = this.A0M.A05("payments", "how-to-request-your-payments-account-information-br").toString();
            }
            SpannableStringBuilder A092 = AnonymousClass3MW.A09(Html.fromHtml(C17880vN.A0q(this, obj, AnonymousClass3MW.A1a(), 0, 2131893972)));
            URLSpan[] uRLSpanArr = (URLSpan[]) A092.getSpans(0, A092.length(), URLSpan.class);
            if (uRLSpanArr == null) {
                return A092;
            }
            for (URLSpan uRLSpan : uRLSpanArr) {
                int spanStart = A092.getSpanStart(uRLSpan);
                int spanEnd = A092.getSpanEnd(uRLSpan);
                int spanFlags = A092.getSpanFlags(uRLSpan);
                A092.setSpan(new C74703cE(this, this.A03, this.A05, this.A08, uRLSpan.getURL()), spanStart, spanEnd, spanFlags);
                A092.setSpan(new TextAppearanceSpan(this, 2132083662), spanStart, spanEnd, spanFlags);
            }
            for (URLSpan removeSpan : uRLSpanArr) {
                A092.removeSpan(removeSpan);
            }
            return A092;
        }
        C17900vP.A0e("PAY: DyiReportBaseActivity/getDyiHeaderText - this payment account type is not supported. Payment account type = ", str, AnonymousClass000.A10());
        throw new UnsupportedOperationException("Invalid payment account type");
    }

    public void A4c(int i, int i2) {
        C010105w A012;
        int i3 = i;
        if (this instanceof P2mLiteDyiReportActivity) {
            A012 = this.A0C.A05(this, (DialogInterface.OnDismissListener) null, (DialogInterface.OnDismissListener) null, i);
            if (A012 == null) {
                return;
            }
        } else {
            BrazilDyiReportActivity brazilDyiReportActivity = (BrazilDyiReportActivity) this;
            if (i == 477) {
                A012 = C20110A7s.A01(brazilDyiReportActivity, (DialogInterface.OnDismissListener) null, brazilDyiReportActivity.getString(2131889594), brazilDyiReportActivity.getString(2131889593));
            } else {
                A012 = brazilDyiReportActivity.A01.A01(brazilDyiReportActivity, brazilDyiReportActivity.A0E, brazilDyiReportActivity.A02, i3, i2);
            }
        }
        A012.show();
    }

    public void A4d(String str) {
        AnonymousClass96M r3 = this.A0K;
        r3.A0W(new C191419mZ((AnonymousClass1FY) null, (PinBottomSheetDialogFragment) null, r3, (String) null, -1), (C29621ca) null, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x011d, code lost:
        if (r7 == null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01fc, code lost:
        if (r2.A0S != false) goto L_0x01fe;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r27) {
        /*
            r26 = this;
            r2 = r26
            r4 = r27
            super.onCreate(r4)
            r0 = 2131625149(0x7f0e04bd, float:1.8877498E38)
            r2.setContentView((int) r0)
            r0 = 2131100602(0x7f0603ba, float:1.781359E38)
            int r5 = X.C19740yt.A00(r2, r0)
            r0 = 2131433485(0x7f0b180d, float:1.8488757E38)
            android.view.View r0 = r2.findViewById(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            X.01n r3 = X.AnonymousClass3MY.A0K(r2, r0)
            r1 = 1
            if (r3 == 0) goto L_0x0030
            r0 = 2131889566(0x7f120d9e, float:1.94138E38)
            r3.A0M(r0)
            r3.A0W(r1)
            X.AnonymousClass8BY.A0d(r2, r3, r5)
        L_0x0030:
            android.content.Intent r6 = r2.getIntent()
            if (r6 == 0) goto L_0x005c
            android.os.Bundle r0 = r6.getExtras()
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0207
            android.os.Bundle r1 = r6.getExtras()
            java.lang.String r0 = "extra_paymentProvider"
            java.lang.String r0 = r1.getString(r0, r3)
        L_0x0048:
            r2.A0X = r0
            android.os.Bundle r0 = r6.getExtras()
            if (r0 == 0) goto L_0x0203
            android.os.Bundle r1 = r6.getExtras()
            java.lang.String r0 = "extra_paymentAccountType"
            java.lang.String r0 = r1.getString(r0, r3)
        L_0x005a:
            r2.A0Q = r0
        L_0x005c:
            r0 = 2131430203(0x7f0b0b3b, float:1.84821E38)
            com.whatsapp.TextEmojiLabel r1 = X.AnonymousClass8BR.A0H(r2, r0)
            r2.A0T = r1
            X.0ve r0 = r2.A0E
            X.AnonymousClass3Ma.A1L(r0, r1)
            com.whatsapp.TextEmojiLabel r1 = r2.A0T
            X.11C r0 = r2.A08
            X.AnonymousClass3Ma.A1K(r1, r0)
            X.129 r3 = r2.A0M
            java.lang.String r1 = "payments"
            java.lang.String r0 = "how-to-request-your-payments-account-information-br"
            r3.A05(r1, r0)
            com.whatsapp.TextEmojiLabel r1 = r2.A0T
            android.text.Spannable r0 = r2.A4b()
            r1.setText(r0)
            r0 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.View r6 = r2.findViewById(r0)
            com.whatsapp.WaTextView r6 = (com.whatsapp.WaTextView) r6
            r2.A0V = r6
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.P2mLiteDyiReportActivity
            if (r0 != 0) goto L_0x01fe
            java.lang.String r3 = r2.A0Q
            java.lang.String r0 = "business"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x01f2
            java.lang.String r0 = "personal"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x01f7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: DyiReportBaseActivity/getDefaultReportFooterHeaderTextRes - this payment account type is not supported. Payment account type = "
            X.C17900vP.A0e(r0, r3, r1)
            r1 = -1
        L_0x00ae:
            r6.setText(r1)
            r0 = 2131430202(0x7f0b0b3a, float:1.8482098E38)
            android.view.View r1 = r2.findViewById(r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r2.A0U = r1
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.BrazilDyiReportActivity
            if (r0 == 0) goto L_0x01ed
            r0 = 2131893966(0x7f121ece, float:1.9422723E38)
        L_0x00c3:
            r1.setText(r0)
            r0 = 2131430201(0x7f0b0b39, float:1.8482096E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r2.A07 = r0
            r0 = 2131430198(0x7f0b0b36, float:1.848209E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.WaImageView r0 = (com.whatsapp.WaImageView) r0
            r2.A04 = r0
            X.AnonymousClass4aX.A0D(r0, r5)
            r0 = 2131430199(0x7f0b0b37, float:1.8482092E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r2.A06 = r0
            r0 = 2131431077(0x7f0b0ea5, float:1.8483873E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r2.A05 = r0
            r0 = 2131430197(0x7f0b0b35, float:1.8482088E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r2.A02 = r0
            r0 = 2131430200(0x7f0b0b38, float:1.8482094E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r2.A01 = r0
            r0 = 2131429882(0x7f0b09fa, float:1.848145E38)
            android.view.View r0 = r2.findViewById(r0)
            r2.A00 = r0
            if (r27 == 0) goto L_0x011f
            java.lang.String r0 = "random_password"
            java.lang.String r7 = r4.getString(r0)
            r4 = 0
            if (r7 != 0) goto L_0x0126
        L_0x011f:
            r4 = 1
            r0 = 20
            java.lang.String r7 = X.C181799Rw.A00(r0)
        L_0x0126:
            r2.A0R = r7
            r0 = 1
            r2.A0S = r0
            X.11P r14 = r2.A05
            X.1KB r13 = r2.A05
            X.10I r6 = r2.A05
            X.A5B r5 = r2.A0G
            X.A4K r3 = r2.A0I
            X.1ek r11 = r2.A0L
            X.1QS r10 = r2.A0E
            X.122 r9 = r2.A09
            X.1QD r8 = r2.A0A
            X.1ex r1 = r2.A0B
            X.1jF r0 = r2.A0D
            X.00H r12 = r2.A0P
            X.1jG r19 = X.AnonymousClass8BR.A0a(r12)
            X.9p4 r15 = new X.9p4
            r16 = r2
            r17 = r13
            r18 = r9
            r20 = r8
            r21 = r1
            r22 = r0
            r23 = r10
            r24 = r11
            r25 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.9uA r8 = r2.A0J
            X.1KB r9 = r2.A05
            X.1ex r1 = r2.A0B
            X.00H r0 = r2.A0P
            X.1jG r19 = X.AnonymousClass8BR.A0a(r0)
            X.A54 r0 = r2.A0F
            java.lang.String r22 = "DYI-REPORT"
            X.9mt r16 = new X.9mt
            r17 = r2
            r18 = r9
            r20 = r1
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.A5H r10 = r2.A0H
            X.A54 r9 = r2.A0F
            java.lang.String r1 = r2.A0Q
            boolean r0 = r2.A0S
            X.AHB r12 = new X.AHB
            r20 = r3
            r21 = r8
            r22 = r6
            r23 = r7
            r24 = r1
            r25 = r0
            r17 = r9
            r18 = r5
            r19 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r2.A0W = r12
            X.1It r1 = X.AnonymousClass8BR.A0C(r12, r2)
            java.lang.Class<X.96M> r0 = X.AnonymousClass96M.class
            X.1J2 r0 = r1.A00(r0)
            X.96M r0 = (X.AnonymousClass96M) r0
            r2.A0K = r0
            X.1DT r1 = r0.A03
            r0 = 0
            X.C20337AGt.A00(r2, r1, r0)
            X.96M r0 = r2.A0K
            X.1DT r1 = r0.A03
            r0 = 1
            X.C20337AGt.A00(r2, r1, r0)
            X.96M r0 = r2.A0K
            X.1DT r1 = r0.A00
            r0 = 2
            X.C20337AGt.A00(r2, r1, r0)
            X.96M r0 = r2.A0K
            X.1DT r1 = r0.A02
            r0 = 3
            X.C20337AGt.A00(r2, r1, r0)
            X.96M r0 = r2.A0K
            X.1DT r1 = r0.A01
            r0 = 4
            X.C20337AGt.A00(r2, r1, r0)
            X.96M r0 = r2.A0K
            X.1DT r1 = r0.A00
            r0 = 17
            X.AnonymousClass7AQ.A00(r2, r1, r0)
            X.10I r3 = r2.A05
            r1 = 22
            X.3Cp r0 = new X.3Cp
            r0.<init>((int) r1, (java.lang.Object) r2, (boolean) r4)
            r3.CGF(r0)
            android.widget.FrameLayout r1 = r2.A01
            r0 = 31
            X.AnonymousClass3Ma.A1D(r1, r2, r0)
            return
        L_0x01ed:
            r0 = 2131893970(0x7f121ed2, float:1.9422732E38)
            goto L_0x00c3
        L_0x01f2:
            r1 = 2131893812(0x7f121e34, float:1.9422411E38)
            goto L_0x00ae
        L_0x01f7:
            boolean r0 = r2.A0S
            r1 = 2131893967(0x7f121ecf, float:1.9422725E38)
            if (r0 == 0) goto L_0x00ae
        L_0x01fe:
            r1 = 2131893971(0x7f121ed3, float:1.9422734E38)
            goto L_0x00ae
        L_0x0203:
            java.lang.String r0 = "personal"
            goto L_0x005a
        L_0x0207:
            r0 = r3
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91E.onCreate(android.os.Bundle):void");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.A0R;
        if (str != null) {
            bundle.putString("random_password", str);
        }
    }
}
