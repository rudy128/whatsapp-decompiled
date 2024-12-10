package X;

import com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase", f = "LoadSectionsUseCase.kt", i = {0}, l = {49}, m = "invoke", n = {"mediaList"}, s = {"L$0"})
/* renamed from: X.7U0  reason: invalid class name */
public final class AnonymousClass7U0 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LoadSectionsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7U0(LoadSectionsUseCase loadSectionsUseCase, C30391dr r2) {
        super(r2);
        this.this$0 = loadSectionsUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((AnonymousClass853) null, (AnonymousClass87B) null, (AnonymousClass858) null, (List) null, this, 0, false);
    }
}
