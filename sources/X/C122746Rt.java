package X;

import android.content.Context;

/* renamed from: X.6Rt  reason: invalid class name and case insensitive filesystem */
public enum C122746Rt {
    EXPLORE(1),
    TRENDING(2),
    FEATURED(3),
    NEW(4),
    POPULAR(5),
    COUNTRY(6);
    
    public final int value;

    /* access modifiers changed from: public */
    static {
        C122746Rt[] r0;
        A00 = C19780yz.A00(r0);
    }

    /* access modifiers changed from: public */
    C122746Rt(int i) {
        this.value = i;
    }

    public final Integer A00() {
        int i;
        int ordinal = ordinal();
        Integer A0i = C17880vN.A0i();
        switch (ordinal) {
            case 0:
                i = 1;
                break;
            case 1:
            case 6:
                return A0i;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                return null;
            default:
                throw AnonymousClass3MW.A14();
        }
        return Integer.valueOf(i);
    }

    public final String A01(Context context) {
        int i;
        switch (ordinal()) {
            case 0:
                i = 2131892871;
                break;
            case 1:
                i = 2131892875;
                break;
            case 2:
                i = 2131892872;
                break;
            case 3:
                i = 2131892873;
                break;
            case 4:
                i = 2131892874;
                break;
            case 5:
                i = 2131892870;
                break;
            case 6:
                return "⭐ Discover";
            default:
                throw AnonymousClass3MW.A14();
        }
        return C18070vi.A0F(context, i);
    }
}
