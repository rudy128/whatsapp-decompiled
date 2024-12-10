package X;

import android.content.Context;
import android.content.pm.InstallSourceInfo;

/* renamed from: X.30T  reason: invalid class name */
public final class AnonymousClass30T implements C72143Ku {
    public final Context A00;
    public final C18030ve A01;

    public AnonymousClass30T(Context context, C18030ve r3) {
        C18070vi.A0d(r3, 2);
        this.A00 = context;
        this.A01 = r3;
    }

    public void C0w(C171888sR r4) {
        String str;
        C18070vi.A0d(r4, 0);
        if (AnonymousClass112.A09()) {
            if (C18020vd.A05(C18040vf.A02, this.A01, 10737)) {
                Context context = this.A00;
                InstallSourceInfo installSourceInfo = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
                C18070vi.A0X(installSourceInfo);
                int packageSource = installSourceInfo.getPackageSource();
                if (packageSource == 0) {
                    str = "unspecified";
                } else if (packageSource == 1) {
                    str = "other";
                } else if (packageSource == 2) {
                    str = "store";
                } else if (packageSource == 3) {
                    str = "local_file";
                } else if (packageSource != 4) {
                    str = AnonymousClass001.A1I("unknown_", AnonymousClass000.A10(), packageSource);
                } else {
                    str = "downloaded_file";
                }
                r4.A1r = str;
            }
        }
    }
}
