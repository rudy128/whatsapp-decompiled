package X;

/* renamed from: X.ASi  reason: case insensitive filesystem */
public class C20624ASi implements B83, B85, C436820m {
    public final C198969zD A00;

    public void BDb(C19998A2m a2m, AnonymousClass206 r8) {
        if (this instanceof C173508vC) {
            C173508vC r5 = (C173508vC) this;
            C18070vi.A0h(r8, a2m);
            AnonymousClass8BY.A1G(r8, "Message type is not supported ", AnonymousClass000.A10(), r8 instanceof C439221l);
            C439221l r82 = (C439221l) r8;
            C20285AEt aEt = r82.A00;
            if (aEt != null) {
                C20083A6j.A02(a2m, r82, aEt, r5.A01);
                AnonymousClass8X8 r4 = a2m.A00;
                C163878Wr A002 = AnonymousClass8X8.A00(r4);
                AnonymousClass8X3 r2 = (AnonymousClass8X3) AnonymousClass8BW.A0M(A002).A0O();
                C166028cE r0 = ((C166418cr) r4.A00).locationMessage_;
                if (r0 == null) {
                    r0 = C166028cE.DEFAULT_INSTANCE;
                }
                AnonymousClass8TF r1 = (AnonymousClass8TF) r0.A0O();
                r5.A00.A01(a2m, r1, r82);
                AnonymousClass8X3.A00(r1, r2).mediaCase_ = 8;
                AnonymousClass8X8.A07(r2, r4, A002);
            }
        } else if (r8 instanceof AnonymousClass21B) {
            AnonymousClass21B r83 = (AnonymousClass21B) r8;
            AnonymousClass8X8 r42 = a2m.A00;
            C166028cE r02 = ((C166418cr) r42.A00).locationMessage_;
            if (r02 == null) {
                r02 = C166028cE.DEFAULT_INSTANCE;
            }
            AnonymousClass8TF r3 = (AnonymousClass8TF) r02.A0O();
            this.A00.A01(a2m, r3, r83);
            if (C20097A7a.A05(r83)) {
                C165858bs r03 = ((C166418cr) r42.A00).buttonsMessage_;
                if (r03 == null) {
                    r03 = C165858bs.DEFAULT_INSTANCE;
                }
                C163728Wc r22 = (C163728Wc) r03.A0O();
                C20097A7a.A00(r3, r22, r83).headerCase_ = 5;
                r22.A0G(AnonymousClass9KT.LOCATION);
                r42.A0I((C165858bs) r22.A0C());
                return;
            }
            C166418cr A0M = AnonymousClass8BS.A0M(r42);
            C166028cE r04 = (C166028cE) r3.A0C();
            r04.getClass();
            A0M.locationMessage_ = r04;
            A0M.bitField0_ |= 16;
        } else {
            throw AnonymousClass000.A0k("FMessageStaticLocationSerializer/not supported message");
        }
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr r1 = a6d.A08;
        if ((r1.bitField0_ & 16) == 0) {
            return null;
        }
        C166028cE r4 = r1.locationMessage_;
        if (r4 == null) {
            r4 = C166028cE.DEFAULT_INSTANCE;
        }
        C17960vV.A07(r4);
        AnonymousClass21B r12 = new AnonymousClass21B(a6d.A0A, a6d.A03);
        C198969zD.A00(r4, r12, a6d.A0L);
        return r12;
    }

    public C20624ASi(C198969zD r1) {
        this.A00 = r1;
    }
}
