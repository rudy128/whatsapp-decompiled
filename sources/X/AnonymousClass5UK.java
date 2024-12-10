package X;

import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.settings.chat.theme.preview.ThemesGalleryWallpaperPreviewActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5UK  reason: invalid class name */
public final class AnonymousClass5UK extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ThemesGalleryWallpaperPreviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UK(ThemesGalleryWallpaperPreviewActivity themesGalleryWallpaperPreviewActivity) {
        super(1);
        this.this$0 = themesGalleryWallpaperPreviewActivity;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.3uP, X.3ta, android.view.View, X.3uO] */
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        ContextThemeWrapper contextThemeWrapper;
        String A0q;
        List list = (List) obj;
        C18070vi.A0b(list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((AnonymousClass4VO) obj2).A03) {
                break;
            }
        }
        AnonymousClass4VO r1 = (AnonymousClass4VO) obj2;
        if (r1 != null) {
            C88434Zr r12 = r1.A00;
            ThemesGalleryWallpaperPreviewActivity themesGalleryWallpaperPreviewActivity = this.this$0;
            ViewGroup A0F = AnonymousClass3MX.A0F(themesGalleryWallpaperPreviewActivity, 2131434043);
            if (r12 instanceof C80373x2) {
                contextThemeWrapper = new ContextThemeWrapper(themesGalleryWallpaperPreviewActivity, ((C80373x2) r12).A00);
            } else {
                contextThemeWrapper = themesGalleryWallpaperPreviewActivity;
            }
            WaImageView waImageView = themesGalleryWallpaperPreviewActivity.A01;
            if (waImageView == null) {
                C18070vi.A11("themeButton");
                throw null;
            }
            AnonymousClass3MX.A1B(contextThemeWrapper, waImageView, 2131232486);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            AnonymousClass210 A0a = C72473Md.A0a(themesGalleryWallpaperPreviewActivity, (AnonymousClass1BI) null, AnonymousClass1PP.A00(themesGalleryWallpaperPreviewActivity.A02, themesGalleryWallpaperPreviewActivity.A05, false), false);
            A0a.A0i(themesGalleryWallpaperPreviewActivity.getString(2131896835));
            AnonymousClass11P r2 = themesGalleryWallpaperPreviewActivity.A05;
            AnonymousClass11S r0 = themesGalleryWallpaperPreviewActivity.A02;
            AnonymousClass210 A0a2 = C72473Md.A0a(themesGalleryWallpaperPreviewActivity, AnonymousClass11S.A00(r0), AnonymousClass1PP.A00(r0, r2, false), true);
            if (themesGalleryWallpaperPreviewActivity.A00 == null) {
                A0q = themesGalleryWallpaperPreviewActivity.getString(2131896834);
            } else {
                A0q = C17880vN.A0q(themesGalleryWallpaperPreviewActivity, themesGalleryWallpaperPreviewActivity.A4f(), new Object[1], 0, 2131896833);
            }
            C18070vi.A0b(A0q);
            A0a2.A0i(A0q);
            A0a2.A0a(5);
            LinearLayout linearLayout = new LinearLayout(themesGalleryWallpaperPreviewActivity);
            linearLayout.setBackgroundResource(0);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(1);
            AnonymousClass3uO r7 = new AnonymousClass3uO(contextThemeWrapper, themesGalleryWallpaperPreviewActivity, A0a);
            r7.A1M();
            r7.A2W(true);
            r7.setEnabled(false);
            r7.setClickable(false);
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(2130970642, typedValue, true);
            ? r6 = new AnonymousClass3uO(new ContextThemeWrapper(contextThemeWrapper, typedValue.resourceId), (C108875cR) null, A0a2);
            AnonymousClass00H r02 = themesGalleryWallpaperPreviewActivity.A04;
            if (r02 != null) {
                r6.setBubbleResolver(new C75863lu(new C26993DOp(contextThemeWrapper, ((C84664Kj) r02.get()).A00)));
                r6.invalidate();
                r6.A2W(false);
                r6.setEnabled(false);
                r6.setClickable(false);
                int A01 = AnonymousClass3MW.A01(themesGalleryWallpaperPreviewActivity.getResources(), 2131165871);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(A01, 0, 0, 0);
                r6.setLayoutParams(layoutParams2);
                linearLayout.addView(r7);
                linearLayout.addView(r6);
                linearLayout.setClickable(false);
                A0F.addView(linearLayout);
            } else {
                C18070vi.A11("bubbleResolverFactoryLazy");
                throw null;
            }
        }
        if (C18070vi.A19(this.this$0.A0B, false)) {
            this.this$0.A0B = AnonymousClass000.A0i();
        }
        return C27621Wu.A00;
    }
}
