package com.whatsapp.status.audienceselector;

import X.AnonymousClass71W;
import X.C114575r8;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C24661Le;
import X.C25001Mm;
import X.C32741hg;
import X.C41911xI;
import X.C56422hR;
import android.view.View;
import java.util.Set;

public class StatusRecipientsActivity extends C114575r8 {
    public C56422hR A00;
    public C25001Mm A01;
    public C41911xI A02;
    public C24661Le A03;
    public C32741hg A04;

    public final boolean A4g() {
        if (!C18020vd.A05(C18040vf.A01, this.A0E, 2611) || !this.A0K || this.A0S.size() != this.A0J.size()) {
            return false;
        }
        this.A05.A0G("You cannot exclude everyone", 1);
        return true;
    }

    public void A4f() {
        super.A4f();
        if (!this.A0K) {
            Set set = this.A0S;
            if (set.size() == 0 && this.A0M.getVisibility() == 0) {
                View view = this.A0M;
                C18070vi.A0W(view);
                AnonymousClass71W.A00(view, false, true);
            } else if (set.size() != 0 && this.A0M.getVisibility() == 4) {
                View view2 = this.A0M;
                C18070vi.A0W(view2);
                AnonymousClass71W.A00(view2, true, true);
            }
        }
    }
}
