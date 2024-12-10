package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.98q  reason: invalid class name and case insensitive filesystem */
public final class C1774598q extends C21001Act {
    public final AnonymousClass1PM A00;
    public final C18030ve A01;
    public final AnonymousClass118 A02;
    public final C18000vb A03;
    public final C438721g A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1774598q(AnonymousClass1PM r2, AnonymousClass118 r3, C18000vb r4, C18030ve r5, A79 a79, C438721g r7) {
        super(a79, r7.A00);
        C72473Md.A1M(r5, r3, r2, 3);
        C18070vi.A0d(r4, 6);
        this.A04 = r7;
        this.A01 = r5;
        this.A02 = r3;
        this.A00 = r2;
        this.A03 = r4;
    }

    public void BDa(C19998A2m a2m, C438721g r10) {
        C23577Bm6 bm6;
        String str;
        C18070vi.A0d(r10, 1);
        super.BDa(a2m, r10);
        C20268AEb aEb = r10.A00;
        if (aEb != null && aEb.A01 != null && aEb.A03 == 2) {
            AnonymousClass8X8 r6 = a2m.A00;
            C165158ag r0 = ((C166418cr) r6.A00).interactiveResponseMessage_;
            if (r0 == null) {
                r0 = C165158ag.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r0.A0O();
            C165158ag r2 = (C165158ag) A0O.A00;
            if (r2.interactiveResponseMessageCase_ == 2) {
                bm6 = (C23577Bm6) r2.interactiveResponseMessage_;
            } else {
                bm6 = C164838a9.DEFAULT_INSTANCE;
            }
            C163768Wg r4 = (C163768Wg) bm6.A0O();
            AE2 ae2 = aEb.A01;
            if (!(ae2 == null || (str = ae2.A01) == null)) {
                C164838a9 r1 = (C164838a9) C17880vN.A0G(r4);
                int i = C164838a9.NAME_FIELD_NUMBER;
                r1.bitField0_ |= 1;
                r1.name_ = str;
            }
            C18070vi.A0b(r4);
            if (ae2 != null) {
                String str2 = ae2.A02;
                if (str2 != null) {
                    if (C18020vd.A05(C18040vf.A02, this.A01, 9681)) {
                        AnonymousClass205 r7 = r10.A0v;
                        if (r7.A02) {
                            AnonymousClass1PM r12 = this.A00;
                            C22941Dw r02 = UserJid.Companion;
                            C42741yf A012 = r12.A01(C22941Dw.A01(r7.A00));
                            if (A012 != null) {
                                try {
                                    JSONObject A16 = C17880vN.A16(String.valueOf(str2));
                                    if (A012.A03()) {
                                        r4.A0G(AnonymousClass84U.A00(new B0G(A16)).toString());
                                    } else if (A012.A02()) {
                                        A16.remove("wa_flow_response_params");
                                        r4.A0G(A16.toString());
                                    }
                                } catch (JSONException e) {
                                    Log.e((Throwable) e);
                                }
                            }
                        }
                    }
                    r4.A0G(str2);
                }
                Integer num = ae2.A00;
                if (num != null) {
                    int intValue = num.intValue();
                    C164838a9 r13 = (C164838a9) C17880vN.A0G(r4);
                    int i2 = C164838a9.NAME_FIELD_NUMBER;
                    r13.bitField0_ |= 4;
                    r13.version_ = intValue;
                }
            }
            C165158ag r14 = (C165158ag) C17880vN.A0G(A0O);
            C23577Bm6 A0C = r4.A0C();
            A0C.getClass();
            r14.interactiveResponseMessage_ = A0C;
            r14.interactiveResponseMessageCase_ = 2;
            C165158ag r03 = (C165158ag) A0O.A0C();
            C166418cr A0J = AnonymousClass8BV.A0J(r6, r03);
            A0J.interactiveResponseMessage_ = r03;
            A0J.bitField1_ |= 32;
        }
    }

    public int BUD() {
        return 36;
    }

    public String BRB() {
        String str;
        C438721g r7 = this.A04;
        C20268AEb aEb = this.A00;
        if (aEb == null || !aEb.A01(this.A01, r7.A0v.A02)) {
            return null;
        }
        Context context = this.A02.A00;
        Object[] A1b = AnonymousClass3MW.A1b();
        C195059sj A002 = aEb.A00();
        if (A002 != null) {
            str = A002.A03;
        } else {
            str = null;
        }
        A1b[0] = str;
        C18070vi.A0X(context);
        return C17880vN.A0q(context, r7.A1B(context), A1b, 1, 2131890454);
    }

    public String BS3() {
        String str;
        C438721g r3 = this.A04;
        C20268AEb aEb = this.A00;
        if (aEb == null || !aEb.A01(this.A01, r3.A0v.A02)) {
            return null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r3.A1B(C108945cZ.A0E(this.A02)));
        A10.append(' ');
        C195059sj A002 = aEb.A00();
        if (A002 != null) {
            str = A002.A03;
        } else {
            str = null;
        }
        return AnonymousClass000.A0y(str, A10);
    }

    public String BVT() {
        String str;
        C438721g r3 = this.A04;
        C20268AEb aEb = this.A00;
        if (aEb == null || !aEb.A01(this.A01, r3.A0v.A02)) {
            return null;
        }
        C195059sj A002 = aEb.A00();
        if (A002 != null) {
            str = A002.A03;
        } else {
            str = null;
        }
        String A1B = r3.A1B(C108945cZ.A0E(this.A02));
        C18000vb r2 = this.A03;
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append(" (");
        return C61522pp.A03.A00(C27641Ww.A01(r2, C17900vP.A0B(A1B, A11)), "📋", (String) null);
    }
}
