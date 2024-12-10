package com.whatsapp.productinfra.datasharingdisclosure.data;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass976;
import X.AnonymousClass977;
import X.C108995ce;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C185119c3;
import X.C191439mb;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import android.content.SharedPreferences;
import com.whatsapp.productinfra.datasharingdisclosure.data.network.ConsumerCtwaDisclosureProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.datasharingdisclosure.data.ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2", f = "ConsumerCtwaDisclosureRepository.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
public final class ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C191439mb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2(C191439mb r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        SharedPreferences.Editor putBoolean;
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            long A04 = C17890vO.A04((SharedPreferences) AnonymousClass3MX.A14(((C185119c3) this.this$0.A02.get()).A01), "consumer_disclosure");
            boolean A1W = C17880vN.A1W((SharedPreferences) AnonymousClass3MX.A14(((C185119c3) this.this$0.A02.get()).A01), "ack_synced");
            if (A04 != -1 && !A1W) {
                this.label = 1;
                obj = ((ConsumerCtwaDisclosureProtocolHelper) this.this$0.A01.get()).A00(this, A04);
                if (obj == r7) {
                    return r7;
                }
            }
            return C27621Wu.A00;
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        if (C18070vi.A18(obj, AnonymousClass977.A00)) {
            putBoolean = C108995ce.A0E(((C185119c3) this.this$0.A02.get()).A01).putBoolean("ack_synced", true);
        } else if (C18070vi.A18(obj, AnonymousClass976.A00)) {
            putBoolean = C108995ce.A0E(((C185119c3) this.this$0.A02.get()).A01).putBoolean("ack_synced", false);
        } else {
            throw AnonymousClass3MW.A14();
        }
        putBoolean.apply();
        return C27621Wu.A00;
    }
}
