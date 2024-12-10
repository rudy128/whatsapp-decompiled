package com.whatsapp.twofactor;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1EG;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass6VI;
import X.C000200d;
import X.C17880vN;
import X.C18070vi;
import X.C190059kJ;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C88814ar;
import X.C90104dX;
import X.C91034f2;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public final class AddEmailActivity extends AnonymousClass1FY {
    public int A00;
    public WaTextView A01;
    public WaTextView A02;
    public WDSButton A03;
    public WDSButton A04;
    public AnonymousClass00H A05;
    public String A06;
    public boolean A07;

    public AddEmailActivity() {
        this(0);
    }

    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0D(2131889655);
        C73203Rj.A0B(A002, this, 28, 2131889656);
        A002.A0X(new C88814ar(this, 29), 2131898766);
        return A002.create();
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A05 = C000200d.A00(r1.A9X);
        }
    }

    public void onCreate(Bundle bundle) {
        WaTextView waTextView;
        int i;
        int i2;
        super.onCreate(bundle);
        setContentView(2131624131);
        setTitle(2131896031);
        C72473Md.A18(this);
        this.A02 = AnonymousClass3Ma.A0N(this.A00, 2131427597);
        this.A01 = AnonymousClass3Ma.A0N(this.A00, 2131427595);
        this.A03 = (WDSButton) C18070vi.A05(this.A00, 2131427594);
        this.A04 = (WDSButton) C18070vi.A05(this.A00, 2131435474);
        this.A00 = getIntent().getIntExtra("entrypoint", 0);
        this.A06 = C72453Mb.A0v(this);
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            ((C190059kJ) r0.get()).A00(this.A06, (String) null, this.A00, 5, 8, 3);
            String A0o = this.A0A.A0o();
            if (A0o == null || A0o.length() == 0) {
                waTextView = this.A02;
                if (waTextView != null) {
                    i = 2131889659;
                }
                C18070vi.A11("title");
                throw null;
            }
            waTextView = this.A02;
            if (waTextView != null) {
                i = 2131889704;
            }
            C18070vi.A11("title");
            throw null;
            waTextView.setText(i);
            String A0o2 = this.A0A.A0o();
            if (A0o2 == null || A0o2.length() == 0) {
                WaTextView waTextView2 = this.A01;
                if (waTextView2 != null) {
                    waTextView2.setText(2131889657);
                }
                C18070vi.A11("description");
                throw null;
            }
            WaTextView waTextView3 = this.A01;
            if (waTextView3 != null) {
                Object[] A1b = AnonymousClass3MW.A1b();
                A1b[0] = AnonymousClass1EG.A03(this, AnonymousClass1YL.A00(this, 2130970831, 2131102246));
                waTextView3.setText(AnonymousClass6VI.A00(C17880vN.A0q(this, this.A0A.A0o(), A1b, 1, 2131889703)));
            }
            C18070vi.A11("description");
            throw null;
            String A0o3 = this.A0A.A0o();
            if (A0o3 == null || A0o3.length() == 0) {
                WDSButton wDSButton = this.A03;
                if (wDSButton != null) {
                    wDSButton.setText(2131889654);
                    i2 = 0;
                }
                C18070vi.A11("addEmailButton");
                throw null;
            }
            WDSButton wDSButton2 = this.A03;
            if (wDSButton2 != null) {
                wDSButton2.setText(2131889700);
                i2 = 2;
            }
            C18070vi.A11("addEmailButton");
            throw null;
            WDSButton wDSButton3 = this.A03;
            if (wDSButton3 != null) {
                C90104dX.A00(wDSButton3, this, i2, 39);
                WDSButton wDSButton4 = this.A04;
                if (wDSButton4 == null) {
                    C18070vi.A11("skipEmailButton");
                    throw null;
                } else {
                    AnonymousClass3Ma.A1E(wDSButton4, this, 5);
                    return;
                }
            }
            C18070vi.A11("addEmailButton");
            throw null;
        }
        C18070vi.A11("emailVerificationLogger");
        throw null;
    }

    public AddEmailActivity(int i) {
        this.A07 = false;
        C91034f2.A00(this, 47);
    }
}
