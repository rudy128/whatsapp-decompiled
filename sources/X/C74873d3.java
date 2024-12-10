package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.EmojiPopupFooter;
import com.whatsapp.emoji.search.EmojiSearchProvider;

@Deprecated
/* renamed from: X.3d3  reason: invalid class name and case insensitive filesystem */
public class C74873d3 extends AnonymousClass3RR implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00 = 2131232116;
    public int A01;
    public int A02 = 2131232028;
    public int A03;
    public ViewGroup A04;
    public C107845ai A05;
    public AnonymousClass4aN A06;
    public EmojiPopupFooter A07;
    public AnonymousClass4MZ A08 = new AnonymousClass4MZ(true, true);
    public C107365Zk A09;
    public C132616nB A0A;
    public AnonymousClass4UI A0B;
    public C87684Wn A0C;
    public Integer A0D;
    public Runnable A0E;
    public boolean A0F;
    public boolean A0G = false;
    public int A0H;
    public final View.OnClickListener A0I;
    public final View A0J;
    public final View A0K;
    public final AbsListView.OnScrollListener A0L = new C64782vK(this, 7);
    public final WaEditText A0M;
    public final EmojiSearchProvider A0N;
    public final Integer A0O;
    public final C107845ai A0P = new C92094gk(this, 5);
    public final AnonymousClass1KW A0Q;
    public final C18030ve A0R;
    public final C18000vb A0S;
    public final A59 A0T;
    public final C1193267r A0U;
    public final C18010vc A0V;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C74873d3(android.app.Activity r11, android.view.View r12, X.AnonymousClass190 r13, X.AnonymousClass5YX r14, com.whatsapp.WaEditText r15, X.AnonymousClass11C r16, X.C19830z4 r17, X.C18000vb r18, X.A59 r19, X.C1193267r r20, X.AnonymousClass1KW r21, com.whatsapp.emoji.search.EmojiSearchProvider r22, X.C18030ve r23, X.C18010vc r24, X.AnonymousClass1L4 r25, java.lang.Integer r26, java.lang.Integer r27) {
        /*
            r10 = this;
            r6 = r14
            r3 = r10
            r9 = r25
            r5 = r13
            r4 = r11
            r7 = r16
            r8 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0 = 0
            r10.A0G = r0
            r1 = 1
            X.4MZ r0 = new X.4MZ
            r0.<init>(r1, r1)
            r10.A08 = r0
            r0 = 2131232116(0x7f080574, float:1.8080332E38)
            r10.A00 = r0
            r0 = 2131232028(0x7f08051c, float:1.8080154E38)
            r10.A02 = r0
            r1 = 5
            X.4gk r0 = new X.4gk
            r0.<init>(r10, r1)
            r10.A0P = r0
            r1 = 7
            X.2vK r0 = new X.2vK
            r0.<init>(r10, r1)
            r10.A0L = r0
            r0 = 13
            X.4dG r2 = new X.4dG
            r2.<init>(r10, r0)
            r10.A0I = r2
            android.view.View r6 = (android.view.View) r6
            r10.A0K = r6
            r0 = r23
            r10.A0R = r0
            r0 = r21
            r10.A0Q = r0
            r0 = r20
            r10.A0U = r0
            r0 = r18
            r10.A0S = r0
            r0 = r22
            r10.A0N = r0
            r0 = r24
            r10.A0V = r0
            r10.A0J = r12
            r10.A0M = r15
            r0 = r26
            r10.A0O = r0
            r0 = r27
            r10.A0D = r0
            r0 = r19
            r10.A0T = r0
            android.view.ViewTreeObserver r0 = r6.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r10)
            if (r12 == 0) goto L_0x0084
            r0 = 2131232116(0x7f080574, float:1.8080332E38)
            r1 = 2131101210(0x7f06061a, float:1.7814823E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MX.A06(r11, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A05(r11, r0, r1)
            X.AnonymousClass4W7.A00(r0, r12)
            r12.setOnClickListener(r2)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74873d3.<init>(android.app.Activity, android.view.View, X.190, X.5YX, com.whatsapp.WaEditText, X.11C, X.0z4, X.0vb, X.A59, X.67r, X.1KW, com.whatsapp.emoji.search.EmojiSearchProvider, X.0ve, X.0vc, X.1L4, java.lang.Integer, java.lang.Integer):void");
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [android.os.Handler, X.3NQ] */
    public void A0D() {
        this.A02 = false;
        if (getClass().equals(C74873d3.class)) {
            A0K(C17880vN.A0k(), this.A0O, this.A0D);
        }
        A07();
        this.A04.setKeyboardPopup(this);
        if (this.A06 == null) {
            A0E();
        }
        A0G();
        AnonymousClass4aN r5 = this.A06;
        if (AnonymousClass4aN.A0U == null) {
            HandlerThread handlerThread = new HandlerThread("Emoji Thread");
            AnonymousClass4aN.A0U = handlerThread;
            handlerThread.start();
            Context applicationContext = r5.A09.getApplicationContext();
            AnonymousClass4aN.A0W = new AnonymousClass3NS(applicationContext, AnonymousClass4aN.A0U.getLooper(), r5.A0L);
            Looper mainLooper = applicationContext.getMainLooper();
            C17960vV.A07(mainLooper);
            AnonymousClass4aN.A0V = new Handler(mainLooper);
        }
        r5.A0J.getViewTreeObserver().addOnGlobalLayoutListener(r5.A0F);
        A0F();
        int A0B2 = A0B(-1);
        this.A01 = A0B2;
        setHeight(A0B2);
        setWidth(-1);
        View view = this.A0K;
        if (view != null) {
            showAtLocation(view, 8388659, 0, 1000000);
            view.postDelayed(new C70563Bp(view, 42), 60);
        }
        CFm();
        WaEditText waEditText = this.A0M;
        if (waEditText != null) {
            A09(waEditText);
        }
    }

    public void A0E() {
        Activity activity = this.A03;
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        activity.getLayoutInflater().inflate(2131625189, relativeLayout, true);
        ViewGroup A0D2 = AnonymousClass3MW.A0D(relativeLayout, 2131430350);
        this.A04 = A0D2;
        A0D2.getLayoutParams().height = -1;
        this.A04.setVisibility(0);
        setContentView(relativeLayout);
        relativeLayout.setLayoutDirection(3);
        AnonymousClass3RR.A00(this);
        int i = 8;
        this.A04.findViewById(2131430790).setVisibility(8);
        C18030ve r16 = this.A0R;
        AnonymousClass190 r15 = this.A0A;
        AnonymousClass1KW r13 = this.A0Q;
        C1193267r r12 = this.A0U;
        C18000vb r11 = this.A0S;
        C19830z4 r9 = this.A06;
        C18010vc r6 = this.A0V;
        ViewGroup viewGroup = this.A04;
        View view = this.A0K;
        C1193267r r21 = r12;
        C18000vb r20 = r11;
        C19830z4 r19 = r9;
        AnonymousClass190 r18 = r15;
        AbsListView.OnScrollListener onScrollListener = this.A0L;
        ViewGroup viewGroup2 = viewGroup;
        View view2 = view;
        AnonymousClass4aN r132 = new AnonymousClass4aN(activity, view2, viewGroup2, onScrollListener, r18, r19, r20, r21, r13, r16, r6);
        this.A06 = r132;
        r132.A02 = this.A0P;
        EmojiPopupFooter emojiPopupFooter = (EmojiPopupFooter) this.A04.findViewById(2131430964);
        this.A07 = emojiPopupFooter;
        emojiPopupFooter.setClickable(true);
        A0L(true);
        View findViewById = this.A04.findViewById(2131431140);
        View findViewById2 = this.A04.findViewById(2131430343);
        View findViewById3 = this.A04.findViewById(2131434860);
        findViewById.setVisibility(8);
        findViewById2.setVisibility(8);
        A0I(findViewById3);
        EmojiSearchProvider emojiSearchProvider = this.A0N;
        if (emojiSearchProvider.A02 && !this.A0F) {
            i = 0;
        }
        findViewById3.setVisibility(i);
        emojiSearchProvider.A01((Integer) null);
        C825048f.A00(findViewById3, this, 49);
        AnonymousClass3MY.A1B(this.A04, 2131429906, 0);
        setTouchInterceptor(new C90334du((Object) this, 18));
        setFocusable(false);
    }

    public void A0F() {
        View view;
        if (this.A0H != 1 && (view = this.A0J) != null) {
            Activity activity = this.A03;
            AnonymousClass4W7.A00(AnonymousClass4aX.A05(activity, AnonymousClass3MX.A06(activity, this.A02), 2131101210), view);
            AnonymousClass3MY.A0w(activity, view, 2131891546);
            view.setOnClickListener(this.A0I);
            this.A0H = 1;
        }
    }

    public void A0G() {
        A0L(this.A08.A01);
    }

    public void A0H() {
        View view;
        if (this.A0H != 0 && (view = this.A0J) != null) {
            Activity activity = this.A03;
            AnonymousClass4W7.A00(AnonymousClass4aX.A05(activity, AnonymousClass3MX.A06(activity, this.A00), 2131101210), view);
            AnonymousClass3MY.A0w(activity, view, 2131898949);
            view.setOnClickListener(this.A0I);
            this.A0H = 0;
        }
    }

    public void A0I(View view) {
        this.A0N.A00 = new AnonymousClass7IN(view, this, 0);
    }

    public void A0J(C107845ai r3) {
        this.A05 = r3;
        AnonymousClass4aN r1 = this.A06;
        if (r1 != null) {
            r1.A02 = this.A0P;
        }
    }

    public void A0K(Integer num, Integer num2, Integer num3) {
        if (!this.A0G) {
            this.A0G = true;
            this.A0T.A04(num3, 20, num.intValue(), num2.intValue(), false);
        }
    }

    public void A0L(boolean z) {
        ImageView imageView = this.A06.A0I;
        if (imageView != null) {
            imageView.setVisibility(C72453Mb.A07(z ? 1 : 0));
        }
    }

    public void CFm() {
        if (this.A07.getVisibility() != 0) {
            this.A07.setVisibility(0);
        }
        Animation animation = this.A07.getAnimation();
        if (animation instanceof AnonymousClass3OS) {
            animation.cancel();
        }
        this.A07.setTopOffset(0);
    }

    public void onGlobalLayout() {
        boolean A002;
        if (this.A03.getResources().getConfiguration().keyboard != 1) {
            A002 = false;
        } else {
            A002 = AnonymousClass1L4.A00(this.A0K);
        }
        this.A00 = A002 ? 1 : 0;
    }

    public void A0C() {
        super.A0C();
        this.A0N.A00 = null;
        A0H();
        AnonymousClass4aN r2 = this.A06;
        if (r2 != null) {
            r2.A0D.setVisibility(8);
            r2.A0J.getViewTreeObserver().removeOnGlobalLayoutListener(r2.A0F);
        }
        this.A0G = false;
        this.A0T.A02();
    }
}
