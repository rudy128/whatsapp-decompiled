package X;

import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.HoverableElement;

/* renamed from: X.0Ky  reason: invalid class name and case insensitive filesystem */
public abstract class C03870Ky {
    public static /* synthetic */ C17090tj A01(C16040rc r7, C17210uI r8, C17090tj r9, AnonymousClass0JM r10, C18090vk r11, int i, boolean z) {
        AnonymousClass0JM r3 = r10;
        boolean z2 = z;
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 16) != 0) {
            r3 = null;
        }
        return A00(r7, r8, r9, r3, (String) null, r11, z2);
    }

    public static final C17090tj A00(C16040rc r8, C17210uI r9, C17090tj r10, AnonymousClass0JM r11, String str, C18090vk r13, boolean z) {
        C22821Di A01 = AnonymousClass0O1.A01();
        C17090tj r1 = C17090tj.A00;
        C17210uI r4 = r9;
        C17090tj A00 = C03900Lb.A00(r8, r9, r1);
        boolean z2 = z;
        if (z) {
            r1 = new HoverableElement(r4);
        }
        return AnonymousClass0O1.A00(r10, AnonymousClass0MF.A00(r4, A00.CP5(r1), z).CP5(new ClickableElement(r4, r11, str, r13, (AnonymousClass1Y1) null, z2)), A01);
    }
}
