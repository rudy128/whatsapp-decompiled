package X;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import java.util.Locale;

/* renamed from: X.3y7  reason: invalid class name and case insensitive filesystem */
public class C80803y7 extends AnonymousClass3QS {
    public AnonymousClass1KB A00;
    public AnonymousClass11P A01;
    public C18000vb A02;
    public AnonymousClass1KW A03;
    public C18030ve A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public final LinearLayout A08;
    public final WaTextView A09;
    public final C28931bI A0A;
    public final TextEmojiLabel A0B;
    public final WaTextView A0C;
    public final WaTextView A0D;
    public final WaTextView A0E;

    public C80803y7(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A04 = AnonymousClass10E.A8r(A0O);
            this.A03 = AnonymousClass3Ma.A0f(A0O);
            this.A05 = C000200d.A00(A0O.A3m);
            this.A06 = C000200d.A00(A0O.ALQ);
            this.A07 = C000200d.A00(A0O.A3n);
            this.A00 = AnonymousClass10E.A12(A0O);
            this.A01 = AnonymousClass10E.A6O(A0O);
            this.A02 = AnonymousClass10E.A6Q(A0O);
        }
        View.inflate(context, 2131624518, this);
        C72473Md.A0y(this);
        this.A0B = (TextEmojiLabel) AnonymousClass3MX.A0C(this, 2131429039);
        this.A09 = C72453Mb.A0g(this, 2131429034);
        this.A0D = C72453Mb.A0g(this, 2131429037);
        this.A0E = C72453Mb.A0g(this, 2131429038);
        this.A0C = C72453Mb.A0g(this, 2131429035);
        this.A08 = (LinearLayout) AnonymousClass3MX.A0C(this, 2131429033);
        this.A0A = C72453Mb.A0s(this, 2131429040);
    }

    public final void A00(C445823z r6, boolean z) {
        C18070vi.A0d(r6, 0);
        String A022 = AnonymousClass3MW.A0d(getEventMessageManager()).A02(r6);
        if (A022 != null) {
            WaTextView waTextView = this.A0D;
            waTextView.setVisibility(0);
            AnonymousClass3MY.A0u(getContext(), waTextView.getPaint(), waTextView, getEmojiLoader(), AnonymousClass3MW.A09(A022));
            return;
        }
        WaTextView waTextView2 = this.A0D;
        int i = 8;
        if (z) {
            i = 4;
        }
        waTextView2.setVisibility(i);
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setEmojiLoader(AnonymousClass1KW r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setEventMessageManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setEventName(C445823z r3) {
        C18070vi.A0d(r3, 0);
        C72483Me.A0w(this.A0B, AnonymousClass3MW.A09(r3.A06));
    }

    public final void setEventTimeUtils(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setEventType(C82944Ct r5) {
        WaTextView waTextView;
        int A022;
        C18070vi.A0d(r5, 0);
        int ordinal = r5.ordinal();
        if (ordinal == 0 || ordinal == 2) {
            AnonymousClass3MX.A1C(getContext(), this.A0E, 2131101222);
            waTextView = this.A0C;
            A022 = AnonymousClass3MY.A02(this, 2131101222);
        } else if (ordinal == 1) {
            C72463Mc.A0y(AnonymousClass3MY.A04(this), this.A0E, 2130971952, 2131103088);
            waTextView = this.A0C;
            A022 = AnonymousClass3Ma.A00(AnonymousClass3MY.A04(this), 2130971952, 2131103088);
        } else {
            return;
        }
        waTextView.setTextColor(A022);
    }

    public final void setEventUtils(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setResponseStatus(C445823z r5) {
        C18070vi.A0d(r5, 0);
        ((C88124Yk) getEventUtils().get()).A00(r5, "ChatInfoEventLayout", new C100955Aj(this, 0));
    }

    public final void setTime(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public static /* synthetic */ void setEventLocation$default(C80803y7 r1, C445823z r2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            r1.A00(r2, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setEventLocation");
    }

    public static /* synthetic */ void setOnClickListener$default(C80803y7 r1, C445823z r2, C82984Cx r3, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                r3 = C82984Cx.NONE;
            }
            r1.setOnClickListener(r2, r3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOnClickListener");
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1KW getEmojiLoader() {
        AnonymousClass1KW r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public final LinearLayout getEventContainer() {
        return this.A08;
    }

    public final AnonymousClass00H getEventMessageManager() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("eventMessageManager");
        throw null;
    }

    public final AnonymousClass00H getEventTimeUtils() {
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("eventTimeUtils");
        throw null;
    }

    public final AnonymousClass00H getEventUtils() {
        AnonymousClass00H r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("eventUtils");
        throw null;
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final AnonymousClass11P getTime() {
        AnonymousClass11P r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setAbbreviatedDate(long j) {
        Locale A0N = getWhatsAppLocale().A0N();
        C18070vi.A0X(A0N);
        String A0Y = C72483Me.A0Y(DateFormat.getBestDateTimePattern(A0N, "MMM"), A0N, j);
        C18000vb whatsAppLocale = getWhatsAppLocale();
        String A0Y2 = C72483Me.A0Y(whatsAppLocale.A08(167), whatsAppLocale.A0N(), j);
        WaTextView waTextView = this.A0E;
        String upperCase = A0Y.toUpperCase(Locale.ROOT);
        C18070vi.A0X(upperCase);
        waTextView.setText(upperCase);
        this.A0C.setText(A0Y2);
    }

    public final void setOnClickListener(C445823z r3, C82984Cx r4) {
        C18070vi.A0h(r3, r4);
        AnonymousClass48j.A00(this.A08, r4, this, r3, 23);
    }
}
