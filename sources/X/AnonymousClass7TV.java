package X;

import com.whatsapp.productinfra.music.api.MusicApi;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.music.api.MusicApi", f = "MusicApi.kt", i = {}, l = {128}, m = "fetchEligibleCountries", n = {}, s = {})
/* renamed from: X.7TV  reason: invalid class name */
public final class AnonymousClass7TV extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MusicApi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TV(MusicApi musicApi, C30391dr r2) {
        super(r2);
        this.this$0 = musicApi;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A04(this);
    }
}
