package X;

import com.whatsapp.util.Log;

/* renamed from: X.AcH  reason: case insensitive filesystem */
public final class C20963AcH implements AnonymousClass1O5 {
    public final AnonymousClass1OZ A00;
    public final B7V A01;

    public void C7Z(C29621ca r2, String str) {
        C18070vi.A0d(r2, 1);
        Log.i("success setting block status for chat psa");
        this.A01.C7N(r2);
    }

    public void BrD(String str) {
        Log.e("error delivering blocking chat psa");
        AOS aos = (AOS) this.A01;
        if (aos.A00 != 0) {
            ((C195849u0) aos.A01).A00();
        }
    }

    public C20963AcH(B7V b7v, AnonymousClass1OZ r2) {
        this.A00 = r2;
        this.A01 = b7v;
    }

    public void Bt9(C29621ca r4, String str) {
        int A012 = AnonymousClass8BW.A01(r4);
        C17900vP.A0i("error blocking chat psa ", AnonymousClass000.A10(), A012);
        AOS aos = (AOS) this.A01;
        if (aos.A00 != 0) {
            ((C195849u0) aos.A01).A01(A012);
        } else {
            C17900vP.A0i("error getting chat block status ", AnonymousClass000.A10(), A012);
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
