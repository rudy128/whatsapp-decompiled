package X;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: X.9rF  reason: invalid class name and case insensitive filesystem */
public abstract class C194149rF {
    public int A00;
    public boolean A01;
    public final ComponentName A02;

    public void A02(Intent intent) {
        AnonymousClass8E6 r3 = (AnonymousClass8E6) this;
        Intent intent2 = new Intent(intent);
        intent2.setComponent(r3.A02);
        if (r3.A02.startService(intent2) != null) {
            synchronized (r3) {
                if (!r3.A00) {
                    r3.A00 = true;
                    if (!r3.A01) {
                        r3.A03.acquire(60000);
                    }
                }
            }
        }
    }

    public void A00() {
        if (this instanceof AnonymousClass8E6) {
            AnonymousClass8E6 r3 = (AnonymousClass8E6) this;
            synchronized (r3) {
                if (r3.A01) {
                    if (r3.A00) {
                        r3.A03.acquire(60000);
                    }
                    r3.A01 = false;
                    r3.A04.release();
                }
            }
        }
    }

    public void A01(int i) {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = i;
            return;
        }
        int i2 = this.A00;
        if (i2 != i) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Given job ID ");
            A10.append(i);
            throw AnonymousClass001.A13(" is different than previous ", A10, i2);
        }
    }

    public C194149rF(ComponentName componentName) {
        this.A02 = componentName;
    }
}
