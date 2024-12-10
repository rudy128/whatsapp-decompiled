package com.whatsapp.consent;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.consent.ConsentNavigationViewModel$resetPreferences$1", f = "ConsentNavigationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ConsentNavigationViewModel$resetPreferences$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ SharedPreferences $sharedPref;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsentNavigationViewModel$resetPreferences$1(SharedPreferences sharedPreferences, C30391dr r3) {
        super(2, r3);
        this.$sharedPref = sharedPreferences;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ConsentNavigationViewModel$resetPreferences$1(this.$sharedPref, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ConsentNavigationViewModel$resetPreferences$1(this.$sharedPref, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (!this.$sharedPref.edit().clear().commit()) {
                Log.e("ConsentNavigationViewModel/resetPreferences/clear failed");
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
