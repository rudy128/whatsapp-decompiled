package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.3d7  reason: invalid class name and case insensitive filesystem */
public final class C74913d7 extends C74703cE {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C85554Nv A01;
    public final /* synthetic */ AnonymousClass206 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74913d7(Context context, AnonymousClass1KB r9, C36361nl r10, C85554Nv r11, AnonymousClass11C r12, AnonymousClass206 r13, String str) {
        super(context, (AnonymousClass1L8) r10, r9, r12, (AnonymousClass206) null, str);
        this.A00 = context;
        this.A01 = r11;
        this.A02 = r13;
    }

    public void onClick(View view) {
        C19880zA r1 = this.A01.A00;
        if (r1.A07()) {
            r1.A03();
            throw AnonymousClass000.A0s("showPaymentAmountDetectionBottomsheetHelper");
        }
    }
}
