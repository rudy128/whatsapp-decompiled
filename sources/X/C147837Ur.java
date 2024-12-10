package X;

import com.whatsapp.productinfra.music.api.MusicApi;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.music.api.MusicApi", f = "MusicApi.kt", i = {0, 0, 1, 1}, l = {200, 209}, m = "executeRequest", n = {"this", "request", "this", "request"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.7Ur  reason: invalid class name and case insensitive filesystem */
public final class C147837Ur extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MusicApi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147837Ur(MusicApi musicApi, C30391dr r2) {
        super(r2);
        this.this$0 = musicApi;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MusicApi.A00(this.this$0, (C131626lP) null, this);
    }
}
