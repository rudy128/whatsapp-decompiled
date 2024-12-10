package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass4XI;
import X.AnonymousClass4a6;
import X.AnonymousClass700;
import X.C17880vN;
import X.C73203Rj;
import X.C88874ay;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class ConversationRowContact$MessageSharedContactDialogFragment extends Hilt_ConversationRowContact_MessageSharedContactDialogFragment {
    public AnonymousClass700 A00;

    public Dialog A27(Bundle bundle) {
        String A0y;
        ArrayList A1A = AnonymousClass3MZ.A1A(A15(), UserJid.class, "jids");
        ArrayList<String> stringArrayList = this.A06.getStringArrayList("phones");
        ArrayList<String> stringArrayList2 = this.A06.getStringArrayList("labels");
        String string = this.A06.getString("business_name");
        ArrayList A13 = AnonymousClass000.A13();
        if (!(stringArrayList2 == null || stringArrayList == null)) {
            for (int i = 0; i < A1A.size(); i++) {
                if (A1A.get(i) != null) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append(C17880vN.A0q(A1n(), stringArrayList.get(i), AnonymousClass3MW.A1a(), 0, 2131892049));
                    if (TextUtils.isEmpty(stringArrayList2.get(i))) {
                        A0y = "";
                    } else {
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append(" (");
                        A102.append(stringArrayList2.get(i));
                        A0y = AnonymousClass000.A0y(")", A102);
                    }
                    A13.add(new AnonymousClass4XI((UserJid) A1A.get(i), AnonymousClass000.A0y(A0y, A10)));
                }
            }
        }
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0H(new C88874ay(this, A13, string, 1), new ArrayAdapter(A1n(), 2131626866, A13));
        return A03.create();
    }
}
