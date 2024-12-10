package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

/* renamed from: X.7tJ  reason: invalid class name and case insensitive filesystem */
public final class C155787tJ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $key = "funStickerData";
    public final /* synthetic */ Fragment $this_parcelableArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155787tJ(Fragment fragment) {
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
            if (parcelable instanceof AnonymousClass778) {
                return parcelable;
            }
            return null;
        } else if (bundle == null) {
            return null;
        } else {
            return C24141Ja.A00(bundle, AnonymousClass778.class, this.$key);
        }
    }
}
