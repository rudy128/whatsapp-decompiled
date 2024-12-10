package com.whatsapp.productinfra.music.publishing;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C134926rN;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.music.publishing.MusicPublishing$publishBlocking$1", f = "MusicPublishing.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
public final class MusicPublishing$publishBlocking$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $mediaDurationMs;
    public final /* synthetic */ C134926rN $selectedSong;
    public int label;
    public final /* synthetic */ MusicPublishing this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicPublishing$publishBlocking$1(C134926rN r2, MusicPublishing musicPublishing, C30391dr r4, long j) {
        super(2, r4);
        this.this$0 = musicPublishing;
        this.$selectedSong = r2;
        this.$mediaDurationMs = j;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new MusicPublishing$publishBlocking$1(this.$selectedSong, this.this$0, r8, this.$mediaDurationMs);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            MusicPublishing musicPublishing = this.this$0;
            C134926rN r2 = this.$selectedSong;
            long j = this.$mediaDurationMs;
            this.label = 1;
            obj = musicPublishing.A00(r2, this, j);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MusicPublishing$publishBlocking$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
