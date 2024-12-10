package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.9QX  reason: invalid class name */
public abstract class AnonymousClass9QX {
    public static final C010105w A00(Context context, AnonymousClass1L9 r9, AnonymousClass1KW r10, AnonymousClass129 r11, CharSequence charSequence, String str, String str2, String str3) {
        Context context2 = context;
        boolean A17 = C18070vi.A17(context, r10);
        AnonymousClass3Ma.A1O(r9, 2, r11);
        C18070vi.A0d(charSequence, 5);
        C20146A9i a9i = new C20146A9i(context2, r9, r11, str, str3, 0);
        C73203Rj A00 = AnonymousClass4a6.A00(context2);
        A00.A0S(C43251zV.A05(context2, r10, charSequence));
        A00.A0T(A17);
        A00.A0Y(a9i, 2131899101);
        A00.setNegativeButton(2131899286, (DialogInterface.OnClickListener) null);
        if (str2 != null) {
            A00.setTitle(C43251zV.A05(context2, r10, str2));
        }
        return AnonymousClass3MY.A0L(A00);
    }
}
