package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.38P  reason: invalid class name */
public final class AnonymousClass38P implements C108635c2 {
    public String A00 = "";
    public final AnonymousClass118 A01;
    public final C18030ve A02;

    public View BbT(View view) {
        C18070vi.A0d(view, 0);
        return view.findViewById(2131435274);
    }

    public void CJs(String str) {
        C18070vi.A0d(str, 0);
        this.A00 = str;
    }

    public List BMb() {
        return C18070vi.A0L(this.A01, 2131895176);
    }

    public String BXZ() {
        return C18070vi.A0G(this.A01, 2131895830);
    }

    public Drawable getIcon() {
        return C24261Jm.A00(this.A01.A00, 2131233221);
    }

    public AnonymousClass38P(AnonymousClass118 r2, C18030ve r3) {
        C18070vi.A0j(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public String BTj() {
        return "debug";
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

    public boolean Bh4() {
        return false;
    }

    public /* synthetic */ boolean CLm() {
        return true;
    }
}
