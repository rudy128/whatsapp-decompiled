package X;

import android.content.Context;

/* renamed from: X.7JC  reason: invalid class name */
public class AnonymousClass7JC implements AnonymousClass8B0 {
    public final int A00;

    public boolean BE6() {
        return false;
    }

    public int BZ7() {
        return 1;
    }

    public C1409773u BHq(Context context, C18000vb r4, boolean z) {
        switch (this.A00) {
            case 0:
                return new AnonymousClass69Q();
            case 1:
                return new AnonymousClass69S();
            case 2:
                return new AnonymousClass69T();
            case 3:
                return new AnonymousClass69b();
            case 4:
                return new AnonymousClass69U();
            case 5:
                return new AnonymousClass69d();
            case 6:
                return new AnonymousClass69L(context, r4, z);
            case 7:
                return new AnonymousClass69X(context, r4, z);
            case 8:
                C18070vi.A0j(context, r4);
                return new AnonymousClass69Y(context, r4, C18070vi.A0F(context, 2131886761), z);
            default:
                C18070vi.A0j(context, r4);
                return new AnonymousClass69Z(context, r4, C18070vi.A0F(context, 2131886527), z);
        }
    }

    public AnonymousClass737[] BRD() {
        AnonymousClass737[] r2;
        int[] iArr;
        int i;
        switch (this.A00) {
            case 0:
                r2 = new AnonymousClass737[1];
                iArr = new int[1];
                i = 8599;
                break;
            case 1:
                r2 = new AnonymousClass737[1];
                iArr = new int[1];
                i = 11093;
                break;
            case 2:
                r2 = new AnonymousClass737[1];
                iArr = new int[1];
                i = 128306;
                break;
            case 3:
                r2 = new AnonymousClass737[1];
                iArr = new int[1];
                i = 128173;
                break;
            case 4:
            case 5:
                r2 = new AnonymousClass737[1];
                iArr = new int[1];
                i = 128172;
                break;
            case 6:
            case 7:
                r2 = new AnonymousClass737[1];
                iArr = new int[1];
                i = 128346;
                break;
            case 8:
                r2 = new AnonymousClass737[1];
                iArr = new int[1];
                i = 128205;
                break;
            default:
                return AnonymousClass8B0.A00;
        }
        r2[0] = AnonymousClass737.A00(iArr, i, 0);
        return r2;
    }

    public boolean CFb() {
        int i = this.A00;
        if (i == 7 || i == 8) {
            return true;
        }
        return false;
    }

    public AnonymousClass7JC(int i) {
        this.A00 = i;
    }

    public String Ba8() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("custom:");
        return C17880vN.A0t(A10, this.A00);
    }
}
