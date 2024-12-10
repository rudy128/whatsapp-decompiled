package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5O1  reason: invalid class name */
public final class AnonymousClass5O1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $key = "jid";
    public final /* synthetic */ Activity $this_jidArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5O1(Activity activity) {
        super(0);
        this.$this_jidArg = activity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String stringExtra;
        Intent intent = this.$this_jidArg.getIntent();
        if (intent != null) {
            intent.getStringExtra(this.$key);
        }
        Intent intent2 = this.$this_jidArg.getIntent();
        if (!(intent2 == null || (stringExtra = intent2.getStringExtra(this.$key)) == null)) {
            Jid A0n = AnonymousClass3MX.A0n(stringExtra);
            if ((A0n instanceof UserJid) && A0n != null) {
                return A0n;
            }
        }
        throw C99684tI.A00;
    }
}
