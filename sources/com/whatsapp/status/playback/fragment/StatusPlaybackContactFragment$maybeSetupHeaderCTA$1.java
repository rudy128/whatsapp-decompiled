package com.whatsapp.status.playback.fragment;

import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.C131096kV;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.text.SpannableStringBuilder;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment$maybeSetupHeaderCTA$1", f = "StatusPlaybackContactFragment.kt", i = {}, l = {1168, 1170}, m = "invokeSuspend", n = {}, s = {})
public final class StatusPlaybackContactFragment$maybeSetupHeaderCTA$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass206 $message;
    public final /* synthetic */ SpannableStringBuilder $text;
    public final /* synthetic */ C131096kV $viewHolder;
    public int label;
    public final /* synthetic */ StatusPlaybackContactFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusPlaybackContactFragment$maybeSetupHeaderCTA$1(SpannableStringBuilder spannableStringBuilder, AnonymousClass206 r3, C131096kV r4, StatusPlaybackContactFragment statusPlaybackContactFragment, C30391dr r6) {
        super(2, r6);
        this.this$0 = statusPlaybackContactFragment;
        this.$message = r3;
        this.$text = spannableStringBuilder;
        this.$viewHolder = r4;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        StatusPlaybackContactFragment statusPlaybackContactFragment = this.this$0;
        return new StatusPlaybackContactFragment$maybeSetupHeaderCTA$1(this.$text, this.$message, this.$viewHolder, statusPlaybackContactFragment, r8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (X.AnonymousClass000.A1Y(r12) != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r11.label
            r3 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r5) goto L_0x0042
            if (r0 != r3) goto L_0x0068
            X.C30691eM.A01(r12)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r12)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = r11.this$0
            X.1Lc r0 = r0.A2C()
            X.0ve r4 = r0.A01
            r1 = 10970(0x2ada, float:1.5372E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x004c
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = r11.this$0
            X.00H r0 = r0.A0f
            if (r0 == 0) goto L_0x006d
            java.lang.Object r1 = r0.get()
            com.whatsapp.productinfra.music.gating.MusicGating r1 = (com.whatsapp.productinfra.music.gating.MusicGating) r1
            X.206 r0 = r11.$message
            X.77U r0 = X.AnonymousClass6XJ.A00(r0)
            r11.label = r5
            java.lang.Object r12 = r1.A00(r0, r11)
            if (r12 != r2) goto L_0x0045
            return r2
        L_0x0042:
            X.C30691eM.A01(r12)
        L_0x0045:
            boolean r0 = X.AnonymousClass000.A1Y(r12)
            r10 = 1
            if (r0 != 0) goto L_0x004d
        L_0x004c:
            r10 = 0
        L_0x004d:
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r8 = r11.this$0
            X.0wl r0 = r8.A0z
            if (r0 == 0) goto L_0x0070
            android.text.SpannableStringBuilder r5 = r11.$text
            X.206 r6 = r11.$message
            X.6kV r7 = r11.$viewHolder
            r9 = 0
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment$maybeSetupHeaderCTA$1$1 r4 = new com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment$maybeSetupHeaderCTA$1$1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.label = r3
            java.lang.Object r0 = X.C30451dy.A00(r11, r0, r4)
            if (r0 != r2) goto L_0x000f
            return r2
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x006d:
            java.lang.String r0 = "musicGating"
            goto L_0x0072
        L_0x0070:
            java.lang.String r0 = "mainDispatcher"
        L_0x0072:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment$maybeSetupHeaderCTA$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StatusPlaybackContactFragment$maybeSetupHeaderCTA$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
