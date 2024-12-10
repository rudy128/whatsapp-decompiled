package X;

import android.content.Context;

/* renamed from: X.36U  reason: invalid class name */
public final class AnonymousClass36U implements C22520BBd {
    public final AnonymousClass00H A00;
    public final AnonymousClass118 A01;

    public String BS2(AnonymousClass206 r3) {
        C18070vi.A0z(r3, "null cannot be cast to non-null type com.whatsapp.protocol.message.interactive.InteractiveMessage");
        C20083A6j A012 = ((C42341y1) this.A00.get()).A01((AnonymousClass21K) r3);
        if (A012 != null) {
            return A012.A0C();
        }
        return null;
    }

    public String BVQ(AnonymousClass206 r3) {
        C18070vi.A0z(r3, "null cannot be cast to non-null type com.whatsapp.protocol.message.interactive.InteractiveMessage");
        C20083A6j A012 = ((C42341y1) this.A00.get()).A01((AnonymousClass21K) r3);
        if (A012 == null) {
            return null;
        }
        Context context = this.A01.A00;
        C18070vi.A0X(context);
        return A012.A0G(context);
    }

    public AnonymousClass36U(AnonymousClass118 r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
