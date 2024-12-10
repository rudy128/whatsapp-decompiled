package com.whatsapp.registration.task;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass99F;
import X.C192809p1;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.task.RequestCodeRepository$requestCode$2", f = "RequestCodeRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RequestCodeRepository$requestCode$2 extends C30431dv implements AnonymousClass1OS {
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
    public int label;
    public final /* synthetic */ C192809p1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RequestCodeRepository$requestCode$2(AnonymousClass99F r2, C192809p1 r3, String str, String str2, String str3, String str4, String str5, String str6, C30391dr r10, int i, int i2, int i3, int i4) {
        super(2, r10);
        this.this$0 = r3;
        this.$codeVerificationMode = i;
        this.$method = str;
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

    public final C30391dr create(Object obj, C30391dr r16) {
        C192809p1 r2 = this.this$0;
        int i = this.$codeVerificationMode;
        return new RequestCodeRepository$requestCode$2(this.$clientMetrics, r2, this.$method, this.$serverStartMessage, this.$countryCode, this.$phoneNumber, this.$autoVerification, this.$authCodeContext, r16, i, this.$flashCallEducationLinkClicked, this.$flashCallManageCallPermissionGranted, this.$flashCallCallLogPermissionGranted);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C192809p1 r0 = this.this$0;
            int i = this.$codeVerificationMode;
            return r0.A00(this.$clientMetrics, this.$method, this.$serverStartMessage, this.$countryCode, this.$phoneNumber, this.$autoVerification, this.$authCodeContext, i, this.$flashCallEducationLinkClicked, this.$flashCallManageCallPermissionGranted, this.$flashCallCallLogPermissionGranted);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RequestCodeRepository$requestCode$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
