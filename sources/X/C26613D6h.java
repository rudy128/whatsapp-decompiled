package X;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* renamed from: X.D6h  reason: case insensitive filesystem */
public final class C26613D6h implements E0H {
    public static final BLF A0D = new BLE(0);
    public static final BLF A0E = new BLE(3);
    public static final BLF A0F = new BLE(4);
    public static final BLF A0G = new BLE(5);
    public static final BLF A0H = new BLE(1);
    public static final BLF A0I = new BLE(2);
    public float A00 = Float.MAX_VALUE;
    public float A01 = 0.0f;
    public float A02;
    public float A03;
    public long A04 = 0;
    public C25990Cq5 A05;
    public boolean A06 = false;
    public boolean A07;
    public boolean A08 = false;
    public final C24422C2w A09;
    public final Object A0A;
    public final ArrayList A0B = AnonymousClass000.A13();
    public final ArrayList A0C = AnonymousClass000.A13();

    public C26613D6h(C24422C2w c2w, Object obj) {
        this.A0A = obj;
        this.A09 = c2w;
        this.A02 = 1.0f;
        this.A05 = null;
        this.A03 = Float.MAX_VALUE;
        this.A07 = false;
    }

    public void A00() {
        if (this.A05.A01 <= 0.0d) {
            throw BE6.A0v("Spring animations can only come to an end when there is damping");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (this.A06) {
            this.A07 = true;
        }
    }

    public void A01(float f) {
        Bia bia = (Bia) this.A0A;
        C24422C2w c2w = Bia.A05;
        bia.A00 = f / 10000.0f;
        bia.invalidateSelf();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0C;
            if (i >= arrayList.size()) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        return;
                    }
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
            } else if (arrayList.get(i) != null) {
                arrayList.get(i);
                throw AnonymousClass000.A0s("onAnimationUpdate");
            } else {
                i++;
            }
        }
    }
}
