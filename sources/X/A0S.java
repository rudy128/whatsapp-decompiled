package X;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.whatsapp.util.Log;

public class A0S {
    public static final long[] A0L = {3, 2, 15};
    public HandlerThread A00;
    public BBB A01;
    public C161258Cl A02;
    public String A03;
    public String A04;
    public final AnonymousClass1KB A05;
    public final AnonymousClass118 A06;
    public final AnonymousClass1KI A07;
    public final C18030ve A08;
    public final AnonymousClass1OZ A09;
    public final AXS A0A;
    public final C33711jG A0B;
    public final C196259ui A0C;
    public final AnonymousClass1QS A0D;
    public final AZ6 A0E;
    public final A0B A0F;
    public final AnonymousClass90Z A0G;
    public final C19997A2l A0H;
    public final C30931ek A0I;
    public final AnonymousClass10I A0J;
    public final A7U A0K;

    public A0S(AnonymousClass1KB r11, AnonymousClass118 r12, AnonymousClass1KI r13, C18030ve r14, AnonymousClass1OZ r15, AnonymousClass8pS r16, A7U a7u, AXS axs, C33711jG r19, AnonymousClass1QS r20, BBB bbb, AZ6 az6, A0B a0b, AnonymousClass90Z r24, C19997A2l a2l, C30931ek r26, AnonymousClass10I r27, AnonymousClass00H r28) {
        String A0F2;
        String str;
        this.A08 = r14;
        this.A05 = r11;
        this.A06 = r12;
        this.A0J = r27;
        this.A09 = r15;
        C30931ek r7 = r26;
        this.A0I = r7;
        this.A0D = r20;
        this.A0F = a0b;
        A7U a7u2 = a7u;
        this.A0K = a7u2;
        this.A07 = r13;
        this.A0B = r19;
        AXS axs2 = axs;
        this.A0A = axs2;
        this.A0H = a2l;
        this.A0E = az6;
        this.A0G = r24;
        this.A0C = a7u2.A04;
        this.A01 = bbb;
        AnonymousClass8pS r3 = r16;
        this.A03 = a7u2.A05(r3);
        AnonymousClass8pH A012 = A7U.A01(r3, a7u2);
        if (A012 != null) {
            Bundle bundle = A012.A00;
            if (bundle != null) {
                str = bundle.getString("transactionPrefix");
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle2 = A012.A00;
                if (bundle2 != null) {
                    A0F2 = bundle2.getString("transactionPrefix");
                } else {
                    A0F2 = null;
                }
                this.A04 = A0F2;
                HandlerThread handlerThread = new HandlerThread("PAY: device binding iq sender");
                this.A00 = handlerThread;
                handlerThread.start();
                this.A02 = new C161258Cl(this.A00.getLooper(), r3, a7u2, axs2, this, r7, r28, this.A03);
            }
        }
        A0F2 = a7u2.A08.A0F();
        this.A04 = A0F2;
        HandlerThread handlerThread2 = new HandlerThread("PAY: device binding iq sender");
        this.A00 = handlerThread2;
        handlerThread2.start();
        this.A02 = new C161258Cl(this.A00.getLooper(), r3, a7u2, axs2, this, r7, r28, this.A03);
    }

    public void A00(AnonymousClass8pS r22, String str, String str2) {
        String A052;
        Log.i("PAY: sendGetBankAccounts called");
        C196259ui r7 = this.A0C;
        r7.A02("upi-get-accounts");
        AnonymousClass1OZ r0 = this.A09;
        String A0B2 = r0.A0B();
        AXS axs = this.A0A;
        AnonymousClass8pS r3 = r22;
        if (!TextUtils.isEmpty(axs.A0G())) {
            A052 = axs.A0G();
        } else {
            A052 = this.A0K.A05(r3);
        }
        AnonymousClass9F5 r12 = new AnonymousClass9F5(A0B2, this.A0I.A01(), A052, r3.A09, str, str2, Long.parseLong(r3.A0B));
        boolean A053 = C18020vd.A05(C18040vf.A02, this.A08, 2227);
        String str3 = "in_upi_get_accounts_tag";
        if (A053) {
            this.A0G.A01(185478423, str3);
        }
        AZ6 az6 = this.A0E;
        AnonymousClass90Z r10 = null;
        az6.A0A((A7B) null, 18, 0);
        C29621ca BVP = r12.BVP();
        Context context = this.A06.A00;
        AnonymousClass1KB r5 = this.A05;
        C33711jG r6 = this.A0B;
        if (A053) {
            r10 = this.A0G;
        } else {
            str3 = null;
        }
        r0.A0I(new C175958zY(context, r5, r6, r7, this, az6, r10, str3, 6), BVP, A0B2, 204, 0);
    }
}
