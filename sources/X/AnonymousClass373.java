package X;

import android.util.Pair;

/* renamed from: X.373  reason: invalid class name */
public class AnonymousClass373 implements AnonymousClass1O5 {
    public final /* synthetic */ C30891eg A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public AnonymousClass373(C30891eg r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public void BrD(String str) {
        C17900vP.A0f("TwoFactorXmppMethods/sendSetTwoFactorAuth/onDeliveryFailure; iq=", str, AnonymousClass000.A10());
        this.A00.A00.CGP(new AnonymousClass7Pq(this, this.A01, this.A02, 21));
    }

    public void Bt9(C29621ca r8, String str) {
        Pair A012 = C60482o6.A01(r8);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TwoFactorXmppMethods/sendSetTwoFactorAuth/onError; iq=");
        A10.append(str);
        C17900vP.A0Y(A012, ", error=", A10);
        this.A00.A00.CGP(new C146597Pw(this, A012, this.A01, this.A02, 14));
    }

    public void C7Z(C29621ca r8, String str) {
        C17900vP.A0f("TwoFactorXmppMethods/sendSetTwoFactorAuth/onSuccess; iq=", str, AnonymousClass000.A10());
        C30901eh r2 = (C30901eh) this.A00.A02.get();
        r2.A08.CGN(new AnonymousClass3CA(r2, this.A01, this.A02, 0, 3));
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
