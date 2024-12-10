package X;

import android.content.Intent;
import com.whatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import java.util.List;

/* renamed from: X.Aei  reason: case insensitive filesystem */
public class C21114Aei implements AnonymousClass1TI {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C21114Aei(int i, String str, Object obj) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void accept(Object obj) {
        AnonymousClass8pK r1;
        switch (this.A00) {
            case 0:
                LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = (LinkedDevicesSharedViewModel) this.A01;
                String str = this.A02;
                try {
                    AnonymousClass1RK r4 = linkedDevicesSharedViewModel.A0F;
                    r4.A09(DeviceJid.Companion.A05(str), "user_initiated", false, !C108975cc.A1B(r4.A07().size()));
                    return;
                } catch (AnonymousClass11T e) {
                    C17900vP.A0h("Invalid jid: ", str, AnonymousClass000.A10(), e);
                    return;
                }
            case 1:
                C20119A8c a8c = (C20119A8c) this.A01;
                String str2 = this.A02;
                AnonymousClass1D6 r12 = (AnonymousClass1D6) obj;
                C18070vi.A0d(r12, 2);
                short s = 3;
                if (AnonymousClass000.A1Y(r12.first)) {
                    s = 2;
                }
                AnonymousClass8BR.A0V(a8c.A0M).A08(str2.hashCode(), s);
                if (AnonymousClass000.A1Y(r12.first)) {
                    C20130A8q a8q = a8c.A01;
                    if (a8q == null) {
                        C18070vi.A11("fdsManager");
                        throw null;
                    }
                    Object obj2 = r12.second;
                    if (obj2 != null) {
                        a8q.A0E(str2, (String) obj2);
                        return;
                    }
                    throw C17890vO.A0K();
                }
                return;
            case 2:
                ((AWI) this.A01).A03(C17880vN.A05(obj), AnonymousClass000.A1O(this.A02.contains("Media/") ? 1 : 0));
                return;
            case 3:
                BrazilPayBloksActivity brazilPayBloksActivity = (BrazilPayBloksActivity) this.A01;
                String str3 = this.A02;
                if (AnonymousClass000.A1Y(obj) && (r1 = (AnonymousClass8pK) brazilPayBloksActivity.A04.A08(str3)) != null) {
                    Intent A022 = brazilPayBloksActivity.A0H.A02(brazilPayBloksActivity, r1);
                    A022.putExtra("hide_send_payment_cta", brazilPayBloksActivity.getIntent().getBooleanExtra("hide_send_payment_cta", false));
                    brazilPayBloksActivity.startActivity(A022);
                }
                brazilPayBloksActivity.finish();
                return;
            case 4:
                AnonymousClass1FP r3 = (AnonymousClass1FP) this.A01;
                String str4 = this.A02;
                if (AnonymousClass000.A1Y(obj)) {
                    AnonymousClass8BT.A1K(r3.A05, r3, str4, 42);
                    return;
                }
                return;
            default:
                BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = (BrazilPixKeySettingViewModel) this.A01;
                String str5 = this.A02;
                List list = (List) obj;
                if (list.size() > AnonymousClass8BU.A1X(list) || brazilPixKeySettingViewModel.A08.A03.A03()) {
                    C175998zc r32 = brazilPixKeySettingViewModel.A07;
                    C184979bp r2 = new C184979bp(brazilPixKeySettingViewModel, str5);
                    C31061ex r5 = r32.A05;
                    String A06 = r5.A06();
                    AnonymousClass9F6 r13 = new AnonymousClass9F6(A06, str5, 13);
                    r5.A0H(new C20993Acl(r2, r32, r13, 15), (C29621ca) r13.A00, A06, C20113A7w.A0L);
                    return;
                }
                brazilPixKeySettingViewModel.A07.A00(new AXN(brazilPixKeySettingViewModel, 9));
                return;
        }
    }
}
