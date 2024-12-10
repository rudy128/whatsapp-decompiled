package X;

import android.os.Bundle;
import com.whatsapp.jid.Jid;

/* renamed from: X.5OV  reason: invalid class name */
public final class AnonymousClass5OV extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $key = "arg_jid";
    public final /* synthetic */ Bundle $this_getJid;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5OV(Bundle bundle) {
        super(0);
        this.$this_getJid = bundle;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Jid A02 = Jid.Companion.A02(this.$this_getJid.getString(this.$key));
        if ((A02 instanceof AnonymousClass1BI) && A02 != null) {
            return A02;
        }
        throw C99684tI.A00;
    }
}
