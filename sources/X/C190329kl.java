package X;

/* renamed from: X.9kl  reason: invalid class name and case insensitive filesystem */
public class C190329kl {
    public final AnonymousClass190 A00;
    public final C18100vl A01;

    public C436420i A00(AnonymousClass205 r8, int i, long j) {
        C22573BDo bDo;
        StringBuilder A10;
        String str;
        C18100vl r3 = this.A01;
        C187969gf r2 = (C187969gf) r3.getValue();
        synchronized (r2) {
            if (i >= 0) {
                if (i <= r2.A00) {
                    C22573BDo[] bDoArr = r2.A05;
                    bDo = bDoArr[i];
                    if (bDo == null) {
                        C18140vp A002 = r2.A01.A00(r2.A04, i);
                        if (A002 == null) {
                            r2.A06[i] = AnonymousClass000.A0h();
                            bDo = (C22573BDo) r2.A03.getValue();
                        } else {
                            r2.A06[i] = AnonymousClass000.A0i();
                            bDo = (C22573BDo) A002.get();
                        }
                        bDoArr[i] = bDo;
                    }
                    C18070vi.A0z(bDo, "null cannot be cast to non-null type IP of com.whatsapp.fmessage.systemmessage.platform.core.SystemMessageSubsystemApi.getIntegrationPoint$lambda$0");
                }
            }
            bDo = (C22573BDo) r2.A03.getValue();
            C18070vi.A0X(bDo);
        }
        try {
            return ((C22576BDr) bDo).BHT(r8, i, j);
        } catch (C180049Kx e) {
            String num = Integer.toString(i);
            C18070vi.A0X(num);
            C187969gf r6 = (C187969gf) r3.getValue();
            synchronized (r6) {
                boolean z = false;
                if (i >= 0) {
                    if (i <= r6.A00) {
                        Boolean[] boolArr = r6.A06;
                        Boolean bool = boolArr[i];
                        if (bool != null) {
                            z = bool.booleanValue();
                        } else {
                            if (r6.A01.A00(r6.A04, i) != null) {
                                z = true;
                            }
                            AnonymousClass8BR.A1L(boolArr, i, z);
                        }
                    }
                }
                AnonymousClass190 r1 = this.A00;
                if (z) {
                    r1.A0E("system-message-factory-action-not-supported", num, e);
                    A10 = AnonymousClass000.A10();
                    A10.append("SystemMessageFactorySubsystem; cannot create ");
                    A10.append(num);
                    str = " (not supported)";
                } else {
                    r1.A0E("system-message-factory-action-not-registered", num, e);
                    A10 = AnonymousClass000.A10();
                    A10.append("SystemMessageFactorySubsystem; cannot crete ");
                    A10.append(num);
                    str = " (not registered)";
                }
                C17960vV.A0F(false, AnonymousClass000.A0y(str, A10));
                return new C436420i(r8, i, j);
            }
        }
    }

    public C190329kl(AnonymousClass190 r2, AnonymousClass00H r3) {
        C18070vi.A0j(r3, r2);
        this.A00 = r2;
        this.A01 = AnonymousClass1DF.A01(new C21997Avz(r3));
    }
}
