package com.whatsapp.mediacomposer;

import X.A34;
import X.AnonymousClass0DT;
import X.AnonymousClass10I;
import X.AnonymousClass112;
import X.AnonymousClass11P;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass6MG;
import X.AnonymousClass70X;
import X.AnonymousClass7JP;
import X.AnonymousClass85O;
import X.AnonymousClass87W;
import X.AnonymousClass87X;
import X.C108945cZ;
import X.C108985cd;
import X.C108995ce;
import X.C109545dc;
import X.C109935eP;
import X.C110965hZ;
import X.C124386Yd;
import X.C17880vN;
import X.C18000vb;
import X.C39401t1;
import X.C72463Mc;
import X.C72473Md;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class VideoTimelineView extends C109935eP implements AnonymousClass87W {
    public static final long A0T = TimeUnit.SECONDS.toMillis(1);
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public AnonymousClass11P A0C;
    public C18000vb A0D;
    public C110965hZ A0E;
    public AnonymousClass87X A0F;
    public AnonymousClass85O A0G;
    public AnonymousClass10I A0H;
    public ArrayList A0I;
    public float A0J;
    public float A0K;
    public float A0L;
    public float A0M;
    public int A0N;
    public A34 A0O;
    public File A0P;
    public final Paint A0Q = AnonymousClass3MZ.A0A();
    public final Rect A0R = AnonymousClass3MW.A07();
    public final RectF A0S = AnonymousClass3MW.A08();

    private int A01(long j) {
        if (this.A08 == 0) {
            return 0;
        }
        return Math.min(getPaddingLeft() + getTimelineWidth(), Math.max(getPaddingLeft(), (int) (((long) getPaddingLeft()) + ((((long) getTimelineWidth()) * j) / this.A08))));
    }

    private long A02(float f) {
        return Math.min(this.A08, Math.max((long) ((((float) this.A08) * (f - ((float) getPaddingLeft()))) / ((float) getTimelineWidth())), 0));
    }

    private void A03(float f) {
        int i;
        if (this.A0J != f && (i = this.A05) != 0) {
            float f2 = f - this.A0K;
            if (i == 1) {
                long A022 = A02(this.A0L + f2);
                long j = this.A0B;
                long max = Math.max(0, Math.min(A022, j));
                this.A0A = max;
                long j2 = this.A09;
                if (j - max > j2) {
                    this.A0B = max + j2;
                }
            } else if (i != 2) {
                long j3 = this.A0B - this.A0A;
                long A023 = A02(this.A0L + f2);
                this.A0A = A023;
                if (A023 == 0) {
                    this.A0B = A023 + j3;
                } else {
                    long A024 = A02(this.A0M + f2);
                    this.A0B = A024;
                    if (A024 == this.A08) {
                        this.A0A = A024 - j3;
                    }
                }
            } else {
                long A025 = A02(this.A0M + f2);
                long j4 = this.A08;
                long j5 = this.A0A;
                long min = Math.min(j4, Math.max(A025, j5));
                this.A0B = min;
                long j6 = this.A09;
                if (min - j5 > j6) {
                    this.A0A = min - j6;
                }
            }
            this.A0J = f;
            invalidate();
            AnonymousClass87X r4 = this.A0F;
            if (r4 != null) {
                r4.C8f(this.A0A, this.A0B);
            }
        }
    }

    private void A04(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            Rect rect = C39401t1.A0A;
            C110965hZ r0 = new C110965hZ(this, this, context.getResources().getDimensionPixelSize(2131168774));
            this.A0E = r0;
            AnonymousClass1HF.A0f(this, r0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C124386Yd.A00);
            this.A00 = obtainStyledAttributes.getDimension(1, this.A00);
            this.A03 = obtainStyledAttributes.getInteger(0, this.A03);
            this.A01 = obtainStyledAttributes.getDimension(5, this.A01);
            this.A06 = obtainStyledAttributes.getInteger(3, this.A06);
            this.A02 = obtainStyledAttributes.getDimension(6, this.A02);
            this.A07 = obtainStyledAttributes.getInteger(4, this.A07);
            this.A04 = obtainStyledAttributes.getInteger(2, this.A04);
            obtainStyledAttributes.recycle();
        }
    }

    public void A06(File file, long j) {
        C109545dc r4;
        this.A0P = file;
        this.A0I = null;
        A34 a34 = this.A0O;
        if (a34 != null) {
            a34.A0B(true);
            this.A0O = null;
        }
        if (file == null) {
            this.A08 = 0;
        } else if (j == 0) {
            try {
                r4 = new C109545dc("VideoTimelineView/setVideoFile");
                r4.A00(file);
                String extractMetadata = r4.extractMetadata(9);
                if (extractMetadata != null) {
                    this.A08 = Long.parseLong(extractMetadata);
                }
                r4.close();
            } catch (Exception unused) {
                this.A08 = 0;
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        } else {
            this.A08 = j;
        }
        this.A0A = 0;
        this.A0B = this.A08;
        invalidate();
        return;
        throw th;
    }

    public void CRR(int i, boolean z) {
        long j;
        if (z) {
            long j2 = this.A0A;
            j = A0T;
            long j3 = this.A0B;
            long max = Math.max(0, Math.min(j2 + (j * ((long) i)), j3));
            this.A0A = max;
            long j4 = this.A09;
            if (j3 - max > j4) {
                this.A0B = max + j4;
            }
        } else {
            long j5 = this.A0B;
            j = A0T;
            long j6 = this.A08;
            long j7 = this.A0A;
            long min = Math.min(j6, Math.max(j5 + (j * ((long) i)), j7));
            this.A0B = min;
            long j8 = this.A09;
            if (min - j7 > j8) {
                this.A0A = min - j8;
            }
        }
        invalidate();
        AnonymousClass87X r4 = this.A0F;
        if (r4 != null) {
            r4.C8f(this.A0A, this.A0B);
        }
        long j9 = this.A0B / j;
        C18000vb r7 = this.A0D;
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass3MX.A1S(A1b, 0, this.A0A / j);
        AnonymousClass3MX.A1S(A1b, 1, j9);
        announceForAccessibility(r7.A0K(A1b, 2131755011, j9));
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A0E.A1o(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        float f2;
        long j;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        if (this.A0P != null) {
            int timelineWidth = getTimelineWidth();
            int timelineHeight = getTimelineHeight();
            if (timelineHeight > 0 && timelineWidth > 0) {
                if (this.A0N != timelineWidth) {
                    this.A0N = timelineWidth;
                    this.A0I = null;
                    A34 a34 = this.A0O;
                    if (a34 != null) {
                        a34.A0B(true);
                        this.A0O = null;
                    }
                }
                if (this.A0I != null) {
                    float f3 = ((float) timelineWidth) / ((float) (timelineWidth / timelineHeight));
                    RectF rectF = this.A0S;
                    rectF.top = (float) getPaddingTop();
                    rectF.bottom = (float) (getPaddingTop() + timelineHeight);
                    for (int i3 = 0; i3 < this.A0I.size(); i3++) {
                        float paddingLeft = ((float) getPaddingLeft()) + (((float) i3) * f3);
                        rectF.left = paddingLeft;
                        rectF.right = paddingLeft + f3;
                        Bitmap bitmap = (Bitmap) this.A0I.get(i3);
                        if (bitmap != null) {
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            Rect rect = this.A0R;
                            if (width > height) {
                                rect.top = 0;
                                rect.bottom = height;
                                int i4 = (width - height) / 2;
                                rect.left = i4;
                                rect.right = i4 + height;
                            } else {
                                rect.left = 0;
                                rect.right = width;
                                int i5 = (height - width) / 2;
                                rect.top = i5;
                                rect.bottom = i5 + width;
                            }
                            canvas2.drawBitmap(bitmap, rect, rectF, this.A0Q);
                        }
                    }
                } else if (this.A0O == null) {
                    int i6 = timelineWidth / timelineHeight;
                    this.A0I = C17880vN.A0z(i6);
                    AnonymousClass6MG r12 = new AnonymousClass6MG(this.A0C, this, this.A0P, ((float) timelineWidth) / ((float) i6), (float) timelineHeight, i6);
                    this.A0O = r12;
                    AnonymousClass3MW.A1T(r12, this.A0H, 0);
                }
                if (this.A0F != null) {
                    float A012 = (float) A01(this.A0A);
                    float A013 = (float) A01(this.A0B);
                    Paint paint = this.A0Q;
                    C108945cZ.A1L(paint);
                    paint.setColor(this.A04);
                    RectF rectF2 = this.A0S;
                    rectF2.set((float) getPaddingLeft(), (float) getPaddingTop(), A012, (float) C108985cd.A05(this));
                    canvas2.drawRect(rectF2, paint);
                    rectF2.set(A013, (float) getPaddingTop(), (float) C72463Mc.A09(this), (float) C108985cd.A05(this));
                    canvas2.drawRect(rectF2, paint);
                    AnonymousClass85O r0 = this.A0G;
                    if (r0 != null) {
                        VideoComposerFragment videoComposerFragment = ((AnonymousClass7JP) r0).A00;
                        AnonymousClass70X r02 = videoComposerFragment.A0W;
                        if (r02 == null || !r02.A0a()) {
                            j = videoComposerFragment.A05;
                        } else {
                            AnonymousClass70X r03 = videoComposerFragment.A0W;
                            if (r03 != null) {
                                j = (long) r03.A05();
                            } else {
                                j = 0;
                            }
                        }
                        videoComposerFragment.A05 = j;
                        if (j >= 0 && j >= this.A0A && j <= this.A0B) {
                            paint.setColor(this.A03);
                            AnonymousClass3MW.A1P(paint);
                            paint.setStrokeWidth(this.A00 / 2.0f);
                            float A014 = (float) A01(j);
                            canvas2.drawLine(A014, (float) getPaddingTop(), A014, (float) C108985cd.A05(this), paint);
                        }
                        AnonymousClass70X r04 = ((AnonymousClass7JP) this.A0G).A00.A0W;
                        if (r04 != null && r04.A0a()) {
                            invalidate();
                        }
                    }
                    paint.setColor(this.A03);
                    AnonymousClass3MW.A1P(paint);
                    paint.setStrokeWidth(this.A00);
                    rectF2.set(A012 - 1.0f, (float) getPaddingTop(), 1.0f + A013, (float) C108985cd.A05(this));
                    canvas2.drawRect(rectF2, paint);
                    C108945cZ.A1L(paint);
                    if (this.A05 == 1) {
                        i = this.A07;
                    } else {
                        i = this.A06;
                    }
                    paint.setColor(i);
                    float paddingTop = (float) (getPaddingTop() + (timelineHeight / 2));
                    if (this.A05 == 1) {
                        f = this.A02;
                    } else {
                        f = this.A01;
                    }
                    canvas2.drawCircle(A012, paddingTop, f, paint);
                    if (this.A05 == 2) {
                        i2 = this.A07;
                    } else {
                        i2 = this.A06;
                    }
                    paint.setColor(i2);
                    float paddingTop2 = (float) (getPaddingTop() + (timelineHeight / 2));
                    if (this.A05 == 2) {
                        f2 = this.A02;
                    } else {
                        f2 = this.A01;
                    }
                    canvas2.drawCircle(A013, paddingTop2, f2, paint);
                    int i7 = (int) A012;
                    int i8 = (int) A013;
                    int paddingTop3 = getPaddingTop();
                    int A052 = C108985cd.A05(this);
                    C110965hZ r3 = this.A0E;
                    Rect rect2 = r3.A04;
                    int i9 = r3.A01;
                    rect2.left = i7 - i9;
                    rect2.right = i7;
                    rect2.top = paddingTop3;
                    rect2.bottom = A052;
                    Rect rect3 = r3.A05;
                    rect3.left = i7;
                    rect3.right = i7 + i9;
                    rect3.top = paddingTop3;
                    rect3.bottom = A052;
                    Rect rect4 = r3.A02;
                    rect4.left = i8 - i9;
                    rect4.right = i8;
                    rect4.top = paddingTop3;
                    rect4.bottom = A052;
                    Rect rect5 = r3.A03;
                    rect5.left = i8;
                    rect5.right = i8 + i9;
                    rect5.top = paddingTop3;
                    rect5.bottom = A052;
                    r3.A00 = true;
                    r3.A1d();
                }
            }
        } else if (isInEditMode()) {
            Paint paint2 = this.A0Q;
            C108945cZ.A1L(paint2);
            paint2.setColor(this.A04);
            RectF rectF3 = this.A0S;
            rectF3.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) C72463Mc.A09(this), (float) C108985cd.A05(this));
            canvas2.drawRect(rectF3, paint2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r1 != 3) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if ((r4 / X.C108945cZ.A03(r10)) <= 0.5f) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c4, code lost:
        if (r4 >= (r7 - r6)) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            X.87X r0 = r10.A0F
            if (r0 != 0) goto L_0x0009
            boolean r0 = super.onTouchEvent(r11)
            return r0
        L_0x0009:
            boolean r0 = r10.isEnabled()
            r8 = 0
            if (r0 != 0) goto L_0x0011
            return r8
        L_0x0011:
            int r0 = r11.getAction()
            r1 = r0 & 255(0xff, float:3.57E-43)
            float r4 = r11.getX()
            r3 = 1
            if (r1 == 0) goto L_0x0027
            if (r1 == r3) goto L_0x00ce
            r0 = 2
            if (r1 == r0) goto L_0x00ca
            r0 = 3
            if (r1 == r0) goto L_0x00ce
        L_0x0026:
            return r3
        L_0x0027:
            r10.A0K = r4
            long r0 = r10.A0A
            int r0 = r10.A01(r0)
            float r0 = (float) r0
            r10.A0L = r0
            long r0 = r10.A0B
            int r0 = r10.A01(r0)
            float r0 = (float) r0
            r10.A0M = r0
            long r0 = r10.A0A
            int r0 = r10.A01(r0)
            float r9 = (float) r0
            long r0 = r10.A0B
            int r0 = r10.A01(r0)
            float r7 = (float) r0
            float r2 = r10.A01
            int r1 = r10.getTimelineWidth()
            r0 = 3
            int r1 = r1 / r0
            int r0 = r10.getTimelineHeight()
            int r0 = java.lang.Math.min(r1, r0)
            float r0 = (float) r0
            float r6 = java.lang.Math.max(r2, r0)
            float r5 = X.C108945cZ.A00(r4, r9)
            r2 = 1
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0068
            r8 = 1
        L_0x0068:
            float r1 = X.C108945cZ.A00(r4, r7)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)
            if (r8 == 0) goto L_0x00b9
            if (r0 == 0) goto L_0x0093
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0093
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x00c8
            float r5 = r5 - r1
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0093
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00c8
            float r0 = X.C108945cZ.A03(r10)
            float r4 = r4 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c8
        L_0x0093:
            r10.A05 = r2
            X.87X r0 = r10.A0F
            if (r0 == 0) goto L_0x0026
            X.7JO r0 = (X.AnonymousClass7JO) r0
            com.whatsapp.mediacomposer.VideoComposerFragment r4 = r0.A00
            X.70X r0 = r4.A0W
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.A0a()
            if (r0 != r3) goto L_0x00aa
            r4.A2T()
        L_0x00aa:
            android.widget.TextView r2 = r4.A0K
            r0 = 100
            com.whatsapp.mediacomposer.VideoComposerFragment.A07(r2, r0)
            X.6uj r0 = r4.A0R
            if (r0 == 0) goto L_0x0127
            r0.A02()
            goto L_0x0127
        L_0x00b9:
            if (r0 != 0) goto L_0x00c8
            float r9 = r9 + r6
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c6
            float r7 = r7 - r6
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            r2 = 3
            if (r0 < 0) goto L_0x0093
        L_0x00c6:
            r2 = 0
            goto L_0x0093
        L_0x00c8:
            r2 = 2
            goto L_0x0093
        L_0x00ca:
            r10.A03(r4)
            return r3
        L_0x00ce:
            r10.A03(r4)
            X.87X r0 = r10.A0F
            if (r0 == 0) goto L_0x0125
            X.7JO r0 = (X.AnonymousClass7JO) r0
            com.whatsapp.mediacomposer.VideoComposerFragment r5 = r0.A00
            X.00H r0 = r5.A0Z
            if (r0 == 0) goto L_0x012b
            java.lang.Object r4 = r0.get()
            X.A4v r4 = (X.C20050A4v) r4
            r0 = 43
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 8
            r0 = 11
            r4.A02(r2, r1, r0)
            boolean r0 = r5.A0g
            if (r0 == 0) goto L_0x0101
            X.70X r4 = r5.A0W
            if (r4 == 0) goto L_0x00fe
            long r1 = r5.A06
            int r0 = (int) r1
            r4.A0M(r0)
        L_0x00fe:
            r5.A2K()
        L_0x0101:
            android.widget.TextView r4 = r5.A0K
            r1 = 100
            android.view.animation.AlphaAnimation r0 = X.C108985cd.A0H()
            r0.setDuration(r1)
            if (r4 == 0) goto L_0x0115
            r4.startAnimation(r0)
            r0 = 4
            r4.setVisibility(r0)
        L_0x0115:
            X.8Ai r0 = r5.A29()
            if (r0 == 0) goto L_0x011e
            r0.Bs7()
        L_0x011e:
            X.6uj r0 = r5.A0R
            if (r0 == 0) goto L_0x0125
            r0.A04()
        L_0x0125:
            r10.A05 = r8
        L_0x0127:
            r10.invalidate()
            return r3
        L_0x012b:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.VideoTimelineView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        C109935eP.A00(this);
        A04(context, attributeSet);
    }

    private int getTimelineHeight() {
        return Math.max(0, C72473Md.A04(this));
    }

    private int getTimelineWidth() {
        return Math.max(0, C108995ce.A03(this));
    }

    public ArrayList getFrames() {
        return this.A0I;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A34 a34 = this.A0O;
        if (a34 != null) {
            a34.A0B(true);
            this.A0O = null;
        }
        this.A0I = null;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (AnonymousClass112.A06()) {
            setSystemGestureExclusionRects(Collections.singletonList(new Rect(0, 0, i, i2)));
        }
    }

    public void setMaxTrim(long j) {
        this.A09 = j;
    }

    public void setTrimListener(AnonymousClass87X r1) {
        this.A0F = r1;
    }

    public void setVideoPlayback(AnonymousClass85O r1) {
        this.A0G = r1;
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A05();
        C109935eP.A00(this);
        A04(context, attributeSet);
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C109935eP.A00(this);
        A04(context, attributeSet);
    }

    public VideoTimelineView(Context context) {
        super(context);
        A05();
        C109935eP.A00(this);
    }
}
