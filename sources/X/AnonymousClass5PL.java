package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.5PL  reason: invalid class name */
public final class AnonymousClass5PL extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Enum $default;
    public final /* synthetic */ String $key = "INITIALLY_SELECTED_CALL_TYPE";
    public final /* synthetic */ Fragment $this_enumArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5PL(Fragment fragment, Enum enumR) {
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
                obj = Enum.valueOf(AnonymousClass4CW.class, string);
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
