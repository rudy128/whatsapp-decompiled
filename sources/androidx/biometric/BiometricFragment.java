package androidx.biometric;

import X.A52;
import X.A7q;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0Bs;
import X.AnonymousClass0DK;
import X.AnonymousClass0DO;
import X.AnonymousClass0HL;
import X.AnonymousClass0PO;
import X.AnonymousClass0PP;
import X.AnonymousClass0Q6;
import X.AnonymousClass0SN;
import X.AnonymousClass0YB;
import X.AnonymousClass0Z0;
import X.AnonymousClass0ZG;
import X.AnonymousClass0ZP;
import X.AnonymousClass0ZQ;
import X.AnonymousClass1FL;
import X.AnonymousClass1GP;
import X.C03320Hp;
import X.C03490Il;
import X.C03800Kr;
import X.C03820Kt;
import X.C03840Kv;
import X.C06580Yw;
import X.C06590Yx;
import X.C06600Yy;
import X.C06610Yz;
import X.C07040aG;
import X.C24071It;
import X.C34001jj;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public class BiometricFragment extends Fragment {
    public Handler A00 = new Handler(Looper.getMainLooper());
    public AnonymousClass0Bs A01;

    public static A52 A03(AnonymousClass0PP r3) {
        if (r3 != null) {
            Cipher cipher = r3.A01;
            if (cipher != null) {
                return new A52(cipher);
            }
            Signature signature = r3.A00;
            if (signature != null) {
                return new A52(signature);
            }
            Mac mac = r3.A02;
            if (mac != null) {
                return new A52(mac);
            }
            if (Build.VERSION.SDK_INT >= 30 && r3.A00() != null) {
                Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
            }
        }
        return null;
    }

    private void A0A(int i) {
        if (i == -1) {
            A0C(new AnonymousClass0HL((AnonymousClass0PP) null, 1));
        } else {
            A2C(10, A1H(2131899063));
        }
    }

    public void A2A(int i) {
        if (i == 3 || !this.A01.A1E()) {
            if (A0H()) {
                this.A01.A0o(i);
                if (i == 1) {
                    A0B(10, A04(A1n(), 10));
                }
            }
            this.A01.A0b().A01();
        }
    }

    public void A2F(C03320Hp r7) {
        AnonymousClass0PP r5 = null;
        AnonymousClass1FL A1B = A1B();
        if (A1B == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        AnonymousClass0Bs r3 = this.A01;
        r3.A0v(r7);
        int i = r7.A00;
        if (i == 0) {
            i = 255;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23 && i2 < 30 && i == 15) {
            r5 = C03820Kt.A01();
        }
        r3.A0u(r5);
        boolean A2H = A2H();
        AnonymousClass0Bs r1 = this.A01;
        String str = null;
        if (A2H) {
            str = A1H(2131898816);
        }
        r1.A0y(str);
        if (A2H() && new AnonymousClass0PO(new AnonymousClass0SN(A1B)).A03(255) != 0) {
            this.A01.A11(true);
            A07();
        } else if (this.A01.A1C()) {
            this.A00.postDelayed(new C06600Yy(this), 600);
        } else {
            A29();
        }
    }

    public static BiometricFragment A02() {
        return new BiometricFragment();
    }

    public static String A04(Context context, int i) {
        int i2;
        if (context == null) {
            return "";
        }
        if (i != 1) {
            if (i != 7) {
                switch (i) {
                    case 9:
                        break;
                    case 10:
                        i2 = 2131899045;
                        break;
                    case 11:
                        i2 = 2131899044;
                        break;
                    case 12:
                        i2 = 2131899042;
                        break;
                    default:
                        Log.e("BiometricUtils", AnonymousClass001.A1I("Unknown error code: ", AnonymousClass000.A10(), i));
                        i2 = 2131898872;
                        break;
                }
            }
            i2 = 2131899043;
        } else {
            i2 = 2131899041;
        }
        return context.getString(i2);
    }

    private void A06() {
        this.A01.A18(false);
        if (A1b()) {
            AnonymousClass1GP A1F = A1F();
            DialogFragment dialogFragment = (DialogFragment) A1F.A0Q("androidx.biometric.FingerprintDialogFragment");
            if (dialogFragment == null) {
                return;
            }
            if (dialogFragment.A1b()) {
                dialogFragment.A29();
                return;
            }
            C34001jj A0M = A1F.A0M();
            A0M.A07(dialogFragment);
            A0M.A02();
        }
    }

    private void A0B(int i, CharSequence charSequence) {
        AnonymousClass0Bs r2 = this.A01;
        if (r2.A1B()) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!r2.A19()) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            r2.A11(false);
            r2.A0n().execute(new AnonymousClass0ZP(this, charSequence, i));
        }
    }

    private void A0C(AnonymousClass0HL r3) {
        AnonymousClass0Bs r1 = this.A01;
        if (!r1.A19()) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            r1.A11(false);
            r1.A0n().execute(new AnonymousClass0ZG(this, r3));
        }
        A25();
    }

    private void A0D(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = A1H(2131898872);
        }
        this.A01.A0q(2);
        this.A01.A0x(charSequence);
    }

    private boolean A0G() {
        if (Build.VERSION.SDK_INT != 28 || AnonymousClass0DO.A00(A1n())) {
            return false;
        }
        return true;
    }

    private boolean A0H() {
        if (Build.VERSION.SDK_INT < 28 || A0F() || A0G()) {
            return true;
        }
        return false;
    }

    public static boolean A0I(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28 || str == null) {
            return false;
        }
        for (String startsWith : context.getResources().getStringArray(2130903062)) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public void A25() {
        this.A01.A18(false);
        A06();
        if (!this.A01.A1B() && A1b()) {
            C34001jj A0M = A1F().A0M();
            A0M.A07(this);
            A0M.A02();
        }
        Context A1n = A1n();
        if (A1n != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String equals : A1n.getResources().getStringArray(2130903051)) {
                    if (str.equals(equals)) {
                        AnonymousClass0Bs r1 = this.A01;
                        r1.A13(true);
                        this.A00.postDelayed(new C06610Yz(r1), 600);
                        return;
                    }
                }
            }
        }
    }

    public void A27() {
        CharSequence A0k = this.A01.A0k();
        if (A0k == null) {
            A0k = A1H(2131898872);
        }
        A2C(13, A0k);
        A2A(2);
    }

    public void A29() {
        if (this.A01.A1F()) {
            return;
        }
        if (A1n() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        AnonymousClass0Bs r1 = this.A01;
        r1.A18(true);
        r1.A11(true);
        if (A0H()) {
            A09();
        } else {
            A08();
        }
    }

    public void A2D(Context context, A7q a7q) {
        A52 A03 = A03(this.A01.A0a());
        AnonymousClass0Bs r2 = this.A01;
        try {
            a7q.A05(r2.A0Y().A01(), A03, r2.A0b().A00());
        } catch (NullPointerException e) {
            Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e);
            A2C(1, A04(context, 1));
        }
    }

    public boolean A2H() {
        if (Build.VERSION.SDK_INT > 28 || (this.A01.A0T() & 32768) == 0) {
            return false;
        }
        return true;
    }

    private int A00() {
        Context A1n = A1n();
        if (A1n == null || !A0I(A1n, Build.MODEL)) {
            return 2000;
        }
        return 0;
    }

    public static int A01(A7q a7q) {
        if (!a7q.A07()) {
            return 12;
        }
        if (!a7q.A06()) {
            return 11;
        }
        return 0;
    }

    private void A05() {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            AnonymousClass0Bs r0 = (AnonymousClass0Bs) new C24071It(A1B).A00(AnonymousClass0Bs.class);
            this.A01 = r0;
            r0.A0d().A0A(this, new AnonymousClass0YB(this, 0));
            this.A01.A0j().A0A(this, new AnonymousClass0YB(this, 1));
            this.A01.A0c().A0A(this, new AnonymousClass0YB(this, 2));
            this.A01.A0g().A0A(this, new AnonymousClass0YB(this, 3));
            this.A01.A0i().A0A(this, new AnonymousClass0YB(this, 4));
            this.A01.A0h().A0A(this, new AnonymousClass0YB(this, 5));
        }
    }

    private void A07() {
        String A1H;
        int i;
        AnonymousClass1FL A1B = A1B();
        if (A1B == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager A002 = C03840Kv.A00(A1B);
        if (A002 == null) {
            A1H = A1H(2131899062);
            i = 12;
        } else {
            AnonymousClass0Bs r0 = this.A01;
            CharSequence A0m = r0.A0m();
            CharSequence A0l = r0.A0l();
            if (A0l == null) {
                A0l = null;
            }
            Intent createConfirmDeviceCredentialIntent = A002.createConfirmDeviceCredentialIntent(A0m, A0l);
            if (createConfirmDeviceCredentialIntent == null) {
                A1H = A1H(2131899061);
                i = 14;
            } else {
                this.A01.A12(true);
                if (A0H()) {
                    A06();
                }
                createConfirmDeviceCredentialIntent.setFlags(134742016);
                startActivityForResult(createConfirmDeviceCredentialIntent, 1);
                return;
            }
        }
        A2C(i, A1H);
    }

    private void A08() {
        String str;
        BiometricPrompt.Builder A002 = AnonymousClass0Q6.A00(A14().getApplicationContext());
        AnonymousClass0Bs r0 = this.A01;
        CharSequence A0m = r0.A0m();
        CharSequence A0l = r0.A0l();
        if (A0m != null) {
            AnonymousClass0Q6.A06(A002, A0m);
        }
        if (A0l != null) {
            AnonymousClass0Q6.A05(A002, A0l);
        }
        CharSequence A0k = this.A01.A0k();
        if (!TextUtils.isEmpty(A0k)) {
            AnonymousClass0Q6.A02(this.A01.A0X(), A002, A0k, this.A01.A0n());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C03800Kr.A00(A002, this.A01.A1A());
        }
        int A0T = this.A01.A0T();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AnonymousClass0DK.A00(A002, A0T);
        } else if (i >= 29) {
            C03800Kr.A01(A002, AnonymousClass000.A1O(A0T & 32768));
        }
        BiometricPrompt A012 = AnonymousClass0Q6.A01(A002);
        Context A1n = A1n();
        BiometricPrompt.CryptoObject A003 = C03820Kt.A00(this.A01.A0a());
        C03490Il A0b = this.A01.A0b();
        CancellationSignal cancellationSignal = A0b.A00;
        if (cancellationSignal == null) {
            cancellationSignal = new CancellationSignal();
            A0b.A00 = cancellationSignal;
        }
        C07040aG r1 = new C07040aG();
        BiometricPrompt.AuthenticationCallback A004 = this.A01.A0Y().A00();
        if (A003 == null) {
            try {
                AnonymousClass0Q6.A04(A004, A012, cancellationSignal, r1);
            } catch (NullPointerException e) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
                if (A1n != null) {
                    str = A1n.getString(2131898872);
                } else {
                    str = "";
                }
                A2C(1, str);
            }
        } else {
            AnonymousClass0Q6.A03(A004, A003, A012, cancellationSignal, r1);
        }
    }

    private void A09() {
        Context applicationContext = A14().getApplicationContext();
        A7q A04 = A7q.A04(applicationContext);
        int A012 = A01(A04);
        if (A012 != 0) {
            A2C(A012, A04(applicationContext, A012));
        } else if (A1b()) {
            this.A01.A15(true);
            if (!A0I(applicationContext, Build.MODEL)) {
                this.A00.postDelayed(new C06590Yx(this), 500);
                FingerprintDialogFragment.A02().A2C(A1F(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.A01.A0o(0);
            A2D(applicationContext, A04);
        }
    }

    private boolean A0E() {
        AnonymousClass1FL A1B = A1B();
        if (A1B == null || !A1B.isChangingConfigurations()) {
            return false;
        }
        return true;
    }

    private boolean A0F() {
        AnonymousClass1FL A1B = A1B();
        if (A1B == null || this.A01.A0a() == null) {
            return false;
        }
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        if (str != null) {
            for (String equalsIgnoreCase : A1B.getResources().getStringArray(2130903049)) {
                if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
        }
        if (str2 == null) {
            return false;
        }
        for (String startsWith : A1B.getResources().getStringArray(2130903048)) {
            if (str2.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public void A1j() {
        super.A1j();
        if (Build.VERSION.SDK_INT < 29 && !this.A01.A1B() && !A0E()) {
            A2A(0);
        }
    }

    public void A1v() {
        super.A1v();
        if (Build.VERSION.SDK_INT == 29) {
            AnonymousClass0Bs r4 = this.A01;
            if ((r4.A0T() & 32768) != 0) {
                r4.A16(true);
                this.A00.postDelayed(new AnonymousClass0Z0(r4), 250);
            }
        }
    }

    public void A1w(int i, int i2, Intent intent) {
        super.A1w(i, i2, intent);
        if (i == 1) {
            this.A01.A12(false);
            A0A(i2);
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A05();
    }

    public void A26() {
        if (A0H()) {
            A0D(A1H(2131890415));
        }
        AnonymousClass0Bs r1 = this.A01;
        if (!r1.A19()) {
            Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
        } else {
            r1.A0n().execute(new C06580Yw(this));
        }
    }

    public void A28() {
        A07();
    }

    public void A2B(int i, CharSequence charSequence) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            default:
                i = 8;
                break;
        }
        Context A1n = A1n();
        if (Build.VERSION.SDK_INT < 29 && ((i == 7 || i == 9) && A1n != null && C03840Kv.A01(A1n) && (this.A01.A0T() & 32768) != 0)) {
            A07();
        } else if (A0H()) {
            if (charSequence == null) {
                charSequence = A04(A1n(), i);
            }
            AnonymousClass0Bs r0 = this.A01;
            if (i == 5) {
                int A0U = r0.A0U();
                if (A0U == 0 || A0U == 3) {
                    A0B(i, charSequence);
                }
                A25();
                return;
            }
            if (r0.A1D()) {
                A2C(i, charSequence);
            } else {
                A0D(charSequence);
                this.A00.postDelayed(new AnonymousClass0ZQ(this, charSequence, i), (long) A00());
            }
            this.A01.A15(true);
        } else {
            if (charSequence == null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(A1H(2131898872));
                charSequence = AnonymousClass001.A1I(" ", A10, i);
            }
            A2C(i, charSequence);
        }
    }

    public void A2C(int i, CharSequence charSequence) {
        A0B(i, charSequence);
        A25();
    }

    public void A2G(CharSequence charSequence) {
        if (A0H()) {
            A0D(charSequence);
        }
    }

    public void A2E(AnonymousClass0HL r1) {
        A0C(r1);
    }
}
