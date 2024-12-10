package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

/* renamed from: X.6mF  reason: invalid class name and case insensitive filesystem */
public final class C132126mF {
    public final C138846xn A00;
    public final C18030ve A01;

    public final Intent A00(Context context, String str) {
        C134286qL r0;
        C18070vi.A0d(context, 0);
        if (C18020vd.A05(C18040vf.A01, this.A01, 12129) && (r0 = (C134286qL) this.A00.A00.get(str)) != null) {
            return r0.A00;
        }
        PackageManager packageManager = context.getPackageManager();
        C18070vi.A0X(packageManager);
        return packageManager.getLaunchIntentForPackage(str);
    }

    public C132126mF(C138846xn r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
