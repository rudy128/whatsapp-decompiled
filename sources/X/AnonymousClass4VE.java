package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.4VE  reason: invalid class name */
public final class AnonymousClass4VE {
    public final AnonymousClass1RK A00;
    public final C18030ve A01;
    public final C24901Mc A02;
    public final boolean A03;
    public final boolean A04;
    public final C36931oh A05;
    public final C19830z4 A06;
    public final C26161Rb A07;
    public final AnonymousClass18K A08;

    public final void A00(AnonymousClass1FY r12, AnonymousClass1E7 r13, boolean z) {
        String str;
        AnonymousClass1FY r4 = r12;
        boolean A17 = C18070vi.A17(r12, r13);
        Jid A0m = C72453Mb.A0m(r13);
        C18070vi.A0X(A0m);
        UserJid userJid = (UserJid) A0m;
        boolean A0A = this.A02.A0A(userJid);
        if (z) {
            if (A0A) {
                str = "chat_fmx_card_safety_tools_block";
            } else {
                str = "chat_fmx_card_safety_tools_block_suspicious";
            }
        } else if (A0A) {
            str = "chat_fmx_card_block";
        } else {
            str = "chat_fmx_card_block_suspicious";
        }
        if (r13.A0C()) {
            boolean z2 = !AnonymousClass3MX.A1X(this.A01);
            r12.startActivity(AnonymousClass1LU.A1E(r4, userJid, str, A17, A17, z2, z2));
            return;
        }
        C36931oh r0 = this.A05;
        C17960vV.A07(userJid);
        C18070vi.A0X(userJid);
        AnonymousClass4SO BGI = r0.BGI(userJid, str);
        BGI.A04 = A17;
        BGI.A05 = false;
        C18030ve r2 = BGI.A06;
        if (!AnonymousClass3MX.A1X(r2)) {
            BGI.A02 = A17;
        }
        if (!C18020vd.A05(C18040vf.A02, r2, 9871)) {
            BGI.A03 = A17;
        }
        BGI.A01(A17 ? 1 : 0, A17);
        r12.CMl(C123736Vq.A00(BGI.A00()));
    }

    public final void A02(AnonymousClass3UR r6, Integer num, int i, int i2) {
        boolean z;
        int i3;
        String obj;
        C81703zf r4 = new C81703zf();
        r4.A04 = Integer.valueOf(i);
        r4.A03 = Integer.valueOf(i2);
        if (r6 != null) {
            r4.A02 = AnonymousClass000.A0i();
            AnonymousClass1DT r2 = r6.A03;
            List A10 = AnonymousClass3MW.A10(r2);
            if (A10 != null) {
                Iterator it = A10.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next() instanceof AnonymousClass400) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            r4.A00 = Boolean.valueOf(z);
            List A102 = AnonymousClass3MW.A10(r2);
            if (A102 != null) {
                Iterator it2 = A102.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AnonymousClass4EV r1 = (AnonymousClass4EV) it2.next();
                    if (r1 instanceof C81883zz) {
                        i3 = ((C81883zz) r1).A00.A00;
                        break;
                    }
                }
            }
            i3 = 0;
            r4.A06 = C17880vN.A0n(i3);
            AnonymousClass1E7 r22 = r6.A06;
            boolean A0C = r22.A0C();
            if (this.A04) {
                r4.A01 = Boolean.valueOf(A0C);
            }
            if (A0C) {
                AnonymousClass1BI r0 = r22.A0J;
                if (r0 != null) {
                    r4.A07 = this.A07.A04(r0.getRawString());
                }
                boolean A0T = r6.A0T(0);
                boolean A0T2 = r6.A0T(1);
                if (A0T || A0T2) {
                    JSONObject A15 = C17880vN.A15();
                    A15.put("card_has_fb_counter", A0T);
                    A15.put("card_has_ig_counter", A0T2);
                    obj = A15.toString();
                } else {
                    obj = null;
                }
                r4.A08 = obj;
            }
        }
        if (num != null) {
            r4.A05 = num;
        }
        this.A08.CC7(r4);
    }

    public AnonymousClass4VE(C36931oh r3, C19830z4 r4, AnonymousClass1RK r5, C18030ve r6, C26161Rb r7, AnonymousClass18K r8, C24901Mc r9) {
        C18070vi.A0o(r6, r8, r9);
        C18070vi.A0d(r4, 5);
        C18070vi.A0l(r5, r3);
        this.A01 = r6;
        this.A08 = r8;
        this.A02 = r9;
        this.A07 = r7;
        this.A06 = r4;
        this.A00 = r5;
        this.A05 = r3;
        C18040vf r1 = C18040vf.A02;
        this.A03 = C18020vd.A05(r1, r6, 3962);
        this.A04 = C18020vd.A05(r1, r6, 5263);
    }

    public final void A01(AnonymousClass3UR r6, AnonymousClass1BI r7, String str, int i) {
        String obj = r7.toString();
        C19830z4 r3 = this.A06;
        HashSet hashSet = new HashSet(r3.A0w(str));
        if (hashSet.contains(obj)) {
            A02(r6, (Integer) null, i, 0);
            C19830z4.A00(r3).putStringSet(str, C41841x9.A07(obj, hashSet)).apply();
        }
    }
}
