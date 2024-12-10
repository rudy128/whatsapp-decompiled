package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass3Mo;
import X.AnonymousClass47N;
import X.AnonymousClass47Y;
import X.C110885hR;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C89974dK;
import X.C90654eQ;
import X.C90874em;
import X.C91034f2;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.CheckBox;
import com.whatsapp.collections.MarginCorrectedViewPager;

public class SolidColorWallpaperPreview extends AnonymousClass47N {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public CheckBox A08;
    public MarginCorrectedViewPager A09;
    public boolean A0A;
    public int[] A0B;
    public int[] A0C;
    public boolean A0D;
    public boolean A0E;

    public SolidColorWallpaperPreview() {
        this(0);
        this.A0A = false;
        this.A0D = false;
    }

    public void onBackPressed() {
        setResult(0, (Intent) null);
        A0Q(this, this.A09.getCurrentItem());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05 = C110885hR.A0A(this, 2131429504);
        this.A04 = C110885hR.A0A(this, 2131427815);
        this.A07 = C110885hR.A0A(this, 2131436428);
        Pair A032 = SolidColorWallpaper.A03(this);
        this.A0B = (int[]) A032.first;
        this.A0C = (int[]) A032.second;
        MarginCorrectedViewPager marginCorrectedViewPager = (MarginCorrectedViewPager) C110885hR.A0A(this, 2131436980);
        this.A09 = marginCorrectedViewPager;
        marginCorrectedViewPager.setSaveEnabled(false);
        CheckBox checkBox = (CheckBox) C110885hR.A0A(this, 2131429196);
        this.A08 = checkBox;
        checkBox.setVisibility(0);
        this.A08.setText(2131898438);
        AnonymousClass47Y r3 = new AnonymousClass47Y(this, this);
        r3.A00 = this.A08.isChecked();
        C90874em.A00(this.A08, r3, 25);
        this.A09.setAdapter(r3);
        this.A09.setPageMargin((int) (C72463Mc.A00(this) * 15.0f));
        View A0A2 = C110885hR.A0A(this, 2131429545);
        this.A06 = A0A2;
        C72453Mb.A17(this, A0A2, 2131233598);
        C89974dK.A00(C110885hR.A0A(this, 2131428815), this, 26);
        A03(getIntent().getIntExtra("scw_preview_color", 0));
        this.A0A = false;
        boolean booleanExtra = getIntent().getBooleanExtra("wallpaper_preview_intent_extra_animate", false);
        this.A0D = booleanExtra;
        if (booleanExtra) {
            overridePendingTransition(0, 0);
            Intent intent = getIntent();
            this.A0A = true;
            this.A09.setScrollEnabled(false);
            this.A07.getViewTreeObserver().addOnPreDrawListener(new C90654eQ(this, intent.getIntExtra("wallpaper_preview_intent_extra_x", 0), intent.getIntExtra("wallpaper_preview_intent_extra_y", 0), intent.getIntExtra("wallpaper_preview_intent_extra_width", 0), intent.getIntExtra("wallpaper_preview_intent_extra_height", 0)));
        }
    }

    public static void A0Q(SolidColorWallpaperPreview solidColorWallpaperPreview, int i) {
        int i2;
        int i3;
        if (solidColorWallpaperPreview.A0D) {
            solidColorWallpaperPreview.A0A = true;
            solidColorWallpaperPreview.A09.setScrollEnabled(false);
            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
            if (i != solidColorWallpaperPreview.getIntent().getIntExtra("scw_preview_color", -1)) {
                solidColorWallpaperPreview.A02 = 0;
                solidColorWallpaperPreview.A03 = 0;
                i2 = solidColorWallpaperPreview.A09.getWidth() / 2;
                i3 = solidColorWallpaperPreview.A09.getWidth() / 2;
            } else {
                i2 = 0;
                i3 = 0;
            }
            solidColorWallpaperPreview.A09.setPivotX((float) i2);
            solidColorWallpaperPreview.A09.setPivotY((float) i3);
            solidColorWallpaperPreview.A05.setBackgroundColor(0);
            solidColorWallpaperPreview.A09.animate().setDuration(250).alpha(0.0f).scaleX(solidColorWallpaperPreview.A00).scaleY(solidColorWallpaperPreview.A01).translationX((float) solidColorWallpaperPreview.A02).translationY((float) solidColorWallpaperPreview.A03).setInterpolator(decelerateInterpolator).setListener(new AnonymousClass3Mo(solidColorWallpaperPreview, 23));
            solidColorWallpaperPreview.A04.animate().setDuration(250).alpha(0.0f).setInterpolator(decelerateInterpolator);
            solidColorWallpaperPreview.A06.animate().setDuration(250).alpha(0.0f).setInterpolator(decelerateInterpolator);
            return;
        }
        solidColorWallpaperPreview.finish();
    }

    public void A2y() {
        if (!this.A0E) {
            this.A0E = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            AnonymousClass47N.A0V(A0L, r1, this);
        }
    }

    private void A03(int i) {
        int i2 = getResources().getIntArray(2130903072)[i];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.A0B;
            if (i4 >= iArr.length) {
                break;
            } else if (iArr[i4] == i2) {
                i3 = i4;
                break;
            } else {
                i4++;
            }
        }
        this.A09.setCurrentItem(i3);
    }

    public void finish() {
        super.finish();
        if (this.A0D && this.A0A) {
            overridePendingTransition(0, 0);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0, (Intent) null);
        A0Q(this, this.A09.getCurrentItem());
        return true;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        A03(bundle.getInt("selected_index"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_index", this.A0C[this.A09.getCurrentItem()]);
    }

    public SolidColorWallpaperPreview(int i) {
        this.A0E = false;
        C91034f2.A00(this, 37);
    }
}
