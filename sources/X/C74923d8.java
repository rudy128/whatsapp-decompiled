package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet;

/* renamed from: X.3d8  reason: invalid class name and case insensitive filesystem */
public class C74923d8 extends C74703cE {
    public boolean A00;
    public final Context A01;
    public final C18030ve A02;
    public final AnonymousClass206 A03;

    public C74923d8(Context context, AnonymousClass1L8 r9, AnonymousClass1KB r10, AnonymousClass11C r11, C18030ve r12, AnonymousClass206 r13, String str) {
        super(context, r9, r10, r11, r13, str);
        this.A03 = r13;
        this.A02 = r12;
        this.A01 = context;
    }

    public boolean A01() {
        return false;
    }

    public void A03(Uri uri, View view, String str) {
        C18030ve r4 = this.A02;
        C18040vf r3 = C18040vf.A02;
        boolean A05 = C18020vd.A05(r3, r4, 8473);
        boolean A052 = C18020vd.A05(r3, r4, 8171);
        boolean A053 = C18020vd.A05(r3, r4, 9584);
        if ((!A052 || !A05) && !A053) {
            super.A03(uri, view, str);
            return;
        }
        view.invalidate();
        this.A01 = false;
        AnonymousClass1FL r1 = (AnonymousClass1FL) AnonymousClass1L9.A01(this.A01, AnonymousClass1FY.class);
        if (!r1.isFinishing()) {
            AnonymousClass1GP supportFragmentManager = r1.getSupportFragmentManager();
            boolean z = this.A00;
            AnonymousClass205 r32 = this.A03.A0v;
            C18070vi.A0W(r32);
            LinkLongPressBottomSheet linkLongPressBottomSheet = new LinkLongPressBottomSheet();
            Bundle A0D = C17880vN.A0D();
            A0D.putParcelable("arg-uri", uri);
            A0D.putBoolean("arg-should-show-suspicious-banner-on-link-open", z);
            AnonymousClass4aU.A0A(A0D, r32);
            linkLongPressBottomSheet.A1R(A0D);
            C20098A7b.A05(linkLongPressBottomSheet, supportFragmentManager, "LinkLongPressBottomSheet");
        }
    }
}
