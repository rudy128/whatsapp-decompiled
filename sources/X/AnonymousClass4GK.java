package X;

import com.whatsapp.util.Log;

/* renamed from: X.4GK  reason: invalid class name */
public abstract class AnonymousClass4GK {
    public static final C94854lI A00(AnonymousClass206 r2, Integer num) {
        AnonymousClass21Z r22;
        C18070vi.A0d(r2, 0);
        Integer num2 = null;
        if (!AnonymousClass25A.A0l(r2)) {
            return null;
        }
        if ((r2 instanceof AnonymousClass21Z) && ((r22 = (AnonymousClass21Z) r2) == null || (num2 = C20120A8f.A02((AnonymousClass206) r22)) == null)) {
            Log.e("FlowsInteractionDetailsBehavior/fromMessageClick: carousel card does not have card index value!");
        }
        return new C94854lI(num2, num);
    }
}
