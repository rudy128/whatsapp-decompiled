package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3To;
import X.AnonymousClass9LM;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C88294Zc;
import com.whatsapp.community.mex.TransferCommunityOwnershipGraphQlHandler;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.TransferCommunityOwnershipViewModel$onTransferOwnershipConfirmed$2", f = "TransferCommunityOwnershipViewModel.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
public final class TransferCommunityOwnershipViewModel$onTransferOwnershipConfirmed$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $adminJid;
    public int label;
    public final /* synthetic */ AnonymousClass3To this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferCommunityOwnershipViewModel$onTransferOwnershipConfirmed$2(AnonymousClass3To r2, UserJid userJid, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$adminJid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new TransferCommunityOwnershipViewModel$onTransferOwnershipConfirmed$2(this.this$0, this.$adminJid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1G4 r4;
        C31751g4 r42 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            if (!this.this$0.A01.A09()) {
                AnonymousClass1G4 r5 = this.this$0.A05;
                do {
                } while (!r5.BFK(r5.getValue(), new C88294Zc((AnonymousClass1E7) null, AnonymousClass00R.A0Y, AnonymousClass3MW.A0v(138))));
            } else {
                try {
                    AnonymousClass3To r0 = this.this$0;
                    TransferCommunityOwnershipGraphQlHandler transferCommunityOwnershipGraphQlHandler = r0.A00;
                    AnonymousClass1EC r1 = r0.A03;
                    UserJid userJid = this.$adminJid;
                    this.label = 1;
                    if (transferCommunityOwnershipGraphQlHandler.A00(r1, userJid, this) == r42) {
                        return r42;
                    }
                    r4 = this.this$0.A05;
                    do {
                    } while (!r4.BFK(r4.getValue(), new C88294Zc((AnonymousClass1E7) null, AnonymousClass00R.A0N, (Integer) null)));
                } catch (AnonymousClass9LM e) {
                    AnonymousClass1G4 r52 = this.this$0.A05;
                    do {
                    } while (!r52.BFK(r52.getValue(), new C88294Zc((AnonymousClass1E7) null, AnonymousClass00R.A0Y, AnonymousClass3MW.A0v(e.errorCode))));
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
            r4 = this.this$0.A05;
            do {
            } while (!r4.BFK(r4.getValue(), new C88294Zc((AnonymousClass1E7) null, AnonymousClass00R.A0N, (Integer) null)));
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TransferCommunityOwnershipViewModel$onTransferOwnershipConfirmed$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
