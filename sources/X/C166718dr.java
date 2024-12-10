package X;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.payments.ui.BrazilPaymentDPOActivity;

/* renamed from: X.8dr  reason: invalid class name and case insensitive filesystem */
public abstract class C166718dr extends AnonymousClass1FY {
    public View A00;
    public Button A01;
    public EditText A02;
    public TextView A03;
    public TextView A04;
    public AnonymousClass8G3 A05;
    public TextView A06;
    public TextView A07;

    public AnonymousClass8G3 A4g() {
        return ((BrazilPaymentDPOActivity) this).A00;
    }

    public int A4b() {
        return 2131895317;
    }

    public int A4c() {
        return 2131895324;
    }

    public int A4d() {
        return 2131895322;
    }

    public int A4e() {
        return 2131895323;
    }

    public int A4f() {
        return 2131896602;
    }

    public void A4h() {
        Spanned fromHtml;
        this.A00 = findViewById(2131436357);
        this.A07 = AnonymousClass3MX.A0L(this, 2131429925);
        this.A02 = (EditText) findViewById(2131429922);
        this.A04 = AnonymousClass3MX.A0L(this, 2131429923);
        this.A01 = (Button) findViewById(2131429461);
        this.A06 = AnonymousClass3MX.A0L(this, 2131431402);
        this.A03 = AnonymousClass3MX.A0L(this, 2131429919);
        this.A00.setVisibility(8);
        int i = Build.VERSION.SDK_INT;
        String string = getResources().getString(A4d());
        if (i >= 24) {
            fromHtml = Html.fromHtml(string, 63);
        } else {
            fromHtml = Html.fromHtml(string);
        }
        this.A07.setText(fromHtml);
        this.A02.setHint(A4c());
        AnonymousClass9AL.A00(this.A02, this, 3);
        AFX.A00(this.A02, this, 6);
        this.A01.setText(A4f());
        AnonymousClass3Ma.A19(this.A01, this, 44);
        AnonymousClass3Ma.A19(this.A06, this, 45);
    }

    public void A4i() {
        AnonymousClass8G3 A4g = A4g();
        this.A05 = A4g;
        C17960vV.A07(A4g.A01.A06());
        C20336AGs.A00(this, this.A05.A01, 41);
        C20336AGs.A00(this, this.A05.A09, 42);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624694);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
            supportActionBar.A0M(A4b());
        }
        A4i();
        A4h();
        if (getIntent() != null) {
            this.A05.A0Z(getIntent().getStringExtra("extra_transaction_id"));
        }
        AnonymousClass8G3 r2 = this.A05;
        C20112A7u A022 = C20112A7u.A02();
        A022.A07("product_flow", "p2m");
        A022.A05(r2.A06);
        r2.A07.BiM(A022, (Integer) null, r2.A0U(), (String) null, 0);
    }
}
