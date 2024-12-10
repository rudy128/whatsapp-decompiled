package X;

import android.content.ContentValues;

/* renamed from: X.7vx  reason: invalid class name and case insensitive filesystem */
public final class C157197vx extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ long $messageRowId;
    public final /* synthetic */ AnonymousClass77S $uniqueIdEnforced;
    public final /* synthetic */ AnonymousClass72Q this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157197vx(AnonymousClass72Q r2, AnonymousClass77S r3, long j) {
        super(0);
        this.$uniqueIdEnforced = r3;
        this.this$0 = r2;
        this.$messageRowId = j;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ContentValues A08 = C17880vN.A08();
        A08.put("crossposting_status_unique_id", (String) this.$uniqueIdEnforced.A00("XFAM_CROSSPOSTING_DB_SQL"));
        AnonymousClass72Q.A01(A08, this.this$0, C18070vi.A0M(Long.valueOf(this.$messageRowId)));
        return C27621Wu.A00;
    }
}
