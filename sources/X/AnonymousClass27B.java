package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;
import com.whatsapp.community.CommunityMembersViewModel;
import java.util.concurrent.CancellationException;

/* renamed from: X.27B  reason: invalid class name */
public final class AnonymousClass27B extends LinearLayout implements AnonymousClass009 {
    public RecyclerView A00;
    public AnonymousClass1L9 A01;
    public AnonymousClass1KB A02;
    public AnonymousClass11S A03;
    public WaTextView A04;
    public AnonymousClass5Z1 A05;
    public AnonymousClass5Z2 A06;
    public AnonymousClass3XL A07;
    public AnonymousClass5X7 A08;
    public CommunityMembersViewModel A09;
    public AnonymousClass1VW A0A;
    public AnonymousClass1M9 A0B;
    public C24921Me A0C;
    public C37451pZ A0D;
    public C27201Vd A0E;
    public C18000vb A0F;
    public AnonymousClass1MZ A0G;
    public AnonymousClass1MW A0H;
    public AnonymousClass1KW A0I;
    public AnonymousClass1EC A0J;
    public C36451nu A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass031 A0O;
    public C18600wl A0P;
    public AnonymousClass1OB A0Q;
    public boolean A0R;
    public View A0S;
    public final AnonymousClass1FY A0T;
    public final C28931bI A0U;

    public AnonymousClass27B(Context context) {
        super(context);
        if (!this.A0R) {
            this.A0R = true;
            C27691Xc r3 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r3.A10;
            this.A01 = (AnonymousClass1L9) r1.A0E.get();
            this.A0L = C000200d.A00(r1.A0F);
            this.A0K = (C36451nu) r1.A0G.get();
            this.A0M = C000200d.A00(r1.A0l);
            AnonymousClass1K1 r32 = r3.A0z;
            this.A05 = (AnonymousClass5Z1) r32.A1e.get();
            this.A0N = C000200d.A00(r1.A2L);
            this.A06 = (AnonymousClass5Z2) r32.A1f.get();
            this.A08 = (AnonymousClass5X7) r32.A1W.get();
            this.A0A = (AnonymousClass1VW) r1.A2d.get();
            this.A0B = AnonymousClass10E.A4z(r1);
            this.A0E = (C27201Vd) r1.A2j.get();
            this.A0I = (AnonymousClass1KW) r1.A3d.get();
            this.A02 = AnonymousClass10E.A12(r1);
            this.A0G = (AnonymousClass1MZ) r1.A4t.get();
            this.A0P = (C18600wl) r1.A9E.get();
            this.A03 = AnonymousClass10E.A17(r1);
            this.A0H = (AnonymousClass1MW) r1.A7u.get();
            this.A0C = (C24921Me) r1.ABX.get();
            this.A0F = AnonymousClass10E.A6Q(r1);
        }
        this.A0T = (AnonymousClass1FY) AnonymousClass1L9.A01(context, AnonymousClass1FY.class);
        View inflate = View.inflate(context, 2131624577, this);
        C18070vi.A0X(inflate);
        this.A0S = inflate;
        WaTextView waTextView = (WaTextView) C18070vi.A05(inflate, 2131432476);
        AnonymousClass1Y5.A0A(waTextView, true);
        this.A04 = waTextView;
        this.A00 = (RecyclerView) C18070vi.A05(this.A0S, 2131431641);
        this.A0U = new C28931bI(findViewById(2131431640));
    }

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static final void setupMembersListChangeHandlers$lambda$1(AnonymousClass27B r1) {
        C18070vi.A0d(r1, 0);
        AnonymousClass1OB r12 = r1.A0Q;
        if (r12 != null) {
            r12.BEM((CancellationException) null);
        }
    }

