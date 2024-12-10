package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.home.ui.HomePlaceholderActivity;
import com.whatsapp.settings.chat.theme.adapter.CirclePageIndicator;
import com.whatsapp.settings.chat.theme.preview.ThemesDownloadablePreviewActivity;
import com.whatsapp.settings.chat.theme.preview.ThemesGalleryWallpaperPreviewActivity;
import com.whatsapp.settings.chat.theme.preview.ThemesSolidColorWallpaperPreview;
import com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.4fW  reason: invalid class name and case insensitive filesystem */
public class C91334fW implements AnonymousClass1HE {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C91334fW(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final AnonymousClass1HO BlX(View view, AnonymousClass1HO r13) {
        String str;
        if (this.A00 != 0) {
            View view2 = (View) this.A01;
            AnonymousClass47H r5 = (AnonymousClass47H) this.A02;
            C18070vi.A0d(r13, 3);
            C33321id A07 = r13.A07(135);
            C18070vi.A0X(A07);
            C72463Mc.A14(view2, view2.getPaddingLeft(), A07.A03);
            if (r5 instanceof ThemesThemePreviewActivity) {
                ThemesThemePreviewActivity themesThemePreviewActivity = (ThemesThemePreviewActivity) r5;
                View[] viewArr = new View[5];
                FrameLayout frameLayout = themesThemePreviewActivity.A01;
                if (frameLayout != null) {
                    int i = 0;
                    viewArr[0] = frameLayout;
                    WDSButton wDSButton = themesThemePreviewActivity.A08;
                    if (wDSButton != null) {
                        viewArr[1] = wDSButton;
                        CheckBox checkBox = themesThemePreviewActivity.A00;
                        if (checkBox != null) {
                            viewArr[2] = checkBox;
                            WaImageView waImageView = themesThemePreviewActivity.A01;
                            if (waImageView != null) {
                                viewArr[3] = waImageView;
                                CirclePageIndicator circlePageIndicator = themesThemePreviewActivity.A04;
                                if (circlePageIndicator != null) {
                                    List A0O = C18070vi.A0O(circlePageIndicator, viewArr, 4);
                                    Integer[] numArr = new Integer[5];
                                    C17880vN.A1T(numArr, 2131165858, 0);
                                    C17880vN.A1T(numArr, 2131165857, 1);
                                    numArr[2] = 2131165886;
                                    numArr[3] = 2131165886;
                                    List A0O2 = C18070vi.A0O(2131169546, numArr, 4);
                                    for (Object next : A0O) {
                                        int i2 = i + 1;
                                        if (i >= 0) {
                                            AnonymousClass47H.A0V(themesThemePreviewActivity, A07, next, A0O2, i);
                                            i = i2;
                                        }
                                    }
                                    return AnonymousClass1HO.A01;
                                }
                                str = "pagerIndicator";
                                C18070vi.A11(str);
                                throw null;
                            }
                            str = "themeButton";
                            C18070vi.A11(str);
                            throw null;
                        }
                        str = "showDoodleCheckbox";
                        C18070vi.A11(str);
                        throw null;
                    }
                    str = "darkModeButton";
                    C18070vi.A11(str);
                    throw null;
                }
                str = "dimSliderContainer";
                C18070vi.A11(str);
                throw null;
            } else if (r5 instanceof ThemesSolidColorWallpaperPreview) {
                ThemesSolidColorWallpaperPreview themesSolidColorWallpaperPreview = (ThemesSolidColorWallpaperPreview) r5;
                View[] viewArr2 = new View[4];
                CheckBox checkBox2 = themesSolidColorWallpaperPreview.A00;
                if (checkBox2 != null) {
                    int i3 = 0;
                    viewArr2[0] = checkBox2;
                    FrameLayout frameLayout2 = themesSolidColorWallpaperPreview.A01;
                    if (frameLayout2 != null) {
                        viewArr2[1] = frameLayout2;
                        WDSButton wDSButton2 = themesSolidColorWallpaperPreview.A08;
                        if (wDSButton2 != null) {
                            viewArr2[2] = wDSButton2;
                            CirclePageIndicator circlePageIndicator2 = themesSolidColorWallpaperPreview.A02;
                            if (circlePageIndicator2 != null) {
                                List A0O3 = C18070vi.A0O(circlePageIndicator2, viewArr2, 3);
                                Integer[] numArr2 = new Integer[4];
                                C17880vN.A1T(numArr2, 2131165886, 0);
                                C17880vN.A1T(numArr2, 2131165858, 1);
                                C17880vN.A1T(numArr2, 2131165857, 2);
                                List A0O4 = C18070vi.A0O(2131169546, numArr2, 3);
                                for (Object next2 : A0O3) {
                                    int i4 = i3 + 1;
                                    if (i3 >= 0) {
                                        AnonymousClass47H.A0V(themesSolidColorWallpaperPreview, A07, next2, A0O4, i3);
                                        i3 = i4;
                                    }
                                }
                                return AnonymousClass1HO.A01;
                            }
                            str = "pagerIndicator";
                            C18070vi.A11(str);
                            throw null;
                        }
                        str = "darkModeButton";
                        C18070vi.A11(str);
                        throw null;
                    }
                    str = "dimSliderContainer";
                    C18070vi.A11(str);
                    throw null;
                }
                str = "showDoodleCheckbox";
                C18070vi.A11(str);
                throw null;
            } else if (r5 instanceof ThemesGalleryWallpaperPreviewActivity) {
                ThemesGalleryWallpaperPreviewActivity themesGalleryWallpaperPreviewActivity = (ThemesGalleryWallpaperPreviewActivity) r5;
                View[] viewArr3 = new View[3];
                WaImageView waImageView2 = themesGalleryWallpaperPreviewActivity.A01;
                if (waImageView2 != null) {
                    int i5 = 0;
                    viewArr3[0] = waImageView2;
                    FrameLayout frameLayout3 = themesGalleryWallpaperPreviewActivity.A01;
                    if (frameLayout3 != null) {
                        viewArr3[1] = frameLayout3;
                        WDSButton wDSButton3 = themesGalleryWallpaperPreviewActivity.A08;
                        if (wDSButton3 != null) {
                            List A0O5 = C18070vi.A0O(wDSButton3, viewArr3, 2);
                            Integer[] numArr3 = new Integer[3];
                            C17880vN.A1T(numArr3, 2131165886, 0);
                            C17880vN.A1T(numArr3, 2131165858, 1);
                            List A0O6 = C18070vi.A0O(2131165857, numArr3, 2);
                            for (Object next3 : A0O5) {
                                int i6 = i5 + 1;
                                if (i5 >= 0) {
                                    AnonymousClass47H.A0V(themesGalleryWallpaperPreviewActivity, A07, next3, A0O6, i5);
                                    i5 = i6;
                                }
                            }
                            return AnonymousClass1HO.A01;
                        }
                        str = "darkModeButton";
                        C18070vi.A11(str);
                        throw null;
                    }
                    str = "dimSliderContainer";
                    C18070vi.A11(str);
                    throw null;
                }
                str = "themeButton";
                C18070vi.A11(str);
                throw null;
            } else {
                ThemesDownloadablePreviewActivity themesDownloadablePreviewActivity = (ThemesDownloadablePreviewActivity) r5;
                View[] viewArr4 = new View[4];
                WaImageView waImageView3 = themesDownloadablePreviewActivity.A00;
                if (waImageView3 != null) {
                    int i7 = 0;
                    viewArr4[0] = waImageView3;
                    FrameLayout frameLayout4 = themesDownloadablePreviewActivity.A01;
                    if (frameLayout4 != null) {
                        viewArr4[1] = frameLayout4;
                        WDSButton wDSButton4 = themesDownloadablePreviewActivity.A08;
                        if (wDSButton4 != null) {
                            viewArr4[2] = wDSButton4;
                            CirclePageIndicator circlePageIndicator3 = themesDownloadablePreviewActivity.A02;
                            if (circlePageIndicator3 != null) {
                                List A0O7 = C18070vi.A0O(circlePageIndicator3, viewArr4, 3);
                                Integer[] numArr4 = new Integer[4];
                                C17880vN.A1T(numArr4, 2131165886, 0);
                                C17880vN.A1T(numArr4, 2131165858, 1);
                                C17880vN.A1T(numArr4, 2131165857, 2);
                                List A0O8 = C18070vi.A0O(2131169546, numArr4, 3);
                                for (Object next4 : A0O7) {
                                    int i8 = i7 + 1;
                                    if (i7 >= 0) {
                                        AnonymousClass47H.A0V(themesDownloadablePreviewActivity, A07, next4, A0O8, i7);
                                        i7 = i8;
                                    }
                                }
                                return AnonymousClass1HO.A01;
                            }
                            str = "pagerIndicator";
                            C18070vi.A11(str);
                            throw null;
                        }
                        str = "darkModeButton";
                        C18070vi.A11(str);
                        throw null;
                    }
                    str = "dimSliderContainer";
                    C18070vi.A11(str);
                    throw null;
                }
                str = "themeButton";
                C18070vi.A11(str);
                throw null;
            }
            AnonymousClass1ZU.A0B();
            throw null;
        }
        HomePlaceholderActivity.HomePlaceholderView.A00(view, (ViewGroup) this.A02, r13, (HomePlaceholderActivity.HomePlaceholderView) this.A01);
        return r13;
    }
}
