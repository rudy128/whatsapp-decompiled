package X;

/* renamed from: X.9QS  reason: invalid class name */
public abstract class AnonymousClass9QS {
    public static final C195959uE A00(C165148af r3) {
        C18070vi.A0d(r3, 0);
        int i = r3.bitField0_;
        if ((i & 1) == 0 || (i & 2) == 0 || r3.deviceIndexes_.size() == 0) {
            return null;
        }
        return new C195959uE(AnonymousClass8BR.A12(r3.deviceIndexes_), r3.rawId_, r3.currentIndex_);
    }
}
