package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C122016Ml;
import X.C18070vi;
import X.C26521Sl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.VideoComposerFragment$setBitrateInVideoStat$1", f = "VideoComposerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VideoComposerFragment$setBitrateInVideoStat$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ File $mediaFile;
    public final /* synthetic */ C122016Ml $videoLocalStat;
    public int label;
    public final /* synthetic */ VideoComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoComposerFragment$setBitrateInVideoStat$1(VideoComposerFragment videoComposerFragment, C122016Ml r3, File file, C30391dr r5) {
        super(2, r5);
        this.$videoLocalStat = r3;
        this.this$0 = videoComposerFragment;
        this.$mediaFile = file;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new VideoComposerFragment$setBitrateInVideoStat$1(this.this$0, this.$videoLocalStat, this.$mediaFile, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C122016Ml r2 = this.$videoLocalStat;
            if (this.this$0.A0U != null) {
                r2.A00 = C26521Sl.A02(this.$mediaFile);
                return C27621Wu.A00;
            }
            C18070vi.A11("mediaFileUtils");
            throw null;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VideoComposerFragment$setBitrateInVideoStat$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
