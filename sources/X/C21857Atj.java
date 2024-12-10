package X;

import android.os.Bundle;
import com.whatsapp.bizintegrity.callpermission.BizCallbackActivity;

/* renamed from: X.Atj  reason: case insensitive filesystem */
public final class C21857Atj extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BizCallbackActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21857Atj(BizCallbackActivity bizCallbackActivity) {
        super(0);
        this.this$0 = bizCallbackActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        C22931Dv r2 = AnonymousClass1BI.A00;
        Bundle A09 = AnonymousClass3MY.A09(this.this$0);
        if (A09 != null) {
            str = A09.getString("chat_jid");
        } else {
            str = null;
        }
        AnonymousClass1BI A02 = r2.A02(str);
        if (A02 != null) {
            return A02;
        }
        throw AnonymousClass000.A0n("Could not retrieve chat jid from arguments bundle.");
    }
}
