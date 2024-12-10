package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.1x7  reason: invalid class name and case insensitive filesystem */
public final class C41821x7 {
    public static final Integer A0I = AnonymousClass00R.A02;
    public final AnonymousClass1KB A00;
    public final AnonymousClass10I A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;

    public C41821x7(AnonymousClass1KB r21, AnonymousClass10I r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38) {
        AnonymousClass1KB r19 = r21;
        C18070vi.A0d(r19, 1);
        AnonymousClass10I r18 = r22;
        C18070vi.A0d(r18, 2);
        AnonymousClass00H r17 = r23;
        C18070vi.A0d(r17, 3);
        AnonymousClass00H r16 = r24;
        C18070vi.A0d(r16, 4);
        AnonymousClass00H r15 = r25;
        C18070vi.A0d(r15, 5);
        AnonymousClass00H r14 = r26;
        C18070vi.A0d(r14, 6);
        AnonymousClass00H r13 = r27;
        C18070vi.A0d(r13, 7);
        AnonymousClass00H r12 = r28;
        C18070vi.A0d(r12, 8);
        AnonymousClass00H r11 = r29;
        C18070vi.A0d(r11, 9);
        AnonymousClass00H r10 = r30;
        C18070vi.A0d(r10, 10);
        AnonymousClass00H r9 = r31;
        C18070vi.A0d(r9, 11);
        AnonymousClass00H r8 = r32;
        C18070vi.A0d(r8, 12);
        AnonymousClass00H r7 = r33;
        C18070vi.A0d(r7, 13);
        AnonymousClass00H r6 = r34;
        C18070vi.A0d(r6, 14);
        AnonymousClass00H r5 = r35;
        C18070vi.A0d(r5, 15);
        AnonymousClass00H r4 = r36;
        C18070vi.A0d(r4, 16);
        AnonymousClass00H r3 = r37;
        C18070vi.A0d(r3, 17);
        AnonymousClass00H r2 = r38;
        C18070vi.A0d(r2, 18);
        this.A00 = r19;
        this.A01 = r18;
        this.A0B = r17;
        this.A0D = r16;
        this.A09 = r15;
        this.A0A = r14;
        this.A08 = r13;
        this.A04 = r12;
        this.A0E = r11;
        this.A02 = r10;
        this.A0C = r9;
        this.A07 = r8;
        this.A0F = r7;
        this.A05 = r6;
        this.A03 = r5;
        this.A0H = r4;
        this.A0G = r3;
        this.A06 = r2;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.1rL] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r9, X.C41821x7 r10, java.lang.Integer r11, java.lang.String r12, int r13) {
        /*
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "XFamilyCrosspostManager/handleErrorWithSnackbarMessage/errorCode: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = ", errorSubCode: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            r5 = 0
            X.C18070vi.A0d(r0, r5)
            r0 = -4
            r3 = r12
            if (r13 == r0) goto L_0x006e
            r0 = -3
            if (r13 == r0) goto L_0x0061
            r0 = -2
            if (r13 == r0) goto L_0x0054
            r0 = 190(0xbe, float:2.66E-43)
            if (r13 == r0) goto L_0x0095
            r0 = 3463044(0x34d784, float:4.852758E-39)
            if (r13 == r0) goto L_0x0047
            r1 = 3463126(0x34d7d6, float:4.852873E-39)
            X.00H r0 = r10.A07
            if (r13 == r1) goto L_0x007b
            java.lang.Object r2 = r0.get()
            X.730 r2 = (X.AnonymousClass730) r2
            r0 = 0
            r4 = 2131889141(0x7f120bf5, float:1.9412937E38)
        L_0x0041:
            r1 = r0
            r6 = r5
            X.AnonymousClass730.A01(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0047:
            X.00H r0 = r10.A07
            java.lang.Object r2 = r0.get()
            X.730 r2 = (X.AnonymousClass730) r2
            r0 = 0
            r4 = 2131889143(0x7f120bf7, float:1.9412941E38)
            goto L_0x0041
        L_0x0054:
            X.00H r0 = r10.A07
            java.lang.Object r2 = r0.get()
            X.730 r2 = (X.AnonymousClass730) r2
            r0 = 0
            r4 = 2131889133(0x7f120bed, float:1.941292E38)
            goto L_0x0041
        L_0x0061:
            X.00H r0 = r10.A07
            java.lang.Object r2 = r0.get()
            X.730 r2 = (X.AnonymousClass730) r2
            r0 = 0
            r4 = 2131889132(0x7f120bec, float:1.9412919E38)
            goto L_0x0041
        L_0x006e:
            X.00H r0 = r10.A07
            java.lang.Object r2 = r0.get()
            X.730 r2 = (X.AnonymousClass730) r2
            r0 = 0
            r4 = 2131889144(0x7f120bf8, float:1.9412943E38)
            goto L_0x0041
        L_0x007b:
            java.lang.Object r8 = r0.get()
            X.730 r8 = (X.AnonymousClass730) r8
            r0 = 38
            X.6LF r7 = new X.6LF
            r7.<init>(r9, r8, r0)
            r6 = 0
            r10 = 2131889142(0x7f120bf6, float:1.941294E38)
            r11 = 2131889138(0x7f120bf2, float:1.9412931E38)
            r9 = r12
            r12 = r5
            X.AnonymousClass730.A01(r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0095:
            if (r11 == 0) goto L_0x00b0
            int r1 = r11.intValue()
            r0 = 452(0x1c4, float:6.33E-43)
            if (r1 != r0) goto L_0x00b0
            X.00H r0 = r10.A07
            java.lang.Object r2 = r0.get()
            X.730 r2 = (X.AnonymousClass730) r2
            r0 = 0
            r4 = 2131889139(0x7f120bf3, float:1.9412933E38)
            r1 = r0
            r6 = r5
            X.AnonymousClass730.A01(r0, r1, r2, r3, r4, r5, r6)
        L_0x00b0:
            X.00H r0 = r10.A0B
            java.lang.Object r2 = r0.get()
            X.1mM r2 = (X.C35511mM) r2
            java.lang.Integer r1 = A0I
            r0 = 1
            r2.A04(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41821x7.A00(android.content.Context, X.1x7, java.lang.Integer, java.lang.String, int):void");
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.1rL] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r8, X.C122946Sn r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.String r12, boolean r13) {
        /*
            r7 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "XFamilyCrosspostManager/handleErrorLinkingWithSnackbarMessage/errorCode: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", errorSubCode: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", exception: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            r5 = 0
            X.C18070vi.A0d(r0, r5)
            r3 = r12
            r6 = r13
            if (r9 == 0) goto L_0x0046
            java.lang.Class r1 = r9.getClass()
            java.lang.Class<X.6QA> r0 = X.AnonymousClass6QA.class
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00a5
            X.00H r0 = r7.A07
            java.lang.Object r2 = r0.get()
            X.730 r2 = (X.AnonymousClass730) r2
            r0 = 0
            r4 = 2131889140(0x7f120bf4, float:1.9412935E38)
        L_0x0041:
            r1 = r0
            X.AnonymousClass730.A01(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0046:
            if (r11 == 0) goto L_0x006a
            int r1 = r11.intValue()
            r0 = 459(0x1cb, float:6.43E-43)
            if (r1 == r0) goto L_0x00b2
            r0 = 467(0x1d3, float:6.54E-43)
            if (r1 == r0) goto L_0x005d
            r0 = 463(0x1cf, float:6.49E-43)
            if (r1 == r0) goto L_0x005d
            r0 = 464(0x1d0, float:6.5E-43)
            if (r1 == r0) goto L_0x00b2
            return
        L_0x005d:
            X.00H r0 = r7.A07
            java.lang.Object r2 = r0.get()
            X.730 r2 = (X.AnonymousClass730) r2
            r0 = 0
            r4 = 2131889139(0x7f120bf3, float:1.9412933E38)
            goto L_0x0041
        L_0x006a:
            if (r10 == 0) goto L_0x00a5
            int r1 = r10.intValue()
            r0 = -1
            if (r1 == r0) goto L_0x0098
            r0 = 4
            if (r1 == r0) goto L_0x00a5
            r0 = 17
            if (r1 == r0) goto L_0x00a5
            r0 = 190(0xbe, float:2.66E-43)
            if (r1 == r0) goto L_0x00b2
            r0 = 341(0x155, float:4.78E-43)
            if (r1 == r0) goto L_0x00a5
            r0 = 368(0x170, float:5.16E-43)
            if (r1 == r0) goto L_0x00a5
            r0 = 3463126(0x34d7d6, float:4.852873E-39)
            if (r1 == r0) goto L_0x00b2
            X.00H r0 = r7.A07
            java.lang.Object r2 = r0.get()
            X.730 r2 = (X.AnonymousClass730) r2
            r0 = 0
            r4 = 2131889134(0x7f120bee, float:1.9412923E38)
            goto L_0x0041
        L_0x0098:
            X.00H r0 = r7.A07
            java.lang.Object r2 = r0.get()
            X.730 r2 = (X.AnonymousClass730) r2
            r0 = 0
            r4 = 2131889135(0x7f120bef, float:1.9412925E38)
            goto L_0x0041
        L_0x00a5:
            X.00H r0 = r7.A07
            java.lang.Object r2 = r0.get()
            X.730 r2 = (X.AnonymousClass730) r2
            r0 = 0
            r4 = 2131889136(0x7f120bf0, float:1.9412927E38)
            goto L_0x0041
        L_0x00b2:
            X.00H r0 = r7.A07
            java.lang.Object r2 = r0.get()
            X.730 r2 = (X.AnonymousClass730) r2
            r0 = 37
            X.6LF r1 = new X.6LF
            r1.<init>(r8, r2, r0)
            r0 = 0
            r4 = 2131889137(0x7f120bf1, float:1.941293E38)
            r5 = 2131889138(0x7f120bf2, float:1.9412931E38)
            X.AnonymousClass730.A01(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41821x7.A01(android.content.Context, X.6Sn, java.lang.Integer, java.lang.Integer, java.lang.String, boolean):void");
    }

    public final void A02(Context context, Integer num, String str, List list) {
        AnonymousClass3BD r2 = new AnonymousClass3BD(context, this, num, str);
        ((C139146yI) this.A02.get()).A00(context, r2, num, str, list);
    }

    public final boolean A04(AnonymousClass206 r8) {
        long j = r8.A0x;
        AnonymousClass00H r6 = ((C57032iQ) this.A08.get()).A00;
        if (!((C62422rN) r6.get()).A03(j)) {
            return false;
        }
        if (C29431cG.A18(C200410p.A0S(new Integer[]{0, 1, 7}), ((C62422rN) r6.get()).A01(j))) {
            return true;
        }
        return false;
    }

    public final boolean A05(AnonymousClass206 r5) {
        Integer A012;
        long j = r5.A0x;
        AnonymousClass00H r3 = ((C57032iQ) this.A08.get()).A00;
        if (!((C62422rN) r3.get()).A03(j) || (A012 = ((C62422rN) r3.get()).A01(j)) == null || 3 != A012.intValue()) {
            return false;
        }
        return true;
    }

    public final void A03(View view, int i, long j, boolean z, boolean z2) {
        C55872gV r2;
        int height;
        C109195cy r4;
        int i2;
        long j2;
        View A062;
        int i3;
        int width;
        C18070vi.A0d(view, 0);
        if (z) {
            Context context = view.getContext();
            C18070vi.A0X(context);
            AnonymousClass3BC r3 = new AnonymousClass3BC(this, new AnonymousClass3BD(context, this, 3, "status_fragment"), 0);
            r2 = (C55872gV) this.A04.get();
            AnonymousClass78R r1 = new AnonymousClass78R(r2, (C1606089d) r3);
            View A063 = AnonymousClass1HF.A06(view, 2131429727);
            C18070vi.A0X(A063);
            A063.setOnClickListener(r1);
            if (i != 2) {
                A062 = AnonymousClass1HF.A06(view, 2131435701);
                C18070vi.A0X(A062);
                i3 = 24;
            } else {
                A062 = AnonymousClass1HF.A06(view, 2131429132);
                C18070vi.A0X(A062);
                i3 = 23;
            }
            A062.setOnClickListener(new AnonymousClass785(r2, i3));
            C30131dR r32 = (C30131dR) r2.A06.get();
            r32.A06((String) null, "SEE_F_ICON", 927610551);
            r32.A02(Boolean.valueOf(r2.A02.A06(AnonymousClass00R.A00)), "is_account_linked");
            r32.A02(Long.valueOf(j), "status_session_id");
            if (i != 0) {
                WeakReference weakReference = C55872gV.A08;
                if (weakReference == null || weakReference.get() != view) {
                    C55872gV.A08 = new WeakReference(view);
                    int visibility = view.getVisibility();
                    int i4 = view.getLayoutParams().height;
                    view.setVisibility(0);
                    view.getLayoutParams().height = -2;
                    if (view.getParent() == null) {
                        width = view.getWidth();
                    } else {
                        ViewParent parent = view.getParent();
                        C18070vi.A0z(parent, "null cannot be cast to non-null type android.view.View");
                        width = ((View) parent).getWidth();
                    }
                    view.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                    C55872gV.A07 = view.getMeasuredHeight();
                    view.setVisibility(visibility);
                    view.getLayoutParams().height = i4;
                }
                i2 = C55872gV.A07;
                r4 = new C109195cy(view, 46);
                height = 0;
            } else {
                view.animate().cancel();
                view.animate().alpha(1.0f).setDuration(600).setStartDelay(1400).setListener(new C109195cy(view, 44)).start();
                return;
            }
        } else {
            r2 = (C55872gV) this.A04.get();
            if (i == 0) {
                view.animate().cancel();
                view.setVisibility(8);
                return;
            } else if (view.getVisibility() == 8) {
                ValueAnimator valueAnimator = r2.A00;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                }
                ValueAnimator valueAnimator2 = r2.A00;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator3 = r2.A00;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    return;
                }
                return;
            } else {
                height = view.getHeight();
                r4 = new C109195cy(view, 45);
                i2 = 0;
                z2 = false;
            }
        }
        ValueAnimator valueAnimator4 = r2.A00;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllListeners();
        }
        ValueAnimator valueAnimator5 = r2.A00;
        if (valueAnimator5 != null) {
            valueAnimator5.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator6 = r2.A00;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{height, i2});
        r2.A00 = ofInt;
        if (ofInt != null) {
            ofInt.setDuration(400);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.addListener(r4);
            ofInt.addUpdateListener(new C88754aj(view, 24));
            if (z2) {
                j2 = 1400;
            } else {
                j2 = 0;
            }
            ofInt.setStartDelay(j2);
            ofInt.start();
        }
    }
}
