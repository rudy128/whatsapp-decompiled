package com.whatsapp.registration.audioguidance;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel$logAction$1", f = "RegistrationAudioGuidanceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RegistrationAudioGuidanceViewModel$logAction$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $action;
    public int label;
    public final /* synthetic */ RegistrationAudioGuidanceViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegistrationAudioGuidanceViewModel$logAction$1(RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel, String str, C30391dr r4) {
        super(2, r4);
        this.$action = str;
        this.this$0 = registrationAudioGuidanceViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new RegistrationAudioGuidanceViewModel$logAction$1(this.this$0, this.$action, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        if (r2.equals("language_selector") != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a1, code lost:
        if (r2.equals(r0) != false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            if (r0 != 0) goto L_0x00c7
            X.C30691eM.A01(r7)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = r6.$action
            r2.append(r0)
            r3 = 124(0x7c, float:1.74E-43)
            r2.append(r3)
            com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel r0 = r6.this$0
            java.lang.String r0 = r0.A03
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "audioFileId"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0022:
            r2.append(r0)
            r2.append(r3)
            java.util.Locale r0 = java.util.Locale.getDefault()
            r2.append(r0)
            r2.append(r3)
            com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel r0 = r6.this$0
            X.4Mq r0 = r0.A0D
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r0)
            java.lang.String r0 = "reg_audio_guidance_feature_id"
            int r0 = X.C17890vO.A00(r1, r0)
            r2.append(r0)
            r2.append(r3)
            com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel r5 = r6.this$0
            java.lang.Integer r0 = r5.A02
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x00b7;
                default: goto L_0x0053;
            }
        L_0x0053:
            java.lang.String r0 = "manual_stop"
        L_0x0055:
            r2.append(r0)
            r2.append(r3)
            int r0 = r5.A00
            java.lang.String r3 = X.C17880vN.A0t(r2, r0)
            java.lang.String r2 = r5.A04
            java.lang.String r4 = "Required value was null."
            if (r2 == 0) goto L_0x00a3
            int r1 = r2.hashCode()
            r0 = -1202598970(0xffffffffb851cbc6, float:-5.0019262E-5)
            if (r1 == r0) goto L_0x009b
            r0 = -642716016(0xffffffffd9b0ee90, float:-6.2252373E15)
            if (r1 == r0) goto L_0x0098
            r0 = 2114770150(0x7e0cd4e6, float:4.679934E37)
            if (r1 != r0) goto L_0x00a3
            java.lang.String r0 = "language_selector"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00a3
        L_0x0082:
            X.00H r0 = r5.A0G
            java.lang.Object r2 = r0.get()
            X.A29 r2 = (X.A29) r2
            com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel r0 = r6.this$0
            java.lang.String r1 = r0.A04
            if (r1 == 0) goto L_0x00bd
            java.lang.String r0 = r6.$action
            r2.A03(r1, r0, r3)
        L_0x0095:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0098:
            java.lang.String r0 = "enter_number"
            goto L_0x009d
        L_0x009b:
            java.lang.String r0 = "eula_screen"
        L_0x009d:
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0082
        L_0x00a3:
            X.00H r0 = r5.A0E
            java.lang.Object r2 = r0.get()
            X.A8V r2 = (X.A8V) r2
            com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel r0 = r6.this$0
            java.lang.String r1 = r0.A04
            if (r1 == 0) goto L_0x00c2
            java.lang.String r0 = r6.$action
            r2.A0J(r1, r3, r0)
            goto L_0x0095
        L_0x00b7:
            java.lang.String r0 = "manual_play"
            goto L_0x0055
        L_0x00ba:
            java.lang.String r0 = "auto_play"
            goto L_0x0055
        L_0x00bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r4)
            throw r0
        L_0x00c2:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r4)
            throw r0
        L_0x00c7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel$logAction$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RegistrationAudioGuidanceViewModel$logAction$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
