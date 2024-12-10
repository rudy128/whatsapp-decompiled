package X;

import android.content.Context;

/* renamed from: X.4Ff  reason: invalid class name and case insensitive filesystem */
public abstract class C83464Ff {
    public static final String A00(Context context, C106535Wf r3) {
        int i;
        if (r3 instanceof C92424hH) {
            AnonymousClass4E5 BVB = ((C92424hH) r3).A00.BUq().BVB();
            if (BVB instanceof C75583hl) {
                i = ((C75583hl) BVB).A00;
            } else if (BVB instanceof C75593hm) {
                return ((C75593hm) BVB).A00;
            } else {
                throw AnonymousClass3MW.A14();
            }
        } else if (r3 instanceof C92434hI) {
            i = 2131886710;
        } else if (r3 instanceof C92444hJ) {
            i = 2131886701;
        } else {
            throw AnonymousClass3MW.A14();
        }
        String A07 = C19740yt.A07(context, i);
        C18070vi.A0X(A07);
        return A07;
    }
}
