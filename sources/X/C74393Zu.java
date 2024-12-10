package X;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Zu  reason: invalid class name and case insensitive filesystem */
public final class C74393Zu extends AnonymousClass1b8 {
    public Context A00;
    public SparseArray A01 = new SparseArray();
    public SparseIntArray A02 = new SparseIntArray();
    public AnonymousClass4SC A03;
    public List A04 = AnonymousClass000.A13();
    public boolean A05;
    public boolean A06 = true;
    public final ChatThemeViewModel A07;
    public final C87864Xj A08;
    public final AnonymousClass10I A09;
    public final String A0A;
    public final List A0B;
    public final Map A0C = C17880vN.A11();
    public final Set A0D;
    public final boolean A0E;

    public C74393Zu(Context context, ChatThemeViewModel chatThemeViewModel, C87864Xj r5, AnonymousClass10I r6, String str, List list, Set set, boolean z, boolean z2) {
        C18070vi.A0d(set, 9);
        this.A09 = r6;
        this.A00 = context;
        this.A0B = list;
        this.A0A = str;
        this.A0E = z;
        this.A08 = r5;
        this.A07 = chatThemeViewModel;
        this.A05 = z2;
        this.A0D = set;
    }

    public int A0A(Object obj) {
        return -2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        if (r1 != -1) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0101, code lost:
        if (r1 != null) goto L_0x0103;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0F(android.view.ViewGroup r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            r0 = -1
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r0, r0)
            boolean r3 = r8.A0E
            android.content.Context r1 = r8.A00
            r0 = 2131896831(0x7f1229ff, float:1.9428534E38)
            if (r3 == 0) goto L_0x0016
            r0 = 2131896830(0x7f1229fe, float:1.9428532E38)
        L_0x0016:
            java.lang.String r6 = X.C18070vi.A0F(r1, r0)
            java.lang.String r2 = r8.A0A
            android.content.Context r1 = r8.A00
            if (r2 != 0) goto L_0x0125
            r0 = 2131896834(0x7f122a02, float:1.942854E38)
            java.lang.String r7 = r1.getString(r0)
        L_0x0027:
            X.C18070vi.A0b(r7)
            android.util.SparseArray r1 = r8.A01
            r0 = 0
            java.lang.Object r1 = r1.get(r10, r0)
            X.4Zr r1 = (X.C88434Zr) r1
            if (r1 != 0) goto L_0x0043
            int r1 = A00(r8, r10, r10)
            java.util.List r0 = r8.A0B
            java.lang.Object r0 = r0.get(r1)
            X.4VO r0 = (X.AnonymousClass4VO) r0
            X.4Zr r1 = r0.A00
        L_0x0043:
            boolean r0 = r1 instanceof X.C80373x2
            if (r0 == 0) goto L_0x0121
            android.content.Context r2 = r8.A00
            X.3x2 r1 = (X.C80373x2) r1
            int r1 = r1.A00
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r2, r1)
        L_0x0052:
            X.3Pc r5 = new X.3Pc
            r5.<init>(r0, r6, r7)
            java.util.List r0 = r8.A04
            r0.add(r5)
            r5.setLayoutParams(r4)
            r9.addView(r5)
            if (r3 == 0) goto L_0x0081
            X.4SC r0 = r8.A03
            if (r0 == 0) goto L_0x007d
            android.graphics.drawable.Drawable r0 = r0.A00
            if (r0 == 0) goto L_0x007d
            r5.setWallpaper$app_product_settings_settings(r0)
            int r1 = r8.A0I(r10)
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x007d
            r0 = -1
            if (r1 == r0) goto L_0x007d
        L_0x007a:
            r5.setDimLevel(r1)
        L_0x007d:
            X.AnonymousClass3MY.A19(r5, r10)
            return r5
        L_0x0081:
            int r1 = A00(r8, r10, r10)
            java.util.List r0 = r8.A0B
            java.lang.Object r3 = r0.get(r1)
            X.4VO r3 = (X.AnonymousClass4VO) r3
            X.4SC r2 = r3.A01
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "DOWNLOADED"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00f2
            android.graphics.drawable.Drawable r6 = r2.A00
            if (r6 == 0) goto L_0x007d
            java.lang.String r2 = r3.A02
            if (r2 == 0) goto L_0x00ee
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r0 = r8.A07
            X.1ga r0 = r0.A0K
            java.lang.Object r1 = r0.A0A(r2)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L_0x00be
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1)
            r5.setWallpaper$app_product_settings_settings(r0)
        L_0x00b5:
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x007d
            int r1 = r8.A0I(r10)
            goto L_0x007a
        L_0x00be:
            android.net.Uri r4 = android.net.Uri.parse(r2)
            X.C18070vi.A0X(r4)
            X.4Xj r2 = r8.A08
            android.content.Context r1 = r5.getContext()
            X.4q3 r0 = new X.4q3
            r0.<init>(r4, r8, r5, r10)
            X.49l r3 = new X.49l
            r3.<init>(r1, r4, r0, r2)
            java.util.Map r0 = r8.A0C
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Object r1 = r0.put(r2, r3)
            X.A34 r1 = (X.A34) r1
            java.util.Set r0 = r8.A0D
            r0.add(r2)
            X.C17890vO.A0t(r1)
            X.10I r0 = r8.A09
            X.C17890vO.A0u(r3, r0)
        L_0x00ee:
            r5.setWallpaper$app_product_settings_settings(r6)
            goto L_0x00b5
        L_0x00f2:
            boolean r0 = r8.A06
            android.content.Context r4 = r5.getContext()
            if (r0 == 0) goto L_0x0108
            X.C18070vi.A0X(r4)
            X.3N2 r1 = X.C83944Hg.A00(r4)
            if (r1 == 0) goto L_0x007d
        L_0x0103:
            r5.setWallpaper$app_product_settings_settings(r1)
            goto L_0x007d
        L_0x0108:
            android.content.Context r3 = r5.getContext()
            r2 = 2130971972(0x7f040d44, float:1.7552697E38)
            r1 = 2131103140(0x7f060da4, float:1.7818738E38)
            r0 = 0
            int r0 = X.AnonymousClass1YL.A01(r3, r2, r1, r0)
            int r0 = X.C19740yt.A00(r4, r0)
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>(r0)
            goto L_0x0103
        L_0x0121:
            android.content.Context r0 = r8.A00
            goto L_0x0052
        L_0x0125:
            r0 = 2131896833(0x7f122a01, float:1.9428538E38)
            java.lang.String r7 = X.C72473Md.A0j(r1, r2, r0)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74393Zu.A0F(android.view.ViewGroup, int):java.lang.Object");
    }

    public static int A00(C74393Zu r2, int i, int i2) {
        if (!r2.A0E) {
            List list = r2.A0B;
            if (list.size() > 12) {
                int i3 = i * 2;
                if (i < (list.size() + 1) / 2) {
                    return i3;
                }
                return (i3 - list.size()) + 1;
            }
        }
        return i2;
    }

    public int A0E() {
        return this.A0B.size();
    }

    public final int A0I(int i) {
        int i2 = this.A02.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (C18070vi.A18(((AnonymousClass4VO) this.A0B.get(A00(this, i, i))).A01.A03, "DEFAULT")) {
            return 0;
        }
        return 50;
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        C18070vi.A0i(viewGroup, obj);
        viewGroup.removeView((View) obj);
        C41681wt.A00(this.A04).remove(obj);
    }

    public boolean A0H(View view, Object obj) {
        C18070vi.A0h(view, obj);
        return AnonymousClass000.A1Z(view, obj);
    }
}
