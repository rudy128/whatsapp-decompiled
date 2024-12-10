package X;

import android.content.DialogInterface;

/* renamed from: X.4sh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C99364sh implements C22841Dk, C22851Dl {
    public static final C99364sh A00 = new C99364sh();

    public final C18080vj BS6() {
        return new AnonymousClass1JJ(1, DialogInterface.class, "dismiss", "dismiss()V", 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22851Dl) || !(obj instanceof C22841Dk)) {
            return false;
        }
        return C18070vi.A18(BS6(), ((C22841Dk) obj).BS6());
    }

    public final int hashCode() {
        return BS6().hashCode();
    }

    public /* bridge */ /* synthetic */ void Bo9(Object obj) {
        DialogInterface dialogInterface = (DialogInterface) obj;
        C18070vi.A0d(dialogInterface, 0);
        dialogInterface.dismiss();
    }
}
