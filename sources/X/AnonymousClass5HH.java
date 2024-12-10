package X;

import com.whatsapp.ctwa.CtwaFMXAdPreviewFragment;

/* renamed from: X.5HH  reason: invalid class name */
public final class AnonymousClass5HH extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CtwaFMXAdPreviewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5HH(CtwaFMXAdPreviewFragment ctwaFMXAdPreviewFragment) {
        super(0);
        this.this$0 = ctwaFMXAdPreviewFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        AnonymousClass00H r0 = this.this$0.A0E;
        if (r0 != null) {
            AnonymousClass10I A0x = AnonymousClass3MX.A0x(r0);
            AnonymousClass00H r02 = this.this$0.A09;
            if (r02 != null) {
                AnonymousClass1KB r2 = (AnonymousClass1KB) r02.get();
                AnonymousClass00H r03 = this.this$0.A0B;
                if (r03 != null) {
                    AnonymousClass181 r3 = (AnonymousClass181) r03.get();
                    AnonymousClass00H r04 = this.this$0.A0D;
                    if (r04 != null) {
                        AnonymousClass1D9 r4 = (AnonymousClass1D9) r04.get();
                        AnonymousClass00H r05 = this.this$0.A0C;
                        if (r05 != null) {
                            C86284Ra r1 = new C86284Ra(r2, r3, r4, A0x, C17880vN.A0e(((AnonymousClass118) r05.get()).A00.getCacheDir(), "ctwa_fmx_ad_preview_bottom_sheet_cache"), "ctwa_fmx_ad_preview_bottom_sheet");
                            r1.A05 = true;
                            return r1.A00();
                        }
                        str = "waContext";
                    } else {
                        str = "waHttpClient";
                    }
                } else {
                    str = "statistics";
                }
            } else {
                str = "globalUI";
            }
        } else {
            str = "waWorkers";
        }
        C18070vi.A11(str);
        throw null;
    }
}
