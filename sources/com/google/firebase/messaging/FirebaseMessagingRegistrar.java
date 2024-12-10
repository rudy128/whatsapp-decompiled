package com.google.firebase.messaging;

import X.C18220vy;
import X.C18330wD;
import X.C18340wE;
import X.C18440wP;
import X.C18480wV;
import X.C18490wW;
import X.C18500wX;
import X.C18520wb;
import X.C18550wf;
import X.C18650wv;
import X.C18660ww;
import X.C65512wc;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    public static final String LIBRARY_NAME = "fire-fcm";

    public List getComponents() {
        C18330wD[] r3 = new C18330wD[2];
        C18340wE r6 = new C18340wE(FirebaseMessaging.class, new Class[0]);
        r6.A03 = LIBRARY_NAME;
        r6.A01(new C18490wW(C18220vy.class, 1, 0));
        r6.A01(new C18490wW(C18650wv.class, 0, 0));
        r6.A01(new C18490wW(C18660ww.class, 0, 1));
        r6.A01(new C18490wW(C18500wX.class, 0, 1));
        r6.A01(new C18490wW(C18550wf.class, 0, 0));
        r6.A01(new C18490wW(C18480wV.class, 1, 0));
        r6.A01(new C18490wW(C18440wP.class, 1, 0));
        r6.A02 = new C65512wc(6);
        boolean z = false;
        if (r6.A00 == 0) {
            z = true;
        }
        if (z) {
            r6.A00 = 1;
            r3[0] = r6.A00();
            r3[1] = C18520wb.A00(LIBRARY_NAME, "23.4.1");
            return Arrays.asList(r3);
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
