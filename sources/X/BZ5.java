package X;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

public final class BZ5 extends C26126Cso {
    public static final C22993BYp A01;
    public static final C24599CAv A02;
    public static final C24924CPx A03;
    public final String A00;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.CAv] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.BYp] */
    static {
        ? obj = new Object();
        A02 = obj;
        ? obj2 = new Object();
        A01 = obj2;
        A03 = new C24924CPx(obj2, obj, "Auth.Api.Identity.SignIn.API");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BZ5(android.app.Activity r9, X.C26890DHx r10) {
        /*
            r8 = this;
            X.CPx r6 = A03
            X.Chd r7 = X.C25540Chd.A02
            r2 = r8
            r3 = r9
            r5 = r10
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 16
            byte[] r1 = new byte[r0]
            java.security.SecureRandom r0 = X.CF2.A00
            r0.nextBytes(r1)
            java.lang.String r0 = X.AnonymousClass8BT.A0x(r1)
            r8.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BZ5.<init>(android.app.Activity, X.DHx):void");
    }

    public final C23142Bbv A06(Intent intent) {
        if (intent != null) {
            Status status = (Status) SafeParcelableSerializer.A00(intent, Status.CREATOR, "status");
            if (status == null) {
                throw new ApiException(Status.A04);
            } else if (status.A00 <= 0) {
                C23142Bbv bbv = (C23142Bbv) SafeParcelableSerializer.A00(intent, C23142Bbv.CREATOR, "sign_in_credential");
                if (bbv != null) {
                    return bbv;
                }
                throw new ApiException(Status.A06);
            } else {
                throw new ApiException(status);
            }
        } else {
            throw new ApiException(Status.A06);
        }
    }

    public BZ5(Context context, C26890DHx dHx) {
        super(context, dHx, A03, C25540Chd.A02);
        byte[] bArr = new byte[16];
        CF2.A00.nextBytes(bArr);
        this.A00 = AnonymousClass8BT.A0x(bArr);
    }
}
