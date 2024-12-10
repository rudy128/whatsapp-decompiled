package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment;

/* renamed from: X.78G  reason: invalid class name */
public class AnonymousClass78G implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public AnonymousClass78G(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A05 = str;
        this.A03 = obj2;
        this.A01 = i;
        this.A04 = obj3;
    }

    public final void onClick(View view) {
        AnonymousClass1DS r5;
        Intent className;
        String str;
        int i;
        Context A0D;
        String str2;
        long j;
        int i2;
        switch (this.A00) {
            case 0:
                String str3 = this.A05;
                int i3 = this.A01;
                AnonymousClass1FU r4 = (AnonymousClass1FU) this.A04;
                ((IndiaUpiScanQrCodeFragment) this.A02).A07.BiL(196, "scan_qr_code", str3, 1);
                Intent intent = new Intent(((View) this.A03).getContext(), IndiaUpiPaymentsAccountSetupActivity.class);
                intent.putExtra("extra_payments_entry_type", i3);
                intent.putExtra("referral_screen", str3);
                intent.putExtra("extra_referral_screen", str3);
                intent.putExtra("extra_skip_value_props_display", false);
                intent.putExtra("extra_scan_qr_onboarding_only", true);
                intent.putExtra("extra_deep_link_url", r4.getIntent().getParcelableExtra("actual_deep_link"));
                r4.CNh(intent, 1025);
                return;
            case 1:
                C113405n2 r6 = (C113405n2) this.A02;
                String str4 = this.A05;
                int i4 = this.A01;
                AnonymousClass7PZ r42 = (AnonymousClass7PZ) this.A03;
                r5 = (AnonymousClass1DS) this.A04;
                AnonymousClass18K r3 = r6.A05;
                boolean A0V = C22971Dz.A0V(r42.A01());
                C18070vi.A0e(str4, 0, r3);
                C81653za r1 = new C81653za();
                int i5 = 3;
                if (A0V) {
                    i5 = 7;
                }
                C83964Hi.A00(r1, str4, i5, i4);
                r3.CC7(r1);
                Context A0D2 = C108945cZ.A0D(r6);
                AnonymousClass1BI A012 = r42.A01();
                long j2 = r42.A00.A0I;
                className = C17880vN.A0A().setClassName(A0D2.getPackageName(), "com.whatsapp.storage.StorageUsageGalleryActivity");
                className.putExtra("gallery_type", 0);
                AnonymousClass3MY.A13(className, A012, "jid");
                className.putExtra("memory_size", j2);
                className.putExtra("session_id", str4);
                className.putExtra("entry_point", i4);
                break;
            case 2:
                C113445n6 r43 = (C113445n6) this.A02;
                str = this.A05;
                i = this.A01;
                r5 = (AnonymousClass1DS) this.A04;
                AnonymousClass18K r2 = r43.A06;
                C18070vi.A0i(str, r2);
                C81653za r12 = new C81653za();
                C83964Hi.A00(r12, str, 5, i);
                r2.CC7(r12);
                A0D = C108945cZ.A0D(r43);
                str2 = null;
                j = ((C128726ga) this.A03).A01;
                i2 = 1;
                break;
            default:
                C113445n6 r44 = (C113445n6) this.A02;
                str = this.A05;
                i = this.A01;
                r5 = (AnonymousClass1DS) this.A04;
                AnonymousClass18K r22 = r44.A06;
                i2 = C72453Mb.A0G(str, r22, 0);
                C81653za r13 = new C81653za();
                C83964Hi.A00(r13, str, 4, i);
                r22.CC7(r13);
                A0D = C108945cZ.A0D(r44);
                str2 = null;
                j = ((C128726ga) this.A03).A01;
                break;
        }
        className = C17880vN.A0A().setClassName(A0D.getPackageName(), "com.whatsapp.storage.StorageUsageGalleryActivity");
        className.putExtra("gallery_type", i2);
        className.putExtra("jid", str2);
        className.putExtra("memory_size", j);
        className.putExtra("session_id", str);
        className.putExtra("entry_point", i);
        r5.A0F(className);
    }
}
