package com.whatsapp.newsletter.insights.view.chart;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass1D7;
import X.AnonymousClass1DF;
import X.AnonymousClass1Y1;
import X.AnonymousClass1ZU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3O5;
import X.AnonymousClass4UL;
import X.AnonymousClass4XM;
import X.AnonymousClass5J0;
import X.AnonymousClass5J1;
import X.AnonymousClass5J2;
import X.AnonymousClass5J3;
import X.AnonymousClass5J4;
import X.AnonymousClass5J5;
import X.AnonymousClass5J6;
import X.AnonymousClass5J7;
import X.AnonymousClass5J8;
import X.AnonymousClass5J9;
import X.AnonymousClass5JA;
import X.AnonymousClass5JB;
import X.AnonymousClass5JC;
import X.C103065Iw;
import X.C103075Ix;
import X.C103085Iy;
import X.C103095Iz;
import X.C107555aD;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C25511Om;
import X.C29431cG;
import X.C72453Mb;
import X.C86934Tq;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class LineChartView extends AnonymousClass3O5 implements AnonymousClass009 {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public Paint A08;
    public MotionEvent A09;
    public C107555aD A0A;
    public AnonymousClass4XM A0B;
    public AnonymousClass031 A0C;
    public List A0D;
    public List A0E;
    public List A0F;
    public Map A0G;
    public Map A0H;
    public Set A0I;
    public boolean A0J;
    public final Paint A0K;
    public final Paint A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final Paint A0O;
    public final Paint A0P;
    public final Path A0Q;
    public final Path A0R;
    public final Rect A0S;
    public final C18100vl A0T;
    public final C18100vl A0U;
    public final C18100vl A0V;
    public final C18100vl A0W;
    public final C18100vl A0X;
    public final C18100vl A0Y;
    public final C18100vl A0Z;
    public final C18100vl A0a;
    public final C18100vl A0b;
    public final C18100vl A0c;
    public final C18100vl A0d;
    public final C18100vl A0e;
    public final C18100vl A0f;
    public final C18100vl A0g;
    public final C18100vl A0h;
    public final C18100vl A0i;
    public final C18100vl A0j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LineChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public void onDraw(Canvas canvas) {
        Integer valueOf;
        Long A032;
        int A0I2;
        Integer valueOf2;
        int intValue;
        Long A033;
        Canvas canvas2 = canvas;
        C18070vi.A0d(canvas2, 0);
        Path path = this.A0R;
        float chartPaddingStartIncludingLabels = (float) getChartPaddingStartIncludingLabels();
        C18100vl r2 = this.A0W;
        float A0I3 = ((float) C72453Mb.A0I(r2)) + ((float) getChartHeight());
        path.reset();
        path.moveTo(chartPaddingStartIncludingLabels, A0I3);
        path.lineTo(((float) getChartWidth()) + chartPaddingStartIncludingLabels, A0I3);
        int chartWidth = getChartWidth() / 2;
        float A002 = C72453Mb.A00(this.A0i) + A0I3;
        int i = 0;
        do {
            float chartPaddingStartIncludingLabels2 = (float) (getChartPaddingStartIncludingLabels() + (i * chartWidth));
            if (i == 0) {
                chartPaddingStartIncludingLabels2 += C72453Mb.A00(this.A0j) / 2.0f;
            } else if (i == 2) {
                chartPaddingStartIncludingLabels2 -= C72453Mb.A00(this.A0j) / 2.0f;
            }
            path.moveTo(chartPaddingStartIncludingLabels2, A0I3);
            path.lineTo(chartPaddingStartIncludingLabels2, A002);
            i++;
        } while (i < 3);
        canvas2.drawPath(path, this.A0P);
        Path path2 = this.A0Q;
        path2.reset();
        int chartHeight = getChartHeight() / 4;
        float chartPaddingStartIncludingLabels3 = (float) getChartPaddingStartIncludingLabels();
        float chartWidth2 = ((float) getChartWidth()) + chartPaddingStartIncludingLabels3;
        int i2 = 1;
        do {
            float A0I4 = ((float) C72453Mb.A0I(r2)) + ((float) ((4 - i2) * chartHeight));
            path2.moveTo(chartPaddingStartIncludingLabels3, A0I4);
            path2.lineTo(chartWidth2, A0I4);
            i2++;
        } while (i2 < 5);
        canvas2.drawPath(path2, this.A0L);
        MotionEvent motionEvent = this.A09;
        if (!(motionEvent == null || (valueOf2 = Integer.valueOf(motionEvent.getAction())) == null || (((intValue = valueOf2.intValue()) != 0 && intValue != 2) || (A033 = A03(motionEvent)) == null))) {
            float A062 = A06(A033.longValue());
            canvas2.drawLine(A062, ((float) C72453Mb.A0I(r2)) + ((float) getChartHeight()), A062, 0.0f, this.A08);
        }
        int A012 = AnonymousClass3MX.A01(this.A0E);
        int chartWidth3 = getChartWidth() / A012;
        List list = this.A0E;
        if (!AnonymousClass3MY.A1b(getWhatsAppLocale())) {
            list = C29431cG.A0r(list);
        }
        Iterator it = list.iterator();
        int i3 = 0;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    break;
                }
                String str = (String) next;
                Paint paint = this.A0M;
                int length = str.length();
                Rect rect = this.A0S;
                paint.getTextBounds(str, 0, length, rect);
                float width = (float) rect.width();
                float height = (float) rect.height();
                float f = width / 2.0f;
                float chartPaddingStartIncludingLabels4 = ((float) (getChartPaddingStartIncludingLabels() + (i3 * chartWidth3))) - f;
                if (i3 == 0) {
                    chartPaddingStartIncludingLabels4 += f;
                } else if (i3 == A012) {
                    chartPaddingStartIncludingLabels4 -= f;
                }
                canvas2.drawText(str, chartPaddingStartIncludingLabels4, ((float) (getHeight() - C72453Mb.A0I(this.A0T))) + height + ((float) C72453Mb.A0I(this.A0X)), paint);
                i3 = i4;
            } else {
                float A0I5 = (float) C72453Mb.A0I(this.A0V);
                int A013 = AnonymousClass3MX.A01(this.A0F);
                float chartHeight2 = ((float) getChartHeight()) / ((float) A013);
                int i5 = 0;
                for (Object next2 : this.A0F) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        String str2 = (String) next2;
                        Paint paint2 = this.A0M;
                        int length2 = str2.length();
                        Rect rect2 = this.A0S;
                        paint2.getTextBounds(str2, 0, length2, rect2);
                        int width2 = rect2.width();
                        int height2 = rect2.height();
                        if (AnonymousClass3MY.A1b(getWhatsAppLocale())) {
                            A0I2 = this.A00 - width2;
                        } else {
                            A0I2 = C72453Mb.A0I(this.A0Y) + getChartWidth();
                        }
                        canvas2.drawText(str2, ((float) A0I2) + A0I5, ((float) C72453Mb.A0I(r2)) + (((float) (A013 - i5)) * chartHeight2) + ((float) (height2 / 2)), paint2);
                        i5 = i6;
                    }
                }
                float A063 = A06(getMaxVisibleX());
                for (AnonymousClass4UL r12 : this.A0D) {
                    Path path3 = (Path) this.A0H.get(r12);
                    if (path3 != null) {
                        path3.reset();
                        List list2 = r12.A02;
                        int size = list2.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            float A064 = A06(((C86934Tq) list2.get(i7)).A00);
                            float A072 = A07(((C86934Tq) list2.get(i7)).A01);
                            if (i7 == 0) {
                                path3.moveTo(A064, A072);
                            } else {
                                boolean z = true;
                                if (!AnonymousClass3MY.A1b(getWhatsAppLocale()) ? A064 >= A063 : A064 <= A063) {
                                    z = false;
                                } else {
                                    int i8 = i7 - 1;
                                    A072 = A07(((C86934Tq) list2.get(i8)).A01 + ((long) (((float) (((C86934Tq) list2.get(i7)).A01 - ((C86934Tq) list2.get(i8)).A01)) * (((float) (getMaxVisibleX() - ((C86934Tq) list2.get(i8)).A00)) / ((float) (((C86934Tq) list2.get(i7)).A00 - ((C86934Tq) list2.get(i8)).A00))))));
                                    A064 = A063;
                                }
                                path3.lineTo(A064, A072);
                                if (z) {
                                    break;
                                }
                            }
                        }
                        Paint paint3 = (Paint) this.A0G.get(r12);
                        if (paint3 != null) {
                            canvas2.drawPath(path3, paint3);
                        }
                    }
                }
                MotionEvent motionEvent2 = this.A09;
                if (motionEvent2 != null && (valueOf = Integer.valueOf(motionEvent2.getAction())) != null) {
                    int intValue2 = valueOf.intValue();
                    if ((intValue2 == 0 || intValue2 == 2) && (A032 = A03(motionEvent2)) != null) {
                        long longValue = A032.longValue();
                        if (longValue <= getMaxVisibleX()) {
                            float A065 = A06(longValue);
                            for (AnonymousClass4UL r9 : this.A0D) {
                                Paint paint4 = this.A0N;
                                AnonymousClass3MX.A19(getContext(), paint4, r9.A00);
                                Paint paint5 = this.A0O;
                                AnonymousClass3MX.A19(getContext(), paint5, r9.A01);
                                List list3 = r9.A02;
                                ArrayList<C86934Tq> A13 = AnonymousClass000.A13();
                                for (Object next3 : list3) {
                                    if (((C86934Tq) next3).A00 == longValue) {
                                        A13.add(next3);
                                    }
                                }
                                for (C86934Tq r0 : A13) {
                                    float A073 = A07(r0.A01);
                                    canvas2.drawCircle(A065, A073, C72453Mb.A00(this.A0g), paint5);
                                    canvas2.drawCircle(A065, A073, C72453Mb.A00(this.A0f), paint4);
                                    canvas2.drawCircle(A065, A073, C72453Mb.A00(this.A0d), this.A0K);
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        AnonymousClass1ZU.A0B();
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r1 != 3) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r3 = 0
            X.C18070vi.A0d(r5, r3)
            int r1 = r5.getAction()
            r2 = 1
            if (r1 == 0) goto L_0x0014
            if (r1 == r2) goto L_0x0025
            r0 = 2
            if (r1 == r0) goto L_0x0014
            r0 = 3
            if (r1 == r0) goto L_0x0025
        L_0x0013:
            return r2
        L_0x0014:
            android.view.ViewParent r0 = r4.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            r4.A09 = r5
            r4.invalidate()
            java.lang.Long r1 = r4.A03(r5)
            goto L_0x0032
        L_0x0025:
            android.view.ViewParent r0 = r4.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            r1 = 0
            r4.A09 = r1
            r4.invalidate()
        L_0x0032:
            X.5aD r0 = r4.A0A
            if (r0 == 0) goto L_0x0013
            r0.C9t(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.insights.view.chart.LineChartView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setNewsletterNumberFormatter(AnonymousClass4XM r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0279 A[LOOP:13: B:155:0x025f->B:157:0x0279, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02a5 A[LOOP:14: B:163:0x029f->B:165:0x02a5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02bf A[LOOP:15: B:167:0x02b9->B:169:0x02bf, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0340 A[LOOP:18: B:184:0x033a->B:186:0x0340, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x036a A[LOOP:19: B:191:0x0364->B:193:0x036a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x004b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x00ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0149 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x01c8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x028f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0291 A[EDGE_INSN: B:246:0x0291->B:162:0x0291 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setSeries(java.util.List r24) {
        /*
            r23 = this;
            r0 = 0
            r12 = r24
            X.C18070vi.A0d(r12, r0)
            r7 = r23
            java.util.List r0 = r7.A0D
            boolean r0 = X.C18070vi.A18(r0, r12)
            if (r0 != 0) goto L_0x0397
            r7.A0D = r12
            java.util.Iterator r5 = r12.iterator()
            boolean r0 = r5.hasNext()
            r19 = 0
            if (r0 == 0) goto L_0x008d
            java.util.Iterator r3 = X.AnonymousClass3O5.A02(r5)
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Long r2 = X.AnonymousClass3O5.A00(r3)
        L_0x002c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Long r1 = X.AnonymousClass3O5.A00(r3)
            int r0 = r2.compareTo(r1)
            if (r0 <= 0) goto L_0x002c
            r2 = r1
            goto L_0x002c
        L_0x003e:
            if (r2 == 0) goto L_0x0045
            long r0 = r2.longValue()
            goto L_0x0047
        L_0x0045:
            r0 = 0
        L_0x0047:
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L_0x004b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0086
            java.util.Iterator r3 = X.AnonymousClass3O5.A02(r5)
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Long r2 = X.AnonymousClass3O5.A00(r3)
        L_0x005f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Long r1 = X.AnonymousClass3O5.A00(r3)
            int r0 = r2.compareTo(r1)
            if (r0 <= 0) goto L_0x005f
            r2 = r1
            goto L_0x005f
        L_0x0071:
            if (r2 == 0) goto L_0x0078
            long r0 = r2.longValue()
            goto L_0x007a
        L_0x0078:
            r0 = 0
        L_0x007a:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            int r0 = r4.compareTo(r1)
            if (r0 <= 0) goto L_0x004b
            r4 = r1
            goto L_0x004b
        L_0x0086:
            if (r4 == 0) goto L_0x008d
            long r0 = r4.longValue()
            goto L_0x008f
        L_0x008d:
            r0 = 0
        L_0x008f:
            r7.A06 = r0
            java.util.List r0 = r7.A0D
            java.util.Iterator r5 = r0.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x010c
            java.util.Iterator r3 = X.AnonymousClass3O5.A02(r5)
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c4
            java.lang.Long r2 = X.AnonymousClass3O5.A00(r3)
        L_0x00ab:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Long r1 = X.AnonymousClass3O5.A00(r3)
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L_0x00ab
            r2 = r1
            goto L_0x00ab
        L_0x00bd:
            if (r2 == 0) goto L_0x00c4
            long r0 = r2.longValue()
            goto L_0x00c6
        L_0x00c4:
            r0 = 0
        L_0x00c6:
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L_0x00ca:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0105
            java.util.Iterator r3 = X.AnonymousClass3O5.A02(r5)
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f7
            java.lang.Long r2 = X.AnonymousClass3O5.A00(r3)
        L_0x00de:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f0
            java.lang.Long r1 = X.AnonymousClass3O5.A00(r3)
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L_0x00de
            r2 = r1
            goto L_0x00de
        L_0x00f0:
            if (r2 == 0) goto L_0x00f7
            long r0 = r2.longValue()
            goto L_0x00f9
        L_0x00f7:
            r0 = 0
        L_0x00f9:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            int r0 = r4.compareTo(r1)
            if (r0 >= 0) goto L_0x00ca
            r4 = r1
            goto L_0x00ca
        L_0x0105:
            if (r4 == 0) goto L_0x010c
            long r0 = r4.longValue()
            goto L_0x010e
        L_0x010c:
            r0 = 0
        L_0x010e:
            r7.A04 = r0
            java.util.List r0 = r7.A0D
            java.util.Iterator r5 = r0.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x018b
            java.util.Iterator r3 = X.AnonymousClass3O5.A02(r5)
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0143
            java.lang.Long r2 = X.AnonymousClass3O5.A01(r3)
        L_0x012a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x013c
            java.lang.Long r1 = X.AnonymousClass3O5.A01(r3)
            int r0 = r2.compareTo(r1)
            if (r0 <= 0) goto L_0x012a
            r2 = r1
            goto L_0x012a
        L_0x013c:
            if (r2 == 0) goto L_0x0143
            long r0 = r2.longValue()
            goto L_0x0145
        L_0x0143:
            r0 = 0
        L_0x0145:
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L_0x0149:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0184
            java.util.Iterator r3 = X.AnonymousClass3O5.A02(r5)
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0176
            java.lang.Long r2 = X.AnonymousClass3O5.A01(r3)
        L_0x015d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x016f
            java.lang.Long r1 = X.AnonymousClass3O5.A01(r3)
            int r0 = r2.compareTo(r1)
            if (r0 <= 0) goto L_0x015d
            r2 = r1
            goto L_0x015d
        L_0x016f:
            if (r2 == 0) goto L_0x0176
            long r0 = r2.longValue()
            goto L_0x0178
        L_0x0176:
            r0 = 0
        L_0x0178:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            int r0 = r4.compareTo(r1)
            if (r0 <= 0) goto L_0x0149
            r4 = r1
            goto L_0x0149
        L_0x0184:
            if (r4 == 0) goto L_0x018b
            long r0 = r4.longValue()
            goto L_0x018d
        L_0x018b:
            r0 = 0
        L_0x018d:
            r7.A07 = r0
            java.util.List r0 = r7.A0D
            java.util.Iterator r5 = r0.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x020a
            java.util.Iterator r3 = X.AnonymousClass3O5.A02(r5)
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01c2
            java.lang.Long r2 = X.AnonymousClass3O5.A01(r3)
        L_0x01a9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01bb
            java.lang.Long r1 = X.AnonymousClass3O5.A01(r3)
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L_0x01a9
            r2 = r1
            goto L_0x01a9
        L_0x01bb:
            if (r2 == 0) goto L_0x01c2
            long r0 = r2.longValue()
            goto L_0x01c4
        L_0x01c2:
            r0 = 0
        L_0x01c4:
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L_0x01c8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0203
            java.util.Iterator r3 = X.AnonymousClass3O5.A02(r5)
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01f5
            java.lang.Long r2 = X.AnonymousClass3O5.A01(r3)
        L_0x01dc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01ee
            java.lang.Long r1 = X.AnonymousClass3O5.A01(r3)
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L_0x01dc
            r2 = r1
            goto L_0x01dc
        L_0x01ee:
            if (r2 == 0) goto L_0x01f5
            long r0 = r2.longValue()
            goto L_0x01f7
        L_0x01f5:
            r0 = 0
        L_0x01f7:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            int r0 = r4.compareTo(r1)
            if (r0 >= 0) goto L_0x01c8
            r4 = r1
            goto L_0x01c8
        L_0x0203:
            if (r4 == 0) goto L_0x020a
            long r2 = r4.longValue()
            goto L_0x020c
        L_0x020a:
            r2 = 0
        L_0x020c:
            r7.A05 = r2
            long r0 = r7.A07
            long r2 = r2 - r0
            r0 = 4
            long r2 = r2 / r0
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x0216:
            float r0 = (float) r2
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x027e
            long r10 = r7.A07
            long r4 = (long) r6
            long r0 = r10 / r4
            long r13 = r10 ^ r4
            int r8 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r8 >= 0) goto L_0x022e
            long r4 = r4 * r0
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x022e
            r4 = -1
            long r0 = r0 + r4
        L_0x022e:
            r4 = 4
            long r0 = r0 + r4
            float r4 = (float) r0
            float r4 = r4 * r6
            long r8 = r7.A05
            float r0 = (float) r8
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x027e
            long r4 = (long) r6
            r7.A03 = r4
            long r2 = r10 / r4
            r0 = r2
            long r17 = r10 ^ r4
            r15 = -1
            int r6 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r6 >= 0) goto L_0x024f
            long r13 = r2 * r4
            int r6 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x024f
            long r2 = r2 + r15
        L_0x024f:
            long r2 = r2 * r4
            int r6 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r6 >= 0) goto L_0x025b
            long r13 = r0 * r4
            int r6 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x025b
            long r0 = r0 + r15
        L_0x025b:
            r13 = 4
            long r0 = r0 + r13
            long r0 = r0 * r4
        L_0x025f:
            long r15 = r10 - r2
            long r13 = r0 - r8
            long r15 = r15 - r13
            long r21 = java.lang.Math.abs(r15)
            long r19 = r2 - r4
            long r17 = r0 - r4
            long r15 = r10 - r19
            long r13 = r17 - r8
            long r15 = r15 - r13
            long r13 = java.lang.Math.abs(r15)
            int r6 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r6 >= 0) goto L_0x0291
            r0 = r17
            r2 = r19
            goto L_0x025f
        L_0x027e:
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r0 = 0
            char r4 = r1.charAt(r0)
            r1 = 50
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 != r1) goto L_0x028f
            r0 = 1075838976(0x40200000, float:2.5)
        L_0x028f:
            float r6 = r6 * r0
            goto L_0x0216
        L_0x0291:
            r7.A02 = r2
            r7.A01 = r0
            java.util.List r0 = r7.A0D
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x029f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02b1
            java.lang.Object r0 = r1.next()
            X.4UL r0 = (X.AnonymousClass4UL) r0
            java.util.List r0 = r0.A02
            X.C29401cD.A0J(r0, r3)
            goto L_0x029f
        L_0x02b1:
            java.util.ArrayList r2 = X.C29351c6.A0D(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x02b9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02c7
            java.lang.Long r0 = X.AnonymousClass3O5.A00(r1)
            r2.add(r0)
            goto L_0x02b9
        L_0x02c7:
            java.util.Set r0 = X.C29431cG.A12(r2)
            r7.A0I = r0
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            boolean r0 = r7.A05()
            if (r0 != 0) goto L_0x02f8
            long r1 = r7.A04
            long r3 = r7.A06
            long r1 = r1 - r3
            r3 = 2
            long r1 = r1 / r3
            r8 = 0
        L_0x02e0:
            long r3 = r7.A06
            long r5 = (long) r8
            long r5 = r5 * r1
            long r3 = r3 + r5
            X.11Y r5 = X.AnonymousClass11X.A00
            X.0vb r0 = r7.getWhatsAppLocale()
            java.lang.String r0 = r5.A06(r0, r3)
            r9.add(r0)
            int r8 = r8 + 1
            r0 = 3
            if (r8 >= r0) goto L_0x02f8
            goto L_0x02e0
        L_0x02f8:
            r7.A0E = r9
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            boolean r0 = r7.A05()
            if (r0 != 0) goto L_0x031e
            r6 = 0
        L_0x0305:
            long r2 = r7.A02
            long r4 = (long) r6
            long r0 = r7.A03
            long r4 = r4 * r0
            long r2 = r2 + r4
            X.4XM r1 = r7.getNewsletterNumberFormatter()
            int r0 = (int) r2
            java.lang.String r0 = r1.A01(r0)
            r8.add(r0)
            int r6 = r6 + 1
            r0 = 5
            if (r6 >= r0) goto L_0x031e
            goto L_0x0305
        L_0x031e:
            r7.setYLabels(r8)
            r5 = 10
            int r0 = X.C29351c6.A0C(r12, r5)
            int r0 = X.C200610r.A03(r0)
            r4 = 16
            if (r0 >= r4) goto L_0x0331
            r0 = 16
        L_0x0331:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r0)
            java.util.Iterator r2 = r12.iterator()
        L_0x033a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x034d
            java.lang.Object r1 = r2.next()
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r3.put(r1, r0)
            goto L_0x033a
        L_0x034d:
            r7.A0H = r3
            int r0 = X.C29351c6.A0C(r12, r5)
            int r0 = X.C200610r.A03(r0)
            if (r0 >= r4) goto L_0x035b
            r0 = 16
        L_0x035b:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r0)
            java.util.Iterator r5 = r12.iterator()
        L_0x0364:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0392
            java.lang.Object r4 = r5.next()
            r3 = r4
            X.4UL r3 = (X.AnonymousClass4UL) r3
            android.graphics.Paint r2 = X.AnonymousClass3MW.A06()
            r0 = 1
            r2.setAntiAlias(r0)
            X.AnonymousClass3MW.A1P(r2)
            X.0vl r0 = r7.A0h
            float r0 = X.C72453Mb.A00(r0)
            r2.setStrokeWidth(r0)
            android.content.Context r1 = r7.getContext()
            int r0 = r3.A00
            X.AnonymousClass3MX.A19(r1, r2, r0)
            r6.put(r4, r2)
            goto L_0x0364
        L_0x0392:
            r7.A0G = r6
            r7.A04()
        L_0x0397:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.insights.view.chart.LineChartView.setSeries(java.util.List):void");
    }

    private final Long A03(MotionEvent motionEvent) {
        Iterator it = this.A0I.iterator();
        float f = Float.MAX_VALUE;
        Long l = null;
        while (it.hasNext()) {
            long A072 = C17890vO.A07(it);
            float abs = Math.abs(motionEvent.getX() - A06(A072));
            if (abs < f) {
                l = Long.valueOf(A072);
                f = abs;
            }
        }
        return l;
    }

    private final int getChartPaddingBottom() {
        return C72453Mb.A0I(this.A0T);
    }

    private final int getChartPaddingEnd() {
        return C72453Mb.A0I(this.A0U);
    }

    private final int getChartPaddingStart() {
        return C72453Mb.A0I(this.A0V);
    }

    private final int getChartPaddingStartIncludingLabels() {
        int i;
        int A0I2 = C72453Mb.A0I(this.A0V);
        if (AnonymousClass3MY.A1b(getWhatsAppLocale())) {
            i = this.A00 + C72453Mb.A0I(this.A0Y);
        } else {
            i = 0;
        }
        return A0I2 + i;
    }

    private final int getChartPaddingTop() {
        return C72453Mb.A0I(this.A0W);
    }

    private final int getChartPaddingXLabels() {
        return C72453Mb.A0I(this.A0X);
    }

    private final int getChartPaddingYLabels() {
        return C72453Mb.A0I(this.A0Y);
    }

    private final long getChartYInterval() {
        return this.A01 - this.A02;
    }

    private final float getGridStrokeWidth() {
        return C72453Mb.A00(this.A0Z);
    }

    private final float getGuideDashGap() {
        return C72453Mb.A00(this.A0a);
    }

    private final float getGuideDashLength() {
        return C72453Mb.A00(this.A0b);
    }

    private final float getGuideStrokeWidth() {
        return C72453Mb.A00(this.A0c);
    }

    private final float getInternalHandleRadius() {
        return C72453Mb.A00(this.A0d);
    }

    private final float getLabelTextSize() {
        return C72453Mb.A00(this.A0e);
    }

    private final long getMaxVisibleX() {
        long j = this.A06;
        return j + ((long) (((float) (this.A04 - j)) * this.A00));
    }

    private final float getPrimaryHandleRadius() {
        return C72453Mb.A00(this.A0f);
    }

    private final float getSecondaryHandleRadius() {
        return C72453Mb.A00(this.A0g);
    }

    private final float getSeriesStrokeWidth() {
        return C72453Mb.A00(this.A0h);
    }

    private final float getXAxisNotchLength() {
        return C72453Mb.A00(this.A0i);
    }

    private final float getXAxisStrokeWidth() {
        return C72453Mb.A00(this.A0j);
    }

    private final long getXInterval() {
        return this.A04 - this.A06;
    }

    private final long getYInterval() {
        return this.A05 - this.A07;
    }

    private final void setYLabels(List list) {
        this.A0F = list;
        Rect rect = this.A0S;
        rect.setEmpty();
        Rect A072 = AnonymousClass3MW.A07();
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            this.A0M.getTextBounds(A0v, 0, A0v.length(), A072);
            rect.union(A072);
        }
        this.A00 = rect.width();
    }

    public final float A06(long j) {
        long j2 = this.A06;
        float chartWidth = (((float) (j - j2)) / ((float) (this.A04 - j2))) * ((float) getChartWidth());
        float chartPaddingStartIncludingLabels = (float) getChartPaddingStartIncludingLabels();
        if (!AnonymousClass3MY.A1b(getWhatsAppLocale())) {
            chartWidth = ((float) getChartWidth()) - chartWidth;
        }
        float f = chartPaddingStartIncludingLabels + chartWidth;
        if (j == this.A06) {
            return f + (C72453Mb.A00(this.A0c) / 2.0f);
        }
        if (j == this.A04) {
            return f - (C72453Mb.A00(this.A0c) / 2.0f);
        }
        return f;
    }

    public final float A07(long j) {
        long j2 = this.A01;
        return ((float) C72453Mb.A0I(this.A0W)) + ((((float) (j2 - j)) / ((float) (j2 - this.A02))) * ((float) getChartHeight()));
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0C;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass4XM getNewsletterNumberFormatter() {
        AnonymousClass4XM r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("newsletterNumberFormatter");
        throw null;
    }

    public final List getSeries() {
        return this.A0D;
    }

    public final C107555aD getValueSelectionListener() {
        return this.A0A;
    }

    private final int getChartHeight() {
        return (getHeight() - C72453Mb.A0I(this.A0W)) - C72453Mb.A0I(this.A0T);
    }

    private final int getChartWidth() {
        return (((getWidth() - C72453Mb.A0I(this.A0V)) - C72453Mb.A0I(this.A0U)) - this.A00) - C72453Mb.A0I(this.A0Y);
    }

    public final void setValueSelectionListener(C107555aD r1) {
        this.A0A = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LineChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        this.A02 = true;
        if (!this.A0J) {
            this.A0J = true;
            AnonymousClass10E A0O2 = AnonymousClass3MW.A0O(generatedComponent());
            this.A01 = AnonymousClass10E.A6Q(A0O2);
            this.A0B = (AnonymousClass4XM) A0O2.A00.A3O.get();
        }
        this.A03 = 1;
        this.A01 = this.A02 + 4;
        this.A0I = C25511Om.A00;
        this.A0W = AnonymousClass1DF.A01(new C103095Iz(this));
        this.A0T = AnonymousClass1DF.A01(new C103065Iw(this));
        this.A0V = AnonymousClass1DF.A01(new C103085Iy(this));
        this.A0U = AnonymousClass1DF.A01(new C103075Ix(this));
        this.A0X = AnonymousClass1DF.A01(new AnonymousClass5J0(this));
        this.A0Y = AnonymousClass1DF.A01(new AnonymousClass5J1(this));
        this.A0j = AnonymousClass1DF.A01(new AnonymousClass5JC(this));
        this.A0i = AnonymousClass1DF.A01(new AnonymousClass5JB(this));
        this.A0Z = AnonymousClass1DF.A01(new AnonymousClass5J2(this));
        this.A0c = AnonymousClass1DF.A01(new AnonymousClass5J5(this));
        this.A0b = AnonymousClass1DF.A01(new AnonymousClass5J4(this));
        this.A0a = AnonymousClass1DF.A01(new AnonymousClass5J3(this));
        this.A0h = AnonymousClass1DF.A01(new AnonymousClass5JA(this));
        this.A0f = AnonymousClass1DF.A01(new AnonymousClass5J8(this));
        this.A0g = AnonymousClass1DF.A01(new AnonymousClass5J9(this));
        this.A0d = AnonymousClass1DF.A01(new AnonymousClass5J6(this));
        this.A0e = AnonymousClass1DF.A01(new AnonymousClass5J7(this));
        this.A0H = AnonymousClass1D7.A0I();
        this.A0G = AnonymousClass1D7.A0I();
        Paint A072 = AnonymousClass3Ma.A07();
        AnonymousClass3MX.A19(context, A072, 2131100378);
        A072.setStrokeWidth(C72453Mb.A00(this.A0c));
        A072.setPathEffect(new DashPathEffect(new float[]{C72453Mb.A00(this.A0b), C72453Mb.A00(this.A0a)}, C72453Mb.A00(this.A0b) - (C72453Mb.A00(this.A0j) / 2.0f)));
        this.A08 = A072;
        this.A0N = AnonymousClass3Ma.A07();
        this.A0O = AnonymousClass3Ma.A07();
        Paint A073 = AnonymousClass3Ma.A07();
        A073.setColor(AnonymousClass3Ma.A00(context, 2130970830, 2131100157));
        this.A0K = A073;
        C18460wS r2 = C18460wS.A00;
        this.A0D = r2;
        this.A0R = new Path();
        this.A0Q = new Path();
        Paint A074 = AnonymousClass3Ma.A07();
        AnonymousClass3MW.A1P(A074);
        AnonymousClass3MX.A19(context, A074, 2131100378);
        A074.setStrokeWidth(C72453Mb.A00(this.A0j));
        this.A0P = A074;
        Paint A075 = AnonymousClass3Ma.A07();
        AnonymousClass3MW.A1P(A075);
        AnonymousClass3MX.A19(context, A075, 2131100378);
        A075.setStrokeWidth(C72453Mb.A00(this.A0Z));
        this.A0L = A075;
        Paint A076 = AnonymousClass3Ma.A07();
        A076.setTextSize(C72453Mb.A00(this.A0e));
        AnonymousClass3MX.A19(context, A076, 2131103152);
        this.A0M = A076;
        this.A0E = r2;
        this.A0F = r2;
        this.A0S = AnonymousClass3MW.A07();
    }

    public /* synthetic */ LineChartView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LineChartView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
