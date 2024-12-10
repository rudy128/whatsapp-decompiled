package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: X.4US  reason: invalid class name */
public abstract class AnonymousClass4US {
    public boolean A00;
    public final GroupJid A01;
    public final C18100vl A02 = AnonymousClass1DF.A01(C104785Pm.A00);
    public final C24921Me A03;

    public Collection A00() {
        return (Collection) this.A02.getValue();
    }

    public List A01() {
        if (this instanceof C75973mE) {
            return AnonymousClass3MW.A11(((C75973mE) this).A02);
        }
        if (this instanceof C75983mF) {
            return AnonymousClass3MW.A11(((C75983mF) this).A03);
        }
        return AnonymousClass3MW.A11(((C75963mD) this).A02);
    }

    public final List A02() {
        AnonymousClass6IR r10;
        int i;
        int i2;
        if (!this.A00) {
            return C18460wS.A00;
        }
        List A012 = A01();
        ArrayList A0D = C29351c6.A0D(A012);
        int i3 = 0;
        for (Object next : A012) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AnonymousClass1ZU.A0B();
                throw null;
            }
            AnonymousClass1E7 r9 = (AnonymousClass1E7) next;
            boolean contains = ((Set) this.A02.getValue()).contains(r9);
            int A07 = this.A03.A07(r9, this.A01);
            boolean A1P = AnonymousClass000.A1P(i3);
            boolean A1T = AnonymousClass000.A1T(i3 + 1, A01().size());
            if (this instanceof C75983mF) {
                C75983mF r5 = (C75983mF) this;
                C18070vi.A0d(r9, 0);
                C178119Bw r4 = r5.A02;
                AnonymousClass1BI r2 = r9.A0J;
                C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                if (r4.A0Z(r5.A00, (UserJid) r2)) {
                    i2 = 2131887786;
                    if (r4.A0W()) {
                        i2 = 2131887787;
                    }
                } else {
                    AnonymousClass1BI r0 = r9.A0J;
                    C18070vi.A0z(r0, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                    if (r4.A0a((UserJid) r0)) {
                        i2 = 2131887794;
                    }
                    r10 = null;
                }
                r10 = AnonymousClass3MX.A0t(i2);
            } else {
                if (this instanceof C75963mD) {
                    C75963mD r52 = (C75963mD) this;
                    C18070vi.A0d(r9, 0);
                    C178119Bw r42 = r52.A01;
                    AnonymousClass1BI r22 = r9.A0J;
                    C18070vi.A0z(r22, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                    if (r42.A0Z(r52.A00, (UserJid) r22)) {
                        i = 2131887786;
                    } else {
                        AnonymousClass1BI r02 = r9.A0J;
                        C18070vi.A0z(r02, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                        if (r42.A0a((UserJid) r02)) {
                            i = 2131887794;
                        }
                    }
                    r10 = AnonymousClass3MX.A0t(i);
                }
                r10 = null;
            }
            A0D.add(new C87254Uw(r9, r10, A07, contains, A1P, A1T));
            i3 = i4;
        }
        return A0D;
    }

    public AnonymousClass4US(C24921Me r2, GroupJid groupJid) {
        this.A01 = groupJid;
        this.A03 = r2;
    }
}
