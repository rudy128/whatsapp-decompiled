package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;

/* renamed from: X.3hS  reason: invalid class name and case insensitive filesystem */
public final class C75413hS extends C75443hV {
    public final Activity A00;
    public final C92284h3 A01;
    public final AnonymousClass1BI A02;
    public final AnonymousClass4aW A03;
    public final AnonymousClass10I A04;
    public final ViewGroup A05;
    public final WallPaperView A06;

    public void onActivityCreated(Activity activity, Bundle bundle) {
        A00((Drawable) null, this);
        AnonymousClass10I r5 = this.A04;
        AnonymousClass1BI r4 = this.A02;
        C17890vO.A0u(new AnonymousClass49B(this.A00, new C84834La(this), r4, this.A03), r5);
    }

    public static void A00(Drawable drawable, C75413hS r3) {
        ViewGroup viewGroup;
        Context context;
        int i;
        int i2;
        int i3;
        boolean A0S = C22971Dz.A0S(r3.A02);
        WallPaperView wallPaperView = r3.A06;
        if (A0S) {
            C72473Md.A1F(wallPaperView);
            viewGroup = r3.A05;
            context = viewGroup.getContext();
            i = 2130971951;
            i2 = 2131103087;
        } else if (drawable != null) {
            wallPaperView.setDrawable(drawable);
            viewGroup = r3.A05;
            i3 = 0;
            viewGroup.setBackgroundResource(i3);
        } else {
            C72473Md.A1F(wallPaperView);
            viewGroup = r3.A05;
            context = viewGroup.getContext();
            i = 2130971972;
            i2 = 2131103141;
        }
        i3 = AnonymousClass1YL.A00(context, i, i2);
        viewGroup.setBackgroundResource(i3);
    }

    public String BO6() {
        return "ConversationWallpaperController";
    }

    public void onActivityResumed(Activity activity) {
        AnonymousClass4aW r5 = this.A03;
        if (r5.A01) {
            C17890vO.A0u(new AnonymousClass49B(this.A00, new C84834La(this), this.A02, r5), this.A04);
            r5.A01 = false;
        }
    }

    public C75413hS(Activity activity, ViewGroup viewGroup, AnonymousClass1FR r13, AnonymousClass1KB r14, AnonymousClass4GR r15, AnonymousClass11C r16, AnonymousClass1BI r17, WallPaperView wallPaperView, AnonymousClass4aW r19, AnonymousClass10I r20, Runnable runnable) {
        this.A02 = r17;
        this.A00 = activity;
        this.A04 = r20;
        this.A05 = viewGroup;
        WallPaperView wallPaperView2 = wallPaperView;
        this.A06 = wallPaperView2;
        AnonymousClass4aW r9 = r19;
        this.A03 = r9;
        this.A01 = new C92284h3(activity, r13, r14, new C95234lu(this, wallPaperView2, runnable), r15, r16, (C18030ve) null, r9);
    }
}
