package X;

import java.util.Set;

public enum C0C {
    ;

    public A2W A00() {
        Set set;
        if (!(this instanceof BVI)) {
            return C196409v0.A00();
        }
        switch (((BVI) this).A00) {
            case 0:
                set = BVL.A0r;
                break;
            case 1:
                set = BVL.A0s;
                break;
            case 2:
                set = BVL.A0q;
                break;
            case 3:
                set = BVL.A0m;
                break;
            case 4:
                set = BVL.A0g;
                break;
            case 5:
                set = BVL.A0i;
                break;
            case 6:
                set = BVL.A0f;
                break;
            case 7:
                set = BVL.A0c;
                break;
            case 8:
                set = BVL.A0j;
                break;
            case 9:
                set = BVL.A0n;
                break;
            case 10:
                set = BVL.A0o;
                break;
            case 11:
                set = BVL.A0u;
                break;
            default:
                set = BVL.A0p;
                break;
        }
        return C196409v0.A01(set);
    }

    public A2W A01() {
        if (this instanceof BVI) {
            BVI bvi = (BVI) this;
            if (3 - bvi.A00 == 0) {
                return C196409v0.A01(new C27327Dby(bvi));
            }
        }
        return C196409v0.A00();
    }
}
