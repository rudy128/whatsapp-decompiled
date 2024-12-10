package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.whatsapp.calling.vcoverscroll.view.VCMiniPlayerView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4qq  reason: invalid class name and case insensitive filesystem */
public class C98264qq implements C38531rR {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C98264qq(Context context, VCMiniPlayerView vCMiniPlayerView, C28931bI r3, int i) {
        this.A00 = i;
        this.A01 = r3;
        if (i != 0) {
            this.A02 = vCMiniPlayerView;
            this.A03 = context;
            return;
        }
        this.A02 = context;
        this.A03 = vCMiniPlayerView;
    }

    public final void Bvu(View view) {
        switch (this.A00) {
            case 0:
                C28931bI r4 = (C28931bI) this.A01;
                Context context = (Context) this.A02;
                Object obj = this.A03;
                WDSButton wDSButton = (WDSButton) view;
                C18070vi.A0d(r4, 0);
                r4.A05(new AnonymousClass48l(obj, 23));
                Drawable A05 = AnonymousClass4aX.A05(context, AnonymousClass3MX.A06(context, 2131233243), 2131103331);
                C18070vi.A0X(A05);
                wDSButton.setIcon(A05);
                AnonymousClass4aR.A07(wDSButton, context.getString(2131898200), (CharSequence) null);
                return;
            case 1:
                C28931bI r42 = (C28931bI) this.A01;
                View view2 = (View) this.A02;
                C18070vi.A0d(r42, 0);
                r42.A05(new AnonymousClass48l(view2, 24));
                ((WDSButton) view).setIcon((Drawable) AnonymousClass4G1.A00((Context) this.A03, AnonymousClass3MW.A00(view2.getResources(), 2131169356)));
                return;
            case 2:
                View view3 = (View) this.A01;
                Context context2 = (Context) this.A03;
                GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
                gradientDrawable.mutate();
                int A012 = C62762rw.A01(view3.getContext(), 1.0f);
                Resources resources = view3.getResources();
                int i = 2130970770;
                int i2 = 2131102181;
                if (((AnonymousClass206) this.A02).A0v.A02) {
                    i = 2130970771;
                    i2 = 2131102182;
                }
                gradientDrawable.setStroke(A012, AnonymousClass3Ma.A01(context2, resources, i, i2));
                return;
            default:
                Object obj2 = this.A01;
                Object obj3 = this.A02;
                Object obj4 = this.A03;
                C18070vi.A0d(obj4, 2);
                C90074dU.A01(view.findViewById(2131436495), obj2, obj3, 49);
                C90014dO.A00(view.findViewById(2131429881), obj2, obj4, 0);
                return;
        }
    }

    public C98264qq(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }
}
