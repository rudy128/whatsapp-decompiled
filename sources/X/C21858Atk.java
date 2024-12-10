package X;

import android.os.Bundle;
import com.whatsapp.bizintegrity.callpermission.BizCallbackActivity;

/* renamed from: X.Atk  reason: case insensitive filesystem */
public final class C21858Atk extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BizCallbackActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21858Atk(BizCallbackActivity bizCallbackActivity) {
        super(0);
        this.this$0 = bizCallbackActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle A09 = AnonymousClass3MY.A09(this.this$0);
        if (A09 != null) {
            return A09.getString("user_selected_reply_action");
        }
        return null;
    }
}
