package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import android.util.Pair;

/* renamed from: X.1oo  reason: invalid class name and case insensitive filesystem */
public class C37001oo {
    public final AnonymousClass118 A00;
    public final C37021oq A01;

    public C60012nF A01(String str) {
        Context context = this.A00.A00;
        int i = context.getPackageManager().getPackageInfo(str, 0).applicationInfo.uid;
        String A02 = C20070A5v.A02(C20070A5v.A00(context.getPackageManager(), str));
        boolean z = false;
        if (this.A01.A01.contains(Pair.create(str, A02))) {
            z = true;
        }
        return new C60012nF(str, A02, i, z);
    }

    public C37001oo(AnonymousClass118 r1, C37021oq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C60012nF A00() {
        int length;
        int callingUid = Binder.getCallingUid();
        Boolean bool = C17970vW.A03;
        if (callingUid != Process.myUid()) {
            Context context = this.A00.A00;
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
            if (packagesForUid == null || (length = packagesForUid.length) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("No packages associated with uid: ");
                sb.append(callingUid);
                throw new SecurityException(sb.toString());
            } else if (length == 1) {
                String str = packagesForUid[0];
                String A02 = C20070A5v.A02(C20070A5v.A00(context.getPackageManager(), str));
                boolean z = false;
                if (this.A01.A01.contains(Pair.create(str, A02))) {
                    z = true;
                }
                return new C60012nF(str, A02, callingUid, z);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Multiple packages per uid are not supported, uid: ");
                sb2.append(callingUid);
                throw new SecurityException(sb2.toString());
            }
        } else {
            throw new IllegalStateException("This method should be called on behalf of an IPC transaction from binder thread");
        }
    }

    public C60012nF A02(String str) {
        try {
            C60012nF A012 = A01(str);
            A012.A00();
            return A012;
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Package not found: ");
            sb.append(str);
            throw new SecurityException(sb.toString(), e);
        }
    }
}
