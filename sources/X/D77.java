package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;

public class D77 implements E7C {
    public static Class A01;
    public static Method A02;
    public static Method A03;
    public static boolean A04;
    public static boolean A05;
    public static boolean A06;
    public final View A00;

    public void CFf(View view, ViewGroup viewGroup) {
    }

    public static void A00() {
        if (!A06) {
            try {
                A01 = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
            }
            A06 = true;
        }
    }

    public void setVisibility(int i) {
        this.A00.setVisibility(i);
    }

    public D77(View view) {
        this.A00 = view;
    }
}
