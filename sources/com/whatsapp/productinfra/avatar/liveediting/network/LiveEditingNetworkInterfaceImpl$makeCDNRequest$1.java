package com.whatsapp.productinfra.avatar.liveediting.network;

import X.AUZ;
import X.AnonymousClass000;
import X.AnonymousClass1EY;
import X.AnonymousClass1OS;
import X.C108955ca;
import X.C127636eg;
import X.C17900vP;
import X.C18070vi;
import X.C220418j;
import X.C22821Di;
import X.C26652D8b;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.network.LiveEditingNetworkInterfaceImpl$makeCDNRequest$1", f = "LiveEditingNetworkInterfaceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LiveEditingNetworkInterfaceImpl$makeCDNRequest$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $onFailure;
    public final /* synthetic */ C22821Di $onSuccess;
    public final /* synthetic */ String $url;
    public int label;
    public final /* synthetic */ C26652D8b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveEditingNetworkInterfaceImpl$makeCDNRequest$1(C26652D8b d8b, String str, C30391dr r4, C22821Di r5, C22821Di r6) {
        super(2, r4);
        this.this$0 = d8b;
        this.$url = str;
        this.$onSuccess = r5;
        this.$onFailure = r6;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new LiveEditingNetworkInterfaceImpl$makeCDNRequest$1(this.this$0, this.$url, r8, this.$onSuccess, this.$onFailure);
    }

    public final Object invokeSuspend(Object obj) {
        AUZ auz;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C127636eg r7 = this.this$0.A01;
            String str = this.$url;
            C22821Di r6 = this.$onSuccess;
            C22821Di r4 = this.$onFailure;
            C18070vi.A0d(str, 0);
            Log.i("Starting request");
            try {
                auz = r7.A01.A07((C220418j) null, str, (String) null);
                try {
                    int responseCode = auz.A01.getResponseCode();
                    byte[] A04 = AnonymousClass1EY.A04(C108955ca.A0N(r7.A00, auz, (Integer) null, 35));
                    C18070vi.A0X(A04);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(A04.length);
                    allocateDirect.put(A04);
                    r6.invoke(allocateDirect);
                    C17900vP.A0j("Success with code: ", AnonymousClass000.A10(), responseCode);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                auz = null;
                try {
                    Log.e("Error occurred", th);
                    r4.invoke(C17900vP.A0C("download failed: ", AnonymousClass000.A10(), th));
                } finally {
                    if (auz != null) {
                        auz.close();
                    }
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LiveEditingNetworkInterfaceImpl$makeCDNRequest$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
