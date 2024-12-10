package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.WaDynamicRoundCornerImageView;
import com.whatsapp.settings.chat.theme.adapter.ThemesWallpaperCategoryAdapter$BaseViewHolder$ThumbnailViewHolder$loadThumbnail$1;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import java.io.File;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.3WF  reason: invalid class name */
public final class AnonymousClass3WF extends C41251w3 {
    public LayoutInflater A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final C37571pl A04;
    public final List A05;
    public final List A06;
    public final C22821Di A07;
    public final C18600wl A08;
    public final C18600wl A09;

    public AnonymousClass3WF(Context context, C37571pl r9, C18090vk r10, C18090vk r11, C22821Di r12, C18600wl r13, C18600wl r14) {
        super((C40411uf) AnonymousClass3W5.A00);
        this.A04 = r9;
        this.A08 = r13;
        this.A09 = r14;
        this.A07 = r12;
        this.A03 = AnonymousClass3MW.A01(context.getResources(), 2131165892);
        this.A02 = AnonymousClass3MW.A01(context.getResources(), 2131165891);
        this.A01 = context.getResources().getDimension(2131169405);
        C80403x5[] r6 = new C80403x5[2];
        r6[0] = new C80403x5(2131231908, 2131896865);
        this.A05 = C18070vi.A0O(new C80403x5(2131231828, 2131896866), r6, 1);
        this.A06 = C18070vi.A0N(r10, r11, new C18090vk[2], 0, 1);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflater = this.A00;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(context);
            this.A00 = layoutInflater;
        }
        if (i == 0) {
            View inflate = layoutInflater.inflate(2131625766, viewGroup, false);
            C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.wds.components.list.listitem.WDSListItem");
            return new AnonymousClass479((WDSListItem) inflate);
        }
        List list = C42011xT.A0I;
        C37571pl r6 = this.A04;
        C18600wl r5 = this.A08;
        C18600wl r4 = this.A09;
        C72453Mb.A1S(context);
        WaDynamicRoundCornerImageView waDynamicRoundCornerImageView = new WaDynamicRoundCornerImageView(context);
        waDynamicRoundCornerImageView.A05();
        context.getResources();
        waDynamicRoundCornerImageView.setRadius(this.A01);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.A03, this.A02);
        layoutParams.gravity = 17;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(waDynamicRoundCornerImageView);
        C72473Md.A10(frameLayout);
        waDynamicRoundCornerImageView.setLayoutParams(layoutParams);
        AnonymousClass3MW.A1R(waDynamicRoundCornerImageView);
        return new AnonymousClass47A(frameLayout, r6, r5, r4);
    }

    public int getItemViewType(int i) {
        return i < 2 ? 0 : 1;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        C73903Xt r82 = (C73903Xt) r8;
        C18070vi.A0d(r82, 0);
        AnonymousClass4EQ r4 = (AnonymousClass4EQ) A0U(i);
        if (r82 instanceof AnonymousClass479) {
            C18070vi.A0z(r4, "null cannot be cast to non-null type com.whatsapp.conversation.themes.ThemesWallpaperListItem.ThemesWallpaperCategoryListItem");
            C80403x5 r42 = (C80403x5) r4;
            WDSListItem wDSListItem = ((AnonymousClass479) r82).A00;
            wDSListItem.setText(r42.A01);
            Context context = wDSListItem.getContext();
            Drawable A002 = C24261Jm.A00(context, r42.A00);
            if (A002 != null) {
                C27831Xu.A0C(A002, C19740yt.A00(context, AnonymousClass4Z9.A00(context, 2130971979)));
            } else {
                A002 = null;
            }
            wDSListItem.setIcon(A002);
            C89974dK.A00(wDSListItem, this.A06.get(i), 16);
        } else if (r82 instanceof AnonymousClass47A) {
            C18070vi.A0z(r4, "null cannot be cast to non-null type com.whatsapp.conversation.themes.ThemesWallpaperListItem.DownloadableThumbnailFileListItem");
            C80393x4 r43 = (C80393x4) r4;
            AnonymousClass47A r6 = (AnonymousClass47A) r82;
            File file = r43.A00;
            AnonymousClass1OB r1 = r6.A00;
            if (r1 != null) {
                r1.BEM((CancellationException) null);
            }
            C37571pl r3 = r6.A02;
            r6.A00 = C30451dy.A02(AnonymousClass00R.A00, r6.A03, new ThemesWallpaperCategoryAdapter$BaseViewHolder$ThumbnailViewHolder$loadThumbnail$1(r6, file, (C30391dr) null), r3);
            C90104dX.A00(r82.A0H, this, i, 30);
            View A0F = AnonymousClass3MY.A0F(r6.A01);
            C18070vi.A0z(A0F, "null cannot be cast to non-null type com.whatsapp.settings.chat.wallpaper.ThemesWallpaperGridItemView");
            ((AnonymousClass3gi) A0F).setChecked(r43.A01);
        } else {
            throw AnonymousClass000.A0n("not a know item type");
        }
    }
}
