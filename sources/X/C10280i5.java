package X;

import android.view.InputDevice;
import android.view.KeyEvent;

/* renamed from: X.0i5  reason: invalid class name and case insensitive filesystem */
public final class C10280i5 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C16350s7 $focusManager;
    public final /* synthetic */ C04940Pp $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10280i5(C04940Pp r2, C16350s7 r3) {
        super(1);
        this.$focusManager = r3;
        this.$state = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C16350s7 r1;
        int i;
        KeyEvent keyEvent = ((AnonymousClass0NA) obj).A00;
        InputDevice device = keyEvent.getDevice();
        boolean z = false;
        if (device != null && device.supportsSource(513) && !device.isVirtual() && C02580Eo.A00(keyEvent) == 2) {
            if (AnonymousClass000.A1T((int) ((((long) keyEvent.getKeyCode()) << 32) >> 32), 19)) {
                r1 = this.$focusManager;
                i = 5;
            } else if (AnonymousClass000.A1T((int) ((((long) keyEvent.getKeyCode()) << 32) >> 32), 20)) {
                r1 = this.$focusManager;
                i = 6;
            } else if (AnonymousClass000.A1T((int) ((((long) keyEvent.getKeyCode()) << 32) >> 32), 21)) {
                r1 = this.$focusManager;
                i = 3;
            } else if (AnonymousClass000.A1T((int) ((((long) keyEvent.getKeyCode()) << 32) >> 32), 22)) {
                r1 = this.$focusManager;
                i = 4;
            } else if (AnonymousClass000.A1T((int) ((((long) keyEvent.getKeyCode()) << 32) >> 32), 23)) {
                C16750sx r0 = this.$state.A0H;
                if (r0 != null) {
                    r0.CMX();
                }
                z = true;
            }
            z = r1.Bk5(i);
        }
        return Boolean.valueOf(z);
    }
}
