package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;

public class A09 {
    public int A00 = 2;
    public AnonymousClass1BI A01;
    public String A02;
    public final Rect A03;
    public final AnonymousClass1BI A04;
    public final Integer A05;

    public void A01(Activity activity) {
        Integer num;
        if (activity != null) {
            Integer valueOf = Integer.valueOf(activity.getWindow().getStatusBarColor());
            if (AnonymousClass112.A04()) {
                num = Integer.valueOf(activity.getWindow().getNavigationBarColor());
            } else {
                num = null;
            }
            Integer num2 = this.A05;
            String str = this.A02;
            Rect rect = this.A03;
            AnonymousClass1BI r7 = this.A01;
            AnonymousClass1BI r6 = this.A04;
            int i = this.A00;
            Intent A0A = C17880vN.A0A();
            A0A.setClassName(activity.getPackageName(), "com.whatsapp.quickcontact.QuickContactActivity");
            if (num2 != null) {
                A0A.putExtra("profile_entry_point", num2);
            }
            if (str != null) {
                A0A.putExtra("transition_name", str);
            }
            if (valueOf != null) {
                A0A.putExtra("status_bar_color", valueOf);
            }
            if (num != null) {
                A0A.putExtra("navigation_bar_color", num);
            }
            if (r7 != null) {
                AnonymousClass3MY.A12(A0A, r7, "gjid");
            }
            A0A.putExtra("show_get_direction", false);
            AnonymousClass3MY.A13(A0A, r6, "jid");
            A0A.putExtra("animation_style", i);
            A0A.setSourceBounds(rect);
            activity.startActivity(A0A, C1406772n.A02().A03());
            activity.overridePendingTransition(0, 0);
        }
    }

    public A09(View view, AnonymousClass1BI r9, Integer num) {
        this.A04 = r9;
        this.A05 = num;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect A07 = AnonymousClass3MW.A07();
        int i = iArr[0];
        A07.left = (int) ((((float) i) * 1.0f) + 0.5f);
        A07.top = (int) ((((float) iArr[1]) * 1.0f) + 0.5f);
        A07.right = (int) ((((float) (i + view.getWidth())) * 1.0f) + 0.5f);
        A07.bottom = (int) ((((float) AnonymousClass3MW.A02(view, iArr[1])) * 1.0f) + 0.5f);
        this.A03 = A07;
    }

    public static Intent A00(Activity activity, Rect rect, AnonymousClass1BI r9, AnonymousClass1BI r10, Double d, Double d2, Integer num) {
        Integer num2;
        Integer valueOf = Integer.valueOf(activity.getWindow().getStatusBarColor());
        if (AnonymousClass112.A04()) {
            num2 = Integer.valueOf(activity.getWindow().getNavigationBarColor());
        } else {
            num2 = null;
        }
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(activity.getPackageName(), "com.whatsapp.quickcontact.QuickContactActivity");
        if (num != null) {
            A0A.putExtra("profile_entry_point", num);
        }
        if (valueOf != null) {
            A0A.putExtra("status_bar_color", valueOf);
        }
        if (num2 != null) {
            A0A.putExtra("navigation_bar_color", num2);
        }
        if (r9 != null) {
            AnonymousClass3MY.A12(A0A, r9, "gjid");
        }
        if (d != null) {
            A0A.putExtra("location_latitude", d);
        }
        if (d2 != null) {
            A0A.putExtra("location_longitude", d2);
        }
        A0A.putExtra("show_get_direction", true);
        AnonymousClass3MY.A13(A0A, r10, "jid");
        A0A.putExtra("animation_style", 2);
        A0A.setSourceBounds(rect);
        return A0A;
    }
}
