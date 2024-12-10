package com.whatsapp.dogfood;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3WY;
import X.AnonymousClass4S3;
import X.AnonymousClass5HI;
import X.AnonymousClass5HJ;
import X.AnonymousClass5NR;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C24521Kq;
import X.C30391dr;
import X.C72473Md;
import X.C72483Me;
import X.C84004Hm;
import X.C87704Wq;
import X.C89934dG;
import X.C91004ez;
import X.C99154sM;
import X.C99274sY;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Collection;

public final class DogfooderDiagnosticsActivity extends AnonymousClass1FY {
    public C87704Wq A00;
    public AnonymousClass3WY A01;
    public WDSButton A02;
    public boolean A03;
    public final C18100vl A04;
    public final C18100vl A05;

    public DogfooderDiagnosticsActivity() {
        this(0);
        this.A04 = C99154sM.A01(this, 13);
        this.A05 = C99274sY.A00(new AnonymousClass5HJ(this), new AnonymousClass5HI(this), new AnonymousClass5NR(this), AnonymousClass3MW.A15(DogfooderDiagnosticsViewModel.class));
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = (C87704Wq) r1.A8q.get();
        }
    }

    public void onBackPressed() {
        Collection<AnonymousClass4S3> values = ((DogfooderDiagnosticsViewModel) this.A05.getValue()).A00.A02.values();
        C18070vi.A0X(values);
        for (AnonymousClass4S3 r1 : values) {
            r1.A00 = null;
            C24521Kq r0 = C24521Kq.$redex_init_class;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C87704Wq r0 = this.A00;
        if (r0 != null) {
            Collection<AnonymousClass4S3> values = r0.A02.values();
            C18070vi.A0X(values);
            for (AnonymousClass4S3 r1 : values) {
                if (r1.A00 == null) {
                    r1.A00 = r1.A00();
                }
            }
            setContentView(2131625139);
            C87704Wq r12 = this.A00;
            if (r12 != null) {
                this.A01 = new AnonymousClass3WY(r12);
                Toolbar toolbar = (Toolbar) this.A00.findViewById(2131430122);
                C18070vi.A0b(toolbar);
                C18000vb r13 = this.A00;
                C18070vi.A0W(r13);
                C84004Hm.A00(this, toolbar, r13, "Dogfooder Diagnostics");
                RecyclerView recyclerView = (RecyclerView) this.A04.getValue();
                AnonymousClass3WY r02 = this.A01;
                if (r02 == null) {
                    AnonymousClass3MW.A1B();
                    throw null;
                }
                recyclerView.setAdapter(r02);
                AnonymousClass3Ma.A15(recyclerView.getContext(), recyclerView);
                AnonymousClass3MX.A1Q(new DogfooderDiagnosticsActivity$setupRecyclerView$1$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
                C89934dG.A00(this.A00.findViewById(2131430121), this, 3);
                WDSButton wDSButton = (WDSButton) findViewById(2131430120);
                this.A02 = wDSButton;
                if (wDSButton == null) {
                    C18070vi.A11("submitButton");
                    throw null;
                } else {
                    C89934dG.A00(wDSButton, this, 4);
                    return;
                }
            }
        }
        C18070vi.A11("debugInfosManager");
        throw null;
    }

    public DogfooderDiagnosticsActivity(int i) {
        this.A03 = false;
        C91004ez.A00(this, 47);
    }
}
