package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.5PU  reason: invalid class name */
public final class AnonymousClass5PU extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ long $default = 0;
    public final /* synthetic */ String $key;
    public final /* synthetic */ Fragment $this_longArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5PU(Fragment fragment, String str) {
        super(0);
        this.$this_longArg = fragment;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        long j;
        Bundle bundle = this.$this_longArg.A06;
        if (bundle != null) {
            j = bundle.getLong(this.$key, this.$default);
        } else {
            j = this.$default;
        }
        return Long.valueOf(j);
    }
}
