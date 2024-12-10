package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.5PS  reason: invalid class name */
public final class AnonymousClass5PS extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ boolean $default = false;
    public final /* synthetic */ String $key;
    public final /* synthetic */ Fragment $this_booleanArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5PS(Fragment fragment, String str) {
        super(0);
        this.$this_booleanArg = fragment;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        Bundle bundle = this.$this_booleanArg.A06;
        if (bundle != null) {
            z = bundle.getBoolean(this.$key, this.$default);
        } else {
            z = this.$default;
        }
        return Boolean.valueOf(z);
    }
}
