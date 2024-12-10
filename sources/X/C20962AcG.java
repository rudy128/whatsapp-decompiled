package X;

import com.whatsapp.util.Log;

/* renamed from: X.AcG  reason: case insensitive filesystem */
public final class C20962AcG implements AnonymousClass1O5 {
    public final AnonymousClass1OZ A00;
    public final B7V A01;

    public C20962AcG(B7V b7v, AnonymousClass1OZ r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
        this.A01 = b7v;
    }

    public void Bt9(C29621ca r4, String str) {
        C18070vi.A0d(r4, 1);
        B7V b7v = this.A01;
        int A002 = C60482o6.A00(r4);
        AOS aos = (AOS) b7v;
        if (aos.A00 != 0) {
            ((C195849u0) aos.A01).A01(A002);
        } else {
            C17900vP.A0i("error getting chat block status ", AnonymousClass000.A10(), A002);
        }
    }

    public void C7Z(C29621ca r2, String str) {
        C18070vi.A0d(r2, 1);
        this.A01.C7N(r2);
    }

    public void BrD(String str) {
        Log.e("delivery failure in getting block status for chat psa");
        AOS aos = (AOS) this.A01;
        if (aos.A00 != 0) {
            ((C195849u0) aos.A01).A00();
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
