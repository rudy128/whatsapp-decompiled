package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.38Z  reason: invalid class name */
public final class AnonymousClass38Z implements C108635c2 {
    public String A00 = "";
    public final AnonymousClass118 A01;
    public final C19830z4 A02;
    public final AnonymousClass00H A03;

    public View BbT(View view) {
        C18070vi.A0d(view, 0);
        return view.findViewById(2131433211);
    }

    public void CJs(String str) {
        C18070vi.A0d(str, 0);
        this.A00 = str;
    }

    public boolean CLm() {
        return false;
    }

    public String BXZ() {
        return C18070vi.A0G(this.A01, 2131895974);
    }

    public boolean Bh4() {
        if (!((AnonymousClass1XL) this.A03.get()).A05() || !this.A02.A2T()) {
            return false;
        }
        return true;
    }

    public AnonymousClass38Z(AnonymousClass118 r2, C19830z4 r3, AnonymousClass00H r4) {
        C18070vi.A0o(r2, r4, r3);
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public /* synthetic */ List BMb() {
        return C18460wS.A00;
    }

    public String BTj() {
        return "show_content_in_notifications";
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
