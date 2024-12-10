package com.whatsapp.payments.phoenix.flowconfigurationservice.clientdaslquery;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass8BS;
import X.AnonymousClass8pK;
import X.C179949Kn;
import X.C18070vi;
import X.C20074A6a;
import X.C20923Abd;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.payments.phoenix.flowconfigurationservice.clientdaslquery.BrazilDeviceResolver$resolve$1", f = "BrazilDeviceResolver.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
public final class BrazilDeviceResolver$resolve$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass8pK $card;
    public final /* synthetic */ C179949Kn $field;
    public int label;
    public final /* synthetic */ C20923Abd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazilDeviceResolver$resolve$1(AnonymousClass8pK r2, C20923Abd abd, C179949Kn r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = abd;
        this.$card = r2;
        this.$field = r4;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new BrazilDeviceResolver$resolve$1(this.$card, this.this$0, this.$field, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C20923Abd abd = this.this$0;
            AnonymousClass8pK r2 = this.$card;
            this.label = 1;
            if (AnonymousClass1OW.A00(this, new BrazilDeviceResolver$buildBindingData$2(r2, abd, (C30391dr) null)) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C20923Abd abd2 = this.this$0;
        int ordinal = this.$field.ordinal();
        if (ordinal != 6) {
            if (ordinal == 7) {
                C20074A6a a6a = abd2.A07;
                String str = abd2.A01;
                if (str != null) {
                    return a6a.A05(str);
                }
            } else if (ordinal == 8) {
                String str2 = abd2.A01;
                if (str2 != null) {
                    if (str2.length() != 0) {
                        return str2;
                    }
                    throw AnonymousClass000.A0s("fun resolve networkDeviceId must not be null");
                }
            } else if (ordinal == 9) {
                String str3 = abd2.A02;
                if (str3 == null) {
                    C18070vi.A11("tokenId");
                    throw null;
                } else if (str3.length() != 0) {
                    C20074A6a a6a2 = abd2.A07;
                    String str4 = abd2.A01;
                    if (str4 != null) {
                        String str5 = abd2.A00;
                        if (str5 != null) {
                            return a6a2.A08(str4, str5, str3);
                        }
                    }
                } else {
                    throw AnonymousClass000.A0s("fun resolve : tokenId must not be null");
                }
            } else if (ordinal != 10) {
                return null;
            } else {
                return AnonymousClass8BS.A0e(abd2.A04, abd2.A05);
            }
            C18070vi.A11("networkDeviceId");
            throw null;
        }
        String str6 = abd2.A00;
        if (str6 != null) {
            return str6;
        }
        C18070vi.A11("clientReferenceId");
        throw null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BrazilDeviceResolver$resolve$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
