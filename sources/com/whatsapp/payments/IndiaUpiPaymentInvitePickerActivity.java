package com.whatsapp.payments;

import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1PM;
import X.AnonymousClass1QO;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C195859u1;
import X.C20110A7s;
import X.C21425Ajs;
import X.C22941Dw;
import X.C42741yf;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C85024Lu;
import X.C91024f1;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.payments.ui.PaymentInvitePickerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IndiaUpiPaymentInvitePickerActivity extends PaymentInvitePickerActivity {
    public AnonymousClass1PM A00;
    public C20110A7s A01;
    public AnonymousClass1QO A02;
    public C195859u1 A03;
    public AZ6 A04;
    public C85024Lu A05;
    public boolean A06;
    public boolean A07;

    public IndiaUpiPaymentInvitePickerActivity() {
        this(0);
        this.A06 = false;
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r3 = A0K.AAQ;
            C72483Me.A0q(r3, this);
            AnonymousClass10G r2 = r3.A00;
            AnonymousClass1FB.A0K(r3, r2, this, r2.A45);
            AnonymousClass1FB.A0L(r3, r2, this, r2.A5A);
            C74803cp.A0t(A0K, r3, r2, this, A0K.A63);
            C74803cp.A0s(A0K, r3, r2, this);
            this.A01 = AnonymousClass3MZ.A0z(r3);
            this.A00 = AnonymousClass3MZ.A0q(r3);
            this.A02 = AnonymousClass3MX.A11(r3);
            this.A05 = new C85024Lu(C000200d.A00(r3.A0x));
            this.A00 = AnonymousClass3MZ.A0f(r3);
            this.A02 = AnonymousClass3Ma.A0q(r3);
            this.A03 = AnonymousClass1K1.A1N(A0K);
            this.A04 = (AZ6) r3.A5D.get();
            this.A01 = r2.A8N();
        }
    }

    public void A4r() {
        if (C18020vd.A05(C18040vf.A02, this.A02.A02, 783)) {
            this.A06 = true;
            this.A05.CGF(new C21425Ajs((Object) this, 28));
        }
    }

    public void A4w(View view, View view2, View view3, View view4) {
        if (C18020vd.A05(C18040vf.A02, this.A02.A02, 783)) {
            View inflate = getLayoutInflater().inflate(2131626116, (ViewGroup) null, false);
            ((ViewGroup) view4.getParent()).addView(inflate, 0);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(2131429423);
            if (shimmerFrameLayout != null) {
                shimmerFrameLayout.setVisibility(0);
                shimmerFrameLayout.A03();
            }
            view4.setVisibility(8);
            view.setVisibility(8);
            view2.setVisibility(8);
            view3.setVisibility(0);
            return;
        }
        super.A4w(view, view2, view3, view4);
    }

    public boolean A5B() {
        return this.A06;
    }

    public void A4v(View view, View view2, View view3, View view4) {
        super.A4v(view, view2, view3, view4);
        if (C18020vd.A05(C18040vf.A02, this.A02.A02, 783)) {
            C72463Mc.A19(this, 2131429423);
        }
    }

    public void A58(List list) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 A0O = C17880vN.A0O(it);
            C42741yf A012 = this.A00.A01(C22941Dw.A00(A0O.A0J));
            if (A012 == null || (!A012.A03() && !A012.A02())) {
                A13.add(A0O);
            }
        }
        super.A58(A13);
    }

    public /* synthetic */ void A5D() {
        super.onBackPressed();
    }

    public IndiaUpiPaymentInvitePickerActivity(int i) {
        this.A07 = false;
        C91024f1.A00(this, 6);
    }
}
