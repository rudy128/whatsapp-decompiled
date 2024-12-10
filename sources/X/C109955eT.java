package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.5eT  reason: invalid class name and case insensitive filesystem */
public class C109955eT extends View implements AnonymousClass009 {
    public float A00;
    public float A01;
    public Path A02;
    public View A03;
    public AnonymousClass1KB A04;
    public AnonymousClass86F A05;
    public C129916ia A06;
    public AnonymousClass031 A07;
    public boolean A08;
    public float A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public final RectF A0D;
    public final Paint A0E;
    public final Rect A0F;
    public final TextPaint A0G;
    public final View.OnLayoutChangeListener A0H;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.6ia, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109955eT(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        if (!this.A08) {
            this.A08 = true;
            this.A04 = AnonymousClass10E.A12(AnonymousClass3MW.A0O(generatedComponent()));
        }
        this.A02 = C108945cZ.A0L();
        this.A0F = AnonymousClass3MW.A07();
        this.A06 = new Object();
        this.A0D = AnonymousClass3MW.A08();
        Paint A0K = C108945cZ.A0K(1);
        this.A0E = A0K;
        TextPaint textPaint = new TextPaint(1);
        this.A0G = textPaint;
        this.A0H = new C1420978d((Object) this, 24);
        C129916ia r5 = this.A06;
        Resources A052 = AnonymousClass3MX.A05(this);
        r5.A02 = A052.getDimensionPixelSize(2131169533);
        r5.A03 = A052.getDimensionPixelSize(2131169533);
        r5.A00 = AnonymousClass3MW.A00(A052, 2131169436);
        r5.A04 = A052.getDimensionPixelSize(2131169533);
        r5.A01 = A052.getDimensionPixelSize(2131169544);
        C108945cZ.A1L(A0K);
        AnonymousClass3MX.A19(context, A0K, AnonymousClass1YL.A00(context, 2130972002, 2131103208));
        A0K.setPathEffect(new CornerPathEffect((float) this.A06.A01));
        textPaint.setTextSize(this.A06.A00);
        AnonymousClass3MX.A19(context, textPaint, AnonymousClass1YL.A00(context, 2130971982, 2131103160));
    }

