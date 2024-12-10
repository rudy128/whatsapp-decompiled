package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Acq  reason: case insensitive filesystem */
public final class C20998Acq implements AnonymousClass1O5, C33061iC {
    public final C191799nC A00;
    public final C33051iB A01;
    public final C192659ol A02;
    public final C18030ve A03;
    public final C21294Ahf A04 = new C21294Ahf(this);
    public final String A05;

    public void Bt9(C29621ca r3, String str) {
        C18070vi.A0d(r3, 1);
        AnonymousClass9SF.A00(r3, this.A00.A02.A03, this.A04);
    }

    public void C7Z(C29621ca r3, String str) {
        C18070vi.A0d(r3, 1);
        AnonymousClass9SF.A00(r3, this.A00.A02.A03, this.A04);
    }

    public static final void A00(C20998Acq acq, AnonymousClass1O9 r8) {
        Throwable th;
        Object obj;
        if (!(r8 instanceof C172848u7) || !r8.A02()) {
            th = r8;
        } else {
            C18070vi.A0z(r8, "null cannot be cast to non-null type kotlin.Throwable");
            th = new AnonymousClass1UI(AnonymousClass001.A1H("CorruptStreamException from MEX: ", AnonymousClass1b2.A05(" caused by: ", (C22821Di) null, AnonymousClass1b2.A0C(B35.A00, AnonymousClass1JO.A03(r8, B34.A00))), AnonymousClass000.A10()), (Throwable) r8);
        }
        if (!(r8 instanceof C172818u4)) {
            try {
                acq.A01.Btr(r8);
                obj = C27621Wu.A00;
            } catch (Throwable th2) {
                obj = C108945cZ.A1J(th2);
            }
            Throwable A002 = C30671eK.A00(obj);
            if (A002 != null) {
                if (A002 instanceof AnonymousClass1O9) {
                    th = A002;
                } else {
                    th = new C172958uI("Unknown product failure while processing onFailure", A002);
                }
            }
        }
        if (!(acq.A01 instanceof C172758ty)) {
            String str = acq.A00.A02.A05;
            String A0x = C108955ca.A0x(th);
            C18070vi.A0b(A0x);
            boolean A012 = acq.A01(12444, str, A0x);
            boolean A013 = acq.A01(12542, str, A0x);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MexIqHandler/shouldThrowFailure: ");
            A10.append(str);
            A10.append(", ");
            A10.append(A0x);
            A10.append(", ");
            A10.append(A012);
            Log.e(C17900vP.A0D(", ", A10, A013));
            if (!A013 || A012) {
                throw new C172828u5(th);
            }
            throw th;
        }
    }

    private final boolean A01(int i, String str, String str2) {
        List A0S = AnonymousClass1YF.A0S(C108955ca.A0v(this.A03, i), new String[]{","}, 0);
        ArrayList A0E = C29351c6.A0E(A0S);
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            A0E.add(AnonymousClass1YF.A0I(C17880vN.A0v(it)));
        }
        if (!(A0E instanceof Collection) || !A0E.isEmpty()) {
            Iterator it2 = A0E.iterator();
            while (it2.hasNext()) {
                String A0v = C17880vN.A0v(it2);
                if ("ALL_VALUES".equalsIgnoreCase(A0v) || AnonymousClass1YE.A09(A0v, str, true) || AnonymousClass1YE.A09(A0v, str2, true)) {
                    return true;
                }
                List A0S2 = AnonymousClass1YF.A0S(A0v, new String[]{":"}, 0);
                if (A0S2.size() == 2) {
                    ArrayList A0E2 = C29351c6.A0E(A0S2);
                    Iterator it3 = A0S2.iterator();
                    while (it3.hasNext()) {
                        A0E2.add(AnonymousClass1YF.A0I(C17880vN.A0v(it3)));
                    }
                    if (AnonymousClass1YE.A09(C17880vN.A0w(A0E2, 0), str, true) && AnonymousClass1YE.A09(C17880vN.A0w(A0E2, 1), str2, true)) {
                        return true;
                    }
                    if (AnonymousClass1YE.A09(C17880vN.A0w(A0E2, 1), str, true) && AnonymousClass1YE.A09(C17880vN.A0w(A0E2, 0), str2, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void BrD(String str) {
        this.A01.Btr(new C172858u8(this.A00));
    }

    public C20998Acq(C18030ve r2, C191799nC r3, C33051iB r4, C192659ol r5) {
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r2;
        this.A05 = r3.A02.A05;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }

    public String getName() {
        return this.A05;
    }
}
