package X;

import com.whatsapp.bridge.wfal.WfalManager;

/* renamed from: X.6yP  reason: invalid class name and case insensitive filesystem */
public abstract class C139206yP {
    public final AnonymousClass11P A00;
    public final A0V A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public final void A01(AnonymousClass8A2 r11, AnonymousClass61Q r12, Object obj, int i) {
        C18070vi.A0d(r12, 0);
        AnonymousClass8A2 r5 = r11;
        C129906iZ r4 = new C129906iZ(r5, this, r12, obj, i);
        C34991lS A0f = C108945cZ.A0f(this.A02);
        C35021lW r3 = C35011lV.A00;
        AnonymousClass732 A002 = A0f.A00(r3);
        if (A002 == null) {
            r11.Bsx(AnonymousClass000.A0n("user does not exist"), (Integer) null);
            return;
        }
        C17960vV.A07(A002);
        ((C35041lY) this.A03.get()).A01(r3, new C144227Gm(A002, r11, r4));
    }

    public static final void A00(AnonymousClass732 r7, AnonymousClass705 r8, C29621ca r9, AnonymousClass8A2 r10, C132946nu r11, C139206yP r12, int i) {
        Exception exc;
        AnonymousClass7RO r4 = new AnonymousClass7RO(r8, r11, r7, 49);
        if (i != 190) {
            if (i != 405) {
                if (i != 408) {
                    if (i != 416) {
                        if (i != 429) {
                            if (!(i == 500 || i == 503 || i == 400)) {
                                if (i != 401) {
                                    if (i == 480) {
                                        ((C139996zm) r12.A04.get()).A02(r8, new C144217Gl(r4, r10, 3), new Exception(AnonymousClass001.A1I("code=", AnonymousClass000.A10(), 480)));
                                        return;
                                    } else if (i != 481) {
                                        switch (i) {
                                            case 483:
                                                ((C139996zm) r12.A04.get()).A00();
                                                break;
                                            case 484:
                                                AnonymousClass00H r2 = r12.A05;
                                                ((WfalManager) ((C125656bR) r2.get()).A00.get()).A00.A06(true);
                                                if (r9 != null) {
                                                    try {
                                                        if (r9.A0A("npr", 0) != 1) {
                                                            C108945cZ.A0f(((WfalManager) ((C125656bR) r2.get()).A00.get()).A03).A04(new AnonymousClass7GT(r4, r10, 0), C35011lV.A00, (AnonymousClass705) null, new C53932dK(1, r7));
                                                            return;
                                                        }
                                                    } catch (AnonymousClass1UI e) {
                                                        r10.Bsx(e, Integer.valueOf(i));
                                                        return;
                                                    }
                                                }
                                                break;
                                            case 485:
                                                break;
                                            default:
                                                exc = AnonymousClass000.A0n(AnonymousClass001.A1I("unsupported error: ", AnonymousClass000.A10(), i));
                                                C17960vV.A0B(exc);
                                                break;
                                        }
                                    } else {
                                        r12.A04.get();
                                        C18070vi.A0d(r8, 0);
                                        if (r8.A04()) {
                                            r4.run();
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C139996zm r3 = (C139996zm) r12.A04.get();
                C18070vi.A0d(r8, 0);
                Long A012 = r8.A01();
                if (A012 != null) {
                    r3.A00.CGv(r4, A012.longValue());
                    return;
                }
            }
            exc = new Exception(AnonymousClass001.A1I("code=", AnonymousClass000.A10(), i));
            r10.Bsx(exc, Integer.valueOf(i));
        }
        if (r8.A04()) {
            C34991lS A0f = C108945cZ.A0f(r12.A02);
            AnonymousClass7GW r32 = new AnonymousClass7GW(r8, r10, r11, i);
            ((C125656bR) r12.A05.get()).A00.get();
            A0f.A02(r7, r32, new AnonymousClass705(1, C20113A7w.A0L));
            return;
        }
        exc = new Exception(AnonymousClass001.A1I("code=", AnonymousClass000.A10(), i));
        r10.Bsx(exc, Integer.valueOf(i));
    }

    public C139206yP(AnonymousClass11P r1, A0V a0v, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        this.A00 = r1;
        this.A01 = a0v;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r6;
    }
}
