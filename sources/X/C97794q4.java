package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.4q4  reason: invalid class name and case insensitive filesystem */
public class C97794q4 implements C108635c2 {
    public String A00 = "";
    public final AnonymousClass118 A01;
    public final C18030ve A02;

    public void CJs(String str) {
        C18070vi.A0d(str, 0);
        this.A00 = str;
    }

    public /* synthetic */ List BMb() {
        return C18460wS.A00;
    }

    public String BTj() {
        if (this instanceof AnonymousClass47k) {
            return "privacy_checkup";
        }
        if (this instanceof AnonymousClass47m) {
            return "camera_effects";
        }
        if (this instanceof AnonymousClass47j) {
            return "privacy_blocked";
        }
        if (!(this instanceof AnonymousClass47l)) {
            return "privacy";
        }
        AnonymousClass47l r1 = (AnonymousClass47l) this;
        if (r1 instanceof C824347h) {
            return "privacy_blocked_contacts";
        }
        if (r1 instanceof C824447i) {
            return "privacy_backup_contacts";
        }
        return "privacy_contacts";
    }

    public String BWD() {
        if ((this instanceof AnonymousClass47k) || (this instanceof AnonymousClass47m) || (this instanceof AnonymousClass47j)) {
            return "privacy";
        }
        if (!(this instanceof AnonymousClass47l)) {
            return "";
        }
        AnonymousClass47l r1 = (AnonymousClass47l) this;
        if ((r1 instanceof C824347h) || (r1 instanceof C824447i)) {
            return "privacy_contacts";
        }
        return "privacy";
    }

    public String BWI() {
        return this.A00;
    }

    public String BXZ() {
        if (this instanceof AnonymousClass47k) {
            return C18070vi.A0G(this.A01, 2131894756);
        }
        if (this instanceof AnonymousClass47m) {
            return C18070vi.A0G(this.A01, 2131887875);
        }
        if (this instanceof AnonymousClass47j) {
            return C18070vi.A0G(this.A01, 2131887189);
        }
        if (!(this instanceof AnonymousClass47l)) {
            return C18070vi.A0G(this.A01, 2131895971);
        }
        AnonymousClass47l r1 = (AnonymousClass47l) this;
        if (r1 instanceof C824347h) {
            return C18070vi.A0G(r1.A01, 2131887189);
        }
        boolean z = r1 instanceof C824447i;
        AnonymousClass118 r12 = r1.A01;
        if (z) {
            return C18070vi.A0G(r12, 2131893339);
        }
        return C18070vi.A0G(r12, 2131893347);
    }

    public int Bac() {
        return 11;
    }

    public View BbT(View view) {
        int i;
        if (this instanceof AnonymousClass47k) {
            C18070vi.A0d(view, 0);
            i = 2131434071;
        } else if (this instanceof AnonymousClass47m) {
            C18070vi.A0d(view, 0);
            i = 2131428786;
        } else if (this instanceof AnonymousClass47j) {
            C18070vi.A0d(view, 0);
            i = 2131428225;
        } else if (this instanceof AnonymousClass47l) {
            AnonymousClass47l r1 = (AnonymousClass47l) this;
            if (r1 instanceof C824347h) {
                C18070vi.A0d(view, 0);
                i = 2131428224;
            } else if (r1 instanceof C824447i) {
                C18070vi.A0d(view, 0);
                i = 2131429486;
            } else {
                C18070vi.A0d(view, 0);
                i = 2131429494;
            }
        } else {
            C18070vi.A0d(view, 0);
            i = 2131434084;
            if (C18020vd.A05(C18040vf.A02, this.A02, 4023)) {
                i = 2131427505;
            }
        }
        return view.findViewById(i);
    }

    public /* synthetic */ boolean BgM() {
        return false;
    }

    public /* synthetic */ boolean Bh4() {
        return true;
    }

    public /* synthetic */ boolean CLm() {
        if (this instanceof C824447i) {
            return false;
        }
        return true;
    }

    public Drawable getIcon() {
        return C24261Jm.A00(this.A01.A00, 2131232065);
    }

    public C97794q4(AnonymousClass118 r2, C18030ve r3) {
        C18070vi.A0j(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
    }
}
