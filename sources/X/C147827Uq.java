package X;

import com.whatsapp.productinfra.music.api.MusicApi;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.music.api.MusicApi", f = "MusicApi.kt", i = {1, 1, 2, 2, 2}, l = {155, 158, 160}, m = "creationReporting", n = {"this", "request", "this", "request", "bodyMultiPart"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* renamed from: X.7Uq  reason: invalid class name and case insensitive filesystem */
public final class C147827Uq extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MusicApi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147827Uq(MusicApi musicApi, C30391dr r2) {
        super(r2);
        this.this$0 = musicApi;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A03((String) null, this, 0, 0);
    }
}
