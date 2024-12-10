package X;

import android.widget.BaseAdapter;
import com.whatsapp.Conversation;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;
import com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.profile.ProfileInfoActivity;
import com.whatsapp.profile.SetAboutInfo;
import com.whatsapp.settings.SettingsTabActivity;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4k9  reason: invalid class name and case insensitive filesystem */
public class C94164k9 implements C23581Gv {
    public final int A00;
    public final Object A01;

    public static Object A00(C94164k9 r1, Object obj) {
        C18070vi.A0d(obj, 0);
        return r1.A01;
    }

    public C94164k9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* synthetic */ void Bkk(UserJid userJid) {
        switch (this.A00) {
            case 2:
                CallLogActivity callLogActivity = (CallLogActivity) this.A01;
                if (callLogActivity.A0N.equals(userJid)) {
                    CallLogActivity.A0Q(callLogActivity);
                    return;
                }
                return;
            case 5:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A01;
                if (userJid.equals(C22941Dw.A02(C72453Mb.A0u(contactInfoActivity)))) {
                    contactInfoActivity.A0k.A0V();
                    return;
                }
                return;
            case 6:
                ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A01;
                if (!listChatInfoActivity.A02.A0O(userJid)) {
                    AnonymousClass1E7.A03(new C133356oc(listChatInfoActivity.A0E.A0H(userJid)), listChatInfoActivity.A0g);
                    listChatInfoActivity.A07.notifyDataSetChanged();
                    return;
                }
                return;
            case 9:
                AnonymousClass3gf r2 = (AnonymousClass3gf) this.A01;
                r2.A50(new C133356oc(r2.A06.A0H(userJid)));
                return;
            case 11:
                C75433hU r1 = (C75433hU) A00(this, userJid);
                if (r1.A0G(userJid)) {
                    r1.A0C();
                    return;
                }
                return;
            case 19:
                if (userJid != null && !C22971Dz.A0e(userJid)) {
                    GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A01;
                    if (GroupAdminPickerActivity.A0d(groupAdminPickerActivity, userJid)) {
                        AnonymousClass1E7.A03(new C133356oc(groupAdminPickerActivity.A05.A0H(userJid)), groupAdminPickerActivity.A0M);
                        groupAdminPickerActivity.A0D.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) A00(this, userJid);
                if (!newsletterInfoActivity.A02.A0O(userJid)) {
                    A01(newsletterInfoActivity, userJid);
                    return;
                }
                return;
            case 21:
                ProfileInfoActivity profileInfoActivity = (ProfileInfoActivity) this.A01;
                if (profileInfoActivity.A02.A0O(userJid)) {
                    profileInfoActivity.A0P.setSubText(C72453Mb.A10(profileInfoActivity.A0T));
                    AnonymousClass4YE.A00(profileInfoActivity.A0S, 3, 2);
                    return;
                }
                return;
            case 23:
                SetAboutInfo setAboutInfo = (SetAboutInfo) this.A01;
                if (setAboutInfo.A02.A0O(userJid)) {
                    String A10 = C72453Mb.A10(setAboutInfo.A05);
                    if (setAboutInfo.A06) {
                        setAboutInfo.A06 = false;
                        Iterator it = SetAboutInfo.A0A.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                SetAboutInfo.A0A.add(0, A10);
                            } else if (C17880vN.A0v(it).equals(A10)) {
                            }
                        }
                        SetAboutInfo.A03(setAboutInfo);
                    }
                    TextEmojiLabel textEmojiLabel = setAboutInfo.A01;
                    AnonymousClass3MY.A0u(textEmojiLabel.getContext(), setAboutInfo.A01.getPaint(), textEmojiLabel, setAboutInfo.A0D, A10);
                    setAboutInfo.A03.notifyDataSetInvalidated();
                    C89964dJ.A00(setAboutInfo.A00, this, 43);
                    return;
                }
                return;
            case 25:
                SettingsTabActivity settingsTabActivity = (SettingsTabActivity) this.A01;
                if (settingsTabActivity.A02.A0O(userJid)) {
                    if (!C18020vd.A05(C18040vf.A02, settingsTabActivity.A0E, 4921)) {
                        settingsTabActivity.A0F.A0R(C72453Mb.A10(settingsTabActivity.A0j));
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bm3() {
        switch (this.A00) {
            case 21:
                ProfileInfoActivity profileInfoActivity = (ProfileInfoActivity) this.A01;
                if (C72453Mb.A1V(profileInfoActivity)) {
                    Log.a("profileinfoactivity/contactobserver/onAvatarPoseSaved");
                    ProfileInfoActivity.A0c(profileInfoActivity, true);
                    return;
                }
                return;
            case 24:
                AnonymousClass3MW.A1U(this.A01);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bmh(Collection collection) {
        switch (this.A00) {
            case 5:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A01;
                ContactInfoActivity.A15(contactInfoActivity);
                ContactInfoActivity.A17(contactInfoActivity);
                return;
            case 9:
                ((AnonymousClass3gf) this.A01).A01.notifyDataSetChanged();
                return;
            case 18:
                ChangeEphemeralSettingActivity changeEphemeralSettingActivity = (ChangeEphemeralSettingActivity) this.A01;
                C18100vl r2 = changeEphemeralSettingActivity.A0F;
                if (C22971Dz.A0d(AnonymousClass3MW.A0h(r2))) {
                    AnonymousClass00H r0 = changeEphemeralSettingActivity.A0B;
                    if (r0 != null) {
                        C37551pj A0V = AnonymousClass3MW.A0V(r0);
                        C22941Dw r02 = UserJid.Companion;
                        if (A0V.A0P(C22941Dw.A01(AnonymousClass3MW.A0h(r2))) && !changeEphemeralSettingActivity.isFinishing()) {
                            AnonymousClass1KB r22 = changeEphemeralSettingActivity.A05;
                            int i = 2131889947;
                            if (changeEphemeralSettingActivity.A00 == 0) {
                                i = 2131889946;
                            }
                            r22.A08(i, 1);
                            changeEphemeralSettingActivity.finish();
                            return;
                        }
                        return;
                    }
                    C18070vi.A11("blockListManager");
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bpv() {
    }

    public void Bpw(UserJid userJid) {
        switch (this.A00) {
            case 0:
                Conversation conversation = (Conversation) this.A01;
                if (userJid.equals(AnonymousClass3MW.A0j(conversation.A03))) {
                    AnonymousClass4aY.A1E(conversation.A03);
                    return;
                }
                return;
            case 11:
                C75433hU r1 = (C75433hU) A00(this, userJid);
                if (r1.A0G(userJid)) {
                    r1.A0C();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bq0(Collection collection) {
        switch (this.A00) {
            case 2:
                CallLogActivity.A0Q((CallLogActivity) this.A01);
                return;
            case 9:
                ((AnonymousClass3gf) this.A01).A4r();
                return;
            case 11:
                C75433hU r2 = (C75433hU) A00(this, collection);
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        if (r2.A0G(C72453Mb.A0l(it))) {
                            r2.A0I();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 12:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    AnonymousClass1BI A0l = C72453Mb.A0l(it2);
                    if (A0l != null) {
                        C75423hT r1 = (C75423hT) this.A01;
                        if (A0l.equals(r1.A0G)) {
                            C75423hT.A00(r1);
                            r1.A01.invalidateOptionsMenu();
                            return;
                        }
                    }
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bq1(Collection collection) {
        BaseAdapter baseAdapter;
        AnonymousClass3VS r1;
        switch (this.A00) {
            case 1:
                ((BusinessProfileExtraFieldsActivity) this.A01).A4b();
                return;
            case 2:
                CallLogActivity.A0Q((CallLogActivity) this.A01);
                return;
            case 5:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A01;
                contactInfoActivity.A0k.A0V();
                contactInfoActivity.A2X();
                ContactInfoActivity.A1F(contactInfoActivity, true, false);
                return;
            case 6:
                C76793oR r2 = ((ListChatInfoActivity) this.A01).A08;
                C98754rf.A01(r2.A0H, r2, 0);
                return;
            case 7:
                if (collection != null) {
                    AnonymousClass4Xp r22 = (AnonymousClass4Xp) this.A01;
                    if (collection.contains(r22.A0I)) {
                        Iterator A002 = AnonymousClass4Xp.A00(r22);
                        while (A002.hasNext()) {
                            ((C107955at) A002.next()).C05();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((AnonymousClass3gf) this.A01).A4r();
                return;
            case 10:
                InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = ((InviteNonWhatsAppContactPickerActivity) this.A01).A0D;
                if (inviteNonWhatsAppContactPickerViewModel == null) {
                    AnonymousClass3MW.A1H();
                    throw null;
                }
                inviteNonWhatsAppContactPickerViewModel.A0M.clear();
                C22801Dg r4 = inviteNonWhatsAppContactPickerViewModel.A0A;
                AnonymousClass1DT r3 = inviteNonWhatsAppContactPickerViewModel.A0F;
                r4.A0G(r3);
                inviteNonWhatsAppContactPickerViewModel.A0K.A00(new C26587D5b(inviteNonWhatsAppContactPickerViewModel, 3), r3, r4);
                return;
            case 11:
                ((C75433hU) this.A01).A0I();
                return;
            case 12:
                C75423hT.A00((C75423hT) this.A01);
                return;
            case 15:
                baseAdapter = ((MediaAlbumActivity) this.A01).A0A;
                break;
            case 16:
                baseAdapter = ((MessageDetailsActivity) this.A01).A01;
                break;
            case 17:
                ((C79333vF) this.A01).A04.notifyDataSetChanged();
                return;
            case 19:
                GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A01;
                GroupAdminPickerActivity.A0c(groupAdminPickerActivity, groupAdminPickerActivity.A0I);
                return;
            case 20:
                NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A01;
                if (NewsletterInfoActivity.A1S(newsletterInfoActivity) && (r1 = newsletterInfoActivity.A0f) != null) {
                    r1.A0T(AnonymousClass9IV.SHORT);
                    return;
                }
                return;
            default:
                return;
        }
        baseAdapter.notifyDataSetChanged();
    }

    public /* synthetic */ void Bq3(Collection collection) {
        if (5 - this.A00 == 0) {
            ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A01;
            if (AnonymousClass3MX.A1W(contactInfoActivity.A0E)) {
                contactInfoActivity.A0k.A0V();
                contactInfoActivity.A2X();
            }
        }
    }

    public /* synthetic */ void Brx(UserJid userJid) {
        BaseAdapter baseAdapter;
        switch (this.A00) {
            case 1:
                BusinessProfileExtraFieldsActivity businessProfileExtraFieldsActivity = (BusinessProfileExtraFieldsActivity) this.A01;
                if (userJid.equals(businessProfileExtraFieldsActivity.A09)) {
                    businessProfileExtraFieldsActivity.A4b();
                    return;
                }
                return;
            case 2:
                CallLogActivity callLogActivity = (CallLogActivity) this.A01;
                if (callLogActivity.A0N.equals(userJid)) {
                    CallLogActivity.A0Q(callLogActivity);
                    return;
                }
                return;
            case 3:
                AnonymousClass3XM.A00(((GroupCallLogActivity) this.A01).A02, userJid);
                return;
            case 4:
                ParticipantsListViewModel participantsListViewModel = (ParticipantsListViewModel) this.A01;
                AnonymousClass3VX.A00(participantsListViewModel.A06, participantsListViewModel);
                return;
            case 5:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A01;
                if (!userJid.equals(C22941Dw.A02(C72453Mb.A0u(contactInfoActivity)))) {
                    C133356oc r1 = new C133356oc(contactInfoActivity.A0E.A0H(userJid));
                    C73033Os r0 = contactInfoActivity.A0h;
                    if (r0 != null && AnonymousClass1E7.A03(r1, r0.A02)) {
                        baseAdapter = contactInfoActivity.A0h;
                        break;
                    } else {
                        return;
                    }
                } else {
                    contactInfoActivity.A0k.A0V();
                    return;
                }
            case 6:
                if (!C22971Dz.A0e(userJid)) {
                    ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A01;
                    AnonymousClass1E7.A03(new C133356oc(listChatInfoActivity.A0E.A0H(userJid)), listChatInfoActivity.A0g);
                    baseAdapter = listChatInfoActivity.A07;
                    break;
                } else {
                    return;
                }
            case 9:
                AnonymousClass3gf r2 = (AnonymousClass3gf) this.A01;
                r2.A50(new C133356oc(r2.A06.A0H(userJid)));
                return;
            case 11:
                C75433hU r12 = (C75433hU) A00(this, userJid);
                if (r12.A0G(userJid)) {
                    r12.A0I();
                    return;
                }
                return;
            case 12:
                C75423hT r22 = (C75423hT) this.A01;
                if (userJid.equals(r22.A0G)) {
                    boolean A0C = r22.A00.A0C();
                    C75423hT.A00(r22);
                    if (A0C != r22.A00.A0C()) {
                        r22.A01.invalidateOptionsMenu();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                baseAdapter = ((MediaAlbumActivity) this.A01).A0A;
                break;
            case 16:
                MessageDetailsActivity messageDetailsActivity = (MessageDetailsActivity) this.A01;
                for (C87034Ua r02 : messageDetailsActivity.A0b) {
                    if (userJid.equals(r02.A02)) {
                        baseAdapter = messageDetailsActivity.A01;
                        break;
                    }
                }
                return;
            case 17:
                ((C79333vF) this.A01).A04.notifyDataSetChanged();
                return;
            case 19:
                if (userJid != null && !C22971Dz.A0e(userJid)) {
                    GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A01;
                    if (GroupAdminPickerActivity.A0d(groupAdminPickerActivity, userJid)) {
                        AnonymousClass1E7.A03(new C133356oc(groupAdminPickerActivity.A05.A0H(userJid)), groupAdminPickerActivity.A0M);
                        GroupAdminPickerActivity.A0c(groupAdminPickerActivity, groupAdminPickerActivity.A0I);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) A00(this, userJid);
                AnonymousClass1E7 r03 = newsletterInfoActivity.A0c;
                if (r03 == null) {
                    C18070vi.A11("contact");
                    throw null;
                } else if (!userJid.equals(r03.A0J)) {
                    A01(newsletterInfoActivity, userJid);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
        baseAdapter.notifyDataSetChanged();
    }

    public /* synthetic */ void BtU(UserJid userJid) {
        switch (this.A00) {
            case 5:
            case 9:
                Bkk(userJid);
                return;
            case 11:
                C75433hU r1 = (C75433hU) A00(this, userJid);
                if (r1.A0G(userJid)) {
                    r1.A0H = r1.A0c.A01(userJid);
                    r1.A0C();
                    return;
                }
                return;
            case 25:
                SettingsTabActivity settingsTabActivity = (SettingsTabActivity) this.A01;
                if (settingsTabActivity.A02.A0O(userJid)) {
                    if (C18020vd.A05(C18040vf.A02, settingsTabActivity.A0E, 4921)) {
                        if (settingsTabActivity.A03 == null) {
                            SettingsTabActivity.A0c(settingsTabActivity);
                        }
                        settingsTabActivity.A0T.A01(((C136846uV) settingsTabActivity.A0u.get()).A00());
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0200, code lost:
        r0.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0203, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00eb, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ed, code lost:
        r0.A01((X.C29681ch) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0135, code lost:
        if (r1 == null) goto L_0x0137;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void C1w(X.AnonymousClass1BI r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 2: goto L_0x0204;
                case 3: goto L_0x021e;
                case 4: goto L_0x0005;
                case 5: goto L_0x01cf;
                case 6: goto L_0x01b2;
                case 7: goto L_0x0190;
                case 8: goto L_0x0161;
                case 9: goto L_0x0148;
                case 10: goto L_0x0005;
                case 11: goto L_0x0112;
                case 12: goto L_0x0005;
                case 13: goto L_0x00f3;
                case 14: goto L_0x00dd;
                case 15: goto L_0x00d5;
                case 16: goto L_0x00b3;
                case 17: goto L_0x0214;
                case 18: goto L_0x0005;
                case 19: goto L_0x0087;
                case 20: goto L_0x0060;
                case 21: goto L_0x0046;
                case 22: goto L_0x002c;
                case 23: goto L_0x0005;
                case 24: goto L_0x0020;
                case 25: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r1 = r6.A01
            com.whatsapp.settings.SettingsTabActivity r1 = (com.whatsapp.settings.SettingsTabActivity) r1
            X.1E7 r0 = r1.A0S
            if (r0 == 0) goto L_0x0005
            X.11S r0 = r1.A02
            boolean r0 = r0.A0O(r7)
            if (r0 == 0) goto L_0x0005
            X.1E8 r0 = X.AnonymousClass3MY.A0P(r1)
            r1.A0S = r0
            com.whatsapp.settings.SettingsTabActivity.A0q(r1)
            return
        L_0x0020:
            java.lang.Object r1 = r6.A01
            com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity r1 = (com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity) r1
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x0005
            r1.finish()
            return
        L_0x002c:
            java.lang.Object r1 = r6.A01
            com.whatsapp.profile.ProfilePhotoReminder r1 = (com.whatsapp.profile.ProfilePhotoReminder) r1
            X.1E7 r0 = r1.A07
            if (r0 == 0) goto L_0x0005
            X.11S r0 = r1.A02
            boolean r0 = r0.A0O(r7)
            if (r0 == 0) goto L_0x0005
            X.1E8 r0 = X.AnonymousClass3MY.A0P(r1)
            r1.A07 = r0
            com.whatsapp.profile.ProfilePhotoReminder.A03(r1)
            return
        L_0x0046:
            java.lang.Object r1 = r6.A01
            com.whatsapp.profile.ProfileInfoActivity r1 = (com.whatsapp.profile.ProfileInfoActivity) r1
            X.1E7 r0 = r1.A0H
            if (r0 == 0) goto L_0x0005
            X.11S r0 = r1.A02
            boolean r0 = r0.A0O(r7)
            if (r0 == 0) goto L_0x0005
            X.1E8 r0 = X.AnonymousClass3MY.A0P(r1)
            r1.A0H = r0
            com.whatsapp.profile.ProfileInfoActivity.A0Q(r1)
            return
        L_0x0060:
            java.lang.Object r1 = A00(r6, r7)
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            X.1E7 r0 = r1.A0c
            if (r0 != 0) goto L_0x0071
            java.lang.String r0 = "contact"
        L_0x006c:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0071:
            X.1BI r0 = r0.A0J
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0080
            X.3oU r0 = r1.A0g
            if (r0 != 0) goto L_0x0228
            java.lang.String r0 = "newsletterInfoViewModel"
            goto L_0x006c
        L_0x0080:
            boolean r0 = r7 instanceof X.C29681ch
            if (r0 == 0) goto L_0x022c
            X.7KN r0 = r1.A0l
            goto L_0x00eb
        L_0x0087:
            if (r7 == 0) goto L_0x0005
            boolean r0 = X.C22971Dz.A0e(r7)
            if (r0 != 0) goto L_0x0005
            java.lang.Object r2 = r6.A01
            com.whatsapp.group.GroupAdminPickerActivity r2 = (com.whatsapp.group.GroupAdminPickerActivity) r2
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r7)
            boolean r0 = com.whatsapp.group.GroupAdminPickerActivity.A0d(r2, r0)
            if (r0 == 0) goto L_0x0005
            X.1M9 r0 = r2.A05
            X.1E7 r0 = r0.A0H(r7)
            X.5yh r1 = new X.5yh
            r1.<init>(r0)
            java.util.List r0 = r2.A0M
            X.AnonymousClass1E7.A03(r1, r0)
            X.3Wd r0 = r2.A0D
            r0.notifyDataSetChanged()
            return
        L_0x00b3:
            java.lang.Object r2 = r6.A01
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r2 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r2
            java.util.List r0 = r2.A0b
            java.util.Iterator r1 = r0.iterator()
        L_0x00bd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0005
            java.lang.Object r0 = r1.next()
            X.4Ua r0 = (X.C87034Ua) r0
            com.whatsapp.jid.UserJid r0 = r0.A02
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00bd
            android.widget.BaseAdapter r0 = r2.A01
            goto L_0x0200
        L_0x00d5:
            java.lang.Object r0 = r6.A01
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r0 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r0
            X.3Ot r0 = r0.A0A
            goto L_0x0200
        L_0x00dd:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            boolean r0 = r7 instanceof X.C29681ch
            if (r0 == 0) goto L_0x0005
            java.lang.Object r0 = r6.A01
            X.3rs r0 = (X.C77953rs) r0
            X.7KN r0 = r0.A02
        L_0x00eb:
            if (r0 == 0) goto L_0x0005
            X.1ch r7 = (X.C29681ch) r7
            r0.A01(r7)
            return
        L_0x00f3:
            java.lang.Object r2 = r6.A01
            X.3ra r2 = (X.C77843ra) r2
            X.01E r1 = r2.A01
            r0 = 2131433420(0x7f0b17cc, float:1.8488625E38)
            android.view.View r4 = r1.findViewById(r0)
            boolean r0 = r4 instanceof com.whatsapp.WaImageButton
            if (r0 == 0) goto L_0x0005
            X.1kb r3 = r2.A09
            X.1EC r2 = r2.A0J
            r1 = 0
            X.4fR r0 = new X.4fR
            r0.<init>(r6, r7, r4, r1)
            r3.A0F(r0, r2)
            return
        L_0x0112:
            r3 = 0
            X.C18070vi.A0d(r7, r3)
            java.lang.Object r2 = r6.A01
            X.3hU r2 = (X.C75433hU) r2
            boolean r0 = r2.A0G(r7)
            if (r0 == 0) goto L_0x0005
            android.widget.ProgressBar r1 = r2.A08
            if (r1 != 0) goto L_0x0142
            android.view.ViewStub r0 = r2.A05
            if (r0 == 0) goto L_0x0137
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.ProgressBar"
            X.C18070vi.A0z(r1, r0)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r2.A08 = r1
            if (r1 != 0) goto L_0x0142
        L_0x0137:
            android.widget.ImageView r0 = r2.A09()
            r0.setVisibility(r3)
            r2.A0I()
            return
        L_0x0142:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0137
        L_0x0148:
            boolean r0 = X.C22971Dz.A0e(r7)
            if (r0 != 0) goto L_0x0005
            java.lang.Object r2 = r6.A01
            X.3gf r2 = (X.AnonymousClass3gf) r2
            X.1M9 r0 = r2.A06
            X.1E7 r1 = r0.A0H(r7)
            X.5yh r0 = new X.5yh
            r0.<init>(r1)
            r2.A50(r0)
            return
        L_0x0161:
            boolean r0 = X.C22971Dz.A0e(r7)
            if (r0 == 0) goto L_0x0005
            java.lang.Object r5 = r6.A01
            com.whatsapp.community.EditCommunityActivity r5 = (com.whatsapp.community.EditCommunityActivity) r5
            com.whatsapp.jid.GroupJid r0 = r5.A07
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0005
            X.1Tv r1 = r5.A03
            X.1E7 r0 = r5.A06
            r1.A00(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168001(0x7f070b01, float:1.7950291E38)
            int r4 = r1.getDimensionPixelSize(r0)
            X.1pZ r3 = r5.A04
            X.1E7 r2 = r5.A06
            r1 = 0
            android.widget.ImageView r0 = r5.A03
            r3.A0B(r0, r2, r4, r1)
            return
        L_0x0190:
            java.lang.Object r1 = A00(r6, r7)
            X.4Xp r1 = (X.AnonymousClass4Xp) r1
            X.1EC r0 = r1.A0I
            boolean r0 = X.C18070vi.A18(r0, r7)
            if (r0 == 0) goto L_0x0005
            java.util.Iterator r1 = X.AnonymousClass4Xp.A00(r1)
        L_0x01a2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0005
            java.lang.Object r0 = r1.next()
            X.5at r0 = (X.C107955at) r0
            r0.C05()
            goto L_0x01a2
        L_0x01b2:
            boolean r0 = X.C22971Dz.A0e(r7)
            if (r0 != 0) goto L_0x0005
            java.lang.Object r2 = r6.A01
            com.whatsapp.chatinfo.ListChatInfoActivity r2 = (com.whatsapp.chatinfo.ListChatInfoActivity) r2
            X.1M9 r0 = r2.A0E
            X.1E7 r0 = r0.A0H(r7)
            X.5yh r1 = new X.5yh
            r1.<init>(r0)
            java.util.ArrayList r0 = r2.A0g
            X.AnonymousClass1E7.A03(r1, r0)
            X.3Of r0 = r2.A07
            goto L_0x0200
        L_0x01cf:
            java.lang.Object r2 = r6.A01
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            java.lang.String r0 = X.C72453Mb.A0u(r2)
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A02(r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x01e7
            X.3oT r0 = r2.A0k
            r0.A0V()
            return
        L_0x01e7:
            X.1M9 r0 = r2.A0E
            X.1E7 r0 = r0.A0H(r7)
            X.5yh r1 = new X.5yh
            r1.<init>(r0)
            X.3Os r0 = r2.A0h
            if (r0 == 0) goto L_0x0005
            java.util.List r0 = r0.A02
            boolean r0 = X.AnonymousClass1E7.A03(r1, r0)
            if (r0 == 0) goto L_0x0005
            X.3Os r0 = r2.A0h
        L_0x0200:
            r0.notifyDataSetChanged()
            return
        L_0x0204:
            java.lang.Object r1 = r6.A01
            com.whatsapp.calling.callhistory.CallLogActivity r1 = (com.whatsapp.calling.callhistory.CallLogActivity) r1
            X.1BI r0 = r1.A0N
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0005
            com.whatsapp.calling.callhistory.CallLogActivity.A0Q(r1)
            return
        L_0x0214:
            java.lang.Object r0 = r6.A01
            X.3vF r0 = (X.C79333vF) r0
            X.5cH r0 = r0.A04
            r0.notifyDataSetChanged()
            return
        L_0x021e:
            java.lang.Object r0 = r6.A01
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity r0 = (com.whatsapp.calling.callhistory.group.GroupCallLogActivity) r0
            X.3XM r0 = r0.A02
            X.AnonymousClass3XM.A00(r0, r7)
            return
        L_0x0228:
            r0.A0W()
            return
        L_0x022c:
            A01(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94164k9.C1w(X.1BI):void");
    }

    public static void A01(NewsletterInfoActivity newsletterInfoActivity, Object obj) {
        AnonymousClass3VS r3;
        if (NewsletterInfoActivity.A1S(newsletterInfoActivity) && (r3 = newsletterInfoActivity.A0f) != null) {
            r3.A0D.CGN(new C21458AkP(obj, r3, 12));
        }
    }

    public /* synthetic */ void Bq4(Collection collection) {
    }

    public /* synthetic */ void C1z(AnonymousClass1BI r1) {
    }
}
