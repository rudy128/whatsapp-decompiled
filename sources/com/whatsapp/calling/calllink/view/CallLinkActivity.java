package com.whatsapp.calling.calllink.view;

import X.A4u;
import X.A69;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass17T;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
import X.AnonymousClass1HS;
import X.AnonymousClass1K1;
import X.AnonymousClass1L9;
import X.AnonymousClass1V7;
import X.AnonymousClass1VP;
import X.AnonymousClass3M7;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass74H;
import X.AnonymousClass79Z;
import X.AnonymousClass7AN;
import X.C000200d;
import X.C108955ca;
import X.C109005cf;
import X.C110885hR;
import X.C114655rV;
import X.C114705rq;
import X.C114715rr;
import X.C114725rs;
import X.C114735rt;
import X.C135166rl;
import X.C1417476u;
import X.C143587Dz;
import X.C17960vV;
import X.C23321Fo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.calllink.viewmodel.CallLinkViewModel;

public class CallLinkActivity extends C114655rV implements C23321Fo {
    public View A00;
    public ViewGroup A01;
    public C114705rq A02;
    public C114735rt A03;
    public C114725rs A04;
    public C114715rr A05;
    public WaImageView A06;
    public CallLinkViewModel A07;
    public AnonymousClass1VP A08;
    public AnonymousClass1V7 A09;
    public A4u A0A;
    public AnonymousClass1HS A0B;
    public AnonymousClass17T A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public boolean A0F;

    public void C5k(int i, int i2) {
        if (i == 1) {
            this.A07.A0T(i2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.6nW, java.lang.Object, X.5rt] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131889075);
        this.A01 = (ViewGroup) C110885hR.A0A(this, 2131432010);
        this.A06 = (WaImageView) C110885hR.A0A(this, 2131432016);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165667);
        this.A01.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A07 = (CallLinkViewModel) AnonymousClass3MW.A0N(this).A00(CallLinkViewModel.class);
        ? obj = new Object();
        this.A03 = obj;
        obj.A00 = A4b();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131165669);
        ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(this.A03.A00);
        A0B2.setMargins(A0B2.leftMargin, A0B2.topMargin, A0B2.rightMargin, dimensionPixelSize2);
        this.A03.A00.setLayoutParams(A0B2);
        this.A03 = this.A03;
        A4f();
        this.A05 = A4e();
        this.A02 = A4c();
        this.A04 = A4d();
        AnonymousClass7AN.A00(this, this.A07.A02.A01("saved_state_link"), 37);
        AnonymousClass7AN.A00(this, this.A07.A00, 38);
        AnonymousClass7AN.A00(this, this.A07.A01, 39);
        this.A00 = this.A0C.BHS(this, this.A02, (C135166rl) null, this.A0E, (AnonymousClass1BI) null);
        ViewGroup viewGroup = (ViewGroup) findViewById(2131428706);
        if (viewGroup != null) {
            viewGroup.addView(this.A00);
        }
        View view = this.A00;
        if (view instanceof AnonymousClass3M7) {
            AnonymousClass3M7 r2 = (AnonymousClass3M7) view;
            r2.setVisibilityChangeListener(new C143587Dz(this, r2, 0));
        }
    }

    public static void A0Q(CallLinkActivity callLinkActivity, C1417476u r6) {
        boolean z = false;
        C17960vV.A0F(AnonymousClass000.A1W(callLinkActivity.A04.A02), "Share text cannot be null");
        if (callLinkActivity.A04.A01 != null) {
            z = true;
        }
        C17960vV.A0F(z, "Email subject cannot be null");
        if (Build.VERSION.SDK_INT < 22) {
            callLinkActivity.A0A.A03(AnonymousClass74H.A02((String) null, 2, 1, r6.A00()));
        }
        AnonymousClass1L9 r3 = callLinkActivity.A01;
        boolean A002 = r6.A00();
        C114725rs r0 = callLinkActivity.A04;
        r3.A08(callLinkActivity, AnonymousClass74H.A00(callLinkActivity, r0.A02, r0.A01, 1, A002));
    }

    public void A2y() {
        if (!this.A0F) {
            this.A0F = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            C109005cf.A0d(A0A2, r1, this);
            C109005cf.A0e(A0A2, r1, this, r1.A5A);
            this.A02 = AnonymousClass3MY.A0Z(A0A2);
            this.A0C = AnonymousClass1K1.A0p(A0K);
            this.A08 = (AnonymousClass1VP) A0A2.A1l.get();
            this.A0B = (AnonymousClass1HS) A0A2.A98.get();
            this.A09 = (AnonymousClass1V7) A0A2.A97.get();
            this.A0A = (A4u) A0A2.A1k.get();
            this.A0D = AnonymousClass3MX.A11(A0A2);
            this.A0E = C000200d.A00(A0A2.A8W);
        }
    }

    public void A3K() {
        AnonymousClass3MX.A0u(this.A0D).A02((AnonymousClass1BI) null, 15);
    }

    public CallLinkActivity(int i) {
        this.A0F = false;
        AnonymousClass79Z.A00(this, 28);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A00.setOnClickListener((View.OnClickListener) null);
        this.A00.setOnLongClickListener((View.OnLongClickListener) null);
    }

    public void onResume() {
        super.onResume();
        if (this.A0B.A01() || this.A0B.A02()) {
            this.A09.A00(new A69("show_voip_activity"));
        }
    }

    public CallLinkActivity() {
        this(0);
    }
}
