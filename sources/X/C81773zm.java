package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3zm  reason: invalid class name and case insensitive filesystem */
public final class C81773zm extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;

    public C81773zm() {
        super(5264, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
    }

    public List validate() {
        if (this.A02 == null) {
            return C72483Me.A0Z("chat_wallpaper", C18460wS.A00, C18070vi.A0M("chat_wallpaper_type"));
        }
        return C18460wS.A00;
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 5);
        A13.put(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02);
        AnonymousClass184.A0X(A13, 4);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamChatWallpaper {");
        AnonymousClass186.A00(this.A00, "chatWallpaperChangeApplied", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "chatWallpaperSource", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "chatWallpaperType", A10);
    }
}
