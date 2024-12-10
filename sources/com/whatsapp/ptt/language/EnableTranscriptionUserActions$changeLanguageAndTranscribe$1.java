package com.whatsapp.ptt.language;

import X.AnonymousClass1OS;
import X.AnonymousClass4V5;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.content.Context;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ptt.language.EnableTranscriptionUserActions$changeLanguageAndTranscribe$1", f = "EnableTranscriptionUserActions.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
public final class EnableTranscriptionUserActions$changeLanguageAndTranscribe$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ List $messageKeys;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass4V5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnableTranscriptionUserActions$changeLanguageAndTranscribe$1(Context context, AnonymousClass4V5 r3, List list, C30391dr r5) {
        super(2, r5);
        this.$messageKeys = list;
        this.this$0 = r3;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        List list = this.$messageKeys;
        EnableTranscriptionUserActions$changeLanguageAndTranscribe$1 enableTranscriptionUserActions$changeLanguageAndTranscribe$1 = new EnableTranscriptionUserActions$changeLanguageAndTranscribe$1(this.$context, this.this$0, list, r6);
        enableTranscriptionUserActions$changeLanguageAndTranscribe$1.L$0 = obj;
        return enableTranscriptionUserActions$changeLanguageAndTranscribe$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r6 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r10.label
            r3 = 1
            if (r0 == 0) goto L_0x000f
            if (r0 != r3) goto L_0x009d
            X.C30691eM.A01(r11)
        L_0x000c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x000f:
            X.C30691eM.A01(r11)
            java.util.List r0 = r10.$messageKeys
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = "TranscriptionStatusView/changeLanguageAndTranscribe no messages provided"
        L_0x001c:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x000c
        L_0x0020:
            java.util.List r0 = r10.$messageKeys
            java.lang.Object r0 = X.C29431cG.A0c(r0)
            X.205 r0 = (X.AnonymousClass205) r0
            if (r0 == 0) goto L_0x009a
            X.1BI r6 = r0.A00
            if (r6 == 0) goto L_0x009a
            java.util.List r1 = r10.$messageKeys
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x007d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x007d
        L_0x003a:
            X.4V5 r0 = r10.this$0
            X.00H r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.1Nb r0 = (X.AnonymousClass1Nb) r0
            X.1yM r0 = r0.A0a(r6)
            X.Cho r0 = r0.A0B
            if (r0 != 0) goto L_0x004e
            X.BvS r0 = X.C24100BvS.A00
        L_0x004e:
            java.lang.String r7 = r0.A01
            if (r7 != 0) goto L_0x0066
            X.4V5 r0 = r10.this$0
            X.00H r0 = r0.A02
            X.4a3 r0 = X.AnonymousClass3MX.A0y(r0)
            X.1G4 r0 = r0.A05
            java.lang.Object r7 = r0.getValue()
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x0066
            java.lang.String r7 = ""
        L_0x0066:
            X.4V5 r0 = r10.this$0
            X.0wl r0 = r0.A03
            android.content.Context r5 = r10.$context
            java.util.List r8 = r10.$messageKeys
            r9 = 0
            com.whatsapp.ptt.language.EnableTranscriptionUserActions$changeLanguageAndTranscribe$1$2 r4 = new com.whatsapp.ptt.language.EnableTranscriptionUserActions$changeLanguageAndTranscribe$1$2
            r4.<init>(r5, r6, r7, r8, r9)
            r10.label = r3
            java.lang.Object r0 = X.C30451dy.A00(r10, r0, r4)
            if (r0 != r2) goto L_0x000c
            return r2
        L_0x007d:
            java.util.Iterator r1 = r1.iterator()
        L_0x0081:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003a
            java.lang.Object r0 = r1.next()
            X.205 r0 = (X.AnonymousClass205) r0
            X.1BI r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r0, r6)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = "TranscriptionStatusView/changeLanguageAndTranscribe messages are not from same chat"
            goto L_0x001c
        L_0x009a:
            java.lang.String r0 = "TranscriptionStatusView/changeLanguageAndTranscribe message missing chatJid"
            goto L_0x001c
        L_0x009d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ptt.language.EnableTranscriptionUserActions$changeLanguageAndTranscribe$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EnableTranscriptionUserActions$changeLanguageAndTranscribe$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