    public final void setActivityUtils$app_product_community_community(AnonymousClass1L9 r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setAddContactLogUtil$app_product_community_community(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0L = r2;
    }

    public final void setAddToContactsUtil$app_product_community_community(C36451nu r2) {
        C18070vi.A0d(r2, 0);
        this.A0K = r2;
    }

    public final void setBaseMemberContextMenuHelper$app_product_community_community(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0M = r2;
    }

    public final void setCommunityAdminPromoteDemoteHelperFactory$app_product_community_community(AnonymousClass5Z1 r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setCommunityChatManager$app_product_community_community(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0N = r2;
    }

    public final void setCommunityMembersAdapterFactory(AnonymousClass5Z2 r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setCommunityMembersViewModelFactory$app_product_community_community(AnonymousClass5X7 r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setContactAvatars$app_product_community_community(AnonymousClass1VW r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public final void setContactManager$app_product_community_community(AnonymousClass1M9 r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setContactPhotos$app_product_community_community(C27201Vd r2) {
        C18070vi.A0d(r2, 0);
        this.A0E = r2;
    }

    public final void setEmojiLoader$app_product_community_community(AnonymousClass1KW r2) {
        C18070vi.A0d(r2, 0);
        this.A0I = r2;
    }

    public final void setGlobalUI$app_product_community_community(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setGroupParticipantsManager$app_product_community_community(AnonymousClass1MZ r2) {
        C18070vi.A0d(r2, 0);
        this.A0G = r2;
    }

    public final void setIoDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A0P = r2;
    }

    public final void setMeManager$app_product_community_community(AnonymousClass11S r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setParticipantUserStore$app_product_community_community(AnonymousClass1MW r2) {
        C18070vi.A0d(r2, 0);
        this.A0H = r2;
    }

    public final void setWaContactNames$app_product_community_community(C24921Me r2) {
        C18070vi.A0d(r2, 0);
        this.A0C = r2;
    }

    public final void setWhatsAppLocale$app_product_community_community(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A0F = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0O;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A0O = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1L9 getActivityUtils$app_product_community_community() {
        AnonymousClass1L9 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("activityUtils");
        throw null;
    }

    public final AnonymousClass00H getAddContactLogUtil$app_product_community_community() {
        AnonymousClass00H r0 = this.A0L;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("addContactLogUtil");
        throw null;
    }

    public final C36451nu getAddToContactsUtil$app_product_community_community() {
        C36451nu r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("addToContactsUtil");
        throw null;
    }

    public final AnonymousClass00H getBaseMemberContextMenuHelper$app_product_community_community() {
        AnonymousClass00H r0 = this.A0M;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("baseMemberContextMenuHelper");
        throw null;
    }

    public final AnonymousClass5Z1 getCommunityAdminPromoteDemoteHelperFactory$app_product_community_community() {
        AnonymousClass5Z1 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("communityAdminPromoteDemoteHelperFactory");
        throw null;
    }

    public final AnonymousClass00H getCommunityChatManager$app_product_community_community() {
        AnonymousClass00H r0 = this.A0N;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("communityChatManager");
        throw null;
    }

    public final AnonymousClass5Z2 getCommunityMembersAdapterFactory() {
        AnonymousClass5Z2 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("communityMembersAdapterFactory");
        throw null;
    }

    public final AnonymousClass5X7 getCommunityMembersViewModelFactory$app_product_community_community() {
        AnonymousClass5X7 r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("communityMembersViewModelFactory");
        throw null;
    }

    public final AnonymousClass1VW getContactAvatars$app_product_community_community() {
        AnonymousClass1VW r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactAvatars");
        throw null;
    }

    public final AnonymousClass1M9 getContactManager$app_product_community_community() {
        AnonymousClass1M9 r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactManager");
        throw null;
    }

    public final C27201Vd getContactPhotos$app_product_community_community() {
        C27201Vd r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactPhotos");
        throw null;
    }

    public final AnonymousClass1KW getEmojiLoader$app_product_community_community() {
        AnonymousClass1KW r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public final AnonymousClass1KB getGlobalUI$app_product_community_community() {
        AnonymousClass1KB r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("globalUI");
        throw null;
    }

    public final AnonymousClass1MZ getGroupParticipantsManager$app_product_community_community() {
        AnonymousClass1MZ r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupParticipantsManager");
        throw null;
    }

    public final C18600wl getIoDispatcher() {
        C18600wl r0 = this.A0P;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("ioDispatcher");
        throw null;
    }

    public final AnonymousClass11S getMeManager$app_product_community_community() {
        AnonymousClass11S r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("meManager");
        throw null;
    }

    public final AnonymousClass1MW getParticipantUserStore$app_product_community_community() {
        AnonymousClass1MW r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("participantUserStore");
        throw null;
    }

    public final C24921Me getWaContactNames$app_product_community_community() {
        C24921Me r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContactNames");
        throw null;
    }

    public final C18000vb getWhatsAppLocale$app_product_community_community() {
        C18000vb r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("whatsAppLocale");
        throw null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C37451pZ r0 = this.A0D;
        if (r0 == null) {
            C18070vi.A11("contactPhotoLoader");
            throw null;
        } else {
            r0.A02();
        }
    }
}
