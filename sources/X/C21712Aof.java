package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.manager.CatalogManager", f = "CatalogManager.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {776, 778}, m = "awaitCollectionProductList", n = {"this", "userJid", "collectionId", "endCursor", "thumbnailSize", "requestPageSize", "isCategory", "this", "userJid", "collectionId", "endCursor"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "Z$0", "L$0", "L$1", "L$2", "L$3"})
/* renamed from: X.Aof  reason: case insensitive filesystem */
public final class C21712Aof extends C30421du {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CatalogManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21712Aof(CatalogManager catalogManager, C30391dr r2) {
        super(r2);
        this.this$0 = catalogManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A06((UserJid) null, (String) null, this, 0, 0, false);
    }
}
