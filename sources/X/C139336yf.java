package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.6yf  reason: invalid class name and case insensitive filesystem */
public final class C139336yf {
    public final AnonymousClass1KB A00;
    public final C32531hL A01;
    public final AnonymousClass118 A02;
    public final C27301Vn A03;
    public final C19830z4 A04;
    public final C33841jT A05;
    public final AnonymousClass1CM A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;

    public C139336yf(AnonymousClass1KB r1, C32531hL r2, AnonymousClass118 r3, C27301Vn r4, C19830z4 r5, C33841jT r6, AnonymousClass1CM r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r1, r3, r2, r6, r8);
        C18070vi.A0x(r4, r9, r7, r10, r5);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
        this.A08 = r8;
        this.A03 = r4;
        this.A09 = r9;
        this.A06 = r7;
        this.A07 = r10;
        this.A04 = r5;
    }

    public static final Intent A00(Context context, String str, String str2, String str3, int i, int i2, int i3) {
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(context.getPackageName(), "com.whatsapp.waffle.wfac.ui.WfacBanActivity");
        A0A.putExtra("ban_violation_type", i);
        A0A.putExtra("ban_violation_reason", str2);
        A0A.putExtra("ban_violation_source", i2);
        A0A.putExtra("launch_source", i3);
        A0A.putExtra("appeal_decision", str3);
        A0A.putExtra("ban_status_request_token", str);
        return A0A;
    }

    public final void A01(int i, int i2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WfacManager/startWfacBanLogging launchSource {");
        A10.append(i);
        A10.append("} vs {");
        A10.append(i2);
        C18070vi.A0d(C17890vO.A0b(A10), 0);
        ((C133456om) this.A09.get()).A00("banned", i2, i);
    }
}
