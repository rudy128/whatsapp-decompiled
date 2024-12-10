package com.google.android.gms.common.api.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00O;
import X.BG7;
import X.C17880vN;
import X.C17890vO;
import X.C21459AkQ;
import X.E9G;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzd extends Fragment implements E9G {
    public static final WeakHashMap A03 = new WeakHashMap();
    public int A00 = 0;
    public Bundle A01;
    public final Map A02 = Collections.synchronizedMap(new AnonymousClass00O(0));

    public final void A20(Bundle bundle) {
        if (bundle != null) {
            Iterator A15 = AnonymousClass000.A15(this.A02);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                Bundle A0D = C17880vN.A0D();
                ((LifecycleCallback) A16.getValue()).onSaveInstanceState(A0D);
                bundle.putBundle(C17880vN.A0x(A16), A0D);
            }
        }
    }

    public final void BB1(LifecycleCallback lifecycleCallback, String str) {
        Map map = this.A02;
        if (!map.containsKey(str)) {
            map.put(str, lifecycleCallback);
            if (this.A00 > 0) {
                new BG7(Looper.getMainLooper()).post(new C21459AkQ(lifecycleCallback, this, str, 7));
                return;
            }
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LifecycleCallback with tag ");
        A10.append(str);
        throw AnonymousClass001.A12(" already added to this fragment.", A10);
    }

    public final LifecycleCallback BO7(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.A02.get(str));
    }

    public final void A1W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.A1W(str, fileDescriptor, printWriter, strArr);
        Iterator A0l = C17890vO.A0l(this.A02);
        while (A0l.hasNext()) {
            A0l.next();
        }
    }

    public final void A1j() {
        super.A1j();
        this.A00 = 4;
        Iterator A0l = C17890vO.A0l(this.A02);
        while (A0l.hasNext()) {
            ((LifecycleCallback) A0l.next()).onStop();
        }
    }

    public final void A1r() {
        super.A1r();
        this.A00 = 5;
        Iterator A0l = C17890vO.A0l(this.A02);
        while (A0l.hasNext()) {
            A0l.next();
        }
    }

    public final void A1u() {
        super.A1u();
        this.A00 = 3;
        Iterator A0l = C17890vO.A0l(this.A02);
        while (A0l.hasNext()) {
            ((LifecycleCallback) A0l.next()).onResume();
        }
    }

    public final void A1v() {
        super.A1v();
        this.A00 = 2;
        Iterator A0l = C17890vO.A0l(this.A02);
        while (A0l.hasNext()) {
            ((LifecycleCallback) A0l.next()).onStart();
        }
    }

    public final void A1w(int i, int i2, Intent intent) {
        super.A1w(i, i2, intent);
        Iterator A0l = C17890vO.A0l(this.A02);
        while (A0l.hasNext()) {
            ((LifecycleCallback) A0l.next()).onActivityResult(i, i2, intent);
        }
    }

    public final void A1z(Bundle bundle) {
        Bundle bundle2;
        super.A1z(bundle);
        this.A00 = 1;
        this.A01 = bundle;
        Iterator A15 = AnonymousClass000.A15(this.A02);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            LifecycleCallback lifecycleCallback = (LifecycleCallback) A16.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle(C17880vN.A0x(A16));
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
    }

    public final /* synthetic */ Activity BTz() {
        return A1B();
    }
}
