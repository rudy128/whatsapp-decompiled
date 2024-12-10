package X;

import android.content.res.Resources;
import java.util.List;

/* renamed from: X.4ls  reason: invalid class name and case insensitive filesystem */
public final class C95214ls implements C108605by {
    public C88434Zr A00;
    public C88434Zr A01;
    public final C18030ve A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(AnonymousClass5QB.A00);
    public final AnonymousClass1G3 A04 = new C25701Ph(C25691Pg.SUSPEND, 0, 0);
    public final AnonymousClass1Nb A05;

    public boolean CB2(Resources.Theme theme, AnonymousClass1BI r7, boolean z) {
        int i;
        C18070vi.A0d(theme, 0);
        if (z) {
            i = 2132083509;
        } else {
            if (AnonymousClass1J8.A01(this.A02)) {
                String str = BQ3(r7).A00;
                C88434Zr A012 = A01(str);
                this.A01 = A012;
                if (!C18070vi.A18(str, C80383x3.A00.A00)) {
                    if (A012 instanceof C80373x2) {
                        i = ((C80373x2) A012).A00;
                    }
                    return true;
                }
            }
            return false;
        }
        theme.applyStyle(i, true);
        return true;
    }

    private final C88434Zr A00() {
        C88434Zr r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C88434Zr BQ3 = BQ3((AnonymousClass1BI) null);
        this.A00 = BQ3;
        return BQ3;
    }

    public /* bridge */ /* synthetic */ C23421Fz BOW() {
        return this.A04;
    }

    public C88434Zr BQ3(AnonymousClass1BI r3) {
        C42551yM A0a;
        C88434Zr A002;
        AnonymousClass1Nb r1 = this.A05;
        if (r3 == null) {
            A0a = AnonymousClass1Nb.A01(r1, "individual_chat_defaults");
        } else {
            A0a = r1.A0a(r3);
        }
        String str = A0a.A0H;
        if (str != null) {
            return A01(str);
        }
        if (r3 == null || (A002 = A00()) == null) {
            return C80383x3.A00;
        }
        return A002;
    }

    public List BUi() {
        return AnonymousClass3MW.A11(C88434Zr.A02);
    }

    public List BaK() {
        return AnonymousClass3MW.A11(this.A03);
    }

    public boolean Bgg() {
        return AnonymousClass1J8.A01(this.A02);
    }

    public Object CFh(AnonymousClass1BI r3, C30391dr r4) {
        this.A05.A0o(r3, (String) null);
        if (r3 == null) {
            this.A00 = C80383x3.A00;
        }
        return AnonymousClass3MX.A13(this.A04.BJt(r3, r4));
    }

    public void CFo(AnonymousClass1BI r3) {
        this.A05.A0p(r3, (String) null);
    }

    public void CGm(AnonymousClass4VO r3, AnonymousClass1BI r4) {
        this.A05.A0p(r4, r3.A00());
    }

    public Object CGn(C88434Zr r3, AnonymousClass1BI r4, C30391dr r5) {
        this.A05.A0o(r4, r3.A00);
        if (r4 == null) {
            this.A00 = r3;
        }
        return AnonymousClass3MX.A13(this.A04.BJt(r4, r5));
    }

    public C95214ls(C18030ve r4, AnonymousClass1Nb r5) {
        this.A02 = r4;
        this.A05 = r5;
    }

    public static final C88434Zr A01(String str) {
        switch (str.hashCode()) {
            case -1911991461:
                if (str.equals("Charcoal-GreenTonal")) {
                    return C80283wt.A00;
                }
                break;
            case -1784759422:
                if (str.equals("Dark-Cerulean")) {
                    return C80193wk.A00;
                }
                break;
            case -876235323:
                if (str.equals("Pearl-IndigoTonal")) {
                    return C80323wx.A00;
                }
                break;
            case -301966843:
                if (str.equals("Merino-TealTonal")) {
                    return C80313ww.A00;
                }
                break;
            case -300055583:
                if (str.equals("Persian-Plum")) {
                    return C80233wo.A00;
                }
                break;
            case -217290119:
                if (str.equals("Sunset-OrangeTonal")) {
                    return C80353x0.A00;
                }
                break;
            case -89002683:
                if (str.equals("Sunset-Orange")) {
                    return C80253wq.A00;
                }
                break;
            case -86278365:
                if (str.equals("Charcoal-Green")) {
                    return C80183wj.A00;
                }
                break;
            case 33533758:
                if (str.equals("Tyrian-PurpleTonal")) {
                    return C80363x1.A00;
                }
                break;
            case 169765118:
                if (str.equals("Royal-BlueTonal")) {
                    return C80343wz.A00;
                }
                break;
            case 306053472:
                if (str.equals("Tyrian-Purple")) {
                    return C80263wr.A00;
                }
                break;
            case 514264598:
                if (str.equals("Dune-MonoTonal")) {
                    return C80303wv.A00;
                }
                break;
            case 763507857:
                if (str.equals("WhatsAppGreen")) {
                    return C80273ws.A00;
                }
                break;
            case 973601372:
                if (str.equals("Dark-CeruleanTonal")) {
                    return C80293wu.A00;
                }
                break;
            case 1174190984:
                if (str.equals("Dune-Mono")) {
                    return C80203wl.A00;
                }
                break;
            case 1183938105:
                if (str.equals("Merino-Teal")) {
                    return C80213wm.A00;
                }
                break;
            case 1582416505:
                if (str.equals("Pearl-Indigo")) {
                    return C80223wn.A00;
                }
                break;
            case 1757556640:
                if (str.equals("Royal-Blue")) {
                    return C80243wp.A00;
                }
                break;
            case 1805817181:
                if (str.equals("Persian-PlumTonal")) {
                    return C80333wy.A00;
                }
                break;
        }
        return C80383x3.A00;
    }
}
