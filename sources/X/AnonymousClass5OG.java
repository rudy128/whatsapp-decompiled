package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

/* renamed from: X.5OG  reason: invalid class name */
public final class AnonymousClass5OG extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $key = "invitee_jids";
    public final /* synthetic */ Fragment $this_jidListArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5OG(Fragment fragment) {
        super(0);
        this.$this_jidListArg = fragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ArrayList<String> stringArrayList;
        Bundle bundle = this.$this_jidListArg.A06;
        if (bundle == null || (stringArrayList = bundle.getStringArrayList(this.$key)) == null) {
            return C41681wt.A01(C18460wS.A00);
        }
        ArrayList A0A = C22971Dz.A0A(Jid.class, stringArrayList);
        if (C41681wt.A06(A0A)) {
            return A0A;
        }
        throw C99684tI.A00;
    }
}
