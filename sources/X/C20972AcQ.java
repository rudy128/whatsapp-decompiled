package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.AcQ  reason: case insensitive filesystem */
public final class C20972AcQ implements AnonymousClass1O5 {
    public final UserJid A00;
    public final AnonymousClass1OZ A01;
    public final C26981Ug A02 = new C26981Ug();

    public C20972AcQ(UserJid userJid, AnonymousClass1OZ r3) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A00 = userJid;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.AEN] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7Z(X.C29621ca r15, java.lang.String r16) {
        /*
            r14 = this;
            r4 = 1
            X.C18070vi.A0d(r15, r4)
            java.lang.String r0 = "merchant_info"
            X.1ca r3 = r15.A0K(r0)
            r13 = 0
            if (r3 == 0) goto L_0x00a7
            java.lang.String r0 = "entity_name"
            X.1ca r2 = r3.A0K(r0)
            java.lang.String r0 = "entity_type"
            X.1ca r1 = r3.A0K(r0)
            java.lang.String r0 = "entity_type_custom"
            X.1ca r0 = r3.A0K(r0)
            java.lang.String r11 = X.AnonymousClass8BU.A0o(r2)
            java.lang.String r12 = X.AnonymousClass8BU.A0o(r1)
            if (r0 == 0) goto L_0x002d
            java.lang.String r13 = r0.A0M()
        L_0x002d:
            java.lang.String r0 = "is_registered"
            java.lang.String r0 = X.C29621ca.A02(r3, r0)
            boolean r7 = java.lang.Boolean.parseBoolean(r0)
            java.lang.String r0 = "customer_care_details"
            X.1ca r2 = r3.A0K(r0)
            java.lang.String r0 = "grievance_officer_details"
            X.1ca r3 = r3.A0K(r0)
            r6 = 0
            if (r2 == 0) goto L_0x00b2
            java.lang.String r0 = "email"
            X.1ca r1 = r2.A0K(r0)
            java.lang.String r0 = "landline_number"
            X.1ca r5 = r2.A0K(r0)
            java.lang.String r0 = "mobile_number"
            X.1ca r2 = r2.A0K(r0)
            java.lang.String r1 = X.AnonymousClass8BU.A0o(r1)
            java.lang.String r0 = X.AnonymousClass8BU.A0o(r5)
            if (r2 == 0) goto L_0x0066
            java.lang.String r6 = r2.A0M()
        L_0x0066:
            X.ADq r8 = new X.ADq
            r8.<init>(r1, r0, r6)
        L_0x006b:
            r6 = 0
            if (r3 == 0) goto L_0x00b0
            java.lang.String r0 = "name"
            X.1ca r2 = r3.A0K(r0)
            java.lang.String r0 = "email"
            X.1ca r1 = r3.A0K(r0)
            java.lang.String r0 = "landline_number"
            X.1ca r5 = r3.A0K(r0)
            java.lang.String r0 = "mobile_number"
            X.1ca r3 = r3.A0K(r0)
            java.lang.String r2 = X.AnonymousClass8BU.A0o(r2)
            java.lang.String r1 = X.AnonymousClass8BU.A0o(r1)
            java.lang.String r0 = X.AnonymousClass8BU.A0o(r5)
            if (r3 == 0) goto L_0x0098
            java.lang.String r6 = r3.A0M()
        L_0x0098:
            X.AE7 r9 = new X.AE7
            r9.<init>(r2, r1, r0, r6)
        L_0x009d:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)
            X.AEN r7 = new X.AEN
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r13 = r7
        L_0x00a7:
            r3 = 0
            if (r13 == 0) goto L_0x00b4
            X.1Ug r0 = r14.A02
            X.C197779xF.A00(r3, r0, r13)
            return
        L_0x00b0:
            r9 = r6
            goto L_0x009d
        L_0x00b2:
            r8 = r6
            goto L_0x006b
        L_0x00b4:
            X.1Ug r2 = r14.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "Merchant Info is Null"
            android.util.Pair r0 = X.C108945cZ.A0N(r1, r0)
            X.C197779xF.A00(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20972AcQ.C7Z(X.1ca, java.lang.String):void");
    }

    public void BrD(String str) {
        StringBuilder A0K = C18070vi.A0K(str);
        A0K.append("GetBusinessComplianceDetailProtocol/delivery-error with iqId ");
        A0K.append(str);
        Log.w(C17890vO.A0c(A0K, '>'));
        this.A02.BrC(new AnonymousClass9L7(str));
    }

    public void Bt9(C29621ca r5, String str) {
        boolean A16 = C18070vi.A16(str, r5);
        Pair A012 = C60482o6.A01(r5);
        if (A012 != null) {
            C197779xF.A00(A012, this.A02, (Object) null);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GetBusinessComplianceDetailProtocol/response-error with iqId <");
            A10.append(str);
            C17900vP.A0Z(A012, "> and error ", A10);
            return;
        }
        C197779xF.A00(C108945cZ.A0N(Integer.valueOf(A16 ? 1 : 0), "error code is null"), this.A02, (Object) null);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
