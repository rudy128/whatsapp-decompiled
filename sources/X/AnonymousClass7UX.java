package X;

import com.whatsapp.productinfra.music.gating.MusicGating;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.music.gating.MusicGating", f = "MusicGating.kt", i = {0, 0}, l = {24}, m = "isSongCountryBlocked", n = {"embeddedMusic", "countryCode"}, s = {"L$0", "L$1"})
/* renamed from: X.7UX  reason: invalid class name */
public final class AnonymousClass7UX extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MusicGating this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UX(MusicGating musicGating, C30391dr r2) {
        super(r2);
        this.this$0 = musicGating;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass77U) null, this);
    }
}
