package X;

import java.util.Arrays;

public abstract class CAF {
    public static final void A00(String str, String str2, Object... objArr) {
        C18070vi.A0d(str2, 2);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C18070vi.A0d(copyOf, 4);
        C25536ChZ chZ = C25536ChZ.A02;
        Object[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        C18070vi.A0d(copyOf2, 6);
        if (!chZ.A01 && "DEVICE_ID".length() != 0 && "player".length() != 0) {
            chZ.A00.offer(new C25086CWw(str, str2, copyOf2));
        }
    }
}
