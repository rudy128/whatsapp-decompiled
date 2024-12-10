package com.whatsapp.calling.dialer;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass4Z5;
import X.C108965cb;
import X.C186619eU;
import X.C27191Vc;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerProfilePhotoLoader$getContactPhoto$2", f = "DialerProfilePhotoLoader.kt", i = {0, 0}, l = {78}, m = "invokeSuspend", n = {"size", "radius"}, s = {"I$0", "F$0"})
public final class DialerProfilePhotoLoader$getContactPhoto$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public final /* synthetic */ boolean $requestFromServer;
    public float F$0;
    public int I$0;
    public int label;
    public final /* synthetic */ C186619eU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialerProfilePhotoLoader$getContactPhoto$2(C186619eU r2, AnonymousClass1E7 r3, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = r2;
        this.$requestFromServer = z;
        this.$contact = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new DialerProfilePhotoLoader$getContactPhoto$2(this.this$0, this.$contact, r6, this.$requestFromServer);
    }

    public final Object invokeSuspend(Object obj) {
        int dimensionPixelSize;
        float f;
        int i;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            dimensionPixelSize = AnonymousClass3MW.A05(this.this$0.A00).getDimensionPixelSize(2131166462);
            float f2 = (float) dimensionPixelSize;
            f = f2 / 2.0f;
            if (this.$requestFromServer) {
                C186619eU r9 = this.this$0;
                AnonymousClass1E7 r3 = this.$contact;
                this.I$0 = dimensionPixelSize;
                this.F$0 = f;
                this.label = 1;
                AnonymousClass1BI A00 = AnonymousClass1E7.A00(r3);
                int i3 = 1;
                if (f2 >= C108965cb.A08(r9.A00.A00).density * 96.0f) {
                    i = r3.A07;
                } else {
                    i = r3.A08;
                    i3 = 2;
                }
                if (AnonymousClass4Z5.A00(this, new DialerProfilePhotoLoader$prefetchProfilePhotoSync$2(r9, A00, (C30391dr) null, i, i3), 5000) == r2) {
                    return r2;
                }
            }
        } else if (i2 == 1) {
            f = this.F$0;
            dimensionPixelSize = this.I$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        Bitmap A03 = ((C27191Vc) this.this$0.A02.get()).A03(this.this$0.A00.A00, this.$contact, "DialerProfilePhotoLoader.getContactPhoto", f, dimensionPixelSize, 604800000, true, this.$requestFromServer);
        if (A03 != null) {
            return new BitmapDrawable(AnonymousClass3MW.A05(this.this$0.A00), A03);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DialerProfilePhotoLoader$getContactPhoto$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
