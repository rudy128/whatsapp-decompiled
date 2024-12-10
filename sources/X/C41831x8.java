package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1x8  reason: invalid class name and case insensitive filesystem */
public final class C41831x8 implements AnonymousClass1WS {
    public boolean A00 = true;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final HashMap A05 = new HashMap();
    public final AnonymousClass00H A06;

    public C41831x8(AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r7, 5);
        this.A06 = r3;
        this.A01 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r7;
    }

    public static final void A00(String str) {
        C18070vi.A0d(str, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("[XFAM] ");
        sb.append(str);
        Log.i(sb.toString());
    }

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public void ByH(AnonymousClass206 r4, int i) {
        AnonymousClass77K A002;
        C18070vi.A0d(r4, 0);
        if (C22971Dz.A0a(r4.A0v.A00) && AnonymousClass74B.A07(r4) && (A002 = C63672tV.A00(r4)) != null && A002.A05) {
            AnonymousClass00H r1 = this.A06;
            if (!((C30141dS) r1.get()).A00()) {
                return;
            }
            if (!(r4 instanceof AnonymousClass210)) {
                ((AnonymousClass73A) this.A03.get()).A03(r4);
            } else if (this.A00) {
                if (C18020vd.A05(C18040vf.A02, ((C30141dS) r1.get()).A01, 4437)) {
                    ((AnonymousClass73A) this.A03.get()).A04((AnonymousClass210) r4);
                }
            }
        }
    }

    public void ByK(AnonymousClass206 r6, int i) {
        AnonymousClass73A r2;
        List list;
        boolean z;
        Integer num;
        C18070vi.A0d(r6, 0);
        if (i == 24 && r6.A0H > 0 && AnonymousClass74B.A07(r6)) {
            AnonymousClass00H r3 = this.A06;
            if (((C30141dS) r3.get()).A00()) {
                StringBuilder sb = new StringBuilder();
                sb.append("XFamilyCrosspostMessageObserver/checking is auto-share crossposting message ");
                sb.append(r6.A0x);
                A00(sb.toString());
                boolean A052 = C18020vd.A05(C18040vf.A02, ((C30141dS) r3.get()).A01, 10743);
                AnonymousClass77K A002 = C63672tV.A00(r6);
                if (A052) {
                    if (A002 != null) {
                        AnonymousClass77K A003 = C63672tV.A00(r6);
                        if (A003 == null) {
                            throw new IllegalStateException("Required value was null.");
                        } else if (!A003.A05) {
                            return;
                        }
                    }
                    if (((C35511mM) this.A01.get()).A06(AnonymousClass00R.A03)) {
                        ((C20456ALt) this.A02.get()).A00();
                        return;
                    }
                    return;
                }
                if (A002 == null) {
                    A00("XFamilyCrosspostMessageObserver/handle auto share message in previous app session");
                    C62422rN r0 = (C62422rN) this.A04.get();
                    long j = r6.A0x;
                    C62422rN.A00(r0);
                    C001100p r1 = r0.A00;
                    synchronized (r1) {
                        num = (Integer) r1.A05(j);
                    }
                    if (num != null && num.intValue() == 0) {
                        r2 = (AnonymousClass73A) this.A03.get();
                        list = Collections.singletonList(r6);
                        C18070vi.A0X(list);
                        z = true;
                    } else {
                        return;
                    }
                } else {
                    AnonymousClass77K A004 = C63672tV.A00(r6);
                    if (A004 != null && A004.A05) {
                        if (this.A00 || this.A05.containsKey(r6.A0v.A01)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("XFamilyCrosspostMessageObserver/handle omitted auto share message. statusFragmentDestroyed: ");
                            sb2.append(this.A00);
                            A00(sb2.toString());
                            if (((C35511mM) this.A01.get()).A06(AnonymousClass00R.A03)) {
                                r2 = (AnonymousClass73A) this.A03.get();
                                list = Collections.singletonList(r6);
                                C18070vi.A0X(list);
                                z = false;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                r2.A05(list, z);
            }
        }
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
}
