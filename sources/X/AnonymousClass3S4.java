package X;

import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.3S4  reason: invalid class name */
public final class AnonymousClass3S4 extends C02120Cu {
    public static final Set A03;
    public static final Set A04 = C18070vi.A0P(5);
    public final AnonymousClass190 A00;
    public final C107325Zg A01;
    public final String A02;

    static {
        Integer[] numArr = new Integer[5];
        AnonymousClass000.A1L(numArr, 4);
        AnonymousClass000.A1M(numArr, 11);
        AnonymousClass3Ma.A1S(numArr, 12);
        C17890vO.A1G(numArr, 14);
        C17880vN.A1T(numArr, 15, 4);
        A03 = C200410p.A0S(numArr);
    }

    public void A00() {
        Log.i("DeviceAuthenticationPlugin/AuthenticationCallback/failed");
    }

    public void A01() {
        Log.i("DeviceAuthenticationPlugin/AuthenticationCallback/succeeded");
        this.A01.Blt(-1);
    }

    public AnonymousClass3S4(AnonymousClass190 r1, C107325Zg r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public void A02(int i, CharSequence charSequence) {
        C107325Zg r1;
        int i2;
        C17900vP.A0j("DeviceAuthenticationPlugin/AuthenticationCallback/errorCode: ", AnonymousClass000.A10(), i);
        Set set = A03;
        Integer valueOf = Integer.valueOf(i);
        if (set.contains(valueOf)) {
            AnonymousClass190 r2 = this.A00;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("DeviceAuthenticationPlugin/FatalError/");
            r2.A0G(AnonymousClass000.A0y(this.A02, A10), String.valueOf(i), false);
            r1 = this.A01;
            i2 = 2;
        } else if (A04.contains(valueOf)) {
            AnonymousClass190 r22 = this.A00;
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("DeviceAuthenticationPlugin/TemporaryError/");
            r22.A0G(AnonymousClass000.A0y(this.A02, A102), String.valueOf(i), false);
            r1 = this.A01;
            i2 = 3;
        } else {
            this.A01.Blt(0);
            return;
        }
        r1.Blt(i2);
    }
}
