package X;

/* renamed from: X.0gd  reason: invalid class name and case insensitive filesystem */
public final class C09390gd extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C18100vl $currentRawLine$delegate;
    public final /* synthetic */ int $currentRawOffset;
    public final /* synthetic */ C04620Oc $info;
    public final /* synthetic */ int $otherRawOffset;
    public final /* synthetic */ C16260ry $this_updateSelectionBoundary;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C09390gd(C04620Oc r2, C16260ry r3, C18100vl r4, int i, int i2) {
        super(0);
        this.$info = r2;
        this.$currentRawOffset = i;
        this.$otherRawOffset = i2;
        this.$this_updateSelectionBoundary = r3;
        this.$currentRawLine$delegate = r4;
    }

    /* renamed from: A01 */
    public final AnonymousClass0OV invoke() {
        C04620Oc r2 = this.$info;
        int A01 = C04750Oq.A00(this.$currentRawLine$delegate);
        int i = this.$currentRawOffset;
        int i2 = this.$otherRawOffset;
        C16260ry r1 = this.$this_updateSelectionBoundary;
        return A00(r2, A01, i, i2, ((AnonymousClass0VO) r1).A02, AnonymousClass000.A1Z(r1.BPk(), AnonymousClass00R.A00));
    }

    public static final AnonymousClass0OV A00(C04620Oc r6, int i, int i2, int i3, boolean z, boolean z2) {
        C26227CvJ A03 = r6.A03();
        long A0I = A03.A0I(i2);
        int A0G = AnonymousClass000.A0G(A0I);
        if (A03.A0E(A0G) != i) {
            int A0B = A03.A0B();
            if (i >= A0B) {
                A0G = A03.A0F(A0B - 1);
            } else {
                A0G = A03.A0F(i);
            }
        }
        int A0H = AnonymousClass000.A0H(A0I);
        if (A03.A0E(A0H) != i) {
            int A0B2 = A03.A0B();
            if (i >= A0B2) {
                A0H = C26227CvJ.A00(A03, A0B2 - 1);
            } else {
                A0H = C26227CvJ.A00(A03, i);
            }
        }
        if (A0G == i3) {
            return r6.A02(A0H);
        }
        if (A0H != i3 && (!(z ^ z2) ? i2 >= A0G : i2 > A0H)) {
            A0G = A0H;
        }
        return r6.A02(A0G);
    }
}
