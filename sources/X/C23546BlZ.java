package X;

/* renamed from: X.BlZ  reason: case insensitive filesystem */
public final class C23546BlZ extends C27304Dba<K, V, K> {
    public final /* synthetic */ C27300DbW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23546BlZ(C27300DbW dbW) {
        super(dbW);
        this.this$0 = dbW;
    }

    public boolean contains(Object obj) {
        return this.this$0.containsKey(obj);
    }

    public Object forEntry(int i) {
        return this.this$0.keys[i];
    }

    public boolean remove(Object obj) {
        int smearedHash = AnonymousClass111.smearedHash(obj);
        int findEntryByKey = this.this$0.findEntryByKey(obj, smearedHash);
        if (findEntryByKey == -1) {
            return false;
        }
        this.this$0.removeEntryKeyHashKnown(findEntryByKey, smearedHash);
        return true;
    }
}
