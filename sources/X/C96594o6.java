package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.4o6  reason: invalid class name and case insensitive filesystem */
public class C96594o6 implements B8C {
    public final int A00;
    public final Object A01;

    public C96594o6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CGC(Jid jid, int i) {
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                ((AnonymousClass49O) obj).A01 = (AnonymousClass1EC) jid;
                return;
            case 1:
                AnonymousClass3VM.A04((AnonymousClass3VM) obj, (AnonymousClass1EC) jid, i);
                return;
            default:
                AnonymousClass49Q r0 = (AnonymousClass49Q) obj;
                r0.A02 = (AnonymousClass1EC) jid;
                r0.A01 = i;
                return;
        }
    }
}
