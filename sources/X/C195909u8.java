package X;

import android.app.KeyguardManager;
import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.9u8  reason: invalid class name and case insensitive filesystem */
public final class C195909u8 {
    public final Context A00;
    public final AnonymousClass11C A01;

    public C195909u8(Context context, AnonymousClass11C r3) {
        C18070vi.A0d(r3, 2);
        this.A00 = context;
        this.A01 = r3;
    }

    public final long A00() {
        long A002 = C24211Jh.A00(this.A00, "com.google.android.gms");
        C17900vP.A0m("PasskeyGooglePlayChecks / determineDeviceGMSVersionCode:  ", AnonymousClass000.A10(), A002);
        return A002;
    }

    public final boolean A01() {
        return AnonymousClass000.A1W(this.A00.getSystemService("credential"));
    }

    public final boolean A03() {
        C23203Bcx bcx = new C23203Bcx(C41371wF.A00(this.A00));
        C17900vP.A0Y(bcx, "PasskeyGooglePlayChecks / googlePlayServicesStatus : ", AnonymousClass000.A10());
        boolean A1P = AnonymousClass000.A1P(bcx.A01);
        C17900vP.A0n("PasskeyGooglePlayChecks / isGooglePlayServicesEnabled : ", AnonymousClass000.A10(), A1P);
        return A1P;
    }

    public final boolean A02() {
        String str;
        boolean z = false;
        if (AnonymousClass112.A01()) {
            KeyguardManager A06 = this.A01.A06();
            if (A06 != null) {
                z = A06.isDeviceSecure();
            } else {
                str = "PasskeyGooglePlayChecks / isDeviceSecured:  no keyguard service";
                Log.i(str);
            }
        } else {
            str = "PasskeyGooglePlayChecks / isDeviceSecured:  android too old";
            Log.i(str);
        }
        C17900vP.A0n("PasskeyGooglePlayChecks / isDeviceSecured:  ", AnonymousClass000.A10(), z);
        return z;
    }
}
