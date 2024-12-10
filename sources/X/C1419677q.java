package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.whatsapp.mediacomposer.doodle.DoodleView;

/* renamed from: X.77q  reason: invalid class name and case insensitive filesystem */
public class C1419677q implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public final GestureDetector.OnGestureListener A00;
    public final CIZ A01;
    public final AnonymousClass8BC A02;
    public final DoodleView A03;
    public final C138576xJ A04;
    public final C138586xK A05;
    public final C129096hF A06 = new C129096hF(this);
    public final C109805e2 A07;
    public final C127456eO A08;
    public final AnonymousClass70N A09;

    private boolean A00(float f, float f2) {
        AnonymousClass70N r1 = this.A09;
        r1.A02 = null;
        r1.A00 = null;
        C1409773u r2 = r1.A01;
        boolean C5N = this.A02.C5N(r2, f, f2);
        if (C5N || r2 == null || !r2.A0Z()) {
            return C5N;
        }
        this.A03.invalidate();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011f, code lost:
        if (r5.A01 != 2) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0131, code lost:
        if (r5.A01 != 0) goto L_0x0121;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.graphics.PointF r18, android.graphics.PointF r19) {
        /*
            r17 = this;
            r4 = r18
            r0 = r17
            X.6xJ r6 = r0.A04
            X.73u r0 = r6.A00
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0 instanceof X.AnonymousClass69V
            if (r0 != 0) goto L_0x001b
            float r0 = r4.x
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            float r0 = r4.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            return
        L_0x001c:
            X.C138576xJ.A00(r6)
            X.6p8 r7 = r6.A04
            X.73u r0 = r6.A00
            android.graphics.RectF r0 = r0.A06
            float r2 = r0.centerX()
            float r1 = r0.centerY()
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r2, r1)
            android.graphics.PointF r14 = r7.A00(r0)
            X.71z r0 = r6.A03
            float r1 = r0.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01a1
            X.6yh r13 = r6.A05
            X.73u r12 = r6.A00
            X.73u r0 = r13.A04
            if (r0 == r12) goto L_0x004d
            r13.A04 = r12
            X.C139356yh.A00(r13)
        L_0x004d:
            float r11 = r4.x
            float r15 = r4.y
            android.graphics.RectF r0 = r13.A02
            r16 = r0
            float r1 = r16.centerX()
            float r0 = r16.centerY()
            android.graphics.PointF r10 = new android.graphics.PointF
            r10.<init>(r1, r0)
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x019c
            float r1 = r13.A00
        L_0x0068:
            float r1 = r1 + r11
            boolean r0 = r13.A07
            if (r0 == 0) goto L_0x0198
            float r0 = r13.A01
        L_0x006f:
            float r0 = r0 + r15
            android.graphics.PointF r9 = new android.graphics.PointF
            r9.<init>(r1, r0)
            boolean r0 = r13.A07
            r8 = 1
            r5 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0174
            float r1 = r16.centerY()
            float r2 = r13.A08
            float r1 = r1 + r2
            float r0 = r9.y
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0168
            float r1 = r16.centerY()
            float r1 = r1 - r2
            float r0 = r9.y
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0168
            float r0 = r13.A01
            float r0 = r0 + r15
            r13.A01 = r0
            r15 = 0
        L_0x009a:
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x0144
            float r1 = r16.centerX()
            float r2 = r13.A08
            float r1 = r1 + r2
            float r0 = r9.x
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0138
            float r1 = r16.centerX()
            float r1 = r1 - r2
            float r0 = r9.x
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0138
            float r0 = r13.A00
            float r0 = r0 + r11
            r13.A00 = r0
            r11 = 0
        L_0x00bc:
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r11, r15)
            float r8 = r14.x
            float r0 = r1.x
            float r8 = r8 + r0
            float r5 = r14.y
            float r0 = r1.y
            float r5 = r5 + r0
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>(r8, r5)
            java.util.Map r8 = r13.A05
            r0 = 3
            java.lang.Object r5 = X.AnonymousClass000.A0w(r8, r0)
            X.69I r5 = (X.AnonymousClass69I) r5
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x00e0
            r13.A01(r2, r12, r3)
        L_0x00e0:
            float r2 = r4.x
            float r2 = r2 * r2
            float r0 = r4.y
            float r0 = r0 * r0
            float r2 = r2 + r0
            double r2 = (double) r2
            double r9 = java.lang.Math.sqrt(r2)
            r2 = 4641240890982006784(0x4069000000000000, double:200.0)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            boolean r9 = X.AnonymousClass000.A1R(r0)
            java.util.Iterator r8 = X.C17890vO.A0l(r8)
        L_0x00f8:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r4 = r8.next()
            X.6q1 r4 = (X.AnonymousClass6q1) r4
            boolean r0 = r4 instanceof X.AnonymousClass69I
            if (r0 != 0) goto L_0x00f8
            r0 = r4
            X.69H r0 = (X.AnonymousClass69H) r0
            int r3 = r0.A00
            r0 = 1
            if (r3 == r0) goto L_0x0125
            r2 = 2
            if (r3 != r2) goto L_0x00f8
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x0134
            if (r9 != 0) goto L_0x0134
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0121
            int r0 = r5.A01
            if (r0 == r2) goto L_0x0134
        L_0x0121:
            r4.A02()
            goto L_0x00f8
        L_0x0125:
            boolean r0 = r13.A07
            if (r0 == 0) goto L_0x0134
            if (r9 != 0) goto L_0x0134
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0121
            int r0 = r5.A01
            if (r0 == 0) goto L_0x0134
            goto L_0x0121
        L_0x0134:
            r4.A01()
            goto L_0x00f8
        L_0x0138:
            r13.A06 = r5
            float r1 = r13.A00
            float r0 = r14.x
            float r1 = r1 - r0
            float r11 = r11 + r1
            r13.A00 = r3
            goto L_0x00bc
        L_0x0144:
            float r1 = r14.x
            float r2 = r10.x
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0153
            float r0 = r4.x
            float r0 = r0 + r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x015e
        L_0x0153:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00bc
            float r0 = r4.x
            float r0 = r0 + r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00bc
        L_0x015e:
            r13.A06 = r8
            float r0 = r9.x
            r13.A00 = r0
            float r11 = r2 - r1
            goto L_0x00bc
        L_0x0168:
            r13.A07 = r5
            float r1 = r13.A01
            float r0 = r14.y
            float r1 = r1 - r0
            float r15 = r15 + r1
            r13.A01 = r3
            goto L_0x009a
        L_0x0174:
            float r2 = r14.y
            float r1 = r10.y
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0183
            float r0 = r4.y
            float r0 = r0 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x018e
        L_0x0183:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x009a
            float r0 = r4.y
            float r0 = r0 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x009a
        L_0x018e:
            r13.A07 = r8
            float r0 = r9.y
            r13.A01 = r0
            float r15 = r1 - r2
            goto L_0x009a
        L_0x0198:
            float r0 = r14.y
            goto L_0x006f
        L_0x019c:
            float r1 = r14.x
            goto L_0x0068
        L_0x01a0:
            r4 = r1
        L_0x01a1:
            X.73u r0 = r6.A00
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x01ee
            X.71K r8 = r6.A06
            r0 = r19
            float r1 = r0.x
            float r0 = r0.y
            boolean r5 = X.AnonymousClass71K.A01(r8, r1, r0)
            boolean r0 = r8.A00
            if (r5 == 0) goto L_0x01e7
            if (r0 != 0) goto L_0x01ec
            X.5dO r9 = r8.A04
            android.view.View r0 = r8.A03
            android.content.res.Resources r3 = X.AnonymousClass000.A0Y(r0)
            android.content.Context r2 = r0.getContext()
            r1 = 2130971655(0x7f040c07, float:1.7552054E38)
            r0 = 2131102741(0x7f060c15, float:1.7817928E38)
            int r0 = X.AnonymousClass3Ma.A01(r2, r3, r1, r0)
            r9.A00 = r0
            r9.invalidateSelf()
            android.os.Vibrator r2 = r8.A02
            if (r2 == 0) goto L_0x01ec
            r0 = 3
            r2.vibrate(r0)     // Catch:{ NullPointerException -> 0x01e0 }
            goto L_0x01ec
        L_0x01e0:
            r1 = move-exception
            java.lang.String r0 = "Vibrator is broken on this device."
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x01ec
        L_0x01e7:
            if (r0 == 0) goto L_0x01ec
            X.AnonymousClass71K.A00(r8)
        L_0x01ec:
            r8.A00 = r5
        L_0x01ee:
            float r1 = r4.x
            float r0 = r4.y
            float[] r5 = r7.A02
            r3 = 0
            r5[r3] = r1
            r4 = 1
            r5[r4] = r0
            android.graphics.Matrix r2 = r7.A00
            r2.reset()
            X.71z r1 = r7.A01
            int r0 = r1.A02
            float r0 = (float) r0
            float r0 = -r0
            r2.setRotate(r0)
            r2.mapPoints(r5)
            r3 = r5[r3]
            float r2 = r1.A00
            float r0 = r1.A01
            float r2 = r2 * r0
            float r3 = r3 / r2
            r1 = r5[r4]
            float r1 = r1 / r2
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r3, r1)
            X.73u r3 = r6.A00
            float r2 = r0.x
            float r1 = r0.y
            android.graphics.RectF r0 = r3.A06
            r0.offset(r2, r1)
            float r0 = r3.A00
            float r0 = r0 + r2
            r3.A00 = r0
            float r0 = r3.A01
            float r0 = r0 + r1
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419677q.A01(android.graphics.PointF, android.graphics.PointF):void");
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, X.6Ul, X.69i] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onDoubleTap(android.view.MotionEvent r7) {
        /*
            r6 = this;
            X.70N r5 = r6.A09
            r0 = 0
            r5.A02 = r0
            r5.A00 = r0
            X.73u r4 = r5.A01
            if (r4 == 0) goto L_0x005e
            boolean r0 = r4 instanceof X.AnonymousClass69K
            if (r0 != 0) goto L_0x005e
            java.util.List r0 = r5.A03()
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x005e
            X.73u r2 = r5.A01
            if (r2 != 0) goto L_0x0053
            r3 = -1
        L_0x001e:
            java.util.List r2 = r5.A04
            int r1 = r2.size()
            r0 = 1
            int r1 = r1 - r0
            if (r3 == r1) goto L_0x005e
            X.73u r1 = r5.A01
            r0 = -1
            if (r1 == 0) goto L_0x0031
            int r0 = r2.indexOf(r1)
        L_0x0031:
            X.69i r1 = new X.69i
            r1.<init>()
            r1.A00 = r4
            r1.A00 = r0
            X.6yr r0 = r5.A03
            java.util.List r0 = r0.A00
            r0.add(r1)
            r2.remove(r4)
            r2.add(r4)
            r0 = 1
        L_0x0048:
            r1 = 1
            if (r0 == 0) goto L_0x0060
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r6.A03
            X.73x r0 = r0.A0J
            r0.A06()
            return r1
        L_0x0053:
            java.util.List r1 = r5.A04
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            int r3 = r1.indexOf(r2)
            goto L_0x001e
        L_0x005e:
            r0 = 0
            goto L_0x0048
        L_0x0060:
            android.view.GestureDetector$OnGestureListener r0 = r6.A00
            if (r0 == 0) goto L_0x006d
            android.view.GestureDetector$OnDoubleTapListener r0 = (android.view.GestureDetector.OnDoubleTapListener) r0
            boolean r0 = r0.onDoubleTap(r7)
            if (r0 == 0) goto L_0x006d
            return r1
        L_0x006d:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419677q.onDoubleTap(android.view.MotionEvent):boolean");
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener == null || !((GestureDetector.OnDoubleTapListener) onGestureListener).onDoubleTapEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener;
        if (this.A09.A01 != null || (onGestureListener = this.A00) == null || !onGestureListener.onDown(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        GestureDetector.OnGestureListener onGestureListener;
        if (this.A09.A01 != null || (onGestureListener = this.A00) == null || !onGestureListener.onFling(motionEvent, motionEvent2, f, f2)) {
            return false;
        }
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener != null) {
            onGestureListener.onLongPress(motionEvent);
        }
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C127456eO r2 = this.A08;
        C1409773u r1 = this.A09.A01;
        if (!r2.A01.A00.A0J.A00.A0i) {
            r2.A00 = r1;
            if (r1 != null) {
                return true;
            }
        }
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener == null || !((ScaleGestureDetector.OnScaleGestureListener) onGestureListener).onScaleBegin(scaleGestureDetector)) {
            return false;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.A08.A00 = null;
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener != null) {
            ((ScaleGestureDetector.OnScaleGestureListener) onGestureListener).onScaleEnd(scaleGestureDetector);
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        GestureDetector.OnGestureListener onGestureListener;
        if (this.A09.A01 != null || (onGestureListener = this.A00) == null || !onGestureListener.onScroll(motionEvent, motionEvent2, f, f2)) {
            return false;
        }
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener != null) {
            onGestureListener.onShowPress(motionEvent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (A00(r8.getX(), r8.getY()) != false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSingleTapConfirmed(android.view.MotionEvent r8) {
        /*
            r7 = this;
            X.70N r1 = r7.A09
            java.util.List r3 = r1.A04
            int r0 = r3.size()
            r6 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0025
            X.73u r0 = r1.A01
            if (r0 != 0) goto L_0x006a
            r1 = -1
        L_0x0011:
            int r0 = X.AnonymousClass3MX.A02(r3, r2)
            if (r1 == r0) goto L_0x0025
            float r1 = r8.getX()
            float r0 = r8.getY()
            boolean r0 = r7.A00(r1, r0)
            if (r0 != 0) goto L_0x0068
        L_0x0025:
            android.view.GestureDetector$OnGestureListener r5 = r7.A00
            if (r5 == 0) goto L_0x0069
            r0 = r5
            X.87R r0 = (X.AnonymousClass87R) r0
            boolean r0 = r0.Boz()
            if (r0 == 0) goto L_0x0060
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r7.A03
            X.73u r0 = r0.A01(r8)
            if (r0 != 0) goto L_0x0060
            X.8BC r0 = r7.A02
            X.7J8 r0 = (X.AnonymousClass7J8) r0
            X.7JF r4 = r0.A01
            X.6uj r3 = r4.A0W
            X.7JS r0 = r3.A0G
            int r0 = r0.A09()
            if (r0 != 0) goto L_0x0060
            X.1Lc r0 = r4.A0Y
            X.0ve r2 = r0.A01
            r1 = 7597(0x1dad, float:1.0646E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0060
            r0 = 3
            r3.A07(r0)
            r0 = 0
            X.AnonymousClass7JF.A07(r4, r0)
        L_0x0060:
            android.view.GestureDetector$OnDoubleTapListener r5 = (android.view.GestureDetector.OnDoubleTapListener) r5
            boolean r0 = r5.onSingleTapConfirmed(r8)
            if (r0 == 0) goto L_0x0069
        L_0x0068:
            r6 = 1
        L_0x0069:
            return r6
        L_0x006a:
            int r1 = r3.indexOf(r0)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419677q.onSingleTapConfirmed(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r1 == X.AnonymousClass3MX.A02(r2, 1)) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSingleTapUp(android.view.MotionEvent r5) {
        /*
            r4 = this;
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r4.A03
            X.73u r0 = r0.A01(r5)
            X.70N r1 = r4.A09
            r1.A01 = r0
            r3 = 1
            if (r0 == 0) goto L_0x0031
            java.util.List r2 = r1.A04
            int r0 = r2.size()
            if (r0 == r3) goto L_0x0024
            X.73u r0 = r1.A01
            r1 = -1
            if (r0 == 0) goto L_0x001e
            int r1 = r2.indexOf(r0)
        L_0x001e:
            int r0 = X.AnonymousClass3MX.A02(r2, r3)
            if (r1 != r0) goto L_0x0031
        L_0x0024:
            float r1 = r5.getX()
            float r0 = r5.getY()
            boolean r0 = r4.A00(r1, r0)
            return r0
        L_0x0031:
            android.view.GestureDetector$OnGestureListener r0 = r4.A00
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0.onSingleTapUp(r5)
            if (r0 == 0) goto L_0x003c
            return r3
        L_0x003c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419677q.onSingleTapUp(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.5e2, android.view.ScaleGestureDetector] */
    public C1419677q(GestureDetector.OnGestureListener onGestureListener, AnonymousClass8BC r4, DoodleView doodleView, C138576xJ r6, C127456eO r7, AnonymousClass70N r8) {
        this.A03 = doodleView;
        this.A04 = r6;
        this.A08 = r7;
        this.A09 = r8;
        this.A02 = r4;
        this.A00 = onGestureListener;
        this.A01 = C108965cb.A0C(doodleView.getContext(), this);
        ? scaleGestureDetector = new ScaleGestureDetector(doodleView.getContext(), this);
        this.A07 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.A05 = new C138586xK(doodleView.getContext(), this);
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float f = ((C109805e2) scaleGestureDetector).A00;
        C1409773u r6 = this.A08.A00;
        if (r6 == null) {
            GestureDetector.OnGestureListener onGestureListener = this.A00;
            if (onGestureListener == null || !((ScaleGestureDetector.OnScaleGestureListener) onGestureListener).onScale(scaleGestureDetector)) {
                return false;
            }
            return true;
        } else if (r6 instanceof AnonymousClass69d) {
            r6.A0L(C108975cc.A19((Math.abs(f) > 1.0f ? 1 : (Math.abs(f) == 1.0f ? 0 : -1))) ^ true ? 1 : 0, scaleFactor);
            return true;
        } else if (r6 instanceof AnonymousClass69T) {
            r6.A0L(true ^ C108975cc.A19((Math.abs(Math.tan(Math.atan((double) f) - Math.toRadians((double) r6.A02))) > 1.0d ? 1 : (Math.abs(Math.tan(Math.atan((double) f) - Math.toRadians((double) r6.A02))) == 1.0d ? 0 : -1))) ? 1 : 0, scaleFactor);
            return true;
        } else if (r6 instanceof AnonymousClass69S) {
            r6.A0L(true ^ C108975cc.A19((Math.abs(Math.tan(Math.atan((double) f) - Math.toRadians((double) r6.A02))) > 1.0d ? 1 : (Math.abs(Math.tan(Math.atan((double) f) - Math.toRadians((double) r6.A02))) == 1.0d ? 0 : -1))) ? 1 : 0, scaleFactor);
            return true;
        } else {
            r6.A0H(scaleFactor);
            return true;
        }
    }
}
