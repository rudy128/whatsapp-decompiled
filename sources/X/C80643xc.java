package X;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* renamed from: X.3xc  reason: invalid class name and case insensitive filesystem */
public final class C80643xc extends C91444fh {
    public C03320Hp A00;
    public AnonymousClass0Q0 A01;
    public final int A02;
    public final AnonymousClass1FL A03;
    public final AnonymousClass11C A04;
    public final C18100vl A05 = C99154sM.A01(this, 9);
    public final C18100vl A06;

    private final C03320Hp A00() {
        AnonymousClass0IT r2 = new AnonymousClass0IT();
        r2.A03 = this.A03.getString(this.A02);
        r2.A00 = 32768;
        return r2.A00();
    }

    private final void A01() {
        AnonymousClass0Q0 r0;
        if (this.A01 == null || this.A00 == null) {
            throw AnonymousClass000.A0n("DeviceCredentialsAuthPlugin/authenticate: No prompt created. Have you checked if you can authenticate?");
        }
        Log.i("DeviceCredentialsAuthPlugin/authentication-attempt-API30AndAbove");
        C03320Hp r1 = this.A00;
        if (r1 != null && (r0 = this.A01) != null) {
            AnonymousClass0Q0.A04(r1, r0);
        }
    }

    private final boolean A02() {
        return AnonymousClass000.A1P(((AnonymousClass0PO) AnonymousClass3MX.A14(this.A05)).A03(32768));
    }

    private final boolean A03() {
        KeyguardManager A062 = this.A04.A06();
        if (A062 == null || !A062.isDeviceSecure()) {
            return false;
        }
        return true;
    }

    public void A04() {
        if (Build.VERSION.SDK_INT >= 30) {
            AnonymousClass1FL r3 = this.A03;
            Executor A08 = C19740yt.A08(r3);
            C18070vi.A0X(A08);
            this.A01 = new AnonymousClass0Q0((C02120Cu) this.A06.getValue(), r3, A08);
            this.A00 = A00();
        }
    }

    public boolean A05() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || !A03()) {
            return false;
        }
        if (i >= 30) {
            return A02();
        }
        if (i == 29) {
            return this.A04.A0P("android.software.secure_lock_screen");
        }
        return true;
    }

    public void A06() {
        if (Build.VERSION.SDK_INT >= 30) {
            A01();
            return;
        }
        KeyguardManager A062 = this.A04.A06();
        if (A062 != null) {
            AnonymousClass1FL r2 = this.A03;
            Intent createConfirmDeviceCredentialIntent = A062.createConfirmDeviceCredentialIntent(C18070vi.A0F(r2, this.A02), "");
            Log.i("DeviceCredentialsAuthPlugin/authentication-attempt-API29AndBelow");
            C18070vi.A0b(createConfirmDeviceCredentialIntent);
            r2.startActivityForResult(createConfirmDeviceCredentialIntent, 12345);
            return;
        }
        throw AnonymousClass000.A0n("DeviceCredentialsAuthPlugin/authenticate: Can't get KeyguardManager. Have you checked if you can authenticate?");
    }

    public C80643xc(AnonymousClass1FL r3, AnonymousClass190 r4, AnonymousClass11C r5, C107325Zg r6, int i) {
        this.A04 = r5;
        this.A03 = r3;
        this.A02 = i;
        this.A06 = AnonymousClass1DF.A01(new C99134sK(r6, r4, 11));
        r3.getLifecycle().A05(this);
    }
}
