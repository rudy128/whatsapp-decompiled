package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.5Nc  reason: invalid class name and case insensitive filesystem */
public final class C104165Nc extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $key;
    public final /* synthetic */ Fragment $this_stringArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104165Nc(Fragment fragment, String str) {
        super(0);
        this.$this_stringArg = fragment;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string;
        Bundle bundle = this.$this_stringArg.A06;
        if (bundle != null && (string = bundle.getString(this.$key)) != null) {
            return string;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("No value for ");
        throw AnonymousClass000.A0s(AnonymousClass000.A0y(this.$key, A10));
    }
}
