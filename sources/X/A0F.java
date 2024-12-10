package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public final class A0F {
    public C187079fE A00;
    public boolean A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass118 A03;
    public final C18030ve A04;
    public final C175288yT A05;
    public final AnonymousClass10I A06;

    public final synchronized void A01(C22462B8u b8u) {
        if (!AnonymousClass9R8.A00()) {
            C17890vO.A0D().post(new C21432Ajz(this, b8u, 4));
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, X.9fE] */
    public static final void A00(AnonymousClass118 r4, A0F a0f) {
        if (a0f.A00 == null) {
            try {
                Context context = r4.A00;
                AnonymousClass9YG r2 = new AnonymousClass9YG(a0f);
                if (C187079fE.A04 == null) {
                    ? obj = new Object();
                    obj.A03 = null;
                    obj.A01 = new AA1(obj, 3);
                    obj.A00 = context;
                    obj.A02 = r2;
                    Intent A0A = C17880vN.A0A();
                    A0A.setAction("org.npci.upi.security.services.CLRemoteService");
                    A0A.setPackage(obj.A00.getPackageName());
                    obj.A00.bindService(A0A, obj.A01, 1);
                    C187079fE.A04 = obj;
                    return;
                }
                throw AnonymousClass8BR.A0w("Service already initiated");
            } catch (RuntimeException unused) {
                a0f.A02.A0G("payments/indiaupi", "CLServices already initialized", true);
                Log.e("CLServices already initialized");
            }
        } else {
            C17890vO.A0D().post(new C21426Ajt(a0f, 4));
        }
    }

    public A0F(AnonymousClass190 r1, AnonymousClass118 r2, C18030ve r3, C175288yT r4, AnonymousClass10I r5) {
        C18070vi.A0w(r3, r5, r2, r1, r4);
        this.A04 = r3;
        this.A06 = r5;
        this.A03 = r2;
        this.A02 = r1;
        this.A05 = r4;
    }
}
