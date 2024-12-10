package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.5PI  reason: invalid class name */
public final class AnonymousClass5PI extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Enum $default;
    public final /* synthetic */ String $key = "link_mode";
    public final /* synthetic */ Fragment $this_enumArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5PI(Fragment fragment, Enum enumR) {
        super(0);
        this.$this_enumArg = fragment;
        this.$default = enumR;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string;
        Object obj;
        Bundle bundle = this.$this_enumArg.A06;
        if (!(bundle == null || (string = bundle.getString(this.$key)) == null)) {
            try {
                obj = Enum.valueOf(C82884Cn.class, string);
            } catch (Throwable th) {
                obj = new AnonymousClass1IU(th);
            }
            if (obj instanceof AnonymousClass1IU) {
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
        }
        return this.$default;
    }
}
