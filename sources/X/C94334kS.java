package X;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.4kS  reason: invalid class name and case insensitive filesystem */
public class C94334kS implements C108535br {
    public final /* synthetic */ AnonymousClass4aY A00;

    public /* synthetic */ void BlL() {
        throw AnonymousClass04E.createAndThrow();
    }

    public void C56() {
        throw AnonymousClass04E.createAndThrow();
    }

    public boolean CAJ(int i, KeyEvent keyEvent) {
        throw AnonymousClass04E.createAndThrow();
    }

    public void CAL() {
        throw AnonymousClass04E.createAndThrow();
    }

    public boolean CAN(View view, MotionEvent motionEvent) {
        throw AnonymousClass04E.createAndThrow();
    }

    public C94334kS(AnonymousClass4aY r1) {
        this.A00 = r1;
    }

    public void C2D() {
        AnonymousClass4aY r2 = this.A00;
        if (AnonymousClass4aY.A29(r2)) {
            C87464Vr.A01(r2, new C95544mP(this, 16), AnonymousClass00R.A03);
            return;
        }
        AnonymousClass4aY.A1K(r2, 1);
        AnonymousClass4aY.A0u(r2);
        r2.A42.A0A((AnonymousClass206) null, false);
    }

    public boolean C2E(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            AnonymousClass3TF r0 = this.A00.A0h;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            C41111vp r2 = r0.A00;
            r2.A0F(new AnonymousClass4YI(x, y, ((AnonymousClass4YI) r2.A06()).A02));
        }
        AnonymousClass74G r02 = this.A00.A42;
        if (r02 == null) {
            return false;
        }
        return r02.A0C(motionEvent);
    }
}
