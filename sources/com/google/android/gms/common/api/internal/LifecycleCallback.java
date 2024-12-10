package com.google.android.gms.common.api.internal;

import X.AnonymousClass000;
import X.C17880vN;
import X.C180269Lu;
import X.C18210vx;
import X.E9G;
import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {
    public final E9G mLifecycleFragment;

    public LifecycleCallback(E9G e9g) {
        this.mLifecycleFragment = e9g;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static E9G getChimeraLifecycleFragmentImpl(C180269Lu r0) {
        throw AnonymousClass000.A0n("Method not available in SDK.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r3 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        if (r0 != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r3 == null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.E9G getFragment(android.app.Activity r4) {
        /*
            java.lang.String r0 = "Activity must not be null"
            X.C18210vx.A02(r4, r0)
            boolean r0 = r4 instanceof X.AnonymousClass1FL
            if (r0 == 0) goto L_0x004c
            X.1FL r4 = (X.AnonymousClass1FL) r4
            java.lang.String r2 = "SupportLifecycleFragmentImpl"
            java.util.WeakHashMap r1 = com.google.android.gms.common.api.internal.zzd.A03
            java.lang.Object r0 = r1.get(r4)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x001f
            java.lang.Object r3 = r0.get()
            com.google.android.gms.common.api.internal.zzd r3 = (com.google.android.gms.common.api.internal.zzd) r3
            if (r3 != 0) goto L_0x008f
        L_0x001f:
            X.1GP r0 = r4.getSupportFragmentManager()     // Catch:{ ClassCastException -> 0x0043 }
            androidx.fragment.app.Fragment r3 = r0.A0Q(r2)     // Catch:{ ClassCastException -> 0x0043 }
            com.google.android.gms.common.api.internal.zzd r3 = (com.google.android.gms.common.api.internal.zzd) r3     // Catch:{ ClassCastException -> 0x0043 }
            if (r3 == 0) goto L_0x002f
            boolean r0 = r3.A0j
            if (r0 == 0) goto L_0x003b
        L_0x002f:
            com.google.android.gms.common.api.internal.zzd r3 = new com.google.android.gms.common.api.internal.zzd
            r3.<init>()
            X.1jj r0 = X.AnonymousClass3Ma.A0H(r4)
            X.AnonymousClass8BV.A18(r0, r3, r2)
        L_0x003b:
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r3)
            r1.put(r4, r0)
            return r3
        L_0x0043:
            r2 = move-exception
            java.lang.String r1 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x004c:
            if (r4 == 0) goto L_0x0099
            java.lang.String r2 = "LifecycleFragmentImpl"
            java.util.WeakHashMap r1 = X.C161038Bc.A03
            java.lang.Object r0 = r1.get(r4)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0062
            java.lang.Object r3 = r0.get()
            X.8Bc r3 = (X.C161038Bc) r3
            if (r3 != 0) goto L_0x008f
        L_0x0062:
            android.app.FragmentManager r0 = r4.getFragmentManager()     // Catch:{ ClassCastException -> 0x0090 }
            android.app.Fragment r3 = r0.findFragmentByTag(r2)     // Catch:{ ClassCastException -> 0x0090 }
            X.8Bc r3 = (X.C161038Bc) r3     // Catch:{ ClassCastException -> 0x0090 }
            if (r3 == 0) goto L_0x0074
            boolean r0 = r3.isRemoving()
            if (r0 == 0) goto L_0x0088
        L_0x0074:
            X.8Bc r3 = new X.8Bc
            r3.<init>()
            android.app.FragmentManager r0 = r4.getFragmentManager()
            android.app.FragmentTransaction r0 = r0.beginTransaction()
            android.app.FragmentTransaction r0 = r0.add(r3, r2)
            r0.commitAllowingStateLoss()
        L_0x0088:
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r3)
            r1.put(r4, r0)
        L_0x008f:
            return r3
        L_0x0090:
            r2 = move-exception
            java.lang.String r1 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x0099:
            java.lang.String r0 = "Can't get fragment for unexpected activity."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(android.app.Activity):X.E9G");
    }

    public Activity getActivity() {
        Activity BTz = this.mLifecycleFragment.BTz();
        C18210vx.A00(BTz);
        return BTz;
    }

    public static E9G getFragment(C180269Lu r0) {
        throw AnonymousClass000.A0s("zzd");
    }

    public static E9G getFragment(ContextWrapper contextWrapper) {
        throw C17880vN.A0y();
    }
}
