package com.whatsapp.profile.coinflip.edit;

import X.AnonymousClass000;
import X.AnonymousClass11S;
import X.AnonymousClass1E8;
import X.AnonymousClass1LU;
import X.AnonymousClass1OS;
import X.C17880vN;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C64062u9;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.coinflip.edit.CoinFlipEditPhotoTabFragment$launchCamera$1", f = "CoinFlipEditPhotoTabFragment.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
public final class CoinFlipEditPhotoTabFragment$launchCamera$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ CoinFlipEditPhotoTabFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoinFlipEditPhotoTabFragment$launchCamera$1(CoinFlipEditPhotoTabFragment coinFlipEditPhotoTabFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = coinFlipEditPhotoTabFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CoinFlipEditPhotoTabFragment$launchCamera$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CoinFlipEditPhotoTabFragment$launchCamera$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Context A1D;
        Context A1B;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass11S r0 = this.this$0.A01;
            if (r0 != null) {
                r0.A0I();
                AnonymousClass1E8 r2 = r0.A0D;
                if (r2 != null) {
                    CoinFlipEditPhotoTabFragment coinFlipEditPhotoTabFragment = this.this$0;
                    AnonymousClass1LU r1 = coinFlipEditPhotoTabFragment.A02;
                    if (r1 != null) {
                        A1D = coinFlipEditPhotoTabFragment.A1D();
                        CoinFlipEditPhotoTabFragment coinFlipEditPhotoTabFragment2 = this.this$0;
                        A1B = coinFlipEditPhotoTabFragment2.A1B();
                        this.L$0 = r1;
                        this.L$1 = A1D;
                        this.L$2 = A1B;
                        this.label = 1;
                        obj = ((CoinFlipEditBottomSheetViewModel) coinFlipEditPhotoTabFragment2.A03.getValue()).A0T(r2, this);
                        if (obj == r6) {
                            return r6;
                        }
                    } else {
                        str = "waIntents";
                    }
                }
                return C27621Wu.A00;
            }
            str = "meManager";
            C18070vi.A11(str);
            throw null;
        } else if (i == 1) {
            A1B = (Context) this.L$2;
            A1D = (Context) this.L$1;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        Uri A02 = C64062u9.A02(A1B, (File) obj);
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(A1D.getPackageName(), "com.whatsapp.profile.CapturePhoto");
        A0A.putExtra("target_file_uri", A02);
        Intent putExtra = A0A.putExtra("should_return_photo_source", false);
        C18070vi.A0X(putExtra);
        this.this$0.A1D().startActivityForResult(putExtra, 12, (Bundle) null);
        DialogFragment dialogFragment = this.this$0.A00;
        if (dialogFragment != null) {
            dialogFragment.A28();
        }
        return C27621Wu.A00;
    }
}
