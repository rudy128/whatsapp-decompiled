package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.C9n  reason: case insensitive filesystem */
public abstract class C24566C9n {
    public static void A00(Context context, View view, C26228CvK cvK, String str) {
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -2137403731:
                    if (str.equals("Header")) {
                        c = 0;
                        break;
                    }
                    break;
                case -565577257:
                    if (str.equals("Image Button")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2368538:
                    if (str.equals("Link")) {
                        c = 2;
                        break;
                    }
                    break;
                case 70760763:
                    if (str.equals("Image")) {
                        c = 3;
                        break;
                    }
                    break;
                case 109450440:
                    if (str.equals("Tab Bar")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1404906583:
                    if (str.equals("Selected Button")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2001146706:
                    if (str.equals("Button")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            String str2 = "android.widget.Button";
            switch (c) {
                case 0:
                    cvK.A0k(true);
                    if (view != null) {
                        AnonymousClass1HF.A0q(view, true);
                        return;
                    }
                    return;
                case 1:
                case 6:
                    break;
                case 2:
                    cvK.A0O(str2);
                    cvK.A0V(context.getString(2131898670));
                    return;
                case 3:
                    cvK.A0O("android.widget.ImageView");
                    cvK.A0M(C26137Ct0.A0f);
                    return;
                case 4:
                    str2 = "android.widget.TabWidget";
                    break;
                case 5:
                    cvK.A0O(str2);
                    cvK.A0q(true);
                    return;
                default:
                    return;
            }
            cvK.A0O(str2);
        }
    }
}
