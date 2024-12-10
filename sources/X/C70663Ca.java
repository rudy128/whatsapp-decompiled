package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Ca  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70663Ca implements Runnable {
    public final /* synthetic */ C33251iW A00;
    public final /* synthetic */ AnonymousClass85B A01;
    public final /* synthetic */ AnonymousClass21V A02;
    public final /* synthetic */ C52642bF A03;
    public final /* synthetic */ C63642tS A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ byte[] A0A;

    public final void run() {
        UserJid userJid;
        AnonymousClass34B r12;
        Object obj;
        C33251iW r6 = this.A00;
        byte[] bArr = this.A0A;
        C63642tS r8 = this.A04;
        AnonymousClass85B r1 = this.A01;
        AnonymousClass21V r11 = this.A02;
        boolean z = this.A07;
        boolean z2 = this.A08;
        boolean z3 = this.A09;
        Integer num = this.A05;
        Map map = this.A06;
        C52642bF r3 = this.A03;
        AnonymousClass21V A012 = r8.A01();
        C693336u A0O = A012.A0O();
        if (bArr == null && A0O != null && A012.A16()) {
            bArr = A0O.A01();
        }
        List A0t = C29431cG.A0t(r8.A03);
        Iterator it = A0t.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if (map != null) {
                obj = map.get(A0Y.A0v.A00);
            } else {
                obj = null;
            }
            if (A0Y.A0w()) {
                C62342rF r15 = (C62342rF) r6.A1S.get();
                r15.A02.CGF(new C21458AkP(r15, A0Y, 23));
            } else if (obj != null) {
                C17880vN.A0L(r6.A1B).A01(new C27081DTg(obj, r6, A0Y, 48), 77);
            } else {
                r6.A0U.BBN(A0Y, 1);
            }
        }
        C32861hs r2 = r6.A0k;
        boolean A052 = r8.A05();
        boolean A042 = r8.A04();
        AnonymousClass1BI r0 = r8.A01().A0v.A00;
        if (C42701yb.A01(r0)) {
            userJid = (UserJid) r0;
        } else {
            userJid = null;
        }
        C62022qf r16 = new C62022qf(userJid, num, true, A052, A042);
        if (r11 == null || (r12 = r2.A04(C32861hs.A00(r2, r11))) == null) {
            r12 = (AnonymousClass34B) r1;
        }
        r2.A0T.execute(new C146807Qr(r2, r8, 16));
        AnonymousClass3CY r10 = new AnonymousClass3CY(r2, r12, r16, r8, bArr, z2, z3, z, true, false);
        AnonymousClass3DM r02 = r2.A0N;
        if (r02 != null) {
            r02.execute(r10);
        } else {
            r2.A0M.CGF(r10);
        }
        C88534a3 r82 = (C88534a3) r6.A1W.get();
        C18030ve r22 = r82.A01;
        C18040vf r13 = C18040vf.A02;
        if (C18020vd.A05(r13, r22, 2890) && C18020vd.A05(r13, r22, 6808) && C18020vd.A05(r13, r22, 9216)) {
            ArrayList A14 = AnonymousClass000.A14(A0t);
            for (Object next : A0t) {
                if (r82.A0B((AnonymousClass206) next)) {
                    A14.add(next);
                }
            }
            if (!A14.isEmpty()) {
                C17880vN.A0L(r6.A1B).A01(new AnonymousClass3C0(r6, A14, 19), 76);
            }
        }
        C21132Af0 af0 = new C52642bF().A00;
        af0.A0B(A0t);
        C18070vi.A0d(r3, 0);
        af0.A09(new C145917Nc(r3, 26));
    }

    public /* synthetic */ C70663Ca(C33251iW r1, AnonymousClass85B r2, AnonymousClass21V r3, C52642bF r4, C63642tS r5, Integer num, Map map, byte[] bArr, boolean z, boolean z2, boolean z3) {
        this.A00 = r1;
        this.A0A = bArr;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A05 = num;
        this.A06 = map;
        this.A03 = r4;
    }
}
