package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1OS;
import X.AnonymousClass8BU;
import X.C17880vN;
import X.C22821Di;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.ArrayList;

public final class zzcc extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String[] zza;
    public final /* synthetic */ zzcd zzb;
    public final /* synthetic */ String zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcc(String[] strArr, zzcd zzcd, String str, C30391dr r5) {
        super(2, r5);
        this.zza = strArr;
        this.zzb = zzcd;
        this.zzc = str;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new zzcc(this.zza, this.zzb, this.zzc, r6);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcc) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C30691eM.A01(obj);
        ArrayList A0z = C17880vN.A0z(r4);
        for (String A1H : this.zza) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("\"");
            A0z.add(AnonymousClass001.A1H(A1H, "\"", A10));
        }
        zzcd zzcd = this.zzb;
        String str = this.zzc;
        WebView webView = zzcd.zza;
        String A0h = C29431cG.A0h(",", A0z, (C22821Di) null);
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append("(");
        A11.append(A0h);
        webView.evaluateJavascript(AnonymousClass8BU.A0q(A11), (ValueCallback) null);
        return C27621Wu.A00;
    }
}
