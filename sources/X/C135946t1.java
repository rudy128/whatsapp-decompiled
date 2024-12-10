package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.whatsapp.settings.SettingsRowIconText;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6t1  reason: invalid class name and case insensitive filesystem */
public abstract class C135946t1 {
    public final AnonymousClass1KB A00;
    public final AnonymousClass1KW A01;
    public final C18000vb A02;
    public final AnonymousClass10I A03;
    public final WeakReference A04;

    public void A00(Drawable drawable, Integer num) {
        View A0O;
        if ((this instanceof C117045z7) && (A0O = C108945cZ.A0O(((C117045z7) this).A00)) != null) {
            Chip chip = (Chip) A0O;
            chip.setChipIcon(drawable);
            if (num != null) {
                chip.setChipIconTintResource(num.intValue());
            } else {
                chip.setChipIconTint((ColorStateList) null);
            }
        }
    }

    public final void A01(C135726sf r18) {
        View A0O = C108945cZ.A0O(this.A04);
        if (A0O != null) {
            Context context = A0O.getContext();
            Resources resources = context.getResources();
            C135726sf r6 = r18;
            if (r18 != null) {
                String str = r6.A03;
                if (str != null) {
                    long millis = r6.A01 + TimeUnit.SECONDS.toMillis(r6.A00);
                    Object[] A1b = AnonymousClass3MW.A1b();
                    C18000vb r10 = this.A02;
                    String A08 = r10.A08(170);
                    C18070vi.A0X(A08);
                    A1b[0] = C72483Me.A0Y(A08, r10.A0N(), millis);
                    A02(str, AnonymousClass3Ma.A10(context, A8I.A00(r10, millis), A1b, 1, 2131890203), r6.A02, AnonymousClass3Ma.A01(A0O.getContext(), resources, 2130971113, 2131102439));
                }
                int dimensionPixelSize = resources.getDimensionPixelSize(2131169380);
                String str2 = r6.A02;
                if (str2 == null || str2.length() == 0) {
                    A00((Drawable) null, (Integer) null);
                } else {
                    this.A03.CGN(new C70783Cm(resources, this, str2, dimensionPixelSize, 11));
                }
            } else {
                int A002 = AnonymousClass4Z9.A00(context, 2130970828);
                A02(C18070vi.A0F(context, 2131898689), (String) null, (String) null, context.getResources().getColor(A002));
                int dimensionPixelSize2 = resources.getDimensionPixelSize(2131169380);
                Drawable A022 = AnonymousClass4aX.A02(context, 2131232116, A002);
                C18070vi.A0X(A022);
                A022.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize2);
                A00(A022, Integer.valueOf(A002));
            }
        }
    }

    public void A02(String str, String str2, String str3, int i) {
        String A0Z;
        if (this instanceof C117055z8) {
            View A0O = C108945cZ.A0O(((C117055z8) this).A00);
            if (A0O != null) {
                SettingsRowIconText settingsRowIconText = (SettingsRowIconText) A0O;
                if (!(str3 == null || (A0Z = C17890vO.A0Z(str, AnonymousClass000.A11(str3), ' ')) == null)) {
                    str = A0Z;
                }
                settingsRowIconText.setText((CharSequence) str);
                settingsRowIconText.setSubText((CharSequence) str2);
                return;
            }
            return;
        }
        View A0O2 = C108945cZ.A0O(((C117045z7) this).A00);
        if (A0O2 != null) {
            TextView textView = (TextView) A0O2;
            textView.setText(str);
            textView.setTextColor(i);
        }
    }

    public C135946t1(AnonymousClass1KB r1, C18000vb r2, AnonymousClass1KW r3, AnonymousClass10I r4, WeakReference weakReference) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r3;
        this.A02 = r2;
        this.A04 = weakReference;
    }
}
