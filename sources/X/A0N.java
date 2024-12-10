package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class A0N {
    public final AnonymousClass1KI A00;
    public final AnonymousClass1QS A01;
    public final C22446B8e A02;
    public final Context A03;
    public final AnonymousClass1KB A04;
    public final AnonymousClass11S A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass1OZ A07;
    public final C20074A6a A08;
    public final C33711jG A09;
    public final C31061ex A0A;
    public final C191389mW A0B;

    public static void A00(AnonymousClass8pK r22, A0N a0n) {
        Log.i("PAY: BrazilDeviceBindingAction starts to bind device");
        A0N a0n2 = a0n;
        AnonymousClass11P r3 = a0n2.A06;
        AnonymousClass11S r2 = a0n2.A05;
        String A0e = AnonymousClass8BS.A0e(r2, r3);
        AnonymousClass8pK r4 = r22;
        String A002 = a0n2.A0B.A00(r4.A01);
        String A0e2 = AnonymousClass8BS.A0e(r2, r3);
        C20074A6a a6a = a0n2.A08;
        String A052 = a6a.A05(A002);
        C170278pb r0 = r4.A08;
        C17960vV.A07(r0);
        String A082 = a6a.A08(A002, A0e, ((AnonymousClass8pT) r0).A05);
        AnonymousClass1OZ r23 = a0n2.A07;
        String A0B2 = r23.A0B();
        String str = r4.A0A;
        C18070vi.A0p(str, A052, A082);
        C18070vi.A0d(A002, 6);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A13(A0Y);
        boolean A1X = AnonymousClass8BY.A1X(A0Y, A0B2);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "br-bind-network-token");
        AnonymousClass8BY.A1B(A0R, str, A1X);
        if (C29601cY.A04(A052, 1, 10000, A1X)) {
            C29591cX.A01(A0R, "device-csr", A052);
        }
        boolean z = A1X;
        if (C29601cY.A04(A082, 1, 10000, z)) {
            C29591cX.A01(A0R, "jws-token", A082);
        }
        if (C29601cY.A04(A0e, 1, 10000, z)) {
            C29591cX.A01(A0R, "client-reference-id", A0e);
        }
        AnonymousClass8BY.A1C(A0R, A002, A1X);
        if (AnonymousClass8BV.A1Y(A0e2, 1, A1X)) {
            C29591cX.A01(A0R, "nonce", A0e2);
        }
        AnonymousClass8BW.A1B(r23, new C175408yf(a0n2.A03, a0n2.A09, a0n2.A04, a0n2, 1), C29591cX.A00(A0R, A0Y), A0B2);
    }

    public void A01(AnonymousClass8pK r8) {
        if (r8 == null) {
            this.A02.BrN((AnonymousClass8pK) null, A7B.A00(), (ArrayList) null, false);
            return;
        }
        C170278pb r0 = r8.A08;
        C17960vV.A07(r0);
        if (TextUtils.isEmpty(((AnonymousClass8pT) r0).A05)) {
            new C191539ml(this.A03, this.A04, this.A09, this.A0A, new AYU(r8, this, 0)).A00(r8.A0A);
            return;
        }
        A00(r8, this);
    }

    public A0N(Context context, AnonymousClass1KB r2, AnonymousClass11S r3, AnonymousClass11P r4, AnonymousClass1KI r5, AnonymousClass1OZ r6, C20074A6a a6a, C33711jG r8, C31061ex r9, AnonymousClass1QS r10, C22446B8e b8e, C191389mW r12) {
        this.A06 = r4;
        this.A03 = context;
        this.A04 = r2;
        this.A05 = r3;
        this.A07 = r6;
        this.A01 = r10;
        this.A0A = r9;
        this.A0B = r12;
        this.A00 = r5;
        this.A08 = a6a;
        this.A09 = r8;
        this.A02 = b8e;
    }
}
