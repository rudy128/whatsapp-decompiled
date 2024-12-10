package X;

/* renamed from: X.0dz  reason: invalid class name and case insensitive filesystem */
public final class C07750dz extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass0Q5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C07750dz(AnonymousClass0Q5 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C06820Zu A00 = this.this$0.A09;
        int size = A00.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((AnonymousClass0Ts) ((C05830Vw) A00.get(i)).A02.getValue()).A00);
        }
        C06820Zu A01 = this.this$0.A0B;
        int size2 = A01.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, ((Number) ((AnonymousClass0Q5) A01.get(i2)).A08.getValue()).longValue());
        }
        return Long.valueOf(j);
    }
}
