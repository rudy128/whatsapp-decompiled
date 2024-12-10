package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.38Q  reason: invalid class name */
public final class AnonymousClass38Q implements C108635c2 {
    public String A00 = "";
    public final AnonymousClass118 A01;
    public final C28391a8 A02;

    public View BbT(View view) {
        C18070vi.A0d(view, 0);
        return view.findViewById(2131435278);
    }

    public void CJs(String str) {
        C18070vi.A0d(str, 0);
        this.A00 = str;
    }

    public List BMb() {
        return C18070vi.A0L(this.A01, 2131895846);
    }

    public String BXZ() {
        return C18070vi.A0G(this.A01, 2131895845);
    }

    public boolean Bh4() {
        return this.A02.A03();
    }

    public Drawable getIcon() {
        Drawable A022 = AnonymousClass4aX.A02(this.A01.A00, 2131233299, 2131103152);
        C18070vi.A0X(A022);
        return A022;
    }

    public AnonymousClass38Q(AnonymousClass118 r2, C28391a8 r3) {
        C18070vi.A0j(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
    }

    public String BTj() {
        return "favorites";
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
