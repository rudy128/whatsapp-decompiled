package X;

import java.util.List;

/* renamed from: X.0Hm  reason: invalid class name */
public final class AnonymousClass0Hm {
    public int A00;
    public final int A01;
    public final AnonymousClass0IF A02;
    public final List A03;

    public AnonymousClass0Hm(AnonymousClass0IF r6, List list) {
        int i;
        int i2;
        this.A03 = list;
        this.A02 = r6;
        if (r6 != null) {
            i = r6.A01.A00.getButtonState();
        } else {
            i = 0;
        }
        this.A01 = i;
        AnonymousClass0IF r0 = this.A02;
        if (r0 != null) {
            r0.A01.A00.getMetaState();
        }
        AnonymousClass0IF r02 = this.A02;
        if (r02 != null) {
            int actionMasked = r02.A01.A00.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                i2 = 6;
                                break;
                            case 9:
                                i2 = 4;
                                break;
                            case 10:
                                i2 = 5;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                    }
                    i2 = 3;
                }
                i2 = 2;
            }
            i2 = 1;
        } else {
            List list2 = this.A03;
            int size = list2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                AnonymousClass0KX A0f = AnonymousClass000.A0f(list2, i3);
                if (!AnonymousClass0Oz.A01(A0f)) {
                    if (!A0f.A0C && A0f.A0B) {
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            i2 = 1;
        }
        this.A00 = i2;
    }
}
