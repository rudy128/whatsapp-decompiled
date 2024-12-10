package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Uh  reason: invalid class name and case insensitive filesystem */
public final class C73303Uh extends AnonymousClass1J2 {
    public final Set A00;
    public final Set A01;
    public final C108485bm A02;
    public final C23421Fz A03;
    public final AnonymousClass1G1 A04;
    public final AnonymousClass1CJ A05;
    public final List A06;
    public final List A07;
    public final AnonymousClass1G4 A08;

    public static final void A00(C73303Uh r16) {
        Object value;
        ArrayList A0D;
        C73303Uh r5 = r16;
        AnonymousClass1G4 r4 = r5.A08;
        do {
            value = r4.getValue();
            List<GroupJid> list = r5.A06;
            A0D = C29351c6.A0D(list);
            for (GroupJid groupJid : list) {
                String A0F = r5.A05.A0F(groupJid);
                if (A0F == null) {
                    A0F = "";
                }
                A0D.add(new AnonymousClass4U3(new A2B(groupJid, (Integer) null, (Integer) null, (Long) null, A0F, 0, 0), AnonymousClass3MW.A16(r5, 18), r5.A00.contains(groupJid)));
            }
        } while (!r4.BFK(value, new AnonymousClass4Y0(A0D)));
    }

    public C73303Uh(AnonymousClass1CJ r3, List list, List list2) {
        C18070vi.A0o(r3, list, list2);
        this.A05 = r3;
        this.A06 = list;
        this.A07 = list2;
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(new AnonymousClass4Y0(C18460wS.A00));
        this.A08 = A18;
        this.A04 = A18;
        C27178DXn dXn = new C27178DXn(0);
        this.A02 = dXn;
        this.A03 = AnonymousClass4WB.A01(dXn);
        Set A11 = C29431cG.A11(list2);
        this.A00 = A11;
        this.A01 = A11;
    }
}
