package X;

import android.view.ViewConfiguration;

/* renamed from: X.0La  reason: invalid class name and case insensitive filesystem */
public abstract class C03890La {
    public static final float A00 = ViewConfiguration.getScrollFriction();

    public static final C15640qx A00(C17130tn r3) {
        r3.COB(904445851);
        C28644ECa eCa = (C28644ECa) r3.BFh(AnonymousClass0OD.A01);
        boolean A1X = AnonymousClass001.A1X(r3, Float.valueOf(eCa.BQU()));
        Object CER = r3.CER();
        if (A1X || CER == AnonymousClass0MH.A00) {
            CER = new AnonymousClass0Tv(new AnonymousClass0U3(eCa));
            AnonymousClass0VR.A0V(r3, CER);
        }
        AnonymousClass0VR r32 = (AnonymousClass0VR) r3;
        AnonymousClass0VR.A0R(r32, false);
        C15640qx r1 = (C15640qx) CER;
        AnonymousClass0VR.A0R(r32, false);
        return r1;
    }
}
