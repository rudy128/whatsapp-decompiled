package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3zq  reason: invalid class name and case insensitive filesystem */
public final class C81813zq extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public C81813zq() {
        super(5286, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(6, this.A04);
        r3.CHf(7, this.A02);
        r3.CHf(2, this.A03);
        r3.CHf(8, this.A05);
        r3.CHf(3, this.A06);
        r3.CHf(4, this.A01);
        r3.CHf(9, this.A07);
    }

    public List validate() {
        ArrayList arrayList;
        if (this.A02 == null) {
            arrayList = AnonymousClass184.A0U(AnonymousClass184.A00("chat_theme_source", "chat_thread_wallpaper", C18460wS.A00));
        } else {
            arrayList = null;
        }
        if (this.A05 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("color_scheme_id", "chat_thread_wallpaper", C18460wS.A00), arrayList);
        }
        if (this.A07 == null) {
            C59552mU A002 = AnonymousClass184.A00("wallpaper_id", "chat_thread_wallpaper", C18460wS.A00);
            if (arrayList != null) {
                arrayList.add(A002);
                return arrayList;
            }
            arrayList = AnonymousClass184.A0U(A002);
        }
        if (arrayList == null) {
            return C18460wS.A00;
        }
        return arrayList;
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 5);
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A0A(AnonymousClass184.A04(AnonymousClass184.A09(AnonymousClass184.A08(C17880vN.A0h(), this.A00, A13), this.A04, A13), this.A02, A13), this.A03, A13), this.A05, A13), this.A06, A13), this.A01, A13), this.A07);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamChatThreadWallpaper {");
        AnonymousClass186.A00(this.A00, "belongsToCommunity", A10);
        AnonymousClass186.A00(this.A04, "chatThemeId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "chatThemeSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "chatType", A10);
        AnonymousClass186.A00(this.A05, "colorSchemeId", A10);
        AnonymousClass186.A00(this.A06, "threadId", A10);
        AnonymousClass186.A00(this.A01, "wallpaperApplied", A10);
        return AnonymousClass184.A0S(this.A07, "wallpaperId", A10);
    }
}
