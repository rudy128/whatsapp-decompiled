package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.settings.chat.theme.preview.ThemesSolidColorWallpaperPreview;
import java.util.List;

/* renamed from: X.3Zt  reason: invalid class name and case insensitive filesystem */
public abstract class C74383Zt extends AnonymousClass1b8 {
    public Context A00;
    public SparseIntArray A01 = new SparseIntArray();
    public List A02 = AnonymousClass000.A13();
    public boolean A03;
    public final int A04 = AnonymousClass3Ma.A00(this.A00, 2130968798, 2131099872);

    public int A0A(Object obj) {
        return -2;
    }

    public Object A0F(ViewGroup viewGroup, int i) {
        String A0j;
        Pair create;
        String A0q;
        ViewGroup viewGroup2 = viewGroup;
        C18070vi.A0d(viewGroup2, 0);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        boolean z = this instanceof AnonymousClass477;
        if (z) {
            ThemesSolidColorWallpaperPreview themesSolidColorWallpaperPreview = ((AnonymousClass477) this).A02;
            String A0F = C18070vi.A0F(themesSolidColorWallpaperPreview, 2131896832);
            if (themesSolidColorWallpaperPreview.A00 == null) {
                A0q = themesSolidColorWallpaperPreview.getString(2131896834);
            } else {
                A0q = C17880vN.A0q(themesSolidColorWallpaperPreview, themesSolidColorWallpaperPreview.A4f(), AnonymousClass3MW.A1a(), 0, 2131896833);
            }
            C18070vi.A0b(A0q);
            create = Pair.create(A0F, A0q);
        } else {
            AnonymousClass478 r8 = (AnonymousClass478) this;
            String A0F2 = C18070vi.A0F(r8.A00, 2131896832);
            String str = r8.A05;
            Context context = r8.A00;
            if (str == null) {
                A0j = context.getString(2131896834);
            } else {
                A0j = C72473Md.A0j(context, str, 2131896833);
            }
            C18070vi.A0b(A0j);
            create = Pair.create(A0F2, A0j);
        }
        C18070vi.A0X(create);
        AnonymousClass47S r11 = new AnonymousClass47S(this.A00, (Resources) null, (String) create.first, (String) create.second, this.A04);
        this.A02.add(r11);
        int i2 = i;
        if (this.A03) {
            r11.setDimLevel(A0I(i2));
        }
        r11.setLayoutParams(layoutParams);
        viewGroup2.addView(r11);
        if (z) {
            AnonymousClass477 r3 = (AnonymousClass477) this;
            boolean z2 = r3.A00;
            int[] iArr = r3.A02.A03;
            if (iArr == null) {
                C18070vi.A11("colors");
                throw null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(iArr[i]);
            if (z2) {
                Drawable[] drawableArr = new Drawable[2];
                AnonymousClass001.A1Q(colorDrawable, C88594aB.A01(r11.getContext(), i2), drawableArr);
                r11.setWallpaper(AnonymousClass4aX.A00(new LayerDrawable(drawableArr)));
            } else {
                r11.A04.setImageDrawable(colorDrawable);
            }
            Integer valueOf = Integer.valueOf(i2);
            r3.A01.put(valueOf, Boolean.valueOf(r3.A00));
            r11.setTag(valueOf);
            return r11;
        }
        AnonymousClass478 r32 = (AnonymousClass478) this;
        r11.setDownloadClickListener(new AnonymousClass78T(r32, i2, 25, r11));
        List list = r32.A06;
        if (i2 < list.size()) {
            AnonymousClass478.A00(r32, r11, i2);
        } else {
            int size = i - list.size();
            int A0n = AnonymousClass001.A0n(r32.A08, size);
            int A0n2 = AnonymousClass001.A0n(r32.A07, size);
            C826049a r4 = new C826049a(r11.getContext(), r11.A00, r11.A06, r11.A04, A0n, A0n2);
            r11.A02.setVisibility(8);
            r32.A02.A00(i2);
            C17890vO.A0t((A34) r32.A09.put(Integer.valueOf(i2), r4));
            C17890vO.A0u(r4, r32.A04);
        }
        AnonymousClass3MY.A19(r11, i2);
        return r11;
    }

    public final int A0I(int i) {
        int i2 = this.A01.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (this instanceof AnonymousClass477) {
            return 0;
        }
        return 50;
    }

    public C74383Zt(Context context, boolean z) {
        this.A00 = context;
        this.A03 = z;
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        C18070vi.A0i(viewGroup, obj);
        viewGroup.removeView((View) obj);
        C41681wt.A00(this.A02).remove(obj);
    }
}
