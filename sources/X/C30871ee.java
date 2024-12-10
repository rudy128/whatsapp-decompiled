package X;

import com.whatsapp.wamsys.JniBridge;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.1ee  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C30871ee implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass184 A01;
    public final /* synthetic */ AnonymousClass18M A02;

    public final void run() {
        int i;
        AnonymousClass18M r3 = this.A02;
        AnonymousClass184 r6 = this.A01;
        int i2 = this.A00;
        CountDownLatch countDownLatch = AnonymousClass18M.A0E;
        if (C18020vd.A05(C18040vf.A02, r3.A09.A00, 8835) && !(r6 instanceof C31151f6) && ((i = r6.bufferChannel) == 0 || i == 1)) {
            for (AnonymousClass184 CC7 : AnonymousClass187.A00(r6, r6.validate())) {
                r3.CC7(CC7);
            }
        }
        AnonymousClass18M.A00();
        JniBridge jniBridge = (JniBridge) r3.A0A.get();
        int i3 = r6.code;
        int i4 = r6.psId;
        int i5 = r6.bufferChannel;
        int i6 = 0;
        if (i5 != 0) {
            i6 = 1;
            if (i5 != 1) {
                i6 = 2;
                if (i5 != 2) {
                    i6 = 3;
                    if (i5 != 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported channel type: ");
                        sb.append(i5);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        JniBridge.jvidispatchIIIIIOO((long) i3, (long) i2, (long) i4, (long) i6, jniBridge.wajContext.get(), r6.getFieldsMap());
    }

    public /* synthetic */ C30871ee(AnonymousClass184 r1, AnonymousClass18M r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }
}
