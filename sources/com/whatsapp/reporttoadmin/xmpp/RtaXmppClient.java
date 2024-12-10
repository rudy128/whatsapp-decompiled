package com.whatsapp.reporttoadmin.xmpp;

import X.AnonymousClass00H;
import X.AnonymousClass1EC;
import X.AnonymousClass1UI;
import X.AnonymousClass3MW;
import X.AnonymousClass4F4;
import X.AnonymousClass8BW;
import X.AnonymousClass9F7;
import X.AnonymousClass9MQ;
import X.B1A;
import X.C173538vF;
import X.C173548vG;
import X.C173558vH;
import X.C178709Ed;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C201811d;
import X.C20996Aco;
import X.C22393B5w;
import X.C22821Di;
import X.C29621ca;
import X.C823946i;

public final class RtaXmppClient {
    public final AnonymousClass00H A00 = C201811d.A00(65563);
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02 = C201811d.A00(65564);
    public final AnonymousClass00H A03;

    /* JADX WARNING: type inference failed for: r0v6, types: [X.4F4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.4F4, java.lang.Object] */
    public static final AnonymousClass4F4 A00(AnonymousClass9MQ r4, String str, C22821Di r6) {
        StringBuilder A0o;
        C18070vi.A0d(r4, 0);
        if (r4 instanceof C173548vG) {
            try {
                Object invoke = r6.invoke(((C173548vG) r4).A00);
                C17890vO.A1A(AnonymousClass8BW.A0o("Rta::", str), "/onSuccess");
                return new C823946i(invoke);
            } catch (AnonymousClass1UI unused) {
                C17890vO.A1A(AnonymousClass8BW.A0o("Rta::", str), "/malformedResponse");
                return new Object();
            }
        } else {
            if (r4 instanceof C173538vF) {
                C29621ca A0K = ((C173538vF) r4).A00.A0K("error");
                int i = -2;
                if (A0K != null) {
                    i = A0K.A0A("code", -2);
                }
                A0o = AnonymousClass8BW.A0o("Rta::", str);
                A0o.append("/onError: ");
                A0o.append(i);
            } else if (r4 instanceof C173558vH) {
                A0o = AnonymousClass8BW.A0o("Rta::", str);
                A0o.append("/onDeliveryFailure: Network Failure");
            } else {
                throw AnonymousClass3MW.A14();
            }
            C17890vO.A0w(A0o);
            return new Object();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass1EC r12, java.lang.String r13, X.C30391dr r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C21667Anw
            if (r0 == 0) goto L_0x0061
            r6 = r14
            X.Anw r6 = (X.C21667Anw) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0061
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r3 = r6.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r10 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r10) goto L_0x0067
            java.lang.Object r0 = r6.L$0
            X.9F7 r0 = (X.AnonymousClass9F7) r0
            X.C30691eM.A01(r3)
        L_0x0024:
            X.9MQ r3 = (X.AnonymousClass9MQ) r3
            X.B0N r1 = new X.B0N
            r1.<init>(r0)
            java.lang.String r0 = "reportMessageToAdmin"
            X.4F4 r0 = A00(r3, r0, r1)
            return r0
        L_0x0032:
            X.C30691eM.A01(r3)
            X.00H r1 = r11.A01
            java.lang.String r5 = X.C17890vO.A0T(r1)
            X.00H r0 = r11.A02
            r0.get()
            X.C18070vi.A0e(r12, r10, r13)
            X.9F7 r0 = new X.9F7
            r0.<init>((X.AnonymousClass1EC) r12, (java.lang.String) r5, (java.lang.String) r13)
            java.lang.Object r3 = X.C18070vi.A0E(r1)
            X.1OZ r3 = (X.AnonymousClass1OZ) r3
            java.lang.Object r4 = r0.A00
            X.1ca r4 = (X.C29621ca) r4
            r6.L$0 = r0
            r6.label = r10
            r7 = 385(0x181, float:5.4E-43)
            r8 = 32000(0x7d00, double:1.581E-319)
            java.lang.Object r3 = r3.A0A(r4, r5, r6, r7, r8, r10)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x0061:
            X.Anw r6 = new X.Anw
            r6.<init>(r11, r14)
            goto L_0x0012
        L_0x0067:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reporttoadmin.xmpp.RtaXmppClient.A01(X.1EC, java.lang.String, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass1EC r13, X.C30391dr r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C21666Anv
            if (r0 == 0) goto L_0x0063
            r7 = r14
            X.Anv r7 = (X.C21666Anv) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0063
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r4 = r7.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r11 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r11) goto L_0x0069
            java.lang.Object r2 = r7.L$0
            X.9F6 r2 = (X.AnonymousClass9F6) r2
            X.C30691eM.A01(r4)
        L_0x0024:
            X.9MQ r4 = (X.AnonymousClass9MQ) r4
            X.B0M r1 = new X.B0M
            r1.<init>(r2)
            java.lang.String r0 = "getReportedMessages"
            X.4F4 r0 = A00(r4, r0, r1)
            return r0
        L_0x0032:
            X.C30691eM.A01(r4)
            X.00H r1 = r12.A01
            java.lang.String r6 = X.C17890vO.A0T(r1)
            X.00H r0 = r12.A00
            r0.get()
            X.C18070vi.A0d(r13, r11)
            r0 = 27
            X.9F6 r2 = new X.9F6
            r2.<init>((X.AnonymousClass1EC) r13, (java.lang.String) r6, (int) r0)
            java.lang.Object r4 = X.C18070vi.A0E(r1)
            X.1OZ r4 = (X.AnonymousClass1OZ) r4
            java.lang.Object r5 = r2.A00
            X.1ca r5 = (X.C29621ca) r5
            r7.L$0 = r2
            r7.label = r11
            r8 = 385(0x181, float:5.4E-43)
            r9 = 32000(0x7d00, double:1.581E-319)
            java.lang.Object r4 = r4.A0A(r5, r6, r7, r8, r9, r11)
            if (r4 != r3) goto L_0x0024
            return r3
        L_0x0063:
            X.Anv r7 = new X.Anv
            r7.<init>(r12, r14)
            goto L_0x0012
        L_0x0069:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reporttoadmin.xmpp.RtaXmppClient.A02(X.1EC, X.1dr):java.lang.Object");
    }

    public final void A03(AnonymousClass1EC r18, C22393B5w b5w, boolean z) {
        AnonymousClass9F7 r5;
        AnonymousClass1EC r6 = r18;
        C22393B5w b5w2 = b5w;
        C18070vi.A0j(r6, b5w2);
        AnonymousClass00H r2 = this.A01;
        String A0T = C17890vO.A0T(r2);
        this.A03.get();
        boolean z2 = z;
        if (z) {
            r5 = new AnonymousClass9F7(r6, new C178709Ed(13), (C178709Ed) null, (C178709Ed) null, (C178709Ed) null, (C178709Ed) null, (C178709Ed) null, A0T);
        } else {
            r5 = new AnonymousClass9F7(r6, (C178709Ed) null, new C178709Ed(17), (C178709Ed) null, (C178709Ed) null, (C178709Ed) null, (C178709Ed) null, A0T);
        }
        C17880vN.A0U(r2).A0I(new C20996Aco(b5w2, new B1A(b5w2, z2), 19), (C29621ca) r5.A00, A0T, 384, 32000);
    }

    public RtaXmppClient(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0j(r2, r3);
        this.A01 = r2;
        this.A03 = r3;
    }
}
