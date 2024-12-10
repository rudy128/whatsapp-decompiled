package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import X.AnonymousClass8BV;
import X.C17880vN;
import X.C17890vO;
import X.C25334Cdf;
import X.C25410CfH;
import X.C25764Cla;
import X.C26028Cqm;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;

public final class aj {
    public final C26028Cqm a;
    public final C25764Cla b;
    public final String c;
    public final Context d;
    public final at e;
    public final k f;

    public final Task b(Activity activity, Bundle bundle) {
        if (this.a == null) {
            IntegrityServiceException integrityServiceException = new IntegrityServiceException(-2, (Throwable) null);
            zzw zzw = new zzw();
            zzw.zza(integrityServiceException);
            return zzw;
        }
        int i = bundle.getInt("dialog.intent.type");
        C25764Cla cla = this.b;
        Object[] A1a = C17890vO.A1a(this.c);
        C17880vN.A1T(A1a, i, 1);
        cla.A02("requestAndShowDialog(%s, %s)", A1a);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.A03(taskCompletionSource, new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i));
        return taskCompletionSource.zza;
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        IntegrityServiceException integrityServiceException;
        if (this.a != null) {
            try {
                PackageInfo packageInfo = this.d.getPackageManager().getPackageInfo("com.android.vending", 64);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null && applicationInfo.enabled && C25410CfH.A00(packageInfo.signatures) && packageInfo.versionCode >= 82380000) {
                    IntegrityTokenRequest integrityTokenRequest2 = integrityTokenRequest;
                    try {
                        ao aoVar = (ao) integrityTokenRequest2;
                        byte[] decode = Base64.decode(aoVar.a, 10);
                        Long l = aoVar.b;
                        this.b.A02("requestIntegrityToken(%s)", AnonymousClass8BV.A1b(integrityTokenRequest));
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        this.a.A03(taskCompletionSource, new af(this, taskCompletionSource, decode, l, (Parcelable) null, taskCompletionSource, integrityTokenRequest2));
                        return taskCompletionSource.zza;
                    } catch (IllegalArgumentException e2) {
                        integrityServiceException = new IntegrityServiceException(-13, e2);
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            integrityServiceException = new IntegrityServiceException(-14, (Throwable) null);
        } else {
            integrityServiceException = new IntegrityServiceException(-2, (Throwable) null);
        }
        zzw zzw = new zzw();
        zzw.zza(integrityServiceException);
        return zzw;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.E5w] */
    public aj(Context context, C25764Cla cla, at atVar, k kVar) {
        C26028Cqm cqm;
        Context context2 = context;
        this.c = context.getPackageName();
        C25764Cla cla2 = cla;
        this.b = cla;
        this.e = atVar;
        this.f = kVar;
        this.d = context;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                C25410CfH.A00.A03("Play Store package is disabled.", new Object[0]);
            } else if (C25410CfH.A00(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                cqm = new C26028Cqm(context2, ak.a, cla2, new Object(), "IntegrityService");
                this.a = cqm;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            C25410CfH.A00.A03("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", C25764Cla.A00(cla.A00, "Phonesky is not installed.", objArr));
        }
        cqm = null;
        this.a = cqm;
    }

    public static /* bridge */ /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l, Parcelable parcelable) {
        Bundle A0D = C17880vN.A0D();
        A0D.putString("package.name", ajVar.c);
        A0D.putByteArray("nonce", bArr);
        A0D.putInt("playcore.integrity.version.major", 1);
        A0D.putInt("playcore.integrity.version.minor", 4);
        A0D.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            A0D.putLong("cloud.prj", l.longValue());
        }
        if (parcelable != null) {
            A0D.putParcelable("network", parcelable);
        }
        C25334Cdf.A01(A0D, AnonymousClass000.A13(), 3);
        return A0D;
    }
}
