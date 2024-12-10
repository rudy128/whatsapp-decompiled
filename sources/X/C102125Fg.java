package X;

import com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity;

/* renamed from: X.5Fg  reason: invalid class name and case insensitive filesystem */
public final class C102125Fg extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ LinkedDeviceEditDeviceActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102125Fg(LinkedDeviceEditDeviceActivity linkedDeviceEditDeviceActivity) {
        super(0);
        this.this$0 = linkedDeviceEditDeviceActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        LinkedDeviceEditDeviceActivity linkedDeviceEditDeviceActivity = this.this$0;
        C18030ve r10 = linkedDeviceEditDeviceActivity.A0E;
        AnonymousClass1KB r5 = linkedDeviceEditDeviceActivity.A05;
        AnonymousClass190 r4 = linkedDeviceEditDeviceActivity.A03;
        AnonymousClass10I r12 = linkedDeviceEditDeviceActivity.A05;
        C19880zA r1 = linkedDeviceEditDeviceActivity.A00;
        if (r1 != null) {
            AnonymousClass11C r8 = linkedDeviceEditDeviceActivity.A08;
            AnonymousClass00H r0 = linkedDeviceEditDeviceActivity.A07;
            if (r0 != null) {
                C42221xp r9 = (C42221xp) r0.get();
                LinkedDeviceEditDeviceActivity linkedDeviceEditDeviceActivity2 = this.this$0;
                C19880zA r2 = linkedDeviceEditDeviceActivity2.A02;
                if (r2 != null) {
                    AnonymousClass1VD r11 = linkedDeviceEditDeviceActivity2.A06;
                    if (r11 != null) {
                        C19880zA r3 = linkedDeviceEditDeviceActivity2.A01;
                        if (r3 != null) {
                            return new AnonymousClass4RW(r1, r2, r3, r4, r5, linkedDeviceEditDeviceActivity2, linkedDeviceEditDeviceActivity2, r8, r9, r10, r11, r12);
                        }
                        str = "subscriptionAnalyticsManagerOptional";
                    } else {
                        str = "reachoutTimelockUtils";
                    }
                } else {
                    str = "subscriptionManager";
                }
            } else {
                str = "smbMDExtensionUtils";
            }
        } else {
            str = "smbStrings";
        }
        C18070vi.A11(str);
        throw null;
    }
}
