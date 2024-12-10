package X;

/* renamed from: X.4nr  reason: invalid class name and case insensitive filesystem */
public class C96444nr implements AnonymousClass5a0 {
    public final int A00;
    public final Object A01;

    public C96444nr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onError(int i) {
        if (this.A00 != 0) {
            AnonymousClass4X4 r1 = (AnonymousClass4X4) this.A01;
            AnonymousClass4X4.A00(r1, r1.A0I.decrementAndGet());
            return;
        }
        C17900vP.A0i("LinkExistingGroupsUseCase/LinkSubgroupsProtocolHelper/error = ", AnonymousClass000.A10(), i);
        ((C30391dr) this.A01).resumeWith(new AnonymousClass41A(i));
    }
}
