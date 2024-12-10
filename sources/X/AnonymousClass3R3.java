package X;

import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.events.EventDetailsView$setUpCoverImage$1;
import com.whatsapp.events.EventDetailsView$setUpGroupInfoSection$1;
import com.whatsapp.text.ReadMoreTextView;

/* renamed from: X.3R3  reason: invalid class name */
public final class AnonymousClass3R3 extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass1L9 A00;
    public WaTextView A01;
    public AnonymousClass1M9 A02;
    public AnonymousClass11C A03;
    public C18000vb A04;
    public AnonymousClass1KW A05;
    public C25931Qe A06;
    public C57242il A07;
    public C18010vc A08;
    public C36401np A09;
    public C28931bI A0A;
    public C28931bI A0B;
    public C28931bI A0C;
    public C28931bI A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass031 A0F;
    public C18600wl A0G;
    public C18600wl A0H;
    public boolean A0I;

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final void setActivityUtils(AnonymousClass1L9 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setContactManager(AnonymousClass1M9 r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setEmojiLoader(AnonymousClass1KW r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setEventMessageUtils(C57242il r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setFMessageLazyManager(C25931Qe r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setIoDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A0G = r2;
    }

    public final void setLinkifier(C36401np r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setMainDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A0H = r2;
    }

    public final void setSharedPreferencesFactory(C18010vc r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWaIntents(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0E = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    private final void setUpCanceledEvent(C445823z r8) {
        if (r8.A08) {
            this.A0A.A04(0);
            WaTextView waTextView = this.A01;
            ViewGroup.LayoutParams layoutParams = waTextView.getLayoutParams();
            C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(waTextView.getResources().getDimensionPixelSize(2131168777), waTextView.getResources().getDimensionPixelSize(2131168775), AnonymousClass3Ma.A02(waTextView, 2131168777), 0);
            waTextView.setLayoutParams(marginLayoutParams);
        }
    }

    private final void setUpDescription(C445823z r8) {
        String str = r8.A04;
        if (str != null && str.length() != 0) {
            ReadMoreTextView readMoreTextView = (ReadMoreTextView) this.A0C.A02();
            readMoreTextView.setLinesLimit(5);
            C72473Md.A1C(readMoreTextView);
            SpannableStringBuilder A092 = AnonymousClass3MW.A09(C26302CxJ.A02(r8.A04, readMoreTextView.getPaint().getTextSize(), -16777216, C26302CxJ.A00(readMoreTextView.getSystemServices(), readMoreTextView.getSharedPreferencesFactory()), false));
            getLinkifier().A08(readMoreTextView.getContext(), A092);
            C72483Me.A0w(readMoreTextView, A092);
            readMoreTextView.setVisibility(0);
        }
    }

    private final void setUpGroupInfoSection(C445823z r4, C37451pZ r5, C82984Cx r6) {
        if (r6 != C82984Cx.COMMUNITY_NAVIGATION) {
            this.A0D.A04(8);
            return;
        }
        AnonymousClass3MX.A1Q(new EventDetailsView$setUpGroupInfoSection$1(r5, r4, this, (C30391dr) null), AnonymousClass1OW.A02(getIoDispatcher()));
    }

    private final void setUpName(C445823z r6) {
        WaTextView waTextView = this.A01;
        AnonymousClass3MY.A0u(waTextView.getContext(), waTextView.getPaint(), waTextView, getEmojiLoader(), AnonymousClass3MW.A09(r6.A06));
        if (r6.A08) {
            waTextView.setPaintFlags(waTextView.getPaintFlags() | 16);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0F;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0F = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1L9 getActivityUtils() {
        AnonymousClass1L9 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("activityUtils");
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
        AnonymousClass1KW r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public final C57242il getEventMessageUtils() {
        C57242il r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("eventMessageUtils");
        throw null;
    }

    public final C25931Qe getFMessageLazyManager() {
        C25931Qe r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("fMessageLazyManager");
        throw null;
    }

    public final C18600wl getIoDispatcher() {
        C18600wl r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1K();
        throw null;
    }

    public final C36401np getLinkifier() {
        C36401np r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1E();
        throw null;
    }

    public final C18600wl getMainDispatcher() {
        C18600wl r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1L();
        throw null;
    }

    public final C18010vc getSharedPreferencesFactory() {
        C18010vc r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("sharedPreferencesFactory");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final AnonymousClass00H getWaIntents() {
        AnonymousClass00H r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    private final void setUpCoverImage(C445823z r4) {
        AnonymousClass3MX.A1Q(new EventDetailsView$setUpCoverImage$1(r4, this, (C30391dr) null), AnonymousClass1OW.A02(getIoDispatcher()));
    }

    public final void A00(C445823z r1, C37451pZ r2, C82984Cx r3) {
        setUpCoverImage(r1);
        setUpName(r1);
        setUpDescription(r1);
        setUpCanceledEvent(r1);
        setUpGroupInfoSection(r1, r2, r3);
    }
}
