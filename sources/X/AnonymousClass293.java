package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaViewPager;

/* renamed from: X.293  reason: invalid class name */
public class AnonymousClass293 extends AnonymousClass1b8 {
    public final AnonymousClass1b8 A00;
    public final C18000vb A01;

    public float A03(int i) {
        AnonymousClass1b8 r2 = this.A00;
        return r2.A03(WaViewPager.A00(this.A01, i, r2.A0E()));
    }

    public void A09(ViewGroup viewGroup, Object obj, int i) {
        AnonymousClass1b8 r2 = this.A00;
        r2.A09(viewGroup, obj, WaViewPager.A00(this.A01, i, r2.A0E()));
    }

    public int A0A(Object obj) {
        AnonymousClass1b8 r3 = this.A00;
        int A0A = r3.A0A(obj);
        if (A0A == -2 || A0A == -1) {
            return A0A;
        }
        return WaViewPager.A00(this.A01, A0A, r3.A0E());
    }

    public CharSequence A0C(int i) {
        AnonymousClass1b8 r2 = this.A00;
        return r2.A0C(WaViewPager.A00(this.A01, i, r2.A0E()));
    }

    public void A0D(ViewGroup viewGroup) {
        this.A00.A0D(viewGroup);
    }

    public int A0E() {
        return this.A00.A0E();
    }

    public Object A0F(ViewGroup viewGroup, int i) {
        AnonymousClass1b8 r2 = this.A00;
        return r2.A0F(viewGroup, WaViewPager.A00(this.A01, i, r2.A0E()));
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        AnonymousClass1b8 r2 = this.A00;
        int A0E = r2.A0E();
        if (i == A0E) {
            A0E++;
        }
        r2.A0G(viewGroup, obj, WaViewPager.A00(this.A01, i, A0E));
    }

    public boolean A0H(View view, Object obj) {
        return this.A00.A0H(view, obj);
    }

    public AnonymousClass293(AnonymousClass1b8 r3, C18000vb r4) {
        this.A01 = r4;
        this.A00 = r3;
        r3.A05(new C72603Mu(this, 0));
    }
}
