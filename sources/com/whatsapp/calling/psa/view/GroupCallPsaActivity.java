package com.whatsapp.calling.psa.view;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FU;
import X.AnonymousClass1OR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass5EB;
import X.AnonymousClass5EC;
import X.C103885Ma;
import X.C18100vl;
import X.C30391dr;
import X.C30451dy;
import X.C37581pm;
import X.C41561wd;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C90994ey;
import X.C99274sY;
import android.os.Bundle;
import com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel;
import com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel$fetchSuggestions$1;

public final class GroupCallPsaActivity extends AnonymousClass1FU {
    public boolean A00;
    public final C18100vl A01;

    public GroupCallPsaActivity() {
        this(0);
        this.A01 = C99274sY.A00(new AnonymousClass5EC(this), new AnonymousClass5EB(this), new C103885Ma(this), AnonymousClass3MW.A15(GroupCallPsaViewModel.class));
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            C72453Mb.A1K(r1, this);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        C37581pm A0H = AnonymousClass3MZ.A0H(this);
        GroupCallPsaActivity$onCreate$1 groupCallPsaActivity$onCreate$1 = new GroupCallPsaActivity$onCreate$1(this, (C30391dr) null);
        AnonymousClass1OR r4 = AnonymousClass1OR.A00;
        Integer A0w = AnonymousClass3MW.A0w(r4, groupCallPsaActivity$onCreate$1, A0H);
        GroupCallPsaViewModel groupCallPsaViewModel = (GroupCallPsaViewModel) this.A01.getValue();
        C30451dy.A02(A0w, r4, new GroupCallPsaViewModel$fetchSuggestions$1(groupCallPsaViewModel, (C30391dr) null), C41561wd.A00(groupCallPsaViewModel));
    }

    public GroupCallPsaActivity(int i) {
        this.A00 = false;
        C90994ey.A00(this, 32);
    }
}
