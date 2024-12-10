package X;

/* renamed from: X.6lt  reason: invalid class name and case insensitive filesystem */
public class C131926lt {
    public final /* synthetic */ AnonymousClass3MJ A00;
    public final /* synthetic */ C1406372h A01;

    public C131926lt(AnonymousClass3MJ r1, C1406372h r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(AnonymousClass1BI r5, int i, int i2) {
        C19830z4 r3 = this.A01.A01;
        C17880vN.A1E(C19830z4.A00(r3), "storage_usage_deletion_jid", r5.getRawString());
        C17880vN.A1C(C19830z4.A00(r3).putInt("storage_usage_deletion_current_msg_cnt", i), "storage_usage_deletion_all_msg_cnt", i2);
        this.A00.C21(i);
    }
}
