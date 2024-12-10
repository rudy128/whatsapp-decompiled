package X;

import android.app.Activity;
import java.util.HashMap;
import java.util.Stack;

/* renamed from: X.9Pg  reason: invalid class name and case insensitive filesystem */
public abstract class C181129Pg {
    public static void A00(Activity activity, C19974A1j a1j, A45 a45, HashMap hashMap) {
        B7W b7w = (B7W) activity;
        Object remove = hashMap.remove("clear_backstack");
        Object remove2 = hashMap.remove("get_params_from_stack");
        Object remove3 = hashMap.remove("camera_permission");
        Stack stack = a1j.A02;
        HashMap hashMap2 = new HashMap((HashMap) stack.peek());
        if (remove2 != null) {
            hashMap2.putAll(hashMap);
            hashMap = hashMap2;
        }
        if (remove != null) {
            AnonymousClass1GP supportFragmentManager = ((AnonymousClass1FL) b7w).getSupportFragmentManager();
            for (int i = 0; i < supportFragmentManager.A0K(); i++) {
                supportFragmentManager.A0b();
                C19974A1j.A00(a1j.A01);
                stack.pop();
            }
        }
        C19974A1j.A00(a1j.A01);
        stack.add(C17880vN.A11());
        a1j.A02(hashMap);
        E8A e8a = a45.A01;
        if (e8a != null) {
            a1j.A01(a45.A00, e8a, "backpress");
        }
        if (remove3 != null) {
            AnonymousClass91q r7 = (AnonymousClass91q) ((C22538BBv) activity);
            AnonymousClass74O.A0J(r7, r7.A03, 30);
        }
    }
}
