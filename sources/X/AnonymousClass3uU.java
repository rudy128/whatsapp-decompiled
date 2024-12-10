package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import com.whatsapp.Conversation;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.3uU  reason: invalid class name */
public abstract class AnonymousClass3uU extends AnonymousClass3gd implements C108875cR, C108665c6, AnonymousClass5ZB {
    public C94604kt A00;
    public final List A01 = AnonymousClass000.A13();

    public AnonymousClass1FY CFa() {
        return this;
    }

    public AnonymousClass1FY getActivityNullable() {
        return this;
    }

    public /* synthetic */ void BC4(Drawable drawable, View view) {
        if (this instanceof Conversation) {
            ((Conversation) this).A03.A2k(drawable, view);
        }
    }

    public /* synthetic */ void BCy(AnonymousClass206 r6) {
        if (this instanceof Conversation) {
            AnonymousClass4aY r4 = ((Conversation) this).A03;
            AnonymousClass4aY.A0g(r4);
            AnonymousClass4aY.A0u(r4);
            if (r4.A4h != null) {
                AnonymousClass3VQ r1 = r4.A2b;
                r1.A0L = true;
                r1.A0b(r6);
                AnonymousClass74M r12 = r4.A4h;
                TextUtils.isEmpty(AnonymousClass3MZ.A18(r12.A0Z).trim());
                if (r12.A19.A00()) {
                    C18030ve r2 = r4.A3F;
                    C18070vi.A0d(r2, 0);
                    if (C18020vd.A05(C18040vf.A02, r2, 12555)) {
                        r4.A4c.CGL(new C98794rj(r4, 2), "VoiceNoteRecordingUi-Worker");
                    } else {
                        AnonymousClass74M r3 = r4.A4h;
                        if (r3.A0c()) {
                            r3.A0g.CGP(new C146787Qp(r3, 7));
                        }
                    }
                }
                r4.A2b.A0L = false;
            }
        }
    }

    public /* synthetic */ void BCz(AnonymousClass206 r3) {
        if (this instanceof Conversation) {
            AnonymousClass4aY r1 = ((Conversation) this).A03;
            AnonymousClass4aY.A1K(r1, 2);
            AnonymousClass4aY.A0u(r1);
            AnonymousClass74G r12 = r1.A42;
            if (r12 != null) {
                r12.A0A(r3, true);
            }
        }
    }

    public AnonymousClass5YU BHg() {
        return new C92014gc(this.A00);
    }

