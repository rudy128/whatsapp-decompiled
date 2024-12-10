package com.whatsapp.registration;

import X.AnonymousClass1OS;
import X.C22386B5p;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.RegistrationUpsellProtocolHelper$getRegistrationUpsell$1", f = "RegistrationUpsellProtocolHelper.kt", i = {0, 1, 1, 1}, l = {56, 58}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "data", "element$iv"}, s = {"L$0", "L$0", "L$1", "L$4"})
public final class RegistrationUpsellProtocolHelper$getRegistrationUpsell$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22386B5p $callback;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ RegistrationUpsellProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegistrationUpsellProtocolHelper$getRegistrationUpsell$1(C22386B5p b5p, RegistrationUpsellProtocolHelper registrationUpsellProtocolHelper, C30391dr r4) {
        super(2, r4);
        this.this$0 = registrationUpsellProtocolHelper;
        this.$callback = b5p;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        RegistrationUpsellProtocolHelper$getRegistrationUpsell$1 registrationUpsellProtocolHelper$getRegistrationUpsell$1 = new RegistrationUpsellProtocolHelper$getRegistrationUpsell$1(this.$callback, this.this$0, r5);
        registrationUpsellProtocolHelper$getRegistrationUpsell$1.L$0 = obj;
        return registrationUpsellProtocolHelper$getRegistrationUpsell$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066 A[Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089 A[Catch:{ 1Uc -> 0x008b, Exception -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092 A[Catch:{ 1Uc -> 0x00aa, Exception -> 0x00a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r13.label
            java.lang.String r1 = "RegistrationUpsellProtocolHelper/getRegistrationUpsell/onError : "
            r5 = 2
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x002f
            if (r0 == r4) goto L_0x002a
            if (r0 != r5) goto L_0x0025
            java.lang.Object r9 = r13.L$4
            java.lang.Object r7 = r13.L$3
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r4 = r13.L$2
            com.whatsapp.registration.RegistrationUpsellProtocolHelper r4 = (com.whatsapp.registration.RegistrationUpsellProtocolHelper) r4
            java.lang.Object r8 = r13.L$1
            X.1IX r8 = (X.AnonymousClass1IX) r8
            java.lang.Object r2 = r13.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
            X.C30691eM.A01(r14)     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            goto L_0x0083
        L_0x0025:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002a:
            java.lang.Object r2 = r13.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
            goto L_0x004b
        L_0x002f:
            X.C30691eM.A01(r14)
            java.lang.Object r2 = r13.L$0
            X.1OX r2 = (X.AnonymousClass1OX) r2
            com.whatsapp.registration.RegistrationUpsellProtocolHelper r0 = r13.this$0     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            X.00H r0 = r0.A00     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            java.lang.Object r0 = r0.get()     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            com.whatsapp.registration.upsell.RegistrationUpsellGraphQLHelper r0 = (com.whatsapp.registration.upsell.RegistrationUpsellGraphQLHelper) r0     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            r13.L$0 = r2     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            r13.label = r4     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            java.lang.Object r14 = r0.A01(r13)     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            if (r14 != r6) goto L_0x004e
            return r6
        L_0x004b:
            X.C30691eM.A01(r14)     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
        L_0x004e:
            X.1IX r14 = (X.AnonymousClass1IX) r14     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            java.lang.String r0 = "RegistrationUpsellProtocolHelper/getRegistrationUpsell/onData/screen: "
            X.C17900vP.A0Y(r14, r0, r4)     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            com.whatsapp.registration.RegistrationUpsellProtocolHelper r4 = r13.this$0     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            java.util.Iterator r7 = r14.iterator()     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            r8 = r14
        L_0x0060:
            boolean r0 = r7.hasNext()     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            if (r0 == 0) goto L_0x008d
            java.lang.Object r9 = r7.next()     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            r0 = r9
            com.whatsapp.infra.graphql.generated.registration.enums.GraphQLXWA2RegUpsell r0 = (com.whatsapp.infra.graphql.generated.registration.enums.GraphQLXWA2RegUpsell) r0     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            X.C18070vi.A0b(r0)     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            r13.L$0 = r2     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            r13.L$1 = r8     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            r13.L$2 = r4     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            r13.L$3 = r7     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            r13.L$4 = r9     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            r13.label = r5     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            java.lang.Object r14 = com.whatsapp.registration.RegistrationUpsellProtocolHelper.A00(r0, r4, r13)     // Catch:{ 1Uc -> 0x00a8, Exception -> 0x00a6 }
            if (r14 != r6) goto L_0x0083
            goto L_0x008a
        L_0x0083:
            boolean r0 = X.AnonymousClass000.A1Y(r14)     // Catch:{ 1Uc -> 0x008b, Exception -> 0x00c3 }
            if (r0 == 0) goto L_0x0060
            goto L_0x008e
        L_0x008a:
            return r6
        L_0x008b:
            r5 = move-exception
            goto L_0x00ab
        L_0x008d:
            r9 = r3
        L_0x008e:
            com.whatsapp.infra.graphql.generated.registration.enums.GraphQLXWA2RegUpsell r9 = (com.whatsapp.infra.graphql.generated.registration.enums.GraphQLXWA2RegUpsell) r9     // Catch:{ 1Uc -> 0x00aa, Exception -> 0x00a4 }
            if (r9 != 0) goto L_0x0094
            com.whatsapp.infra.graphql.generated.registration.enums.GraphQLXWA2RegUpsell r9 = com.whatsapp.infra.graphql.generated.registration.enums.GraphQLXWA2RegUpsell.NONE     // Catch:{ 1Uc -> 0x00aa, Exception -> 0x00a4 }
        L_0x0094:
            com.whatsapp.registration.RegistrationUpsellProtocolHelper r11 = r13.this$0     // Catch:{ 1Uc -> 0x00aa, Exception -> 0x00a4 }
            X.0wl r0 = r11.A02     // Catch:{ 1Uc -> 0x00aa, Exception -> 0x00a4 }
            X.B5p r10 = r13.$callback     // Catch:{ 1Uc -> 0x00aa, Exception -> 0x00a4 }
            r12 = 0
            com.whatsapp.registration.RegistrationUpsellProtocolHelper$getRegistrationUpsell$1$1 r7 = new com.whatsapp.registration.RegistrationUpsellProtocolHelper$getRegistrationUpsell$1$1     // Catch:{ 1Uc -> 0x00aa, Exception -> 0x00a4 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ 1Uc -> 0x00aa, Exception -> 0x00a4 }
            X.AnonymousClass3MW.A1X(r0, r7, r2)     // Catch:{ 1Uc -> 0x00aa, Exception -> 0x00a4 }
            goto L_0x00db
        L_0x00a4:
            r5 = move-exception
            goto L_0x00c4
        L_0x00a6:
            r5 = move-exception
            goto L_0x00c4
        L_0x00a8:
            r5 = move-exception
            goto L_0x00ab
        L_0x00aa:
            r5 = move-exception
        L_0x00ab:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            X.A6Z r0 = r5.error
            r1.append(r0)
            X.C17890vO.A0w(r1)
            com.whatsapp.registration.RegistrationUpsellProtocolHelper r0 = r13.this$0
            X.0wl r4 = r0.A02
            X.B5p r0 = r13.$callback
            com.whatsapp.registration.RegistrationUpsellProtocolHelper$getRegistrationUpsell$1$2 r1 = new com.whatsapp.registration.RegistrationUpsellProtocolHelper$getRegistrationUpsell$1$2
            r1.<init>(r5, r0, r3)
            goto L_0x00d6
        L_0x00c3:
            r5 = move-exception
        L_0x00c4:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0X(r5, r1, r0)
            com.whatsapp.registration.RegistrationUpsellProtocolHelper r0 = r13.this$0
            X.0wl r4 = r0.A02
            X.B5p r0 = r13.$callback
            com.whatsapp.registration.RegistrationUpsellProtocolHelper$getRegistrationUpsell$1$3 r1 = new com.whatsapp.registration.RegistrationUpsellProtocolHelper$getRegistrationUpsell$1$3
            r1.<init>(r5, r3)
        L_0x00d6:
            X.1OS r1 = (X.AnonymousClass1OS) r1
            X.AnonymousClass3MW.A1X(r4, r1, r2)
        L_0x00db:
            X.1Wu r6 = X.C27621Wu.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.RegistrationUpsellProtocolHelper$getRegistrationUpsell$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RegistrationUpsellProtocolHelper$getRegistrationUpsell$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
