package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class BM0 extends C40611uz {
    public float A00;
    public AnonymousClass8IC A01;
    public boolean A02 = false;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Rect A07;
    public final C24992CSs A08;
    public final boolean A09;
    public final boolean A0A;
    public final int A0B;
    public final int A0C;
    public final Paint A0D = AnonymousClass3MW.A06();
    public final RectF A0E = AnonymousClass3MW.A08();
    public final RectF A0F = AnonymousClass3MW.A08();

    public void A03(Canvas canvas, C38021qZ r13, RecyclerView recyclerView) {
        RectF rectF;
        RectF rectF2;
        float f;
        int i;
        Rect rect;
        int width;
        AnonymousClass8IC r1 = this.A01;
        if (r1 != null && !this.A02 && !r1.A04 && r1.A02) {
            C21471Akc akc = new C21471Akc((Object) r1, (Object) recyclerView, 32);
            r1.A01 = akc;
            recyclerView.postDelayed(akc, 1500);
        }
        boolean z = true;
        this.A02 = true;
        if (this.A00 != 0.0f) {
            C38251qy layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                boolean A1T = AnonymousClass000.A1T(linearLayoutManager.A07.getLayoutDirection(), 1);
                if (linearLayoutManager.A01 == 1) {
                    int A0r = linearLayoutManager.A0r(r13);
                    int A0t = linearLayoutManager.A0t(r13);
                    int height = recyclerView.getHeight();
                    boolean z2 = this.A0A;
                    if (z2) {
                        Rect rect2 = this.A07;
                        height = (height - rect2.top) - rect2.bottom;
                    }
                    int A0s = linearLayoutManager.A0s(r13);
                    if (A0t != A0r) {
                        int round = Math.round((((float) height) * ((float) A0r)) / ((float) A0t));
                        int i2 = height / 2;
                        if (round > i2) {
                            round = i2;
                        }
                        int round2 = Math.round((((float) (height - round)) * ((float) A0s)) / ((float) (A0t - A0r)));
                        rectF = this.A0F;
                        if (A1T) {
                            rect = this.A07;
                            int i3 = rect.right;
                            rectF.left = (float) i3;
                            width = this.A06 + i3;
                        } else {
                            rect = this.A07;
                            rectF.left = (float) ((recyclerView.getWidth() - this.A06) - rect.right);
                            width = recyclerView.getWidth() - rect.right;
                        }
                        float f2 = (float) width;
                        rectF.right = f2;
                        rectF.top = (float) round2;
                        rectF.bottom = (float) (round2 + round);
                        rectF2 = this.A0E;
                        rectF2.left = rectF.left;
                        rectF2.right = f2;
                        rectF2.top = 0.0f;
                        rectF2.bottom = C108945cZ.A04(recyclerView);
                        if (z2) {
                            float f3 = rectF.top;
                            float f4 = (float) rect.top;
                            rectF.top = f3 + f4;
                            rectF.bottom += f4;
                            rectF2.top += f4;
                            rectF2.bottom -= (float) rect.bottom;
                        }
                    } else {
                        return;
                    }
                } else {
                    int A0o = linearLayoutManager.A0o(r13);
                    int A0q = linearLayoutManager.A0q(r13);
                    int width2 = recyclerView.getWidth();
                    boolean z3 = this.A0A;
                    if (z3) {
                        Rect rect3 = this.A07;
                        width2 = (width2 - rect3.left) - rect3.right;
                    }
                    int A0p = linearLayoutManager.A0p(r13);
                    if (A0q != A0o) {
                        int round3 = Math.round((((float) width2) * ((float) A0o)) / ((float) A0q));
                        int i4 = width2 / 2;
                        if (round3 > i4) {
                            round3 = i4;
                        }
                        int round4 = Math.round((((float) (width2 - round3)) * ((float) A0p)) / ((float) (A0q - A0o)));
                        rectF = this.A0F;
                        rectF.left = (float) round4;
                        rectF.right = (float) (round4 + round3);
                        Rect rect4 = this.A07;
                        rectF.top = (float) ((recyclerView.getHeight() - this.A06) - rect4.bottom);
                        rectF.bottom = (float) (recyclerView.getHeight() - rect4.bottom);
                        rectF2 = this.A0E;
                        rectF2.left = 0.0f;
                        rectF2.top = rectF.top;
                        rectF2.right = C108945cZ.A03(recyclerView);
                        rectF2.bottom = rectF.bottom;
                        if (z3) {
                            float f5 = rectF.left;
                            if (A1T) {
                                float f6 = (float) rect4.right;
                                rectF.left = f5 + f6;
                                rectF.right += f6;
                                rectF2.left += f6;
                                f = rectF2.right;
                                i = rect4.left;
                            } else {
                                float f7 = (float) rect4.left;
                                rectF.left = f5 + f7;
                                rectF.right += f7;
                                rectF2.left += f7;
                                f = rectF2.right;
                                i = rect4.right;
                            }
                            rectF2.right = f - ((float) i);
                        }
                    } else {
                        return;
                    }
                }
                int i5 = this.A03;
                if (i5 != 0) {
                    C24992CSs cSs = this.A08;
                    float f8 = cSs.A03;
                    if (f8 == 0.0f || !canvas.isHardwareAccelerated()) {
                        z = false;
                    } else {
                        this.A0D.setShadowLayer(f8, cSs.A01, cSs.A00, cSs.A05);
                    }
                    Paint paint = this.A0D;
                    paint.setColor(i5);
                    paint.setAlpha((int) (this.A00 * ((float) this.A0B)));
                    float f9 = (float) this.A05;
                    canvas.drawRoundRect(rectF2, f9, f9, paint);
                    if (z) {
                        paint.clearShadowLayer();
                    }
                }
                Paint paint2 = this.A0D;
                paint2.setColor(this.A04);
                paint2.setAlpha((int) (this.A00 * ((float) this.A0C)));
                float f10 = (float) this.A05;
                canvas.drawRoundRect(rectF, f10, f10, paint2);
            }
        }
    }

    public BM0(Rect rect, C24992CSs cSs, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A03 = i2;
        this.A04 = i;
        this.A0C = Color.alpha(i);
        this.A0B = Color.alpha(i2);
        this.A06 = i3;
        this.A05 = i4;
        this.A09 = z;
        if (z) {
            this.A00 = 1.0f;
        }
        this.A07 = rect;
        this.A0A = z2;
        this.A08 = cSs;
    }
}
