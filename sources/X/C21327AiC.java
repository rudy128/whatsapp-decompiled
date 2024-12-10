package X;

import java.io.Closeable;

/* renamed from: X.AiC  reason: case insensitive filesystem */
public class C21327AiC implements Closeable {
    public boolean A00;
    public final C196179ua A01;

    public void close() {
        boolean z;
        C196179ua r0;
        int i;
        AA2 aa2;
        synchronized (this) {
            z = false;
            if (!this.A00) {
                z = true;
                this.A00 = true;
            }
        }
        if (z) {
            C196179ua r5 = this.A01;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("svc-client/onSessionClosed; service=");
            String A0y = AnonymousClass000.A0y("GoogleMigrateClient", A10);
            if (this instanceof AnonymousClass9A0) {
                r0 = ((AnonymousClass9A0) this).A00;
            } else {
                r0 = r5;
            }
            if (r0 == r5) {
                synchronized (r5) {
                    int i2 = r5.A00;
                    if (i2 <= 0) {
                        C17900vP.A0i(", imbalanced ref_cnt=", AnonymousClass000.A11(A0y), i2);
                        AnonymousClass190 r3 = r5.A04;
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("name=");
                        A102.append("GoogleMigrateClient");
                        A102.append(", counter=");
                        r3.A0G("svc-client-reference-counter-imbalance", C17880vN.A0t(A102, r5.A00), false);
                        r5.A00 = 0;
                        i = 0;
                    } else {
                        i = i2 - 1;
                        r5.A00 = i;
                    }
                    aa2 = null;
                    if (i == 0) {
                        AA2 aa22 = r5.A01;
                        r5.A01 = null;
                        aa2 = aa22;
                    }
                }
                if (aa2 != null) {
                    aa2.A01(false);
                    return;
                }
                return;
            }
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("A session from a different client has been provided. Client: ");
            throw AnonymousClass001.A12("GoogleMigrateClient", A103);
        }
    }

    public C21327AiC(C196179ua r1) {
        this.A01 = r1;
    }
}
