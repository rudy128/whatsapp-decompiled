package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.38W  reason: invalid class name */
public final class AnonymousClass38W implements C108635c2 {
    public String A00 = "";
    public final AnonymousClass118 A01;
    public final C18030ve A02;

    public View BbT(View view) {
        C18070vi.A0d(view, 0);
        return view.findViewById(2131435306);
    }

    public void CJs(String str) {
        C18070vi.A0d(str, 0);
        this.A00 = str;
    }

    public List BMb() {
        AnonymousClass118 r1;
        int i;
        C18030ve r2 = this.A02;
        C18040vf r12 = C18040vf.A02;
        if (C18020vd.A05(r12, r2, 2090)) {
            r1 = this.A01;
            i = 2131895176;
        } else if (!C18020vd.A05(r12, r2, 10127)) {
            return C18460wS.A00;
        } else {
            r1 = this.A01;
            i = 2131896606;
        }
        return C18070vi.A0M(r1.A01(i));
    }

    public String BXZ() {
        return C18070vi.A0G(this.A01, 2131895174);
    }

    public boolean Bh4() {
        C18030ve r2 = this.A02;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 2090) || C18020vd.A05(r1, r2, 10127)) {
            return true;
        }
        return false;
    }

    public Drawable getIcon() {
        return C24261Jm.A00(this.A01.A00, 2131233221);
    }

    public AnonymousClass38W(AnonymousClass118 r2, C18030ve r3) {
        C18070vi.A0j(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
    }

    public String BTj() {
        return "report_bug";
    }

    public String BWD() {
        return "";
    }

    public String BWI() {
        return this.A00;
    }

    public int Bac() {
        return 22;
    }

    public /* synthetic */ boolean BgM() {
        return false;
    }

    public /* synthetic */ boolean CLm() {
        return true;
    }
}
