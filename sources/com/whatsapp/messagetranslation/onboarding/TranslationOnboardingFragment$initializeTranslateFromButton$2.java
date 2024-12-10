package com.whatsapp.messagetranslation.onboarding;

import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment$initializeTranslateFromButton$2", f = "TranslationOnboardingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TranslationOnboardingFragment$initializeTranslateFromButton$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass206 $selectedMessage;
    public int label;
    public final /* synthetic */ TranslationOnboardingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslationOnboardingFragment$initializeTranslateFromButton$2(TranslationOnboardingFragment translationOnboardingFragment, AnonymousClass206 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = translationOnboardingFragment;
        this.$selectedMessage = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new TranslationOnboardingFragment$initializeTranslateFromButton$2(this.this$0, this.$selectedMessage, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0087, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            if (r0 != 0) goto L_0x008f
            X.C30691eM.A01(r8)
            com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment r0 = r7.this$0
            X.00H r0 = r0.A04
            if (r0 == 0) goto L_0x0088
            java.lang.Object r1 = r0.get()
            X.9jG r1 = (X.C189449jG) r1
            X.206 r0 = r7.$selectedMessage
            long r2 = r0.A0x
            X.1Cd r0 = r1.A00
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0081 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "SELECT message_row_id, source_lang, target_lang, status FROM message_translation_request WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0081 }
            X.C17890vO.A1J(r1, r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "GET_MESSAGE_TRANSLATION_REQUEST"
            android.database.Cursor r4 = r6.A0A(r4, r0, r1)     // Catch:{ all -> 0x0081 }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x007a }
            r3 = 0
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = "source_lang"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r2 = r4.getString(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r0 = "target_lang"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007a }
            r4.getString(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r0 = "status"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007a }
            r4.getInt(r0)     // Catch:{ all -> 0x007a }
            r4.close()     // Catch:{ all -> 0x0081 }
            r5.close()
            if (r2 == 0) goto L_0x0077
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0077
            com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment r1 = r7.this$0
            com.whatsapp.messagetranslation.onboarding.TranslationViewModel r0 = r1.A01
            if (r0 != 0) goto L_0x0072
            X.AnonymousClass3MW.A1H()
            throw r3
        L_0x006b:
            r4.close()     // Catch:{ all -> 0x0081 }
            r5.close()
            goto L_0x0077
        L_0x0072:
            r0.A01 = r2
            com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment.A00(r1)
        L_0x0077:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x007a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0081 }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x0088:
            java.lang.String r0 = "messageTranslationRequestStore"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x008f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment$initializeTranslateFromButton$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranslationOnboardingFragment$initializeTranslateFromButton$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
