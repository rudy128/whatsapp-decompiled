package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.whatsapp.conversation.carousel.CarouselView;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.3uC  reason: invalid class name and case insensitive filesystem */
public class C79033uC extends C78163sL {
    public A1M A00;
    public CarouselView A01;
    public C78043s2 A02;
    public C190789lW A03;
    public AnonymousClass205 A04;
    public AnonymousClass00H A05 = C221618v.A00(C216516w.class);
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public int A08;
    public final int A09;
    public final AnonymousClass1GP A0A;
    public final C108875cR A0B;
    public final C216416v A0C;
    public final View A0D;
    public final InteractiveMessageButton A0E;
    public final InteractiveMessageView A0F;

    private ViewTreeObserver.OnPreDrawListener getOnPreDrawListener() {
        return new C90664eR(this, 1);
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public void onMeasure(int i, int i2) {
        CarouselView carouselView;
        int i3 = i;
        if (C20120A8f.A06(getFMessage())) {
            i3 = View.MeasureSpec.makeMeasureSpec(this.A09, 1073741824);
        }
        int i4 = i2;
        super.onMeasure(i3, i2);
        if (C20120A8f.A07(getFMessage()) && (carouselView = this.A01) != null && carouselView.getVisibility() != 8) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            C42491yG.A0A(this.A01, i3, 0, 0, i4, measuredHeight);
            int A002 = measuredHeight + C42491yG.A00(this.A01);
            int A1P = A1P(i3, i2, A002);
            this.A08 = A1P;
            setMeasuredDimension(measuredWidth, (A002 + A1P) - getResources().getDimensionPixelOffset(2131168779));
        }
    }

    public boolean A1X() {
        return AnonymousClass000.A1O(this.A16.A01(getFMessage()));
    }

