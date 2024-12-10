package X;

import android.widget.CheckBox;
import com.whatsapp.collections.MarginCorrectedViewPager;
import com.whatsapp.settings.chat.theme.adapter.CirclePageIndicator;
import com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5UO  reason: invalid class name */
public final class AnonymousClass5UO extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ThemesThemePreviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UO(ThemesThemePreviewActivity themesThemePreviewActivity) {
        super(1);
        this.this$0 = themesThemePreviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        AnonymousClass4VO r3;
        List list = (List) obj;
        if (list != null) {
            ThemesThemePreviewActivity themesThemePreviewActivity = this.this$0;
            int i = 0;
            if (themesThemePreviewActivity.A4l().getAdapter() != null) {
                MarginCorrectedViewPager A4l = themesThemePreviewActivity.A4l();
                Iterator it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (((AnonymousClass4VO) it.next()).A03) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                int size = list.size();
                if (!themesThemePreviewActivity.A06 && size > 12) {
                    if (i2 % 2 == 0) {
                        i2 /= 2;
                    } else {
                        i2 = ((size + i2) - 1) / 2;
                    }
                }
                A4l.A0J(i2, false);
            } else {
                AnonymousClass10I r10 = themesThemePreviewActivity.A05;
                C18070vi.A0W(r10);
                String A4f = themesThemePreviewActivity.A4f();
                boolean z = themesThemePreviewActivity.A06;
                C87864Xj r9 = themesThemePreviewActivity.A05;
                if (r9 != null) {
                    C74393Zu r6 = new C74393Zu(themesThemePreviewActivity, themesThemePreviewActivity.A4e(), r9, r10, A4f, list, themesThemePreviewActivity.A0B, z, themesThemePreviewActivity.A4k());
                    themesThemePreviewActivity.A4l().setAdapter(r6);
                    if (themesThemePreviewActivity.A06) {
                        C91634g0.A00(themesThemePreviewActivity, themesThemePreviewActivity.A4e().A0D, new AnonymousClass5UN(r6), 35);
                    }
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        int i3 = i + 1;
                        r3 = (AnonymousClass4VO) it2.next();
                        String stringExtra = themesThemePreviewActivity.getIntent().getStringExtra("THEME_ID_KEY");
                        if ((!themesThemePreviewActivity.A06 || !C18070vi.A18(r3.A00.A00, stringExtra)) && (themesThemePreviewActivity.A06 || !C18070vi.A18(r3.A00(), stringExtra))) {
                            i = i3;
                        }
                    }
                    themesThemePreviewActivity.A03 = r3;
                    int size2 = list.size();
                    if (!themesThemePreviewActivity.A06 && size2 > 12) {
                        if (i % 2 == 0) {
                            i /= 2;
                        } else {
                            i = ((size2 + i) - 1) / 2;
                        }
                    }
                    themesThemePreviewActivity.A4l().setCurrentItem(i);
                    CirclePageIndicator circlePageIndicator = themesThemePreviewActivity.A04;
                    if (circlePageIndicator == null) {
                        str = "pagerIndicator";
                    } else {
                        int size3 = list.size();
                        circlePageIndicator.setCurrentPage(i);
                        circlePageIndicator.setPageCount(size3);
                        circlePageIndicator.requestLayout();
                        ThemesThemePreviewActivity.A0Q(themesThemePreviewActivity, i);
                        themesThemePreviewActivity.A4e().A0V(r3.A00);
                        themesThemePreviewActivity.A4g();
                        if (!themesThemePreviewActivity.A06) {
                            CheckBox checkBox = themesThemePreviewActivity.A00;
                            if (checkBox == null) {
                                str = "showDoodleCheckbox";
                            } else {
                                C90874em.A00(checkBox, r6, 24);
                            }
                        }
                    }
                } else {
                    str = "downloadableWallpaperManager";
                }
                C18070vi.A11(str);
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
