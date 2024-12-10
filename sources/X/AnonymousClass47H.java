package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import com.google.android.material.slider.Slider;
import com.whatsapp.collections.MarginCorrectedViewPager;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$initLoggingIfNeeded$1;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$logThemePreviewEvent$1$1;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$onMessageColorChecked$1;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$onThemeChecked$1;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$saveCroppedWallpaper$1;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$saveWallpaperAndMessageColor$1;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.settings.chat.theme.preview.ThemesDownloadablePreviewActivity;
import com.whatsapp.settings.chat.theme.preview.ThemesGalleryWallpaperPreviewActivity;
import com.whatsapp.settings.chat.theme.preview.ThemesSolidColorWallpaperPreview;
import com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.47H  reason: invalid class name */
public abstract class AnonymousClass47H extends AnonymousClass47I {
    public Button A00;
    public FrameLayout A01;
    public Slider A02;
    public C84314Ja A03;
    public AnonymousClass1M9 A04;
    public C24921Me A05;
    public ChatThemeViewModel A06;
    public AnonymousClass118 A07;
    public WDSButton A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public Boolean A0B;
    public Integer A0C = AnonymousClass00R.A0C;
    public boolean A0D;
    public final C18100vl A0E = AnonymousClass1DF.A01(new C103695Lh(this));

