package X;

import android.view.LayoutInflater;
import android.view.View;

/* renamed from: X.ALc  reason: case insensitive filesystem */
public abstract class C20439ALc implements C28582E8t {
    public View A00;
    public final C22654BId A01;
    public final C195979uG A02;

    public void A02(int i) {
        C19830z4 r3;
        long currentTimeMillis;
        String str;
        if (i != 1) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    return;
            }
        }
        C195979uG r1 = this.A02;
        if (r1 instanceof C175518yq) {
            r3 = ((C175518yq) r1).A00;
            currentTimeMillis = System.currentTimeMillis();
            str = "payments_onboarding_banner_start_cool_off_timestamp";
        } else {
            r3 = ((C175508yp) r1).A01;
            currentTimeMillis = System.currentTimeMillis();
            str = "payments_incentive_banner_start_cool_off_timestamp";
        }
        r3.A1q(str, currentTimeMillis);
    }

    public View A00() {
        int i;
        View view = this.A00;
        if (view != null) {
            return view;
        }
        C22654BId bId = this.A01;
        LayoutInflater A0D = AnonymousClass3MZ.A0D(bId);
        if (this instanceof AnonymousClass8h6) {
            i = 2131624986;
        } else {
            i = 2131624987;
        }
        View A09 = AnonymousClass3MX.A09(A0D, bId, i);
        this.A00 = A09;
        return A09;
    }

    public void A01() {
        View view = this.A00;
        C17960vV.A05(view);
        view.setVisibility(8);
        this.A02.A01();
    }

    public void Bcv() {
        C72453Mb.A1B(this.A00);
    }

    public boolean CLk() {
        return this.A02.A03();
    }

    public C20439ALc(C22654BId bId, C195979uG r2) {
        this.A01 = bId;
        this.A02 = r2;
    }
}
