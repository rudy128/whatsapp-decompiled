package X;

import com.whatsapp.calling.dialer.DialerActivity;

/* renamed from: X.3eK  reason: invalid class name and case insensitive filesystem */
public abstract class C75293eK extends AnonymousClass1FY {
    public boolean A00 = false;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            DialerActivity dialerActivity = (DialerActivity) this;
            AnonymousClass10E A0O = AnonymousClass3MZ.A0O((AnonymousClass1K1) AnonymousClass3MX.A0R(this), dialerActivity);
            C72483Me.A0q(A0O, dialerActivity);
            AnonymousClass10G r3 = A0O.A00;
            AnonymousClass1FB.A0K(A0O, r3, dialerActivity, r3.A45);
            AnonymousClass1FB.A0L(A0O, r3, dialerActivity, r3.A5A);
            dialerActivity.A0E = C000200d.A00(A0O.A0F);
            dialerActivity.A0F = C000200d.A00(A0O.A0G);
            dialerActivity.A09 = (AnonymousClass1V9) A0O.A1e.get();
            dialerActivity.A0B = (C30191dX) A0O.A2b.get();
            dialerActivity.A0G = C000200d.A00(A0O.A72);
            dialerActivity.A0A = (C195199sx) A0O.ABV.get();
            dialerActivity.A0C = AnonymousClass3Ma.A0b(A0O);
        }
    }

    public C75293eK() {
        C90994ey.A00(this, 29);
    }

    public static AnonymousClass1D6 A03(Object obj, char c) {
        return new AnonymousClass1D6(obj, Character.valueOf(c));
    }
}
