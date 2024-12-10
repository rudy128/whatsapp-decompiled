package X;

/* renamed from: X.4qB  reason: invalid class name and case insensitive filesystem */
public class C97864qB implements AnonymousClass88B {
    public final /* synthetic */ AnonymousClass4aY A00;

    public void C6w(AnonymousClass1BI r12, C1418377d r13, Integer num, int i) {
        AnonymousClass4aY r1 = this.A00;
        AnonymousClass1BI r6 = r12;
        if (r12 == null || !r12.equals(r1.A3R)) {
            AnonymousClass190 r4 = r1.A0v;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("sticker was tried to be sent into an incorrect chat. Current chat is null? = ");
            AnonymousClass1BI r0 = r1.A3R;
            boolean z = false;
            A10.append(AnonymousClass000.A1X(r0));
            A10.append(" Destination chat is null? = ");
            if (r12 == null) {
                z = true;
            }
            r4.A0G("conversation/stickerSelected", AnonymousClass3MY.A0r(A10, z), true);
            return;
        }
        AnonymousClass7Q7 r42 = new AnonymousClass7Q7(this, r6, r13, num, i, 10);
        if (r1.A3c != null) {
            r1.A2Q.CFa();
            ((C86064Qa) AnonymousClass3Ma.A0Y(r1).A0M.get()).A00(r1.A3c.A05, new C98434r8(this, r42, 2));
            return;
        }
        r42.run();
    }

    public C97864qB(AnonymousClass4aY r1) {
        this.A00 = r1;
    }
}
