package X;

import android.app.ActivityManager;
import android.content.pm.ConfigurationInfo;

/* renamed from: X.DQk  reason: case insensitive filesystem */
public final class C27039DQk implements C28536E6k {
    public final AnonymousClass11C A00;

    public C27039DQk(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public C23421Fz CPq(C25274CcM ccM, C25243Cbe cbe) {
        ConfigurationInfo deviceConfigurationInfo;
        Integer valueOf;
        ActivityManager A04 = this.A00.A04();
        if (A04 == null || (deviceConfigurationInfo = A04.getDeviceConfigurationInfo()) == null || (valueOf = Integer.valueOf(deviceConfigurationInfo.reqGlEsVersion)) == null || valueOf.intValue() > 196608) {
            return C99494su.A00;
        }
        return new C147197Se(AnonymousClass1D6.A01(C24305Bz2.EDITOR_SCREEN_PREVIEW_INITIAL_CHECK_FAILED, new C25179CaV("gles_not_supported", C24236Bxq.A04.A00())), 5);
    }
}
