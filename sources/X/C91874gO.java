package X;

import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.4gO  reason: invalid class name and case insensitive filesystem */
public class C91874gO implements AnonymousClass8B5 {
    public String A00 = "";
    public boolean A01 = true;
    public final /* synthetic */ ViewPager A02;
    public final /* synthetic */ MediaGalleryActivity A03;

    public void C8J(C136836uU r1) {
    }

    public void C8N(C136836uU r1) {
    }

    public C91874gO(ViewPager viewPager, MediaGalleryActivity mediaGalleryActivity) {
        this.A03 = mediaGalleryActivity;
        this.A02 = viewPager;
    }

    public void C8K(C136836uU r7) {
        this.A02.setCurrentItem(r7.A00);
        MediaGalleryActivity mediaGalleryActivity = this.A03;
        int i = r7.A00;
        mediaGalleryActivity.A00 = i;
        if (i != mediaGalleryActivity.A02) {
            AnonymousClass74O.A0O(mediaGalleryActivity, mediaGalleryActivity.A0I);
        }
        int i2 = mediaGalleryActivity.A00;
        int i3 = mediaGalleryActivity.A03;
        MenuItem menuItem = mediaGalleryActivity.A04;
        if (i2 == i3) {
            if (menuItem != null) {
                if (menuItem.isActionViewExpanded()) {
                    this.A00 = mediaGalleryActivity.A0j;
                    mediaGalleryActivity.A04.collapseActionView();
                }
                mediaGalleryActivity.A04.setVisible(false);
            }
            this.A01 = true;
            return;
        }
        if (menuItem != null) {
            menuItem.setVisible(true);
            if (!TextUtils.isEmpty(mediaGalleryActivity.A0j) || TextUtils.isEmpty(this.A00) || !this.A01) {
                C108055b3 A032 = MediaGalleryActivity.A03(mediaGalleryActivity);
                if (A032 != null) {
                    C34141jz r1 = mediaGalleryActivity.A0T;
                    r1.A05(mediaGalleryActivity.A0j);
                    r1.A06(mediaGalleryActivity.A0k);
                    A032.C4h(r1);
                }
            } else {
                mediaGalleryActivity.A0j = this.A00;
                mediaGalleryActivity.A04.expandActionView();
                View actionView = mediaGalleryActivity.A04.getActionView();
                if (actionView != null) {
                    C17880vN.A0E(actionView, 2131434969).setText(mediaGalleryActivity.A0j);
                }
            }
        }
        this.A01 = false;
    }
}
