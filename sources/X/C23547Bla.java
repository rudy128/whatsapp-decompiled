package X;

/* renamed from: X.Bla  reason: case insensitive filesystem */
public final class C23547Bla extends C27304Dba<K, V, V> {
    public final /* synthetic */ C27300DbW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23547Bla(C27300DbW dbW) {
        super(dbW);
        this.this$0 = dbW;
    }

    public boolean contains(Object obj) {
        return this.this$0.containsValue(obj);
    }

    public Object forEntry(int i) {
        return this.this$0.values[i];
    }

    public boolean remove(Object obj) {
        int smearedHash = AnonymousClass111.smearedHash(obj);
        int findEntryByValue = this.this$0.findEntryByValue(obj, smearedHash);
        if (findEntryByValue == -1) {
            return false;
        }
        this.this$0.removeEntryValueHashKnown(findEntryByValue, smearedHash);
        return true;
    }
}
