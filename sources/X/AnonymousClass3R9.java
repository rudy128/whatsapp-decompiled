package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.events.EventResponseUserView$bind$1;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.3R9  reason: invalid class name */
public final class AnonymousClass3R9 extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass11S A00;
    public AnonymousClass1VW A01;
    public AnonymousClass1M9 A02;
    public C24921Me A03;
    public AnonymousClass11P A04;
    public C18000vb A05;
    public AnonymousClass1M4 A06;
    public AnonymousClass1MZ A07;
    public AnonymousClass1KW A08;
    public AnonymousClass12J A09;
    public AnonymousClass031 A0A;
    public C18600wl A0B;
    public C18600wl A0C;
    public boolean A0D;
    public final C28931bI A0E;
    public final WDSProfilePhoto A0F;
    public final AnonymousClass1OX A0G;
    public final LinearLayout A0H;
    public final TextEmojiLabel A0I;
    public final TextEmojiLabel A0J;
    public final WaTextView A0K;

    public AnonymousClass3R9(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A0D) {
            this.A0D = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A06 = (AnonymousClass1M4) A0O.AmV.get();
            this.A01 = AnonymousClass3MZ.A0e(A0O);
            this.A02 = AnonymousClass10E.A4z(A0O);
            this.A08 = AnonymousClass3Ma.A0f(A0O);
            this.A09 = A0O.A00.A5N();
            this.A07 = AnonymousClass3MY.A0V(A0O);
            this.A0B = AnonymousClass3MZ.A1B(A0O);
            this.A0C = AnonymousClass3MZ.A1C(A0O);
            this.A00 = AnonymousClass10E.A17(A0O);
            this.A04 = AnonymousClass10E.A6O(A0O);
            this.A03 = AnonymousClass3MZ.A0g(A0O);
            this.A05 = AnonymousClass10E.A6Q(A0O);
        }
        this.A0G = AnonymousClass1OW.A02(getIoDispatcher());
        View.inflate(context, 2131625266, this);
        C72473Md.A0y(this);
        this.A0F = (WDSProfilePhoto) AnonymousClass1HF.A06(this, 2131430631);
        this.A0I = AnonymousClass3MX.A0V(this, 2131430630);
        this.A0J = AnonymousClass3MX.A0V(this, 2131430626);
        this.A0K = AnonymousClass3MW.A0T(this, 2131430628);
        this.A0H = AnonymousClass3MX.A0K(this, 2131430627);
        this.A0E = C28931bI.A00(this, 2131430629);
    }

    public static final void A01(AnonymousClass3R9 r6, Long l, boolean z) {
        if (!z) {
            WaTextView waTextView = r6.A0K;
            waTextView.setVisibility(0);
            waTextView.setText(2131890152);
        } else if (l == null) {
            r6.A0K.setVisibility(8);
        } else {
            WaTextView waTextView2 = r6.A0K;
            r6.getTime();
            waTextView2.setText(C64052u8.A08(r6.getWhatsAppLocale(), r6.getTime().A09(l.longValue())));
            waTextView2.setVisibility(0);
        }
    }

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public static final void setUpContextMenu$lambda$2$lambda$1(AnonymousClass3R9 r1, View view) {
        C18070vi.A0d(r1, 0);
        r1.showContextMenu();
    }

    public final void setAliasedDisplayNameRepository(AnonymousClass1M4 r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setContactAvatars(AnonymousClass1VW r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setContactManager(AnonymousClass1M9 r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setEmojiLoader(AnonymousClass1KW r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setEventResponseContextMenuHelper(AnonymousClass12J r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setGroupParticipantsManager(AnonymousClass1MZ r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setIoDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setMainDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A0C = r2;
    }

    public final void setMeManager(AnonymousClass11S r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setTime(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setWaContactNames(C24921Me r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public static final void A00(C86804Td r6, AnonymousClass3R9 r7, Long l, boolean z) {
        String str;
        TextEmojiLabel textEmojiLabel = r7.A0I;
        if (z) {
            str = C17880vN.A0q(r7.getContext(), r6.A00, AnonymousClass3MW.A1a(), 0, 2131890151);
        } else {
            str = r6.A00;
        }
        AnonymousClass3MY.A0u(r7.getContext(), textEmojiLabel.getPaint(), textEmojiLabel, r7.getEmojiLoader(), str);
        String str2 = r6.A01;
        if ((str2 == null || str2.length() == 0) && l == null) {
            r7.A0H.setVisibility(8);
            return;
        }
        r7.A0H.setVisibility(0);
        r7.setSecondaryName(str2);
    }

    private final void setSecondaryName(String str) {
        TextEmojiLabel textEmojiLabel;
        int i;
        if (str == null || str.length() == 0) {
            textEmojiLabel = this.A0J;
            i = 8;
        } else {
            textEmojiLabel = this.A0J;
            textEmojiLabel.setText(str);
            i = 0;
        }
        textEmojiLabel.setVisibility(i);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0A;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1M4 getAliasedDisplayNameRepository() {
        AnonymousClass1M4 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("aliasedDisplayNameRepository");
        throw null;
    }

    public final AnonymousClass1VW getContactAvatars() {
        AnonymousClass1VW r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactAvatars");
        throw null;
    }

    public final AnonymousClass1M9 getContactManager() {
        AnonymousClass1M9 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactManager");
        throw null;
    }

    public final AnonymousClass1KW getEmojiLoader() {
        AnonymousClass1KW r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public final AnonymousClass12J getEventResponseContextMenuHelper() {
        AnonymousClass12J r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("eventResponseContextMenuHelper");
        throw null;
    }

    public final AnonymousClass1MZ getGroupParticipantsManager() {
        AnonymousClass1MZ r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupParticipantsManager");
        throw null;
    }

    public final C18600wl getIoDispatcher() {
        C18600wl r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1K();
        throw null;
    }

    public final C18600wl getMainDispatcher() {
        C18600wl r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1L();
        throw null;
    }

    public final AnonymousClass11S getMeManager() {
        AnonymousClass11S r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1D();
        throw null;
    }

    public final AnonymousClass11P getTime() {
        AnonymousClass11P r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public final C24921Me getWaContactNames() {
        C24921Me r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContactNames");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    private final void setUpContextMenu(C80893yG r4) {
        int A002;
        boolean z = !((C95954n4) getEventResponseContextMenuHelper()).A00.A0O(r4.A01);
        setClickable(z);
        if (z) {
            setOnCreateContextMenuListener(new C90124dZ(r4, this, 1));
            setOnClickListener(new AnonymousClass78O((Object) this, 4));
            A002 = 2131232942;
        } else {
            A002 = AnonymousClass1YL.A00(getContext(), 2130971948, 2131103048);
        }
        setBackgroundResource(A002);
    }

    public static final void setUpContextMenu$lambda$2$lambda$0(AnonymousClass3R9 r3, C80893yG r4, ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C18070vi.A0h(r3, r4);
        if (contextMenu != null) {
            AnonymousClass12J eventResponseContextMenuHelper = r3.getEventResponseContextMenuHelper();
            UserJid userJid = r4.A01;
            AnonymousClass1FY r32 = (AnonymousClass1FY) C72453Mb.A0L(r3);
            C95954n4 r1 = (C95954n4) eventResponseContextMenuHelper;
            C18070vi.A0d(r32, 2);
            AnonymousClass1E7 A0H2 = r1.A01.A0H(userJid);
            AnonymousClass00H r12 = r1.A02;
            ((AnonymousClass4XU) r12.get()).A01(contextMenu, r32, A0H2);
            r12.get();
            AnonymousClass4XU.A00(contextMenu, r32, userJid);
        }
    }

    public final void A02(C37451pZ r5, C80893yG r6) {
        getContactAvatars().A0B(this.A0F, (AnonymousClass1VX) null, 2131231047);
        A01(this, r6.A03, true);
        if (r6.A02.intValue() != 1) {
            this.A0E.A04(8);
        } else {
            C28931bI r2 = this.A0E;
            AnonymousClass3MX.A0M(r2).setText(2131890132);
            r2.A04(0);
        }
        setUpContextMenu(r6);
        AnonymousClass3MX.A1Q(new EventResponseUserView$bind$1(r5, r6, this, (C30391dr) null), this.A0G);
    }
}
