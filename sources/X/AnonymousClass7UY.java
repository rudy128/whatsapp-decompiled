package X;

import com.whatsapp.productinfra.music.publishing.MusicPublishing;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.music.publishing.MusicPublishing", f = "MusicPublishing.kt", i = {0, 0}, l = {48}, m = "publish", n = {"this", "song"}, s = {"L$0", "L$1"})
/* renamed from: X.7UY  reason: invalid class name */
public final class AnonymousClass7UY extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MusicPublishing this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UY(MusicPublishing musicPublishing, C30391dr r2) {
        super(r2);
        this.this$0 = musicPublishing;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((C134926rN) null, this, 0);
    }
}
