package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.5kq  reason: invalid class name and case insensitive filesystem */
public class C112045kq extends C38391rD {
    public final List A00 = AnonymousClass000.A13();
    public final /* synthetic */ C145237Km A01;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        LayoutInflater A0B = AnonymousClass3MY.A0B(viewGroup);
        if (i == 0) {
            return new C121096Hs(A0B.inflate(2131624253, viewGroup, false));
        }
        return new C121086Hr(A0B.inflate(2131627105, viewGroup, false));
    }

    public C112045kq(C145237Km r2) {
        this.A01 = r2;
        A0K(true);
    }

    public int A0Q() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        int i2;
        int i3;
        Drawable drawable;
        C112905mE r82 = (C112905mE) r8;
        C123266Tt r6 = (C123266Tt) this.A00.get(i);
        int i4 = this.A01.A00;
        boolean z = r6 instanceof C121066Hp;
        if (z) {
            i2 = ((C121066Hp) r6).A00;
        } else {
            i2 = ((C121076Hq) r6).A01;
        }
        boolean A1T = AnonymousClass000.A1T(i4, i2);
        AnonymousClass786 r3 = new AnonymousClass786(this, r6, 46);
        if (r82 instanceof C121096Hs) {
            C121096Hs r83 = (C121096Hs) r82;
            if (z) {
                WaTextView waTextView = r83.A02;
                waTextView.setText(((C121066Hp) r6).A02);
                waTextView.setTypeface(r83.A00);
                if (A1T) {
                    drawable = C24261Jm.A00(waTextView.getContext(), 2131232976);
                } else {
                    drawable = null;
                }
                waTextView.setBackground(drawable);
                waTextView.setTextColor(C19740yt.A03(waTextView.getContext(), 2131102469));
                waTextView.setSelected(A1T);
                r83.A01.setOnClickListener(r3);
                return;
            }
            throw AnonymousClass000.A0k("item should be AvatarHeaderTextItem");
        }
        C121086Hr r84 = (C121086Hr) r82;
        if (r6 instanceof C121076Hq) {
            WaImageView waImageView = r84.A01;
            C121076Hq r62 = (C121076Hq) r6;
            C108995ce.A0z(waImageView, r62.A00, A1T);
            waImageView.setOnClickListener(r3);
            View view = r84.A00;
            Context context = view.getContext();
            if (A1T) {
                i3 = AnonymousClass1YL.A00(view.getContext(), 2130970739, 2131102169);
            } else {
                i3 = 2131102739;
            }
            AnonymousClass3MX.A1A(context, view, i3);
            waImageView.setContentDescription(r62.A02);
            return;
        }
        throw AnonymousClass000.A0k("item should be AvocadoHeaderIconItem");
    }

    public int getItemViewType(int i) {
        if (this.A00.get(i) instanceof C121066Hp) {
            return 0;
        }
        return 1;
    }
}
