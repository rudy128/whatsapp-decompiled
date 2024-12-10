package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Nr  reason: invalid class name and case insensitive filesystem */
public final class C104315Nr extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $key = "jids";
    public final /* synthetic */ Fragment $this_jidListArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104315Nr(Fragment fragment) {
        super(0);
        this.$this_jidListArg = fragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ArrayList<String> stringArrayList;
        Bundle bundle = this.$this_jidListArg.A06;
        if (bundle == null || (stringArrayList = bundle.getStringArrayList(this.$key)) == null) {
            return C18460wS.A00;
        }
        ArrayList A0A = C22971Dz.A0A(Jid.class, stringArrayList);
        if (A0A instanceof List) {
            return A0A;
        }
        throw C99684tI.A00;
    }
}
