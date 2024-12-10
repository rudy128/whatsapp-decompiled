package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3zp  reason: invalid class name and case insensitive filesystem */
public final class C81803zp extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;

    public C81803zp() {
        super(6036, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A03);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A02);
        r3.CHf(6, this.A04);
        r3.CHf(7, this.A05);
    }

    public List validate() {
        C18460wS r2 = C18460wS.A00;
        ArrayList A0U = AnonymousClass184.A0U(AnonymousClass184.A00("appearance_type", "chat_theme_screen", r2));
        if (this.A00 == null) {
            A0U.add(AnonymousClass184.A00("chat_theme_change_applied", "chat_theme_screen", r2));
        }
        if (this.A03 == null) {
            A0U.add(AnonymousClass184.A00("chat_theme_id", "chat_theme_screen", r2));
        }
        if (this.A01 == null) {
            A0U.add(AnonymousClass184.A00("chat_theme_source", "chat_theme_screen", r2));
        }
        if (this.A02 == null) {
            A0U.add(AnonymousClass184.A00("chat_wallpaper_type", "chat_theme_screen", r2));
        }
        return A0U;
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 1);
        A13.put(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C17880vN.A0i(), this.A00, A13), this.A03, A13), this.A01, A13), this.A02, A13), this.A04, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamChatThemeScreen {");
        AnonymousClass186.A00(this.A00, "chatThemeChangeApplied", A10);
        AnonymousClass186.A00(this.A03, "chatThemeId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "chatThemeSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "chatWallpaperType", A10);
        AnonymousClass186.A00(this.A04, "colorSchemeId", A10);
        return AnonymousClass184.A0S(this.A05, "wallpaperId", A10);
    }
}
