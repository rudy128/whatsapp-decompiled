package X;

import com.whatsapp.contact.picker.DefaultContactsLoader;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.DefaultContactsLoader", f = "DefaultContactsLoader.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3}, l = {29, 30, 31, 32}, m = "loadContacts", n = {"this", "groupJid", "dispatcher", "contacts", "this", "groupJid", "dispatcher", "contacts", "this", "groupJid", "dispatcher", "contacts", "contacts"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* renamed from: X.AoY  reason: case insensitive filesystem */
public final class C21705AoY extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultContactsLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21705AoY(DefaultContactsLoader defaultContactsLoader, C30391dr r2) {
        super(r2);
        this.this$0 = defaultContactsLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.Bhk((AnonymousClass1EC) null, this, (C18600wl) null);
    }
}
