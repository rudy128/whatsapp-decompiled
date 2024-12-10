package X;

import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.4ZW  reason: invalid class name */
public final class AnonymousClass4ZW {
    public View A00;
    public C03610Iy A01;
    public final C195199sx A02;
    public final AnonymousClass4MJ A03;
    public final AnonymousClass1E7 A04;
    public final WeakReference A05;

    private final void A01(Menu menu) {
        menu.add(0, 0, 1, 2131886516).setIcon(C72473Md.A0G(this.A05, 2131232178));
    }

    public final void A02(View view, int i) {
        MenuItem menuItem;
        int i2;
        String str;
        String str2;
        WeakReference weakReference = this.A05;
        Activity activity = (Activity) weakReference.get();
        if (activity == null || activity.isFinishing()) {
            Log.w("CallMenuHelper/launchPopupMenu activity is finished/finishing");
            return;
        }
        this.A00 = view;
        view.setAlpha(0.5f);
        C03610Iy r4 = this.A01;
        if (i == 0) {
            if (r4 == null) {
                r4 = A00(view);
                if (r4 != null) {
                    C003301m r3 = r4.A03;
                    C18070vi.A0X(r3);
                    A01(r3);
                    Context context = (Context) weakReference.get();
                    if (context != null) {
                        str = context.getString(2131891184);
                    } else {
                        str = null;
                    }
                    menuItem = r3.add(0, 1, 2, (CharSequence) str);
                    i2 = 2131231735;
                    menuItem.setIcon(C72473Md.A0G(weakReference, i2));
                }
                r4 = null;
            }
            r4.A00();
        } else if (i != 1) {
            if (r4 == null) {
                r4 = A00(view);
                if (r4 != null) {
                    C003301m r0 = r4.A03;
                    C18070vi.A0X(r0);
                    A01(r0);
                }
                r4 = null;
            }
            r4.A00();
        } else {
            if (r4 == null) {
                r4 = A00(view);
                if (r4 != null) {
                    C003301m r32 = r4.A03;
                    C18070vi.A0X(r32);
                    A01(r32);
                    Context context2 = (Context) weakReference.get();
                    if (context2 != null) {
                        str2 = context2.getString(2131891184);
                    } else {
                        str2 = null;
                    }
                    menuItem = r32.add(0, 2, 2, (CharSequence) str2);
                    i2 = 2131231736;
                    menuItem.setIcon(C72473Md.A0G(weakReference, i2));
                }
                r4 = null;
            }
            r4.A00();
        }
        this.A01 = r4;
        if (r4 == null) {
            return;
        }
        r4.A00();
    }

    private final C03610Iy A00(View view) {
        Activity activity = (Activity) this.A05.get();
        if (activity == null || activity.isFinishing()) {
            Log.w("CallMenuHelper/createPopUpMenu activity is finished/finishing");
            return null;
        }
        C03610Iy r2 = new C03610Iy(activity, view, 0, 0, 2132084381);
        C003301m r0 = r2.A03;
        C18070vi.A0X(r0);
        C137526vb.A00(r0);
        r2.A01 = new C91144fD(this, 0);
        r2.A00 = new C91134fC(this, 1);
        return r2;
    }

    public AnonymousClass4ZW(AnonymousClass01E r2, C195199sx r3, AnonymousClass4MJ r4, AnonymousClass1E7 r5) {
        C18070vi.A0o(r3, r5, r2);
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = AnonymousClass3MW.A0z(r2);
    }
}
