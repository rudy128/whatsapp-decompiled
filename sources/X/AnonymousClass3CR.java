package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.3CR  reason: invalid class name */
public class AnonymousClass3CR implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;
    public final boolean A07;

    public AnonymousClass3CR(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A05 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A07 = z;
        this.A06 = z2;
        this.A01 = obj4;
        this.A04 = obj5;
    }

    public final void run() {
        if (this.A00 != 0) {
            C32861hs r8 = (C32861hs) this.A01;
            AnonymousClass21V r2 = (AnonymousClass21V) this.A02;
            Jid jid = (Jid) this.A03;
            AnonymousClass1BI r5 = (AnonymousClass1BI) this.A04;
            boolean z = this.A06;
            UserJid userJid = (UserJid) this.A05;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("SendMediaMessageManager/enqueueMediaResendUpload enqueuing message: ");
            C17900vP.A0b(r2.A0v, A10);
            C63642tS r7 = new C63642tS(Collections.singletonList(r2), 1);
            C62022qf r3 = new C62022qf(false, r7.A05(), r7.A04());
            C63722ta A012 = C63722ta.A01(r8.A02, r8.A06, (C136906ub) r8.A0O.get(), r8.A0H, r3, r7, false);
            AnonymousClass1T6 r10 = r8.A09;
            AnonymousClass34B A0D = r10.A0D(A012, false);
            A0D.A01 = AnonymousClass1SR.A00(r7);
            A0D.A0O.A0A(3);
            C56202h4 r14 = A0D.A0N;
            C18030ve r13 = r8.A07;
            C18040vf r12 = C18040vf.A02;
            if (C18020vd.A05(r12, r13, 475)) {
                C32811hn r32 = r8.A0C;
                if (System.currentTimeMillis() - r14.A05 < 1800000 || !r32.A00(r14)) {
                    return;
                }
            }
            if (r2.A01 <= ((long) C18020vd.A00(r12, r13, 1098)) * 1048576) {
                r7.A02();
                C32861hs.A01(r8, A0D, r7);
                A0D.A0Z = "mms";
                A0D.A07(new AnonymousClass3AY(r8, A0D, r7, false, false), r8.A0T);
                AnonymousClass1BI r132 = r5;
                Jid jid2 = jid;
                r10.A0I(A0D, new AnonymousClass2KK(r132, jid2, userJid, A0D, A0D.A01(), z));
                return;
            }
            return;
        }
        try {
            DDv dDv = (DDv) this.A05;
            if (dDv.A0b) {
                DDv.A05(dDv.A0Z);
                dDv.A0Z = null;
                dDv.A0Y = DDv.A01(dDv, (EA3) this.A02, (C25841Cmv) this.A03, (Integer) this.A01, true, this.A07, this.A06);
                dDv.A0a = DDv.A04(dDv, dDv.A0a);
            }
        } finally {
            ((CountDownLatch) this.A04).countDown();
        }
    }
}
