package X;

import com.whatsapp.calling.callhistory.calllog.CallLogActivityV2;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;
import com.whatsapp.calling.dialer.DialerActivity;
import com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity;
import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;
import com.whatsapp.gallery.selectedmedia.SelectedMediaCaptionFragment;
import com.whatsapp.settings.SettingsSetupUserProxyActivity;
import com.whatsapp.userban.ui.fragment.BanAppealFormFragment;

/* renamed from: X.3Rg  reason: invalid class name and case insensitive filesystem */
public class C73173Rg extends AnonymousClass01T {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73173Rg(Object obj, int i) {
        super(true);
        this.A00 = i;
        this.A01 = obj;
    }

    public void A03() {
        switch (this.A00) {
            case 0:
                CallLogActivityV2.A0Q((CallLogActivityV2) this.A01);
                return;
            case 1:
                GroupCallLogActivity.A03((GroupCallLogActivity) this.A01);
                return;
            case 2:
                DialerActivity dialerActivity = (DialerActivity) this.A01;
                AnonymousClass1V9 r3 = dialerActivity.A09;
                if (r3 != null) {
                    r3.A01(14, 60, 15);
                    dialerActivity.finish();
                    return;
                }
                C18070vi.A11("callUserJourneyLogger");
                throw null;
            case 3:
                FavoriteCallListActivity.A03((FavoriteCallListActivity) this.A01);
                return;
            case 4:
                ReportToAdminMessagesActivity.A03((ReportToAdminMessagesActivity) this.A01);
                return;
            case 5:
                SelectedMediaCaptionFragment.A00((SelectedMediaCaptionFragment) this.A01);
                return;
            case 6:
                SettingsSetupUserProxyActivity.A03((SettingsSetupUserProxyActivity) this.A01);
                return;
            case 7:
                ((BanAppealFormFragment) this.A01).A06.A0V();
                return;
            default:
                return;
        }
    }
}
