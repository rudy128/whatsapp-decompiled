package X;

import com.whatsapp.contact.sync.NativeContactsDownloadHelper;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.sync.NativeContactsDownloadHelper", f = "NativeContactsDownloadHelper.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {140, 189}, m = "startContactsDownload", n = {"this", "userJid", "downloadTrigger", "callback", "downloadEvent", "batchSize", "isRestore", "this", "downloadTrigger", "callback", "downloadEvent"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3"})
/* renamed from: X.3Fc  reason: invalid class name and case insensitive filesystem */
public final class C71393Fc extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NativeContactsDownloadHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71393Fc(NativeContactsDownloadHelper nativeContactsDownloadHelper, C30391dr r2) {
        super(r2);
        this.this$0 = nativeContactsDownloadHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return NativeContactsDownloadHelper.A00(this.this$0, (UserJid) null, (C26981Ug) null, (Integer) null, (String) null, this, 0, false);
    }
}
