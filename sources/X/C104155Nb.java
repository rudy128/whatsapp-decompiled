package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.5Nb  reason: invalid class name and case insensitive filesystem */
public final class C104155Nb extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $key;
    public final /* synthetic */ Fragment $this_nullableStringArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104155Nb(Fragment fragment, String str) {
        super(0);
        this.$this_nullableStringArg = fragment;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundle = this.$this_nullableStringArg.A06;
        if (bundle != null) {
            return bundle.getString(this.$key);
        }
        return null;
    }
}
