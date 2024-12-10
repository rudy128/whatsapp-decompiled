package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

/* renamed from: X.5MM  reason: invalid class name */
public final class AnonymousClass5MM extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $key = "call_log_message_group_size";
    public final /* synthetic */ Fragment $this_parcelableArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5MM(Fragment fragment) {
        super(0);
        this.$this_parcelableArg = fragment;
    }

    public final Object invoke() {
        Parcelable parcelable;
        boolean A09 = AnonymousClass112.A09();
        Bundle bundle = this.$this_parcelableArg.A06;
        if (!A09) {
            if (bundle != null) {
                parcelable = bundle.getParcelable(this.$key);
            } else {
                parcelable = null;
            }
            if (parcelable instanceof Integer) {
                return parcelable;
            }
            return null;
        } else if (bundle == null) {
            return null;
        } else {
            return C24141Ja.A00(bundle, Integer.class, this.$key);
        }
    }
}
