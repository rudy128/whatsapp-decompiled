package X;

/* renamed from: X.4nN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C96144nN implements AnonymousClass87C {
    public final /* synthetic */ AnonymousClass4aY A00;

    public final void BvG(AnonymousClass77J r11, boolean z) {
        AnonymousClass77C r0;
        AnonymousClass4aY r5 = this.A00;
        AnonymousClass77J r7 = r11;
        if (!r5.A2Q.getWaPermissionsHelper().A0D()) {
            r5.A3N = r11;
            AnonymousClass74O.A07(AnonymousClass3MW.A0P(r5), 811);
            return;
        }
        C18030ve r1 = r5.A3F;
        C18070vi.A0d(r1, 0);
        if (!C25291Nq.A04(r1, 9452) || !z) {
            AnonymousClass4aY.A1V(r5, r11);
            return;
        }
        AnonymousClass77C r12 = r11.A01;
        if (r12.A02 > 0) {
            r0 = r12;
        } else {
            r0 = r11.A02;
        }
        int i = r0.A02;
        if (r12.A00 <= 0) {
            r12 = r11.A02;
        }
        C70823Cq r4 = new C70823Cq((Object) r5, i, (Object) r7, r12.A00, 5);
        if (r5.A3c != null) {
            r5.A2Q.CFa();
            ((C86064Qa) AnonymousClass3Ma.A0Y(r5).A0M.get()).A00(r5.A3c.A05, new C98434r8(r5, r4, 1));
            return;
        }
        r4.run();
    }

    public /* synthetic */ C96144nN(AnonymousClass4aY r1) {
        this.A00 = r1;
    }
}
