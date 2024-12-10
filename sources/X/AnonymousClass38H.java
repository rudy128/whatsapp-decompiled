package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.38H  reason: invalid class name */
public class AnonymousClass38H implements C108635c2 {
    public String A00 = "";
    public final AnonymousClass118 A01;

    public AnonymousClass38H(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public void CJs(String str) {
        C18070vi.A0d(str, 0);
        this.A00 = str;
    }

    public /* synthetic */ List BMb() {
        if (!(this instanceof AnonymousClass2OH)) {
            return C18460wS.A00;
        }
        String[] A1Z = C17880vN.A1Z();
        AnonymousClass118 r2 = this.A01;
        A1Z[0] = C18070vi.A0G(r2, 2131895930);
        return C18070vi.A0O(C18070vi.A0G(r2, 2131895927), A1Z, 1);
    }

    public String BTj() {
        if (this instanceof AnonymousClass2OI) {
            return "proxy";
        }
        if (this instanceof AnonymousClass2OH) {
            return "media_upload_original_quality_section";
        }
        if (this instanceof AnonymousClass2OD) {
            if (((AnonymousClass2OD) this) instanceof AnonymousClass2O9) {
                return "reset_network_usage";
            }
            return "network_usage";
        } else if (this instanceof AnonymousClass2OC) {
            return "media_auto_download_section";
        } else {
            if (this instanceof AnonymousClass2OB) {
                return "manage_storage";
            }
            if (this instanceof AnonymousClass2OG) {
                return "use_less_data_for_calls";
            }
            if (this instanceof AnonymousClass2OA) {
                return "media_download_wifi";
            }
            if (this instanceof AnonymousClass2OF) {
                return "media_download_roaming";
            }
            if (this instanceof AnonymousClass2OE) {
                return "media_download_mobile_data";
            }
            return "storage_and_data";
        }
    }

    public String BWD() {
        if ((this instanceof AnonymousClass2OI) || (this instanceof AnonymousClass2OH)) {
            return "storage_and_data";
        }
        if (this instanceof AnonymousClass2OD) {
            if (((AnonymousClass2OD) this) instanceof AnonymousClass2O9) {
                return "network_usage";
            }
            return "storage_and_data";
        } else if ((this instanceof AnonymousClass2OC) || (this instanceof AnonymousClass2OB) || (this instanceof AnonymousClass2OG)) {
            return "storage_and_data";
        } else {
            if ((this instanceof AnonymousClass2OA) || (this instanceof AnonymousClass2OF) || (this instanceof AnonymousClass2OE)) {
                return "media_auto_download_section";
            }
            return "";
        }
    }

    public String BXZ() {
        if (this instanceof AnonymousClass2OI) {
            return C18070vi.A0G(this.A01, 2131894827);
        }
        if (this instanceof AnonymousClass2OH) {
            return C18070vi.A0G(this.A01, 2131895954);
        }
        if (this instanceof AnonymousClass2OD) {
            AnonymousClass2OD r1 = (AnonymousClass2OD) this;
            boolean z = r1 instanceof AnonymousClass2O9;
            AnonymousClass118 r12 = r1.A01;
            if (z) {
                return C18070vi.A0G(r12, 2131892443);
            }
            return C18070vi.A0G(r12, 2131895942);
        } else if (this instanceof AnonymousClass2OC) {
            return C18070vi.A0G(this.A01, 2131895796);
        } else {
            if (this instanceof AnonymousClass2OB) {
                return C18070vi.A0G(this.A01, 2131891847);
            }
            if (this instanceof AnonymousClass2OG) {
                return C18070vi.A0G(this.A01, 2131896066);
            }
            if (this instanceof AnonymousClass2OA) {
                return C18070vi.A0G(this.A01, 2131895802);
            }
            if (this instanceof AnonymousClass2OF) {
                return C18070vi.A0G(this.A01, 2131895800);
            }
            boolean z2 = this instanceof AnonymousClass2OE;
            AnonymousClass118 r13 = this.A01;
            if (z2) {
                return C18070vi.A0G(r13, 2131895798);
            }
            return C18070vi.A0G(r13, 2131896018);
        }
    }

    public View BbT(View view) {
        int i;
        if (this instanceof AnonymousClass2OI) {
            C18070vi.A0d(view, 0);
            i = 2131436644;
        } else if (this instanceof AnonymousClass2OH) {
            C18070vi.A0d(view, 0);
            i = 2131435246;
        } else if (this instanceof AnonymousClass2OD) {
            if (((AnonymousClass2OD) this) instanceof AnonymousClass2O9) {
                C18070vi.A0d(view, 0);
                i = 2131434629;
            } else {
                C18070vi.A0d(view, 0);
                i = 2131435243;
            }
        } else if (this instanceof AnonymousClass2OC) {
            C18070vi.A0d(view, 0);
            i = 2131432364;
        } else if (this instanceof AnonymousClass2OB) {
            C18070vi.A0d(view, 0);
            i = 2131435257;
        } else if (this instanceof AnonymousClass2OG) {
            C18070vi.A0d(view, 0);
            i = 2131435270;
        } else if (this instanceof AnonymousClass2OA) {
            C18070vi.A0d(view, 0);
            i = 2131435238;
        } else if (this instanceof AnonymousClass2OF) {
            C18070vi.A0d(view, 0);
            i = 2131435237;
        } else if (this instanceof AnonymousClass2OE) {
            C18070vi.A0d(view, 0);
            i = 2131435236;
        } else {
            C18070vi.A0d(view, 0);
            i = 2131435272;
        }
        return view.findViewById(i);
    }

    public /* synthetic */ boolean BgM() {
        if ((this instanceof AnonymousClass2OH) || (this instanceof AnonymousClass2OC)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean Bh4() {
        if (this instanceof AnonymousClass2OI) {
            C18030ve r2 = ((AnonymousClass2OI) this).A00;
            C18040vf r1 = C18040vf.A02;
            if (C18020vd.A05(r1, r2, 2784) || C18020vd.A05(r1, r2, 3641)) {
                return true;
            }
            return false;
        } else if (this instanceof AnonymousClass2OH) {
            return C18020vd.A05(C18040vf.A02, ((AnonymousClass2OH) this).A00, 7589);
        } else if (this instanceof AnonymousClass2OG) {
            return !((AnonymousClass2OG) this).A00.A0N();
        }
        return true;
    }

    public /* synthetic */ boolean CLm() {
        if (this instanceof AnonymousClass2OG) {
            return false;
        }
        return true;
    }

    public Drawable getIcon() {
        return C24261Jm.A00(this.A01.A00, 2131231843);
    }

    public String BWI() {
        return this.A00;
    }

    public int Bac() {
        return 5;
    }
}
