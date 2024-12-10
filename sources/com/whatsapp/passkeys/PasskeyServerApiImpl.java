package com.whatsapp.passkeys;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass3MW;
import X.AnonymousClass9L3;
import X.AnonymousClass9L4;
import X.AnonymousClass9L9;
import X.AnonymousClass9LR;
import X.AnonymousClass9MQ;
import X.AnonymousClass9MT;
import X.C173538vF;
import X.C173548vG;
import X.C173558vH;
import X.C175338yY;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import X.C18600wl;
import X.C22821Di;
import X.C29621ca;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

public final class PasskeyServerApiImpl {
    public final AnonymousClass00H A00;
    public final C18600wl A01;

    private final AnonymousClass9MT A00(AnonymousClass9MQ r5, C22821Di r6) {
        Object obj;
        Object obj2;
        if (r5 instanceof C173548vG) {
            C29621ca r1 = ((C173548vG) r5).A00;
            String A02 = C29621ca.A02(r1, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            if (!C18070vi.A18(A02, "result")) {
                C17900vP.A0e("PasskeyServer/parseResponse/success response has bad type attribute: ", A02, AnonymousClass000.A10());
                obj = new AnonymousClass9L4(AnonymousClass001.A1H("bad type attribute: ", A02, AnonymousClass000.A10()));
            } else {
                obj2 = r6.invoke(r1);
                return (AnonymousClass9MT) obj2;
            }
        } else if (r5 instanceof C173538vF) {
            C29621ca A0K = ((C173538vF) r5).A00.A0K("error");
            if (A0K != null) {
                int A0A = A0K.A0A("code", -1);
                String A0Q = A0K.A0Q("text", "unknown");
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("PasskeyServer/passkeyExists/response/error: ");
                A10.append(A0A);
                A10.append(' ');
                C17890vO.A19(A10, A0Q);
                obj = new AnonymousClass9L9((long) A0A, A0Q);
            } else {
                Log.e("PasskeyServer/passkeyExists/response/error: malformed error response, no error node");
                obj = new AnonymousClass9L3();
            }
        } else if (r5 instanceof C173558vH) {
            Log.e("PasskeyServer/parseResponse/deliveryFailure");
            obj = AnonymousClass9LR.A00;
        } else {
            throw AnonymousClass3MW.A14();
        }
        obj2 = new C175338yY(obj);
        return (AnonymousClass9MT) obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.whatsapp.passkeys.PasskeyServerApiImpl r10, java.lang.String r11, X.C30391dr r12, X.C22821Di r13, int r14, long r15) {
        /*
            boolean r0 = r12 instanceof X.C21686AoF
            if (r0 == 0) goto L_0x0066
            r9 = r12
            X.AoF r9 = (X.C21686AoF) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0066
            int r2 = r2 - r1
            r9.label = r2
        L_0x0012:
            java.lang.Object r1 = r9.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r4 = 1
            if (r0 == 0) goto L_0x0021
            if (r0 != r4) goto L_0x006c
            X.C30691eM.A01(r1)
        L_0x0020:
            return r1
        L_0x0021:
            X.C30691eM.A01(r1)
            X.00H r6 = r10.A00
            java.lang.String r8 = X.C17890vO.A0T(r6)
            X.1cX r5 = X.C108955ca.A0Y()
            java.lang.String r0 = "id"
            X.C29591cX.A01(r5, r0, r8)
            java.lang.String r0 = "type"
            X.C29591cX.A01(r5, r0, r11)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "passkey"
            X.C29591cX.A01(r5, r1, r0)
            java.lang.String r0 = "smax_id"
            r1 = r15
            X.C108965cb.A1I(r5, r0, r1)
            X.C108995ce.A1E(r5)
            r13.invoke(r5)
            X.1ca r7 = r5.A03()
            java.lang.Object r6 = X.C18070vi.A0E(r6)
            X.1OZ r6 = (X.AnonymousClass1OZ) r6
            r9.L$0 = r8
            r10 = r14
            r9.I$0 = r14
            r9.label = r4
            r11 = 32000(0x7d00, double:1.581E-319)
            r13 = 0
            java.lang.Object r1 = r6.A0A(r7, r8, r9, r10, r11, r13)
            if (r1 != r3) goto L_0x0020
            return r3
        L_0x0066:
            X.AoF r9 = new X.AoF
            r9.<init>(r10, r12)
            goto L_0x0012
        L_0x006c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.passkeys.PasskeyServerApiImpl.A01(com.whatsapp.passkeys.PasskeyServerApiImpl, java.lang.String, X.1dr, X.1Di, int, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(java.lang.String r12, X.C30391dr r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C21659Ano
            r4 = r11
            if (r0 == 0) goto L_0x0055
            r6 = r13
            X.Ano r6 = (X.C21659Ano) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0055
            int r2 = r2 - r1
            r6.label = r2
        L_0x0013:
            java.lang.Object r3 = r6.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r1) goto L_0x005b
            java.lang.Object r4 = r6.L$0
            com.whatsapp.passkeys.PasskeyServerApiImpl r4 = (com.whatsapp.passkeys.PasskeyServerApiImpl) r4
            X.C30691eM.A01(r3)
        L_0x0025:
            X.9MQ r3 = (X.AnonymousClass9MQ) r3
            X.B3C r0 = X.B3C.A00
            X.9MT r2 = r4.A00(r3, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PasskeyServer/finishRegister: "
            X.C17900vP.A0Y(r2, r0, r1)
            return r2
        L_0x0037:
            X.C30691eM.A01(r3)
            java.lang.String r0 = "PasskeyServer/finishRegister/sending request"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.Azh r7 = new X.Azh
            r7.<init>(r12)
            r6.L$0 = r11
            r6.label = r1
            r9 = 126(0x7e, double:6.23E-322)
            r8 = 418(0x1a2, float:5.86E-43)
            java.lang.String r5 = "set"
            java.lang.Object r3 = A01(r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0025
            return r2
        L_0x0055:
            X.Ano r6 = new X.Ano
            r6.<init>(r11, r13)
            goto L_0x0013
        L_0x005b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.passkeys.PasskeyServerApiImpl.A02(java.lang.String, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A03(X.C30391dr r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C21660Anp
            r4 = r11
            if (r0 == 0) goto L_0x0052
            r6 = r12
            X.Anp r6 = (X.C21660Anp) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0052
            int r2 = r2 - r1
            r6.label = r2
        L_0x0013:
            java.lang.Object r3 = r6.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r1) goto L_0x0058
            java.lang.Object r4 = r6.L$0
            com.whatsapp.passkeys.PasskeyServerApiImpl r4 = (com.whatsapp.passkeys.PasskeyServerApiImpl) r4
            X.C30691eM.A01(r3)
        L_0x0025:
            X.9MQ r3 = (X.AnonymousClass9MQ) r3
            X.B3F r0 = X.B3F.A00
            X.9MT r2 = r4.A00(r3, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PasskeyServer/passkeyDelete: "
            X.C17900vP.A0Y(r2, r0, r1)
            return r2
        L_0x0037:
            X.C30691eM.A01(r3)
            java.lang.String r0 = "PasskeyServer/passkeyDelete/sending request"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.B3E r7 = X.B3E.A00
            r6.L$0 = r11
            r6.label = r1
            r9 = 129(0x81, double:6.37E-322)
            r8 = 420(0x1a4, float:5.89E-43)
            java.lang.String r5 = "set"
            java.lang.Object r3 = A01(r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0025
            return r2
        L_0x0052:
            X.Anp r6 = new X.Anp
            r6.<init>(r11, r12)
            goto L_0x0013
        L_0x0058:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.passkeys.PasskeyServerApiImpl.A03(X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(X.C30391dr r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C21661Anq
            r4 = r11
            if (r0 == 0) goto L_0x004e
            r6 = r12
            X.Anq r6 = (X.C21661Anq) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r6.label = r2
        L_0x0013:
            java.lang.Object r3 = r6.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r1) goto L_0x0054
            java.lang.Object r4 = r6.L$0
            com.whatsapp.passkeys.PasskeyServerApiImpl r4 = (com.whatsapp.passkeys.PasskeyServerApiImpl) r4
            X.C30691eM.A01(r3)
        L_0x0025:
            X.9MQ r3 = (X.AnonymousClass9MQ) r3
            X.B3D r0 = X.B3D.A00
            X.9MT r1 = r4.A00(r3, r0)
            java.lang.String r0 = "PasskeyServer/startRegister result"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r1
        L_0x0033:
            X.C30691eM.A01(r3)
            java.lang.String r0 = "PasskeyServer/startRegister/sending request"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.B3G r7 = X.B3G.A00
            r6.L$0 = r11
            r6.label = r1
            r9 = 125(0x7d, double:6.2E-322)
            r8 = 412(0x19c, float:5.77E-43)
            java.lang.String r5 = "get"
            java.lang.Object r3 = A01(r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0025
            return r2
        L_0x004e:
            X.Anq r6 = new X.Anq
            r6.<init>(r11, r12)
            goto L_0x0013
        L_0x0054:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.passkeys.PasskeyServerApiImpl.A04(X.1dr):java.lang.Object");
    }

    public PasskeyServerApiImpl(AnonymousClass00H r1, C18600wl r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
