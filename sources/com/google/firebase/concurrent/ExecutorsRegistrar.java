package com.google.firebase.concurrent;

import X.C18320wC;
import X.C18330wD;
import X.C18340wE;
import X.C18350wG;
import X.C18760x7;
import X.C18770x8;
import X.C65512wc;
import X.C65612wp;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final C18320wC A00 = new C18320wC(new C65612wp(2));
    public static final C18320wC A01 = new C18320wC(new C65612wp(4));
    public static final C18320wC A02 = new C18320wC(new C65612wp(3));
    public static final C18320wC A03 = new C18320wC(new C65612wp(5));

    public List getComponents() {
        Class<Background> cls = Background.class;
        Class<ScheduledExecutorService> cls2 = ScheduledExecutorService.class;
        Class<ExecutorService> cls3 = ExecutorService.class;
        Class<Executor> cls4 = Executor.class;
        C18340wE r1 = new C18340wE(new C18350wG(cls, cls2), new C18350wG(cls, cls3), new C18350wG(cls, cls4));
        r1.A02 = new C65512wc(0);
        Class<Blocking> cls5 = Blocking.class;
        C18340wE r12 = new C18340wE(new C18350wG(cls5, cls2), new C18350wG(cls5, cls3), new C18350wG(cls5, cls4));
        r12.A02 = new C65512wc(1);
        Class<Lightweight> cls6 = Lightweight.class;
        C18340wE r13 = new C18340wE(new C18350wG(cls6, cls2), new C18350wG(cls6, cls3), new C18350wG(cls6, cls4));
        r13.A02 = new C65512wc(2);
        C18340wE r2 = new C18340wE(new C18350wG(UiThread.class, cls4), new C18350wG[0]);
        r2.A02 = new C65512wc(3);
        return Arrays.asList(new C18330wD[]{r1.A00(), r12.A00(), r13.A00(), r2.A00()});
    }

    public static /* synthetic */ C18770x8 A00() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return new C18770x8(Executors.newFixedThreadPool(4, new C18760x7(detectNetwork.penaltyLog().build(), "Firebase Background", 10)), (ScheduledExecutorService) A03.get());
    }
}
