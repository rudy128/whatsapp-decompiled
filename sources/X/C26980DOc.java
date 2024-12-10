package X;

import android.view.LayoutInflater;
import android.view.View;

/* renamed from: X.DOc  reason: case insensitive filesystem */
public class C26980DOc implements C28582E8t {
    public View A00;
    public final C22654BId A01;
    public final C19880zA A02;
    public final C19880zA A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass118 A05;
    public final C19830z4 A06;
    public final C18030ve A07;
    public final AnonymousClass93W A08;

    private View A00() {
        if (this.A00 == null) {
            boolean A052 = C18020vd.A05(C18040vf.A01, this.A07, 5332);
            C22654BId bId = this.A01;
            LayoutInflater A0D = AnonymousClass3MZ.A0D(bId);
            if (A052) {
                this.A00 = A0D.inflate(2131625168, bId, false);
            } else {
                View inflate = A0D.inflate(2131625167, bId, false);
                this.A00 = inflate;
                inflate.setBackgroundResource(2131232942);
            }
        }
        return this.A00;
    }

    public void Bcv() {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public boolean CLk() {
        return false;
    }

    public void CQJ() {
        if (this.A00 == null) {
            this.A01.addView(A00());
        }
        A00().setVisibility(8);
    }

    public C26980DOc(C19880zA r1, C19880zA r2, C22654BId bId, AnonymousClass11P r4, AnonymousClass118 r5, C19830z4 r6, C18030ve r7, AnonymousClass93W r8) {
        this.A04 = r4;
        this.A07 = r7;
        this.A05 = r5;
        this.A02 = r1;
        this.A01 = bId;
        this.A06 = r6;
        this.A03 = r2;
        this.A08 = r8;
    }
}
