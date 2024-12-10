package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7FV  reason: invalid class name */
public final class AnonymousClass7FV implements AnonymousClass1WS {
    public final AnonymousClass18K A00;
    public final HashMap A01 = C17880vN.A11();
    public final AnonymousClass11P A02;
    public final C18030ve A03;

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByK(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Bya(Collection collection, Map map) {
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public void ByH(AnonymousClass206 r16, int i) {
        C693236t A002;
        AnonymousClass206 r2 = r16;
        C18070vi.A0d(r2, 0);
        if (i != 29) {
            if (C18020vd.A05(C18040vf.A02, this.A03, 10859)) {
                HashMap hashMap = this.A01;
                Iterator A0i = C17890vO.A0i(hashMap);
                while (A0i.hasNext()) {
                    Object next = A0i.next();
                    C18070vi.A0X(next);
                    Map.Entry entry = (Map.Entry) next;
                    if (System.currentTimeMillis() - ((C128966gy) entry.getValue()).A01 >= 3600000) {
                        this.A00.CC7(((C128966gy) entry.getValue()).A03);
                        A0i.remove();
                    }
                }
                if (r2.A0v.A02) {
                    return;
                }
                if (r2 instanceof AnonymousClass247) {
                    AnonymousClass247 r22 = (AnonymousClass247) r2;
                    int i2 = r22.A00;
                    int i3 = r22.A01;
                    if (i2 + i3 > 0) {
                        hashMap.put(Long.valueOf(r22.A0x), new C128966gy(System.currentTimeMillis(), (long) i2, (long) i3));
                        return;
                    }
                    return;
                }
                int i4 = r2.A0u;
                if ((i4 == 1 || i4 == 3) && r2.A11(67108864) && (A002 = C60512o9.A00(r2)) != null && A002.A01 == AnonymousClass6RT.MEDIA_ALBUM) {
                    Long valueOf = Long.valueOf(A002.A00);
                    C128966gy r11 = (C128966gy) hashMap.get(valueOf);
                    if (r11 != null) {
                        long j = r11.A00 + 1;
                        r11.A00 = j;
                        float f = (float) j;
                        long j2 = r11.A02;
                        float f2 = (float) j2;
                        if (f >= 0.5f * f2) {
                            AnonymousClass63K r14 = r11.A03;
                            if (r14.A00 == null) {
                                r14.A00 = C108945cZ.A1B(System.currentTimeMillis(), r11.A01);
                            }
                        }
                        if (f >= f2 * 0.75f) {
                            AnonymousClass63K r12 = r11.A03;
                            if (r12.A01 == null) {
                                r12.A01 = C108945cZ.A1B(System.currentTimeMillis(), r11.A01);
                            }
                        }
                        if (j >= j2) {
                            AnonymousClass63K r5 = r11.A03;
                            r5.A02 = C108945cZ.A1B(System.currentTimeMillis(), r11.A01);
                            this.A00.CC7(r5);
                            hashMap.remove(valueOf);
                        }
                    }
                }
            }
        }
    }

    public AnonymousClass7FV(AnonymousClass11P r2, C18030ve r3, AnonymousClass18K r4) {
        C18070vi.A0o(r3, r2, r4);
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = r4;
    }
}
