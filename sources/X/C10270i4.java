package X;

import android.view.KeyEvent;

/* renamed from: X.0i4  reason: invalid class name and case insensitive filesystem */
public final class C10270i4 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C05120Qm $manager;
    public final /* synthetic */ C04940Pp $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10270i4(C04940Pp r2, C05120Qm r3) {
        super(1);
        this.$state = r2;
        this.$manager = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        KeyEvent keyEvent = ((AnonymousClass0NA) obj).A00;
        if (this.$state.A07.getValue() == AnonymousClass0CN.Selection && keyEvent.getKeyCode() == 4) {
            int A00 = C02580Eo.A00(keyEvent);
            z = true;
            if (A00 == 1) {
                this.$manager.A0L((AnonymousClass0QY) null);
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
