package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextSwitcher;
import com.whatsapp.payments.ui.IndiaUpiIncentivesValuePropsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity;

/* renamed from: X.91K  reason: invalid class name */
public abstract class AnonymousClass91K extends AnonymousClass92G {
    public C19880zA A00;
    public C1764594h A01;

    public String A50() {
        if (this instanceof IndiaUpiPaymentsValuePropsBottomSheetActivity) {
            IndiaUpiPaymentsValuePropsBottomSheetActivity indiaUpiPaymentsValuePropsBottomSheetActivity = (IndiaUpiPaymentsValuePropsBottomSheetActivity) this;
            if (indiaUpiPaymentsValuePropsBottomSheetActivity.A10) {
                return "scan_qr_code_intro_prompt";
            }
            if (indiaUpiPaymentsValuePropsBottomSheetActivity.A56()) {
                return "mapper_intro_prompt";
            }
            return "payment_intro_prompt";
        } else if (this instanceof IndiaUpiPaymentsValuePropsActivity) {
            return "payment_intro_screen";
        } else {
            return "incentive_value_prop";
        }
    }

    public void A51() {
        this.A01.A00.A08("valuePropsContinue");
        A55(this.A0f);
        C19880zA r1 = this.A00;
        if (r1.A07()) {
            r1.A03();
            AnonymousClass11P r4 = this.A05;
            C18070vi.A0d(r4, 0);
            Intent A04 = AnonymousClass8BS.A04(this);
            this.A0p = true;
            A4v(A04);
            A04.putExtra("extra_previous_screen", A50());
            C60442o2.A00(A04, r4, "valuePropsContinue");
            A3q(A04, true);
            return;
        }
        finish();
    }

    public void A52() {
        if (this instanceof IndiaUpiIncentivesValuePropsActivity) {
            IndiaUpiIncentivesValuePropsActivity indiaUpiIncentivesValuePropsActivity = (IndiaUpiIncentivesValuePropsActivity) this;
            indiaUpiIncentivesValuePropsActivity.A01.A00.A0C(4);
            C171858sO A07 = indiaUpiIncentivesValuePropsActivity.A0S.A07(C17880vN.A0h(), C17880vN.A0j(), "incentive_value_prop", (String) null);
            A07.A01 = Boolean.valueOf(AnonymousClass8BR.A1P(indiaUpiIncentivesValuePropsActivity));
            AZ6.A02(A07, indiaUpiIncentivesValuePropsActivity);
            return;
        }
        this.A01.A00.A0C(4);
        this.A0S.A0C(C17880vN.A0h(), C17880vN.A0j(), A50(), this.A0f, this.A0m, this.A0l, AnonymousClass000.A1T(this.A02, 11));
    }

    public void A53(TextSwitcher textSwitcher) {
        int i = 2131894228;
        if (this.A02 == 11) {
            i = 2131894235;
        }
        textSwitcher.setText(Html.fromHtml(getString(i)));
        Context context = textSwitcher.getContext();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, 2130772057);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, 2130772062);
        textSwitcher.setInAnimation(loadAnimation);
        textSwitcher.setOutAnimation(loadAnimation2);
        C17890vO.A0u(new AnonymousClass9BR(textSwitcher, this, 6), this.A05);
    }

    public void A55(String str) {
        String str2 = str;
        if (this instanceof IndiaUpiIncentivesValuePropsActivity) {
            IndiaUpiIncentivesValuePropsActivity indiaUpiIncentivesValuePropsActivity = (IndiaUpiIncentivesValuePropsActivity) this;
            C171858sO A07 = indiaUpiIncentivesValuePropsActivity.A0S.A07(C17880vN.A0h(), C17880vN.A0l(), "incentive_value_prop", str);
            A07.A01 = Boolean.valueOf(AnonymousClass8BR.A1P(indiaUpiIncentivesValuePropsActivity));
            AZ6.A02(A07, indiaUpiIncentivesValuePropsActivity);
            return;
        }
        this.A0S.A0C(C17880vN.A0h(), 36, A50(), str2, this.A0m, this.A0l, AnonymousClass000.A1T(this.A02, 11));
    }

    public void A54(Long l) {
        int i;
        C20112A7u a7u = null;
        if (getIntent() != null) {
            a7u = C20750AXf.A00((Uri) getIntent().getParcelableExtra("extra_deep_link_url"), (C20112A7u) null);
        }
        C171858sO A06 = this.A0S.A06(a7u, AnonymousClass3MY.A0f(), (Integer) null, A50(), this.A0f, this.A0m, this.A0l, AnonymousClass000.A1T(this.A02, 11));
        if (l != null) {
            long longValue = l.longValue();
            if (longValue <= 10) {
                i = 1;
            } else if (longValue <= 15) {
                i = 2;
            } else {
                i = 4;
                if (longValue <= 20) {
                    i = 3;
                }
            }
            A06.A09 = Integer.valueOf(i);
            C17900vP.A0Y(A06, "PAY: logContactBucketUserActionEvent event:", AnonymousClass000.A10());
        }
        this.A0C.CC7(A06);
    }

    public void onBackPressed() {
        super.onBackPressed();
        A52();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.A0f == null) {
            this.A0f = AnonymousClass8BV.A0o(this);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A52();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        String str;
        super.onResume();
        this.A01.A00(getIntent());
        this.A01.A00.A08("valuePropsShown");
        C1764594h r4 = this.A01;
        int i = this.A03;
        long j = (long) this.A02;
        String str2 = this.A0f;
        boolean A1P = AnonymousClass8BR.A1P(this);
        C222119a r6 = r4.A00;
        if (i == 2) {
            str = "skip2fa";
        } else {
            str = "with2fa";
        }
        r6.A0A("setupMode", str, false);
        r6.A06.markerAnnotate(r6.A05.A06, "paymentsEntryPoint", j);
        if (str2 != null) {
            r6.A0A("referralScreen", str2, false);
        }
        r6.A0B("paymentsAccountExists", A1P, false);
    }
}
