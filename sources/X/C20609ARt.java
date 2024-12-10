package X;

/* renamed from: X.ARt  reason: case insensitive filesystem */
public final class C20609ARt implements BCV {
    public final /* synthetic */ BCV A00;
    public final /* synthetic */ C170638qQ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C20609ARt(BCV bcv, C170638qQ r2, String str, boolean z) {
        this.A01 = r2;
        this.A02 = str;
        this.A03 = z;
        this.A00 = bcv;
    }

    public void Bki() {
        C170638qQ r5 = this.A01;
        AnonymousClass00H r4 = r5.A03;
        int hashCode = this.A02.hashCode();
        ((C172038sg) r4.get()).A0E(hashCode, "onAbort", "Download aborted");
        AnonymousClass8BR.A0V(r4).A0B(Integer.valueOf(hashCode), "psl_network_end");
        if (this.A03) {
            AnonymousClass8BR.A0V(r4).A08(hashCode, 105);
        }
        BCV bcv = this.A00;
        if (bcv != null) {
            bcv.Bki();
        }
        r5.A0B();
    }

    public void onSuccess() {
        C170638qQ r5 = this.A01;
        AnonymousClass00H r4 = r5.A03;
        C20081A6h A0V = AnonymousClass8BR.A0V(r4);
        int hashCode = this.A02.hashCode();
        A0V.A0B(Integer.valueOf(hashCode), "psl_network_end");
        if (this.A03) {
            AnonymousClass8BR.A0V(r4).A08(hashCode, 2);
        }
        BCV bcv = this.A00;
        if (bcv != null) {
            bcv.onSuccess();
        }
        r5.A0B();
    }

    public /* bridge */ /* synthetic */ void Bsy(Integer num) {
        int intValue = num.intValue();
        C170638qQ r4 = this.A01;
        AnonymousClass00H r6 = r4.A03;
        int hashCode = this.A02.hashCode();
        ((C172038sg) r6.get()).A0E(hashCode, AnonymousClass001.A1I("onError ", AnonymousClass000.A10(), intValue), "Download failed");
        AnonymousClass8BR.A0V(r6).A0B(Integer.valueOf(hashCode), "psl_network_end");
        if (this.A03) {
            AnonymousClass8BR.A0V(r6).A08(hashCode, 3);
        }
        BCV bcv = this.A00;
        if (bcv != null) {
            bcv.Bsy(Integer.valueOf(intValue));
        }
        r4.A0B();
    }

    public /* bridge */ /* synthetic */ void C8h(Integer num) {
        int intValue = num.intValue();
        C170638qQ r4 = this.A01;
        AnonymousClass00H r6 = r4.A03;
        int hashCode = this.A02.hashCode();
        ((C172038sg) r6.get()).A0E(hashCode, AnonymousClass001.A1I("onTimeout ", AnonymousClass000.A10(), intValue), "Download timed out");
        AnonymousClass8BR.A0V(r6).A0B(Integer.valueOf(hashCode), "psl_network_end");
        if (this.A03) {
            AnonymousClass8BR.A0V(r6).A08(hashCode, 3);
        }
        BCV bcv = this.A00;
        if (bcv != null) {
            bcv.C8h(Integer.valueOf(intValue));
        }
        r4.A0B();
    }
}
