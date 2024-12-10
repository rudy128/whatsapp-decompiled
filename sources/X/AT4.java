package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Set;

public class AT4 implements B83, B85, C436820m {
    public final AnonymousClass11P A00;
    public final AnonymousClass1KI A01;
    public final AnonymousClass1PM A02;
    public final C18030ve A03;
    public final AnonymousClass1N9 A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final Set A07;

    public AnonymousClass206 A00(AnonymousClass121 r9, C166418cr r10, AnonymousClass205 r11, AnonymousClass21L r12, long j, boolean z) {
        C20285AEt BPK;
        C166418cr r3 = r10;
        if (!z) {
            AnonymousClass1BI r1 = r11.A00;
            C17960vV.A07(r1);
            AnonymousClass21K A002 = A63.A00(r9, r1, this.A04, r3, r12, (Set) null, false, false);
            if (A002 != null) {
                C20285AEt aEt = r12.A00;
                if (!(aEt == null || (BPK = A002.BPK()) == null)) {
                    aEt.A02 = BPK.A02;
                    r12.CIS(aEt);
                }
                return r12;
            }
        }
        String A012 = C20096A6z.A01(r10);
        if (A012 != null) {
            return AnonymousClass8BX.A0R(r11, A012, j);
        }
        throw AnonymousClass8BT.A0b();
    }

    public AnonymousClass21R A01(C20077A6d a6d) {
        C166268cc r2;
        C20277AEk aEk;
        AnonymousClass205 r6 = a6d.A0A;
        long j = a6d.A03;
        C165858bs r5 = a6d.A08.buttonsMessage_;
        if (r5 == null) {
            r5 = C165858bs.DEFAULT_INSTANCE;
        }
        C17960vV.A07(r5);
        AnonymousClass11P r9 = this.A00;
        AnonymousClass1KI r8 = this.A01;
        if (AnonymousClass8BX.A0N(r5, 0).paramsJson_ == null) {
            Log.e("FMessageCheckoutButtonsProtobuf/parseE2ECheckoutInfo/invalid native flow message does not have parameters json");
        } else {
            C165228an r7 = (C165228an) r5.buttons_.get(0);
            if (r5.headerCase_ == 3) {
                r2 = (C166268cc) r5.header_;
            } else {
                r2 = C166268cc.DEFAULT_INSTANCE;
            }
            byte[] A062 = r2.jpegThumbnail_.A06();
            C164458Yx r22 = r7.nativeFlowInfo_;
            if (r22 == null) {
                r22 = C164458Yx.DEFAULT_INSTANCE;
            }
            C20279AEn A042 = A8o.A04(r9, r8, r22.paramsJson_, A062, false);
            if (A042 != null) {
                AnonymousClass21R r3 = new AnonymousClass21R(r6, j);
                String str = r5.contentText_;
                String str2 = r5.footerText_;
                if (r5.buttons_.size() > 0) {
                    ArrayList A13 = AnonymousClass000.A13();
                    for (int i = 0; i < r5.buttons_.size(); i++) {
                        C164458Yx A0N = AnonymousClass8BX.A0N(r5, i);
                        A13.add(new C20253ADl(new C20271AEe(A0N.name_, A0N.paramsJson_), false));
                    }
                    aEk = new C20277AEk(A13);
                } else {
                    aEk = null;
                }
                r3.CIS(new C20285AEt(A042, (AEE) null, aEk, str, str2));
                for (C190679lL A002 : this.A07) {
                    A002.A00(r3);
                }
                return r3;
            }
        }
        C17900vP.A0X(r6, "FMessageCheckoutButtonsProtobuf/parseE2EMessage/invalid message; message.key=", AnonymousClass000.A10());
        throw AnonymousClass8BR.A0o(26);
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r5) {
        C17960vV.A0G(r5 instanceof AnonymousClass21L, AnonymousClass001.A1E(r5, "FMessageCheckoutButtonsProtobuf: message type is not supported ", AnonymousClass000.A10()));
        C20285AEt aEt = ((AnonymousClass21L) r5).A00;
        if (aEt != null) {
            C20083A6j.A02(a2m, r5, aEt, this.A06);
        }
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        DSQ dsq;
        C20277AEk aEk;
        C20077A6d a6d2 = a6d;
        C166418cr r11 = a6d2.A08;
        if (!A89.A05(r11)) {
            return null;
        }
        C166398cp r1 = r11.interactiveMessage_;
        if (r1 == null) {
            r1 = C166398cp.DEFAULT_INSTANCE;
        }
        C18070vi.A0d(r1, 0);
        if (!C20093A6v.A02(r1, "review_order")) {
            return null;
        }
        AnonymousClass1PM r12 = this.A02;
        AnonymousClass205 r10 = a6d2.A0A;
        if (!r12.A04((UserJid) r10.A00)) {
            return null;
        }
        if (!C18020vd.A05(C18040vf.A02, this.A03, 2688)) {
            return null;
        }
        long j = a6d2.A03;
        C166398cp r5 = r11.interactiveMessage_;
        if (r5 == null) {
            r5 = C166398cp.DEFAULT_INSTANCE;
        }
        C17960vV.A07(r5);
        if (r5.A0S().buttons_.size() > 0) {
            String A0b = AnonymousClass8BX.A0b(r5, 0);
            C165638bW r4 = r5.header_;
            if (r4 == null) {
                r4 = C165638bW.DEFAULT_INSTANCE;
            }
            if (r4.mediaCase_ == 6) {
                dsq = (DSQ) r4.media_;
            } else {
                dsq = DSQ.A00;
            }
            byte[] A062 = dsq.A06();
            C20279AEn A042 = A8o.A04(this.A00, this.A01, A0b, A062, true);
            if (A042 != null) {
                AnonymousClass21R r9 = new AnonymousClass21R(r10, j);
                C164018Xf r0 = r5.body_;
                if (r0 == null) {
                    r0 = C164018Xf.DEFAULT_INSTANCE;
                }
                String str = r0.text_;
                C164028Xg r02 = r5.footer_;
                if (r02 == null) {
                    r02 = C164028Xg.DEFAULT_INSTANCE;
                }
                String str2 = r02.text_;
                C164818a7 A0S = r5.A0S();
                if (A0S.buttons_.size() > 0) {
                    ArrayList A13 = AnonymousClass000.A13();
                    for (int i = 0; i < A0S.buttons_.size(); i++) {
                        AnonymousClass8Z3 r03 = (AnonymousClass8Z3) A0S.buttons_.get(i);
                        A13.add(new C20253ADl(new C20271AEe(r03.name_, r03.buttonParamsJson_), false));
                    }
                    aEk = new C20277AEk(A13);
                } else {
                    aEk = null;
                }
                r9.CIS(new C20285AEt(A042, (AEE) null, aEk, str, str2));
                AnonymousClass21R r19 = r9;
                AnonymousClass205 r18 = r10;
                C166418cr r17 = r11;
                return A00((AnonymousClass121) this.A05.get(), r17, r18, r19, j, a6d2.A0L);
            }
        }
        C17900vP.A0X(r10, "FMessageCheckoutButtonsProtobuf/parseE2EMessage/invalid message; message.key=", AnonymousClass000.A10());
        throw AnonymousClass8BR.A0o(26);
    }

    public AT4(AnonymousClass1PM r1, AnonymousClass11P r2, AnonymousClass1KI r3, C18030ve r4, AnonymousClass1N9 r5, AnonymousClass00H r6, AnonymousClass00H r7, Set set) {
        this.A00 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r1;
        this.A01 = r3;
        this.A07 = set;
        this.A06 = r7;
    }
}
