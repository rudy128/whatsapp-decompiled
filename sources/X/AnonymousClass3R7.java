package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3R7  reason: invalid class name */
public final class AnonymousClass3R7 extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public C36361nl A02;
    public AnonymousClass11C A03;
    public AnonymousClass11P A04;
    public C18000vb A05;
    public C32981i4 A06;
    public AnonymousClass1KW A07;
    public C18030ve A08;
    public AnonymousClass689 A09;
    public C36401np A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass031 A0F;
    public boolean A0G;
    public final WaImageView A0H;
    public final WaTextView A0I;
    public final C28931bI A0J;
    public final C28931bI A0K;
    public final C28931bI A0L;

    public AnonymousClass3R7(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A0G) {
            this.A0G = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A08 = AnonymousClass10E.A8r(A0O);
            this.A00 = AnonymousClass3MZ.A0N(A0O);
            this.A0B = C000200d.A00(A0O.A1k);
            this.A06 = (C32981i4) A0O.A3G.get();
            this.A07 = AnonymousClass3Ma.A0f(A0O);
            this.A0C = C000200d.A00(A0O.A3m);
            this.A0D = C000200d.A00(A0O.ALQ);
            this.A0E = C000200d.A00(A0O.A3n);
            this.A01 = AnonymousClass10E.A12(A0O);
            this.A02 = AnonymousClass3Ma.A0L(A0O);
            this.A0A = AnonymousClass3MY.A0e(A0O.A00);
            this.A09 = (AnonymousClass689) A0O.A5q.get();
            this.A03 = AnonymousClass3Ma.A0a(A0O);
            this.A04 = AnonymousClass10E.A6O(A0O);
            this.A05 = AnonymousClass10E.A6Q(A0O);
        }
        View.inflate(context, 2131625234, this);
        this.A0I = AnonymousClass3MW.A0T(this, 2131430590);
        this.A0H = AnonymousClass3MW.A0R(this, 2131430591);
        this.A0J = C28931bI.A00(this, 2131430549);
        this.A0L = C28931bI.A00(this, 2131430597);
        this.A0K = C28931bI.A00(this, 2131430588);
    }

    public static final void setUpCallLink$lambda$6$lambda$4(AnonymousClass3R7 r4, String str, C445823z r6, View view) {
        C18070vi.A0e(r4, 0, r6);
        C36361nl linkLauncher = r4.getLinkLauncher();
        Context A042 = AnonymousClass3MY.A04(r4);
        Uri parse = Uri.parse(str);
        int i = 24;
        if (C22971Dz.A0f(r6)) {
            i = 25;
        }
        linkLauncher.CGX(A042, parse, (AnonymousClass206) null, C200610r.A04(AnonymousClass1D6.A01("extra_call_lobby_entry_point", Integer.valueOf(i))), 0);
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setActivityUtils(AnonymousClass1L9 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setCallingWamEventHelperLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setDeepLinkHelper(C32981i4 r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setEmojiLoader(AnonymousClass1KW r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setEventMessageManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0C = r2;
    }

    public final void setEventTimeUtils(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0D = r2;
    }

    public final void setEventUtils(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0E = r2;
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setLinkLauncher(C36361nl r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setLinkifier(C36401np r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public final void setLocationUtils(AnonymousClass689 r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setTime(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    private final void setUpCallLink(C445823z r15) {
        AnonymousClass78R r1;
        int i;
        String str = r15.A05;
        int i2 = 8;
        if (str == null || str.length() == 0 || r15.A08) {
            this.A0K.A04(8);
            return;
        }
        C28931bI r6 = this.A0K;
        TextView A0E2 = AnonymousClass3Ma.A0E(r6.A02(), 2131430601);
        WaImageView waImageView = (WaImageView) C18070vi.A05(r6.A02(), 2131430600);
        A00(waImageView);
        WDSButton wDSButton = (WDSButton) C18070vi.A05(r6.A02(), 2131430599);
        View A052 = C18070vi.A05(r6.A02(), 2131430564);
        if (getDeepLinkHelper().A0I(r15.A05)) {
            if (((C88124Yk) getEventUtils().get()).A02(r15)) {
                i2 = 0;
            }
            wDSButton.setVisibility(i2);
            if (AnonymousClass11P.A01(((C88124Yk) getEventUtils().get()).A01) >= r15.A00 + TimeUnit.DAYS.toMillis(1)) {
                wDSButton.setEnabled(false);
                r1 = null;
            } else {
                wDSButton.setEnabled(true);
                r1 = new AnonymousClass78R(this, r15, str, 4);
            }
            wDSButton.setOnClickListener(r1);
            if (getDeepLinkHelper().A0L(r15.A05)) {
                A0E2.setText(2131898569);
                waImageView.setImageResource(2131233480);
                i = 2131232406;
            } else {
                A0E2.setText(2131898570);
                waImageView.setImageResource(2131233225);
                i = 2131231762;
            }
            wDSButton.setIcon(i);
            AnonymousClass3Ma.A1G(A052, this, str, 11);
        }
        r6.A04(0);
    }

    public static final void setUpCallLink$lambda$6$lambda$5(AnonymousClass3R7 r5, String str, View view) {
        C18070vi.A0d(r5, 0);
        try {
            ClipboardManager A092 = r5.getSystemServices().A09();
            if (A092 != null) {
                A092.setPrimaryClip(ClipData.newRawUri((CharSequence) null, Uri.parse(str)));
            }
            r5.getGlobalUI().A08(2131890049, 0);
            ((A4u) r5.getCallingWamEventHelperLazy().get()).A03(AnonymousClass74H.A02((String) null, 1, 10, true));
        } catch (NullPointerException | SecurityException e) {
            Log.e("EventAdditionalInfoView/copyCallLink", e);
            r5.getGlobalUI().A08(2131897878, 0);
        }
    }

    private final void setUpDate(C445823z r7) {
        WaTextView waTextView = this.A0I;
        long j = r7.A00;
        waTextView.setText(((AnonymousClass4S4) getEventTimeUtils().get()).A01(AnonymousClass00R.A00, r7.A03, j));
        A00(this.A0H);
        if (!r7.A08) {
            if (C18020vd.A05(C18040vf.A02, getAbProps(), 8309)) {
                C28931bI r2 = this.A0J;
                AnonymousClass3MY.A1E(r2.A02(), r7, this, 2);
                r2.A04(0);
                return;
            }
        }
        this.A0J.A04(8);
    }

    public static final void setUpLocation$lambda$3$lambda$2$lambda$1(WaTextView waTextView, String str, AnonymousClass3R7 r6, View view) {
        C18070vi.A0d(waTextView, 0);
        C18070vi.A0j(str, r6);
        try {
            ClipboardManager A092 = waTextView.getSystemServices().A09();
            if (A092 != null) {
                A092.setPrimaryClip(ClipData.newPlainText((CharSequence) null, str));
            }
            r6.getGlobalUI().A08(2131890103, 0);
        } catch (NullPointerException | SecurityException e) {
            Log.e("EventAdditionalInfoView/copyLocation", e);
            r6.getGlobalUI().A08(2131897878, 0);
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

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1L9 getActivityUtils() {
        AnonymousClass1L9 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("activityUtils");
        throw null;
    }

    public final AnonymousClass00H getCallingWamEventHelperLazy() {
        AnonymousClass00H r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("callingWamEventHelperLazy");
        throw null;
    }

    public final C32981i4 getDeepLinkHelper() {
        C32981i4 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("deepLinkHelper");
        throw null;
    }

    public final AnonymousClass1KW getEmojiLoader() {
        AnonymousClass1KW r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public final AnonymousClass00H getEventMessageManager() {
        AnonymousClass00H r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("eventMessageManager");
        throw null;
    }

    public final AnonymousClass00H getEventTimeUtils() {
        AnonymousClass00H r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("eventTimeUtils");
        throw null;
    }

    public final AnonymousClass00H getEventUtils() {
        AnonymousClass00H r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("eventUtils");
        throw null;
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final C36361nl getLinkLauncher() {
        C36361nl r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkLauncher");
        throw null;
    }

    public final C36401np getLinkifier() {
        C36401np r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1E();
        throw null;
    }

    public final AnonymousClass689 getLocationUtils() {
        AnonymousClass689 r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("locationUtils");
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

    public final AnonymousClass11P getTime() {
        AnonymousClass11P r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
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

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r2 >= 2.0f) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(com.whatsapp.WaImageView r9) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r2 = r0.fontScale
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0032
            r1 = 2131168783(0x7f070e0f, float:1.7951878E38)
        L_0x0013:
            X.0vb r3 = r8.getWhatsAppLocale()
            int r5 = X.AnonymousClass3Ma.A02(r8, r1)
            r2 = r9
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0030
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r6 = r1.getMarginEnd()
        L_0x002a:
            r4 = 0
            r7 = r4
            X.C27641Ww.A06(r2, r3, r4, r5, r6, r7)
            return
        L_0x0030:
            r6 = 0
            goto L_0x002a
        L_0x0032:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 2131168779(0x7f070e0b, float:1.795187E38)
            if (r0 < 0) goto L_0x0013
        L_0x003f:
            r1 = 2131168774(0x7f070e06, float:1.795186E38)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3R7.A00(com.whatsapp.WaImageView):void");
    }

    private final void setUpLocation(C445823z r9) {
        View.OnClickListener onClickListener;
        C193789qf r7;
        String A022 = AnonymousClass3MW.A0d(getEventMessageManager()).A02(r9);
        if (A022 != null) {
            C28931bI r6 = this.A0L;
            TextEmojiLabel A0c = C72453Mb.A0c(r6.A02(), 2131430596);
            TextView A0E2 = AnonymousClass3Ma.A0E(r6.A02(), 2131430636);
            A00((WaImageView) C18070vi.A05(r6.A02(), 2131430598));
            C72473Md.A1C(A0c);
            SpannableStringBuilder A092 = AnonymousClass3MW.A09(A022);
            getLinkifier().A08(A0c.getContext(), A092);
            C72483Me.A0w(A0c, A092);
            r6.A04(0);
            C194409rg r0 = r9.A01;
            if (!(r0 == null || (r7 = r0.A00) == null)) {
                double d = r7.A00;
                if (!(Double.valueOf(d) != null && d == 0.0d && r7.A01 == 0.0d)) {
                    A0E2.setText(2131890154);
                    onClickListener = new AnonymousClass48j(r9, this, r7, 24);
                    A0E2.setOnClickListener(onClickListener);
                }
            }
            A0E2.setText(A0E2.getResources().getString(2131890068));
            AnonymousClass3MX.A1D(A0E2.getResources(), A0E2, 2131890069);
            onClickListener = new AnonymousClass78R(A0E2, this, A022, 3);
            A0E2.setOnClickListener(onClickListener);
        }
    }

    public final void A01(C445823z r1) {
        setUpDate(r1);
        setUpLocation(r1);
        setUpCallLink(r1);
    }
}
