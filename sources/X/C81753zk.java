package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3zk  reason: invalid class name and case insensitive filesystem */
public final class C81753zk extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;

    public C81753zk() {
        super(5284, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
    }

    public List validate() {
        if (this.A01 == null) {
            return C72483Me.A0Z("chat_list_wallpaper", C18460wS.A00, C18070vi.A0M("chat_themes_enabled"));
        }
        return C18460wS.A00;
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamChatListWallpaper {");
        AnonymousClass186.A00(this.A00, "anyWallpaperApplied", A10);
        return AnonymousClass184.A0S(this.A01, "chatThemesEnabled", A10);
    }
}
