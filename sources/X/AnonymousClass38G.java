package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.38G  reason: invalid class name */
public class AnonymousClass38G implements C108635c2 {
    public String A00 = "";
    public final AnonymousClass118 A01;

    public AnonymousClass38G(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public void CJs(String str) {
        C18070vi.A0d(str, 0);
        this.A00 = str;
    }

    public /* synthetic */ List BMb() {
        if (this instanceof AnonymousClass2O0) {
            return C18070vi.A0L(this.A01, 2131889505);
        }
        if (this instanceof C48792Nz) {
            return C18070vi.A0L(this.A01, 2131889505);
        }
        if (this instanceof AnonymousClass2O5) {
            return C18070vi.A0L(this.A01, 2131886730);
        }
        if (!(this instanceof AnonymousClass2O2)) {
            return C18460wS.A00;
        }
        String[] A1Z = C17880vN.A1Z();
        AnonymousClass118 r2 = this.A01;
        A1Z[0] = C18070vi.A0G(r2, 2131895911);
        return C18070vi.A0O(C18070vi.A0G(r2, 2131895910), A1Z, 1);
    }

    public String BTj() {
        if (this instanceof AnonymousClass2O0) {
            return "chat_wallpaper";
        }
        if (this instanceof AnonymousClass2O6) {
            return "transfer_chats";
        }
        if (this instanceof AnonymousClass2O4) {
            return "ptt_transcription";
        }
        if (this instanceof C48792Nz) {
            return "chat_theme";
        }
        if (this instanceof C48782Ny) {
            return "media_visibility";
        }
        if (this instanceof AnonymousClass2O5) {
            return "keep_chats_archived";
        }
        if (this instanceof AnonymousClass2O3) {
            return "instant_video_messages";
        }
        if (this instanceof C48772Nx) {
            return "font_size";
        }
        if (this instanceof AnonymousClass2O2) {
            return "enter_is_send";
        }
        if (this instanceof C48762Nw) {
            C48762Nw r1 = (C48762Nw) this;
            if (r1 instanceof C48752Nv) {
                return "export_chat";
            }
            if (r1 instanceof C48742Nu) {
                return "delete_all_chats";
            }
            if (r1 instanceof C48732Nt) {
                return "clear_all_chats";
            }
            if (r1 instanceof C48722Ns) {
                return "archive_all_chats";
            }
            return "chat_history";
        } else if (this instanceof AnonymousClass2O1) {
            return "chat_backup";
        } else {
            return "chat";
        }
    }

    public String BWD() {
        if ((this instanceof AnonymousClass2O0) || (this instanceof AnonymousClass2O6) || (this instanceof AnonymousClass2O4) || (this instanceof C48792Nz) || (this instanceof C48782Ny) || (this instanceof AnonymousClass2O5) || (this instanceof AnonymousClass2O3) || (this instanceof C48772Nx) || (this instanceof AnonymousClass2O2)) {
            return "chat";
        }
        if (this instanceof C48762Nw) {
            C48762Nw r1 = (C48762Nw) this;
            if ((r1 instanceof C48752Nv) || (r1 instanceof C48742Nu) || (r1 instanceof C48732Nt) || (r1 instanceof C48722Ns)) {
                return "chat_history";
            }
            return "chat";
        } else if (!(this instanceof AnonymousClass2O1)) {
            return "";
        } else {
            return "chat";
        }
    }

    public String BXZ() {
        if (this instanceof AnonymousClass2O0) {
            return C18070vi.A0G(this.A01, 2131898398);
        }
        if (this instanceof AnonymousClass2O6) {
            return C18070vi.A0G(this.A01, 2131895818);
        }
        if (this instanceof AnonymousClass2O4) {
            return C18070vi.A0G(this.A01, 2131896062);
        }
        if (this instanceof C48792Nz) {
            return C18070vi.A0G(this.A01, 2131896020);
        }
        if (this instanceof C48782Ny) {
            return C18070vi.A0G(this.A01, 2131895933);
        }
        if (this instanceof AnonymousClass2O5) {
            return C18070vi.A0G(this.A01, 2131886728);
        }
        if (this instanceof AnonymousClass2O3) {
            return C18070vi.A0G(this.A01, 2131895912);
        }
        if (this instanceof C48772Nx) {
            return C18070vi.A0G(this.A01, 2131895847);
        }
        if (this instanceof AnonymousClass2O2) {
            return C18070vi.A0G(this.A01, 2131895909);
        }
        if (this instanceof C48762Nw) {
            C48762Nw r1 = (C48762Nw) this;
            if (r1 instanceof C48752Nv) {
                return C18070vi.A0G(r1.A01, 2131899399);
            }
            if (r1 instanceof C48742Nu) {
                return C18070vi.A0G(r1.A01, 2131898876);
            }
            if (r1 instanceof C48732Nt) {
                return C18070vi.A0G(r1.A01, 2131898781);
            }
            boolean z = r1 instanceof C48722Ns;
            AnonymousClass118 r12 = r1.A01;
            if (z) {
                return C18070vi.A0G(r12, 2131898708);
            }
            return C18070vi.A0G(r12, 2131895815);
        }
        boolean z2 = this instanceof AnonymousClass2O1;
        AnonymousClass118 r13 = this.A01;
        if (z2) {
            return C18070vi.A0G(r13, 2131895805);
        }
        return C18070vi.A0G(r13, 2131895812);
    }

    public View BbT(View view) {
        int i;
        if (this instanceof AnonymousClass2O0) {
            C18070vi.A0d(view, 0);
            i = 2131436979;
        } else if (this instanceof AnonymousClass2O6) {
            C18070vi.A0d(view, 0);
            i = 2131429060;
        } else if (this instanceof AnonymousClass2O4) {
            C18070vi.A0d(view, 0);
            i = 2131434025;
        } else if (this instanceof C48792Nz) {
            C18070vi.A0d(view, 0);
            i = 2131435328;
        } else if (this instanceof C48782Ny) {
            C18070vi.A0d(view, 0);
            i = 2131432454;
        } else if (this instanceof AnonymousClass2O5) {
            C18070vi.A0d(view, 0);
            i = 2131429055;
        } else if (this instanceof AnonymousClass2O3) {
            C18070vi.A0d(view, 0);
            i = 2131431712;
        } else if (this instanceof C48772Nx) {
            C18070vi.A0d(view, 0);
            i = 2131430947;
        } else if (this instanceof AnonymousClass2O2) {
            C18070vi.A0d(view, 0);
            i = 2131430487;
        } else if (this instanceof C48762Nw) {
            C18070vi.A0d(view, 0);
            i = 2131429032;
        } else if (this instanceof AnonymousClass2O1) {
            C18070vi.A0d(view, 0);
            i = 2131429024;
        } else {
            C18070vi.A0d(view, 0);
            i = 2131435271;
        }
        return view.findViewById(i);
    }

    public /* synthetic */ boolean Bh4() {
        AnonymousClass11S r0;
        if (this instanceof C48752Nv) {
            C48752Nv r2 = (C48752Nv) this;
            if (r2.A01.A09(AnonymousClass18O.A0h)) {
                r0 = r2.A00;
            }
            return false;
        } else if (this instanceof AnonymousClass2O6) {
            AnonymousClass2O6 r3 = (AnonymousClass2O6) this;
            if (AnonymousClass112.A01()) {
                if (C18020vd.A05(C18040vf.A02, r3.A01, 2870)) {
                    r0 = r3.A00;
                }
            }
            return false;
        } else if (this instanceof AnonymousClass2O4) {
            return C18020vd.A05(C18040vf.A02, ((AnonymousClass2O4) this).A00.A01, 2890);
        } else if (this instanceof AnonymousClass2O5) {
            AnonymousClass2O5 r1 = (AnonymousClass2O5) this;
            if (r1.A01.A2Q()) {
                r0 = r1.A00;
            }
            return false;
        } else if (this instanceof AnonymousClass2O3) {
            return C87414Vm.A01(((AnonymousClass2O3) this).A00);
        } else {
            if (this instanceof AnonymousClass2O2) {
                return !((AnonymousClass2O2) this).A00.A0N();
            }
            if (this instanceof AnonymousClass2O1) {
                return !((AnonymousClass2O1) this).A00.A0N();
            }
            return true;
        }
        if (r0.A0N()) {
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean CLm() {
        if ((this instanceof AnonymousClass2O4) || (this instanceof C48782Ny) || (this instanceof AnonymousClass2O5) || (this instanceof AnonymousClass2O3) || (this instanceof AnonymousClass2O2)) {
            return false;
        }
        return true;
    }

    public Drawable getIcon() {
        return C24261Jm.A00(this.A01.A00, 2131232283);
    }

    public String BWI() {
        return this.A00;
    }

    public int Bac() {
        return 3;
    }

    public /* synthetic */ boolean BgM() {
        return false;
    }
}
