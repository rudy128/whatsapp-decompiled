package X;

import com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase", f = "LoadSectionsUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2}, l = {78, 102, 117, 132}, m = "loadSections", n = {"this", "mediaList", "sectionBuckets", "bucketsProvider", "lastBucket", "buckets", "media", "approxFirstPageThumbCount", "lastUpdateTime", "i", "this", "mediaList", "sectionBuckets", "bucketsProvider", "lastBucket", "buckets", "approxFirstPageThumbCount", "lastUpdateTime", "i", "this", "mediaList"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "J$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "J$0", "I$1", "L$0", "L$1"})
/* renamed from: X.7VC  reason: invalid class name */
public final class AnonymousClass7VC extends C30421du {
    public int I$0;
    public int I$1;
    public int I$2;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LoadSectionsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VC(LoadSectionsUseCase loadSectionsUseCase, C30391dr r2) {
        super(r2);
        this.this$0 = loadSectionsUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return LoadSectionsUseCase.A00((AnonymousClass853) null, (C160878Ah) null, this.this$0, (List) null, this, 0);
    }
}
