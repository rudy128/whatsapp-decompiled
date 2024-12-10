package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.mediacomposer.doodle.eyedropper.EyedropperColorPickerButton;
import com.whatsapp.mediacomposer.doodle.universaltoolpicker.color.ColorToolPickerItemView;

/* renamed from: X.5l2  reason: invalid class name and case insensitive filesystem */
public final class C112165l2 extends C38391rD {
    public int A00;
    public final AnonymousClass1IX A01;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i != 0) {
            if (i == 1) {
                return new C1197269p(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131624555, false), this);
            }
            if (i == 2) {
                return new C1197169o(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131624341, false), this);
            }
            if (i == 3) {
                return new C1197369q(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625295, false), this);
            }
        }
        return new C1197469r(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625340, false), this);
    }

    public int A0Q() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r3) {
        C113505nC r32 = (C113505nC) r3;
        C18070vi.A0d(r32, 0);
        r32.A00.setOnClickListener((View.OnClickListener) null);
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r7, int i) {
        Drawable mutate;
        String str;
        int i2;
        C113505nC r72 = (C113505nC) r7;
        C18070vi.A0d(r72, 0);
        View view = r72.A00;
        view.setOnClickListener((View.OnClickListener) null);
        Object obj = this.A01.get(i);
        if (r72 instanceof C1197469r) {
            C1197469r r73 = (C1197469r) r72;
            C1197769u r4 = (C1197769u) obj;
            C18070vi.A0d(r4, 0);
            r73.A0B(r4);
            int i3 = r4.A00;
            View view2 = r73.A00;
            int A002 = C1402470o.A00(i3);
            if (A002 != -1) {
                AnonymousClass3MY.A0w(view2.getContext(), view2, A002);
            }
            if (i3 == 2) {
                i2 = AnonymousClass000.A0Y(view2).getDimensionPixelSize(2131169009);
            } else {
                i2 = 0;
            }
            TextView textView = r73.A00;
            textView.setTypeface(C123936Wk.A00(AnonymousClass3MY.A04(textView), i3));
            textView.setPadding(0, i2, i2, 0);
        } else if (r72 instanceof C1197369q) {
            C1197369q r74 = (C1197369q) r72;
            C1197669t r42 = (C1197669t) obj;
            C18070vi.A0d(r42, 0);
            r74.A0B(r42);
            EyedropperColorPickerButton eyedropperColorPickerButton = r74.A00;
            eyedropperColorPickerButton.setColor(r42.A00);
            eyedropperColorPickerButton.setContentDescription(r42.A01);
            int i4 = r42.A00;
            if (i4 != -1) {
                Integer A003 = C1405972c.A00(i4);
                C18070vi.A0X(A003);
                str = eyedropperColorPickerButton.getResources().getString(A003.intValue());
            } else {
                str = "";
            }
            C18070vi.A0b(str);
            AnonymousClass1HF.A0o(eyedropperColorPickerButton, str);
        } else if (r72 instanceof C1197269p) {
            C1197269p r75 = (C1197269p) r72;
            C1197569s r43 = (C1197569s) obj;
            C18070vi.A0d(r43, 0);
            r75.A0B(r43);
            ColorToolPickerItemView colorToolPickerItemView = r75.A00;
            colorToolPickerItemView.A00 = r43.A00;
            colorToolPickerItemView.setContentDescription(r43.A01);
        } else {
            C1197869v r44 = (C1197869v) obj;
            C18070vi.A0d(r44, 0);
            r72.A0B(r44);
            if (view instanceof ImageButton) {
                Context context = view.getContext();
                Drawable A004 = C24261Jm.A00(context, r44.A01);
                int i5 = 2131103394;
                if (r44.A01) {
                    i5 = 2131103063;
                }
                if (!(A004 == null || (mutate = A004.mutate()) == null)) {
                    C27831Xu.A0C(mutate, C19740yt.A00(context, i5));
                    ((ImageView) view).setImageDrawable(mutate);
                }
                AnonymousClass3MY.A0w(context, view, r44.A00);
            }
        }
    }

    public int getItemViewType(int i) {
        return ((C133706pM) this.A01.get(i)).A02;
    }

    public C112165l2(AnonymousClass1IX r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
