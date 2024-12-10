package X;

import android.graphics.Bitmap;

/* renamed from: X.5jo  reason: invalid class name and case insensitive filesystem */
public final class C111495jo extends C40411uf {
    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        Bitmap bitmap;
        C115485u5 r4 = (C115485u5) obj;
        C115485u5 r5 = (C115485u5) obj2;
        C18070vi.A0h(r4, r5);
        C115495u6 r0 = r4.A00;
        Bitmap bitmap2 = null;
        if (r0 != null) {
            bitmap = r0.A00;
        } else {
            bitmap = null;
        }
        C115495u6 r02 = r5.A00;
        if (r02 != null) {
            bitmap2 = r02.A00;
        }
        return C18070vi.A18(bitmap, bitmap2);
    }

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        C18070vi.A0h(obj, obj2);
        return obj.equals(obj2);
    }
}
