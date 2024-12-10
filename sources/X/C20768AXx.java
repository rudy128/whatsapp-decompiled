package X;

import android.util.Pair;
import java.security.Key;

/* renamed from: X.AXx  reason: case insensitive filesystem */
public class C20768AXx implements BB7 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C20768AXx(C22461B8t b8t, A4K a4k, C198959zC r3, int i) {
        this.A00 = i;
        this.A01 = a4k;
        this.A03 = r3;
        this.A02 = b8t;
    }

    public void Bss(A7B a7b) {
        ((C22461B8t) this.A02).C3f(a7b);
    }

    public void C7R(String str) {
        String str2 = str;
        if (this.A00 != 0) {
            A4K a4k = (A4K) this.A01;
            C198959zC r12 = (C198959zC) this.A03;
            String A012 = A5H.A01(a4k.A09, 2);
            C198169xt r1 = a4k.A00;
            AnonymousClass90V r6 = new AnonymousClass90V(a4k.A04.A00, a4k.A02, a4k.A05, (C22461B8t) this.A02, a4k, r12, A012, 1);
            byte[] A002 = C198169xt.A00(true, str2, "DELETEBIO", (String) null, (byte[]) null, new Object[0], AnonymousClass11P.A00(r1.A01));
            AnonymousClass1MD[] r3 = new AnonymousClass1MD[1];
            C17880vN.A1Q("action", "delete-payment-bio", r3, 0);
            C198959zC.A00(r12, r1, r6, A002, r3);
            return;
        }
        A4K a4k2 = (A4K) this.A01;
        C198959zC r11 = (C198959zC) this.A03;
        C22461B8t b8t = (C22461B8t) this.A02;
        A5H a5h = a4k2.A09;
        try {
            Pair A0N = C108945cZ.A0N(A5H.A01(a5h, 2), AnonymousClass9PC.A00());
            Object obj = A0N.second;
            if (obj != null) {
                a4k2.A08.A07("[Set Touch ID] success");
                C198169xt r0 = a4k2.A00;
                byte[] encoded = ((Key) obj).getEncoded();
                AnonymousClass90V r5 = new AnonymousClass90V(a4k2.A04.A00, a4k2.A02, a4k2.A05, b8t, a4k2, r11, (String) A0N.first, 0);
                byte[] A003 = C198169xt.A00(true, str2, "SETBIO", (String) null, encoded, new Object[0], AnonymousClass11P.A00(r0.A01));
                AnonymousClass1MD[] r32 = new AnonymousClass1MD[1];
                C17880vN.A1Q("action", "set-payment-bio", r32, 0);
                C198959zC.A00(r11, r0, r5, A003, r32);
                return;
            }
            a4k2.A08.A07("[Set Touch ID] failure");
        } catch (RuntimeException e) {
            A5H.A01(a5h, 0);
            throw e;
        }
    }
}
