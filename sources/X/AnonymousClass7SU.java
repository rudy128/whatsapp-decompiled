package X;

import android.content.DialogInterface;

/* renamed from: X.7SU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7SU implements C22841Dk, C22851Dl {
    public static final AnonymousClass7SU A00 = new AnonymousClass7SU();

    public final C18080vj BS6() {
        return new AnonymousClass1JJ(1, DialogInterface.class, "dismiss", "dismiss()V", 0);
    }

    public final int hashCode() {
        return BS6().hashCode();
    }

    public /* bridge */ /* synthetic */ void Bo9(Object obj) {
        DialogInterface dialogInterface = (DialogInterface) obj;
        C18070vi.A0d(dialogInterface, 0);
        dialogInterface.dismiss();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22851Dl) || !(obj instanceof C22841Dk)) {
            return false;
        }
        return C108975cc.A1L(obj, BS6());
    }
}
