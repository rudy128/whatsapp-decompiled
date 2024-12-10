package X;

import android.view.ContextThemeWrapper;
import com.whatsapp.WaImageView;
import com.whatsapp.settings.chat.theme.adapter.CirclePageIndicator;
import com.whatsapp.settings.chat.theme.preview.ThemesDownloadablePreviewActivity;
import java.util.List;

/* renamed from: X.5VV  reason: invalid class name */
public final class AnonymousClass5VV extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C98474rD $startingPos;
    public final /* synthetic */ List $whatsappThumbnailDrawableRes;
    public final /* synthetic */ ThemesDownloadablePreviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VV(ThemesDownloadablePreviewActivity themesDownloadablePreviewActivity, List list, C98474rD r4) {
        super(1);
        this.this$0 = themesDownloadablePreviewActivity;
        this.$whatsappThumbnailDrawableRes = list;
        this.$startingPos = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ContextThemeWrapper contextThemeWrapper;
        String str;
        String str2;
        List<AnonymousClass4VO> list = (List) obj;
        C18070vi.A0b(list);
        ThemesDownloadablePreviewActivity themesDownloadablePreviewActivity = this.this$0;
        List list2 = this.$whatsappThumbnailDrawableRes;
        C98474rD r1 = this.$startingPos;
        for (AnonymousClass4VO r5 : list) {
            if (r5.A03) {
                C88434Zr r52 = r5.A00;
                if (r52 instanceof C80373x2) {
                    contextThemeWrapper = new ContextThemeWrapper(themesDownloadablePreviewActivity, ((C80373x2) r52).A00);
                } else {
                    contextThemeWrapper = themesDownloadablePreviewActivity;
                }
                if (themesDownloadablePreviewActivity.A4l().getAdapter() != null) {
                    r1.element = themesDownloadablePreviewActivity.A4l().getCurrentItem();
                }
                boolean A4k = themesDownloadablePreviewActivity.A4k();
                AnonymousClass10I r14 = themesDownloadablePreviewActivity.A05;
                C18070vi.A0X(r14);
                C87864Xj r13 = themesDownloadablePreviewActivity.A04;
                if (r13 != null) {
                    AnonymousClass4QK r12 = themesDownloadablePreviewActivity.A07;
                    List list3 = themesDownloadablePreviewActivity.A05;
                    if (list3 == null) {
                        str2 = "thumbnailUris";
                    } else {
                        C18460wS r18 = C18460wS.A00;
                        themesDownloadablePreviewActivity.A03 = new AnonymousClass478(contextThemeWrapper, themesDownloadablePreviewActivity.A4e(), r12, r13, r14, themesDownloadablePreviewActivity.A4f(), list3, list2, r18, A4k);
                        themesDownloadablePreviewActivity.A4l().setAdapter(themesDownloadablePreviewActivity.A03);
                        themesDownloadablePreviewActivity.A4l().setCurrentItem(r1.element);
                        CirclePageIndicator circlePageIndicator = themesDownloadablePreviewActivity.A02;
                        str2 = "pagerIndicator";
                        if (circlePageIndicator != null) {
                            int i = r1.element;
                            int size = list.size();
                            circlePageIndicator.setCurrentPage(i);
                            circlePageIndicator.setPageCount(size);
                            circlePageIndicator.requestLayout();
                            CirclePageIndicator circlePageIndicator2 = themesDownloadablePreviewActivity.A02;
                            if (circlePageIndicator2 != null) {
                                circlePageIndicator2.setVisibility(0);
                                WaImageView waImageView = themesDownloadablePreviewActivity.A00;
                                if (waImageView == null) {
                                    str = "themeButton";
                                    C18070vi.A11(str);
                                } else {
                                    AnonymousClass3MX.A1B(contextThemeWrapper, waImageView, 2131232486);
                                    themesDownloadablePreviewActivity.A4g();
                                    if (C18070vi.A19(themesDownloadablePreviewActivity.A0B, false)) {
                                        themesDownloadablePreviewActivity.A0B = AnonymousClass000.A0i();
                                    }
                                }
                            }
                        }
                    }
                    C18070vi.A11(str2);
                } else {
                    str = "downloadableWallpaperManager";
                    C18070vi.A11(str);
                }
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
