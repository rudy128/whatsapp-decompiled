package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.9to  reason: invalid class name and case insensitive filesystem */
public abstract class C195729to {
    public final Context A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass1KH A04;
    public final C33711jG A05;
    public final C31061ex A06;
    public final AnonymousClass1QS A07;
    public final A54 A08;
    public final C191949nS A09;

    public void A01() {
        Log.i("PAY: BrazilStepUpVerificationBase getProviderEncryptionKeyAsync");
        A54 a54 = this.A08;
        AZ2 A012 = a54.A01("VISA", "STEP-UP");
        if (A012 == null) {
            new C191619mt(this.A00, this.A01, this.A05, this.A06, a54, "STEP-UP").A00(new C20771AYa(this, 1), "VISA");
            return;
        }
        A02((A7B) null, A012);
    }

    public void A02(A7B a7b, AZ2 az2) {
        C190749lS r0;
        C190219kZ r02;
        if (this instanceof C175588yx) {
            C175588yx r2 = (C175588yx) this;
            if (a7b != null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("PAY: BrazilVerifyCardSendAuthCodeAction  onProviderKeyFetched auth code failure ");
                C17890vO.A19(A10, a7b.A07);
                r02 = r2.A02;
            } else {
                String A042 = r2.A01.A04(az2, r2.A03);
                if (TextUtils.isEmpty(A042)) {
                    Log.e("PAY: BrazilVerifyCardSendAuthCodeAction  onProviderKeyFetched auth code failure");
                    r02 = r2.A02;
                    a7b = A7B.A00();
                } else {
                    Log.i("PAY: BrazilVerifyCardSendAuthCodeAction onProviderKeyFetched success");
                    C175588yx.A00(r2, A042);
                    return;
                }
            }
            r02.A00(a7b);
            return;
        }
        C175598yy r3 = (C175598yy) this;
        if (a7b != null) {
            r0 = r3.A04;
        } else {
            String A043 = r3.A02.A04(az2, r3.A06);
            if (TextUtils.isEmpty(A043)) {
                Log.e("PAY: BrazilVerifyCardOTPSendAction encryptAndSendOtp/enc otp failure");
                r0 = r3.A04;
                a7b = A7B.A00();
            } else {
                Log.i("PAY: BrazilVerifyCardOTPSendAction encryptAndSendOtp");
                C175598yy.A00(r3, A043);
                return;
            }
        }
        r0.A00((AnonymousClass8pK) null, a7b);
    }

    public void A03(A7B a7b, String str) {
        if (this instanceof C175588yx) {
            throw AnonymousClass04E.createAndThrow();
        }
        C175598yy r3 = (C175598yy) this;
        if (a7b != null || str == null) {
            r3.A04.A00((AnonymousClass8pK) null, a7b);
            return;
        }
        r3.A09.A00(str);
        A54 a54 = r3.A08;
        AZ2 A012 = a54.A01("ELO", "ADD-CARD");
        if (A012 == null) {
            new C191619mt(r3.A00, r3.A01, r3.A05, r3.A06, a54, "ADD-CARD").A00(new C20771AYa(r3, 2), "FB");
            return;
        }
        C175598yy.A00(r3, r3.A02.A03((AZ0) A012.A00, r3.A06));
    }

    public C195729to(Context context, AnonymousClass1KB r2, AnonymousClass11S r3, AnonymousClass11P r4, AnonymousClass1KH r5, C33711jG r6, C31061ex r7, AnonymousClass1QS r8, A54 a54, C191949nS r10) {
        this.A03 = r4;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = r8;
        this.A09 = r10;
        this.A06 = r7;
        this.A05 = r6;
        this.A08 = a54;
    }
}
