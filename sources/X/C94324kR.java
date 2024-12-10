package X;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.4kR  reason: invalid class name and case insensitive filesystem */
public class C94324kR implements C108535br {
    public final /* synthetic */ AnonymousClass4aY A00;

    public C94324kR(AnonymousClass4aY r1) {
        this.A00 = r1;
    }

    public void BlL() {
        AnonymousClass4aY r2 = this.A00;
        ((AnonymousClass4XB) AnonymousClass3MZ.A0k(r2).A0N.get()).A01(19);
        AnonymousClass73Z.A01(new C75813ln(true), (AnonymousClass73Z) AnonymousClass3MZ.A0k(r2).A0A.get(), 19, 814, false);
    }

    public void C2D() {
        AnonymousClass4aY r0 = this.A00;
        AnonymousClass4aY.A1K(r0, 0);
        AnonymousClass4aY.A0u(r0);
        r0.A42.A0A((AnonymousClass206) null, false);
    }

    public boolean C2E(MotionEvent motionEvent) {
        AnonymousClass4aY r1 = this.A00;
        AnonymousClass4aY.A1K(r1, 0);
        return r1.A42.A0C(motionEvent);
    }

    public void C56() {
        AnonymousClass4aY r5 = this.A00;
        r5.A72 = true;
        Integer num = AnonymousClass3MZ.A0a(r5).A00;
        if (num != null && num.intValue() == 2) {
            AnonymousClass4R4 A0a = AnonymousClass3MZ.A0a(r5);
            if (A0a.A01 == null) {
                A0a.A01 = C17890vO.A0Q();
            }
        }
        AnonymousClass4R4 A0a2 = AnonymousClass3MZ.A0a(r5);
        AnonymousClass1BI r2 = r5.A3R;
        int i = 4;
        if (C22971Dz.A0V(r2)) {
            i = 26;
        }
        A0a2.A00(r2, 3, i);
        AnonymousClass3VQ r0 = r5.A2b;
        r0.A0v.BIH(r0.A0u);
        r5.A2o(r5.A29, false, true);
    }

    public boolean CAJ(int i, KeyEvent keyEvent) {
        C80753xv r0;
        AnonymousClass4aY r3 = this.A00;
        if (AnonymousClass4aY.A29(r3)) {
            C87464Vr.A01(r3, new C95534mO(), AnonymousClass00R.A02);
            return true;
        }
        if (r3.A6l && i == 23 && keyEvent.getAction() == 0 && !r3.A3G() && ((r0 = r3.A3L) == null || !r0.A01())) {
            AnonymousClass4aY.A0w(r3);
            AnonymousClass4aY.A0g(r3);
            if (!r3.A3G()) {
                AnonymousClass74M r02 = r3.A4h;
                C17960vV.A07(r02);
                r02.A0c();
                return true;
            }
        }
        return false;
    }

    public void CAL() {
        AnonymousClass4aY r3 = this.A00;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!AnonymousClass4aY.A29(r3)) {
            AnonymousClass4aY.A0g(r3);
            AnonymousClass74M r0 = r3.A4h;
            C17960vV.A07(r0);
            r0.A0Q(uptimeMillis);
        }
    }

    public boolean CAN(View view, MotionEvent motionEvent) {
        AnonymousClass4aY r2 = this.A00;
        if (AnonymousClass4aY.A29(r2)) {
            C87464Vr.A01(r2, new C95544mP(this, 15), AnonymousClass00R.A02);
            return true;
        }
        C80753xv r0 = r2.A3L;
        if (r0 != null && r0.A01()) {
            return false;
        }
        AnonymousClass4aY.A0w(r2);
        AnonymousClass4aY.A0g(r2);
        AnonymousClass74M r1 = r2.A4h;
        C17960vV.A07(r1);
        return r1.A0d(motionEvent, view, r2.A6g);
    }
}
