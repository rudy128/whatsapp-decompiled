package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.jid.Jid;

/* renamed from: X.5Mf  reason: invalid class name and case insensitive filesystem */
public final class C103935Mf extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $key = "arg_jid";
    public final /* synthetic */ Fragment $this_jidArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103935Mf(Fragment fragment) {
        super(0);
        this.$this_jidArg = fragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string;
        Jid A0n;
        Bundle bundle = this.$this_jidArg.A06;
        if (bundle != null) {
            bundle.getString(this.$key);
        }
        Bundle bundle2 = this.$this_jidArg.A06;
        if (bundle2 != null && (string = bundle2.getString(this.$key)) != null && (A0n = AnonymousClass3MX.A0n(string)) != null) {
            return A0n;
        }
        throw C99684tI.A00;
    }
}
