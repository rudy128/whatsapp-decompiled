package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.478  reason: invalid class name */
public final class AnonymousClass478 extends C74383Zt {
    public boolean[] A00;
    public final ChatThemeViewModel A01;
    public final AnonymousClass4QK A02;
    public final C87864Xj A03;
    public final AnonymousClass10I A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final Map A09 = C17880vN.A11();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass478(Context context, ChatThemeViewModel chatThemeViewModel, AnonymousClass4QK r7, C87864Xj r8, AnonymousClass10I r9, String str, List list, List list2, List list3, boolean z) {
        super(context, z);
        C18070vi.A0g(context, 1, r7);
        C18070vi.A0d(list2, 7);
        C18070vi.A0d(list3, 8);
        this.A04 = r9;
        this.A03 = r8;
        this.A02 = r7;
        this.A06 = list;
        this.A08 = list2;
        this.A07 = list3;
        this.A05 = str;
        this.A01 = chatThemeViewModel;
        int size = list.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = false;
        }
        this.A00 = zArr;
    }

    public static final void A00(AnonymousClass478 r8, AnonymousClass47S r9, int i) {
        ChatThemeViewModel chatThemeViewModel = r8.A01;
        List list = r8.A06;
        String path = ((Uri) list.get(i)).getPath();
        if (path == null) {
            path = "";
        }
        Bitmap bitmap = (Bitmap) chatThemeViewModel.A0K.A0A(path);
        if (bitmap != null) {
            r9.setWallpaper(bitmap);
            return;
        }
        r8.A00[i] = true;
        r9.postDelayed(new C70863Cu(r8, i, 41, r9), TimeUnit.SECONDS.toMillis(1) / 2);
        C827149l r2 = new C827149l(r9.getContext(), (Uri) list.get(i), new C97774q2(r8, i, 0, r9), r8.A03);
        A34 a34 = (A34) r8.A09.put(Integer.valueOf(i), r2);
        if (a34 != null) {
            a34.A0B(true);
        }
        AnonymousClass3MW.A1T(r2, r8.A04, 0);
    }

    public int A0E() {
        return this.A06.size() + this.A08.size();
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        C18070vi.A0i(viewGroup, obj);
        super.A0G(viewGroup, obj, i);
        C17890vO.A0t((A34) this.A09.remove(Integer.valueOf(i)));
    }

    public boolean A0H(View view, Object obj) {
        C18070vi.A0h(view, obj);
        return AnonymousClass000.A1Z(view, obj);
    }
}
