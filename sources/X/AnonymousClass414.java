package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.group.newgroup.NewGroup;
import com.whatsapp.invites.PromptSendGroupInviteDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.414  reason: invalid class name */
public class AnonymousClass414 extends C96344nh {
    public final /* synthetic */ NewGroup A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass414(AnonymousClass11P r8, AnonymousClass1NN r9, AnonymousClass122 r10, AnonymousClass126 r11, C188679ho r12, NewGroup newGroup, AnonymousClass1PQ r14) {
        super(r8, r9, r10, r11, r12, r14);
        this.A00 = newGroup;
    }

    public void C7e(AnonymousClass4OX r17, AnonymousClass1EC r18) {
        NewGroup newGroup = this.A00;
        AnonymousClass1EC r3 = r18;
        newGroup.A0y.set(r3);
        if (NewGroup.A03(newGroup) != null) {
            newGroup.A05.A0J(new C146507Pj(this, r3, 11));
        }
        AnonymousClass4OX r2 = r17;
        super.C7e(r2, r3);
        Map map = r2.A03;
        if (map.size() > 0) {
            ArrayList A13 = AnonymousClass000.A13();
            ArrayList A132 = AnonymousClass000.A13();
            Iterator it = map.keySet().iterator();
            Long l = null;
            while (it.hasNext()) {
                Jid A0S = C17880vN.A0S(it);
                C85114Md r5 = (C85114Md) map.get(A0S);
                if (r5 != null) {
                    if (l == null) {
                        l = Long.valueOf(r5.A00);
                    }
                    A13.add(A0S.getRawString());
                    A132.add(r5.A01);
                }
            }
            Set keySet = map.keySet();
            newGroup.A0g.get();
            newGroup.A02 = PromptSendGroupInviteDialogFragment.A00(AnonymousClass1LU.A0p(newGroup, r2.A00, l, A13, A132, r2.A01, 1), keySet, false);
        } else {
            ArrayList arrayList = r2.A01;
            if (!arrayList.isEmpty()) {
                Bundle bundle = newGroup.A02;
                if (bundle == null) {
                    bundle = C17880vN.A0D();
                    newGroup.A02 = bundle;
                }
                newGroup.A0g.get();
                AnonymousClass1EC r6 = r2.A00;
                boolean z = true;
                if (!(r2.A04.size() == 1 && r2.A02.size() == arrayList.size())) {
                    z = false;
                }
                bundle.putParcelable("sms_invite_intent", AnonymousClass1LU.A0q(newGroup, r6, arrayList, 1, z));
            }
        }
        String A002 = C83764Go.A00(newGroup, r2);
        if (!TextUtils.isEmpty(A002)) {
            Bundle bundle2 = newGroup.A02;
            if (bundle2 == null) {
                bundle2 = C17880vN.A0D();
                newGroup.A02 = bundle2;
            }
            bundle2.putString("error_message", A002);
        }
        if (newGroup.A01 != null) {
            Bundle bundle3 = newGroup.A02;
            if (bundle3 == null) {
                bundle3 = C17880vN.A0D();
                newGroup.A02 = bundle3;
            }
            bundle3.putBundle("messages_to_forward_bundle", newGroup.A01);
            newGroup.A02.putBoolean("include_captions", newGroup.getIntent().getBooleanExtra("include_captions", false));
            newGroup.A02.putString("appended_message", newGroup.getIntent().getStringExtra("appended_message"));
        }
        newGroup.A05.A0J(new C146507Pj(newGroup, r3, 9));
    }

    public void C8g() {
        Log.i("newgroup/CreateGroupResponseHandler/onTimeout");
        super.C8g();
        this.A00.A05.A0J(new C21355Aik(this, 42));
    }
}