    public static void A0V(Context context, C33321id r4, Object obj, List list, int i) {
        ViewGroup.LayoutParams layoutParams = ((View) obj).getLayoutParams();
        C18070vi.A0z(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ((int) context.getResources().getDimension(((Number) list.get(i)).intValue())) + r4.A00;
    }

    public float A4b() {
        if (this instanceof ThemesThemePreviewActivity) {
            ThemesThemePreviewActivity themesThemePreviewActivity = (ThemesThemePreviewActivity) this;
            C74393Zu A0j = C72463Mc.A0j(themesThemePreviewActivity);
            if (A0j != null) {
                return (float) A0j.A0I(themesThemePreviewActivity.A4l().getCurrentItem());
            }
            return 50.0f;
        } else if (this instanceof ThemesSolidColorWallpaperPreview) {
            return 0.0f;
        } else {
            return 50.0f;
        }
    }

    public final ContextWrapper A4c() {
        ContextWrapper A022;
        int intValue = this.A0C.intValue();
        if (intValue != 0) {
            A022 = this;
            if (intValue == 1) {
                A022 = C28281Zt.A01(this);
            }
            return A022;
        }
        A022 = C28281Zt.A02(this);
        C18070vi.A0b(A022);
        return A022;
    }

    public final Slider A4d() {
        Slider slider = this.A02;
        if (slider != null) {
            return slider;
        }
        C18070vi.A11("dimSlider");
        throw null;
    }

    public final ChatThemeViewModel A4e() {
        ChatThemeViewModel chatThemeViewModel = this.A06;
        if (chatThemeViewModel != null) {
            return chatThemeViewModel;
        }
        C18070vi.A11("chatThemeViewModel");
        throw null;
    }

    public final String A4f() {
        String str;
        AnonymousClass1BI r2 = this.A00;
        if (r2 == null) {
            return null;
        }
        AnonymousClass00H r0 = this.A09;
        if (r0 != null) {
            C24921Me r1 = (C24921Me) r0.get();
            AnonymousClass00H r02 = this.A0A;
            if (r02 != null) {
                String A0I = r1.A0I(((C25181Nf) r02.get()).A01(r2));
                if (A0I != null) {
                    return A0I;
                }
                return null;
            }
            str = "conversationContactManager";
        } else {
            str = "contactNamesBridge";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A4h(float f) {
        C74383Zt r2;
        MarginCorrectedViewPager A4l;
        C74393Zu A0j;
        if (this instanceof ThemesThemePreviewActivity) {
            ThemesThemePreviewActivity themesThemePreviewActivity = (ThemesThemePreviewActivity) this;
            if ((f == 0.0f || themesThemePreviewActivity.A4k()) && (A0j = C72463Mc.A0j(themesThemePreviewActivity)) != null) {
                int currentItem = themesThemePreviewActivity.A4l().getCurrentItem();
                SparseIntArray sparseIntArray = A0j.A02;
                sparseIntArray.put(currentItem, (int) f);
                for (AnonymousClass3Pc r22 : A0j.A04) {
                    if (C18070vi.A18(r22.getTag(), Integer.valueOf(currentItem))) {
                        r22.setDimLevel(sparseIntArray.get(currentItem));
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (this instanceof ThemesSolidColorWallpaperPreview) {
            ThemesSolidColorWallpaperPreview themesSolidColorWallpaperPreview = (ThemesSolidColorWallpaperPreview) this;
            if ((f == 0.0f || themesSolidColorWallpaperPreview.A4k()) && (r2 = (C74383Zt) themesSolidColorWallpaperPreview.A4l().getAdapter()) != null) {
                A4l = themesSolidColorWallpaperPreview.A4l();
            } else {
                return;
            }
        } else if (this instanceof ThemesGalleryWallpaperPreviewActivity) {
            ThemesGalleryWallpaperPreviewActivity themesGalleryWallpaperPreviewActivity = (ThemesGalleryWallpaperPreviewActivity) this;
            if ((f == 0.0f || themesGalleryWallpaperPreviewActivity.A4k()) && themesGalleryWallpaperPreviewActivity.A00 != null) {
                PhotoView photoView = themesGalleryWallpaperPreviewActivity.A02;
                if (photoView == null) {
                    C18070vi.A11("photoView");
                    throw null;
                } else {
                    photoView.setColorFilter(C72473Md.A01((int) f, C72453Mb.A0I(themesGalleryWallpaperPreviewActivity.A07)));
                    return;
                }
            } else {
                return;
            }
        } else {
            ThemesDownloadablePreviewActivity themesDownloadablePreviewActivity = (ThemesDownloadablePreviewActivity) this;
            if ((f == 0.0f || themesDownloadablePreviewActivity.A4k()) && (r2 = (C74383Zt) themesDownloadablePreviewActivity.A4l().getAdapter()) != null) {
                A4l = themesDownloadablePreviewActivity.A4l();
            } else {
                return;
            }
        }
        int currentItem2 = A4l.getCurrentItem();
        SparseIntArray sparseIntArray2 = r2.A01;
        sparseIntArray2.put(currentItem2, (int) f);
        for (AnonymousClass47S r23 : r2.A02) {
            if (C18070vi.A18(r23.getTag(), Integer.valueOf(currentItem2))) {
                r23.setDimLevel(sparseIntArray2.get(currentItem2));
                return;
            }
        }
    }

    public final void A4i(float f) {
        Slider A4d;
        int i;
        if (f < 31.0f) {
            A4d = A4d();
            i = 2131231730;
        } else {
            int i2 = (f > 71.0f ? 1 : (f == 71.0f ? 0 : -1));
            A4d = A4d();
            i = 2131231726;
            if (i2 < 0) {
                i = 2131231728;
            }
        }
        A4d.setCustomThumbDrawable(i);
        A4h(f);
    }

    public void A4j(boolean z) {
        String str;
        String str2;
        AnonymousClass4D5 r11;
        if (this instanceof ThemesThemePreviewActivity) {
            ThemesThemePreviewActivity themesThemePreviewActivity = (ThemesThemePreviewActivity) this;
            C74393Zu A0j = C72463Mc.A0j(themesThemePreviewActivity);
            if (A0j != null) {
                int currentItem = themesThemePreviewActivity.A4l().getCurrentItem();
                if (themesThemePreviewActivity.A0B.contains(Integer.valueOf(currentItem))) {
                    return;
                }
                if (!themesThemePreviewActivity.A06) {
                    if (z) {
                        r11 = AnonymousClass4D5.WALLPAPER;
                    } else {
                        r11 = AnonymousClass4D5.NO_CUSTOMISATION;
                    }
                    ChatThemeViewModel A4e = themesThemePreviewActivity.A4e();
                    int A002 = C74393Zu.A00(A0j, currentItem, currentItem);
                    int A0I = A0j.A0I(currentItem);
                    C88434Zr r10 = (C88434Zr) A0j.A01.get(currentItem, (Object) null);
                    if (r10 == null) {
                        r10 = ((AnonymousClass4VO) A0j.A0B.get(C74393Zu.A00(A0j, currentItem, currentItem))).A00;
                    }
                    AnonymousClass4VO r9 = themesThemePreviewActivity.A03;
                    AnonymousClass3MW.A1X(A4e.A0Y, new ChatThemeViewModel$onThemeChecked$1(themesThemePreviewActivity, r9, r10, r11, A4e, (C30391dr) null, A002, A0I), C41561wd.A00(A4e));
                    return;
                }
                ChatThemeViewModel A4e2 = themesThemePreviewActivity.A4e();
                int A0I2 = A0j.A0I(currentItem);
                AnonymousClass3MW.A1X(A4e2.A0Y, new ChatThemeViewModel$onMessageColorChecked$1(themesThemePreviewActivity, A4e2, (C30391dr) null, currentItem, A0I2), C41561wd.A00(A4e2));
                AnonymousClass3MY.A1M(A4e2.A0W, true);
                A4e2.A04 = true;
                return;
            }
            return;
        }
        if (this instanceof ThemesSolidColorWallpaperPreview) {
            ThemesSolidColorWallpaperPreview themesSolidColorWallpaperPreview = (ThemesSolidColorWallpaperPreview) this;
            int[] iArr = themesSolidColorWallpaperPreview.A04;
            if (iArr == null) {
                str = "values";
            } else {
                int i = iArr[themesSolidColorWallpaperPreview.A4l().getCurrentItem()];
                CheckBox checkBox = themesSolidColorWallpaperPreview.A00;
                if (checkBox == null) {
                    str = "showDoodleCheckbox";
                } else {
                    boolean isChecked = checkBox.isChecked();
                    ChatThemeViewModel A4e3 = themesSolidColorWallpaperPreview.A4e();
                    int A0I3 = ((C74383Zt) themesSolidColorWallpaperPreview.A09.getValue()).A0I(themesSolidColorWallpaperPreview.A4l().getCurrentItem());
                    AnonymousClass4aW r5 = A4e3.A0T;
                    AnonymousClass1BI r4 = A4e3.A0Q;
                    if (isChecked) {
                        str2 = "COLOR_WITH_WA_OVERLAY";
                    } else {
                        str2 = "COLOR_ONLY";
                    }
                    AnonymousClass4aW.A09(r4, new C85344Na(Integer.valueOf(A0I3), str2, String.valueOf(i)), r5, C28281Zt.A0B(themesSolidColorWallpaperPreview), true);
                    AnonymousClass3MY.A1M(A4e3.A0W, true);
                    A4e3.A04 = true;
                    return;
                }
            }
        } else if (this instanceof ThemesGalleryWallpaperPreviewActivity) {
            ThemesGalleryWallpaperPreviewActivity themesGalleryWallpaperPreviewActivity = (ThemesGalleryWallpaperPreviewActivity) this;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(themesGalleryWallpaperPreviewActivity.A00);
            PhotoView photoView = themesGalleryWallpaperPreviewActivity.A02;
            if (photoView == null) {
                str = "photoView";
            } else {
                Bitmap A082 = photoView.A08(bitmapDrawable);
                if (A082 != null) {
                    ChatThemeViewModel A4e4 = themesGalleryWallpaperPreviewActivity.A4e();
                    int value = (int) (100.0f - themesGalleryWallpaperPreviewActivity.A4d().getValue());
                    AnonymousClass3MW.A1X(A4e4.A0Y, new ChatThemeViewModel$saveCroppedWallpaper$1(themesGalleryWallpaperPreviewActivity, A082, A4e4, (C30391dr) null, value), C41561wd.A00(A4e4));
                    return;
                }
                return;
            }
        } else {
            ThemesDownloadablePreviewActivity themesDownloadablePreviewActivity = (ThemesDownloadablePreviewActivity) this;
            int currentItem2 = themesDownloadablePreviewActivity.A4l().getCurrentItem();
            AnonymousClass478 r3 = themesDownloadablePreviewActivity.A03;
            if (r3 != null) {
                List list = themesDownloadablePreviewActivity.A05;
                if (list != null) {
                    if (currentItem2 < list.size()) {
                        List list2 = themesDownloadablePreviewActivity.A05;
                        if (list2 != null) {
                            Uri uri = (Uri) list2.get(themesDownloadablePreviewActivity.A4l().getCurrentItem());
                            ChatThemeViewModel A4e5 = themesDownloadablePreviewActivity.A4e();
                            C87864Xj r0 = themesDownloadablePreviewActivity.A04;
                            if (r0 != null) {
                                Uri A012 = r0.A01(uri);
                                C18070vi.A0X(A012);
                                AnonymousClass4D5 r102 = AnonymousClass4D5.WALLPAPER;
                                int A0I4 = r3.A0I(currentItem2);
                                AnonymousClass3MW.A1X(A4e5.A0Y, new ChatThemeViewModel$saveWallpaperAndMessageColor$1(themesDownloadablePreviewActivity, A012, r102, A4e5, (C30391dr) null, A0I4), C41561wd.A00(A4e5));
                                return;
                            }
                            str = "downloadableWallpaperManager";
                        }
                    } else {
                        return;
                    }
                }
                C18070vi.A11("thumbnailUris");
                throw null;
            }
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public final boolean A4k() {
        int intValue = this.A0C.intValue();
        if (intValue == 0) {
            return false;
        }
        if (intValue != 1) {
            return C28281Zt.A0B(this);
        }
        return true;
    }

    public static final void A0c(AnonymousClass47H r2) {
        Slider A4d;
        int i;
        boolean A4k = r2.A4k();
        WDSButton wDSButton = r2.A08;
        if (wDSButton != null) {
            if (A4k) {
                wDSButton.setIcon(2131231842);
                A4d = r2.A4d();
                i = 0;
            } else {
                wDSButton.setIcon(2131232041);
                A4d = r2.A4d();
                i = 8;
            }
            A4d.setVisibility(i);
            return;
        }
        C18070vi.A11("darkModeButton");
        throw null;
    }

    public final void A4g() {
        A4d().setValue(100.0f - A4b());
        A4i(A4b());
        A4d().setVisibility(C72453Mb.A07(A4k() ? 1 : 0));
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        AnonymousClass6VM.A00(getWindow(), false);
        setTitle(2131898422);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0O(AnonymousClass3NL.A00(this, this.A00, 2131231672));
        }
        AnonymousClass1BI r2 = this.A00;
        C84314Ja r1 = this.A03;
        if (r1 != null) {
            ChatThemeViewModel chatThemeViewModel = (ChatThemeViewModel) C91774gE.A00(this, r1, r2, 7).A00(ChatThemeViewModel.class);
            C18070vi.A0d(chatThemeViewModel, 0);
            this.A06 = chatThemeViewModel;
            A4e().A0T(this);
            ChatThemeViewModel A4e = A4e();
            AnonymousClass3MW.A1X(A4e.A0Y, new ChatThemeViewModel$initLoggingIfNeeded$1(this, A4e, (C30391dr) null), C41561wd.A00(A4e));
            Button button = (Button) AnonymousClass3MY.A0C(this, 2131435235);
            C18070vi.A0d(button, 0);
            this.A00 = button;
            C89974dK.A00(button, this, 19);
            View A0C2 = AnonymousClass3MY.A0C(this, 2131429504);
            Slider slider = (Slider) AnonymousClass3MY.A0C(this, 2131429998);
            C18070vi.A0d(slider, 0);
            this.A02 = slider;
            FrameLayout frameLayout = (FrameLayout) AnonymousClass3MY.A0C(this, 2131429999);
            C18070vi.A0d(frameLayout, 0);
            this.A01 = frameLayout;
            WDSButton wDSButton = (WDSButton) AnonymousClass3MY.A0C(this, 2131429766);
            C18070vi.A0d(wDSButton, 0);
            this.A08 = wDSButton;
            wDSButton.setVisibility(0);
            Slider A4d = A4d();
            A4d.A0o.add(new C91854gM(this));
            WDSButton wDSButton2 = this.A08;
            if (wDSButton2 != null) {
                C89974dK.A00(wDSButton2, this, 20);
                AnonymousClass1HF.A0g(A0C2, new C91334fW(A0C2, this, 1));
                C91634g0.A00(this, A4e().A0C, new AnonymousClass5UI(this), 32);
                getWindow().setNavigationBarColor(0);
                A0c(this);
                return;
            }
            str = "darkModeButton";
        } else {
            str = "viewModelFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDestroy() {
        ChatThemeViewModel A4e = A4e();
        C85594Nz r4 = A4e.A00;
        if (r4 != null) {
            AnonymousClass3MW.A1X(A4e.A0Y, new ChatThemeViewModel$logThemePreviewEvent$1$1(this, r4, A4e, (C30391dr) null), AnonymousClass1OA.A00);
        }
        super.onDestroy();
    }
}
