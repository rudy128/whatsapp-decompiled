package com.whatsapp.conversationslist;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1Q0;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Z9;
import X.AnonymousClass4aX;
import X.C110885hR;
import X.C17880vN;
import X.C18000vb;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C89924dF;
import X.C90874em;
import X.C91004ez;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.components.WaSwitchView;

public class ArchiveNotificationSettingActivity extends AnonymousClass1FY {
    public AnonymousClass1Q0 A00;
    public boolean A01;

    public ArchiveNotificationSettingActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = (AnonymousClass1Q0) A0L.A0M.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean A1S = C72473Md.A1S(this);
        setContentView(2131624215);
        setTitle(2131886731);
        Toolbar A0F = AnonymousClass3Ma.A0F(this);
        C18000vb r2 = this.A00;
        A0F.setNavigationIcon((Drawable) AnonymousClass4aX.A0A(this, getResources(), getResources().getDrawable(2131231675), r2));
        A0F.setTitle((CharSequence) getString(2131886731));
        A0F.setBackgroundResource(AnonymousClass4Z9.A01(this, false));
        A0F.A0Q(this, 2132083960);
        A0F.setNavigationOnClickListener(new C89924dF(this, 8));
        setSupportActionBar(A0F);
        WaSwitchView waSwitchView = (WaSwitchView) C110885hR.A0A(this, 2131433219);
        waSwitchView.setChecked(A1S ^ this.A0A.A2R());
        waSwitchView.setOnCheckedChangeListener(new C90874em(this, 5));
        waSwitchView.setOnClickListener(new C89924dF(waSwitchView, 9));
        WaSwitchView waSwitchView2 = (WaSwitchView) C110885hR.A0A(this, 2131427931);
        waSwitchView2.setChecked(C17880vN.A1W(C72453Mb.A0M(this), "auto_archive_inactive_chats"));
        waSwitchView2.setOnCheckedChangeListener(new C90874em(this, 6));
        waSwitchView2.setOnClickListener(new C89924dF(waSwitchView2, 10));
        waSwitchView2.setVisibility(8);
    }

    public ArchiveNotificationSettingActivity(int i) {
        this.A01 = false;
        C91004ez.A00(this, 38);
    }
}
