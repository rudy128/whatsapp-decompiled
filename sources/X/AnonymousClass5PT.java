package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.5PT  reason: invalid class name */
public final class AnonymousClass5PT extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ int $default;
    public final /* synthetic */ String $key;
    public final /* synthetic */ Fragment $this_intArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5PT(Fragment fragment, String str, int i) {
        super(0);
        this.$this_intArg = fragment;
        this.$key = str;
        this.$default = i;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        Bundle bundle = this.$this_intArg.A06;
        if (bundle != null) {
            i = bundle.getInt(this.$key, this.$default);
        } else {
            i = this.$default;
        }
        return Integer.valueOf(i);
    }
}
