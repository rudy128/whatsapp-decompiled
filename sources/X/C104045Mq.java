package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.jid.Jid;

/* renamed from: X.5Mq  reason: invalid class name and case insensitive filesystem */
public final class C104045Mq extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $key = "transfer_ownership_parent_jid";
    public final /* synthetic */ Activity $this_jidArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104045Mq(Activity activity) {
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
            if ((A0n instanceof AnonymousClass1EC) && A0n != null) {
                return A0n;
            }
        }
        throw C99684tI.A00;
    }
}
