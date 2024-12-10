package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.9mH  reason: invalid class name and case insensitive filesystem */
public class C191259mH {
    public final C189199ih A00;
    public final AnonymousClass9UV A01;
    public final C189829jv A02;
    public final AnonymousClass9UW A03;
    public final C183699Zg A04;

    public boolean A00(int i) {
        C185359cS A002 = this.A00.A00();
        if (A002 == null || !A002.A02 || A002.A00 < i) {
            return false;
        }
        return true;
    }

    public C191259mH(Context context, PackageManager packageManager) {
        this.A01 = new AnonymousClass9UV(packageManager);
        this.A03 = new AnonymousClass9UW(packageManager);
        this.A00 = new C189199ih(packageManager);
        this.A04 = new C183699Zg(context, packageManager);
        this.A02 = new C189829jv(packageManager);
    }
}
