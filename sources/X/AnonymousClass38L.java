package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.38L  reason: invalid class name */
public final class AnonymousClass38L implements C108635c2 {
    public String A00 = "";
    public final AnonymousClass118 A01;
    public final AnonymousClass00H A02;

    public View BbT(View view) {
        C18070vi.A0d(view, 0);
        return view.findViewById(2131427811);
    }

    public void CJs(String str) {
        C18070vi.A0d(str, 0);
        this.A00 = str;
    }

    public boolean CLm() {
        return false;
    }

    public String BXZ() {
        return C18070vi.A0G(this.A01, 2131895976);
    }

    public boolean Bh4() {
        return ((AnonymousClass1XL) this.A02.get()).A05();
    }

    public AnonymousClass38L(AnonymousClass118 r2, AnonymousClass00H r3) {
        C18070vi.A0j(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
    }

    public /* synthetic */ List BMb() {
        return C18460wS.A00;
    }

    public String BTj() {
        return "app_authentication";
    }

    public String BWD() {
        return "screen_lock";
    }

    public String BWI() {
        return this.A00;
    }

    public int Bac() {
        return 11;
    }

    public /* synthetic */ boolean BgM() {
        return false;
    }

    public /* synthetic */ Drawable getIcon() {
        return null;
    }
}
