package X;

import android.graphics.Rect;
import android.view.View;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.3SY  reason: invalid class name */
public final class AnonymousClass3SY extends C39401t1 {
    public Rect A00 = AnonymousClass3MW.A07();
    public Rect A01 = AnonymousClass3MW.A07();
    public Rect A02 = AnonymousClass3MW.A07();
    public Rect A03 = AnonymousClass3MW.A07();
    public Rect A04 = AnonymousClass3MW.A07();
    public Rect A05 = AnonymousClass3MW.A07();
    public Rect A06 = AnonymousClass3MW.A07();
    public Rect A07 = AnonymousClass3MW.A07();
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public final int A0P;
    public final View A0Q;
    public final C106815Xh A0R;

    public static final Integer A03(int i) {
        int i2;
        for (Integer num : AnonymousClass00R.A00(4)) {
            switch (num.intValue()) {
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == i) {
                return num;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public void A1h(C26228CvK cvK, int i) {
        Rect rect;
        C18070vi.A0d(cvK, 1);
        if (A04()) {
            cvK.A0O("CropImageView");
            cvK.A0L(C26137Ct0.A08);
            if (i == C83074Dg.LEFT_CROP_TO_LEFT.value) {
                cvK.A0Q(this.A0J);
                rect = this.A02;
            } else if (i == C83074Dg.LEFT_CROP_TO_RIGHT.value) {
                cvK.A0Q(this.A0K);
                rect = this.A03;
            } else if (i == C83074Dg.RIGHT_CROP_TO_LEFT.value) {
                cvK.A0Q(this.A0L);
                rect = this.A04;
            } else if (i == C83074Dg.RIGHT_CROP_TO_RIGHT.value) {
                cvK.A0Q(this.A0M);
                rect = this.A05;
            } else if (i == C83074Dg.TOP_CROP_TO_TOP.value) {
                cvK.A0Q(this.A0O);
                rect = this.A07;
            } else if (i == C83074Dg.TOP_CROP_TO_BOTTOM.value) {
                cvK.A0Q(this.A0N);
                rect = this.A06;
            } else if (i == C83074Dg.BOTTOM_CROP_TO_TOP.value) {
                cvK.A0Q(this.A0I);
                rect = this.A01;
            } else if (i == C83074Dg.BOTTOM_CROP_TO_BOTTOM.value) {
                cvK.A0Q(this.A0H);
                rect = this.A00;
            } else {
                return;
            }
            cvK.A02.setBoundsInParent(rect);
        }
    }

    public void A1i(List list) {
        C18070vi.A0d(list, 0);
        if (A04()) {
            for (C83074Dg r0 : C83074Dg.values()) {
                list.add(Integer.valueOf(r0.value));
            }
        }
    }

    private final boolean A04() {
        if (this.A0G && !this.A02.isEmpty() && !this.A03.isEmpty()) {
            Rect rect = this.A04;
            if (rect.isEmpty() || rect.isEmpty() || this.A07.isEmpty() || this.A06.isEmpty() || this.A01.isEmpty() || this.A00.isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00bb A[LOOP:1: B:58:0x00b5->B:60:0x00bb, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1m(int r11, int r12, android.os.Bundle r13) {
        /*
            r10 = this;
            X.5Xh r4 = r10.A0R
            if (r4 == 0) goto L_0x00e6
            boolean r0 = r10.A04()
            if (r0 == 0) goto L_0x00e6
            r0 = 16
            if (r12 != r0) goto L_0x00e6
            X.4Dg[] r5 = X.C83074Dg.values()
            int r3 = r5.length
            r2 = 0
        L_0x0014:
            if (r2 >= r3) goto L_0x00de
            r1 = r5[r2]
            int r0 = r1.value
            if (r0 != r11) goto L_0x00a7
            int r0 = r1.origin
            java.lang.Integer r3 = A03(r0)
            int r0 = r1.direction
            java.lang.Integer r7 = A03(r0)
            int r5 = r7.intValue()
            r0 = 1
            r2 = 0
            if (r5 == r0) goto L_0x00a4
            r0 = 3
            r1 = -70
            if (r5 == r0) goto L_0x003d
            r1 = 0
            r0 = 2
            if (r5 == r0) goto L_0x00a1
            if (r5 != r2) goto L_0x003d
            r2 = -70
        L_0x003d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            X.1D6 r0 = X.AnonymousClass1D6.A00(r0, r2)
            int r6 = X.AnonymousClass3MZ.A04(r0)
            java.lang.Object r0 = r0.second
            int r5 = X.AnonymousClass000.A0M(r0)
            java.lang.Integer r2 = X.AnonymousClass00R.A0N
            if (r3 != r2) goto L_0x0077
            if (r7 != r2) goto L_0x0070
            java.lang.String r9 = r10.A0A
        L_0x0057:
            int r1 = r3.intValue()
            r0 = 2
            r8 = 16
            if (r1 == r0) goto L_0x00ad
            r8 = 2
            r0 = 0
            if (r1 == r0) goto L_0x00ab
            r0 = 3
            if (r1 == r0) goto L_0x00ad
            r8 = 4
            r0 = 1
            if (r1 == r0) goto L_0x00ad
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0070:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r7 != r0) goto L_0x0077
            java.lang.String r9 = r10.A0B
            goto L_0x0057
        L_0x0077:
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            if (r3 != r1) goto L_0x0087
            if (r7 != r1) goto L_0x0080
            java.lang.String r9 = r10.A0F
            goto L_0x0057
        L_0x0080:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r7 != r0) goto L_0x0087
            java.lang.String r9 = r10.A0E
            goto L_0x0057
        L_0x0087:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r3 != r0) goto L_0x0095
            if (r7 != r0) goto L_0x0090
            java.lang.String r9 = r10.A0D
            goto L_0x0057
        L_0x0090:
            if (r7 != r2) goto L_0x0095
            java.lang.String r9 = r10.A0C
            goto L_0x0057
        L_0x0095:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r3 != r0) goto L_0x009e
            if (r7 != r1) goto L_0x009e
            java.lang.String r9 = r10.A09
            goto L_0x0057
        L_0x009e:
            java.lang.String r9 = r10.A08
            goto L_0x0057
        L_0x00a1:
            r2 = 70
            goto L_0x003d
        L_0x00a4:
            r1 = 70
            goto L_0x003d
        L_0x00a7:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x00ab:
            r8 = 8
        L_0x00ad:
            com.whatsapp.crop.CropImageView r4 = (com.whatsapp.crop.CropImageView) r4
            java.util.ArrayList r0 = r4.A06
            java.util.Iterator r7 = r0.iterator()
        L_0x00b5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r2 = r7.next()
            X.4Yn r2 = (X.C88154Yn) r2
            r2.A03()
            float r1 = (float) r6
            float r0 = (float) r5
            r2.A04(r8, r1, r0)
            android.graphics.Rect r0 = r2.A03()
            int r3 = r0.top
            int r2 = r0.right
            int r1 = r0.bottom
            int r0 = r0.left
            com.whatsapp.crop.CropImageView.A00(r4, r3, r2, r1, r0)
            r4.announceForAccessibility(r9)
            goto L_0x00b5
        L_0x00dc:
            r0 = 1
            return r0
        L_0x00de:
            java.lang.String r1 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x00e6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3SY.A1m(int, int, android.os.Bundle):boolean");
    }

    public AnonymousClass3SY(View view, C106815Xh r4, int i) {
        super(view);
        this.A0Q = view;
        this.A0P = i;
        this.A0R = r4;
        this.A0J = AnonymousClass3MY.A0m(view.getResources(), 2131886223);
        this.A0K = AnonymousClass3MY.A0m(view.getResources(), 2131886224);
        this.A0L = AnonymousClass3MY.A0m(view.getResources(), 2131886225);
        this.A0M = AnonymousClass3MY.A0m(view.getResources(), 2131886226);
        this.A0O = AnonymousClass3MY.A0m(view.getResources(), 2131886228);
        this.A0N = AnonymousClass3MY.A0m(view.getResources(), 2131886227);
        this.A0I = AnonymousClass3MY.A0m(view.getResources(), 2131886222);
        this.A0H = AnonymousClass3MY.A0m(view.getResources(), 2131886221);
        this.A0A = AnonymousClass3MY.A0m(view.getResources(), 2131889116);
        this.A0B = AnonymousClass3MY.A0m(view.getResources(), 2131889117);
        this.A0C = AnonymousClass3MY.A0m(view.getResources(), 2131889118);
        this.A0D = AnonymousClass3MY.A0m(view.getResources(), 2131889119);
        this.A0F = AnonymousClass3MY.A0m(view.getResources(), 2131889121);
        this.A0E = AnonymousClass3MY.A0m(view.getResources(), 2131889120);
        this.A09 = AnonymousClass3MY.A0m(view.getResources(), 2131889115);
        this.A08 = AnonymousClass3MY.A0m(view.getResources(), 2131889114);
    }

    public int A1b(float f, float f2) {
        C83074Dg r0;
        if (!A04()) {
            return -1;
        }
        int i = (int) f;
        int i2 = (int) f2;
        if (this.A02.contains(i, i2)) {
            r0 = C83074Dg.LEFT_CROP_TO_LEFT;
        } else if (this.A03.contains(i, i2)) {
            r0 = C83074Dg.LEFT_CROP_TO_RIGHT;
        } else if (this.A04.contains(i, i2)) {
            r0 = C83074Dg.RIGHT_CROP_TO_LEFT;
        } else if (this.A05.contains(i, i2)) {
            r0 = C83074Dg.RIGHT_CROP_TO_RIGHT;
        } else if (this.A07.contains(i, i2)) {
            r0 = C83074Dg.TOP_CROP_TO_TOP;
        } else if (this.A06.contains(i, i2)) {
            r0 = C83074Dg.TOP_CROP_TO_BOTTOM;
        } else if (this.A01.contains(i, i2)) {
            r0 = C83074Dg.BOTTOM_CROP_TO_TOP;
        } else if (!this.A00.contains(i, i2)) {
            return -1;
        } else {
            r0 = C83074Dg.BOTTOM_CROP_TO_BOTTOM;
        }
        return r0.value;
    }
}
