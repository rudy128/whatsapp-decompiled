package X;

import com.whatsapp.util.Log;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Alh  reason: case insensitive filesystem */
public class C21534Alh implements C18080vj, C22821Di {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public C21534Alh(C187949gd r1, C187289fZ r2, C198109xn r3, C184579bB r4, byte[] bArr, byte[] bArr2, int i) {
        this.A00 = i;
        this.A01 = bArr;
        this.A02 = r3;
        if (i != 0) {
            this.A03 = r4;
            this.A04 = r1;
            this.A05 = r2;
            this.A06 = bArr2;
            return;
        }
        this.A03 = bArr2;
        this.A04 = r2;
        this.A05 = r4;
        this.A06 = r1;
    }

    public final Object invoke(Object obj) {
        byte b;
        byte b2;
        Object obj2;
        Object obj3 = obj;
        switch (this.A00) {
            case 0:
                byte[] bArr = (byte[]) this.A01;
                Object obj4 = this.A05;
                Object obj5 = this.A06;
                byte[] bArr2 = (byte[]) obj3;
                C108965cb.A1O(bArr, 0, bArr2);
                return new C189439jF(new C21532Alf(obj4, obj5, C200310o.A0A(bArr, bArr2), 0).invoke(((C198109xn) this.A02).A00.A00(AnonymousClass00R.A00, (byte[]) this.A03, ((C187289fZ) this.A04).A00).A00));
            case 1:
                C198109xn r7 = (C198109xn) this.A02;
                byte[] bArr3 = (byte[]) this.A03;
                byte[] bArr4 = (byte[]) this.A04;
                C187289fZ r4 = (C187289fZ) this.A05;
                Object obj6 = this.A06;
                byte[] bArr5 = (byte[]) obj3;
                C72473Md.A1J(obj6, bArr5);
                if (Arrays.equals((byte[]) this.A01, bArr5)) {
                    return new C189439jF(new C21532Alf(r7, obj6, r4, 2).invoke(r7.A00.A01(AnonymousClass00R.A01, bArr3, bArr4, r4.A03).A00));
                }
                throw new AnonymousClass9LX("Data mac corrupt", (Throwable) null);
            case 2:
                byte[] bArr6 = (byte[]) this.A01;
                C198109xn r6 = (C198109xn) this.A02;
                C184579bB r72 = (C184579bB) this.A03;
                C187949gd r42 = (C187949gd) this.A04;
                C187289fZ r5 = (C187289fZ) this.A05;
                byte[] bArr7 = (byte[]) this.A06;
                byte[] bArr8 = (byte[]) obj3;
                AnonymousClass8BX.A1J(bArr6, r72, r42, 0);
                C18070vi.A0d(bArr8, 6);
                byte[] A0A = C200310o.A0A(bArr6, bArr8);
                C183189Xh r3 = r72.A01;
                byte[] bArr9 = new byte[1];
                if (r42.A03.intValue() != 0) {
                    b = 2;
                } else {
                    b = 1;
                }
                bArr9[0] = b;
                return C198109xn.A00(r6, r3, bArr9, r5.A04, A0A).A00(new C21534Alh(r42, r5, r6, r72, A0A, bArr7, 0));
            case 3:
                byte[] bArr10 = (byte[]) this.A01;
                byte[] bArr11 = (byte[]) this.A02;
                C187299fa r10 = (C187299fa) this.A03;
                C198109xn r73 = (C198109xn) this.A04;
                C184579bB r52 = (C184579bB) this.A05;
                Object obj7 = this.A06;
                C187289fZ r11 = (C187289fZ) obj3;
                C18070vi.A0n(bArr10, bArr11, r10);
                C108965cb.A1O(r52, 4, r11);
                byte[] A0A2 = C200310o.A0A(bArr10, bArr11);
                byte[] bArr12 = new byte[1];
                if (1 - r10.A01.intValue() != 0) {
                    b2 = 1;
                } else {
                    b2 = 2;
                }
                bArr12[0] = b2;
                return C198109xn.A00(r73, r52.A01, bArr12, r11.A04, A0A2).A00(new C21534Alh((Object) r73, (Object) bArr10, obj7, (Object) r10, (Object) r11, (Object) bArr11, 1));
            default:
                C144177Gh r43 = (C144177Gh) this.A01;
                C1606789m r8 = (C1606789m) this.A02;
                AnonymousClass705 r9 = (AnonymousClass705) this.A03;
                X509Certificate x509Certificate = (X509Certificate) this.A04;
                PublicKey publicKey = (PublicKey) this.A05;
                Integer num = (Integer) this.A06;
                A6Z a6z = (A6Z) obj3;
                C18070vi.A0d(a6z, 6);
                Log.e("BaseGraphqlFbEntityOperationHelper/onError", new C26941Uc(a6z));
                List<BC4> list = a6z.A01;
                ArrayList A0D = C29351c6.A0D(list);
                for (BC4 BOq : list) {
                    C17890vO.A1D(A0D, BOq.BOq());
                }
                Iterator it = A0D.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (AnonymousClass000.A0M(obj2) != 0) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Number number = (Number) obj2;
                if (number != null) {
                    C21472Akd akd = new C21472Akd(r43, x509Certificate, publicKey, num, r8, r9, 14);
                    C26941Uc r2 = new C26941Uc(a6z);
                    int intValue = number.intValue();
                    C21541Alo alo = new C21541Alo(r8, r9, r43, num, publicKey, x509Certificate);
                    if (intValue == 409) {
                        ((C34991lS) r43.A02.get()).A05(new AnonymousClass7GT(alo, r8, 4), r43.A02(), (AnonymousClass705) null, (String) null);
                    } else if (r9.A04()) {
                        AnonymousClass3MX.A0x(r43.A04).CGN(new C70593Bs(akd, 36));
                    } else {
                        r8.Bsw(r2);
                    }
                } else {
                    r8.Bsw(new C26941Uc(a6z));
                }
                return AnonymousClass000.A0i();
        }
    }

    public C21534Alh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj6;
        this.A05 = obj5;
        this.A06 = obj4;
    }
}
