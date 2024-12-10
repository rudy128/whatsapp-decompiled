package X;

import android.content.Context;
import android.content.pm.PackageManager;

public final class AR2 implements C72143Ku {
    public final Context A00;
    public final AnonymousClass00H A01 = C201811d.A00(32855);

    public void C0w(C171888sR r2) {
        C18070vi.A0d(r2, 0);
        this.A01.get();
        PackageManager packageManager = this.A00.getPackageManager();
        C18070vi.A0X(packageManager);
        Integer A002 = C137366vL.A00(packageManager);
        if (A002 != null) {
            r2.A14 = C17890vO.A0N(A002);
        }
    }

    public AR2(Context context) {
        this.A00 = context;
    }
}