    public /* synthetic */ void BId() {
        if (this instanceof Conversation) {
            AnonymousClass4aY r1 = ((Conversation) this).A03;
            AnonymousClass00H r2 = r1.A5t;
            if (C72473Md.A0g(r2) != null) {
                C85714Ol A002 = C87724Ws.A00(r1);
                A002.A03 = false;
                A002.A05 = false;
                C216616x A0d = AnonymousClass3MX.A0d(r2);
                if (A0d.A03.A06() != null) {
                    A0d.A00((AnonymousClass205) null);
                }
            }
        }
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.3vF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BPO(java.lang.Class r3) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C79333vF
            if (r0 == 0) goto L_0x000e
            r1 = r2
            X.3vF r1 = (X.C79333vF) r1
            java.lang.Class<X.5Xc> r0 = X.C106765Xc.class
            if (r3 != r0) goto L_0x001c
            X.5Xc r0 = r1.A0N
            return r0
        L_0x000e:
            boolean r0 = r2 instanceof com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity
            if (r0 == 0) goto L_0x0023
            r1 = r2
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r1 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r1
            java.lang.Class<X.5Xc> r0 = X.C106765Xc.class
            if (r3 != r0) goto L_0x001c
            X.5Xc r0 = r1.A0Z
            return r0
        L_0x001c:
            X.4kt r0 = r1.A00
            java.lang.Object r0 = r0.BPO(r3)
            return r0
        L_0x0023:
            r0 = r2
            com.whatsapp.Conversation r0 = (com.whatsapp.Conversation) r0
            X.4aY r1 = r0.A03
            java.lang.Class<X.5Xc> r0 = X.C106765Xc.class
            if (r3 != r0) goto L_0x002f
            X.5Xc r0 = r1.A7g
            return r0
        L_0x002f:
            X.5cQ r0 = r1.A2Q
            java.lang.Object r0 = r0.COn(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uU.BPO(java.lang.Class):java.lang.Object");
    }

    public C74873d3 BRC(Integer num) {
        C117015z4 r0;
        Integer num2 = num;
        if (this instanceof MediaAlbumActivity) {
            MediaAlbumActivity mediaAlbumActivity = (MediaAlbumActivity) this;
            C74873d3 r4 = mediaAlbumActivity.A0E;
            if (r4 != null) {
                return r4;
            }
            C18030ve r2 = mediaAlbumActivity.A0E;
            AnonymousClass1L4 r1 = mediaAlbumActivity.A09;
            AnonymousClass190 r7 = mediaAlbumActivity.A03;
            AnonymousClass1KW r15 = mediaAlbumActivity.A0D;
            C1193267r r14 = mediaAlbumActivity.A0F;
            AnonymousClass11C r10 = mediaAlbumActivity.A08;
            C18000vb r12 = mediaAlbumActivity.A00;
            EmojiSearchProvider emojiSearchProvider = mediaAlbumActivity.getEmojiSearchProvider();
            C74873d3 r42 = new C74873d3(mediaAlbumActivity, (View) null, r7, (KeyboardPopupLayout) mediaAlbumActivity.A00, (WaEditText) null, r10, mediaAlbumActivity.A0A, r12, (A59) mediaAlbumActivity.A0O.get(), r14, r15, emojiSearchProvider, r2, mediaAlbumActivity.A0K, r1, AnonymousClass3MY.A0g(), num2);
            mediaAlbumActivity.A0E = r42;
            r42.setOnDismissListener(mediaAlbumActivity.A00.A1H);
            AnonymousClass4UI r22 = new AnonymousClass4UI(mediaAlbumActivity, mediaAlbumActivity.A0E, (EmojiSearchContainer) C110885hR.A0A(mediaAlbumActivity, 2131430335));
            mediaAlbumActivity.A0G = r22;
            C74873d3 r43 = mediaAlbumActivity.A0E;
            r43.A0E = new C98784ri((Object) mediaAlbumActivity, 42);
            r43.A0B = r22;
            r43.A0J(new C92094gk(mediaAlbumActivity, 1));
            r22.A00 = new C95914n0(mediaAlbumActivity, 2);
            return r43;
        } else if (!(this instanceof Conversation) || (r0 = ((Conversation) this).A03.A3K) == null) {
            return null;
        } else {
            r0.A0D = num2;
            return r0;
        }
    }

    public int BW6(AnonymousClass206 r2) {
        return this.A00.BW6(r2);
    }

    public boolean Bcq() {
        return this.A00.Bcq();
    }

    public void Bcy() {
        if (this instanceof Conversation) {
            ((Conversation) this).A03.A2O();
        }
    }

    public /* synthetic */ boolean BfZ() {
        if (this instanceof Conversation) {
            return AnonymousClass000.A1W(((Conversation) this).A03.A2b.A0G);
        }
        return false;
    }

    public boolean Bfa(AnonymousClass206 r2) {
        return this.A00.Bfa(r2);
    }

    public /* synthetic */ boolean Bfy() {
        AnonymousClass74M r0;
        if (!(this instanceof Conversation) || (r0 = ((Conversation) this).A03.A4h) == null || !r0.A0a()) {
            return false;
        }
        return true;
    }

    public boolean Bg6() {
        ReactionsTrayViewModel reactionsTrayViewModel = this.A00.A0p;
        if (reactionsTrayViewModel == null || C72463Mc.A0A(reactionsTrayViewModel.A0F) != 2) {
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean Bgo(AnonymousClass206 r2) {
        if (this instanceof Conversation) {
            return ((Conversation) this).A03.A3N(r2);
        }
        return false;
    }

    public /* synthetic */ boolean Bgu() {
        VCOverscrollEntryPointView vCOverscrollEntryPointView;
        if (this instanceof Conversation) {
            AnonymousClass4aY r1 = ((Conversation) this).A03;
            if (!r1.A6r || (vCOverscrollEntryPointView = ((C84694Km) r1.A6C.get()).A00) == null || !vCOverscrollEntryPointView.A0A()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean Bjq() {
        if (this instanceof MediaAlbumActivity) {
            MediaAlbumActivity mediaAlbumActivity = (MediaAlbumActivity) this;
            Number number = (Number) mediaAlbumActivity.A09.A01.A06();
            if (number != null && number.intValue() == 1) {
                return true;
            }
            Number number2 = (Number) mediaAlbumActivity.A09.A01.A06();
            if (number2 == null || number2.intValue() != 3) {
                return false;
            }
            return true;
        } else if (this instanceof Conversation) {
            return ((Conversation) this).A03.A3I();
        } else {
            return true;
        }
    }

    public /* synthetic */ void C2C(AnonymousClass206 r2) {
        if (this instanceof Conversation) {
            ((Conversation) this).A03.A30(r2);
        }
    }

    public /* synthetic */ void C2F(AnonymousClass206 r4) {
        if (this instanceof Conversation) {
            AnonymousClass4aY r2 = ((Conversation) this).A03;
            C98704ra.A00(r2.A4c, r2, r4, 36);
        }
    }

    public void C2U(int i) {
        this.A00.A0C(i);
    }

    public /* synthetic */ void C3D(AnonymousClass206 r2, boolean z) {
        if (this instanceof Conversation) {
            ((Conversation) this).A03.A39(r2, z);
        }
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

    public /* synthetic */ boolean CMM() {
        if (this instanceof Conversation) {
            return true;
        }
        return false;
    }

    public void CMb(Bitmap bitmap, AnonymousClass73C r3) {
        this.A00.CMb(bitmap, r3);
    }

    public /* synthetic */ void CMe(AnonymousClass206 r2) {
        if (this instanceof Conversation) {
            ((Conversation) this).A03.A2b.A0a(r2);
        }
    }

    public /* synthetic */ boolean CMu() {
        if (this instanceof Conversation) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void CNC(C441822l r2) {
        if (this instanceof Conversation) {
            ((Conversation) this).A03.A3A(r2);
        }
    }

    public void CND(View view, AnonymousClass206 r8, int i, int i2, boolean z) {
        this.A00.CND(view, r8, i, i2, z);
    }

    public void CNE(View view, AnonymousClass206 r9, Runnable runnable, int i, int i2, boolean z) {
        this.A00.A0F(view, r9, runnable, i, i2, z);
    }

    public /* synthetic */ void CNF(int i) {
        if (this instanceof Conversation) {
            AnonymousClass4aY r2 = ((Conversation) this).A03;
            r2.A4W.A04(0);
            r2.A2b.A03 = 0;
            AnonymousClass4aY.A1j(r2, false);
            AnonymousClass4aY.A1Q(r2, i, false);
        }
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

    public C18030ve getABProps() {
        return this.A0E;
    }

    public C37721q1 getAddContactLogUtil() {
        return AnonymousClass3MW.A0m(this.A00.A0y);
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
        if (this instanceof C79333vF) {
            C79333vF r1 = (C79333vF) this;
            if (r1 instanceof EnforcedMessagesActivity) {
                return 7;
            }
            if (r1 instanceof StarredMessagesActivity) {
                return 1;
            }
            return 4;
        } else if (this instanceof MediaAlbumActivity) {
            return 2;
        } else {
            return 0;
        }
    }

    public AnonymousClass4SX getConversationRowCustomizers() {
        return this.A00.A0M;
    }

    public C88524a2 getConversationRowInflater() {
        return this.A00.A0I;
    }

    public AnonymousClass122 getCoreMessageStore() {
        return this.A00.A0T;
    }

    public EmojiSearchProvider getEmojiSearchProvider() {
        return (EmojiSearchProvider) this.A00.A13.get();
    }

    public AnonymousClass1W6 getFMessageDatabase() {
        return C17880vN.A0c(this.A00.A14);
    }

    public /* synthetic */ AnonymousClass206 getFirstEverKnownLastMessage() {
        if (this instanceof Conversation) {
            return ((Conversation) this).A03.A2b.A0E;
        }
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
        if (this instanceof Conversation) {
            return ((Conversation) this).A03.A2b.A0S;
        }
        return null;
    }

    public C19880zA getHostedGroupUtilsOptional() {
        return (C19880zA) this.A00.A15.get();
    }

    public /* synthetic */ AnonymousClass1DS getLastMessageLiveData() {
        if (this instanceof Conversation) {
            return C22791Df.A00(((Conversation) this).A03.A2b.A0U);
        }
        return null;
    }

    public C36401np getLinkifier() {
        return this.A00.A0v;
    }

    public C32011gU getLinkifyWeb() {
        return this.A00.A0e;
    }

    public C134196qC getMessageAudioPlayerFactory() {
        return this.A00.A0N;
    }

    public C31131f4 getMessageAudioPlayerProvider() {
        return this.A00.A0O;
    }

    public PopupWindow.OnDismissListener getOnPopupWindowDismissListener() {
        return this.A00.A1H;
    }

    public ReactionsTrayViewModel getReactionsTrayViewModel() {
        return this.A00.A0p;
    }

    public AnonymousClass1FE getSavedStateRegistryOwner() {
        return this;
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        if (this instanceof C79333vF) {
            return ((C79333vF) this).A0L;
        }
        if (!(this instanceof Conversation)) {
            return null;
        }
        AnonymousClass3UY r0 = ((Conversation) this).A03.A2Z;
        if (r0 == null) {
            return AnonymousClass000.A13();
        }
        return r0.A03;
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

    public C42211xo getSuspensionManager() {
        return AnonymousClass3MX.A0i(this.A00.A1E);
    }

    public /* synthetic */ EditText getTextEntryField() {
        if (this instanceof Conversation) {
            return ((Conversation) this).A03.A3Z;
        }
        return null;
    }

    public C33251iW getUserActions() {
        return this.A00.A06;
    }

    public AnonymousClass1FD getViewModelStoreOwner() {
        return this;
    }

    public C24921Me getWAContactNames() {
        return this.A00.A0C;
    }

    public C219217x getWaPermissionsHelper() {
        return this.A00.A0R;
    }

    public AnonymousClass18K getWamRuntime() {
        return this.A00.A0Z;
    }

    public void onCreate(Bundle bundle) {
        if (this.A00 == null) {
            C94604kt AHp = ((C006602x) C000400h.A00(C006602x.class, this)).AHp();
            this.A00 = AHp;
            AHp.A0J = this;
            List list = this.A01;
            if (list != null && 0 < list.size()) {
                list.get(0);
                throw AnonymousClass000.A0s("onCreate");
            }
        }
        super.onCreate(bundle);
        this.A00.A07();
    }

    public Dialog onCreateDialog(int i) {
        return this.A00.A04(i);
    }

    public void onDestroy() {
        this.A00.A08();
        this.A01.clear();
    }

    public /* synthetic */ void setAnimationNye(AnonymousClass205 r5) {
        AnonymousClass3uP A012;
        if (this instanceof Conversation) {
            AnonymousClass4aY r3 = ((Conversation) this).A03;
            if (C18020vd.A05(C18040vf.A02, r3.A3F, 11531) && (A012 = r3.A2B.A01(r5)) != null && r3.A1M != null) {
                r3.A6p = true;
                C98714rb.A00(r3.A4c, r3, r5, A012, 30);
            }
        }
    }

    public /* synthetic */ void setQuotedMessage(AnonymousClass206 r2) {
        if (this instanceof Conversation) {
            ((Conversation) this).A03.A2b.A0b(r2);
        }
    }

    public void setSelectionActionMode(AnonymousClass02B r2) {
        this.A00.A00 = r2;
    }

    public Dialog C7r(int i) {
        return super.onCreateDialog(i);
    }

    public void C81(AnonymousClass02B r2) {
        super.C81(r2);
        this.A00.A0A();
    }

    public void C82(AnonymousClass02B r2) {
        super.C82(r2);
        this.A00.A0B();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A00.A0D(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A00.A0E(configuration);
    }

    public void onPause() {
        super.onPause();
        this.A00.A09();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        AnonymousClass205 A03;
        super.onRestoreInstanceState(bundle);
        C94604kt r2 = this.A00;
        C94604kt.A02(r2);
        if (bundle != null && (A03 = AnonymousClass4aU.A03(bundle, "")) != null) {
            r2.A0o = AnonymousClass1W2.A01(A03, r2.A14);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass206 r0 = this.A00.A0o;
        if (r0 != null) {
            AnonymousClass4aU.A0A(bundle, r0.A0v);
        }
    }

    public void C7t() {
        super.onDestroy();
    }
}
