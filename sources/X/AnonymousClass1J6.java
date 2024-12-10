package X;

/* renamed from: X.1J6  reason: invalid class name */
public abstract class AnonymousClass1J6 {
    public int A00 = -1;
    public boolean A01;
    public final C22851Dl A02;
    public final /* synthetic */ AnonymousClass1DS A03;

    public AnonymousClass1J6(AnonymousClass1DS r2, C22851Dl r3) {
        this.A03 = r2;
        this.A02 = r3;
    }

    public void A00(boolean z) {
        if (z != this.A01) {
            this.A01 = z;
            AnonymousClass1DS r3 = this.A03;
            int i = -1;
            if (z) {
                i = 1;
            }
            int i2 = r3.A00;
            r3.A00 = i + i2;
            if (!r3.A03) {
                r3.A03 = true;
                while (true) {
                    try {
                        int i3 = r3.A00;
                        if (i2 == i3) {
                            break;
                        }
                        if (i2 == 0) {
                            if (i3 > 0) {
                                r3.A07();
                            }
                        } else if (i2 > 0 && i3 == 0) {
                            r3.A08();
                        }
                        i2 = i3;
                    } finally {
                        r3.A03 = false;
                    }
                }
            }
            if (this.A01) {
                r3.A0B(this);
            }
        }
    }
}
