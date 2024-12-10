package X;

/* renamed from: X.Bei  reason: case insensitive filesystem */
public abstract class C23294Bei extends C26920DJb {
    public C23293Beh A00;
    public boolean A01 = false;
    public final C23293Beh A02;

    public final /* synthetic */ C23293Beh CTO() {
        return this.A02;
    }

    public /* synthetic */ C23293Beh A00() {
        if (!this.A01) {
            C23293Beh beh = this.A00;
            BE9.A0R(beh).CTR(beh);
            this.A01 = true;
        }
        return this.A00;
    }

    public void A01() {
        if (this.A01) {
            C23293Beh beh = (C23293Beh) this.A00.A04(4);
            BE9.A0R(beh).CTS(beh, this.A00);
            this.A00 = beh;
            this.A01 = false;
        }
    }

    public /* synthetic */ Object clone() {
        C23294Bei bei = (C23294Bei) this.A02.A04(5);
        C23293Beh A002 = A00();
        bei.A01();
        C23293Beh beh = bei.A00;
        BE9.A0R(beh).CTS(beh, A002);
        return bei;
    }

    public C23294Bei(C23293Beh beh) {
        this.A02 = beh;
        this.A00 = (C23293Beh) beh.A04(4);
    }
}
