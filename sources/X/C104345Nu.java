package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.5Nu  reason: invalid class name and case insensitive filesystem */
public final class C104345Nu extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $key = "optional_messages";
    public final /* synthetic */ Fragment $this_bundleArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104345Nu(Fragment fragment) {
        super(0);
        this.$this_bundleArg = fragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundle;
        Bundle bundle2 = this.$this_bundleArg.A06;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.$key)) == null) {
            return C17880vN.A0D();
        }
        return bundle;
    }
}
