package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.2yT  reason: invalid class name and case insensitive filesystem */
public class C66622yT implements C160868Ag {
    public static final AnonymousClass1DS A03 = new AnonymousClass1DS();
    public final Activity A00;
    public final C201911e A01 = AnonymousClass12Q.A00(C37081ow.class);
    public final AGV A02;

    public void Bzi() {
    }

    public void C0Y() {
    }

    public void CI9(View view) {
    }

    public void CIo(boolean z) {
    }

    public void onGlobalLayout() {
    }

    public void C6C(View view) {
        C201911e r2 = this.A01;
        ((C37081ow) r2.get()).A01(this.A00);
        ((C37081ow) r2.get()).A02(this.A02);
    }

    public void C6z() {
        C201911e r3 = this.A01;
        AGV agv = this.A02;
        C18070vi.A0d(agv, 0);
        ((C37081ow) r3.get()).A00.remove(agv);
        ((C37081ow) r3.get()).A00();
    }

    public C66622yT(Activity activity, AGV agv) {
        this.A00 = activity;
        this.A02 = agv;
    }

    public AnonymousClass1DS BO0() {
        return A03;
    }

    public AnonymousClass1DS BO1() {
        return A03;
    }
}
