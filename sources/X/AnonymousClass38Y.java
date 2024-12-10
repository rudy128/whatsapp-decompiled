package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.38Y  reason: invalid class name */
public class AnonymousClass38Y implements C108635c2 {
    public String A00 = "";
    public final AnonymousClass11S A01;
    public final AnonymousClass118 A02;

    public void CJs(String str) {
        C18070vi.A0d(str, 0);
        this.A00 = str;
    }

    public String BTj() {
        if (this instanceof C48662Nm) {
            return "two_fac";
        }
        if (this instanceof C48652Nl) {
            return "security_notifications";
        }
        if (this instanceof C48642Nk) {
            return "request_account_info";
        }
        if (this instanceof C48712Nr) {
            return "remove_account";
        }
        if (this instanceof C48702Nq) {
            return "passkeys";
        }
        if (this instanceof C48632Nj) {
            return "log_out";
        }
        if (this instanceof C48692Np) {
            return "email_verification";
        }
        if (this instanceof C48622Ni) {
            return "delete_account";
        }
        if (this instanceof C48612Nh) {
            return "delete_account_companion";
        }
        if (this instanceof C48602Ng) {
            return "change_number";
        }
        if (this instanceof C48682No) {
            return "add_account";
        }
        if (this instanceof C48672Nn) {
            return "third_party_chats";
        }
        return "account";
    }

    public String BWD() {
        if ((this instanceof C48662Nm) || (this instanceof C48652Nl) || (this instanceof C48642Nk) || (this instanceof C48712Nr) || (this instanceof C48702Nq) || (this instanceof C48632Nj) || (this instanceof C48692Np) || (this instanceof C48622Ni) || (this instanceof C48612Nh) || (this instanceof C48602Ng) || (this instanceof C48682No) || (this instanceof C48672Nn)) {
            return "account";
        }
        return "";
    }

    public String BXZ() {
        if (this instanceof C48662Nm) {
            return C18070vi.A0G(this.A02, 2131896031);
        }
        if (this instanceof C48652Nl) {
            return C18070vi.A0G(this.A02, 2131896004);
        }
        if (this instanceof C48642Nk) {
            return C18070vi.A0G(this.A02, 2131895849);
        }
        if (this instanceof C48712Nr) {
            return C18070vi.A0G(this.A02, 2131895999);
        }
        if (this instanceof C48702Nq) {
            return C18070vi.A0G(this.A02, 2131895956);
        }
        if (this instanceof C48632Nj) {
            return C18070vi.A0G(this.A02, 2131891819);
        }
        if (this instanceof C48692Np) {
            return C18070vi.A0G(this.A02, 2131889713);
        }
        if (this instanceof C48622Ni) {
            return C18070vi.A0G(this.A02, 2131895840);
        }
        if (this instanceof C48612Nh) {
            return C18070vi.A0G(this.A02, 2131895834);
        }
        if (this instanceof C48602Ng) {
            return C18070vi.A0G(this.A02, 2131895811);
        }
        if (this instanceof C48682No) {
            return C18070vi.A0G(this.A02, 2131895795);
        }
        boolean z = this instanceof C48672Nn;
        AnonymousClass118 r1 = this.A02;
        if (z) {
            return C18070vi.A0G(r1, 2131899386);
        }
        return C18070vi.A0G(r1, 2131895794);
    }

    public View BbT(View view) {
        int i;
        if (this instanceof C48662Nm) {
            C18070vi.A0d(view, 0);
            i = 2131436473;
        } else if (this instanceof C48652Nl) {
            C18070vi.A0d(view, 0);
            i = 2131435049;
        } else if (this instanceof C48642Nk) {
            C18070vi.A0d(view, 0);
            i = 2131434574;
        } else if (this instanceof C48712Nr) {
            C18070vi.A0d(view, 0);
            i = 2131434476;
        } else if (this instanceof C48702Nq) {
            C18070vi.A0d(view, 0);
            i = 2131433462;
        } else if (this instanceof C48632Nj) {
            C18070vi.A0d(view, 0);
            i = 2131432207;
        } else if (this instanceof C48692Np) {
            C18070vi.A0d(view, 0);
            i = 2131430299;
        } else if (this instanceof C48622Ni) {
            C18070vi.A0d(view, 0);
            i = 2131429877;
        } else if (this instanceof C48612Nh) {
            C18070vi.A0d(view, 0);
            i = 2131429871;
        } else if (this instanceof C48602Ng) {
            C18070vi.A0d(view, 0);
            i = 2131428991;
        } else if (this instanceof C48682No) {
            C18070vi.A0d(view, 0);
            i = 2131427572;
        } else if (this instanceof C48672Nn) {
            C18070vi.A0d(view, 0);
            View findViewById = view.findViewById(2131431767);
            C18070vi.A0X(findViewById);
            return findViewById;
        } else {
            C18070vi.A0d(view, 0);
            i = 2131435263;
            if (this.A01.A0N()) {
                i = 2131429311;
            }
        }
        return view.findViewById(i);
    }

    public /* synthetic */ boolean Bh4() {
        if (this instanceof C48662Nm) {
            return AnonymousClass000.A1P(this.A01.A0N() ? 1 : 0);
        }
        if (this instanceof C48712Nr) {
            return C17880vN.A0I(((C48712Nr) this).A00).A0E();
        }
        if (this instanceof C48702Nq) {
            return ((C192679on) ((C48702Nq) this).A00.get()).A01();
        }
        if (this instanceof C48632Nj) {
            return AnonymousClass000.A1O(this.A01.A0N() ? 1 : 0);
        }
        if (this instanceof C48692Np) {
            return ((C196039uM) ((C48692Np) this).A00.get()).A02();
        }
        if (this instanceof C48622Ni) {
            return AnonymousClass000.A1P(this.A01.A0N() ? 1 : 0);
        }
        if (this instanceof C48612Nh) {
            return AnonymousClass000.A1O(this.A01.A0N() ? 1 : 0);
        }
        if (this instanceof C48602Ng) {
            return AnonymousClass000.A1P(this.A01.A0N() ? 1 : 0);
        }
        if (this instanceof C48682No) {
            AnonymousClass00H r1 = ((C48682No) this).A00;
            if (!C17880vN.A0I(r1).A0F() || C17880vN.A0I(r1).A0A.A0E() + 1 >= 2) {
                return false;
            }
            return true;
        } else if (this instanceof C48672Nn) {
            return AnonymousClass000.A1O(((C48672Nn) this).A00.A01() ? 1 : 0);
        } else {
            return true;
        }
    }

    public Drawable getIcon() {
        return C24261Jm.A00(this.A02.A00, 2131232024);
    }

    public AnonymousClass38Y(AnonymousClass11S r2, AnonymousClass118 r3) {
        C18070vi.A0j(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
    }

    public /* synthetic */ List BMb() {
        return C18460wS.A00;
    }

    public String BWI() {
        return this.A00;
    }

    public int Bac() {
        return 2;
    }

    public /* synthetic */ boolean BgM() {
        return false;
    }

    public /* synthetic */ boolean CLm() {
        return true;
    }
}
