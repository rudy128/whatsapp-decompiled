package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.BE8;
import X.BEA;
import X.C17880vN;
import X.C25334Cdf;
import X.C25764Cla;
import X.C26028Cqm;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityManager;

public final class bn {
    public final C26028Cqm a;
    public final C25764Cla b;
    public final String c;
    public final TaskCompletionSource d;
    public final at e;
    public final k f;

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar, int i) {
        if (!bnVar.d.zza.isSuccessful() || AnonymousClass000.A0M(bnVar.d.zza.getResult()) >= 83420000) {
            return false;
        }
        return true;
    }

    public static /* bridge */ /* synthetic */ boolean l(bn bnVar) {
        if (!bnVar.d.zza.isSuccessful() || AnonymousClass000.A0M(bnVar.d.zza.getResult()) != 0) {
            return false;
        }
        return true;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i = bundle.getInt("dialog.intent.type");
        this.b.A02("requestAndShowDialog(%s)", BEA.A1b(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.A03(taskCompletionSource, new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i));
        return taskCompletionSource.zza;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.E5w] */
    public bn(Context context, C25764Cla cla, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d = taskCompletionSource;
        this.c = context.getPackageName();
        this.b = cla;
        this.e = atVar;
        this.f = kVar;
        C26028Cqm cqm = new C26028Cqm(context, bo.a, cla, new Object(), "ExpressIntegrityService");
        this.a = cqm;
        cqm.A01().post(new be(this, taskCompletionSource, context));
    }

    public static /* bridge */ /* synthetic */ Bundle a(bn bnVar, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, int i) {
        Bundle A0D = C17880vN.A0D();
        A0D.putString("package.name", bnVar.c);
        A0D.putLong("cloud.prj", j);
        h hVar = (h) standardIntegrityTokenRequest;
        A0D.putString("nonce", hVar.a);
        A0D.putLong("warm.up.sid", j2);
        A0D.putInt("playcore.integrity.version.major", 1);
        A0D.putInt("playcore.integrity.version.minor", 4);
        A0D.putInt("playcore.integrity.version.patch", 0);
        A0D.putInt("webview.request.mode", 0);
        A0D.putIntegerArrayList("request.verdict.opt.out", C17880vN.A10(hVar.b));
        C25334Cdf.A01(A0D, AnonymousClass000.A13(), 5);
        return A0D;
    }

    public static /* bridge */ /* synthetic */ Bundle b(bn bnVar, long j, int i) {
        Bundle A0D = C17880vN.A0D();
        A0D.putString("package.name", bnVar.c);
        A0D.putLong("cloud.prj", j);
        A0D.putInt("playcore.integrity.version.major", 1);
        A0D.putInt("playcore.integrity.version.minor", 4);
        A0D.putInt("playcore.integrity.version.patch", 0);
        A0D.putInt("webview.request.mode", 0);
        C25334Cdf.A01(A0D, AnonymousClass000.A13(), 4);
        return A0D;
    }

    public final Task d(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, int i) {
        Object[] A1a = AnonymousClass3MW.A1a();
        long j3 = j2;
        BE8.A1N(A1a, j3);
        this.b.A02("requestExpressIntegrityToken(%s)", A1a);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.A03(taskCompletionSource, new bg(this, taskCompletionSource, 0, standardIntegrityTokenRequest, j, j3, taskCompletionSource));
        return taskCompletionSource.zza;
    }

    public final Task e(long j, int i) {
        Object[] A1a = AnonymousClass3MW.A1a();
        BE8.A1N(A1a, j);
        this.b.A02("warmUpIntegrityToken(%s)", A1a);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.A03(taskCompletionSource, new bf(this, taskCompletionSource, 0, j, taskCompletionSource));
        return taskCompletionSource.zza;
    }
}
