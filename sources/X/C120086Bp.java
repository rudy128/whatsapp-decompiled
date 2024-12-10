package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.6Bp  reason: invalid class name and case insensitive filesystem */
public final class C120086Bp extends C195919u9 implements C22579BDz {
    public BBM A00;
    public final C219217x A01;
    public final AnonymousClass118 A02;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063 A[Catch:{ IllegalArgumentException -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089 A[Catch:{ IllegalArgumentException -> 0x009a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C195639tf r9, X.BBM r10, X.C19980A1q r11, java.util.Map r12) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            X.C18070vi.A0k(r9, r10)
            r8.A00 = r10
            java.lang.String r0 = "permission"
            java.lang.Object r4 = r12.get(r0)
            boolean r0 = r4 instanceof java.lang.String
            r3 = 0
            if (r0 == 0) goto L_0x0025
            java.lang.String r4 = (java.lang.String) r4
        L_0x0016:
            java.lang.String r2 = "no_valid_permission"
            if (r4 != 0) goto L_0x0027
            java.lang.String r1 = "permission is null"
            X.A1q r0 = new X.A1q
            r0.<init>(r3, r2, r1)
            r10.Btu(r0, r3)
            return
        L_0x0025:
            r4 = r3
            goto L_0x0016
        L_0x0027:
            java.lang.String r0 = "PHONE_STATE"
            boolean r0 = r4.equals(r0)     // Catch:{ IllegalArgumentException -> 0x009a }
            if (r0 == 0) goto L_0x0047
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ IllegalArgumentException -> 0x009a }
        L_0x0031:
            int r1 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x009a }
            r0 = 0
            if (r1 == r0) goto L_0x0052
            X.17x r1 = r8.A01     // Catch:{ IllegalArgumentException -> 0x009a }
            java.lang.String r0 = "android.permission.SEND_SMS"
            int r0 = r1.A02(r0)     // Catch:{ IllegalArgumentException -> 0x009a }
            if (r0 != 0) goto L_0x005d
            boolean r0 = r1.A0I()     // Catch:{ IllegalArgumentException -> 0x009a }
            goto L_0x0058
        L_0x0047:
            java.lang.String r0 = "SMS_AND_TELEPHONE"
            boolean r0 = r4.equals(r0)     // Catch:{ IllegalArgumentException -> 0x009a }
            if (r0 == 0) goto L_0x0095
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ IllegalArgumentException -> 0x009a }
            goto L_0x0031
        L_0x0052:
            X.17x r0 = r8.A01     // Catch:{ IllegalArgumentException -> 0x009a }
            boolean r0 = r0.A0I()     // Catch:{ IllegalArgumentException -> 0x009a }
        L_0x0058:
            if (r0 == 0) goto L_0x005d
            java.lang.Integer r1 = X.AnonymousClass00R.A00     // Catch:{ IllegalArgumentException -> 0x009a }
            goto L_0x005f
        L_0x005d:
            java.lang.Integer r1 = X.AnonymousClass00R.A01     // Catch:{ IllegalArgumentException -> 0x009a }
        L_0x005f:
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ IllegalArgumentException -> 0x009a }
            if (r1 != r0) goto L_0x0089
            X.118 r0 = r8.A02     // Catch:{ IllegalArgumentException -> 0x009a }
            android.content.Context r7 = r0.A00     // Catch:{ IllegalArgumentException -> 0x009a }
            java.lang.String r6 = r9.A04     // Catch:{ IllegalArgumentException -> 0x009a }
            android.content.Intent r5 = X.C17880vN.A0A()     // Catch:{ IllegalArgumentException -> 0x009a }
            java.lang.String r1 = r7.getPackageName()     // Catch:{ IllegalArgumentException -> 0x009a }
            java.lang.String r0 = "com.whatsapp.payments.phoenix.flowconfigurationservice.resource.permission.FcsRequestPermissionActivity"
            r5.setClassName(r1, r0)     // Catch:{ IllegalArgumentException -> 0x009a }
            java.lang.String r0 = "extra_fds_manager_id"
            r5.putExtra(r0, r6)     // Catch:{ IllegalArgumentException -> 0x009a }
            java.lang.String r0 = "extra_permission"
            r5.putExtra(r0, r4)     // Catch:{ IllegalArgumentException -> 0x009a }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r0)     // Catch:{ IllegalArgumentException -> 0x009a }
            r7.startActivity(r5)     // Catch:{ IllegalArgumentException -> 0x009a }
            return
        L_0x0089:
            java.lang.String r1 = "permission_result"
            java.lang.String r0 = "GRANTED"
            java.util.Map r0 = X.C108975cc.A0h(r1, r0)     // Catch:{ IllegalArgumentException -> 0x009a }
            r10.C7V(r0)     // Catch:{ IllegalArgumentException -> 0x009a }
            return
        L_0x0095:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r4)     // Catch:{ IllegalArgumentException -> 0x009a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x009a }
        L_0x009a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "request_permission/execute: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " is not a valid permission to request"
            X.C17890vO.A19(r1, r0)
            java.lang.String r1 = "permission string is not valid or supported"
            X.A1q r0 = new X.A1q
            r0.<init>(r3, r2, r1)
            r10.Btu(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120086Bp.A06(X.9tf, X.BBM, X.A1q, java.util.Map):void");
    }

    public void BLG(Map map) {
        if (map == null) {
            Log.e("request_permission/finish: result is null");
            this.A00 = null;
            return;
        }
        BBM bbm = this.A00;
        if (bbm != null) {
            if (C18070vi.A18(map.get("permission_result"), "null_permission")) {
                bbm.Btu(new C19980A1q((Integer) null, "no_valid_permission", "FcsRequestPermissionActivity: permission provided is null"), (Map) null);
            } else {
                bbm.C7V(map);
            }
            this.A00 = null;
            return;
        }
        Log.e("request_permission/finish: callback is null");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120086Bp(AnonymousClass118 r1, C219217x r2, C176198zw r3) {
        super(r3);
        C18070vi.A0o(r1, r2, r3);
        this.A02 = r1;
        this.A01 = r2;
    }

    public String A03() {
        return "request_permission";
    }
}
