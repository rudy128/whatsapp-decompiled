package X;

import com.whatsapp.infra.graphql.generated.nativecontacts.IplsClientHandshakeInitRequestResponseImpl;
import com.whatsapp.util.Log;
import javax.crypto.SecretKey;

/* renamed from: X.1jO  reason: invalid class name and case insensitive filesystem */
public final class C33791jO implements C33771jM, C33781jN {
    public static final C33801jP A0C;
    public static final byte[] A0D;
    public C179329Hn A00;
    public AnonymousClass8XI A01;
    public AnonymousClass8XJ A02;
    public String A03;
    public SecretKey A04;
    public C26981Ug A05;
    public final AnonymousClass1UW A06;
    public final C33751jK A07;
    public final C33741jJ A08;
    public final AnonymousClass1P3 A09;
    public final C33761jL A0A;
    public final C33731jI A0B;

    public C33791jO(AnonymousClass1UW r2, C33751jK r3, C33761jL r4, C33741jJ r5, C33731jI r6, AnonymousClass1P3 r7) {
        C18070vi.A0d(r6, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r7, 4);
        C18070vi.A0d(r2, 5);
        C18070vi.A0d(r4, 6);
        this.A0B = r6;
        this.A08 = r5;
        this.A07 = r3;
        this.A09 = r7;
        this.A06 = r2;
        this.A0A = r4;
    }

    public static final void A00(C33791jO r1) {
        r1.A01 = null;
        r1.A06.A02();
    }

    public final C26981Ug A02(C179329Hn r7, AnonymousClass8XJ r8, String str) {
        String str2;
        C18070vi.A0d(str, 0);
        this.A03 = str;
        this.A00 = r7;
        this.A05 = new C26981Ug();
        C33731jI r5 = this.A0B;
        A7K a7k = new A7K();
        a7k.A07("session_id", str);
        StringBuilder sb = new StringBuilder();
        sb.append("MexClientIplsHandshakeInitRequestApi/clientIplsHandshakeInit/requestType: ");
        sb.append(r7);
        Log.i(sb.toString());
        if (r7.ordinal() != 0) {
            str2 = "PUT";
        } else {
            str2 = "GET";
        }
        a7k.A07("request_type", str2);
        r5.A00.A01(new AIj(a7k, IplsClientHandshakeInitRequestResponseImpl.class, "IplsClientHandshakeInitRequest")).A04(new C22256B0k(r7, this));
        if (r7.equals(C179329Hn.PUT)) {
            this.A02 = r8;
        }
        C26981Ug r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("futureCallback");
        throw null;
    }

    static {
        byte[] bArr = {125, 103, 39, 100, 111, -93, -26, 52, 17, -14, -17, 87, 52, -67, -41, -1, 101, -9, -123, -24, -76, -80, 19, -73, -90, -10, 22, -100, -79, -112, -26, 82};
        A0D = bArr;
        A0C = new C33801jP(bArr);
    }

    public static final void A01(C33791jO r0, AnonymousClass9MD r1) {
        C26981Ug r02 = r0.A05;
        if (r02 == null) {
            C18070vi.A11("futureCallback");
            throw null;
        } else {
            r02.BrF(r1);
        }
    }
}
