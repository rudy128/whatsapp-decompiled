package X;

import com.whatsapp.productinfra.music.api.MusicRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.music.api.MusicRepository", f = "MusicRepository.kt", i = {0, 0}, l = {66}, m = "fetchEligibleCountries", n = {"this", "prefs"}, s = {"L$0", "L$1"})
/* renamed from: X.7UW  reason: invalid class name */
public final class AnonymousClass7UW extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MusicRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UW(MusicRepository musicRepository, C30391dr r2) {
        super(r2);
        this.this$0 = musicRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this);
    }
}
