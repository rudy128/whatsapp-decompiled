package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.AwW  reason: case insensitive filesystem */
public final class C22030AwW extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Enum $default;
    public final /* synthetic */ String $key = "arg_action";
    public final /* synthetic */ Fragment $this_enumArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22030AwW(Fragment fragment, Enum enumR) {
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
                obj = Enum.valueOf(AnonymousClass9IF.class, string);
            } catch (Throwable th) {
                obj = C108945cZ.A1J(th);
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
