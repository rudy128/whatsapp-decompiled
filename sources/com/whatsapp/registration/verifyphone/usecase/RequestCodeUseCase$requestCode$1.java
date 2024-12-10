package com.whatsapp.registration.verifyphone.usecase;

import X.AnonymousClass1OS;
import X.AnonymousClass99F;
import X.AnonymousClass99H;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.verifyphone.usecase.RequestCodeUseCase$requestCode$1", f = "RequestCodeUseCase.kt", i = {2}, l = {53, 55, 67, 68}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
public final class RequestCodeUseCase$requestCode$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $authCodeContext;
    public final /* synthetic */ String $autoVerification;
    public final /* synthetic */ AnonymousClass99F $clientMetrics;
    public final /* synthetic */ int $codeVerificationMode;
    public final /* synthetic */ String $countryCode;
    public final /* synthetic */ int $flashCallCallLogPermissionGranted;
    public final /* synthetic */ int $flashCallEducationLinkClicked;
    public final /* synthetic */ int $flashCallManageCallPermissionGranted;
    public final /* synthetic */ String $method;
    public final /* synthetic */ String $phoneNumber;
    public final /* synthetic */ String $serverStartMessage;
    public final /* synthetic */ boolean $showProgress;
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass99H this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RequestCodeUseCase$requestCode$1(AnonymousClass99F r2, AnonymousClass99H r3, String str, String str2, String str3, String str4, String str5, String str6, C30391dr r10, int i, int i2, int i3, int i4, boolean z) {
        super(2, r10);
        this.this$0 = r3;
        this.$method = str;
        this.$showProgress = z;
        this.$codeVerificationMode = i;
        this.$serverStartMessage = str2;
        this.$countryCode = str3;
        this.$phoneNumber = str4;
        this.$autoVerification = str5;
        this.$authCodeContext = str6;
        this.$clientMetrics = r2;
        this.$flashCallEducationLinkClicked = i2;
        this.$flashCallManageCallPermissionGranted = i3;
        this.$flashCallCallLogPermissionGranted = i4;
    }

    public final C30391dr create(Object obj, C30391dr r17) {
        AnonymousClass99H r2 = this.this$0;
        String str = this.$method;
        boolean z = this.$showProgress;
        int i = this.$codeVerificationMode;
        return new RequestCodeUseCase$requestCode$1(this.$clientMetrics, r2, str, this.$serverStartMessage, this.$countryCode, this.$phoneNumber, this.$autoVerification, this.$authCodeContext, r17, i, this.$flashCallEducationLinkClicked, this.$flashCallManageCallPermissionGranted, this.$flashCallCallLogPermissionGranted, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r6 = r17
            X.1g4 r1 = X.C31751g4.COROUTINE_SUSPENDED
            r11 = r16
            int r4 = r11.label
            r3 = 4
            r0 = 3
            r2 = 2
            r7 = 1
            if (r4 == 0) goto L_0x001c
            if (r4 == r7) goto L_0x0033
            if (r4 == r2) goto L_0x0059
            if (r4 == r0) goto L_0x006c
            if (r4 != r3) goto L_0x008b
            X.C30691eM.A01(r6)
        L_0x0019:
            X.1Wu r1 = X.C27621Wu.A00
            return r1
        L_0x001c:
            X.C30691eM.A01(r6)
            X.99H r6 = r11.this$0
            java.lang.String r5 = r11.$method
            boolean r4 = r11.$showProgress
            X.99Z r3 = new X.99Z
            r3.<init>(r5, r4)
            r11.label = r7
            java.lang.Object r3 = r6.A02(r3, r11)
            if (r3 != r1) goto L_0x0036
            return r1
        L_0x0033:
            X.C30691eM.A01(r6)
        L_0x0036:
            X.99H r3 = r11.this$0
            X.9p1 r3 = r3.A00
            int r12 = r11.$codeVerificationMode
            java.lang.String r5 = r11.$method
            java.lang.String r6 = r11.$serverStartMessage
            java.lang.String r7 = r11.$countryCode
            java.lang.String r8 = r11.$phoneNumber
            java.lang.String r9 = r11.$autoVerification
            java.lang.String r10 = r11.$authCodeContext
            X.99F r4 = r11.$clientMetrics
            int r13 = r11.$flashCallEducationLinkClicked
            int r14 = r11.$flashCallManageCallPermissionGranted
            int r15 = r11.$flashCallCallLogPermissionGranted
            r11.label = r2
            java.lang.Object r6 = r3.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r6 != r1) goto L_0x005c
            return r1
        L_0x0059:
            X.C30691eM.A01(r6)
        L_0x005c:
            r5 = r6
            X.ADN r5 = (X.ADN) r5
            r2 = 2000(0x7d0, double:9.88E-321)
            r11.L$0 = r5
            r11.label = r0
            java.lang.Object r0 = X.C62882s9.A00(r11, r2)
            if (r0 != r1) goto L_0x0073
            return r1
        L_0x006c:
            java.lang.Object r5 = r11.L$0
            X.ADN r5 = (X.ADN) r5
            X.C30691eM.A01(r6)
        L_0x0073:
            X.99H r4 = r11.this$0
            java.lang.String r3 = r11.$method
            boolean r0 = r11.$showProgress
            X.99a r2 = new X.99a
            r2.<init>(r5, r3, r0)
            r0 = 0
            r11.L$0 = r0
            r0 = 4
            r11.label = r0
            java.lang.Object r0 = r4.A02(r2, r11)
            if (r0 != r1) goto L_0x0019
            return r1
        L_0x008b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.usecase.RequestCodeUseCase$requestCode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RequestCodeUseCase$requestCode$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
