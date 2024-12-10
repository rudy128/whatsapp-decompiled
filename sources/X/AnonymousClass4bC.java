package X;

import android.content.DialogInterface;
import com.whatsapp.group.ExitGroupsDialogFragment;
import java.util.List;

/* renamed from: X.4bC  reason: invalid class name */
public class AnonymousClass4bC implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass4bC(ExitGroupsDialogFragment exitGroupsDialogFragment, List list, int i) {
        this.A00 = i;
        if (21 - i != 0) {
            this.A01 = exitGroupsDialogFragment;
            this.A02 = list;
            return;
        }
        this.A01 = list;
        this.A02 = exitGroupsDialogFragment;
    }

    /* JADX WARNING: type inference failed for: r1v58, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0330, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0334, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x036b, code lost:
        r4.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x036e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x038c, code lost:
        r5.CGF(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x038f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02ae, code lost:
        r1.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02b1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02b2, code lost:
        r0 = "contextualHelpHandler";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02d4, code lost:
        r3.CGF(r2);
        r4 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x036f;
                case 1: goto L_0x0352;
                case 2: goto L_0x00f6;
                case 3: goto L_0x0335;
                case 4: goto L_0x02f7;
                case 5: goto L_0x02d9;
                case 6: goto L_0x02c5;
                case 7: goto L_0x02b5;
                case 8: goto L_0x0298;
                case 9: goto L_0x00e0;
                case 10: goto L_0x027e;
                case 11: goto L_0x026c;
                case 12: goto L_0x025b;
                case 13: goto L_0x022d;
                case 14: goto L_0x0204;
                case 15: goto L_0x01c7;
                case 16: goto L_0x037e;
                case 17: goto L_0x00c1;
                case 18: goto L_0x019b;
                case 19: goto L_0x018f;
                case 20: goto L_0x0183;
                case 21: goto L_0x0165;
                case 22: goto L_0x0150;
                case 23: goto L_0x0144;
                case 24: goto L_0x0138;
                case 25: goto L_0x0120;
                case 26: goto L_0x00ae;
                case 27: goto L_0x0106;
                case 28: goto L_0x0076;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r8.A01
            com.whatsapp.voipcalling.ReplyWithMessageDialogFragment r5 = (com.whatsapp.voipcalling.ReplyWithMessageDialogFragment) r5
            java.lang.Object r1 = r8.A02
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.1FL r3 = r5.A1D()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.WaBaseActivity"
            X.C18070vi.A0z(r3, r0)
            X.1FY r3 = (X.AnonymousClass1FY) r3
            int r0 = r1.length
            int r0 = r0 + -1
            if (r10 == r0) goto L_0x0074
            r2 = r1[r10]
        L_0x0023:
            X.1LU r1 = new X.1LU
            r1.<init>()
            com.whatsapp.jid.UserJid r0 = r5.A02
            r6 = 0
            android.content.Intent r4 = r1.A1w(r3, r0, r6)
            r1 = 1
            if (r2 == 0) goto L_0x006e
            java.lang.String r0 = "wa_type"
            r4.putExtra(r0, r6)
            java.lang.String r0 = "share_msg"
            r4.putExtra(r0, r2)
            java.lang.String r0 = "has_share"
            r4.putExtra(r0, r1)
            android.content.Context r0 = r5.A14()
            X.C60392nx.A00(r0, r4)
        L_0x0048:
            X.00H r0 = r5.A01
            if (r0 == 0) goto L_0x032e
            java.lang.Object r2 = r0.get()
            X.6wK r2 = (X.C137976wK) r2
            java.lang.String r1 = r5.A03
            X.C18070vi.A0d(r1, r6)
            r0 = 3
            X.C137976wK.A00(r2, r1, r0, r0)
            java.lang.String r1 = "ReplyWithMessageDialogFragment"
            X.11P r0 = r5.A00
            if (r0 == 0) goto L_0x032b
            X.C60442o2.A00(r4, r0, r1)
            r3.startActivity(r4)
            X.5aV r3 = (X.C107735aV) r3
            r0 = 2
            r3.CEC(r0)
        L_0x006d:
            return
        L_0x006e:
            java.lang.String r0 = "show_keyboard"
            r4.putExtra(r0, r1)
            goto L_0x0048
        L_0x0074:
            r2 = 0
            goto L_0x0023
        L_0x0076:
            java.lang.Object r4 = r8.A01
            com.whatsapp.settings.SettingsUserProxyActivity r4 = (com.whatsapp.settings.SettingsUserProxyActivity) r4
            java.lang.Object r3 = r8.A02
            android.widget.EditText r3 = (android.widget.EditText) r3
            android.text.Editable r0 = r3.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0093
            X.10I r5 = r4.A05
            r0 = 30
            X.4ro r3 = new X.4ro
            r3.<init>((java.lang.Object) r4, (int) r0)
            goto L_0x038c
        L_0x0093:
            X.10I r2 = r4.A05
            r1 = 25
            X.7Pl r0 = new X.7Pl
            r0.<init>(r4, r3, r1)
            r2.CGF(r0)
            androidx.appcompat.widget.SwitchCompat r0 = r4.A05
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x006d
            androidx.appcompat.widget.SwitchCompat r1 = r4.A05
            r0 = 1
            r1.setChecked(r0)
            return
        L_0x00ae:
            java.lang.Object r2 = r8.A01
            com.whatsapp.invites.RevokeInviteDialogFragment r2 = (com.whatsapp.invites.RevokeInviteDialogFragment) r2
            java.lang.Object r1 = r8.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = -1
            if (r10 != r0) goto L_0x006d
            X.5a5 r0 = r2.A02
            if (r0 == 0) goto L_0x006d
            r0.C47(r1)
            return
        L_0x00c1:
            java.lang.Object r2 = r8.A01
            X.1ju r2 = (X.C34091ju) r2
            java.lang.Object r1 = r8.A02
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x006d
            r0 = 1
            X.C34091ju.A00(r2, r1, r0)
            com.whatsapp.conversationslist.ConversationsFragment r0 = r2.A0Q
            X.10I r5 = r0.A2f
            r0 = 17
            X.3Bw r3 = new X.3Bw
            r3.<init>(r2, r1, r0)
            goto L_0x038c
        L_0x00e0:
            java.lang.Object r0 = r8.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.Object r2 = r8.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            androidx.fragment.app.Fragment r1 = r0.A0E
            boolean r0 = r1 instanceof com.whatsapp.contact.picker.ContactPickerFragment
            if (r0 == 0) goto L_0x006d
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            if (r1 == 0) goto L_0x006d
            r1.A2Z(r2)
            return
        L_0x00f6:
            java.lang.Object r0 = r8.A01
            com.whatsapp.blocklist.UnblockDialogFragment r0 = (com.whatsapp.blocklist.UnblockDialogFragment) r0
            java.lang.Object r1 = r8.A02
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x006d
            r1.finish()
            return
        L_0x0106:
            java.lang.Object r1 = r8.A01
            com.whatsapp.settings.SettingsContactsActivity r1 = (com.whatsapp.settings.SettingsContactsActivity) r1
            java.lang.Object r0 = r8.A02
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r0 = r0.isChecked()
            r1.A0a = r0
            androidx.appcompat.widget.SwitchCompat r0 = r1.A07
            if (r0 != 0) goto L_0x011c
            java.lang.String r0 = "contactSyncSwitch"
            goto L_0x0330
        L_0x011c:
            r0.toggle()
            return
        L_0x0120:
            java.lang.Object r1 = r8.A01
            com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment r1 = (com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment) r1
            java.lang.Object r2 = r8.A02
            X.1FL r2 = (X.AnonymousClass1FL) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.00H r0 = r1.A00
            if (r0 == 0) goto L_0x02b2
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r0 = "invite-via-link-unavailable"
            goto L_0x02ae
        L_0x0138:
            java.lang.Object r1 = r8.A01
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r8.A02
            com.whatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog r0 = (com.whatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog) r0
            com.whatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog.A01(r1, r0)
            return
        L_0x0144:
            java.lang.Object r1 = r8.A01
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r8.A02
            com.whatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog r0 = (com.whatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog) r0
            com.whatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog.A00(r1, r0)
            return
        L_0x0150:
            java.lang.Object r4 = r8.A01
            com.whatsapp.base.WaDialogFragment r4 = (com.whatsapp.base.WaDialogFragment) r4
            java.lang.Object r1 = r8.A02
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.10I r3 = r4.A04
            r0 = 29
            X.7Qq r2 = new X.7Qq
            r2.<init>(r4, r1, r0)
            goto L_0x02d4
        L_0x0165:
            java.lang.Object r1 = r8.A01
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r3 = r8.A02
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.1i2 r0 = X.C32961i2.LEAVE_GROUPS
            com.whatsapp.mute.ui.MuteDialogFragment r2 = X.AnonymousClass4Z1.A02(r0, r1)
            X.1GP r1 = r3.A1F()
            r0 = 0
            r2.A2C(r1, r0)
            r3.A28()
            return
        L_0x0183:
            java.lang.Object r1 = r8.A01
            com.whatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment r1 = (com.whatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment) r1
            java.lang.Object r0 = r8.A02
            android.os.Bundle r0 = (android.os.Bundle) r0
            r1.A2I(r0)
            return
        L_0x018f:
            java.lang.Object r1 = r8.A01
            com.whatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment r1 = (com.whatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment) r1
            java.lang.Object r0 = r8.A02
            android.os.Bundle r0 = (android.os.Bundle) r0
            r1.A2H(r0)
            return
        L_0x019b:
            java.lang.Object r5 = r8.A01
            com.whatsapp.dialogs.CreateOrAddToContactsDialog r5 = (com.whatsapp.dialogs.CreateOrAddToContactsDialog) r5
            java.lang.Object r1 = r8.A02
            java.util.List r1 = (java.util.List) r1
            X.1Fd r0 = r5.A00
            X.C17960vV.A07(r0)
            java.lang.String r0 = r5.A01
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A02(r0)
            java.lang.Object r0 = r1.get(r10)
            X.4QC r0 = (X.AnonymousClass4QC) r0
            int r3 = r0.A00
            r2 = 2131432546(0x7f0b1462, float:1.8486853E38)
            X.1Fd r1 = r5.A00
            boolean r0 = r5.A02
            if (r3 != r2) goto L_0x01c3
            r1.BqW(r4, r0)
            return
        L_0x01c3:
            r1.Bl8(r4, r0)
            return
        L_0x01c7:
            java.lang.Object r5 = r8.A01
            X.3wG r5 = (X.C79923wG) r5
            java.lang.Object r0 = r8.A02
            X.206 r0 = (X.AnonymousClass206) r0
            X.205 r4 = r0.A0v
            X.C18070vi.A0W(r4)
            X.00H r0 = r5.A04
            java.lang.Object r0 = r0.get()
            X.2lL r0 = (X.C58842lL) r0
            X.206 r3 = r0.A02(r4)
            X.00H r0 = r5.A05
            java.lang.Object r2 = r0.get()
            X.2i3 r2 = (X.C56802i3) r2
            java.lang.String r1 = "cta_cancel_reminder"
            java.lang.String r0 = "cta_reminder"
            r2.A00(r3, r1, r0)
            X.1BI r2 = r4.A00
            X.10I r1 = r5.A03
            r0 = 24
            X.C98714rb.A00(r1, r2, r5, r3, r0)
            X.00H r0 = r5.A06
            java.lang.Object r0 = r0.get()
            X.2rh r0 = (X.C62622rh) r0
            r0.A02(r3)
            return
        L_0x0204:
            java.lang.Object r3 = r8.A01
            com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r3 = (com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment) r3
            java.lang.Object r2 = r8.A02
            android.net.Uri r2 = (android.net.Uri) r2
            r0 = 2
            X.3zG r1 = r3.A0A
            if (r1 == 0) goto L_0x021c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.18K r0 = r3.A09
            r0.CC7(r1)
        L_0x021c:
            android.content.Intent r2 = X.AnonymousClass3MY.A07(r2)
            X.1L9 r1 = r3.A00
            android.content.Context r0 = r3.A1n()
            r1.A08(r0, r2)
            r3.A29()
            return
        L_0x022d:
            java.lang.Object r3 = r8.A01
            X.48m r3 = (X.AnonymousClass48m) r3
            java.lang.Object r2 = r8.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r3.A01
            X.3so r1 = (X.C78443so) r1
            java.util.ArrayList r0 = r1.A0b
            int r0 = r0.size()
            java.lang.String r4 = X.C17880vN.A0w(r2, r10)
            if (r10 >= r0) goto L_0x0257
            X.733 r3 = r1.A07
            android.content.Context r2 = r1.getContext()
            r0 = 18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "sms:"
            r3.A04(r2, r1, r4, r0)
            return
        L_0x0257:
            r3.A05(r4)
            return
        L_0x025b:
            java.lang.Object r3 = r8.A01
            X.1iW r3 = (X.C33251iW) r3
            java.lang.Object r2 = r8.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            java.lang.Integer r1 = X.C17880vN.A0j()
            r0 = 1
            r3.A0V(r2, r1, r0)
            return
        L_0x026c:
            java.lang.Object r3 = r8.A01
            X.DOe r3 = (X.C26982DOe) r3
            java.lang.Object r2 = r8.A02
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            android.app.Activity r1 = r3.A02
            r0 = 1
            X.AnonymousClass4Yv.A00(r1, r0)
            X.C26982DOe.A01(r3, r2)
            return
        L_0x027e:
            java.lang.Object r3 = r8.A01
            com.whatsapp.conversation.ChangeNumberNotificationDialogFragment r3 = (com.whatsapp.conversation.ChangeNumberNotificationDialogFragment) r3
            java.lang.Object r0 = r8.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.1LU r2 = r3.A03
            X.1FL r1 = r3.A1B()
            X.1BI r0 = r0.A0J
            android.content.Intent r1 = X.AnonymousClass3MY.A06(r1, r2, r0)
            X.11P r0 = r3.A02
            X.C137086ut.A00(r1, r3, r0)
            return
        L_0x0298:
            java.lang.Object r1 = r8.A01
            com.whatsapp.community.suspend.CommunityIntegrityDeactivatedDialogFragment r1 = (com.whatsapp.community.suspend.CommunityIntegrityDeactivatedDialogFragment) r1
            java.lang.Object r2 = r8.A02
            X.1FL r2 = (X.AnonymousClass1FL) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.00H r0 = r1.A00
            if (r0 == 0) goto L_0x02b2
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r0 = "community-no-longer-available"
        L_0x02ae:
            r1.A01(r2, r0)
            return
        L_0x02b2:
            java.lang.String r0 = "contextualHelpHandler"
            goto L_0x0330
        L_0x02b5:
            java.lang.Object r1 = r8.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r8.A02
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            android.content.Intent r0 = X.AnonymousClass1LU.A0l(r1, r0)
            r1.startActivity(r0)
            return
        L_0x02c5:
            java.lang.Object r4 = r8.A01
            com.whatsapp.community.CommunityExitDialogFragment r4 = (com.whatsapp.community.CommunityExitDialogFragment) r4
            java.lang.Object r1 = r8.A02
            X.10I r3 = r4.A0D
            r0 = 46
            X.7RL r2 = new X.7RL
            r2.<init>(r4, r1, r0)
        L_0x02d4:
            r3.CGF(r2)
            goto L_0x036b
        L_0x02d9:
            java.lang.Object r7 = r8.A01
            com.whatsapp.community.CommunityExitDialogFragment r7 = (com.whatsapp.community.CommunityExitDialogFragment) r7
            java.lang.Object r6 = r8.A02
            java.util.List r6 = (java.util.List) r6
            X.11t r5 = r7.A04
            android.content.Context r4 = r7.A14()
            int r3 = r6.size()
            X.1EC r2 = r7.A0A
            r1 = 6
            X.4bC r0 = new X.4bC
            r0.<init>((java.lang.Object) r7, (java.lang.Object) r6, (int) r1)
            r5.CMf(r4, r0, r2, r3)
            return
        L_0x02f7:
            java.lang.Object r3 = r8.A01
            com.whatsapp.community.CommunityDeleteDialogFragment r3 = (com.whatsapp.community.CommunityDeleteDialogFragment) r3
            java.lang.Object r5 = r8.A02
            java.util.List r5 = (java.util.List) r5
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            X.1FL r2 = X.C72453Mb.A0Z(r3)
            X.1FU r2 = (X.AnonymousClass1FU) r2
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r2.CNA(r0)
            X.11P r0 = r3.A04
            if (r0 == 0) goto L_0x032b
            long r6 = android.os.SystemClock.elapsedRealtime()
            java.lang.ref.WeakReference r4 = X.AnonymousClass3MW.A0z(r2)
            X.10I r0 = r3.A07
            if (r0 == 0) goto L_0x0328
            X.498 r1 = new X.498
            r1.<init>(r2, r3, r4, r5, r6)
            X.C17890vO.A0u(r1, r0)
            return
        L_0x0328:
            java.lang.String r0 = "waWorkers"
            goto L_0x0330
        L_0x032b:
            java.lang.String r0 = "time"
            goto L_0x0330
        L_0x032e:
            java.lang.String r0 = "incomingCallLogger"
        L_0x0330:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0335:
            java.lang.Object r2 = r8.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r0 = r8.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            android.content.Context r1 = r2.A14()
            X.1BI r0 = r0.A0J
            X.C17960vV.A07(r0)
            java.lang.String r0 = r0.getRawString()
            android.content.Intent r0 = X.AnonymousClass1LU.A1N(r1, r0)
            r2.A1k(r0)
            return
        L_0x0352:
            java.lang.Object r4 = r8.A01
            com.whatsapp.DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment r4 = (com.whatsapp.DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment) r4
            java.lang.Object r2 = r8.A02
            android.content.Context r2 = (android.content.Context) r2
            X.129 r1 = r4.A01
            java.lang.String r0 = "30035737"
            android.net.Uri r0 = r1.A04(r0)
            android.content.Intent r1 = X.AnonymousClass3MY.A07(r0)
            X.1L9 r0 = r4.A00
            r0.A08(r2, r1)
        L_0x036b:
            r4.A28()
            return
        L_0x036f:
            java.lang.Object r1 = r8.A01
            X.5ah r1 = (X.C107835ah) r1
            java.lang.Object r0 = r8.A02
            X.5ag r0 = (X.C107825ag) r0
            r1.Br5()
            r0.C31()
            return
        L_0x037e:
            java.lang.Object r2 = r8.A01
            X.1py r2 = (X.C37691py) r2
            java.lang.Object r1 = r8.A02
            X.10I r5 = r2.A05
            r0 = 7
            X.3Bw r3 = new X.3Bw
            r3.<init>(r1, r2, r0)
        L_0x038c:
            r5.CGF(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4bC.onClick(android.content.DialogInterface, int):void");
    }

    public AnonymousClass4bC(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
