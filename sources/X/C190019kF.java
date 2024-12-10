package X;

import android.os.PowerManager;

/* renamed from: X.9kF  reason: invalid class name and case insensitive filesystem */
public class C190019kF {
    public final AnonymousClass11C A00;
    public volatile Boolean A01;

    public boolean A00() {
        boolean isPowerSaveMode;
        if (this.A01 == null) {
            PowerManager A0G = this.A00.A0G();
            if (A0G == null) {
                isPowerSaveMode = true;
            } else {
                isPowerSaveMode = A0G.isPowerSaveMode();
            }
            this.A01 = Boolean.valueOf(isPowerSaveMode);
        }
        return this.A01.booleanValue();
    }

    public C190019kF(AnonymousClass11C r1) {
        this.A00 = r1;
    }
}