    public boolean A2f(AnonymousClass206 r4) {
        C20285AEt aEt = ((AnonymousClass21L) r4).A00;
        if (aEt == null || aEt.A00 != 3 || !"review_order".equals(aEt.A00())) {
            return !this.A0V;
        }
        return false;
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof AnonymousClass21L);
        this.A0I = r2;
    }

    public C79033uC(Context context, AnonymousClass1GP r6, C108875cR r7, C216416v r8, AnonymousClass21L r9) {
        super(context, r7, r9);
        View A062;
        A1M();
        this.A0A = r6;
        this.A0C = r8;
        this.A0B = r7;
        InteractiveMessageButton interactiveMessageButton = (InteractiveMessageButton) AnonymousClass1HF.A06(this, 2131428578);
        this.A0E = interactiveMessageButton;
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) AnonymousClass1HF.A06(this, 2131431755);
        this.A0F = interactiveMessageView;
        interactiveMessageView.setLayoutView(r9.A0v.A02 ^ true ? 1 : 0);
        this.A0D = AnonymousClass1HF.A06(this, 2131428595);
        this.A04 = getFMessage().A0v;
        C88484Zw r2 = (C88484Zw) this.A06.get();
        getFMessage();
        interactiveMessageView.A03(this.A2t, r6, r2);
        interactiveMessageButton.A0L.A00 = r2;
        this.A09 = getResources().getDimensionPixelSize(2131166243);
        A00();
        if (r2.A05 && (A062 = AnonymousClass1HF.A06(this, 2131429603)) != null) {
            AnonymousClass3MY.A14(getResources(), A062, 2131166347);
        }
    }

    private void A00() {
        int intValue;
        AnonymousClass21L r9 = (AnonymousClass21L) getFMessage();
        this.A0F.A04(this, r9, 0);
        if (C20120A8f.A07(getFMessage())) {
            AnonymousClass00H r7 = this.A05;
            HashSet hashSet = ((C216516w) r7.get()).A01;
            AnonymousClass205 r6 = this.A04;
            if (!hashSet.contains(r6)) {
                this.A03.A00(238890222, "carousel_message_render_tag", getClass().getSimpleName());
                ((C216516w) r7.get()).A01.add(r6);
                C90664eR.A00(getViewTreeObserver(), this, 1);
            }
            this.A0E.setVisibility(8);
            this.A0D.setVisibility(8);
            if (this.A01 == null) {
                CarouselView carouselView = new CarouselView(getContext());
                this.A01 = carouselView;
                carouselView.setId(2131429595);
                this.A01.A14();
                this.A01.A0t(new AnonymousClass3XY(this, 0));
                addView(this.A01, new ViewGroup.MarginLayoutParams(-1, -2));
            }
            C108875cR r72 = this.A0B;
            if (r72 != null) {
                this.A02 = new C78043s2(getContext(), this.A0A, this.A00, r72, this.A0B.A0B, r9);
                C108675c7 conversationRowCustomizer = r72.getConversationRowCustomizer();
                int i = AnonymousClass3Ma.A09(this).widthPixels;
                int BW4 = conversationRowCustomizer.BW4(getContext(), ((Rect) C72463Mc.A0m(((C93084iP) this.A09).A0Q)).left);
                CarouselView carouselView2 = this.A01;
                carouselView2.setPaddingRelative(BW4, carouselView2.getPaddingTop(), (i - this.A09) - BW4, carouselView2.getPaddingBottom());
                if (r9.A17() != null) {
                    this.A01.setItemViewCacheSize(r9.A17().size());
                }
                this.A01.setAdapter(this.A02);
                C216416v r0 = this.A0C;
                AnonymousClass205 r1 = r9.A0v;
                C18070vi.A0d(r1, 0);
                Number number = (Number) r0.A00.get(r1);
                if (number == null) {
                    intValue = 0;
                } else {
                    intValue = number.intValue();
                }
                this.A01.A15(intValue);
            }
            this.A01.setVisibility(0);
        } else {
            CarouselView carouselView3 = this.A01;
            if (carouselView3 != null) {
                carouselView3.setVisibility(8);
            }
            InteractiveMessageButton interactiveMessageButton = this.A0E;
            interactiveMessageButton.setVisibility(0);
            this.A0D.setVisibility(0);
            interactiveMessageButton.A01(this.A0A, this, this.A0B, r9);
        }
        A2N(r9);
    }

    public void A1T(AnonymousClass205 r2) {
        AnonymousClass3uL A2i = A2i(r2);
        if (A2i != null) {
            A2i.A1T(r2);
        } else {
            super.A1T(r2);
        }
    }

    public boolean A1U() {
        if (C20120A8f.A07(getFMessage())) {
            return false;
        }
        return super.A1U();
    }

    public void A1u() {
        A00();
        AnonymousClass3uP.A0h(this, false);
    }

    public void A2B(ViewGroup viewGroup, TextView textView, AnonymousClass206 r5) {
        if (C20120A8f.A06(getFMessage())) {
            return;
        }
        if (C20120A8f.A09(r5)) {
            AnonymousClass3MY.A0x(getContext(), textView, 2131886812);
        } else {
            super.A2B(viewGroup, textView, r5);
        }
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A00();
        }
    }

    public boolean A2h(AnonymousClass205 r4) {
        C78043s2 r1;
        boolean A2h = super.A2h(r4);
        if (A2h || !C20120A8f.A07(getFMessage()) || (r1 = this.A02) == null) {
            return A2h;
        }
        C18070vi.A0d(r4, 0);
        if (r1.A0U(r4) >= 0) {
            return true;
        }
        return false;
    }

    public AnonymousClass3uL A2i(AnonymousClass205 r3) {
        CarouselView carouselView;
        C78043s2 r1;
        if (!C20120A8f.A07(getFMessage()) || (carouselView = this.A01) == null || carouselView.getVisibility() == 8 || (r1 = this.A02) == null) {
            return null;
        }
        C18070vi.A0d(r3, 0);
        if (r1.A0U(r3) < 0) {
            return null;
        }
        C42011xT A0O = this.A01.A0O(this.A02.A0U(r3));
        if (A0O instanceof AnonymousClass3s5) {
            return ((AnonymousClass3s5) A0O).A00;
        }
        return null;
    }

    public int getGlowContentBottom() {
        CarouselView carouselView;
        if (!C20120A8f.A07(getFMessage()) || (carouselView = this.A01) == null || carouselView.getVisibility() == 8) {
            return super.getGlowContentBottom();
        }
        return this.A01.getBottom();
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        InteractiveMessageView interactiveMessageView = this.A0F;
        if (interactiveMessageView != null) {
            innerFrameLayouts.add(interactiveMessageView.getInnerFrameLayout());
        }
        return innerFrameLayouts;
    }

    public int getMainChildMaxWidth() {
        if (C20120A8f.A07(getFMessage()) || C20120A8f.A06(getFMessage())) {
            return this.A09;
        }
        return 0;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        CarouselView carouselView = this.A01;
        if (carouselView != null) {
            Rect A072 = AnonymousClass3MW.A07();
            carouselView.getHitRect(A072);
            if (A072.contains((int) x, (int) y)) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        CarouselView carouselView;
        super.onLayout(z, i, i2, i3, i4);
        if (C20120A8f.A07(getFMessage()) && (carouselView = this.A01) != null && carouselView.getVisibility() != 8) {
            int A1N = ((A1N() + this.A08) + AnonymousClass3MW.A0B(this.A01).topMargin) - getResources().getDimensionPixelOffset(2131168779);
            int measuredWidth = this.A01.getMeasuredWidth();
            int measuredHeight = this.A01.getMeasuredHeight();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            this.A01.layout(measuredWidth2, A1N, measuredWidth + measuredWidth2, measuredHeight + A1N);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ((C57802jf) this.A07.get()).A00(getFMessage(), i);
    }

    public int getCenteredLayoutId() {
        return 2131624873;
    }

    public int getIncomingLayoutId() {
        return 2131624873;
    }

    public int getOutgoingLayoutId() {
        return 2131624874;
    }
}
