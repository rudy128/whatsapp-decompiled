package X;

import java.util.List;

/* renamed from: X.2sL  reason: invalid class name and case insensitive filesystem */
public final class C63002sL {
    public final float[] A00;
    public final int[] A01;

    public C63002sL(List list, List list2) {
        int size = list.size();
        this.A01 = new int[size];
        this.A00 = new float[size];
        for (int i = 0; i < size; i++) {
            this.A01[i] = AnonymousClass001.A0n(list, i);
            this.A00[i] = AnonymousClass000.A04(list2.get(i));
        }
    }

    public C63002sL(int i, int i2, int i3) {
        this.A01 = new int[]{i, i2, i3};
        this.A00 = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C63002sL(int i, int i2) {
        this.A01 = new int[]{i, i2};
        this.A00 = new float[]{0.0f, 1.0f};
    }
}
