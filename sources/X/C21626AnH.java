package X;

import com.whatsapp.productinfra.datasharingdisclosure.data.network.ConsumerCtwaDisclosureProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.datasharingdisclosure.data.network.ConsumerCtwaDisclosureProtocolHelper", f = "ConsumerCtwaDisclosureProtocolHelper.kt", i = {}, l = {24}, m = "syncSettingToServer", n = {}, s = {})
/* renamed from: X.AnH  reason: case insensitive filesystem */
public final class C21626AnH extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConsumerCtwaDisclosureProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21626AnH(ConsumerCtwaDisclosureProtocolHelper consumerCtwaDisclosureProtocolHelper, C30391dr r2) {
        super(r2);
        this.this$0 = consumerCtwaDisclosureProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this, 0);
    }
}
