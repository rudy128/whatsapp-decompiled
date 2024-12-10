package com.whatsapp.status.crossposting.privacy;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass178;
import X.AnonymousClass1F9;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass730;
import X.AnonymousClass78P;
import X.AnonymousClass79O;
import X.AnonymousClass7RH;
import X.C000200d;
import X.C003401n;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C109005cf;
import X.C1423279a;
import X.C18070vi;
import X.C217517g;
import X.C23291Fl;
import X.C23391Fw;
import X.C23401Fx;
import X.C30131dR;
import X.C72463Mc;
import X.C90594eK;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.List;

public final class ShareToFacebookActivity extends AnonymousClass1FY implements C23291Fl {
    public static final Integer A07 = AnonymousClass00R.A0I;
    public C90594eK A00;
    public C30131dR A01;
    public AnonymousClass730 A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public boolean A05;
    public final AnonymousClass00H A06;

    public C90594eK BZQ(int i, int i2, boolean z) {
        View view = this.A00;
        ArrayList A0t = C108965cb.A0t(view);
        AnonymousClass11C r5 = this.A08;
        C18070vi.A0W(r5);
        C90594eK r2 = new C90594eK(view, (AnonymousClass1F9) this, r5, (List) A0t, i, i2, z);
        this.A00 = r2;
        r2.A07(new AnonymousClass7RH((Object) this, 12));
        C90594eK r1 = this.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.snackbar.WaSnackbar");
        return r1;
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A03 = C000200d.A00(A0K.A01);
            this.A02 = (AnonymousClass730) r1.A8c.get();
            this.A04 = C000200d.A00(A0A.A4L);
            this.A01 = (C30131dR) A0A.Anv.get();
        }
    }

    public final C30131dR A4b() {
        C30131dR r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("xFamilyUserFlowLogger");
        throw null;
    }

    public void onDestroy() {
        ((AnonymousClass178) this.A06.get()).A02(this);
        C30131dR A4b = A4b();
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            A4b.A02(Boolean.valueOf(C72463Mc.A1Y(C108945cZ.A11(r0).A01(A07))), "final_auto_setting");
            A4b.A04("EXIT_STATUS_PRIVACY_DETAILS");
            A4b.A01();
            super.onDestroy();
            return;
        }
        C18070vi.A11("fbAccountManagerLazy");
        throw null;
    }

    public ShareToFacebookActivity(int i) {
        this.A05 = false;
        C1423279a.A00(this, 43);
    }

    public C23401Fx BPx() {
        return ((C23391Fw) getLifecycle()).A02;
    }

    public String BSb() {
        return "share_to_fb_activity";
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((AnonymousClass178) this.A06.get()).A01(this);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
            supportActionBar.A0S(getString(2131886449));
        }
        setContentView(2131624110);
        CompoundButton compoundButton = (CompoundButton) C18070vi.A05(this.A00, 2131427923);
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            compoundButton.setChecked(C72463Mc.A1Y(C108945cZ.A11(r0).A01(A07)));
            compoundButton.setOnCheckedChangeListener(new AnonymousClass79O(this, 3));
            View findViewById = findViewById(2131435401);
            if (findViewById != null) {
                AnonymousClass78P.A00(findViewById, this, 7);
                AnonymousClass3MW.A1Q(findViewById);
            }
            C30131dR A4b = A4b();
            A4b.A06((String) null, "SEE_STATUS_PRIVACY_DETAILS", 927601761);
            A4b.A02(Boolean.valueOf(compoundButton.isChecked()), "initial_auto_setting");
            return;
        }
        C18070vi.A11("fbAccountManagerLazy");
        throw null;
    }

    public ShareToFacebookActivity() {
        this(0);
        this.A06 = C217517g.A00(16503);
    }
}
