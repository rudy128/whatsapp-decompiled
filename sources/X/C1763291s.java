package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.CopyableTextView;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import java.util.LinkedList;

/* renamed from: X.91s  reason: invalid class name and case insensitive filesystem */
public abstract class C1763291s extends AnonymousClass93E {
    public AnonymousClass122 A00;
    public C33311ic A01;
    public AnonymousClass1QD A02;
    public C31061ex A03;
    public C20110A7s A04;
    public C33701jF A05;
    public A27 A06;
    public C191389mW A07;
    public C161428De A08;
    public AnonymousClass8DJ A09;
    public C30931ek A0A;
    public AnonymousClass00H A0B;
    public FrameLayout A0C;
    public final AnonymousClass1QE A0D = AnonymousClass1QE.A00("PaymentCardDetailsActivity", "payment-settings", "COMMON");

    public void A4e() {
        A03(this, 1);
        if (this.A08 != null) {
            boolean A052 = C18020vd.A05(C18040vf.A02, this.A0E, 1927);
            C161428De r3 = this.A08;
            String str = this.A04.A0A;
            int i = 17;
            if (A052) {
                i = 16;
            }
            r3.setAlertButtonClickListener(new AFV(i, str, this));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            this.A0D.A06("onActivityResult 1");
            C21427Aju.A00(this.A0E, this, 16);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.widget.LinearLayout, android.view.View, X.8De, android.view.ViewGroup] */
    public static void A03(C1763291s r4, int i) {
        ? linearLayout = new LinearLayout(r4);
        if (!linearLayout.A06) {
            linearLayout.A06 = true;
            linearLayout.generatedComponent();
        }
        AnonymousClass3MZ.A0D(linearLayout).inflate(2131624498, linearLayout, true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, 0, 0, linearLayout.getResources().getDimensionPixelSize(2131168345));
        linearLayout.A02 = (Button) linearLayout.findViewById(2131428843);
        linearLayout.A04 = C17880vN.A0E(linearLayout, 2131428847);
        linearLayout.A03 = AnonymousClass3MW.A0H(linearLayout, 2131428845);
        linearLayout.A00 = linearLayout.findViewById(2131428846);
        linearLayout.A01 = linearLayout.findViewById(2131428844);
        linearLayout.A00(1, 0);
        r4.A08 = linearLayout;
        r4.A0C.removeAllViews();
        r4.A0C.addView(r4.A08);
        AnonymousClass8DJ r0 = r4.A09;
        if (r0 != null) {
            r0.setBottomDividerSpaceVisibility(8);
            r4.A08.setTopDividerVisibility(8);
        }
        if (i == 4) {
            if (C18020vd.A05(C18040vf.A02, r4.A09.A02, 10897)) {
                r4.A08.A00(4, 2131897797);
                return;
            }
        }
        r4.A08.A00(i, 0);
    }

    public void A4f(C33661jB r5, String str, String str2) {
        C31061ex r3 = this.A03;
        LinkedList A14 = AnonymousClass8BR.A14();
        C17890vO.A11("action", "edit-default-credential", A14);
        C17890vO.A11("credential-id", str, A14);
        C17890vO.A11("version", "2", A14);
        if (!TextUtils.isEmpty(str2)) {
            C17890vO.A11("payment-type", C108955ca.A0y(str2), A14);
        }
        r3.A0D(r5, AnonymousClass8BX.A0P(A14));
    }

    public void A4c(C20284AEs aEs, boolean z) {
        super.A4c(aEs, z);
        AnonymousClass8pK r2 = (AnonymousClass8pK) aEs;
        C17960vV.A07(r2);
        this.A0J.setText(A8e.A02(this, r2));
        C170278pb r0 = r2.A08;
        if (r0 != null) {
            boolean A0A2 = r0.A0A();
            CopyableTextView copyableTextView = this.A0K;
            if (!A0A2) {
                copyableTextView.setText(2131893673);
                this.A0K.A03 = null;
                A4e();
            } else {
                copyableTextView.setVisibility(8);
            }
        }
        C170278pb r02 = aEs.A08;
        C17960vV.A07(r02);
        if (r02.A0A()) {
            C161428De r03 = this.A08;
            if (r03 != null) {
                r03.setVisibility(8);
                AnonymousClass8DJ r1 = this.A09;
                if (r1 != null) {
                    r1.setBottomDividerSpaceVisibility(0);
                }
            }
            this.A0K.setVisibility(8);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0M(2131893612);
            boolean z = this instanceof BrazilPaymentCardDetailsActivity;
            C003401n supportActionBar2 = getSupportActionBar();
            if (z) {
                if (supportActionBar2 != null) {
                    supportActionBar2.A0W(true);
                    int currentContentInsetRight = this.A0D.getCurrentContentInsetRight();
                    this.A0D.A0O(AnonymousClass91y.A0Q(this, 2132084537), currentContentInsetRight);
                }
                i = AnonymousClass91y.A0Q(this, 2132084472);
            } else {
                if (supportActionBar2 != null) {
                    supportActionBar2.A0W(true);
                    int currentContentInsetRight2 = this.A0D.getCurrentContentInsetRight();
                    this.A0D.A0O(AnonymousClass91y.A0Q(this, 2132084537), currentContentInsetRight2);
                }
                i = 0;
            }
            this.A0D.A0O(this.A0D.getCurrentContentInsetLeft(), i);
        }
        this.A0C = (FrameLayout) findViewById(2131432749);
    }
}
