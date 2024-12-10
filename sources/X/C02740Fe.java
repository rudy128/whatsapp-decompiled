package X;

import android.view.View;

/* renamed from: X.0Fe  reason: invalid class name and case insensitive filesystem */
public abstract class C02740Fe {
    public static final long A00(int i, int i2) {
        C04660Og r0;
        int i3;
        C04660Og r02;
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            r0 = AnonymousClass0C9.A00;
        } else if (mode == 1073741824) {
            r0 = AnonymousClass0C7.A00;
        } else {
            throw AnonymousClass000.A0n("Unknown width spec mode.");
        }
        int A01 = r0.A06().A01();
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        int A03 = C28851b7.A03(size, 0, A01);
        int i5 = Integer.MAX_VALUE;
        if (mode2 == Integer.MIN_VALUE) {
            i3 = A03;
            A03 = 0;
        } else if (mode2 == 0) {
            A03 = 0;
            i3 = Integer.MAX_VALUE;
        } else if (mode2 == 1073741824) {
            i3 = A03;
        } else {
            throw AnonymousClass000.A0n("Unknown width spec mode.");
        }
        int mode3 = View.MeasureSpec.getMode(i2);
        if (mode3 == Integer.MIN_VALUE || mode3 == 0) {
            r02 = AnonymousClass0C9.A00;
        } else if (mode3 == 1073741824) {
            r02 = AnonymousClass0C7.A00;
        } else {
            throw AnonymousClass000.A0n("Unknown width spec mode.");
        }
        int A012 = r02.A06().A01();
        int mode4 = View.MeasureSpec.getMode(i2);
        int A032 = C28851b7.A03(View.MeasureSpec.getSize(i2), 0, A012);
        if (mode4 == Integer.MIN_VALUE) {
            i5 = A032;
        } else if (mode4 != 0) {
            if (mode4 == 1073741824) {
                i5 = A032;
                i4 = A032;
            } else {
                throw AnonymousClass000.A0n("Unknown height spec mode.");
            }
        }
        return AnonymousClass0OH.A00.A01(A03, i3, i4, i5);
    }
}
