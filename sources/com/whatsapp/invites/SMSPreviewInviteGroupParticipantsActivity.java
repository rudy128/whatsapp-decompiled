package com.whatsapp.invites;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.C17880vN;
import X.C72473Md;
import X.C72483Me;
import X.C91014f0;
import android.os.Bundle;

public final class SMSPreviewInviteGroupParticipantsActivity extends AnonymousClass1FY {
    public boolean A00;

    public SMSPreviewInviteGroupParticipantsActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("invite_trigger_source", 0);
        if (intExtra == 1 || intExtra == 2 || intExtra == 4) {
            setTitle(2131898700);
            C72483Me.A0b(this);
            Bundle A0D = C17880vN.A0D();
            A0D.putStringArrayList("sms_invites_jids", getIntent().getStringArrayListExtra("sms_invites_jids"));
            A0D.putString("group_jid", getIntent().getStringExtra("group_jid"));
            SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment = new SMSPreviewInviteBottomSheetFragment();
            Bundle A0D2 = C17880vN.A0D();
            A0D2.putStringArrayList("sms_invites_jids", getIntent().getStringArrayListExtra("sms_invites_jids"));
            A0D2.putString("group_jid", getIntent().getStringExtra("group_jid"));
            A0D2.putBoolean("all_participants_non_wa_in_request", getIntent().getBooleanExtra("all_participants_non_wa_in_request", true));
            A0D2.putInt("invite_trigger_source", intExtra);
            sMSPreviewInviteBottomSheetFragment.A1R(A0D2);
            sMSPreviewInviteBottomSheetFragment.A2C(getSupportFragmentManager(), "SMSPreviewInviteGroupParticipantsActivity");
            return;
        }
        finish();
    }

    public SMSPreviewInviteGroupParticipantsActivity(int i) {
        this.A00 = false;
        C91014f0.A00(this, 36);
    }
}
