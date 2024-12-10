package com.whatsapp.status.playback.page;

import X.AnonymousClass1OS;
import X.AnonymousClass6Gp;
import X.AnonymousClass77U;
import X.C22811Dh;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.page.StatusPlaybackPageItemBase$loadFutureProofingContentIfAny$1$1", f = "StatusPlaybackPageItemBase.kt", i = {}, l = {305}, m = "invokeSuspend", n = {}, s = {})
public final class StatusPlaybackPageItemBase$loadFutureProofingContentIfAny$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass77U $embeddedMusic;
    public final /* synthetic */ C22811Dh $isSongCountryBlocked;
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass6Gp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusPlaybackPageItemBase$loadFutureProofingContentIfAny$1$1(AnonymousClass77U r2, AnonymousClass6Gp r3, C30391dr r4, C22811Dh r5) {
        super(2, r4);
        this.$isSongCountryBlocked = r5;
        this.this$0 = r3;
        this.$embeddedMusic = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        C22811Dh r3 = this.$isSongCountryBlocked;
        return new StatusPlaybackPageItemBase$loadFutureProofingContentIfAny$1$1(this.$embeddedMusic, this.this$0, r6, r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (X.AnonymousClass000.A1Y(r7) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x001b
            if (r0 != r4) goto L_0x0049
            java.lang.Object r3 = r6.L$0
            X.1Dh r3 = (X.C22811Dh) r3
            X.C30691eM.A01(r7)
        L_0x0010:
            boolean r0 = X.AnonymousClass000.A1Y(r7)
            if (r0 == 0) goto L_0x0047
        L_0x0016:
            r3.element = r4
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x001b:
            X.C30691eM.A01(r7)
            X.1Dh r3 = r6.$isSongCountryBlocked
            X.6Gp r0 = r6.this$0
            X.1Lc r0 = r0.A0M
            X.0ve r2 = r0.A01
            r1 = 10970(0x2ada, float:1.5372E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0047
            X.6Gp r0 = r6.this$0
            X.00H r0 = r0.A0T
            java.lang.Object r1 = r0.get()
            com.whatsapp.productinfra.music.gating.MusicGating r1 = (com.whatsapp.productinfra.music.gating.MusicGating) r1
            X.77U r0 = r6.$embeddedMusic
            r6.L$0 = r3
            r6.label = r4
            java.lang.Object r7 = r1.A00(r0, r6)
            if (r7 != r5) goto L_0x0010
            return r5
        L_0x0047:
            r4 = 0
            goto L_0x0016
        L_0x0049:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.page.StatusPlaybackPageItemBase$loadFutureProofingContentIfAny$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StatusPlaybackPageItemBase$loadFutureProofingContentIfAny$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
