package X;

import android.content.res.Configuration;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.3uV  reason: invalid class name and case insensitive filesystem */
public abstract class C79113uV extends AnonymousClass3gg implements C108875cR, C108665c6 {
    public C94604kt A00;
    public List A01;

    public /* synthetic */ void BCy(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BCz(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BId() {
    }

    public Object BPO(Class cls) {
        AnonymousClass4aY r1 = ((C78843tk) this).A04;
        if (cls == C106765Xc.class) {
            return r1.A7g;
        }
        return r1.A2Q.COn(cls);
    }

    public /* synthetic */ void C2C(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C2F(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CNC(C441822l r1) {
    }

    public /* synthetic */ void CNF(int i) {
    }

    public abstract AnonymousClass1FY getActivityNullable();

    public abstract /* synthetic */ C41761x1 getPreferredLabel();

    public abstract /* synthetic */ ArrayList getSearchTerms();

    public abstract /* synthetic */ String getSearchText();

    public abstract /* synthetic */ EditText getTextEntryField();

    public /* synthetic */ void setAnimationNye(AnonymousClass205 r1) {
    }

    public abstract /* synthetic */ void setQuotedMessage(AnonymousClass206 r1);

    public AnonymousClass5YU BHg() {
        return new C92014gc(this.A00);
    }

    public void BIw() {
        AnonymousClass3RQ r0 = this.A00.A0L;
        if (r0 != null) {
            r0.dismiss();
        }
    }

    public void BLL() {
        this.A00.BLL();
    }

    public void BLe(AnonymousClass206 r2) {
        this.A00.BLe(r2);
    }

    public int BW6(AnonymousClass206 r2) {
        return this.A00.BW6(r2);
    }

    public boolean Bcq() {
        return this.A00.Bcq();
    }

    public boolean Bfa(AnonymousClass206 r2) {
        return this.A00.Bfa(r2);
    }

    public boolean Bg6() {
        ReactionsTrayViewModel reactionsTrayViewModel = this.A00.A0p;
        if (reactionsTrayViewModel == null || C72463Mc.A0A(reactionsTrayViewModel.A0F) != 2) {
            return false;
        }
        return true;
    }

    public void C2U(int i) {
        this.A00.A0C(i);
    }

    public void C7t() {
        AnonymousClass4SD r0 = this.A01;
        r0.A04.removeCallbacks(r0.A05);
    }

    public void CH6(AnonymousClass206 r2) {
        this.A00.CH6(r2);
    }

    public void CJr(AnonymousClass206 r2, int i) {
        this.A00.CJr(r2, i);
    }

    public void CKg(List list, boolean z) {
        this.A00.CKg(list, z);
    }

    public void CND(View view, AnonymousClass206 r8, int i, int i2, boolean z) {
        this.A00.CND(view, r8, i, i2, z);
    }

    public void CNE(View view, AnonymousClass206 r8, Runnable runnable, int i, int i2, boolean z) {
        this.A00.CND(view, r8, i, i2, z);
    }

    public void COH(AnonymousClass206 r2) {
        this.A00.COH(r2);
    }

    public boolean CPY(AnonymousClass206 r2) {
        return this.A00.CPY(r2);
    }

    public void CRK(AnonymousClass206 r2) {
        this.A00.CRK(r2);
    }

    public C37721q1 getAddContactLogUtil() {
        return AnonymousClass3MW.A0m(this.A00.A0y);
    }

    public AnonymousClass5YN getAsyncLabelUpdater() {
        C19880zA r1 = this.A00.A03;
        if (!r1.A07()) {
            return null;
        }
        r1.A03();
        throw AnonymousClass000.A0s("getAsyncLabelUpdater");
    }

    public C26911Ty getBusinessProfileManager() {
        return this.A00.A07;
    }

    public C34511kb getCommunityChatManager() {
        return AnonymousClass3MW.A0Z(this.A00.A10);
    }

    public C30191dX getContactAccessHelper() {
        return (C30191dX) this.A00.A11.get();
    }

    public AnonymousClass1M9 getContactManager() {
        return this.A00.A09;
    }

    public C27201Vd getContactPhotos() {
        return this.A00.A0E;
    }

    public /* synthetic */ int getContainerType() {
        return 0;
    }

    public AnonymousClass4TR getConversationContextGif() {
        return this.A00.A0G;
    }

    public AnonymousClass4SX getConversationRowCustomizers() {
        return this.A00.A0M;
    }

    public C88524a2 getConversationRowInflater() {
        return this.A00.A0I;
    }

    public C94604kt getConversationRowsDelegate() {
        return this.A00;
    }

    public AnonymousClass122 getCoreMessageStore() {
        return this.A00.A0T;
    }

    public C32981i4 getDeepLinkHelper() {
        return this.A00.A0Y;
    }

    public EmojiSearchProvider getEmojiSearchProvider() {
        return (EmojiSearchProvider) this.A00.A13.get();
    }

    public AnonymousClass1W6 getFMessageDatabase() {
        return C17880vN.A0c(this.A00.A14);
    }

    public /* synthetic */ AnonymousClass206 getFirstEverKnownLastMessage() {
        return null;
    }

    public Collection getForwardMessages() {
        return this.A00.A06();
    }

    public AnonymousClass126 getGroupChatManager() {
        return this.A00.A0b;
    }

    public AnonymousClass1PU getGroupChatUtils() {
        return this.A00.A0u;
    }

    public AnonymousClass1MZ getGroupParticipantsManager() {
        return this.A00.A0U;
    }

    public /* synthetic */ AnonymousClass1DS getHasOutgoingMessagesLiveData() {
        return null;
    }

    public C19880zA getHostedGroupUtilsOptional() {
        return (C19880zA) this.A00.A15.get();
    }

    public C88104Yi getKeepInChatManager() {
        return this.A00.A0V;
    }

    public /* synthetic */ AnonymousClass1DS getLastMessageLiveData() {
        return null;
    }

    public C36401np getLinkifier() {
        return this.A00.A0v;
    }

    public C32011gU getLinkifyWeb() {
        return this.A00.A0e;
    }

    public C32431hB getMediaDownloadManager() {
        return this.A00.A0g;
    }

    public C32091gc getMentions() {
        return this.A00.A0h;
    }

    public C134196qC getMessageAudioPlayerFactory() {
        return this.A00.A0N;
    }

    public C31131f4 getMessageAudioPlayerProvider() {
        return this.A00.A0O;
    }

    public C24681Lg getMessageObservers() {
        return this.A00.A0W;
    }

    public C87794Wz getMessageRevokeWamEventLogger() {
        return this.A00.A0j;
    }

    public PopupWindow.OnDismissListener getOnPopupWindowDismissListener() {
        return this.A00.A1H;
    }

    public AnonymousClass1QO getPaymentsGatingManager() {
        return this.A00.A0k;
    }

    public AnonymousClass1QS getPaymentsManager() {
        return this.A00.A0l;
    }

    public ReactionsTrayViewModel getReactionsTrayViewModel() {
        return this.A00.A0p;
    }

    public HashSet getSeenMessages() {
        return this.A00.A1I;
    }

    public AnonymousClass4S9 getSelectedMessages() {
        return this.A00.A05();
    }

    public AnonymousClass02B getSelectionActionMode() {
        return this.A00.A00;
    }

    public C32861hs getSendMediaMessageManager() {
        return this.A00.A0f;
    }

    public C19880zA getSmbMenus() {
        return this.A00.A04;
    }

    public C28521aN getStarredMessageStore() {
        return this.A00.A0X;
    }

    public C26631Sw getStickerImageFileLoader() {
        return this.A00.A0r;
    }

    public AnonymousClass1MB getSupportGatingUtils() {
        return this.A00.A0c;
    }

    public C42211xo getSuspensionManager() {
        return AnonymousClass3MX.A0i(this.A00.A1E);
    }

    public C26811To getSyncManager() {
        return this.A00.A08;
    }

    public C33251iW getUserActions() {
        return this.A00.A06;
    }

    public C24921Me getWAContactNames() {
        return this.A00.A0C;
    }

    public AnonymousClass118 getWaContext() {
        return this.A00.A0Q;
    }

    public C219217x getWaPermissionsHelper() {
        return this.A00.A0R;
    }

    public AnonymousClass18K getWamRuntime() {
        return this.A00.A0Z;
    }

    public C25241Nl getWamThreadIdManager() {
        return this.A00.A0a;
    }

    public void setSelectedMessages(AnonymousClass4S9 r2) {
        MessageSelectionViewModel messageSelectionViewModel = this.A00.A0K;
        if (messageSelectionViewModel != null) {
            messageSelectionViewModel.A00.A0F(r2);
        }
    }

    public void setSelectionActionMode(AnonymousClass02B r2) {
        this.A00.A00 = r2;
    }

    public C18030ve getABProps() {
        AnonymousClass1FY waBaseActivity = getWaBaseActivity();
        waBaseActivity.getClass();
        return waBaseActivity.getAbProps();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A00.A0E(configuration);
    }

    public void setConversationRowsDelegate(C94604kt r1) {
        this.A00 = r1;
    }
}
