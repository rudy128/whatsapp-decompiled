package X;

import java.util.List;
import java.util.Map;

public final class B0P extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22409B6n $downloadCallback;
    public final /* synthetic */ List $metadataRequests;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0P(C22409B6n b6n, List list) {
        super(1);
        this.$downloadCallback = b6n;
        this.$metadataRequests = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        C18070vi.A0d(exc, 0);
        this.$downloadCallback.BpO(exc, this.$metadataRequests, (Map) null);
        return C27621Wu.A00;
    }
}
