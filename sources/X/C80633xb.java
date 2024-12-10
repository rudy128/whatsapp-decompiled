package X;

import android.app.KeyguardManager;
import android.os.Build;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* renamed from: X.3xb  reason: invalid class name and case insensitive filesystem */
public final class C80633xb extends C91444fh {
    public C03320Hp A00;
    public AnonymousClass0Q0 A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass1FL A04;
    public final C80643xc A05;
    public final C18030ve A06;
    public final C18100vl A07 = C99154sM.A01(this, 8);
    public final AnonymousClass190 A08;
    public final AnonymousClass1KB A09;
    public final AnonymousClass11C A0A;
    public final C107325Zg A0B;

    public C80633xb(AnonymousClass1FL r7, AnonymousClass190 r8, AnonymousClass1KB r9, AnonymousClass11C r10, C107325Zg r11, C18030ve r12, int i, int i2) {
        C18070vi.A0s(r12, r9, r8, r10);
        this.A06 = r12;
        this.A09 = r9;
        this.A08 = r8;
        this.A0A = r10;
        this.A04 = r7;
        this.A03 = i;
        this.A02 = i2;
        this.A0B = r11;
        this.A05 = new C80643xc(r7, r8, r10, r11, i);
        r7.getLifecycle().A05(this);
    }

    private final boolean A00() {
        return AnonymousClass000.A1P(((AnonymousClass0PO) AnonymousClass3MX.A14(this.A07)).A03(255));
    }

    private final boolean A01() {
        String str;
        KeyguardManager A062 = this.A0A.A06();
        if (A062 == null || !A062.isDeviceSecure()) {
            str = "BiometricAuthPlugin/NoDeviceCredentials";
        } else if (this.A05.A05()) {
            return true;
        } else {
            str = "BiometricAuthPlugin/CannotAuthenticateWithDeviceCredentials";
        }
        Log.i(str);
        return false;
    }

    public void A04() {
        String str;
        AnonymousClass1FL r5 = this.A04;
        Executor A082 = C19740yt.A08(r5);
        C18070vi.A0X(A082);
        this.A01 = new AnonymousClass0Q0(new AnonymousClass3S4(this.A08, new C95694me(this, 3), "BiometricAuthPlugin"), r5, A082);
        AnonymousClass0IT r1 = new AnonymousClass0IT();
        r1.A03 = r5.getString(this.A03);
        int i = this.A02;
        if (i != 0) {
            str = r5.getString(i);
        } else {
            str = null;
        }
        r1.A02 = str;
        r1.A00 = 33023;
        r1.A04 = false;
        this.A00 = r1.A00();
    }

    public boolean A05() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (!C18020vd.A05(C18040vf.A02, this.A06, 482) || !A00() || !A01()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void A06() {
        AnonymousClass0Q0 r0;
        if (this.A01 == null || this.A00 == null) {
            throw AnonymousClass000.A0n("BiometricAuthPlugin/authenticate: No prompt created. Have you checked if you can authenticate?");
        }
        Log.i("BiometricAuthPlugin/authentication-attempt");
        C03320Hp r1 = this.A00;
        if (r1 != null && (r0 = this.A01) != null) {
            AnonymousClass0Q0.A04(r1, r0);
        }
    }

    public final void A07(int i) {
        if (Build.VERSION.SDK_INT != 29 && (i == 2 || i == 3)) {
            AnonymousClass0Q0 r0 = this.A01;
            if (r0 != null) {
                r0.A05();
                this.A09.A0K(new C98564rM(this, 22), 200);
                return;
            }
            throw C17880vN.A0g();
        } else if (i == 2) {
            this.A0B.Blt(4);
        } else {
            this.A0B.Blt(i);
        }
    }
}
