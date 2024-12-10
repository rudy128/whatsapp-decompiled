package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Zs  reason: invalid class name and case insensitive filesystem */
public abstract class C74373Zs extends AnonymousClass1b8 {
    public Context A00;
    public List A01 = AnonymousClass000.A13();
    public final Resources A02;

    public Object A0F(ViewGroup viewGroup, int i) {
        int i2;
        Pair create;
        Context context;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        boolean z = this instanceof AnonymousClass47Z;
        int i5 = i;
        if (z) {
            AnonymousClass47Z r8 = (AnonymousClass47Z) this;
            if (i == 0) {
                context = r8.A00;
                i3 = 2131891602;
            } else {
                int A0E = r8.A0E() - 1;
                context = r8.A00;
                i3 = 2131891603;
                if (i5 < A0E) {
                    i3 = 2131898424;
                }
            }
            String string = context.getString(i3);
            if (r8.A00 == null) {
                i4 = 2131898433;
                if (C28281Zt.A0B(context)) {
                    i4 = 2131898432;
                }
            } else {
                i4 = 2131898436;
                if (r8.A07) {
                    i4 = 2131898437;
                }
            }
            create = Pair.create(string, context.getString(i4));
        } else {
            SolidColorWallpaperPreview solidColorWallpaperPreview = ((AnonymousClass47Y) this).A02;
            if (i == 0) {
                i2 = 2131898419;
            } else {
                i2 = 2131898420;
                if (i5 < solidColorWallpaperPreview.A0B.length - 1) {
                    i2 = 2131898406;
                }
            }
            create = Pair.create(solidColorWallpaperPreview.getString(i2), solidColorWallpaperPreview.A4b());
        }
        Context context2 = this.A00;
        AnonymousClass47S r12 = new AnonymousClass47S(context2, this.A02, (String) create.first, (String) create.second, AnonymousClass3Ma.A00(context2, 2130968798, 2131099872));
        this.A01.add(r12);
        r12.setLayoutParams(layoutParams);
        viewGroup.addView(r12);
        if (z) {
            AnonymousClass47Z r1 = (AnonymousClass47Z) this;
            r12.setDownloadClickListener(new AnonymousClass78T(r1, i5, 26, r12));
            List list = r1.A03;
            if (i5 < list.size()) {
                AnonymousClass47Z.A00(r12, r1, i5);
                return r12;
            }
            int size = i - list.size();
            C826049a r5 = new C826049a(r12.getContext(), r12.A00, r12.A06, r12.A04, AnonymousClass001.A0n(r1.A05, size), AnonymousClass001.A0n(r1.A04, size));
            r12.A02.setVisibility(8);
            DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = r1.A01.A01;
            Set set = downloadableWallpaperPreviewActivity.A08;
            Integer valueOf = Integer.valueOf(i5);
            set.add(valueOf);
            if (downloadableWallpaperPreviewActivity.A00.getCurrentItem() == i5) {
                downloadableWallpaperPreviewActivity.A00.setEnabled(true);
            }
            C17890vO.A0t((A34) r1.A06.put(valueOf, r5));
            C17890vO.A0u(r5, r1.A02);
            return r12;
        }
        AnonymousClass47Y r13 = (AnonymousClass47Y) this;
        r12.setBackgroundColor(r13.A02.A0B[i]);
        if (r13.A00) {
            r12.A05.setImageDrawable(C88594aB.A01(r12.getContext(), i5));
        } else {
            r12.A05.setImageDrawable((Drawable) null);
        }
        Map map = r13.A01;
        Integer valueOf2 = Integer.valueOf(i5);
        map.put(valueOf2, Boolean.valueOf(r13.A00));
        r12.setTag(valueOf2);
        return r12;
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        viewGroup.removeView((View) obj);
        this.A01.remove(obj);
    }

    public C74373Zs(Context context, Resources resources) {
        this.A00 = context;
        this.A02 = resources;
    }
}
