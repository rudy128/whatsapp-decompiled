package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9yw  reason: invalid class name and case insensitive filesystem */
public class C198809yw {
    public final Context A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass11P A03;
    public final C24751Ln A04;
    public final C22565BDa A05;
    public final C22565BDa A06;
    public final C20274AEh A07;
    public final C20280AEo A08;
    public final C18030ve A09;
    public final UserJid A0A;
    public final UserJid A0B;
    public final C33711jG A0C;
    public final C31061ex A0D;
    public final AnonymousClass1QS A0E;
    public final AnonymousClass1QS A0F;
    public final C191529mk A0G;
    public final C191619mt A0H;
    public final A54 A0I;
    public final AnonymousClass1QE A0J = AnonymousClass1QE.A00("PaymentPrecheckAction", "network", "COMMON");
    public final C191949nS A0K;
    public final C33351ig A0L;
    public final C62212r1 A0M;
    public final A5H A0N;
    public final C195929uA A0O;
    public final C198169xt A0P;
    public final C30931ek A0Q;
    public final AnonymousClass10I A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;

    public static void A00(C42621yT r12, C198809yw r13, AMJ amj, C198959zC r15) {
        AnonymousClass11P r1 = r13.A03;
        String A0e = AnonymousClass8BS.A0e(r13.A02, r1);
        long A002 = AnonymousClass11P.A00(r1);
        Object[] objArr = new Object[6];
        objArr[0] = AnonymousClass17K.A04(r13.A0A);
        C22565BDa bDa = r13.A05;
        AnonymousClass000.A1M(objArr, bDa.getValue());
        ARR arr = (ARR) bDa;
        AnonymousClass3Ma.A1S(objArr, arr.A00);
        objArr[3] = AnonymousClass8BU.A0n(arr);
        AnonymousClass3MX.A1S(objArr, 4, A002);
        objArr[5] = A0e;
        byte[] A012 = A4K.A01(objArr);
        A5H a5h = r13.A0N;
        AMH amh = new AMH(r13, amj, r15, A0e, A002);
        A52 A003 = A5H.A00();
        if (A003 != null) {
            a5h.A00.A05(new AnonymousClass8EI(amh, a5h, A012), A003, r12);
            return;
        }
        a5h.A02.A06("sign: cryptoObject is null");
        a5h.A03();
        amj.A00();
    }

    public C198809yw(Context context, AnonymousClass1KB r11, AnonymousClass11S r12, AnonymousClass11P r13, C24751Ln r14, C22565BDa bDa, C22565BDa bDa2, C20274AEh aEh, C20280AEo aEo, C18030ve r19, UserJid userJid, C33711jG r21, C31061ex r22, AnonymousClass1QS r23, C191529mk r24, A54 a54, C191949nS r26, C33351ig r27, C62212r1 r28, A5H a5h, C195929uA r30, C30931ek r31, AnonymousClass10I r32, String str, String str2, String str3, String str4, String str5) {
        this.A03 = r13;
        this.A09 = r19;
        this.A00 = context;
        this.A01 = r11;
        this.A02 = r12;
        this.A0R = r32;
        this.A0G = r24;
        this.A0Q = r31;
        AnonymousClass1QS r1 = r23;
        this.A0E = r1;
        this.A0O = r30;
        C31061ex r6 = r22;
        this.A0D = r6;
        this.A0L = r27;
        C33711jG r5 = r21;
        this.A0C = r5;
        this.A0N = a5h;
        A54 a542 = a54;
        this.A0I = a542;
        this.A04 = r14;
        this.A0P = new C198169xt(r12, r13, r6);
        this.A0H = new C191619mt(context, r11, r5, r6, a542, "PIN");
        this.A0S = str;
        this.A0B = AnonymousClass11S.A00(r12);
        this.A0A = userJid;
        this.A05 = bDa;
        this.A06 = bDa2;
        this.A0V = str4;
        this.A0M = r28;
        this.A0T = str3;
        this.A0U = str2;
        this.A08 = aEo;
        this.A07 = aEh;
        this.A0F = r1;
        this.A0K = r26;
        this.A0W = str5;
    }
}
