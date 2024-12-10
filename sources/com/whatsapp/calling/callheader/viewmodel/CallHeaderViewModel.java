package com.whatsapp.calling.callheader.viewmodel;

import X.A8I;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass11X;
import X.AnonymousClass11Y;
import X.AnonymousClass1DT;
import X.AnonymousClass1EC;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3VX;
import X.AnonymousClass482;
import X.AnonymousClass4ZN;
import X.C135636sW;
import X.C1402670q;
import X.C175258yP;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C190979lp;
import X.C21431Ajy;
import X.C24921Me;
import X.C27081Uq;
import X.C59822mw;
import X.C86534Sa;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

public class CallHeaderViewModel extends AnonymousClass3VX {
    public C59822mw A00;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass1KB A02;
    public final C175258yP A03;
    public final AnonymousClass1M9 A04;
    public final C27081Uq A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass11S A07;
    public final AnonymousClass1PM A08;
    public final C24921Me A09;
    public final C18000vb A0A;
    public final C18030ve A0B;
    public final AnonymousClass10I A0C;

    public void A0S() {
        this.A03.unregisterObserver(this);
    }

    public void BnL(C86534Sa r12) {
        AnonymousClass1EC r10;
        int i;
        Object[] objArr;
        String A0I;
        C190979lp r1 = (C190979lp) this.A06.get();
        C18070vi.A0d(r12, 0);
        UserJid userJid = r12.A0A;
        if (userJid != null && Voip.A0A(r12.A0B)) {
            C18030ve r2 = r1.A01;
            if (!r12.A0L && C18020vd.A05(C18040vf.A02, r2, 5923)) {
                this.A0C.CGO(new C21431Ajy(this, userJid, 12), userJid.getObfuscatedString());
                return;
            }
        }
        if (r12.A0B == CallState.LINK) {
            UserJid userJid2 = r12.A09;
            if (userJid2 != null) {
                AnonymousClass11S r13 = this.A07;
                if (r13.A0O(userJid2)) {
                    A0I = r13.A0D();
                } else {
                    A0I = this.A09.A0I(this.A04.A0H(userJid2));
                }
                if (A0I != null) {
                    i = 2131887659;
                    objArr = new Object[]{A0I};
                    this.A01.A0F(new C135636sW(AnonymousClass3MX.A0t(2131887660), C1402670q.A02(objArr, i), (AnonymousClass4ZN) null, true));
                    return;
                }
            }
            i = 2131887658;
            objArr = new Object[0];
            this.A01.A0F(new C135636sW(AnonymousClass3MX.A0t(2131887660), C1402670q.A02(objArr, i), (AnonymousClass4ZN) null, true));
            return;
        }
        if (!C18020vd.A05(C18040vf.A02, this.A0B, 7175)) {
            String str = r12.A0E;
            if (!TextUtils.isEmpty(str) && (r10 = r12.A08) != null) {
                C59822mw r14 = this.A00;
                if (r14 == null || !r14.A07.equals(str)) {
                    this.A0C.CGN(new C21431Ajy(this, r12, 13));
                    return;
                }
                long j = r14.A03;
                C18000vb r3 = this.A0A;
                AnonymousClass11Y r22 = AnonymousClass11X.A00;
                String A082 = r22.A08(r3, j);
                String A062 = r22.A06(r3, j);
                String A002 = A8I.A00(r3, j);
                AnonymousClass1DT r5 = this.A01;
                AnonymousClass482 A003 = C1402670q.A00(AnonymousClass3MY.A0q(this.A09, this.A04.A0H(r10)));
                Object[] objArr2 = new Object[4];
                objArr2[0] = this.A00.A00();
                objArr2[1] = A082;
                AnonymousClass001.A1R(A062, A002, objArr2);
                r5.A0F(new C135636sW(A003, C1402670q.A02(objArr2, 2131887695), (AnonymousClass4ZN) null, true));
            }
        }
    }

    public CallHeaderViewModel(AnonymousClass1KB r2, AnonymousClass11S r3, C175258yP r4, AnonymousClass1M9 r5, AnonymousClass1PM r6, C24921Me r7, C18000vb r8, C27081Uq r9, C18030ve r10, AnonymousClass10I r11, AnonymousClass00H r12) {
        this.A0B = r10;
        this.A03 = r4;
        this.A07 = r3;
        this.A09 = r7;
        this.A04 = r5;
        this.A02 = r2;
        this.A0C = r11;
        this.A0A = r8;
        this.A05 = r9;
        this.A08 = r6;
        this.A06 = r12;
        r4.registerObserver(this);
        BnL(r4.A07());
    }
}