    public static /* synthetic */ void getLayoutChangeListener$annotations() {
    }

    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        C18070vi.A0d(canvas, 0);
        String str = this.A0A;
        if (str != null) {
            Rect rect = this.A0F;
            int i = rect.right - rect.left;
            int i2 = rect.bottom - rect.top;
            C129916ia r4 = this.A06;
            int i3 = r4.A03;
            int i4 = i2 + i3 + i3;
            RectF rectF = this.A0D;
            float f4 = (float) (i3 + i + i3);
            float f5 = this.A00 - (this.A09 * f4);
            rectF.left = f5;
            rectF.right = f5 + f4;
            boolean z = this.A0C;
            float f6 = this.A01;
            if (z) {
                f = f6 + ((float) r4.A04);
            } else {
                f = (f6 - ((float) i4)) - ((float) r4.A04);
            }
            rectF.top = f;
            float f7 = (float) i4;
            rectF.bottom = f + f7;
            Path path = this.A02;
            path.reset();
            boolean z2 = this.A0C;
            float f8 = this.A00;
            float f9 = this.A01;
            float f10 = ((float) r4.A04) / 2.0f;
            if (z2) {
                path.moveTo(f8, f9 + f10);
                float f11 = this.A00;
                float f12 = (float) r4.A04;
                path.lineTo(f11 - (f12 / 2.0f), this.A01 + f12);
                path.lineTo(rectF.left, rectF.top);
                path.lineTo(rectF.left, rectF.bottom);
                path.lineTo(rectF.right, rectF.bottom);
                path.lineTo(rectF.right, rectF.top);
                float f13 = this.A00;
                float f14 = (float) r4.A04;
                path.lineTo(f13 + (f14 / 2.0f), this.A01 + f14);
                f2 = this.A00;
                f3 = this.A01 + (((float) r4.A04) / 2.0f);
            } else {
                path.moveTo(f8, f9 - f10);
                float f15 = this.A00;
                float f16 = (float) r4.A04;
                path.lineTo(f15 - (f16 / 2.0f), this.A01 - f16);
                path.lineTo(rectF.left, rectF.bottom);
                path.lineTo(rectF.left, rectF.top);
                path.lineTo(rectF.right, rectF.top);
                path.lineTo(rectF.right, rectF.bottom);
                float f17 = this.A00;
                float f18 = (float) r4.A04;
                path.lineTo(f17 + (f18 / 2.0f), this.A01 - f18);
                f2 = this.A00;
                f3 = this.A01 - (((float) r4.A04) / 2.0f);
            }
            path.lineTo(f2, f3);
            path.close();
            canvas.drawPath(path, this.A0E);
            TextPaint textPaint = this.A0G;
            canvas.drawText(str, rectF.left + ((float) r4.A03), rectF.top + ((f7 / 2.0f) - ((textPaint.descent() + textPaint.ascent()) / 2.0f)), textPaint);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 0);
        boolean contains = this.A0D.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        if (action == 0) {
            return contains;
        }
        if (action != 1) {
            if (action != 2) {
                return false;
            }
            return contains;
        } else if (!contains) {
            return contains;
        } else {
            performClick();
            AnonymousClass1KB r2 = this.A04;
            if (r2 == null) {
                return contains;
            }
            r2.A0J(new C146787Qp(this, 49));
            return contains;
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    private final String getEllipsizedText() {
        String str = this.A0B;
        if (str == null) {
            return null;
        }
        TextPaint textPaint = this.A0G;
        float measureText = textPaint.measureText(String.valueOf(str));
        int width = AnonymousClass3MZ.A0F(AnonymousClass3Ma.A05(this)).getWidth();
        C129916ia r0 = this.A06;
        float f = (float) (width - ((r0.A02 + r0.A03) * 2));
        if (measureText > f) {
            measureText = f;
        }
        return TextUtils.ellipsize(this.A0B, textPaint, measureText, TextUtils.TruncateAt.END).toString();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A07;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public final void setAnchorView(View view) {
        boolean z = !C18070vi.A18(this.A03, view);
        this.A03 = view;
        if (z) {
            A00(view, this);
            View view2 = this.A03;
            if (view2 != null) {
                view2.addOnLayoutChangeListener(this.A0H);
            }
            AnonymousClass1HF.A0g(this, new C1425779z(this, 4));
        }
    }

    public final void setText(String str) {
        boolean z = !C18070vi.A18(this.A0B, str);
        this.A0B = str;
        if (z) {
            String ellipsizedText = getEllipsizedText();
            this.A0A = ellipsizedText;
            if (ellipsizedText != null) {
                this.A0G.getTextBounds(ellipsizedText, 0, ellipsizedText.length(), this.A0F);
            }
            invalidate();
        }
    }

    public static final void A00(View view, C109955eT r10) {
        if (r10.getParent() instanceof ViewGroup) {
            ViewParent parent = r10.getParent();
            C18070vi.A0z(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(r10);
        }
        if (view != null) {
            Rect A072 = AnonymousClass3MW.A07();
            view.getGlobalVisibleRect(A072);
            int i = A072.right - A072.left;
            C129916ia r7 = r10.A06;
            if (i >= r7.A04 && A072.bottom - A072.top > 0) {
                int i2 = A072.bottom;
                int i3 = A072.top;
                boolean A1R = AnonymousClass000.A1R(((C108945cZ.A04(view.getRootView()) / 2.0f) > (((float) (i2 + i3)) / 2.0f) ? 1 : ((C108945cZ.A04(view.getRootView()) / 2.0f) == (((float) (i2 + i3)) / 2.0f) ? 0 : -1)));
                r10.A0C = A1R;
                float f = ((float) (A072.right + A072.left)) / 2.0f;
                r10.A00 = f;
                if (!A1R) {
                    i2 = i3;
                }
                r10.A01 = (float) i2;
                r10.A09 = f / ((float) (view.getRootView().getWidth() + r7.A04));
                View rootView = view.getRootView();
                C18070vi.A0z(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) rootView;
                viewGroup.addView(r10, viewGroup.getChildCount());
            }
        }
    }

    public final View getAnchorView() {
        return this.A03;
    }

    public final AnonymousClass1KB getGlobalUI() {
        return this.A04;
    }

    public final String getText() {
        return this.A0B;
    }

    public boolean performClick() {
        super.performClick();
        return true;
    }

    public final void setGlobalUI(AnonymousClass1KB r1) {
        this.A04 = r1;
    }

    public final void setOnDismissListener(AnonymousClass86F r1) {
        this.A05 = r1;
    }
}
